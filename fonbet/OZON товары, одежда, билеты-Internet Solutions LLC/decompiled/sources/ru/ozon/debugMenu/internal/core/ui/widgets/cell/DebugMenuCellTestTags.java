package ru.ozon.debugMenu.internal.core.ui.widgets.cell;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/ozon/debugMenu/internal/core/ui/widgets/cell/DebugMenuCellTestTags;", "", "", "<init>", "(Ljava/lang/String;I)V", "Container", "Separator", "Title", "Subtitle", "ozon-debug-menu_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DebugMenuCellTestTags {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ DebugMenuCellTestTags[] $VALUES;
    public static final DebugMenuCellTestTags Container = new DebugMenuCellTestTags("Container", 0);
    public static final DebugMenuCellTestTags Separator = new DebugMenuCellTestTags("Separator", 1);
    public static final DebugMenuCellTestTags Title = new DebugMenuCellTestTags("Title", 2);
    public static final DebugMenuCellTestTags Subtitle = new DebugMenuCellTestTags("Subtitle", 3);

    private static final /* synthetic */ DebugMenuCellTestTags[] $values() {
        return new DebugMenuCellTestTags[]{Container, Separator, Title, Subtitle};
    }

    static {
        DebugMenuCellTestTags[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private DebugMenuCellTestTags(String str, int i11) {
    }

    public static DebugMenuCellTestTags valueOf(String str) {
        return (DebugMenuCellTestTags) Enum.valueOf(DebugMenuCellTestTags.class, str);
    }

    public static DebugMenuCellTestTags[] values() {
        return (DebugMenuCellTestTags[]) $VALUES.clone();
    }
}
