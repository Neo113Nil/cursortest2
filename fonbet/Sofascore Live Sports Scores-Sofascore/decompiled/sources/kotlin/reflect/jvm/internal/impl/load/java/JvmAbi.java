package kotlin.reflect.jvm.internal.impl.load.java;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;
import kotlin.text.c;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class JvmAbi {

    @NotNull
    public static final JvmAbi INSTANCE = new JvmAbi();

    @NotNull
    public static final ClassId JVM_FIELD_ANNOTATION_CLASS_ID;

    @NotNull
    public static final FqName JVM_FIELD_ANNOTATION_FQ_NAME;

    @NotNull
    private static final ClassId REFLECTION_FACTORY_IMPL;

    @NotNull
    private static final ClassId REPEATABLE_ANNOTATION_CONTAINER_META_ANNOTATION;

    static {
        FqName fqName = new FqName("kotlin.jvm.JvmField");
        JVM_FIELD_ANNOTATION_FQ_NAME = fqName;
        ClassId classId = ClassId.topLevel(fqName);
        classId.getClass();
        JVM_FIELD_ANNOTATION_CLASS_ID = classId;
        ClassId classId2 = ClassId.topLevel(new FqName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        classId2.getClass();
        REFLECTION_FACTORY_IMPL = classId2;
        ClassId fromString = ClassId.fromString("kotlin/jvm/internal/RepeatableContainer");
        fromString.getClass();
        REPEATABLE_ANNOTATION_CONTAINER_META_ANNOTATION = fromString;
    }

    private JvmAbi() {
    }

    @NotNull
    public static final String getterName(@NotNull String str) {
        str.getClass();
        if (startsWithIsPrefix(str)) {
            return str;
        }
        return "get" + CapitalizeDecapitalizeKt.capitalizeAsciiOnly(str);
    }

    public static final boolean isGetterName(@NotNull String str) {
        str.getClass();
        return c.v(str, "get", false) || c.v(str, "is", false);
    }

    public static final boolean isSetterName(@NotNull String str) {
        str.getClass();
        return c.v(str, "set", false);
    }

    @NotNull
    public static final String setterName(@NotNull String str) {
        str.getClass();
        StringBuilder sb = new StringBuilder("set");
        sb.append(startsWithIsPrefix(str) ? str.substring(2) : CapitalizeDecapitalizeKt.capitalizeAsciiOnly(str));
        return sb.toString();
    }

    public static final boolean startsWithIsPrefix(@NotNull String str) {
        str.getClass();
        if (c.v(str, "is", false) && str.length() != 2) {
            char charAt = str.charAt(2);
            if (Intrinsics.d(97, charAt) > 0 || Intrinsics.d(charAt, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE) > 0) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final ClassId getREPEATABLE_ANNOTATION_CONTAINER_META_ANNOTATION() {
        return REPEATABLE_ANNOTATION_CONTAINER_META_ANNOTATION;
    }
}
