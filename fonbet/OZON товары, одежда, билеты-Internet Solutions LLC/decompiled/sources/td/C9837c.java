package td;

import java.util.List;
import je.L0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ud.InterfaceC10030h;

/* renamed from: td.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9837c implements i0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final i0 f99389a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC9843i f99390b;

    /* renamed from: c, reason: collision with root package name */
    private final int f99391c;

    public C9837c(@NotNull i0 originalDescriptor, @NotNull InterfaceC9843i declarationDescriptor, int i11) {
        Intrinsics.checkNotNullParameter(originalDescriptor, "originalDescriptor");
        Intrinsics.checkNotNullParameter(declarationDescriptor, "declarationDescriptor");
        this.f99389a = originalDescriptor;
        this.f99390b = declarationDescriptor;
        this.f99391c = i11;
    }

    @Override // td.i0
    public final boolean D() {
        return true;
    }

    @Override // td.InterfaceC9845k
    public final <R, D> R X(InterfaceC9847m<R, D> interfaceC9847m, D d11) {
        return (R) this.f99389a.X(interfaceC9847m, d11);
    }

    @Override // td.InterfaceC9845k
    @NotNull
    public final InterfaceC9845k d() {
        return this.f99390b;
    }

    @Override // td.InterfaceC9848n
    @NotNull
    public final d0 e() {
        d0 e11 = this.f99389a.e();
        Intrinsics.checkNotNullExpressionValue(e11, "getSource(...)");
        return e11;
    }

    @Override // ud.InterfaceC10023a
    @NotNull
    public final InterfaceC10030h getAnnotations() {
        return this.f99389a.getAnnotations();
    }

    @Override // td.i0
    public final int getIndex() {
        return this.f99389a.getIndex() + this.f99391c;
    }

    @Override // td.InterfaceC9845k
    @NotNull
    public final Sd.f getName() {
        Sd.f name = this.f99389a.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return name;
    }

    @Override // td.i0
    @NotNull
    public final ie.o getStorageManager() {
        ie.o storageManager = this.f99389a.getStorageManager();
        Intrinsics.checkNotNullExpressionValue(storageManager, "getStorageManager(...)");
        return storageManager;
    }

    @Override // td.i0
    @NotNull
    public final List<je.N> getUpperBounds() {
        List<je.N> upperBounds = this.f99389a.getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
        return upperBounds;
    }

    @Override // td.i0, td.InterfaceC9842h
    @NotNull
    public final je.s0 k() {
        je.s0 k11 = this.f99389a.k();
        Intrinsics.checkNotNullExpressionValue(k11, "getTypeConstructor(...)");
        return k11;
    }

    @Override // td.InterfaceC9842h
    @NotNull
    public final je.Y q() {
        je.Y q11 = this.f99389a.q();
        Intrinsics.checkNotNullExpressionValue(q11, "getDefaultType(...)");
        return q11;
    }

    @NotNull
    public final String toString() {
        return this.f99389a + "[inner-copy]";
    }

    @Override // td.i0
    public final boolean w() {
        return this.f99389a.w();
    }

    @Override // td.i0
    @NotNull
    public final L0 x() {
        L0 x11 = this.f99389a.x();
        Intrinsics.checkNotNullExpressionValue(x11, "getVariance(...)");
        return x11;
    }

    @Override // td.InterfaceC9845k
    @NotNull
    /* renamed from: a */
    public final i0 n0() {
        i0 n02 = this.f99389a.n0();
        Intrinsics.checkNotNullExpressionValue(n02, "getOriginal(...)");
        return n02;
    }
}
