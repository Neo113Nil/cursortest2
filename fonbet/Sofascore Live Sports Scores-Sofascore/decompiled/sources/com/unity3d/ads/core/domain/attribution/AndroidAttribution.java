package com.unity3d.ads.core.domain.attribution;

import android.adservices.AdServicesState;
import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.os.OutcomeReceiver;
import android.os.ext.SdkExtensions;
import android.view.InputEvent;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.WebViewContainer;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.domain.ISDKDispatchers;
import defpackage.ddi;
import defpackage.fz8;
import defpackage.j4;
import defpackage.joa;
import defpackage.lu3;
import defpackage.oog;
import defpackage.p2g;
import defpackage.rq3;
import defpackage.sw9;
import defpackage.w2g;
import defpackage.ypa;
import defpackage.z9a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u001a\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u001d\u0010 \u001a\u0004\u0018\u00010\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u000b\u0010\u001f¨\u0006!"}, d2 = {"Lcom/unity3d/ads/core/domain/attribution/AndroidAttribution;", "", "Landroid/content/Context;", "context", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "dispatchers", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "<init>", "(Landroid/content/Context;Lcom/unity3d/services/core/domain/ISDKDispatchers;Lcom/unity3d/ads/core/data/repository/SessionRepository;)V", "Landroid/adservices/measurement/MeasurementManager;", "getMeasurementManager", "(Landroid/content/Context;)Landroid/adservices/measurement/MeasurementManager;", "", "baseUrl", "Lcom/unity3d/ads/core/data/model/AdObject;", "adObject", "Landroid/net/Uri;", "getUri", "(Ljava/lang/String;Lcom/unity3d/ads/core/data/model/AdObject;)Landroid/net/Uri;", "", "isAvailable", "(Lrq3;)Ljava/lang/Object;", "url", "registerView", "(Ljava/lang/String;Lcom/unity3d/ads/core/data/model/AdObject;Lrq3;)Ljava/lang/Object;", "registerClick", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "measurementManager$delegate", "Ljoa;", "()Landroid/adservices/measurement/MeasurementManager;", "measurementManager", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidAttribution {

    @NotNull
    private final ISDKDispatchers dispatchers;

    /* renamed from: measurementManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final joa measurementManager;

    @NotNull
    private final SessionRepository sessionRepository;

    public AndroidAttribution(@NotNull Context context, @NotNull ISDKDispatchers iSDKDispatchers, @NotNull SessionRepository sessionRepository) {
        context.getClass();
        iSDKDispatchers.getClass();
        sessionRepository.getClass();
        this.dispatchers = iSDKDispatchers;
        this.sessionRepository = sessionRepository;
        this.measurementManager = ypa.b(new j4(5, this, context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MeasurementManager getMeasurementManager(Context context) {
        if (Device.getApiLevel() >= 33 && SdkExtensions.getExtensionVersion(1000000) >= 4) {
            return sw9.c(context.getSystemService(sw9.g()));
        }
        return null;
    }

    private final Uri getUri(String baseUrl, AdObject adObject) {
        Uri parse = Uri.parse(baseUrl);
        parse.getClass();
        Uri build = parse.buildUpon().appendQueryParameter("sessionToken", ProtobufExtensionsKt.toBase64$default(this.sessionRepository.getSessionToken(), false, 1, null)).appendQueryParameter(HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN, ProtobufExtensionsKt.toBase64$default(adObject.getTrackingToken(), false, 1, null)).build();
        build.getClass();
        return build;
    }

    @Nullable
    public final Object isAvailable(@NotNull rq3<? super Boolean> rq3Var) {
        if (Device.getApiLevel() < 33) {
            return Boolean.FALSE;
        }
        if (SdkExtensions.getExtensionVersion(1000000) < 4) {
            return Boolean.FALSE;
        }
        if (getMeasurementManager() == null) {
            return Boolean.FALSE;
        }
        if (!AdServicesState.isAdServicesStateEnabled()) {
            return Boolean.FALSE;
        }
        final oog oogVar = new oog(z9a.b(rq3Var));
        MeasurementManager measurementManager = getMeasurementManager();
        if (measurementManager != null) {
            measurementManager.getMeasurementApiStatus(fz8.B(this.dispatchers.getDefault()), new OutcomeReceiver() { // from class: com.unity3d.ads.core.domain.attribution.AndroidAttribution$isAvailable$2$1
                public void onError(Exception error) {
                    error.getClass();
                    rq3<Boolean> rq3Var2 = oogVar;
                    p2g p2gVar = w2g.b;
                    rq3Var2.resumeWith(Boolean.FALSE);
                }

                public void onResult(int status) {
                    rq3<Boolean> rq3Var2 = oogVar;
                    p2g p2gVar = w2g.b;
                    rq3Var2.resumeWith(Boolean.valueOf(status == 1));
                }

                public /* bridge */ /* synthetic */ void onResult(Object obj) {
                    onResult(((Number) obj).intValue());
                }
            });
        } else {
            p2g p2gVar = w2g.b;
            oogVar.resumeWith(Boolean.FALSE);
        }
        Object b = oogVar.b();
        lu3 lu3Var = lu3.a;
        return b;
    }

    @Nullable
    public final Object registerClick(@NotNull String str, @NotNull AdObject adObject, @NotNull rq3<? super Boolean> rq3Var) {
        WebViewContainer webViewContainer;
        ddi lastInputEvent;
        InputEvent inputEvent;
        if (getMeasurementManager() == null) {
            return Boolean.FALSE;
        }
        AdPlayer adPlayer = adObject.getAdPlayer();
        if (adPlayer == null || (webViewContainer = adPlayer.getWebViewContainer()) == null || (lastInputEvent = webViewContainer.getLastInputEvent()) == null || (inputEvent = (InputEvent) lastInputEvent.getValue()) == null) {
            return Boolean.FALSE;
        }
        final oog oogVar = new oog(z9a.b(rq3Var));
        MeasurementManager measurementManager = getMeasurementManager();
        if (measurementManager != null) {
            measurementManager.registerSource(getUri(str, adObject), inputEvent, fz8.B(this.dispatchers.getDefault()), new OutcomeReceiver() { // from class: com.unity3d.ads.core.domain.attribution.AndroidAttribution$registerClick$2$1
                public void onError(Exception error) {
                    error.getClass();
                    rq3<Boolean> rq3Var2 = oogVar;
                    p2g p2gVar = w2g.b;
                    rq3Var2.resumeWith(Boolean.FALSE);
                }

                public void onResult(Object p0) {
                    p0.getClass();
                    rq3<Boolean> rq3Var2 = oogVar;
                    p2g p2gVar = w2g.b;
                    rq3Var2.resumeWith(Boolean.TRUE);
                }
            });
        } else {
            p2g p2gVar = w2g.b;
            oogVar.resumeWith(Boolean.FALSE);
        }
        Object b = oogVar.b();
        lu3 lu3Var = lu3.a;
        return b;
    }

    @Nullable
    public final Object registerView(@NotNull String str, @NotNull AdObject adObject, @NotNull rq3<? super Boolean> rq3Var) {
        if (getMeasurementManager() == null) {
            return Boolean.FALSE;
        }
        final oog oogVar = new oog(z9a.b(rq3Var));
        MeasurementManager measurementManager = getMeasurementManager();
        if (measurementManager != null) {
            measurementManager.registerSource(getUri(str, adObject), null, fz8.B(this.dispatchers.getDefault()), new OutcomeReceiver() { // from class: com.unity3d.ads.core.domain.attribution.AndroidAttribution$registerView$2$1
                public void onError(Exception error) {
                    error.getClass();
                    rq3<Boolean> rq3Var2 = oogVar;
                    p2g p2gVar = w2g.b;
                    rq3Var2.resumeWith(Boolean.FALSE);
                }

                public void onResult(Object p0) {
                    p0.getClass();
                    rq3<Boolean> rq3Var2 = oogVar;
                    p2g p2gVar = w2g.b;
                    rq3Var2.resumeWith(Boolean.TRUE);
                }
            });
        } else {
            p2g p2gVar = w2g.b;
            oogVar.resumeWith(Boolean.FALSE);
        }
        Object b = oogVar.b();
        lu3 lu3Var = lu3.a;
        return b;
    }

    private final MeasurementManager getMeasurementManager() {
        return sw9.c(this.measurementManager.getValue());
    }
}
