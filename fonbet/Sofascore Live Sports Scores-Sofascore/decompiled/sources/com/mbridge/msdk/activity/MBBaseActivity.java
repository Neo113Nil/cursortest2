package com.mbridge.msdk.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.OrientationEventListener;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.f1;
import com.mbridge.msdk.foundation.tools.q0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class MBBaseActivity extends Activity {
    private Display a;
    private OrientationEventListener b;
    private int c = -1;
    private volatile boolean d = false;
    private Runnable e;
    private com.mbridge.msdk.config.activity.backdispatcher.a f;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                MBBaseActivity.this.b();
            } catch (Exception e) {
                q0.b("MBBaseActivity", e.getMessage());
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class b extends OrientationEventListener {
        public b(Context context, int i) {
            super(context, i);
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i) {
            int rotation = MBBaseActivity.this.a != null ? MBBaseActivity.this.a.getRotation() : 0;
            if (rotation == 1 && MBBaseActivity.this.c != 1) {
                MBBaseActivity.this.c = 1;
                MBBaseActivity.this.getNotchParams();
                q0.b("MBBaseActivity", "Orientation Left");
                return;
            }
            if (rotation == 3 && MBBaseActivity.this.c != 2) {
                MBBaseActivity.this.c = 2;
                MBBaseActivity.this.getNotchParams();
                q0.b("MBBaseActivity", "Orientation Right");
            } else if (rotation == 0 && MBBaseActivity.this.c != 3) {
                MBBaseActivity.this.c = 3;
                MBBaseActivity.this.getNotchParams();
                q0.b("MBBaseActivity", "Orientation Top");
            } else {
                if (rotation != 2 || MBBaseActivity.this.c == 4) {
                    return;
                }
                MBBaseActivity.this.c = 4;
                MBBaseActivity.this.getNotchParams();
                q0.b("MBBaseActivity", "Orientation Bottom");
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class c implements com.mbridge.msdk.config.activity.backdispatcher.b {
        public c() {
        }

        @Override // com.mbridge.msdk.config.activity.backdispatcher.b
        public void a() {
            MBBaseActivity.this.onBackDispatched();
        }
    }

    private int a() {
        Display display = this.a;
        if (display == null) {
            if (Build.VERSION.SDK_INT >= 30) {
                display = getDisplay();
                this.a = display;
            } else {
                display = ((WindowManager) getSystemService("window")).getDefaultDisplay();
                this.a = display;
            }
        }
        if (display != null) {
            return display.getRotation();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        MBBaseActivity mBBaseActivity;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        DisplayCutout displayCutout;
        int i6 = Build.VERSION.SDK_INT;
        if (this.d) {
            return;
        }
        WindowInsets rootWindowInsets = getWindow().getDecorView().getRootWindowInsets();
        int i7 = -1;
        if (rootWindowInsets == null || i6 < 28 || (displayCutout = rootWindowInsets.getDisplayCutout()) == null) {
            mBBaseActivity = this;
            i = -1;
            i2 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
        } else {
            int safeInsetLeft = displayCutout.getSafeInsetLeft();
            int safeInsetRight = displayCutout.getSafeInsetRight();
            int safeInsetTop = displayCutout.getSafeInsetTop();
            int safeInsetBottom = displayCutout.getSafeInsetBottom();
            Display display = this.a;
            int rotation = display != null ? display.getRotation() : a();
            if (this.c == -1) {
                this.c = rotation == 0 ? 3 : rotation == 1 ? 1 : rotation == 2 ? 4 : rotation == 3 ? 2 : -1;
                q0.b("MBBaseActivity", this.c + "");
            }
            if (rotation != 0) {
                if (rotation == 1) {
                    i7 = 90;
                } else if (rotation == 2) {
                    i7 = 180;
                } else if (rotation == 3) {
                    i7 = 270;
                }
                mBBaseActivity = this;
                i5 = safeInsetBottom;
                i2 = safeInsetLeft;
                i = i7;
            } else {
                mBBaseActivity = this;
                i5 = safeInsetBottom;
                i2 = safeInsetLeft;
                i = 0;
            }
            i3 = safeInsetRight;
            i4 = safeInsetTop;
        }
        mBBaseActivity.setTopControllerPadding(i, i2, i3, i4, i5);
        if (mBBaseActivity.b == null) {
            mBBaseActivity.d();
        }
    }

    private void c() {
        try {
            getWindow().addFlags(67108864);
            getWindow().getDecorView().setSystemUiVisibility(4098);
        } catch (Throwable th) {
            q0.b("MBBaseActivity", th.getMessage());
        }
    }

    private void d() {
        b bVar = new b(this, 1);
        this.b = bVar;
        boolean canDetectOrientation = bVar.canDetectOrientation();
        OrientationEventListener orientationEventListener = this.b;
        if (canDetectOrientation) {
            orientationEventListener.enable();
        } else {
            orientationEventListener.disable();
            this.b = null;
        }
    }

    public void getNotchParams() {
        if (this.d) {
            return;
        }
        this.e = new a();
        getWindow().getDecorView().postDelayed(this.e, 500L);
    }

    public abstract void onBackDispatched();

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.d = false;
        try {
            requestWindowFeature(1);
            getWindow().setFlags(1024, 1024);
            getWindow().addFlags(512);
            c();
            a();
            f1.c(getWindow());
            if (Build.VERSION.SDK_INT >= 33) {
                registerBackInvokedDispatcher();
            }
        } catch (Exception e) {
            q0.b("MBBaseActivity", e.getMessage());
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        this.d = true;
        super.onDestroy();
        try {
            OrientationEventListener orientationEventListener = this.b;
            if (orientationEventListener != null) {
                orientationEventListener.disable();
                this.b = null;
            }
            if (this.e != null) {
                getWindow().getDecorView().removeCallbacks(this.e);
            }
            if (Build.VERSION.SDK_INT >= 33) {
                unRegisterBackInvokedDispatcher();
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                q0.b("MBBaseActivity", e.getMessage());
            }
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        if (com.mbridge.msdk.foundation.feedback.b.f) {
            return;
        }
        getNotchParams();
        c();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        c();
    }

    public void registerBackInvokedDispatcher() {
        try {
            com.mbridge.msdk.config.activity.backdispatcher.a aVar = new com.mbridge.msdk.config.activity.backdispatcher.a();
            this.f = aVar;
            aVar.a(getWindow(), new c());
        } catch (Throwable th) {
            q0.b("MBBaseActivity", th.getMessage());
        }
    }

    public abstract void setTopControllerPadding(int i, int i2, int i3, int i4, int i5);

    public void unRegisterBackInvokedDispatcher() {
        try {
            com.mbridge.msdk.config.activity.backdispatcher.a aVar = this.f;
            if (aVar == null) {
                return;
            }
            aVar.a(getWindow());
        } catch (Throwable th) {
            q0.b("MBBaseActivity", th.getMessage());
        }
    }
}
