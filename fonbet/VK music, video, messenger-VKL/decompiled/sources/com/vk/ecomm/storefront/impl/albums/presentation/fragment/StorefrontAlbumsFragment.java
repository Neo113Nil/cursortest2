package com.vk.ecomm.storefront.impl.albums.presentation.fragment;

import android.os.Bundle;
import android.util.LruCache;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.ironsource.X3;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.performance.score.PerformanceScoreProduct;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.movika.tools.controls.seekbar.j;
import java.util.UUID;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.avj0;
import xsna.bpn0;
import xsna.fpf0;
import xsna.gd40;
import xsna.hk70;
import xsna.jai;
import xsna.kr6;
import xsna.mzp0;
import xsna.nzw;
import xsna.oz50;
import xsna.qcy;
import xsna.rzp0;
import xsna.vkl0;
import xsna.yw90;
import xsna.zrd0;

/* compiled from: StorefrontAlbumsFragment.kt */
/* loaded from: classes18.dex */
public final class StorefrontAlbumsFragment extends FragmentImpl {
    public static final /* synthetic */ qcy<Object>[] R;
    public final bpn0 N;
    public final bpn0 O;
    public final nzw P;
    public final bpn0 Q;

    /* compiled from: StorefrontAlbumsFragment.kt */
    public static final class a extends oz50 {
        public a(StorefrontAlbumsArgs storefrontAlbumsArgs) {
            super(StorefrontAlbumsFragment.class, null, null);
            this.j.putParcelable(fpf0.a(StorefrontAlbumsArgs.class).l(), storefrontAlbumsArgs);
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(StorefrontAlbumsFragment.class, X3.i.U, "getStore()Lcom/vk/ecomm/storefront/impl/albums/presentation/feature/StorefrontAlbumsStore;", 0);
        fpf0.a.getClass();
        R = new qcy[]{propertyReference1Impl};
    }

    public StorefrontAlbumsFragment() {
        LruCache<UUID, mzp0> lruCache = rzp0.a;
        mzp0 mzp0Var = (mzp0) rzp0.c(UiMeasuringScreen.STOREFRONT_ALBUMS, null, false, 62).j();
        this.J = mzp0Var;
        if (mzp0Var != null) {
            mzp0Var.init();
        }
        zrd0 zrd0Var = zrd0.a;
        yw90 yw90Var = (yw90) zrd0.a(PerformanceScoreProduct.STOREFRONT_ALBUMS).j();
        yw90Var.init();
        this.L = yw90Var;
        this.N = new bpn0(new gd40(this, 26));
        this.O = new bpn0(new kr6(24));
        this.P = new nzw(fpf0.d(vkl0.class).toString(), this, new avj0(this, 4));
        this.Q = new bpn0(new hk70(this, 23));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ComposeView composeView = new ComposeView(requireContext(), null, 6);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        composeView.setContent(new jai(1227870321, new j(this, 13), true));
        return composeView;
    }
}
