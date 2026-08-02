package di;

import Zh.InterfaceC1901b;
import bi.C2425a;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f1 implements InterfaceC1901b {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1901b f45359a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1901b f45360b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1901b f45361c;

    /* renamed from: d, reason: collision with root package name */
    public final bi.f f45362d;

    public f1(InterfaceC1901b aSerializer, InterfaceC1901b bSerializer, InterfaceC1901b cSerializer) {
        Intrinsics.checkNotNullParameter(aSerializer, "aSerializer");
        Intrinsics.checkNotNullParameter(bSerializer, "bSerializer");
        Intrinsics.checkNotNullParameter(cSerializer, "cSerializer");
        this.f45359a = aSerializer;
        this.f45360b = bSerializer;
        this.f45361c = cSerializer;
        this.f45362d = bi.l.d("kotlin.Triple", new bi.f[0], new Function1() { // from class: di.e1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit e10;
                e10 = f1.e(f1.this, (C2425a) obj);
                return e10;
            }
        });
    }

    public static final Unit e(f1 f1Var, C2425a buildClassSerialDescriptor) {
        Intrinsics.checkNotNullParameter(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        C2425a.b(buildClassSerialDescriptor, "first", f1Var.f45359a.getDescriptor(), null, false, 12, null);
        C2425a.b(buildClassSerialDescriptor, "second", f1Var.f45360b.getDescriptor(), null, false, 12, null);
        C2425a.b(buildClassSerialDescriptor, "third", f1Var.f45361c.getDescriptor(), null, false, 12, null);
        return Unit.INSTANCE;
    }

    public final Triple c(ci.c cVar) {
        Object u10 = ci.c.u(cVar, getDescriptor(), 0, this.f45359a, null, 8, null);
        Object u11 = ci.c.u(cVar, getDescriptor(), 1, this.f45360b, null, 8, null);
        Object u12 = ci.c.u(cVar, getDescriptor(), 2, this.f45361c, null, 8, null);
        cVar.b(getDescriptor());
        return new Triple(u10, u11, u12);
    }

    public final Triple d(ci.c cVar) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        obj = g1.f45366a;
        obj2 = g1.f45366a;
        obj3 = g1.f45366a;
        while (true) {
            int e10 = cVar.e(getDescriptor());
            if (e10 == -1) {
                cVar.b(getDescriptor());
                obj4 = g1.f45366a;
                if (obj == obj4) {
                    throw new Zh.o("Element 'first' is missing");
                }
                obj5 = g1.f45366a;
                if (obj2 == obj5) {
                    throw new Zh.o("Element 'second' is missing");
                }
                obj6 = g1.f45366a;
                if (obj3 != obj6) {
                    return new Triple(obj, obj2, obj3);
                }
                throw new Zh.o("Element 'third' is missing");
            }
            if (e10 == 0) {
                obj = ci.c.u(cVar, getDescriptor(), 0, this.f45359a, null, 8, null);
            } else if (e10 == 1) {
                obj2 = ci.c.u(cVar, getDescriptor(), 1, this.f45360b, null, 8, null);
            } else {
                if (e10 != 2) {
                    throw new Zh.o("Unexpected index " + e10);
                }
                obj3 = ci.c.u(cVar, getDescriptor(), 2, this.f45361c, null, 8, null);
            }
        }
    }

    @Override // Zh.InterfaceC1900a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Triple deserialize(ci.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        ci.c c10 = decoder.c(getDescriptor());
        return c10.q() ? c(c10) : d(c10);
    }

    @Override // Zh.p
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void serialize(ci.f encoder, Triple value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        ci.d c10 = encoder.c(getDescriptor());
        c10.B(getDescriptor(), 0, this.f45359a, value.getFirst());
        c10.B(getDescriptor(), 1, this.f45360b, value.getSecond());
        c10.B(getDescriptor(), 2, this.f45361c, value.getThird());
        c10.b(getDescriptor());
    }

    @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
    public bi.f getDescriptor() {
        return this.f45362d;
    }
}
