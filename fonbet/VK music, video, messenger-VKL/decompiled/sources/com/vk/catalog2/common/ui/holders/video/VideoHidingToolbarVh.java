package com.vk.catalog2.common.ui.holders.video;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.appbar.AppBarLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.ui.holders.HidingToolbarVh;
import com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder;
import com.vk.catalog2.common.ui.holders.container.WarmupContainerVh;
import com.vk.core.view.AppBarExpandableControllerBehaviour;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.b0u0;
import xsna.h4x;
import xsna.iut0;
import xsna.mbh0;
import xsna.q3a;
import xsna.q9s0;
import xsna.u080;

/* compiled from: VideoHidingToolbarVh.kt */
/* loaded from: classes16.dex */
public final class VideoHidingToolbarVh extends HidingToolbarVh {
    public final CatalogStatesViewHolder k;
    public final AppBarExpandableControllerBehaviour l;
    public final AppBarLayout.f m;

    public VideoHidingToolbarVh(q3a q3aVar, List list, CatalogStatesViewHolder catalogStatesViewHolder, AppBarExpandableControllerBehaviour appBarExpandableControllerBehaviour, q9s0 q9s0Var) {
        super(q3aVar, list, catalogStatesViewHolder, appBarExpandableControllerBehaviour);
        this.k = catalogStatesViewHolder;
        this.l = appBarExpandableControllerBehaviour;
        this.m = q9s0Var;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, xsna.h4x] */
    @Override // com.vk.catalog2.common.ui.holders.HidingToolbarVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AppBarLayout.f fVar;
        final WarmupContainerVh warmupContainerVh;
        final View view;
        View k5 = super.k5(layoutInflater, viewGroup, bundle);
        CatalogStatesViewHolder catalogStatesViewHolder = this.k;
        if ((catalogStatesViewHolder instanceof WarmupContainerVh) && (view = (warmupContainerVh = (WarmupContainerVh) catalogStatesViewHolder).c) != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new mbh0(this, view));
            AppBarLayout appBarLayout = this.f;
            if (appBarLayout != null) {
                appBarLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: xsna.gps0
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                        if (WarmupContainerVh.this.b.r instanceof alj) {
                            f4m.q(view2.getMeasuredHeight(), view);
                        }
                    }
                });
            }
        }
        final View view2 = new View(k5.getContext());
        AppBarLayout.d dVar = new AppBarLayout.d(-2);
        dVar.a = 16;
        view2.setLayoutParams(dVar);
        final AppBarLayout appBarLayout2 = this.f;
        if (appBarLayout2 != null) {
            appBarLayout2.addView(view2);
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.element = h4x.c(0, 0, 0, 0);
            u080 u080Var = new u080() { // from class: xsna.eps0
                /* JADX WARN: Type inference failed for: r2v2, types: [T, xsna.h4x] */
                @Override // xsna.u080
                public final bqx0 b(View view3, bqx0 bqx0Var) {
                    Ref$ObjectRef.this.element = bqx0Var.a.i(129);
                    return bqx0Var;
                }
            };
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            iut0.d.c(appBarLayout2, u080Var);
            appBarLayout2.a(new AppBarLayout.f() { // from class: xsna.fps0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.material.appbar.AppBarLayout.a
                public final void a(AppBarLayout appBarLayout3, int i) {
                    AppBarLayout appBarLayout4;
                    View view3;
                    if (appBarLayout3.getTotalScrollRange() == 0) {
                        return;
                    }
                    int i2 = 0;
                    while (true) {
                        appBarLayout4 = AppBarLayout.this;
                        if (i2 >= appBarLayout4.getChildCount()) {
                            view3 = null;
                            break;
                        }
                        int i3 = i2 + 1;
                        view3 = appBarLayout4.getChildAt(i2);
                        if (view3 == null) {
                            throw new IndexOutOfBoundsException();
                        }
                        if (view3 instanceof rou0) {
                            break;
                        } else {
                            i2 = i3;
                        }
                    }
                    View childAt = appBarLayout4.getChildAt(0);
                    if (view3 != null) {
                        View view4 = view3.getHeight() > 0 ? view3 : null;
                        if (view4 != null) {
                            childAt = view4;
                        }
                    }
                    if (childAt == null) {
                        return;
                    }
                    f4m.k((int) (Math.abs(swe0.f(f4m.c(childAt).top / childAt.getHeight(), -1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) * ((h4x) ref$ObjectRef.element).b), view2);
                }
            });
        }
        AppBarLayout appBarLayout3 = this.f;
        if (appBarLayout3 != null && (fVar = this.m) != null) {
            appBarLayout3.a(fVar);
        }
        return k5;
    }
}
