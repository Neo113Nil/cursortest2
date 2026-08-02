package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class zgf implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ghf b;

    public /* synthetic */ zgf(ghf ghfVar, int i) {
        this.a = i;
        this.b = ghfVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        ghf ghfVar = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(ghfVar.e.h() > 0.5f);
            case 1:
                return Float.valueOf(ghfVar.a() / ghfVar.g.h() < 1.0f ? 0.3f : 1.0f);
            default:
                return Float.valueOf(ghfVar.f.h() * 0.5f);
        }
    }
}
