package com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.configuration;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LogoStyle.kt */
/* loaded from: classes6.dex */
public final class LogoStyle {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ LogoStyle[] $VALUES;
    public static final LogoStyle DARK;
    public static final LogoStyle ECOSYSTEM;

    static {
        LogoStyle logoStyle = new LogoStyle("ECOSYSTEM", 0);
        ECOSYSTEM = logoStyle;
        LogoStyle logoStyle2 = new LogoStyle("DARK", 1);
        DARK = logoStyle2;
        LogoStyle[] logoStyleArr = {logoStyle, logoStyle2};
        $VALUES = logoStyleArr;
        $ENTRIES = new asp(logoStyleArr);
    }

    public LogoStyle() {
        throw null;
    }

    public static zrp<LogoStyle> h() {
        return $ENTRIES;
    }

    public static LogoStyle valueOf(String str) {
        return (LogoStyle) Enum.valueOf(LogoStyle.class, str);
    }

    public static LogoStyle[] values() {
        return (LogoStyle[]) $VALUES.clone();
    }
}
