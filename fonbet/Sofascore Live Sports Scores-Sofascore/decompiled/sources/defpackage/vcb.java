package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class vcb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qpa b;

    public /* synthetic */ vcb(qpa qpaVar, int i) {
        this.a = i;
        this.b = qpaVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        qpa qpaVar = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(qpaVar.g() > 0 || qpaVar.d.c.h() != 0);
            default:
                return Boolean.valueOf(qpaVar.h.b());
        }
    }
}
