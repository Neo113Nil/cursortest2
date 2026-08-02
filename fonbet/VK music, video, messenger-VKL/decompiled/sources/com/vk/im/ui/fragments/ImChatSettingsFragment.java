package com.vk.im.ui.fragments;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.user.UserProfile;
import com.vk.im.engine.di.ImCmdRxExecutorComponent;
import com.vk.im.engine.di.ImConfigurationComponent;
import com.vk.im.engine.di.scope.ImFeatureScopeProviderComponent;
import com.vk.im.engine.di.scope.ImScopeImpl;
import com.vk.im.engine.event.observer.rx.di.ImRxEventObserverComponent;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.ui.components.chat_controls.ChatControls;
import com.vk.movika.tools.controls.seekbar.f;
import com.vk.movika.tools.controls.seekbar.g;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.a1w;
import xsna.bzb0;
import xsna.ca6;
import xsna.cwb0;
import xsna.fpf0;
import xsna.g2v;
import xsna.jbs;
import xsna.m7m;
import xsna.mxv;
import xsna.q1w;
import xsna.v3o;
import xsna.xyb;
import xsna.y3w;
import xsna.zcl;

/* compiled from: ImChatSettingsFragment.kt */
/* loaded from: classes2.dex */
public final class ImChatSettingsFragment extends FragmentImpl {
    public static final /* synthetic */ int V = 0;
    public final a1w N;
    public final mxv O;
    public DialogExt P;
    public xyb Q;
    public boolean R;
    public String S;
    public Toolbar T;
    public bzb0 U;

    /* compiled from: ImChatSettingsFragment.kt */
    public final class a {
        public a() {
        }
    }

