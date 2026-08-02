package com.ironsource;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.webkit.WebView;
import com.ironsource.X3;
import kotlin.Result;
import org.json.JSONObject;
import xsna.epx;
import xsna.n6j;
import xsna.s3q0;
import xsna.xe9;
import xsna.zr;

/* loaded from: classes13.dex */
public final class D8 {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final Drawable e;
    private final WebView f;
    private final View g;

    public static final class b {
        private final a a;

        public static final class a {
            private final String a;
            private final String b;
            private final String c;
            private final String d;
            private final Result<Drawable> e;
            private final Result<WebView> f;
            private final View g;

            /* JADX WARN: Multi-variable type inference failed */
            public a(String str, String str2, String str3, String str4, Result<? extends Drawable> result, Result<? extends WebView> result2, View view) {
                this.a = str;
                this.b = str2;
                this.c = str3;
                this.d = str4;
                this.e = result;
                this.f = result2;
                this.g = view;
            }

            public final String a() {
                return this.a;
            }

            public final String b() {
                return this.b;
            }

            public final String c() {
                return this.c;
            }

            public final String d() {
                return this.d;
            }

            public final Result<Drawable> e() {
                return this.e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g);
            }

            public final Result<WebView> f() {
                return this.f;
            }

            public final View g() {
                return this.g;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final D8 h() {
                Drawable drawable;
                String str = this.a;
                String str2 = this.b;
                String str3 = this.c;
                String str4 = this.d;
                Result<Drawable> result = this.e;
                if (result != null) {
                    Object d = result.d();
                    if (d instanceof Result.Failure) {
                        d = null;
                    }
                    drawable = (Drawable) d;
                } else {
                    drawable = null;
                }
                Result<WebView> result2 = this.f;
                if (result2 != null) {
                    Object d2 = result2.d();
                    r6 = d2 instanceof Result.Failure ? null : d2;
                }
                return new D8(str, str2, str3, str4, drawable, r6, this.g);
            }

            public int hashCode() {
                String str = this.a;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.b;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.c;
                int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.d;
                int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                Result<Drawable> result = this.e;
                int b = (hashCode4 + (result == null ? 0 : Result.b(result.d()))) * 31;
                Result<WebView> result2 = this.f;
                return this.g.hashCode() + ((b + (result2 != null ? Result.b(result2.d()) : 0)) * 31);
            }

            public final String i() {
                return this.b;
            }

            public final String j() {
                return this.c;
            }

            public final String k() {
                return this.d;
            }

            public final Result<Drawable> l() {
                return this.e;
            }

            public final Result<WebView> m() {
                return this.f;
            }

            public final View n() {
                return this.g;
            }

            public final String o() {
                return this.a;
            }

            public String toString() {
                String str = this.a;
                String str2 = this.b;
                String str3 = this.c;
                String str4 = this.d;
                Result<Drawable> result = this.e;
                Result<WebView> result2 = this.f;
                View view = this.g;
                StringBuilder a = xe9.a("Data(title=", str, ", advertiser=", str2, ", body=");
                n6j.b(a, str3, ", cta=", str4, ", icon=");
                a.append(result);
                a.append(", media=");
                a.append(result2);
                a.append(", privacyIcon=");
                a.append(view);
                a.append(")");
                return a.toString();
            }

            public final a a(String str, String str2, String str3, String str4, Result<? extends Drawable> result, Result<? extends WebView> result2, View view) {
                return new a(str, str2, str3, str4, result, result2, view);
            }

            public static /* synthetic */ a a(a aVar, String str, String str2, String str3, String str4, Result result, Result result2, View view, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = aVar.a;
                }
                if ((i & 2) != 0) {
                    str2 = aVar.b;
                }
                if ((i & 4) != 0) {
                    str3 = aVar.c;
                }
                if ((i & 8) != 0) {
                    str4 = aVar.d;
                }
                if ((i & 16) != 0) {
                    result = aVar.e;
                }
                if ((i & 32) != 0) {
                    result2 = aVar.f;
                }
                if ((i & 64) != 0) {
                    view = aVar.g;
                }
                Result result3 = result2;
                View view2 = view;
                Result result4 = result;
                String str5 = str3;
                return aVar.a(str, str2, str5, str4, result4, result3, view2);
            }
        }

        public b(a aVar) {
            this.a = aVar;
        }

        public final a a() {
            return this.a;
        }

        public final JSONObject b() {
            JSONObject jSONObject = new JSONObject();
            if (this.a.o() != null) {
                a(jSONObject, "title");
            }
            if (this.a.i() != null) {
                a(jSONObject, X3.i.F0);
            }
            if (this.a.j() != null) {
                a(jSONObject, "body");
            }
            if (this.a.k() != null) {
                a(jSONObject, X3.i.G0);
            }
            Result<Drawable> l = this.a.l();
            if (l != null) {
                a(jSONObject, "icon", l.d());
            }
            Result<WebView> m = this.a.m();
            if (m != null) {
                a(jSONObject, X3.i.I0, m.d());
            }
            return jSONObject;
        }

        private static final void a(JSONObject jSONObject, String str) {
            jSONObject.put(str, new JSONObject().put("success", true));
        }

