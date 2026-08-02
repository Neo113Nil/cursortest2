package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class fu5 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qug b;

    public /* synthetic */ fu5(qug qugVar, int i) {
        this.a = i;
        this.b = qugVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        qug qugVar = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(qugVar.a.h() > 0);
            case 1:
                return Boolean.valueOf(qugVar.a.h() == 0);
            case 2:
                if (qugVar.e.h() > 0 && !qugVar.d()) {
                    r1 = true;
                }
                return Boolean.valueOf(r1);
            case 3:
                if (qugVar.a.h() != qugVar.e.h() && qugVar.d()) {
                    r1 = true;
                }
                return Boolean.valueOf(r1);
            case 4:
                if (qugVar.a.h() != qugVar.e.h() && qugVar.d()) {
                    r1 = true;
                }
                return Boolean.valueOf(r1);
            case 5:
                if (qugVar.a.h() != qugVar.e.h() && qugVar.d()) {
                    r1 = true;
                }
                return Boolean.valueOf(r1);
            case 6:
                return Boolean.valueOf(qugVar.a.h() < qugVar.e.h());
            case 7:
                return Boolean.valueOf(qugVar.a.h() > 0);
            case 8:
                return Integer.valueOf(qugVar.a.h());
            case 9:
                return Boolean.valueOf(qugVar.a.h() < qugVar.e.h());
            default:
                return Boolean.valueOf(qugVar.a.h() > 0);
        }
    }
}
