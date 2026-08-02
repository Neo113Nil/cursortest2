package mh;

import Pj.C3828f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final int f74880a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C3828f f74881b;

    public a(int i11, @NotNull C3828f mainAddonSettings) {
        Intrinsics.checkNotNullParameter(mainAddonSettings, "mainAddonSettings");
        this.f74880a = i11;
        this.f74881b = mainAddonSettings;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f74880a == aVar.f74880a && Intrinsics.d(this.f74881b, aVar.f74881b);
    }

    public final int hashCode() {
        return this.f74881b.hashCode() + (Integer.hashCode(this.f74880a) * 31);
    }

    @NotNull
    public final String toString() {
        return "DisclosureAddonWrapperPreset(imageSize=" + this.f74880a + ", mainAddonSettings=" + this.f74881b + ")";
    }
}
