package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class ikf implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ te2 d;

    public /* synthetic */ ikf(int i, boolean z, float f, te2 te2Var) {
        this.a = i;
        this.b = z;
        this.c = f;
        this.d = te2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float intBitsToFloat;
        float intValue = ((Integer) obj).intValue() / this.a;
        r62 r62Var = this.d.a;
        boolean z = this.b;
        float f = this.c;
        if (z) {
            intBitsToFloat = ((Float.intBitsToFloat((int) (r62Var.n() >> 32)) - f) * (1.0f - intValue)) + f;
        } else {
            intBitsToFloat = intValue * (Float.intBitsToFloat((int) (r62Var.n() >> 32)) - f);
        }
        return Float.valueOf(intBitsToFloat);
    }
}