    public ImChatSettingsFragment() {
        a1w a1wVar = q1w.a;
        this.N = a1wVar == null ? null : a1wVar;
        this.O = g2v.c();
        this.S = "";
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final int Pn() {
        return 3;
    }

    public final void eo(String str, boolean z) {
        Menu menu;
        this.S = str;
        if (this.R != z) {
            this.R = z;
            if (!z) {
                Toolbar toolbar = this.T;
                if (toolbar == null || (menu = toolbar.getMenu()) == null) {
                    return;
                }
                menu.clear();
                return;
            }
            Toolbar toolbar2 = this.T;
            if (toolbar2 != null) {
                toolbar2.l(R.menu.vkim_menu_done);
            }
            Toolbar toolbar3 = this.T;
            if (toolbar3 != null) {
                toolbar3.setOnMenuItemClickListener(new ca6(this, 21));
            }
        }
    }

    public final void fo(long[] jArr) {
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            Serializer.c<Peer> cVar = Peer.CREATOR;
            arrayList.add(Peer.a.b(j));
        }
        this.N.r().getClass();
        bzb0 bzb0Var = this.U;
        if (bzb0Var != null) {
            bzb0.d(bzb0Var, new cwb0.d0(requireContext(), 250), new f(12, this, arrayList), new g(8, this, arrayList), null, 24);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        ChatControls chatControls;
        if (i2 != -1) {
            return;
        }
        switch (i) {
            case 38918:
                if (intent != null && (chatControls = (ChatControls) intent.getParcelableExtra("chat_controls")) != null) {
                    xyb xybVar = this.Q;
                    (xybVar != null ? xybVar : null).z.a(chatControls);
                    break;
                }
                break;
            case 38919:
                xyb xybVar2 = this.Q;
                (xybVar2 != null ? xybVar2 : null).y.b(intent);
                break;
            case 38920:
                long[] longArrayExtra = intent != null ? intent.getLongArrayExtra("ids") : null;
                if (longArrayExtra != null) {
                    if (!(longArrayExtra.length == 0)) {
                        fo(longArrayExtra);
                        break;
                    }
                }
                ArrayList parcelableArrayListExtra = intent != null ? intent.getParcelableArrayListExtra("result") : null;
                if (parcelableArrayListExtra != null && !parcelableArrayListExtra.isEmpty()) {
                    long[] jArr = new long[parcelableArrayListExtra.size()];
                    int size = parcelableArrayListExtra.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        jArr[i3] = ((UserProfile) parcelableArrayListExtra.get(i3)).c.b;
                    }
                    fo(jArr);
                    break;
                }
                break;
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        xyb xybVar = this.Q;
        if (xybVar == null) {
            xybVar = null;
        }
        xybVar.K0(configuration);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle bundle2 = requireArguments().getBundle("dialog_ext_state");
        Peer peer = (Peer) bundle2.getParcelable("dialog_id");
        long j = peer != null ? peer.b : 0L;
        DialogExt dialogExt = (DialogExt) com.vk.core.util.state.a.b(DialogExt.class, bundle2, bundle2.getString("dialog_ext_state_key"));
        if (dialogExt == null) {
            dialogExt = new DialogExt(j, (ProfilesInfo) null, 2, (zcl) null);
        }
        this.P = dialogExt;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.vkim_fragment, viewGroup, false);
        Context context = layoutInflater.getContext();
        y3w provider = ((ImFeatureScopeProviderComponent) m7m.d(this).a(fpf0.a(ImFeatureScopeProviderComponent.class))).getProvider();
        DialogExt dialogExt = this.P;
        if (dialogExt == null) {
            dialogExt = null;
        }
        ImScopeImpl a2 = provider.a(dialogExt.f);
        DialogExt dialogExt2 = this.P;
        if (dialogExt2 == null) {
            dialogExt2 = null;
        }
        xyb xybVar = new xyb(context, this.N, a2, ((ImConfigurationComponent) m7m.d(this).a(fpf0.a(ImConfigurationComponent.class))).b0(), ((ImCmdRxExecutorComponent) m7m.d(this).a(fpf0.a(ImCmdRxExecutorComponent.class))).g(), ((ImRxEventObserverComponent) m7m.d(this).a(fpf0.a(ImRxEventObserverComponent.class))).l(), this.O, dialogExt2.e, new jbs(this));
        xybVar.B = new a();
        DialogExt dialogExt3 = this.P;
        if (dialogExt3 == null) {
            dialogExt3 = null;
        }
        if (xybVar.q.e) {
            xybVar.d1();
        }
        if (dialogExt3.e != 0) {
            xybVar.c1(dialogExt3);
        }
        this.Q = xybVar;
        ((FrameLayout) inflate.findViewById(R.id.vkim_list_container)).addView(xybVar.D0(layoutInflater.getContext(), viewGroup, null, bundle));
        xyb xybVar2 = this.Q;
        if (xybVar2 == null) {
            xybVar2 = null;
        }
        xybVar2.K0(getResources().getConfiguration());
        Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.toolbar);
        DialogExt dialogExt4 = this.P;
        if (dialogExt4 == null) {
            dialogExt4 = null;
        }
        toolbar.setTitle(dialogExt4.i ? R.string.vkim_channel : R.string.conversation);
        toolbar.setNavigationContentDescription(R.string.accessibility_back);
        toolbar.setNavigationOnClickListener(new v3o(this, 4));
        this.T = toolbar;
        this.U = new bzb0(requireContext());
        return inflate;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        xyb xybVar = this.Q;
        (xybVar == null ? null : xybVar).B = null;
        if (xybVar == null) {
            xybVar = null;
        }
        xybVar.G0();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        xyb xybVar = this.Q;
        if (xybVar == null) {
            xybVar = null;
        }
        xybVar.H0();
        bzb0 bzb0Var = this.U;
        if (bzb0Var != null) {
            bzb0Var.a();
        }
        this.U = null;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        xyb xybVar = this.Q;
        if (xybVar == null) {
            xybVar = null;
        }
        xybVar.P0(bundle);
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        xyb xybVar = this.Q;
        if (xybVar == null) {
            xybVar = null;
        }
        xybVar.V0();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        xyb xybVar = this.Q;
        if (xybVar == null) {
            xybVar = null;
        }
        xybVar.W0();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        xyb xybVar = this.Q;
        if (xybVar == null) {
            xybVar = null;
        }
        xybVar.O0(bundle);
    }
}
