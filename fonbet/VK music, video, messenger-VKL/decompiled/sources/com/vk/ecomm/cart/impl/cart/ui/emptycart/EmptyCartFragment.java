package com.vk.ecomm.cart.impl.cart.ui.emptycart;

import android.os.Bundle;
import android.util.LruCache;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.movika.sdk.base.observable.u;
import java.util.UUID;
import xsna.mzp0;
import xsna.oz50;
import xsna.rzp0;
import xsna.w8i;
import xsna.yw9;

/* compiled from: EmptyCartFragment.kt */
/* loaded from: classes18.dex */
public final class EmptyCartFragment extends BaseCatalogFragment implements w8i {
    public static final /* synthetic */ int Q = 0;

    /* compiled from: EmptyCartFragment.kt */
    public static final class a extends oz50 {
    }

    public EmptyCartFragment() {
        super(EmptyCartRootViewHolder.class, false);
    }

    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment
    public final CatalogRootViewHolder eo(Bundle bundle) {
        mzp0 mzp0Var;
        UUID fromString;
        FragmentActivity kn = kn();
        yw9 yw9Var = new yw9(this, new u(25));
        Bundle bundle2 = new Bundle();
        FragmentManager childFragmentManager = getChildFragmentManager();
        String string = requireArguments().getString("KEY_CART_STARTED_SINGLE_SESSION_UUID");
        if (string == null || (fromString = UUID.fromString(string)) == null) {
            mzp0Var = null;
        } else {
            LruCache<UUID, mzp0> lruCache = rzp0.a;
            mzp0Var = rzp0.e(fromString);
        }
        return new EmptyCartRootViewHolder(kn, yw9Var, bundle2, childFragmentManager, this, mzp0Var);
    }
}
