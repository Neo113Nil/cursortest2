package com.vk.ecomm.design.view.tile;

import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.picture.VkPicture;
import com.vkontakte.android.R;
import xsna.cnh;
import xsna.gzs;
import xsna.s3q0;
import xsna.tf3;

/* compiled from: MarketProductTilePaginatedImagesView.kt */
/* loaded from: classes18.dex */
public final class a extends RecyclerView.e0 {
    public final gzs<s3q0> l;
    public final VkPicture m;
    public final ImageView n;

    public a(ViewGroup viewGroup, cnh cnhVar) {
        super(tf3.b(viewGroup, R.layout.market_product_tile_paginated_image, viewGroup, false));
        this.l = cnhVar;
        this.m = (VkPicture) this.itemView.findViewById(R.id.iv_main_image);
        this.n = (ImageView) this.itemView.findViewById(R.id.iv_moderation_icon);
    }
}
