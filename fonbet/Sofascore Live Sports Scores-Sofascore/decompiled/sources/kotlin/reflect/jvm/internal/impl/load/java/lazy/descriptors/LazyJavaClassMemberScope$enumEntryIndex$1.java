package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import defpackage.k13;
import defpackage.sub;
import defpackage.xka;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class LazyJavaClassMemberScope$enumEntryIndex$1 extends xka implements Function0<Map<Name, ? extends JavaField>> {
    final /* synthetic */ LazyJavaClassMemberScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaClassMemberScope$enumEntryIndex$1(LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        super(0);
        this.this$0 = lazyJavaClassMemberScope;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Map<Name, JavaField> invoke() {
        JavaClass javaClass;
        javaClass = this.this$0.jClass;
        Collection<JavaField> fields = javaClass.getFields();
        ArrayList arrayList = new ArrayList();
        for (Object obj : fields) {
            if (((JavaField) obj).isEnumEntry()) {
                arrayList.add(obj);
            }
        }
        int c = sub.c(k13.r(arrayList, 10));
        if (c < 16) {
            c = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(c);
        for (Object obj2 : arrayList) {
            linkedHashMap.put(((JavaField) obj2).getName(), obj2);
        }
        return linkedHashMap;
    }
}
