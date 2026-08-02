package com.vk.im.ui.fragments;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.vk.bridges.ImageViewer;
import com.vk.core.apps.BuildInfo;
import com.vk.core.fragments.internal.transition.impl.TransitionAnimationSimple$Companion$Type;
import com.vk.dto.common.Peer;
import com.vk.im.engine.di.ImCmdRxExecutorScopedComponent;
import com.vk.im.engine.di.scope.ImFeatureScopeProviderComponent;
import com.vk.im.engine.di.scope.ImScopeImpl;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.DialogExt;
import kotlin.LazyThreadSafetyMode;
import xsna.a1w;
import xsna.alm;
import xsna.b25;
import xsna.cew;
import xsna.dhr0;
import xsna.fpf0;
import xsna.g2v;
import xsna.i7o0;
import xsna.jbs;
import xsna.kbj0;
import xsna.l7m;
import xsna.lzv;
import xsna.m7m;
import xsna.mbm;
import xsna.msy;
import xsna.mxv;
import xsna.myc0;
import xsna.n34;
import xsna.no;
import xsna.nr4;
import xsna.o25;
import xsna.oz50;
import xsna.q1w;
import xsna.too0;
import xsna.vxd0;
import xsna.wqx0;
import xsna.xq;
import xsna.zcl;
import xsna.zdw;
import xsna.zwb;

/* compiled from: ChatProfileFragment.kt */
/* loaded from: classes2.dex */
public final class ChatProfileFragment extends ImFragment implements zwb.a, too0 {
    public static final /* synthetic */ int T = 0;
    public zwb P;
    public DialogExt Q;
    public alm R;
    public final Object S = msy.a(LazyThreadSafetyMode.NONE, new no(this, 17));

    /* compiled from: ChatProfileFragment.kt */
    public static final class a extends oz50 {
        public a(DialogExt dialogExt, boolean z, Peer peer) {
            super(ChatProfileFragment.class, null, null);
            n34.w(this.j, dialogExt, null);
            this.j.putParcelable("owner_id", peer);
            if (z) {
                u(TransitionAnimationSimple$Companion$Type.SLIDE_FROM_RIGHT.h());
            }
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.too0
    public final void Ng() {
        zwb zwbVar = this.P;
        if (zwbVar == null) {
            zwbVar = null;
        }
        if (zwbVar.d) {
            zwbVar.X0().m();
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final void Vn() {
        wqx0.b(requireView());
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean Wn(Rect rect, Rect rect2) {
        if (this.x) {
            zwb zwbVar = this.P;
            (zwbVar != null ? zwbVar : null).X0().b(rect, rect2);
            return false;
        }
        zwb zwbVar2 = this.P;
        (zwbVar2 != null ? zwbVar2 : null).X0().d(rect2);
        return true;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        zwb zwbVar = this.P;
        if (zwbVar == null) {
            zwbVar = null;
        }
        zwbVar.m.onActivityResult(i, i2, intent);
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        a1w a1wVar;
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
        this.Q = dialogExt;
        a1w a1wVar2 = (!(BuildInfo.s() && ((Peer) this.S.getValue()).Ab(Peer.Type.GROUP)) ? (a1wVar = q1w.a) != null : (a1wVar = q1w.b) != null) ? null : a1wVar;
        l7m d = m7m.d(this);
        lzv g = ((ImCmdRxExecutorScopedComponent) xq.f((ImFeatureScopeProviderComponent) d.a(fpf0.a(ImFeatureScopeProviderComponent.class)), (Peer) this.S.getValue(), d).a(fpf0.a(ImCmdRxExecutorScopedComponent.class))).g();
        ImScopeImpl a2 = ((ImFeatureScopeProviderComponent) m7m.d(this).a(fpf0.a(ImFeatureScopeProviderComponent.class))).getProvider().a((Peer) this.S.getValue());
        zdw zdwVar = i7o0.b;
        dhr0 dhr0Var = (zdwVar != null ? zdwVar : null).f;
        if (zdwVar == null) {
            zdwVar = null;
        }
        cew cewVar = zdwVar.u;
        DialogExt dialogExt2 = this.Q;
        if (dialogExt2 == null) {
            dialogExt2 = null;
        }
        alm almVar = new alm(dhr0Var, a1wVar2, cewVar, dialogExt2);
        almVar.c(getLifecycle());
        this.R = almVar;
        FragmentActivity kn = kn();
        Context requireContext = requireContext();
        DialogExt dialogExt3 = this.Q;
        DialogExt dialogExt4 = dialogExt3 == null ? null : dialogExt3;
        kbj0 b = nr4.b();
        mxv c = g2v.c();
        zdw zdwVar2 = i7o0.b;
        zdw zdwVar3 = zdwVar2 != null ? zdwVar2 : null;
        ImageViewer d2 = myc0.d();
        jbs jbsVar = new jbs(this);
        b25 a3 = o25.a();
        alm almVar2 = this.R;
        if (almVar2 == null) {
            almVar2 = null;
        }
        zwb zwbVar = new zwb(requireContext(), new vxd0.b(kn, requireContext, dialogExt4, a2, a1wVar2, g, b, c, zdwVar3, d2, jbsVar, a3, almVar2.g), false, a1wVar2.r().h);
        this.P = zwbVar;
        this.O.add(zwbVar);
        zwb zwbVar2 = this.P;
        (zwbVar2 != null ? zwbVar2 : null).k = this;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        zwb zwbVar = this.P;
        if (zwbVar == null) {
            zwbVar = null;
        }
        View D0 = zwbVar.D0(layoutInflater.getContext(), viewGroup, null, bundle);
        DialogExt dialogExt = this.Q;
        mbm.c.a((dialogExt != null ? dialogExt : null).f);
        return D0;
    }
}
