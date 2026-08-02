package defpackage;

import com.inmobi.media.core.config.models.CrashConfig;
import com.sofascore.model.mvvm.model.Event;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class i36 extends hoi implements Function2 {
    public final /* synthetic */ Event A;
    public av4 r;
    public List s;
    public int t;
    public long u;
    public long v;
    public int w;
    public /* synthetic */ Object x;
    public final /* synthetic */ String y;
    public final /* synthetic */ r36 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i36(String str, r36 r36Var, Event event, rq3 rq3Var) {
        super(2, rq3Var);
        this.y = str;
        this.z = r36Var;
        this.A = event;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        i36 i36Var = new i36(this.y, this.z, this.A, rq3Var);
        i36Var.x = obj;
        return i36Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i36) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ca, code lost:
    
        if (r0 != r2) goto L28;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object w;
        av4 av4Var;
        int i;
        long j;
        long j2;
        List list;
        Object T;
        long j3;
        long j4;
        Object R;
        ku3 ku3Var = (ku3) this.x;
        lu3 lu3Var = lu3.a;
        int i2 = this.w;
        rq3 rq3Var = null;
        if (i2 == 0) {
            y6a.M(obj);
            String str = this.y;
            if (str == null) {
                return km5.a;
            }
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            r36 r36Var = this.z;
            Event event = this.A;
            av4 t = xw3.t(ku3Var, null, new h36(r36Var, event, str, rq3Var, 0), 3);
            av4 t2 = xw3.t(ku3Var, null, new h36(r36Var, event, str, rq3Var, 1), 3);
            this.x = null;
            this.r = t2;
            this.t = 2;
            this.u = CrashConfig.DEFAULT_EVENT_TTL_SEC;
            this.v = currentTimeMillis;
            this.w = 1;
            w = t.w(this);
            if (w != lu3Var) {
                av4Var = t2;
                i = 2;
                j = 259200;
                j2 = currentTimeMillis;
            }
            return lu3Var;
        }
        if (i2 == 1) {
            j2 = this.v;
            j = this.u;
            i = this.t;
            av4 av4Var2 = this.r;
            y6a.M(obj);
            av4Var = av4Var2;
            w = obj;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                R = obj;
                return (List) R;
            }
            long j5 = this.v;
            long j6 = this.u;
            i = this.t;
            list = this.s;
            y6a.M(obj);
            j3 = j5;
            j4 = j6;
            T = obj;
            int i3 = i;
            List list2 = list;
            hs4 hs4Var = z45.a;
            gu2 gu2Var = new gu2(list2, (List) T, i3, j3, j4, null);
            this.x = null;
            this.r = null;
            this.s = null;
            this.t = i3;
            this.u = j4;
            this.v = j3;
            this.w = 3;
            R = xw3.R(hs4Var, gu2Var, this);
        }
        list = (List) w;
        this.x = null;
        this.r = null;
        this.s = list;
        this.t = i;
        this.u = j;
        this.v = j2;
        this.w = 2;
        T = av4Var.T(this);
        if (T != lu3Var) {
            j3 = j2;
            j4 = j;
            int i32 = i;
            List list22 = list;
            hs4 hs4Var2 = z45.a;
            gu2 gu2Var2 = new gu2(list22, (List) T, i32, j3, j4, null);
            this.x = null;
            this.r = null;
            this.s = null;
            this.t = i32;
            this.u = j4;
            this.v = j3;
            this.w = 3;
            R = xw3.R(hs4Var2, gu2Var2, this);
        }
        return lu3Var;
    }
}
