package io.intercom.android.sdk.m5.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.common.MimeTypes;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.lightcompressor.CompressionListener;
import io.intercom.android.sdk.lightcompressor.VideoCompressor;
import io.intercom.android.sdk.lightcompressor.VideoQuality;
import io.intercom.android.sdk.lightcompressor.config.AppSpecificStorageConfiguration;
import io.intercom.android.sdk.lightcompressor.config.Configuration;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import io.intercom.android.sdk.m5.conversation.utils.URIExtensionsKt;
import io.intercom.android.sdk.utilities.BitmapUtilsKt;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: MediaCompression.kt */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a0\u0010\u0003\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0004*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0001H\u0082@¢\u0006\u0002\u0010\n\u001a\u001e\u0010\u000b\u001a\u0004\u0018\u00010\f*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0001H\u0002\u001a\u001e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\bH\u0080@¢\u0006\u0002\u0010\u0011\u001a\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0005H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"compressedVideosFolderName", "", "compressedImagesFolderName", "getCompressedVideoData", "Lkotlin/Pair;", "Landroid/net/Uri;", "", "context", "Landroid/content/Context;", "videoName", "(Landroid/net/Uri;Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCompressedImageData", "Lio/intercom/android/sdk/m5/utils/CompressedImageData;", "imageName", "getCompressedMediaData", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media;", "uncompressedMediaData", "(Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media;Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteCompressedMedia", "", "uri", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MediaCompressionKt {
    private static final String compressedImagesFolderName = "compressed_images";
    private static final String compressedVideosFolderName = "compressed_videos";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getCompressedVideoData(Uri uri, Context context, String str, Continuation<? super Pair<? extends Uri, Long>> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        final SafeContinuation safeContinuation2 = safeContinuation;
        final Twig logger = LumberMill.getLogger();
        VideoCompressor.start$default(context, CollectionsKt.listOf(uri), false, null, new AppSpecificStorageConfiguration(compressedVideosFolderName), new Configuration(VideoQuality.LOW, false, null, false, false, null, null, CollectionsKt.listOf(str), 126, null), new CompressionListener() { // from class: io.intercom.android.sdk.m5.utils.MediaCompressionKt$getCompressedVideoData$2$1
            @Override // io.intercom.android.sdk.lightcompressor.CompressionListener
            public void onStart(int index) {
                Twig.this.internal("Video compression started.");
            }

            @Override // io.intercom.android.sdk.lightcompressor.CompressionListener
            public void onSuccess(int index, long size, String path) {
                Twig.this.internal("Video compression succeeded. Video saved in " + path + '.');
                Uri fromFile = Uri.fromFile(path != null ? new File(path) : null);
                Continuation<Pair<? extends Uri, Long>> continuation2 = safeContinuation2;
                Result.Companion companion = Result.INSTANCE;
                continuation2.resumeWith(Result.m13470constructorimpl(TuplesKt.to(fromFile, Long.valueOf(size))));
            }

            @Override // io.intercom.android.sdk.lightcompressor.CompressionListener
            public void onFailure(int index, String failureMessage) {
                Intrinsics.checkNotNullParameter(failureMessage, "failureMessage");
                Twig.this.internal("Video compression failed: " + failureMessage + '.');
                Continuation<Pair<? extends Uri, Long>> continuation2 = safeContinuation2;
                Result.Companion companion = Result.INSTANCE;
                continuation2.resumeWith(Result.m13470constructorimpl(ResultKt.createFailure(new Throwable(failureMessage))));
            }

            @Override // io.intercom.android.sdk.lightcompressor.CompressionListener
            public void onProgress(int index, float percent) {
                Twig.this.internal("Video compression in progress: " + percent + '.');
            }

            @Override // io.intercom.android.sdk.lightcompressor.CompressionListener
            public void onCancelled(int index) {
                Twig.this.internal("Video compression cancelled.");
                Continuation<Pair<? extends Uri, Long>> continuation2 = safeContinuation2;
                Result.Companion companion = Result.INSTANCE;
                continuation2.resumeWith(Result.m13470constructorimpl(ResultKt.createFailure(new CancellationException())));
            }
        }, 8, null);
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    private static final CompressedImageData getCompressedImageData(Uri uri, Context context, String str) {
        Throwable th;
        FileOutputStream fileOutputStream;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        InputStream openInputStream = context.getContentResolver().openInputStream(uri);
        FileOutputStream fileOutputStream2 = null;
        BitmapFactory.decodeStream(openInputStream, null, options);
        if (openInputStream != null) {
            openInputStream.close();
        }
        options.inSampleSize = BitmapUtilsKt.calculateInSampleSize(options, TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID, 816);
        options.inJustDecodeBounds = false;
        InputStream openInputStream2 = context.getContentResolver().openInputStream(uri);
        Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream2, null, options);
        if (openInputStream2 != null) {
            openInputStream2.close();
        }
        if (decodeStream == null) {
            return null;
        }
        Bitmap determineBitmapRotation = BitmapUtilsKt.determineBitmapRotation(context, uri, decodeStream);
        File file = new File(context.getCacheDir(), compressedImagesFolderName);
        file.mkdirs();
        File file2 = new File(file, str + ".jpg");
        try {
            fileOutputStream = new FileOutputStream(file2);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            determineBitmapRotation.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
            Uri fromFile = Uri.fromFile(file2);
            fileOutputStream.flush();
            fileOutputStream.close();
            if (fromFile != null) {
                return new CompressedImageData(fromFile, determineBitmapRotation.getWidth(), determineBitmapRotation.getHeight(), file2.length());
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                fileOutputStream2.flush();
            }
            if (fileOutputStream2 == null) {
                throw th;
            }
            fileOutputStream2.close();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0098 A[Catch: all -> 0x00df, TryCatch #1 {all -> 0x00df, blocks: (B:13:0x008e, B:15:0x0098, B:17:0x00c0, B:23:0x00db, B:46:0x0057), top: B:45:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object getCompressedMediaData(MediaData.Media media, Context context, Continuation<? super MediaData.Media> continuation) {
        MediaCompressionKt$getCompressedMediaData$1 mediaCompressionKt$getCompressedMediaData$1;
        int i;
        Object compressedVideoData;
        Context context2;
        String str;
        MediaData.Media.Video video;
        Uri uri;
        MediaData.Media media2 = media;
        if (continuation instanceof MediaCompressionKt$getCompressedMediaData$1) {
            mediaCompressionKt$getCompressedMediaData$1 = (MediaCompressionKt$getCompressedMediaData$1) continuation;
            if ((mediaCompressionKt$getCompressedMediaData$1.label & Integer.MIN_VALUE) != 0) {
                mediaCompressionKt$getCompressedMediaData$1.label -= Integer.MIN_VALUE;
                Object obj = mediaCompressionKt$getCompressedMediaData$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mediaCompressionKt$getCompressedMediaData$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (media2 instanceof MediaData.Media.Video) {
                        try {
                            String str2 = (String) CollectionsKt.first(StringsKt.split$default((CharSequence) ((MediaData.Media.Video) media2).getFileName(), new String[]{"."}, false, 0, 6, (Object) null));
                            Uri uri2 = ((MediaData.Media.Video) media2).getUri();
                            mediaCompressionKt$getCompressedMediaData$1.L$0 = media2;
                            mediaCompressionKt$getCompressedMediaData$1.L$1 = context;
                            mediaCompressionKt$getCompressedMediaData$1.L$2 = str2;
                            mediaCompressionKt$getCompressedMediaData$1.label = 1;
                            compressedVideoData = getCompressedVideoData(uri2, context, str2, mediaCompressionKt$getCompressedMediaData$1);
                            if (compressedVideoData == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            context2 = context;
                            str = str2;
                        } catch (Throwable unused) {
                            video = (MediaData.Media.Video) media2;
                            return video;
                        }
                    } else {
                        if (media2 instanceof MediaData.Media.Image) {
                            MediaData.Media.Image image = (MediaData.Media.Image) media2;
                            String str3 = (String) CollectionsKt.first(StringsKt.split$default((CharSequence) image.getFileName(), new String[]{"."}, false, 0, 6, (Object) null));
                            CompressedImageData compressedImageData = getCompressedImageData(image.getUri(), context, str3);
                            if (compressedImageData != null) {
                                image = new MediaData.Media.Image("image/jpg", compressedImageData.getWidth(), compressedImageData.getHeight(), compressedImageData.getSize(), str3 + ".jpg", compressedImageData.getUri(), image.getExifData());
                            }
                            return image;
                        }
                        if (media2 instanceof MediaData.Media.Other) {
                            return media2;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    String str4 = (String) mediaCompressionKt$getCompressedMediaData$1.L$2;
                    Context context3 = (Context) mediaCompressionKt$getCompressedMediaData$1.L$1;
                    MediaData.Media media3 = (MediaData.Media) mediaCompressionKt$getCompressedMediaData$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        str = str4;
                        media2 = media3;
                        compressedVideoData = obj;
                        context2 = context3;
                    } catch (Throwable unused2) {
                        media2 = media3;
                        video = (MediaData.Media.Video) media2;
                        return video;
                    }
                }
                Pair pair = (Pair) compressedVideoData;
                uri = (Uri) pair.getFirst();
                if (uri != null) {
                    MediaData.Media.Video videoData = URIExtensionsKt.getVideoData(uri, context2, str + ".mp4", MimeTypes.VIDEO_MP4, ((Number) pair.getSecond()).longValue(), false);
                    if (videoData != null && (video = MediaData.Media.Video.copy$default(videoData, null, 0, 0, 0L, null, null, 0L, ((MediaData.Media.Video) media2).getThumbnail(), 127, null)) != null) {
                        return video;
                    }
                }
                video = (MediaData.Media.Video) media2;
                return video;
            }
        }
        mediaCompressionKt$getCompressedMediaData$1 = new MediaCompressionKt$getCompressedMediaData$1(continuation);
        Object obj2 = mediaCompressionKt$getCompressedMediaData$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mediaCompressionKt$getCompressedMediaData$1.label;
        if (i != 0) {
        }
        Pair pair2 = (Pair) compressedVideoData;
        uri = (Uri) pair2.getFirst();
        if (uri != null) {
        }
        video = (MediaData.Media.Video) media2;
        return video;
    }

    public static final void deleteCompressedMedia(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (uri.getPathSegments().contains(compressedVideosFolderName) || uri.getPathSegments().contains(compressedImagesFolderName)) {
            new File(uri.toString()).delete();
        }
    }
}
