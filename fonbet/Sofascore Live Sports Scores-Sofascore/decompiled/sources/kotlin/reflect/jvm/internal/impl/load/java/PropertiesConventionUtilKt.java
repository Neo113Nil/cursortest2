package kotlin.reflect.jvm.internal.impl.load.java;

import defpackage.ph0;
import java.util.List;
import kotlin.collections.b;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;
import kotlin.text.StringsKt;
import kotlin.text.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class PropertiesConventionUtilKt {
    @NotNull
    public static final List<Name> getPropertyNamesCandidatesByAccessorName(@NotNull Name name) {
        name.getClass();
        String asString = name.asString();
        asString.getClass();
        return JvmAbi.isGetterName(asString) ? b.k(propertyNameByGetMethodName(name)) : JvmAbi.isSetterName(asString) ? propertyNamesBySetMethodName(name) : BuiltinSpecialProperties.INSTANCE.getPropertyNameCandidatesBySpecialGetterName(name);
    }

    @Nullable
    public static final Name propertyNameByGetMethodName(@NotNull Name name) {
        name.getClass();
        Name propertyNameFromAccessorMethodName$default = propertyNameFromAccessorMethodName$default(name, "get", false, null, 12, null);
        return propertyNameFromAccessorMethodName$default == null ? propertyNameFromAccessorMethodName$default(name, "is", false, null, 8, null) : propertyNameFromAccessorMethodName$default;
    }

    @Nullable
    public static final Name propertyNameBySetMethodName(@NotNull Name name, boolean z) {
        name.getClass();
        return propertyNameFromAccessorMethodName$default(name, "set", false, z ? "is" : null, 4, null);
    }

    private static final Name propertyNameFromAccessorMethodName(Name name, String str, boolean z, String str2) {
        if (name.isSpecial()) {
            return null;
        }
        String identifier = name.getIdentifier();
        identifier.getClass();
        if (!c.v(identifier, str, false) || identifier.length() == str.length()) {
            return null;
        }
        char charAt = identifier.charAt(str.length());
        if ('a' <= charAt && charAt < '{') {
            return null;
        }
        if (str2 != null) {
            return Name.identifier(str2.concat(StringsKt.V(identifier, str)));
        }
        if (!z) {
            return name;
        }
        String decapitalizeSmartForCompiler = CapitalizeDecapitalizeKt.decapitalizeSmartForCompiler(StringsKt.V(identifier, str), true);
        if (Name.isValidIdentifier(decapitalizeSmartForCompiler)) {
            return Name.identifier(decapitalizeSmartForCompiler);
        }
        return null;
    }

    public static /* synthetic */ Name propertyNameFromAccessorMethodName$default(Name name, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        return propertyNameFromAccessorMethodName(name, str, z, str2);
    }

    @NotNull
    public static final List<Name> propertyNamesBySetMethodName(@NotNull Name name) {
        name.getClass();
        return ph0.x(new Name[]{propertyNameBySetMethodName(name, false), propertyNameBySetMethodName(name, true)});
    }
}
