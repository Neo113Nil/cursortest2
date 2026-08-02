package com.vk.channels.impl.post_settings;

import android.content.Intent;
import com.vk.channels.api.Channel;
import com.vk.channels.impl.channel_screen.send_msg.ChannelMsgSendState;
import com.vk.channels.impl.post_settings.adapter.PostSettingType;
import com.vk.channels.impl.post_settings.c;
import com.vk.channels.impl.post_settings.e;
import com.vk.im.engine.commands.channels.ChannelMsgSendConfig;
import com.vk.im.mvicomponent.MviComponentFragment;
import com.vk.log.L;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.q;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import xsna.a1w;
import xsna.a960;
import xsna.ag20;
import xsna.bpn0;
import xsna.ctu;
import xsna.di6;
import xsna.epx;
import xsna.feb;
import xsna.fju;
import xsna.gb;
import xsna.gda0;
import xsna.gz30;
import xsna.h9k0;
import xsna.j0r;
import xsna.j7c0;
import xsna.jsb0;
import xsna.ju;
import xsna.kn20;
import xsna.lfa;
import xsna.lxa;
import xsna.mwv;
import xsna.mz80;
import xsna.pp80;
import xsna.pw4;
import xsna.q1w;
import xsna.q8w;
import xsna.rvq;
import xsna.ryv;
import xsna.s3q0;
import xsna.uh40;
import xsna.uk40;
import xsna.ux40;
import xsna.wnt;
import xsna.wq20;
import xsna.xj50;
import xsna.yhu;

/* compiled from: PostSettingsFeature.kt */
/* loaded from: classes16.dex */
public final class b extends di6<j7c0, e, g, c> {
    public final MviComponentFragment h;
    public final ChannelMsgSendConfig i;
    public final h9k0 j;
    public final ChannelMsgSendState k;
    public final feb l;
    public final long m;
    public final mwv<mwv.a> n;
    public final lxa o;
    public final bpn0 p;

    /* compiled from: PostSettingsFeature.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PostSettingType.values().length];
            try {
                iArr[PostSettingType.DELAYED_SEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PostSettingType.ENABLE_COMMENTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PostSettingType.ADD_AUTHOR_SIGN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PostSettingType.SEND_NOTIFICATIONS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PostSettingType.POST_FOR_DONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PostSettingType.ONLY_VISIBLE_TO_DONS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PostSettingType.MARK_ADVERTISEMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PostSettingType.PUBLISH_STORY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[PostSettingType.HIDE_ONLY_PHOTOS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(PostSettingsFragment postSettingsFragment, ChannelMsgSendConfig channelMsgSendConfig, h9k0 h9k0Var, ChannelMsgSendState channelMsgSendState, feb febVar, long j, mwv mwvVar) {
        super(new j7c0(channelMsgSendConfig, r2, null, channelMsgSendState, channelMsgSendConfig.C()));
        pp80 pp80Var;
        int i;
        Integer i2 = channelMsgSendConfig.i();
        if (i2 != null) {
            int intValue = i2.intValue();
            pp80Var = intValue == -1 ? pp80.a.a : (intValue % 86400 != 0 || 1 > (i = intValue / 86400) || i >= 8) ? null : new pp80.b(i);
        } else {
            pp80Var = null;
        }
        this.h = postSettingsFragment;
        this.i = channelMsgSendConfig;
        this.j = h9k0Var;
        this.k = channelMsgSendState;
        this.l = febVar;
        this.m = j;
        this.n = mwvVar;
        a1w a1wVar = q1w.a;
        lxa lxaVar = new lxa(j, a1wVar != null ? a1wVar : null);
        this.o = lxaVar;
        this.p = new bpn0(new ag20(this, 22));
        i(lxaVar.e, new xj50(new pw4(L.a, 7), 6), new wnt(this, 21));
    }

    @Override // xsna.di6
    public final void d(e eVar) {
        e eVar2 = eVar;
        boolean z = eVar2 instanceof e.g;
        lxa lxaVar = this.o;
        if (z) {
            switch (a.$EnumSwitchMapping$0[((e.g) eVar2).b.ordinal()]) {
                case 1:
                    r(new kn20(this, 25));
                    return;
                case 2:
                    q(new lfa(13, new gz30(6), this));
                    return;
                case 3:
                    q(new lfa(13, new q8w(15), this));
                    return;
                case 4:
                    q(new lfa(13, new j0r(18), this));
                    return;
                case 5:
                    if (this.i.u()) {
                        q(new rvq(18));
                    }
                    if (g().d.e) {
                        r(new yhu(this, 22));
                        return;
                    }
                    j(lxaVar.e.K(), new a960(this, 8), new uk40(this, 10));
                    return;
                case 6:
                    r(new yhu(this, 22));
                    return;
                case 7:
                    if (this.k.c) {
                        this.j.d(R.string.vkim_channels_post_settings_cant_change_ad);
                        return;
                    }
                    StringBuilder sb = new StringBuilder("#");
                    r(new wq20(sb, 17));
                    m(new c.b(sb.toString()));
                    return;
                case 8:
                    q(new fju(this, 25));
                    return;
                case 9:
                    q(new ux40(this, 16));
                    return;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        if (eVar2 instanceof e.d) {
            m(c.C0541c.a);
            return;
        }
        if (eVar2 instanceof e.c) {
            e.c cVar = (e.c) eVar2;
            boolean f = epx.f(cVar, e.c.a.b);
            bpn0 bpn0Var = this.p;
            if (f) {
                ((ctu) bpn0Var.getValue()).a();
                i(q.B0(5L, TimeUnit.SECONDS), io.reactivex.rxjava3.internal.functions.a.e, new jsb0(this, 1));
                return;
            }
            if (!epx.f(cVar, e.c.b.b)) {
                throw new NoWhenBranchMatchedException();
            }
            ((ctu) bpn0Var.getValue()).getClass();
            ctu.b();
            return;
        }
        if (eVar2 instanceof e.a) {
            e.a aVar = (e.a) eVar2;
            r(new mz80(8, aVar, this));
            q(new gb(28, aVar, this));
        } else if (eVar2 instanceof e.b) {
            q(new lfa(13, new gda0(eVar2, 4), this));
        } else if (!(eVar2 instanceof e.C0542e)) {
            if (!(eVar2 instanceof e.f)) {
                throw new NoWhenBranchMatchedException();
            }
            r(new uh40(this, 13));
        } else {
            Channel b = lxaVar.b();
            if (b != null) {
                this.n.a(new ryv.a(b.A.d, b.b, true));
            }
            q(new ju(20, eVar2, this));
        }
    }

    public final void s(ChannelMsgSendConfig channelMsgSendConfig, Boolean bool) {
        Intent intent = new Intent();
        if (channelMsgSendConfig == null) {
            channelMsgSendConfig = g().a;
        }
        intent.putExtra("channel_post_config", channelMsgSendConfig);
        if (bool != null) {
            intent.putExtra("channel_immediate_publish_post", bool.booleanValue());
        }
        s3q0 s3q0Var = s3q0.a;
        this.h.setResult(-1, intent);
    }
}
