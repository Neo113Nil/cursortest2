package com.vk.channels.impl.comments;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.bridges.di.BridgeComponent;
import com.vk.bridges.di.LinksBridgeComponent;
import com.vk.channels.impl.comments.a;
import com.vk.core.fragments.internal.transition.impl.TransitionAnimationSimple$Companion$Type;
import com.vk.im.mvicomponent.MultiComponentFragment;
import com.vkontakte.android.R;
import java.util.Collections;
import xsna.fpf0;
import xsna.ies;
import xsna.m7m;
import xsna.oz50;
import xsna.pva;
import xsna.t01;
import xsna.yj50;

/* compiled from: ChannelCommentsFragment.kt */
/* loaded from: classes16.dex */
public final class ChannelCommentsFragment extends MultiComponentFragment implements ies {
    public static final /* synthetic */ int U = 0;

    /* compiled from: ChannelCommentsFragment.kt */
    public static final class a extends oz50 {
        public a(ChannelCommentsParams channelCommentsParams, boolean z) {
            super(ChannelCommentsFragment.class, null, null);
            this.j.putParcelable("params", channelCommentsParams);
            if (z) {
                u(TransitionAnimationSimple$Companion$Type.SLIDE_FROM_RIGHT.h());
            }
        }
    }

    public ChannelCommentsFragment() {
        super(R.layout.im_channel_comments_fragment);
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        ho(a.c.b);
        return true;
    }

    @Override // com.vk.im.mvicomponent.MviComponentFragment
    public final Iterable<yj50<?, ?, ?, ?, ?, ?, ?>> fo() {
        return Collections.singletonList(new pva(this, this, ((BridgeComponent) m7m.d(this).a(fpf0.a(BridgeComponent.class))).F(), ((LinksBridgeComponent) m7m.d(this).a(fpf0.a(LinksBridgeComponent.class))).p(), ((AuthBridgeComponent) m7m.d(this).a(fpf0.a(AuthBridgeComponent.class))).s()));
    }

    @Override // com.vk.im.mvicomponent.MviComponentFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        if (toolbar != null) {
            toolbar.setNavigationOnClickListener(new t01(this, 2));
        }
    }
}
