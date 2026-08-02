package defpackage;

import android.os.Bundle;
import com.facebook.d0;
import com.facebook.internal.c;
import com.facebook.internal.h;
import com.facebook.internal.u;
import com.facebook.internal.x;
import com.facebook.j0;
import com.facebook.k0;
import com.facebook.w;
import com.inmobi.media.Sk;
import com.moloco.sdk.internal.publisher.h0;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class lkh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ lkh(long j, int i) {
        this.a = i;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u k;
        switch (this.a) {
            case 0:
                Sk.a(this.b);
                break;
            default:
                long j = this.b;
                if (!cw3.a.contains(k0.class)) {
                    try {
                        if (k0.f.a() && (k = x.k(w.b(), false)) != null && k.g) {
                            c b = h.b(w.a());
                            String a = (b == null || b.a() == null) ? null : b.a();
                            if (a != null) {
                                Bundle bundle = new Bundle();
                                bundle.putString("advertiser_id", a);
                                bundle.putString("fields", "auto_event_setup_enabled");
                                String str = d0.j;
                                d0 B = h0.B(null, "app", null);
                                B.d = bundle;
                                JSONObject jSONObject = B.c().b;
                                if (jSONObject != null) {
                                    j0 j0Var = k0.g;
                                    j0Var.c = Boolean.valueOf(jSONObject.optBoolean("auto_event_setup_enabled", false));
                                    j0Var.d = j;
                                    k0.a.m(j0Var);
                                }
                            }
                        }
                        k0.c.set(false);
                        break;
                    } catch (Throwable th) {
                        cw3.a(k0.class, th);
                    }
                }
                break;
        }
    }
}
