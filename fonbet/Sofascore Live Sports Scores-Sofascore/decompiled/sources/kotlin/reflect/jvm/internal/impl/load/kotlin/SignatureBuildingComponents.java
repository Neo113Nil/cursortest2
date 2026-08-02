package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.appsflyer.internal.i;
import defpackage.dmi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class SignatureBuildingComponents {

    @NotNull
    public static final SignatureBuildingComponents INSTANCE = new SignatureBuildingComponents();

    private SignatureBuildingComponents() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String escapeClassName(String str) {
        return str.length() > 1 ? dmi.j(';', "L", str) : str;
    }

    @NotNull
    public final String[] constructors(@NotNull String... strArr) {
        strArr.getClass();
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    @NotNull
    public final Set<String> inClass(@NotNull String str, @NotNull String... strArr) {
        str.getClass();
        strArr.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str2 : strArr) {
            linkedHashSet.add(str + '.' + str2);
        }
        return linkedHashSet;
    }

    @NotNull
    public final Set<String> inJavaLang(@NotNull String str, @NotNull String... strArr) {
        str.getClass();
        strArr.getClass();
        return inClass(javaLang(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @NotNull
    public final Set<String> inJavaUtil(@NotNull String str, @NotNull String... strArr) {
        str.getClass();
        strArr.getClass();
        return inClass(javaUtil(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @NotNull
    public final String javaFunction(@NotNull String str) {
        return i.h(str, "java/util/function/", str);
    }

    @NotNull
    public final String javaLang(@NotNull String str) {
        return i.h(str, "java/lang/", str);
    }

    @NotNull
    public final String javaUtil(@NotNull String str) {
        return i.h(str, "java/util/", str);
    }

    @NotNull
    public final String jvmDescriptor(@NotNull String str, @NotNull List<String> list, @NotNull String str2) {
        str.getClass();
        list.getClass();
        str2.getClass();
        return str + '(' + CollectionsKt.f0(list, "", null, null, SignatureBuildingComponents$jvmDescriptor$1.INSTANCE, 30) + ')' + escapeClassName(str2);
    }

    @NotNull
    public final String signature(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        return str + '.' + str2;
    }
}
