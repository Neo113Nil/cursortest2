package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Db implements InterfaceC0061c {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0165g0 f12139a;

    /* renamed from: b, reason: collision with root package name */
    public final Dn f12140b = new Dn();

    public Db(@NotNull InterfaceC0165g0 interfaceC0165g0) {
        this.f12139a = interfaceC0165g0;
    }

    public static final void a(Db db2, V v5) {
        db2.f12139a.a(v5);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0061c
    public final void onAppNotResponding() {
        StackTraceElement[] stackTraceElementArr;
        Dn dn = this.f12140b;
        Thread a7 = dn.f12169a.a();
        try {
            stackTraceElementArr = dn.f12169a.b();
            if (stackTraceElementArr == null) {
                try {
                    stackTraceElementArr = a7.getStackTrace();
                } catch (SecurityException unused) {
                }
            }
        } catch (SecurityException unused2) {
            stackTraceElementArr = null;
        }
        V v5 = new V((C0590wn) dn.f12170b.apply(a7, stackTraceElementArr), dn.a(a7, null), dn.f12171c.a());
        ((C0651z9) C0040b4.l().f13374c.a()).f14990b.post(new androidx.appcompat.app.t(15, this, v5));
    }
}
