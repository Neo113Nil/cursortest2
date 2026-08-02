package com.vk.pushes.notifications.im;

import androidx.core.app.NotificationCompat;
import com.ironsource.X3;
import com.vk.dto.common.b;
import com.vk.im.engine.models.channels.ChannelType;
import kotlin.Pair;
import xsna.e870;
import xsna.p4g;
import xsna.pn00;
import xsna.x870;

/* compiled from: MessageNotificationContainer.kt */
/* loaded from: classes5.dex */
public final class a {
    public static final MessageNotificationContainer a(String str, String str2, long j, String str3, String str4, boolean z, String str5, Long l, String str6, Long l2, Long l3, long j2, int i, boolean z2, boolean z3, boolean z4, boolean z5, ChannelType channelType) {
        Pair pair = new Pair("type", z5 ? "community_msg" : z4 ? "group_channel" : b.a(j2) ? "chat" : NotificationCompat.CATEGORY_MESSAGE);
        Pair pair2 = new Pair("title", str);
        Pair pair3 = new Pair("body", str2);
        Pair pair4 = new Pair("time", String.valueOf(j));
        Pair pair5 = new Pair("icon", str3);
        x870 x870Var = x870.a;
        Pair pair6 = new Pair("category", "default_ver2");
        Pair pair7 = new Pair("url", str4);
        Pair pair8 = new Pair("external_url", String.valueOf(z));
        e870 e870Var = e870.b;
        return new MessageNotificationContainer(p4g.h(pn00.k(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, new Pair("context", e870.h(Integer.valueOf(i), Long.valueOf(l2 != null ? l2.longValue() : j2), l3)), new Pair("to_id", l != null ? l.toString() : null), new Pair(X3.j.D, str6), new Pair("sender", str5), new Pair("sound", String.valueOf(z2 ? 1 : 0)), new Pair("failed", String.valueOf(z3 ? 1 : 0)), new Pair("channel_type", channelType != null ? channelType.i() : null))));
    }
}
