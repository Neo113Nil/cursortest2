package h6;

import T7.C1662b;
import T7.Y;
import android.content.Context;
import android.os.Bundle;
import com.facebook.GraphRequest;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import m6.C5562a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p6.h;

/* renamed from: h6.H, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4472H {

    /* renamed from: f, reason: collision with root package name */
    public static final a f47735f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final String f47736g = C4472H.class.getSimpleName();

    /* renamed from: h, reason: collision with root package name */
    public static final int f47737h = 1000;

    /* renamed from: a, reason: collision with root package name */
    public final C1662b f47738a;

    /* renamed from: b, reason: collision with root package name */
    public final String f47739b;

    /* renamed from: c, reason: collision with root package name */
    public List f47740c;

    /* renamed from: d, reason: collision with root package name */
    public final List f47741d;

    /* renamed from: e, reason: collision with root package name */
    public int f47742e;

    /* renamed from: h6.H$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public C4472H(C1662b attributionIdentifiers, String anonymousAppDeviceGUID) {
        Intrinsics.checkNotNullParameter(attributionIdentifiers, "attributionIdentifiers");
        Intrinsics.checkNotNullParameter(anonymousAppDeviceGUID, "anonymousAppDeviceGUID");
        this.f47738a = attributionIdentifiers;
        this.f47739b = anonymousAppDeviceGUID;
        this.f47740c = new ArrayList();
        this.f47741d = new ArrayList();
    }

    public final synchronized void a(C4478e event) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(event, "event");
            if (this.f47740c.size() + this.f47741d.size() >= f47737h) {
                this.f47742e++;
            } else {
                this.f47740c.add(event);
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public final synchronized void b(boolean z10) {
        if (Y7.a.d(this)) {
            return;
        }
        if (z10) {
            try {
                this.f47740c.addAll(this.f47741d);
            } catch (Throwable th2) {
                Y7.a.b(th2, this);
                return;
            }
        }
        this.f47741d.clear();
        this.f47742e = 0;
    }

    public final synchronized int c() {
        if (Y7.a.d(this)) {
            return 0;
        }
        try {
            return this.f47740c.size();
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return 0;
        }
    }

    public final synchronized List d() {
        if (Y7.a.d(this)) {
            return null;
        }
        try {
            List list = this.f47740c;
            this.f47740c = new ArrayList();
            return list;
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return null;
        }
    }

    public final int e(GraphRequest request, Context applicationContext, boolean z10, boolean z11) {
        Throwable th2;
        Throwable th3;
        if (Y7.a.d(this)) {
            return 0;
        }
        try {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
            try {
                synchronized (this) {
                    try {
                        int i10 = this.f47742e;
                        C5562a c5562a = C5562a.f56377a;
                        C5562a.d(this.f47740c);
                        this.f47741d.addAll(this.f47740c);
                        this.f47740c.clear();
                        JSONArray jSONArray = new JSONArray();
                        for (C4478e c4478e : this.f47741d) {
                            try {
                                if (c4478e.g()) {
                                    if (!z10 && c4478e.h()) {
                                    }
                                    jSONArray.put(c4478e.e());
                                } else {
                                    Y y10 = Y.f11042a;
                                    Y.k0(f47736g, Intrinsics.stringPlus("Event with invalid checksum: ", c4478e));
                                }
                            } catch (Throwable th4) {
                                th3 = th4;
                                throw th3;
                            }
                        }
                        if (jSONArray.length() != 0) {
                            Unit unit = Unit.INSTANCE;
                            f(request, applicationContext, i10, jSONArray, z11);
                            return jSONArray.length();
                        }
                        try {
                            return 0;
                        } catch (Throwable th5) {
                            th2 = th5;
                            Y7.a.b(th2, this);
                            return 0;
                        }
                    } catch (Throwable th6) {
                        th3 = th6;
                    }
                }
            } catch (Throwable th7) {
                th = th7;
                th2 = th;
                Y7.a.b(th2, this);
                return 0;
            }
        } catch (Throwable th8) {
            th = th8;
        }
    }

    public final void f(GraphRequest graphRequest, Context context, int i10, JSONArray jSONArray, boolean z10) {
        JSONObject jSONObject;
        try {
            if (Y7.a.d(this)) {
                return;
            }
            try {
                p6.h hVar = p6.h.f63070a;
                jSONObject = p6.h.a(h.a.CUSTOM_APP_EVENTS, this.f47738a, this.f47739b, z10, context);
                if (this.f47742e > 0) {
                    jSONObject.put("num_skipped_events", i10);
                }
            } catch (JSONException unused) {
                jSONObject = new JSONObject();
            }
            graphRequest.G(jSONObject);
            Bundle u10 = graphRequest.u();
            String jSONArray2 = jSONArray.toString();
            Intrinsics.checkNotNullExpressionValue(jSONArray2, "events.toString()");
            u10.putString("custom_events", jSONArray2);
            graphRequest.K(jSONArray2);
            graphRequest.J(u10);
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }
}
