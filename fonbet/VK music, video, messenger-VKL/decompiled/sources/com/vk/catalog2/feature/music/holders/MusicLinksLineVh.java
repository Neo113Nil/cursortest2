package com.vk.catalog2.feature.music.holders;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.airbnb.lottie.LottieAnimationView;
import com.vk.api.generated.catalog.dto.CatalogBackgroundDto;
import com.vk.catalog2.common.dto.api.Meta;
import com.vk.catalog2.common.dto.api.link.CatalogLink;
import com.vk.catalog2.common.dto.api.link.CatalogLinkImageStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.catalog2.common.dto.ui.UIBlockStaticLinksBanner;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.feature.music.holders.MusicLinksLineVh;
import com.vk.catalog2.feature.music.holders.view.CatalogTripleRotatedImagesCard;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.common.Image;
import com.vk.imageloader.view.VKImageView;
import com.vk.movika.sdk.base.model.n;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.b;
import java.util.ArrayList;
import java.util.List;
import xsna.ab;
import xsna.b5a;
import xsna.bpn0;
import xsna.bwt0;
import xsna.cn70;
import xsna.dhr0;
import xsna.drm0;
import xsna.e1a;
import xsna.j5g;
import xsna.jb5;
import xsna.k7a;
import xsna.lfo0;
import xsna.m1o;
import xsna.r800;
import xsna.slw;
import xsna.tzx0;
import xsna.z7z;

/* compiled from: MusicLinksLineVh.kt */
/* loaded from: classes16.dex */
public final class MusicLinksLineVh implements CatalogViewHolder {
    public final b5a b;
    public final SearchStatInfoProvider c;
    public final k7a d;
    public final e1a e;
    public View f;
    public final bpn0 g = new bpn0(new m1o(this, 26));
    public final b h = new b();
    public final jb5 i = new jb5(this, 9);

