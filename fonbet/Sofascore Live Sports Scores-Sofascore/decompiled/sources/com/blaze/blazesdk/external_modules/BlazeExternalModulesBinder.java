package com.blaze.blazesdk.external_modules;

import androidx.annotation.Keep;
import com.blaze.blazesdk.external_modules.flutter.BlazeFlutterSDKHelperInterface;
import com.blaze.blazesdk.external_modules.react_native.BlazeReactSDKHelperInterface;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/blaze/blazesdk/external_modules/BlazeExternalModulesBinder;", "", "<init>", "()V", "reactNativeSDKHelper", "Lcom/blaze/blazesdk/external_modules/react_native/BlazeReactSDKHelperInterface;", "getReactNativeSDKHelper", "()Lcom/blaze/blazesdk/external_modules/react_native/BlazeReactSDKHelperInterface;", "setReactNativeSDKHelper", "(Lcom/blaze/blazesdk/external_modules/react_native/BlazeReactSDKHelperInterface;)V", "flutterSDKHelper", "Lcom/blaze/blazesdk/external_modules/flutter/BlazeFlutterSDKHelperInterface;", "getFlutterSDKHelper", "()Lcom/blaze/blazesdk/external_modules/flutter/BlazeFlutterSDKHelperInterface;", "setFlutterSDKHelper", "(Lcom/blaze/blazesdk/external_modules/flutter/BlazeFlutterSDKHelperInterface;)V", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BlazeExternalModulesBinder {

    @Keep
    @Nullable
    private static BlazeFlutterSDKHelperInterface flutterSDKHelper;

    @Keep
    @Nullable
    private static BlazeReactSDKHelperInterface reactNativeSDKHelper;

    @NotNull
    public static final BlazeExternalModulesBinder INSTANCE = new BlazeExternalModulesBinder();
    public static final int $stable = 8;

    private BlazeExternalModulesBinder() {
    }

    @Nullable
    public final BlazeFlutterSDKHelperInterface getFlutterSDKHelper() {
        return flutterSDKHelper;
    }

    @Nullable
    public final BlazeReactSDKHelperInterface getReactNativeSDKHelper() {
        return reactNativeSDKHelper;
    }

    public final void setFlutterSDKHelper(@Nullable BlazeFlutterSDKHelperInterface blazeFlutterSDKHelperInterface) {
        flutterSDKHelper = blazeFlutterSDKHelperInterface;
    }

    public final void setReactNativeSDKHelper(@Nullable BlazeReactSDKHelperInterface blazeReactSDKHelperInterface) {
        reactNativeSDKHelper = blazeReactSDKHelperInterface;
    }
}
