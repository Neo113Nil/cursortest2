package com.vk.im.engine.commands.channels;

import com.vk.dto.common.id.UserId;
import com.vk.im.engine.commands.channels.ChannelInviteUsersCmd;
import io.reactivex.rxjava3.internal.operators.mixed.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bz2;
import xsna.c5g;
import xsna.dq;
import xsna.fkq0;
import xsna.gzs;
import xsna.l7r0;
import xsna.nx2;
import xsna.qq;
import xsna.s3q0;
import xsna.tfx;

/* compiled from: ChannelInviteUsersCmd.kt */
/* loaded from: classes2.dex */
public final class a extends nx2<s3q0> {
    public final long b;
    public final ChannelInviteUsersCmd.InviteOptions c;
    public final List<Long> d;
    public final boolean e = true;

    public a(long j, ChannelInviteUsersCmd.InviteOptions inviteOptions, List list) {
        this.b = j;
        this.c = inviteOptions;
        this.d = list;
    }

    @Override // xsna.nx2
    public final s3q0 f(l7r0 l7r0Var) {
        long j = this.b;
        gzs<s3q0> gzsVar = fkq0.a;
        UserId userId = new UserId(j);
        ChannelInviteUsersCmd.InviteOptions inviteOptions = this.c;
        boolean z = inviteOptions == ChannelInviteUsersCmd.InviteOptions.ALL;
        boolean z2 = inviteOptions == ChannelInviteUsersCmd.InviteOptions.SUBSCRIBERS;
        List<Long> list = this.d;
        ArrayList arrayList = null;
        if (list.isEmpty()) {
            list = null;
        }
        if (list != null) {
            List<Long> list2 = list;
            arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                dq.h(((Number) it.next()).longValue(), arrayList);
            }
        }
        ArrayList arrayList2 = arrayList;
        tfx tfxVar = new tfx("channels.invite", new qq(5), new n(6));
        tfx.n(tfxVar, "channel_id", userId, 0L, -1L, 4);
        tfxVar.j("all", z);
        tfxVar.j("subscribers", z2);
        if (arrayList2 != null) {
            tfx.p(tfxVar, "user_ids", arrayList2, 1L, 8);
        }
        bz2.l(tfxVar, this.e);
        return s3q0.a;
    }
}
