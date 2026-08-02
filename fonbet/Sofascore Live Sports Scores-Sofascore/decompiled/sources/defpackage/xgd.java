package defpackage;

import com.sofascore.results.notifications.NotificationSettingsActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class xgd extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ NotificationSettingsActivity t;
    public final /* synthetic */ b1d u;
    public final /* synthetic */ NotificationSettingsActivity v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xgd(NotificationSettingsActivity notificationSettingsActivity, b1d b1dVar, rq3 rq3Var, NotificationSettingsActivity notificationSettingsActivity2, int i) {
        super(2, rq3Var);
        this.r = i;
        switch (i) {
            case 1:
                e6b e6bVar = e6b.a;
                this.t = notificationSettingsActivity;
                this.u = b1dVar;
                this.v = notificationSettingsActivity2;
                super(2, rq3Var);
                break;
            default:
                e6b e6bVar2 = e6b.a;
                this.t = notificationSettingsActivity;
                this.u = b1dVar;
                this.v = notificationSettingsActivity2;
                break;
        }
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                e6b e6bVar = e6b.a;
                return new xgd(this.t, this.u, rq3Var, this.v, 0);
            default:
                e6b e6bVar2 = e6b.a;
                return new xgd(this.t, this.u, rq3Var, this.v, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((xgd) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        NotificationSettingsActivity notificationSettingsActivity = this.v;
        b1d b1dVar = this.u;
        NotificationSettingsActivity notificationSettingsActivity2 = this.t;
        int i2 = 1;
        rq3 rq3Var = null;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    e6b e6bVar = e6b.c;
                    wgd wgdVar = new wgd(b1dVar, rq3Var, notificationSettingsActivity, 0);
                    this.s = 1;
                    if (b6a.A(notificationSettingsActivity2, e6bVar, wgdVar, this) == lu3Var) {
                        break;
                    }
                } else if (i3 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            default:
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    e6b e6bVar2 = e6b.c;
                    wgd wgdVar2 = new wgd(b1dVar, rq3Var, notificationSettingsActivity, i2);
                    this.s = 1;
                    if (b6a.A(notificationSettingsActivity2, e6bVar2, wgdVar2, this) == lu3Var2) {
                        break;
                    }
                } else if (i4 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
        }
        return Unit.a;
    }
}
