package com.vk.messagetemplates.impl.details;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.ironsource.X3;
import com.vk.core.fragments.FragmentImpl;
import com.vk.messagetemplates.impl.details.b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.bpn0;
import xsna.fpf0;
import xsna.h03;
import xsna.izs;
import xsna.jai;
import xsna.kcj0;
import xsna.l6n0;
import xsna.m2h;
import xsna.mut0;
import xsna.nzw;
import xsna.oz50;
import xsna.qcy;
import xsna.r8o0;
import xsna.rrn0;
import xsna.s3q0;
import xsna.w2j0;

/* compiled from: TemplateDetailsFragment.kt */
/* loaded from: classes3.dex */
public final class TemplateDetailsFragment extends FragmentImpl {
    public static final /* synthetic */ qcy<Object>[] R;
    public final bpn0 N = new bpn0(new rrn0(this, 2));
    public final bpn0 O = new bpn0(new kcj0(this, 5));
    public final nzw P = new nzw(fpf0.d(r8o0.class).toString(), this, new l6n0(this, 3));
    public final bpn0 Q = new bpn0(new w2j0(this, 6));

    /* compiled from: TemplateDetailsFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: TemplateDetailsFragment.kt */
    public static final class b {
        public final TemplateDetailsFragment a;

        public b(TemplateDetailsFragment templateDetailsFragment) {
            this.a = templateDetailsFragment;
        }
    }

    /* compiled from: TemplateDetailsFragment.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<com.vk.messagetemplates.impl.details.b, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(com.vk.messagetemplates.impl.details.b bVar) {
            com.vk.messagetemplates.impl.details.b bVar2 = bVar;
            b bVar3 = (b) this.receiver;
            bVar3.getClass();
            if (bVar2.equals(b.a.a)) {
                bVar3.a.finish();
            } else {
                if (!(bVar2 instanceof b.C1272b)) {
                    throw new NoWhenBranchMatchedException();
                }
                h03.b(((b.C1272b) bVar2).a);
            }
            return s3q0.a;
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(TemplateDetailsFragment.class, X3.i.U, "getStore()Lcom/vk/messagetemplates/impl/details/TemplateDetailsStore;", 0);
        fpf0.a.getClass();
        R = new qcy[]{propertyReference1Impl};
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ComposeView composeView = new ComposeView(requireContext(), null, 6);
        composeView.setViewCompositionStrategy(mut0.c.a);
        composeView.setContent(new jai(-145133714, new m2h(this, 6), true));
        return composeView;
    }
}
