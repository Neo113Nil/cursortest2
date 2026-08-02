package Wg;

import ah.C2027t;
import ah.InterfaceC2019k;
import ah.P;
import bh.AbstractC2423b;
import ch.InterfaceC2925b;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final Og.b f13239a;

    /* renamed from: b, reason: collision with root package name */
    public final C2027t f13240b;

    /* renamed from: c, reason: collision with root package name */
    public final P f13241c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC2423b f13242d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC2019k f13243e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC2925b f13244f;

    public a(Og.b call, d data) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f13239a = call;
        this.f13240b = data.f();
        this.f13241c = data.h();
        this.f13242d = data.b();
        this.f13243e = data.e();
        this.f13244f = data.a();
    }

    @Override // ah.InterfaceC2025q
    public InterfaceC2019k a() {
        return this.f13243e;
    }

    @Override // Wg.b
    public InterfaceC2925b getAttributes() {
        return this.f13244f;
    }

    @Override // Wg.b, Ph.P
    public CoroutineContext getCoroutineContext() {
        return r().getCoroutineContext();
    }

    @Override // Wg.b
    public C2027t getMethod() {
        return this.f13240b;
    }

    @Override // Wg.b
    public P getUrl() {
        return this.f13241c;
    }

    @Override // Wg.b
    public Og.b r() {
        return this.f13239a;
    }
}
