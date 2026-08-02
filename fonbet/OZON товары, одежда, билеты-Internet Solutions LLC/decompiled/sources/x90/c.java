package x90;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.button.large.FinLargeButtonState;
import ru.ozon.fintech.ui.toolbar.FinToolbarState;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final FinToolbarState f105167a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final FinLargeButtonState f105168b;

    public c(@NotNull FinToolbarState toolbarState, @NotNull FinLargeButtonState buttonState) {
        Intrinsics.checkNotNullParameter(toolbarState, "toolbarState");
        Intrinsics.checkNotNullParameter(buttonState, "buttonState");
        this.f105167a = toolbarState;
        this.f105168b = buttonState;
    }

    @NotNull
    public final FinLargeButtonState a() {
        return this.f105168b;
    }

    @NotNull
    public final FinToolbarState b() {
        return this.f105167a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f105167a, cVar.f105167a) && Intrinsics.d(this.f105168b, cVar.f105168b);
    }

    public final int hashCode() {
        return this.f105168b.hashCode() + (this.f105167a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "SettingsState(toolbarState=" + this.f105167a + ", buttonState=" + this.f105168b + ")";
    }
}
