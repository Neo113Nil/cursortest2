package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class uy extends xka implements Function1 {
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uy(int i, int i2) {
        super(1);
        this.i = i2;
        this.j = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.i;
        int i2 = this.j;
        switch (i) {
            case 0:
                return Boolean.valueOf(((ne8) obj).r1(i2));
            case 1:
                return Boolean.valueOf(((ne8) obj).r1(i2));
            case 2:
                return Boolean.valueOf(((ne8) obj).r1(i2));
            case 3:
                return Boolean.valueOf(((ne8) obj).r1(i2));
            default:
                return Boolean.valueOf(((ne8) obj).k1(i2));
        }
    }
}
