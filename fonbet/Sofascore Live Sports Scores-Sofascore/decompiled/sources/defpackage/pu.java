package defpackage;

import android.app.Application;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class pu implements zff {
    public final /* synthetic */ int a;
    public final zff b;

    public pu(zff zffVar, dc4 dc4Var) {
        this.a = 11;
        this.b = zffVar;
    }

    @Override // defpackage.yff
    public final Object get() {
        vrb vrbVar;
        List list;
        switch (this.a) {
            case 0:
                cd8 cd8Var = ((ou) this.b.get()).b;
                i2a.v(cd8Var);
                return cd8Var;
            case 1:
                return new ou((iu) this.b.get());
            case 2:
                return new qy4((Executor) this.b.get());
            case 3:
                Application application = (Application) this.b.get();
                im8 im8Var = new im8();
                zb8 zb8Var = new zb8(im8Var.e, 3);
                int i = ob8.a;
                rha.E(i, "capacity");
                cd8 c = new lc8(zb8Var, i, 2).c();
                c.f();
                application.registerActivityLifecycleCallbacks(im8Var);
                return c;
            case 4:
                String str = (String) this.b.get();
                Logger logger = vrb.c;
                synchronized (vrb.class) {
                    try {
                        if (vrb.d == null) {
                            List<urb> L = b0a.L(urb.class, vrb.a(), urb.class.getClassLoader(), new a99(27));
                            vrb.d = new vrb();
                            for (urb urbVar : L) {
                                vrb.c.fine("Service loader found " + urbVar);
                                vrb vrbVar2 = vrb.d;
                                synchronized (vrbVar2) {
                                    urbVar.getClass();
                                    vrbVar2.a.add(urbVar);
                                }
                            }
                            vrb vrbVar3 = vrb.d;
                            synchronized (vrbVar3) {
                                ArrayList arrayList = new ArrayList(vrbVar3.a);
                                Collections.sort(arrayList, Collections.reverseOrder(new wpb(1)));
                                vrbVar3.b = Collections.unmodifiableList(arrayList);
                            }
                        }
                        vrbVar = vrb.d;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                synchronized (vrbVar) {
                    list = vrbVar.b;
                }
                if ((list.isEmpty() ? null : (urb) list.get(0)) != null) {
                    return new god(str).b.a0();
                }
                throw new fb3("No functional channel service provider found. Try adding a dependency on the grpc-okhttp, grpc-netty, or grpc-netty-shaded artifact", 10);
            case 5:
                return new i49((vw9) this.b.get());
            case 6:
                return new kw9((eff) this.b.get());
            case 7:
                return new eff((Application) this.b.get(), "fiam_eligible_campaigns_cache_file");
            case 8:
                return new eff((Application) this.b.get(), "fiam_impressions_store_file");
            case 9:
                return new eff((Application) this.b.get(), "rate_limit_store_file");
            case 10:
                return new dgf((Application) this.b.get());
            default:
                return new zmf((eff) this.b.get(), new igf(3));
        }
    }

    public /* synthetic */ pu(Object obj, zff zffVar, int i) {
        this.a = i;
        this.b = zffVar;
    }

    public /* synthetic */ pu(zff zffVar, int i) {
        this.a = i;
        this.b = zffVar;
    }
}
