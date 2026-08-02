package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class b33 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ aea b;

    public /* synthetic */ b33(aea aeaVar, int i) {
        this.a = i;
        this.b = aeaVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        aea aeaVar = this.b;
        switch (i) {
            case 0:
                if (aeaVar.isActive()) {
                    aeaVar.y(new f0(aeaVar));
                }
                break;
            default:
                Throwable th = (Throwable) obj;
                if (th != null) {
                    aeaVar.y(new CancellationException(th.getMessage()));
                }
                break;
        }
        return Unit.a;
    }
}
