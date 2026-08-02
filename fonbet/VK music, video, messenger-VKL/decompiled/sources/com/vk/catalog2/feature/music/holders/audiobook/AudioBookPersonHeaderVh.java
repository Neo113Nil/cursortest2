package com.vk.catalog2.feature.music.holders.audiobook;

import android.graphics.Rect;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.feature.music.dto.ui.UIBlockAudioBookPerson;
import com.vk.catalog2.feature.music.holders.audiobook.AudioBookPersonHeaderVh;
import com.vk.catalog2.feature.music.holders.audiobook.AudioBookPersonInfoVh;
import com.vk.catalog2.feature.music.holders.audiobook.AudioBookPersonPageToolbarVh;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.button.VkButton;
import com.vkontakte.android.R;
import xsna.b5a;
import xsna.hi4;
import xsna.ji4;
import xsna.mba;
import xsna.too0;

/* compiled from: AudioBookPersonHeaderVh.kt */
/* loaded from: classes16.dex */
public final class AudioBookPersonHeaderVh implements CatalogViewHolder, too0 {
    public final AudioBookPersonPageToolbarVh b;
    public final AudioBookPersonInfoVh c;
    public CollapsingToolbarLayout d;
    public AppBarLayout e;
    public boolean f = true;
    public final hi4 g = new AppBarLayout.f() { // from class: xsna.hi4
        @Override // com.google.android.material.appbar.AppBarLayout.a
        public final void a(AppBarLayout appBarLayout, int i) {
            TextView textView;
            AudioBookPersonHeaderVh audioBookPersonHeaderVh = AudioBookPersonHeaderVh.this;
            CollapsingToolbarLayout collapsingToolbarLayout = audioBookPersonHeaderVh.d;
            if (collapsingToolbarLayout == null || appBarLayout.getTotalScrollRange() == 0) {
                return;
            }
            int scrimVisibleHeightTrigger = collapsingToolbarLayout.getScrimVisibleHeightTrigger() - (collapsingToolbarLayout.getHeight() - appBarLayout.getTotalScrollRange());
            AppBarLayout appBarLayout2 = audioBookPersonHeaderVh.e;
            if (appBarLayout2 != null) {
                boolean z = appBarLayout.getTotalScrollRange() + i > scrimVisibleHeightTrigger;
                if (!dhr0.M() && audioBookPersonHeaderVh.f != z) {
                    audioBookPersonHeaderVh.f = z;
                    appBarLayout2.post(new ii4(0, appBarLayout2, audioBookPersonHeaderVh));
                }
            }
            float totalScrollRange = (i / appBarLayout.getTotalScrollRange()) + 1;
            AudioBookPersonPageToolbarVh audioBookPersonPageToolbarVh = audioBookPersonHeaderVh.b;
            LayerDrawable layerDrawable = audioBookPersonPageToolbarVh.e.b;
            if (layerDrawable != null) {
                layerDrawable.setAlpha((int) (255.0f * totalScrollRange));
            }
            ImageView imageView = audioBookPersonPageToolbarVh.f;
            if (imageView != null) {
                bwt0.p0(imageView, ((double) totalScrollRange) > 0.3d);
            }
            TextView textView2 = audioBookPersonPageToolbarVh.g;
            if (textView2 != null) {
                bwt0.p0(textView2, ((double) totalScrollRange) < 0.3d);
            }
            TextView textView3 = audioBookPersonPageToolbarVh.h;
            if (textView3 != null) {
                bwt0.p0(textView3, ((double) totalScrollRange) < 0.3d);
            }
            AudioBookPersonInfoVh audioBookPersonInfoVh = audioBookPersonHeaderVh.c;
            TextView textView4 = audioBookPersonInfoVh.h;
            if (textView4 != null) {
                textView4.setAlpha(totalScrollRange);
            }
            TextView textView5 = audioBookPersonInfoVh.i;
            if (textView5 != null) {
                textView5.setAlpha(totalScrollRange);
            }
            if (f4m.h(audioBookPersonInfoVh.j) && (textView = audioBookPersonInfoVh.j) != null) {
                textView.setAlpha(totalScrollRange);
            }
            VkButton vkButton = audioBookPersonInfoVh.g;
            if (vkButton != null) {
                vkButton.setAlpha(totalScrollRange);
            }
            if (f4m.h(audioBookPersonInfoVh.n)) {
                TextView textView6 = audioBookPersonInfoVh.l;
                if (textView6 != null) {
                    textView6.setAlpha(totalScrollRange);
                }
                TextView textView7 = audioBookPersonInfoVh.m;
                if (textView7 != null) {
                    textView7.setAlpha(totalScrollRange);
                }
            }
        }
    };

    /* JADX WARN: Type inference failed for: r2v2, types: [xsna.hi4] */
    public AudioBookPersonHeaderVh(mba mbaVar, b5a b5aVar) {
        this.b = new AudioBookPersonPageToolbarVh(mbaVar, b5aVar);
        this.c = new AudioBookPersonInfoVh(mbaVar, b5aVar);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        AppBarLayout appBarLayout = this.e;
        if (appBarLayout != null) {
            appBarLayout.f(this.g);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockAudioBookPerson) {
            this.b.N6(uIBlock);
            this.c.N6(uIBlock);
        }
    }

    @Override // xsna.too0
    public final void Ng() {
        this.c.Ng();
        this.b.Ng();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AppBarLayout appBarLayout = (AppBarLayout) layoutInflater.inflate(R.layout.catalog_audiobook_person_header, viewGroup, false);
        this.e = appBarLayout;
        CoordinatorLayout.f fVar = (CoordinatorLayout.f) appBarLayout.getLayoutParams();
        AppBarLayout.Behavior behavior = new AppBarLayout.Behavior();
        behavior.p = new ji4();
        fVar.c(behavior);
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) appBarLayout.findViewById(R.id.collapsing_layout);
        collapsingToolbarLayout.setScrimAnimationDuration(300L);
        collapsingToolbarLayout.addView(this.c.k5(layoutInflater, collapsingToolbarLayout, bundle), 0);
        collapsingToolbarLayout.addView(this.b.k5(layoutInflater, collapsingToolbarLayout, bundle), 1);
        this.d = collapsingToolbarLayout;
        appBarLayout.a(this.g);
        return appBarLayout;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
