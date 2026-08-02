package androidx.lifecycle;

import androidx.lifecycle.AbstractC2185j;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.lifecycle.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2196v {
    public static final void a(InterfaceC2193s interfaceC2193s, AbstractC2185j.b current, AbstractC2185j.b next) {
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(next, "next");
        if (current == AbstractC2185j.b.f20391b && next == AbstractC2185j.b.f20390a) {
            throw new IllegalStateException(("State must be at least '" + AbstractC2185j.b.f20392c + "' to be moved to '" + next + "' in component " + interfaceC2193s).toString());
        }
        AbstractC2185j.b bVar = AbstractC2185j.b.f20390a;
        if (current != bVar || current == next) {
            return;
        }
        throw new IllegalStateException(("State is '" + bVar + "' and cannot be moved to `" + next + "` in component " + interfaceC2193s).toString());
    }
}
