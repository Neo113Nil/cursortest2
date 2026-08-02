package defpackage;

import com.sofascore.model.mvvm.model.BaseballInningInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final /* synthetic */ class v07 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ float c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    public /* synthetic */ v07(float f, int i, int i2, xtc xtcVar) {
        this.b = xtcVar;
        this.c = f;
        this.d = i;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                xtc xtcVar = (xtc) this.b;
                ((Integer) obj2).getClass();
                int K = aba.K(1);
                ww9.f(this.c, this.d, this.e, K, (of3) obj, xtcVar);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int K2 = aba.K(this.d | 1);
                h5a.l((xtc) this.b, this.c, (of3) obj, K2, this.e);
                break;
            case 2:
                xtc xtcVar2 = (xtc) this.b;
                ((Integer) obj2).getClass();
                int K3 = aba.K(1);
                l98.D(this.c, this.d, this.e, K3, (of3) obj, xtcVar2);
                break;
            default:
                ((Integer) obj2).getClass();
                int K4 = aba.K(1);
                v81.c(this.d, this.e, (BaseballInningInfo) this.b, this.c, (of3) obj, K4);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ v07(float f, int i, int i2, xtc xtcVar, int i3) {
        this.c = f;
        this.d = i;
        this.e = i2;
        this.b = xtcVar;
    }

    public /* synthetic */ v07(int i, int i2, float f, xtc xtcVar, int i3) {
        this.d = i;
        this.e = i2;
        this.c = f;
        this.b = xtcVar;
    }

    public /* synthetic */ v07(int i, int i2, BaseballInningInfo baseballInningInfo, float f, int i3) {
        this.d = i;
        this.e = i2;
        this.b = baseballInningInfo;
        this.c = f;
    }
}
