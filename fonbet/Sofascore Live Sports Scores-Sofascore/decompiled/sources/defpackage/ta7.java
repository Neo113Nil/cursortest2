package defpackage;

import android.app.Application;
import com.sofascore.local_persistance.BrandingFantasyCompetition;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lta7;", "Lq8;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ta7 extends q8 {
    public final wi7 e;
    public final int f;
    public final String g;
    public final fdi h;
    public final jof i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ta7(wi7 wi7Var, fqg fqgVar, Application application) {
        super(application);
        fqgVar.getClass();
        wi7Var.getClass();
        this.e = wi7Var;
        Object a = fqgVar.a("competitionId");
        rq3 rq3Var = null;
        if (a == null) {
            a70.r("Required value was null.");
            throw null;
        }
        this.f = ((Number) a).intValue();
        this.g = dv3.c();
        ia0 ia0Var = ia0.q;
        fdi a2 = gdi.a(new ra7(ok3.p().e().getNickname(), 251));
        this.h = a2;
        this.i = un0.K(new v98(new ip1(this, rq3Var, 16), a2), un0.z(this), new uci(5000L, Long.MAX_VALUE), new ra7(null, 255));
        l();
    }

    public final void k() {
        fdi fdiVar;
        Object value;
        do {
            fdiVar = this.h;
            value = fdiVar.getValue();
        } while (!fdiVar.k(value, ra7.a((ra7) value, uj7.a, null, null, false, null, null, false, false, 254)));
        xw3.L(un0.z(this), null, null, new u1(this, null, 22), 3);
    }

    public final void l() {
        fdi fdiVar;
        Object value;
        ra7 ra7Var;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        do {
            fdiVar = this.h;
            value = fdiVar.getValue();
            ra7Var = (ra7) value;
            ev6 ev6Var = ra7Var.b;
            String str = ra7Var.c;
            BrandingFantasyCompetition brandingFantasyCompetition = ev6Var != null ? ev6Var.D : null;
            z = false;
            z2 = brandingFantasyCompetition == null || StringsKt.R(brandingFantasyCompetition.getTermsAndConditionsUrl()) || !brandingFantasyCompetition.getIsTermsAndConditionsMandatory() || ra7Var.g;
            rn6 rn6Var = ra7Var.f;
            z3 = (rn6Var != null && rn6Var.c) || ra7Var.e.isEmpty();
            if (StringsKt.R(str) || str.length() > 30) {
                z4 = false;
            } else {
                z4 = false;
                z = true;
            }
        } while (!fdiVar.k(value, ra7.a(ra7Var, null, null, null, z, null, null, false, (z && z2 && z3) ? true : z4, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE)));
    }
}
