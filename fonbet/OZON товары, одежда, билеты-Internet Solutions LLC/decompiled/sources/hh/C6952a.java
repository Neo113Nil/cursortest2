package hh;

import Pj.C3828f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.controls.button.ButtonDTO;

/* renamed from: hh.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C6952a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3828f f65493a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ButtonDTO.Preset f65494b;

    public C6952a(@NotNull C3828f mainAddonSettings, @NotNull ButtonDTO.Preset buttonSize) {
        Intrinsics.checkNotNullParameter(mainAddonSettings, "mainAddonSettings");
        Intrinsics.checkNotNullParameter(buttonSize, "buttonSize");
        this.f65493a = mainAddonSettings;
        this.f65494b = buttonSize;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6952a)) {
            return false;
        }
        C6952a c6952a = (C6952a) obj;
        return Intrinsics.d(this.f65493a, c6952a.f65493a) && this.f65494b == c6952a.f65494b;
    }

    public final int hashCode() {
        return this.f65494b.hashCode() + (this.f65493a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "ButtonAddonWrapperPreset(mainAddonSettings=" + this.f65493a + ", buttonSize=" + this.f65494b + ")";
    }
}
