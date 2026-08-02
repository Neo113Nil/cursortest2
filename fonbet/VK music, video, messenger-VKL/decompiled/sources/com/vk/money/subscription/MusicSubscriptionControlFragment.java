package com.vk.money.subscription;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.LruCache;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.billing.StorePurchasesManager;
import com.vk.common.links.LaunchContext;
import com.vk.core.apps.BuildInfo;
import com.vk.core.fragments.BaseMvpFragment;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.data.Subscription;
import com.vk.music.notifications.restriction.MusicRestrictionPopupDisplayer;
import com.vk.toggle.features.MusicFeatures;
import com.vkontakte.android.R;
import java.util.HashSet;
import java.util.UUID;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.ayn0;
import xsna.b950;
import xsna.bn40;
import xsna.c950;
import xsna.cvk;
import xsna.d950;
import xsna.et8;
import xsna.fnj;
import xsna.fym0;
import xsna.ht8;
import xsna.iah0;
import xsna.izs;
import xsna.k840;
import xsna.kt9;
import xsna.maz;
import xsna.msy;
import xsna.mzp0;
import xsna.nge0;
import xsna.obh;
import xsna.oge0;
import xsna.oz50;
import xsna.pvh;
import xsna.rzp0;
import xsna.s3q0;
import xsna.s750;
import xsna.tlo0;
import xsna.tq;
import xsna.u750;
import xsna.vm40;
import xsna.w4u;
import xsna.xwk;
import xsna.z850;

/* compiled from: MusicSubscriptionControlFragment.kt */
/* loaded from: classes3.dex */
public final class MusicSubscriptionControlFragment extends BaseMvpFragment<z850> {
    public static final /* synthetic */ int a0 = 0;
    public final Object T;
    public ayn0 U;
    public d950 V;
    public final MusicRestrictionPopupDisplayer W;
    public final u750 X;
    public final Object Y;
    public final d Z;

    /* compiled from: MusicSubscriptionControlFragment.kt */
    public static final class a extends oz50 {
        public a() {
            super(MusicSubscriptionControlFragment.class, null, null);
            this.j.putInt("subscription_id", 1);
        }

        @Override // xsna.oz50
        public final void r(Intent intent) {
            LruCache<UUID, mzp0> lruCache = rzp0.a;
            Pair c = rzp0.c(UiMeasuringScreen.MUSIC_SUBSCRIPTION, null, false, 62);
            UUID uuid = (UUID) c.d();
            ((mzp0) c.g()).init();
            Bundle bundleExtra = intent.getBundleExtra("args");
            if (bundleExtra != null) {
                rzp0.f(bundleExtra, uuid);
            }
        }
    }

    /* compiled from: MusicSubscriptionControlFragment.kt */
    public static final class b extends kt9 {
        public final d950 r;

        public b(RecyclerView recyclerView, d950 d950Var, boolean z) {
            super(recyclerView, d950Var, z);
            this.r = d950Var;
        }

        @Override // xsna.kt9
        public final void m(int i, Rect rect) {
            if (i == this.r.getItemCount() - 1) {
                rect.set(0, -this.j, 0, rect.bottom);
            }
        }
    }

