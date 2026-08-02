package com.vk.channels.impl.post_settings;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.vk.channels.impl.channel_screen.send_msg.ChannelMsgSendState;
import com.vk.channels.impl.post_settings.e;
import com.vk.im.engine.commands.channels.ChannelMsgSendConfig;
import com.vk.im.mvicomponent.MultiComponentFragment;
import com.vk.im.reporters.api.di.ImReportersComponent;
import com.vkontakte.android.R;
import java.util.Collections;
import kotlin.LazyThreadSafetyMode;
import xsna.bpn0;
import xsna.f880;
import xsna.fpf0;
import xsna.g880;
import xsna.i7o0;
import xsna.ies;
import xsna.m7m;
import xsna.m960;
import xsna.msy;
import xsna.myk;
import xsna.oz50;
import xsna.pbw;
import xsna.q010;
import xsna.ra6;
import xsna.ucb;
import xsna.yj50;
import xsna.zdw;

/* compiled from: PostSettingsFragment.kt */
/* loaded from: classes16.dex */
public final class PostSettingsFragment extends MultiComponentFragment implements ies {
    public static final /* synthetic */ int Y = 0;
    public final Object U;
    public final Object V;
    public final Object W;
    public final bpn0 X;

    /* compiled from: PostSettingsFragment.kt */
    public static final class a extends oz50 {
    }

    public PostSettingsFragment() {
        super(R.layout.im_channel_post_settings_fragment);
        f880 f880Var = new f880(this, 7);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.U = msy.a(lazyThreadSafetyMode, f880Var);
        this.V = msy.a(lazyThreadSafetyMode, new q010(this, 16));
        this.W = msy.a(lazyThreadSafetyMode, new g880(this, 8));
        this.X = new bpn0(new m960(this, 11));
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.im.mvicomponent.MviComponentFragment
    public final Iterable<yj50<?, ?, ?, ?, ?, ?, ?>> fo() {
        pbw K = ((ImReportersComponent) m7m.d(this).a(fpf0.a(ImReportersComponent.class))).K();
        long longValue = ((Number) this.U.getValue()).longValue();
        ChannelMsgSendConfig channelMsgSendConfig = (ChannelMsgSendConfig) this.V.getValue();
        ucb ucbVar = (ucb) this.X.getValue();
        zdw zdwVar = i7o0.b;
        if (zdwVar == null) {
            zdwVar = null;
        }
        if (zdwVar.c() != null) {
            return Collections.singletonList(new com.vk.channels.impl.post_settings.a(longValue, channelMsgSendConfig, this, this, ucbVar, new myk(), (ChannelMsgSendState) this.W.getValue(), K.b(), ((ImReportersComponent) m7m.d(this).a(fpf0.a(ImReportersComponent.class))).K().x()));
        }
        throw new IllegalStateException("ChannelsFeatureDependencies is not provided in imUiModule");
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        ho(e.c.b.b);
        super.onDestroy();
    }

    @Override // com.vk.im.mvicomponent.MviComponentFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        toolbar.setNavigationOnClickListener(new ra6(this, 5));
        toolbar.setTitle(R.string.vkim_channels_post_settings_title);
        ho(e.c.a.b);
    }
}
