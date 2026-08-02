package defpackage;

import com.blaze.blazesdk.players.ui.k;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ggm implements b98 {
    public final /* synthetic */ k a;

    public ggm(k kVar) {
        this.a = kVar;
    }

    @Override // defpackage.b98
    public final Object emit(Object obj, rq3 rq3Var) {
        k kVar = this.a;
        if (kVar.q((y0m) obj)) {
            kVar.finish();
        }
        return Unit.a;
    }
}
