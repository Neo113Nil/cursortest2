package ru.ozon.uni.ozi.components.badge.presets;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/uni/ozi/components/badge/presets/OziBadgeSize;", "", "<init>", "(Ljava/lang/String;I)V", "Size300", "Size400", "Size500", "Size600", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziBadgeSize {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ OziBadgeSize[] $VALUES;
    public static final OziBadgeSize Size300 = new OziBadgeSize("Size300", 0);
    public static final OziBadgeSize Size400 = new OziBadgeSize("Size400", 1);
    public static final OziBadgeSize Size500 = new OziBadgeSize("Size500", 2);
    public static final OziBadgeSize Size600 = new OziBadgeSize("Size600", 3);

    private static final /* synthetic */ OziBadgeSize[] $values() {
        return new OziBadgeSize[]{Size300, Size400, Size500, Size600};
    }

    static {
        OziBadgeSize[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private OziBadgeSize(String str, int i11) {
    }

    public static OziBadgeSize valueOf(String str) {
        return (OziBadgeSize) Enum.valueOf(OziBadgeSize.class, str);
    }

    public static OziBadgeSize[] values() {
        return (OziBadgeSize[]) $VALUES.clone();
    }
}
