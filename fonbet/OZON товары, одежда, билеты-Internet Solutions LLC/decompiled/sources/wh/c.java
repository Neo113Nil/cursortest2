package wh;

import Ch.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final e f104563a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C10560a f104564b;

    public c(@NotNull e titleSubtitleWrapperPreset, @NotNull C10560a imageAddonPreset) {
        Intrinsics.checkNotNullParameter(titleSubtitleWrapperPreset, "titleSubtitleWrapperPreset");
        Intrinsics.checkNotNullParameter(imageAddonPreset, "imageAddonPreset");
        this.f104563a = titleSubtitleWrapperPreset;
        this.f104564b = imageAddonPreset;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f104563a, cVar.f104563a) && Intrinsics.d(this.f104564b, cVar.f104564b);
    }

    public final int hashCode() {
        return this.f104564b.hashCode() + (this.f104563a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "ImageTitleSubtitleWrapperPreset(titleSubtitleWrapperPreset=" + this.f104563a + ", imageAddonPreset=" + this.f104564b + ")";
    }
}
