package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.braze.ui.actions.brazeactions.steps.StepData;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import io.sentry.protocol.Browser;
import java.io.ByteArrayOutputStream;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes6.dex */
final class zzcd implements zzd {
    private final Application zza;
    private final zzbz zzb;
    private final Handler zzc;
    private final Executor zzd;
    private final zze zze;
    private final zzao zzf;
    private final zzbe zzg;
    private final zzaq zzh;

    zzcd(Application application, zzbz zzbzVar, Handler handler, Executor executor, zze zzeVar, zzao zzaoVar, zzbe zzbeVar, zzaq zzaqVar) {
        this.zza = application;
        this.zzb = zzbzVar;
        this.zzc = handler;
        this.zzd = executor;
        this.zze = zzeVar;
        this.zzf = zzaoVar;
        this.zzg = zzbeVar;
        this.zzh = zzaqVar;
    }

    public static void safedk_zzbz_startActivity_7e6f4088e0092d1e5abae281df5386ee(zzbz p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Lcom/google/android/gms/internal/consent_sdk/zzbz;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, h.h);
        p0.startActivity(p1);
    }

    public static /* synthetic */ void zzc(zzcd zzcdVar) {
        JSONObject jSONObject = new JSONObject();
        Application application = zzcdVar.zza;
        try {
            jSONObject.put("app_name", application.getPackageManager().getApplicationLabel(application.getApplicationInfo()).toString());
            Drawable applicationIcon = application.getPackageManager().getApplicationIcon(application.getApplicationInfo());
            String str = null;
            if (applicationIcon != null && applicationIcon.getIntrinsicWidth() > 0 && applicationIcon.getIntrinsicHeight() > 0) {
                Bitmap createBitmap = Bitmap.createBitmap(applicationIcon.getIntrinsicWidth(), applicationIcon.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                applicationIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                applicationIcon.draw(canvas);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                str = "data:image/png;base64,".concat(String.valueOf(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2)));
            }
            jSONObject.put("app_icon", str);
            JSONObject jSONObject2 = new JSONObject();
            zzaq zzaqVar = zzcdVar.zzh;
            for (String str2 : zzaqVar.zzc().keySet()) {
                jSONObject2.put(str2, zzaqVar.zzc().get(str2));
            }
            jSONObject.put("stored_infos_map", jSONObject2);
        } catch (JSONException unused) {
        }
        zzcdVar.zzg.zzc().zzd("UMP_configureFormWithAppAssets", jSONObject.toString());
    }

    private final void zzg(JSONObject jSONObject) {
        String optString = jSONObject.optString("url");
        if (TextUtils.isEmpty(optString)) {
            Log.d("UserMessagingPlatform", "Action[browser]: empty url.");
        }
        Uri parse = Uri.parse(optString);
        if (parse.getScheme() == null) {
            Log.d("UserMessagingPlatform", "Action[browser]: empty scheme: ".concat(String.valueOf(optString)));
        }
        try {
            safedk_zzbz_startActivity_7e6f4088e0092d1e5abae281df5386ee(this.zzb, new Intent("android.intent.action.VIEW", parse));
        } catch (ActivityNotFoundException e) {
            Log.d("UserMessagingPlatform", "Action[browser]: can not open url: ".concat(String.valueOf(optString)), e);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzd
    public final Executor zza() {
        final Handler handler = this.zzc;
        Objects.requireNonNull(handler);
        return new Executor() { // from class: com.google.android.gms.internal.consent_sdk.zzcb
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.consent_sdk.zzd
    public final boolean zzb(String str, JSONObject jSONObject) {
        char c;
        char c2 = 65535;
        int i = 3;
        switch (str.hashCode()) {
            case -1370505102:
                if (str.equals("load_complete")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -278739366:
                if (str.equals("configure_app_assets")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 150940456:
                if (str.equals(Browser.TYPE)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1671672458:
                if (str.equals("dismiss")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            this.zzg.zzi();
            return true;
        }
        if (c != 1) {
            if (c == 2) {
                zzg(jSONObject);
                return true;
            }
            if (c != 3) {
                return false;
            }
            zzd();
            return true;
        }
        String optString = jSONObject.optString("status");
        switch (optString.hashCode()) {
            case -954325659:
                if (optString.equals("CONSENT_SIGNAL_NON_PERSONALIZED_ADS")) {
                    c2 = 3;
                    break;
                }
                break;
            case -258041904:
                if (optString.equals("personalized")) {
                    c2 = 0;
                    break;
                }
                break;
            case 429411856:
                if (optString.equals("CONSENT_SIGNAL_SUFFICIENT")) {
                    c2 = 4;
                    break;
                }
                break;
            case 467888915:
                if (optString.equals("CONSENT_SIGNAL_PERSONALIZED_ADS")) {
                    c2 = 1;
                    break;
                }
                break;
            case 1666911234:
                if (optString.equals("non_personalized")) {
                    c2 = 2;
                    break;
                }
                break;
            case 1725474845:
                if (optString.equals("CONSENT_SIGNAL_NOT_REQUIRED")) {
                    c2 = 5;
                    break;
                }
                break;
        }
        if (c2 != 0 && c2 != 1 && c2 != 2 && c2 != 3 && c2 != 4) {
            if (c2 != 5) {
                this.zzg.zzh(new zzg(1, "We are getting something wrong with the webview."));
                return true;
            }
            i = 1;
        }
        this.zzg.zzg(i);
        return true;
    }

    public final void zzd() {
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzcc
            @Override // java.lang.Runnable
            public final void run() {
                zzcd.zzc(zzcd.this);
            }
        });
    }

    final void zze(String str) {
        Log.d("UserMessagingPlatform", "Receive consent action: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        this.zze.zzb(parse.getQueryParameter("action"), parse.getQueryParameter(StepData.ARGS), this, this.zzf);
    }

    final void zzf(int i, String str, String str2) {
        this.zzg.zzj(new zzg(2, String.format(Locale.US, "WebResourceError(%d, %s): %s", Integer.valueOf(i), str2, str)));
    }
}
