package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class lu5 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mzg b;

    public /* synthetic */ lu5(mzg mzgVar, int i) {
        this.a = i;
        this.b = mzgVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        mzg mzgVar = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(mzgVar.c.d());
            default:
                return Boolean.valueOf(mzgVar.c.e.h() > 0);
        }
    }
}
