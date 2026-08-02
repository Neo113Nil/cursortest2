package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.equativ.displaysdk.adadapter.SASParallaxBannerAdapter;
import com.sofascore.local_persistance.Brand;
import com.sofascore.local_persistance.ImageDisplayType;
import com.sofascore.model.Country;
import com.sofascore.model.branding.BrandLocation;
import com.sofascore.model.branding.BrandType;
import com.sofascore.results.R;
import com.sofascore.results.view.branding.BrandingLayout;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class f32 extends FrameLayout {
    public final /* synthetic */ int a;
    public Object b;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f32(Context context, int i) {
        super(context, null, 0);
        this.a = i;
        switch (i) {
            case 1:
                context.getClass();
                super(context, null, 0);
                LayoutInflater from = LayoutInflater.from(context);
                from.getClass();
                from.inflate(R.layout.view_branding_takeover_image, this);
                ImageView imageView = (ImageView) nq8.B(R.id.image, this);
                if (imageView != null) {
                    this.c = new ed(this, 25, imageView);
                    return;
                } else {
                    yhk.s("Missing required view with ID: ".concat(getResources().getResourceName(R.id.image)));
                    throw null;
                }
            default:
                context.getClass();
                LayoutInflater.from(context).inflate(R.layout.view_branding_banner, this);
                int i2 = R.id.banner;
                ImageView imageView2 = (ImageView) nq8.B(R.id.banner, this);
                if (imageView2 != null) {
                    i2 = R.id.betting_age;
                    TextView textView = (TextView) nq8.B(R.id.betting_age, this);
                    if (textView != null) {
                        i2 = R.id.branding;
                        BrandingLayout brandingLayout = (BrandingLayout) nq8.B(R.id.branding, this);
                        if (brandingLayout != null) {
                            this.c = new rfe(this, imageView2, textView, brandingLayout, 11);
                            setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                            setPaddingRelative(ao2.s(8, context), ao2.s(4, context), ao2.s(8, context), getPaddingBottom());
                            return;
                        }
                    }
                }
                yhk.s("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
                throw null;
        }
    }

    public static void a(f32 f32Var, Brand brand, Integer num, Integer num2, Integer num3, BrandLocation brandLocation, int i) {
        Integer num4;
        String str;
        f32 f32Var2;
        Brand brand2;
        BrandLocation brandLocation2;
        nt9 a;
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        ed edVar = (ed) f32Var.c;
        brand.getClass();
        brandLocation.getClass();
        if (num != null) {
            str = (Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("api/v1/") + "branding/provider/" + brand.getId() + "/unique-tournament/" + num + "/takeover-image";
            num4 = num;
        } else {
            if (num2 == null) {
                return;
            }
            num4 = num2;
            str = (Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("api/v1/") + "branding/provider/" + brand.getId() + "/team/" + num2 + "/takeover-image";
        }
        ImageView imageView = (ImageView) edVar.c;
        apf a2 = ajh.a(imageView.getContext());
        ht9 ht9Var = new ht9(imageView.getContext());
        ht9Var.c = str;
        vt9.f(ht9Var, imageView);
        ht9Var.f = str;
        ht9Var.c(str);
        Context context = f32Var.getContext();
        context.getClass();
        wt9 I = rfo.I(imageView);
        z8e.R(ht9Var, context, null, (I == null || (a = I.a()) == null) ? null : a.e, null);
        a2.a(ht9Var.a());
        if (num3 != null) {
            int intValue = num3.intValue();
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams == null) {
                yhk.s("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                return;
            }
            Context context2 = f32Var.getContext();
            context2.getClass();
            layoutParams.height = ao2.s(intValue, context2);
            imageView.setLayoutParams(layoutParams);
        }
        String url = brand.getUrl();
        if (url != null) {
            f32Var2 = f32Var;
            brand2 = brand;
            brandLocation2 = brandLocation;
            z8e.a0(imageView, 1000L, new l31(f32Var2, num4, brandLocation2, brand2, url, 1));
        } else {
            f32Var2 = f32Var;
            brand2 = brand;
            brandLocation2 = brandLocation;
        }
        String slug = brand2.getSlug();
        if (((zsk) f32Var2.b) != null) {
            return;
        }
        if (!f32Var2.isAttachedToWindow()) {
            f32Var2.addOnAttachStateChangeListener(new d32(f32Var2, f32Var2, num4, brandLocation2, slug, 1));
            return;
        }
        g6b t = qea.t(f32Var2);
        if (t != null) {
            zsk zskVar = new zsk(t, 30);
            zskVar.b(f32Var2, new e32(f32Var2, num4, brandLocation2, slug, 1), null);
            f32Var2.b = zskVar;
        }
    }

    public void b(Brand brand, int i, ImageDisplayType imageDisplayType, Integer num, Integer num2, String str, BrandLocation brandLocation) {
        rfe rfeVar = (rfe) this.c;
        if (brand == null) {
            return;
        }
        Integer valueOf = Integer.valueOf(i);
        String slug = brand.getSlug();
        if (((zsk) this.b) == null) {
            if (isAttachedToWindow()) {
                g6b t = qea.t(this);
                if (t != null) {
                    zsk zskVar = new zsk(t, 30);
                    zskVar.b(this, new e32(this, valueOf, brandLocation, slug, 0), null);
                    this.b = zskVar;
                }
            } else {
                addOnAttachStateChangeListener(new d32(this, this, valueOf, brandLocation, slug, 0));
            }
        }
        if (Intrinsics.c(brand.getShowBettingAge(), Boolean.TRUE)) {
            Country e = dv3.e();
            ((TextView) rfeVar.e).setText(String.format("%s+", Arrays.copyOf(new Object[]{(Intrinsics.c(e, zu3.C) || Intrinsics.c(e, zu3.f) || Intrinsics.c(e, zu3.v0)) ? "21" : Intrinsics.c(e, zu3.k) ? "19" : "18"}, 1)));
            ((TextView) rfeVar.e).setVisibility(0);
        }
        ImageView imageView = (ImageView) rfeVar.c;
        int i2 = imageDisplayType == null ? -1 : c32.a[imageDisplayType.ordinal()];
        if (i2 == 1) {
            ((BrandingLayout) rfeVar.d).a(brand, brandLocation, BrandType.BANNER, Integer.valueOf(i), false);
            if (num != null) {
                int intValue = num.intValue();
                Context context = imageView.getContext();
                context.getClass();
                imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, ao2.s(intValue, context)));
            }
        } else if (i2 == 2) {
            imageView.setForeground(null);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            if (num2 != null) {
                int intValue2 = num2.intValue();
                Context context2 = imageView.getContext();
                context2.getClass();
                imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, ao2.s(intValue2, context2)));
            }
        }
        int i3 = c32.b[brandLocation.ordinal()];
        if (i3 == 1) {
            String u = pco.u(i, "team", Integer.valueOf(brand.getId()));
            apf a = ajh.a(imageView.getContext());
            ht9 ht9Var = new ht9(imageView.getContext());
            ht9Var.c = u;
            fc6.w(ht9Var, imageView, a);
        } else if (i3 != 2) {
            Unit unit = Unit.a;
        } else {
            String u2 = pco.u(i, "unique-tournament", Integer.valueOf(brand.getId()));
            apf a2 = ajh.a(imageView.getContext());
            ht9 ht9Var2 = new ht9(imageView.getContext());
            ht9Var2.c = u2;
            fc6.w(ht9Var2, imageView, a2);
        }
        imageView.setClipToOutline(true);
        z8e.a0(imageView, 1000L, new x22(imageView, i, brandLocation, brand, str));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c5  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        FrameLayout frameLayout;
        agg aggVar;
        agg aggVar2;
        FrameLayout frameLayout2;
        agg aggVar3;
        agg aggVar4;
        int i3;
        agg aggVar5;
        agg aggVar6;
        int size;
        float f;
        agg aggVar7;
        agg aggVar8;
        FrameLayout frameLayout3;
        agg aggVar9;
        agg aggVar10;
        switch (this.a) {
            case 2:
                Double d = (Double) this.c;
                SASParallaxBannerAdapter sASParallaxBannerAdapter = (SASParallaxBannerAdapter) this.b;
                frameLayout = sASParallaxBannerAdapter.g;
                if (frameLayout == null) {
                    Intrinsics.i("renderedViewParallaxContainer");
                    throw null;
                }
                int measuredWidth = frameLayout.getRootView().getMeasuredWidth();
                aggVar = sASParallaxBannerAdapter.m;
                int i4 = aggVar.a;
                aggVar2 = sASParallaxBannerAdapter.m;
                int i5 = measuredWidth - (i4 + aggVar2.c);
                frameLayout2 = sASParallaxBannerAdapter.g;
                if (frameLayout2 == null) {
                    Intrinsics.i("renderedViewParallaxContainer");
                    throw null;
                }
                int measuredHeight = frameLayout2.getRootView().getMeasuredHeight();
                aggVar3 = sASParallaxBannerAdapter.m;
                int i6 = aggVar3.b;
                aggVar4 = sASParallaxBannerAdapter.m;
                int i7 = measuredHeight - (i6 + aggVar4.d);
                if (d != null) {
                    double d2 = i5;
                    double d3 = i7;
                    if (d.doubleValue() <= d2 / d3) {
                        i3 = wzb.a(d.doubleValue() * d3);
                        aggVar5 = sASParallaxBannerAdapter.m;
                        int i8 = i5 + aggVar5.a;
                        aggVar6 = sASParallaxBannerAdapter.m;
                        size = (i8 + aggVar6.c) - View.MeasureSpec.getSize(i3);
                        if (size < 0) {
                            size = 0;
                        }
                        f = size / 2.0f;
                        aggVar7 = sASParallaxBannerAdapter.m;
                        if (f < aggVar7.c) {
                            aggVar10 = sASParallaxBannerAdapter.m;
                            f -= aggVar10.c - f;
                        }
                        aggVar8 = sASParallaxBannerAdapter.m;
                        if (f < aggVar8.a) {
                            aggVar9 = sASParallaxBannerAdapter.m;
                            f = aggVar9.a;
                        }
                        frameLayout3 = sASParallaxBannerAdapter.g;
                        if (frameLayout3 != null) {
                            Intrinsics.i("renderedViewParallaxContainer");
                            throw null;
                        }
                        frameLayout3.setX(f);
                        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i7, 1073741824));
                        return;
                    }
                    i7 = wzb.a(d2 / d.doubleValue());
                }
                i3 = i5;
                aggVar5 = sASParallaxBannerAdapter.m;
                int i82 = i5 + aggVar5.a;
                aggVar6 = sASParallaxBannerAdapter.m;
                size = (i82 + aggVar6.c) - View.MeasureSpec.getSize(i3);
                if (size < 0) {
                }
                f = size / 2.0f;
                aggVar7 = sASParallaxBannerAdapter.m;
                if (f < aggVar7.c) {
                }
                aggVar8 = sASParallaxBannerAdapter.m;
                if (f < aggVar8.a) {
                }
                frameLayout3 = sASParallaxBannerAdapter.g;
                if (frameLayout3 != null) {
                }
            default:
                super.onMeasure(i, i2);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f32(SASParallaxBannerAdapter sASParallaxBannerAdapter, Context context) {
        super(context);
        wfg wfgVar;
        wfg wfgVar2;
        this.a = 2;
        context.getClass();
        this.b = sASParallaxBannerAdapter;
        wfgVar = sASParallaxBannerAdapter.d;
        Double d = null;
        if (wfgVar != null) {
            double intValue = wfgVar.c != null ? r8.intValue() : 0.0d;
            wfgVar2 = sASParallaxBannerAdapter.d;
            if (wfgVar2 != null) {
                double intValue2 = wfgVar2.d != null ? r7.intValue() : 0.0d;
                if (intValue > 0.0d && intValue2 > 0.0d) {
                    d = Double.valueOf(intValue / intValue2);
                }
                this.c = d;
                return;
            }
            Intrinsics.i("parallaxAd");
            throw null;
        }
        Intrinsics.i("parallaxAd");
        throw null;
    }
}
