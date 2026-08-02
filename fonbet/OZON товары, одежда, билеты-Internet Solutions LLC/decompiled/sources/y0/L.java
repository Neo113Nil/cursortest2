package y0;

import B1.m0;
import fd.InterfaceC6511n;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import x0.InterfaceC10573B;

/* loaded from: classes8.dex */
final class L extends AbstractC7737t implements InterfaceC6511n<Integer, Integer, Function1<? super m0.a, ? extends Unit>, B1.W> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC10573B f105671b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f105672c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f105673d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f105674e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    L(InterfaceC10573B interfaceC10573B, long j11, int i11, int i12) {
        super(3);
        this.f105671b = interfaceC10573B;
        this.f105672c = j11;
        this.f105673d = i11;
        this.f105674e = i12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fd.InterfaceC6511n
    public final B1.W invoke(Integer num, Integer num2, Function1<? super m0.a, ? extends Unit> function1) {
        int intValue = num.intValue();
        int intValue2 = num2.intValue();
        int i11 = intValue + this.f105673d;
        long j11 = this.f105672c;
        int h11 = Z1.c.h(i11, j11);
        int g10 = Z1.c.g(intValue2 + this.f105674e, j11);
        Map c11 = kotlin.collections.U.c();
        return this.f105671b.z0(h11, g10, c11, function1);
    }
}
