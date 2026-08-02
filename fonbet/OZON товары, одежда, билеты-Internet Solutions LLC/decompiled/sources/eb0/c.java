package eb0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private e f62097a;

    public c() {
        Intrinsics.checkNotNullParameter("Требуется перезапуск приложения", "text");
        Intrinsics.checkNotNullParameter("HostConfig.ReloadApp.Badge", "locator");
        this.f62097a = new b();
    }

    @NotNull
    public final e a() {
        return this.f62097a;
    }

    public final void b(@NotNull Za0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f62097a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        ((c) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return 157077371;
    }

    @NotNull
    public final String toString() {
        return "HostConfigBadgeVO(text=Требуется перезапуск приложения, locator=HostConfig.ReloadApp.Badge)";
    }
}
