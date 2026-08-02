package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.internal.client.zzeu;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.preload.PreloadCallback;
import com.google.android.gms.ads.preload.PreloadConfiguration;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzcak;
import com.google.android.gms.internal.ads.zzcfe;
import defpackage.ba4;
import defpackage.ja4;
import defpackage.t94;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class MobileAds {

    @NonNull
    public static final String ERROR_DOMAIN = "com.google.android.gms.ads";

    private MobileAds() {
    }

    public static void disableMediationAdapterInitialization(@NonNull Context context) {
        zzeu.zzb().zzm(context);
    }

    @Nullable
    public static InitializationStatus getInitializationStatus() {
        return zzeu.zzb().zzl();
    }

    @KeepForSdk
    private static String getInternalVersion() {
        return zzeu.zzb().zzo();
    }

    @NonNull
    public static RequestConfiguration getRequestConfiguration() {
        return zzeu.zzb().zzp();
    }

    @NonNull
    public static VersionInfo getVersion() {
        zzeu.zzb();
        String[] split = TextUtils.split("25.4.0", "\\.");
        if (split.length != 3) {
            return new VersionInfo(0, 0, 0);
        }
        try {
            return new VersionInfo(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
        } catch (NumberFormatException unused) {
            return new VersionInfo(0, 0, 0);
        }
    }

    public static void initialize(@NonNull Context context) {
        zzeu.zzb().zzc(context, null, null);
    }

    public static void openAdInspector(@NonNull Context context, @NonNull OnAdInspectorClosedListener onAdInspectorClosedListener) {
        zzeu.zzb().zzn(context, onAdInspectorClosedListener);
    }

    public static void openDebugMenu(@NonNull Context context, @NonNull String str) {
        zzeu.zzb().zzj(context, str);
    }

    public static boolean putPublisherFirstPartyIdEnabled(boolean z) {
        return zzeu.zzb().zzr(z);
    }

    @Nullable
    public static ja4 registerCustomTabsSession(@NonNull Context context, @NonNull ba4 ba4Var, @NonNull String str, @Nullable t94 t94Var) {
        zzeu.zzb();
        Preconditions.e("#008 Must be called on the main UI thread.");
        zzcfe a = zzcak.a(context);
        if (a == null) {
            zzo.zzf("Internal error, query info generator is null.");
            return null;
        }
        try {
            return (ja4) ObjectWrapper.Z1(a.zzm(new ObjectWrapper(context), new ObjectWrapper(ba4Var), str, new ObjectWrapper(t94Var)));
        } catch (RemoteException | IllegalArgumentException e) {
            zzo.zzg("Unable to register custom tabs session. Error: ", e);
            return null;
        }
    }

    @KeepForSdk
    public static void registerRtbAdapter(@NonNull Class<? extends RtbAdapter> cls) {
        zzeu.zzb().zzk(cls);
    }

    public static void registerWebView(@NonNull WebView webView) {
        zzeu.zzb();
        Preconditions.e("#008 Must be called on the main UI thread.");
        if (webView == null) {
            zzo.zzf("The webview to be registered cannot be null.");
            return;
        }
        zzcfe a = zzcak.a(webView.getContext());
        if (a == null) {
            zzo.zzf("Internal error, query info generator is null.");
            return;
        }
        try {
            a.zzj(new ObjectWrapper(webView));
        } catch (RemoteException e) {
            zzo.zzg("", e);
        }
    }

    public static void setAppMuted(boolean z) {
        zzeu.zzb().zzh(z);
    }

    public static void setAppVolume(float f) {
        zzeu.zzb().zzf(f);
    }

    @KeepForSdk
    private static void setPlugin(String str) {
        zzeu.zzb().zzs(str);
    }

    public static void setRequestConfiguration(@NonNull RequestConfiguration requestConfiguration) {
        zzeu.zzb().zzq(requestConfiguration);
    }

    @Deprecated
    public static void startPreload(@NonNull Context context, @NonNull List<PreloadConfiguration> list, @NonNull PreloadCallback preloadCallback) {
        zzeu.zzb().zze(context, list, preloadCallback);
    }

    @KeepForSdk
    private static void stop() {
        zzeu.zzb().zzd();
    }

    public static void initialize(@NonNull Context context, @NonNull OnInitializationCompleteListener onInitializationCompleteListener) {
        zzeu.zzb().zzc(context, null, onInitializationCompleteListener);
    }
}
