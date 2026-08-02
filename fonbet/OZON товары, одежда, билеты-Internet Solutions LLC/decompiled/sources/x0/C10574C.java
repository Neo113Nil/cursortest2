package x0;

import B1.AbstractC2531a;
import B1.m0;
import B1.z0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* renamed from: x0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10574C implements InterfaceC10573B, B1.Y {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.lazy.layout.f f104665a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final z0 f104666b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC10620y f104667c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final HashMap<Integer, List<m0>> f104668d = new HashMap<>();

    public C10574C(@NotNull androidx.compose.foundation.lazy.layout.f fVar, @NotNull z0 z0Var) {
        this.f104665a = fVar;
        this.f104666b = z0Var;
        this.f104667c = fVar.d().invoke();
    }

    @Override // x0.InterfaceC10573B, Z1.d
    public final float B(int i11) {
        return this.f104666b.B(i11);
    }

    @Override // x0.InterfaceC10573B, Z1.d
    public final float C(float f7) {
        return this.f104666b.C(f7);
    }

    @Override // Z1.d
    public final long D0(long j11) {
        return this.f104666b.D0(j11);
    }

    @Override // x0.InterfaceC10573B, Z1.k
    public final long F(float f7) {
        return this.f104666b.F(f7);
    }

    @Override // B1.InterfaceC2553w
    public final boolean R0() {
        return this.f104666b.R0();
    }

    @Override // Z1.d
    public final int Y0(float f7) {
        return this.f104666b.Y0(f7);
    }

    @Override // x0.InterfaceC10573B
    @NotNull
    public final List<m0> Z(int i11, long j11) {
        HashMap<Integer, List<m0>> hashMap = this.f104668d;
        List<m0> list = hashMap.get(Integer.valueOf(i11));
        if (list != null) {
            return list;
        }
        InterfaceC10620y interfaceC10620y = this.f104667c;
        Object d11 = interfaceC10620y.d(i11);
        List<B1.U> L02 = this.f104666b.L0(d11, this.f104665a.b(i11, d11, interfaceC10620y.c(i11)));
        int size = L02.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            arrayList.add(L02.get(i12).a0(j11));
        }
        hashMap.put(Integer.valueOf(i11), arrayList);
        return arrayList;
    }

    @Override // Z1.d
    public final float Z0(long j11) {
        return this.f104666b.Z0(j11);
    }

    @Override // B1.Y
    @NotNull
    public final B1.W f1(int i11, int i12, @NotNull Map map, @NotNull Function1 function1) {
        return this.f104666b.f1(i11, i12, map, function1);
    }

    @Override // Z1.d
    public final float g() {
        return this.f104666b.g();
    }

    @Override // B1.InterfaceC2553w
    @NotNull
    public final Z1.s getLayoutDirection() {
        return this.f104666b.getLayoutDirection();
    }

    @Override // x0.InterfaceC10573B, Z1.d
    public final long o(long j11) {
        return this.f104666b.o(j11);
    }

    @Override // x0.InterfaceC10573B, Z1.k
    public final float p(long j11) {
        return this.f104666b.p(j11);
    }

    @Override // x0.InterfaceC10573B, Z1.d
    public final long r(float f7) {
        return this.f104666b.r(f7);
    }

    @Override // Z1.k
    public final float u1() {
        return this.f104666b.u1();
    }

    @Override // Z1.d
    public final float v1(float f7) {
        return this.f104666b.v1(f7);
    }

    @Override // B1.Y
    @NotNull
    public final B1.W z0(int i11, int i12, @NotNull Map<AbstractC2531a, Integer> map, @NotNull Function1<? super m0.a, Unit> function1) {
        return this.f104666b.z0(i11, i12, map, function1);
    }
}
