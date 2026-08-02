package defpackage;

import com.sofascore.results.firebase.announcement.FantasyRemoteAnnouncement;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class du6 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ hu6 s;
    public final /* synthetic */ e1d t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ du6(hu6 hu6Var, e1d e1dVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.s = hu6Var;
        this.t = e1dVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new du6(this.s, this.t, rq3Var, 0);
            case 1:
                return new du6(this.s, this.t, rq3Var, 1);
            case 2:
                return new du6(this.s, this.t, rq3Var, 2);
            default:
                return new du6(this.s, this.t, rq3Var, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((du6) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        e1d e1dVar = this.t;
        hu6 hu6Var = this.s;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                FantasyRemoteAnnouncement fantasyRemoteAnnouncement = hu6Var.w;
                if (fantasyRemoteAnnouncement != null) {
                    e1dVar.setValue(fantasyRemoteAnnouncement);
                }
                break;
            case 1:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                if (!hu6Var.c.a.h()) {
                    e1dVar.setValue(hu6Var.c.a);
                }
                break;
            case 2:
                lu3 lu3Var3 = lu3.a;
                y6a.M(obj);
                if (hu6Var.c.d()) {
                    e1dVar.setValue(hu6Var.c);
                }
                break;
            default:
                lu3 lu3Var4 = lu3.a;
                y6a.M(obj);
                if (hu6Var.f.isEmpty()) {
                    e1dVar.setValue(hu6Var.c.a);
                }
                break;
        }
        return Unit.a;
    }
}
