package com.vk.ecomm.reviews.impl.marketitem.createreview.presentation;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.LruCache;
import android.view.View;
import com.vk.core.performance.score.PerformanceScoreProduct;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.ecomm.reviews.api.di.ReviewsComponent;
import com.vk.ecomm.reviews.api.model.CreateMarketItemReviewArguments;
import com.vk.mvi.androidx.MviImplFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.ao50;
import xsna.bpn0;
import xsna.c5g;
import xsna.d9k;
import xsna.f4z;
import xsna.fpf0;
import xsna.fre;
import xsna.g9k;
import xsna.gbj;
import xsna.ic1;
import xsna.ies;
import xsna.ify;
import xsna.iq6;
import xsna.izs;
import xsna.km50;
import xsna.m7m;
import xsna.mk50;
import xsna.msy;
import xsna.mzp0;
import xsna.oce;
import xsna.oz50;
import xsna.p8k;
import xsna.rzp0;
import xsna.s3q0;
import xsna.sni;
import xsna.u3k;
import xsna.vk50;
import xsna.vua0;
import xsna.x8k;
import xsna.xla;
import xsna.xn50;
import xsna.yw90;
import xsna.z7k;
import xsna.zrd0;

/* compiled from: CreateMarketItemReviewFragment.kt */
/* loaded from: classes.dex */
public final class CreateMarketItemReviewFragment extends MviImplFragment<p8k, g9k, z7k> implements ies {
    public static final /* synthetic */ int U = 0;
    public final bpn0 Q;
    public final Object R;
    public d9k S;
    public final b T;

    /* compiled from: CreateMarketItemReviewFragment.kt */
    /* loaded from: classes18.dex */
    public static final class a extends oz50 {
        public a(CreateMarketItemReviewArguments createMarketItemReviewArguments) {
            super(CreateMarketItemReviewFragment.class, null, null);
            this.j.putParcelable(fpf0.a(CreateMarketItemReviewArguments.class).l(), createMarketItemReviewArguments);
        }
    }

    /* compiled from: CreateMarketItemReviewFragment.kt */
    /* loaded from: classes18.dex */
    public static final class b implements ify.a {
        public b() {
        }

        @Override // xsna.ify.a
        public final void Y0() {
            xn50.a.c(CreateMarketItemReviewFragment.this, new z7k.j(true));
        }

        @Override // xsna.ify.a
        public final void x0(int i) {
            xn50.a.c(CreateMarketItemReviewFragment.this, new z7k.j(false));
        }
    }

