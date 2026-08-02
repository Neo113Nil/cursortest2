package b0;

import B.G;
import a0.C1906b;
import d0.AbstractC3983a;
import d0.C3984b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final C3984b f24187a = AbstractC3983a.a();

    /* renamed from: b, reason: collision with root package name */
    public final C1906b f24188b = new C1906b(16);

    public static final class a extends Lambda implements Function1 {
        public a(t tVar) {
            super(1);
        }

        public final void a(v finalResult) {
            Intrinsics.checkNotNullParameter(finalResult, "finalResult");
            C3984b b10 = u.this.b();
            u uVar = u.this;
            synchronized (b10) {
                try {
                    if (finalResult.a()) {
                        uVar.f24188b.e(null, finalResult);
                    } else {
                        uVar.f24188b.f(null);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((v) obj);
            return Unit.INSTANCE;
        }
    }

    public final C3984b b() {
        return this.f24187a;
    }

    public final G c(t typefaceRequest, Function1 resolveTypeface) {
        Intrinsics.checkNotNullParameter(typefaceRequest, "typefaceRequest");
        Intrinsics.checkNotNullParameter(resolveTypeface, "resolveTypeface");
        synchronized (this.f24187a) {
            v vVar = (v) this.f24188b.d(typefaceRequest);
            if (vVar != null) {
                if (vVar.a()) {
                    return vVar;
                }
            }
            try {
                v vVar2 = (v) resolveTypeface.invoke(new a(typefaceRequest));
                synchronized (this.f24187a) {
                    try {
                        if (this.f24188b.d(typefaceRequest) == null && vVar2.a()) {
                            this.f24188b.e(typefaceRequest, vVar2);
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return vVar2;
            } catch (Exception e10) {
                throw new IllegalStateException("Could not load font", e10);
            }
        }
    }
}
