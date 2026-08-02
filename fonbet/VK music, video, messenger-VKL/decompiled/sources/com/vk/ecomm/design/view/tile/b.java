package com.vk.ecomm.design.view.tile;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.vk.core.view.components.picture.VkPicture;
import com.vk.dto.common.Image;
import com.vkontakte.android.R;
import xsna.b780;
import xsna.cvh;
import xsna.iwt0;
import xsna.ixj0;
import xsna.jwx;
import xsna.kci;
import xsna.krv0;

/* compiled from: MarketProductTileViewConfig.kt */
/* loaded from: classes18.dex */
public final class b {

    /* compiled from: MarketProductTileViewConfig.kt */
    public static final class a {
        public final Context a;
        public final VkPicture b;
        public final ImageView c;
        public final Image d;
        public final String e;
        public final Integer f;
        public final boolean g;

        public a(Context context, VkPicture vkPicture, ImageView imageView, Image image, String str, Integer num, boolean z) {
            this.a = context;
            this.b = vkPicture;
            this.c = imageView;
            this.d = image;
            this.e = str;
            this.f = num;
            this.g = z;
        }
    }

    public static void a(a aVar) {
        VkPicture vkPicture = aVar.b;
        vkPicture.setContentDescription(aVar.e);
        aVar.c.setVisibility(8);
        vkPicture.setVkPostprocessor(null);
        c(aVar);
        vkPicture.setAlpha(aVar.g ? 0.4f : 1.0f);
        vkPicture.setOnLoadCallback(new C0938b(aVar));
        iwt0.a(vkPicture, new cvh(aVar, 23));
    }

    public static void b(a aVar) {
        VkPicture vkPicture = aVar.b;
        vkPicture.setContentDescription(aVar.e);
        c(aVar);
        vkPicture.setAlpha(1.0f);
        aVar.c.setVisibility(8);
        vkPicture.setOnLoadCallback(new c(aVar));
        vkPicture.setActualColorFilter(new PorterDuffColorFilter(vkPicture.getContext().getColor(R.color.vk_black_alpha24), PorterDuff.Mode.SRC_ATOP));
        kci.o(vkPicture, new jwx(2, 8));
        Image image = aVar.d;
        vkPicture.o0(ixj0.n(image != null ? image.b : null), null);
    }

    public static void c(a aVar) {
        VkPicture vkPicture = aVar.b;
        Context context = aVar.a;
        vkPicture.setBackgroundImage(new ColorDrawable(krv0.m(R.attr.vk_ui_image_placeholder, context)));
        Integer num = aVar.f;
        if (num != null) {
            vkPicture.J0(krv0.f(num.intValue(), R.attr.vk_ui_icon_tertiary, context), ImageView.ScaleType.CENTER);
        } else {
            vkPicture.setPlaceholderImage((Drawable) null);
        }
    }

    /* compiled from: MarketProductTileViewConfig.kt */
    /* renamed from: com.vk.ecomm.design.view.tile.b$b, reason: collision with other inner class name */
    public static final class C0938b implements b780 {
        public final /* synthetic */ a b;

        public C0938b(a aVar) {
            this.b = aVar;
        }

        @Override // xsna.b780
        public final void t(int i, int i2, String str) {
            a aVar = this.b;
            VkPicture vkPicture = aVar.b;
            if (aVar.g) {
                vkPicture.getBackend().t();
            } else {
                vkPicture.setActualColorFilter(new PorterDuffColorFilter(vkPicture.getContext().getColor(R.color.vk_black_alpha05), PorterDuff.Mode.SRC_OVER));
            }
        }

        @Override // xsna.b780
        public final void g(String str) {
        }

        @Override // xsna.b780
        public final void onCancel(String str) {
        }

        @Override // xsna.b780
        public final void b(String str, Throwable th) {
        }
    }

    /* compiled from: MarketProductTileViewConfig.kt */
    public static final class c implements b780 {
        public final /* synthetic */ a b;

        public c(a aVar) {
            this.b = aVar;
        }

        @Override // xsna.b780
        public final void t(int i, int i2, String str) {
            this.b.c.setVisibility(0);
        }

        @Override // xsna.b780
        public final void g(String str) {
        }

        @Override // xsna.b780
        public final void onCancel(String str) {
        }

        @Override // xsna.b780
        public final void b(String str, Throwable th) {
        }
    }
}
