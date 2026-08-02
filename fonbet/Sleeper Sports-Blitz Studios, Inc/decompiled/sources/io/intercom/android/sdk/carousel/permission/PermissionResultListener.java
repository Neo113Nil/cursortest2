package io.intercom.android.sdk.carousel.permission;

/* loaded from: classes9.dex */
public interface PermissionResultListener {
    void requestBackgroundLocationPermission();

    void showDeniedPermanently();

    void showDeniedTemporarily();

    void showGranted();
}
