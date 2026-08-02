package com.unity3d.ads.core.domain.attribution;

import android.adservices.AdServicesState;
import android.adservices.measurement.MeasurementManager;
import android.annotation.SuppressLint;
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
import com.vk.movika.sdk.base.flow.binding.g;
import kotlin.Lazy;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.a91;
import xsna.bpn0;
import xsna.gzg0;
import xsna.qu5;
import xsna.s7s0;
import xsna.spj;
import xsna.ttk0;
import xsna.z81;

/* compiled from: AndroidAttribution.kt */
@SuppressLint({"NewApi", "MissingPermission"})
/* loaded from: classes14.dex */
public final class AndroidAttribution {
    private final ISDKDispatchers dispatchers;
    private final Lazy measurementManager$delegate;
    private final SessionRepository sessionRepository;

    public AndroidAttribution(Context context, ISDKDispatchers iSDKDispatchers, SessionRepository sessionRepository) {
        this.dispatchers = iSDKDispatchers;
        this.sessionRepository = sessionRepository;
        this.measurementManager$delegate = new bpn0(new g(2, this, context));
    }

    private final MeasurementManager getMeasurementManager() {
        return a91.a(this.measurementManager$delegate.getValue());
    }

    private final Uri getUri(String str, AdObject adObject) {
        return Uri.parse(str).buildUpon().appendQueryParameter("sessionToken", ProtobufExtensionsKt.toBase64$default(this.sessionRepository.getSessionToken(), false, 1, null)).appendQueryParameter(HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN, ProtobufExtensionsKt.toBase64$default(adObject.getTrackingToken(), false, 1, null)).build();
    }

    public final Object isAvailable(spj<? super Boolean> spjVar) {
        int extensionVersion;
        boolean isAdServicesStateEnabled;
        if (Device.getApiLevel() < 33) {
            return Boolean.FALSE;
        }
        extensionVersion = SdkExtensions.getExtensionVersion(1000000);
        if (extensionVersion < 4) {
            return Boolean.FALSE;
        }
        if (getMeasurementManager() == null) {
            return Boolean.FALSE;
        }
        isAdServicesStateEnabled = AdServicesState.isAdServicesStateEnabled();
        if (!isAdServicesStateEnabled) {
            return Boolean.FALSE;
        }
        final gzg0 gzg0Var = new gzg0(s7s0.c(spjVar));
        MeasurementManager measurementManager = getMeasurementManager();
        if (measurementManager != null) {
            measurementManager.getMeasurementApiStatus(qu5.a(this.dispatchers.getDefault()), new OutcomeReceiver() { // from class: com.unity3d.ads.core.domain.attribution.AndroidAttribution$isAvailable$2$1
                public /* bridge */ /* synthetic */ void onResult(Object obj) {
                    onResult(((Number) obj).intValue());
                }

                public void onError(Exception exc) {
                    gzg0Var.resumeWith(Boolean.FALSE);
                }

                public void onResult(int i) {
                    gzg0Var.resumeWith(Boolean.valueOf(i == 1));
                }
            });
        } else {
            gzg0Var.resumeWith(Boolean.FALSE);
        }
        Object a = gzg0Var.a();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return a;
    }

    public final Object registerClick(String str, AdObject adObject, spj<? super Boolean> spjVar) {
        WebViewContainer webViewContainer;
        ttk0<InputEvent> lastInputEvent;
        InputEvent value;
        if (getMeasurementManager() == null) {
            return Boolean.FALSE;
        }
        AdPlayer adPlayer = adObject.getAdPlayer();
        if (adPlayer == null || (webViewContainer = adPlayer.getWebViewContainer()) == null || (lastInputEvent = webViewContainer.getLastInputEvent()) == null || (value = lastInputEvent.getValue()) == null) {
            return Boolean.FALSE;
        }
        final gzg0 gzg0Var = new gzg0(s7s0.c(spjVar));
        MeasurementManager measurementManager = getMeasurementManager();
        if (measurementManager != null) {
            measurementManager.registerSource(getUri(str, adObject), value, qu5.a(this.dispatchers.getDefault()), new OutcomeReceiver() { // from class: com.unity3d.ads.core.domain.attribution.AndroidAttribution$registerClick$2$1
                public void onResult(Object obj) {
                    gzg0Var.resumeWith(Boolean.TRUE);
                }

                public void onError(Exception exc) {
                    gzg0Var.resumeWith(Boolean.FALSE);
                }
            });
        } else {
            gzg0Var.resumeWith(Boolean.FALSE);
        }
        Object a = gzg0Var.a();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return a;
    }

    public final Object registerView(String str, AdObject adObject, spj<? super Boolean> spjVar) {
        if (getMeasurementManager() == null) {
            return Boolean.FALSE;
        }
        final gzg0 gzg0Var = new gzg0(s7s0.c(spjVar));
        MeasurementManager measurementManager = getMeasurementManager();
        if (measurementManager != null) {
            measurementManager.registerSource(getUri(str, adObject), null, qu5.a(this.dispatchers.getDefault()), new OutcomeReceiver() { // from class: com.unity3d.ads.core.domain.attribution.AndroidAttribution$registerView$2$1
                public void onResult(Object obj) {
                    gzg0Var.resumeWith(Boolean.TRUE);
                }

                public void onError(Exception exc) {
                    gzg0Var.resumeWith(Boolean.FALSE);
                }
            });
        } else {
            gzg0Var.resumeWith(Boolean.FALSE);
        }
        Object a = gzg0Var.a();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MeasurementManager getMeasurementManager(Context context) {
        int extensionVersion;
        if (Device.getApiLevel() < 33) {
            return null;
        }
        extensionVersion = SdkExtensions.getExtensionVersion(1000000);
        if (extensionVersion < 4) {
            return null;
        }
        return a91.a(context.getSystemService(z81.m()));
    }
}
