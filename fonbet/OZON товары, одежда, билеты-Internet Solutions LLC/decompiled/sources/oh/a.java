package oh;

import fh.C6564a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final mh.a f78333a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C6564a f78334b;

    public a(@NotNull mh.a disclosureAddonWrapperPreset, @NotNull C6564a badgeTitleSubtitleWrapperPreset) {
        Intrinsics.checkNotNullParameter(disclosureAddonWrapperPreset, "disclosureAddonWrapperPreset");
        Intrinsics.checkNotNullParameter(badgeTitleSubtitleWrapperPreset, "badgeTitleSubtitleWrapperPreset");
        this.f78333a = disclosureAddonWrapperPreset;
        this.f78334b = badgeTitleSubtitleWrapperPreset;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f78333a, aVar.f78333a) && Intrinsics.d(this.f78334b, aVar.f78334b);
    }

    public final int hashCode() {
        return this.f78334b.hashCode() + (this.f78333a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "DisclosureBadgeTitleSubtitleWrapperPreset(disclosureAddonWrapperPreset=" + this.f78333a + ", badgeTitleSubtitleWrapperPreset=" + this.f78334b + ")";
    }
}
