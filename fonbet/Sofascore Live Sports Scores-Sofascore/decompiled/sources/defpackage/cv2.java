package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class cv2 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ cv2(boolean z, Function0 function0, boolean z2, int i, int i2) {
        this.b = z;
        this.f = function0;
        this.c = z2;
        this.d = i;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                xtc xtcVar = (xtc) this.f;
                ((Integer) obj2).getClass();
                wnn.a(aba.K(this.d | 1), this.e, (of3) obj, xtcVar, this.b, this.c);
                break;
            default:
                ((Integer) obj2).getClass();
                ufd.a(this.b, (Function0) this.f, this.c, (of3) obj, aba.K(this.d | 1), this.e);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ cv2(boolean z, boolean z2, xtc xtcVar, int i, int i2) {
        this.b = z;
        this.c = z2;
        this.f = xtcVar;
        this.d = i;
        this.e = i2;
    }
}
