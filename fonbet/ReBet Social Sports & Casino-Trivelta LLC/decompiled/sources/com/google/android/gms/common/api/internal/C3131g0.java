package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.C3171d;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3117a;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.C3180d;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* renamed from: com.google.android.gms.common.api.internal.g0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3131g0 implements InterfaceC3168z0, k1 {

    /* renamed from: a, reason: collision with root package name */
    public final Lock f32502a;

    /* renamed from: b, reason: collision with root package name */
    public final Condition f32503b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f32504c;

    /* renamed from: d, reason: collision with root package name */
    public final C3171d f32505d;

    /* renamed from: e, reason: collision with root package name */
    public final HandlerC3129f0 f32506e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f32507f;

    /* renamed from: h, reason: collision with root package name */
    public final C3180d f32509h;

    /* renamed from: i, reason: collision with root package name */
    public final Map f32510i;

    /* renamed from: j, reason: collision with root package name */
    public final C3117a.AbstractC0488a f32511j;

    /* renamed from: k, reason: collision with root package name */
    public volatile InterfaceC3125d0 f32512k;

    /* renamed from: m, reason: collision with root package name */
    public int f32514m;

    /* renamed from: n, reason: collision with root package name */
    public final C3123c0 f32515n;

    /* renamed from: o, reason: collision with root package name */
    public final InterfaceC3164x0 f32516o;

    /* renamed from: g, reason: collision with root package name */
    public final Map f32508g = new HashMap();

    /* renamed from: l, reason: collision with root package name */
    public ConnectionResult f32513l = null;

    public C3131g0(Context context, C3123c0 c3123c0, Lock lock, Looper looper, C3171d c3171d, Map map, C3180d c3180d, Map map2, C3117a.AbstractC0488a abstractC0488a, ArrayList arrayList, InterfaceC3164x0 interfaceC3164x0) {
        this.f32504c = context;
        this.f32502a = lock;
        this.f32505d = c3171d;
        this.f32507f = map;
        this.f32509h = c3180d;
        this.f32510i = map2;
        this.f32511j = abstractC0488a;
        this.f32515n = c3123c0;
        this.f32516o = interfaceC3164x0;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((j1) arrayList.get(i10)).a(this);
        }
        this.f32506e = new HandlerC3129f0(this, looper);
        this.f32503b = lock.newCondition();
        this.f32512k = new Y(this);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3168z0
    public final void a() {
        this.f32512k.c();
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3168z0
    public final void b() {
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3168z0
    public final void c() {
        if (this.f32512k.g()) {
            this.f32508g.clear();
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3168z0
    public final boolean d(InterfaceC3155t interfaceC3155t) {
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3168z0
    public final void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mState=").println(this.f32512k);
        for (C3117a c3117a : this.f32510i.keySet()) {
            String valueOf = String.valueOf(str);
            printWriter.append((CharSequence) str).append((CharSequence) c3117a.d()).println(":");
            ((C3117a.f) AbstractC3191o.m((C3117a.f) this.f32507f.get(c3117a.b()))).dump(valueOf.concat("  "), fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3168z0
    public final AbstractC3124d f(AbstractC3124d abstractC3124d) {
        abstractC3124d.zak();
        this.f32512k.f(abstractC3124d);
        return abstractC3124d;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3128f
    public final void g(Bundle bundle) {
        this.f32502a.lock();
        try {
            this.f32512k.a(bundle);
        } finally {
            this.f32502a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3168z0
    public final boolean h() {
        return this.f32512k instanceof J;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3128f
    public final void i(int i10) {
        this.f32502a.lock();
        try {
            this.f32512k.e(i10);
        } finally {
            this.f32502a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.k1
    public final void i0(ConnectionResult connectionResult, C3117a c3117a, boolean z10) {
        this.f32502a.lock();
        try {
            this.f32512k.d(connectionResult, c3117a, z10);
        } finally {
            this.f32502a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3168z0
    public final AbstractC3124d j(AbstractC3124d abstractC3124d) {
        abstractC3124d.zak();
        return this.f32512k.h(abstractC3124d);
    }

    public final void m() {
        this.f32502a.lock();
        try {
            this.f32515n.x();
            this.f32512k = new J(this);
            this.f32512k.b();
            this.f32503b.signalAll();
        } finally {
            this.f32502a.unlock();
        }
    }

    public final void n() {
        C3131g0 c3131g0;
        this.f32502a.lock();
        try {
            c3131g0 = this;
            try {
                c3131g0.f32512k = new X(c3131g0, this.f32509h, this.f32510i, this.f32505d, this.f32511j, this.f32502a, this.f32504c);
                c3131g0.f32512k.b();
                c3131g0.f32503b.signalAll();
                c3131g0.f32502a.unlock();
            } catch (Throwable th2) {
                th = th2;
                c3131g0.f32502a.unlock();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            c3131g0 = this;
        }
    }

    public final void o(ConnectionResult connectionResult) {
        this.f32502a.lock();
        try {
            this.f32513l = connectionResult;
            this.f32512k = new Y(this);
            this.f32512k.b();
            this.f32503b.signalAll();
        } finally {
            this.f32502a.unlock();
        }
    }

    public final void p(AbstractC3127e0 abstractC3127e0) {
        HandlerC3129f0 handlerC3129f0 = this.f32506e;
        handlerC3129f0.sendMessage(handlerC3129f0.obtainMessage(1, abstractC3127e0));
    }

    public final void q(RuntimeException runtimeException) {
        HandlerC3129f0 handlerC3129f0 = this.f32506e;
        handlerC3129f0.sendMessage(handlerC3129f0.obtainMessage(2, runtimeException));
    }
}
