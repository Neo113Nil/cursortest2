package com.vk.im.ui.components.common;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LinkAction.kt */
/* loaded from: classes2.dex */
public final class LinkAction {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ LinkAction[] $VALUES;
    public static final LinkAction CALL;
    public static final LinkAction COPY;
    public static final LinkAction EMAIL;
    public static final LinkAction OPEN;

    static {
        LinkAction linkAction = new LinkAction("OPEN", 0);
        OPEN = linkAction;
        LinkAction linkAction2 = new LinkAction(CommonConstant.RETKEY.EMAIL, 1);
        EMAIL = linkAction2;
        LinkAction linkAction3 = new LinkAction("CALL", 2);
        CALL = linkAction3;
        LinkAction linkAction4 = new LinkAction("COPY", 3);
        COPY = linkAction4;
        LinkAction[] linkActionArr = {linkAction, linkAction2, linkAction3, linkAction4};
        $VALUES = linkActionArr;
        $ENTRIES = new asp(linkActionArr);
    }

    public LinkAction() {
        throw null;
    }

    public static LinkAction valueOf(String str) {
        return (LinkAction) Enum.valueOf(LinkAction.class, str);
    }

    public static LinkAction[] values() {
        return (LinkAction[]) $VALUES.clone();
    }
}
