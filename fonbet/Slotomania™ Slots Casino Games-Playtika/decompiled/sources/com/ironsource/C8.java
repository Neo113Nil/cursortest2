package com.ironsource;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.webkit.WebView;
import com.ironsource.X3;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class C8 {
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
            public a(String str, String str2, String str3, String str4, Result<? extends Drawable> result, Result<? extends WebView> result2, View privacyIcon) {
                Intrinsics.checkNotNullParameter(privacyIcon, "privacyIcon");
                this.a = str;
                this.b = str2;
                this.c = str3;
                this.d = str4;
                this.e = result;
                this.f = result2;
                this.g = privacyIcon;
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
                return Intrinsics.areEqual(this.a, aVar.a) && Intrinsics.areEqual(this.b, aVar.b) && Intrinsics.areEqual(this.c, aVar.c) && Intrinsics.areEqual(this.d, aVar.d) && Intrinsics.areEqual(this.e, aVar.e) && Intrinsics.areEqual(this.f, aVar.f) && Intrinsics.areEqual(this.g, aVar.g);
            }

            public final Result<WebView> f() {
                return this.f;
            }

            public final View g() {
                return this.g;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final C8 h() {
                Drawable drawable;
                String str = this.a;
                String str2 = this.b;
                String str3 = this.c;
                String str4 = this.d;
                Result<Drawable> result = this.e;
                if (result != null) {
                    Object value = result.getValue();
                    if (Result.m11186isFailureimpl(value)) {
                        value = null;
                    }
                    drawable = (Drawable) value;
                } else {
                    drawable = null;
                }
                Result<WebView> result2 = this.f;
                if (result2 != null) {
                    Object value2 = result2.getValue();
                    r6 = Result.m11186isFailureimpl(value2) ? null : value2;
                }
                return new C8(str, str2, str3, str4, drawable, r6, this.g);
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
                int m11185hashCodeimpl = (hashCode4 + (result == null ? 0 : Result.m11185hashCodeimpl(result.getValue()))) * 31;
                Result<WebView> result2 = this.f;
                return ((m11185hashCodeimpl + (result2 != null ? Result.m11185hashCodeimpl(result2.getValue()) : 0)) * 31) + this.g.hashCode();
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
                return "Data(title=" + this.a + ", advertiser=" + this.b + ", body=" + this.c + ", cta=" + this.d + ", icon=" + this.e + ", media=" + this.f + ", privacyIcon=" + this.g + ")";
            }

            public final a a(String str, String str2, String str3, String str4, Result<? extends Drawable> result, Result<? extends WebView> result2, View privacyIcon) {
                Intrinsics.checkNotNullParameter(privacyIcon, "privacyIcon");
                return new a(str, str2, str3, str4, result, result2, privacyIcon);
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

        public b(a data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.a = data;
        }

        public final a a() {
            return this.a;
        }

        public final JSONObject b() {
            JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
            if (this.a.o() != null) {
                a(jsonObjectInit, "title");
            }
            if (this.a.i() != null) {
                a(jsonObjectInit, X3.i.F0);
            }
            if (this.a.j() != null) {
                a(jsonObjectInit, "body");
            }
            if (this.a.k() != null) {
                a(jsonObjectInit, "cta");
            }
            Result<Drawable> l = this.a.l();
            if (l != null) {
                a(jsonObjectInit, "icon", l.getValue());
            }
            Result<WebView> m = this.a.m();
            if (m != null) {
                a(jsonObjectInit, "media", m.getValue());
            }
            return jsonObjectInit;
        }

        private static final void a(JSONObject jSONObject, String str) {
            jSONObject.put(str, IronSourceNetworkBridge.jsonObjectInit().put("success", true));
        }

        private static final <T> void a(JSONObject jSONObject, String str, Object obj) {
            JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
            jsonObjectInit.put("success", Result.m11187isSuccessimpl(obj));
            Throwable m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(obj);
            if (m11183exceptionOrNullimpl != null) {
                String message = m11183exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "unknown reason";
                }
                jsonObjectInit.put("reason", message);
            }
            Unit unit = Unit.INSTANCE;
            jSONObject.put(str, jsonObjectInit);
        }
    }

    public C8(String str, String str2, String str3, String str4, Drawable drawable, WebView webView, View privacyIcon) {
        Intrinsics.checkNotNullParameter(privacyIcon, "privacyIcon");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = drawable;
        this.f = webView;
        this.g = privacyIcon;
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
        if (!(obj instanceof C8)) {
            return false;
        }
        C8 c8 = (C8) obj;
        return Intrinsics.areEqual(this.a, c8.a) && Intrinsics.areEqual(this.b, c8.b) && Intrinsics.areEqual(this.c, c8.c) && Intrinsics.areEqual(this.d, c8.d) && Intrinsics.areEqual(this.e, c8.e) && Intrinsics.areEqual(this.f, c8.f) && Intrinsics.areEqual(this.g, c8.g);
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
        return ((hashCode5 + (webView != null ? webView.hashCode() : 0)) * 31) + this.g.hashCode();
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
        return "ISNNativeAdData(title=" + this.a + ", advertiser=" + this.b + ", body=" + this.c + ", cta=" + this.d + ", icon=" + this.e + ", mediaView=" + this.f + ", privacyIcon=" + this.g + ")";
    }

    public final C8 a(String str, String str2, String str3, String str4, Drawable drawable, WebView webView, View privacyIcon) {
        Intrinsics.checkNotNullParameter(privacyIcon, "privacyIcon");
        return new C8(str, str2, str3, str4, drawable, webView, privacyIcon);
    }

    public static /* synthetic */ C8 a(C8 c8, String str, String str2, String str3, String str4, Drawable drawable, WebView webView, View view, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c8.a;
        }
        if ((i & 2) != 0) {
            str2 = c8.b;
        }
        if ((i & 4) != 0) {
            str3 = c8.c;
        }
        if ((i & 8) != 0) {
            str4 = c8.d;
        }
        if ((i & 16) != 0) {
            drawable = c8.e;
        }
        if ((i & 32) != 0) {
            webView = c8.f;
        }
        if ((i & 64) != 0) {
            view = c8.g;
        }
        WebView webView2 = webView;
        View view2 = view;
        Drawable drawable2 = drawable;
        String str5 = str3;
        return c8.a(str, str2, str5, str4, drawable2, webView2, view2);
    }

    public static final class a {
        private final T8 a;
        private final InterfaceC2374d1 b;

        public a(T8 imageLoader, InterfaceC2374d1 adViewManagement) {
            Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
            Intrinsics.checkNotNullParameter(adViewManagement, "adViewManagement");
            this.a = imageLoader;
            this.b = adViewManagement;
        }

        private final Result<Drawable> b(String str) {
            if (str == null) {
                return null;
            }
            return Result.m11179boximpl(this.a.a(str));
        }

        public final b a(Context activityContext, JSONObject json) {
            String str;
            String str2;
            String str3;
            String str4;
            String b;
            String b2;
            String b3;
            String b4;
            Intrinsics.checkNotNullParameter(activityContext, "activityContext");
            Intrinsics.checkNotNullParameter(json, "json");
            JSONObject optJSONObject = json.optJSONObject("title");
            if (optJSONObject != null) {
                b4 = D8.b(optJSONObject, "text");
                str = b4;
            } else {
                str = null;
            }
            JSONObject optJSONObject2 = json.optJSONObject(X3.i.F0);
            if (optJSONObject2 != null) {
                b3 = D8.b(optJSONObject2, "text");
                str2 = b3;
            } else {
                str2 = null;
            }
            JSONObject optJSONObject3 = json.optJSONObject("body");
            if (optJSONObject3 != null) {
                b2 = D8.b(optJSONObject3, "text");
                str3 = b2;
            } else {
                str3 = null;
            }
            JSONObject optJSONObject4 = json.optJSONObject("cta");
            if (optJSONObject4 != null) {
                b = D8.b(optJSONObject4, "text");
                str4 = b;
            } else {
                str4 = null;
            }
            JSONObject optJSONObject5 = json.optJSONObject("icon");
            String b5 = optJSONObject5 != null ? D8.b(optJSONObject5, "url") : null;
            JSONObject optJSONObject6 = json.optJSONObject("media");
            String b6 = optJSONObject6 != null ? D8.b(optJSONObject6, "adViewId") : null;
            JSONObject optJSONObject7 = json.optJSONObject(X3.i.J0);
            return new b(new b.a(str, str2, str3, str4, b(b5), a(b6), C2780zd.a.a(activityContext, optJSONObject7 != null ? D8.b(optJSONObject7, "url") : null, this.a)));
        }

        private final Result<WebView> a(String str) {
            if (str == null) {
                return null;
            }
            G8 a = this.b.a(str);
            WebView presentingView = a != null ? a.getPresentingView() : null;
            if (presentingView == null) {
                Result.Companion companion = Result.INSTANCE;
                return Result.m11179boximpl(Result.m11180constructorimpl(ResultKt.createFailure(new Exception("missing adview for id: '" + str + "'"))));
            }
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m11179boximpl(Result.m11180constructorimpl(presentingView));
        }
    }
}
