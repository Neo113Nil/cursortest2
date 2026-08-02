package Zh;

import ai.AbstractC2028a;
import bi.AbstractC2426b;
import bi.C2425a;
import bi.d;
import bi.m;
import com.twilio.voice.EventKeys;
import di.AbstractC4079b;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KClass;
import kotlin.text.Typography;

/* loaded from: classes5.dex */
public final class g extends AbstractC4079b {

    /* renamed from: a, reason: collision with root package name */
    public final KClass f14866a;

    /* renamed from: b, reason: collision with root package name */
    public List f14867b;

    /* renamed from: c, reason: collision with root package name */
    public final Lazy f14868c;

    public g(KClass baseClass) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        this.f14866a = baseClass;
        this.f14867b = CollectionsKt.emptyList();
        this.f14868c = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: Zh.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                bi.f i10;
                i10 = g.i(g.this);
                return i10;
            }
        });
    }

    public static final bi.f i(final g gVar) {
        return AbstractC2426b.c(bi.l.g("kotlinx.serialization.Polymorphic", d.a.f25203a, new bi.f[0], new Function1() { // from class: Zh.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit j10;
                j10 = g.j(g.this, (C2425a) obj);
                return j10;
            }
        }), gVar.f());
    }

    public static final Unit j(g gVar, C2425a buildSerialDescriptor) {
        Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
        C2425a.b(buildSerialDescriptor, "type", AbstractC2028a.H(StringCompanionObject.INSTANCE).getDescriptor(), null, false, 12, null);
        C2425a.b(buildSerialDescriptor, EventKeys.VALUE_KEY, bi.l.h("kotlinx.serialization.Polymorphic<" + gVar.f().getSimpleName() + Typography.greater, m.a.f25228a, new bi.f[0], null, 8, null), null, false, 12, null);
        buildSerialDescriptor.h(gVar.f14867b);
        return Unit.INSTANCE;
    }

    @Override // di.AbstractC4079b
    public KClass f() {
        return this.f14866a;
    }

    @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
    public bi.f getDescriptor() {
        return (bi.f) this.f14868c.getValue();
    }

    public String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + f() + ')';
    }
}
