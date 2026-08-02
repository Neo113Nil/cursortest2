package jh;

import Pj.C3828f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.controls.button.IconButtonDTO;

/* renamed from: jh.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C7425a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3828f f70108a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final IconButtonDTO.Preset f70109b;

    public C7425a(@NotNull C3828f mainAddonSettings, @NotNull IconButtonDTO.Preset buttonSize) {
        Intrinsics.checkNotNullParameter(mainAddonSettings, "mainAddonSettings");
        Intrinsics.checkNotNullParameter(buttonSize, "buttonSize");
        this.f70108a = mainAddonSettings;
        this.f70109b = buttonSize;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7425a)) {
            return false;
        }
        C7425a c7425a = (C7425a) obj;
        return Intrinsics.d(this.f70108a, c7425a.f70108a) && this.f70109b == c7425a.f70109b;
    }

    public final int hashCode() {
        return this.f70109b.hashCode() + (this.f70108a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "ButtonAddonWrapperPreset(mainAddonSettings=" + this.f70108a + ", buttonSize=" + this.f70109b + ")";
    }
}
