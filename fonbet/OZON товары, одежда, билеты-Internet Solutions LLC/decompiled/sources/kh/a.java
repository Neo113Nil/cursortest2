package kh;

import Pj.C3828f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.controls.button.IconButtonDTO;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3828f f71592a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final IconButtonDTO.Preset f71593b;

    public a(@NotNull C3828f mainAddonSettings, @NotNull IconButtonDTO.Preset buttonSize) {
        Intrinsics.checkNotNullParameter(mainAddonSettings, "mainAddonSettings");
        Intrinsics.checkNotNullParameter(buttonSize, "buttonSize");
        this.f71592a = mainAddonSettings;
        this.f71593b = buttonSize;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f71592a, aVar.f71592a) && this.f71593b == aVar.f71593b;
    }

    public final int hashCode() {
        return this.f71593b.hashCode() + (this.f71592a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "ButtonAddonWrapperPreset(mainAddonSettings=" + this.f71592a + ", buttonSize=" + this.f71593b + ")";
    }
}
