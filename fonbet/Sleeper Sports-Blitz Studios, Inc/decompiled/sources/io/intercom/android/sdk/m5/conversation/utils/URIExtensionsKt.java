package io.intercom.android.sdk.m5.conversation.utils;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import androidx.core.content.FileProvider;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.common.MimeTypes;
import androidx.media3.extractor.ts.PsExtractor;
import io.intercom.android.sdk.IntercomFileProviderKt;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import io.sentry.protocol.DebugMeta;
import io.sentry.rrweb.RRWebVideoEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.socure.imgcodecs.Imgcodecs;

/* compiled from: URIExtensions.kt */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0000\u001a,\u0010\u0007\u001a\u00020\b*\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002\u001a4\u0010\u0010\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¨\u0006\u0012"}, d2 = {"getMediaData", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media;", "Landroid/net/Uri;", "context", "Landroid/content/Context;", "generateThumbnailForVideo", "", "getImageData", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media$Image;", "contentResolver", "Landroid/content/ContentResolver;", "fileName", "", "mimeType", RRWebVideoEvent.JsonKeys.SIZE, "", "getVideoData", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media$Video;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class URIExtensionsKt {
    public static /* synthetic */ MediaData.Media getMediaData$default(Uri uri, Context context, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return getMediaData(uri, context, z);
    }

    public static final MediaData.Media getMediaData(Uri uri, Context context, boolean z) {
        String str;
        MediaData.Media.Other other;
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        ContentResolver contentResolver = context.getContentResolver();
        Cursor query = contentResolver.query(uri, null, null, null, null);
        if (query == null) {
            return null;
        }
        Cursor cursor = query;
        try {
            Cursor cursor2 = cursor;
            cursor2.moveToFirst();
            String string = cursor2.getString(cursor2.getColumnIndexOrThrow("_display_name"));
            if (cursor2.getColumnIndex("mime_type") != -1) {
                str = cursor2.getString(cursor2.getColumnIndexOrThrow("mime_type"));
            } else {
                Intrinsics.checkNotNull(string);
                if (StringsKt.contains$default((CharSequence) string, (CharSequence) ".jpg", false, 2, (Object) null)) {
                    str = "image/jpg";
                } else if (StringsKt.contains$default((CharSequence) string, (CharSequence) ".mp4", false, 2, (Object) null)) {
                    str = MimeTypes.VIDEO_MP4;
                } else {
                    str = "";
                }
            }
            String str2 = str;
            long j = cursor2.getLong(cursor2.getColumnIndexOrThrow("_size"));
            Intrinsics.checkNotNull(str2);
            if (StringsKt.contains$default((CharSequence) str2, (CharSequence) "video", false, 2, (Object) null)) {
                Intrinsics.checkNotNull(string);
                other = getVideoData(uri, context, string, str2, j, z);
            } else if (StringsKt.contains$default((CharSequence) str2, (CharSequence) "image", false, 2, (Object) null)) {
                Intrinsics.checkNotNull(contentResolver);
                Intrinsics.checkNotNull(string);
                other = getImageData(uri, contentResolver, string, str2, j);
            } else {
                Intrinsics.checkNotNull(string);
                other = new MediaData.Media.Other(str2, j, string, uri);
            }
            CloseableKt.closeFinally(cursor, null);
            return other;
        } finally {
        }
    }

    private static final MediaData.Media.Image getImageData(Uri uri, ContentResolver contentResolver, String str, String str2, long j) {
        int i;
        int i2;
        InputStream openInputStream = contentResolver.openInputStream(uri);
        if (openInputStream != null) {
            InputStream inputStream = openInputStream;
            try {
                ExifInterface exifInterface = new ExifInterface(inputStream);
                int attributeInt = exifInterface.getAttributeInt(ExifInterface.TAG_IMAGE_LENGTH, 480);
                int attributeInt2 = exifInterface.getAttributeInt(ExifInterface.TAG_IMAGE_WIDTH, Imgcodecs.IMWRITE_JPEGXL_QUALITY);
                int attributeInt3 = exifInterface.getAttributeInt(ExifInterface.TAG_ORIENTATION, 1);
                boolean z = attributeInt3 == 6 || attributeInt3 == 8;
                int i3 = z ? attributeInt2 : attributeInt;
                int i4 = z ? attributeInt : attributeInt2;
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(inputStream, null);
                i2 = i3;
                i = i4;
            } finally {
            }
        } else {
            i = 0;
            i2 = 0;
        }
        return new MediaData.Media.Image(str2, i, i2, j, str, uri, null, 64, null);
    }

    public static final MediaData.Media.Video getVideoData(Uri uri, Context context, String fileName, String mimeType, long j, boolean z) {
        MediaData.Media.Image image;
        Bitmap scaledFrameAtTime;
        Integer intOrNull;
        Integer intOrNull2;
        Long longOrNull;
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(context, uri);
        String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
        long longValue = (extractMetadata == null || (longOrNull = StringsKt.toLongOrNull(extractMetadata)) == null) ? 0L : longOrNull.longValue();
        String extractMetadata2 = mediaMetadataRetriever.extractMetadata(18);
        int i = 0;
        int intValue = (extractMetadata2 == null || (intOrNull2 = StringsKt.toIntOrNull(extractMetadata2)) == null) ? 0 : intOrNull2.intValue();
        String extractMetadata3 = mediaMetadataRetriever.extractMetadata(19);
        if (extractMetadata3 != null && (intOrNull = StringsKt.toIntOrNull(extractMetadata3)) != null) {
            i = intOrNull.intValue();
        }
        if (z) {
            String str = "thumbnail_" + StringsKt.substringBefore$default(fileName, ".", (String) null, 2, (Object) null) + ".jpg";
            Pair pair = i > intValue ? TuplesKt.to(320, Integer.valueOf(PsExtractor.VIDEO_STREAM_MASK)) : TuplesKt.to(Integer.valueOf(PsExtractor.VIDEO_STREAM_MASK), 320);
            scaledFrameAtTime = mediaMetadataRetriever.getScaledFrameAtTime(0L, 2, Math.max(intValue / 2, ((Number) pair.component2()).intValue()), Math.max(i / 2, ((Number) pair.component1()).intValue()));
            if (scaledFrameAtTime != null) {
                File file = new File(context.getExternalCacheDir(), DebugMeta.JsonKeys.IMAGES);
                file.mkdir();
                File file2 = new File(file, str);
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                scaledFrameAtTime.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
                Uri uriForFile = FileProvider.getUriForFile(context, IntercomFileProviderKt.fileProviderAuthority(context), file2);
                Intrinsics.checkNotNull(uriForFile);
                image = new MediaData.Media.Image("image/jpg", scaledFrameAtTime.getWidth(), scaledFrameAtTime.getHeight(), file2.length(), str, uriForFile, null, 64, null);
                UByte$$ExternalSyntheticBackport0.m13543m((Object) mediaMetadataRetriever);
                return new MediaData.Media.Video(mimeType, intValue, i, j, fileName, uri, longValue, image);
            }
        }
        image = null;
        UByte$$ExternalSyntheticBackport0.m13543m((Object) mediaMetadataRetriever);
        return new MediaData.Media.Video(mimeType, intValue, i, j, fileName, uri, longValue, image);
    }
}
