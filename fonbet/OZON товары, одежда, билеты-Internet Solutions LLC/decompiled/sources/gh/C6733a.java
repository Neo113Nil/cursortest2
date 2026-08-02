package gh;

import Pj.C3828f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.dsBadge.BadgeDTO;

/* renamed from: gh.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C6733a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final BadgeDTO.BadgeSize f64479a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C3828f f64480b;

    public C6733a(@NotNull BadgeDTO.BadgeSize badgeSize, @NotNull C3828f mainAddonSettings) {
        Intrinsics.checkNotNullParameter(badgeSize, "badgeSize");
        Intrinsics.checkNotNullParameter(mainAddonSettings, "mainAddonSettings");
        this.f64479a = badgeSize;
        this.f64480b = mainAddonSettings;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6733a)) {
            return false;
        }
        C6733a c6733a = (C6733a) obj;
        return this.f64479a == c6733a.f64479a && Intrinsics.d(this.f64480b, c6733a.f64480b);
    }

    public final int hashCode() {
        return this.f64480b.hashCode() + (this.f64479a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "BadgeAddonWrapperPreset(badgeSize=" + this.f64479a + ", mainAddonSettings=" + this.f64480b + ")";
    }
}
