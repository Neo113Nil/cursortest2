package di;

import Zh.InterfaceC1901b;
import bi.C2425a;
import bi.n;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: di.y0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4125y0 implements InterfaceC1901b {

    /* renamed from: a, reason: collision with root package name */
    public final Object f45437a;

    /* renamed from: b, reason: collision with root package name */
    public List f45438b;

    /* renamed from: c, reason: collision with root package name */
    public final Lazy f45439c;

    public C4125y0(final String serialName, Object objectInstance) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(objectInstance, "objectInstance");
        this.f45437a = objectInstance;
        this.f45438b = CollectionsKt.emptyList();
        this.f45439c = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: di.w0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                bi.f d10;
                d10 = C4125y0.d(serialName, this);
                return d10;
            }
        });
    }

    public static final bi.f d(String str, final C4125y0 c4125y0) {
        return bi.l.g(str, n.d.f25233a, new bi.f[0], new Function1() { // from class: di.x0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit e10;
                e10 = C4125y0.e(C4125y0.this, (C2425a) obj);
                return e10;
            }
        });
    }

    public static final Unit e(C4125y0 c4125y0, C2425a buildSerialDescriptor) {
        Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
        buildSerialDescriptor.h(c4125y0.f45438b);
        return Unit.INSTANCE;
    }

    @Override // Zh.InterfaceC1900a
    public Object deserialize(ci.e decoder) {
        int e10;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        bi.f descriptor = getDescriptor();
        ci.c c10 = decoder.c(descriptor);
        if (c10.q() || (e10 = c10.e(getDescriptor())) == -1) {
            Unit unit = Unit.INSTANCE;
            c10.b(descriptor);
            return this.f45437a;
        }
        throw new Zh.o("Unexpected index " + e10);
    }

    @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
    public bi.f getDescriptor() {
        return (bi.f) this.f45439c.getValue();
    }

    @Override // Zh.p
    public void serialize(ci.f encoder, Object value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.c(getDescriptor()).b(getDescriptor());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4125y0(String serialName, Object objectInstance, Annotation[] classAnnotations) {
        this(serialName, objectInstance);
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(objectInstance, "objectInstance");
        Intrinsics.checkNotNullParameter(classAnnotations, "classAnnotations");
        this.f45438b = ArraysKt.asList(classAnnotations);
    }
}
