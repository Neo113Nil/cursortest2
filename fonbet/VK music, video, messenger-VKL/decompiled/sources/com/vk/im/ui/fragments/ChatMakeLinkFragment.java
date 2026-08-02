package com.vk.im.ui.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.Peer;
import com.vk.im.engine.di.ImCmdRxExecutorScopedComponent;
import com.vk.im.engine.di.ImConfigurationScopedComponent;
import com.vk.im.engine.di.ImExperimentsScopedComponent;
import com.vk.im.engine.di.scope.ImFeatureScopeProviderComponent;
import com.vk.im.engine.models.c;
import com.vk.im.ui.components.chat_invite.InviteEntity;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.f1w;
import xsna.fpf0;
import xsna.ies;
import xsna.l7m;
import xsna.lzv;
import xsna.m7m;
import xsna.mh;
import xsna.msx;
import xsna.o25;
import xsna.oz50;
import xsna.qcy;
import xsna.qsb;
import xsna.ras;
import xsna.tlo0;
import xsna.tq;
import xsna.xq;
import xsna.yn3;

/* compiled from: ChatMakeLinkFragment.kt */
/* loaded from: classes2.dex */
public final class ChatMakeLinkFragment extends ImFragment implements ies {
    public static final /* synthetic */ qcy<Object>[] U;
    public qsb P;
    public Toolbar Q;
    public VkTopBar R;
    public final ras S = new ras("from_onboarding", Boolean.FALSE);
    public final boolean T;

    /* compiled from: ChatMakeLinkFragment.kt */
    public static final class a extends oz50 {
        public a(InviteEntity inviteEntity) {
            super(ChatMakeLinkFragment.class, null, null);
            this.j.putParcelable("invite_entity", inviteEntity);
        }

        public final void y(boolean z) {
            this.j.putBoolean("from_onboarding", z);
        }
    }

    /* compiled from: ChatMakeLinkFragment.kt */
    public final class b {
        public b() {
        }

        public final String a(msx msxVar) {
            boolean z = msxVar.c;
            ChatMakeLinkFragment chatMakeLinkFragment = ChatMakeLinkFragment.this;
            return z ? ChatMakeLinkFragment.eo(chatMakeLinkFragment, chatMakeLinkFragment.kn().getString(R.string.vkim_channel_invite_link), msxVar) : ChatMakeLinkFragment.eo(chatMakeLinkFragment, chatMakeLinkFragment.kn().getString(R.string.vkim_chat_invite_title), msxVar);
        }

        public final void b(boolean z) {
            qcy<Object>[] qcyVarArr = ChatMakeLinkFragment.U;
            ChatMakeLinkFragment.this.ho(z);
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ChatMakeLinkFragment.class, "isFromOnboarding", "isFromOnboarding()Z", 0);
        fpf0.a.getClass();
        U = new qcy[]{propertyReference1Impl};
    }

    public ChatMakeLinkFragment() {
        ImFeatures imFeatures = ImFeatures.IM_CHAT_MAKE_LINK_REDESIGN;
        imFeatures.getClass();
        this.T = com.vk.toggle.b.A.a(imFeatures);
    }

    public static final String eo(ChatMakeLinkFragment chatMakeLinkFragment, String str, msx msxVar) {
        String str2 = msxVar.a;
        if (str2 == null) {
            str2 = "?";
        }
        return str + " '" + str2 + "':\n" + msxVar.b;
    }

    public final InviteEntity fo() {
        return (InviteEntity) requireArguments().getParcelable("invite_entity");
    }

    public final Peer go() {
        InviteEntity fo = fo();
        if (fo instanceof InviteEntity.Channel) {
            Serializer.c<Peer> cVar = Peer.CREATOR;
            return Peer.Unknown.e;
        }
        if (fo instanceof InviteEntity.Chat) {
            return ((InviteEntity.Chat) fo()).c;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void ho(boolean z) {
        int i;
        if (z) {
            i = R.string.vkim_channel_invite_link;
        } else {
            if (o25.b(o25.a())) {
                qcy<Object> qcyVar = U[0];
                if (((Boolean) this.S.a(this)).booleanValue()) {
                    i = R.string.vkim_chat_invite_link_title;
                }
            }
            i = R.string.vkim_chat_make_link_title;
        }
        if (!this.T) {
            Toolbar toolbar = this.Q;
            if (toolbar == null) {
                toolbar = null;
            }
            toolbar.setTitle(i);
            return;
        }
        VkTopBar vkTopBar = this.R;
        if (vkTopBar != null) {
            VkTopBar.Middle.Text.c cVar = null;
            Object[] objArr = 0 == true ? 1 : 0;
            Object[] objArr2 = 0 == true ? 1 : 0;
            vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(tq.h(tlo0.Companion, i), null, null, null, null, 30), cVar, objArr, objArr2, 14));
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        l7m d = m7m.d(this);
        c experiments = ((ImExperimentsScopedComponent) xq.f((ImFeatureScopeProviderComponent) d.a(fpf0.a(ImFeatureScopeProviderComponent.class)), go(), d).a(fpf0.a(ImExperimentsScopedComponent.class))).getExperiments();
        l7m d2 = m7m.d(this);
        lzv g = ((ImCmdRxExecutorScopedComponent) xq.f((ImFeatureScopeProviderComponent) d2.a(fpf0.a(ImFeatureScopeProviderComponent.class)), go(), d2).a(fpf0.a(ImCmdRxExecutorScopedComponent.class))).g();
        l7m d3 = m7m.d(this);
        f1w b0 = ((ImConfigurationScopedComponent) xq.f((ImFeatureScopeProviderComponent) d3.a(fpf0.a(ImFeatureScopeProviderComponent.class)), go(), d3).a(fpf0.a(ImConfigurationScopedComponent.class))).b0();
        InviteEntity fo = fo();
        qcy<Object> qcyVar = U[0];
        if (((Boolean) this.S.a(this)).booleanValue() && o25.b(o25.a())) {
            experiments.getClass();
        }
        qsb qsbVar = new qsb(context, b0, g, fo, true);
        this.P = qsbVar;
        qsbVar.r = new b();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = this.T;
        View inflate = layoutInflater.inflate(z ? R.layout.vkim_chat_make_link_fragment : R.layout.vkim_fragment, viewGroup, false);
        if (z) {
            this.R = (VkTopBar) inflate.findViewById(R.id.vkToolbar);
            InviteEntity fo = fo();
            fo.getClass();
            ho((fo instanceof InviteEntity.Channel) || ((InviteEntity.Chat) fo).d);
        } else {
            this.Q = (Toolbar) inflate.findViewById(R.id.toolbar);
            InviteEntity fo2 = fo();
            fo2.getClass();
            ho((fo2 instanceof InviteEntity.Channel) || ((InviteEntity.Chat) fo2).d);
            Toolbar toolbar = this.Q;
            if (toolbar == null) {
                toolbar = null;
            }
            toolbar.setNavigationContentDescription(R.string.accessibility_back);
        }
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(R.id.vkim_list_container);
        qsb qsbVar = this.P;
        frameLayout.addView((qsbVar != null ? qsbVar : null).F0(frameLayout, bundle));
        return inflate;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.T) {
            VkTopBar vkTopBar = this.R;
            if (vkTopBar != null) {
                vkTopBar.setBack(new VkTopBar.b(new mh(this, 18), null, null, null, null, 30));
                return;
            }
            return;
        }
        Toolbar toolbar = this.Q;
        if (toolbar == null) {
            toolbar = null;
        }
        toolbar.setNavigationOnClickListener(new yn3(this, 3));
    }
}
