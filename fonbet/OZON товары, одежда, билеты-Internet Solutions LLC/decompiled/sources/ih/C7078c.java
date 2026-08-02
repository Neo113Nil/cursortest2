package ih;

import Ch.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: ih.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C7078c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final e f66472a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C7076a f66473b;

    public C7078c(@NotNull e titleSubtitleWrapperPreset, @NotNull C7076a buttonAddonPreset) {
        Intrinsics.checkNotNullParameter(titleSubtitleWrapperPreset, "titleSubtitleWrapperPreset");
        Intrinsics.checkNotNullParameter(buttonAddonPreset, "buttonAddonPreset");
        this.f66472a = titleSubtitleWrapperPreset;
        this.f66473b = buttonAddonPreset;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7078c)) {
            return false;
        }
        C7078c c7078c = (C7078c) obj;
        return Intrinsics.d(this.f66472a, c7078c.f66472a) && Intrinsics.d(this.f66473b, c7078c.f66473b);
    }

    public final int hashCode() {
        return this.f66473b.hashCode() + (this.f66472a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "ButtonTitleSubtitleWrapperPreset(titleSubtitleWrapperPreset=" + this.f66472a + ", buttonAddonPreset=" + this.f66473b + ")";
    }
}
