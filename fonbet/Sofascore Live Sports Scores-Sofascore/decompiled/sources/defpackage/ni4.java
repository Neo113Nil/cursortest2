package defpackage;

import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class ni4 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ksa b;

    public /* synthetic */ ni4(ksa ksaVar, int i) {
        this.a = i;
        this.b = ksaVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        boolean z = true;
        ksa ksaVar = this.b;
        switch (i) {
            case 0:
                return Integer.valueOf(ksaVar.h());
            case 1:
                return new Pair(Integer.valueOf(ksaVar.h()), Integer.valueOf(ksaVar.i()));
            case 2:
                if (ksaVar.h() <= 0 && ksaVar.i() == 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 3:
                if (ksaVar.h() <= 0 && ksaVar.i() == 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 4:
                return new Pair(Integer.valueOf(ksaVar.j().n), ksaVar.j().k);
            case 5:
                if (ksaVar.h() <= 0 && ksaVar.i() == 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 6:
                if ((ksaVar.h() != 1 || ksaVar.i() == 0) && ksaVar.h() <= 1) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 7:
                return Boolean.valueOf(ksaVar.d());
            case 8:
                return Boolean.valueOf(ksaVar.c());
            case 9:
                return Integer.valueOf(ksaVar.j().n);
            case 10:
                if (ksaVar.h() <= 0 && ksaVar.i() == 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 11:
                if (ksaVar.h() <= 0 && ksaVar.i() == 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 12:
                return Boolean.valueOf(ksaVar.d());
            case 13:
                return Boolean.valueOf(ksaVar.c());
            case 14:
                return Integer.valueOf(ksaVar.h());
            default:
                return ksaVar.j();
        }
    }
}
