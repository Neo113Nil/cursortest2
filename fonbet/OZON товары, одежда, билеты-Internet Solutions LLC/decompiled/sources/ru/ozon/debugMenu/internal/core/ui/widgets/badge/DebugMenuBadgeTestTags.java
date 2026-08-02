package ru.ozon.debugMenu.internal.core.ui.widgets.badge;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/debugMenu/internal/core/ui/widgets/badge/DebugMenuBadgeTestTags;", "", "", "<init>", "(Ljava/lang/String;I)V", "Container", "Label", "Chevron", "ozon-debug-menu_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DebugMenuBadgeTestTags {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ DebugMenuBadgeTestTags[] $VALUES;
    public static final DebugMenuBadgeTestTags Container = new DebugMenuBadgeTestTags("Container", 0);
    public static final DebugMenuBadgeTestTags Label = new DebugMenuBadgeTestTags("Label", 1);
    public static final DebugMenuBadgeTestTags Chevron = new DebugMenuBadgeTestTags("Chevron", 2);

    private static final /* synthetic */ DebugMenuBadgeTestTags[] $values() {
        return new DebugMenuBadgeTestTags[]{Container, Label, Chevron};
    }

    static {
        DebugMenuBadgeTestTags[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private DebugMenuBadgeTestTags(String str, int i11) {
    }

    public static DebugMenuBadgeTestTags valueOf(String str) {
        return (DebugMenuBadgeTestTags) Enum.valueOf(DebugMenuBadgeTestTags.class, str);
    }

    public static DebugMenuBadgeTestTags[] values() {
        return (DebugMenuBadgeTestTags[]) $VALUES.clone();
    }
}
