package lh;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C7959a f73314a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Ch.e f73315b;

    public d(@NotNull C7959a dataAddonWrapperPreset, @NotNull Ch.e titleSubtitleWrapperPreset) {
        Intrinsics.checkNotNullParameter(dataAddonWrapperPreset, "dataAddonWrapperPreset");
        Intrinsics.checkNotNullParameter(titleSubtitleWrapperPreset, "titleSubtitleWrapperPreset");
        this.f73314a = dataAddonWrapperPreset;
        this.f73315b = titleSubtitleWrapperPreset;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f73314a, dVar.f73314a) && Intrinsics.d(this.f73315b, dVar.f73315b);
    }

    public final int hashCode() {
        return this.f73315b.hashCode() + (this.f73314a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "DataTitleSubtitleWrapperPreset(dataAddonWrapperPreset=" + this.f73314a + ", titleSubtitleWrapperPreset=" + this.f73315b + ")";
    }
}
