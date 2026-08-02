package com.vk.ecomm.cart.impl.cart.ui.emptycart;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import com.vk.catalog2.common.ui.holders.ProgressVh;
import xsna.p490;

/* compiled from: EmptyCartShimmerVh.kt */
/* loaded from: classes18.dex */
public final class EmptyCartShimmerVh extends ProgressVh {
    public final FragmentActivity d;

    public EmptyCartShimmerVh(FragmentActivity fragmentActivity) {
        super((Object) null);
        this.d = fragmentActivity;
    }

    @Override // com.vk.catalog2.common.ui.holders.ProgressVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ComposeView composeView = new ComposeView(this.d, null, 6);
        composeView.setContent(p490.d);
        return composeView;
    }
}
