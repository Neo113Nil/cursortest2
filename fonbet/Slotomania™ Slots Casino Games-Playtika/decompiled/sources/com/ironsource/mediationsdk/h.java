package com.ironsource.mediationsdk;

import com.ironsource.C2329aa;
import com.ironsource.C2339b2;
import com.ironsource.C2482j2;
import com.ironsource.mediationsdk.IronSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class h {
    private final IronSource.a a;
    private final ArrayList<C2482j2> b;
    private boolean c;
    private String d;
    private boolean e;
    private Map<String, Object> f;
    private List<String> g;
    private int h;
    private C2339b2 i;
    private C2329aa j;
    private String k;
    private ISBannerSize l;
    private boolean m;
    private boolean n;
    private boolean o;
    private String p;
    private String q;
    private Boolean r;
    private Double s;
    private String t;

    public h(IronSource.a adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.a = adUnit;
        this.b = new ArrayList<>();
        this.d = "";
        this.f = new HashMap();
        this.g = new ArrayList();
        this.h = -1;
        this.k = "";
    }

    @Deprecated(message = "Use instancesInfo instead")
    public static /* synthetic */ void i() {
    }

    @Deprecated(message = "Use instancesInfo instead")
    public static /* synthetic */ void m() {
    }

    public final IronSource.a a() {
        return this.a;
    }

    public final void b(boolean z) {
        this.e = z;
    }

    public final IronSource.a c() {
        return this.a;
    }

    public final void d(boolean z) {
        this.n = z;
    }

    public final C2339b2 e() {
        return this.i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.a == ((h) obj).a;
    }

    public final ISBannerSize f() {
        return this.l;
    }

    public final Double g() {
        return this.s;
    }

    public final Map<String, Object> h() {
        return this.f;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public final String j() {
        return this.d;
    }

    public final ArrayList<C2482j2> k() {
        return this.b;
    }

    public final List<String> l() {
        return this.g;
    }

    public final String n() {
        return this.t;
    }

    public final C2329aa o() {
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

    public final String s() {
        return this.k;
    }

    public final boolean t() {
        return this.m;
    }

    public String toString() {
        return "AuctionRequestParams(adUnit=" + this.a + ")";
    }

    public final boolean u() {
        return this.e;
    }

    public final Boolean v() {
        return this.r;
    }

    public final boolean w() {
        return this.c;
    }

    public final h a(IronSource.a adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        return new h(adUnit);
    }

    public final void b(String str) {
        this.p = str;
    }

    public final void c(boolean z) {
        this.c = z;
    }

    public final String d() {
        return this.p;
    }

    public final void e(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.k = str;
    }

    public static /* synthetic */ h a(h hVar, IronSource.a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = hVar.a;
        }
        return hVar.a(aVar);
    }

    public final String b() {
        return this.q;
    }

    public final void c(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.d = str;
    }

    public final void d(String str) {
        this.t = str;
    }

    public final void e(boolean z) {
        this.o = z;
    }

    public final void a(C2482j2 instanceInfo) {
        Intrinsics.checkNotNullParameter(instanceInfo, "instanceInfo");
        this.b.add(instanceInfo);
    }

    public final void a(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.f = map;
    }

    public final void a(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.g = list;
    }

    public final void a(int i) {
        this.h = i;
    }

    public final void a(C2339b2 c2339b2) {
        this.i = c2339b2;
    }

    public final void a(C2329aa c2329aa) {
        this.j = c2329aa;
    }

    public final void a(ISBannerSize iSBannerSize) {
        this.l = iSBannerSize;
    }

    public final void a(boolean z) {
        this.m = z;
    }

    public final void a(String str) {
        this.q = str;
    }

    public final void a(Boolean bool) {
        this.r = bool;
    }

    public final void a(Double d) {
        this.s = d;
    }
}
