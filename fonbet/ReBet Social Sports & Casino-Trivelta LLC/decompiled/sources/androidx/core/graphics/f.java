package androidx.core.graphics;

import android.graphics.BlendMode;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import androidx.core.graphics.AbstractC2073c;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f19102a = new ThreadLocal();

    public static class a {
        public static boolean a(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    public static class b {
        public static void a(Paint paint, Object obj) {
            paint.setBlendMode((BlendMode) obj);
        }
    }

    public static boolean a(Paint paint, String str) {
        return a.a(paint, str);
    }

    public static boolean b(Paint paint, EnumC2072b enumC2072b) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.a(paint, enumC2072b != null ? AbstractC2073c.b.a(enumC2072b) : null);
            return true;
        }
        if (enumC2072b == null) {
            paint.setXfermode(null);
            return true;
        }
        PorterDuff.Mode a10 = AbstractC2073c.a(enumC2072b);
        paint.setXfermode(a10 != null ? new PorterDuffXfermode(a10) : null);
        return a10 != null;
    }
}
