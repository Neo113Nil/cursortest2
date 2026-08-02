package defpackage;

import android.os.Bundle;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class hgf implements iu {
    public volatile Object a;

    @Override // defpackage.iu
    public final void b(String str, String str2, Bundle bundle) {
        Object obj = this.a;
        iu iuVar = obj instanceof iu ? (iu) obj : null;
        if (iuVar != null) {
            iuVar.b(str, str2, bundle);
        }
    }

    @Override // defpackage.iu
    public final List d(String str) {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.iu
    public final Map e(boolean z) {
        return Collections.EMPTY_MAP;
    }

    @Override // defpackage.iu
    public final fu f(String str, gu guVar) {
        Object obj = this.a;
        if (obj instanceof iu) {
            return ((iu) obj).f(str, guVar);
        }
        ggf ggfVar = new ggf();
        ggfVar.a = new HashSet();
        ((nvd) obj).a(new li3(12, ggfVar, str, guVar));
        return ggfVar;
    }

    @Override // defpackage.iu
    public final void g(Object obj, String str) {
        Object obj2 = this.a;
        iu iuVar = obj2 instanceof iu ? (iu) obj2 : null;
        if (iuVar != null) {
            iuVar.g(obj, str);
        }
    }

    @Override // defpackage.iu
    public final int h(String str) {
        return 0;
    }

    @Override // defpackage.iu
    public final void a(hu huVar) {
    }

    @Override // defpackage.iu
    public final void c(String str) {
    }
}
