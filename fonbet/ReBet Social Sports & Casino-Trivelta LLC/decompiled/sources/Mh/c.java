package Mh;

import Nh.a;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import androidx.core.graphics.AbstractC2074d;
import com.facebook.react.R;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import l0.AbstractC5338c;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import w.C6694a;
import w.d;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f7666a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f7667b;

    public static final void c(Activity activity, Uri uri) {
        activity.startActivity(new Intent("android.intent.action.VIEW", uri));
    }

    public final void b(ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        if (f7667b && reactContext.hasActiveReactInstance()) {
            f7667b = false;
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("swanBrowserDidClose", null);
        }
    }

    public final void d(ReactApplicationContext reactContext, String url, ReadableMap options, Promise promise) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(promise, "promise");
        if (f7667b) {
            promise.reject("swan_browser_visible", "An instance of the swan browser is already visible");
            return;
        }
        Activity currentActivity = reactContext.getCurrentActivity();
        if (currentActivity == null) {
            promise.reject("no_current_activity", "Couldn't call open() when the app is in background");
            return;
        }
        int i10 = 1;
        f7667b = true;
        d.C0946d c0946d = new d.C0946d();
        c0946d.b(false);
        c0946d.f(false);
        c0946d.i(false);
        c0946d.j(false);
        c0946d.n(false);
        if (Intrinsics.areEqual(options.getString("animationType"), "fade")) {
            c0946d.o(currentActivity, R.anim.catalyst_fade_in, a.f7665a);
            c0946d.g(currentActivity, a.f7665a, R.anim.catalyst_fade_out);
        } else {
            c0946d.o(currentActivity, R.anim.catalyst_slide_up, a.f7665a);
            c0946d.g(currentActivity, a.f7665a, R.anim.catalyst_slide_down);
        }
        int color = AbstractC5338c.getColor(currentActivity, android.R.color.black);
        C6694a.C0945a c0945a = new C6694a.C0945a();
        c0945a.b(color);
        if (options.hasKey("barTintColor")) {
            int i11 = options.getInt("barTintColor");
            c0945a.e(i11);
            c0945a.d(i11);
            boolean z10 = AbstractC2074d.d(i11) > 0.5d;
            if (!z10) {
                if (z10) {
                    throw new NoWhenBranchMatchedException();
                }
                i10 = 2;
            }
            c0946d.c(i10);
        }
        c0946d.e(c0945a.a());
        w.d a10 = c0946d.a();
        a10.f67200a.addFlags(8388608);
        a10.f67200a.addFlags(PKIFailureInfo.duplicateCertReq);
        Intrinsics.checkNotNullExpressionValue(a10, "apply(...)");
        Nh.a.a(currentActivity, a10, Uri.parse(url), new a.InterfaceC0166a() { // from class: Mh.b
            @Override // Nh.a.InterfaceC0166a
            public final void a(Activity activity, Uri uri) {
                c.c(activity, uri);
            }
        });
        promise.resolve(null);
    }
}
