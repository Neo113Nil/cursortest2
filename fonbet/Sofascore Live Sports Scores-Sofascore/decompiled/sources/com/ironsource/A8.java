package com.ironsource;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.webkit.WebView;
import com.ironsource.U3;
import defpackage.bf3;
import defpackage.lnb;
import defpackage.mz1;
import defpackage.p2g;
import defpackage.u2g;
import defpackage.w2g;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class A8 {

    @Nullable
    private final String a;

    @Nullable
    private final String b;

    @Nullable
    private final String c;

    @Nullable
    private final String d;

    @Nullable
    private final Drawable e;

    @Nullable
    private final WebView f;

    @NotNull
    private final View g;

    public A8(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Drawable drawable, @Nullable WebView webView, @NotNull View view) {
        view.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = drawable;
        this.f = webView;
        this.g = view;
    }

    public static /* synthetic */ A8 a(A8 a8, String str, String str2, String str3, String str4, Drawable drawable, WebView webView, View view, int i, Object obj) {
        if ((i & 1) != 0) {
            str = a8.a;
        }
        if ((i & 2) != 0) {
            str2 = a8.b;
        }
        if ((i & 4) != 0) {
            str3 = a8.c;
        }
        if ((i & 8) != 0) {
            str4 = a8.d;
        }
        if ((i & 16) != 0) {
            drawable = a8.e;
        }
        if ((i & 32) != 0) {
            webView = a8.f;
        }
        if ((i & 64) != 0) {
            view = a8.g;
        }
        WebView webView2 = webView;
        View view2 = view;
        Drawable drawable2 = drawable;
        String str5 = str3;
        return a8.a(str, str2, str5, str4, drawable2, webView2, view2);
    }

    @Nullable
    public final String b() {
        return this.b;
    }

    @Nullable
    public final String c() {
        return this.c;
    }

    @Nullable
    public final String d() {
        return this.d;
    }

    @Nullable
    public final Drawable e() {
        return this.e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A8)) {
            return false;
        }
        A8 a8 = (A8) obj;
        return Intrinsics.c(this.a, a8.a) && Intrinsics.c(this.b, a8.b) && Intrinsics.c(this.c, a8.c) && Intrinsics.c(this.d, a8.d) && Intrinsics.c(this.e, a8.e) && Intrinsics.c(this.f, a8.f) && Intrinsics.c(this.g, a8.g);
    }

    @Nullable
    public final WebView f() {
        return this.f;
    }

    @NotNull
    public final View g() {
        return this.g;
    }

    @Nullable
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

    @Nullable
    public final String i() {
        return this.c;
    }

    @Nullable
    public final String j() {
        return this.d;
    }

    @Nullable
    public final Drawable k() {
        return this.e;
    }

    @Nullable
    public final WebView l() {
        return this.f;
    }

    @NotNull
    public final View m() {
        return this.g;
    }

    @Nullable
    public final String n() {
        return this.a;
    }

    @NotNull
    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String str4 = this.d;
        Drawable drawable = this.e;
        WebView webView = this.f;
        View view = this.g;
        StringBuilder s = mz1.s("ISNNativeAdData(title=", str, ", advertiser=", str2, ", body=");
        bf3.v(s, str3, ", cta=", str4, ", icon=");
        s.append(drawable);
        s.append(", mediaView=");
        s.append(webView);
        s.append(", privacyIcon=");
        s.append(view);
        s.append(")");
        return s.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class b {

        @NotNull
        private final a a;

        public b(@NotNull a aVar) {
            aVar.getClass();
            this.a = aVar;
        }

        private static final <T> void a(JSONObject jSONObject, String str, Object obj) {
            JSONObject jSONObject2 = new JSONObject();
            p2g p2gVar = w2g.b;
            jSONObject2.put("success", !(obj instanceof u2g));
            Throwable a2 = w2g.a(obj);
            if (a2 != null) {
                String message = a2.getMessage();
                if (message == null) {
                    message = "unknown reason";
                }
                jSONObject2.put("reason", message);
            }
            Unit unit = Unit.a;
            jSONObject.put(str, jSONObject2);
        }

        @NotNull
        public final JSONObject b() {
            JSONObject jSONObject = new JSONObject();
            if (this.a.o() != null) {
                a(jSONObject, "title");
            }
            if (this.a.i() != null) {
                a(jSONObject, U3.i.F0);
            }
            if (this.a.j() != null) {
                a(jSONObject, "body");
            }
            if (this.a.k() != null) {
                a(jSONObject, U3.i.G0);
            }
            w2g l = this.a.l();
            if (l != null) {
                a(jSONObject, "icon", l.a);
            }
            w2g m = this.a.m();
            if (m != null) {
                a(jSONObject, U3.i.I0, m.a);
            }
            return jSONObject;
        }

        private static final void a(JSONObject jSONObject, String str) {
            jSONObject.put(str, new JSONObject().put("success", true));
        }

        @NotNull
        public final a a() {
            return this.a;
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static final class a {

            @Nullable
            private final String a;

            @Nullable
            private final String b;

            @Nullable
            private final String c;

            @Nullable
            private final String d;

            @Nullable
            private final w2g e;

            @Nullable
            private final w2g f;

            @NotNull
            private final View g;

            public a(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable w2g w2gVar, @Nullable w2g w2gVar2, @NotNull View view) {
                view.getClass();
                this.a = str;
                this.b = str2;
                this.c = str3;
                this.d = str4;
                this.e = w2gVar;
                this.f = w2gVar2;
                this.g = view;
            }

            public static /* synthetic */ a a(a aVar, String str, String str2, String str3, String str4, w2g w2gVar, w2g w2gVar2, View view, int i, Object obj) {
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
                    w2gVar = aVar.e;
                }
                if ((i & 32) != 0) {
                    w2gVar2 = aVar.f;
                }
                if ((i & 64) != 0) {
                    view = aVar.g;
                }
                w2g w2gVar3 = w2gVar2;
                View view2 = view;
                w2g w2gVar4 = w2gVar;
                String str5 = str3;
                return aVar.a(str, str2, str5, str4, w2gVar4, w2gVar3, view2);
            }

            @Nullable
            public final String b() {
                return this.b;
            }

            @Nullable
            public final String c() {
                return this.c;
            }

            @Nullable
            public final String d() {
                return this.d;
            }

            @Nullable
            public final w2g e() {
                return this.e;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return Intrinsics.c(this.a, aVar.a) && Intrinsics.c(this.b, aVar.b) && Intrinsics.c(this.c, aVar.c) && Intrinsics.c(this.d, aVar.d) && Intrinsics.c(this.e, aVar.e) && Intrinsics.c(this.f, aVar.f) && Intrinsics.c(this.g, aVar.g);
            }

            @Nullable
            public final w2g f() {
                return this.f;
            }

            @NotNull
            public final View g() {
                return this.g;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @NotNull
            public final A8 h() {
                Drawable drawable;
                String str = this.a;
                String str2 = this.b;
                String str3 = this.c;
                String str4 = this.d;
                w2g w2gVar = this.e;
                if (w2gVar != null) {
                    Object obj = w2gVar.a;
                    if (obj instanceof u2g) {
                        obj = null;
                    }
                    drawable = (Drawable) obj;
                } else {
                    drawable = null;
                }
                w2g w2gVar2 = this.f;
                if (w2gVar2 != null) {
                    Object obj2 = w2gVar2.a;
                    r6 = obj2 instanceof u2g ? null : obj2;
                }
                return new A8(str, str2, str3, str4, drawable, r6, this.g);
            }

            public int hashCode() {
                Object obj;
                Object obj2;
                String str = this.a;
                int i = 0;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.b;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.c;
                int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.d;
                int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                w2g w2gVar = this.e;
                int hashCode5 = (hashCode4 + ((w2gVar == null || (obj = w2gVar.a) == null) ? 0 : obj.hashCode())) * 31;
                w2g w2gVar2 = this.f;
                if (w2gVar2 != null && (obj2 = w2gVar2.a) != null) {
                    i = obj2.hashCode();
                }
                return this.g.hashCode() + ((hashCode5 + i) * 31);
            }

            @Nullable
            public final String i() {
                return this.b;
            }

            @Nullable
            public final String j() {
                return this.c;
            }

            @Nullable
            public final String k() {
                return this.d;
            }

            @Nullable
            public final w2g l() {
                return this.e;
            }

            @Nullable
            public final w2g m() {
                return this.f;
            }

            @NotNull
            public final View n() {
                return this.g;
            }

            @Nullable
            public final String o() {
                return this.a;
            }

            @NotNull
            public String toString() {
                String str = this.a;
                String str2 = this.b;
                String str3 = this.c;
                String str4 = this.d;
                w2g w2gVar = this.e;
                w2g w2gVar2 = this.f;
                View view = this.g;
                StringBuilder s = mz1.s("Data(title=", str, ", advertiser=", str2, ", body=");
                bf3.v(s, str3, ", cta=", str4, ", icon=");
                s.append(w2gVar);
                s.append(", media=");
                s.append(w2gVar2);
                s.append(", privacyIcon=");
                s.append(view);
                s.append(")");
                return s.toString();
            }

            @NotNull
            public final a a(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable w2g w2gVar, @Nullable w2g w2gVar2, @NotNull View view) {
                view.getClass();
                return new a(str, str2, str3, str4, w2gVar, w2gVar2, view);
            }

            @Nullable
            public final String a() {
                return this.a;
            }
        }
    }

    @NotNull
    public final A8 a(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Drawable drawable, @Nullable WebView webView, @NotNull View view) {
        view.getClass();
        return new A8(str, str2, str3, str4, drawable, webView, view);
    }

    @Nullable
    public final String a() {
        return this.a;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {

        @NotNull
        private final T8 a;

        @NotNull
        private final InterfaceC3993b1 b;

        public a(@NotNull T8 t8, @NotNull InterfaceC3993b1 interfaceC3993b1) {
            t8.getClass();
            interfaceC3993b1.getClass();
            this.a = t8;
            this.b = interfaceC3993b1;
        }

        private final w2g b(String str) {
            if (str == null) {
                return null;
            }
            return new w2g(this.a.a(str));
        }

        @NotNull
        public final b a(@NotNull Context context, @NotNull JSONObject jSONObject) {
            String str;
            String str2;
            String str3;
            String str4;
            String b;
            String b2;
            String b3;
            String b4;
            context.getClass();
            jSONObject.getClass();
            JSONObject optJSONObject = jSONObject.optJSONObject("title");
            if (optJSONObject != null) {
                b4 = B8.b(optJSONObject, "text");
                str = b4;
            } else {
                str = null;
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject(U3.i.F0);
            if (optJSONObject2 != null) {
                b3 = B8.b(optJSONObject2, "text");
                str2 = b3;
            } else {
                str2 = null;
            }
            JSONObject optJSONObject3 = jSONObject.optJSONObject("body");
            if (optJSONObject3 != null) {
                b2 = B8.b(optJSONObject3, "text");
                str3 = b2;
            } else {
                str3 = null;
            }
            JSONObject optJSONObject4 = jSONObject.optJSONObject(U3.i.G0);
            if (optJSONObject4 != null) {
                b = B8.b(optJSONObject4, "text");
                str4 = b;
            } else {
                str4 = null;
            }
            JSONObject optJSONObject5 = jSONObject.optJSONObject("icon");
            String b5 = optJSONObject5 != null ? B8.b(optJSONObject5, "url") : null;
            JSONObject optJSONObject6 = jSONObject.optJSONObject(U3.i.I0);
            String b6 = optJSONObject6 != null ? B8.b(optJSONObject6, "adViewId") : null;
            JSONObject optJSONObject7 = jSONObject.optJSONObject(U3.i.J0);
            return new b(new b.a(str, str2, str3, str4, b(b5), a(b6), C4417yd.a.a(context, optJSONObject7 != null ? B8.b(optJSONObject7, "url") : null, this.a)));
        }

        private final w2g a(String str) {
            if (str == null) {
                return null;
            }
            E8 a = this.b.a(str);
            WebView presentingView = a != null ? a.getPresentingView() : null;
            if (presentingView == null) {
                p2g p2gVar = w2g.b;
                return new w2g(new u2g(new Exception(lnb.o("missing adview for id: '", str, "'"))));
            }
            return new w2g(presentingView);
        }
    }
}
