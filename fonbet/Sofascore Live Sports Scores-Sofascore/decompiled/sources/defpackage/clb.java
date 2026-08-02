package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class clb extends xka implements Function1 {
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ clb(Object obj, int i, int i2) {
        super(1);
        this.i = i2;
        this.j = obj;
        this.k = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.i;
        int i2 = this.k;
        Object obj2 = this.j;
        switch (i) {
            case 0:
                return Boolean.valueOf(((flb) obj2).g(i2, ((Number) obj).longValue()));
            case 1:
                return Boolean.valueOf(((flb) obj2).g(i2, ((Number) obj).longValue()));
            default:
                Boolean valueOf = Boolean.valueOf(((ne8) obj).r1(i2));
                ((fsf) obj2).a = valueOf;
                return valueOf;
        }
    }
}
