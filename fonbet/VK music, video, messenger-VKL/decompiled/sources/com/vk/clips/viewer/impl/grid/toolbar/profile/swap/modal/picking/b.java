package com.vk.clips.viewer.impl.grid.toolbar.profile.swap.modal.picking;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.ao50;
import xsna.cja0;
import xsna.cpo;
import xsna.dhr0;
import xsna.dw20;
import xsna.e43;
import xsna.eja0;
import xsna.fpf0;
import xsna.gja0;
import xsna.hg10;
import xsna.hja0;
import xsna.iah0;
import xsna.ija0;
import xsna.km50;
import xsna.mk50;
import xsna.nf3;
import xsna.p4g;
import xsna.p5j;
import xsna.qcy;
import xsna.t50;
import xsna.tl50;
import xsna.tzp0;
import xsna.u3u;
import xsna.vk50;
import xsna.xqi;
import xsna.yfb;

/* compiled from: ProfilePickerBottomSheet.kt */
/* loaded from: classes17.dex */
public final class b extends tl50<eja0, ija0, cja0> {
    public static final /* synthetic */ qcy<Object>[] m1 = {new MutablePropertyReference1Impl(b.class, "contentView", "getContentView()Lcom/vk/clips/viewer/impl/grid/toolbar/profile/swap/modal/picking/GroupPickerBottomSheetContent;", 0), p5j.a(0, b.class, "renderHolder", "getRenderHolder()Lcom/vk/mvi/compose/render/ComposeStateRenderHolder;", fpf0.a)};
    public final nf3 i1 = new nf3();
    public final nf3 j1 = new nf3();
    public Object k1 = EmptyList.b;
    public boolean l1;

    /* compiled from: ProfilePickerBottomSheet.kt */
    public static final class a extends dw20.b {
        public final ArrayList e;

        public a(Context context) {
            super(context, tzp0.a(null, 3));
            this.e = new ArrayList();
            c(new cpo(false, iah0.a(150), 3));
            v0(R.string.clips_profile_switch_picker_title);
            int Y = dhr0.Y(R.attr.vk_ui_background_content, this.c);
            l(Y);
            S(Y);
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            b bVar = new b();
            bVar.setArguments(yfb.b(new Pair("picker_items", p4g.q(this.e)), new Pair("picker_dark", Boolean.valueOf(dhr0.a.c(this.c)))));
            return bVar;
        }
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        qcy<Object>[] qcyVarArr = m1;
        com.vk.clips.viewer.impl.grid.toolbar.profile.swap.modal.picking.a aVar = new com.vk.clips.viewer.impl.grid.toolbar.profile.swap.modal.picking.a((xqi) this.j1.getValue(this, qcyVarArr[1]), this.l1, requireContext(), this);
        qcy<Object> qcyVar = qcyVarArr[0];
        nf3 nf3Var = this.i1;
        nf3Var.c = aVar;
        return new mk50.c(((com.vk.clips.viewer.impl.grid.toolbar.profile.swap.modal.picking.a) nf3Var.getValue(this, qcyVar)).c());
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        ((com.vk.clips.viewer.impl.grid.toolbar.profile.swap.modal.picking.a) this.i1.getValue(this, m1[0])).f((ija0) ao50Var, new t50(1, this, b.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 11));
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((eja0) vk50Var).h.a(new u3u(this, 29), this);
    }

    @Override // xsna.dw20, xsna.dh6, androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        FragmentManager parentFragmentManager = getParentFragmentManager();
        eja0 feature = getFeature();
        S s = feature.f.c;
        hja0.b bVar = s instanceof hja0.b ? (hja0.b) s : null;
        parentFragmentManager.k0(yfb.b(new Pair("picker_bs_profiles_selected", p4g.q(bVar != null ? eja0.U(bVar.b) : eja0.U(feature.g)))), "picker_bs_result_req_key");
        getFeature().C(cja0.a.b);
        super.onDismiss(dialogInterface);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        Object parcelableArrayList = bundle.getParcelableArrayList("picker_items");
        if (parcelableArrayList == null) {
            parcelableArrayList = EmptyList.b;
        }
        this.k1 = parcelableArrayList;
        this.l1 = bundle.getBoolean("picker_dark", false);
        gja0 gja0Var = new gja0(new hja0.b(hg10.r((Iterable) this.k1)));
        eja0 eja0Var = new eja0(gja0Var, this.k1);
        VS vs = gja0Var.b;
        xqi xqiVar = new xqi(ija0.a.C3056a.a, this, e43.l(((ija0) vs).a, ((ija0) vs).b));
        qcy<Object> qcyVar = m1[1];
        this.j1.c = xqiVar;
        return eja0Var;
    }
}
