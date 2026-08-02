package defpackage;

import com.sofascore.model.newNetwork.EventListResponse;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ywa extends hoi implements Function2 {
    public av4 r;
    public zu4 s;
    public List t;
    public List u;
    public boolean v;
    public int w;
    public int x;
    public /* synthetic */ Object y;
    public final /* synthetic */ zwa z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ywa(zwa zwaVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.z = zwaVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        ywa ywaVar = new ywa(this.z, rq3Var);
        ywaVar.y = obj;
        return ywaVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ywa) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00f1, code lost:
    
        if (r8.j(r12) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bf, code lost:
    
        if (r13 != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a4  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        av4 t;
        zu4 zu4Var;
        int i;
        List list;
        boolean z;
        List list2;
        EventListResponse eventListResponse;
        ku3 ku3Var = (ku3) this.y;
        lu3 lu3Var = lu3.a;
        int i2 = this.x;
        int i3 = 0;
        int i4 = 2;
        int i5 = 1;
        zwa zwaVar = this.z;
        rq3 rq3Var = null;
        if (i2 == 0) {
            y6a.M(obj);
            t = xw3.t(ku3Var, null, new xwa(zwaVar, rq3Var, i5), 3);
            av4 t2 = xw3.t(ku3Var, null, new xwa(zwaVar, rq3Var, i4), 3);
            av4 t3 = xw3.t(ku3Var, null, new xwa(zwaVar, rq3Var, i3), 3);
            this.y = null;
            this.r = t;
            this.s = t2;
            this.x = 1;
            Object w = t3.w(this);
            if (w != lu3Var) {
                zu4Var = t2;
                obj = w;
            }
            return lu3Var;
        }
        if (i2 == 1) {
            zu4 zu4Var2 = this.s;
            t = this.r;
            y6a.M(obj);
            zu4Var = zu4Var2;
        } else if (i2 == 2) {
            int i6 = this.w;
            z = this.v;
            list2 = this.u;
            List list3 = this.t;
            zu4Var = this.s;
            y6a.M(obj);
            i = i6;
            list = list3;
            eventListResponse = (EventListResponse) obj;
            if (eventListResponse != null) {
                list2.addAll(eventListResponse.getEvents());
            }
            this.y = null;
            this.r = null;
            this.s = null;
            this.t = list;
            this.u = list2;
            this.v = z;
            this.w = i;
            this.x = 3;
            obj = zu4Var.T(this);
        } else {
            if (i2 != 3) {
                if (i2 == 4) {
                    y6a.M(obj);
                    return Unit.a;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = this.v;
            list2 = this.u;
            list = this.t;
            y6a.M(obj);
            EventListResponse eventListResponse2 = (EventListResponse) obj;
            if (eventListResponse2 != null) {
                list2.addAll(eventListResponse2.getEvents());
            }
            zwaVar.f.j(new Pair(a.a(list), Boolean.valueOf(z)));
            this.y = null;
            this.r = null;
            this.s = null;
            this.t = null;
            this.u = null;
            this.v = z;
            this.x = 4;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        xbb b = a.b();
        this.y = null;
        this.r = null;
        this.s = zu4Var;
        this.t = b;
        this.u = b;
        this.v = booleanValue;
        this.w = 0;
        this.x = 2;
        Object T = t.T(this);
        if (T != lu3Var) {
            i = 0;
            list = b;
            z = booleanValue;
            obj = T;
            list2 = list;
            eventListResponse = (EventListResponse) obj;
            if (eventListResponse != null) {
            }
            this.y = null;
            this.r = null;
            this.s = null;
            this.t = list;
            this.u = list2;
            this.v = z;
            this.w = i;
            this.x = 3;
            obj = zu4Var.T(this);
        }
        return lu3Var;
    }
}
