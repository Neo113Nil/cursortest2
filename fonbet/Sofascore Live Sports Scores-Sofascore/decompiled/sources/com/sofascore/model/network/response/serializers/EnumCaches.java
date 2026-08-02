package com.sofascore.model.network.response.serializers;

import defpackage.k13;
import defpackage.q5h;
import defpackage.sub;
import defpackage.tub;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\f\u001a\u00020\r\"\u000e\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0006H\u0002J&\u0010\u0004\u001a\u0004\u0018\u00010\t\"\u000e\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000e0\bJ2\u0010\u0011\u001a\b\u0012\u0002\b\u0003\u0018\u00010\b\"\u000e\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00062\u0006\u0010\u0012\u001a\u00020\tJ2\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\b\"\u000e\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00062\u0006\u0010\u0012\u001a\u00020\tR.\u0010\u0004\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0004\u0012\u00020\t0\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R.\u0010\n\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R.\u0010\u000b\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/sofascore/model/network/response/serializers/EnumCaches;", "", "<init>", "()V", "serialNameByEnum", "", "Ljava/lang/Class;", "", "", "", "enumByEnumName", "enumBySerialName", "makeCache", "", "T", "declaringClass", "enum", "enumByName", "serialName", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EnumCaches {

    @NotNull
    public static final EnumCaches INSTANCE = new EnumCaches();

    @NotNull
    private static final Map<Class<?>, Map<Enum<?>, String>> serialNameByEnum = new LinkedHashMap();

    @NotNull
    private static final Map<Class<?>, Map<String, Enum<?>>> enumByEnumName = new LinkedHashMap();

    @NotNull
    private static final Map<Class<?>, Map<String, Enum<?>>> enumBySerialName = new LinkedHashMap();

    private EnumCaches() {
    }

    private final <T extends Enum<T>> void makeCache(Class<T> declaringClass) {
        T[] enumConstants = declaringClass.getEnumConstants();
        enumConstants.getClass();
        T[] tArr = enumConstants;
        ArrayList<Pair> arrayList = new ArrayList();
        for (T t : tArr) {
            t.getClass();
            Class declaringClass2 = t.getDeclaringClass();
            declaringClass2.getClass();
            q5h q5hVar = (q5h) declaringClass2.getField(t.name()).getAnnotation(q5h.class);
            String value = q5hVar != null ? q5hVar.value() : null;
            Pair pair = value != null ? new Pair(t, value) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        serialNameByEnum.put(declaringClass, tub.o(arrayList));
        Map<Class<?>, Map<String, Enum<?>>> map = enumByEnumName;
        int c = sub.c(tArr.length);
        if (c < 16) {
            c = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(c);
        for (T t2 : tArr) {
            linkedHashMap.put(t2.name(), t2);
        }
        map.put(declaringClass, linkedHashMap);
        Map<Class<?>, Map<String, Enum<?>>> map2 = enumBySerialName;
        int c2 = sub.c(k13.r(arrayList, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(c2 >= 16 ? c2 : 16);
        for (Pair pair2 : arrayList) {
            linkedHashMap2.put(pair2.b, pair2.a);
        }
        map2.put(declaringClass, linkedHashMap2);
    }

    @Nullable
    public final <T extends Enum<T>> Enum<?> enumByName(@NotNull Class<T> declaringClass, @NotNull String serialName) {
        declaringClass.getClass();
        serialName.getClass();
        Map<Class<?>, Map<String, Enum<?>>> map = enumByEnumName;
        if (map.get(declaringClass) == null) {
            makeCache(declaringClass);
        }
        Map<String, Enum<?>> map2 = map.get(declaringClass);
        if (map2 != null) {
            return map2.get(serialName);
        }
        return null;
    }

    @Nullable
    public final <T extends Enum<T>> Enum<?> enumBySerialName(@NotNull Class<T> declaringClass, @NotNull String serialName) {
        declaringClass.getClass();
        serialName.getClass();
        Map<Class<?>, Map<String, Enum<?>>> map = enumBySerialName;
        if (map.get(declaringClass) == null) {
            makeCache(declaringClass);
        }
        Map<String, Enum<?>> map2 = map.get(declaringClass);
        if (map2 != null) {
            return map2.get(serialName);
        }
        return null;
    }

    @Nullable
    public final <T extends Enum<T>> String serialNameByEnum(@NotNull Enum<T> r4) {
        r4.getClass();
        Class<T> declaringClass = r4.getDeclaringClass();
        declaringClass.getClass();
        Map<Class<?>, Map<Enum<?>, String>> map = serialNameByEnum;
        if (map.get(declaringClass) == null) {
            makeCache(declaringClass);
        }
        Map<Enum<?>, String> map2 = map.get(declaringClass);
        if (map2 != null) {
            return map2.get(r4);
        }
        return null;
    }
}
