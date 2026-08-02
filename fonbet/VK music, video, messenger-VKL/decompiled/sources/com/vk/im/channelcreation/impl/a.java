package com.vk.im.channelcreation.impl;

import android.os.Bundle;
import com.vkontakte.android.R;
import xsna.asu0;
import xsna.b25;
import xsna.j7g0;
import xsna.mxv;
import xsna.ozo;
import xsna.r6k;
import xsna.v3q;
import xsna.xul;
import xsna.yj50;

/* compiled from: ChannelCreationComponent.kt */
/* loaded from: classes2.dex */
public final class a extends yj50<b, j, g, h, i, c, d> {
    public final ChannelCreationFragment n;
    public final AbstractC1092a o;
    public final r6k p;
    public final ozo q;
    public final j7g0 r;
    public final xul s;
    public final mxv t;
    public final b25 u;
    public final v3q v;

    /* compiled from: ChannelCreationComponent.kt */
    /* renamed from: com.vk.im.channelcreation.impl.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC1092a {
        public final long a;

        /* compiled from: ChannelCreationComponent.kt */
        /* renamed from: com.vk.im.channelcreation.impl.a$a$a, reason: collision with other inner class name */
        public static final class C1093a extends AbstractC1092a {
        }

        /* compiled from: ChannelCreationComponent.kt */
        /* renamed from: com.vk.im.channelcreation.impl.a$a$b */
        public static final class b extends AbstractC1092a {
        }

        public AbstractC1092a(long j) {
            this.a = j;
        }
    }

    public a(ChannelCreationFragment channelCreationFragment, ChannelCreationFragment channelCreationFragment2, AbstractC1092a abstractC1092a, r6k r6kVar, ozo ozoVar, j7g0 j7g0Var, xul xulVar, mxv mxvVar, b25 b25Var, asu0 asu0Var) {
        super(channelCreationFragment, channelCreationFragment2, g.class, false);
        this.n = channelCreationFragment;
        this.o = abstractC1092a;
        this.p = r6kVar;
        this.q = ozoVar;
        this.r = j7g0Var;
        this.s = xulVar;
        this.t = mxvVar;
        this.u = b25Var;
        this.v = asu0Var;
    }

    @Override // xsna.yj50
    public final b a(Bundle bundle) {
        AbstractC1092a abstractC1092a = this.o;
        long j = abstractC1092a.a;
        b25 b25Var = this.u;
        return new b(this.p, this.q, this.r, this.s, this.v, abstractC1092a instanceof AbstractC1092a.b, j, b25Var);
    }

    @Override // xsna.yj50
    public final d b() {
        return new d(this.n, this.t);
    }

    @Override // xsna.yj50
    public final h d() {
        return new h(this.o instanceof AbstractC1092a.b ? R.layout.im_channel_editing : R.layout.im_channel_creation, this.n);
    }
}