        private static final <T> void a(JSONObject jSONObject, String str, Object obj) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("success", !(obj instanceof Result.Failure));
            Throwable a2 = Result.a(obj);
            if (a2 != null) {
                String message = a2.getMessage();
                if (message == null) {
                    message = "unknown reason";
                }
                jSONObject2.put("reason", message);
            }
            s3q0 s3q0Var = s3q0.a;
            jSONObject.put(str, jSONObject2);
        }
    }

    public D8(String str, String str2, String str3, String str4, Drawable drawable, WebView webView, View view) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = drawable;
        this.f = webView;
        this.g = view;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final Drawable e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D8)) {
            return false;
        }
        D8 d8 = (D8) obj;
        return epx.f(this.a, d8.a) && epx.f(this.b, d8.b) && epx.f(this.c, d8.c) && epx.f(this.d, d8.d) && epx.f(this.e, d8.e) && epx.f(this.f, d8.f) && epx.f(this.g, d8.g);
    }

    public final WebView f() {
        return this.f;
    }

    public final View g() {
        return this.g;
    }

    public final String h() {
        return this.b;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Drawable drawable = this.e;
        int hashCode5 = (hashCode4 + (drawable == null ? 0 : drawable.hashCode())) * 31;
        WebView webView = this.f;
        return this.g.hashCode() + ((hashCode5 + (webView != null ? webView.hashCode() : 0)) * 31);
    }

    public final String i() {
        return this.c;
    }

    public final String j() {
        return this.d;
    }

    public final Drawable k() {
        return this.e;
    }

    public final WebView l() {
        return this.f;
    }

    public final View m() {
        return this.g;
    }

    public final String n() {
        return this.a;
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String str4 = this.d;
        Drawable drawable = this.e;
        WebView webView = this.f;
        View view = this.g;
        StringBuilder a2 = xe9.a("ISNNativeAdData(title=", str, ", advertiser=", str2, ", body=");
        n6j.b(a2, str3, ", cta=", str4, ", icon=");
        a2.append(drawable);
        a2.append(", mediaView=");
        a2.append(webView);
        a2.append(", privacyIcon=");
        a2.append(view);
        a2.append(")");
        return a2.toString();
    }

    public final D8 a(String str, String str2, String str3, String str4, Drawable drawable, WebView webView, View view) {
        return new D8(str, str2, str3, str4, drawable, webView, view);
    }

    public static /* synthetic */ D8 a(D8 d8, String str, String str2, String str3, String str4, Drawable drawable, WebView webView, View view, int i, Object obj) {
        if ((i & 1) != 0) {
            str = d8.a;
        }
        if ((i & 2) != 0) {
            str2 = d8.b;
        }
        if ((i & 4) != 0) {
            str3 = d8.c;
        }
        if ((i & 8) != 0) {
            str4 = d8.d;
        }
        if ((i & 16) != 0) {
            drawable = d8.e;
        }
        if ((i & 32) != 0) {
            webView = d8.f;
        }
        if ((i & 64) != 0) {
            view = d8.g;
        }
        WebView webView2 = webView;
        View view2 = view;
        Drawable drawable2 = drawable;
        String str5 = str3;
        return d8.a(str, str2, str5, str4, drawable2, webView2, view2);
    }

    public static final class a {
        private final U8 a;
        private final InterfaceC4270d1 b;

        public a(U8 u8, InterfaceC4270d1 interfaceC4270d1) {
            this.a = u8;
            this.b = interfaceC4270d1;
        }

        private final Result<Drawable> b(String str) {
            if (str == null) {
                return null;
            }
            return new Result<>(this.a.a(str));
        }

        public final b a(Context context, JSONObject jSONObject) {
            String str;
            String str2;
            String str3;
            String str4;
            String b;
            String b2;
            String b3;
            String b4;
            JSONObject optJSONObject = jSONObject.optJSONObject("title");
            if (optJSONObject != null) {
                b4 = E8.b(optJSONObject, "text");
                str = b4;
            } else {
                str = null;
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject(X3.i.F0);
            if (optJSONObject2 != null) {
                b3 = E8.b(optJSONObject2, "text");
                str2 = b3;
            } else {
                str2 = null;
            }
            JSONObject optJSONObject3 = jSONObject.optJSONObject("body");
            if (optJSONObject3 != null) {
                b2 = E8.b(optJSONObject3, "text");
                str3 = b2;
            } else {
                str3 = null;
            }
            JSONObject optJSONObject4 = jSONObject.optJSONObject(X3.i.G0);
            if (optJSONObject4 != null) {
                b = E8.b(optJSONObject4, "text");
                str4 = b;
            } else {
                str4 = null;
            }
            JSONObject optJSONObject5 = jSONObject.optJSONObject("icon");
            String b5 = optJSONObject5 != null ? E8.b(optJSONObject5, "url") : null;
            JSONObject optJSONObject6 = jSONObject.optJSONObject(X3.i.I0);
            String b6 = optJSONObject6 != null ? E8.b(optJSONObject6, "adViewId") : null;
            JSONObject optJSONObject7 = jSONObject.optJSONObject(X3.i.J0);
            return new b(new b.a(str, str2, str3, str4, b(b5), a(b6), C4676zd.a.a(context, optJSONObject7 != null ? E8.b(optJSONObject7, "url") : null, this.a)));
        }

        private final Result<WebView> a(String str) {
            if (str == null) {
                return null;
            }
            H8 a = this.b.a(str);
            WebView presentingView = a != null ? a.getPresentingView() : null;
            if (presentingView == null) {
                return new Result<>(new Result.Failure(new Exception(zr.a("missing adview for id: '", str, "'"))));
            }
            return new Result<>(presentingView);
        }
    }
}
