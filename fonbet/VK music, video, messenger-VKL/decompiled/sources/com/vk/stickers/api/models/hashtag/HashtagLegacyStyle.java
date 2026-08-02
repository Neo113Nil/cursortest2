package com.vk.stickers.api.models.hashtag;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HashtagLegacyStyle.kt */
/* loaded from: classes5.dex */
public final class HashtagLegacyStyle {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ HashtagLegacyStyle[] $VALUES;
    public static final HashtagLegacyStyle UNDERLINE;
    private final String styleName = TtmlNode.UNDERLINE;

    static {
        HashtagLegacyStyle hashtagLegacyStyle = new HashtagLegacyStyle();
        UNDERLINE = hashtagLegacyStyle;
        HashtagLegacyStyle[] hashtagLegacyStyleArr = {hashtagLegacyStyle};
        $VALUES = hashtagLegacyStyleArr;
        $ENTRIES = new asp(hashtagLegacyStyleArr);
    }

    public static HashtagLegacyStyle valueOf(String str) {
        return (HashtagLegacyStyle) Enum.valueOf(HashtagLegacyStyle.class, str);
    }

    public static HashtagLegacyStyle[] values() {
        return (HashtagLegacyStyle[]) $VALUES.clone();
    }

    public final String h() {
        return this.styleName;
    }
}
