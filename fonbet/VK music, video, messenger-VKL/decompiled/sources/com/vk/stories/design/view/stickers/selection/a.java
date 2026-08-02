package com.vk.stories.design.view.stickers.selection;

import android.widget.EditText;
import androidx.viewpager.widget.ViewPager;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.stickers.selection.searchmode.SearchMode;
import com.vk.core.view.components.search.VkSearchView;
import com.vkontakte.android.R;
import xsna.afi0;
import xsna.epx;

/* compiled from: SelectionStickerView.java */
/* loaded from: classes6.dex */
public final class a implements ViewPager.j {
    public final /* synthetic */ SelectionStickerView b;

    public a(SelectionStickerView selectionStickerView) {
        this.b = selectionStickerView;
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageSelected(int i) {
        final EditText editView;
        SelectionStickerView selectionStickerView = this.b;
        selectionStickerView.Q.e(selectionStickerView.S.getCurrentItem());
        final afi0 afi0Var = selectionStickerView.i0;
        if (afi0Var != null) {
            boolean z = selectionStickerView.H && i == (selectionStickerView.I ? 2 : 1);
            afi0Var.n = z;
            SearchMode searchMode = z ? SearchMode.GIF : SearchMode.FULL;
            final int i2 = z ? R.string.sticker_search_gif_mode : R.string.vk_search;
            VkSearchView vkSearchView = afi0Var.i;
            if (vkSearchView != null && (editView = vkSearchView.getEditView()) != null && !epx.f(editView.getHint(), afi0Var.a.getContext().getString(i2))) {
                if (editView.getText().length() > 0) {
                    VkSearchView vkSearchView2 = afi0Var.i;
                    if (vkSearchView2 != null) {
                        vkSearchView2.setHint(i2);
                    }
                } else {
                    editView.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).translationY(20.0f).setDuration(100L).withEndAction(new Runnable() { // from class: xsna.wei0
                        @Override // java.lang.Runnable
                        public final void run() {
                            VkSearchView vkSearchView3 = afi0.this.i;
                            if (vkSearchView3 != null) {
                                vkSearchView3.setHint(i2);
                            }
                            EditText editText = editView;
                            editText.setTranslationY(-20.0f);
                            editText.animate().alpha(1.0f).translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(150L).start();
                        }
                    }).start();
                }
            }
            SearchMode searchMode2 = afi0Var.w;
            if (searchMode2 != searchMode) {
                if (searchMode != searchMode2) {
                    afi0Var.w = searchMode;
                    afi0Var.f();
                }
                if (afi0Var.b().length() > 0) {
                    afi0Var.j(false);
                }
            }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageScrolled(int i, float f, int i2) {
    }
}
