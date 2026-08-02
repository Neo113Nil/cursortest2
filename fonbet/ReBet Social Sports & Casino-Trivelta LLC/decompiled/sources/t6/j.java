package t6;

import T7.Y;
import android.os.Bundle;
import android.view.View;
import com.facebook.GraphRequest;
import g6.C4331C;
import h6.C4470F;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;
import q6.f;
import t6.j;

/* loaded from: classes2.dex */
public final class j implements View.OnClickListener {

    /* renamed from: e, reason: collision with root package name */
    public static final a f65714e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final Set f65715f = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final View.OnClickListener f65716a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f65717b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference f65718c;

    /* renamed from: d, reason: collision with root package name */
    public final String f65719d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final void g(String queriedEvent, String buttonText) {
            Intrinsics.checkNotNullParameter(queriedEvent, "$queriedEvent");
            Intrinsics.checkNotNullParameter(buttonText, "$buttonText");
            j.f65714e.e(queriedEvent, buttonText, new float[0]);
        }

        public final void d(View hostView, View rootView, String activityName) {
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(activityName, "activityName");
            int hashCode = hostView.hashCode();
            if (j.b().contains(Integer.valueOf(hashCode))) {
                return;
            }
            l6.f fVar = l6.f.f55644a;
            l6.f.r(hostView, new j(hostView, rootView, activityName, null));
            j.b().add(Integer.valueOf(hashCode));
        }

        public final void e(String str, String str2, float[] fArr) {
            if (e.f(str)) {
                new C4470F(C4331C.l()).e(str, str2);
            } else if (e.e(str)) {
                h(str, str2, fArr);
            }
        }

        public final boolean f(String str, final String str2) {
            final String d10 = b.d(str);
            if (d10 == null) {
                return false;
            }
            if (Intrinsics.areEqual(d10, "other")) {
                return true;
            }
            Y y10 = Y.f11042a;
            Y.E0(new Runnable() { // from class: t6.i
                @Override // java.lang.Runnable
                public final void run() {
                    j.a.g(d10, str2);
                }
            });
            return true;
        }

        public final void h(String str, String str2, float[] fArr) {
            Bundle bundle = new Bundle();
            try {
                bundle.putString("event_name", str);
                JSONObject jSONObject = new JSONObject();
                StringBuilder sb2 = new StringBuilder();
                int length = fArr.length;
                int i10 = 0;
                while (i10 < length) {
                    float f10 = fArr[i10];
                    i10++;
                    sb2.append(f10);
                    sb2.append(",");
                }
                jSONObject.put("dense", sb2.toString());
                jSONObject.put("button_text", str2);
                bundle.putString("metadata", jSONObject.toString());
                GraphRequest.c cVar = GraphRequest.f30314n;
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format(Locale.US, "%s/suggested_events", Arrays.copyOf(new Object[]{C4331C.m()}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
                GraphRequest A10 = cVar.A(null, format, null, null);
                A10.J(bundle);
                A10.k();
            } catch (JSONException unused) {
            }
        }

        public a() {
        }
    }

    public /* synthetic */ j(View view, View view2, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, view2, str);
    }

    public static final /* synthetic */ Set b() {
        if (Y7.a.d(j.class)) {
            return null;
        }
        try {
            return f65715f;
        } catch (Throwable th2) {
            Y7.a.b(th2, j.class);
            return null;
        }
    }

    public static final void d(JSONObject viewData, String buttonText, j this$0, String pathID) {
        if (Y7.a.d(j.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(viewData, "$viewData");
            Intrinsics.checkNotNullParameter(buttonText, "$buttonText");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(pathID, "$pathID");
            try {
                Y y10 = Y.f11042a;
                String u10 = Y.u(C4331C.l());
                if (u10 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                String lowerCase = u10.toLowerCase();
                Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
                float[] a10 = C6444a.a(viewData, lowerCase);
                String c10 = C6444a.c(buttonText, this$0.f65719d, lowerCase);
                if (a10 == null) {
                    return;
                }
                q6.f fVar = q6.f.f63425a;
                String[] q10 = q6.f.q(f.a.MTML_APP_EVENT_PREDICTION, new float[][]{a10}, new String[]{c10});
                if (q10 == null) {
                    return;
                }
                String str = q10[0];
                b.a(pathID, str);
                if (Intrinsics.areEqual(str, "other")) {
                    return;
                }
                f65714e.e(str, buttonText, a10);
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, j.class);
        }
    }

    public final void c(final String str, final String str2, final JSONObject jSONObject) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            Y y10 = Y.f11042a;
            Y.E0(new Runnable() { // from class: t6.h
                @Override // java.lang.Runnable
                public final void run() {
                    j.d(jSONObject, str2, this, str);
                }
            });
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public final void e() {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            View view = (View) this.f65717b.get();
            View view2 = (View) this.f65718c.get();
            if (view == null || view2 == null) {
                return;
            }
            try {
                String d10 = c.d(view2);
                String b10 = b.b(view2, d10);
                if (b10 != null && !f65714e.f(b10, d10)) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("view", c.b(view, view2));
                    jSONObject.put("screenname", this.f65719d);
                    c(b10, d10, jSONObject);
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            View.OnClickListener onClickListener = this.f65716a;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            e();
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public j(View view, View view2, String str) {
        this.f65716a = l6.f.g(view);
        this.f65717b = new WeakReference(view2);
        this.f65718c = new WeakReference(view);
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String lowerCase = str.toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
        this.f65719d = StringsKt.replace$default(lowerCase, "activity", "", false, 4, (Object) null);
    }
}
