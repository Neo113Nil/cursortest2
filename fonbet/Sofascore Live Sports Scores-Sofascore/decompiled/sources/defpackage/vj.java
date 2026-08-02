package defpackage;

import android.app.Application;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.results.event.odds.model.OddsEventUIModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lvj;", "Lynb;", "Luj;", "", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class vj extends ynb {
    public final umd l;
    public final OddsEventUIModel m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vj(Application application, umd umdVar, amd amdVar, fqg fqgVar) {
        super(application, tnb.a);
        Object value;
        Object value2;
        umdVar.getClass();
        amdVar.getClass();
        fqgVar.getClass();
        this.l = umdVar;
        OddsEventUIModel oddsEventUIModel = (OddsEventUIModel) fqgVar.a("ARG_EVENT");
        this.m = oddsEventUIModel;
        fdi fdiVar = this.e;
        if (oddsEventUIModel == null) {
            do {
                value2 = fdiVar.getValue();
                ((vnb) value2).getClass();
            } while (!fdiVar.k(value2, new snb()));
            return;
        }
        List a = amdVar.a(oddsEventUIModel.d);
        OddsCountryProvider oddsCountryProvider = (OddsCountryProvider) CollectionsKt.firstOrNull(a == null ? amdVar.c() : a);
        if (oddsCountryProvider != null) {
            xw3.L(un0.z(this), null, null, new l0(this, oddsCountryProvider, null, 9), 3);
            return;
        }
        do {
            value = fdiVar.getValue();
            ((vnb) value).getClass();
        } while (!fdiVar.k(value, new snb()));
    }
}
