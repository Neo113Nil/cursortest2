package ph;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vh.c;

/* renamed from: ph.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C8931a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final c f80525a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final mh.a f80526b;

    public C8931a(@NotNull c iconTitleSubtitleWrapperPreset, @NotNull mh.a disclosureAddonWrapperPreset) {
        Intrinsics.checkNotNullParameter(iconTitleSubtitleWrapperPreset, "iconTitleSubtitleWrapperPreset");
        Intrinsics.checkNotNullParameter(disclosureAddonWrapperPreset, "disclosureAddonWrapperPreset");
        this.f80525a = iconTitleSubtitleWrapperPreset;
        this.f80526b = disclosureAddonWrapperPreset;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8931a)) {
            return false;
        }
        C8931a c8931a = (C8931a) obj;
        return Intrinsics.d(this.f80525a, c8931a.f80525a) && Intrinsics.d(this.f80526b, c8931a.f80526b);
    }

    public final int hashCode() {
        return this.f80526b.hashCode() + (this.f80525a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "DisclosureIconTitleSubtitleWrapperPreset(iconTitleSubtitleWrapperPreset=" + this.f80525a + ", disclosureAddonWrapperPreset=" + this.f80526b + ")";
    }
}
