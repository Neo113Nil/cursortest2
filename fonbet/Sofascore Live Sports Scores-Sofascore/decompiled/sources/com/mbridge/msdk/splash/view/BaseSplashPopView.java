package com.mbridge.msdk.splash.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.click.j;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.a0;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.MBridgeIds;
import defpackage.a70;
import defpackage.w1l;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class BaseSplashPopView extends RelativeLayout {
    public static final int TYPE_POP_DEFAULT = 1;
    public static final int TYPE_POP_LARGE = 4;
    public static final int TYPE_POP_MEDIUM = 3;
    public static final int TYPE_POP_SMALL = 2;
    private static final AtomicInteger v = new AtomicInteger(1);
    protected String a;
    protected String b;
    private int c;
    private CampaignEx d;
    protected com.mbridge.msdk.splash.middle.d e;
    private ImageView f;
    private ImageView g;
    private ImageView h;
    private ImageView i;
    private TextView j;
    private TextView k;
    private TextView l;
    private int m;
    protected Handler n;
    private boolean o;
    protected com.mbridge.msdk.click.a p;
    private j q;
    private Runnable r;
    private Runnable s;
    View.OnClickListener t;
    View.OnClickListener u;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class a implements j {
        public a() {
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            if (campaign == null) {
                return;
            }
            u0.a(campaign, BaseSplashPopView.this);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            if (campaign == null) {
                return;
            }
            u0.a(campaign, BaseSplashPopView.this);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            int i;
            int i2;
            if (BaseSplashPopView.this.c == 1) {
                int min = Math.min(BaseSplashPopView.this.getWidth(), BaseSplashPopView.this.getHeight());
                int a = (v0.a(BaseSplashPopView.this.getContext(), 60.0f) - Math.min(Math.max(min / 4, 70), min)) / 2;
                i = v0.a(BaseSplashPopView.this.getContext(), 23.0f) + a;
                i2 = v0.a(BaseSplashPopView.this.getContext(), 10.0f) + a;
            } else {
                i = 0;
                i2 = 0;
            }
            u0.a(campaign, BaseSplashPopView.this, i, i2);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class b implements com.mbridge.msdk.foundation.same.image.c {
        final /* synthetic */ boolean a;

        public b(boolean z) {
            this.a = z;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            q0.b("MBSplashPopView", str);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            try {
                if (bitmap.isRecycled()) {
                    return;
                }
                Bitmap b = this.a ? p0.b(bitmap) : p0.a(bitmap, 1, 16);
                ImageView imageView = BaseSplashPopView.this.f;
                if (b != null) {
                    bitmap = b;
                }
                imageView.setImageBitmap(bitmap);
            } catch (Throwable th) {
                q0.b("MBSplashPopView", th.getMessage());
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class c implements com.mbridge.msdk.foundation.same.image.c {
        public c() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            q0.b("MBSplashPopView", str);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            try {
                if (bitmap.isRecycled()) {
                    return;
                }
                BaseSplashPopView.this.h.setImageBitmap(a0.a(bitmap, 10));
            } catch (Throwable th) {
                q0.b("MBSplashPopView", th.getMessage());
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class d implements com.mbridge.msdk.foundation.same.image.c {
        public d() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            q0.b("MBSplashPopView", str);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            try {
                if (bitmap.isRecycled()) {
                    return;
                }
                BaseSplashPopView.this.g.setImageBitmap(p0.a(bitmap, 1, 16));
            } catch (Throwable th) {
                q0.b("MBSplashPopView", th.getMessage());
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (BaseSplashPopView.this.l != null) {
                int i = BaseSplashPopView.this.m;
                BaseSplashPopView baseSplashPopView = BaseSplashPopView.this;
                if (i != 0) {
                    BaseSplashPopView.g(baseSplashPopView);
                    BaseSplashPopView.this.l.setText(String.valueOf(BaseSplashPopView.this.m));
                    BaseSplashPopView baseSplashPopView2 = BaseSplashPopView.this;
                    baseSplashPopView2.n.postDelayed(baseSplashPopView2.r, 1000L);
                    return;
                }
                baseSplashPopView.m = -1;
                BaseSplashPopView.this.g();
                BaseSplashPopView baseSplashPopView3 = BaseSplashPopView.this;
                baseSplashPopView3.n.removeCallbacks(baseSplashPopView3.r);
                BaseSplashPopView baseSplashPopView4 = BaseSplashPopView.this;
                com.mbridge.msdk.splash.middle.d dVar = baseSplashPopView4.e;
                if (dVar != null) {
                    dVar.a(new MBridgeIds(baseSplashPopView4.a, baseSplashPopView4.b), 5);
                }
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseSplashPopView baseSplashPopView = BaseSplashPopView.this;
            com.mbridge.msdk.splash.middle.d dVar = baseSplashPopView.e;
            if (dVar != null) {
                dVar.a(new MBridgeIds(baseSplashPopView.a, baseSplashPopView.b), BaseSplashPopView.this.getWidth(), BaseSplashPopView.this.getHeight(), BaseSplashPopView.this.c);
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseSplashPopView baseSplashPopView = BaseSplashPopView.this;
            if (baseSplashPopView.e != null) {
                baseSplashPopView.b(baseSplashPopView.d);
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseSplashPopView baseSplashPopView;
            com.mbridge.msdk.splash.middle.d dVar;
            if (BaseSplashPopView.this.m <= 0 && (dVar = (baseSplashPopView = BaseSplashPopView.this).e) != null) {
                dVar.a(new MBridgeIds(baseSplashPopView.a, baseSplashPopView.b), 4);
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class i {
        private String a;
        private String b;
        private int c;
        private CampaignEx d;

        public i(String str, String str2, int i, CampaignEx campaignEx) {
            this.a = str;
            this.b = str2;
            this.c = i;
            this.d = campaignEx;
        }

        public CampaignEx a() {
            return this.d;
        }

        public String b() {
            return this.a;
        }

        public String c() {
            return this.b;
        }

        public int d() {
            return this.c;
        }
    }

    public BaseSplashPopView(Context context, i iVar, com.mbridge.msdk.splash.middle.d dVar) {
        super(context);
        this.c = 1;
        this.m = -1;
        this.n = new Handler();
        this.o = false;
        this.q = new a();
        this.r = new e();
        this.s = new f();
        this.t = new g();
        this.u = new h();
        if (iVar == null) {
            a70.p("Parameters is NULL, can't gen view.");
            throw null;
        }
        this.b = iVar.c();
        this.a = iVar.b();
        this.c = iVar.d();
        this.d = iVar.a();
        this.e = dVar;
        a();
    }

    private void b() {
        String str;
        this.i = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v0.a(getContext(), 32.0f), v0.a(getContext(), 13.0f));
        layoutParams.addRule(11);
        layoutParams.addRule(8, this.f.getId());
        this.i.setLayoutParams(layoutParams);
        try {
            str = getResources().getConfiguration().locale.getLanguage();
        } catch (Throwable th) {
            q0.b("MBSplashPopView", th.getMessage());
            str = "ZH";
        }
        this.i.setBackgroundResource((str.toUpperCase().equals("CN") || str.toUpperCase().equals("ZH")) ? getResources().getIdentifier("mbridge_splash_pop_ad", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()) : getResources().getIdentifier("mbridge_splash_pop_ad_en", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
        addView(this.i);
    }

    private void c() {
        View imageView = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v0.a(getContext(), 80.0f), v0.a(getContext(), 80.0f));
        layoutParams.addRule(9);
        layoutParams.topMargin = v0.a(getContext(), 16.0f);
        imageView.setId(generateViewId());
        imageView.setLayoutParams(layoutParams);
        imageView.setBackgroundResource(getResources().getIdentifier("mbridge_splash_popview_default", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
        this.f = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(v0.a(getContext(), 60.0f), v0.a(getContext(), 60.0f));
        layoutParams2.addRule(6, imageView.getId());
        layoutParams2.topMargin = v0.a(getContext(), 7.0f);
        layoutParams2.leftMargin = v0.a(getContext(), 10.0f);
        this.f.setId(generateViewId());
        this.f.setLayoutParams(layoutParams2);
        this.f.setScaleType(ImageView.ScaleType.FIT_CENTER);
        CampaignEx campaignEx = this.d;
        if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getIconUrl())) {
            a(this.d.getIconUrl(), true);
        }
        this.l = new TextView(getContext());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(5, imageView.getId());
        layoutParams3.addRule(8, imageView.getId());
        layoutParams3.leftMargin = v0.a(getContext(), 62.0f);
        layoutParams3.bottomMargin = v0.a(getContext(), 70.0f);
        this.l.setId(generateViewId());
        this.l.setTextSize(10.0f);
        this.l.setTextColor(-1);
        this.l.setGravity(17);
        this.l.setMinWidth(v0.a(getContext(), 16.0f));
        this.l.setMaxHeight(v0.a(getContext(), 16.0f));
        this.l.setLayoutParams(layoutParams3);
        this.l.setBackgroundResource(getResources().getIdentifier("mbridge_cm_circle_50black", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
        addView(imageView);
        addView(this.l);
        addView(this.f);
        CampaignEx campaignEx2 = this.d;
        if (campaignEx2 != null && campaignEx2.getFlbSkipTime() <= 0) {
            g();
        }
        CampaignEx campaignEx3 = this.d;
        if (campaignEx3 != null) {
            b1.a(this, campaignEx3.getLocalRequestId(), this.d.getLocalAllowTrackClick());
        }
        setOnClickListener(this.t);
        this.l.setOnClickListener(this.u);
    }

    private void d() {
        this.h = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, v0.a(getContext(), 131.0f));
        layoutParams.addRule(10);
        layoutParams.addRule(14);
        this.h.setScaleType(ImageView.ScaleType.FIT_XY);
        this.h.setId(generateViewId());
        this.h.setLayoutParams(layoutParams);
        setBackgroundImage(this.d.getImageUrl());
        this.g = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, v0.a(getContext(), 131.0f));
        layoutParams2.addRule(10);
        layoutParams2.addRule(14);
        this.g.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.g.setId(generateViewId());
        this.g.setLayoutParams(layoutParams2);
        setForegroundImage(this.d.getImageUrl());
        this.f = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(v0.a(getContext(), 50.0f), v0.a(getContext(), 50.0f));
        layoutParams3.addRule(9);
        layoutParams3.addRule(3, this.h.getId());
        layoutParams3.topMargin = 20;
        this.f.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f.setId(generateViewId());
        this.f.setLayoutParams(layoutParams3);
        a(this.d.getIconUrl(), false);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams4.addRule(1, this.f.getId());
        layoutParams4.addRule(6, this.f.getId());
        layoutParams4.addRule(8, this.f.getId());
        layoutParams4.leftMargin = v0.a(getContext(), 8.0f);
        layoutParams4.rightMargin = v0.a(getContext(), 8.0f);
        relativeLayout.setLayoutParams(layoutParams4);
        relativeLayout.setGravity(16);
        TextView textView = new TextView(getContext());
        this.j = textView;
        textView.setId(generateViewId());
        this.j.setGravity(16);
        this.j.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        this.j.setTextSize(12.0f);
        this.j.setTextColor(-16777216);
        TextView textView2 = this.j;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.MARQUEE;
        textView2.setEllipsize(truncateAt);
        this.j.setMarqueeRepeatLimit(-1);
        this.j.setSelected(true);
        this.j.setSingleLine(true);
        this.j.setText(this.d.getAppName());
        TextView textView3 = new TextView(getContext());
        this.k = textView3;
        textView3.setId(generateViewId());
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.addRule(5, this.j.getId());
        layoutParams5.addRule(3, this.j.getId());
        layoutParams5.topMargin = v0.a(getContext(), 4.0f);
        layoutParams5.rightMargin = v0.a(getContext(), 36.0f);
        this.k.setGravity(16);
        this.k.setLayoutParams(layoutParams5);
        this.k.setTextSize(8.0f);
        this.k.setTextColor(-10066330);
        this.k.setEllipsize(truncateAt);
        this.k.setMarqueeRepeatLimit(-1);
        this.k.setSelected(true);
        this.k.setSingleLine(true);
        this.k.setText(this.d.getAppDesc());
        relativeLayout.addView(this.j);
        relativeLayout.addView(this.k);
        addView(this.h);
        addView(this.g);
        addView(this.f);
        addView(relativeLayout);
        b();
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("adtp", 297);
        if (TextUtils.isEmpty(this.d.getBidToken())) {
            eVar.a(CampaignEx.JSON_KEY_HB, 0);
        } else {
            eVar.a(CampaignEx.JSON_KEY_HB, 1);
        }
        b1.a(this, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(true, this.d.getBidToken(), eVar, this.d, this.b).t(), this.d.getLocalAllowTrackClick());
        setOnClickListener(this.t);
    }

    private void e() {
        int a2 = v0.a(getContext(), 4.0f);
        this.f = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v0.a(getContext(), 50.0f), v0.a(getContext(), 50.0f));
        layoutParams.addRule(9);
        this.f.setId(generateViewId());
        this.f.setLayoutParams(layoutParams);
        this.f.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f.setPadding(a2, a2, a2, a2);
        a(this.d.getIconUrl(), false);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(1, this.f.getId());
        layoutParams2.addRule(6, this.f.getId());
        layoutParams2.addRule(8, this.f.getId());
        layoutParams2.leftMargin = v0.a(getContext(), 8.0f);
        layoutParams2.rightMargin = v0.a(getContext(), 8.0f);
        relativeLayout.setLayoutParams(layoutParams2);
        relativeLayout.setGravity(16);
        TextView textView = new TextView(getContext());
        this.j = textView;
        textView.setId(generateViewId());
        this.j.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        this.j.setGravity(16);
        this.j.setTextSize(12.0f);
        this.j.setSelected(true);
        TextView textView2 = this.j;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.MARQUEE;
        textView2.setEllipsize(truncateAt);
        this.j.setMarqueeRepeatLimit(-1);
        this.j.setSingleLine(true);
        this.j.setTextColor(-16777216);
        this.j.setText(this.d.getAppName());
        TextView textView3 = new TextView(getContext());
        this.k = textView3;
        textView3.setId(generateViewId());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(5, this.j.getId());
        layoutParams3.addRule(3, this.j.getId());
        layoutParams3.topMargin = v0.a(getContext(), 4.0f);
        layoutParams3.rightMargin = v0.a(getContext(), 36.0f);
        this.k.setGravity(16);
        this.k.setLayoutParams(layoutParams3);
        this.k.setTextSize(8.0f);
        this.k.setTextColor(-10066330);
        this.k.setEllipsize(truncateAt);
        this.k.setMarqueeRepeatLimit(-1);
        this.k.setSelected(true);
        this.k.setSingleLine(true);
        this.k.setText(this.d.getAppDesc());
        relativeLayout.addView(this.j);
        relativeLayout.addView(this.k);
        setBackgroundResource(getResources().getIdentifier("mbridge_shape_corners_bg", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
        addView(this.f);
        addView(relativeLayout);
        b();
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("adtp", 297);
        if (TextUtils.isEmpty(this.d.getBidToken())) {
            eVar.a(CampaignEx.JSON_KEY_HB, 0);
        } else {
            eVar.a(CampaignEx.JSON_KEY_HB, 1);
        }
        b1.a(this, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(true, this.d.getBidToken(), eVar, this.d, this.b).t(), this.d.getLocalAllowTrackClick());
        setOnClickListener(this.t);
    }

    private void f() {
        int a2 = v0.a(getContext(), 4.0f);
        this.f = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v0.a(getContext(), 28.0f), v0.a(getContext(), 28.0f));
        layoutParams.addRule(9);
        this.f.setId(generateViewId());
        this.f.setLayoutParams(layoutParams);
        this.f.setPadding(a2, a2, a2, a2);
        this.f.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        a(this.d.getIconUrl(), false);
        TextView textView = new TextView(getContext());
        this.j = textView;
        textView.setId(generateViewId());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(1, this.f.getId());
        layoutParams2.addRule(6, this.f.getId());
        layoutParams2.addRule(8, this.f.getId());
        layoutParams2.leftMargin = v0.a(getContext(), 4.0f);
        layoutParams2.rightMargin = v0.a(getContext(), 40.0f);
        this.j.setLayoutParams(layoutParams2);
        this.j.setGravity(16);
        this.j.setTextSize(10.0f);
        this.j.setSelected(true);
        this.j.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.j.setMarqueeRepeatLimit(-1);
        this.j.setSingleLine(true);
        this.j.setTextColor(-16777216);
        this.j.setText(this.d.getAppName());
        setBackgroundResource(getResources().getIdentifier("mbridge_shape_corners_bg", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
        addView(this.f);
        addView(this.j);
        b();
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("adtp", 297);
        if (TextUtils.isEmpty(this.d.getBidToken())) {
            eVar.a(CampaignEx.JSON_KEY_HB, 0);
        } else {
            eVar.a(CampaignEx.JSON_KEY_HB, 1);
        }
        b1.a(this, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(true, this.d.getBidToken(), eVar, this.d, this.b).t(), this.d.getLocalAllowTrackClick());
        setOnClickListener(this.t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        TextView textView = this.l;
        if (textView != null) {
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = v0.a(getContext(), 16.0f);
            layoutParams.height = v0.a(getContext(), 16.0f);
            this.l.setLayoutParams(layoutParams);
            this.l.setText("");
            this.l.setSelected(true);
            this.l.setBackgroundResource(getResources().getIdentifier("mbridge_splash_popview_close", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
        }
    }

    public static int generateViewId() {
        AtomicInteger atomicInteger;
        int i2;
        int i3;
        do {
            atomicInteger = v;
            i2 = atomicInteger.get();
            i3 = i2 + 1;
            if (i3 > 16777215) {
                i3 = 1;
            }
        } while (!atomicInteger.compareAndSet(i2, i3));
        return i2;
    }

    private void setBackgroundImage(String str) {
        w1l.d().a(str, new c());
    }

    private void setForegroundImage(String str) {
        w1l.d().a(str, new d());
    }

    public void a(CampaignEx campaignEx) {
        if (this.p == null) {
            com.mbridge.msdk.click.a aVar = new com.mbridge.msdk.click.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.b);
            this.p = aVar;
            aVar.a(this.q);
        }
        campaignEx.setCampaignUnitId(this.b);
        this.p.a(campaignEx);
        if (!campaignEx.isReportClick()) {
            campaignEx.setReportClick(true);
            com.mbridge.msdk.splash.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx);
        }
        com.mbridge.msdk.splash.middle.d dVar = this.e;
        if (dVar != null) {
            dVar.a(new MBridgeIds(this.a, this.b));
            this.e.a(new MBridgeIds(this.a, this.b), 6);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.e != null) {
            postDelayed(this.s, 500L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        release();
    }

    public void pauseCountDown() {
        this.o = true;
        if (this.l != null) {
            this.n.removeCallbacks(this.r);
        }
    }

    public void reStartCountDown() {
        if (this.o) {
            this.o = false;
            int i2 = this.m;
            if (i2 == -1 || i2 == 0) {
                g();
                return;
            }
            TextView textView = this.l;
            if (textView != null) {
                textView.setText(String.valueOf(i2));
                this.n.postDelayed(this.r, 1000L);
            }
        }
    }

    public void release() {
        try {
            this.n.removeCallbacks(this.s);
            this.n.removeCallbacks(this.r);
            this.r = null;
            detachAllViewsFromParent();
            this.d = null;
            this.e = null;
        } catch (Exception e2) {
            q0.b("MBSplashPopView", e2.getMessage());
        }
    }

    public void setPopViewType(i iVar, com.mbridge.msdk.splash.middle.d dVar) {
        if (iVar == null) {
            a70.p("Parameters is NULL, can't gen view.");
            return;
        }
        this.b = iVar.c();
        this.a = iVar.b();
        this.c = iVar.d();
        this.d = iVar.a();
        this.e = dVar;
        a();
    }

    public void startCountDown() {
        this.n.removeCallbacks(this.r);
        CampaignEx campaignEx = this.d;
        if (campaignEx == null || this.c != 1) {
            return;
        }
        int flbSkipTime = campaignEx.getFlbSkipTime();
        if (flbSkipTime <= 0) {
            g();
            return;
        }
        this.m = flbSkipTime;
        TextView textView = this.l;
        if (textView != null) {
            textView.setText(String.valueOf(flbSkipTime));
            this.n.postDelayed(this.r, 1000L);
        }
    }

    public static /* synthetic */ int g(BaseSplashPopView baseSplashPopView) {
        int i2 = baseSplashPopView.m;
        baseSplashPopView.m = i2 - 1;
        return i2;
    }

    private void a() {
        if (this.d == null) {
            return;
        }
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        int i2 = this.c;
        if (i2 == 1) {
            c();
            return;
        }
        if (i2 == 2) {
            f();
        } else if (i2 == 3) {
            e();
        } else {
            if (i2 != 4) {
                return;
            }
            d();
        }
    }

    public BaseSplashPopView(Context context) {
        super(context);
        this.c = 1;
        this.m = -1;
        this.n = new Handler();
        this.o = false;
        this.q = new a();
        this.r = new e();
        this.s = new f();
        this.t = new g();
        this.u = new h();
        this.c = 1;
        q0.c("MBSplashPopView", "Please call setPopViewType() to init.");
    }

    private void a(String str, boolean z) {
        w1l.d().a(str, new b(z));
    }

    public BaseSplashPopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = 1;
        this.m = -1;
        this.n = new Handler();
        this.o = false;
        this.q = new a();
        this.r = new e();
        this.s = new f();
        this.t = new g();
        this.u = new h();
        this.c = 1;
        q0.c("MBSplashPopView", "Please call setPopViewType() to init.");
    }

    public BaseSplashPopView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.c = 1;
        this.m = -1;
        this.n = new Handler();
        this.o = false;
        this.q = new a();
        this.r = new e();
        this.s = new f();
        this.t = new g();
        this.u = new h();
        this.c = 1;
        q0.c("MBSplashPopView", "Please call setPopViewType() to init.");
    }

    public BaseSplashPopView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.c = 1;
        this.m = -1;
        this.n = new Handler();
        this.o = false;
        this.q = new a();
        this.r = new e();
        this.s = new f();
        this.t = new g();
        this.u = new h();
        this.c = 1;
        q0.c("MBSplashPopView", "Please call setPopViewType() to init.");
    }

    public void b(CampaignEx campaignEx) {
        com.mbridge.msdk.splash.report.a.a(campaignEx, this.b);
    }
}
