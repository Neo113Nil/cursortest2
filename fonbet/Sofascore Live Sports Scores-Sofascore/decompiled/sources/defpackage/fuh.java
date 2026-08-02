package defpackage;

import android.content.Context;
import com.sofascore.results.ads.UpgradeSofascoreActivity;
import com.sofascore.results.event.EventActivity;
import com.sofascore.results.event.aiInsights.SofascoreAnalystTennisPromoBottomSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class fuh implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SofascoreAnalystTennisPromoBottomSheet b;

    public /* synthetic */ fuh(SofascoreAnalystTennisPromoBottomSheet sofascoreAnalystTennisPromoBottomSheet, int i) {
        this.a = i;
        this.b = sofascoreAnalystTennisPromoBottomSheet;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object u2gVar;
        int i = this.a;
        SofascoreAnalystTennisPromoBottomSheet sofascoreAnalystTennisPromoBottomSheet = this.b;
        switch (i) {
            case 0:
                String string = sofascoreAnalystTennisPromoBottomSheet.requireArguments().getString("ARG_VARIANT");
                if (string != null) {
                    try {
                        p2g p2gVar = w2g.b;
                        u2gVar = guh.valueOf(string);
                    } catch (Throwable th) {
                        p2g p2gVar2 = w2g.b;
                        u2gVar = new u2g(th);
                    }
                    guh guhVar = (guh) (u2gVar instanceof u2g ? null : u2gVar);
                    if (guhVar != null) {
                        return guhVar;
                    }
                }
                return guh.f;
            case 1:
                return Integer.valueOf(sofascoreAnalystTennisPromoBottomSheet.requireArguments().getInt("ARG_EVENT_ID"));
            default:
                Context requireContext = sofascoreAnalystTennisPromoBottomSheet.requireContext();
                requireContext.getClass();
                kv kvVar = kv.CLICK;
                joa joaVar = sofascoreAnalystTennisPromoBottomSheet.E;
                nv.z0(requireContext, kvVar, ((guh) joaVar.getValue()).e, "tennis_promo_modal");
                int ordinal = ((guh) joaVar.getValue()).ordinal();
                if (ordinal == 0) {
                    wxf wxfVar = EventActivity.h0;
                    Context requireContext2 = sofascoreAnalystTennisPromoBottomSheet.requireContext();
                    requireContext2.getClass();
                    wxf.B(requireContext2, ((Number) sofascoreAnalystTennisPromoBottomSheet.F.getValue()).intValue(), rd6.d, null, null, null, 120);
                } else {
                    if (ordinal != 1) {
                        zzl.b();
                        return null;
                    }
                    int i2 = UpgradeSofascoreActivity.M;
                    Context requireContext3 = sofascoreAnalystTennisPromoBottomSheet.requireContext();
                    requireContext3.getClass();
                    e2f.k(requireContext3, false);
                }
                sofascoreAnalystTennisPromoBottomSheet.j();
                return Unit.a;
        }
    }
}
