package s0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.J;
import m0.C8000l;
import m0.C8008p;
import r0.C9112M;
import s0.C9565h;

/* renamed from: s0.m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C9570m extends AbstractC7737t implements Function1<C8000l<Float, C8008p>, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ float f98074b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ J f98075c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C9112M.a f98076d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Function1<Float, Unit> f98077e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9570m(float f7, J j11, C9112M.a aVar, Function1 function1) {
        super(1);
        this.f98074b = f7;
        this.f98075c = j11;
        this.f98076d = aVar;
        this.f98077e = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C8000l<Float, C8008p> c8000l) {
        C8000l<Float, C8008p> c8000l2 = c8000l;
        float abs = Math.abs(c8000l2.e().floatValue());
        float f7 = this.f98074b;
        float abs2 = Math.abs(f7);
        Function1<Float, Unit> function1 = this.f98077e;
        J j11 = this.f98075c;
        C9112M.a aVar = this.f98076d;
        if (abs >= abs2) {
            float c11 = C9573p.c(c8000l2.e().floatValue(), f7);
            float f11 = c11 - j11.f71784a;
            float a11 = aVar.a(f11);
            ((C9565h.b) function1).invoke(Float.valueOf(a11));
            if (Math.abs(f11 - a11) > 0.5f) {
                c8000l2.a();
            }
            c8000l2.a();
            j11.f71784a = c11;
        } else {
            float floatValue = c8000l2.e().floatValue() - j11.f71784a;
            float a12 = aVar.a(floatValue);
            ((C9565h.b) function1).invoke(Float.valueOf(a12));
            if (Math.abs(floatValue - a12) > 0.5f) {
                c8000l2.a();
            }
            j11.f71784a = c8000l2.e().floatValue();
        }
        return Unit.f71690a;
    }
}
