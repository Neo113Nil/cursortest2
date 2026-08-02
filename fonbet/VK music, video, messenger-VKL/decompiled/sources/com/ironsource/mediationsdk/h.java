package com.ironsource.mediationsdk;

import com.ironsource.C4235b2;
import com.ironsource.C4243ba;
import com.ironsource.C4378j2;
import com.ironsource.mediationsdk.IronSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import xsna.ozl;

/* loaded from: classes13.dex */
public final class h {
    private final IronSource.a a;
    private boolean c;
    private boolean e;
    private C4235b2 i;
    private C4243ba j;
    private ISBannerSize l;
    private boolean m;
    private boolean n;
    private boolean o;
    private String p;
    private String q;
    private Boolean r;
    private Double s;
    private String t;
    private final ArrayList<C4378j2> b = new ArrayList<>();
    private String d = "";
    private Map<String, Object> f = new HashMap();
    private List<String> g = new ArrayList();
    private int h = -1;
    private String k = "";

    public h(IronSource.a aVar) {
        this.a = aVar;
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

    public final C4235b2 e() {
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

    public final ArrayList<C4378j2> k() {
        return this.b;
    }

    public final List<String> l() {
        return this.g;
    }

    public final String n() {
        return this.t;
    }

    public final C4243ba o() {
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

    public final h a(IronSource.a aVar) {
        return new h(aVar);
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
        this.d = str;
    }

    public final void d(String str) {
        this.t = str;
    }

    public final void e(boolean z) {
        this.o = z;
    }

    public final void a(C4378j2 c4378j2) {
        this.b.add(c4378j2);
    }

    public final void a(Map<String, Object> map) {
        this.f = map;
    }

    public final void a(List<String> list) {
        this.g = list;
    }

    public final void a(int i) {
        this.h = i;
    }

    public final void a(C4235b2 c4235b2) {
        this.i = c4235b2;
    }

    public final void a(C4243ba c4243ba) {
        this.j = c4243ba;
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

    @ozl
    public static /* synthetic */ void i() {
    }

    @ozl
    public static /* synthetic */ void m() {
    }
}
