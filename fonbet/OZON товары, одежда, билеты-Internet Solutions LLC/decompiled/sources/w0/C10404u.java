package w0;

import B1.W;
import B1.m0;
import fd.InterfaceC6511n;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import x0.InterfaceC10573B;

/* renamed from: w0.u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C10404u extends AbstractC7737t implements InterfaceC6511n<Integer, Integer, Function1<? super m0.a, ? extends Unit>, W> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC10573B f103301b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f103302c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f103303d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f103304e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10404u(InterfaceC10573B interfaceC10573B, long j11, int i11, int i12) {
        super(3);
        this.f103301b = interfaceC10573B;
        this.f103302c = j11;
        this.f103303d = i11;
        this.f103304e = i12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fd.InterfaceC6511n
    public final W invoke(Integer num, Integer num2, Function1<? super m0.a, ? extends Unit> function1) {
        int intValue = num.intValue();
        int intValue2 = num2.intValue();
        int i11 = intValue + this.f103303d;
        long j11 = this.f103302c;
        int h11 = Z1.c.h(i11, j11);
        int g10 = Z1.c.g(intValue2 + this.f103304e, j11);
        Map c11 = kotlin.collections.U.c();
        return this.f103301b.z0(h11, g10, c11, function1);
    }
}
