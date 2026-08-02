package com.vk.dto.newsfeed.entries;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WithDisclaimer.kt */
/* loaded from: classes18.dex */
public final class DisclaimerContent {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DisclaimerContent[] $VALUES;
    public static final DisclaimerContent CARDS;
    public static final DisclaimerContent TEXT;
    public static final DisclaimerContent TEXT_WITH_CONTENT;
    public static final DisclaimerContent UNSUPPORTED;

    static {
        DisclaimerContent disclaimerContent = new DisclaimerContent("TEXT", 0);
        TEXT = disclaimerContent;
        DisclaimerContent disclaimerContent2 = new DisclaimerContent("TEXT_WITH_CONTENT", 1);
        TEXT_WITH_CONTENT = disclaimerContent2;
        DisclaimerContent disclaimerContent3 = new DisclaimerContent("CARDS", 2);
        CARDS = disclaimerContent3;
        DisclaimerContent disclaimerContent4 = new DisclaimerContent("UNSUPPORTED", 3);
        UNSUPPORTED = disclaimerContent4;
        DisclaimerContent[] disclaimerContentArr = {disclaimerContent, disclaimerContent2, disclaimerContent3, disclaimerContent4};
        $VALUES = disclaimerContentArr;
        $ENTRIES = new asp(disclaimerContentArr);
    }

    public DisclaimerContent() {
        throw null;
    }

    public static DisclaimerContent valueOf(String str) {
        return (DisclaimerContent) Enum.valueOf(DisclaimerContent.class, str);
    }

    public static DisclaimerContent[] values() {
        return (DisclaimerContent[]) $VALUES.clone();
    }
}
