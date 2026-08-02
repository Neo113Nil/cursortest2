package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.ICrashTransformer;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.j6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0248j6 implements Fa {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0223i6 f14006a;

    /* renamed from: b, reason: collision with root package name */
    public final ICrashTransformer f14007b;

    /* renamed from: c, reason: collision with root package name */
    public final M9 f14008c;

    public AbstractC0248j6(InterfaceC0223i6 interfaceC0223i6, ICrashTransformer iCrashTransformer, M9 m92) {
        this.f14006a = interfaceC0223i6;
        this.f14007b = iCrashTransformer;
        this.f14008c = m92;
    }

    @Override // io.appmetrica.analytics.impl.Fa
    public final void a(Throwable th2, @NonNull V v5) {
        if (this.f14006a.a(th2)) {
            ICrashTransformer iCrashTransformer = this.f14007b;
            if (iCrashTransformer == null || th2 == null || (th2 = iCrashTransformer.process(th2)) != null) {
                Qn a7 = Tn.a(th2, v5, null, (String) this.f14008c.f12577b.a(), (Boolean) this.f14008c.f12578c.a());
                C0151fc c0151fc = (C0151fc) ((Bh) this).f12067d;
                c0151fc.f13135a.a().a(c0151fc.f13730b).a(a7);
            }
        }
    }

    public final InterfaceC0223i6 b() {
        return this.f14006a;
    }

    public final ICrashTransformer a() {
        return this.f14007b;
    }
}
