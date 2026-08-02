package com.vk.im.ui.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.vk.core.view.fresco.FrescoImageView;
import com.vk.dto.common.restrictions.PhotoRestriction;
import com.vk.imageloader.fresco.CallerContext;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.a5h0;
import xsna.abg0;
import xsna.amk0;
import xsna.asp;
import xsna.baf0;
import xsna.bpn0;
import xsna.dhr0;
import xsna.dlo;
import xsna.f5h0;
import xsna.fxj0;
import xsna.g2u0;
import xsna.iah0;
import xsna.ixj0;
import xsna.jwx;
import xsna.lpa0;
import xsna.o360;
import xsna.ozl;
import xsna.pn00;
import xsna.r010;
import xsna.yiz;
import xsna.zrp;

/* compiled from: RestrictionFrescoImageViewLegacy.kt */
@ozl
/* loaded from: classes2.dex */
public final class RestrictionFrescoImageViewLegacy extends FrescoImageView {
    public static final /* synthetic */ int f0 = 0;
    public final jwx S;
    public final Object T;
    public final Object U;
    public final ColorDrawable V;
    public boolean W;
    public boolean a0;
    public boolean b0;
    public boolean c0;
    public final LayerDrawable d0;
    public final amk0 e0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RestrictionFrescoImageViewLegacy.kt */
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

    public RestrictionFrescoImageViewLegacy(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.S = new jwx(2, 8);
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
        this.T = pn00.k(pair, pair2, new Pair(aVar3, a5h0Var3));
        this.U = pn00.k(new Pair(aVar, a5h0Var4), new Pair(aVar2, a5h0Var5), new Pair(aVar3, a5h0Var6));
        ColorDrawable colorDrawable = new ColorDrawable();
        colorDrawable.setColor(g2u0.a(R.color.vk_black_alpha24, this));
        this.V = colorDrawable;
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{abg0Var.a(R.drawable.bg_im_donut_color), new a5h0(abg0Var.a(R.drawable.vk_icon_donut_color_20), gVar)});
        float f = 2;
        layerDrawable.setLayerInset(1, iah0.a(f), iah0.a(f), iah0.a(f), iah0.a(f));
        this.d0 = layerDrawable;
        this.e0 = new amk0(new r010(this, 27));
    }

    private final a getIconSize() {
        int t = iah0.t(getMeasuredHeight());
        int t2 = iah0.t(getMeasuredWidth());
        return (t < 48 || t2 < 48) ? a.SMALL : (t < 96 || t2 < 96) ? a.MEDIUM : a.BIG;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.core.view.fresco.FrescoImageView
    public final void h(int i, int i2) {
        REQUEST request;
        ImageRequestBuilder o;
        if (this.a0) {
            EmptyList emptyList = EmptyList.b;
            setLocalImageList(emptyList);
            setRemoteImageList(emptyList);
            super.h(i, i2);
            return;
        }
        if (!this.W && !this.c0) {
            super.h(i, i2);
            return;
        }
        boolean z = getLocalImageList() != null ? !r0.isEmpty() : false;
        boolean z2 = getRemoteImageList() != null ? !r2.isEmpty() : false;
        if (!z && !z2) {
            dlo dloVar = getDraweeHolder().e;
            lpa0 controllerBuilder = getControllerBuilder();
            controllerBuilder.d();
            controllerBuilder.l = dloVar;
            controllerBuilder.h = this;
            controllerBuilder.b = CallerContext.Frontend;
            yiz.b(controllerBuilder, getContext(), null);
            getDraweeHolder().h(getControllerBuilder().b());
            return;
        }
        List<fxj0> remoteImageList = getRemoteImageList();
        fxj0 m = remoteImageList != null ? ixj0.m(remoteImageList) : null;
        if (m == null || (o = o(m, i, i2)) == null) {
            request = 0;
        } else {
            o.k = this.S;
            o.j = Priority.HIGH;
            request = o.a();
        }
        bpn0 bpn0Var = o360.e;
        o360.a.a().h(m != null ? m.getUrl() : null);
        dlo dloVar2 = getDraweeHolder().e;
        lpa0 controllerBuilder2 = getControllerBuilder();
        controllerBuilder2.d();
        controllerBuilder2.l = dloVar2;
        controllerBuilder2.c = request;
        controllerBuilder2.h = this;
        controllerBuilder2.b = CallerContext.Frontend;
        yiz.b(controllerBuilder2, getContext(), null);
        getDraweeHolder().h(getControllerBuilder().b());
    }

    @Override // com.vk.core.view.fresco.FrescoImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        r();
    }

    @Override // com.vk.core.view.fresco.FrescoImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e0.e();
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.Map] */
    @Override // com.vk.core.view.fresco.FrescoImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.e0.a(canvas);
        if (this.W) {
            a5h0 a5h0Var = (a5h0) this.T.get(getIconSize());
            if (a5h0Var == null) {
                return;
            }
            a5h0Var.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            a5h0Var.draw(canvas);
            return;
        }
        if (this.a0) {
            a5h0 a5h0Var2 = (a5h0) this.U.get(getIconSize());
            if (a5h0Var2 == null) {
                return;
            }
            a5h0Var2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            a5h0Var2.draw(canvas);
            return;
        }
        if (this.b0) {
            float f = 8;
            int a2 = iah0.a(f);
            int a3 = iah0.a(f);
            float f2 = 18;
            int a4 = iah0.a(f2) + iah0.a(f);
            int a5 = iah0.a(f2) + iah0.a(f);
            LayerDrawable layerDrawable = this.d0;
            layerDrawable.setBounds(a2, a3, a4, a5);
            layerDrawable.draw(canvas);
        }
    }

    @Override // com.vk.core.view.fresco.FrescoImageView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.e0.c(getWidth(), getHeight());
    }

    public final void r() {
        boolean z = this.c0;
        amk0 amk0Var = this.e0;
        if (!z || this.W || this.a0) {
            amk0Var.e();
        } else {
            amk0Var.d();
        }
    }

    public final void setDonation(boolean z) {
        this.b0 = z;
        invalidate();
    }

    public final void setRestrictions(PhotoRestriction photoRestriction) {
        this.W = photoRestriction != null ? photoRestriction.d : false;
        this.a0 = photoRestriction != null ? !photoRestriction.d : false;
        r();
        getHierarchy().r((this.W || (this.c0 && !this.a0)) ? this.V : null, 0);
        invalidate();
    }

    public final void setSpoiler(boolean z) {
        this.c0 = z;
        r();
        getHierarchy().r((this.W || (this.c0 && !this.a0)) ? this.V : null, 0);
        invalidate();
    }
}
