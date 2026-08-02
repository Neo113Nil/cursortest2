package com.vk.im.ui.formatters.linkparser;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LinkType.kt */
/* loaded from: classes2.dex */
public final class LinkType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ LinkType[] $VALUES;
    public static final LinkType EMAIL;
    public static final LinkType HASHTAG;
    public static final LinkType MENTION_LINK;
    public static final LinkType MENTION_PERSON;
    public static final LinkType NUMBERS;
    public static final LinkType PHONE;
    public static final LinkType TEL;
    public static final LinkType URL;

    static {
        LinkType linkType = new LinkType("MENTION_PERSON", 0);
        MENTION_PERSON = linkType;
        LinkType linkType2 = new LinkType("URL", 1);
        URL = linkType2;
        LinkType linkType3 = new LinkType(CommonConstant.RETKEY.EMAIL, 2);
        EMAIL = linkType3;
        LinkType linkType4 = new LinkType("HASHTAG", 3);
        HASHTAG = linkType4;
        LinkType linkType5 = new LinkType("PHONE", 4);
        PHONE = linkType5;
        LinkType linkType6 = new LinkType("TEL", 5);
        TEL = linkType6;
        LinkType linkType7 = new LinkType("NUMBERS", 6);
        NUMBERS = linkType7;
        LinkType linkType8 = new LinkType("MENTION_LINK", 7);
        MENTION_LINK = linkType8;
        LinkType[] linkTypeArr = {linkType, linkType2, linkType3, linkType4, linkType5, linkType6, linkType7, linkType8};
        $VALUES = linkTypeArr;
        $ENTRIES = new asp(linkTypeArr);
    }

    public LinkType() {
        throw null;
    }

    public static LinkType valueOf(String str) {
        return (LinkType) Enum.valueOf(LinkType.class, str);
    }

    public static LinkType[] values() {
        return (LinkType[]) $VALUES.clone();
    }
}
