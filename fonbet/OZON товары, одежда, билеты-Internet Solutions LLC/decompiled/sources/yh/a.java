package yh;

import eh.C6365a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xh.C10774a;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C10774a f106638a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C6365a f106639b;

    public a(@NotNull C10774a indicatorAddonWrapperPreset, @NotNull C6365a badgeIconTitleSubtitleWrapperPreset) {
        Intrinsics.checkNotNullParameter(indicatorAddonWrapperPreset, "indicatorAddonWrapperPreset");
        Intrinsics.checkNotNullParameter(badgeIconTitleSubtitleWrapperPreset, "badgeIconTitleSubtitleWrapperPreset");
        this.f106638a = indicatorAddonWrapperPreset;
        this.f106639b = badgeIconTitleSubtitleWrapperPreset;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f106638a, aVar.f106638a) && Intrinsics.d(this.f106639b, aVar.f106639b);
    }

    public final int hashCode() {
        return this.f106639b.hashCode() + (this.f106638a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "IndicatorBadgeIconTitleSubtitleWrapperPreset(indicatorAddonWrapperPreset=" + this.f106638a + ", badgeIconTitleSubtitleWrapperPreset=" + this.f106639b + ")";
    }
}
