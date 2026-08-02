package com.vk.superapp.browser.internal.utils;

import xsna.asp;
import xsna.ozl;
import xsna.thx;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InternalMiniApps.kt */
/* loaded from: classes6.dex */
public final class InternalMiniApps {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ InternalMiniApps[] $VALUES;
    public static final InternalMiniApps ACCOUNT;
    public static final InternalMiniApps BLOCKED;
    public static final InternalMiniApps CLIPS_DASHBOARD;
    public static final InternalMiniApps COVID_19;
    public static final a Companion;
    public static final InternalMiniApps POST_STATS;
    public static final InternalMiniApps RESTORE;
    public static final InternalMiniApps SECURITY;
    public static final InternalMiniApps SUPPORT;
    public static final InternalMiniApps VK_COMBO;
    public static final InternalMiniApps VK_PAY;
    public static final InternalMiniApps VK_PAY_LOCAL;
    public static final InternalMiniApps VK_PAY_OLD;
    private final thx appInfo;

    /* compiled from: InternalMiniApps.kt */
    public static final class a {
        @ozl
        public static InternalMiniApps a() {
            return InternalMiniApps.VK_PAY_OLD;
        }

        public static boolean b(long j) {
            return j == InternalMiniApps.VK_PAY_OLD.h().a || j == InternalMiniApps.VK_PAY.h().a;
        }
    }

    static {
        InternalMiniApps internalMiniApps = new InternalMiniApps("VK_PAY_OLD", 0, new thx(6217559L, "vkpay"));
        VK_PAY_OLD = internalMiniApps;
        InternalMiniApps internalMiniApps2 = new InternalMiniApps("VK_PAY", 1, new thx(7131443L, "vkpay"));
        VK_PAY = internalMiniApps2;
        InternalMiniApps internalMiniApps3 = new InternalMiniApps("VK_PAY_LOCAL", 2, new thx(7658749L, null));
        VK_PAY_LOCAL = internalMiniApps3;
        InternalMiniApps internalMiniApps4 = new InternalMiniApps("ACCOUNT", 3, new thx(7344294L, "account"));
        ACCOUNT = internalMiniApps4;
        InternalMiniApps internalMiniApps5 = new InternalMiniApps("BLOCKED", 4, new thx(6772175L, "blocked"));
        BLOCKED = internalMiniApps5;
        InternalMiniApps internalMiniApps6 = new InternalMiniApps("COVID_19", 5, new thx(7362610L, null));
        COVID_19 = internalMiniApps6;
        InternalMiniApps internalMiniApps7 = new InternalMiniApps("VK_COMBO", 6, new thx(7354476L, "vkcombo"));
        VK_COMBO = internalMiniApps7;
        InternalMiniApps internalMiniApps8 = new InternalMiniApps("RESTORE", 7, new thx(6108320L, "restore"));
        RESTORE = internalMiniApps8;
        InternalMiniApps internalMiniApps9 = new InternalMiniApps("CLIPS_DASHBOARD", 8, new thx(51440354L, "clips_dashboard"));
        CLIPS_DASHBOARD = internalMiniApps9;
        InternalMiniApps internalMiniApps10 = new InternalMiniApps("POST_STATS", 9, new thx(6909175L, "post_stats"));
        POST_STATS = internalMiniApps10;
        InternalMiniApps internalMiniApps11 = new InternalMiniApps("SECURITY", 10, new thx(51441221L, "security"));
        SECURITY = internalMiniApps11;
        InternalMiniApps internalMiniApps12 = new InternalMiniApps("SUPPORT", 11, new thx(6126832L, "support"));
        SUPPORT = internalMiniApps12;
        InternalMiniApps[] internalMiniAppsArr = {internalMiniApps, internalMiniApps2, internalMiniApps3, internalMiniApps4, internalMiniApps5, internalMiniApps6, internalMiniApps7, internalMiniApps8, internalMiniApps9, internalMiniApps10, internalMiniApps11, internalMiniApps12};
        $VALUES = internalMiniAppsArr;
        $ENTRIES = new asp(internalMiniAppsArr);
        Companion = new a();
    }

    public InternalMiniApps(String str, int i, thx thxVar) {
        this.appInfo = thxVar;
    }

    public static zrp<InternalMiniApps> i() {
        return $ENTRIES;
    }

    public static InternalMiniApps valueOf(String str) {
        return (InternalMiniApps) Enum.valueOf(InternalMiniApps.class, str);
    }

    public static InternalMiniApps[] values() {
        return (InternalMiniApps[]) $VALUES.clone();
    }

    public final thx h() {
        return this.appInfo;
    }
}
