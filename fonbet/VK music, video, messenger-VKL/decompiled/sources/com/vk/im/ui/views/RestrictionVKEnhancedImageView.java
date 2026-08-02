package com.vk.im.ui.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.vk.core.view.fresco.VKEnhancedImageView;
import com.vk.dto.common.restrictions.PhotoRestriction;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.a5h0;
import xsna.abg0;
import xsna.amk0;
import xsna.asp;
import xsna.baf0;
import xsna.dhr0;
import xsna.f5h0;
import xsna.fxj0;
import xsna.g2u0;
import xsna.iah0;
import xsna.ixj0;
import xsna.jwx;
import xsna.kld0;
import xsna.kq01;
import xsna.pn00;
import xsna.zrp;

/* compiled from: RestrictionVKEnhancedImageView.kt */
/* loaded from: classes2.dex */
public final class RestrictionVKEnhancedImageView extends VKEnhancedImageView {
    public static final /* synthetic */ int b0 = 0;
    public final jwx O;
    public final Object P;
    public final Object Q;
    public final ColorDrawable R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public final LayerDrawable W;
    public final amk0 a0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RestrictionVKEnhancedImageView.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a BIG;
        public static final a MEDIUM;
        public static final a SMALL;

        static {
            a aVar = new a("SMALL", 0);
            SMALL = aVar;
            a aVar2 = new a("MEDIUM", 1);
            MEDIUM = aVar2;
            a aVar3 = new a("BIG", 2);
            BIG = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public RestrictionVKEnhancedImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    private final a getIconSize() {
        int t = iah0.t(getMeasuredHeight());
        int t2 = iah0.t(getMeasuredWidth());
        return (t < 48 || t2 < 48) ? a.SMALL : (t < 96 || t2 < 96) ? a.MEDIUM : a.BIG;
    }

    @Override // com.vk.core.view.fresco.VKEnhancedImageView
    public final void U0(int i, int i2) {
        ImageRequest imageRequest;
        if (this.T) {
            EmptyList emptyList = EmptyList.b;
            setLocalImageList(emptyList);
            setRemoteImageList(emptyList);
            setCurrentLocalImage(null);
            setCurrentRemoteImage(null);
            super.U0(i, i2);
            return;
        }
        if (!this.S && !this.V) {
            super.U0(i, i2);
            return;
        }
        boolean z = getLocalImageList() != null ? !r0.isEmpty() : false;
        boolean z2 = getRemoteImageList() != null ? !r3.isEmpty() : false;
        if (z || z2) {
            List<fxj0> remoteImageList = getRemoteImageList();
            fxj0 m = remoteImageList != null ? ixj0.m(remoteImageList) : null;
            if (m != null) {
                ImageRequestBuilder r = kq01.r(m, i, i2, this.w, getScaleType());
                r.k = this.O;
                r.j = Priority.HIGH;
                imageRequest = r.a();
            } else {
                imageRequest = null;
            }
            getBackend().Z(m != null ? m.getUrl() : null);
            getBackend().c0(imageRequest, null, null);
        }
    }

    public final void e1() {
        boolean z = this.V;
        amk0 amk0Var = this.a0;
        if (!z || this.S || this.T) {
            amk0Var.e();
        } else {
            amk0Var.d();
        }
    }

    @Override // xsna.zjt, android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e1();
    }

    @Override // xsna.zjt, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a0.e();
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.Map] */
    @Override // com.vk.core.view.fresco.VKEnhancedImageView, com.vk.imageloader.view.VKImageView, xsna.zjt, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.a0.a(canvas);
        if (this.S) {
            a5h0 a5h0Var = (a5h0) this.P.get(getIconSize());
            if (a5h0Var == null) {
                return;
            }
            a5h0Var.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            a5h0Var.draw(canvas);
            return;
        }
        if (this.T) {
            a5h0 a5h0Var2 = (a5h0) this.Q.get(getIconSize());
            if (a5h0Var2 == null) {
                return;
            }
            a5h0Var2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            a5h0Var2.draw(canvas);
            return;
        }
        if (this.U) {
            float f = 8;
            int a2 = iah0.a(f);
            int a3 = iah0.a(f);
            float f2 = 18;
            int a4 = iah0.a(f2) + iah0.a(f);
            int a5 = iah0.a(f2) + iah0.a(f);
            LayerDrawable layerDrawable = this.W;
            layerDrawable.setBounds(a2, a3, a4, a5);
            layerDrawable.draw(canvas);
        }
    }

    @Override // com.vk.core.view.fresco.VKEnhancedImageView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.a0.c(getWidth(), getHeight());
    }

    public final void setDonation(boolean z) {
        this.U = z;
        invalidate();
    }

    public final void setRestrictions(PhotoRestriction photoRestriction) {
        boolean z = photoRestriction != null ? !photoRestriction.d : false;
        boolean z2 = photoRestriction != null ? photoRestriction.d : false;
        this.T = z;
        this.S = z2;
        e1();
        getHierarchy().r((this.S || (this.V && !this.T)) ? this.R : null, 0);
        invalidate();
    }

    public final void setSpoiler(boolean z) {
        this.V = z;
        e1();
        getHierarchy().r((this.S || (this.V && !this.T)) ? this.R : null, 0);
        invalidate();
    }

    public RestrictionVKEnhancedImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.O = new jwx(2, 8);
        abg0 abg0Var = dhr0.t;
        baf0 baf0Var = new baf0(abg0Var.a(R.drawable.vk_icon_hide_outline_20), -1);
        f5h0.g gVar = f5h0.g.a;
        a5h0 a5h0Var = new a5h0(baf0Var, gVar);
        a5h0 a5h0Var2 = new a5h0(new baf0(abg0Var.a(R.drawable.vk_icon_hide_outline_28), -1), gVar);
        a5h0 a5h0Var3 = new a5h0(new baf0(abg0Var.a(R.drawable.vk_icon_hide_outline_56), -1), gVar);
        a5h0 a5h0Var4 = new a5h0(abg0Var.b(R.drawable.vk_icon_block_outline_20, R.attr.vk_ui_icon_tertiary_alpha), gVar);
        a5h0 a5h0Var5 = new a5h0(abg0Var.b(R.drawable.vk_icon_block_outline_28, R.attr.vk_ui_icon_tertiary_alpha), gVar);
        a5h0 a5h0Var6 = new a5h0(abg0Var.b(R.drawable.vk_icon_block_outline_56, R.attr.vk_ui_icon_tertiary_alpha), gVar);
        a aVar = a.SMALL;
        Pair pair = new Pair(aVar, a5h0Var);
        a aVar2 = a.MEDIUM;
        Pair pair2 = new Pair(aVar2, a5h0Var2);
        a aVar3 = a.BIG;
        this.P = pn00.k(pair, pair2, new Pair(aVar3, a5h0Var3));
        this.Q = pn00.k(new Pair(aVar, a5h0Var4), new Pair(aVar2, a5h0Var5), new Pair(aVar3, a5h0Var6));
        ColorDrawable colorDrawable = new ColorDrawable();
        colorDrawable.setColor(g2u0.a(R.color.vk_black_alpha24, this));
        this.R = colorDrawable;
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{abg0Var.a(R.drawable.bg_im_donut_color), new a5h0(abg0Var.a(R.drawable.vk_icon_donut_color_20), gVar)});
        float f = 2;
        layerDrawable.setLayerInset(1, iah0.a(f), iah0.a(f), iah0.a(f), iah0.a(f));
        this.W = layerDrawable;
        this.a0 = new amk0(new kld0(this, 5));
    }
}
