package th;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: th.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9874a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Bh.a f99522a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final mh.a f99523b;

    public C9874a(@NotNull Bh.a indicatorTitleSubtitleWrapperPreset, @NotNull mh.a disclosureAddonWrapperPreset) {
        Intrinsics.checkNotNullParameter(indicatorTitleSubtitleWrapperPreset, "indicatorTitleSubtitleWrapperPreset");
        Intrinsics.checkNotNullParameter(disclosureAddonWrapperPreset, "disclosureAddonWrapperPreset");
        this.f99522a = indicatorTitleSubtitleWrapperPreset;
        this.f99523b = disclosureAddonWrapperPreset;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9874a)) {
            return false;
        }
        C9874a c9874a = (C9874a) obj;
        return Intrinsics.d(this.f99522a, c9874a.f99522a) && Intrinsics.d(this.f99523b, c9874a.f99523b);
    }

    public final int hashCode() {
        return this.f99523b.hashCode() + (this.f99522a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "DisclosureIndicatorTitleSubtitleWrapperPreset(indicatorTitleSubtitleWrapperPreset=" + this.f99522a + ", disclosureAddonWrapperPreset=" + this.f99523b + ")";
    }
}
