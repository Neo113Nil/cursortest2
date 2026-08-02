package com.ironsource.mediationsdk;

import com.ironsource.C3959aa;
import com.ironsource.C4102h2;
import com.ironsource.Z1;
import com.ironsource.mediationsdk.IronSource;
import defpackage.wx4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class h {

    @NotNull
    private final IronSource.a a;

    @NotNull
    private final ArrayList<C4102h2> b;
    private boolean c;

    @NotNull
    private String d;
    private boolean e;

    @NotNull
    private Map<String, Object> f;

    @NotNull
    private List<String> g;
    private int h;

    @Nullable
    private Z1 i;

    @Nullable
    private C3959aa j;

    @NotNull
    private String k;

    @Nullable
    private ISBannerSize l;
    private boolean m;
    private boolean n;
    private boolean o;

    @Nullable
    private String p;

    @Nullable
    private String q;

    @Nullable
    private Boolean r;

    @Nullable
    private Double s;

    @Nullable
    private String t;

    public h(@NotNull IronSource.a aVar) {
        aVar.getClass();
        this.a = aVar;
        this.b = new ArrayList<>();
        this.d = "";
        this.f = new HashMap();
        this.g = new ArrayList();
        this.h = -1;
        this.k = "";
    }

    public static /* synthetic */ h a(h hVar, IronSource.a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = hVar.a;
        }
        return hVar.a(aVar);
    }

    public final void b(boolean z) {
        this.e = z;
    }

    public final void c(@NotNull String str) {
        str.getClass();
        this.d = str;
    }

    public final void d(boolean z) {
        this.n = z;
    }

    public final void e(@NotNull String str) {
        str.getClass();
        this.k = str;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.a == ((h) obj).a;
    }

    @Nullable
    public final ISBannerSize f() {
        return this.l;
    }

    @Nullable
    public final Double g() {
        return this.s;
    }

    @NotNull
    public final Map<String, Object> h() {
        return this.f;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public final String j() {
        return this.d;
    }

    @NotNull
    public final ArrayList<C4102h2> k() {
        return this.b;
    }

    @NotNull
    public final List<String> l() {
        return this.g;
    }

    @Nullable
    public final String n() {
        return this.t;
    }

    @Nullable
    public final C3959aa o() {
        return this.j;
    }

    public final int p() {
        return this.h;
    }

    public final boolean q() {
        return this.n;
    }

    public final boolean r() {
        return this.o;
    }

    @NotNull
    public final String s() {
        return this.k;
    }

    public final boolean t() {
        return this.m;
    }

    @NotNull
    public String toString() {
        return "AuctionRequestParams(adUnit=" + this.a + ")";
    }

    public final boolean u() {
        return this.e;
    }

    @Nullable
    public final Boolean v() {
        return this.r;
    }

    public final boolean w() {
        return this.c;
    }

    public final void b(@Nullable String str) {
        this.p = str;
    }

    @Nullable
    public final String d() {
        return this.p;
    }

    @Nullable
    public final String b() {
        return this.q;
    }

    public final void d(@Nullable String str) {
        this.t = str;
    }

    public final void c(boolean z) {
        this.c = z;
    }

    @Nullable
    public final Z1 e() {
        return this.i;
    }

    @NotNull
    public final IronSource.a c() {
        return this.a;
    }

    public final void e(boolean z) {
        this.o = z;
    }

    @NotNull
    public final h a(@NotNull IronSource.a aVar) {
        aVar.getClass();
        return new h(aVar);
    }

    @NotNull
    public final IronSource.a a() {
        return this.a;
    }

    public final void a(@NotNull C4102h2 c4102h2) {
        c4102h2.getClass();
        this.b.add(c4102h2);
    }

    public final void a(@NotNull Map<String, Object> map) {
        map.getClass();
        this.f = map;
    }

    public final void a(@NotNull List<String> list) {
        list.getClass();
        this.g = list;
    }

    public final void a(int i) {
        this.h = i;
    }

    public final void a(@Nullable Z1 z1) {
        this.i = z1;
    }

    @wx4
    public static /* synthetic */ void i() {
    }

    @wx4
    public static /* synthetic */ void m() {
    }

    public final void a(@Nullable C3959aa c3959aa) {
        this.j = c3959aa;
    }

    public final void a(@Nullable ISBannerSize iSBannerSize) {
        this.l = iSBannerSize;
    }

    public final void a(boolean z) {
        this.m = z;
    }

    public final void a(@Nullable String str) {
        this.q = str;
    }

    public final void a(@Nullable Boolean bool) {
        this.r = bool;
    }

    public final void a(@Nullable Double d) {
        this.s = d;
    }
}
