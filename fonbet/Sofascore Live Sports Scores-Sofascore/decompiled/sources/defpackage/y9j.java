package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class y9j implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ caj b;
    public final /* synthetic */ int c;

    public /* synthetic */ y9j(caj cajVar, int i, int i2) {
        this.a = i2;
        this.b = cajVar;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        int i2 = this.c;
        caj cajVar = this.b;
        switch (i) {
            case 0:
                cajVar.H.a.n1(i2);
                return Unit.a;
            default:
                cajVar.r1(i2);
                return Boolean.TRUE;
        }
    }
}
