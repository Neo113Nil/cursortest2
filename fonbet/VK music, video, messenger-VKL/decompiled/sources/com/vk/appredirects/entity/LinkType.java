package com.vk.appredirects.entity;

import com.vkontakte.android.R;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LinkType.kt */
/* loaded from: classes15.dex */
public final class LinkType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ LinkType[] $VALUES;
    public static final LinkType CALL;
    public static final LinkType CLIP;
    public static final LinkType IM;
    public static final LinkType VIDEO;
    private final int nameRes;
    private final String testLinkSuffix;

    static {
        LinkType linkType = new LinkType("IM", 0, R.string.link_type_im, "write/");
        IM = linkType;
        LinkType linkType2 = new LinkType("CALL", 1, R.string.link_type_call, "call/");
        CALL = linkType2;
        LinkType linkType3 = new LinkType("CLIP", 2, R.string.link_type_clip, "clip/");
        CLIP = linkType3;
        LinkType linkType4 = new LinkType(SignalingProtocol.MEDIA_OPTION_VIDEO, 3, R.string.link_type_video, "video/");
        VIDEO = linkType4;
        LinkType[] linkTypeArr = {linkType, linkType2, linkType3, linkType4};
        $VALUES = linkTypeArr;
        $ENTRIES = new asp(linkTypeArr);
    }

    public LinkType(String str, int i, int i2, String str2) {
        this.nameRes = i2;
        this.testLinkSuffix = str2;
    }

    public static LinkType valueOf(String str) {
        return (LinkType) Enum.valueOf(LinkType.class, str);
    }

    public static LinkType[] values() {
        return (LinkType[]) $VALUES.clone();
    }

    public final int h() {
        return this.nameRes;
    }

    public final String i() {
        return this.testLinkSuffix;
    }
}
