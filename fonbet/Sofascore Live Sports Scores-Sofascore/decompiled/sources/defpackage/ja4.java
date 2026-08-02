package defpackage;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.RemoteException;
import com.inmobi.media.C3321bj;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ja4 {
    public final Object a = new Object();
    public final dm9 b;
    public final aa4 c;
    public final ComponentName d;

    public ja4(dm9 dm9Var, aa4 aa4Var, ComponentName componentName) {
        this.b = dm9Var;
        this.c = aa4Var;
        this.d = componentName;
    }

    public final Bundle a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        return bundle2;
    }

    public final boolean b() {
        Bundle a = a(Bundle.EMPTY);
        try {
            return ((bm9) this.b).J(this.c, a);
        } catch (SecurityException e) {
            throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e);
        }
    }

    public final void c(String str) {
        Bundle a = a(null);
        synchronized (this.a) {
            try {
                try {
                    ((bm9) this.b).l2(this.c, str, a);
                } catch (RemoteException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(C3321bj c3321bj) {
        Bundle a = a(Bundle.EMPTY);
        ia4 ia4Var = new ia4(c3321bj);
        try {
            ((bm9) this.b).F4(this.c, ia4Var, a);
        } catch (SecurityException e) {
            throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e);
        }
    }
}
