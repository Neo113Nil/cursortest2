package defpackage;

import android.content.Context;
import com.blaze.blazesdk.features.shared.models.ui_shared.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class cfm implements Function0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ efm b;
    public final /* synthetic */ n4m c;
    public final /* synthetic */ url d;

    public /* synthetic */ cfm(n4m n4mVar, efm efmVar, url urlVar) {
        this.c = n4mVar;
        this.b = efmVar;
        this.d = urlVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        url urlVar = this.d;
        n4m n4mVar = this.c;
        efm efmVar = this.b;
        switch (i) {
            case 0:
                boolean z = efm.j;
                i iVar = n4mVar.i;
                if (iVar != null && nq8.s(iVar) && efm.u(n4mVar)) {
                    Context context = efmVar.b.a.getContext();
                    context.getClass();
                    cnb.triggerHapticFeedback$default(context, null, 1, null);
                    ((obm) urlVar).F(n4mVar);
                }
                break;
            default:
                boolean z2 = efm.j;
                efmVar.j(n4mVar, new cfm(n4mVar, efmVar, urlVar));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ cfm(efm efmVar, n4m n4mVar, url urlVar) {
        this.b = efmVar;
        this.c = n4mVar;
        this.d = urlVar;
    }
}
