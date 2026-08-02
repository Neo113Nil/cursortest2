package defpackage;

import android.content.Context;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.FootballEvent;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class mj8 extends y21 {
    public final FootballEvent O;
    public Integer P;
    public Integer Q;

    public mj8(FootballEvent footballEvent) {
        this.O = footballEvent;
    }

    @Override // defpackage.y21
    public final Event d() {
        return this.O;
    }

    @Override // defpackage.y21
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!mj8.class.equals(obj != null ? obj.getClass() : null) || !super.equals(obj)) {
            return false;
        }
        obj.getClass();
        mj8 mj8Var = (mj8) obj;
        return Intrinsics.c(this.P, mj8Var.P) && Intrinsics.c(this.Q, mj8Var.Q);
    }

    @Override // defpackage.y21
    public final void h(Context context, Event event) {
        FootballEvent footballEvent = (FootballEvent) event;
        context.getClass();
        footballEvent.getClass();
        s9a.C(this, footballEvent);
        this.P = footballEvent.getHomeRedCards();
        this.Q = footballEvent.getAwayRedCards();
    }

    @Override // defpackage.y21
    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        Integer num = this.P;
        int intValue = (hashCode + (num != null ? num.intValue() : 0)) * 31;
        Integer num2 = this.Q;
        return intValue + (num2 != null ? num2.intValue() : 0);
    }
}
