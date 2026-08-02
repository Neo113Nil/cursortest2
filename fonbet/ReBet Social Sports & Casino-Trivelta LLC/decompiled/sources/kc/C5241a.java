package kc;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ExifInterface;
import android.os.Environment;
import android.util.Pair;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;
import com.reactnativecommunity.clipboard.ClipboardModule;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/* renamed from: kc.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5241a {
    public final int a(int i10, int i11, int i12, int i13) {
        int i14 = 1;
        if (i10 <= i12 && i11 <= i13) {
            return 1;
        }
        int i15 = i10 / 2;
        int i16 = i11 / 2;
        while (i15 / i14 >= i12 && i16 / i14 >= i13) {
            i14 *= 2;
        }
        return i14;
    }

    public final Pair b(int i10, int i11, int i12, int i13) {
        if (i10 > i12) {
            i11 = (int) (i11 * (i12 / i10));
            i10 = i12;
        }
        if (i11 > i13) {
            i10 = (int) (i10 * (i13 / i11));
        } else {
            i13 = i11;
        }
        return Pair.create(Integer.valueOf(i10), Integer.valueOf(i13));
    }

    public File c(Context context, ReadableMap readableMap, String str, BitmapFactory.Options options) {
        Integer valueOf = readableMap.hasKey("compressImageMaxWidth") ? Integer.valueOf(readableMap.getInt("compressImageMaxWidth")) : null;
        Integer valueOf2 = readableMap.hasKey("compressImageMaxHeight") ? Integer.valueOf(readableMap.getInt("compressImageMaxHeight")) : null;
        Double valueOf3 = readableMap.hasKey("compressImageQuality") ? Double.valueOf(readableMap.getDouble("compressImageQuality")) : null;
        boolean z10 = valueOf3 == null || valueOf3.doubleValue() == 1.0d;
        boolean z11 = valueOf == null || valueOf.intValue() >= options.outWidth;
        boolean z12 = valueOf2 == null || valueOf2.intValue() >= options.outHeight;
        List asList = Arrays.asList(ClipboardModule.MIMETYPE_JPEG, ClipboardModule.MIMETYPE_JPG, ClipboardModule.MIMETYPE_PNG, "image/gif", "image/tiff");
        String str2 = options.outMimeType;
        boolean z13 = str2 != null && asList.contains(str2.toLowerCase());
        if (z10 && z11 && z12 && z13) {
            return new File(str);
        }
        int doubleValue = valueOf3 != null ? (int) (valueOf3.doubleValue() * 100.0d) : 100;
        if (valueOf == null) {
            valueOf = Integer.valueOf(options.outWidth);
        }
        if (valueOf2 == null) {
            valueOf2 = Integer.valueOf(options.outHeight);
        }
        return e(context, str, options.outWidth, options.outHeight, valueOf.intValue(), valueOf2.intValue(), doubleValue);
    }

    public synchronized void d(Activity activity, ReadableMap readableMap, String str, String str2, Promise promise) {
        promise.resolve(str);
    }

    public File e(Context context, String str, int i10, int i11, int i12, int i13, int i14) {
        Bitmap decodeFile;
        Pair b10 = b(i10, i11, i12, i13);
        int intValue = ((Integer) b10.first).intValue();
        int intValue2 = ((Integer) b10.second).intValue();
        if (i10 > i12 || i11 > i13) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = a(i10, i11, intValue, intValue2);
            decodeFile = BitmapFactory.decodeFile(str, options);
        } else {
            decodeFile = BitmapFactory.decodeFile(str);
        }
        String attribute = new ExifInterface(str).getAttribute("Orientation");
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeFile, intValue, intValue2, true);
        File externalFilesDir = context.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        if (!externalFilesDir.exists()) {
            externalFilesDir.mkdirs();
        }
        File file = new File(externalFilesDir, UUID.randomUUID() + ".jpg");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
        createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, i14, bufferedOutputStream);
        if (f(attribute)) {
            ExifInterface exifInterface = new ExifInterface(file.getAbsolutePath());
            exifInterface.setAttribute("Orientation", attribute);
            exifInterface.saveAttributes();
        }
        bufferedOutputStream.close();
        createScaledBitmap.recycle();
        return file;
    }

    public final boolean f(String str) {
        return (str.equals(String.valueOf(1)) || str.equals(String.valueOf(0))) ? false : true;
    }
}
