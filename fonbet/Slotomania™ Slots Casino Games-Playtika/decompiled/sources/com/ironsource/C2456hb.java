package com.ironsource;

import com.ironsource.InterfaceC2474ib;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.hb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2456hb {
    private final C2491jb a;

    /* renamed from: com.ironsource.hb$a */
    public static final class a {
        private C2456hb a = new C2456hb(null);

        public final a a(String adUnitId) {
            Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
            this.a.a(adUnitId);
            return this;
        }

        public final a b(String placementName) {
            Intrinsics.checkNotNullParameter(placementName, "placementName");
            this.a.b(placementName);
            return this;
        }

        public final a a(InterfaceC2527lb listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.a.a(listener);
            return this;
        }

        public final C2456hb a() {
            return this.a;
        }
    }

    public /* synthetic */ C2456hb(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String c() {
        return this.a.i();
    }

    public final String d() {
        return this.a.j();
    }

    public final InterfaceC2474ib.a e() {
        return this.a.k();
    }

    public final AdapterNativeAdViewBinder f() {
        return this.a.l();
    }

    public final String g() {
        return this.a.m();
    }

    public final void h() {
        this.a.n();
    }

    private C2456hb() {
        this.a = new C2491jb(C2702v7.a.a(), this);
    }

    public final void a() {
        this.a.f();
    }

    public final String b() {
        return this.a.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str) {
        this.a.a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(String str) {
        this.a.b(str);
    }

    public final void a(InterfaceC2527lb interfaceC2527lb) {
        this.a.a(interfaceC2527lb);
    }
}
