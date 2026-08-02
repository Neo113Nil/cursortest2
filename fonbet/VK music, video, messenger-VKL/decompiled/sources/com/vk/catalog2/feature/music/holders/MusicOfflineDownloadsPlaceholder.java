package com.vk.catalog2.feature.music.holders;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Triple;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.e43;
import xsna.f4m;
import xsna.gzs;
import xsna.s3q0;

/* compiled from: MusicOfflineDownloadsPlaceholder.kt */
/* loaded from: classes16.dex */
public final class MusicOfflineDownloadsPlaceholder implements CatalogViewHolder {
    public final List<Triple<Integer, Integer, Integer>> b = e43.l(new Triple(Integer.valueOf(R.drawable.vk_icon_loudspeaker_slash_outline_28), Integer.valueOf(R.string.music_offline_reason_advertise), Integer.valueOf(R.string.music_offline_reason_advertise_subtitle)), new Triple(Integer.valueOf(R.drawable.vk_icon_download_outline_28), Integer.valueOf(R.string.music_offline_reason_no_internet), Integer.valueOf(R.string.music_offline_reason_no_internet_subtitle)), new Triple(Integer.valueOf(R.drawable.vk_icon_smartphone_outline_28), Integer.valueOf(R.string.music_offline_reason_background_mode), Integer.valueOf(R.string.music_offline_reason_background_mode_subtitle)), new Triple(Integer.valueOf(R.drawable.vk_icon_audiobook_outline_28), Integer.valueOf(R.string.music_offline_reason_books), Integer.valueOf(R.string.music_offline_reason_books_subtitle)));

    /* compiled from: ViewExt.kt */
    public static final class a implements gzs<s3q0> {
        public final /* synthetic */ View b;
        public final /* synthetic */ Ref$IntRef c;
        public final /* synthetic */ Ref$IntRef d;
        public final /* synthetic */ View e;

        public a(ViewGroup viewGroup, Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2, View view) {
            this.b = viewGroup;
            this.c = ref$IntRef;
            this.d = ref$IntRef2;
            this.e = view;
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            View view = this.b;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            Ref$IntRef ref$IntRef = this.c;
            int i = ref$IntRef.element;
            Ref$IntRef ref$IntRef2 = this.d;
            if (i != measuredWidth || ref$IntRef2.element != measuredHeight) {
                ref$IntRef.element = measuredWidth;
                ref$IntRef2.element = measuredHeight;
                View view2 = this.e;
                if (view2 != null) {
                    view2.setMinimumHeight(measuredHeight);
                }
            }
            return s3q0.a;
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_music_offline_placeholder, viewGroup, false);
        ((ImageView) inflate.findViewById(R.id.empty_downloads_image)).setImageResource(R.drawable.vk_icon_illustration_save_music_200h);
        View findViewById = inflate.findViewById(R.id.music_offline_empty_container);
        if (viewGroup != null) {
            int height = viewGroup.getHeight();
            if (findViewById != null) {
                findViewById.setMinimumHeight(height);
            }
        }
        if (viewGroup != null) {
            Ref$IntRef ref$IntRef = new Ref$IntRef();
            ref$IntRef.element = viewGroup.getMeasuredWidth();
            Ref$IntRef ref$IntRef2 = new Ref$IntRef();
            ref$IntRef2.element = viewGroup.getMeasuredHeight();
            f4m.a(viewGroup, new a(viewGroup, ref$IntRef, ref$IntRef2, findViewById));
        }
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.reasons_container);
        Iterator<T> it = this.b.iterator();
        while (it.hasNext()) {
            Triple triple = (Triple) it.next();
            int intValue = ((Number) triple.d()).intValue();
            int intValue2 = ((Number) triple.g()).intValue();
            int intValue3 = ((Number) triple.h()).intValue();
            View inflate2 = layoutInflater.inflate(R.layout.catalog_music_offline_placeholder_reason_item, (ViewGroup) linearLayout, false);
            ((ImageView) inflate2.findViewById(R.id.music_offline_reason_image)).setImageResource(intValue);
            ((TextView) inflate2.findViewById(R.id.music_offline_reason_title)).setText(inflate.getContext().getString(intValue2));
            ((TextView) inflate2.findViewById(R.id.music_offline_reason_subtitle)).setText(inflate.getContext().getString(intValue3));
            linearLayout.addView(inflate2);
        }
        return inflate;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
    }
}
