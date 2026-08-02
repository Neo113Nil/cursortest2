package com.vk.channels.impl.post_settings;

import android.content.Context;
import android.os.Bundle;
import com.vk.channels.impl.channel_screen.send_msg.ChannelMsgSendState;
import com.vk.im.engine.commands.channels.ChannelMsgSendConfig;
import xsna.es00;
import xsna.feb;
import xsna.gd40;
import xsna.h9k0;
import xsna.i7o0;
import xsna.j7c0;
import xsna.lyk;
import xsna.mwv;
import xsna.s5u0;
import xsna.ucb;
import xsna.vk50;
import xsna.yj50;
import xsna.zdw;

/* compiled from: PostSettingsComponent.kt */
/* loaded from: classes16.dex */
public final class a extends yj50<b, j7c0, e, f, g, c, d> {
    public final long n;
    public final ChannelMsgSendConfig o;
    public final PostSettingsFragment p;
    public final h9k0 q;
    public final lyk r;
    public final ChannelMsgSendState s;
    public final feb t;
    public final mwv<mwv.a> u;
    public s5u0 v;

    public a(long j, ChannelMsgSendConfig channelMsgSendConfig, PostSettingsFragment postSettingsFragment, PostSettingsFragment postSettingsFragment2, ucb ucbVar, lyk lykVar, ChannelMsgSendState channelMsgSendState, feb febVar, mwv mwvVar) {
        super(postSettingsFragment, postSettingsFragment2, e.class, false);
        this.n = j;
        this.o = channelMsgSendConfig;
        this.p = postSettingsFragment;
        this.q = ucbVar;
        this.r = lykVar;
        this.s = channelMsgSendState;
        this.t = febVar;
        this.u = mwvVar;
    }

    @Override // xsna.yj50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        s5u0 s5u0Var = new s5u0(this.p.requireContext());
        this.v = s5u0Var;
        s5u0Var.b = new es00(this, 24);
    }

    @Override // xsna.yj50
    public final b a(Bundle bundle) {
        return new b(this.p, this.o, this.q, this.s, this.t, this.n, this.u);
    }

    @Override // xsna.yj50
    public final d b() {
        Context requireContext = this.p.requireContext();
        zdw zdwVar = i7o0.b;
        if (zdwVar == null) {
            zdwVar = null;
        }
        return new d(requireContext, zdwVar.d(), new gd40(this, 11));
    }

    @Override // xsna.yj50
    public final f d() {
        s5u0 s5u0Var = this.v;
        if (s5u0Var == null) {
            s5u0Var = null;
        }
        return new f(this.p, this.r, s5u0Var);
    }
}
