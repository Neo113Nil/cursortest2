package w0;

import androidx.compose.foundation.layout.C5179b;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import u0.C9915y;

/* renamed from: w0.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C10391g extends AbstractC7737t implements Function2<Z1.d, Z1.b, L> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C9915y f103268b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C10386b f103269c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C5179b.e f103270d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10391g(C9915y c9915y, C10386b c10386b, C5179b.e eVar) {
        super(2);
        this.f103268b = c9915y;
        this.f103269c = c10386b;
        this.f103270d = eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final L invoke(Z1.d dVar, Z1.b bVar) {
        Z1.d dVar2 = dVar;
        long p11 = bVar.p();
        if (Z1.b.k(p11) == Integer.MAX_VALUE) {
            throw new IllegalArgumentException("LazyVerticalGrid's width should be bound by parent.");
        }
        Z1.s sVar = Z1.s.Ltr;
        C9915y c9915y = this.f103268b;
        int k11 = Z1.b.k(p11) - dVar2.Y0(androidx.compose.foundation.layout.T.c(c9915y, sVar) + androidx.compose.foundation.layout.T.d(c9915y, sVar));
        C5179b.e eVar = this.f103270d;
        int[] T02 = C7714v.T0(this.f103269c.a(k11, dVar2.Y0(eVar.a())));
        int[] iArr = new int[T02.length];
        eVar.c(dVar2, k11, T02, sVar, iArr);
        return new L(T02, iArr);
    }
}
