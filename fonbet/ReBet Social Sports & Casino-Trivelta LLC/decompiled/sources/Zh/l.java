package Zh;

import ai.AbstractC2028a;
import bi.C2425a;
import bi.d;
import bi.m;
import com.twilio.voice.EventKeys;
import di.AbstractC4079b;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.Grouping;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KClass;
import kotlin.text.Typography;

/* loaded from: classes5.dex */
public final class l extends AbstractC4079b {

    /* renamed from: a, reason: collision with root package name */
    public final KClass f14873a;

    /* renamed from: b, reason: collision with root package name */
    public List f14874b;

    /* renamed from: c, reason: collision with root package name */
    public final Lazy f14875c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f14876d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f14877e;

    public static final class a implements Grouping {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Iterable f14878a;

        public a(Iterable iterable) {
            this.f14878a = iterable;
        }

        @Override // kotlin.collections.Grouping
        public Object keyOf(Object obj) {
            return ((InterfaceC1901b) ((Map.Entry) obj).getValue()).getDescriptor().h();
        }

        @Override // kotlin.collections.Grouping
        public Iterator sourceIterator() {
            return this.f14878a.iterator();
        }
    }

    public l(final String serialName, KClass baseClass, KClass[] subclasses, InterfaceC1901b[] subclassSerializers) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(subclasses, "subclasses");
        Intrinsics.checkNotNullParameter(subclassSerializers, "subclassSerializers");
        this.f14873a = baseClass;
        this.f14874b = CollectionsKt.emptyList();
        this.f14875c = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: Zh.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                bi.f j10;
                j10 = l.j(serialName, this);
                return j10;
            }
        });
        if (subclasses.length != subclassSerializers.length) {
            throw new IllegalArgumentException("All subclasses of sealed class " + f().getSimpleName() + " should be marked @Serializable");
        }
        Map map = MapsKt.toMap(ArraysKt.zip(subclasses, subclassSerializers));
        this.f14876d = map;
        a aVar = new a(map.entrySet());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator sourceIterator = aVar.sourceIterator();
        while (sourceIterator.hasNext()) {
            Object next = sourceIterator.next();
            Object keyOf = aVar.keyOf(next);
            Object obj = linkedHashMap.get(keyOf);
            if (obj == null) {
                linkedHashMap.containsKey(keyOf);
            }
            Map.Entry entry = (Map.Entry) next;
            Map.Entry entry2 = (Map.Entry) obj;
            String str = (String) keyOf;
            if (entry2 != null) {
                throw new IllegalStateException(("Multiple sealed subclasses of '" + f() + "' have the same serial name '" + str + "': '" + entry2.getKey() + "', '" + entry.getKey() + '\'').toString());
            }
            linkedHashMap.put(keyOf, entry);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry3.getKey(), (InterfaceC1901b) ((Map.Entry) entry3.getValue()).getValue());
        }
        this.f14877e = linkedHashMap2;
    }

    public static final bi.f j(String str, final l lVar) {
        return bi.l.g(str, d.b.f25204a, new bi.f[0], new Function1() { // from class: Zh.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit k10;
                k10 = l.k(l.this, (C2425a) obj);
                return k10;
            }
        });
    }

    public static final Unit k(final l lVar, C2425a buildSerialDescriptor) {
        Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
        C2425a.b(buildSerialDescriptor, "type", AbstractC2028a.H(StringCompanionObject.INSTANCE).getDescriptor(), null, false, 12, null);
        C2425a.b(buildSerialDescriptor, EventKeys.VALUE_KEY, bi.l.g("kotlinx.serialization.Sealed<" + lVar.f().getSimpleName() + Typography.greater, m.a.f25228a, new bi.f[0], new Function1() { // from class: Zh.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit l10;
                l10 = l.l(l.this, (C2425a) obj);
                return l10;
            }
        }), null, false, 12, null);
        buildSerialDescriptor.h(lVar.f14874b);
        return Unit.INSTANCE;
    }

    public static final Unit l(l lVar, C2425a buildSerialDescriptor) {
        Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
        for (Map.Entry entry : lVar.f14877e.entrySet()) {
            C2425a.b(buildSerialDescriptor, (String) entry.getKey(), ((InterfaceC1901b) entry.getValue()).getDescriptor(), null, false, 12, null);
        }
        return Unit.INSTANCE;
    }

    @Override // di.AbstractC4079b
    public InterfaceC1900a d(ci.c decoder, String str) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        InterfaceC1901b interfaceC1901b = (InterfaceC1901b) this.f14877e.get(str);
        return interfaceC1901b != null ? interfaceC1901b : super.d(decoder, str);
    }

    @Override // di.AbstractC4079b
    public p e(ci.f encoder, Object value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        p pVar = (InterfaceC1901b) this.f14876d.get(Reflection.getOrCreateKotlinClass(value.getClass()));
        if (pVar == null) {
            pVar = super.e(encoder, value);
        }
        if (pVar != null) {
            return pVar;
        }
        return null;
    }

    @Override // di.AbstractC4079b
    public KClass f() {
        return this.f14873a;
    }

    @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
    public bi.f getDescriptor() {
        return (bi.f) this.f14875c.getValue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(String serialName, KClass baseClass, KClass[] subclasses, InterfaceC1901b[] subclassSerializers, Annotation[] classAnnotations) {
        this(serialName, baseClass, subclasses, subclassSerializers);
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(subclasses, "subclasses");
        Intrinsics.checkNotNullParameter(subclassSerializers, "subclassSerializers");
        Intrinsics.checkNotNullParameter(classAnnotations, "classAnnotations");
        this.f14874b = ArraysKt.asList(classAnnotations);
    }
}
