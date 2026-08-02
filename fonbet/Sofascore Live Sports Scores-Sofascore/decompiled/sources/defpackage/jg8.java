package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import com.ironsource.Ua;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class jg8 {
    public static final zmb a = new zmb(16);
    public static final ThreadPoolExecutor b;
    public static final Object c;
    public static final fhh d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, Ua.s, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new qc(2));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new fhh(0);
    }

    public static String a(int i, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((dg8) list.get(i2)).g);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0052 A[Catch: all -> 0x00c1, TRY_LEAVE, TryCatch #0 {all -> 0x00c1, all -> 0x00b2, NameNotFoundException -> 0x00b7, all -> 0x007c, blocks: (B:3:0x000b, B:5:0x0013, B:10:0x001c, B:11:0x0020, B:16:0x0052, B:19:0x005b, B:21:0x0061, B:23:0x0067, B:26:0x0078, B:28:0x009d, B:31:0x00a9, B:36:0x007d, B:37:0x0080, B:38:0x0081, B:41:0x0098, B:44:0x00b3, B:45:0x00b6, B:47:0x002f, B:49:0x0037, B:52:0x003b, B:54:0x003f, B:56:0x004a, B:65:0x00b7, B:40:0x0092, B:25:0x0072), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b A[Catch: all -> 0x00c1, TRY_ENTER, TryCatch #0 {all -> 0x00c1, all -> 0x00b2, NameNotFoundException -> 0x00b7, all -> 0x007c, blocks: (B:3:0x000b, B:5:0x0013, B:10:0x001c, B:11:0x0020, B:16:0x0052, B:19:0x005b, B:21:0x0061, B:23:0x0067, B:26:0x0078, B:28:0x009d, B:31:0x00a9, B:36:0x007d, B:37:0x0080, B:38:0x0081, B:41:0x0098, B:44:0x00b3, B:45:0x00b6, B:47:0x002f, B:49:0x0037, B:52:0x003b, B:54:0x003f, B:56:0x004a, B:65:0x00b7, B:40:0x0092, B:25:0x0072), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009d A[Catch: all -> 0x00c1, TRY_LEAVE, TryCatch #0 {all -> 0x00c1, all -> 0x00b2, NameNotFoundException -> 0x00b7, all -> 0x007c, blocks: (B:3:0x000b, B:5:0x0013, B:10:0x001c, B:11:0x0020, B:16:0x0052, B:19:0x005b, B:21:0x0061, B:23:0x0067, B:26:0x0078, B:28:0x009d, B:31:0x00a9, B:36:0x007d, B:37:0x0080, B:38:0x0081, B:41:0x0098, B:44:0x00b3, B:45:0x00b6, B:47:0x002f, B:49:0x0037, B:52:0x003b, B:54:0x003f, B:56:0x004a, B:65:0x00b7, B:40:0x0092, B:25:0x0072), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a9 A[Catch: all -> 0x00c1, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00c1, all -> 0x00b2, NameNotFoundException -> 0x00b7, all -> 0x007c, blocks: (B:3:0x000b, B:5:0x0013, B:10:0x001c, B:11:0x0020, B:16:0x0052, B:19:0x005b, B:21:0x0061, B:23:0x0067, B:26:0x0078, B:28:0x009d, B:31:0x00a9, B:36:0x007d, B:37:0x0080, B:38:0x0081, B:41:0x0098, B:44:0x00b3, B:45:0x00b6, B:47:0x002f, B:49:0x0037, B:52:0x003b, B:54:0x003f, B:56:0x004a, B:65:0x00b7, B:40:0x0092, B:25:0x0072), top: B:2:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ig8 b(Context context, List list, String str, int i) {
        Typeface typeface;
        int i2;
        Typeface H;
        zmb zmbVar = a;
        Trace.beginSection(h5a.U("getFontSync"));
        try {
            typeface = (Typeface) zmbVar.c(str);
        } catch (PackageManager.NameNotFoundException unused) {
            return new ig8(-1);
        } catch (Throwable th) {
            throw th;
        } finally {
            Trace.endSection();
        }
        if (typeface != null) {
            return new ig8(typeface);
        }
        mu4 a2 = cg8.a(context, list);
        List list2 = a2.b;
        int i3 = a2.a;
        if (i3 != 0) {
            if (i3 == 1) {
                i2 = -2;
                if (i2 == 0) {
                    return new ig8(i2);
                }
                if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                    yg8[] yg8VarArr = (yg8[]) list2.get(0);
                    h5a h5aVar = x5k.a;
                    Trace.beginSection(h5a.U("TypefaceCompat.createFromFontInfo"));
                    H = x5k.a.H(context, yg8VarArr, i);
                    Trace.endSection();
                    if (H != null) {
                        return new ig8(-3);
                    }
                    zmbVar.d(str, H);
                    return new ig8(H);
                }
                h5a h5aVar2 = x5k.a;
                Trace.beginSection(h5a.U("TypefaceCompat.createFromFontInfoWithFallback"));
                H = x5k.a.I(i, context, list2);
                Trace.endSection();
                if (H != null) {
                }
            }
            i2 = -3;
            if (i2 == 0) {
            }
        } else {
            yg8[] yg8VarArr2 = (yg8[]) list2.get(0);
            if (yg8VarArr2 != null && yg8VarArr2.length != 0) {
                int length = yg8VarArr2.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        i2 = 0;
                        break;
                    }
                    int i5 = yg8VarArr2[i4].f;
                    if (i5 == 0) {
                        i4++;
                    } else if (i5 >= 0) {
                        i2 = i5;
                    }
                }
                if (i2 == 0) {
                }
            }
            i2 = 1;
            if (i2 == 0) {
            }
        }
        Trace.endSection();
    }
}
