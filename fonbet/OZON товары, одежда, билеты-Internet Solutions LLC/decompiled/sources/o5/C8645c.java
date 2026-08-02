package o5;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf.AbstractC9689o;
import sf.D;
import sf.K;

/* renamed from: o5.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C8645c extends AbstractC9689o {
    @Override // sf.AbstractC9689o, sf.AbstractC9688n
    @NotNull
    public final K j(@NotNull D d11) {
        D dir = d11.e();
        if (dir != null) {
            Intrinsics.checkNotNullParameter(dir, "dir");
            a(dir);
        }
        return super.j(d11);
    }
}
