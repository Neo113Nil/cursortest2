package ye0;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import we0.v;

/* loaded from: classes3.dex */
public final class b {
    public static final void a(@NotNull InterfaceC10889a interfaceC10889a) {
        Intrinsics.checkNotNullParameter(interfaceC10889a, "<this>");
        Iterator it = interfaceC10889a.a().iterator();
        while (it.hasNext()) {
            interfaceC10889a.b(((v) it.next()).c());
        }
    }
}