    /* compiled from: MusicSubscriptionControlFragment.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<Subscription, s3q0> {
        /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.izs
        public final s3q0 invoke(Subscription subscription) {
            Subscription subscription2 = subscription;
            MusicSubscriptionControlFragment musicSubscriptionControlFragment = (MusicSubscriptionControlFragment) this.receiver;
            int i = MusicSubscriptionControlFragment.a0;
            musicSubscriptionControlFragment.getClass();
            StringBuilder sb = new StringBuilder("canShowAlternativePaymentMethod=");
            boolean z = subscription2.D;
            sb.append(z);
            bn40.f(sb.toString());
            musicSubscriptionControlFragment.X.C0("settings");
            boolean z2 = BuildInfo.u() && BuildInfo.n() && !MusicFeatures.AUDIO_RUSTORE_SUBSCRIPTION.h();
            if (z || z2) {
                maz.c(xwk.d().e(), musicSubscriptionControlFragment.requireContext(), vm40.c("settings", null), LaunchContext.A, null, null, 24);
            } else {
                ht8 ht8Var = (ht8) musicSubscriptionControlFragment.Y.getValue();
                d dVar = musicSubscriptionControlFragment.Z;
                ht8Var.getClass();
                ht8Var.f(musicSubscriptionControlFragment.getActivity());
                ht8Var.c = ht8Var.b.d(musicSubscriptionControlFragment.getActivity(), new et8(ht8Var, dVar, musicSubscriptionControlFragment), subscription2);
            }
            return s3q0.a;
        }
    }

    public MusicSubscriptionControlFragment() {
        w4u w4uVar = new w4u(this, 19);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.T = msy.a(lazyThreadSafetyMode, w4uVar);
        com.vk.music.notifications.restriction.a aVar = k840.a.d;
        this.W = aVar == null ? null : aVar;
        s750 s750Var = k840.a.e;
        this.X = s750Var != null ? s750Var : null;
        this.Y = msy.a(lazyThreadSafetyMode, new pvh(this, 26));
        this.Z = new d();
    }

    public final void jo(Subscription subscription, VKApiExecutionException vKApiExecutionException, boolean z) {
        d950 d950Var = this.V;
        if (d950Var == null) {
            d950Var = null;
        }
        d950Var.k.x0(null);
        d950Var.n.x0(null);
        d950Var.m.x0(null);
        d950Var.l.x0(null);
        d950Var.o.x0(null);
        d950Var.r.x0(null);
        d950Var.p.x0(new fym0.a(subscription, vKApiExecutionException, z));
        d950Var.C0(false);
        mzp0 mzp0Var = this.J;
        if (mzp0Var != null) {
            mzp0Var.d(getView());
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        setHasOptionsMenu(true);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ayn0 ayn0Var = this.U;
        if (ayn0Var == null) {
            ayn0Var = null;
        }
        ayn0Var.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ?? r1 = this.T;
        this.S = new b950(this, (oge0) r1.getValue(), this.J);
        Context context = layoutInflater.getContext();
        HashSet hashSet = iah0.a;
        boolean d2 = fnj.d(context);
        this.V = new d950(d2, (oge0) r1.getValue(), new c(1, this, MusicSubscriptionControlFragment.class, "onBuySubscriptionClick", "onBuySubscriptionClick(Lcom/vk/dto/common/data/Subscription;)V", 0), new obh(this, 23));
        int i = 0;
        View inflate = layoutInflater.inflate(R.layout.music_fragment_subscription_details, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.list);
        RecyclerView.Adapter adapter = this.V;
        VkTopBar.b bVar = null;
        if (adapter == null) {
            adapter = null;
        }
        recyclerView.setAdapter(adapter);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        d950 d950Var = this.V;
        if (d950Var == null) {
            d950Var = null;
        }
        b bVar2 = new b(recyclerView, d950Var, !fnj.d(recyclerView.getContext()));
        float f = 5;
        int a2 = iah0.a(f);
        int a3 = iah0.a(f);
        int a4 = iah0.a(10);
        bVar2.i = a2;
        bVar2.j = a3;
        bVar2.k = 0;
        bVar2.l = a4;
        recyclerView.addItemDecoration(bVar2);
        this.U = new ayn0(recyclerView, null, 28);
        VkTopBar vkTopBar = (VkTopBar) inflate.findViewById(R.id.toolbar);
        if (!d2) {
            bVar = new VkTopBar.b(new c950(this, i), tq.h(tlo0.Companion, R.string.back), null, null, null, 28);
        }
        vkTopBar.setBack(bVar);
        vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(tq.h(tlo0.Companion, R.string.subscription_music), null, null, null, null, 30), null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 14));
        return inflate;
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        ayn0 ayn0Var = this.U;
        if (ayn0Var == null) {
            ayn0Var = null;
        }
        ayn0Var.a();
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        z850 z850Var = (z850) this.S;
        if (z850Var != null) {
            Bundle arguments = getArguments();
            z850Var.b2(arguments != null ? arguments.getInt("subscription_id") : 0);
        }
    }

    /* compiled from: MusicSubscriptionControlFragment.kt */
    public static final class d implements StorePurchasesManager.a<Subscription> {
        public d() {
        }

        @Override // com.vk.billing.StorePurchasesManager.a
        public final void a() {
            cvk.u(R.string.purchase_cancelled, false);
        }

        @Override // com.vk.billing.StorePurchasesManager.a
        public final void c(Subscription subscription, nge0 nge0Var) {
            Subscription subscription2 = subscription;
            MusicSubscriptionControlFragment musicSubscriptionControlFragment = MusicSubscriptionControlFragment.this;
            musicSubscriptionControlFragment.X.E0("settings", subscription2.t);
            subscription2.s = true;
            if (musicSubscriptionControlFragment.getActivity() != null) {
                musicSubscriptionControlFragment.W.f();
            }
            z850 z850Var = (z850) musicSubscriptionControlFragment.S;
            if (z850Var != null) {
                Bundle arguments = musicSubscriptionControlFragment.getArguments();
                z850Var.b2(arguments != null ? arguments.getInt("subscription_id") : 0);
            }
        }

        @Override // com.vk.billing.StorePurchasesManager.a
        public final void d(Subscription subscription) {
            MusicSubscriptionControlFragment.this.X.z0("settings");
        }

        @Override // com.vk.billing.StorePurchasesManager.a
        public final void b() {
        }
    }
}
