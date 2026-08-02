package fe;

import ge.C6721d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: fe.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6523b implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC6524c f63201a;

    public C6523b(AbstractC6524c abstractC6524c) {
        this.f63201a = abstractC6524c;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Sd.c fqName = (Sd.c) obj;
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        AbstractC6524c abstractC6524c = this.f63201a;
        C6721d d11 = abstractC6524c.d(fqName);
        if (d11 == null) {
            return null;
        }
        C6535n c6535n = abstractC6524c.f63205d;
        if (c6535n != null) {
            d11.G0(c6535n);
            return d11;
        }
        Intrinsics.n("components");
        throw null;
    }
}
