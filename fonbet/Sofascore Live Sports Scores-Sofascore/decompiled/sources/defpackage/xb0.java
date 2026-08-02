package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xb0 {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static xb0 c;
    public t1g a;

    public static synchronized xb0 a() {
        xb0 xb0Var;
        synchronized (xb0.class) {
            try {
                if (c == null) {
                    d();
                }
                xb0Var = c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return xb0Var;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter e;
        synchronized (xb0.class) {
            e = t1g.e(i, mode);
        }
        return e;
    }

    public static synchronized void d() {
        synchronized (xb0.class) {
            if (c == null) {
                xb0 xb0Var = new xb0();
                c = xb0Var;
                xb0Var.a = t1g.b();
                t1g t1gVar = c.a;
                ox9 ox9Var = new ox9();
                synchronized (t1gVar) {
                    t1gVar.e = ox9Var;
                }
            }
        }
    }

    public final synchronized Drawable b(int i, Context context) {
        return this.a.c(i, context);
    }
}
