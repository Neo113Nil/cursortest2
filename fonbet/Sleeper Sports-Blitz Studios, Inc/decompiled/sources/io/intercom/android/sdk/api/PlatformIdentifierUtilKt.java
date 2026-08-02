package io.intercom.android.sdk.api;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlatformIdentifierUtil.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002\u001a\b\u0010\r\u001a\u00020\u000eH\u0002\u001a\b\u0010\u000f\u001a\u00020\u000eH\u0002\u001a\u0010\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\fH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"WRAPPER_PREFS", "", "CORDOVA_VERSION", "REACT_NATIVE_VERSION", "ANDROID_HEADER", "CORDOVA_HEADER", "REACT_NATIVE_HEADER", "FLUTTER_HEADER", "NATIVE_SDK", "getPlatform", "Lio/intercom/android/sdk/api/Platform;", "context", "Landroid/content/Context;", "isFlutterApp", "", "isReactNativeApp", "getPlatformIdentifier", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class PlatformIdentifierUtilKt {
    public static final String ANDROID_HEADER = "intercom-android-sdk";
    public static final String CORDOVA_HEADER = "intercom-sdk-cordova";
    public static final String CORDOVA_VERSION = "cordova_version";
    public static final String FLUTTER_HEADER = "intercom-sdk-flutter";
    public static final String NATIVE_SDK = "intercom-sdk-native";
    public static final String REACT_NATIVE_HEADER = "intercom-sdk-react-native";
    public static final String REACT_NATIVE_VERSION = "react_native_version";
    public static final String WRAPPER_PREFS = "intercomsdk_wrapper_prefs";

    private static final Platform getPlatform(Context context) {
        return !Intrinsics.areEqual(context.getSharedPreferences(WRAPPER_PREFS, 0).getString(CORDOVA_VERSION, ""), "") ? Platform.Cordova : !Intrinsics.areEqual(isReactNativeApp() ? REACT_NATIVE_HEADER : "", "") ? Platform.ReactNative : !Intrinsics.areEqual(isFlutterApp() ? FLUTTER_HEADER : "", "") ? Platform.Flutter : Platform.Native;
    }

    private static final boolean isFlutterApp() {
        try {
            Class.forName("io.maido.intercom.IntercomFlutterPlugin");
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private static final boolean isReactNativeApp() {
        try {
            Class.forName("com.intercom.reactnative.IntercomModule");
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static final String getPlatformIdentifier(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getPlatform(context).getIdentifier();
    }
}
