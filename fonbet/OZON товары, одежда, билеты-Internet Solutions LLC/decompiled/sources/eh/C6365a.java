package eh;

import gh.C6733a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vh.c;

/* renamed from: eh.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C6365a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C6733a f62329a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final c f62330b;

    public C6365a(@NotNull C6733a badgeAddonWrapperPreset, @NotNull c iconTitleSubtitleWrapperPreset) {
        Intrinsics.checkNotNullParameter(badgeAddonWrapperPreset, "badgeAddonWrapperPreset");
        Intrinsics.checkNotNullParameter(iconTitleSubtitleWrapperPreset, "iconTitleSubtitleWrapperPreset");
        this.f62329a = badgeAddonWrapperPreset;
        this.f62330b = iconTitleSubtitleWrapperPreset;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6365a)) {
            return false;
        }
        C6365a c6365a = (C6365a) obj;
        return Intrinsics.d(this.f62329a, c6365a.f62329a) && Intrinsics.d(this.f62330b, c6365a.f62330b);
    }

    public final int hashCode() {
        return this.f62330b.hashCode() + (this.f62329a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "BadgeIconTitleSubtitleWrapperPreset(badgeAddonWrapperPreset=" + this.f62329a + ", iconTitleSubtitleWrapperPreset=" + this.f62330b + ")";
    }
}
