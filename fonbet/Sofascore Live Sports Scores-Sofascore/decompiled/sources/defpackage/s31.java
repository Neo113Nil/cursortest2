package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class s31 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ znh b;

    public /* synthetic */ s31(znh znhVar, int i) {
        this.a = i;
        this.b = znhVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        znh znhVar = this.b;
        switch (i) {
            case 0:
                znhVar.i(Integer.MAX_VALUE);
                return Unit.a;
            default:
                return Boolean.valueOf(znhVar.h() > 0);
        }
    }
}
