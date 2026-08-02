package kh;

import Ch.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final e f71595a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final a f71596b;

    public c(@NotNull e titleSubtitleWrapperPreset, @NotNull a buttonAddonPreset) {
        Intrinsics.checkNotNullParameter(titleSubtitleWrapperPreset, "titleSubtitleWrapperPreset");
        Intrinsics.checkNotNullParameter(buttonAddonPreset, "buttonAddonPreset");
        this.f71595a = titleSubtitleWrapperPreset;
        this.f71596b = buttonAddonPreset;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f71595a, cVar.f71595a) && Intrinsics.d(this.f71596b, cVar.f71596b);
    }

    public final int hashCode() {
        return this.f71596b.hashCode() + (this.f71595a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "IconButtonTitleSubtitleWrapperPreset(titleSubtitleWrapperPreset=" + this.f71595a + ", buttonAddonPreset=" + this.f71596b + ")";
    }
}
