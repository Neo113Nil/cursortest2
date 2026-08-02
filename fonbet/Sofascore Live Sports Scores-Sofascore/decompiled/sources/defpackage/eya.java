package defpackage;

import android.content.Context;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.newNetwork.SeasonHighlightedComparison;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class eya extends hoi implements Function2 {
    public int A;
    public int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ Season D;
    public final /* synthetic */ gya E;
    public final /* synthetic */ int F;
    public final /* synthetic */ Context G;
    public av4 r;
    public zu4 s;
    public zu4 t;
    public yzc u;
    public Season v;
    public List w;
    public List x;
    public List y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eya(Season season, gya gyaVar, int i, Context context, rq3 rq3Var) {
        super(2, rq3Var);
        this.D = season;
        this.E = gyaVar;
        this.F = i;
        this.G = context;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        eya eyaVar = new eya(this.D, this.E, this.F, this.G, rq3Var);
        eyaVar.C = obj;
        return eyaVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((eya) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x010d, code lost:
    
        if (r6 == r2) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0157  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        av4 t;
        av4 av4Var;
        yzc yzcVar;
        Object w;
        zu4 zu4Var;
        int i;
        Season season;
        int i2;
        zu4 zu4Var2;
        List list;
        Object T;
        Object T2;
        int i3;
        List list2;
        List list3;
        Object T3;
        List list4;
        List list5;
        Season season2;
        List list6;
        Season season3;
        ku3 ku3Var = (ku3) this.C;
        lu3 lu3Var = lu3.a;
        int i4 = this.B;
        gya gyaVar = this.E;
        if (i4 == 0) {
            y6a.M(obj);
            Season season4 = this.D;
            int id = season4.getId();
            rq3 rq3Var = null;
            av4 t2 = xw3.t(ku3Var, null, new dya(gyaVar, this.F, id, this.G, rq3Var, 0), 3);
            t = xw3.t(ku3Var, null, new dya(gyaVar, this.F, id, this.G, rq3Var, 2), 3);
            av4 t3 = xw3.t(ku3Var, null, new dya(gyaVar, this.F, id, this.G, rq3Var, 1), 3);
            int i5 = this.F;
            av4Var = null;
            av4 t4 = xw3.t(ku3Var, null, new du1(gyaVar, i5, id, av4Var, 4), 3);
            yzcVar = gyaVar.h;
            this.C = null;
            this.r = t;
            this.s = t3;
            this.t = t4;
            this.u = yzcVar;
            this.v = season4;
            this.z = id;
            this.A = i5;
            this.B = 1;
            w = t2.w(this);
            if (w != lu3Var) {
                zu4Var = t4;
                i = i5;
                season = season4;
                i2 = id;
                zu4Var2 = t3;
            }
            return lu3Var;
        }
        if (i4 != 1) {
            if (i4 == 2) {
                i = this.A;
                i2 = this.z;
                List list7 = this.w;
                season = this.v;
                yzcVar = this.u;
                zu4Var = this.t;
                zu4Var2 = this.s;
                y6a.M(obj);
                list = list7;
                av4Var = null;
                T = obj;
                List list8 = (List) T;
                this.C = av4Var;
                this.r = av4Var;
                this.s = av4Var;
                this.t = zu4Var;
                this.u = yzcVar;
                this.v = season;
                this.w = list;
                this.x = list8;
                this.z = i2;
                this.A = i;
                this.B = 3;
                T2 = zu4Var2.T(this);
                if (T2 != lu3Var) {
                    List list9 = list;
                    i3 = i2;
                    list2 = list8;
                    list3 = list9;
                    List list10 = (List) T2;
                    this.C = av4Var;
                    this.r = av4Var;
                    this.s = av4Var;
                    this.t = av4Var;
                    this.u = yzcVar;
                    this.v = season;
                    this.w = list3;
                    this.x = list2;
                    this.y = list10;
                    this.z = i3;
                    this.A = i;
                    this.B = 4;
                    T3 = zu4Var.T(this);
                    if (T3 != lu3Var) {
                    }
                }
                return lu3Var;
            }
            if (i4 != 3) {
                if (i4 != 4) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = this.A;
                List list11 = this.y;
                list2 = this.x;
                List list12 = this.w;
                Season season5 = this.v;
                yzc yzcVar2 = this.u;
                y6a.M(obj);
                yzcVar = yzcVar2;
                list4 = list11;
                list5 = list12;
                av4Var = null;
                T3 = obj;
                season2 = season5;
                int i6 = i;
                List list13 = list2;
                SeasonHighlightedComparison seasonHighlightedComparison = (SeasonHighlightedComparison) T3;
                cya cyaVar = (cya) gyaVar.f.d();
                yzcVar.j(new bya(i6, season2, list5, list13, list4, seasonHighlightedComparison, (cyaVar != null || (list6 = cyaVar.b) == null || (season3 = (Season) CollectionsKt.j0(list6)) == null) ? av4Var : season3.getYear()));
                return Unit.a;
            }
            i = this.A;
            int i7 = this.z;
            List list14 = this.x;
            list3 = this.w;
            season = this.v;
            yzcVar = this.u;
            zu4Var = this.t;
            y6a.M(obj);
            i3 = i7;
            list2 = list14;
            av4Var = null;
            T2 = obj;
            List list102 = (List) T2;
            this.C = av4Var;
            this.r = av4Var;
            this.s = av4Var;
            this.t = av4Var;
            this.u = yzcVar;
            this.v = season;
            this.w = list3;
            this.x = list2;
            this.y = list102;
            this.z = i3;
            this.A = i;
            this.B = 4;
            T3 = zu4Var.T(this);
            if (T3 != lu3Var) {
                list4 = list102;
                list5 = list3;
                season2 = season;
                int i62 = i;
                List list132 = list2;
                SeasonHighlightedComparison seasonHighlightedComparison2 = (SeasonHighlightedComparison) T3;
                cya cyaVar2 = (cya) gyaVar.f.d();
                yzcVar.j(new bya(i62, season2, list5, list132, list4, seasonHighlightedComparison2, (cyaVar2 != null || (list6 = cyaVar2.b) == null || (season3 = (Season) CollectionsKt.j0(list6)) == null) ? av4Var : season3.getYear()));
                return Unit.a;
            }
            return lu3Var;
        }
        i = this.A;
        i2 = this.z;
        season = this.v;
        yzcVar = this.u;
        zu4Var = this.t;
        zu4Var2 = this.s;
        av4 av4Var2 = this.r;
        y6a.M(obj);
        w = obj;
        t = av4Var2;
        av4Var = null;
        list = (List) w;
        this.C = av4Var;
        this.r = av4Var;
        this.s = zu4Var2;
        this.t = zu4Var;
        this.u = yzcVar;
        this.v = season;
        this.w = list;
        this.z = i2;
        this.A = i;
        this.B = 2;
        T = t.T(this);
    }
}
