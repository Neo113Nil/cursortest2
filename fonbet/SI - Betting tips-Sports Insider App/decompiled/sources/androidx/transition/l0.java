package androidx.transition;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: b, reason: collision with root package name */
    public View f2725b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2724a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2726c = new ArrayList();

    public l0(View view) {
        this.f2725b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return this.f2725b == l0Var.f2725b && this.f2724a.equals(l0Var.f2724a);
    }

    public final int hashCode() {
        return this.f2724a.hashCode() + (this.f2725b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder c2 = v.f.c("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        c2.append(this.f2725b);
        c2.append("\n");
        String l6 = r4.k.l(c2.toString(), "    values:");
        HashMap hashMap = this.f2724a;
        for (String str : hashMap.keySet()) {
            l6 = l6 + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return l6;
    }
}
