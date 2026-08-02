package com.vk.id.multibranding.common.style;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/vk/id/multibranding/common/style/OAuthListWidgetSizeStyle;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "SMALL_32", "SMALL_34", "SMALL_36", "SMALL_38", "MEDIUM_40", "MEDIUM_42", "MEDIUM_44", "MEDIUM_46", "LARGE_48", "LARGE_50", "LARGE_52", "LARGE_54", "LARGE_56", "multibranding-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class OAuthListWidgetSizeStyle {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ OAuthListWidgetSizeStyle[] $VALUES;
    public static final OAuthListWidgetSizeStyle DEFAULT = new OAuthListWidgetSizeStyle("DEFAULT", 0);
    public static final OAuthListWidgetSizeStyle SMALL_32 = new OAuthListWidgetSizeStyle("SMALL_32", 1);
    public static final OAuthListWidgetSizeStyle SMALL_34 = new OAuthListWidgetSizeStyle("SMALL_34", 2);
    public static final OAuthListWidgetSizeStyle SMALL_36 = new OAuthListWidgetSizeStyle("SMALL_36", 3);
    public static final OAuthListWidgetSizeStyle SMALL_38 = new OAuthListWidgetSizeStyle("SMALL_38", 4);
    public static final OAuthListWidgetSizeStyle MEDIUM_40 = new OAuthListWidgetSizeStyle("MEDIUM_40", 5);
    public static final OAuthListWidgetSizeStyle MEDIUM_42 = new OAuthListWidgetSizeStyle("MEDIUM_42", 6);
    public static final OAuthListWidgetSizeStyle MEDIUM_44 = new OAuthListWidgetSizeStyle("MEDIUM_44", 7);
    public static final OAuthListWidgetSizeStyle MEDIUM_46 = new OAuthListWidgetSizeStyle("MEDIUM_46", 8);
    public static final OAuthListWidgetSizeStyle LARGE_48 = new OAuthListWidgetSizeStyle("LARGE_48", 9);
    public static final OAuthListWidgetSizeStyle LARGE_50 = new OAuthListWidgetSizeStyle("LARGE_50", 10);
    public static final OAuthListWidgetSizeStyle LARGE_52 = new OAuthListWidgetSizeStyle("LARGE_52", 11);
    public static final OAuthListWidgetSizeStyle LARGE_54 = new OAuthListWidgetSizeStyle("LARGE_54", 12);
    public static final OAuthListWidgetSizeStyle LARGE_56 = new OAuthListWidgetSizeStyle("LARGE_56", 13);

    private static final /* synthetic */ OAuthListWidgetSizeStyle[] $values() {
        return new OAuthListWidgetSizeStyle[]{DEFAULT, SMALL_32, SMALL_34, SMALL_36, SMALL_38, MEDIUM_40, MEDIUM_42, MEDIUM_44, MEDIUM_46, LARGE_48, LARGE_50, LARGE_52, LARGE_54, LARGE_56};
    }

    static {
        OAuthListWidgetSizeStyle[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private OAuthListWidgetSizeStyle(String str, int i11) {
    }

    public static OAuthListWidgetSizeStyle valueOf(String str) {
        return (OAuthListWidgetSizeStyle) Enum.valueOf(OAuthListWidgetSizeStyle.class, str);
    }

    public static OAuthListWidgetSizeStyle[] values() {
        return (OAuthListWidgetSizeStyle[]) $VALUES.clone();
    }
}
