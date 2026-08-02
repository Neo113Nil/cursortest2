package com.unity3d.services.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.ads.InitializationConfiguration;
import com.unity3d.ads.TokenConfiguration;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsError;
import com.unity3d.ads.UnityAdsErrorKt;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.domain.InternalLoadListener;
import com.unity3d.services.UnityAdsSDK;
import com.unity3d.services.UnityServices;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.properties.ClientProperties;
import gatewayprotocol.v1.ErrorOuterClass;
import xsna.a72;
import xsna.df6;
import xsna.hv2;

/* loaded from: classes14.dex */
public final class UnityAdsImplementation implements IUnityAds {
    private static IUnityAds instance;

    /* renamed from: com.unity3d.services.ads.UnityAdsImplementation$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$gatewayprotocol$v1$ErrorOuterClass$PublicErrorCode;

        static {
            int[] iArr = new int[ErrorOuterClass.PublicErrorCode.values().length];
            $SwitchMap$gatewayprotocol$v1$ErrorOuterClass$PublicErrorCode = iArr;
            try {
                iArr[ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_LOAD_NO_FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$gatewayprotocol$v1$ErrorOuterClass$PublicErrorCode[ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_TIMEOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$gatewayprotocol$v1$ErrorOuterClass$PublicErrorCode[ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_LOAD_NOT_INITIALIZED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static IUnityAds getInstance() {
        if (instance == null) {
            instance = new UnityAdsImplementation();
        }
        return instance;
    }

    private void handleShowError(IUnityAdsShowListener iUnityAdsShowListener, String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
        if (iUnityAdsShowListener == null) {
            return;
        }
        iUnityAdsShowListener.onUnityAdsShowFailure(str, unityAdsShowError, str2);
    }

    private boolean hasInvalidContext(Context context) {
        if (ClientProperties.getApplicationContext() != null) {
            return false;
        }
        if (context == null) {
            return true;
        }
        if (context instanceof Application) {
            ClientProperties.setApplicationContext(context);
            ClientProperties.setApplication((Application) context);
            return false;
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.getApplication() != null && activity.getApplicationContext() != null) {
                ClientProperties.setApplicationContext(context.getApplicationContext());
                ClientProperties.setApplication(activity.getApplication());
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initialize$0(IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        iUnityAdsInitializationListener.onInitializationFailed(UnityAds.UnityAdsInitializationError.INVALID_ARGUMENT, "Unity Ads SDK failed to initialize due to invalid context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$load$1(IUnityAdsLoadListener iUnityAdsLoadListener, String str) {
        iUnityAdsLoadListener.onUnityAdsFailedToLoad(str, UnityAds.UnityAdsLoadError.INVALID_ARGUMENT, "Unity Ads SDK failed to load due to invalid context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$load$2(InternalLoadListener internalLoadListener) {
        internalLoadListener.onAdLoadFail(new UnityAdsError(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_LOAD_NOT_INITIALIZED.getNumber(), UnityAdsErrorKt.MSG_BOLD_LOAD_FAIL_SDK_NOT_INITIALIZED));
    }

    @Override // com.unity3d.services.ads.IUnityAds
    @Deprecated
    public boolean getDebugMode() {
        return UnityServices.getDebugMode();
    }

    @Override // com.unity3d.services.ads.IUnityAds
    @Nullable
    public String getToken() {
        if (!hasInvalidContext()) {
            return new UnityAdsSDK().getToken();
        }
        DeviceLog.error("No valid Context for getting token");
        return null;
    }

    @Override // com.unity3d.services.ads.IUnityAds
    public String getVersion() {
        return UnityServices.getVersion();
    }

    @Override // com.unity3d.services.ads.IUnityAds
    public void initialize(Context context, String str, boolean z, IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        DeviceLog.entered();
        if (!hasInvalidContext(context)) {
            UnityServices.initialize(context, str, z, (InitializationConfiguration) null, iUnityAdsInitializationListener);
            return;
        }
        DeviceLog.error("Error while initializing Unity Services: null context, halting Unity Ads init");
        if (iUnityAdsInitializationListener != null) {
            Utilities.wrapCustomerListener(new hv2(iUnityAdsInitializationListener, 17));
        }
    }

    @Override // com.unity3d.services.ads.IUnityAds
    public boolean isInitialized() {
        return UnityServices.isInitialized();
    }

    @Override // com.unity3d.services.ads.IUnityAds
    @Deprecated
    public boolean isSupported() {
        return UnityServices.isSupported();
    }

    @Override // com.unity3d.services.ads.IUnityAds
    public void load(@Nullable final String str, @NonNull UnityAdsLoadOptions unityAdsLoadOptions, @Nullable final IUnityAdsLoadListener iUnityAdsLoadListener) {
        if (!hasInvalidContext()) {
            new UnityAdsSDK().load(str, unityAdsLoadOptions, iUnityAdsLoadListener != null ? new InternalLoadListener() { // from class: com.unity3d.services.ads.UnityAdsImplementation.2
                @Override // com.unity3d.ads.core.domain.InternalLoadListener
                public void onAdLoadFail(@NonNull UnityAdsError unityAdsError) {
                    ErrorOuterClass.PublicErrorCode forNumber = ErrorOuterClass.PublicErrorCode.forNumber(unityAdsError.getCode());
                    UnityAds.UnityAdsLoadError unityAdsLoadError = UnityAds.UnityAdsLoadError.INTERNAL_ERROR;
                    if (forNumber != null) {
                        int i = AnonymousClass3.$SwitchMap$gatewayprotocol$v1$ErrorOuterClass$PublicErrorCode[forNumber.ordinal()];
                        if (i == 1) {
                            unityAdsLoadError = UnityAds.UnityAdsLoadError.NO_FILL;
                        } else if (i == 2) {
                            unityAdsLoadError = UnityAds.UnityAdsLoadError.TIMEOUT;
                        } else if (i == 3) {
                            unityAdsLoadError = UnityAds.UnityAdsLoadError.INITIALIZE_FAILED;
                        }
                    }
                    iUnityAdsLoadListener.onUnityAdsFailedToLoad(str, unityAdsLoadError, unityAdsError.getMessage());
                }

                @Override // com.unity3d.ads.core.domain.InternalLoadListener
                public void onAdLoaded(@NonNull AdObject adObject) {
                    iUnityAdsLoadListener.onUnityAdsAdLoaded(str);
                }
            } : null, null);
            return;
        }
        DeviceLog.error("No valid Context for loading ads");
        if (iUnityAdsLoadListener != null) {
            Utilities.wrapCustomerListener(new df6(7, iUnityAdsLoadListener, str));
        }
    }

    @Override // com.unity3d.services.ads.IUnityAds
    @Deprecated
    public void setDebugMode(boolean z) {
        UnityServices.setDebugMode(z);
    }

    public void show(Activity activity, String str) {
        show(activity, str, new UnityAdsShowOptions(), null);
    }

    public void show(Activity activity, String str, IUnityAdsShowListener iUnityAdsShowListener) {
        show(activity, str, new UnityAdsShowOptions(), iUnityAdsShowListener);
    }

    @Override // com.unity3d.services.ads.IUnityAds
    public void show(@Nullable Activity activity, @Nullable String str, @Nullable UnityAdsShowOptions unityAdsShowOptions, @Nullable final IUnityAdsShowListener iUnityAdsShowListener) {
        if (activity != null && !hasInvalidContext(activity)) {
            ClientProperties.setActivity(activity);
            new UnityAdsSDK().show(str, unityAdsShowOptions, new Listeners() { // from class: com.unity3d.services.ads.UnityAdsImplementation.1
                @Override // com.unity3d.ads.core.data.model.Listeners
                public void onClick(String str2) {
                    IUnityAdsShowListener iUnityAdsShowListener2 = iUnityAdsShowListener;
                    if (iUnityAdsShowListener2 != null) {
                        iUnityAdsShowListener2.onUnityAdsShowClick(str2);
                    }
                }

                @Override // com.unity3d.ads.core.data.model.Listeners
                public void onComplete(String str2, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
                    IUnityAdsShowListener iUnityAdsShowListener2 = iUnityAdsShowListener;
                    if (iUnityAdsShowListener2 != null) {
                        iUnityAdsShowListener2.onUnityAdsShowComplete(str2, unityAdsShowCompletionState);
                    }
                }

                @Override // com.unity3d.ads.core.data.model.Listeners
                public void onError(String str2, UnityAds.UnityAdsShowError unityAdsShowError, String str3) {
                    IUnityAdsShowListener iUnityAdsShowListener2 = iUnityAdsShowListener;
                    if (iUnityAdsShowListener2 != null) {
                        iUnityAdsShowListener2.onUnityAdsShowFailure(str2, unityAdsShowError, str3);
                    }
                }

                @Override // com.unity3d.ads.core.data.model.Listeners
                public void onStart(String str2) {
                    IUnityAdsShowListener iUnityAdsShowListener2 = iUnityAdsShowListener;
                    if (iUnityAdsShowListener2 != null) {
                        iUnityAdsShowListener2.onUnityAdsShowStart(str2);
                    }
                }

                @Override // com.unity3d.ads.core.data.model.Listeners
                public void onLeftApplication(String str2) {
                }

                @Override // com.unity3d.ads.core.data.model.Listeners
                public void onRewarded(String str2) {
                }
            });
        } else {
            handleShowError(iUnityAdsShowListener, str, UnityAds.UnityAdsShowError.INVALID_ARGUMENT, "Activity must not be null");
        }
    }

    @Override // com.unity3d.services.ads.IUnityAds
    public void getToken(@Nullable TokenConfiguration tokenConfiguration, @Nullable IUnityAdsTokenListener iUnityAdsTokenListener) {
        if (hasInvalidContext()) {
            DeviceLog.error("No valid Context for getting token");
            if (iUnityAdsTokenListener != null) {
                iUnityAdsTokenListener.onUnityAdsTokenReady(null);
                return;
            }
            return;
        }
        new UnityAdsSDK().getToken(tokenConfiguration, iUnityAdsTokenListener);
    }

    @Override // com.unity3d.services.ads.IUnityAds
    public void load(@Nullable String str, @NonNull UnityAdsLoadOptions unityAdsLoadOptions, @NonNull InternalLoadListener internalLoadListener) {
        if (hasInvalidContext()) {
            DeviceLog.error("No valid Context for loading ads");
            Utilities.wrapCustomerListener(new a72(internalLoadListener, 21));
        } else {
            new UnityAdsSDK().load(str, unityAdsLoadOptions, internalLoadListener, null);
        }
    }

    @Override // com.unity3d.services.ads.IUnityAds
    public void getToken(@Nullable IUnityAdsTokenListener iUnityAdsTokenListener) {
        getToken(null, iUnityAdsTokenListener);
    }

    private boolean hasInvalidContext() {
        return hasInvalidContext(null);
    }
}
