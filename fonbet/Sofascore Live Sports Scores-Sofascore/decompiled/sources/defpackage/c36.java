package defpackage;

import android.app.Application;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.network.response.Head2HeadEventsResponse;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lc36;", "Lq8;", "u26", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c36 extends q8 {
    public final ddi e;
    public final s96 f;
    public final j0j g;
    public final umd h;
    public final amd i;
    public final yzc j;
    public final lec k;
    public final yzc l;
    public final yzc m;
    public g9i n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c36(Application application, ddi ddiVar, s96 s96Var, j0j j0jVar, umd umdVar, amd amdVar) {
        super(application);
        ddiVar.getClass();
        s96Var.getClass();
        j0jVar.getClass();
        umdVar.getClass();
        amdVar.getClass();
        this.e = ddiVar;
        this.f = s96Var;
        this.g = j0jVar;
        this.h = umdVar;
        this.i = amdVar;
        yzc yzcVar = new yzc();
        this.j = yzcVar;
        this.k = waa.w(yzcVar);
        yzc yzcVar2 = new yzc();
        this.l = yzcVar2;
        this.m = yzcVar2;
    }

    public final Event k() {
        return (Event) this.e.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(String str, sq3 sq3Var) {
        z26 z26Var;
        int i;
        List<Event> events;
        if (sq3Var instanceof z26) {
            z26Var = (z26) sq3Var;
            int i2 = z26Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                z26Var.t = i2 - Integer.MIN_VALUE;
                Object obj = z26Var.r;
                lu3 lu3Var = lu3.a;
                i = z26Var.t;
                rq3 rq3Var = null;
                int i3 = 1;
                if (i != 0) {
                    y6a.M(obj);
                    z26Var.t = 1;
                    s96 s96Var = this.f;
                    s96Var.getClass();
                    obj = yaa.P(new b86(s96Var, str, rq3Var, i3), z26Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                Head2HeadEventsResponse head2HeadEventsResponse = (Head2HeadEventsResponse) yaa.x((x2g) obj);
                return (head2HeadEventsResponse != null || (events = head2HeadEventsResponse.getEvents()) == null) ? km5.a : events;
            }
        }
        z26Var = new z26(this, sq3Var);
        Object obj2 = z26Var.r;
        lu3 lu3Var2 = lu3.a;
        i = z26Var.t;
        rq3 rq3Var2 = null;
        int i32 = 1;
        if (i != 0) {
        }
        Head2HeadEventsResponse head2HeadEventsResponse2 = (Head2HeadEventsResponse) yaa.x((x2g) obj2);
        if (head2HeadEventsResponse2 != null) {
        }
    }
}
