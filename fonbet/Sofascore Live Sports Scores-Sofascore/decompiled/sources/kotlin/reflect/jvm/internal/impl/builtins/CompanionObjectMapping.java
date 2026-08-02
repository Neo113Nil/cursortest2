package kotlin.reflect.jvm.internal.impl.builtins;

import defpackage.k13;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class CompanionObjectMapping {

    @NotNull
    public static final CompanionObjectMapping INSTANCE = new CompanionObjectMapping();

    @NotNull
    private static final Set<ClassId> classIds;

    static {
        Set<PrimitiveType> set = PrimitiveType.NUMBER_TYPES;
        ArrayList arrayList = new ArrayList(k13.r(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(StandardNames.getPrimitiveFqName((PrimitiveType) it.next()));
        }
        FqName safe = StandardNames.FqNames.string.toSafe();
        safe.getClass();
        ArrayList x0 = CollectionsKt.x0(arrayList, safe);
        FqName safe2 = StandardNames.FqNames._boolean.toSafe();
        safe2.getClass();
        ArrayList x02 = CollectionsKt.x0(x0, safe2);
        FqName safe3 = StandardNames.FqNames._enum.toSafe();
        safe3.getClass();
        ArrayList x03 = CollectionsKt.x0(x02, safe3);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = x03.iterator();
        while (it2.hasNext()) {
            linkedHashSet.add(ClassId.topLevel((FqName) it2.next()));
        }
        classIds = linkedHashSet;
    }

    private CompanionObjectMapping() {
    }

    @NotNull
    public final Set<ClassId> allClassesWithIntrinsicCompanions() {
        return classIds;
    }

    @NotNull
    public final Set<ClassId> getClassIds() {
        return classIds;
    }
}
