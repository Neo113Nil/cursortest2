package com.ironsource;

import android.view.View;
import com.ironsource.C4430z8;
import com.ironsource.U3;
import defpackage.cn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class D8 {

    @NotNull
    private C4430z8 a;

    @Nullable
    private View b;

    @Nullable
    private View c;

    @Nullable
    private View d;

    @Nullable
    private View e;

    @Nullable
    private View f;

    @Nullable
    private View g;

    @NotNull
    private View h;

    @Nullable
    private a i;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface a {
        void a(@NotNull b bVar);

        void a(@NotNull Dg dg);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public enum b {
        Title("title"),
        Advertiser(U3.i.F0),
        Body("body"),
        Cta(U3.i.G0),
        Icon("icon"),
        Container("container"),
        PrivacyIcon(U3.i.J0);


        @NotNull
        private final String a;

        b(String str) {
            this.a = str;
        }

        @NotNull
        public final String b() {
            return this.a;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class c implements C4430z8.a {
        public c() {
        }

        @Override // com.ironsource.C4430z8.a
        public void a(@NotNull Dg dg) {
            dg.getClass();
            a n = D8.this.n();
            if (n != null) {
                n.a(dg);
            }
        }
    }

    public /* synthetic */ D8(C4430z8 c4430z8, View view, View view2, View view3, View view4, View view5, View view6, View view7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c4430z8, (i & 2) != 0 ? null : view, (i & 4) != 0 ? null : view2, (i & 8) != 0 ? null : view3, (i & 16) != 0 ? null : view4, (i & 32) != 0 ? null : view5, (i & 64) != 0 ? null : view6, view7);
    }

    public static /* synthetic */ D8 a(D8 d8, C4430z8 c4430z8, View view, View view2, View view3, View view4, View view5, View view6, View view7, int i, Object obj) {
        if ((i & 1) != 0) {
            c4430z8 = d8.a;
        }
        if ((i & 2) != 0) {
            view = d8.b;
        }
        if ((i & 4) != 0) {
            view2 = d8.c;
        }
        if ((i & 8) != 0) {
            view3 = d8.d;
        }
        if ((i & 16) != 0) {
            view4 = d8.e;
        }
        if ((i & 32) != 0) {
            view5 = d8.f;
        }
        if ((i & 64) != 0) {
            view6 = d8.g;
        }
        if ((i & 128) != 0) {
            view7 = d8.h;
        }
        View view8 = view6;
        View view9 = view7;
        View view10 = view4;
        View view11 = view5;
        return d8.a(c4430z8, view, view2, view3, view10, view11, view8, view9);
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

    @Nullable
    public final View c() {
        return this.c;
    }

    @Nullable
    public final View d() {
        return this.d;
    }

    @Nullable
    public final View e() {
        return this.e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D8)) {
            return false;
        }
        D8 d8 = (D8) obj;
        return Intrinsics.c(this.a, d8.a) && Intrinsics.c(this.b, d8.b) && Intrinsics.c(this.c, d8.c) && Intrinsics.c(this.d, d8.d) && Intrinsics.c(this.e, d8.e) && Intrinsics.c(this.f, d8.f) && Intrinsics.c(this.g, d8.g) && Intrinsics.c(this.h, d8.h);
    }

    public final void f(@NotNull View view) {
        view.getClass();
        this.h = view;
    }

    @Nullable
    public final View g() {
        return this.g;
    }

    @NotNull
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

    @Nullable
    public final View i() {
        return this.c;
    }

    @Nullable
    public final View j() {
        return this.e;
    }

    @NotNull
    public final C4430z8 k() {
        return this.a;
    }

    @Nullable
    public final View l() {
        return this.g;
    }

    @Nullable
    public final View m() {
        return this.d;
    }

    @Nullable
    public final a n() {
        return this.i;
    }

    @Nullable
    public final View o() {
        return this.f;
    }

    @NotNull
    public final View p() {
        return this.h;
    }

    @Nullable
    public final View q() {
        return this.b;
    }

    @NotNull
    public final JSONObject t() {
        JSONObject put = new JSONObject().put("title", this.b != null).put(U3.i.F0, this.c != null).put("body", this.e != null).put(U3.i.G0, this.g != null).put(U3.i.I0, this.f != null).put("icon", this.d != null);
        put.getClass();
        return put;
    }

    @NotNull
    public String toString() {
        return "ISNNativeAdViewHolder(containerView=" + this.a + ", titleView=" + this.b + ", advertiserView=" + this.c + ", iconView=" + this.d + ", bodyView=" + this.e + ", mediaView=" + this.f + ", ctaView=" + this.g + ", privacyIconView=" + this.h + ")";
    }

    public final void c(@Nullable View view) {
        this.g = view;
    }

    public final void d(@Nullable View view) {
        this.d = view;
    }

    public final void e(@Nullable View view) {
        this.f = view;
    }

    public final void g(@Nullable View view) {
        this.b = view;
    }

    @Nullable
    public final View b() {
        return this.b;
    }

    public final void b(@Nullable View view) {
        this.e = view;
    }

    @Nullable
    public final View f() {
        return this.f;
    }

    public D8(@NotNull C4430z8 c4430z8, @Nullable View view, @Nullable View view2, @Nullable View view3, @Nullable View view4, @Nullable View view5, @Nullable View view6, @NotNull View view7) {
        c4430z8.getClass();
        view7.getClass();
        this.a = c4430z8;
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

    @NotNull
    public final D8 a(@NotNull C4430z8 c4430z8, @Nullable View view, @Nullable View view2, @Nullable View view3, @Nullable View view4, @Nullable View view5, @Nullable View view6, @NotNull View view7) {
        c4430z8.getClass();
        view7.getClass();
        return new D8(c4430z8, view, view2, view3, view4, view5, view6, view7);
    }

    @NotNull
    public final C4430z8 a() {
        return this.a;
    }

    public final void a(@NotNull C4430z8 c4430z8) {
        c4430z8.getClass();
        this.a = c4430z8;
    }

    public final void a(@Nullable View view) {
        this.c = view;
    }

    public final void a(@Nullable a aVar) {
        this.i = aVar;
    }

    private static final void a(D8 d8, View view, b bVar) {
        if (view != null) {
            view.setOnClickListener(new cn(23, d8, bVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(D8 d8, b bVar, View view) {
        d8.getClass();
        bVar.getClass();
        a aVar = d8.i;
        if (aVar != null) {
            aVar.a(bVar);
        }
    }
}
