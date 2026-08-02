package defpackage;

import android.app.Application;
import com.sofascore.model.mvvm.model.Event;
import kotlin.Metadata;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lp46;", "Lx21;", "Lm46;", "Lh46;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class p46 extends x21 {
    public final s96 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p46(s96 s96Var, Application application) {
        super(application);
        s96Var.getClass();
        this.o = s96Var;
    }

    @Override // defpackage.x21
    public final Object u(Event event, rq3 rq3Var) {
        Object r = s9a.r(new o46(this, event, ok3.s(event), (rq3) null), rq3Var);
        return r == lu3.a ? r : Unit.a;
    }

    @Override // defpackage.x21
    public final void x(boolean z) {
        n(null, new c31(z, 5));
    }
}
