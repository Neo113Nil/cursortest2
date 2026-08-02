package kotlin.reflect.jvm.internal.impl.load.java;

import com.unity3d.ads.metadata.MediationMetaData;
import defpackage.k13;
import defpackage.km5;
import defpackage.sub;
import defpackage.tub;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class BuiltinSpecialProperties {

    @NotNull
    private static final Map<Name, List<Name>> GETTER_JVM_NAME_TO_PROPERTIES_SHORT_NAME_MAP;

    @NotNull
    public static final BuiltinSpecialProperties INSTANCE = new BuiltinSpecialProperties();

    @NotNull
    private static final Map<FqName, Name> PROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP;

    @NotNull
    private static final Set<FqName> SPECIAL_FQ_NAMES;

    @NotNull
    private static final Set<Name> SPECIAL_SHORT_NAMES;

    static {
        FqName childSafe;
        FqName childSafe2;
        FqName child;
        FqName child2;
        FqName childSafe3;
        FqName child3;
        FqName child4;
        FqName child5;
        FqNameUnsafe fqNameUnsafe = StandardNames.FqNames._enum;
        childSafe = BuiltinSpecialPropertiesKt.childSafe(fqNameUnsafe, "name");
        Pair pair = new Pair(childSafe, Name.identifier("name"));
        childSafe2 = BuiltinSpecialPropertiesKt.childSafe(fqNameUnsafe, MediationMetaData.KEY_ORDINAL);
        Pair pair2 = new Pair(childSafe2, Name.identifier(MediationMetaData.KEY_ORDINAL));
        child = BuiltinSpecialPropertiesKt.child(StandardNames.FqNames.collection, "size");
        Pair pair3 = new Pair(child, Name.identifier("size"));
        FqName fqName = StandardNames.FqNames.map;
        child2 = BuiltinSpecialPropertiesKt.child(fqName, "size");
        Pair pair4 = new Pair(child2, Name.identifier("size"));
        childSafe3 = BuiltinSpecialPropertiesKt.childSafe(StandardNames.FqNames.charSequence, "length");
        Pair pair5 = new Pair(childSafe3, Name.identifier("length"));
        child3 = BuiltinSpecialPropertiesKt.child(fqName, "keys");
        Pair pair6 = new Pair(child3, Name.identifier("keySet"));
        child4 = BuiltinSpecialPropertiesKt.child(fqName, "values");
        Pair pair7 = new Pair(child4, Name.identifier("values"));
        child5 = BuiltinSpecialPropertiesKt.child(fqName, "entries");
        Map<FqName, Name> h = tub.h(pair, pair2, pair3, pair4, pair5, pair6, pair7, new Pair(child5, Name.identifier("entrySet")));
        PROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP = h;
        Set<Map.Entry<FqName, Name>> entrySet = h.entrySet();
        ArrayList arrayList = new ArrayList(k13.r(entrySet, 10));
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            arrayList.add(new Pair(((FqName) entry.getKey()).shortName(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Pair pair8 = (Pair) it2.next();
            Name name = (Name) pair8.b;
            Object obj = linkedHashMap.get(name);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(name, obj);
            }
            ((List) obj).add((Name) pair8.a);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(sub.c(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            Iterable iterable = (Iterable) entry2.getValue();
            iterable.getClass();
            linkedHashMap2.put(key, CollectionsKt.S0(CollectionsKt.V0(iterable)));
        }
        GETTER_JVM_NAME_TO_PROPERTIES_SHORT_NAME_MAP = linkedHashMap2;
        Set<FqName> keySet = PROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP.keySet();
        SPECIAL_FQ_NAMES = keySet;
        Set<FqName> set = keySet;
        ArrayList arrayList2 = new ArrayList(k13.r(set, 10));
        Iterator<T> it3 = set.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((FqName) it3.next()).shortName());
        }
        SPECIAL_SHORT_NAMES = CollectionsKt.W0(arrayList2);
    }

    private BuiltinSpecialProperties() {
    }

    @NotNull
    public final Map<FqName, Name> getPROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP() {
        return PROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP;
    }

    @NotNull
    public final List<Name> getPropertyNameCandidatesBySpecialGetterName(@NotNull Name name) {
        name.getClass();
        List<Name> list = GETTER_JVM_NAME_TO_PROPERTIES_SHORT_NAME_MAP.get(name);
        return list == null ? km5.a : list;
    }

    @NotNull
    public final Set<FqName> getSPECIAL_FQ_NAMES() {
        return SPECIAL_FQ_NAMES;
    }

    @NotNull
    public final Set<Name> getSPECIAL_SHORT_NAMES() {
        return SPECIAL_SHORT_NAMES;
    }
}
