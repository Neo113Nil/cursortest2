package com.sofascore.results.featuredtournament.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.sofascore.model.mvvm.model.OffersBanner;
import com.sofascore.results.R;
import com.sofascore.results.view.CirclePageIndicator;
import defpackage.bef;
import defpackage.cef;
import defpackage.dmi;
import defpackage.ed;
import defpackage.fv;
import defpackage.jne;
import defpackage.k13;
import defpackage.ke0;
import defpackage.km5;
import defpackage.nq8;
import defpackage.o8;
import defpackage.uaa;
import defpackage.udf;
import defpackage.vxd;
import defpackage.yhk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u000b\fJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/sofascore/results/featuredtournament/view/PromotionalOffersBannerView;", "Lo8;", "", "getLayoutId", "()I", "Lkotlin/Function1;", "Lbef;", "", "listener", "setListener", "(Lkotlin/jvm/functions/Function1;)V", "jne", "cef", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PromotionalOffersBannerView extends o8 {
    public final ed d;
    public final jne e;
    public fv f;
    public udf g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PromotionalOffersBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        View root = getRoot();
        int i2 = R.id.page_indicator;
        CirclePageIndicator circlePageIndicator = (CirclePageIndicator) nq8.B(R.id.page_indicator, root);
        if (circlePageIndicator != null) {
            i2 = R.id.view_pager;
            ViewPager2 viewPager2 = (ViewPager2) nq8.B(R.id.view_pager, root);
            if (viewPager2 != null) {
                this.d = new ed((LinearLayout) root, circlePageIndicator, viewPager2, 27);
                jne jneVar = new jne(this, context);
                this.e = jneVar;
                this.f = fv.FEATURED_TOURNAMENT;
                viewPager2.setAdapter(jneVar);
                circlePageIndicator.setupWithViewPager(viewPager2);
                return;
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i2)));
        throw null;
    }

    public static void j(PromotionalOffersBannerView promotionalOffersBannerView, List list, udf udfVar, fv fvVar) {
        km5 km5Var = km5.a;
        list.getClass();
        km5Var.getClass();
        promotionalOffersBannerView.f = fvVar;
        promotionalOffersBannerView.g = udfVar;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (!ke0.m.contains(Integer.valueOf(((OffersBanner) obj).getId()))) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(k13.r(arrayList2, 10));
        for (Iterator it = arrayList2.iterator(); it.hasNext(); it = it) {
            OffersBanner offersBanner = (OffersBanner) it.next();
            arrayList3.add(new cef(Integer.valueOf(offersBanner.getId()), offersBanner.getLayout(), offersBanner.getTitle(), offersBanner.getDescription(), offersBanner.getCta(), offersBanner.getRegulative(), offersBanner.getUrl(), vxd.j(offersBanner.getId(), (Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("api/v1/"), "offers/banner/", "/logo"), offersBanner.getBackground()));
        }
        arrayList.addAll(arrayList3);
        promotionalOffersBannerView.setVisibility(!arrayList.isEmpty() ? 0 : 8);
        jne jneVar = promotionalOffersBannerView.e;
        jneVar.getClass();
        jneVar.d = arrayList;
        jneVar.notifyItemRangeChanged(0, arrayList.size());
        ((CirclePageIndicator) promotionalOffersBannerView.d.c).setVisibility(arrayList.size() > 1 ? 0 : 8);
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.view_featured_tournament_banner;
    }

    public final void setListener(@NotNull Function1<? super bef, Unit> listener) {
        listener.getClass();
        this.e.c = listener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PromotionalOffersBannerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }
}
