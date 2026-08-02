package com.vk.newsfeed.posting.market_picker.presentation.base.view;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.paging.list.VkErrorView;
import com.vk.core.view.components.paging.list.a;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.restrictions.PhotoRestriction;
import com.vk.dto.common.restrictions.RestrictionButton;
import com.vk.dto.photo.Photo;
import com.vk.feed.design.view.newsfeed.restriction.RestrictedBlurredPhotoView;
import com.vk.feed.design.view.newsfeed.restriction.RestrictedPhotoView;
import com.vk.feed.tool.view.posting.zoomimage.ZoomImageView;
import com.vk.newsfeed.posting.impl.domain.model.ImageCropArea;
import com.vk.newsfeed.posting.market_picker.presentation.base.view.e;
import com.vk.newsfeed.posting.market_picker.presentation.base.view.h;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import xsna.an10;
import xsna.bik;
import xsna.bqt;
import xsna.bwt0;
import xsna.cn70;
import xsna.cy0;
import xsna.dlo;
import xsna.e3m;
import xsna.f5h0;
import xsna.gla;
import xsna.hc3;
import xsna.iah0;
import xsna.ixj0;
import xsna.izs;
import xsna.j5g;
import xsna.lpa0;
import xsna.m1o;
import xsna.pha0;
import xsna.rhs;
import xsna.sg0;
import xsna.tkc;
import xsna.vam;
import xsna.via0;
import xsna.w8q;
import xsna.wnh;
import xsna.x9g0;
import xsna.xaa0;

/* compiled from: ImageViewerPage.kt */
/* loaded from: classes4.dex */
public final class d {
    public final ViewGroup a;
    public final int b;
    public final e.b c;
    public final h.b d;
    public izs<? super Photo, ? extends List<? extends via0>> e;
    public izs<? super Photo, Boolean> f;
    public final bik g;
    public int h;
    public hc3 i;
    public final pha0 j;
    public final ZoomImageView k;
    public final VkErrorView l;
    public final View m;

