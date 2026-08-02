package io.sentry.react;

import androidx.annotation.NonNull;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;

/* loaded from: classes3.dex */
public class RNSentryModule extends NativeRNSentrySpec {
    private final t impl;

    public RNSentryModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.impl = new t(reactApplicationContext);
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void addBreadcrumb(ReadableMap readableMap) {
        this.impl.p(readableMap);
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void addListener(String str) {
        this.impl.q(str);
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void captureEnvelope(String str, ReadableMap readableMap, Promise promise) {
        this.impl.r(str, readableMap, promise);
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void captureReplay(boolean z10, Promise promise) {
        this.impl.s(z10, promise);
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void captureScreenshot(Promise promise) {
        this.impl.t(promise);
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void clearBreadcrumbs() {
        this.impl.v();
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void closeNativeSdk(Promise promise) {
        this.impl.w(promise);
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void crash() {
        this.impl.x();
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void crashedLastRun(Promise promise) {
        this.impl.y(promise);
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void disableNativeFramesTracking() {
        this.impl.A();
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void disableShakeDetection() {
        this.impl.B();
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void enableNativeFramesTracking() {
        this.impl.C();
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void enableShakeDetection() {
        this.impl.D();
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void encodeToBase64(ReadableArray readableArray, Promise promise) {
        this.impl.E(readableArray, promise);
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void fetchModules(Promise promise) {
        this.impl.F(promise);
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void fetchNativeAppStart(Promise promise) {
        this.impl.G(promise);
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void fetchNativeDeviceContexts(Promise promise) {
        this.impl.I(promise);
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void fetchNativeFrames(Promise promise) {
        this.impl.K(promise);
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void fetchNativeFramesDelay(double d10, double d11, Promise promise) {
        this.impl.L(d10, d11, promise);
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void fetchNativeLogAttributes(Promise promise) {
        this.impl.M(promise);
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public String fetchNativePackageName() {
        return this.impl.O();
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void fetchNativeRelease(Promise promise) {
        this.impl.P(promise);
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void fetchNativeSdkInfo(Promise promise) {
        this.impl.Q(promise);
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public WritableMap fetchNativeStackFramesBy(ReadableArray readableArray) {
        return null;
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void fetchViewHierarchy(Promise promise) {
        this.impl.R(promise);
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public String getCurrentReplayId() {
        return this.impl.U();
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void getDataFromUri(String str, Promise promise) {
        this.impl.V(str, promise);
    }

    @Override // io.sentry.react.NativeRNSentrySpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return NativeRNSentrySpec.NAME;
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void getNewScreenTimeToDisplay(Promise promise) {
        this.impl.W(promise);
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void initNativeReactNavigationNewFrameTracking(Promise promise) {
        this.impl.c0(promise);
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void initNativeSdk(ReadableMap readableMap, Promise promise) {
        this.impl.d0(readableMap, promise);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        this.impl.f0();
        super.invalidate();
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void pauseAppHangTracking() {
        this.impl.n0();
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void popTimeToDisplayFor(String str, Promise promise) {
        this.impl.o0(str, promise);
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void removeAttribute(String str) {
        this.impl.q0(str);
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void removeListeners(double d10) {
        this.impl.r0(d10);
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void resumeAppHangTracking() {
        this.impl.s0();
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public boolean setActiveSpanId(String str) {
        return this.impl.t0(str);
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void setAttribute(String str, String str2) {
        this.impl.u0(str, str2);
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void setAttributes(ReadableMap readableMap) {
        this.impl.v0(readableMap);
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void setContext(String str, ReadableMap readableMap) {
        this.impl.w0(str, readableMap);
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void setExtra(String str, String str2) {
        this.impl.x0(str, str2);
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void setTag(String str, String str2) {
        this.impl.y0(str, str2);
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void setUser(ReadableMap readableMap, ReadableMap readableMap2) {
        this.impl.z0(readableMap, readableMap2);
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public WritableMap startProfiling(boolean z10) {
        return this.impl.A0(z10);
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public WritableMap stopProfiling() {
        return this.impl.D0();
    }
}
