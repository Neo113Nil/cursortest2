package defpackage;

import com.sofascore.results.firebase.announcement.FantasyRemoteAnnouncementLocation;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class iu6 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ pu6 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iu6(pu6 pu6Var, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.s = pu6Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        pu6 pu6Var = this.s;
        switch (i) {
            case 0:
                return new iu6(pu6Var, rq3Var, 0);
            case 1:
                return new iu6(pu6Var, rq3Var, 1);
            default:
                return new iu6(pu6Var, rq3Var, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
        }
        return ((iu6) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        pu6 pu6Var = this.s;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                hu6 l = pu6Var.l();
                List e = j58.e();
                FantasyRemoteAnnouncementLocation fantasyRemoteAnnouncementLocation = FantasyRemoteAnnouncementLocation.MY_TEAM;
                String str = pu6Var.i;
                pu6Var.x(hu6.a(l, null, null, null, null, null, null, null, null, null, false, false, null, false, false, null, null, null, false, false, null, null, null, rfo.B(e, fantasyRemoteAnnouncementLocation, Integer.valueOf(pu6Var.m().c.c), dv3.c(), str), null, 12582911));
                break;
            case 1:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                pu6.u(pu6Var, null, 3);
                break;
            default:
                lu3 lu3Var3 = lu3.a;
                y6a.M(obj);
                pu6Var.x(hu6.a(pu6Var.l(), uj7.b, null, null, null, null, null, null, null, null, false, false, null, false, false, null, null, null, false, false, u77.a, null, null, null, null, 16251390));
                break;
        }
        return Unit.a;
    }
}
