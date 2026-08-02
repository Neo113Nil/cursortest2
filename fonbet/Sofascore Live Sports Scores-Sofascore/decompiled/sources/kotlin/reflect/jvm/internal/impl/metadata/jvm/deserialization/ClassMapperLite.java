package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import com.ironsource.U3;
import com.sofascore.model.mvvm.model.PlayerKt;
import defpackage.bf3;
import defpackage.dmi;
import defpackage.fc6;
import defpackage.ljg;
import defpackage.mz1;
import defpackage.vha;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ClassMapperLite {

    @NotNull
    public static final ClassMapperLite INSTANCE = new ClassMapperLite();

    /* renamed from: kotlin, reason: collision with root package name */
    @NotNull
    private static final String f3811kotlin;

    @NotNull
    private static final Map<String, String> map;

    static {
        String str;
        String f0 = CollectionsKt.f0(b.j('k', 'o', 't', 'l', 'i', 'n'), "", null, null, null, 62);
        f3811kotlin = f0;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List j = b.j("Boolean", "Z", "Char", "C", "Byte", "B", "Short", PlayerKt.VOLLEYBALL_SETTER, "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int v = vha.v(0, j.size() - 1, 2);
        if (v >= 0) {
            int i = 0;
            while (true) {
                StringBuilder sb = new StringBuilder();
                str = f3811kotlin;
                sb.append(str);
                sb.append('/');
                sb.append((String) j.get(i));
                int i2 = i + 1;
                linkedHashMap.put(sb.toString(), j.get(i2));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append('/');
                linkedHashMap.put(mz1.o(sb2, (String) j.get(i), "Array"), U3.j.d + ((String) j.get(i2)));
                if (i == v) {
                    break;
                } else {
                    i += 2;
                }
            }
            f0 = str;
        }
        linkedHashMap.put(f0 + "/Unit", "V");
        map$lambda$0$add(linkedHashMap, "Any", "java/lang/Object");
        map$lambda$0$add(linkedHashMap, "Nothing", "java/lang/Void");
        map$lambda$0$add(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (String str2 : b.j("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            map$lambda$0$add(linkedHashMap, str2, dmi.q("java/lang/", str2));
        }
        for (String str3 : b.j("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            map$lambda$0$add(linkedHashMap, dmi.q("collections/", str3), dmi.q("java/util/", str3));
            map$lambda$0$add(linkedHashMap, dmi.q("collections/Mutable", str3), dmi.q("java/util/", str3));
        }
        map$lambda$0$add(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        map$lambda$0$add(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        map$lambda$0$add(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        map$lambda$0$add(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i3 = 0; i3 < 23; i3++) {
            String j2 = ljg.j(i3, "Function");
            StringBuilder sb3 = new StringBuilder();
            String str4 = f3811kotlin;
            map$lambda$0$add(linkedHashMap, j2, bf3.h(i3, str4, "/jvm/functions/Function", sb3));
            map$lambda$0$add(linkedHashMap, ljg.j(i3, "reflect/KFunction"), dmi.y(str4, "/reflect/KFunction"));
        }
        for (String str5 : b.j("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            map$lambda$0$add(linkedHashMap, dmi.y(str5, ".Companion"), fc6.o(new StringBuilder(), f3811kotlin, "/jvm/internal/", str5, "CompanionObject"));
        }
        map = linkedHashMap;
    }

    private ClassMapperLite() {
    }

    private static final void map$lambda$0$add(Map<String, String> map2, String str, String str2) {
        map2.put(f3811kotlin + '/' + str, "L" + str2 + ';');
    }

    @NotNull
    public static final String mapClass(@NotNull String str) {
        str.getClass();
        String str2 = map.get(str);
        if (str2 != null) {
            return str2;
        }
        StringBuilder sb = new StringBuilder("L");
        String replace = str.replace('.', '$');
        replace.getClass();
        sb.append(replace);
        sb.append(';');
        return sb.toString();
    }
}
