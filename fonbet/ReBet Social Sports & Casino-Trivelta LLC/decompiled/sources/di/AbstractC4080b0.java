package di;

import Zh.InterfaceC1901b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: di.b0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4080b0 implements InterfaceC1901b {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1901b f45347a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1901b f45348b;

    public /* synthetic */ AbstractC4080b0(InterfaceC1901b interfaceC1901b, InterfaceC1901b interfaceC1901b2, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC1901b, interfaceC1901b2);
    }

    public abstract Object b(Object obj);

    public final InterfaceC1901b c() {
        return this.f45347a;
    }

    public abstract Object d(Object obj);

    @Override // Zh.InterfaceC1900a
    public Object deserialize(ci.e decoder) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object f10;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        bi.f descriptor = getDescriptor();
        ci.c c10 = decoder.c(descriptor);
        if (c10.q()) {
            f10 = f(ci.c.u(c10, getDescriptor(), 0, c(), null, 8, null), ci.c.u(c10, getDescriptor(), 1, e(), null, 8, null));
        } else {
            obj = g1.f45366a;
            obj2 = g1.f45366a;
            Object obj5 = obj2;
            while (true) {
                int e10 = c10.e(getDescriptor());
                if (e10 == -1) {
                    obj3 = g1.f45366a;
                    if (obj == obj3) {
                        throw new Zh.o("Element 'key' is missing");
                    }
                    obj4 = g1.f45366a;
                    if (obj5 == obj4) {
                        throw new Zh.o("Element 'value' is missing");
                    }
                    f10 = f(obj, obj5);
                } else if (e10 == 0) {
                    obj = ci.c.u(c10, getDescriptor(), 0, c(), null, 8, null);
                } else {
                    if (e10 != 1) {
                        throw new Zh.o("Invalid index: " + e10);
                    }
                    obj5 = ci.c.u(c10, getDescriptor(), 1, e(), null, 8, null);
                }
            }
        }
        c10.b(descriptor);
        return f10;
    }

    public final InterfaceC1901b e() {
        return this.f45348b;
    }

    public abstract Object f(Object obj, Object obj2);

    @Override // Zh.p
    public void serialize(ci.f encoder, Object obj) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        ci.d c10 = encoder.c(getDescriptor());
        c10.B(getDescriptor(), 0, this.f45347a, b(obj));
        c10.B(getDescriptor(), 1, this.f45348b, d(obj));
        c10.b(getDescriptor());
    }

    public AbstractC4080b0(InterfaceC1901b interfaceC1901b, InterfaceC1901b interfaceC1901b2) {
        this.f45347a = interfaceC1901b;
        this.f45348b = interfaceC1901b2;
    }
}
