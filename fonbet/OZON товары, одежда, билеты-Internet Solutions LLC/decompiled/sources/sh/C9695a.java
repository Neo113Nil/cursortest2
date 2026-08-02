package sh;

import Ah.C2430a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: sh.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9695a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final mh.a f98769a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2430a f98770b;

    public C9695a(@NotNull mh.a disclosureAddonWrapperPreset, @NotNull C2430a indicatorIconTitleSubtitleWrapperPreset) {
        Intrinsics.checkNotNullParameter(disclosureAddonWrapperPreset, "disclosureAddonWrapperPreset");
        Intrinsics.checkNotNullParameter(indicatorIconTitleSubtitleWrapperPreset, "indicatorIconTitleSubtitleWrapperPreset");
        this.f98769a = disclosureAddonWrapperPreset;
        this.f98770b = indicatorIconTitleSubtitleWrapperPreset;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9695a)) {
            return false;
        }
        C9695a c9695a = (C9695a) obj;
        return Intrinsics.d(this.f98769a, c9695a.f98769a) && Intrinsics.d(this.f98770b, c9695a.f98770b);
    }

    public final int hashCode() {
        return this.f98770b.hashCode() + (this.f98769a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "DisclosureIndicatorIconTitleSubtitleWrapperPreset(disclosureAddonWrapperPreset=" + this.f98769a + ", indicatorIconTitleSubtitleWrapperPreset=" + this.f98770b + ")";
    }
}
