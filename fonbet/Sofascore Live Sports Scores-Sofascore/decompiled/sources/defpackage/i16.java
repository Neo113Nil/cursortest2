package defpackage;

import android.view.View;
import com.sofascore.model.newNetwork.hockeyplaybyplay.HockeyIncident;
import com.sofascore.results.event.hockeyplaybyplay.EventHockeyPlayByPlayFragment;
import com.unity3d.services.UnityAdsConstants;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class i16 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ i16(vll vllVar, int i, qhe qheVar, int i2, m1c m1cVar) {
        this.a = 2;
        this.d = vllVar;
        this.b = i;
        this.e = qheVar;
        this.c = i2;
        this.f = m1cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = this.c;
        int i3 = this.b;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                EventHockeyPlayByPlayFragment eventHockeyPlayByPlayFragment = (EventHockeyPlayByPlayFragment) obj4;
                fsf fsfVar = (fsf) obj3;
                ((View) obj).getClass();
                ((vd9) eventHockeyPlayByPlayFragment.w.getValue()).setSelectedIncident((HockeyIncident) fsfVar.a);
                f16 F = eventHockeyPlayByPlayFragment.F();
                int i4 = ((dsf) obj2).a;
                r1 = fsfVar.a == null ? 1 : 0;
                sl6 sl6Var = F.n;
                if (i4 != ((Number) sl6Var.a).intValue() || (r1 != 0 && ((Number) sl6Var.a).intValue() != -1)) {
                    if (r1 != 0) {
                        i4 = -1;
                    }
                    sl6Var.a = Integer.valueOf(i4);
                    F.notifyItemRangeChanged(i3 - 1, (i2 - i3) + 2, d16.a);
                }
                break;
            case 1:
                qhe[] qheVarArr = (qhe[]) obj4;
                l8g l8gVar = (l8g) obj3;
                int[] iArr = (int[]) obj2;
                phe pheVar = (phe) obj;
                int length = qheVarArr.length;
                int i5 = 0;
                while (r1 < length) {
                    qhe qheVar = qheVarArr[r1];
                    int i6 = i5 + 1;
                    qheVar.getClass();
                    Object h = qheVar.h();
                    h8g h8gVar = h instanceof h8g ? (h8g) h : null;
                    c5n c5nVar = h8gVar != null ? h8gVar.c : null;
                    int i7 = this.b;
                    pheVar.e(qheVar, iArr[i5], c5nVar != null ? c5nVar.s(i7, qheVar.b, ema.a, qheVar, this.c) : l8gVar.b.a(qheVar.b, i7), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    r1++;
                    i5 = i6;
                }
                break;
            default:
                phe.g((phe) obj, (qhe) obj3, ((r6a) ((vll) obj4).q.invoke(new c7a(((i3 - r5.a) << 32) | ((i2 - r5.b) & 4294967295L)), ((m1c) obj2).getLayoutDirection())).a);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ i16(Object obj, Object obj2, int i, int i2, Serializable serializable, int i3) {
        this.a = i3;
        this.d = obj;
        this.e = obj2;
        this.b = i;
        this.c = i2;
        this.f = serializable;
    }
}
