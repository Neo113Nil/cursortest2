package com.vk.catalog2.common.ui.mvp.holder.music;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.dto.api.TitleIcon;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.music.Thumb;
import com.vk.music.view.ThumbsImageView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Triple;
import xsna.b5a;
import xsna.b780;
import xsna.c98;
import xsna.cfp0;
import xsna.cn70;
import xsna.dhr0;
import xsna.drm0;
import xsna.glw;
import xsna.j5g;
import xsna.n8g;
import xsna.u4q0;
import xsna.zik0;

/* compiled from: MusicSnippetBannerVh.kt */
/* loaded from: classes16.dex */
public final class MusicSnippetBannerVh implements CatalogViewHolder, View.OnClickListener {
    public static final int[] n = {0, 9, 38, 201, 242, 255};
    public static final float[] o = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.167f, 0.344f, 0.661f, 0.839f, 1.0f};
    public final com.vk.catalog2.common.ui.mvp.util.a b;
    public final b5a c;
    public View d;
    public UIBlockPlaceholder e;
    public UIBlockAction f;
    public TextView g;
    public TextView h;
    public ThumbsImageView i;
    public ThumbsImageView j;
    public ThumbsImageView k;
    public ThumbsImageView l;
    public ImageView m;

    public MusicSnippetBannerVh(com.vk.catalog2.common.ui.mvp.util.a aVar, b5a b5aVar) {
        this.b = aVar;
        this.c = b5aVar;
    }

    public static int[] a() {
        ArrayList arrayList = new ArrayList(6);
        for (int i = 0; i < 6; i++) {
            arrayList.add(Integer.valueOf(n8g.l(dhr0.t.c(R.attr.vk_ui_background_tertiary), n[i])));
        }
        return j5g.N0(arrayList);
    }

    public static void b(ThumbsImageView thumbsImageView, ImageSize imageSize, boolean z) {
        Thumb thumb = null;
        String str = imageSize != null ? imageSize.d.d : null;
        thumbsImageView.setOnLoadCallback(new a(thumbsImageView, z, str));
        if (str != null && !drm0.N(str)) {
            Uri parse = Uri.parse(str);
            u4q0 u4q0Var = zik0.a;
            SparseArray sparseArray = new SparseArray(1);
            sparseArray.put(72, parse);
            thumb = new Thumb((SparseArray<Uri>) sparseArray);
        }
        thumbsImageView.setThumb(thumb);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        ArrayList arrayList;
        List list;
        Thumb thumb;
        if (uIBlock instanceof UIBlockPlaceholder) {
            UIBlockPlaceholder uIBlockPlaceholder = (UIBlockPlaceholder) uIBlock;
            this.e = uIBlockPlaceholder;
            this.f = uIBlockPlaceholder.F;
            TextView textView = this.g;
            if (textView != null) {
                textView.setText(uIBlockPlaceholder.A);
            }
            TextView textView2 = this.h;
            if (textView2 != null) {
                textView2.setText(uIBlockPlaceholder.D);
            }
            ThumbsImageView thumbsImageView = this.i;
            if (thumbsImageView != null) {
                TitleIcon titleIcon = uIBlockPlaceholder.L;
                String str = titleIcon != null ? titleIcon.b : null;
                if (str == null || drm0.N(str)) {
                    thumb = null;
                } else {
                    Uri parse = Uri.parse(str);
                    u4q0 u4q0Var = zik0.a;
                    SparseArray sparseArray = new SparseArray(1);
                    sparseArray.put(72, parse);
                    thumb = new Thumb((SparseArray<Uri>) sparseArray);
                }
                thumbsImageView.setThumb(thumb);
            }
            Image image = uIBlockPlaceholder.B;
            if (glw.a().b()) {
                if (image != null) {
                    arrayList = image.c;
                }
                arrayList = null;
            } else {
                if (image != null) {
                    arrayList = image.b;
                }
                arrayList = null;
            }
            ImageSize Cb = image != null ? image.Cb(cn70.b(160), true, false) : null;
            if (arrayList != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    ImageSize imageSize = (ImageSize) obj;
                    if (Cb != null && imageSize.d.b == Cb.d.b) {
                        arrayList2.add(obj);
                    }
                }
                list = j5g.H0(arrayList2, 3);
            } else {
                list = null;
            }
            Triple triple = new Triple(list != null ? (ImageSize) j5g.b0(0, list) : null, list != null ? (ImageSize) j5g.b0(1, list) : null, list != null ? (ImageSize) j5g.b0(2, list) : null);
            ImageSize imageSize2 = (ImageSize) triple.d();
            ImageSize imageSize3 = (ImageSize) triple.g();
            ImageSize imageSize4 = (ImageSize) triple.h();
            ThumbsImageView thumbsImageView2 = this.j;
            if (thumbsImageView2 != null) {
                b(thumbsImageView2, imageSize3, true);
            }
            ThumbsImageView thumbsImageView3 = this.k;
            if (thumbsImageView3 != null) {
                b(thumbsImageView3, imageSize2, false);
            }
            ThumbsImageView thumbsImageView4 = this.l;
            if (thumbsImageView4 != null) {
                b(thumbsImageView4, imageSize4, true);
            }
            ImageView imageView = this.m;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                Object mutate = drawable != null ? drawable.mutate() : null;
                GradientDrawable gradientDrawable = mutate instanceof GradientDrawable ? (GradientDrawable) mutate : null;
                if (gradientDrawable == null) {
                    gradientDrawable = new GradientDrawable();
                }
                gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
                if (Build.VERSION.SDK_INT >= 29) {
                    gradientDrawable.setColors(a(), o);
                } else {
                    gradientDrawable.setColors(a());
                }
                imageView.setImageDrawable(gradientDrawable);
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_music_snippet_banner, viewGroup, false);
        this.g = (TextView) inflate.findViewById(R.id.snippet_title);
        this.h = (TextView) inflate.findViewById(R.id.snippet_subtitle);
        this.i = (ThumbsImageView) inflate.findViewById(R.id.snippet_sign);
        this.m = (ImageView) inflate.findViewById(R.id.bg_snippet_gradient);
        this.j = (ThumbsImageView) inflate.findViewById(R.id.left_album_cover);
        this.k = (ThumbsImageView) inflate.findViewById(R.id.center_album_cover);
        this.l = (ThumbsImageView) inflate.findViewById(R.id.right_album_cover);
        this.d = inflate;
        inflate.setOnClickListener(new c98(this, 1));
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == null) {
            return;
        }
        UIBlockPlaceholder uIBlockPlaceholder = this.e;
        UIBlockAction uIBlockAction = this.f;
        if (uIBlockPlaceholder == null || uIBlockAction == null) {
            return;
        }
        this.c.a(new cfp0(uIBlockPlaceholder, null));
        com.vk.catalog2.common.ui.mvp.util.a.e(this.b, view.getContext(), uIBlockPlaceholder, uIBlockAction, null, 56);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }

    /* compiled from: MusicSnippetBannerVh.kt */
    public static final class a implements b780 {
        public final /* synthetic */ ThumbsImageView b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ String d;

        public a(ThumbsImageView thumbsImageView, boolean z, String str) {
            this.b = thumbsImageView;
            this.c = z;
            this.d = str;
        }

        @Override // xsna.b780
        public final void g(String str) {
            String str2;
            this.b.setAlpha((!this.c || (str2 = this.d) == null || str2.length() == 0) ? 1.0f : 0.4f);
        }

        @Override // xsna.b780
        public final void onCancel(String str) {
        }

        @Override // xsna.b780
        public final void b(String str, Throwable th) {
        }

        @Override // xsna.b780
        public final void t(int i, int i2, String str) {
        }
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
