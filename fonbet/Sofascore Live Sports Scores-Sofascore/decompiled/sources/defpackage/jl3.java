package defpackage;

import kotlin.reflect.KProperty;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jl3 extends lkd {
    public final String b;
    public final /* synthetic */ kl3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jl3(kl3 kl3Var, float f, String str) {
        super(Float.valueOf(f));
        this.c = kl3Var;
        this.b = str;
    }

    @Override // defpackage.lkd
    public final void afterChange(KProperty kProperty, Object obj, Object obj2) {
        ((Number) obj).floatValue();
        float floatValue = ((Number) obj2).floatValue();
        if (Float.isNaN(floatValue)) {
            return;
        }
        hd2 hd2Var = this.c.b;
        String str = this.b;
        if (str == null) {
            str = kProperty.getName();
        }
        hd2Var.C(str, new fd2(floatValue));
    }
}
