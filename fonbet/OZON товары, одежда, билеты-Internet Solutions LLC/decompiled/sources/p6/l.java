package p6;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f80280a = "0123456789abcdef".toCharArray();

    /* renamed from: b, reason: collision with root package name */
    private static final char[] f80281b = new char[64];

    /* renamed from: c, reason: collision with root package name */
    private static volatile Handler f80282c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f80283d = 0;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f80284a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f80284a = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f80284a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f80284a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f80284a[Bitmap.Config.RGBA_F16.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f80284a[Bitmap.Config.ARGB_8888.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private l() {
    }

    public static void a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static boolean b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @TargetApi(19)
    public static int c(@NonNull Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getRowBytes() * bitmap.getHeight();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    public static int d(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i11 = a.f80284a[config.ordinal()];
        int i12 = 1;
        if (i11 != 1) {
            i12 = 2;
            if (i11 != 2 && i11 != 3) {
                return i11 != 4 ? 4 : 8;
            }
        }
        return i12;
    }

    @NonNull
    public static ArrayList e(@NonNull Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private static Handler f() {
        if (f80282c == null) {
            synchronized (l.class) {
                try {
                    if (f80282c == null) {
                        f80282c = new Handler(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        return f80282c;
    }

    public static int g(int i11, int i12) {
        return (i12 * 31) + i11;
    }

    public static int h(int i11, Object obj) {
        return g(obj == null ? 0 : obj.hashCode(), i11);
    }

    public static boolean i(int i11, int i12) {
        if (i11 > 0 || i11 == Integer.MIN_VALUE) {
            return i12 > 0 || i12 == Integer.MIN_VALUE;
        }
        return false;
    }

    public static void j(Runnable runnable) {
        f().post(runnable);
    }

    public static void k(Runnable runnable) {
        f().removeCallbacks(runnable);
    }

    @NonNull
    public static String l(@NonNull byte[] bArr) {
        String str;
        char[] cArr = f80281b;
        synchronized (cArr) {
            for (int i11 = 0; i11 < bArr.length; i11++) {
                byte b11 = bArr[i11];
                int i12 = i11 * 2;
                char[] cArr2 = f80280a;
                cArr[i12] = cArr2[(b11 & 255) >>> 4];
                cArr[i12 + 1] = cArr2[b11 & 15];
            }
            str = new String(cArr);
        }
        return str;
    }
}
