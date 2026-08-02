package N9;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.AbstractC3175h;
import com.google.android.gms.common.internal.AbstractC3191o;

/* loaded from: classes2.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f7969a;

    /* renamed from: b, reason: collision with root package name */
    public Object f7970b;

    public static class a extends Exception {
        public a(String str) {
            super(str);
        }

        public a(String str, Throwable th2) {
            super(str, th2);
        }
    }

    public f(String str) {
        this.f7969a = str;
    }

    public abstract Object a(IBinder iBinder);

    public final Object b(Context context) {
        if (this.f7970b == null) {
            AbstractC3191o.m(context);
            Context e10 = AbstractC3175h.e(context);
            if (e10 == null) {
                throw new a("Could not get remote context.");
            }
            try {
                this.f7970b = a((IBinder) e10.getClassLoader().loadClass(this.f7969a).newInstance());
            } catch (ClassNotFoundException e11) {
                throw new a("Could not load creator class.", e11);
            } catch (IllegalAccessException e12) {
                throw new a("Could not access creator.", e12);
            } catch (InstantiationException e13) {
                throw new a("Could not instantiate creator.", e13);
            }
        }
        return this.f7970b;
    }
}
