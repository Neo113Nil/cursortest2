package defpackage;

import android.content.Context;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class lc3 implements vff {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lc3(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.vff
    public final Object get() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                nc3 nc3Var = (nc3) obj2;
                kb3 kb3Var = (kb3) obj;
                ec3 ec3Var = kb3Var.f;
                vng vngVar = new vng();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                HashSet hashSet4 = new HashSet();
                HashSet hashSet5 = new HashSet();
                Set<qx4> set = kb3Var.c;
                Set set2 = kb3Var.g;
                for (qx4 qx4Var : set) {
                    int i2 = qx4Var.c;
                    int i3 = qx4Var.b;
                    boolean z = i2 == 0;
                    oif oifVar = qx4Var.a;
                    if (z) {
                        if (i3 == 2) {
                            hashSet4.add(oifVar);
                        } else {
                            hashSet.add(oifVar);
                        }
                    } else if (i2 == 2) {
                        hashSet3.add(oifVar);
                    } else if (i3 == 2) {
                        hashSet5.add(oifVar);
                    } else {
                        hashSet2.add(oifVar);
                    }
                }
                if (!set2.isEmpty()) {
                    hashSet.add(oif.a(wgf.class));
                }
                vngVar.a = Collections.unmodifiableSet(hashSet);
                vngVar.b = Collections.unmodifiableSet(hashSet2);
                vngVar.c = Collections.unmodifiableSet(hashSet3);
                vngVar.d = Collections.unmodifiableSet(hashSet4);
                vngVar.e = Collections.unmodifiableSet(hashSet5);
                vngVar.f = nc3Var;
                return ec3Var.l(vngVar);
            case 1:
                return new d99((Context) obj2, (String) obj);
            default:
                r38 r38Var = (r38) obj2;
                String d = r38Var.d();
                return new sd4((Context) obj, d);
        }
    }
}
