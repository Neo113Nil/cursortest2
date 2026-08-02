package defpackage;

import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class us5 implements p6b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ us5(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // defpackage.p6b
    public final void onStateChanged(u6b u6bVar, d6b d6bVar) {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                Context context = (Context) obj3;
                boh bohVar = (boh) obj2;
                e1d e1dVar = (e1d) obj;
                int i2 = vs5.a[d6bVar.ordinal()];
                if (i2 == 1) {
                    nv.L(context, "ai_insights", System.currentTimeMillis() - bohVar.h(), ((jm) e1dVar.getValue()).b);
                    break;
                } else if (i2 == 2) {
                    bohVar.i(System.currentTimeMillis());
                    break;
                }
                break;
            case 1:
                a7b a7bVar = (a7b) obj3;
                fsf fsfVar = (fsf) obj2;
                Function1 function1 = (Function1) obj;
                int i3 = o6b.a[d6bVar.ordinal()];
                if (i3 == 3) {
                    fsfVar.a = function1.invoke(a7bVar);
                    break;
                } else if (i3 == 4) {
                    v6b v6bVar = (v6b) fsfVar.a;
                    if (v6bVar != null) {
                        v6bVar.a();
                    }
                    fsfVar.a = null;
                    break;
                }
                break;
            case 2:
                f7b f7bVar = (f7b) obj3;
                fsf fsfVar2 = (fsf) obj2;
                Function1 function12 = (Function1) obj;
                int i4 = o6b.a[d6bVar.ordinal()];
                if (i4 == 1) {
                    fsfVar2.a = function12.invoke(f7bVar);
                    break;
                } else if (i4 == 2) {
                    ux0 ux0Var = (ux0) fsfVar2.a;
                    if (ux0Var != null) {
                        ux0Var.a();
                    }
                    fsfVar2.a = null;
                    break;
                }
                break;
            default:
                afc afcVar = (afc) obj3;
                Runnable runnable = afcVar.a;
                CopyOnWriteArrayList copyOnWriteArrayList = afcVar.b;
                e6b e6bVar = (e6b) obj2;
                zfc zfcVar = (zfc) obj;
                d6b.Companion.getClass();
                if (d6bVar != b6b.b(e6bVar)) {
                    if (d6bVar != d6b.ON_DESTROY) {
                        if (d6bVar == b6b.a(e6bVar)) {
                            copyOnWriteArrayList.remove(zfcVar);
                            runnable.run();
                            break;
                        }
                    } else {
                        afcVar.a(zfcVar);
                        break;
                    }
                } else {
                    copyOnWriteArrayList.add(zfcVar);
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
