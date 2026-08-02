package hh;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: hh.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C6954c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final vh.c f65496a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C6952a f65497b;

    public C6954c(@NotNull vh.c iconTitleSubtitleWrapperPreset, @NotNull C6952a buttonAddonPreset) {
        Intrinsics.checkNotNullParameter(iconTitleSubtitleWrapperPreset, "iconTitleSubtitleWrapperPreset");
        Intrinsics.checkNotNullParameter(buttonAddonPreset, "buttonAddonPreset");
        this.f65496a = iconTitleSubtitleWrapperPreset;
        this.f65497b = buttonAddonPreset;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6954c)) {
            return false;
        }
        C6954c c6954c = (C6954c) obj;
        return Intrinsics.d(this.f65496a, c6954c.f65496a) && Intrinsics.d(this.f65497b, c6954c.f65497b);
    }

    public final int hashCode() {
        return this.f65497b.hashCode() + (this.f65496a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "ButtonIconTitleSubtitleWrapperPreset(iconTitleSubtitleWrapperPreset=" + this.f65496a + ", buttonAddonPreset=" + this.f65497b + ")";
    }
}
