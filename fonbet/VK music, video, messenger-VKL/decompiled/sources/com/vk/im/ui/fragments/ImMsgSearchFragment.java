package com.vk.im.ui.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.FragmentActivity;
import com.vk.channels.api.ChannelHistoryOpenMode;
import com.vk.core.apps.BuildInfo;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.dto.common.Peer;
import com.vk.dto.messages.MsgIdType;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.SearchMode;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.search.SearchEntrypoint;
import com.vk.im.ui.components.msg_list.MsgListOpenAtMsgMode;
import com.vk.im.ui.components.msg_search.analytics.ImSearchItemLoggingInfo;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.a1w;
import xsna.epx;
import xsna.flu;
import xsna.fpf0;
import xsna.g2v;
import xsna.ies;
import xsna.k9u0;
import xsna.msy;
import xsna.n34;
import xsna.nf3;
import xsna.o0w;
import xsna.o90;
import xsna.ox30;
import xsna.oz50;
import xsna.q1w;
import xsna.qcy;
import xsna.rsr;
import xsna.rw30;
import xsna.szf0;
import xsna.zcl;

/* compiled from: ImMsgSearchFragment.kt */
/* loaded from: classes2.dex */
public final class ImMsgSearchFragment extends ImFragment implements ies, szf0 {
    public static final /* synthetic */ qcy<Object>[] U;
    public DialogExt P;
    public String Q;
    public rw30 R;
    public final Object S = msy.a(LazyThreadSafetyMode.NONE, new flu(this, 6));
    public final nf3 T = new nf3();

    /* compiled from: ImMsgSearchFragment.kt */
    public static final class a extends oz50 {
        public a(DialogExt dialogExt, Peer peer, String str) {
            super(ImMsgSearchFragment.class, null, null);
            n34.w(this.j, dialogExt, null);
            this.j.putParcelable("owner_id", peer);
            this.j.putString("text", str);
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(ImMsgSearchFragment.class, "resetSensitivity", "getResetSensitivity()Z", 0);
        fpf0.a.getClass();
        U = new qcy[]{mutablePropertyReference1Impl};
    }

    @Override // xsna.szf0
    public final boolean Hg(Bundle bundle) {
        Bundle bundle2 = requireArguments().getBundle("dialog_ext_state");
        Peer peer = (Peer) bundle2.getParcelable("dialog_id");
        long j = peer != null ? peer.b : 0L;
        DialogExt dialogExt = (DialogExt) com.vk.core.util.state.a.b(DialogExt.class, bundle2, bundle2.getString("dialog_ext_state_key"));
        if (dialogExt == null) {
            dialogExt = new DialogExt(j, (ProfilesInfo) null, 2, (zcl) null);
        }
        long j2 = dialogExt.e;
        DialogExt dialogExt2 = this.P;
        if (dialogExt2 == null) {
            dialogExt2 = null;
        }
        return j2 == dialogExt2.e;
    }

    public final void eo(boolean z) {
        FragmentActivity kn = kn();
        if (kn.getIntent().getBooleanExtra("app_content_hidden", false)) {
            return;
        }
        if (z) {
            kn.getWindow().addFlags(8192);
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            kn.getWindow().clearFlags(8192);
        }
    }

