package com.vk.id.multibranding.common.style;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/vk/id/multibranding/common/style/InternalVKIDOAuthListWidgetBorderStyle;", "", "<init>", "(Ljava/lang/String;I)V", "DARK", "LIGHT", "multibranding-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class InternalVKIDOAuthListWidgetBorderStyle {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ InternalVKIDOAuthListWidgetBorderStyle[] $VALUES;
    public static final InternalVKIDOAuthListWidgetBorderStyle DARK = new InternalVKIDOAuthListWidgetBorderStyle("DARK", 0);
    public static final InternalVKIDOAuthListWidgetBorderStyle LIGHT = new InternalVKIDOAuthListWidgetBorderStyle("LIGHT", 1);

    private static final /* synthetic */ InternalVKIDOAuthListWidgetBorderStyle[] $values() {
        return new InternalVKIDOAuthListWidgetBorderStyle[]{DARK, LIGHT};
    }

    static {
        InternalVKIDOAuthListWidgetBorderStyle[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private InternalVKIDOAuthListWidgetBorderStyle(String str, int i11) {
    }

    public static InternalVKIDOAuthListWidgetBorderStyle valueOf(String str) {
        return (InternalVKIDOAuthListWidgetBorderStyle) Enum.valueOf(InternalVKIDOAuthListWidgetBorderStyle.class, str);
    }

    public static InternalVKIDOAuthListWidgetBorderStyle[] values() {
        return (InternalVKIDOAuthListWidgetBorderStyle[]) $VALUES.clone();
    }
}
