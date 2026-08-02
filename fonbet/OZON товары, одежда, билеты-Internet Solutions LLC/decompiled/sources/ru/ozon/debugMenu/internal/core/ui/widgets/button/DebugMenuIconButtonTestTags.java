package ru.ozon.debugMenu.internal.core.ui.widgets.button;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/debugMenu/internal/core/ui/widgets/button/DebugMenuIconButtonTestTags;", "", "", "<init>", "(Ljava/lang/String;I)V", "Container", "Icon", "ozon-debug-menu_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DebugMenuIconButtonTestTags {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ DebugMenuIconButtonTestTags[] $VALUES;
    public static final DebugMenuIconButtonTestTags Container = new DebugMenuIconButtonTestTags("Container", 0);
    public static final DebugMenuIconButtonTestTags Icon = new DebugMenuIconButtonTestTags("Icon", 1);

    private static final /* synthetic */ DebugMenuIconButtonTestTags[] $values() {
        return new DebugMenuIconButtonTestTags[]{Container, Icon};
    }

    static {
        DebugMenuIconButtonTestTags[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private DebugMenuIconButtonTestTags(String str, int i11) {
    }

    public static DebugMenuIconButtonTestTags valueOf(String str) {
        return (DebugMenuIconButtonTestTags) Enum.valueOf(DebugMenuIconButtonTestTags.class, str);
    }

    public static DebugMenuIconButtonTestTags[] values() {
        return (DebugMenuIconButtonTestTags[]) $VALUES.clone();
    }
}
