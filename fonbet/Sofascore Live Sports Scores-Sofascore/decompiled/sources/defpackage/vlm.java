package defpackage;

import com.blaze.blazesdk.shared.results.g0;
import com.blaze.blazesdk.shared.results.l;
import com.blaze.blazesdk.shared.results.p;
import com.blaze.blazesdk.shared.results.q;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vlm implements wke {
    @Override // defpackage.wke
    public final void onPlayerError(dke dkeVar) {
        dkeVar.getClass();
        int i = dkeVar.a;
        g0 pVar = (i == 2001 || i == 2002) ? new p() : i != 2004 ? new q() : new l();
        pVar.f = dkeVar;
        j1m.a(pVar);
    }
}
