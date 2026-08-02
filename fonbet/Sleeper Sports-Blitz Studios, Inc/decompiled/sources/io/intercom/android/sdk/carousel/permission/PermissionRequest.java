package io.intercom.android.sdk.carousel.permission;

import io.intercom.android.sdk.models.carousel.ScreenAction;

/* loaded from: classes9.dex */
public interface PermissionRequest {
    void attach(PermissionResultListener permissionResultListener);

    void detach();

    void handleResult(String[] strArr, int[] iArr);

    void request(ScreenAction screenAction, int i);
}
