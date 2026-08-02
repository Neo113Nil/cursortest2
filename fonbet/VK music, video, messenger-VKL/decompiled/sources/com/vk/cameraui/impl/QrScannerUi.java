package com.vk.cameraui.impl;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.vk.clips.design.view.QRSharingView;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.core.ui.tracking.views.UiTracking$TrackableView;
import com.vk.core.view.components.segmented.control.VkSegmentedControl;
import com.vk.core.view.components.text.VkText;
import com.vk.storycamera.builder.StoryCameraParams;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.aoe0;
import xsna.b290;
import xsna.bm9;
import xsna.bwt0;
import xsna.cme0;
import xsna.cxu0;
import xsna.dm9;
import xsna.e3m;
import xsna.ene0;
import xsna.fm9;
import xsna.fy2;
import xsna.g0m0;
import xsna.g8p0;
import xsna.hne0;
import xsna.i750;
import xsna.iz8;
import xsna.k170;
import xsna.kz8;
import xsna.l7s;
import xsna.qq2;
import xsna.s1q0;
import xsna.usn0;
import xsna.xc50;
import xsna.zd9;

/* compiled from: QrScannerUi.kt */
/* loaded from: classes16.dex */
public final class QrScannerUi {
    public final CameraUIView a;
    public final bm9 b;
    public final g0m0 c;
    public final fy2 d;
    public final dm9 e;
    public cme0 f;
    public boolean g = true;
    public ene0 h;
    public FrameLayout i;
    public View j;
    public VkSegmentedControl k;
    public ViewStub l;
    public View m;
    public g8p0 n;
    public VkText o;
    public a p;
    public boolean q;
    public final StoryCameraParams r;

    /* compiled from: QrScannerUi.kt */
    public static final class QrFakeScannerView extends View implements UiTracking$TrackableView {
    }

    /* compiled from: QrScannerUi.kt */
    public static final class a extends s1q0 {
        public final QRSharingView f;

        public a(QRSharingView qRSharingView) {
            this.f = qRSharingView;
        }

        @Override // xsna.s1q0, androidx.viewpager.widget.PagerAdapter
        public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            ((ViewPager) viewGroup).removeView((View) obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getCount() {
            return 2;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final Object instantiateItem(ViewGroup viewGroup, int i) {
            return this.f;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }
    }

    public QrScannerUi(CameraUIView cameraUIView, bm9 bm9Var, g0m0 g0m0Var, fy2 fy2Var, dm9 dm9Var) {
        this.a = cameraUIView;
        this.b = bm9Var;
        this.c = g0m0Var;
        this.d = fy2Var;
        this.e = dm9Var;
        this.r = bm9Var.A0();
    }

    public final int a() {
        VkSegmentedControl vkSegmentedControl = this.k;
        if (vkSegmentedControl != null) {
            return vkSegmentedControl.getSelectedTabPosition();
        }
        return 0;
    }

    public final void b(zd9 zd9Var) {
        this.f = new cme0(this.a.getContext(), new b290(this, 12), new k170(this, 16), new aoe0(0, this, zd9Var));
        zd9Var.addView(this.n);
    }

    public final void c(boolean z) {
        cme0 cme0Var = this.f;
        if (cme0Var != null) {
            cme0Var.e = z;
        }
        this.g = z;
    }

    public final void d(boolean z) {
        FrameLayout frameLayout = this.i;
        if (frameLayout != null) {
            bwt0.a(frameLayout, z, false, 0L, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
        }
    }

    public final VkSegmentedControl e(boolean z, Integer num) {
        VkSegmentedControl vkSegmentedControl;
        TabLayout.g b;
        g8p0 g8p0Var;
        TabLayout.g b2;
        CameraUIView cameraUIView = this.a;
        this.i = (FrameLayout) cameraUIView.findViewById(R.id.qr_dynamic_corners_container);
        this.h = new ene0();
        this.q = z;
        this.j = cameraUIView.findViewById(R.id.tv_qr_scanner_prompt);
        this.l = (ViewStub) cameraUIView.findViewById(R.id.qr_my_info_stub);
        VkSegmentedControl vkSegmentedControl2 = (VkSegmentedControl) cameraUIView.findViewById(R.id.qr_scanner_tabs);
        vkSegmentedControl2.setCustomTabView(new xc50(vkSegmentedControl2, 13));
        TabLayout.g p = vkSegmentedControl2.p();
        p.p(R.string.camera_ui_qr_scanner);
        vkSegmentedControl2.h(p);
        dm9 dm9Var = this.e;
        hne0 d = dm9Var.d().d();
        vkSegmentedControl2.getContext();
        d.getClass();
        String string = vkSegmentedControl2.getContext().getString(R.string.camera_ui_qr_my);
        TabLayout.g p2 = vkSegmentedControl2.p();
        p2.q(string);
        vkSegmentedControl2.h(p2);
        vkSegmentedControl2.setOnSelectTabPosition(new i750(this, 20));
        usn0.a(vkSegmentedControl2);
        this.k = vkSegmentedControl2;
        this.m = cameraUIView.findViewById(R.id.qr_my_info);
        if (num != null) {
            int intValue = num.intValue();
            VkSegmentedControl vkSegmentedControl3 = this.k;
            if (vkSegmentedControl3 != null && (b2 = vkSegmentedControl3.b(intValue)) != null) {
                b2.j();
            }
        } else if (this.q && (vkSegmentedControl = this.k) != null && (b = vkSegmentedControl.b(1)) != null) {
            b.j();
        }
        cameraUIView.setImportantForAccessibility(2);
        g8p0 g8p0Var2 = new g8p0(cameraUIView.getContext(), null, 0);
        g8p0Var2.c = -1.0f;
        g8p0Var2.setVisibility(8);
        g8p0Var2.setLayoutParams(new ViewGroup.LayoutParams(-1, e3m.a(R.dimen.camera_qr_gradient_height, g8p0Var2.getContext())));
        cxu0 cxu0Var = cxu0.a;
        l7s v = bwt0.v(g8p0Var2.getContext());
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.BOTTOM_TOP;
        cxu0Var.getClass();
        GradientDrawable b3 = cxu0.b(orientation, v);
        b3.setAlpha(76);
        g8p0Var2.setBackground(b3);
        iz8 b4 = kz8.b(dm9Var.c(), cameraUIView.getRootView(), false, null, 14);
        g8p0Var2.setTopMargin(b4.c);
        if (this.b.A0().e.size() > 1) {
            g8p0Var2.setBottomMargin(b4.d);
        }
        this.n = g8p0Var2;
        this.o = (VkText) cameraUIView.findViewById(R.id.tv_qr_scanner_prompt);
        cme0 cme0Var = this.f;
        if (cme0Var != null) {
            cme0Var.m.clear();
        }
        if (qq2.d(cameraUIView.getContext()) && (g8p0Var = this.n) != null) {
            g8p0Var.setVisibility(8);
        }
        if (this.r.z) {
            VkSegmentedControl vkSegmentedControl4 = this.k;
            if (vkSegmentedControl4 != null) {
                vkSegmentedControl4.setVisibility(4);
            }
            VkText vkText = this.o;
            if (vkText != null) {
                vkText.setText(R.string.camera_ui_qr_scanner_info_code_mode);
            }
        }
        return this.k;
    }

    public final void f(fm9 fm9Var) {
        boolean z = this.r.z;
        fm9Var.j(this.j);
        if (!z) {
            fm9Var.g(this.k);
        }
        fm9Var.k(this.n);
    }
}
