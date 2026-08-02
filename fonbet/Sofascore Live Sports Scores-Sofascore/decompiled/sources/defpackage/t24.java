package defpackage;

import com.sofascore.model.crowdsourcing.EventSuggest;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class t24 extends hoi implements Function2 {
    public w24 r;
    public Object s;
    public x2g t;
    public int u;
    public int v;
    public int w;
    public int x;
    public final /* synthetic */ w24 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t24(w24 w24Var, rq3 rq3Var) {
        super(2, rq3Var);
        this.y = w24Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new t24(this.y, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((t24) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ce, code lost:
    
        if (r11.emit(r3, r10) == r0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ed, code lost:
    
        if (r11 == r0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0088, code lost:
    
        if (r11 == r0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0183, code lost:
    
        if (kotlin.Unit.a != r0) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d2  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        w24 w24Var;
        int i;
        EventSuggest.IncidentSuggest incidentSuggest;
        EventSuggest.IncidentSuggest incidentSuggest2;
        x2g x2gVar;
        int i2;
        w24 w24Var2;
        int i3;
        w24 w24Var3;
        x2g x2gVar2;
        aeh aehVar;
        Integer num;
        w24 w24Var4;
        int i4;
        int i5;
        lu3 lu3Var = lu3.a;
        int i6 = this.x;
        w24 w24Var5 = this.y;
        int i7 = 0;
        switch (i6) {
            case 0:
                y6a.M(obj);
                aeh aehVar2 = w24Var5.f;
                this.x = 1;
                obj = rd0.y(aehVar2, this);
                break;
            case 1:
                y6a.M(obj);
                EventSuggest.IncidentSuggest incidentSuggest3 = ((k24) obj).b.b;
                if (incidentSuggest3 != null) {
                    fdi fdiVar = w24Var5.k;
                    Boolean bool = Boolean.TRUE;
                    this.r = w24Var5;
                    this.s = incidentSuggest3;
                    this.u = 0;
                    this.x = 2;
                    fdiVar.getClass();
                    fdiVar.m(null, bool);
                    if (Unit.a != lu3Var) {
                        w24Var = w24Var5;
                        i = 0;
                        incidentSuggest = incidentSuggest3;
                        if (incidentSuggest.getId() < 0) {
                            e64 e64Var = w24Var.e;
                            int id = incidentSuggest.getId();
                            this.r = w24Var;
                            this.s = incidentSuggest;
                            this.u = i;
                            this.x = 4;
                            e64Var.getClass();
                            obj = yaa.P(new b64(e64Var, id, null, 0), this);
                            break;
                        } else {
                            aeh aehVar3 = w24Var.g;
                            Integer num2 = new Integer(incidentSuggest.getId());
                            this.r = null;
                            this.s = null;
                            this.u = i;
                            this.x = 3;
                            break;
                        }
                    }
                    return lu3Var;
                }
                return Unit.a;
            case 2:
                i = this.u;
                incidentSuggest = (EventSuggest.IncidentSuggest) this.s;
                w24Var = this.r;
                y6a.M(obj);
                if (incidentSuggest.getId() < 0) {
                }
                return lu3Var;
            case 3:
                y6a.M(obj);
                return Unit.a;
            case 4:
                i = this.u;
                incidentSuggest = (EventSuggest.IncidentSuggest) this.s;
                w24Var = this.r;
                y6a.M(obj);
                incidentSuggest2 = incidentSuggest;
                x2g x2gVar3 = (x2g) obj;
                if (x2gVar3 instanceof t2g) {
                    w24Var3 = w24Var;
                    x2gVar2 = x2gVar3;
                    i4 = i;
                    if (!(x2gVar2 instanceof t2g)) {
                        if (!(x2gVar2 instanceof v2g)) {
                            zzl.b();
                            return null;
                        }
                        return Unit.a;
                    }
                    aeh aehVar4 = w24Var3.i;
                    Unit unit = Unit.a;
                    this.r = w24Var3;
                    this.s = null;
                    this.t = x2gVar2;
                    this.u = i4;
                    this.v = 0;
                    this.w = 0;
                    this.x = 7;
                    if (aehVar4.emit(unit, this) != lu3Var) {
                        i5 = 0;
                        fdi fdiVar2 = w24Var3.k;
                        Boolean bool2 = Boolean.FALSE;
                        this.r = null;
                        this.s = x2gVar2;
                        this.t = null;
                        this.u = i4;
                        this.v = i7;
                        this.w = i5;
                        this.x = 8;
                        fdiVar2.getClass();
                        fdiVar2.m(null, bool2);
                        break;
                    }
                    return lu3Var;
                }
                if (!(x2gVar3 instanceof v2g)) {
                    zzl.b();
                    return null;
                }
                this.r = w24Var;
                this.s = incidentSuggest2;
                this.t = x2gVar3;
                this.u = i;
                this.v = 0;
                this.w = 0;
                this.x = 5;
                if (n4o.y(300L, this) != lu3Var) {
                    x2gVar = x2gVar3;
                    i2 = 0;
                    w24Var2 = w24Var;
                    i3 = 0;
                    aehVar = w24Var2.g;
                    num = new Integer(incidentSuggest2.getId());
                    this.r = w24Var2;
                    this.s = null;
                    this.t = x2gVar;
                    this.u = i;
                    this.v = i3;
                    this.w = i2;
                    this.x = 6;
                    if (aehVar.emit(num, this) != lu3Var) {
                        w24Var4 = w24Var2;
                        w24Var3 = w24Var4;
                        x2gVar2 = x2gVar;
                        i4 = i;
                        if (!(x2gVar2 instanceof t2g)) {
                        }
                    }
                }
                return lu3Var;
            case 5:
                int i8 = this.w;
                int i9 = this.v;
                int i10 = this.u;
                x2g x2gVar4 = this.t;
                incidentSuggest2 = (EventSuggest.IncidentSuggest) this.s;
                w24Var2 = this.r;
                y6a.M(obj);
                i2 = i8;
                i = i10;
                i3 = i9;
                x2gVar = x2gVar4;
                aehVar = w24Var2.g;
                num = new Integer(incidentSuggest2.getId());
                this.r = w24Var2;
                this.s = null;
                this.t = x2gVar;
                this.u = i;
                this.v = i3;
                this.w = i2;
                this.x = 6;
                if (aehVar.emit(num, this) != lu3Var) {
                }
                return lu3Var;
            case 6:
                i = this.u;
                x2gVar = this.t;
                w24Var4 = this.r;
                y6a.M(obj);
                w24Var3 = w24Var4;
                x2gVar2 = x2gVar;
                i4 = i;
                if (!(x2gVar2 instanceof t2g)) {
                }
                break;
            case 7:
                int i11 = this.w;
                int i12 = this.v;
                i4 = this.u;
                x2gVar2 = this.t;
                w24Var3 = this.r;
                y6a.M(obj);
                i5 = i11;
                i7 = i12;
                fdi fdiVar22 = w24Var3.k;
                Boolean bool22 = Boolean.FALSE;
                this.r = null;
                this.s = x2gVar2;
                this.t = null;
                this.u = i4;
                this.v = i7;
                this.w = i5;
                this.x = 8;
                fdiVar22.getClass();
                fdiVar22.m(null, bool22);
                break;
            case 8:
                y6a.M(obj);
                return Unit.a;
            default:
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
