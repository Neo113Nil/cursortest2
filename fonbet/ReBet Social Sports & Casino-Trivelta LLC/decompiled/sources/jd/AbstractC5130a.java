package jd;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import android.view.WindowManager;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: jd.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5130a {
    public static int a(BitmapFactory.Options options, int i10, int i11) {
        int i12 = options.outHeight;
        int i13 = options.outWidth;
        int i14 = 1;
        if (i12 <= i11 && i13 <= i10) {
            return 1;
        }
        while (true) {
            if (i12 / i14 <= i11 && i13 / i14 <= i10) {
                return i14;
            }
            i14 *= 2;
        }
    }

    public static int b(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        Point point = new Point();
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getSize(point);
        }
        int sqrt = (int) Math.sqrt(Math.pow(point.x, 2.0d) + Math.pow(point.y, 2.0d));
        Canvas canvas = new Canvas();
        int min = Math.min(canvas.getMaximumBitmapWidth(), canvas.getMaximumBitmapHeight());
        if (min > 0) {
            sqrt = Math.min(sqrt, min);
        }
        int b10 = c.b();
        return b10 > 0 ? Math.min(sqrt, b10) : sqrt;
    }

    public static void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void d(Context context, Uri uri, Uri uri2, int i10, int i11, gd.b bVar) {
        new id.b(context, uri, uri2, i10, i11, bVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public static int e(int i10) {
        switch (i10) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    public static int f(int i10) {
        return (i10 == 2 || i10 == 7 || i10 == 4 || i10 == 5) ? -1 : 1;
    }

    public static int g(Context context, Uri uri) {
        int i10 = 0;
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                return 0;
            }
            i10 = new f(openInputStream).g();
            c(openInputStream);
            return i10;
        } catch (IOException e10) {
            Log.e("BitmapLoadUtils", "getExifOrientation: " + uri.toString(), e10);
            return i10;
        }
    }

    public static boolean h(Uri uri) {
        return uri != null && "content".equals(uri.getScheme());
    }

    public static Bitmap i(Bitmap bitmap, Matrix matrix) {
        Bitmap bitmap2;
        try {
            bitmap2 = bitmap;
            try {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                return !bitmap2.sameAs(createBitmap) ? createBitmap : bitmap2;
            } catch (OutOfMemoryError e10) {
                e = e10;
                Log.e("BitmapLoadUtils", "transformBitmap: ", e);
                return bitmap2;
            }
        } catch (OutOfMemoryError e11) {
            e = e11;
            bitmap2 = bitmap;
        }
    }
}
