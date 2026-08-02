package com.vk.im.ui.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentActivity;
import com.vk.bridges.ImageViewer;
import com.vk.core.fragments.BaseFragment;
import com.vk.core.serialize.Serializer;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.donut.price.api.di.DonutPriceComponent;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.messages.MsgIdType;
import com.vk.im.chat.restriction.api.ChatWriteRestrictionFeatureComponent;
import com.vk.im.engine.di.scope.ImFeatureScopeProviderComponent;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.messages.CnvMsgId;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.engine.models.messages.PinnedMsg;
import com.vk.im.messageviews.api.MessageViewsFeatureComponent;
import com.vk.im.ui.components.msg_view.header.MsgViewHeaderComponent;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.a1w;
import xsna.alm;
import xsna.asu0;
import xsna.bpn0;
import xsna.cnh;
import xsna.cr20;
import xsna.dhr0;
import xsna.dj30;
import xsna.eam;
import xsna.f1w;
import xsna.flu;
import xsna.fpf0;
import xsna.g2v;
import xsna.ham;
import xsna.hg1;
import xsna.i7o0;
import xsna.ies;
import xsna.j140;
import xsna.jbs;
import xsna.js4;
import xsna.k9q0;
import xsna.kkm;
import xsna.l500;
import xsna.l7m;
import xsna.lzv;
import xsna.m7m;
import xsna.msy;
import xsna.mu1;
import xsna.mxv;
import xsna.myc0;
import xsna.n34;
import xsna.o0w;
import xsna.op5;
import xsna.os30;
import xsna.owv;
import xsna.oz50;
import xsna.ql30;
import xsna.r010;
import xsna.rlh;
import xsna.sfj;
import xsna.sxv;
import xsna.t6g0;
import xsna.uxv;
import xsna.v1o;
import xsna.vm30;
import xsna.w530;
import xsna.x620;
import xsna.xal;
import xsna.xq;
import xsna.xwv;
import xsna.ya20;
import xsna.z8;
import xsna.zcl;
import xsna.zdw;

/* compiled from: MsgViewFragment.kt */
/* loaded from: classes2.dex */
public final class MsgViewFragment extends BaseFragment implements ies, eam {
    public static final /* synthetic */ int i0 = 0;
    public final Object S;
    public final mxv T;
    public final bpn0 U;
    public final bpn0 V;
    public final bpn0 W;
    public final zdw X;
    public final js4 Y;
    public MsgViewHeaderComponent Z;
    public j140 a0;
    public ViewGroup b0;
    public ViewGroup c0;
    public int d0;
    public alm e0;
    public ham f0;
    public final Object g0;
    public final Object h0;

    public MsgViewFragment() {
        cnh cnhVar = new cnh(this, 23);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.S = msy.a(lazyThreadSafetyMode, cnhVar);
        this.T = g2v.c();
        this.U = new bpn0(new cr20(this, 4));
        this.V = new bpn0(new l500(this, 10));
        this.W = new bpn0(new os30(this, 1));
        zdw zdwVar = i7o0.b;
        zdwVar = zdwVar == null ? null : zdwVar;
        this.X = zdwVar;
        zdwVar.j.getClass();
        this.Y = new xwv();
        this.g0 = msy.a(lazyThreadSafetyMode, new r010(this, 8));
        this.h0 = msy.a(lazyThreadSafetyMode, new flu(this, 19));
    }

    @Override // xsna.eam
    public final void Dd(boolean z) {
        j140 j140Var = this.a0;
        if (j140Var == null) {
            j140Var = null;
        }
        vm30 vm30Var = j140Var.R;
        if (vm30Var != null) {
            vm30Var.p(z);
        }
    }

