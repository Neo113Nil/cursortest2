package com.vk.superapp.miniapps.picker;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.vk.core.view.components.cell.VkCell;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import xsna.dhr0;
import xsna.epx;
import xsna.iah0;

/* compiled from: MiniAppIconViewParams.kt */
/* loaded from: classes6.dex */
public final class g implements VkCell.d {
    public static final float c = iah0.b(12.0f);
    public static final float d = iah0.b(0.5f);
    public final Context a;
    public final VKImageView b;

    /* compiled from: MiniAppIconViewParams.kt */
    public static final class a implements VkCell.f {
        public final String a;

        public a(String str) {
            this.a = str;
        }
    }

    public g(Context context) {
        this.a = context;
        VKImageView vKImageView = new VKImageView(context, null, 6, 0);
        vKImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        vKImageView.setCornerRadius(c);
        vKImageView.y0(d, dhr0.t.c(R.attr.vk_ui_image_border_alpha));
        vKImageView.setBackgroundResource(R.drawable.vk_default_placeholder_16);
        this.b = vKImageView;
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final void a(VkCell.f fVar) {
        String str;
        a aVar = fVar instanceof a ? (a) fVar : null;
        if (aVar == null || (str = aVar.a) == null) {
            return;
        }
        this.b.o0(str, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && epx.f(this.a, ((g) obj).a);
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final View getView() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MiniAppIconViewController(context=" + this.a + ')';
    }
}
