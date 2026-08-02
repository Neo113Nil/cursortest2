package defpackage;

import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class dpd implements kfi {
    public static final LinkedHashSet f = new LinkedHashSet();
    public static final dff g = new dff(3);
    public final s18 a;
    public final cqa b;
    public final Function2 c;
    public final h84 d;
    public final mqi e;

    public dpd(s18 s18Var, cqa cqaVar, h84 h84Var) {
        mpa mpaVar = new mpa(16);
        s18Var.getClass();
        this.a = s18Var;
        this.b = cqaVar;
        this.c = mpaVar;
        this.d = h84Var;
        this.e = ypa.b(new cpd(this, 1));
    }

    @Override // defpackage.kfi
    public final lfi a() {
        String w = ((uae) this.e.getValue()).a.w();
        synchronized (g) {
            LinkedHashSet linkedHashSet = f;
            if (linkedHashSet.contains(w)) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + w + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            linkedHashSet.add(w);
        }
        return new gpd(this.a, (uae) this.e.getValue(), this.b, (h7a) this.c.invoke((uae) this.e.getValue(), this.a), new cpd(this, 0));
    }
}
