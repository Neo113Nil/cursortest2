package com.vk.libvideo.design.view.actionlink;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.TextView;
import com.vk.core.view.components.picture.VkImage;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.libvideo.design.view.actionlink.b;
import com.vk.movika.sdk.base.logic.processor.actions.d;
import com.vk.stat.scheme.CommonVideoStat$TypeVsidItem;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeOverlayLiveProductCardImpression;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeOverlayLiveProductCloseClick;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.LazyThreadSafetyMode;
import xsna.bpn0;
import xsna.bwt0;
import xsna.d20;
import xsna.e20;
import xsna.f20;
import xsna.g20;
import xsna.gzp0;
import xsna.h20;
import xsna.hg;
import xsna.hny;
import xsna.i20;
import xsna.j20;
import xsna.j5g;
import xsna.msy;
import xsna.qqy;
import xsna.ra;
import xsna.s3q0;
import xsna.z10;

/* compiled from: ActionLinkProductView.kt */
/* loaded from: classes2.dex */
public final class a extends qqy<z10> {
    public static final bpn0 j = new bpn0(new e20(0));
    public static final bpn0 k = new bpn0(new f20(0));
    public final d20 c;
    public boolean d;
    public ValueAnimator e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;

    public a(Context context) {
        super(context);
        this.c = new d20();
        ra raVar = new ra(this, 1);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f = msy.a(lazyThreadSafetyMode, raVar);
        this.g = msy.a(lazyThreadSafetyMode, new h20(this, 0));
        int i = 1;
        this.h = msy.a(lazyThreadSafetyMode, new d(this, i));
        this.i = msy.a(lazyThreadSafetyMode, new hg(this, i));
        b();
    }

    public static s3q0 d(a aVar, b.C1229b.a.j jVar) {
        aVar.d = true;
        bwt0.p0(aVar.getFullProduct(), false);
        bwt0.p0(aVar.getShortProduct(), true);
        aVar.c.getClass();
        gzp0.a.c(new MobileOfficialAppsVideoStat$TypeOverlayLiveProductCloseClick(MobileOfficialAppsVideoStat$TypeOverlayLiveProductCloseClick.EventType.OVERLAY_LIVE_PRODUCT_CLOSE_CLICK, new CommonVideoStat$TypeVsidItem(jVar.h), jVar.c, jVar.i, Long.valueOf(jVar.j), Long.valueOf(jVar.k)));
        return s3q0.a;
    }

    public static s3q0 e(a aVar) {
        aVar.d = false;
        bwt0.p0(aVar.getShortProduct(), false);
        bwt0.p0(aVar.getFullProduct(), true);
        return s3q0.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ViewGroup getFullProduct() {
        return (ViewGroup) this.h.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ViewGroup getLandscapeProduct() {
        return (ViewGroup) this.g.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ViewGroup getPortraitProduct() {
        return (ViewGroup) this.f.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ViewGroup getShortProduct() {
        return (ViewGroup) this.i.getValue();
    }

    @Override // xsna.qqy
    public final void b() {
        View.inflate(getContext(), R.layout.vkl_view_action_link_product, this);
        bwt0.i0(getShortProduct(), new g20(this, 0));
    }

    @Override // xsna.qqy
    public final void c(z10 z10Var) {
        b c = z10Var.c();
        if (c instanceof b.C1229b) {
            b.C1229b c1229b = (b.C1229b) c;
            b.C1229b.a aVar = c1229b.b;
            b.C1229b.a aVar2 = c1229b.b;
            if (aVar instanceof b.C1229b.a.j) {
                f(getPortraitProduct(), (b.C1229b.a.j) aVar2);
                f(getLandscapeProduct(), (b.C1229b.a.j) aVar2);
            }
        }
    }

    public final void f(ViewGroup viewGroup, b.C1229b.a.j jVar) {
        String str;
        ArrayList arrayList;
        ImageSize imageSize;
        ImageSize Cb;
        this.c.a = jVar;
        Image image = jVar.g;
        TextView textView = (TextView) viewGroup.findViewById(R.id.vkl_product_price);
        if (textView != null) {
            textView.setText(jVar.f);
        }
        TextView textView2 = (TextView) viewGroup.findViewById(R.id.vkl_product_title);
        if (textView2 != null) {
            textView2.setText(jVar.d);
        }
        String str2 = jVar.e;
        boolean z = str2.length() > 0;
        TextView textView3 = (TextView) viewGroup.findViewById(R.id.vkl_product_rating);
        if (textView3 != null) {
            bwt0.p0(textView3, z);
        }
        if (z && textView3 != null) {
            textView3.setText(str2);
        }
        View findViewById = viewGroup.findViewById(R.id.vkl_product_close);
        if (findViewById != null) {
            bwt0.i0(findViewById, new j20(0, this, jVar));
        }
        if (image == null || (Cb = image.Cb(((Number) j.getValue()).intValue(), true, true)) == null || (str = Cb.d.d) == null) {
            str = (image == null || (arrayList = image.b) == null || (imageSize = (ImageSize) j5g.a0(arrayList)) == null) ? null : imageSize.d.d;
        }
        VkImage vkImage = (VkImage) viewGroup.findViewById(R.id.vkl_product_preview);
        if (vkImage != null) {
            vkImage.s0(str);
        }
        VkImage vkImage2 = (VkImage) viewGroup.findViewById(R.id.vkl_product_preview);
        if (vkImage2 != null) {
            float intValue = ((Number) k.getValue()).intValue();
            hny hnyVar = new hny(getContext());
            hnyVar.c(intValue, R.attr.vk_ui_image_placeholder);
            hnyVar.d(R.drawable.vk_icon_market_16, R.attr.vk_ui_vkontakte_color_placeholder_icon_tint);
            vkImage2.setEmptyImagePlaceholder(hnyVar);
        }
    }

    public final void g(int i) {
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ViewGroup shortProduct = bwt0.K(getShortProduct()) ? getShortProduct() : getFullProduct();
        ViewGroup fullProduct = bwt0.K(getShortProduct()) ? getFullProduct() : getShortProduct();
        ViewGroup.LayoutParams layoutParams = shortProduct.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        ValueAnimator ofInt = ValueAnimator.ofInt(marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0, i);
        ofInt.setDuration(200L);
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.addUpdateListener(new i20(shortProduct, 0));
        ofInt.start();
        this.e = ofInt;
        ViewGroup.LayoutParams layoutParams2 = fullProduct.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.setMargins(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, i);
        fullProduct.setLayoutParams(marginLayoutParams2);
        boolean z = this.d;
        bwt0.p0(getShortProduct(), z);
        d20 d20Var = this.c;
        if (z) {
            d20Var.a(MobileOfficialAppsVideoStat$TypeOverlayLiveProductCardImpression.EventSubtype.BAG);
        }
        boolean z2 = this.d;
        bwt0.p0(getFullProduct(), !z2);
        if (z2) {
            return;
        }
        boolean z3 = getResources().getDisplayMetrics().widthPixels > getResources().getDisplayMetrics().heightPixels;
        bwt0.p0(getLandscapeProduct(), z3);
        bwt0.p0(getPortraitProduct(), !z3);
        d20Var.a(MobileOfficialAppsVideoStat$TypeOverlayLiveProductCardImpression.EventSubtype.PRODUCT_CARD);
    }
}
