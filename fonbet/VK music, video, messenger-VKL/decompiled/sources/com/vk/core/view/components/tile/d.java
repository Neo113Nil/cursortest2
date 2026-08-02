package com.vk.core.view.components.tile;

import android.content.Context;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.picture.VkPicture;
import com.vk.core.view.components.tile.VkTile;

/* compiled from: VkTilePictureVisualContentController.kt */
/* loaded from: classes17.dex */
public final class d implements VkTile.g {
    public Size a;
    public final VkPicture b;

    public d(Context context, Size size) {
        this.a = size;
        this.b = new VkPicture(context, null, 6, 0);
    }

    @Override // com.vk.core.view.components.tile.VkTile.g
    public final void a(ConstraintLayout constraintLayout, VkTile.h hVar) {
        String str;
        b();
        if ((hVar instanceof VkTile.f.b ? (VkTile.f.b) hVar : null) != null) {
            VkTile.f.b bVar = (VkTile.f.b) hVar;
            com.vk.core.view.components.picture.c cVar = bVar.a;
            float f = bVar.c;
            VkPicture vkPicture = this.b;
            vkPicture.setContent(cVar);
            this.a = bVar.b;
            b();
            ViewGroup.LayoutParams layoutParams = vkPicture.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams;
            if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                str = f + ":1";
            } else {
                str = null;
            }
            bVar2.G = str;
            bVar2.Q = bVar.e;
            vkPicture.setLayoutParams(bVar2);
            vkPicture.setCornerRadius(bVar.d);
            vkPicture.setOverlay(null);
            vkPicture.setTopLeftBadge(null);
            vkPicture.setBottomLeftBadge(null);
            vkPicture.setTopRightBadge(null);
            vkPicture.setBottomRightBadge(null);
        }
    }

    public final void b() {
        VkPicture vkPicture = this.b;
        ViewGroup.LayoutParams layoutParams = vkPicture.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        Size size = this.a;
        if (size == null) {
            size = new Size(0, 0);
        }
        int width = size.getWidth();
        int height = size.getHeight();
        layoutParams.width = width;
        layoutParams.height = height;
        vkPicture.setLayoutParams(layoutParams);
    }

    @Override // com.vk.core.view.components.tile.VkTile.g
    public final View getView() {
        return this.b;
    }
}
