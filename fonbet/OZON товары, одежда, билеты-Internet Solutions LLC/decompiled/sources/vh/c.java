package vh;

import Ch.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final e f102910a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final a f102911b;

    public c(@NotNull e titleSubtitleWrapperPreset, @NotNull a iconAddonWrapperPreset) {
        Intrinsics.checkNotNullParameter(titleSubtitleWrapperPreset, "titleSubtitleWrapperPreset");
        Intrinsics.checkNotNullParameter(iconAddonWrapperPreset, "iconAddonWrapperPreset");
        this.f102910a = titleSubtitleWrapperPreset;
        this.f102911b = iconAddonWrapperPreset;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f102910a, cVar.f102910a) && Intrinsics.d(this.f102911b, cVar.f102911b);
    }

    public final int hashCode() {
        return this.f102911b.hashCode() + (this.f102910a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "IconTitleSubtitleWrapperPreset(titleSubtitleWrapperPreset=" + this.f102910a + ", iconAddonWrapperPreset=" + this.f102911b + ")";
    }
}
