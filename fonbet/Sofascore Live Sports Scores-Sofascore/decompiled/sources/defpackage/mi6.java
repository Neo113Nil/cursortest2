package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class mi6 {
    public final ArrayList a;
    public final List b;
    public final String c;

    public mi6(List list, ArrayList arrayList) {
        list.getClass();
        this.a = arrayList;
        this.b = list;
        this.c = "active_experiment_".concat("android_appsflyer_personalized_onboarding");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mi6)) {
            return false;
        }
        mi6 mi6Var = (mi6) obj;
        return this.a.equals(mi6Var.a) && this.b.equals(mi6Var.b);
    }

    public final int hashCode() {
        return dmi.d(vxd.d(this.a, -687547113, 31), 961, this.b);
    }

    public final String toString() {
        return "Experiment(name=android_appsflyer_personalized_onboarding, variants=" + this.a + ", filters=" + this.b + ", expirationTimestamp=null, killTimestamp=null)";
    }
}
