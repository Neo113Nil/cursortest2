package defpackage;

import com.blaze.blazesdk.delegates.BlazeWidgetDelegate;
import com.blaze.blazesdk.delegates.models.BlazePlayerType;
import com.blaze.blazesdk.shared.results.BlazeResult;
import com.blaze.blazesdk.shared.results.ErrorReason;
import defpackage.lrl;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rzl implements BlazeWidgetDelegate {
    public final /* synthetic */ prl a;

    public rzl(prl prlVar) {
        this.a = prlVar;
    }

    @Override // com.blaze.blazesdk.delegates.BlazeWidgetDelegate, com.blaze.blazesdk.delegates.BlazePlayerSourceDelegate
    public final void onDataLoadComplete(BlazePlayerType blazePlayerType, String str, int i, BlazeResult blazeResult) {
        blazePlayerType.getClass();
        blazeResult.getClass();
        prl prlVar = this.a;
        prlVar.getClass();
        fdi fdiVar = prlVar.b;
        if (str != null && (fdiVar.getValue() instanceof lrl.c)) {
            boolean z = false;
            qvl qvlVar = new qvl(i, (blazeResult instanceof BlazeResult.Error) && ((BlazeResult.Error) blazeResult).getReason() != ErrorReason.NO_AVAILABLE_CONTENT_FOR_DATA_SOURCE);
            int hashCode = str.hashCode();
            if (hashCode != -1154260311) {
                if (hashCode != -639844030) {
                    if (hashCode == 535585570 && str.equals("blaze_inner_search_stories")) {
                        prlVar.d = qvlVar;
                    }
                } else if (str.equals("blaze_inner_search_moments")) {
                    prlVar.e = qvlVar;
                }
            } else if (str.equals("blaze_inner_search_videos")) {
                prlVar.f = qvlVar;
            }
            if (prlVar.d.b && prlVar.e.b && prlVar.f.b) {
                Object value = fdiVar.getValue();
                lrl.c cVar = value instanceof lrl.c ? (lrl.c) value : null;
                if (cVar == null) {
                    return;
                }
                String str2 = cVar.a;
                boolean z2 = prlVar.d.a() || prlVar.e.a() || prlVar.f.a();
                qvl qvlVar2 = prlVar.d;
                if (qvlVar2.c && prlVar.e.c && prlVar.f.c) {
                    z = true;
                }
                Object cVar2 = z2 ? new lrl.c(str2, qvlVar2.a(), prlVar.e.a(), prlVar.f.a()) : z ? new lrl.a(str2, "") : new lrl.b(str2);
                fdiVar.getClass();
                fdiVar.m(null, cVar2);
            }
        }
    }
}
