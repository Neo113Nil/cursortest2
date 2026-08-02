package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public class eda extends mie {
    @Override // defpackage.mie
    public final void a(Throwable th, Throwable th2) {
        th.getClass();
        th2.getClass();
        Integer num = dda.b;
        if (num == null || num.intValue() >= 19) {
            th.addSuppressed(th2);
        } else {
            super.a(th, th2);
        }
    }

    @Override // defpackage.mie
    public final List b(Throwable th) {
        th.getClass();
        Integer num = dda.b;
        if (num != null && num.intValue() < 19) {
            return super.b(th);
        }
        Throwable[] suppressed = th.getSuppressed();
        suppressed.getClass();
        List asList = Arrays.asList(suppressed);
        asList.getClass();
        return asList;
    }
}
