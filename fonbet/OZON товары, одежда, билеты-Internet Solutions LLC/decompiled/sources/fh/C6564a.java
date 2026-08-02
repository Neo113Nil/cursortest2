package fh;

import Ch.e;
import gh.C6733a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: fh.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C6564a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C6733a f63425a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final e f63426b;

    public C6564a(@NotNull C6733a badgeAddonWrapperPreset, @NotNull e titleSubtitleWrapperPreset) {
        Intrinsics.checkNotNullParameter(badgeAddonWrapperPreset, "badgeAddonWrapperPreset");
        Intrinsics.checkNotNullParameter(titleSubtitleWrapperPreset, "titleSubtitleWrapperPreset");
        this.f63425a = badgeAddonWrapperPreset;
        this.f63426b = titleSubtitleWrapperPreset;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6564a)) {
            return false;
        }
        C6564a c6564a = (C6564a) obj;
        return Intrinsics.d(this.f63425a, c6564a.f63425a) && Intrinsics.d(this.f63426b, c6564a.f63426b);
    }

    public final int hashCode() {
        return this.f63426b.hashCode() + (this.f63425a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "BadgeTitleSubtitleWrapperPreset(badgeAddonWrapperPreset=" + this.f63425a + ", titleSubtitleWrapperPreset=" + this.f63426b + ")";
    }
}