    public final void io(MsgFromUser msgFromUser, DialogExt dialogExt) {
        MsgViewHeaderComponent msgViewHeaderComponent = this.Z;
        if (msgViewHeaderComponent == null) {
            msgViewHeaderComponent = null;
        }
        msgViewHeaderComponent.l = this.d0 == 1 ? MsgViewHeaderComponent.Type.PINNED : MsgViewHeaderComponent.Type.DEFAULT;
        if (msgViewHeaderComponent.m != null) {
            msgViewHeaderComponent.Y0();
        }
        j140 j140Var = this.a0;
        (j140Var != null ? j140Var : null).a1(msgFromUser, dialogExt.b);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        ArrayList arrayList;
        DialogExt dialogExt;
        Bundle bundleExtra;
        Peer peer;
        if (i2 == -1 && i == 201) {
            long j = (intent == null || (peer = (Peer) intent.getParcelableExtra("dialog_id")) == null) ? 0L : peer.b;
            if (intent == null || (bundleExtra = intent.getBundleExtra("arguments")) == null || (arrayList = bundleExtra.getParcelableArrayList("fwd_ids")) == null) {
                arrayList = new ArrayList();
            }
            ArrayList arrayList2 = arrayList;
            if (intent != null) {
                Bundle bundle = intent.getExtras().getBundle("dialog_ext_state");
                Peer peer2 = (Peer) bundle.getParcelable("dialog_id");
                long j2 = peer2 != null ? peer2.b : 0L;
                DialogExt dialogExt2 = (DialogExt) com.vk.core.util.state.a.b(DialogExt.class, bundle, bundle.getString("dialog_ext_state_key"));
                if (dialogExt2 == null) {
                    dialogExt2 = new DialogExt(j2, (ProfilesInfo) null, 2, (zcl) null);
                }
                dialogExt = dialogExt2;
            } else {
                dialogExt = new DialogExt(j, (ProfilesInfo) null, 2, (zcl) null);
            }
            o0w.x(g2v.c().b(), kn(), null, dialogExt.e, dialogExt, null, null, false, null, null, arrayList2, null, null, null, "share", null, null, null, false, null, null, null, null, null, 1073733106);
        }
    }

    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v23, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v25, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        x k;
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        Bundle bundle2 = requireArguments.getBundle("dialog_ext_state");
        Peer peer = (Peer) bundle2.getParcelable("dialog_id");
        long j = peer != null ? peer.b : 0L;
        DialogExt dialogExt = (DialogExt) com.vk.core.util.state.a.b(DialogExt.class, bundle2, bundle2.getString("dialog_ext_state_key"));
        DialogExt dialogExt2 = dialogExt == null ? new DialogExt(j, (ProfilesInfo) null, 2, (zcl) null) : dialogExt;
        zdw zdwVar = i7o0.b;
        if (zdwVar == null) {
            zdwVar = null;
        }
        dhr0 dhr0Var = zdwVar.f;
        bpn0 bpn0Var = this.U;
        a1w a1wVar = (a1w) bpn0Var.getValue();
        zdw zdwVar2 = i7o0.b;
        if (zdwVar2 == null) {
            zdwVar2 = null;
        }
        alm almVar = new alm(dhr0Var, a1wVar, zdwVar2.u, dialogExt2);
        almVar.c(getLifecycle());
        this.e0 = almVar;
        this.f0 = new ham(almVar.g, this);
        this.Y.c();
        MsgViewHeaderComponent msgViewHeaderComponent = new MsgViewHeaderComponent(kn(), (a1w) bpn0Var.getValue(), dialogExt2);
        msgViewHeaderComponent.n = new op5(this);
        this.Z = msgViewHeaderComponent;
        FragmentActivity kn = kn();
        a1w a1wVar2 = (a1w) bpn0Var.getValue();
        bpn0 bpn0Var2 = this.W;
        lzv lzvVar = (lzv) bpn0Var2.getValue();
        jbs jbsVar = new jbs(this);
        mxv mxvVar = this.T;
        xal m = mxvVar.m();
        FragmentActivity kn2 = kn();
        bpn0 bpn0Var3 = this.V;
        sxv sxvVar = new sxv(dialogExt2, mxvVar, kn2, ((f1w) bpn0Var3.getValue()).a());
        uxv uxvVar = new uxv(dialogExt2, mxvVar, kn(), ((f1w) bpn0Var3.getValue()).a());
        t6g0 t6g0Var = t6g0.b;
        boolean K0 = t6g0.d().K0();
        alm almVar2 = this.e0;
        if (almVar2 == null) {
            almVar2 = null;
        }
        kkm kkmVar = almVar2.g;
        l7m d = m7m.d(this);
        this.a0 = new j140(kn, dialogExt2, a1wVar2, lzvVar, mxvVar, this.X, jbsVar, this.Y, m, sxvVar, uxvVar, K0, kkmVar, new ql30(((ChatWriteRestrictionFeatureComponent) xq.f((ImFeatureScopeProviderComponent) d.a(fpf0.a(ImFeatureScopeProviderComponent.class)), (Peer) this.S.getValue(), d).a(fpf0.a(ChatWriteRestrictionFeatureComponent.class))).G8(), ((MessageViewsFeatureComponent) m7m.d(this).mo408a(fpf0.a(MessageViewsFeatureComponent.class))).y4()), new v1o(requireContext(), ((DonutPriceComponent) m7m.d(this).a(fpf0.a(DonutPriceComponent.class))).kf()), (ya20) this.h0.getValue(), (w530) this.g0.getValue());
        mu1 mu1Var = new mu1(19, this, dialogExt2);
        int i = requireArguments.getInt("type");
        this.d0 = i;
        if (i == 1) {
            PinnedMsg pinnedMsg = (PinnedMsg) requireArguments.getParcelable(NotificationCompat.CATEGORY_MESSAGE);
            if (pinnedMsg == null) {
                throw new IllegalArgumentException("Empty parcelable KEY_MSG");
            }
            k = x.k(new MsgFromUser(pinnedMsg, ((f1w) bpn0Var3.getValue()).a().d));
        } else if (i == 2) {
            NestedMsg nestedMsg = (NestedMsg) requireArguments.getParcelable(NotificationCompat.CATEGORY_MESSAGE);
            if (nestedMsg == null) {
                throw new IllegalArgumentException("Empty parcelable KEY_MSG");
            }
            k = x.k(new MsgFromUser(nestedMsg));
        } else if (i != 3) {
            k = x.i(new IllegalArgumentException("Unknown msg type: " + this.d0));
        } else if (requireArguments.containsKey(NotificationCompat.CATEGORY_MESSAGE)) {
            k = x.k((MsgFromUser) requireArguments.getParcelable(NotificationCompat.CATEGORY_MESSAGE));
        } else {
            CnvMsgId cnvMsgId = (CnvMsgId) requireArguments.getParcelable("msg_id");
            lzv lzvVar2 = (lzv) bpn0Var2.getValue();
            MsgIdType msgIdType = MsgIdType.CNV_ID;
            List singletonList = Collections.singletonList(Integer.valueOf(cnvMsgId.c));
            long j2 = cnvMsgId.b;
            Serializer.c<Peer> cVar = Peer.CREATOR;
            x b = lzvVar2.b(this, new dj30(msgIdType, singletonList, Peer.a.b(j2), Source.CACHE, false, null, 48));
            asu0 asu0Var = asu0.a;
            k = b.q(asu0Var.c()).m(asu0Var.d()).l(new z8(new x620(5), 21));
        }
        this.P.b(hg1.i(k, new owv(mu1Var, 9)));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.vkim_pinned_msg_view, viewGroup, false);
        ham hamVar = this.f0;
        if (hamVar == null) {
            hamVar = null;
        }
        hamVar.d(inflate);
        this.b0 = (ViewGroup) inflate.findViewById(R.id.header_container);
        this.c0 = (ViewGroup) inflate.findViewById(R.id.content_container);
        MsgViewHeaderComponent msgViewHeaderComponent = this.Z;
        (msgViewHeaderComponent == null ? null : msgViewHeaderComponent).n = new op5(this);
        if (msgViewHeaderComponent == null) {
            msgViewHeaderComponent = null;
        }
        this.b0.addView(msgViewHeaderComponent.F0(this.b0, bundle));
        Bundle bundle2 = requireArguments().getBundle("dialog_ext_state");
        Peer peer = (Peer) bundle2.getParcelable("dialog_id");
        long j = peer != null ? peer.b : 0L;
        DialogExt dialogExt = (DialogExt) com.vk.core.util.state.a.b(DialogExt.class, bundle2, bundle2.getString("dialog_ext_state_key"));
        if (dialogExt == null) {
            dialogExt = new DialogExt(j, (ProfilesInfo) null, 2, (zcl) null);
        }
        j140 j140Var = this.a0;
        if (j140Var == null) {
            j140Var = null;
        }
        a1w a1wVar = (a1w) this.U.getValue();
        ImageViewer d = myc0.d();
        j140 j140Var2 = this.a0;
        j140Var.S = new sfj(this, a1wVar, this.T, d, j140Var2 == null ? null : j140Var2, dialogExt.Bb());
        j140 j140Var3 = this.a0;
        if (j140Var3 == null) {
            j140Var3 = null;
        }
        this.c0.addView(j140Var3.F0(this.c0, bundle));
        alm almVar = this.e0;
        (almVar != null ? almVar : null).e();
        return inflate;
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        MsgViewHeaderComponent msgViewHeaderComponent = this.Z;
        if (msgViewHeaderComponent == null) {
            msgViewHeaderComponent = null;
        }
        msgViewHeaderComponent.G0();
        j140 j140Var = this.a0;
        (j140Var != null ? j140Var : null).G0();
        this.Y.release();
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        MsgViewHeaderComponent msgViewHeaderComponent = this.Z;
        (msgViewHeaderComponent == null ? null : msgViewHeaderComponent).n = null;
        if (msgViewHeaderComponent == null) {
            msgViewHeaderComponent = null;
        }
        msgViewHeaderComponent.H0();
        j140 j140Var = this.a0;
        (j140Var == null ? null : j140Var).S = null;
        if (j140Var == null) {
            j140Var = null;
        }
        j140Var.H0();
        this.b0.removeAllViews();
        this.b0 = null;
        this.c0.removeAllViews();
        this.c0 = null;
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        j140 j140Var = this.a0;
        if (j140Var == null) {
            j140Var = null;
        }
        j140Var.W0();
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        j140 j140Var = this.a0;
        if (j140Var == null) {
            j140Var = null;
        }
        j140Var.V0();
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        int i = this.d0;
        uiTrackingScreen.a = i != 1 ? i != 2 ? MobileOfficialAppsCoreNavStat$EventScreen.NOWHERE : MobileOfficialAppsCoreNavStat$EventScreen.IM_NESTED_MESSAGE : MobileOfficialAppsCoreNavStat$EventScreen.IM_PINNED_MESSAGE;
    }

    /* compiled from: MsgViewFragment.kt */
    public static final class a extends oz50 {
        public a() {
            super(MsgViewFragment.class, null, null);
        }

        public a(Serializer.StreamParcelableAdapter streamParcelableAdapter, int i, DialogExt dialogExt, Peer peer) {
            this();
            this.j.putParcelable(NotificationCompat.CATEGORY_MESSAGE, streamParcelableAdapter);
            this.j.putInt("type", i);
            n34.w(this.j, dialogExt, null);
            this.j.putParcelable("owner_id", peer);
        }

        public a(PinnedMsg pinnedMsg, DialogExt dialogExt, Peer peer) {
            this(pinnedMsg, 1, dialogExt, peer);
        }

        public a(NestedMsg nestedMsg, DialogExt dialogExt, Peer peer) {
            this(nestedMsg, 2, dialogExt, peer);
        }

        public a(MsgFromUser msgFromUser, DialogExt dialogExt, Peer peer) {
            this();
            int i = MsgViewFragment.i0;
            Ref$IntRef ref$IntRef = new Ref$IntRef();
            msgFromUser.i2(new rlh(ref$IntRef, 27), true);
            if (ref$IntRef.element < 10) {
                this.j.putParcelable(NotificationCompat.CATEGORY_MESSAGE, msgFromUser);
            } else {
                this.j.putParcelable("msg_id", k9q0.n(msgFromUser));
            }
            this.j.putInt("type", 3);
            n34.w(this.j, dialogExt, null);
            this.j.putParcelable("owner_id", peer);
        }
    }
}
