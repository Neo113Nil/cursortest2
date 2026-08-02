package ih;

import Pj.C3828f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.controls.button.ButtonDTO;

/* renamed from: ih.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C7076a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3828f f66468a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ButtonDTO.Preset f66469b;

    public C7076a(@NotNull C3828f mainAddonSettings, @NotNull ButtonDTO.Preset buttonSize) {
        Intrinsics.checkNotNullParameter(mainAddonSettings, "mainAddonSettings");
        Intrinsics.checkNotNullParameter(buttonSize, "buttonSize");
        this.f66468a = mainAddonSettings;
        this.f66469b = buttonSize;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7076a)) {
            return false;
        }
        C7076a c7076a = (C7076a) obj;
        return Intrinsics.d(this.f66468a, c7076a.f66468a) && this.f66469b == c7076a.f66469b;
    }

    public final int hashCode() {
        return this.f66469b.hashCode() + (this.f66468a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "ButtonAddonWrapperPreset(mainAddonSettings=" + this.f66468a + ", buttonSize=" + this.f66469b + ")";
    }
}
