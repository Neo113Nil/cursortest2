package fi;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: fi.z, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4309z {

    /* renamed from: a, reason: collision with root package name */
    public final di.E f46788a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f46789b;

    /* renamed from: fi.z$a */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements Function2 {
        public a(Object obj) {
            super(2, obj, C4309z.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0);
        }

        public final Boolean a(bi.f p02, int i10) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return Boolean.valueOf(((C4309z) this.receiver).e(p02, i10));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((bi.f) obj, ((Number) obj2).intValue());
        }
    }

    public C4309z(bi.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f46788a = new di.E(descriptor, new a(this));
    }

    public final boolean b() {
        return this.f46789b;
    }

    public final void c(int i10) {
        this.f46788a.a(i10);
    }

    public final int d() {
        return this.f46788a.d();
    }

    public final boolean e(bi.f fVar, int i10) {
        boolean z10 = !fVar.i(i10) && fVar.g(i10).b();
        this.f46789b = z10;
        return z10;
    }
}
