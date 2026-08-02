package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class dk1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boh b;
    public final /* synthetic */ e1d c;

    public /* synthetic */ dk1(boh bohVar, e1d e1dVar, int i) {
        this.a = i;
        this.b = bohVar;
        this.c = e1dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        e1d e1dVar = this.c;
        boh bohVar = this.b;
        switch (i) {
            case 0:
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - bohVar.h() >= 200) {
                    bohVar.i(currentTimeMillis);
                    e1dVar.setValue(Boolean.valueOf(!((Boolean) e1dVar.getValue()).booleanValue()));
                }
                break;
            case 1:
                long currentTimeMillis2 = System.currentTimeMillis();
                if (currentTimeMillis2 - bohVar.h() >= 200) {
                    bohVar.i(currentTimeMillis2);
                    e1dVar.setValue(Boolean.valueOf(!((Boolean) e1dVar.getValue()).booleanValue()));
                }
                break;
            case 2:
                long currentTimeMillis3 = System.currentTimeMillis();
                if (currentTimeMillis3 - bohVar.h() >= 200) {
                    bohVar.i(currentTimeMillis3);
                    e1dVar.setValue(Boolean.valueOf(!((Boolean) e1dVar.getValue()).booleanValue()));
                }
                break;
            case 3:
                long currentTimeMillis4 = System.currentTimeMillis();
                if (currentTimeMillis4 - bohVar.h() >= 200) {
                    bohVar.i(currentTimeMillis4);
                    e1dVar.setValue(Boolean.valueOf(!((Boolean) e1dVar.getValue()).booleanValue()));
                }
                break;
            case 4:
                long currentTimeMillis5 = System.currentTimeMillis();
                if (currentTimeMillis5 - bohVar.h() >= 200) {
                    bohVar.i(currentTimeMillis5);
                    e1dVar.setValue(Boolean.TRUE);
                }
                break;
            default:
                long currentTimeMillis6 = System.currentTimeMillis();
                if (currentTimeMillis6 - bohVar.h() >= 200) {
                    bohVar.i(currentTimeMillis6);
                    e1dVar.setValue(Boolean.valueOf(!((Boolean) e1dVar.getValue()).booleanValue()));
                }
                break;
        }
        return Unit.a;
    }
}
