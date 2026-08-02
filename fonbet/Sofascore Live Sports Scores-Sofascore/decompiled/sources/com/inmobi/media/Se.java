package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.inmobi.media.Se;
import com.inmobi.media.ads.nativeAd.MediaView;
import defpackage.hs4;
import defpackage.k53;
import defpackage.ku3;
import defpackage.rob;
import defpackage.th2;
import defpackage.un0;
import defpackage.weh;
import defpackage.xw3;
import defpackage.yda;
import defpackage.yso;
import defpackage.z45;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Se {
    public final ku3 a;
    public final Tn b;
    public final Pe c;
    public final AtomicBoolean d;
    public final ArrayList e;

    public Se(ku3 ku3Var, Tn tn) {
        ku3Var.getClass();
        tn.getClass();
        this.a = ku3Var;
        this.b = tn;
        this.d = new AtomicBoolean(false);
        this.e = new ArrayList();
        Te te = new Te(new Vn(tn.a, tn.c), new Vn(tn.b, tn.d));
        ViewGroup parentView = tn.e.a.getParentView();
        ImageView iconView = tn.e.a.getIconView();
        C3525jh c3525jh = tn.e;
        MediaView mediaView = c3525jh.b;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        MediaView mediaView2 = c3525jh.b;
        if (mediaView2 != null) {
            linkedHashSet.add(mediaView2);
        }
        View view = c3525jh.c;
        if (view != null) {
            linkedHashSet.add(view);
        }
        View ctaView = c3525jh.a.getCtaView();
        if (ctaView != null) {
            linkedHashSet.add(ctaView);
        }
        ImageView iconView2 = c3525jh.a.getIconView();
        if (iconView2 != null) {
            linkedHashSet.add(iconView2);
        }
        View titleView = c3525jh.a.getTitleView();
        if (titleView != null) {
            linkedHashSet.add(titleView);
        }
        View descriptionView = c3525jh.a.getDescriptionView();
        if (descriptionView != null) {
            linkedHashSet.add(descriptionView);
        }
        View ratingView = c3525jh.a.getRatingView();
        if (ratingView != null) {
            linkedHashSet.add(ratingView);
        }
        View advertiserView = c3525jh.a.getAdvertiserView();
        if (advertiserView != null) {
            linkedHashSet.add(advertiserView);
        }
        linkedHashSet.addAll(c3525jh.a.getExtraViews$media_release());
        this.c = new Pe(parentView, iconView, mediaView, CollectionsKt.S0(linkedHashSet), te);
    }

    public final void a(View view, ViewGroup viewGroup, boolean z, Function1 function1) {
        if (view == null || !z) {
            return;
        }
        ku3 ku3Var = this.a;
        viewGroup.getClass();
        ku3Var.getClass();
        th2 q = yso.q(new Sn(view, viewGroup, null));
        hs4 hs4Var = z45.a;
        this.e.add(xw3.L(this.a, null, null, new Re(un0.K(k53.g0(q, rob.a), ku3Var, weh.b, Boolean.valueOf(Un.b(view, viewGroup))), null, function1), 3));
    }

    public final void b() {
        if (this.d.getAndSet(false)) {
            ArrayList arrayList = this.e;
            arrayList.getClass();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                P6.a((yda) it.next());
            }
            arrayList.clear();
            this.e.clear();
        }
    }

    public static final Unit b(Se se, boolean z) {
        se.c.e.b.b = z;
        return Unit.a;
    }

    public static final Unit a(Se se, boolean z) {
        se.c.e.a.b = z;
        return Unit.a;
    }

    public final void a() {
        final int i = 1;
        if (this.d.getAndSet(true)) {
            return;
        }
        ViewGroup parentView = this.b.e.a.getParentView();
        final int i2 = 0;
        a(this.b.e.a.getIconView(), parentView, this.b.a, new Function1(this) { // from class: xvg
            public final /* synthetic */ Se b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i3 = i2;
                Se se = this.b;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                switch (i3) {
                    case 0:
                        return Se.a(se, booleanValue);
                    default:
                        return Se.b(se, booleanValue);
                }
            }
        });
        Tn tn = this.b;
        a(tn.e.b, parentView, tn.b, new Function1(this) { // from class: xvg
            public final /* synthetic */ Se b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i3 = i;
                Se se = this.b;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                switch (i3) {
                    case 0:
                        return Se.a(se, booleanValue);
                    default:
                        return Se.b(se, booleanValue);
                }
            }
        });
    }
}
