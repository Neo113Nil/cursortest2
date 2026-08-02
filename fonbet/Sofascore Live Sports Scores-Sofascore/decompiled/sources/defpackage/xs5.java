package defpackage;

import android.app.Application;
import android.content.SharedPreferences;
import com.sofascore.model.mvvm.model.Event;
import kotlin.Metadata;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lxs5;", "Lynb;", "Los5;", "Lsr5;", "", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class xs5 extends ynb {
    public final s96 l;
    public final SharedPreferences m;
    public final bli n;
    public im o;
    public final jof p;
    public final jof q;
    public boolean r;
    public Event s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xs5(Application application, s96 s96Var, SharedPreferences sharedPreferences, bli bliVar) {
        super(application, tnb.a);
        s96Var.getClass();
        sharedPreferences.getClass();
        bliVar.getClass();
        this.l = s96Var;
        this.m = sharedPreferences;
        this.n = bliVar;
        this.p = bliVar.g;
        this.q = bliVar.i;
        xw3.L(un0.z(this), null, null, new q3(this, null, 21), 3);
    }

    @Override // defpackage.ltk
    public final void e() {
        this.n.a();
        this.s = null;
    }

    public final Object t(im imVar, Event event, String str, boolean z, ce4 ce4Var) {
        int id = event.getId();
        Object r = s9a.r(new hj(this, id, z, new bs2(this, id, dla.a(), str, null, 1), new r82(24, event, this), imVar, event.getSportSlug(), null), ce4Var);
        return r == lu3.a ? r : Unit.a;
    }

    public final void u(Event event) {
        event.getClass();
        this.s = event;
        xw3.L(un0.z(this), null, null, new ce4(this, event, (rq3) null, 10), 3);
    }
}
