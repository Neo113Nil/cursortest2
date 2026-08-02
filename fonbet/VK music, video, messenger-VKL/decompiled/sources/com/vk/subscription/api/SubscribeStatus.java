package com.vk.subscription.api;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SubscribeStatus.kt */
/* loaded from: classes6.dex */
public final class SubscribeStatus {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SubscribeStatus[] $VALUES;
    public static final a Companion;
    public static final SubscribeStatus FRIEND_STATUS_FOLLOWNG;
    public static final SubscribeStatus FRIEND_STATUS_FRIENDS;
    public static final SubscribeStatus FRIEND_STATUS_INCOME_FRIENDSHIP_REQUEST;
    public static final SubscribeStatus FRIEND_STATUS_NOT_FRIENDS;
    public static final SubscribeStatus FRIEND_STATUS_SENT_REQUEST;
    public static final SubscribeStatus MEMBER_STATUS_DECLINED_INVITATION;
    public static final SubscribeStatus MEMBER_STATUS_INVITED;
    public static final SubscribeStatus MEMBER_STATUS_MEMBER;
    public static final SubscribeStatus MEMBER_STATUS_NOT_MEMBER;
    public static final SubscribeStatus MEMBER_STATUS_NOT_SURE;
    public static final SubscribeStatus MEMBER_STATUS_SENT_REQUEST;
    public static final SubscribeStatus NO_DATA;
    public final int value;

    /* compiled from: SubscribeStatus.kt */
    public static final class a {

        /* compiled from: SubscribeStatus.kt */
        /* renamed from: com.vk.subscription.api.SubscribeStatus$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C1850a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[SubscribeStatus.values().length];
                try {
                    iArr[SubscribeStatus.FRIEND_STATUS_NOT_FRIENDS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SubscribeStatus.FRIEND_STATUS_FOLLOWNG.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[SubscribeStatus.FRIEND_STATUS_INCOME_FRIENDSHIP_REQUEST.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[SubscribeStatus.FRIEND_STATUS_FRIENDS.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static SubscribeStatus a(int i) {
            return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? SubscribeStatus.NO_DATA : SubscribeStatus.FRIEND_STATUS_SENT_REQUEST : SubscribeStatus.FRIEND_STATUS_FRIENDS : SubscribeStatus.FRIEND_STATUS_INCOME_FRIENDSHIP_REQUEST : SubscribeStatus.FRIEND_STATUS_FOLLOWNG : SubscribeStatus.FRIEND_STATUS_NOT_FRIENDS;
        }

        public static SubscribeStatus b(int i) {
            return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? SubscribeStatus.NO_DATA : SubscribeStatus.MEMBER_STATUS_INVITED : SubscribeStatus.MEMBER_STATUS_SENT_REQUEST : SubscribeStatus.MEMBER_STATUS_DECLINED_INVITATION : SubscribeStatus.MEMBER_STATUS_NOT_SURE : SubscribeStatus.MEMBER_STATUS_MEMBER : SubscribeStatus.MEMBER_STATUS_NOT_MEMBER;
        }

        public static boolean c(SubscribeStatus subscribeStatus) {
            return subscribeStatus == SubscribeStatus.FRIEND_STATUS_FOLLOWNG || subscribeStatus == SubscribeStatus.FRIEND_STATUS_FRIENDS || subscribeStatus == SubscribeStatus.MEMBER_STATUS_MEMBER || subscribeStatus == SubscribeStatus.MEMBER_STATUS_SENT_REQUEST;
        }

        public static int d(SubscribeStatus subscribeStatus) {
            int i = C1850a.$EnumSwitchMapping$0[subscribeStatus.ordinal()];
            if (i == 1) {
                return 0;
            }
            if (i == 2) {
                return 1;
            }
            if (i != 3) {
                return i != 4 ? -1 : 3;
            }
            return 2;
        }
    }

    static {
        SubscribeStatus subscribeStatus = new SubscribeStatus("NO_DATA", 0, -1);
        NO_DATA = subscribeStatus;
        SubscribeStatus subscribeStatus2 = new SubscribeStatus("FRIEND_STATUS_NOT_FRIENDS", 1, 0);
        FRIEND_STATUS_NOT_FRIENDS = subscribeStatus2;
        SubscribeStatus subscribeStatus3 = new SubscribeStatus("FRIEND_STATUS_FOLLOWNG", 2, 1);
        FRIEND_STATUS_FOLLOWNG = subscribeStatus3;
        SubscribeStatus subscribeStatus4 = new SubscribeStatus("FRIEND_STATUS_INCOME_FRIENDSHIP_REQUEST", 3, 2);
        FRIEND_STATUS_INCOME_FRIENDSHIP_REQUEST = subscribeStatus4;
        SubscribeStatus subscribeStatus5 = new SubscribeStatus("FRIEND_STATUS_FRIENDS", 4, 3);
        FRIEND_STATUS_FRIENDS = subscribeStatus5;
        SubscribeStatus subscribeStatus6 = new SubscribeStatus("FRIEND_STATUS_SENT_REQUEST", 5, 4);
        FRIEND_STATUS_SENT_REQUEST = subscribeStatus6;
        SubscribeStatus subscribeStatus7 = new SubscribeStatus("MEMBER_STATUS_NOT_MEMBER", 6, 0);
        MEMBER_STATUS_NOT_MEMBER = subscribeStatus7;
        SubscribeStatus subscribeStatus8 = new SubscribeStatus("MEMBER_STATUS_MEMBER", 7, 1);
        MEMBER_STATUS_MEMBER = subscribeStatus8;
        SubscribeStatus subscribeStatus9 = new SubscribeStatus("MEMBER_STATUS_NOT_SURE", 8, 2);
        MEMBER_STATUS_NOT_SURE = subscribeStatus9;
        SubscribeStatus subscribeStatus10 = new SubscribeStatus("MEMBER_STATUS_DECLINED_INVITATION", 9, 3);
        MEMBER_STATUS_DECLINED_INVITATION = subscribeStatus10;
        SubscribeStatus subscribeStatus11 = new SubscribeStatus("MEMBER_STATUS_SENT_REQUEST", 10, 4);
        MEMBER_STATUS_SENT_REQUEST = subscribeStatus11;
        SubscribeStatus subscribeStatus12 = new SubscribeStatus("MEMBER_STATUS_INVITED", 11, 5);
        MEMBER_STATUS_INVITED = subscribeStatus12;
        SubscribeStatus[] subscribeStatusArr = {subscribeStatus, subscribeStatus2, subscribeStatus3, subscribeStatus4, subscribeStatus5, subscribeStatus6, subscribeStatus7, subscribeStatus8, subscribeStatus9, subscribeStatus10, subscribeStatus11, subscribeStatus12};
        $VALUES = subscribeStatusArr;
        $ENTRIES = new asp(subscribeStatusArr);
        Companion = new a();
    }

    public SubscribeStatus(String str, int i, int i2) {
        this.value = i2;
    }

    public static SubscribeStatus valueOf(String str) {
        return (SubscribeStatus) Enum.valueOf(SubscribeStatus.class, str);
    }

    public static SubscribeStatus[] values() {
        return (SubscribeStatus[]) $VALUES.clone();
    }
}
