package x0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: x0.U, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C10591U extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C10586O f104699b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f104700c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C4912a f104701d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f104702e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10591U(C10586O c10586o, Object obj, C4912a c4912a, int i11) {
        super(2);
        this.f104699b = c10586o;
        this.f104700c = obj;
        this.f104701d = c4912a;
        this.f104702e = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f104702e | 1);
        C4912a c4912a = this.f104701d;
        this.f104699b.c(this.f104700c, c4912a, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
