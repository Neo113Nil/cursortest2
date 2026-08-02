package i1;

import ed.InterfaceC6346b;
import kotlin.jvm.internal.Intrinsics;
import l1.J0;
import l1.y0;
import org.jetbrains.annotations.NotNull;

@InterfaceC6346b
/* renamed from: i1.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6984d {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final y0.a f65679b = y0.a();

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f65680c = 0;

    /* renamed from: a, reason: collision with root package name */
    private final y0.a f65681a;

    private /* synthetic */ C6984d(y0.a aVar) {
        this.f65681a = aVar;
    }

    public static final /* synthetic */ C6984d b(y0.a aVar) {
        return new C6984d(aVar);
    }

    public final /* synthetic */ J0 c() {
        return this.f65681a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6984d) {
            return Intrinsics.d(this.f65681a, ((C6984d) obj).f65681a);
        }
        return false;
    }

    public final int hashCode() {
        y0.a aVar = this.f65681a;
        if (aVar == null) {
            return 0;
        }
        return aVar.hashCode();
    }

    public final String toString() {
        return "BlurredEdgeTreatment(shape=" + this.f65681a + ')';
    }
}
