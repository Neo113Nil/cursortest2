package he;

import Nd.r;
import fe.C6537p;
import fe.O;
import fe.X;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import je.L0;
import je.N;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9845k;
import td.g0;
import ud.InterfaceC10030h;
import wd.AbstractC10517c;

/* renamed from: he.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6929K extends AbstractC10517c {

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final C6537p f65412k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final Nd.r f65413l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final C6931a f65414m;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C6929K(@NotNull C6537p c11, @NotNull Nd.r proto, int i11) {
        super(r2, r3, r4, r5, r0, proto.K(), i11, g0.a.f99394a);
        L0 l02;
        Intrinsics.checkNotNullParameter(c11, "c");
        Intrinsics.checkNotNullParameter(proto, "proto");
        ie.o h11 = c11.h();
        InterfaceC9845k e11 = c11.e();
        InterfaceC10030h.a.C2208a b11 = InterfaceC10030h.a.b();
        Sd.f b12 = fe.L.b(c11.g(), proto.J());
        r.c variance = proto.N();
        Intrinsics.checkNotNullExpressionValue(variance, "getVariance(...)");
        Intrinsics.checkNotNullParameter(variance, "variance");
        int i12 = O.a.f63179c[variance.ordinal()];
        if (i12 == 1) {
            l02 = L0.IN_VARIANCE;
        } else if (i12 == 2) {
            l02 = L0.OUT_VARIANCE;
        } else {
            if (i12 != 3) {
                throw new Sc.o();
            }
            l02 = L0.INVARIANT;
        }
        this.f65412k = c11;
        this.f65413l = proto;
        this.f65414m = new C6931a(c11.h(), new C6928J(this));
    }

    static List H0(C6929K c6929k) {
        return C7714v.U0(c6929k.f65412k.c().d().i(c6929k.f65413l, c6929k.f65412k.g()));
    }

    @Override // wd.AbstractC10527m
    public final void F0(N type) {
        Intrinsics.checkNotNullParameter(type, "type");
        throw new IllegalStateException("There should be no cycles for deserialized type parameters, but found for: " + this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List] */
    @Override // wd.AbstractC10527m
    @NotNull
    protected final List<N> G0() {
        C6537p c6537p = this.f65412k;
        Pd.g typeTable = c6537p.j();
        Nd.r rVar = this.f65413l;
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        List<Nd.p> M11 = rVar.M();
        boolean isEmpty = M11.isEmpty();
        ?? r32 = M11;
        if (isEmpty) {
            r32 = 0;
        }
        if (r32 == 0) {
            List<Integer> L11 = rVar.L();
            Intrinsics.checkNotNullExpressionValue(L11, "getUpperBoundIdList(...)");
            List<Integer> list = L11;
            r32 = new ArrayList(C7714v.z(list, 10));
            for (Integer num : list) {
                Intrinsics.f(num);
                r32.add(typeTable.a(num.intValue()));
            }
        }
        if (r32.isEmpty()) {
            return C7714v.a0(Zd.e.e(this).C());
        }
        Iterable iterable = (Iterable) r32;
        X i11 = c6537p.i();
        ArrayList arrayList = new ArrayList(C7714v.z(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(i11.k((Nd.p) it.next()));
        }
        return arrayList;
    }

    @Override // ud.C10024b, ud.InterfaceC10023a
    public final InterfaceC10030h getAnnotations() {
        return this.f65414m;
    }
}
