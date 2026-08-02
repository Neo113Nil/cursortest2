package io.intercom.android.sdk.utilities;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BitmapUtils.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0000\u001a \u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0000\u001a \u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0001H\u0000\u001a$\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0000¨\u0006\u0015"}, d2 = {"drawableToBitmap", "Landroid/graphics/Bitmap;", "drawable", "Landroid/graphics/drawable/Drawable;", "defaultWidth", "", "defaultHeight", "calculateInSampleSize", "options", "Landroid/graphics/BitmapFactory$Options;", "reqWidth", "reqHeight", "determineBitmapRotation", "context", "Landroid/content/Context;", "uri", "Landroid/net/Uri;", "bitmap", "extractExifData", "", "", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class BitmapUtilsKt {
    public static final Bitmap drawableToBitmap(Drawable drawable, int i, int i2) {
        Bitmap createBitmap;
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                Bitmap bitmap = bitmapDrawable.getBitmap();
                Intrinsics.checkNotNullExpressionValue(bitmap, "getBitmap(...)");
                return bitmap;
            }
        }
        if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNull(createBitmap);
        } else {
            createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNull(createBitmap);
        }
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    public static final int calculateInSampleSize(BitmapFactory.Options options, int i, int i2) {
        Intrinsics.checkNotNullParameter(options, "options");
        Pair pair = TuplesKt.to(Integer.valueOf(options.outHeight), Integer.valueOf(options.outWidth));
        int intValue = ((Number) pair.component1()).intValue();
        int intValue2 = ((Number) pair.component2()).intValue();
        int i3 = 1;
        if (intValue <= i2 && intValue2 <= i) {
            return 1;
        }
        int i4 = intValue / 2;
        int i5 = intValue2 / 2;
        while (i4 / i3 >= i2 && i5 / i3 >= i) {
            i3 *= 2;
        }
        return i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Bitmap determineBitmapRotation(Context context, Uri uri, Bitmap bitmap) {
        Bitmap bitmap2;
        Bitmap bitmap3;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        InputStream openInputStream = context.getContentResolver().openInputStream(uri);
        if (openInputStream != null) {
            int attributeInt = new ExifInterface(openInputStream).getAttributeInt(ExifInterface.TAG_ORIENTATION, 0);
            Matrix matrix = new Matrix();
            if (attributeInt == 3) {
                matrix.postRotate(180.0f);
            } else if (attributeInt == 6) {
                matrix.postRotate(90.0f);
            } else if (attributeInt == 8) {
                matrix.postRotate(270.0f);
            }
            bitmap2 = bitmap;
            Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            if (createBitmap != null) {
                bitmap3 = createBitmap;
                if (openInputStream != null) {
                    openInputStream.close();
                }
                return bitmap3;
            }
        } else {
            bitmap2 = bitmap;
        }
        bitmap3 = bitmap2;
        if (openInputStream != null) {
        }
        return bitmap3;
    }

    public static final Map<String, String> extractExifData(Context context, Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            if (openInputStream != null) {
                InputStream inputStream = openInputStream;
                try {
                    ExifInterface exifInterface = new ExifInterface(inputStream);
                    for (String str : CollectionsKt.listOf((Object[]) new String[]{ExifInterface.TAG_DATETIME, ExifInterface.TAG_DATETIME_ORIGINAL, ExifInterface.TAG_DATETIME_DIGITIZED})) {
                        String attribute = exifInterface.getAttribute(str);
                        if (attribute != null && attribute.length() > 0) {
                            linkedHashMap.put(str, attribute);
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(inputStream, null);
                    return linkedHashMap;
                } finally {
                }
            }
        } catch (IOException e) {
            Log.w("ExifExtractor", "Failed to extract EXIF data: " + e.getMessage());
        } catch (NullPointerException e2) {
            Log.w("ExifExtractor", "Failed to extract EXIF data (null pointer): " + e2.getMessage());
        }
        return linkedHashMap;
    }
}
