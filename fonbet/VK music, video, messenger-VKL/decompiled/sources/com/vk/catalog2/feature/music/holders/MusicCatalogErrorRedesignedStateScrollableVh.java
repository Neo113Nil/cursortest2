package com.vk.catalog2.feature.music.holders;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder;
import com.vk.catalog2.feature.music.holders.view.CatalogErrorViewWithImage;
import com.vkontakte.android.R;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.bd40;
import xsna.f4m;
import xsna.gzs;
import xsna.o6;
import xsna.sk4;
import xsna.xis;

/* compiled from: MusicCatalogErrorRedesignedStateScrollableVh.kt */
/* loaded from: classes16.dex */
public final class MusicCatalogErrorRedesignedStateScrollableVh extends MusicCatalogErrorRedesignedStateVh {
    public MusicCatalogErrorRedesignedStateScrollableVh(CatalogStatesViewHolder catalogStatesViewHolder, gzs gzsVar, xis xisVar, gzs gzsVar2, int i) {
        super(catalogStatesViewHolder, gzsVar, (i & 4) != 0 ? new sk4(25) : xisVar, (i & 8) != 0 ? new o6(19) : gzsVar2);
    }

    @Override // com.vk.catalog2.common.ui.holders.ErrorStateVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ScrollView scrollView = new ScrollView(layoutInflater.getContext());
        a();
        View inflate = layoutInflater.inflate(R.layout.vk_catalog_error_with_image_layout, viewGroup, false);
        CatalogErrorViewWithImage catalogErrorViewWithImage = (CatalogErrorViewWithImage) inflate.findViewById(R.id.error_view);
        catalogErrorViewWithImage.setOnRetryClickListener(this.g);
        this.h = catalogErrorViewWithImage;
        if (viewGroup != null) {
            Ref$IntRef ref$IntRef = new Ref$IntRef();
            ref$IntRef.element = viewGroup.getMeasuredWidth();
            Ref$IntRef ref$IntRef2 = new Ref$IntRef();
            ref$IntRef2.element = viewGroup.getMeasuredHeight();
            f4m.a(viewGroup, new bd40(viewGroup, ref$IntRef, ref$IntRef2, inflate, viewGroup));
        }
        scrollView.addView(inflate);
        return scrollView;
    }
}
