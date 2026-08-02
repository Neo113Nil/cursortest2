package defpackage;

import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ff9 extends xka implements Function2 {
    public final /* synthetic */ int i;
    public final /* synthetic */ gf9[] j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ff9(gf9[] gf9VarArr, int i) {
        super(2);
        this.i = i;
        this.j = gf9VarArr;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.i;
        gf9[] gf9VarArr = this.j;
        switch (i) {
            case 0:
                return Float.valueOf(jca.N((phe) obj, true, gf9VarArr, ((Number) obj2).floatValue()));
            default:
                return Float.valueOf(jca.N((phe) obj, false, gf9VarArr, ((Number) obj2).floatValue()));
        }
    }
}
