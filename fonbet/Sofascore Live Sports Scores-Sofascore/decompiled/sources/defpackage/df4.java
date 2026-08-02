package defpackage;

import com.sofascore.model.fantasy.FantasyCreateTeamPostBody;
import com.sofascore.network.api.FantasyAPI;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class df4 extends hoi implements Function1 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int r = 0;
    public int s;
    public int t;
    public Object u;
    public Object v;
    public Object w;
    public Serializable x;
    public Object y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public df4(wi7 wi7Var, int i, ArrayList arrayList, String str, String str2, Integer num, Integer num2, Boolean bool, rq3 rq3Var) {
        super(1, rq3Var);
        this.u = wi7Var;
        this.t = i;
        this.v = arrayList;
        this.w = str;
        this.x = str2;
        this.y = num;
        this.z = num2;
        this.A = bool;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        int i = this.r;
        Object obj = this.A;
        Object obj2 = this.z;
        switch (i) {
            case 0:
                return new df4((qf4) obj2, (ujg) obj, rq3Var);
            default:
                return new df4((wi7) this.u, this.t, (ArrayList) this.v, (String) this.w, (String) this.x, (Integer) this.y, (Integer) obj2, (Boolean) obj, rq3Var);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((df4) create(rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012b  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        h2d j2dVar;
        asf asfVar;
        fsf fsfVar;
        fsf fsfVar2;
        fsf fsfVar3;
        asf asfVar2;
        Iterator it;
        h2d h2dVar;
        asf asfVar3;
        fsf fsfVar4;
        cf4 cf4Var;
        h2d h2dVar2;
        Object d;
        Object obj2;
        int i;
        int i2 = this.r;
        Object obj3 = this.A;
        Object obj4 = this.z;
        switch (i2) {
            case 0:
                ujg ujgVar = (ujg) obj3;
                qf4 qf4Var = (qf4) obj4;
                lu3 lu3Var = lu3.a;
                int i3 = this.t;
                if (i3 == 0) {
                    y6a.M(obj);
                    j2dVar = new j2d();
                    asfVar = new asf();
                    fsfVar = new fsf();
                    this.u = j2dVar;
                    this.x = asfVar;
                    this.v = fsfVar;
                    this.w = fsfVar;
                    this.t = 1;
                    obj = qf4Var.h(true, this);
                    if (obj != lu3Var) {
                        fsfVar2 = fsfVar;
                    }
                    return lu3Var;
                }
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 != 4) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i = this.s;
                            obj2 = this.u;
                            y6a.M(obj);
                            return new od4(obj2, i, ((Number) obj).intValue());
                        }
                        h2dVar2 = (h2d) this.v;
                        fsfVar3 = (fsf) this.x;
                        asfVar2 = (asf) this.u;
                        y6a.M(obj);
                        try {
                            asfVar2.a = true;
                            Unit unit = Unit.a;
                            h2dVar2.f(null);
                            Object obj5 = fsfVar3.a;
                            int hashCode = obj5 == null ? obj5.hashCode() : 0;
                            h7a c = qf4Var.c();
                            this.u = obj5;
                            this.x = null;
                            this.v = null;
                            this.s = hashCode;
                            this.t = 4;
                            d = c.d(this);
                            if (d != lu3Var) {
                                obj = d;
                                obj2 = obj5;
                                i = hashCode;
                                return new od4(obj2, i, ((Number) obj).intValue());
                            }
                            return lu3Var;
                        } catch (Throwable th) {
                            h2dVar2.f(null);
                            throw th;
                        }
                    }
                    it = (Iterator) this.y;
                    cf4Var = (cf4) this.w;
                    fsfVar4 = (fsf) this.v;
                    asfVar3 = (asf) this.x;
                    h2dVar = (h2d) this.u;
                    y6a.M(obj);
                    while (it.hasNext()) {
                        Function2 function2 = (Function2) it.next();
                        this.u = h2dVar;
                        this.x = asfVar3;
                        this.v = fsfVar4;
                        this.w = cf4Var;
                        this.y = it;
                        this.t = 2;
                        if (function2.invoke(cf4Var, this) == lu3Var) {
                            return lu3Var;
                        }
                    }
                    fsfVar3 = fsfVar4;
                    asfVar2 = asfVar3;
                    j2dVar = h2dVar;
                    ujgVar.d = null;
                    this.u = asfVar2;
                    this.x = fsfVar3;
                    this.v = j2dVar;
                    this.w = null;
                    this.y = null;
                    this.t = 3;
                    if (j2dVar.e(this) != lu3Var) {
                        h2dVar2 = j2dVar;
                        asfVar2.a = true;
                        Unit unit2 = Unit.a;
                        h2dVar2.f(null);
                        Object obj52 = fsfVar3.a;
                        if (obj52 == null) {
                        }
                        h7a c2 = qf4Var.c();
                        this.u = obj52;
                        this.x = null;
                        this.v = null;
                        this.s = hashCode;
                        this.t = 4;
                        d = c2.d(this);
                        if (d != lu3Var) {
                        }
                    }
                    return lu3Var;
                }
                fsfVar = (fsf) this.w;
                fsfVar2 = (fsf) this.v;
                asfVar = (asf) this.x;
                j2dVar = (h2d) this.u;
                y6a.M(obj);
                fsfVar.a = ((od4) obj).b;
                cf4 cf4Var2 = new cf4(j2dVar, asfVar, fsfVar2, qf4Var);
                List list = (List) ujgVar.d;
                if (list == null) {
                    fsfVar3 = fsfVar2;
                    asfVar2 = asfVar;
                    ujgVar.d = null;
                    this.u = asfVar2;
                    this.x = fsfVar3;
                    this.v = j2dVar;
                    this.w = null;
                    this.y = null;
                    this.t = 3;
                    if (j2dVar.e(this) != lu3Var) {
                    }
                    return lu3Var;
                }
                it = list.iterator();
                h2dVar = j2dVar;
                asfVar3 = asfVar;
                fsfVar4 = fsfVar2;
                cf4Var = cf4Var2;
                while (it.hasNext()) {
                }
                fsfVar3 = fsfVar4;
                asfVar2 = asfVar3;
                j2dVar = h2dVar;
                ujgVar.d = null;
                this.u = asfVar2;
                this.x = fsfVar3;
                this.v = j2dVar;
                this.w = null;
                this.y = null;
                this.t = 3;
                if (j2dVar.e(this) != lu3Var) {
                }
                return lu3Var;
            default:
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
                FantasyAPI fantasyAPI = ((wi7) this.u).a;
                int i5 = this.t;
                FantasyCreateTeamPostBody fantasyCreateTeamPostBody = new FantasyCreateTeamPostBody((ArrayList) this.v, (String) this.w, (String) this.x, (Integer) this.y, (Integer) obj4, (Boolean) obj3);
                this.s = 1;
                Object createTeam = fantasyAPI.createTeam(i5, fantasyCreateTeamPostBody, this);
                return createTeam == lu3Var2 ? lu3Var2 : createTeam;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public df4(qf4 qf4Var, ujg ujgVar, rq3 rq3Var) {
        super(1, rq3Var);
        this.z = qf4Var;
        this.A = ujgVar;
    }
}
