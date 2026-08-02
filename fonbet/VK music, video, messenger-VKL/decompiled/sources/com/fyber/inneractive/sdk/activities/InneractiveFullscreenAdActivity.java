package com.fyber.inneractive.sdk.activities;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.config.t0;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.flow.b0;
import com.fyber.inneractive.sdk.flow.h0;
import com.fyber.inneractive.sdk.flow.p0;
import com.fyber.inneractive.sdk.network.z;
import com.fyber.inneractive.sdk.renderers.v;
import com.fyber.inneractive.sdk.ui.CloseButtonConfiguration;
import com.fyber.inneractive.sdk.ui.CloseButtonFlowManager;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.l0;
import com.fyber.inneractive.sdk.util.n0;
import com.fyber.inneractive.sdk.util.r;
import java.util.WeakHashMap;

/* loaded from: classes12.dex */
public class InneractiveFullscreenAdActivity extends InneractiveBaseActivity implements com.fyber.inneractive.sdk.interfaces.e {
    public static final String EXTRA_KEY_SPOT_ID = "spotId";
    public ViewGroup b;
    public InneractiveAdSpot c;
    public com.fyber.inneractive.sdk.interfaces.f d;
    public CloseButtonFlowManager i;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    public boolean h = false;
    protected final Runnable mHideNavigationBarTask = new c(this);

    public interface FullScreenRendererProvider {
        com.fyber.inneractive.sdk.interfaces.f getFullscreenRenderer();
    }

    public interface OnInneractiveFullscreenAdDestroyListener {
        void onActivityDestroyed(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity);
    }

