package x0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import b1.InterfaceC5505h;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: x0.w, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C10618w extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC10620y f104793b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC5505h f104794c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f104795d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Object f104796e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f104797f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10618w(InterfaceC10620y interfaceC10620y, InterfaceC5505h interfaceC5505h, int i11, Object obj, int i12) {
        super(2);
        this.f104793b = interfaceC10620y;
        this.f104794c = interfaceC5505h;
        this.f104795d = i11;
        this.f104796e = obj;
        this.f104797f = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        C10619x.a(this.f104793b, this.f104794c, this.f104795d, this.f104796e, interfaceC3967k, C2652m.e(this.f104797f | 1));
        return Unit.f71690a;
    }
}
