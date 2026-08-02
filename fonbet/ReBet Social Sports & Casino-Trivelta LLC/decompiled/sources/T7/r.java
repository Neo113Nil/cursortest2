package T7;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class r extends d0 {

    /* renamed from: q, reason: collision with root package name */
    public static final a f11161q = new a(null);

    /* renamed from: r, reason: collision with root package name */
    public static final String f11162r = r.class.getName();

    /* renamed from: p, reason: collision with root package name */
    public boolean f11163p;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final r a(Context context, String url, String expectedRedirectUrl) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(expectedRedirectUrl, "expectedRedirectUrl");
            d0.s(context);
            return new r(context, url, expectedRedirectUrl, null);
        }

        public a() {
        }
    }

    public /* synthetic */ r(Context context, String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, str2);
    }

    public static final void F(r this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        super.cancel();
    }

    @Override // T7.d0, android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        WebView r10 = r();
        if (!u() || t() || r10 == null || !r10.isShown()) {
            super.cancel();
        } else {
            if (this.f11163p) {
                return;
            }
            this.f11163p = true;
            r10.loadUrl(Intrinsics.stringPlus("javascript:", "(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();"));
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: T7.q
                @Override // java.lang.Runnable
                public final void run() {
                    r.F(r.this);
                }
            }, 1500L);
        }
    }

    @Override // T7.d0
    public Bundle w(String str) {
        Uri parse = Uri.parse(str);
        Y y10 = Y.f11042a;
        Bundle p02 = Y.p0(parse.getQuery());
        String string = p02.getString("bridge_args");
        p02.remove("bridge_args");
        if (!Y.d0(string)) {
            try {
                p02.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", C1664d.a(new JSONObject(string)));
            } catch (JSONException e10) {
                Y y11 = Y.f11042a;
                Y.l0(f11162r, "Unable to parse bridge_args JSON", e10);
            }
        }
        String string2 = p02.getString("method_results");
        p02.remove("method_results");
        if (!Y.d0(string2)) {
            try {
                p02.putBundle("com.facebook.platform.protocol.RESULT_ARGS", C1664d.a(new JSONObject(string2)));
            } catch (JSONException e11) {
                Y y12 = Y.f11042a;
                Y.l0(f11162r, "Unable to parse bridge_args JSON", e11);
            }
        }
        p02.remove("version");
        p02.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", M.x());
        return p02;
    }

    public r(Context context, String str, String str2) {
        super(context, str);
        A(str2);
    }
}
