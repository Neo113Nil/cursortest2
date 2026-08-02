package defpackage;

import android.text.TextUtils;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class j48 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k48 b;

    public /* synthetic */ j48(k48 k48Var, int i) {
        this.a = i;
        this.b = k48Var;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        uu0 w;
        uu0 g;
        int i = this.a;
        k48 k48Var = this.b;
        switch (i) {
            case 0:
                k48Var.a();
                return;
            case 1:
                k48Var.a();
                return;
            default:
                Object obj = k48.l;
                synchronized (obj) {
                    try {
                        r38 r38Var = k48Var.a;
                        r38Var.a();
                        z41 n = z41.n(r38Var.a);
                        try {
                            w = k48Var.c.w();
                            if (n != null) {
                                n.w();
                            }
                        } catch (Throwable th) {
                            if (n != null) {
                                n.w();
                            }
                            throw th;
                        }
                    } finally {
                    }
                }
                try {
                    int i2 = w.b;
                    if (!(i2 == 5)) {
                        if (!(i2 == 3)) {
                            if (k48Var.d.a(w)) {
                                g = k48Var.b(w);
                                synchronized (obj) {
                                    try {
                                        r38 r38Var2 = k48Var.a;
                                        r38Var2.a();
                                        z41 n2 = z41.n(r38Var2.a);
                                        try {
                                            k48Var.c.u(g);
                                            if (n2 != null) {
                                                n2.w();
                                            }
                                        } catch (Throwable th2) {
                                            if (n2 != null) {
                                                n2.w();
                                            }
                                            throw th2;
                                        }
                                    } finally {
                                    }
                                }
                                synchronized (k48Var) {
                                    boolean z = g.b == 4;
                                    String str = g.a;
                                    if (z && !TextUtils.isEmpty(str)) {
                                        if (TextUtils.equals(w.a, str)) {
                                            r4 = !(w.b == 4);
                                        } else {
                                            r4 = true;
                                        }
                                    }
                                    if (r4) {
                                        Iterator it = k48Var.j.iterator();
                                        while (it.hasNext()) {
                                            FirebaseMessaging firebaseMessaging = ((o48) it.next()).a;
                                            if (firebaseMessaging.d() != null) {
                                                synchronized (firebaseMessaging) {
                                                    if (!firebaseMessaging.k) {
                                                        firebaseMessaging.g(0L);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                if (g.b == 4) {
                                    String str2 = g.a;
                                    synchronized (k48Var) {
                                        k48Var.i = str2;
                                    }
                                }
                                int i3 = g.b;
                                if (i3 == 5) {
                                    k48Var.h(new m48());
                                    return;
                                } else if (i3 == 2 || i3 == 1) {
                                    k48Var.h(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                                    return;
                                } else {
                                    k48Var.i(g);
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    g = k48Var.g(w);
                    synchronized (obj) {
                    }
                } catch (m48 e) {
                    k48Var.h(e);
                    return;
                }
                break;
        }
    }
}
