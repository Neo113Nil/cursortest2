package com.vk.im.engine.models.groups;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.Iterator;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MemberStatus.kt */
/* loaded from: classes2.dex */
public final class MemberStatus {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MemberStatus[] $VALUES;
    public static final a Companion;
    public static final MemberStatus DECLINED_INVITATION;
    public static final MemberStatus INTERESTED;
    public static final MemberStatus INVITED;
    public static final MemberStatus MEMBER;
    public static final MemberStatus NO;
    public static final MemberStatus REQUEST_SENT;
    public static final MemberStatus UNKNOWN;
    private final int id;

    /* compiled from: MemberStatus.kt */
    public static final class a {
        public static MemberStatus a(Integer num) {
            Object obj;
            Iterator<E> it = MemberStatus.h().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                int i = ((MemberStatus) obj).i();
                if (num != null && i == num.intValue()) {
                    break;
                }
            }
            MemberStatus memberStatus = (MemberStatus) obj;
            return memberStatus == null ? MemberStatus.UNKNOWN : memberStatus;
        }
    }

    static {
        MemberStatus memberStatus = new MemberStatus("NO", 0, 0);
        NO = memberStatus;
        MemberStatus memberStatus2 = new MemberStatus("MEMBER", 1, 1);
        MEMBER = memberStatus2;
        MemberStatus memberStatus3 = new MemberStatus("INTERESTED", 2, 2);
        INTERESTED = memberStatus3;
        MemberStatus memberStatus4 = new MemberStatus("DECLINED_INVITATION", 3, 3);
        DECLINED_INVITATION = memberStatus4;
        MemberStatus memberStatus5 = new MemberStatus("REQUEST_SENT", 4, 4);
        REQUEST_SENT = memberStatus5;
        MemberStatus memberStatus6 = new MemberStatus("INVITED", 5, 5);
        INVITED = memberStatus6;
        MemberStatus memberStatus7 = new MemberStatus(GrsBaseInfo.CountryCodeSource.UNKNOWN, 6, -1);
        UNKNOWN = memberStatus7;
        MemberStatus[] memberStatusArr = {memberStatus, memberStatus2, memberStatus3, memberStatus4, memberStatus5, memberStatus6, memberStatus7};
        $VALUES = memberStatusArr;
        $ENTRIES = new asp(memberStatusArr);
        Companion = new a();
    }

    public MemberStatus(String str, int i, int i2) {
        this.id = i2;
    }

    public static zrp<MemberStatus> h() {
        return $ENTRIES;
    }

    public static MemberStatus valueOf(String str) {
        return (MemberStatus) Enum.valueOf(MemberStatus.class, str);
    }

    public static MemberStatus[] values() {
        return (MemberStatus[]) $VALUES.clone();
    }

    public final int i() {
        return this.id;
    }
}
