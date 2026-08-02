package com.google.crypto.tink.internal;

import ab.InterfaceC1929b;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final g f37055b = new g();

    /* renamed from: c, reason: collision with root package name */
    public static final b f37056c = new b();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f37057a = new AtomicReference();

    public static class b implements InterfaceC1929b {
        public b() {
        }

        @Override // ab.InterfaceC1929b
        public InterfaceC1929b.a a(ab.c cVar, String str, String str2) {
            return f.f37054a;
        }
    }

    public static g b() {
        return f37055b;
    }

    public InterfaceC1929b a() {
        InterfaceC1929b interfaceC1929b = (InterfaceC1929b) this.f37057a.get();
        return interfaceC1929b == null ? f37056c : interfaceC1929b;
    }
}
