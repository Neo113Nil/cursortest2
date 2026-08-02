package com.vk.stickers.api.models.mention;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MentionLegacyStyle.kt */
/* loaded from: classes5.dex */
public final class MentionLegacyStyle {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MentionLegacyStyle[] $VALUES;
    public static final MentionLegacyStyle UNDERLINE;
    private final String styleName = TtmlNode.UNDERLINE;

    static {
        MentionLegacyStyle mentionLegacyStyle = new MentionLegacyStyle();
        UNDERLINE = mentionLegacyStyle;
        MentionLegacyStyle[] mentionLegacyStyleArr = {mentionLegacyStyle};
        $VALUES = mentionLegacyStyleArr;
        $ENTRIES = new asp(mentionLegacyStyleArr);
    }

    public static MentionLegacyStyle valueOf(String str) {
        return (MentionLegacyStyle) Enum.valueOf(MentionLegacyStyle.class, str);
    }

    public static MentionLegacyStyle[] values() {
        return (MentionLegacyStyle[]) $VALUES.clone();
    }

    public final String h() {
        return this.styleName;
    }
}
