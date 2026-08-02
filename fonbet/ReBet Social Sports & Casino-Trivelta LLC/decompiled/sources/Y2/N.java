package Y2;

import Q2.AbstractC1508t;
import kotlin.jvm.internal.Intrinsics;
import x0.InterfaceC6772a;

/* loaded from: classes.dex */
public abstract class N {
    public static final void a(InterfaceC6772a interfaceC6772a, Q2.N info, String tag) {
        Intrinsics.checkNotNullParameter(interfaceC6772a, "<this>");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(tag, "tag");
        try {
            interfaceC6772a.accept(info);
        } catch (Throwable th2) {
            AbstractC1508t.e().d(tag, "Exception handler threw an exception", th2);
        }
    }
}
