package com.sofascore.results.event.details.view.promotion;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.imageview.ShapeableImageView;
import com.sofascore.model.mvvm.model.OffersBannerBackground;
import com.sofascore.model.mvvm.model.OffersBannerLayout;
import com.sofascore.results.R;
import defpackage.aba;
import defpackage.ajh;
import defpackage.apf;
import defpackage.bef;
import defpackage.dmi;
import defpackage.eq3;
import defpackage.eyd;
import defpackage.fc6;
import defpackage.fv;
import defpackage.g6b;
import defpackage.h6b;
import defpackage.haa;
import defpackage.hkj;
import defpackage.ht9;
import defpackage.l97;
import defpackage.nq8;
import defpackage.ph0;
import defpackage.qea;
import defpackage.qy0;
import defpackage.r2;
import defpackage.rdf;
import defpackage.sdf;
import defpackage.tdf;
import defpackage.u6b;
import defpackage.uaa;
import defpackage.udf;
import defpackage.vdf;
import defpackage.vt9;
import defpackage.vxd;
import defpackage.vy0;
import defpackage.wdf;
import defpackage.xy0;
import defpackage.yhk;
import defpackage.z8e;
import defpackage.zl;
import defpackage.zsk;
import defpackage.zzl;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0018\u0018J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u0019\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/sofascore/results/event/details/view/promotion/PromotionBannerView;", "Lh6b;", "", "getLayoutId", "()I", "Landroid/view/ViewGroup$LayoutParams;", "params", "", "setNewLayoutParams", "(Landroid/view/ViewGroup$LayoutParams;)V", "", "bannerLogo", "setupLogoLayout", "(Ljava/lang/Object;)V", "image", "setupCleanLayout", "Ludf;", "entity", "setBackground", "(Ludf;)V", "Lg6b;", "lifecycle", "setImpressionHelper", "(Lg6b;)V", "vdf", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PromotionBannerView extends h6b {
    public static final /* synthetic */ int t = 0;
    public final zl d;
    public zsk e;
    public String f;
    public String g;
    public String h;
    public bef i;
    public fv j;
    public String k;
    public OffersBannerBackground l;
    public udf m;
    public String n;
    public Integer o;
    public OffersBannerLayout p;
    public Object q;
    public Function0 r;
    public Function0 s;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PromotionBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, r1, 0);
        AttributeSet attributeSet2 = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        View root = getRoot();
        CardView cardView = (CardView) root;
        int i2 = R.id.close;
        ImageView imageView = (ImageView) nq8.B(R.id.close, root);
        if (imageView != null) {
            i2 = R.id.container;
            ConstraintLayout constraintLayout = (ConstraintLayout) nq8.B(R.id.container, root);
            if (constraintLayout != null) {
                i2 = R.id.description;
                TextView textView = (TextView) nq8.B(R.id.description, root);
                if (textView != null) {
                    i2 = R.id.info_button;
                    ImageView imageView2 = (ImageView) nq8.B(R.id.info_button, root);
                    if (imageView2 != null) {
                        i2 = R.id.learn_more;
                        TextView textView2 = (TextView) nq8.B(R.id.learn_more, root);
                        if (textView2 != null) {
                            i2 = R.id.promotion_banner_image;
                            ImageView imageView3 = (ImageView) nq8.B(R.id.promotion_banner_image, root);
                            if (imageView3 != null) {
                                i2 = R.id.promotion_banner_image_logo;
                                ImageView imageView4 = (ImageView) nq8.B(R.id.promotion_banner_image_logo, root);
                                if (imageView4 != null) {
                                    i2 = R.id.promotion_banner_logo;
                                    ImageView imageView5 = (ImageView) nq8.B(R.id.promotion_banner_logo, root);
                                    if (imageView5 != null) {
                                        i2 = R.id.start_image;
                                        ShapeableImageView shapeableImageView = (ShapeableImageView) nq8.B(R.id.start_image, root);
                                        if (shapeableImageView != null) {
                                            i2 = R.id.text_barrier;
                                            Barrier barrier = (Barrier) nq8.B(R.id.text_barrier, root);
                                            if (barrier != null) {
                                                i2 = R.id.text_guideline;
                                                Guideline guideline = (Guideline) nq8.B(R.id.text_guideline, root);
                                                if (guideline != null) {
                                                    i2 = R.id.title;
                                                    TextView textView3 = (TextView) nq8.B(R.id.title, root);
                                                    if (textView3 != null) {
                                                        this.d = new zl(cardView, imageView, constraintLayout, textView, imageView2, textView2, imageView3, imageView4, imageView5, shapeableImageView, barrier, guideline, textView3);
                                                        cardView.getClass();
                                                        cardView.setVisibility(8);
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i2)));
        throw null;
    }

    private final void setBackground(udf entity) {
        OffersBannerBackground offersBannerBackground = this.l;
        int i = offersBannerBackground == null ? -1 : wdf.b[offersBannerBackground.ordinal()];
        zl zlVar = this.d;
        if (i == 1) {
            ConstraintLayout constraintLayout = (ConstraintLayout) zlVar.b;
            Context context = getContext();
            context.getClass();
            hkj hkjVar = new hkj(context);
            hkjVar.k = true;
            Integer num = this.o;
            hkjVar.c(new xy0(vxd.j(num != null ? num.intValue() : -1, (Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("api/v1/"), "offers/banner/", "/background")), null);
            constraintLayout.setBackground(hkjVar);
            l();
            return;
        }
        if (i != 2) {
            ConstraintLayout constraintLayout2 = (ConstraintLayout) zlVar.b;
            CardView cardView = (CardView) zlVar.f;
            TextView textView = (TextView) zlVar.j;
            constraintLayout2.setBackground(null);
            haa.C((TextView) zlVar.k);
            haa.D(zlVar.g);
            haa.G(textView);
            textView.setCompoundDrawableTintList(eq3.q(R.color.primary_default, getContext()));
            ImageView imageView = (ImageView) zlVar.c;
            Context context2 = getContext();
            context2.getClass();
            z8e.Y(imageView, context2, R.color.n_lv_1);
            cardView.setCardBackgroundColor(getContext().getColor(R.color.surface_1));
            cardView.getClass();
            aba.u(cardView);
            return;
        }
        Context context3 = getContext();
        context3.getClass();
        hkj hkjVar2 = new hkj(context3);
        hkjVar2.k = true;
        if (entity instanceof rdf) {
            g6b t2 = qea.t(this);
            if (t2 != null) {
                hkjVar2.a(t2, ((rdf) entity).a);
            }
        } else if (entity instanceof sdf) {
            hkjVar2.c(new vy0(((sdf) entity).a), null);
        } else if (entity instanceof tdf) {
            tdf tdfVar = (tdf) entity;
            Integer num2 = tdfVar.a;
            hkjVar2.c(new qy0(num2 != null ? num2.intValue() : -1, tdfVar.b), null);
        } else {
            Unit unit = Unit.a;
        }
        ((ConstraintLayout) zlVar.b).setBackground(hkjVar2);
        l();
    }

    private final void setImpressionHelper(g6b lifecycle) {
        bef befVar;
        fv fvVar = this.j;
        if (fvVar == null || (befVar = this.i) == null) {
            return;
        }
        String str = befVar.b;
        zsk zskVar = this.e;
        if (zskVar == null && lifecycle != null) {
            zskVar = new zsk(lifecycle, 45);
            this.e = zskVar;
        }
        if (zskVar != null) {
            zskVar.b(this, new l97(23, this, fvVar, str), null);
        }
    }

    private final void setupCleanLayout(Object image) {
        zl zlVar = this.d;
        ((ImageView) zlVar.h).setVisibility(8);
        ((ImageView) zlVar.e).setVisibility(8);
        ((ImageView) zlVar.m).setVisibility(8);
        ShapeableImageView shapeableImageView = (ShapeableImageView) zlVar.i;
        shapeableImageView.setVisibility(0);
        apf a = ajh.a(shapeableImageView.getContext());
        ht9 ht9Var = new ht9(shapeableImageView.getContext());
        ht9Var.c = image;
        vt9.f(ht9Var, shapeableImageView);
        a.a(ht9Var.a());
    }

    private final void setupLogoLayout(Object bannerLogo) {
        zl zlVar = this.d;
        ((ImageView) zlVar.e).setVisibility(8);
        ((ImageView) zlVar.h).setVisibility(8);
        ImageView imageView = (ImageView) zlVar.m;
        imageView.setVisibility(0);
        apf a = ajh.a(imageView.getContext());
        ht9 ht9Var = new ht9(imageView.getContext());
        ht9Var.c = bannerLogo;
        fc6.w(ht9Var, imageView, a);
    }

    @Override // defpackage.rq4
    public final void e(u6b u6bVar) {
        u6bVar.getClass();
        zl zlVar = this.d;
        CardView cardView = (CardView) zlVar.f;
        cardView.getClass();
        if (cardView.getVisibility() == 0) {
            CardView cardView2 = (CardView) zlVar.f;
            cardView2.getClass();
            cardView2.setVisibility(0);
        }
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.promotion_banner;
    }

    @Override // defpackage.h6b
    public final void j(g6b g6bVar) {
        setImpressionHelper(g6bVar);
    }

    public final void l() {
        zl zlVar = this.d;
        haa.E((TextView) zlVar.k);
        haa.F(zlVar.g);
        TextView textView = (TextView) zlVar.j;
        haa.E(textView);
        textView.setCompoundDrawableTintList(eq3.q(R.color.on_color_primary, getContext()));
        ImageView imageView = (ImageView) zlVar.c;
        Context context = getContext();
        context.getClass();
        z8e.Y(imageView, context, R.color.on_color_primary);
        CardView cardView = (CardView) zlVar.f;
        cardView.setCardBackgroundColor(getContext().getColor(R.color.surface_1));
        cardView.setForeground(getContext().getDrawable(R.drawable.ripple_surface_2));
    }

    public final vdf n(bef befVar, fv fvVar, OffersBannerLayout offersBannerLayout) {
        befVar.getClass();
        fvVar.getClass();
        offersBannerLayout.getClass();
        return new vdf(this, befVar, fvVar, offersBannerLayout);
    }

    public final void o() {
        fv fvVar;
        OffersBannerLayout offersBannerLayout;
        bef befVar = this.i;
        if (befVar == null || (fvVar = this.j) == null || (offersBannerLayout = this.p) == null) {
            return;
        }
        setImpressionHelper(qea.t(this));
        zl zlVar = this.d;
        TextView textView = (TextView) zlVar.k;
        TextView textView2 = (TextView) zlVar.j;
        ImageView imageView = (ImageView) zlVar.d;
        textView.setText(this.f);
        zlVar.g.setText(this.g);
        ((ImageView) zlVar.c).setOnClickListener(new eyd(13, this, befVar));
        CardView cardView = (CardView) zlVar.f;
        cardView.getClass();
        z8e.a0(cardView, 1000L, new l97(24, this, fvVar, befVar));
        String str = this.n;
        imageView.setVisibility((str == null || str.length() == 0) ? 8 : 0);
        String str2 = this.f;
        String str3 = this.n;
        if (str2 != null && str3 != null) {
            imageView.setOnClickListener(new r2(this, str2, str3, befVar));
        }
        textView2.setVisibility(this.h != null ? 0 : 8);
        textView2.setText(this.h);
        int i = wdf.a[offersBannerLayout.ordinal()];
        if (i == 1) {
            setupCleanLayout(this.q);
        } else if (i == 2) {
            setupLogoLayout(this.q);
        } else if (i == 3) {
            p(this.q, 0.5f);
        } else {
            if (i != 4) {
                zzl.b();
                return;
            }
            p(this.q, 0.66f);
        }
        setBackground(this.m);
    }

    @Override // defpackage.rq4
    public final void onStop(u6b u6bVar) {
        zsk zskVar = this.e;
        if (zskVar != null) {
            zskVar.a();
        }
    }

    public final void p(Object obj, float f) {
        zl zlVar = this.d;
        Barrier barrier = (Barrier) zlVar.l;
        ImageView imageView = (ImageView) zlVar.h;
        int[] referencedIds = barrier.getReferencedIds();
        referencedIds.getClass();
        if (!ph0.s(R.id.text_guideline, referencedIds)) {
            int length = referencedIds.length;
            int[] copyOf = Arrays.copyOf(referencedIds, length + 1);
            copyOf[length] = R.id.text_guideline;
            ((Barrier) zlVar.l).setReferencedIds(copyOf);
        }
        ((Guideline) zlVar.n).setGuidelinePercent(f);
        ((ImageView) zlVar.m).setVisibility(8);
        imageView.setVisibility(0);
        apf a = ajh.a(imageView.getContext());
        ht9 ht9Var = new ht9(imageView.getContext());
        ht9Var.c = obj;
        fc6.w(ht9Var, imageView, a);
    }

    @Override // defpackage.o8
    public void setNewLayoutParams(@NotNull ViewGroup.LayoutParams params) {
        params.getClass();
        getRoot().setLayoutParams(params);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PromotionBannerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }
}
