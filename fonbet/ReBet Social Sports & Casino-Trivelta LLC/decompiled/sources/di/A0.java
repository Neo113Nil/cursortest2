package di;

import Zh.InterfaceC1901b;
import bi.C2425a;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class A0 extends AbstractC4080b0 {

    /* renamed from: c, reason: collision with root package name */
    public final bi.f f45280c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A0(final InterfaceC1901b keySerializer, final InterfaceC1901b valueSerializer) {
        super(keySerializer, valueSerializer, null);
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        this.f45280c = bi.l.d("kotlin.Pair", new bi.f[0], new Function1() { // from class: di.z0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit h10;
                h10 = A0.h(InterfaceC1901b.this, valueSerializer, (C2425a) obj);
                return h10;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(InterfaceC1901b interfaceC1901b, InterfaceC1901b interfaceC1901b2, C2425a buildClassSerialDescriptor) {
        Intrinsics.checkNotNullParameter(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        C2425a.b(buildClassSerialDescriptor, "first", interfaceC1901b.getDescriptor(), null, false, 12, null);
        C2425a.b(buildClassSerialDescriptor, "second", interfaceC1901b2.getDescriptor(), null, false, 12, null);
        return Unit.INSTANCE;
    }

    @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
    public bi.f getDescriptor() {
        return this.f45280c;
    }

    @Override // di.AbstractC4080b0
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Object b(Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "<this>");
        return pair.getFirst();
    }

    @Override // di.AbstractC4080b0
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public Object d(Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "<this>");
        return pair.getSecond();
    }

    @Override // di.AbstractC4080b0
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public Pair f(Object obj, Object obj2) {
        return TuplesKt.to(obj, obj2);
    }
}