    public MusicLinksLineVh(b5a b5aVar, SearchStatInfoProvider searchStatInfoProvider, k7a k7aVar, e1a e1aVar) {
        this.b = b5aVar;
        this.c = searchStatInfoProvider;
        this.d = k7aVar;
        this.e = e1aVar;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        this.h.e();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockStaticLinksBanner) {
            ArrayList<UIBlockLink> arrayList = ((UIBlockStaticLinksBanner) uIBlock).y;
            UIBlock uIBlock2 = (UIBlock) j5g.b0(0, arrayList);
            View view = this.f;
            if (view == null) {
                view = null;
            }
            a(view.findViewById(R.id.music_line_link_1), uIBlock2);
            UIBlock uIBlock3 = (UIBlock) j5g.b0(1, arrayList);
            View view2 = this.f;
            if (view2 == null) {
                view2 = null;
            }
            a(view2.findViewById(R.id.music_line_link_2), uIBlock3);
            UIBlock uIBlock4 = (UIBlock) j5g.b0(2, arrayList);
            View view3 = this.f;
            if (view3 == null) {
                view3 = null;
            }
            a(view3.findViewById(R.id.music_line_link_3), uIBlock4);
            UIBlock uIBlock5 = (UIBlock) j5g.b0(3, arrayList);
            View view4 = this.f;
            a((view4 != null ? view4 : null).findViewById(R.id.music_line_link_4), uIBlock5);
        }
    }

    public final void a(final View view, UIBlock uIBlock) {
        CatalogLink catalogLink;
        Drawable drawable;
        final UIBlockLink uIBlockLink = uIBlock instanceof UIBlockLink ? (UIBlockLink) uIBlock : null;
        bwt0.p0(view.findViewById(R.id.music_line_link_container), uIBlockLink != null);
        if (uIBlockLink == null || (catalogLink = uIBlockLink.y) == null) {
            return;
        }
        CharSequence charSequence = catalogLink.c;
        VkText vkText = (VkText) view.findViewById(R.id.link_title);
        String str = catalogLink.d;
        if (str.length() == 0) {
            str = null;
        }
        int i = str == null ? 2 : 1;
        vkText.setMaxLines(i);
        Meta meta = catalogLink.g;
        if (meta != null && meta.h) {
            bpn0 bpn0Var = this.g;
            if (((Drawable) bpn0Var.getValue()) != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) " ");
                Drawable drawable2 = (Drawable) bpn0Var.getValue();
                vkText.getContext();
                Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(" ");
                drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
                newSpannable.setSpan(new tzx0(drawable2, 1, -1.0f, false, 0, 0, 0), 0, 1, 33);
                spannableStringBuilder.append((CharSequence) newSpannable);
                SpannedString spannedString = new SpannedString(spannableStringBuilder);
                lfo0 lfo0Var = new lfo0(vkText);
                lfo0Var.c = spannedString;
                lfo0Var.b = charSequence;
                lfo0Var.d = true;
                charSequence = lfo0.b(lfo0Var, vkText.getResources().getDimensionPixelSize(R.dimen.music_catalog_link_item_width), i, 4);
            }
        }
        vkText.setText(charSequence, TextView.BufferType.SPANNABLE);
        VkText vkText2 = (VkText) view.findViewById(R.id.link_subtitle);
        bwt0.p0(vkText2, str != null);
        vkText2.setMaxLines(1);
        if (str != null) {
            vkText2.setText(str);
        }
        CatalogLinkImageStyle catalogLinkImageStyle = catalogLink.j;
        CatalogBackgroundDto catalogBackgroundDto = catalogLink.l;
        boolean z = catalogLinkImageStyle == CatalogLinkImageStyle.TRIPLE_ROTATED_RIGHT && catalogBackgroundDto != null;
        final CatalogTripleRotatedImagesCard catalogTripleRotatedImagesCard = (CatalogTripleRotatedImagesCard) view.findViewById(R.id.link_image_container);
        final Image image = z ? null : catalogLink.f;
        final List<Image> list = z ? catalogLink.n : null;
        String str2 = z ? null : catalogLink.k;
        if (!z || catalogBackgroundDto == null) {
            drawable = null;
        } else {
            ColorDrawable colorDrawable = new ColorDrawable(0);
            this.e.getClass();
            drawable = e1a.a(catalogBackgroundDto, colorDrawable);
        }
        final ab abVar = new ab(15, this, uIBlockLink);
        VKImageView vKImageView = (VKImageView) catalogTripleRotatedImagesCard.findViewById(R.id.link_image_background);
        bwt0.p0(vKImageView, drawable != null);
        if (drawable != null) {
            z7z z7zVar = drawable instanceof z7z ? (z7z) drawable : null;
            if (z7zVar != null) {
                z7zVar.f = n.a(12.0f);
                float a = cn70.a() * 1.0f;
                int c = dhr0.t.c(R.attr.vk_ui_image_border_alpha);
                Paint paint = new Paint();
                z7zVar.e = paint;
                paint.setStyle(Paint.Style.STROKE);
                paint.setColor(c);
                paint.setStrokeWidth(a);
                paint.setAntiAlias(true);
            }
            vKImageView.p0(new slw(drawable));
        }
        boolean z2 = str2 == null || str2.length() == 0;
        catalogTripleRotatedImagesCard.i = (LottieAnimationView) catalogTripleRotatedImagesCard.findViewById(R.id.link_image_animation);
        final boolean z3 = list != null && list.size() >= 3;
        catalogTripleRotatedImagesCard.f(z2, z3);
        if (z2) {
            catalogTripleRotatedImagesCard.d(image, list, abVar, z3);
        } else {
            r800<Throwable> r800Var = new r800() { // from class: xsna.tha
                @Override // xsna.r800
                public final void onResult(Object obj) {
                    int i2 = CatalogTripleRotatedImagesCard.j;
                    CatalogTripleRotatedImagesCard catalogTripleRotatedImagesCard2 = CatalogTripleRotatedImagesCard.this;
                    boolean z4 = z3;
                    catalogTripleRotatedImagesCard2.f(true, z4);
                    catalogTripleRotatedImagesCard2.d(image, list, abVar, z4);
                }
            };
            LottieAnimationView lottieAnimationView = catalogTripleRotatedImagesCard.i;
            if (lottieAnimationView != null) {
                bwt0.d0(lottieAnimationView, str2 == null);
                lottieAnimationView.setFailureListener(r800Var);
                lottieAnimationView.s0(str2, str2 != null ? (String) j5g.k0(drm0.c0(str2, new String[]{DomExceptionUtils.SEPARATOR}, 0, 6)) : null);
                lottieAnimationView.m0();
            }
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: xsna.qm40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                UIBlockLink uIBlockLink2 = uIBlockLink;
                jb5 jb5Var = MusicLinksLineVh.this.i;
                View view3 = view;
                ((View.OnClickListener) jb5Var.invoke(view3, uIBlockLink2)).onClick(view3);
            }
        });
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_links_line, viewGroup, false);
        this.f = inflate;
        return inflate;
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
