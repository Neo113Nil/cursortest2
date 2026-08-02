package com.facebook.ads.redexgen.core;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import com.facebook.ads.redexgen.core.C2652gi;
import com.facebook.ads.redexgen.core.FO;
import java.util.List;

/* loaded from: assets/audience_network/classes2.dex */
public final class FO extends AbstractC2000Qq<FB> {
    public int A00;
    public final int A01;
    public final C7M A04;
    public final C2652gi A05;
    public final ViewOnClickListenerC1850Kr A06;
    public final List<String> A08;
    public final Application.ActivityLifecycleCallbacks A02 = new Application.ActivityLifecycleCallbacks() { // from class: com.facebook.ads.internal.view.rewardedvideo.EndCardV2ScreenshotRecyclerAdapter$1
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            C2652gi c2652gi;
            Handler handler;
            Runnable runnable;
            c2652gi = FO.this.A05;
            if (activity == c2652gi.A0E()) {
                handler = FO.this.A03;
                runnable = FO.this.A07;
                handler.removeCallbacks(runnable);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            Handler handler;
            Runnable runnable;
            handler = FO.this.A03;
            runnable = FO.this.A07;
            handler.post(runnable);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
        }
    };
    public final Handler A03 = new Handler(Looper.getMainLooper());
    public final Runnable A07 = new RunnableC2517eX(this);

    public FO(C2652gi c2652gi, List<String> screenshotUrls, int i, C7M c7m, ViewOnClickListenerC1850Kr viewOnClickListenerC1850Kr, int i2) {
        this.A08 = screenshotUrls;
        this.A01 = i;
        this.A05 = c2652gi;
        this.A04 = c7m;
        this.A06 = viewOnClickListenerC1850Kr;
        this.A00 = i2;
        this.A03.post(this.A07);
        if (Build.VERSION.SDK_INT >= 29 && this.A05.A0E() != null) {
            this.A05.A0E().registerActivityLifecycleCallbacks(this.A02);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC2000Qq
    /* renamed from: A05, reason: merged with bridge method [inline-methods] */
    public final FB A0F(ViewGroup viewGroup, int i) {
        F9 f9 = new F9(this.A05);
        if (C2102Up.A1D(this.A05)) {
            f9.setOnClickListener(new ViewOnClickListenerC2518eY(this));
        }
        return new FB(f9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC2000Qq
    /* renamed from: A07, reason: merged with bridge method [inline-methods] */
    public final void A0K(FB fb, int i) {
        String str = this.A08.get(i % this.A08.size());
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(400, -1);
        int i2 = this.A01;
        int actualPosition = this.A01;
        marginLayoutParams.setMargins(i2, 0, actualPosition, 0);
        fb.A0p().setLayoutParams(marginLayoutParams);
        fb.A0p().setUrl(str);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2000Qq
    public final int A0B() {
        return this.A08.size() * 1000;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2000Qq
    public final void A0L(C7M c7m) {
        super.A0L(c7m);
        this.A03.removeCallbacks(this.A07);
        if (Build.VERSION.SDK_INT >= 29 && this.A05.A0E() != null) {
            this.A05.A0E().unregisterActivityLifecycleCallbacks(this.A02);
        }
    }

    public final void A0O(int i) {
        this.A00 = i;
    }
}
