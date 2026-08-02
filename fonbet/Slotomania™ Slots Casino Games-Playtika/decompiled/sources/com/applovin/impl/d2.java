package com.applovin.impl;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.sdk.ad.b;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes4.dex */
public class d2 extends x1 {
    public d2(com.applovin.impl.sdk.ad.b bVar, Activity activity, com.applovin.impl.sdk.l lVar) {
        super(bVar, activity, lVar);
    }

    @Override // com.applovin.impl.x1
    public /* bridge */ /* synthetic */ void a(com.applovin.impl.adview.g gVar) {
        super.a(gVar);
    }

    @Override // com.applovin.impl.x1
    public /* bridge */ /* synthetic */ void a(View view) {
        super.a(view);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(ImageView imageView, com.applovin.impl.adview.g gVar, a aVar, ProgressBar progressBar, k0 k0Var, View view, View view2, AppLovinAdView appLovinAdView, com.applovin.impl.adview.k kVar, ImageView imageView2, ViewGroup viewGroup) {
        int i;
        FrameLayout.LayoutParams layoutParams;
        if (this.c.k0() == b.e.TOP) {
            layoutParams = new FrameLayout.LayoutParams(-1, -2, 48);
        } else if (this.c.k0() == b.e.BOTTOM) {
            layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
        } else if (this.c.k0() == b.e.LEFT) {
            layoutParams = new FrameLayout.LayoutParams(-2, -1, 3);
        } else {
            if (this.c.k0() == b.e.RIGHT) {
                i = 5;
                layoutParams = new FrameLayout.LayoutParams(-2, -1, 5);
            } else {
                i = 5;
                layoutParams = this.e;
            }
            appLovinAdView.setLayoutParams(this.e);
            this.d.addView(appLovinAdView);
            view2.setLayoutParams(this.e);
            this.d.addView(view2);
            view.setLayoutParams(layoutParams);
            this.d.addView(view);
            if (gVar != null) {
                if (this.c.B0()) {
                    i = 3;
                }
                a(this.c.o(), i | 48, gVar);
            }
            if (imageView != null) {
                int dpToPx = AppLovinSdkUtils.dpToPx(this.b, ((Integer) this.a.a(z4.i2)).intValue());
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(dpToPx, dpToPx, ((Integer) this.a.a(z4.k2)).intValue());
                int dpToPx2 = AppLovinSdkUtils.dpToPx(this.b, ((Integer) this.a.a(z4.j2)).intValue());
                layoutParams2.setMargins(dpToPx2, dpToPx2, dpToPx2, dpToPx2);
                this.d.addView(imageView, layoutParams2);
            }
            if (aVar != null) {
                this.d.addView(aVar, this.e);
            }
            if (k0Var != null) {
                int dpToPx3 = AppLovinSdkUtils.dpToPx(this.b, ((Integer) this.a.a(z4.V1)).intValue());
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(dpToPx3, dpToPx3, ((Integer) this.a.a(z4.U1)).intValue());
                int dpToPx4 = AppLovinSdkUtils.dpToPx(this.b, ((Integer) this.a.a(z4.T1)).intValue());
                layoutParams3.setMargins(dpToPx4, dpToPx4, dpToPx4, dpToPx4);
                this.d.addView(k0Var, layoutParams3);
            }
            if (progressBar != null) {
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, 20, 80);
                layoutParams4.setMargins(0, 0, 0, ((Integer) this.a.a(z4.n2)).intValue());
                this.d.addView(progressBar, layoutParams4);
            }
            if (imageView2 != null) {
                r7 r7Var = (r7) this.c;
                if (r7Var.r1()) {
                    int dpToPx5 = AppLovinSdkUtils.dpToPx(this.b, r7Var.l1().g());
                    int dpToPx6 = AppLovinSdkUtils.dpToPx(this.b, r7Var.l1().d());
                    int dpToPx7 = AppLovinSdkUtils.dpToPx(this.b, ((Integer) this.a.a(z4.c5)).intValue());
                    FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(dpToPx5, dpToPx6, 83);
                    layoutParams5.setMargins(dpToPx7, dpToPx7, dpToPx7, dpToPx7);
                    this.d.addView(imageView2, layoutParams5);
                }
            }
            if (kVar != null) {
                this.d.addView(kVar, this.e);
            }
            if (viewGroup == null) {
                viewGroup.addView(this.d);
                return;
            } else {
                this.b.setContentView(this.d);
                return;
            }
        }
        i = 5;
        appLovinAdView.setLayoutParams(this.e);
        this.d.addView(appLovinAdView);
        view2.setLayoutParams(this.e);
        this.d.addView(view2);
        view.setLayoutParams(layoutParams);
        this.d.addView(view);
        if (gVar != null) {
        }
        if (imageView != null) {
        }
        if (aVar != null) {
        }
        if (k0Var != null) {
        }
        if (progressBar != null) {
        }
        if (imageView2 != null) {
        }
        if (kVar != null) {
        }
        if (viewGroup == null) {
        }
    }

    public void a(com.applovin.impl.adview.g gVar, com.applovin.impl.adview.k kVar, View view, ProgressBar progressBar) {
        if (view != null) {
            view.setVisibility(0);
        }
        if (((Boolean) this.a.a(z4.Z6)).booleanValue()) {
            s.b(this.d, view);
        } else {
            s.a(this.d, view);
        }
        if (gVar != null) {
            a(this.c.o(), (this.c.v0() ? 3 : 5) | 48, gVar);
        }
        if (progressBar != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, 20, ((Boolean) this.a.a(z4.u2)).booleanValue() ? 80 : 48);
            layoutParams.setMargins(0, 0, 0, ((Integer) this.a.a(z4.v2)).intValue());
            this.d.addView(progressBar, layoutParams);
        }
        if (kVar != null) {
            this.d.addView(kVar, this.e);
        }
    }
}
