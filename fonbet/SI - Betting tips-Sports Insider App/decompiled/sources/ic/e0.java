package ic;

import com.android.billingclient.api.l0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import sg.s0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@og.e
@SourceDebugExtension({"SMAP\nProductDetailsImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductDetailsImpl.kt\ncom/sports/insider/domain/entity/common/ProductDetailsImpl\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 SerializersModuleBuilders.kt\nkotlinx/serialization/modules/SerializersModuleBuildersKt\n+ 5 PolymorphicModuleBuilder.kt\nkotlinx/serialization/modules/PolymorphicModuleBuilderKt\n*L\n1#1,179:1\n205#2:180\n295#3,2:181\n295#3,2:183\n295#3,2:185\n295#3,2:187\n31#4,2:189\n247#4,7:191\n254#4,2:199\n247#4,7:201\n254#4,2:209\n247#4,7:211\n254#4,2:219\n247#4,7:221\n254#4,2:229\n33#4:231\n118#5:198\n118#5:208\n118#5:218\n118#5:228\n*S KotlinDebug\n*F\n+ 1 ProductDetailsImpl.kt\ncom/sports/insider/domain/entity/common/ProductDetailsImpl\n*L\n86#1:180\n92#1:181,2\n97#1:183,2\n102#1:185,2\n107#1:187,2\n114#1:189,2\n115#1:191,7\n115#1:199,2\n118#1:201,7\n118#1:209,2\n121#1:211,7\n121#1:219,2\n124#1:221,7\n124#1:229,2\n114#1:231\n116#1:198\n119#1:208\n122#1:218\n125#1:228\n*E\n"})
/* loaded from: classes.dex */
public final class e0 implements o {

    @NotNull
    public static final u Companion;

    /* renamed from: h, reason: collision with root package name */
    public static final gf.i[] f11105h;

    /* renamed from: i, reason: collision with root package name */
    public static final c4.d f11106i;
    public static final tg.r j;

    /* renamed from: a, reason: collision with root package name */
    public final int f11107a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11108b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11109c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11110d;

    /* renamed from: e, reason: collision with root package name */
    public final String f11111e;

    /* renamed from: f, reason: collision with root package name */
    public final j f11112f;

    /* renamed from: g, reason: collision with root package name */
    public final List f11113g;

