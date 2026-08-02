package com.ironsource;

import android.view.View;
import com.ironsource.C8;
import com.ironsource.X3;
import org.json.JSONObject;
import xsna.epx;
import xsna.wpb;
import xsna.zcl;

/* loaded from: classes13.dex */
public final class G8 {
    private C8 a;
    private View b;
    private View c;
    private View d;
    private View e;
    private View f;
    private View g;
    private View h;
    private a i;

    public interface a {
        void a(b bVar);

        void a(Gg gg);
    }

    public enum b {
        Title("title"),
        Advertiser(X3.i.F0),
        Body("body"),
        Cta(X3.i.G0),
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

    public static final class c implements C8.a {
        public c() {
        }

        @Override // com.ironsource.C8.a
        public void a(Gg gg) {
            a n = G8.this.n();
            if (n != null) {
                n.a(gg);
            }
        }
    }

    public G8(C8 c8, View view, View view2, View view3, View view4, View view5, View view6, View view7) {
        this.a = c8;
        this.b = view;
        this.c = view2;
        this.d = view3;
        this.e = view4;
        this.f = view5;
        this.g = view6;
        this.h = view7;
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

    public final C8 a() {
        return this.a;
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
        if (!(obj instanceof G8)) {
            return false;
        }
        G8 g8 = (G8) obj;
        return epx.f(this.a, g8.a) && epx.f(this.b, g8.b) && epx.f(this.c, g8.c) && epx.f(this.d, g8.d) && epx.f(this.e, g8.e) && epx.f(this.f, g8.f) && epx.f(this.g, g8.g) && epx.f(this.h, g8.h);
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
        return this.h.hashCode() + ((hashCode6 + (view6 != null ? view6.hashCode() : 0)) * 31);
    }

    public final View i() {
        return this.c;
    }

    public final View j() {
        return this.e;
    }

    public final C8 k() {
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
        return new JSONObject().put("title", this.b != null).put(X3.i.F0, this.c != null).put("body", this.e != null).put(X3.i.G0, this.g != null).put(X3.i.I0, this.f != null).put("icon", this.d != null);
    }

    public String toString() {
        return "ISNNativeAdViewHolder(containerView=" + this.a + ", titleView=" + this.b + ", advertiserView=" + this.c + ", iconView=" + this.d + ", bodyView=" + this.e + ", mediaView=" + this.f + ", ctaView=" + this.g + ", privacyIconView=" + this.h + ")";
    }

    public final G8 a(C8 c8, View view, View view2, View view3, View view4, View view5, View view6, View view7) {
        return new G8(c8, view, view2, view3, view4, view5, view6, view7);
    }

    public final View b() {
        return this.b;
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
        this.h = view;
    }

    public final void g(View view) {
        this.b = view;
    }

    public static /* synthetic */ G8 a(G8 g8, C8 c8, View view, View view2, View view3, View view4, View view5, View view6, View view7, int i, Object obj) {
        if ((i & 1) != 0) {
            c8 = g8.a;
        }
        if ((i & 2) != 0) {
            view = g8.b;
        }
        if ((i & 4) != 0) {
            view2 = g8.c;
        }
        if ((i & 8) != 0) {
            view3 = g8.d;
        }
        if ((i & 16) != 0) {
            view4 = g8.e;
        }
        if ((i & 32) != 0) {
            view5 = g8.f;
        }
        if ((i & 64) != 0) {
            view6 = g8.g;
        }
        if ((i & 128) != 0) {
            view7 = g8.h;
        }
        View view8 = view6;
        View view9 = view7;
        View view10 = view4;
        View view11 = view5;
        return g8.a(c8, view, view2, view3, view10, view11, view8, view9);
    }

    public final void b(View view) {
        this.e = view;
    }

    public final void a(C8 c8) {
        this.a = c8;
    }

    public final void a(View view) {
        this.c = view;
    }

    public final void a(a aVar) {
        this.i = aVar;
    }

    private static final void a(G8 g8, View view, b bVar) {
        if (view != null) {
            view.setOnClickListener(new wpb(1, g8, bVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(G8 g8, b bVar, View view) {
        a aVar = g8.i;
        if (aVar != null) {
            aVar.a(bVar);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ G8(C8 c8, View view, View view2, View view3, View view4, View view5, View view6, View view7, int i, zcl zclVar) {
        this(c8, view, view2, view3, view4, view5, r9, r10);
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
