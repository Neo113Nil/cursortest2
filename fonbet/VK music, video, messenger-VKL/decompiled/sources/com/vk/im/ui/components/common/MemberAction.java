package com.vk.im.ui.components.common;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MemberAction.kt */
/* loaded from: classes2.dex */
public final class MemberAction {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MemberAction[] $VALUES;
    public static final MemberAction ADMIN_SET;
    public static final MemberAction ADMIN_UNSET;
    public static final MemberAction KICK;
    public static final MemberAction OWNER_SET;
    public static final MemberAction WRITE_DISABLE;
    public static final MemberAction WRITE_ENABLE;

    static {
        MemberAction memberAction = new MemberAction("KICK", 0);
        KICK = memberAction;
        MemberAction memberAction2 = new MemberAction("OWNER_SET", 1);
        OWNER_SET = memberAction2;
        MemberAction memberAction3 = new MemberAction("ADMIN_SET", 2);
        ADMIN_SET = memberAction3;
        MemberAction memberAction4 = new MemberAction("ADMIN_UNSET", 3);
        ADMIN_UNSET = memberAction4;
        MemberAction memberAction5 = new MemberAction("WRITE_DISABLE", 4);
        WRITE_DISABLE = memberAction5;
        MemberAction memberAction6 = new MemberAction("WRITE_ENABLE", 5);
        WRITE_ENABLE = memberAction6;
        MemberAction[] memberActionArr = {memberAction, memberAction2, memberAction3, memberAction4, memberAction5, memberAction6};
        $VALUES = memberActionArr;
        $ENTRIES = new asp(memberActionArr);
    }

    public MemberAction() {
        throw null;
    }

    public static zrp<MemberAction> h() {
        return $ENTRIES;
    }

    public static MemberAction valueOf(String str) {
        return (MemberAction) Enum.valueOf(MemberAction.class, str);
    }

    public static MemberAction[] values() {
        return (MemberAction[]) $VALUES.clone();
    }
}
