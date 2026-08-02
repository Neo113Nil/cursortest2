package com.blaze.blazesdk.web_view;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.blaze.blazesdk.shared.BlazeSDK;
import defpackage.arl;
import defpackage.cnb;
import defpackage.i5m;
import defpackage.lz;
import defpackage.wca;
import defpackage.xw3;
import defpackage.yam;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/blaze/blazesdk/web_view/BlazeWebViewActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "a", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BlazeWebViewActivity extends AppCompatActivity {
    public i5m i;
    public com.blaze.blazesdk.web_view.a j;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new a(null);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        context.getClass();
        super.attachBaseContext(cnb.a(context, BlazeSDK.INSTANCE.getForceLayoutDirection$blazesdk_release()));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
            arl.a(this);
            this.i = new i5m(this);
            FrameLayout frameLayout = new FrameLayout(this);
            View view = this.i;
            if (view == null) {
                Intrinsics.i("innerWebview");
                throw null;
            }
            frameLayout.addView(view);
            setContentView(frameLayout);
            q(frameLayout);
            xw3.L(wca.x(getLifecycle()), null, null, new yam(this, null), 3);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        i5m i5mVar;
        try {
            i5mVar = this.i;
        } catch (Throwable unused) {
        }
        if (i5mVar == null) {
            Intrinsics.i("innerWebview");
            throw null;
        }
        i5mVar.destroy();
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            try {
                i5m i5mVar = this.i;
                if (i5mVar == null) {
                    Intrinsics.i("innerWebview");
                    throw null;
                }
                if (i5mVar.canGoBack()) {
                    i5m i5mVar2 = this.i;
                    if (i5mVar2 != null) {
                        i5mVar2.goBack();
                        return true;
                    }
                    Intrinsics.i("innerWebview");
                    throw null;
                }
            } catch (Throwable th) {
                BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                return false;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        try {
            super.onResume();
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    public final void p() {
        Parcelable parcelable;
        try {
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                if (Build.VERSION.SDK_INT > 33) {
                    parcelable = (Parcelable) extras.getParcelable("BlazeWebViewArgs", com.blaze.blazesdk.web_view.a.class);
                } else {
                    Parcelable parcelable2 = extras.getParcelable("BlazeWebViewArgs");
                    if (!(parcelable2 instanceof com.blaze.blazesdk.web_view.a)) {
                        parcelable2 = null;
                    }
                    parcelable = (com.blaze.blazesdk.web_view.a) parcelable2;
                }
                com.blaze.blazesdk.web_view.a aVar = (com.blaze.blazesdk.web_view.a) parcelable;
                if (aVar != null) {
                    this.j = aVar;
                }
            }
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    public final void q(FrameLayout frameLayout) {
        try {
            try {
                Window window = getWindow();
                if (window != null) {
                    window.setNavigationBarColor(-16777216);
                    window.setStatusBarColor(-16777216);
                }
            } catch (Throwable th) {
                BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
            }
            frameLayout.setBackgroundColor(-16777216);
            lz.s(frameLayout);
            arl.c(this, true);
            p();
            com.blaze.blazesdk.web_view.a aVar = this.j;
            String str = aVar != null ? aVar.b : null;
            if (str != null && str.length() != 0) {
                i5m i5mVar = this.i;
                if (i5mVar != null) {
                    i5mVar.loadUrl(str);
                } else {
                    Intrinsics.i("innerWebview");
                    throw null;
                }
            }
        } catch (Throwable th2) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th2, null);
        }
    }
}
