package com.sofascore.results.view.branding;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.sofascore.local_persistance.Brand;
import com.sofascore.local_persistance.BrandColors;
import com.sofascore.model.branding.BrandLocation;
import com.sofascore.model.branding.BrandType;
import com.sofascore.results.R;
import defpackage.a70;
import defpackage.ao2;
import defpackage.fxd;
import defpackage.jxd;
import defpackage.nq8;
import defpackage.tz9;
import defpackage.ujf;
import defpackage.yhk;
import defpackage.yla;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/sofascore/results/view/branding/BrandingLayout;", "Landroid/widget/LinearLayout;", "Lyla;", "a", "Lyla;", "getBinding", "()Lyla;", "binding", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BrandingLayout extends LinearLayout {

    /* renamed from: a, reason: from kotlin metadata */
    public final yla binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrandingLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.layout_branding_frame, this);
        BrandingHeaderView brandingHeaderView = (BrandingHeaderView) nq8.B(R.id.brand_header, this);
        if (brandingHeaderView == null) {
            yhk.s("Missing required view with ID: ".concat(getResources().getResourceName(R.id.brand_header)));
            throw null;
        }
        this.binding = new yla(this, brandingHeaderView);
        brandingHeaderView.setBackgroundResource(R.drawable.rectangle_16dp_top_corners_no_color);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ujf.d, 0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setBackground(drawable);
        }
        obtainStyledAttributes.recycle();
        setClipToOutline(true);
        setOrientation(1);
    }

    public final void a(Brand brand, BrandLocation brandLocation, BrandType brandType, Integer num, boolean z) {
        String str;
        int parseColor;
        brandLocation.getClass();
        brandType.getClass();
        yla ylaVar = this.binding;
        ylaVar.b.setVisibility(brand != null ? 0 : 8);
        if (brand == null) {
            return;
        }
        if (getBackground() == null) {
            setBackgroundResource(R.drawable.rectangle_16dp_corners_no_color);
        }
        ylaVar.b.b(brand, brandLocation, brandType, num, z);
        if (getChildAt(1).getForeground() == null) {
            View childAt = getChildAt(1);
            jxd jxdVar = new jxd();
            Context context = getContext();
            context.getClass();
            float u = ao2.u(2, context);
            jxdVar.h.setStrokeWidth(u);
            jxdVar.a = u;
            Context context2 = getContext();
            context2.getClass();
            jxdVar.c(fxd.a, (jxdVar.a / 2.0f) + ao2.u(16, context2));
            jxdVar.d = true;
            BrandColors color = brand.getColor();
            if (color != null) {
                Context context3 = getContext();
                context3.getClass();
                str = tz9.E(color, context3);
            } else {
                str = null;
            }
            if (str != null) {
                try {
                    parseColor = Color.parseColor(str);
                } catch (Exception unused) {
                }
                jxdVar.b(0, Integer.valueOf(parseColor), null);
                childAt.setForeground(jxdVar);
            }
            parseColor = 0;
            jxdVar.b(0, Integer.valueOf(parseColor), null);
            childAt.setForeground(jxdVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() < 2) {
            super.addView(view, layoutParams);
        } else {
            a70.p("BrandingFrameLayout can only have one child view.");
        }
    }

    @NotNull
    public final yla getBinding() {
        return this.binding;
    }
}