    static {
        u uVar = new u();
        Companion = uVar;
        f11105h = new gf.i[]{null, null, null, null, null, null, gf.k.a(gf.l.f10027a, new b2.b(27))};
        c4.d builder = new c4.d(12);
        ag.c baseClass = Reflection.getOrCreateKotlinClass(o.class);
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        ArrayList arrayList = new ArrayList();
        ag.c subclass = Reflection.getOrCreateKotlinClass(e0.class);
        og.a serializer = uVar.serializer();
        Intrinsics.checkNotNullParameter(subclass, "subclass");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        arrayList.add(new Pair(subclass, serializer));
        Intrinsics.checkNotNullParameter(builder, "builder");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            ag.c cVar = (ag.c) pair.f19192a;
            og.a aVar = (og.a) pair.f19193b;
            Intrinsics.checkNotNull(cVar, "null cannot be cast to non-null type kotlin.reflect.KClass<Base of kotlinx.serialization.modules.PolymorphicModuleBuilder>");
            Intrinsics.checkNotNull(aVar, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            c4.d.l(builder, baseClass, cVar, aVar);
        }
        ag.c baseClass2 = Reflection.getOrCreateKotlinClass(n.class);
        Intrinsics.checkNotNullParameter(baseClass2, "baseClass");
        ArrayList arrayList2 = new ArrayList();
        ag.c subclass2 = Reflection.getOrCreateKotlinClass(a0.class);
        og.a serializer2 = a0.Companion.serializer();
        Intrinsics.checkNotNullParameter(subclass2, "subclass");
        Intrinsics.checkNotNullParameter(serializer2, "serializer");
        arrayList2.add(new Pair(subclass2, serializer2));
        Intrinsics.checkNotNullParameter(builder, "builder");
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Pair pair2 = (Pair) it2.next();
            ag.c cVar2 = (ag.c) pair2.f19192a;
            og.a aVar2 = (og.a) pair2.f19193b;
            Intrinsics.checkNotNull(cVar2, "null cannot be cast to non-null type kotlin.reflect.KClass<Base of kotlinx.serialization.modules.PolymorphicModuleBuilder>");
            Intrinsics.checkNotNull(aVar2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            c4.d.l(builder, baseClass2, cVar2, aVar2);
        }
        ag.c baseClass3 = Reflection.getOrCreateKotlinClass(j.class);
        Intrinsics.checkNotNullParameter(baseClass3, "baseClass");
        ArrayList arrayList3 = new ArrayList();
        ag.c subclass3 = Reflection.getOrCreateKotlinClass(x.class);
        og.a serializer3 = x.Companion.serializer();
        Intrinsics.checkNotNullParameter(subclass3, "subclass");
        Intrinsics.checkNotNullParameter(serializer3, "serializer");
        arrayList3.add(new Pair(subclass3, serializer3));
        Intrinsics.checkNotNullParameter(builder, "builder");
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            Pair pair3 = (Pair) it3.next();
            ag.c cVar3 = (ag.c) pair3.f19192a;
            og.a aVar3 = (og.a) pair3.f19193b;
            Intrinsics.checkNotNull(cVar3, "null cannot be cast to non-null type kotlin.reflect.KClass<Base of kotlinx.serialization.modules.PolymorphicModuleBuilder>");
            Intrinsics.checkNotNull(aVar3, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            c4.d.l(builder, baseClass3, cVar3, aVar3);
        }
        ag.c baseClass4 = Reflection.getOrCreateKotlinClass(m.class);
        Intrinsics.checkNotNullParameter(baseClass4, "baseClass");
        ArrayList arrayList4 = new ArrayList();
        ag.c subclass4 = Reflection.getOrCreateKotlinClass(d0.class);
        og.a serializer4 = d0.Companion.serializer();
        Intrinsics.checkNotNullParameter(subclass4, "subclass");
        Intrinsics.checkNotNullParameter(serializer4, "serializer");
        arrayList4.add(new Pair(subclass4, serializer4));
        Intrinsics.checkNotNullParameter(builder, "builder");
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            Pair pair4 = (Pair) it4.next();
            ag.c cVar4 = (ag.c) pair4.f19192a;
            og.a aVar4 = (og.a) pair4.f19193b;
            Intrinsics.checkNotNull(cVar4, "null cannot be cast to non-null type kotlin.reflect.KClass<Base of kotlinx.serialization.modules.PolymorphicModuleBuilder>");
            Intrinsics.checkNotNull(aVar4, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            c4.d.l(builder, baseClass4, cVar4, aVar4);
        }
        f11106i = new c4.d((HashMap) builder.f3577b, (HashMap) builder.f3578c, (HashMap) builder.f3579d, (HashMap) builder.f3580e, (HashMap) builder.f3581f);
        f1.a builderAction = new f1.a(29);
        tg.b json = tg.c.f23936d;
        Intrinsics.checkNotNullParameter(json, "from");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        Intrinsics.checkNotNullParameter(json, "json");
        tg.h hVar = new tg.h();
        androidx.appcompat.widget.y yVar = json.f23937a;
        boolean z5 = yVar.f1006c;
        hVar.f23948a = yVar.f1005b;
        String str = (String) yVar.f1008e;
        hVar.f23949b = (String) yVar.f1009f;
        tg.a aVar5 = (tg.a) yVar.f1010g;
        boolean z7 = yVar.f1007d;
        hVar.f23950c = json.f23938b;
        builderAction.invoke(hVar);
        if (!Intrinsics.areEqual(str, "    ")) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
        }
        androidx.appcompat.widget.y configuration = new androidx.appcompat.widget.y(hVar.f23948a, z5, str, hVar.f23949b, z7, aVar5);
        c4.d module = hVar.f23950c;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(module, "module");
        tg.r rVar = new tg.r(configuration, module);
        if (!Intrinsics.areEqual(module, vg.d.f24943a)) {
            g6.h0 collector = new g6.h0(configuration);
            module.getClass();
            Intrinsics.checkNotNullParameter(collector, "collector");
            for (Map.Entry entry : ((Map) module.f3577b).entrySet()) {
                ag.c kClass = (ag.c) entry.getKey();
                vg.c cVar5 = (vg.c) entry.getValue();
                if (cVar5 instanceof vg.a) {
                    Intrinsics.checkNotNull(kClass, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                    throw null;
                }
                if (!(cVar5 instanceof vg.b)) {
                    throw new gf.m();
                }
                Intrinsics.checkNotNullParameter(kClass, "kClass");
                Intrinsics.checkNotNullParameter(null, "provider");
            }
            for (Map.Entry entry2 : ((Map) module.f3578c).entrySet()) {
                ag.c baseClass5 = (ag.c) entry2.getKey();
                for (Map.Entry entry3 : ((Map) entry2.getValue()).entrySet()) {
                    ag.c actualClass = (ag.c) entry3.getKey();
                    og.a actualSerializer = (og.a) entry3.getValue();
                    Intrinsics.checkNotNull(baseClass5, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                    Intrinsics.checkNotNull(actualClass, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                    Intrinsics.checkNotNull(actualSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                    Intrinsics.checkNotNullParameter(baseClass5, "baseClass");
                    Intrinsics.checkNotNullParameter(actualClass, "actualClass");
                    Intrinsics.checkNotNullParameter(actualSerializer, "actualSerializer");
                    qg.g d10 = actualSerializer.d();
                    a.a e7 = d10.e();
                    if ((e7 instanceof qg.d) || Intrinsics.areEqual(e7, qg.i.f22176e)) {
                        throw new IllegalArgumentException("Serializer for " + actualClass.getSimpleName() + " can't be registered as a subclass for polymorphic serialization because its kind " + e7 + " is not concrete. To work with multiple hierarchies, register it as a base class.");
                    }
                    boolean z10 = collector.f9847a;
                    if (z10 && (Intrinsics.areEqual(e7, qg.k.f22179f) || Intrinsics.areEqual(e7, qg.k.f22180g) || (e7 instanceof qg.f) || (e7 instanceof qg.j))) {
                        throw new IllegalArgumentException("Serializer for " + actualClass.getSimpleName() + " of kind " + e7 + " cannot be serialized polymorphically with class discriminator.");
                    }
                    if (z10) {
                        int f6 = d10.f();
                        for (int i5 = 0; i5 < f6; i5++) {
                            String g10 = d10.g(i5);
                            if (Intrinsics.areEqual(g10, collector.f9848b)) {
                                throw new IllegalArgumentException("Polymorphic serializer for " + actualClass + " has property '" + g10 + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
                            }
                        }
                    }
                }
            }
            for (Map.Entry entry4 : ((Map) module.f3579d).entrySet()) {
                ag.c baseClass6 = (ag.c) entry4.getKey();
                Function1 function1 = (Function1) entry4.getValue();
                Intrinsics.checkNotNull(baseClass6, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                Intrinsics.checkNotNull(function1, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"value\")] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>");
                Function1 defaultSerializerProvider = (Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function1, 1);
                Intrinsics.checkNotNullParameter(baseClass6, "baseClass");
                Intrinsics.checkNotNullParameter(defaultSerializerProvider, "defaultSerializerProvider");
            }
            for (Map.Entry entry5 : ((Map) module.f3581f).entrySet()) {
                ag.c baseClass7 = (ag.c) entry5.getKey();
                Function1 function12 = (Function1) entry5.getValue();
                Intrinsics.checkNotNull(baseClass7, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                Intrinsics.checkNotNull(function12, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"className\")] kotlin.String?, kotlinx.serialization.DeserializationStrategy<kotlin.Any>?>");
                Function1 defaultDeserializerProvider = (Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function12, 1);
                Intrinsics.checkNotNullParameter(baseClass7, "baseClass");
                Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
            }
        }
        j = rVar;
    }

    public /* synthetic */ e0(int i5, int i10, String str, String str2, String str3, String str4, j jVar, List list) {
        if (127 != (i5 & 127)) {
            s0.f(i5, 127, p.f11130a.d());
            throw null;
        }
        this.f11107a = i10;
        this.f11108b = str;
        this.f11109c = str2;
        this.f11110d = str3;
        this.f11111e = str4;
        this.f11112f = jVar;
        this.f11113g = list;
    }

    public final n a(String str) {
        List list;
        Object obj = null;
        if (this.f11107a < 2 || (list = this.f11113g) == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            n nVar = (n) next;
            if (Intrinsics.areEqual(((a0) nVar).f11070a, str) && ((a0) nVar).f11071b == null) {
                obj = next;
                break;
            }
        }
        return (n) obj;
    }

    public final n b(String str, String str2) {
        List list;
        Object obj = null;
        if (this.f11107a < 2 || (list = this.f11113g) == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            n nVar = (n) next;
            if (Intrinsics.areEqual(((a0) nVar).f11070a, str) && Intrinsics.areEqual(((a0) nVar).f11071b, str2)) {
                obj = next;
                break;
            }
        }
        return (n) obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.f11107a == e0Var.f11107a && Intrinsics.areEqual(this.f11108b, e0Var.f11108b) && Intrinsics.areEqual(this.f11109c, e0Var.f11109c) && Intrinsics.areEqual(this.f11110d, e0Var.f11110d) && Intrinsics.areEqual(this.f11111e, e0Var.f11111e) && Intrinsics.areEqual(this.f11112f, e0Var.f11112f) && Intrinsics.areEqual(this.f11113g, e0Var.f11113g);
    }

    public final int hashCode() {
        int j6 = r4.k.j(r4.k.j(r4.k.j(this.f11107a * 31, 31, this.f11108b), 31, this.f11109c), 31, this.f11110d);
        String str = this.f11111e;
        int hashCode = (j6 + (str == null ? 0 : str.hashCode())) * 31;
        j jVar = this.f11112f;
        int hashCode2 = (hashCode + (jVar == null ? 0 : jVar.hashCode())) * 31;
        List list = this.f11113g;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        char[] cArr;
        tg.r rVar = j;
        rVar.getClass();
        og.a serializer = Companion.serializer();
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        l0 l0Var = new l0((byte) 0, 6);
        ug.c cVar = ug.c.f24266c;
        synchronized (cVar) {
            kotlin.collections.l lVar = (kotlin.collections.l) cVar.f1650b;
            cArr = null;
            char[] cArr2 = (char[]) (lVar.isEmpty() ? null : lVar.removeLast());
            if (cArr2 != null) {
                cVar.f1649a -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[128];
        }
        l0Var.f4045c = cArr;
        try {
            ug.j.j(rVar, l0Var, serializer, this);
            return l0Var.toString();
        } finally {
            l0Var.j();
        }
    }

    public e0(int i5, String productId, String productName, String description, String str, x xVar, List list) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(productName, "productName");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f11107a = i5;
        this.f11108b = productId;
        this.f11109c = productName;
        this.f11110d = description;
        this.f11111e = str;
        this.f11112f = xVar;
        this.f11113g = list;
    }
}
