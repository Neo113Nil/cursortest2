package ru.ozon.debugMenu.internal.core.ui.widgets.button;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/debugMenu/internal/core/ui/widgets/button/DebugMenuButtonTestTags;", "", "", "<init>", "(Ljava/lang/String;I)V", "Container", "Title", "ozon-debug-menu_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DebugMenuButtonTestTags {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ DebugMenuButtonTestTags[] $VALUES;
    public static final DebugMenuButtonTestTags Container = new DebugMenuButtonTestTags("Container", 0);
    public static final DebugMenuButtonTestTags Title = new DebugMenuButtonTestTags("Title", 1);

    private static final /* synthetic */ DebugMenuButtonTestTags[] $values() {
        return new DebugMenuButtonTestTags[]{Container, Title};
    }

    static {
        DebugMenuButtonTestTags[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private DebugMenuButtonTestTags(String str, int i11) {
    }

    public static DebugMenuButtonTestTags valueOf(String str) {
        return (DebugMenuButtonTestTags) Enum.valueOf(DebugMenuButtonTestTags.class, str);
    }

    public static DebugMenuButtonTestTags[] values() {
        return (DebugMenuButtonTestTags[]) $VALUES.clone();
    }
}
