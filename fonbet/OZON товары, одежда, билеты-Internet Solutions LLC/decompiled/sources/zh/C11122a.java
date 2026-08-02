package zh;

import fh.C6564a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xh.C10774a;

/* renamed from: zh.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C11122a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C10774a f109058a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C6564a f109059b;

    public C11122a(@NotNull C10774a indicatorAddonWrapperPreset, @NotNull C6564a badgeTitleSubtitleWrapperPreset) {
        Intrinsics.checkNotNullParameter(indicatorAddonWrapperPreset, "indicatorAddonWrapperPreset");
        Intrinsics.checkNotNullParameter(badgeTitleSubtitleWrapperPreset, "badgeTitleSubtitleWrapperPreset");
        this.f109058a = indicatorAddonWrapperPreset;
        this.f109059b = badgeTitleSubtitleWrapperPreset;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11122a)) {
            return false;
        }
        C11122a c11122a = (C11122a) obj;
        return Intrinsics.d(this.f109058a, c11122a.f109058a) && Intrinsics.d(this.f109059b, c11122a.f109059b);
    }

    public final int hashCode() {
        return this.f109059b.hashCode() + (this.f109058a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "IndicatorBadgeTitleSubtitleWrapperPreset(indicatorAddonWrapperPreset=" + this.f109058a + ", badgeTitleSubtitleWrapperPreset=" + this.f109059b + ")";
    }
}
