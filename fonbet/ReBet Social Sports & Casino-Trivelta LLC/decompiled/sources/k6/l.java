package k6;

import T7.G;
import T7.J;
import T7.Y;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.twilio.voice.Constants;
import com.twilio.voice.EventKeys;
import com.twilio.voice.PublisherMetadata;
import g6.C4331C;
import g6.C4339K;
import g6.N;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import k6.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: e, reason: collision with root package name */
    public static final a f54283e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final String f54284f;

    /* renamed from: g, reason: collision with root package name */
    public static l f54285g;

    /* renamed from: a, reason: collision with root package name */
    public final Handler f54286a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f54287b;

    /* renamed from: c, reason: collision with root package name */
    public Timer f54288c;

    /* renamed from: d, reason: collision with root package name */
    public String f54289d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final void c(C4339K it) {
            Intrinsics.checkNotNullParameter(it, "it");
            J.f10993e.b(N.APP_EVENTS, l.d(), "App index sent to FB!");
        }

        public final GraphRequest b(String str, AccessToken accessToken, String str2, String requestType) {
            Intrinsics.checkNotNullParameter(requestType, "requestType");
            if (str == null) {
                return null;
            }
            GraphRequest.c cVar = GraphRequest.f30314n;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format(Locale.US, "%s/app_indexing", Arrays.copyOf(new Object[]{str2}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
            GraphRequest A10 = cVar.A(accessToken, format, null, null);
            Bundle u10 = A10.u();
            if (u10 == null) {
                u10 = new Bundle();
            }
            u10.putString("tree", str);
            u10.putString(PublisherMetadata.APP_VERSION, p6.g.d());
            u10.putString(EventKeys.PLATFORM, Constants.PLATFORM_ANDROID);
            u10.putString("request_type", requestType);
            if (Intrinsics.areEqual(requestType, "app_indexing")) {
                u10.putString("device_session_id", e.g());
            }
            A10.J(u10);
            A10.E(new GraphRequest.b() { // from class: k6.k
                @Override // com.facebook.GraphRequest.b
                public final void a(C4339K c4339k) {
                    l.a.c(c4339k);
                }
            });
            return A10;
        }

        public a() {
        }
    }

    public static final class b implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference f54290a;

        public b(View rootView) {
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            this.f54290a = new WeakReference(rootView);
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String call() {
            View view = (View) this.f54290a.get();
            if (view == null || view.getWidth() == 0 || view.getHeight() == 0) {
                return "";
            }
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
            view.draw(new Canvas(createBitmap));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            createBitmap.compress(Bitmap.CompressFormat.JPEG, 10, byteArrayOutputStream);
            String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(outputStream.toByteArray(), Base64.NO_WRAP)");
            return encodeToString;
        }
    }

    public static final class c extends TimerTask {
        public c() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                Activity activity = (Activity) l.c(l.this).get();
                View e10 = p6.g.e(activity);
                if (activity != null && e10 != null) {
                    String simpleName = activity.getClass().getSimpleName();
                    if (e.h()) {
                        if (G.b()) {
                            l6.e.a();
                            return;
                        }
                        FutureTask futureTask = new FutureTask(new b(e10));
                        l.e(l.this).post(futureTask);
                        String str = "";
                        try {
                            str = (String) futureTask.get(1L, TimeUnit.SECONDS);
                        } catch (Exception e11) {
                            Log.e(l.d(), "Failed to take screenshot.", e11);
                        }
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("screenname", simpleName);
                            jSONObject.put("screenshot", str);
                            JSONArray jSONArray = new JSONArray();
                            jSONArray.put(l6.f.d(e10));
                            jSONObject.put("view", jSONArray);
                        } catch (JSONException unused) {
                            Log.e(l.d(), "Failed to create JSONObject");
                        }
                        String jSONObject2 = jSONObject.toString();
                        Intrinsics.checkNotNullExpressionValue(jSONObject2, "viewTree.toString()");
                        l.f(l.this, jSONObject2);
                    }
                }
            } catch (Exception e12) {
                Log.e(l.d(), "UI Component tree indexing failure!", e12);
            }
        }
    }

    static {
        String canonicalName = l.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "";
        }
        f54284f = canonicalName;
    }

    public l(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f54287b = new WeakReference(activity);
        this.f54289d = null;
        this.f54286a = new Handler(Looper.getMainLooper());
        f54285g = this;
    }

    public static final /* synthetic */ WeakReference c(l lVar) {
        if (Y7.a.d(l.class)) {
            return null;
        }
        try {
            return lVar.f54287b;
        } catch (Throwable th2) {
            Y7.a.b(th2, l.class);
            return null;
        }
    }

    public static final /* synthetic */ String d() {
        if (Y7.a.d(l.class)) {
            return null;
        }
        try {
            return f54284f;
        } catch (Throwable th2) {
            Y7.a.b(th2, l.class);
            return null;
        }
    }

    public static final /* synthetic */ Handler e(l lVar) {
        if (Y7.a.d(l.class)) {
            return null;
        }
        try {
            return lVar.f54286a;
        } catch (Throwable th2) {
            Y7.a.b(th2, l.class);
            return null;
        }
    }

    public static final /* synthetic */ void f(l lVar, String str) {
        if (Y7.a.d(l.class)) {
            return;
        }
        try {
            lVar.j(str);
        } catch (Throwable th2) {
            Y7.a.b(th2, l.class);
        }
    }

    public static final void i(l this$0, TimerTask indexingTask) {
        if (Y7.a.d(l.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(indexingTask, "$indexingTask");
            try {
                Timer timer = this$0.f54288c;
                if (timer != null) {
                    timer.cancel();
                }
                this$0.f54289d = null;
                Timer timer2 = new Timer();
                timer2.scheduleAtFixedRate(indexingTask, 0L, 1000L);
                this$0.f54288c = timer2;
            } catch (Exception e10) {
                Log.e(f54284f, "Error scheduling indexing job", e10);
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, l.class);
        }
    }

    public static final void k(String tree, l this$0) {
        if (Y7.a.d(l.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(tree, "$tree");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            String n02 = Y.n0(tree);
            AccessToken e10 = AccessToken.INSTANCE.e();
            if (n02 == null || !Intrinsics.areEqual(n02, this$0.f54289d)) {
                this$0.g(f54283e.b(tree, e10, C4331C.m(), "app_indexing"), n02);
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, l.class);
        }
    }

    public final void g(GraphRequest graphRequest, String str) {
        if (Y7.a.d(this) || graphRequest == null) {
            return;
        }
        try {
            C4339K k10 = graphRequest.k();
            try {
                JSONObject c10 = k10.c();
                if (c10 == null) {
                    Log.e(f54284f, Intrinsics.stringPlus("Error sending UI component tree to Facebook: ", k10.b()));
                    return;
                }
                if (Intrinsics.areEqual("true", c10.optString("success"))) {
                    J.f10993e.b(N.APP_EVENTS, f54284f, "Successfully send UI component tree to server");
                    this.f54289d = str;
                }
                if (c10.has("is_app_indexing_enabled")) {
                    e.n(c10.getBoolean("is_app_indexing_enabled"));
                }
            } catch (JSONException e10) {
                Log.e(f54284f, "Error decoding server response.", e10);
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public final void h() {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            final c cVar = new c();
            try {
                C4331C.t().execute(new Runnable() { // from class: k6.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        l.i(l.this, cVar);
                    }
                });
            } catch (RejectedExecutionException e10) {
                Log.e(f54284f, "Error scheduling indexing job", e10);
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public final void j(final String str) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            C4331C.t().execute(new Runnable() { // from class: k6.j
                @Override // java.lang.Runnable
                public final void run() {
                    l.k(str, this);
                }
            });
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public final void l() {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            if (((Activity) this.f54287b.get()) == null) {
                return;
            }
            try {
                Timer timer = this.f54288c;
                if (timer != null) {
                    timer.cancel();
                }
                this.f54288c = null;
            } catch (Exception e10) {
                Log.e(f54284f, "Error unscheduling indexing job", e10);
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }
}
