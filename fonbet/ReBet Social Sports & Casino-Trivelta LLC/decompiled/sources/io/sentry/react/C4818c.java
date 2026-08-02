package io.sentry.react;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import io.sentry.EnumC4788n3;
import io.sentry.ILogger;
import java.lang.ref.WeakReference;

/* renamed from: io.sentry.react.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4818c implements ILogger {

    /* renamed from: a, reason: collision with root package name */
    public final io.sentry.android.core.C f52578a = new io.sentry.android.core.C(NativeRNSentrySpec.NAME);

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f52579b;

    @Override // io.sentry.ILogger
    public void a(EnumC4788n3 enumC4788n3, Throwable th2, String str, Object... objArr) {
        this.f52578a.a(enumC4788n3, th2, str, objArr);
        if (objArr != null && objArr.length != 0) {
            str = String.format(str, objArr);
        }
        if (th2 != null) {
            str = str + ": " + th2.getMessage();
        }
        e(enumC4788n3, str);
    }

    @Override // io.sentry.ILogger
    public void b(EnumC4788n3 enumC4788n3, String str, Throwable th2) {
        this.f52578a.b(enumC4788n3, str, th2);
        if (th2 != null) {
            str = str + ": " + th2.getMessage();
        }
        e(enumC4788n3, str);
    }

    @Override // io.sentry.ILogger
    public void c(EnumC4788n3 enumC4788n3, String str, Object... objArr) {
        this.f52578a.c(enumC4788n3, str, objArr);
        if (objArr != null && objArr.length != 0) {
            str = String.format(str, objArr);
        }
        e(enumC4788n3, str);
    }

    @Override // io.sentry.ILogger
    public boolean d(EnumC4788n3 enumC4788n3) {
        return this.f52578a.d(enumC4788n3);
    }

    public final void e(EnumC4788n3 enumC4788n3, String str) {
        WeakReference weakReference = this.f52579b;
        ReactApplicationContext reactApplicationContext = weakReference != null ? (ReactApplicationContext) weakReference.get() : null;
        if (reactApplicationContext == null || !reactApplicationContext.hasActiveReactInstance()) {
            return;
        }
        try {
            WritableMap createMap = Arguments.createMap();
            createMap.putString("level", enumC4788n3.name().toLowerCase());
            createMap.putString("component", "Sentry");
            createMap.putString("message", str);
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("SentryNativeLog", createMap);
        } catch (Exception e10) {
            this.f52578a.c(EnumC4788n3.DEBUG, "Failed to forward log to JS: " + e10.getMessage(), new Object[0]);
        }
    }

    public void f(ReactApplicationContext reactApplicationContext) {
        this.f52579b = reactApplicationContext != null ? new WeakReference(reactApplicationContext) : null;
    }
}
