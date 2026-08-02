package com.ironsource;

import android.view.View;
import com.ironsource.B8;
import com.ironsource.X3;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class F8 {
    private B8 a;
    private View b;
    private View c;
    private View d;
    private View e;
    private View f;
    private View g;
    private View h;
    private a i;

    public interface a {
        void a(Ag ag);

        void a(b bVar);
    }

    public enum b {
        Title("title"),
        Advertiser(X3.i.F0),
        Body("body"),
        Cta("cta"),
        Icon("icon"),
        Container("container"),
        PrivacyIcon(X3.i.J0);

        private final String a;

        b(String str) {
            this.a = str;
        }

        public final String b() {
            return this.a;
        }
    }

    public static final class c implements B8.a {
        c() {
        }

        @Override // com.ironsource.B8.a
        public void a(Ag viewVisibilityParams) {
            Intrinsics.checkNotNullParameter(viewVisibilityParams, "viewVisibilityParams");
            a n = F8.this.n();
            if (n != null) {
                n.a(viewVisibilityParams);
            }
        }
    }

    public F8(B8 containerView, View view, View view2, View view3, View view4, View view5, View view6, View privacyIconView) {
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(privacyIconView, "privacyIconView");
        this.a = containerView;
        this.b = view;
        this.c = view2;
        this.d = view3;
        this.e = view4;
        this.f = view5;
        this.g = view6;
        this.h = privacyIconView;
        r();
        s();
    }

    private final void r() {
        a(this, this.b, b.Title);
        a(this, this.c, b.Advertiser);
        a(this, this.e, b.Body);
        a(this, this.g, b.Cta);
        a(this, this.d, b.Icon);
        a(this, this.a, b.Container);
        a(this, this.h, b.PrivacyIcon);
    }

    private final void s() {
        this.a.setListener$mediationsdk_release(new c());
    }

    public final B8 a() {
        return this.a;
    }

    public final View b() {
        return this.b;
    }

    public final View c() {
        return this.c;
    }

    public final View d() {
        return this.d;
    }

    public final View e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F8)) {
            return false;
        }
        F8 f8 = (F8) obj;
        return Intrinsics.areEqual(this.a, f8.a) && Intrinsics.areEqual(this.b, f8.b) && Intrinsics.areEqual(this.c, f8.c) && Intrinsics.areEqual(this.d, f8.d) && Intrinsics.areEqual(this.e, f8.e) && Intrinsics.areEqual(this.f, f8.f) && Intrinsics.areEqual(this.g, f8.g) && Intrinsics.areEqual(this.h, f8.h);
    }

    public final View f() {
        return this.f;
    }

    public final View g() {
        return this.g;
    }

    public final View h() {
        return this.h;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        View view = this.b;
        int hashCode2 = (hashCode + (view == null ? 0 : view.hashCode())) * 31;
        View view2 = this.c;
        int hashCode3 = (hashCode2 + (view2 == null ? 0 : view2.hashCode())) * 31;
        View view3 = this.d;
        int hashCode4 = (hashCode3 + (view3 == null ? 0 : view3.hashCode())) * 31;
        View view4 = this.e;
        int hashCode5 = (hashCode4 + (view4 == null ? 0 : view4.hashCode())) * 31;
        View view5 = this.f;
        int hashCode6 = (hashCode5 + (view5 == null ? 0 : view5.hashCode())) * 31;
        View view6 = this.g;
        return ((hashCode6 + (view6 != null ? view6.hashCode() : 0)) * 31) + this.h.hashCode();
    }

    public final View i() {
        return this.c;
    }

    public final View j() {
        return this.e;
    }

    public final B8 k() {
        return this.a;
    }

    public final View l() {
        return this.g;
    }

    public final View m() {
        return this.d;
    }

    public final a n() {
        return this.i;
    }

    public final View o() {
        return this.f;
    }

    public final View p() {
        return this.h;
    }

    public final View q() {
        return this.b;
    }

    public final JSONObject t() {
        JSONObject put = IronSourceNetworkBridge.jsonObjectInit().put("title", this.b != null).put(X3.i.F0, this.c != null).put("body", this.e != null).put("cta", this.g != null).put("media", this.f != null).put("icon", this.d != null);
        Intrinsics.checkNotNullExpressionValue(put, "JSONObject()\n        .pu…\"icon\", iconView != null)");
        return put;
    }

    public String toString() {
        return "ISNNativeAdViewHolder(containerView=" + this.a + ", titleView=" + this.b + ", advertiserView=" + this.c + ", iconView=" + this.d + ", bodyView=" + this.e + ", mediaView=" + this.f + ", ctaView=" + this.g + ", privacyIconView=" + this.h + ")";
    }

    public final F8 a(B8 containerView, View view, View view2, View view3, View view4, View view5, View view6, View privacyIconView) {
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(privacyIconView, "privacyIconView");
        return new F8(containerView, view, view2, view3, view4, view5, view6, privacyIconView);
    }

    public final void b(View view) {
        this.e = view;
    }

    public final void c(View view) {
        this.g = view;
    }

    public final void d(View view) {
        this.d = view;
    }

    public final void e(View view) {
        this.f = view;
    }

    public final void f(View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.h = view;
    }

    public final void g(View view) {
        this.b = view;
    }

    public static /* synthetic */ F8 a(F8 f8, B8 b8, View view, View view2, View view3, View view4, View view5, View view6, View view7, int i, Object obj) {
        if ((i & 1) != 0) {
            b8 = f8.a;
        }
        if ((i & 2) != 0) {
            view = f8.b;
        }
        if ((i & 4) != 0) {
            view2 = f8.c;
        }
        if ((i & 8) != 0) {
            view3 = f8.d;
        }
        if ((i & 16) != 0) {
            view4 = f8.e;
        }
        if ((i & 32) != 0) {
            view5 = f8.f;
        }
        if ((i & 64) != 0) {
            view6 = f8.g;
        }
        if ((i & 128) != 0) {
            view7 = f8.h;
        }
        View view8 = view6;
        View view9 = view7;
        View view10 = view4;
        View view11 = view5;
        return f8.a(b8, view, view2, view3, view10, view11, view8, view9);
    }

    public final void a(B8 b8) {
        Intrinsics.checkNotNullParameter(b8, "<set-?>");
        this.a = b8;
    }

    public final void a(View view) {
        this.c = view;
    }

    public final void a(a aVar) {
        this.i = aVar;
    }

    private static final void a(final F8 f8, View view, final b bVar) {
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.ironsource.F8$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    F8.a(F8.this, bVar, view2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(F8 this$0, b viewName, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(viewName, "$viewName");
        a aVar = this$0.i;
        if (aVar != null) {
            aVar.a(viewName);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ F8(B8 b8, View view, View view2, View view3, View view4, View view5, View view6, View view7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(b8, view, view2, view3, view4, view5, r9, r10);
        View view8;
        View view9;
        view = (i & 2) != 0 ? null : view;
        view2 = (i & 4) != 0 ? null : view2;
        view3 = (i & 8) != 0 ? null : view3;
        view4 = (i & 16) != 0 ? null : view4;
        view5 = (i & 32) != 0 ? null : view5;
        if ((i & 64) != 0) {
            view8 = view7;
            view9 = null;
        } else {
            view8 = view7;
            view9 = view6;
        }
    }
}
