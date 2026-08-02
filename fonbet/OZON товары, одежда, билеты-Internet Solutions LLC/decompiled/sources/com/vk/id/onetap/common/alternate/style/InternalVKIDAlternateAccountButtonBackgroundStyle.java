package com.vk.id.onetap.common.alternate.style;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/vk/id/onetap/common/alternate/style/InternalVKIDAlternateAccountButtonBackgroundStyle;", "", "<init>", "(Ljava/lang/String;I)V", "LIGHT", "DARK", "TRANSPARENT", "onetap-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class InternalVKIDAlternateAccountButtonBackgroundStyle {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ InternalVKIDAlternateAccountButtonBackgroundStyle[] $VALUES;
    public static final InternalVKIDAlternateAccountButtonBackgroundStyle LIGHT = new InternalVKIDAlternateAccountButtonBackgroundStyle("LIGHT", 0);
    public static final InternalVKIDAlternateAccountButtonBackgroundStyle DARK = new InternalVKIDAlternateAccountButtonBackgroundStyle("DARK", 1);
    public static final InternalVKIDAlternateAccountButtonBackgroundStyle TRANSPARENT = new InternalVKIDAlternateAccountButtonBackgroundStyle("TRANSPARENT", 2);

    private static final /* synthetic */ InternalVKIDAlternateAccountButtonBackgroundStyle[] $values() {
        return new InternalVKIDAlternateAccountButtonBackgroundStyle[]{LIGHT, DARK, TRANSPARENT};
    }

    static {
        InternalVKIDAlternateAccountButtonBackgroundStyle[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private InternalVKIDAlternateAccountButtonBackgroundStyle(String str, int i11) {
    }

    public static InternalVKIDAlternateAccountButtonBackgroundStyle valueOf(String str) {
        return (InternalVKIDAlternateAccountButtonBackgroundStyle) Enum.valueOf(InternalVKIDAlternateAccountButtonBackgroundStyle.class, str);
    }

    public static InternalVKIDAlternateAccountButtonBackgroundStyle[] values() {
        return (InternalVKIDAlternateAccountButtonBackgroundStyle[]) $VALUES.clone();
    }
}
