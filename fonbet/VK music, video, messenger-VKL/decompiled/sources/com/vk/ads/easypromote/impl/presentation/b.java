package com.vk.ads.easypromote.impl.presentation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.vk.ads.easypromote.impl.domain.model.FaqSource;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.ao50;
import xsna.bpn0;
import xsna.e43;
import xsna.fpf0;
import xsna.hkq;
import xsna.ifg;
import xsna.ikq;
import xsna.jfz;
import xsna.km50;
import xsna.lkq;
import xsna.lw3;
import xsna.mk50;
import xsna.nf3;
import xsna.nkq;
import xsna.qcy;
import xsna.rkq;
import xsna.skq;
import xsna.tl50;
import xsna.two;
import xsna.vk50;
import xsna.xrj;

/* compiled from: FaqBottomSheet.kt */
/* loaded from: classes14.dex */
public final class b extends tl50<ikq, skq, hkq> {
    public static final a k1;
    public static final /* synthetic */ qcy<Object>[] l1;
    public final nf3 i1 = new nf3();
    public final bpn0 j1 = new bpn0(new xrj(this, 5));

    /* compiled from: FaqBottomSheet.kt */
    public static final class a {
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(b.class, "contentView", "getContentView()Lcom/vk/ads/easypromote/impl/presentation/FaqView;", 0);
        fpf0.a.getClass();
        l1 = new qcy[]{mutablePropertyReference1Impl};
        k1 = new a();
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        rkq rkqVar = new rkq(requireContext(), this);
        qcy<Object> qcyVar = l1[0];
        nf3 nf3Var = this.i1;
        nf3Var.c = rkqVar;
        return new mk50.c(((rkq) nf3Var.getValue(this, qcyVar)).c());
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        ((rkq) this.i1.getValue(this, l1[0])).f((skq) ao50Var, new lw3(1, this, b.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 4));
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((ikq) vk50Var).f.a(new ifg(this, 16), this);
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        List l;
        bpn0 bpn0Var = this.j1;
        FaqSource faqSource = (FaqSource) bpn0Var.getValue();
        Context requireContext = requireContext();
        int i = two.$EnumSwitchMapping$0[faqSource.ordinal()];
        if (i == 1) {
            l = e43.l(new jfz(requireContext.getString(R.string.faq_budget_impact_title), requireContext.getString(R.string.faq_budget_impact_text), true), new jfz(requireContext.getString(R.string.faq_budget_ho_to_choose_title), requireContext.getString(R.string.faq_budget_ho_to_choose_text), true), new jfz(requireContext.getString(R.string.faq_budget_write_off_title), requireContext.getString(R.string.faq_budget_write_off_text), true), new jfz(requireContext.getString(R.string.faq_budget_change_title), requireContext.getString(R.string.faq_budget_change_text), true), new jfz(requireContext.getString(R.string.faq_budget_moderation_title), requireContext.getString(R.string.faq_budget_moderation_text), true));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            l = e43.l(new jfz(requireContext.getString(R.string.faq_duration_main_title), requireContext.getString(R.string.faq_duration_main_text), false), new jfz(requireContext.getString(R.string.faq_duration_heating_title), requireContext.getString(R.string.faq_duration_heating_text), false));
        }
        return new ikq(new lkq(new nkq.a(l, (FaqSource) bpn0Var.getValue())), new hkq.b(l, (FaqSource) bpn0Var.getValue()));
    }
}
