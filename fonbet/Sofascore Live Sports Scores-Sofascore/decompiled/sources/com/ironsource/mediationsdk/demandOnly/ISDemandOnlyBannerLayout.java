package com.ironsource.mediationsdk.demandOnly;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.ironsource.C4334u2;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.logger.IronLog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class ISDemandOnlyBannerLayout extends FrameLayout {
    private View a;
    private ISBannerSize b;
    private String c;
    private Activity d;
    private boolean e;
    private C4334u2 f;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class a implements Runnable {
        final /* synthetic */ View a;
        final /* synthetic */ FrameLayout.LayoutParams b;

        public a(View view, FrameLayout.LayoutParams layoutParams) {
            this.a = view;
            this.b = layoutParams;
        }

        @Override // java.lang.Runnable
        public void run() {
            ISDemandOnlyBannerLayout.this.removeAllViews();
            ViewParent parent = this.a.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.a);
            }
            ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout = ISDemandOnlyBannerLayout.this;
            View view = this.a;
            iSDemandOnlyBannerLayout.a = view;
            iSDemandOnlyBannerLayout.addView(view, 0, this.b);
        }
    }

    public ISDemandOnlyBannerLayout(Activity activity, ISBannerSize iSBannerSize) {
        super(activity);
        this.e = false;
        this.d = activity;
        this.b = iSBannerSize == null ? ISBannerSize.BANNER : iSBannerSize;
        this.f = new C4334u2();
    }

    public void a() {
        this.e = true;
        this.d = null;
        this.b = null;
        this.c = null;
        this.a = null;
        removeBannerListener();
    }

    public Activity getActivity() {
        return this.d;
    }

    public ISDemandOnlyBannerListener getBannerDemandOnlyListener() {
        return this.f.a();
    }

    public View getBannerView() {
        return this.a;
    }

    public C4334u2 getListener() {
        return this.f;
    }

    public String getPlacementName() {
        return this.c;
    }

    public ISBannerSize getSize() {
        return this.b;
    }

    public boolean isDestroyed() {
        return this.e;
    }

    public void removeBannerListener() {
        IronLog.API.info();
        this.f.b((C4334u2) null);
    }

    public void setBannerDemandOnlyListener(ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
        IronLog.API.info();
        this.f.b((C4334u2) iSDemandOnlyBannerListener);
    }

    public void setPlacementName(String str) {
        this.c = str;
    }

    public void a(View view, FrameLayout.LayoutParams layoutParams) {
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(view, layoutParams));
    }

    private ISDemandOnlyBannerLayout(Context context) {
        super(context);
        this.e = false;
    }
}
