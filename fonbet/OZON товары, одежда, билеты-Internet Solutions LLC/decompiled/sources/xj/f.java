package xj;

import Dj.InterfaceC2875c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class f implements InterfaceC2875c {
    @Override // Dj.InterfaceC2875c
    @NotNull
    public final e f(@NotNull String team, @NotNull String group) {
        Intrinsics.checkNotNullParameter(team, "team");
        Intrinsics.checkNotNullParameter(group, "group");
        return new e(new sj.a(team, group, null));
    }

    @Override // Ld0.e
    public final void onInstantPluginsCreated() {
    }
}
