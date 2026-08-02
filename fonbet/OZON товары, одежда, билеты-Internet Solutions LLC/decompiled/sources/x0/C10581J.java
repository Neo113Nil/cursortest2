package x0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: x0.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C10581J extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f104681b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f104682c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C10583L f104683d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C4912a f104684e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f104685f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10581J(Object obj, int i11, C10583L c10583l, C4912a c4912a, int i12) {
        super(2);
        this.f104681b = obj;
        this.f104682c = i11;
        this.f104683d = c10583l;
        this.f104684e = c4912a;
        this.f104685f = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f104685f | 1);
        C4912a c4912a = this.f104684e;
        C10582K.a(this.f104681b, this.f104682c, this.f104683d, c4912a, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
