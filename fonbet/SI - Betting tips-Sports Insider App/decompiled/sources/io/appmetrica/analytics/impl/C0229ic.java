package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AnrListener;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.ic, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0229ic {

    /* renamed from: a, reason: collision with root package name */
    public int f13940a = 5;

    /* renamed from: b, reason: collision with root package name */
    public final C0112e f13941b;

    public C0229ic(InterfaceC0165g0 interfaceC0165g0) {
        this.f13941b = new C0112e(new Db(interfaceC0165g0));
    }

    public static final void b(AnrListener anrListener) {
        anrListener.onAppNotResponding();
    }

    public final void a(final AnrListener anrListener) {
        C0112e c0112e = this.f13941b;
        c0112e.f13626a.add(new InterfaceC0061c() { // from class: io.appmetrica.analytics.impl.kp
            @Override // io.appmetrica.analytics.impl.InterfaceC0061c
            public final void onAppNotResponding() {
                C0229ic.b(AnrListener.this);
            }
        });
    }
}
