package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import defpackage.c38;
import defpackage.d38;
import defpackage.i5h;
import defpackage.k13;
import defpackage.km5;
import defpackage.sub;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public class ClassDeclaredMemberIndex implements DeclaredMemberIndex {

    @NotNull
    private final Map<Name, JavaRecordComponent> components;

    @NotNull
    private final Map<Name, JavaField> fields;

    @NotNull
    private final JavaClass jClass;

    @NotNull
    private final Function1<JavaMember, Boolean> memberFilter;

    @NotNull
    private final Function1<JavaMethod, Boolean> methodFilter;

    @NotNull
    private final Map<Name, List<JavaMethod>> methods;

    /* JADX WARN: Multi-variable type inference failed */
    public ClassDeclaredMemberIndex(@NotNull JavaClass javaClass, @NotNull Function1<? super JavaMember, Boolean> function1) {
        javaClass.getClass();
        function1.getClass();
        this.jClass = javaClass;
        this.memberFilter = function1;
        ClassDeclaredMemberIndex$methodFilter$1 classDeclaredMemberIndex$methodFilter$1 = new ClassDeclaredMemberIndex$methodFilter$1(this);
        this.methodFilter = classDeclaredMemberIndex$methodFilter$1;
        d38 g = i5h.g(CollectionsKt.N(javaClass.getMethods()), classDeclaredMemberIndex$methodFilter$1);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c38 c38Var = new c38(g);
        while (c38Var.hasNext()) {
            Object next = c38Var.next();
            Name name = ((JavaMethod) next).getName();
            Object obj = linkedHashMap.get(name);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(name, obj);
            }
            ((List) obj).add(next);
        }
        this.methods = linkedHashMap;
        d38 g2 = i5h.g(CollectionsKt.N(this.jClass.getFields()), this.memberFilter);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        c38 c38Var2 = new c38(g2);
        while (c38Var2.hasNext()) {
            Object next2 = c38Var2.next();
            linkedHashMap2.put(((JavaField) next2).getName(), next2);
        }
        this.fields = linkedHashMap2;
        Collection<JavaRecordComponent> recordComponents = this.jClass.getRecordComponents();
        Function1<JavaMember, Boolean> function12 = this.memberFilter;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : recordComponents) {
            if (((Boolean) function12.invoke(obj2)).booleanValue()) {
                arrayList.add(obj2);
            }
        }
        int c = sub.c(k13.r(arrayList, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(c < 16 ? 16 : c);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next3 = it.next();
            linkedHashMap3.put(((JavaRecordComponent) next3).getName(), next3);
        }
        this.components = linkedHashMap3;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    @Nullable
    public JavaField findFieldByName(@NotNull Name name) {
        name.getClass();
        return this.fields.get(name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    @NotNull
    public Collection<JavaMethod> findMethodsByName(@NotNull Name name) {
        name.getClass();
        List<JavaMethod> list = this.methods.get(name);
        return list != null ? list : km5.a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    @Nullable
    public JavaRecordComponent findRecordComponentByName(@NotNull Name name) {
        name.getClass();
        return this.components.get(name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    @NotNull
    public Set<Name> getFieldNames() {
        d38 g = i5h.g(CollectionsKt.N(this.jClass.getFields()), this.memberFilter);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        c38 c38Var = new c38(g);
        while (c38Var.hasNext()) {
            linkedHashSet.add(((JavaField) c38Var.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    @NotNull
    public Set<Name> getMethodNames() {
        d38 g = i5h.g(CollectionsKt.N(this.jClass.getMethods()), this.methodFilter);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        c38 c38Var = new c38(g);
        while (c38Var.hasNext()) {
            linkedHashSet.add(((JavaMethod) c38Var.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    @NotNull
    public Set<Name> getRecordComponentNames() {
        return this.components.keySet();
    }
}
