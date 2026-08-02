package ru.ozon.uni.ozi.components.notificationBar.presets;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/uni/ozi/components/notificationBar/presets/OziNotificationBarVisibility;", "", "<init>", "(Ljava/lang/String;I)V", "Hidden", "Shown", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziNotificationBarVisibility {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ OziNotificationBarVisibility[] $VALUES;
    public static final OziNotificationBarVisibility Hidden = new OziNotificationBarVisibility("Hidden", 0);
    public static final OziNotificationBarVisibility Shown = new OziNotificationBarVisibility("Shown", 1);

    private static final /* synthetic */ OziNotificationBarVisibility[] $values() {
        return new OziNotificationBarVisibility[]{Hidden, Shown};
    }

    static {
        OziNotificationBarVisibility[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private OziNotificationBarVisibility(String str, int i11) {
    }

    public static OziNotificationBarVisibility valueOf(String str) {
        return (OziNotificationBarVisibility) Enum.valueOf(OziNotificationBarVisibility.class, str);
    }

    public static OziNotificationBarVisibility[] values() {
        return (OziNotificationBarVisibility[]) $VALUES.clone();
    }
}
