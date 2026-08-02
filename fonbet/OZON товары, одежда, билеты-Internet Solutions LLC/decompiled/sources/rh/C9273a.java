package rh;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zh.C11122a;

/* renamed from: rh.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9273a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final mh.a f83505a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C11122a f83506b;

    public C9273a(@NotNull mh.a disclosureAddonWrapperPreset, @NotNull C11122a indicatorBadgeTitleSubtitleWrapperPreset) {
        Intrinsics.checkNotNullParameter(disclosureAddonWrapperPreset, "disclosureAddonWrapperPreset");
        Intrinsics.checkNotNullParameter(indicatorBadgeTitleSubtitleWrapperPreset, "indicatorBadgeTitleSubtitleWrapperPreset");
        this.f83505a = disclosureAddonWrapperPreset;
        this.f83506b = indicatorBadgeTitleSubtitleWrapperPreset;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9273a)) {
            return false;
        }
        C9273a c9273a = (C9273a) obj;
        return Intrinsics.d(this.f83505a, c9273a.f83505a) && Intrinsics.d(this.f83506b, c9273a.f83506b);
    }

    public final int hashCode() {
        return this.f83506b.hashCode() + (this.f83505a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "DisclosureIndicatorBadgeTitleSubtitleWrapperPreset(disclosureAddonWrapperPreset=" + this.f83505a + ", indicatorBadgeTitleSubtitleWrapperPreset=" + this.f83506b + ")";
    }
}
