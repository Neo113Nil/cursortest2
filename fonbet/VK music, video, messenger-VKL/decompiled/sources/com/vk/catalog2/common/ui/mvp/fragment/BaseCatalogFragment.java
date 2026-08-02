package com.vk.catalog2.common.ui.mvp.fragment;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.container.SingleCatalogRootVh;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.tracking.UiTrackingScreen;
import xsna.hdh0;
import xsna.nch0;
import xsna.o5a;
import xsna.oz50;
import xsna.too0;

/* compiled from: BaseCatalogFragment.kt */
/* loaded from: classes.dex */
public abstract class BaseCatalogFragment extends FragmentImpl implements too0 {
    public final Class<? extends CatalogRootViewHolder> N;
    public final boolean O;
    public CatalogRootViewHolder P;

    /* compiled from: BaseCatalogFragment.kt */
    /* loaded from: classes16.dex */
    public static abstract class a extends nch0 {
        public a(Class<? extends BaseCatalogFragment> cls) {
            super(new hdh0.b(cls));
        }
    }

    /* compiled from: BaseCatalogFragment.kt */
    /* loaded from: classes16.dex */
    public static abstract class b extends oz50 {
        public final void y(boolean z) {
            this.j.putBoolean("is_single_section", z);
        }

        public final void z(String str, boolean z) {
            if (str == null) {
                return;
            }
            Bundle bundle = this.j;
            bundle.putString("key_url", str);
            bundle.putBoolean("is_single_section", z);
        }
    }

    public BaseCatalogFragment(Class<? extends CatalogRootViewHolder> cls, boolean z) {
        this.N = cls;
        this.O = z;
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.too0
    public void Ng() {
        CatalogRootViewHolder catalogRootViewHolder = this.P;
        if (catalogRootViewHolder != null) {
            catalogRootViewHolder.Ng();
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public boolean a0() {
        CatalogRootViewHolder catalogRootViewHolder = this.P;
        if (catalogRootViewHolder != null) {
            return catalogRootViewHolder.T(true);
        }
        return false;
    }

    public abstract CatalogRootViewHolder eo(Bundle bundle);

    public CatalogRootViewHolder fo() {
        o5a o5aVar = new o5a(this);
        FragmentActivity kn = kn();
        return new SingleCatalogRootVh(this.N, getArguments(), kn, o5aVar);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        CatalogRootViewHolder catalogRootViewHolder = this.P;
        if (catalogRootViewHolder != null) {
            catalogRootViewHolder.onConfigurationChanged(configuration);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        CatalogRootViewHolder eo;
        if (!this.O || (eo = this.P) == null) {
            Bundle arguments = getArguments();
            eo = (arguments == null || !arguments.getBoolean("is_single_section")) ? eo(bundle) : fo();
        }
        this.P = eo;
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        CatalogRootViewHolder catalogRootViewHolder = this.P;
        if (catalogRootViewHolder != null) {
            return catalogRootViewHolder.k5(layoutInflater, viewGroup, bundle);
        }
        return null;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public void onDestroy() {
        CatalogRootViewHolder catalogRootViewHolder = this.P;
        if (catalogRootViewHolder != null) {
            catalogRootViewHolder.L();
        }
        super.onDestroy();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public void onPause() {
        CatalogRootViewHolder catalogRootViewHolder = this.P;
        if (catalogRootViewHolder != null) {
            catalogRootViewHolder.K();
        }
        super.onPause();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public void onResume() {
        CatalogRootViewHolder catalogRootViewHolder = this.P;
        if (catalogRootViewHolder != null) {
            catalogRootViewHolder.M();
        }
        super.onResume();
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public void y(UiTrackingScreen uiTrackingScreen) {
        CatalogRootViewHolder catalogRootViewHolder = this.P;
        if (catalogRootViewHolder != null) {
            catalogRootViewHolder.y(uiTrackingScreen);
        } else {
            uiTrackingScreen.h = false;
        }
    }
}
