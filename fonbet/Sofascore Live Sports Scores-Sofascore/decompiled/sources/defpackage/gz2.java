package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class gz2 {
    public final Throwable a;

    public gz2(Throwable th) {
        this.a = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Throwable a(Function1 function1) {
        Throwable th = this.a;
        if (th == 0) {
            return null;
        }
        return th instanceof ct3 ? ((ct3) th).d() : th instanceof CancellationException ? ml4.e(((CancellationException) th).getMessage(), th) : (Throwable) function1.invoke(th);
    }
}