    /* compiled from: CreateMarketItemReviewFragment.kt */
    /* loaded from: classes18.dex */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<z7k, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(z7k z7kVar) {
            CreateMarketItemReviewFragment createMarketItemReviewFragment = (CreateMarketItemReviewFragment) this.receiver;
            createMarketItemReviewFragment.getClass();
            xn50.a.c(createMarketItemReviewFragment, z7kVar);
            return s3q0.a;
        }
    }

    public CreateMarketItemReviewFragment() {
        LruCache<UUID, mzp0> lruCache = rzp0.a;
        mzp0 mzp0Var = (mzp0) rzp0.c(UiMeasuringScreen.MARKET_ITEM_REVIEW_CREATE, null, false, 62).j();
        this.J = mzp0Var;
        if (mzp0Var != null) {
            mzp0Var.init();
        }
        zrd0 zrd0Var = zrd0.a;
        yw90 yw90Var = (yw90) zrd0.a(PerformanceScoreProduct.MARKET_ITEM_REVIEW_CREATE).j();
        yw90Var.init();
        this.L = yw90Var;
        this.Q = new bpn0(new gbj(this, 2));
        this.R = msy.a(LazyThreadSafetyMode.NONE, new u3k(this, 1));
        this.T = new b();
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        d9k d9kVar = new d9k(getViewLifecycleOwner(), requireContext(), this.J, On(), (f4z) getFeature().W());
        this.S = d9kVar;
        return new mk50.c(d9kVar.getView());
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        g9k g9kVar = (g9k) ao50Var;
        d9k d9kVar = this.S;
        if (d9kVar == null) {
            d9kVar = null;
        }
        d9kVar.f(g9kVar, new ic1(this));
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        p8k p8kVar = (p8k) vk50Var;
        ((f4z) p8kVar.W()).a(new oce(this, 13), this);
        ((f4z) p8kVar.V()).a(new fre(this, 14), this);
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        xn50.a.c(this, z7k.c.b);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v6, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.ArrayList] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        ?? r3;
        ArrayList parcelableArrayList;
        if (i2 == -1 && i == 777 && intent != null && intent.hasExtra("result_attachments")) {
            Bundle bundleExtra = intent.getBundleExtra("result_attachments");
            if (bundleExtra == null || (parcelableArrayList = bundleExtra.getParcelableArrayList("result_files")) == null) {
                r3 = 0;
            } else {
                r3 = new ArrayList(c5g.u(parcelableArrayList, 10));
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    r3.add(((Uri) it.next()).toString());
                }
            }
            if (r3 == 0) {
                r3 = EmptyList.b;
            }
            xn50.a.c(this, new z7k.f.c(r3));
        }
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        xn50.a.c(this, z7k.b.b);
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        int i = ify.a;
        ify.a(this.T);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        int i = ify.a;
        ify.g(this.T);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0044  */
    /* JADX WARN: Type inference failed for: r9v11, types: [android.os.Parcelable] */
    @Override // xsna.xn50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        Integer num;
        Bundle arguments;
        Parcelable parcelable;
        Object parcelable2;
        Parcelable parcelable3;
        Object parcelable4;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            String l = fpf0.a(CreateMarketItemReviewArguments.class).l();
            if (l == null) {
                l = "";
            }
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable4 = arguments2.getParcelable(l, CreateMarketItemReviewArguments.class);
                parcelable3 = (Parcelable) parcelable4;
            } else {
                Parcelable parcelable5 = arguments2.getParcelable(l);
                if (!(parcelable5 instanceof CreateMarketItemReviewArguments)) {
                    parcelable5 = null;
                }
                parcelable3 = (CreateMarketItemReviewArguments) parcelable5;
            }
            CreateMarketItemReviewArguments createMarketItemReviewArguments = (CreateMarketItemReviewArguments) parcelable3;
            if (createMarketItemReviewArguments != null) {
                num = createMarketItemReviewArguments.d();
                if (num == null) {
                    mzp0 mzp0Var = this.J;
                    if (mzp0Var != null) {
                        mzp0Var.k("edit_review");
                    }
                } else {
                    mzp0 mzp0Var2 = this.J;
                    if (mzp0Var2 != null) {
                        mzp0Var2.k("create_review");
                    }
                }
                arguments = getArguments();
                if (arguments != null) {
                    String l2 = fpf0.a(CreateMarketItemReviewArguments.class).l();
                    String str = l2 != null ? l2 : "";
                    if (Build.VERSION.SDK_INT >= 33) {
                        parcelable2 = arguments.getParcelable(str, CreateMarketItemReviewArguments.class);
                        parcelable = (Parcelable) parcelable2;
                    } else {
                        ?? parcelable6 = arguments.getParcelable(str);
                        parcelable = parcelable6 instanceof CreateMarketItemReviewArguments ? parcelable6 : null;
                    }
                    r1 = (CreateMarketItemReviewArguments) parcelable;
                }
                return new p8k(r1, new iq6(new xla(vua0.b())), ((ReviewsComponent) m7m.d(this).a(fpf0.a(ReviewsComponent.class))).e7(), this.J, new x8k(new sni(13)));
            }
        }
        num = null;
        if (num == null) {
        }
        arguments = getArguments();
        if (arguments != null) {
        }
        return new p8k(r1, new iq6(new xla(vua0.b())), ((ReviewsComponent) m7m.d(this).a(fpf0.a(ReviewsComponent.class))).e7(), this.J, new x8k(new sni(13)));
    }
}
