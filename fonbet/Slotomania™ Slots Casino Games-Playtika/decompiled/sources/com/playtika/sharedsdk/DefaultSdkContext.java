package com.playtika.sharedsdk;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.ProxyInfo;
import android.net.Uri;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.os.VibratorManager;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import android.webkit.WebSettings;
import androidx.appcompat.app.AlertDialog;
import androidx.preference.PreferenceManager;
import com.ironsource.X3;
import com.playtika.sharedsdk.HapticDescriptor;
import com.safedk.android.utils.Logger;
import io.ktor.sse.ServerSentEventKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes6.dex */
public class DefaultSdkContext implements SharedSdkCallback {
    private static final String ACCOUNT_PREFS_NAME = "account_storage";
    private static final String TAG = "SharedSdk";
    private final Activity activity;
    private final Vibrator injectedVibrator;

    public static void safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(Activity p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1);
    }

    @Override // com.playtika.sharedsdk.SharedSdkCallback
    public void closeWebView() {
    }

    @Override // com.playtika.sharedsdk.SharedSdkCallback
    public void hideInput() {
    }

    @Override // com.playtika.sharedsdk.SharedSdkCallback
    public void onNativeAppReloaded() {
    }

    @Override // com.playtika.sharedsdk.SharedSdkCallback
    public void openWebView(String str, String str2) {
    }

    @Override // com.playtika.sharedsdk.SharedSdkCallback
    public void postMessage(String str) {
    }

    @Override // com.playtika.sharedsdk.SharedSdkCallback
    public void postMessageToWebView(String str) {
    }

    @Override // com.playtika.sharedsdk.SharedSdkCallback
    public void reload() {
    }

    @Override // com.playtika.sharedsdk.SharedSdkCallback
    public void requestDebugConfig(String str) {
    }

    @Override // com.playtika.sharedsdk.SharedSdkCallback
    public void setWebViewVisibility(boolean z) {
    }

    @Override // com.playtika.sharedsdk.SharedSdkCallback
    public void showInput(int i) {
    }

    public DefaultSdkContext(Activity activity) {
        this(activity, null);
    }

    DefaultSdkContext(Activity activity, Vibrator vibrator) {
        this.activity = activity;
        this.injectedVibrator = vibrator;
    }

    protected Context getContext() {
        return this.activity;
    }

    protected Activity getActivity() {
        return this.activity;
    }

    private ActivityManager.MemoryInfo getMemoryInfo() {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) this.activity.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo;
    }

    @Override // com.playtika.sharedsdk.SharedSdkCallback
    public long getFreeMemoryMb() {
        return getMemoryInfo().availMem / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
    }

    @Override // com.playtika.sharedsdk.SharedSdkCallback
    public long getTotalMemoryMb() {
        return getMemoryInfo().totalMem / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
    }

    @Override // com.playtika.sharedsdk.SharedSdkCallback
    public String getProxyInfo() {
        ProxyInfo defaultProxy = ((ConnectivityManager) this.activity.getSystemService("connectivity")).getDefaultProxy();
        if (defaultProxy != null) {
            return String.format("%s:%d", defaultProxy.getHost(), Integer.valueOf(defaultProxy.getPort()));
        }
        return "";
    }

    public String GetFilesDirAbsolutePath() {
        try {
            return this.activity.getFilesDir().getAbsolutePath();
        } catch (Exception e) {
            Log.e(TAG, "GetFilesDirAbsolutePath failed", e);
            return "";
        }
    }

    public String GetCacheDirAbsolutePath() {
        try {
            return this.activity.getCacheDir().getAbsolutePath();
        } catch (Exception e) {
            Log.e(TAG, "GetCacheDirAbsolutePath failed", e);
            return "";
        }
    }

    public String GetUserAgent() {
        String str;
        try {
            str = WebSettings.getDefaultUserAgent(this.activity);
        } catch (Exception unused) {
            Log.e(TAG, "Unable to retrieve userAgent from WebSettings");
            str = null;
        }
        if (str != null) {
            return str;
        }
        try {
            str = System.getProperty("http.agent");
        } catch (Exception unused2) {
            Log.e(TAG, "Unable to retrieve userAgent from System properties");
        }
        return (str == null || str.isEmpty()) ? "Embedded V8 (Android)" : str;
    }

    public String GetPlatform() {
        String property = System.getProperty("os.name");
        String property2 = System.getProperty("os.arch");
        return (property == null || property2 == null) ? X3.d : property + ServerSentEventKt.SPACE + property2;
    }

    public int GetApiLevel() {
        return Build.VERSION.SDK_INT;
    }

    @Override // com.playtika.sharedsdk.SharedSdkCallback
    public void showAlert(final String str) {
        this.activity.runOnUiThread(new Runnable() { // from class: com.playtika.sharedsdk.DefaultSdkContext$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                DefaultSdkContext.this.m10332lambda$showAlert$0$complaytikasharedsdkDefaultSdkContext(str);
            }
        });
    }

    /* renamed from: lambda$showAlert$0$com-playtika-sharedsdk-DefaultSdkContext, reason: not valid java name */
    /* synthetic */ void m10332lambda$showAlert$0$complaytikasharedsdkDefaultSdkContext(String str) {
        if (this.activity.isFinishing()) {
            return;
        }
        new AlertDialog.Builder(this.activity).setMessage(str).setPositiveButton("Close", (DialogInterface.OnClickListener) null).setCancelable(false).show();
    }

    @Override // com.playtika.sharedsdk.SharedSdkCallback
    public void openUrl(String str) {
        try {
            safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(this.activity, new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (Exception unused) {
            Log.w(TAG, "openUrl: unable to find activity for intent");
        }
    }

    @Override // com.playtika.sharedsdk.SharedSdkCallback
    public void keepAwake() {
        this.activity.runOnUiThread(new Runnable() { // from class: com.playtika.sharedsdk.DefaultSdkContext$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                DefaultSdkContext.this.m10331lambda$keepAwake$1$complaytikasharedsdkDefaultSdkContext();
            }
        });
    }

    /* renamed from: lambda$keepAwake$1$com-playtika-sharedsdk-DefaultSdkContext, reason: not valid java name */
    /* synthetic */ void m10331lambda$keepAwake$1$complaytikasharedsdkDefaultSdkContext() {
        this.activity.getWindow().addFlags(128);
    }

    @Override // com.playtika.sharedsdk.SharedSdkCallback
    public void allowSleep() {
        this.activity.runOnUiThread(new Runnable() { // from class: com.playtika.sharedsdk.DefaultSdkContext$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                DefaultSdkContext.this.m10330lambda$allowSleep$2$complaytikasharedsdkDefaultSdkContext();
            }
        });
    }

    /* renamed from: lambda$allowSleep$2$com-playtika-sharedsdk-DefaultSdkContext, reason: not valid java name */
    /* synthetic */ void m10330lambda$allowSleep$2$complaytikasharedsdkDefaultSdkContext() {
        this.activity.getWindow().clearFlags(128);
    }

    @Override // com.playtika.sharedsdk.SharedSdkCallback
    public void ShowAppExitDialog() {
        this.activity.runOnUiThread(new Runnable() { // from class: com.playtika.sharedsdk.DefaultSdkContext$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                DefaultSdkContext.this.m10329x4d869ce3();
            }
        });
    }

    /* renamed from: lambda$ShowAppExitDialog$4$com-playtika-sharedsdk-DefaultSdkContext, reason: not valid java name */
    /* synthetic */ void m10329x4d869ce3() {
        new AlertDialog.Builder(this.activity).setIcon(android.R.drawable.ic_dialog_alert).setTitle("Exit?").setMessage("Are you sure you want to exit the application?").setPositiveButton("Yes", new DialogInterface.OnClickListener() { // from class: com.playtika.sharedsdk.DefaultSdkContext$$ExternalSyntheticLambda6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                DefaultSdkContext.this.m10328x462167c4(dialogInterface, i);
            }
        }).setNegativeButton("No", (DialogInterface.OnClickListener) null).show();
    }

    /* renamed from: lambda$ShowAppExitDialog$3$com-playtika-sharedsdk-DefaultSdkContext, reason: not valid java name */
    /* synthetic */ void m10328x462167c4(DialogInterface dialogInterface, int i) {
        this.activity.finish();
    }

    @Override // com.playtika.sharedsdk.SharedSdkCallback
    public void SetNotificationEnabledMode(boolean z) {
        PreferenceManager.getDefaultSharedPreferences(this.activity).edit().putBoolean("notificationsEnabled", z).apply();
    }

    @Override // com.playtika.sharedsdk.SharedSdkCallback
    public void Vibrate(long[] jArr) {
        Vibrator vibrator = getVibrator();
        if (vibrator == null || !vibrator.hasVibrator()) {
            return;
        }
        if (jArr == null || jArr.length == 0) {
            try {
                vibrator.cancel();
                return;
            } catch (SecurityException unused) {
                Log.w(TAG, "vibrate: missing VIBRATE permission");
                return;
            }
        }
        long[] jArr2 = new long[jArr.length + 1];
        jArr2[0] = 0;
        System.arraycopy(jArr, 0, jArr2, 1, jArr.length);
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                vibrator.vibrate(VibrationEffect.createWaveform(jArr2, -1));
            } else {
                vibrator.vibrate(jArr2, -1);
            }
        } catch (SecurityException unused2) {
            Log.w(TAG, "vibrate: missing VIBRATE permission");
        }
    }

    static final class WaveformPlan {
        final int[] amplitudes;
        final long[] timings;

        WaveformPlan(long[] jArr, int[] iArr) {
            this.timings = jArr;
            this.amplitudes = iArr;
        }
    }

    static WaveformPlan flattenToWaveform(HapticDescriptor.Event[] eventArr) {
        int i;
        long j = 0;
        for (HapticDescriptor.Event event : eventArr) {
            long j2 = r7.timeMs + (event.continuous ? r7.durationMs : 30L);
            if (j2 > j) {
                j = j2;
            }
        }
        if (j <= 0 || j > 30000) {
            return null;
        }
        int i2 = (int) j;
        HapticDescriptor.Event[] eventArr2 = (HapticDescriptor.Event[]) eventArr.clone();
        Arrays.sort(eventArr2, new Comparator() { // from class: com.playtika.sharedsdk.DefaultSdkContext$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int compare;
                compare = Integer.compare(((HapticDescriptor.Event) obj).timeMs, ((HapticDescriptor.Event) obj2).timeMs);
                return compare;
            }
        });
        int[] iArr = new int[i2];
        for (HapticDescriptor.Event event2 : eventArr2) {
            int i3 = event2.continuous ? event2.durationMs : 30;
            int max = Float.isNaN(event2.intensity) ? 255 : Math.max(1, Math.round(event2.intensity * 255.0f));
            for (int i4 = event2.timeMs; i4 < event2.timeMs + i3 && i4 < i2; i4++) {
                if (max > iArr[i4]) {
                    iArr[i4] = max;
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i5 = 0;
        while (i5 < i2) {
            int i6 = 1;
            while (true) {
                i = i5 + i6;
                if (i < i2 && iArr[i] == iArr[i5]) {
                    i6++;
                }
            }
            arrayList.add(Long.valueOf(i6));
            arrayList2.add(Integer.valueOf(iArr[i5]));
            i5 = i;
        }
        int size = arrayList.size();
        long[] jArr = new long[size];
        int[] iArr2 = new int[arrayList2.size()];
        for (int i7 = 0; i7 < size; i7++) {
            jArr[i7] = ((Long) arrayList.get(i7)).longValue();
            iArr2[i7] = ((Integer) arrayList2.get(i7)).intValue();
        }
        return new WaveformPlan(jArr, iArr2);
    }

    static VibrationEffect buildRepeatedEffect(WaveformPlan waveformPlan, int i) {
        if (i < 0) {
            return VibrationEffect.createWaveform(waveformPlan.timings, waveformPlan.amplitudes, 0);
        }
        if (i <= 1) {
            return VibrationEffect.createWaveform(waveformPlan.timings, waveformPlan.amplitudes, -1);
        }
        long j = 0;
        for (long j2 : waveformPlan.timings) {
            j += j2;
        }
        if (j * i > 30000) {
            return null;
        }
        int length = waveformPlan.timings.length;
        int i2 = length * i;
        long[] jArr = new long[i2];
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = i3 * length;
            System.arraycopy(waveformPlan.timings, 0, jArr, i4, length);
            System.arraycopy(waveformPlan.amplitudes, 0, iArr, i4, length);
        }
        return VibrationEffect.createWaveform(jArr, iArr, -1);
    }

    static int primitiveForSharpness(float f) {
        if (Float.isNaN(f)) {
            return 1;
        }
        if (f < 0.34f) {
            return 7;
        }
        return f < 0.67f ? 1 : 2;
    }

    static boolean canCompose(Vibrator vibrator, HapticDescriptor hapticDescriptor) {
        if (hapticDescriptor.repeat != 1) {
            return false;
        }
        for (HapticDescriptor.Event event : hapticDescriptor.events) {
            if (event.continuous) {
                return false;
            }
        }
        return vibrator.areAllPrimitivesSupported(7, 1, 2);
    }

    static VibrationEffect buildComposition(HapticDescriptor hapticDescriptor) {
        VibrationEffect.Composition startComposition = VibrationEffect.startComposition();
        HapticDescriptor.Event[] eventArr = (HapticDescriptor.Event[]) hapticDescriptor.events.clone();
        Arrays.sort(eventArr, new Comparator() { // from class: com.playtika.sharedsdk.DefaultSdkContext$$ExternalSyntheticLambda1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int compare;
                compare = Integer.compare(((HapticDescriptor.Event) obj).timeMs, ((HapticDescriptor.Event) obj2).timeMs);
                return compare;
            }
        });
        int i = 0;
        for (HapticDescriptor.Event event : eventArr) {
            int primitiveForSharpness = primitiveForSharpness(event.sharpness);
            float f = 1.0f;
            if (!Float.isNaN(event.intensity)) {
                f = Math.max(0.0f, Math.min(1.0f, event.intensity));
            }
            startComposition.addPrimitive(primitiveForSharpness, f, Math.max(0, event.timeMs - i));
            i = event.timeMs;
        }
        return startComposition.compose();
    }

    @Override // com.playtika.sharedsdk.SharedSdkCallback
    public void Vibrate(long[] jArr, HapticDescriptor hapticDescriptor) {
        WaveformPlan flattenToWaveform;
        VibrationEffect buildRepeatedEffect;
        if (hapticDescriptor == null || hapticDescriptor.events.length == 0) {
            Vibrate(jArr);
            return;
        }
        Vibrator vibrator = getVibrator();
        if (vibrator == null || !vibrator.hasVibrator()) {
            return;
        }
        try {
            if (Build.VERSION.SDK_INT >= 31 && canCompose(vibrator, hapticDescriptor)) {
                vibrator.vibrate(buildComposition(hapticDescriptor));
                return;
            }
            if (Build.VERSION.SDK_INT >= 26 && vibrator.hasAmplitudeControl() && (flattenToWaveform = flattenToWaveform(hapticDescriptor.events)) != null && (buildRepeatedEffect = buildRepeatedEffect(flattenToWaveform, hapticDescriptor.repeat)) != null) {
                vibrator.vibrate(buildRepeatedEffect);
            } else {
                Vibrate(jArr);
            }
        } catch (IllegalArgumentException e) {
            e = e;
            Log.w(TAG, "vibrate: descriptor render failed; falling back to pattern", e);
            Vibrate(jArr);
        } catch (OutOfMemoryError e2) {
            e = e2;
            Log.w(TAG, "vibrate: descriptor render failed; falling back to pattern", e);
            Vibrate(jArr);
        } catch (SecurityException unused) {
            Log.w(TAG, "vibrate: missing VIBRATE permission");
        }
    }

    private Vibrator getVibrator() {
        Vibrator vibrator = this.injectedVibrator;
        if (vibrator != null) {
            return vibrator;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            VibratorManager vibratorManager = (VibratorManager) this.activity.getSystemService("vibrator_manager");
            if (vibratorManager != null) {
                return vibratorManager.getDefaultVibrator();
            }
            return null;
        }
        return (Vibrator) this.activity.getSystemService("vibrator");
    }

    @Override // com.playtika.sharedsdk.SharedSdkCallback
    public void SetKeyValueToAccountStorage(String str, String str2) {
        this.activity.getSharedPreferences(ACCOUNT_PREFS_NAME, 0).edit().putString(str, str2).apply();
    }

    @Override // com.playtika.sharedsdk.SharedSdkCallback
    public String GetKeyValueFromAccountStorage(String str, String str2) {
        return this.activity.getSharedPreferences(ACCOUNT_PREFS_NAME, 0).getString(str, str2);
    }

    @Override // com.playtika.sharedsdk.SharedSdkCallback
    public String RetrieveLastSentryAnrEvent() {
        return "";
    }
}
