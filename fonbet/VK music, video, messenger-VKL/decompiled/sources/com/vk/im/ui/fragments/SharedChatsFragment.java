package com.vk.im.ui.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.k0;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.ImBgSyncState;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.log.L;
import com.vkontakte.android.R;
import java.util.HashSet;
import ru.ok.android.utils.Logger;
import xsna.a1w;
import xsna.asu0;
import xsna.e3m;
import xsna.fnj;
import xsna.gmp;
import xsna.i7o0;
import xsna.iah0;
import xsna.ies;
import xsna.ioh;
import xsna.k2y;
import xsna.ltm;
import xsna.lw30;
import xsna.mxv;
import xsna.n34;
import xsna.odv0;
import xsna.oz50;
import xsna.r6m;
import xsna.u180;
import xsna.vtm;
import xsna.w910;
import xsna.x9j0;
import xsna.y9j0;
import xsna.zcl;
import xsna.zdw;

/* compiled from: SharedChatsFragment.kt */
/* loaded from: classes2.dex */
public final class SharedChatsFragment extends ImFragment implements ies {
    public static final /* synthetic */ int V = 0;
    public final zdw P;
    public Toolbar Q;
    public DialogExt R;
    public vtm S;
    public x9j0 T;
    public ImBgSyncState U;

    /* compiled from: SharedChatsFragment.kt */
    public static final class a extends oz50 {
        public a(DialogExt dialogExt) {
            super(SharedChatsFragment.class, null, null);
            n34.w(this.j, dialogExt, null);
        }
    }

    /* compiled from: SharedChatsFragment.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImBgSyncState.values().length];
            try {
                iArr[ImBgSyncState.DISCONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImBgSyncState.CONNECTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SharedChatsFragment() {
        zdw zdwVar = i7o0.b;
        this.P = zdwVar == null ? null : zdwVar;
        this.U = ImBgSyncState.CONNECTED;
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        finish();
        return true;
    }

    public final int eo() {
        int i = b.$EnumSwitchMapping$0[this.U.ordinal()];
        if (i != 1 && i != 2) {
            return R.string.vkim_dialogs_header_shared_chats;
        }
        r6m.a.getClass();
        return r6m.j() ? R.string.vkim_sync_state_connecting_dots : R.string.vkim_sync_state_wait_for_network_dots;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            throw new IllegalStateException("no dialog in arguments");
        }
        Bundle bundle2 = arguments.getBundle("dialog_ext_state");
        Peer peer = (Peer) bundle2.getParcelable("dialog_id");
        long j = peer != null ? peer.b : 0L;
        DialogExt dialogExt = (DialogExt) com.vk.core.util.state.a.b(DialogExt.class, bundle2, bundle2.getString("dialog_ext_state_key"));
        if (dialogExt == null) {
            dialogExt = new DialogExt(j, (ProfilesInfo) null, 2, (zcl) null);
        }
        this.R = dialogExt;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.vkim_shared_chats_fragment, viewGroup, false);
        Toolbar toolbar = (Toolbar) viewGroup2.findViewById(R.id.toolbar);
        toolbar.setTitle(eo());
        FragmentActivity kn = kn();
        HashSet hashSet = iah0.a;
        toolbar.setNavigationIcon(fnj.d(kn) ? null : e3m.e(R.attr.im_ic_back_toolbar, toolbar.getContext()));
        toolbar.setNavigationOnClickListener(new gmp(this, 8));
        this.Q = toolbar;
        zdw zdwVar = this.P;
        odv0 f = zdwVar.f();
        a1w a1wVar = zdwVar.b;
        k0 o = f.a.d.o();
        LayoutInflater p = zdwVar.f().a.d.p();
        mxv d = zdwVar.d();
        ltm.a.getClass();
        vtm vtmVar = new vtm(o, p, d, this.P, null, false, ltm.a.b);
        vtmVar.c((ViewStub) viewGroup2.findViewById(R.id.im_shared_chats_list_stub));
        this.S = vtmVar;
        Context requireContext = requireContext();
        DialogExt dialogExt = this.R;
        x9j0 x9j0Var = new x9j0(requireContext, dialogExt == null ? null : dialogExt, new y9j0(a1wVar, dialogExt != null ? dialogExt : null));
        x9j0Var.i = this;
        x9j0Var.c(vtmVar);
        this.T = x9j0Var;
        this.N.b(a1wVar.l.a().b0(u180.class).a0(asu0.a.d()).subscribe(new k2y(new w910(this, 26), 15), new lw30(new ioh(1, L.a, L.class, Logger.METHOD_W, "w(Ljava/lang/Throwable;[Ljava/lang/Object;)V", 0, 2), 12)));
        return viewGroup2;
    }

    @Override // com.vk.im.ui.fragments.ImFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        x9j0 x9j0Var = this.T;
        if (x9j0Var != null) {
            x9j0Var.e();
        }
        x9j0 x9j0Var2 = this.T;
        if (x9j0Var2 != null) {
            x9j0Var2.d();
        }
        x9j0 x9j0Var3 = this.T;
        if (x9j0Var3 != null) {
            x9j0Var3.i = null;
        }
        this.T = null;
        vtm vtmVar = this.S;
        if (vtmVar != null) {
            vtmVar.d();
        }
        this.S = null;
    }

    @Override // com.vk.im.ui.fragments.ImFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        x9j0 x9j0Var = this.T;
        if (x9j0Var != null) {
            x9j0Var.g();
        }
    }

    @Override // com.vk.im.ui.fragments.ImFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        x9j0 x9j0Var = this.T;
        if (x9j0Var != null) {
            x9j0Var.h();
        }
    }
}
