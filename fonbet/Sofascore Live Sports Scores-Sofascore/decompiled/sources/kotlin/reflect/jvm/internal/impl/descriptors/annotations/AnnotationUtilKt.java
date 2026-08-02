package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import defpackage.km5;
import defpackage.tub;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class AnnotationUtilKt {

    @NotNull
    private static final Name DEPRECATED_LEVEL_NAME;

    @NotNull
    private static final Name DEPRECATED_MESSAGE_NAME;

    @NotNull
    private static final Name DEPRECATED_REPLACE_WITH_NAME;

    @NotNull
    private static final Name REPLACE_WITH_EXPRESSION_NAME;

    @NotNull
    private static final Name REPLACE_WITH_IMPORTS_NAME;

    static {
        Name identifier = Name.identifier(PglCryptUtils.KEY_MESSAGE);
        identifier.getClass();
        DEPRECATED_MESSAGE_NAME = identifier;
        Name identifier2 = Name.identifier("replaceWith");
        identifier2.getClass();
        DEPRECATED_REPLACE_WITH_NAME = identifier2;
        Name identifier3 = Name.identifier("level");
        identifier3.getClass();
        DEPRECATED_LEVEL_NAME = identifier3;
        Name identifier4 = Name.identifier("expression");
        identifier4.getClass();
        REPLACE_WITH_EXPRESSION_NAME = identifier4;
        Name identifier5 = Name.identifier("imports");
        identifier5.getClass();
        REPLACE_WITH_IMPORTS_NAME = identifier5;
    }

    @NotNull
    public static final AnnotationDescriptor createDeprecatedAnnotation(@NotNull KotlinBuiltIns kotlinBuiltIns, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
        kotlinBuiltIns.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        BuiltInAnnotationDescriptor builtInAnnotationDescriptor = new BuiltInAnnotationDescriptor(kotlinBuiltIns, StandardNames.FqNames.replaceWith, tub.h(new Pair(REPLACE_WITH_EXPRESSION_NAME, new StringValue(str2)), new Pair(REPLACE_WITH_IMPORTS_NAME, new ArrayValue(km5.a, new AnnotationUtilKt$createDeprecatedAnnotation$replaceWithAnnotation$1(kotlinBuiltIns)))), false, 8, null);
        FqName fqName = StandardNames.FqNames.deprecated;
        Pair pair = new Pair(DEPRECATED_MESSAGE_NAME, new StringValue(str));
        Pair pair2 = new Pair(DEPRECATED_REPLACE_WITH_NAME, new AnnotationValue(builtInAnnotationDescriptor));
        Name name = DEPRECATED_LEVEL_NAME;
        ClassId classId = ClassId.topLevel(StandardNames.FqNames.deprecationLevel);
        classId.getClass();
        Name identifier = Name.identifier(str3);
        identifier.getClass();
        return new BuiltInAnnotationDescriptor(kotlinBuiltIns, fqName, tub.h(pair, pair2, new Pair(name, new EnumValue(classId, identifier))), z);
    }

    public static /* synthetic */ AnnotationDescriptor createDeprecatedAnnotation$default(KotlinBuiltIns kotlinBuiltIns, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "WARNING";
        }
        if ((i & 8) != 0) {
            z = false;
        }
        return createDeprecatedAnnotation(kotlinBuiltIns, str, str2, str3, z);
    }
}