    @Override // xsna.y760
    public final void h9(Intent intent) {
        String str;
        rsr rsrVar = oz50.k;
        Bundle b2 = oz50.b.b(intent);
        if (b2 == null || (str = b2.getString("text")) == null) {
            str = "";
        }
        String str2 = this.Q;
        if (str2 == null) {
            str2 = null;
        }
        if (epx.f(str2, str)) {
            return;
        }
        this.Q = str;
        rw30 rw30Var = this.R;
        if (rw30Var == null) {
            rw30Var = null;
        }
        rw30Var.b1().h(SearchMode.MESSAGES);
        VkSearchView vkSearchView = rw30Var.b1().k;
        (vkSearchView != null ? vkSearchView : null).setQuery(str);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        Bundle bundle2 = requireArguments().getBundle("dialog_ext_state");
        Peer peer = (Peer) bundle2.getParcelable("dialog_id");
        long j = peer != null ? peer.b : 0L;
        DialogExt dialogExt = (DialogExt) com.vk.core.util.state.a.b(DialogExt.class, bundle2, bundle2.getString("dialog_ext_state_key"));
        if (dialogExt == null) {
            dialogExt = new DialogExt(j, (ProfilesInfo) null, 2, (zcl) null);
        }
        this.P = dialogExt;
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("text")) == null) {
            str = "";
        }
        this.Q = str;
        boolean a2 = o90.a(kn());
        qcy<Object> qcyVar = U[0];
        this.T.c = Boolean.valueOf(a2);
    }

    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        a1w a1wVar;
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.vkim_msg_search_fragment, viewGroup, false);
        DialogExt dialogExt = this.P;
        long j = (dialogExt == null ? null : dialogExt).e;
        if (dialogExt == null) {
            dialogExt = null;
        }
        ox30.b bVar = new ox30.b(j, dialogExt.getTitle());
        a1w a1wVar2 = (!(BuildInfo.s() && ((Peer) this.S.getValue()).Ab(Peer.Type.GROUP)) ? (a1wVar = q1w.a) != null : (a1wVar = q1w.b) != null) ? null : a1wVar;
        g2v.c().getClass();
        rw30 rw30Var = new rw30(a1wVar2, k9u0.a, requireContext(), bVar, null, 112);
        this.R = rw30Var;
        rw30Var.w = new b();
        rw30 rw30Var2 = this.R;
        (rw30Var2 != null ? rw30Var2 : null).D0(requireContext(), viewGroup2, (ViewStub) viewGroup2.findViewById(R.id.vkim_stub), Bundle.EMPTY);
        return viewGroup2;
    }

    @Override // com.vk.im.ui.fragments.ImFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        DialogExt dialogExt = this.P;
        if (dialogExt == null) {
            dialogExt = null;
        }
        ChatSettings Bb = dialogExt.Bb();
        boolean z = false;
        if (Bb != null && !Bb.N) {
            z = true;
        }
        eo(z);
        super.onResume();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStop() {
        eo(((Boolean) this.T.getValue(this, U[0])).booleanValue());
        super.onStop();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        rw30 rw30Var = this.R;
        if (rw30Var == null) {
            rw30Var = null;
        }
        rw30.i1(rw30Var, null, 3);
        rw30 rw30Var2 = this.R;
        if (rw30Var2 == null) {
            rw30Var2 = null;
        }
        String str = this.Q;
        if (str == null) {
            str = null;
        }
        rw30Var2.b1().h(SearchMode.MESSAGES);
        VkSearchView vkSearchView = rw30Var2.b1().k;
        (vkSearchView != null ? vkSearchView : null).setQuery(str);
    }

    /* compiled from: ImMsgSearchFragment.kt */
    public final class b implements rw30.a {
        public final SearchEntrypoint a = SearchEntrypoint.SEARCH_MSGS_IN_DIALOG;

        public b() {
        }

        @Override // xsna.rw30.a
        public final boolean a(Dialog dialog) {
            return true;
        }

        @Override // xsna.rw30.a
        public final boolean b(Dialog dialog) {
            return true;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.rw30.a
        public final void d(Dialog dialog, int i) {
            o0w b = g2v.c().b();
            ImMsgSearchFragment imMsgSearchFragment = ImMsgSearchFragment.this;
            FragmentActivity kn = imMsgSearchFragment.kn();
            DialogExt dialogExt = imMsgSearchFragment.P;
            if (dialogExt == null) {
                dialogExt = null;
            }
            long j = dialogExt.e;
            long j2 = ((Peer) imMsgSearchFragment.S.getValue()).b;
            DialogExt dialogExt2 = imMsgSearchFragment.P;
            o0w.x(b, kn, Long.valueOf(j2), j, dialogExt2 != null ? dialogExt2 : null, null, new MsgListOpenAtMsgMode(MsgIdType.CNV_ID, i), true, null, null, null, null, null, null, "message_search", null, null, null, false, null, null, null, null, null, 1073602448);
        }

        @Override // xsna.rw30.a
        public final void e(Dialog dialog, ProfilesSimpleInfo profilesSimpleInfo, ImSearchItemLoggingInfo imSearchItemLoggingInfo) {
            throw new UnsupportedOperationException();
        }

        @Override // xsna.rw30.a
        public final SearchEntrypoint g() {
            return this.a;
        }

        @Override // xsna.rw30.a
        public final void h(long j, boolean z) {
            g2v.c().a().c(ImMsgSearchFragment.this.requireContext(), j, ChannelHistoryOpenMode.OpenAtUnread.b, null);
        }

        @Override // xsna.rw30.a
        public final void i() {
            ImMsgSearchFragment.this.finish();
        }

        @Override // xsna.rw30.a
        public final void c(long j, boolean z) {
        }

        @Override // xsna.rw30.a
        public final void f(long j, boolean z) {
        }
    }
}
