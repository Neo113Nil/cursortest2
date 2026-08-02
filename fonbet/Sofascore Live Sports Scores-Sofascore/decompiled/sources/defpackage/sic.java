package defpackage;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class sic {
    public final wj9 a;
    public final x6k b;
    public final HashMap c;

    public sic(Context context, x6k x6kVar) {
        wj9 wj9Var = new wj9(context, 22);
        this.c = new HashMap();
        this.a = wj9Var;
        this.b = x6kVar;
    }

    public final synchronized uxj a(String str) {
        if (this.c.containsKey(str)) {
            return (uxj) this.c.get(str);
        }
        CctBackendFactory n = this.a.n(str);
        if (n == null) {
            return null;
        }
        x6k x6kVar = this.b;
        uxj create = n.create(new bu0((Context) x6kVar.b, (wy2) x6kVar.c, (wy2) x6kVar.d, str));
        this.c.put(str, create);
        return create;
    }
}