    public void cancelHideNavigationBarTask() {
        getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(null);
        r.b.removeCallbacks(this.mHideNavigationBarTask);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public void destroy() {
        if (isFinishing() || this.b == null) {
            return;
        }
        finish();
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public void disableCloseButton() {
        CloseButtonFlowManager closeButtonFlowManager = this.i;
        if (closeButtonFlowManager == null) {
            return;
        }
        closeButtonFlowManager.c.setVisibility(8);
        closeButtonFlowManager.a.setVisibility(8);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public void dismissAd(boolean z) {
        this.h = z;
        cancelHideNavigationBarTask();
        com.fyber.inneractive.sdk.interfaces.f fVar = this.d;
        if (fVar != null) {
            fVar.b(z);
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public View getCloseButton() {
        CloseButtonFlowManager closeButtonFlowManager = this.i;
        if (closeButtonFlowManager != null) {
            return closeButtonFlowManager.e;
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public ViewGroup getLayout() {
        return this.b;
    }

    public void hideNavigationBar() {
        View decorView = getWindow().getDecorView();
        if ((decorView.getSystemUiVisibility() & 2) == 0) {
            decorView.setSystemUiVisibility(2818);
        }
        decorView.setOnSystemUiVisibilityChangeListener(new e(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initWindowFeatures(com.fyber.inneractive.sdk.interfaces.f fVar) {
        requestWindowFeature(1);
        getWindow().addFlags(1024);
        getWindow().addFlags(128);
        getWindow().addFlags(2);
        if (fVar != 0 && (((b0) fVar) instanceof v)) {
            setTheme(R.style.Theme.NoTitleBar.Fullscreen);
            requestWindowFeature(67108864);
            requestWindowFeature(134217728);
            requestWindowFeature(Integer.MIN_VALUE);
        }
        hideNavigationBar();
        t0 t0Var = ((r0) this.c.getAdContent().d).f;
        if (t0Var != null) {
            Orientation orientation = t0Var.e;
            setActivityOrientation(orientation.allowOrientationChange, orientation);
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public boolean isCloseButtonDisplay() {
        CloseButtonFlowManager closeButtonFlowManager = this.i;
        return closeButtonFlowManager != null && closeButtonFlowManager.d.getVisibility() == 0;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        com.fyber.inneractive.sdk.interfaces.f fVar = this.d;
        if (fVar == null || !fVar.u()) {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        com.fyber.inneractive.sdk.interfaces.f fVar = this.d;
        if (fVar != null) {
            int i = configuration.orientation;
            if (i != this.e) {
                this.e = i;
                fVar.a();
                return;
            }
            int i2 = this.f;
            int i3 = configuration.screenHeightDp;
            if (i2 == i3 && this.g == configuration.screenWidthDp) {
                return;
            }
            this.f = i3;
            this.g = configuration.screenWidthDp;
            fVar.a();
        }
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String stringExtra = getIntent().getStringExtra("spotId");
        InneractiveAdSpot inneractiveAdSpot = null;
        if (TextUtils.isEmpty(stringExtra)) {
            IAlog.f("%sSpot id must be provided as an extra before calling createActivity with InneractiveInterstitialAdActivty", IAlog.a(this));
        } else {
            InneractiveAdSpot spot = InneractiveAdSpotManager.get().getSpot(stringExtra);
            if (spot == null) {
                IAlog.b("%sSpot id %s cannot be found in spot manager!", IAlog.a(this), stringExtra);
            }
            if (spot != null && spot.getAdContent() == null) {
                IAlog.a("%sSpot does not have a content. Cannot start activity", IAlog.a(this));
            }
            if (spot != null && spot.getAdContent() != null) {
                inneractiveAdSpot = spot;
            }
        }
        this.c = inneractiveAdSpot;
        if (inneractiveAdSpot == null || inneractiveAdSpot.getAdContent() == null || this.c.getAdContent().d == null) {
            super.onCreate(bundle);
            finish();
            return;
        }
        InneractiveUnitController selectedUnitController = this.c.getSelectedUnitController();
        if (selectedUnitController == null || !(selectedUnitController instanceof FullScreenRendererProvider)) {
            IAlog.f("%sno appropriate unit controller found for full screen ad. Aborting", IAlog.a(this));
            super.onCreate(bundle);
            finish();
            return;
        }
        com.fyber.inneractive.sdk.interfaces.f fullscreenRenderer = ((FullScreenRendererProvider) selectedUnitController).getFullscreenRenderer();
        this.d = fullscreenRenderer;
        initWindowFeatures(fullscreenRenderer);
        super.onCreate(bundle);
        IAlog.a("%sInterstitial for spot id %s created", IAlog.a(this), this.c.getLocalUniqueId());
        this.e = getResources().getConfiguration().orientation;
        this.f = getResources().getConfiguration().screenHeightDp;
        this.g = getResources().getConfiguration().screenWidthDp;
        if (this.d == null) {
            IAlog.f("Interstitial Activity: Could not find an appropriate full screen ad renderer for content!", new Object[0]);
            finish();
            return;
        }
        try {
            setContentView(com.fyber.inneractive.sdk.R.layout.ia_layout_fullscreen_activity);
            this.b = (ViewGroup) findViewById(com.fyber.inneractive.sdk.R.id.ia_ad_content);
            this.i = new CloseButtonFlowManager(this, new d(this));
            ((p0) this.d).initialize(this.c);
            try {
                this.d.a(this, this);
                CloseButtonFlowManager closeButtonFlowManager = this.i;
                if (closeButtonFlowManager != null) {
                    this.d.b(closeButtonFlowManager);
                }
                this.c.getAdContent().e = true;
                InneractiveAdSpot inneractiveAdSpot2 = this.c;
                if (inneractiveAdSpot2 != null && (inneractiveAdSpot2 instanceof h0) && (this.d instanceof com.fyber.inneractive.sdk.rtb.watermark.a)) {
                    com.fyber.inneractive.sdk.rtb.watermark.b bVar = ((h0) inneractiveAdSpot2).m;
                    if (bVar == null || bVar.a == null || this.b == null) {
                        IAlog.a("%sCouldn't add watermark. %s is null", IAlog.a(this), bVar == null ? "Watermark" : bVar.a == null ? "Watermark ImageView" : "mContentLayout");
                        return;
                    }
                    FrameLayout frameLayout = new FrameLayout(this);
                    frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    frameLayout.setClickable(false);
                    frameLayout.addView(bVar.a);
                    this.b.addView(frameLayout);
                    ((com.fyber.inneractive.sdk.rtb.watermark.a) this.d).a(frameLayout);
                }
            } catch (Resources.NotFoundException e) {
                IAlog.f("Interstitial Activity: %s", e.getMessage());
                finish();
            } catch (InneractiveUnitController.AdDisplayError e2) {
                IAlog.f("Interstitial Activity: %s", e2.getMessage());
                finish();
            }
        } catch (Throwable th) {
            z.a(th, this.c.getAdContent().a, this.c.getAdContent().b);
            finish();
        }
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveBaseActivity, android.app.Activity
    public void onDestroy() {
        com.fyber.inneractive.sdk.interfaces.f fVar;
        n0 n0Var = l0.a;
        n0Var.getClass();
        IAlog.a("%scleanupForDestroyedActivity called for: %s", "IAVisibilityTracker: ", this);
        Context applicationContext = getApplicationContext();
        WeakHashMap weakHashMap = (WeakHashMap) n0Var.b.remove(applicationContext);
        if (weakHashMap != null) {
            IAlog.a("%sRemoved tracking entries for destroyed activity", "IAVisibilityTracker: ");
            weakHashMap.clear();
        }
        n0Var.a(applicationContext);
        CloseButtonFlowManager closeButtonFlowManager = this.i;
        if (closeButtonFlowManager != null) {
            closeButtonFlowManager.c.setOnClickListener(null);
            this.i = null;
        }
        ViewGroup viewGroup = this.b;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.b = null;
        }
        InneractiveAdSpot inneractiveAdSpot = this.c;
        InneractiveUnitController selectedUnitController = inneractiveAdSpot == null ? null : inneractiveAdSpot.getSelectedUnitController();
        if (selectedUnitController != null && (selectedUnitController instanceof OnInneractiveFullscreenAdDestroyListener)) {
            ((OnInneractiveFullscreenAdDestroyListener) selectedUnitController).onActivityDestroyed(this);
        }
        if (!isFinishing() && (fVar = this.d) != null) {
            CloseButtonFlowManager closeButtonFlowManager2 = this.i;
            if (closeButtonFlowManager2 != null) {
                fVar.a(closeButtonFlowManager2);
            }
            this.d.k();
            this.d.destroy();
            this.d = null;
        }
        super.onDestroy();
        InneractiveAdSpot inneractiveAdSpot2 = this.c;
        if (inneractiveAdSpot2 != null) {
            inneractiveAdSpot2.destroy();
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        if (!isFinishing()) {
            com.fyber.inneractive.sdk.interfaces.f fVar = this.d;
            if (fVar != null) {
                fVar.r();
                return;
            }
            return;
        }
        com.fyber.inneractive.sdk.interfaces.f fVar2 = this.d;
        if (fVar2 != null) {
            CloseButtonFlowManager closeButtonFlowManager = this.i;
            if (closeButtonFlowManager != null) {
                fVar2.a(closeButtonFlowManager);
            }
            this.d.k();
            this.d.destroy();
            this.d = null;
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        com.fyber.inneractive.sdk.interfaces.f fVar = this.d;
        if (fVar != null) {
            fVar.m();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (!z) {
            com.fyber.inneractive.sdk.interfaces.f fVar = this.d;
            if (fVar != null) {
                fVar.r();
                return;
            }
            return;
        }
        hideNavigationBar();
        com.fyber.inneractive.sdk.interfaces.f fVar2 = this.d;
        if (fVar2 != null) {
            fVar2.m();
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public void secondEndCardWasDisplayed() {
        CloseButtonFlowManager closeButtonFlowManager = this.i;
        if (closeButtonFlowManager == null) {
            return;
        }
        closeButtonFlowManager.f = true;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public void setActivityOrientation(boolean z, Orientation orientation) {
        if (z && orientation.equals(Orientation.USER)) {
            setRequestedOrientation(13);
            return;
        }
        if (z && orientation.equals(Orientation.NONE)) {
            setRequestedOrientation(getRequestedOrientation());
            return;
        }
        if (orientation.equals(Orientation.LANDSCAPE)) {
            setRequestedOrientation(6);
            return;
        }
        if (orientation.equals(Orientation.PORTRAIT)) {
            setRequestedOrientation(7);
            return;
        }
        int i = getResources().getConfiguration().orientation;
        if (i == 1) {
            setRequestedOrientation(7);
        } else if (i == 2) {
            setRequestedOrientation(6);
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public void showCloseButton(boolean z, int i, int i2) {
        CloseButtonFlowManager closeButtonFlowManager = this.i;
        if (closeButtonFlowManager == null) {
            return;
        }
        CloseButtonConfiguration closeButtonConfiguration = closeButtonFlowManager.g;
        closeButtonConfiguration.c = z;
        closeButtonConfiguration.d = i;
        closeButtonConfiguration.e = i2;
        closeButtonConfiguration.b = true;
        closeButtonConfiguration.a = false;
        closeButtonConfiguration.g.a(closeButtonConfiguration);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public void showCloseCountdown() {
        CloseButtonFlowManager closeButtonFlowManager = this.i;
        if (closeButtonFlowManager == null) {
            return;
        }
        closeButtonFlowManager.b.setBackgroundResource(com.fyber.inneractive.sdk.R.drawable.ia_round_overlay_bg);
        CloseButtonConfiguration closeButtonConfiguration = closeButtonFlowManager.g;
        closeButtonConfiguration.a = true;
        closeButtonConfiguration.b = false;
        closeButtonConfiguration.g.a(closeButtonConfiguration);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public void updateCloseCountdown(int i) {
        CloseButtonFlowManager closeButtonFlowManager = this.i;
        if (closeButtonFlowManager != null && i > 0) {
            closeButtonFlowManager.b.setText(Integer.toString(i));
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public boolean wasDismissedByUser() {
        return this.h;
    }
}
