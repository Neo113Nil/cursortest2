package com.vk.core.view.components.tile;

import android.content.Context;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.view.components.tile.VkTile;
import com.vk.core.view.components.tile.VkTileImageView;
import kotlin.NoWhenBranchMatchedException;
import xsna.eko;
import xsna.f4m;

/* compiled from: VkTileDefaultVisualContentController.kt */
/* loaded from: classes17.dex */
public final class c implements VkTile.g {
    public final VkTileImageView a;

    public c(VkTileImageView.b bVar, Context context) {
        VkTileImageView vkTileImageView = new VkTileImageView(context);
        vkTileImageView.setImageController(bVar);
        this.a = vkTileImageView;
    }

    @Override // com.vk.core.view.components.tile.VkTile.g
    public final void a(ConstraintLayout constraintLayout, VkTile.h hVar) {
        int height;
        VkTileImageView vkTileImageView = this.a;
        vkTileImageView.getClass();
        VkTileImageView.a aVar = hVar instanceof VkTileImageView.a ? (VkTileImageView.a) hVar : null;
        if (aVar == null) {
            return;
        }
        Size size = aVar.a;
        VkTileImageView.Badge badge = aVar.c;
        AppCompatImageView appCompatImageView = vkTileImageView.c;
        int i = 0;
        if (badge == null) {
            appCompatImageView.setVisibility(8);
        } else {
            float f = badge.c;
            appCompatImageView.setVisibility(0);
            eko ekoVar = badge.a;
            appCompatImageView.getContext();
            appCompatImageView.setImageDrawable(ekoVar.a);
            int i2 = VkTileImageView.d.$EnumSwitchMapping$0[badge.b.ordinal()];
            if (i2 == 1) {
                f4m.m(51, appCompatImageView);
                appCompatImageView.setTranslationX(f);
                appCompatImageView.setTranslationY(f);
            } else if (i2 == 2) {
                f4m.m(53, appCompatImageView);
                appCompatImageView.setTranslationX(-f);
                appCompatImageView.setTranslationY(f);
            } else if (i2 == 3) {
                f4m.m(85, appCompatImageView);
                float f2 = -f;
                appCompatImageView.setTranslationX(f2);
                appCompatImageView.setTranslationY(f2);
            } else {
                if (i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                f4m.m(83, appCompatImageView);
                appCompatImageView.setTranslationX(f);
                appCompatImageView.setTranslationY(-f);
            }
        }
        if (size == null) {
            height = 0;
        } else {
            i = size.getWidth();
            height = size.getHeight();
        }
        ViewGroup.LayoutParams layoutParams = vkTileImageView.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = height;
        vkTileImageView.setLayoutParams(layoutParams);
        VkTileImageView.b bVar = vkTileImageView.d;
        if (bVar != null) {
            bVar.a(aVar.b);
        }
    }

    @Override // com.vk.core.view.components.tile.VkTile.g
    public final View getView() {
        return this.a;
    }
}
