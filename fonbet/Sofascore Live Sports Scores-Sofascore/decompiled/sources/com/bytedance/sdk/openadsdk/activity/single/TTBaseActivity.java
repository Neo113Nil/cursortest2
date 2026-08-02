package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.window.OnBackInvokedCallback;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.utils.mk;
import com.bytedance.sdk.openadsdk.utils.qy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class TTBaseActivity extends Activity {
    protected String mu;
    private OnBackInvokedCallback pcc;
    protected boolean pq = false;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class pcc implements OnBackInvokedCallback {
        private final WeakReference<TTBaseActivity> pcc;

        public pcc(TTBaseActivity tTBaseActivity) {
            this.pcc = new WeakReference<>(tTBaseActivity);
        }

        public void onBackInvoked() {
            TTBaseActivity tTBaseActivity = this.pcc.get();
            if (tTBaseActivity != null) {
                tTBaseActivity.gbb();
            }
        }
    }

    @Override // android.app.Activity
    public void finish() {
        try {
            super.finish();
        } catch (Exception unused) {
        }
    }

    public void gbb() {
        onBackPressed();
    }

    public void gm(boolean z) {
        this.pq = z;
    }

    public void lu() {
        try {
            if (!mk.sf() || Build.VERSION.SDK_INT < 29) {
                return;
            }
            getWindow().getDecorView().setForceDarkAllowed(false);
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (oo() && qy.pcc()) {
            this.pcc = new pcc(this);
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.pcc);
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (!qy.pcc() || this.pcc == null) {
            return;
        }
        getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.pcc);
        this.pcc = null;
    }

    @Override // android.app.Activity
    public void onPause() {
        if (Build.VERSION.SDK_INT < 33) {
            super.onPause();
            return;
        }
        try {
            try {
                super.onPause();
            } catch (Exception unused) {
            }
        } catch (IllegalArgumentException unused2) {
            Field declaredField = Activity.class.getDeclaredField("mCalled");
            declaredField.setAccessible(true);
            declaredField.set(this, Boolean.TRUE);
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        if (Build.VERSION.SDK_INT > 28) {
            super.onResume();
            return;
        }
        try {
            super.onResume();
        } catch (IllegalArgumentException e) {
            lo.pcc("TTBaseActivity", "super.onResume() run fail", e);
            try {
                Field declaredField = Activity.class.getDeclaredField("mCalled");
                declaredField.setAccessible(true);
                declaredField.set(this, Boolean.TRUE);
            } catch (Exception e2) {
                lo.pcc("TTBaseActivity", "onResume set mCalled fail", e2);
            }
        }
    }

    public boolean oo() {
        return false;
    }
}
