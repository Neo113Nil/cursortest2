package com.vk.channels.impl.comments;

import android.content.Context;
import com.facebook.soloader.MinElf;
import com.vk.channels.impl.comments.c;
import com.vk.dto.common.id.UserId;
import com.vk.im.mvicomponent.MviComponentFragment;
import com.vk.webapp.fragments.ReportFragment;
import kotlin.NoWhenBranchMatchedException;
import xsna.fkq0;
import xsna.g2v;
import xsna.gzs;
import xsna.hm50;
import xsna.l0v0;
import xsna.o0r0;
import xsna.s3q0;

/* compiled from: ChannelCommentsNavEventRouter.kt */
/* loaded from: classes16.dex */
public final class d implements hm50<c> {
    public final MviComponentFragment a;
    public final o0r0 b;

    public d(ChannelCommentsFragment channelCommentsFragment, o0r0 o0r0Var) {
        this.a = channelCommentsFragment;
        this.b = o0r0Var;
    }

    @Override // xsna.hm50
    public final void a(c cVar) {
        String str;
        c cVar2 = cVar;
        MviComponentFragment mviComponentFragment = this.a;
        if (cVar2.equals(c.a.a)) {
            mviComponentFragment.finish();
            return;
        }
        if (cVar2 instanceof c.b) {
            this.b.m(mviComponentFragment.requireContext(), ((c.b) cVar2).a, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
            return;
        }
        if (!(cVar2 instanceof c.C0532c)) {
            throw new NoWhenBranchMatchedException();
        }
        g2v.c().getClass();
        Context requireContext = mviComponentFragment.requireContext();
        c.C0532c c0532c = (c.C0532c) cVar2;
        long j = c0532c.a;
        int i = c0532c.c;
        int i2 = l0v0.a.$EnumSwitchMapping$0[c0532c.b.ordinal()];
        if (i2 == 1) {
            str = "channel_comment";
        } else {
            if (i2 != 2) {
                throw new IllegalArgumentException("Can report only community and personal channels comments");
            }
            str = "user_channel_comment";
        }
        int i3 = ReportFragment.a0;
        ReportFragment.a a = ReportFragment.b.a();
        a.K(str);
        gzs<s3q0> gzsVar = fkq0.a;
        a.G(new UserId(j));
        a.D(i);
        a.s(true);
        a.k(requireContext);
    }
}
