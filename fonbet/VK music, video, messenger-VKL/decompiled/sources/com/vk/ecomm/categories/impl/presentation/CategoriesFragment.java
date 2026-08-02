package com.vk.ecomm.categories.impl.presentation;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.a;
import androidx.compose.runtime.f;
import com.vk.core.fragments.FragmentImpl;
import com.vk.ecomm.api.analytics.MarketAnalyticsParams;
import com.vk.ecomm.catalog.api.di.ClassifiedsComponent;
import com.vk.ecomm.categories.api.MarketBridgeCategory;
import com.vk.movika.sdk.base.logic.interactor.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.b6l;
import xsna.bpn0;
import xsna.d7;
import xsna.dhc;
import xsna.dka;
import xsna.epx;
import xsna.fja;
import xsna.fpf0;
import xsna.g5z;
import xsna.izs;
import xsna.kai;
import xsna.l71;
import xsna.m7m;
import xsna.mja;
import xsna.ngc;
import xsna.nzw;
import xsna.oz50;
import xsna.pja;
import xsna.qcy;
import xsna.r37;
import xsna.rpo0;
import xsna.rsr;
import xsna.s3q0;
import xsna.spj;
import xsna.tci;
import xsna.wzs;
import xsna.xm1;

/* compiled from: CategoriesFragment.kt */
/* loaded from: classes18.dex */
public final class CategoriesFragment extends FragmentImpl {
    public static final /* synthetic */ qcy<Object>[] P;
    public final nzw N = new nzw(fpf0.d(dka.class).toString(), this, new j(this, 15));
    public final bpn0 O = new bpn0(new xm1(this, 11));

    /* compiled from: CategoriesFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: CategoriesFragment.kt */
    public static final class b extends rpo0 {
        public final dka m;
        public final String n;

        public b(Context context, dka dkaVar, String str) {
            super(context, null, 6, 0);
            this.m = dkaVar;
            this.n = str;
        }

        @Override // xsna.rpo0
        public final void A(int i, androidx.compose.runtime.a aVar) {
            androidx.compose.runtime.a M = aVar.M(356831673);
            int i2 = (M.J(this) ? 4 : 2) | i;
            if (M.t(i2 & 1, (i2 & 3) != 2)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(356831673, i2, -1, "com.vk.ecomm.categories.impl.presentation.CategoriesFragment.ContentView.ThemedContent (CategoriesFragment.kt:90)");
                }
                boolean z = (i2 & 14) == 4;
                Object x = M.x();
                if (z || x == a.C0011a.a) {
                    x = new d7(this, 15);
                    M.R(x);
                }
                r37.a((izs) x, null, kai.c(-172681545, new pja(this, 0), M), M, 384, 2);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            f s = M.s();
            if (s != null) {
                s.d = new l71(this, i, 2);
            }
        }
    }

    /* compiled from: CategoriesFragment.kt */
    @b6l(c = "com.vk.ecomm.categories.impl.presentation.CategoriesFragment$onCreate$1", f = "CategoriesFragment.kt", l = {}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements wzs<mja, spj<? super s3q0>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public c(spj<? super c> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            c cVar = CategoriesFragment.this.new c(spjVar);
            cVar.L$0 = obj;
            return cVar;
        }

        @Override // xsna.wzs
        public final Object invoke(mja mjaVar, spj<? super s3q0> spjVar) {
            return ((c) create(mjaVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            mja mjaVar = (mja) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            if (epx.f(mjaVar, mja.a.a)) {
                CategoriesFragment.this.finish();
            } else {
                if (!(mjaVar instanceof mja.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                CategoriesFragment categoriesFragment = CategoriesFragment.this;
                MarketBridgeCategory marketBridgeCategory = ((mja.b) mjaVar).a;
                qcy<Object>[] qcyVarArr = CategoriesFragment.P;
                categoriesFragment.getClass();
                dhc dc = ((ClassifiedsComponent) m7m.d(categoriesFragment).a(fpf0.a(ClassifiedsComponent.class))).dc();
                Context requireContext = categoriesFragment.requireContext();
                String str = marketBridgeCategory.c;
                int i = marketBridgeCategory.b;
                dc.d(requireContext, new ngc(Integer.valueOf(i), "category", null, null, null, null, null, null, null, null, (MarketAnalyticsParams) categoriesFragment.O.getValue(), null, false, str, 3604474));
            }
            return s3q0.a;
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(CategoriesFragment.class, SignalingProtocol.KEY_FEATURE, "getFeature()Lcom/vk/ecomm/categories/impl/presentation/mvi2/CategoriesStore;", 0);
        fpf0.a.getClass();
        P = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        qcy<Object> qcyVar = P[0];
        dka dkaVar = (dka) this.N.getValue();
        dkaVar.b.b(fja.a.b);
        return true;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        qcy<Object> qcyVar = P[0];
        rsr.s(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(tci.k((dka) this.N.getValue()), new c(null)), g5z.a(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        Context requireContext = requireContext();
        qcy<Object> qcyVar = P[0];
        dka dkaVar = (dka) this.N.getValue();
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("title")) == null) {
            str = "";
        }
        return new b(requireContext, dkaVar, str);
    }
}
