package uh;

import Ch.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final mh.a f100780a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final e f100781b;

    public a(@NotNull mh.a disclosureAddonWrapperPreset, @NotNull e titleSubtitleWrapperPreset) {
        Intrinsics.checkNotNullParameter(disclosureAddonWrapperPreset, "disclosureAddonWrapperPreset");
        Intrinsics.checkNotNullParameter(titleSubtitleWrapperPreset, "titleSubtitleWrapperPreset");
        this.f100780a = disclosureAddonWrapperPreset;
        this.f100781b = titleSubtitleWrapperPreset;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f100780a, aVar.f100780a) && Intrinsics.d(this.f100781b, aVar.f100781b);
    }

    public final int hashCode() {
        return this.f100781b.hashCode() + (this.f100780a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "DisclosureTitleSubtitleWrapperPreset(disclosureAddonWrapperPreset=" + this.f100780a + ", titleSubtitleWrapperPreset=" + this.f100781b + ")";
    }
}
