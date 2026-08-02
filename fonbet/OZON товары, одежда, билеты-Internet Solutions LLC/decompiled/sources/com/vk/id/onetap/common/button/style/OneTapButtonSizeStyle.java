package com.vk.id.onetap.common.button.style;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/vk/id/onetap/common/button/style/OneTapButtonSizeStyle;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "SMALL_32", "SMALL_34", "SMALL_36", "SMALL_38", "MEDIUM_40", "MEDIUM_42", "MEDIUM_44", "MEDIUM_46", "LARGE_48", "LARGE_50", "LARGE_52", "LARGE_54", "LARGE_56", "onetap-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class OneTapButtonSizeStyle {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ OneTapButtonSizeStyle[] $VALUES;
    public static final OneTapButtonSizeStyle DEFAULT = new OneTapButtonSizeStyle("DEFAULT", 0);
    public static final OneTapButtonSizeStyle SMALL_32 = new OneTapButtonSizeStyle("SMALL_32", 1);
    public static final OneTapButtonSizeStyle SMALL_34 = new OneTapButtonSizeStyle("SMALL_34", 2);
    public static final OneTapButtonSizeStyle SMALL_36 = new OneTapButtonSizeStyle("SMALL_36", 3);
    public static final OneTapButtonSizeStyle SMALL_38 = new OneTapButtonSizeStyle("SMALL_38", 4);
    public static final OneTapButtonSizeStyle MEDIUM_40 = new OneTapButtonSizeStyle("MEDIUM_40", 5);
    public static final OneTapButtonSizeStyle MEDIUM_42 = new OneTapButtonSizeStyle("MEDIUM_42", 6);
    public static final OneTapButtonSizeStyle MEDIUM_44 = new OneTapButtonSizeStyle("MEDIUM_44", 7);
    public static final OneTapButtonSizeStyle MEDIUM_46 = new OneTapButtonSizeStyle("MEDIUM_46", 8);
    public static final OneTapButtonSizeStyle LARGE_48 = new OneTapButtonSizeStyle("LARGE_48", 9);
    public static final OneTapButtonSizeStyle LARGE_50 = new OneTapButtonSizeStyle("LARGE_50", 10);
    public static final OneTapButtonSizeStyle LARGE_52 = new OneTapButtonSizeStyle("LARGE_52", 11);
    public static final OneTapButtonSizeStyle LARGE_54 = new OneTapButtonSizeStyle("LARGE_54", 12);
    public static final OneTapButtonSizeStyle LARGE_56 = new OneTapButtonSizeStyle("LARGE_56", 13);

    private static final /* synthetic */ OneTapButtonSizeStyle[] $values() {
        return new OneTapButtonSizeStyle[]{DEFAULT, SMALL_32, SMALL_34, SMALL_36, SMALL_38, MEDIUM_40, MEDIUM_42, MEDIUM_44, MEDIUM_46, LARGE_48, LARGE_50, LARGE_52, LARGE_54, LARGE_56};
    }

    static {
        OneTapButtonSizeStyle[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private OneTapButtonSizeStyle(String str, int i11) {
    }

    public static OneTapButtonSizeStyle valueOf(String str) {
        return (OneTapButtonSizeStyle) Enum.valueOf(OneTapButtonSizeStyle.class, str);
    }

    public static OneTapButtonSizeStyle[] values() {
        return (OneTapButtonSizeStyle[]) $VALUES.clone();
    }
}
