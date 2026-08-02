package jh;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: jh.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C7427c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final vh.c f70111a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C7425a f70112b;

    public C7427c(@NotNull vh.c iconTitleSubtitleWrapperPreset, @NotNull C7425a buttonAddonPreset) {
        Intrinsics.checkNotNullParameter(iconTitleSubtitleWrapperPreset, "iconTitleSubtitleWrapperPreset");
        Intrinsics.checkNotNullParameter(buttonAddonPreset, "buttonAddonPreset");
        this.f70111a = iconTitleSubtitleWrapperPreset;
        this.f70112b = buttonAddonPreset;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7427c)) {
            return false;
        }
        C7427c c7427c = (C7427c) obj;
        return Intrinsics.d(this.f70111a, c7427c.f70111a) && Intrinsics.d(this.f70112b, c7427c.f70112b);
    }

    public final int hashCode() {
        return this.f70112b.hashCode() + (this.f70111a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "IconButtonIconTitleSubtitleWrapperPreset(iconTitleSubtitleWrapperPreset=" + this.f70111a + ", buttonAddonPreset=" + this.f70112b + ")";
    }
}
