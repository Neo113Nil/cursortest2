package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class oxj {
    public final View b;
    public final HashMap a = new HashMap();
    public final ArrayList c = new ArrayList();

    public oxj(View view) {
        this.b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof oxj)) {
            return false;
        }
        oxj oxjVar = (oxj) obj;
        return this.b == oxjVar.b && this.a.equals(oxjVar.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder r = mz1.r("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        r.append(this.b);
        r.append("\n");
        String concat = r.toString().concat("    values:");
        HashMap hashMap = this.a;
        for (String str : hashMap.keySet()) {
            concat = concat + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return concat;
    }
}
