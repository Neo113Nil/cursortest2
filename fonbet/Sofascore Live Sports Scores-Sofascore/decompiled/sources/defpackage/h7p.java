package defpackage;

import com.google.android.gms.internal.measurement.zzafc;
import com.google.android.gms.internal.measurement.zzto;
import com.google.android.gms.internal.measurement.zzwx;
import com.google.android.gms.internal.measurement.zzxa;
import java.util.ArrayList;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class h7p implements fj0 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ zzto b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ int d;

    public /* synthetic */ h7p(zzto zztoVar, int i, ArrayList arrayList) {
        this.b = zztoVar;
        this.d = i;
        this.c = arrayList;
    }

    @Override // defpackage.fj0
    public final ddb apply(Object obj) {
        switch (this.a) {
            case 0:
                int i = this.d;
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    if (((Boolean) hkg.P((Future) this.c.get(i2))).booleanValue()) {
                        throw null;
                    }
                }
                hv9 u = hv9.u(arrayList);
                oh2 oh2Var = new oh2();
                n33 n33Var = new n33(u, true);
                n33Var.n = new m33(n33Var, oh2Var);
                n33Var.s();
                return n33Var;
            default:
                zzafc zzafcVar = (zzafc) obj;
                ArrayList arrayList2 = this.c;
                hv9 u2 = hv9.u(arrayList2);
                zzwx a = zzxa.a(new mbd(this.b, zzafcVar, this.d, arrayList2, 6));
                n33 n33Var2 = new n33(u2, false);
                n33Var2.n = new m33(n33Var2, a, null);
                n33Var2.s();
                return n33Var2;
        }
    }

    public /* synthetic */ h7p(zzto zztoVar, ArrayList arrayList, int i) {
        this.b = zztoVar;
        this.c = arrayList;
        this.d = i;
    }
}
