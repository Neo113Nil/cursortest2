package defpackage;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class u89 extends m2g implements Function2 {
    public Iterator s;
    public int[] t;
    public int u;
    public int v;
    public int w;
    public /* synthetic */ Object x;
    public final /* synthetic */ v89 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u89(v89 v89Var, rq3 rq3Var) {
        super(2, rq3Var);
        this.y = v89Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        u89 u89Var = new u89(this.y, rq3Var);
        u89Var.x = obj;
        return u89Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u89) create((x4h) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0047  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0067 -> B:5:0x006b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x003a -> B:6:0x0044). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        x4h x4hVar;
        Iterator it;
        int i;
        lu3 lu3Var = lu3.a;
        int i2 = this.w;
        v89 v89Var = this.y;
        if (i2 == 0) {
            y6a.M(obj);
            x4hVar = (x4h) this.x;
            it = v89Var.a.iterator();
            i = 0;
            if (it.hasNext()) {
            }
        } else {
            if (i2 != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i3 = this.v;
            int i4 = this.u;
            int[] iArr = this.t;
            Iterator it2 = this.s;
            x4h x4hVar2 = (x4h) this.x;
            y6a.M(obj);
            x4hVar = x4hVar2;
            i3 += 6;
            int[] iArr2 = iArr;
            int i5 = i4 + 6;
            Iterator it3 = it2;
            int[] iArr3 = iArr2;
            if (i3 < iArr3.length) {
                it = it3;
                i = i5;
                if (it.hasNext()) {
                    return Unit.a;
                }
                iArr3 = (int[]) it.next();
                i5 = i;
                it3 = it;
                i3 = 0;
                if (i3 < iArr3.length) {
                    if (v89Var.a(i5) != -1) {
                        Integer num = new Integer(i5);
                        this.x = x4hVar;
                        this.s = it3;
                        this.t = iArr3;
                        this.u = i5;
                        this.v = i3;
                        this.w = 1;
                        x4hVar.d(this, num);
                        lu3 lu3Var2 = lu3.a;
                        return lu3Var;
                    }
                    int[] iArr4 = iArr3;
                    it2 = it3;
                    i4 = i5;
                    iArr = iArr4;
                    i3 += 6;
                    int[] iArr22 = iArr;
                    int i52 = i4 + 6;
                    Iterator it32 = it2;
                    int[] iArr32 = iArr22;
                    if (i3 < iArr32.length) {
                    }
                }
            }
        }
    }
}
