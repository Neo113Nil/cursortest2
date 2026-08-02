package defpackage;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class oqk extends m2g implements Function2 {
    public mze s;
    public int t;
    public int u;
    public /* synthetic */ Object v;
    public final /* synthetic */ e1d w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oqk(e1d e1dVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.w = e1dVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        oqk oqkVar = new oqk(this.w, rq3Var);
        oqkVar.v = obj;
        return oqkVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((oqk) create((noi) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x002f, code lost:
    
        if (r13 == r1) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0059  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0048 -> B:6:0x004b). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        mze mzeVar;
        int i;
        Object b;
        Object obj2;
        noi noiVar = (noi) this.v;
        lu3 lu3Var = lu3.a;
        int i2 = this.u;
        if (i2 == 0) {
            y6a.M(obj);
            this.v = noiVar;
            this.u = 1;
            obj = rti.b(noiVar, this, 3);
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i3 = this.t;
                mzeVar = this.s;
                y6a.M(obj);
                Iterator it = ((fze) obj).a.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (ufa.o(((mze) obj2).a, mzeVar.a)) {
                        break;
                    }
                }
                mze mzeVar2 = (mze) obj2;
                if (mzeVar2 != null || mzeVar2.b() || dnd.d(dnd.h(mzeVar2.c, mzeVar.c)) > noiVar.e().g()) {
                    i3 = 0;
                } else if (!qea.m(mzeVar2)) {
                    i = i3;
                    this.v = noiVar;
                    this.s = mzeVar;
                    this.t = i;
                    this.u = 2;
                    b = noiVar.b(gze.b, this);
                    if (b != lu3Var) {
                        i3 = i;
                        obj = b;
                        Iterator it2 = ((fze) obj).a.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                            }
                        }
                        mze mzeVar22 = (mze) obj2;
                        if (mzeVar22 != null) {
                        }
                        i3 = 0;
                    }
                    return lu3Var;
                }
                if (i3 != 0) {
                    ((Function0) this.w.getValue()).invoke();
                }
                return Unit.a;
            }
            y6a.M(obj);
        }
        mzeVar = (mze) obj;
        i = 1;
        this.v = noiVar;
        this.s = mzeVar;
        this.t = i;
        this.u = 2;
        b = noiVar.b(gze.b, this);
        if (b != lu3Var) {
        }
        return lu3Var;
    }
}
