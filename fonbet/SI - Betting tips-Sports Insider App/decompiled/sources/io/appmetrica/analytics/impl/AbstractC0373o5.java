package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.networktasks.internal.ArgumentsMerger;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.o5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0373o5 implements InterfaceC0107dj {

    /* renamed from: a, reason: collision with root package name */
    public BaseRequestConfig f14395a;

    /* renamed from: b, reason: collision with root package name */
    public final BaseRequestConfig.RequestConfigLoader f14396b;

    /* renamed from: c, reason: collision with root package name */
    public L5 f14397c;

    public AbstractC0373o5(@NonNull BaseRequestConfig.RequestConfigLoader<Object, L5> requestConfigLoader, @NonNull C0161fm c0161fm, @NonNull ArgumentsMerger<Object, Object> argumentsMerger) {
        this.f14396b = requestConfigLoader;
        C0353na.k().v().a(this);
        a(new L5(c0161fm, C0353na.k().v(), C0353na.k().s(), argumentsMerger));
    }

    public final synchronized void a(@NonNull L5 l52) {
        this.f14397c = l52;
    }

    @NonNull
    public final synchronized ArgumentsMerger<Object, Object> b() {
        return (ArgumentsMerger) this.f14397c.componentArguments;
    }

    @NonNull
    public final synchronized C0161fm c() {
        return this.f14397c.f12506a;
    }

    public final void d() {
        synchronized (this) {
            this.f14395a = null;
        }
    }

    public final synchronized void e() {
        this.f14395a = null;
    }

    public synchronized void a(@NonNull Object obj) {
        if (!((ArgumentsMerger) this.f14397c.componentArguments).compareWithOtherArguments(obj)) {
            a(new L5(c(), C0353na.I.v(), C0353na.I.s(), (ArgumentsMerger) ((ArgumentsMerger) this.f14397c.componentArguments).mergeFrom(obj)));
            e();
        }
    }

    public final synchronized void a(@NonNull C0161fm c0161fm) {
        a(new L5(c0161fm, C0353na.I.v(), C0353na.I.s(), b()));
        e();
    }

    @NonNull
    public final synchronized BaseRequestConfig a() {
        try {
            if (this.f14395a == null) {
                this.f14395a = this.f14396b.load(this.f14397c);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f14395a;
    }
}
