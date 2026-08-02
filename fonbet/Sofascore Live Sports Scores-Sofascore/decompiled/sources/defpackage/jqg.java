package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jqg implements mqg {
    public final nqg a;
    public boolean b;
    public Bundle c;
    public final mqi d;

    public jqg(nqg nqgVar, ttk ttkVar) {
        nqgVar.getClass();
        this.a = nqgVar;
        this.d = ypa.b(new e6g(ttkVar, 7));
    }

    @Override // defpackage.mqg
    public final Bundle a() {
        lm5.a.getClass();
        Bundle E = hz8.E((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            E.putAll(bundle);
        }
        for (Map.Entry entry : ((kqg) this.d.getValue()).b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a = ((qb3) ((fqg) entry.getValue()).b.f).a();
            if (!a.isEmpty()) {
                r4a.G(E, str, a);
            }
        }
        this.b = false;
        return E;
    }

    public final void b() {
        if (this.b) {
            return;
        }
        Bundle a = this.a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        lm5.a.getClass();
        Bundle E = hz8.E((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            E.putAll(bundle);
        }
        if (a != null) {
            E.putAll(a);
        }
        this.c = E;
        this.b = true;
    }
}
