package ah;

import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ah.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2026s {
    public static final Charset a(InterfaceC2025q interfaceC2025q) {
        Intrinsics.checkNotNullParameter(interfaceC2025q, "<this>");
        C2011c c10 = c(interfaceC2025q);
        if (c10 != null) {
            return AbstractC2012d.a(c10);
        }
        return null;
    }

    public static final Long b(InterfaceC2025q interfaceC2025q) {
        Intrinsics.checkNotNullParameter(interfaceC2025q, "<this>");
        String str = interfaceC2025q.a().get(C2023o.f16113a.g());
        if (str != null) {
            return Long.valueOf(Long.parseLong(str));
        }
        return null;
    }

    public static final C2011c c(InterfaceC2025q interfaceC2025q) {
        Intrinsics.checkNotNullParameter(interfaceC2025q, "<this>");
        String str = interfaceC2025q.a().get(C2023o.f16113a.h());
        if (str != null) {
            return C2011c.f16012f.b(str);
        }
        return null;
    }

    public static final C2011c d(r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        String j10 = rVar.a().j(C2023o.f16113a.h());
        if (j10 != null) {
            return C2011c.f16012f.b(j10);
        }
        return null;
    }
}
