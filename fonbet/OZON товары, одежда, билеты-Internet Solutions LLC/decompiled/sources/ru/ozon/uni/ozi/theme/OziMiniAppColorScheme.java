package ru.ozon.uni.ozi.theme;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/uni/ozi/theme/OziMiniAppColorScheme;", "", "<init>", "(Ljava/lang/String;I)V", "Default", "Fresh", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziMiniAppColorScheme {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ OziMiniAppColorScheme[] $VALUES;
    public static final OziMiniAppColorScheme Default = new OziMiniAppColorScheme("Default", 0);
    public static final OziMiniAppColorScheme Fresh = new OziMiniAppColorScheme("Fresh", 1);

    private static final /* synthetic */ OziMiniAppColorScheme[] $values() {
        return new OziMiniAppColorScheme[]{Default, Fresh};
    }

    static {
        OziMiniAppColorScheme[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private OziMiniAppColorScheme(String str, int i11) {
    }

    public static OziMiniAppColorScheme valueOf(String str) {
        return (OziMiniAppColorScheme) Enum.valueOf(OziMiniAppColorScheme.class, str);
    }

    public static OziMiniAppColorScheme[] values() {
        return (OziMiniAppColorScheme[]) $VALUES.clone();
    }
}
