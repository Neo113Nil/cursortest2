package defpackage;

import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Season;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class sy5 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ dz5 t;
    public final /* synthetic */ Event u;
    public final /* synthetic */ int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sy5(dz5 dz5Var, Event event, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = 0;
        this.u = event;
        this.t = dz5Var;
        this.v = i;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new sy5(this.t, this.u, rq3Var, this.v);
            case 1:
                return new sy5(this.t, this.u, this.v, rq3Var, 1);
            default:
                return new sy5(this.t, this.u, this.v, rq3Var, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((sy5) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        int i2 = this.v;
        Event event = this.u;
        dz5 dz5Var = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    List<String> streamContentGeoRestrictions = event.getStreamContentGeoRestrictions();
                    if (Intrinsics.c(streamContentGeoRestrictions != null ? Boolean.valueOf(streamContentGeoRestrictions.contains(dv3.c())) : null, Boolean.TRUE)) {
                        t9c t9cVar = dz5Var.j;
                        this.s = 1;
                        obj = t9cVar.h(i2, this);
                        if (obj == lu3Var) {
                            return lu3Var;
                        }
                    }
                    return Unit.a;
                }
                if (i3 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                String str = (String) obj;
                if (str != null) {
                    dz5Var.y.j(str);
                }
                return Unit.a;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                if (i4 != 0) {
                    if (i4 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                g39 g39Var = dz5Var.q;
                int m = yid.m(o3a.F(event.getTournament()));
                Season season = event.getSeason();
                int m2 = yid.m(season != null ? new Integer(season.getId()) : null);
                this.s = 1;
                Object f = g39Var.f(m, m2, i2, this);
                return f == lu3Var2 ? lu3Var2 : f;
            default:
                lu3 lu3Var3 = lu3.a;
                int i5 = this.s;
                if (i5 != 0) {
                    if (i5 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                umd umdVar = dz5Var.o;
                String slug = event.getTournament().getCategory().getSport().getSlug();
                this.s = 1;
                umdVar.getClass();
                Object r = s9a.r(new emd(i2, null, umdVar, slug), this);
                return r == lu3Var3 ? lu3Var3 : r;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sy5(dz5 dz5Var, Event event, int i, rq3 rq3Var, int i2) {
        super(2, rq3Var);
        this.r = i2;
        this.t = dz5Var;
        this.u = event;
        this.v = i;
    }
}