    public d() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d(ViewGroup viewGroup, int i, e.b bVar, h.b bVar2, ClippingImageView clippingImageView, vam vamVar, bqt bqtVar) {
        int i2;
        int i3;
        RestrictionButton restrictionButton;
        this.a = viewGroup;
        this.b = i;
        this.c = bVar;
        this.d = bVar2;
        this.e = vamVar;
        this.f = bqtVar;
        this.g = new bik();
        pha0 pha0Var = new pha0(viewGroup.getContext());
        this.j = pha0Var;
        ZoomImageView zoomImageView = (ZoomImageView) viewGroup.findViewById(R.id.zoomable_image);
        this.k = zoomImageView;
        VkErrorView vkErrorView = (VkErrorView) viewGroup.findViewById(R.id.zoomable_image_error_view);
        this.l = vkErrorView;
        pha0Var.c = zoomImageView;
        zoomImageView.setActualScaleType(f5h0.i.a);
        zoomImageView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: xsna.enw
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
                q6y0 q6y0Var;
                if ((i7 == i11 && i6 == i10) || (q6y0Var = com.vk.newsfeed.posting.market_picker.presentation.base.view.d.this.k.m) == null) {
                    return;
                }
                q6y0Var.i(1.0f);
            }
        });
        zoomImageView.setZoomable(false);
        zoomImageView.getHierarchy().q(0);
        zoomImageView.getHierarchy().p(new xaa0(), 3);
        zoomImageView.setUpdateListener(new w8q(this, 12));
        zoomImageView.setContentDescription(viewGroup.getContext().getString(R.string.accessibility_zoomable_image));
        bwt0.Q(zoomImageView, R.id.zoomable_image, bVar.c);
        vkErrorView.c(a.C0851a.a(vkErrorView.getContext(), new cy0(16, this, zoomImageView)));
        vkErrorView.setOnClickListener(new tkc(this, 2));
        h hVar = h.this;
        int i4 = -1;
        if (hVar.d.h(i)) {
            wnh wnhVar = new wnh(this, 21);
            f fVar = hVar.d;
            e.b bVar3 = (e.b) j5g.b0(i, fVar.l);
            FrameLayout frameLayout = null;
            r14 = null;
            String str = null;
            if (bVar3 != null) {
                PhotoAttachment photoAttachment = bVar3.b;
                Photo photo = photoAttachment.l;
                if (photo.Ib()) {
                    Context context = viewGroup.getContext();
                    i2 = 8;
                    RestrictedBlurredPhotoView restrictedBlurredPhotoView = new RestrictedBlurredPhotoView(context, null, 6);
                    int b = cn70.b(32);
                    restrictedBlurredPhotoView.setPadding(b, b, b, b);
                    restrictedBlurredPhotoView.setTextTopMargin(cn70.b(8));
                    PhotoRestriction photoRestriction = photo.L;
                    restrictedBlurredPhotoView.setText(photoRestriction != null ? photoRestriction.c : null);
                    restrictedBlurredPhotoView.setForceText(true);
                    if (photo.Hb()) {
                        restrictedBlurredPhotoView.c(R.drawable.vk_icon_hide_outline_56, -1, RestrictedPhotoView.u);
                        restrictedBlurredPhotoView.setTextColor(-1);
                        restrictedBlurredPhotoView.setButtonTopMargin(cn70.b(20));
                        PhotoRestriction photoRestriction2 = photo.L;
                        if (photoRestriction2 != null && (restrictionButton = photoRestriction2.e) != null) {
                            str = restrictionButton.c;
                        }
                        restrictedBlurredPhotoView.setButtonText(str);
                        restrictedBlurredPhotoView.setButtonClickListener(new gla(4, fVar, photo));
                        ImageSize imageSize = (ImageSize) ixj0.b(photo.y.b);
                        imageSize = imageSize == null ? ImageSize.f : imageSize;
                        HashSet hashSet = iah0.a;
                        int i5 = context.getResources().getDisplayMetrics().widthPixels;
                        restrictedBlurredPhotoView.g(i5, an10.b(i5 / imageSize.E0()));
                        restrictedBlurredPhotoView.h(photoAttachment.Ib(), photo.P);
                    } else {
                        restrictedBlurredPhotoView.c(R.drawable.vk_icon_do_not_disturb_outline_56, e3m.f(R.attr.vk_ui_vkontakte_color_placeholder_icon_foreground_primary, context), RestrictedPhotoView.u);
                        restrictedBlurredPhotoView.setTextColor(e3m.f(R.attr.vk_ui_text_secondary, context));
                        restrictedBlurredPhotoView.setBackgroundColor(context.getColor(R.color.vk_white_alpha8));
                    }
                    FrameLayout frameLayout2 = new FrameLayout(context);
                    if (photo.Hb()) {
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                        layoutParams.gravity = 17;
                        frameLayout2.addView(restrictedBlurredPhotoView, layoutParams);
                        i4 = -1;
                    } else {
                        i4 = -1;
                        frameLayout2.addView(restrictedBlurredPhotoView, -1, -1);
                    }
                    fVar.x.c.put(i, wnhVar);
                    frameLayout = frameLayout2;
                    this.m = frameLayout;
                    if (frameLayout == null) {
                        viewGroup.addView(frameLayout, i4, i4);
                        i3 = i2;
                        frameLayout.setOnClickListener(new sg0(this, i3));
                    } else {
                        i3 = i2;
                    }
                    this.h = 3;
                    zoomImageView.setVisibility(i3);
                    vkErrorView.setVisibility(i3);
                    clippingImageView.setVisibility(4);
                }
            }
            i2 = 8;
            this.m = frameLayout;
            if (frameLayout == null) {
            }
            this.h = 3;
            zoomImageView.setVisibility(i3);
            vkErrorView.setVisibility(i3);
            clippingImageView.setVisibility(4);
        } else {
            b(zoomImageView);
        }
        viewGroup.addView(pha0Var.b, -1, -1);
        pha0Var.o = bVar.d;
        a();
        pha0Var.p = new m1o(this, 15);
    }

    public final void a() {
        izs<? super Photo, Boolean> izsVar;
        izs<? super Photo, ? extends List<? extends via0>> izsVar2 = this.e;
        if (izsVar2 == null || (izsVar = this.f) == null) {
            return;
        }
        e.b bVar = this.c;
        List<? extends via0> invoke = izsVar2.invoke(bVar.d);
        boolean booleanValue = izsVar.invoke(bVar.d).booleanValue();
        pha0 pha0Var = this.j;
        ArrayList arrayList = pha0Var.e;
        arrayList.clear();
        arrayList.addAll(invoke);
        pha0Var.f = booleanValue;
        pha0Var.b();
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [REQUEST, com.facebook.imagepipeline.request.ImageRequest] */
    public final void b(ZoomImageView zoomImageView) {
        bik bikVar;
        this.h = 0;
        int z = iah0.z(zoomImageView.getContext());
        dlo controller = zoomImageView.getController();
        lpa0 lpa0Var = rhs.a().get();
        lpa0Var.l = controller;
        e.b bVar = this.c;
        String str = bVar.c;
        int i = bVar.i;
        int i2 = bVar.h;
        ImageCropArea imageCropArea = bVar.e;
        if (imageCropArea != null) {
            int i3 = imageCropArea.g;
            int i4 = imageCropArea.f;
            int max = Math.max(i4, i3);
            float f = (z <= 0 || max <= z) ? 1.0f : z / max;
            int b = an10.b(i4 * f);
            int b2 = an10.b(f * i3);
            bikVar = this.g;
            bikVar.f(b, b2);
            int i5 = imageCropArea.d;
            float f2 = bVar.f;
            int i6 = imageCropArea.e;
            float f3 = bVar.g;
            bikVar.g((i5 * 100.0f) / f2, ((i5 + i4) * 100.0f) / f2, (i6 * 100.0f) / f3, ((i6 + i3) * 100.0f) / f3);
        } else {
            bikVar = null;
        }
        int max2 = Math.max(i2, i);
        float f4 = (z <= 0 || max2 <= z) ? 1.0f : z / max2;
        ImageRequestBuilder h = ImageRequestBuilder.h(Uri.parse(str));
        h.j = Priority.HIGH;
        h.k = bikVar;
        int b3 = an10.b(i2 * f4);
        int b4 = an10.b(i * f4);
        h.d = (b3 <= 0 || b4 <= 0) ? null : new x9g0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, b3, b4, 12);
        lpa0Var.c = h.a();
        lpa0Var.i = true;
        lpa0Var.h = new c(this);
        zoomImageView.setController(lpa0Var.b());
        zoomImageView.setVisibility(0);
        this.l.setVisibility(8);
    }
}
