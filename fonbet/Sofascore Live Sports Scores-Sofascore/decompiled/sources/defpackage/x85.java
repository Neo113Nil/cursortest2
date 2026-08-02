package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class x85 extends m2g implements Function2 {
    public fze s;
    public int t;
    public int u;
    public /* synthetic */ Object v;
    public final /* synthetic */ asf w;
    public final /* synthetic */ fsf x;
    public final /* synthetic */ fsf y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x85(asf asfVar, fsf fsfVar, fsf fsfVar2, rq3 rq3Var) {
        super(2, rq3Var);
        this.w = asfVar;
        this.x = fsfVar;
        this.y = fsfVar2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        x85 x85Var = new x85(this.w, this.x, this.y, rq3Var);
        x85Var.v = obj;
        return x85Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((x85) create((noi) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004a, code lost:
    
        if (r8 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0091, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ce A[EDGE_INSN: B:70:0x00ce->B:13:0x00ce BREAK  A[LOOP:0: B:7:0x00bb->B:10:0x00cb], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00bd  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00af -> B:6:0x00b2). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noi noiVar;
        int i;
        Object obj2;
        int i2;
        Object b;
        noi noiVar2;
        fze fzeVar;
        int size;
        int i3;
        boolean h;
        Object obj3;
        Object obj4;
        lu3 lu3Var = lu3.a;
        int i4 = this.u;
        fze fzeVar2 = null;
        int i5 = 2;
        int i6 = 1;
        if (i4 == 0) {
            y6a.M(obj);
            noiVar = (noi) this.v;
            i = 0;
            if (i == 0) {
            }
        } else {
            if (i4 == 1) {
                i = this.t;
                noiVar = (noi) this.v;
                y6a.M(obj);
                obj2 = obj;
                fze fzeVar3 = (fze) obj2;
                List list = fzeVar3.a;
                int size2 = list.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size2) {
                        i = i6;
                        break;
                    }
                    if (!qea.n((mze) list.get(i7))) {
                        break;
                    }
                    i7++;
                }
                List list2 = fzeVar3.a;
                int size3 = list2.size();
                for (int i8 = 0; i8 < size3; i8++) {
                    mze mzeVar = (mze) list2.get(i8);
                    if (mzeVar.b() || qea.z(mzeVar, noiVar.f.x, noiVar.d())) {
                        break;
                    }
                }
                if (fzeVar3.c == i5) {
                    i2 = 1;
                    this.w.a = true;
                    i = 1;
                } else {
                    i2 = 1;
                }
                gze gzeVar = gze.c;
                this.v = noiVar;
                this.s = fzeVar3;
                this.t = i;
                this.u = i5;
                b = noiVar.b(gzeVar, this);
                if (b != lu3Var) {
                    noiVar2 = noiVar;
                    fzeVar = fzeVar3;
                    List list3 = ((fze) b).a;
                    size = list3.size();
                    i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                        }
                        i3++;
                    }
                    fsf fsfVar = this.x;
                    h = e95.h(fzeVar, ((mze) fsfVar.a).a);
                    List list4 = fzeVar.a;
                    fsf fsfVar2 = this.y;
                    if (h) {
                    }
                    noiVar = noiVar2;
                    fzeVar2 = null;
                    i5 = 2;
                    i6 = 1;
                    if (i == 0) {
                    }
                }
                return lu3Var;
            }
            if (i4 != 2) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.t;
            fzeVar = this.s;
            noiVar2 = (noi) this.v;
            y6a.M(obj);
            i2 = 1;
            b = obj;
            List list32 = ((fze) b).a;
            size = list32.size();
            i3 = 0;
            while (true) {
                if (i3 >= size) {
                    break;
                }
                if (((mze) list32.get(i3)).b()) {
                    i = i2;
                    break;
                }
                i3++;
            }
            fsf fsfVar3 = this.x;
            h = e95.h(fzeVar, ((mze) fsfVar3.a).a);
            List list42 = fzeVar.a;
            fsf fsfVar22 = this.y;
            if (h) {
                int size4 = list42.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size4) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list42.get(i9);
                    if (ufa.o(((mze) obj3).a, ((mze) fsfVar3.a).a)) {
                        break;
                    }
                    i9++;
                }
                fsfVar22.a = obj3;
            } else {
                int size5 = list42.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size5) {
                        obj4 = fzeVar2;
                        break;
                    }
                    obj4 = list42.get(i10);
                    if (((mze) obj4).d) {
                        break;
                    }
                    i10++;
                }
                mze mzeVar2 = (mze) obj4;
                if (mzeVar2 != null) {
                    fsfVar3.a = mzeVar2;
                    fsfVar22.a = mzeVar2;
                } else {
                    i = i2;
                    i6 = i;
                    noiVar = noiVar2;
                    if (i == 0) {
                        return Unit.a;
                    }
                    gze gzeVar2 = gze.b;
                    this.v = noiVar;
                    this.s = fzeVar2;
                    this.t = i;
                    this.u = i6;
                    obj2 = noiVar.b(gzeVar2, this);
                }
            }
            noiVar = noiVar2;
            fzeVar2 = null;
            i5 = 2;
            i6 = 1;
            if (i == 0) {
            }
        }
    }
}
