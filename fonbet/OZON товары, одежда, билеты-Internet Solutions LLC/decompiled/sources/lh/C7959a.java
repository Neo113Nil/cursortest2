package lh;

import Pj.C3828f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: lh.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C7959a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final c f73307a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C3828f f73308b;

    public C7959a(@NotNull c addonPreset, @NotNull C3828f mainAddonSettings) {
        Intrinsics.checkNotNullParameter(addonPreset, "addonPreset");
        Intrinsics.checkNotNullParameter(mainAddonSettings, "mainAddonSettings");
        this.f73307a = addonPreset;
        this.f73308b = mainAddonSettings;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7959a)) {
            return false;
        }
        C7959a c7959a = (C7959a) obj;
        return Intrinsics.d(this.f73307a, c7959a.f73307a) && Intrinsics.d(this.f73308b, c7959a.f73308b);
    }

    public final int hashCode() {
        return this.f73308b.hashCode() + (this.f73307a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "DataAddonWrapperPreset(addonPreset=" + this.f73307a + ", mainAddonSettings=" + this.f73308b + ")";
    }
}
