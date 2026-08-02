package defpackage;

import com.facebook.g0;
import com.facebook.z;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class a0 implements z {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ a0(List list, int i) {
        this.a = i;
        this.b = list;
    }

    @Override // com.facebook.z
    public final void a(g0 g0Var) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        int i = this.a;
        List list = this.b;
        switch (i) {
            case 0:
                if (!cw3.a.contains(b0.class)) {
                    try {
                        g0Var.getClass();
                        try {
                            if (g0Var.c == null && (jSONObject = g0Var.d) != null && jSONObject.getBoolean("success")) {
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    f6a.m(((e6a) it.next()).a);
                                }
                                break;
                            }
                        } catch (JSONException unused) {
                            return;
                        }
                    } catch (Throwable th) {
                        cw3.a(b0.class, th);
                        return;
                    }
                }
                break;
            default:
                g0Var.getClass();
                try {
                    if (g0Var.c == null && (jSONObject2 = g0Var.d) != null && jSONObject2.getBoolean("success")) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            f6a.m(((e6a) it2.next()).a);
                        }
                        break;
                    }
                } catch (JSONException unused2) {
                    return;
                }
                break;
        }
    }
}
