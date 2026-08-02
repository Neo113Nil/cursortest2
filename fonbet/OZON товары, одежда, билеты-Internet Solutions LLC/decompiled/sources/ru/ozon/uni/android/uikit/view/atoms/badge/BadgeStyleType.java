package ru.ozon.uni.android.uikit.view.atoms.badge;

import Sc.InterfaceC3999a;
import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@InterfaceC3999a
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lru/ozon/uni/android/uikit/view/atoms/badge/BadgeStyleType;", "", "<init>", "(Ljava/lang/String;I)V", "STYLE_TYPE_BASE", "STYLE_TYPE_DEFAULT", "STYLE_TYPE_DISCOUNT_SMALL", "STYLE_TYPE_DISCOUNT", "STYLE_TYPE_SMALL", "STYLE_TYPE_XSMALL", "STYLE_TYPE_PREMIUM", "STYLE_TYPE_PREMIUM_SMALL", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BadgeStyleType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ BadgeStyleType[] $VALUES;
    public static final BadgeStyleType STYLE_TYPE_BASE = new BadgeStyleType("STYLE_TYPE_BASE", 0);
    public static final BadgeStyleType STYLE_TYPE_DEFAULT = new BadgeStyleType("STYLE_TYPE_DEFAULT", 1);
    public static final BadgeStyleType STYLE_TYPE_DISCOUNT_SMALL = new BadgeStyleType("STYLE_TYPE_DISCOUNT_SMALL", 2);
    public static final BadgeStyleType STYLE_TYPE_DISCOUNT = new BadgeStyleType("STYLE_TYPE_DISCOUNT", 3);
    public static final BadgeStyleType STYLE_TYPE_SMALL = new BadgeStyleType("STYLE_TYPE_SMALL", 4);
    public static final BadgeStyleType STYLE_TYPE_XSMALL = new BadgeStyleType("STYLE_TYPE_XSMALL", 5);
    public static final BadgeStyleType STYLE_TYPE_PREMIUM = new BadgeStyleType("STYLE_TYPE_PREMIUM", 6);
    public static final BadgeStyleType STYLE_TYPE_PREMIUM_SMALL = new BadgeStyleType("STYLE_TYPE_PREMIUM_SMALL", 7);

    private static final /* synthetic */ BadgeStyleType[] $values() {
        return new BadgeStyleType[]{STYLE_TYPE_BASE, STYLE_TYPE_DEFAULT, STYLE_TYPE_DISCOUNT_SMALL, STYLE_TYPE_DISCOUNT, STYLE_TYPE_SMALL, STYLE_TYPE_XSMALL, STYLE_TYPE_PREMIUM, STYLE_TYPE_PREMIUM_SMALL};
    }

    static {
        BadgeStyleType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private BadgeStyleType(String str, int i11) {
    }

    public static BadgeStyleType valueOf(String str) {
        return (BadgeStyleType) Enum.valueOf(BadgeStyleType.class, str);
    }

    public static BadgeStyleType[] values() {
        return (BadgeStyleType[]) $VALUES.clone();
    }
}
