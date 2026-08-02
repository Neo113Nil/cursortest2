package ru.ozon.uni.android.cell.badge.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.atom.badge.BadgeView;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"withBadgeAddonWrapperPreset", "Lru/ozon/uni/android/atom/badge/BadgeView;", "preset", "Lru/ozon/uni/android/cell/badge/data/BadgeAddonWrapperPreset;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BadgeViewExtKt {
    @NotNull
    public static final BadgeView withBadgeAddonWrapperPreset(@NotNull BadgeView badgeView, @NotNull BadgeAddonWrapperPreset preset) {
        Intrinsics.checkNotNullParameter(badgeView, "<this>");
        Intrinsics.checkNotNullParameter(preset, "preset");
        badgeView.setSize(preset.getBadgeSize());
        return badgeView;
    }
}
