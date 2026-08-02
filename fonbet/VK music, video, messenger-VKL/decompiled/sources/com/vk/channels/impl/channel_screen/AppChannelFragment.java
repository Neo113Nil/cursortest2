package com.vk.channels.impl.channel_screen;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.vk.channels.api.Channel;
import com.vk.channels.impl.channel_screen.footer.c;
import com.vk.channels.impl.channel_screen.profile.ChannelProfileFragment;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.Peer;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.actions.ActionOpenUrl;
import com.vk.dto.newsfeed.PostDonut;
import com.vk.im.engine.commands.channels.ChannelMsgSendConfig;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.im.ui.components.msg_list.MsgListOpenMode;
import com.vk.log.L;
import com.vk.movika.sdk.base.ui.g;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.attachments.ChannelMessageAttachment;
import io.reactivex.rxjava3.subjects.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.asu0;
import xsna.b2b;
import xsna.bg20;
import xsna.bo8;
import xsna.bpn0;
import xsna.bw;
import xsna.cau0;
import xsna.e43;
import xsna.fxv0;
import xsna.gzs;
import xsna.h6;
import xsna.hg1;
import xsna.jd;
import xsna.jkb;
import xsna.kd;
import xsna.l8c0;
import xsna.ld;
import xsna.m1;
import xsna.mdz;
import xsna.msy;
import xsna.nvv0;
import xsna.q8b;
import xsna.r1b;
import xsna.rbb;
import xsna.s1;
import xsna.s280;
import xsna.s3q0;
import xsna.sf20;
import xsna.t280;
import xsna.v5;
import xsna.vm30;
import xsna.wd8;
import xsna.wdw;
import xsna.we0;
import xsna.wxa;
import xsna.x2b;
import xsna.ybb;
import xsna.yj50;
import xsna.zx0;

/* compiled from: AppChannelFragment.kt */
/* loaded from: classes16.dex */
public final class AppChannelFragment extends ChannelFragment {
    public static final /* synthetic */ int l1 = 0;
    public boolean b1;
    public final bpn0 c1 = new bpn0(new g(this, 7));
    public final Object d1;
    public final Object e1;
    public final Object f1;
    public final Object g1;
    public final Object h1;
    public final Object i1;
    public final a j1;
    public final Object k1;

    /* compiled from: AppChannelFragment.kt */
    public static final class a implements r1b {
        public a() {
        }

        @Override // xsna.r1b
        public final void a(MsgFromChannel msgFromChannel) {
            ybb.g gVar = new ybb.g(msgFromChannel);
            int i = AppChannelFragment.l1;
            AppChannelFragment.this.ho(gVar);
        }

        @Override // xsna.r1b
        public final void b(MsgFromChannel msgFromChannel, ChannelMsgSendConfig channelMsgSendConfig) {
            ybb.k kVar = new ybb.k(msgFromChannel, channelMsgSendConfig);
            int i = AppChannelFragment.l1;
            AppChannelFragment.this.ho(kVar);
        }

        @Override // xsna.r1b
        public final void c(MsgFromChannel msgFromChannel) {
            ybb.e eVar = new ybb.e(msgFromChannel);
            int i = AppChannelFragment.l1;
            AppChannelFragment.this.ho(eVar);
        }

        @Override // xsna.r1b
        public final void d(MsgFromChannel msgFromChannel) {
            ybb.d dVar = new ybb.d(msgFromChannel);
            int i = AppChannelFragment.l1;
            AppChannelFragment.this.ho(dVar);
        }
    }

