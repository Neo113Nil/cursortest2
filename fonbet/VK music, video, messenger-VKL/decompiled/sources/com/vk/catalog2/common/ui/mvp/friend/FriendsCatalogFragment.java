package com.vk.catalog2.common.ui.mvp.friend;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder;
import com.vk.catalog2.common.ui.holders.api.CatalogVh;
import com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.friends.FriendsCatalogRootVh;
import com.vk.core.design.lego.LegoCustomRedesignedScreen;
import com.vk.core.fragments.FragmentImpl;
import com.vk.friends.api.di.FeedFriendsComponent;
import com.vk.toggle.features.CatalogFeatures;
import com.vkontakte.android.R;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.PropertyReference0Impl;
import xsna.aes;
import xsna.ak;
import xsna.bpn0;
import xsna.dhr0;
import xsna.drs;
import xsna.fdi;
import xsna.fpf0;
import xsna.g620;
import xsna.gbh;
import xsna.gmj;
import xsna.gzs;
import xsna.hg1;
import xsna.j9b;
import xsna.k6k;
import xsna.k9b;
import xsna.lbs;
import xsna.lpj;
import xsna.m7m;
import xsna.m9b;
import xsna.o5a;
import xsna.odm;
import xsna.qhh0;
import xsna.rda;
import xsna.rj70;
import xsna.rsg0;
import xsna.sm4;
import xsna.v6j;
import xsna.vls;
import xsna.vyh0;
import xsna.xsh0;
import xsna.y1z;

/* compiled from: FriendsCatalogFragment.kt */
/* loaded from: classes.dex */
public final class FriendsCatalogFragment extends BaseCatalogFragment implements aes, qhh0 {
    public static final /* synthetic */ int V = 0;
    public final c Q;
    public final bpn0 R;
    public final bpn0 S;
    public final bpn0 T;
    public final fdi U;

    /* compiled from: FriendsCatalogFragment.kt */
    /* loaded from: classes16.dex */
    public static final class a extends BaseCatalogFragment.b {
        public a() {
            super(FriendsCatalogFragment.class, null, null);
        }
    }

    /* compiled from: FriendsCatalogFragment.kt */
    /* loaded from: classes16.dex */
    public static final class b implements vls {
        public static final long d = TimeUnit.MINUTES.toMillis(1);
        public final rj70 a;
        public long b;
        public long c;

        /* compiled from: FriendsCatalogFragment.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[CatalogViewType.values().length];
                try {
                    iArr[CatalogViewType.FRIENDS_UNREAD_REQUEST.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CatalogViewType.LIST_FRIENDS_SUGGEST.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[CatalogViewType.LIST_MYFOLLOWERS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public b(rj70 rj70Var) {
            this.a = rj70Var;
        }

        @Override // xsna.vls
        @SuppressLint({"CheckResult"})
        public final void a(UIBlock uIBlock) {
            int i = a.$EnumSwitchMapping$0[uIBlock.d.ordinal()];
            if (i == 1) {
                b();
                return;
            }
            if (i == 2) {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - this.c >= d) {
                    this.c = currentTimeMillis;
                    hg1.h(rsg0.y0(new sm4(), null, null, 3), new ak(23));
                    return;
                }
                return;
            }
            if (i != 3) {
                return;
            }
            CatalogFeatures catalogFeatures = CatalogFeatures.COM_FRIENDS;
            catalogFeatures.getClass();
            if (com.vk.toggle.b.A.a(catalogFeatures)) {
                b();
            }
        }

        @SuppressLint({"CheckResult"})
        public final void b() {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.b >= d) {
                this.b = currentTimeMillis;
                hg1.h(rsg0.y0(new drs(), null, null, 3), new gmj(this, 12));
            }
        }
    }

    /* compiled from: FriendsCatalogFragment.kt */
    /* loaded from: classes16.dex */
    public static final class c extends FragmentImpl.b {
        public c(FriendsCatalogFragment friendsCatalogFragment) {
        }

        @Override // com.vk.core.fragments.FragmentImpl.a
        public final void a(lpj lpjVar) {
            int i = FriendsCatalogFragment.V;
            dhr0.a.getClass();
            dhr0.l(lpjVar);
        }
    }

    public FriendsCatalogFragment() {
        super(FriendsCatalogRootVh.class, false);
        int i = y1z.a;
        LegoCustomRedesignedScreen legoCustomRedesignedScreen = LegoCustomRedesignedScreen.EXAMPLE;
        this.Q = new c(this);
        this.R = new bpn0(new gbh(this, 15));
        this.S = new bpn0(new k6k(this, 13));
        this.T = new bpn0(new odm(this, 9));
        this.U = new fdi();
    }

