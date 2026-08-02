package fi;

import bi.m;
import bi.n;
import ei.AbstractC4212b;
import fi.C4305v;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class E {

    /* renamed from: a, reason: collision with root package name */
    public static final C4305v.a f46684a = new C4305v.a();

    /* renamed from: b, reason: collision with root package name */
    public static final C4305v.a f46685b = new C4305v.a();

    public static final Map b(bi.f fVar, AbstractC4212b abstractC4212b) {
        String str;
        String[] names;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean d10 = d(abstractC4212b, fVar);
        n(fVar, abstractC4212b);
        int d11 = fVar.d();
        for (int i10 = 0; i10 < d11; i10++) {
            List f10 = fVar.f(i10);
            ArrayList arrayList = new ArrayList();
            for (Object obj : f10) {
                if (obj instanceof ei.y) {
                    arrayList.add(obj);
                }
            }
            ei.y yVar = (ei.y) CollectionsKt.singleOrNull((List) arrayList);
            if (yVar != null && (names = yVar.names()) != null) {
                for (String str2 : names) {
                    if (d10) {
                        str2 = str2.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(str2, "toLowerCase(...)");
                    }
                    c(linkedHashMap, fVar, str2, i10);
                }
            }
            if (d10) {
                str = fVar.e(i10).toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
            } else {
                str = null;
            }
            if (str != null) {
                c(linkedHashMap, fVar, str, i10);
            }
        }
        return linkedHashMap.isEmpty() ? MapsKt.emptyMap() : linkedHashMap;
    }

    public static final void c(Map map, bi.f fVar, String str, int i10) {
        String str2 = Intrinsics.areEqual(fVar.getKind(), m.b.f25229a) ? "enum value" : "property";
        if (!map.containsKey(str)) {
            map.put(str, Integer.valueOf(i10));
            return;
        }
        throw new B("The suggested name '" + str + "' for " + str2 + ' ' + fVar.e(i10) + " is already one of the names for " + str2 + ' ' + fVar.e(((Number) MapsKt.getValue(map, str)).intValue()) + " in " + fVar);
    }

    public static final boolean d(AbstractC4212b abstractC4212b, bi.f fVar) {
        return abstractC4212b.f().h() && Intrinsics.areEqual(fVar.getKind(), m.b.f25229a);
    }

    public static final Map e(final AbstractC4212b abstractC4212b, final bi.f descriptor) {
        Intrinsics.checkNotNullParameter(abstractC4212b, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return (Map) ei.F.a(abstractC4212b).b(descriptor, f46684a, new Function0() { // from class: fi.D
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Map f10;
                f10 = E.f(bi.f.this, abstractC4212b);
                return f10;
            }
        });
    }

    public static final Map f(bi.f fVar, AbstractC4212b abstractC4212b) {
        return b(fVar, abstractC4212b);
    }

    public static final C4305v.a g() {
        return f46684a;
    }

    public static final String h(bi.f fVar, AbstractC4212b json, int i10) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        n(fVar, json);
        return fVar.e(i10);
    }

    public static final int i(bi.f fVar, AbstractC4212b json, String name) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(name, "name");
        if (d(json, fVar)) {
            String lowerCase = name.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            return l(fVar, json, lowerCase);
        }
        n(fVar, json);
        int c10 = fVar.c(name);
        return (c10 == -3 && json.f().o()) ? l(fVar, json, name) : c10;
    }

    public static final int j(bi.f fVar, AbstractC4212b json, String name, String suffix) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        int i10 = i(fVar, json, name);
        if (i10 != -3) {
            return i10;
        }
        throw new Zh.o(fVar.h() + " does not contain element with name '" + name + '\'' + suffix);
    }

    public static /* synthetic */ int k(bi.f fVar, AbstractC4212b abstractC4212b, String str, String str2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str2 = "";
        }
        return j(fVar, abstractC4212b, str, str2);
    }

    public static final int l(bi.f fVar, AbstractC4212b abstractC4212b, String str) {
        Integer num = (Integer) e(abstractC4212b, fVar).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final boolean m(bi.f fVar, AbstractC4212b json) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        if (json.f().k()) {
            return true;
        }
        List annotations = fVar.getAnnotations();
        if ((annotations instanceof Collection) && annotations.isEmpty()) {
            return false;
        }
        Iterator it = annotations.iterator();
        while (it.hasNext()) {
            if (((Annotation) it.next()) instanceof ei.t) {
                return true;
            }
        }
        return false;
    }

    public static final ei.z n(bi.f fVar, AbstractC4212b json) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        if (Intrinsics.areEqual(fVar.getKind(), n.a.f25230a)) {
            json.f().l();
        }
        return null;
    }
}
