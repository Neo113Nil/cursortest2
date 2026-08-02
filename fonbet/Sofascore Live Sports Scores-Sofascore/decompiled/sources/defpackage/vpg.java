package defpackage;

import android.os.Bundle;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vpg implements spg, qqg {
    public final /* synthetic */ tpg a;
    public y6b b;
    public oqg c;

    public vpg(tpg tpgVar) {
        this.a = tpgVar;
        Object f = tpgVar.f("androidx.savedstate.SavedStateRegistry");
        Bundle bundle = f instanceof Bundle ? (Bundle) f : null;
        if (bundle != null && this.c == null) {
            oqg oqgVar = new oqg(new pqg(this, new e6g(this, 8)));
            this.c = oqgVar;
            oqgVar.a(bundle);
        }
        tpgVar.a("androidx.savedstate.SavedStateRegistry", new e6g(this, 6));
    }

    @Override // defpackage.spg
    public final rpg a(String str, Function0 function0) {
        return this.a.a(str, function0);
    }

    @Override // defpackage.spg
    public final boolean d(Object obj) {
        return this.a.d(obj);
    }

    @Override // defpackage.spg
    public final Map e() {
        return this.a.e();
    }

    @Override // defpackage.spg
    public final Object f(String str) {
        return this.a.f(str);
    }

    @Override // defpackage.u6b
    public final g6b getLifecycle() {
        y6b y6bVar = this.b;
        if (y6bVar != null) {
            return y6bVar;
        }
        y6b y6bVar2 = new y6b(this, false);
        this.b = y6bVar2;
        return y6bVar2;
    }

    @Override // defpackage.qqg
    public final nqg getSavedStateRegistry() {
        oqg oqgVar = this.c;
        if (oqgVar == null) {
            oqg oqgVar2 = new oqg(new pqg(this, new e6g(this, 8)));
            this.c = oqgVar2;
            oqgVar2.a(null);
            oqgVar = oqgVar2;
        }
        return oqgVar.b;
    }
}
