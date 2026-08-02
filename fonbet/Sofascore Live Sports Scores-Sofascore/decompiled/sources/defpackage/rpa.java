package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class rpa implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ rpa(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        int i2 = this.b;
        switch (i) {
            case 0:
                return new qpa(i2, 0);
            default:
                return Integer.valueOf(i2);
        }
    }
}
