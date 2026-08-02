package ru.ozon.uni.ozi.theme;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/uni/ozi/theme/OziColorTheme;", "", "<init>", "(Ljava/lang/String;I)V", "Light", "Dark", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziColorTheme {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ OziColorTheme[] $VALUES;
    public static final OziColorTheme Light = new OziColorTheme("Light", 0);
    public static final OziColorTheme Dark = new OziColorTheme("Dark", 1);

    private static final /* synthetic */ OziColorTheme[] $values() {
        return new OziColorTheme[]{Light, Dark};
    }

    static {
        OziColorTheme[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private OziColorTheme(String str, int i11) {
    }

    public static OziColorTheme valueOf(String str) {
        return (OziColorTheme) Enum.valueOf(OziColorTheme.class, str);
    }

    public static OziColorTheme[] values() {
        return (OziColorTheme[]) $VALUES.clone();
    }
}