    /* compiled from: AppChannelFragment.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            AppChannelFragment appChannelFragment = (AppChannelFragment) this.receiver;
            vm30 vm30Var = appChannelFragment.ro().o;
            if (vm30Var != null) {
                vm30.x(vm30Var, null, "showFullScreenLoader", 8);
            }
            sf20 ro = appChannelFragment.ro();
            MsgListOpenMode so = appChannelFragment.so();
            bg20 bg20Var = ro.a.n;
            bg20Var.a.c((mdz) bg20Var.f.getValue());
            bg20Var.a.c((mdz) bg20Var.g.getValue());
            ro.k.d(so);
            return s3q0.a;
        }
    }

    public AppChannelFragment() {
        m1 m1Var = new m1(this, 1);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.d1 = msy.a(lazyThreadSafetyMode, m1Var);
        this.e1 = msy.a(lazyThreadSafetyMode, new jd(this, 2));
        int i = 4;
        this.f1 = msy.a(lazyThreadSafetyMode, new kd(this, i));
        this.g1 = msy.a(lazyThreadSafetyMode, new ld(this, i));
        this.h1 = msy.a(lazyThreadSafetyMode, new h6(this, 5));
        this.i1 = msy.a(lazyThreadSafetyMode, new we0(this, 4));
        this.j1 = new a();
        this.k1 = msy.a(lazyThreadSafetyMode, new s1(this, 6));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.im.mvicomponent.MviComponentFragment
    public final Iterable<yj50<?, ?, ?, ?, ?, ?, ?>> fo() {
        return e43.l((rbb) this.f1.getValue(), (c) this.I0.getValue());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.channels.impl.channel_screen.ChannelFragment
    public final boolean isPostponed() {
        return ((Boolean) this.e1.getValue()).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
    
        if (r1 == null) goto L16;
     */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onActivityResult(int i, int i2, Intent intent) {
        Integer d;
        Parcelable parcelable;
        Msg msg;
        Channel b2;
        String str;
        PostDonut.Placeholder placeholder;
        LinkButton linkButton;
        Object parcelableExtra;
        ChannelMsgSendConfig channelMsgSendConfig;
        Parcelable parcelable2;
        Object parcelableExtra2;
        super.onActivityResult(i, i2, intent);
        if (i == 4 && i2 == -1) {
            if (intent != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelableExtra2 = intent.getParcelableExtra("channel_post_config", ChannelMsgSendConfig.class);
                    parcelable2 = (Parcelable) parcelableExtra2;
                } else {
                    Parcelable parcelableExtra3 = intent.getParcelableExtra("channel_post_config");
                    parcelable2 = (ChannelMsgSendConfig) (parcelableExtra3 instanceof ChannelMsgSendConfig ? parcelableExtra3 : null);
                }
                channelMsgSendConfig = (ChannelMsgSendConfig) parcelable2;
            }
            channelMsgSendConfig = ChannelMsgSendConfig.c;
            ho(new ybb.j(channelMsgSendConfig, intent != null ? intent.getBooleanExtra("channel_immediate_publish_post", false) : false));
            return;
        }
        if (i != 201 || i2 != -1 || intent == null) {
            ho(new ybb.a(i, i2, intent));
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("arguments");
        if (bundleExtra == null || (d = bo8.d(bundleExtra, "post_id")) == null) {
            return;
        }
        int intValue = d.intValue();
        if (Build.VERSION.SDK_INT >= 33) {
            parcelableExtra = intent.getParcelableExtra("dialog_id", Peer.class);
            parcelable = (Parcelable) parcelableExtra;
        } else {
            Parcelable parcelableExtra4 = intent.getParcelableExtra("dialog_id");
            if (!(parcelableExtra4 instanceof Peer)) {
                parcelableExtra4 = null;
            }
            parcelable = (Peer) parcelableExtra4;
        }
        Peer peer = (Peer) parcelable;
        if (peer == null) {
            return;
        }
        x2b x2bVar = (x2b) this.J0.getValue();
        Iterator<Msg> it = x2bVar.l.c().iterator();
        while (true) {
            if (!it.hasNext()) {
                msg = null;
                break;
            } else {
                msg = it.next();
                if (msg.d == intValue) {
                    break;
                }
            }
        }
        MsgFromChannel msgFromChannel = msg instanceof MsgFromChannel ? (MsgFromChannel) msg : null;
        if (msgFromChannel == null || (b2 = x2bVar.j.b()) == null) {
            return;
        }
        b2b b2bVar = x2bVar.i;
        List<Attach> list = msgFromChannel.E;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            Attachment b3 = wdw.b((Attach) it2.next(), null, false, 6);
            if (b3 != null) {
                arrayList.add(b3);
            }
        }
        long j = b2.b;
        Peer peer2 = b2.A;
        int i3 = msgFromChannel.d;
        String str2 = b2.d;
        String str3 = msgFromChannel.I.a;
        String zb = msgFromChannel.T.zb();
        MsgFromChannel.b bVar = msgFromChannel.I;
        String str4 = bVar.j;
        PostDonut postDonut = bVar.g;
        Action action = (postDonut == null || (placeholder = postDonut.c) == null || (linkButton = placeholder.c) == null) ? null : linkButton.c;
        ActionOpenUrl actionOpenUrl = action instanceof ActionOpenUrl ? (ActionOpenUrl) action : null;
        if (actionOpenUrl == null || (str = actionOpenUrl.c) == null) {
            str = "";
        }
        b2bVar.m.b().B(b2bVar.b, peer, "", Collections.singletonList(new ChannelMessageAttachment(j, peer2, i3, str2, str3, zb, arrayList, str4, str, postDonut, bVar.r, b2.c)), null, null, false);
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.channels.impl.channel_screen.ChannelFragment, com.vk.im.mvicomponent.MviComponentFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.V.x(new s280(mo()));
            ((jkb) this.h1.getValue()).b(Long.valueOf(mo()));
        }
        ImFeatures imFeatures = ImFeatures.DONUTS_EASY_FLOW_IN_CHANNEL;
        imFeatures.getClass();
        if (com.vk.toggle.b.A.a(imFeatures)) {
            wxa wxaVar = (wxa) this.i1.getValue();
            wxaVar.a();
            wxaVar.e.b(io.reactivex.rxjava3.kotlin.c.f(2, hg1.c(fxv0.a.a, nvv0.class), null, new wd8(L.a, 1), new zx0(wxaVar, 15)));
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.channels.impl.channel_screen.ChannelFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.V.x(new t280(mo()));
        ((jkb) this.h1.getValue()).b(null);
        ((l8c0) ((q8b) this.c1.getValue()).a.getValue()).a();
        super.onDestroy();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.channels.impl.channel_screen.ChannelFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.p0.b(((d) this.k1.getValue()).a0(asu0.a.d()).subscribe(new bw(new v5(this, 7), 4)));
    }

    @Override // com.vk.channels.impl.channel_screen.ChannelFragment
    public final a qo() {
        return this.j1;
    }

    @Override // com.vk.channels.impl.channel_screen.ChannelFragment
    public final void yo() {
        Channel b2 = lo().b();
        if (b2 == null) {
            return;
        }
        cau0 cau0Var = this.V.r().h;
        boolean z = b2.w;
        long mo = mo();
        ChannelProfileFragment.a aVar = new ChannelProfileFragment.a(ChannelProfileFragment.class, null, null);
        Bundle bundle = aVar.j;
        bundle.putLong("param_channel_id", mo);
        bundle.putBoolean("param_messages_to_channel_enabled", z);
        aVar.s(true);
        aVar.l(this);
    }
}
