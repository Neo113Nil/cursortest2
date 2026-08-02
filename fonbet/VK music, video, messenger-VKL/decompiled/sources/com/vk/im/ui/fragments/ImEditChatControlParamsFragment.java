package com.vk.im.ui.fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.ui.components.chat_controls.ChatControls;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.x;
import xsna.a1w;
import xsna.aj6;
import xsna.eqb;
import xsna.hg1;
import xsna.ies;
import xsna.k7f;
import xsna.oce;
import xsna.oz50;
import xsna.q1w;
import xsna.s3q0;
import xsna.uqm;
import xsna.y7;
import xsna.zcl;

/* compiled from: ImEditChatControlParamsFragment.kt */
/* loaded from: classes2.dex */
public final class ImEditChatControlParamsFragment extends ImFragment implements ies {
    public static final /* synthetic */ int R = 0;
    public DialogExt P;
    public eqb Q;

    /* compiled from: ImEditChatControlParamsFragment.kt */
    public static final class a extends oz50 {
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        Intent intent = new Intent();
        eqb eqbVar = this.Q;
        if (eqbVar == null) {
            eqbVar = null;
        }
        intent.putExtra("chat_controls", eqbVar.l);
        s3q0 s3q0Var = s3q0.a;
        Mf(-1, intent);
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Peer peer;
        x n;
        View inflate = layoutInflater.inflate(R.layout.vkim_fragment_chat_controls, viewGroup, false);
        Bundle bundle2 = requireArguments().getBundle("dialog_ext_state");
        Peer peer2 = (Peer) bundle2.getParcelable("dialog_id");
        long j = peer2 != null ? peer2.b : 0L;
        DialogExt dialogExt = (DialogExt) com.vk.core.util.state.a.b(DialogExt.class, bundle2, bundle2.getString("dialog_ext_state_key"));
        if (dialogExt == null) {
            dialogExt = new DialogExt(j, (ProfilesInfo) null, 2, (zcl) null);
        }
        this.P = dialogExt;
        ((Toolbar) inflate.findViewById(R.id.toolbar)).setNavigationOnClickListener(new aj6(this, 3));
        DialogExt dialogExt2 = this.P;
        if (dialogExt2 == null) {
            dialogExt2 = null;
        }
        ChatSettings Bb = dialogExt2.Bb();
        if (Bb == null || (peer = Bb.d) == null) {
            Serializer.c<Peer> cVar = Peer.CREATOR;
            peer = Peer.Unknown.e;
        }
        eqb eqbVar = new eqb(new ChatControls(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null), null, peer, 10);
        this.Q = eqbVar;
        this.O.add(eqbVar);
        Context requireContext = requireContext();
        DialogExt dialogExt3 = this.P;
        if (dialogExt3 == null) {
            dialogExt3 = null;
        }
        if (dialogExt3.Cb() != null) {
            n = x.k(dialogExt3);
        } else {
            a1w a1wVar = q1w.a;
            if (a1wVar == null) {
                a1wVar = null;
            }
            n = hg1.n(a1wVar.E("DialogBundle", new uqm(dialogExt3.f, Source.ACTUAL)).l(new y7(new oce(dialogExt3, 16), 17)), requireContext, false, null, 62);
        }
        this.N.b(hg1.i(n, new k7f(this, 19)));
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.container);
        eqb eqbVar2 = this.Q;
        viewGroup2.addView((eqbVar2 != null ? eqbVar2 : null).F0(viewGroup2, bundle));
        return inflate;
    }
}
