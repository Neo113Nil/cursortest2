package com.zoho.livechat.android.utils;

import com.zoho.livechat.android.provider.MobilistenInitProvider;
import i3.C4527h;

/* renamed from: com.zoho.livechat.android.utils.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3943l {
    static String[] timebreakstrings = {"s", "1m ago", X9.m.f13664a, "1h ago", C4527h.f48087o, "Yesterday", W9.d.f13160a, "Last week", " weeks", "Last month", " months", "Last year", " secs"};

    public static String a(int i10) {
        return i10 + " " + timebreakstrings[12].trim();
    }

    public static String b(long j10) {
        String str;
        char c10;
        long f10 = (rd.b.f() - j10) / 1000;
        long[] jArr = {60, 120, 3600, 7200, 86400, 172800, 604800, 1209600, 2419200, 4838400, 29030400, 58060800};
        String[] strArr = {"", "1 minute from now", "", "1 hour from now", "", "Tomorrow", "", "Next week", "", "Next month", "", "Next year"};
        long[] jArr2 = {1, 0, 60, 0, 3600, 0, 86400, 0, 604800, 0, 2419200, 0};
        if (f10 >= 0 && f10 < 60) {
            return MobilistenInitProvider.k() != null ? MobilistenInitProvider.k().getString(od.t.f61114t0) : "Just now";
        }
        if (f10 < 0) {
            f10 = Math.abs(f10);
            str = "from now";
            c10 = 2;
        } else {
            str = "ago";
            c10 = 1;
        }
        int i10 = 0;
        while (i10 < 12) {
            if (f10 < jArr[i10]) {
                if (i10 % 2 != 0) {
                    return c10 == 2 ? strArr[i10] : i10 >= 7 ? LiveChatUtil.getDateDifference(MobilistenInitProvider.k(), Long.valueOf(j10)) : timebreakstrings[i10];
                }
                if (i10 >= 7) {
                    return LiveChatUtil.getDateDifference(MobilistenInitProvider.k(), Long.valueOf(j10));
                }
                return ((int) Math.floor(f10 / jArr2[i10])) + timebreakstrings[i10] + " " + str;
            }
            i10++;
        }
        return "";
    }
}
