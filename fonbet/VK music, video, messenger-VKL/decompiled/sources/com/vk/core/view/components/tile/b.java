package com.vk.core.view.components.tile;

import android.content.Context;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.avatar.badge.VkAvatarBadge;
import com.vk.core.view.components.tile.VkTile;
import java.util.Iterator;

/* compiled from: VkTileAvatarVisualContentController.kt */
/* loaded from: classes17.dex */
public final class b implements VkTile.g {
    public Size a;
    public final VkAvatar b;

    public b(Context context, Size size) {
        this.a = size;
        this.b = new VkAvatar(context, null, 6, 0);
    }

    @Override // com.vk.core.view.components.tile.VkTile.g
    public final void a(ConstraintLayout constraintLayout, VkTile.h hVar) {
        b();
        if ((hVar instanceof VkTile.f.a ? (VkTile.f.a) hVar : null) != null) {
            VkTile.f.a aVar = (VkTile.f.a) hVar;
            com.vk.core.view.components.picture.c cVar = aVar.a;
            VkAvatar vkAvatar = this.b;
            vkAvatar.setContent(cVar);
            this.a = aVar.b;
            b();
            ViewGroup.LayoutParams layoutParams = vkAvatar.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            bVar.Q = aVar.e;
            vkAvatar.setLayoutParams(bVar);
            vkAvatar.setOverlay(null);
            vkAvatar.W0(aVar.c, false);
            vkAvatar.S0();
            Iterator<T> it = aVar.d.iterator();
            while (it.hasNext()) {
                vkAvatar.Q0((VkAvatarBadge) it.next());
            }
        }
    }

    public final void b() {
        VkAvatar vkAvatar = this.b;
        ViewGroup.LayoutParams layoutParams = vkAvatar.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        Size size = this.a;
        if (size == null) {
            size = new Size(0, 0);
        }
        int min = Math.min(size.getWidth(), size.getHeight());
        layoutParams.width = min;
        layoutParams.height = min;
        vkAvatar.setLayoutParams(layoutParams);
    }

    @Override // com.vk.core.view.components.tile.VkTile.g
    public final View getView() {
        return this.b;
    }
}