    @Override // xsna.aes
    public final void A0() {
        CatalogRootViewHolder catalogRootViewHolder = this.P;
        FriendsCatalogRootVh friendsCatalogRootVh = catalogRootViewHolder instanceof FriendsCatalogRootVh ? (FriendsCatalogRootVh) catalogRootViewHolder : null;
        if (friendsCatalogRootVh == null) {
            return;
        }
        friendsCatalogRootVh.A0();
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final FragmentImpl.a Jn() {
        return this.Q;
    }

    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment, com.vk.core.fragments.FragmentImpl, xsna.too0
    public final void Ng() {
        this.Q.b();
        super.Ng();
    }

    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment
    public final CatalogRootViewHolder eo(Bundle bundle) {
        boolean l = lbs.l(this);
        this.U.getClass();
        boolean k = fdi.k(bundle, l);
        gzs y = fdi.y(bundle, new PropertyReference0Impl(this) { // from class: xsna.dms
            {
                super(this, lbs.class, "isNeedShowProfileInHeader", "isNeedShowProfileInHeader(Lcom/vk/core/fragments/FragmentImpl;)Z", 1);
            }

            @Override // kotlin.jvm.internal.PropertyReference0Impl, xsna.rcy
            public final Object get() {
                return Boolean.valueOf(lbs.q((FragmentImpl) this.receiver));
            }
        }, new m9b(this));
        return new FriendsCatalogRootVh(kn(), this, new o5a(this), getArguments(), requireContext().getString(R.string.friends), !k, y, new j9b(this), new k9b(this), (xsh0) this.T.getValue());
    }

    @Override // xsna.aes
    public final void h7(v6j v6jVar) {
        CatalogRootViewHolder catalogRootViewHolder = this.P;
        FriendsCatalogRootVh friendsCatalogRootVh = catalogRootViewHolder instanceof FriendsCatalogRootVh ? (FriendsCatalogRootVh) catalogRootViewHolder : null;
        if (friendsCatalogRootVh == null) {
            return;
        }
        friendsCatalogRootVh.i0();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 425 && i2 == 1) {
            CatalogRootViewHolder catalogRootViewHolder = this.P;
            FriendsCatalogRootVh friendsCatalogRootVh = catalogRootViewHolder instanceof FriendsCatalogRootVh ? (FriendsCatalogRootVh) catalogRootViewHolder : null;
            if (friendsCatalogRootVh != null) {
                friendsCatalogRootVh.j0();
            }
            ((FeedFriendsComponent) m7m.d(this).mo408a(fpf0.a(FeedFriendsComponent.class))).A6().b(requireContext());
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.o = false;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Boolean valueOf = Boolean.valueOf(lbs.l(this));
        lbs.m(this);
        fdi.I(this.U, bundle, valueOf, Boolean.FALSE, 8);
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.getBoolean("friends_cleanup_completed", false)) {
            return;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            arguments2.remove("friends_cleanup_completed");
        }
        ((FeedFriendsComponent) m7m.d(this).mo408a(fpf0.a(FeedFriendsComponent.class))).A6().b(requireContext());
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        g620.s(0);
    }

    @Override // xsna.aes
    public final RectF p1() {
        CatalogRootViewHolder catalogRootViewHolder = this.P;
        FriendsCatalogRootVh friendsCatalogRootVh = catalogRootViewHolder instanceof FriendsCatalogRootVh ? (FriendsCatalogRootVh) catalogRootViewHolder : null;
        if (friendsCatalogRootVh != null) {
            return friendsCatalogRootVh.p1();
        }
        return null;
    }

    @Override // xsna.qhh0
    public final boolean s() {
        CatalogVh catalogVh = this.P;
        CatalogStatesViewHolder catalogStatesViewHolder = catalogVh instanceof CatalogStatesViewHolder ? (CatalogStatesViewHolder) catalogVh : null;
        if ((catalogStatesViewHolder != null ? catalogStatesViewHolder.getState() : null) instanceof vyh0) {
            CatalogRootViewHolder catalogRootViewHolder = this.P;
            if (catalogRootViewHolder != null) {
                catalogRootViewHolder.T(false);
            }
            return true;
        }
        CatalogVh catalogVh2 = this.P;
        rda rdaVar = catalogVh2 instanceof rda ? (rda) catalogVh2 : null;
        if (rdaVar == null) {
            return false;
        }
        rdaVar.s();
        return true;
    }
}
