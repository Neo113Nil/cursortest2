package nh;

import eh.C6365a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: nh.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C8594a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final mh.a f77140a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C6365a f77141b;

    public C8594a(@NotNull mh.a disclosureAddonWrapperPreset, @NotNull C6365a badgeIconTitleSubtitleWrapperPreset) {
        Intrinsics.checkNotNullParameter(disclosureAddonWrapperPreset, "disclosureAddonWrapperPreset");
        Intrinsics.checkNotNullParameter(badgeIconTitleSubtitleWrapperPreset, "badgeIconTitleSubtitleWrapperPreset");
        this.f77140a = disclosureAddonWrapperPreset;
        this.f77141b = badgeIconTitleSubtitleWrapperPreset;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8594a)) {
            return false;
        }
        C8594a c8594a = (C8594a) obj;
        return Intrinsics.d(this.f77140a, c8594a.f77140a) && Intrinsics.d(this.f77141b, c8594a.f77141b);
    }

    public final int hashCode() {
        return this.f77141b.hashCode() + (this.f77140a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "DisclosureBadgeIconTitleSubtitleWrapperPreset(disclosureAddonWrapperPreset=" + this.f77140a + ", badgeIconTitleSubtitleWrapperPreset=" + this.f77141b + ")";
    }
}
