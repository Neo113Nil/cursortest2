package qh;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final mh.a f82088a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final yh.a f82089b;

    public a(@NotNull mh.a disclosureAddonWrapperPreset, @NotNull yh.a indicatorBadgeIconTitleSubtitleWrapperPreset) {
        Intrinsics.checkNotNullParameter(disclosureAddonWrapperPreset, "disclosureAddonWrapperPreset");
        Intrinsics.checkNotNullParameter(indicatorBadgeIconTitleSubtitleWrapperPreset, "indicatorBadgeIconTitleSubtitleWrapperPreset");
        this.f82088a = disclosureAddonWrapperPreset;
        this.f82089b = indicatorBadgeIconTitleSubtitleWrapperPreset;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f82088a, aVar.f82088a) && Intrinsics.d(this.f82089b, aVar.f82089b);
    }

    public final int hashCode() {
        return this.f82089b.hashCode() + (this.f82088a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "DisclosureIndicatorBadgeIconTitleSubtitleWrapperPreset(disclosureAddonWrapperPreset=" + this.f82088a + ", indicatorBadgeIconTitleSubtitleWrapperPreset=" + this.f82089b + ")";
    }
}
