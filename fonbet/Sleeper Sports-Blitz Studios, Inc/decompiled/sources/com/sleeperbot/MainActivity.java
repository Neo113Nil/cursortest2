package com.sleeperbot;

import android.content.Intent;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.appsflyer.AppsFlyerLib;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.react.ReactActivity;
import com.facebook.react.ReactActivityDelegate;
import com.facebook.react.defaults.DefaultNewArchitectureEntryPoint;
import com.facebook.react.defaults.DefaultReactActivityDelegate;
import com.google.firebase.perf.util.Constants;
import com.sleeperbot.modules.PrefsManager;
import com.swmansion.rnscreens.fragment.restoration.RNScreensFragmentFactory;
import com.zoontek.rnbootsplash.RNBootSplash;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: MainActivity.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u00132\u00020\u0001:\u0002\u0013\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0014J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\b\u0010\n\u001a\u00020\u000bH\u0014J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\tH\u0014¨\u0006\u0015"}, d2 = {"Lcom/sleeperbot/MainActivity;", "Lcom/facebook/react/ReactActivity;", "<init>", "()V", "getMainComponentName", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "createReactActivityDelegate", "Lcom/facebook/react/ReactActivityDelegate;", "onNewIntent", SDKConstants.PARAM_INTENT, "Landroid/content/Intent;", "getIsParcelDebugEnabled", "", "onSaveInstanceState", "outState", "Companion", "ParcelDebugState", "app_fullRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MainActivity extends ReactActivity {
    private static final String PARCEL_DEBUG_KEY = "@sleeper/parcel-debug";

    /* compiled from: MainActivity.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/sleeperbot/MainActivity$ParcelDebugState;", "", Constants.ENABLE_DISABLE, "", "lastParcelSize", "", "updatedAt", "", "<init>", "(ZIJ)V", "()Z", "getLastParcelSize", "()I", "getUpdatedAt", "()J", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "app_fullRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final /* data */ class ParcelDebugState {
        private final boolean isEnabled;
        private final int lastParcelSize;
        private final long updatedAt;

        public static /* synthetic */ ParcelDebugState copy$default(ParcelDebugState parcelDebugState, boolean z, int i, long j, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z = parcelDebugState.isEnabled;
            }
            if ((i2 & 2) != 0) {
                i = parcelDebugState.lastParcelSize;
            }
            if ((i2 & 4) != 0) {
                j = parcelDebugState.updatedAt;
            }
            return parcelDebugState.copy(z, i, j);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }

        /* renamed from: component2, reason: from getter */
        public final int getLastParcelSize() {
            return this.lastParcelSize;
        }

        /* renamed from: component3, reason: from getter */
        public final long getUpdatedAt() {
            return this.updatedAt;
        }

        public final ParcelDebugState copy(boolean isEnabled, int lastParcelSize, long updatedAt) {
            return new ParcelDebugState(isEnabled, lastParcelSize, updatedAt);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ParcelDebugState)) {
                return false;
            }
            ParcelDebugState parcelDebugState = (ParcelDebugState) other;
            return this.isEnabled == parcelDebugState.isEnabled && this.lastParcelSize == parcelDebugState.lastParcelSize && this.updatedAt == parcelDebugState.updatedAt;
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.isEnabled) * 31) + Integer.hashCode(this.lastParcelSize)) * 31) + Long.hashCode(this.updatedAt);
        }

        public String toString() {
            return "ParcelDebugState(isEnabled=" + this.isEnabled + ", lastParcelSize=" + this.lastParcelSize + ", updatedAt=" + this.updatedAt + ")";
        }

        public ParcelDebugState(boolean z, int i, long j) {
            this.isEnabled = z;
            this.lastParcelSize = i;
            this.updatedAt = j;
        }

        public final boolean isEnabled() {
            return this.isEnabled;
        }

        public final int getLastParcelSize() {
            return this.lastParcelSize;
        }

        public final long getUpdatedAt() {
            return this.updatedAt;
        }
    }

    @Override // com.facebook.react.ReactActivity
    protected String getMainComponentName() {
        return "Sleeperbot";
    }

    @Override // com.facebook.react.ReactActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        getSupportFragmentManager().setFragmentFactory(new RNScreensFragmentFactory());
        RNBootSplash.init(this, getPackageManager().getActivityInfo(getComponentName(), 0).getThemeResource());
        super.onCreate(null);
        ViewCompat.setOnApplyWindowInsetsListener((ViewGroup) findViewById(android.R.id.content), new OnApplyWindowInsetsListener() { // from class: com.sleeperbot.MainActivity$$ExternalSyntheticLambda0
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                WindowInsetsCompat onCreate$lambda$0;
                onCreate$lambda$0 = MainActivity.onCreate$lambda$0(view, windowInsetsCompat);
                return onCreate$lambda$0;
            }
        });
        try {
            Field declaredField = CursorWindow.class.getDeclaredField("sCursorWindowSize");
            declaredField.setAccessible(true);
            declaredField.set(null, 104857600);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsetsCompat onCreate$lambda$0(View v, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(v, "v");
        Intrinsics.checkNotNullParameter(insets, "insets");
        Insets insets2 = insets.getInsets(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
        v.setPadding(insets2.left, 0, insets2.right, insets2.bottom);
        return insets;
    }

    @Override // com.facebook.react.ReactActivity
    protected ReactActivityDelegate createReactActivityDelegate() {
        return new DefaultReactActivityDelegate(this, getMainComponentName(), DefaultNewArchitectureEntryPoint.getFabricEnabled());
    }

    @Override // com.facebook.react.ReactActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        setIntent(intent);
        AppsFlyerLib.getInstance().performOnDeepLinking(intent, getApplicationContext());
    }

    private final boolean getIsParcelDebugEnabled() {
        Object m13470constructorimpl;
        String stringSync = PrefsManager.getStringSync(this, PARCEL_DEBUG_KEY);
        if (stringSync == null) {
            return false;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            MainActivity mainActivity = this;
            m13470constructorimpl = Result.m13470constructorimpl(Boolean.valueOf(new JSONObject(stringSync).optBoolean(Constants.ENABLE_DISABLE, false)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m13476isFailureimpl(m13470constructorimpl)) {
            m13470constructorimpl = null;
        }
        Boolean bool = (Boolean) m13470constructorimpl;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.remove("android:viewHierarchyState");
        if (getIsParcelDebugEnabled()) {
            Parcel obtain = Parcel.obtain();
            Intrinsics.checkNotNullExpressionValue(obtain, "obtain(...)");
            try {
                outState.writeToParcel(obtain, 0);
                int dataSize = obtain.dataSize();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(Constants.ENABLE_DISABLE, true);
                jSONObject.put("lastParcelSize", dataSize);
                jSONObject.put("updatedAt", System.currentTimeMillis() / 1000);
                String jSONObject2 = jSONObject.toString();
                Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
                PrefsManager.setStringSync(this, PARCEL_DEBUG_KEY, jSONObject2);
                Unit unit = Unit.INSTANCE;
            } catch (Exception e) {
                Integer.valueOf(Log.w("ParcelDebug", "Failed to record parcel size", e));
            } finally {
                obtain.recycle();
            }
        }
    }
}
