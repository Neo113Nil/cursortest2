package com.sofascore.results.view.branding;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.sofascore.local_persistance.Brand;
import com.sofascore.local_persistance.BrandColors;
import com.sofascore.model.branding.BrandLocation;
import com.sofascore.model.branding.BrandType;
import com.sofascore.results.R;
import defpackage.ajh;
import defpackage.ao2;
import defpackage.apf;
import defpackage.b32;
import defpackage.dmi;
import defpackage.g6b;
import defpackage.ht9;
import defpackage.j32;
import defpackage.k32;
import defpackage.nt9;
import defpackage.qea;
import defpackage.rfo;
import defpackage.tz9;
import defpackage.uaa;
import defpackage.vt9;
import defpackage.vxd;
import defpackage.wt9;
import defpackage.z8e;
import defpackage.zsk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sofascore/results/view/branding/BrandingHeaderView;", "Landroidx/appcompat/widget/AppCompatImageView;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BrandingHeaderView extends AppCompatImageView {
    public static final /* synthetic */ int b = 0;
    public zsk a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BrandingHeaderView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, 0);
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setBackgroundResource(R.drawable.rectangle);
    }

    public static /* synthetic */ void d(BrandingHeaderView brandingHeaderView, Brand brand, BrandLocation brandLocation, Integer num, int i) {
        if ((i & 4) != 0) {
            num = null;
        }
        brandingHeaderView.b(brand, brandLocation, BrandType.STRIPE, num, true);
    }

    public final void b(Brand brand, BrandLocation brandLocation, BrandType brandType, Integer num, boolean z) {
        String str;
        nt9 a;
        brand.getClass();
        brandLocation.getClass();
        brandType.getClass();
        BrandColors color = brand.getColor();
        if (color != null) {
            Context context = getContext();
            context.getClass();
            str = tz9.E(color, context);
        } else {
            str = null;
        }
        int i = 0;
        if (str != null) {
            try {
                i = Color.parseColor(str);
            } catch (Exception unused) {
            }
        }
        z8e.V(i, this);
        String j = vxd.j(brand.getId(), (Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("api/v1/"), "branding/provider/", "/powered-by-image");
        apf a2 = ajh.a(getContext());
        ht9 ht9Var = new ht9(getContext());
        ht9Var.c = j;
        vt9.f(ht9Var, this);
        Context context2 = getContext();
        context2.getClass();
        wt9 I = rfo.I(this);
        z8e.R(ht9Var, context2, null, (I == null || (a = I.a()) == null) ? null : a.e, null);
        a2.a(ht9Var.a());
        String url = brand.getUrl();
        if (url != null) {
            setOnClickListener(new j32(this, num, brandLocation, brand, brandType, url, 0));
        }
        if (z) {
            String slug = brand.getSlug();
            if (this.a != null) {
                return;
            }
            if (!isAttachedToWindow()) {
                addOnAttachStateChangeListener(new k32(this, this, num, brandLocation, slug, brandType));
                return;
            }
            g6b t = qea.t(this);
            if (t != null) {
                zsk zskVar = new zsk(t, 30);
                zskVar.b(this, new b32(this, num, brandLocation, slug, brandType, 2), null);
                this.a = zskVar;
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        Context context = getContext();
        context.getClass();
        setMeasuredDimension(measuredWidth, ao2.s(24, context));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BrandingHeaderView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }
}
