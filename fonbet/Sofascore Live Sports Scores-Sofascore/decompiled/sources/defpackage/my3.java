package defpackage;

import android.os.CancellationSignal;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class my3 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CancellationSignal b;

    public /* synthetic */ my3(CancellationSignal cancellationSignal, int i) {
        this.a = i;
        this.b = cancellationSignal;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        CancellationSignal cancellationSignal = this.b;
        switch (i) {
            case 0:
                cancellationSignal.cancel();
                break;
            default:
                cancellationSignal.cancel();
                break;
        }
        return Unit.a;
    }
}
