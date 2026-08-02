package kotlin.reflect.jvm.internal.impl.types.error;

import defpackage.km5;
import defpackage.w9h;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ErrorUtils {

    @NotNull
    private static final ErrorClassDescriptor errorClass;

    @NotNull
    private static final PropertyDescriptor errorProperty;

    @NotNull
    private static final Set<PropertyDescriptor> errorPropertyGroup;

    @NotNull
    private static final KotlinType errorPropertyType;

    @NotNull
    private static final KotlinType errorTypeForLoopInSupertypes;

    @NotNull
    public static final ErrorUtils INSTANCE = new ErrorUtils();

    @NotNull
    private static final ModuleDescriptor errorModule = ErrorModuleDescriptor.INSTANCE;

    static {
        Name special = Name.special(String.format(ErrorEntity.ERROR_CLASS.getDebugText(), Arrays.copyOf(new Object[]{"unknown class"}, 1)));
        special.getClass();
        errorClass = new ErrorClassDescriptor(special);
        errorTypeForLoopInSupertypes = createErrorType(ErrorTypeKind.CYCLIC_SUPERTYPES, new String[0]);
        errorPropertyType = createErrorType(ErrorTypeKind.ERROR_PROPERTY_TYPE, new String[0]);
        ErrorPropertyDescriptor errorPropertyDescriptor = new ErrorPropertyDescriptor();
        errorProperty = errorPropertyDescriptor;
        errorPropertyGroup = w9h.b(errorPropertyDescriptor);
    }

    private ErrorUtils() {
    }

    @NotNull
    public static final ErrorScope createErrorScope(@NotNull ErrorScopeKind errorScopeKind, boolean z, @NotNull String... strArr) {
        errorScopeKind.getClass();
        strArr.getClass();
        return z ? new ThrowingScope(errorScopeKind, (String[]) Arrays.copyOf(strArr, strArr.length)) : new ErrorScope(errorScopeKind, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final boolean isError(@Nullable DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            return false;
        }
        ErrorUtils errorUtils = INSTANCE;
        return errorUtils.isErrorClass(declarationDescriptor) || errorUtils.isErrorClass(declarationDescriptor.getContainingDeclaration()) || declarationDescriptor == errorModule;
    }

    private final boolean isErrorClass(DeclarationDescriptor declarationDescriptor) {
        return declarationDescriptor instanceof ErrorClassDescriptor;
    }

    public static final boolean isUninferredTypeVariable(@Nullable KotlinType kotlinType) {
        if (kotlinType == null) {
            return false;
        }
        TypeConstructor constructor = kotlinType.getConstructor();
        return (constructor instanceof ErrorTypeConstructor) && ((ErrorTypeConstructor) constructor).getKind() == ErrorTypeKind.UNINFERRED_TYPE_VARIABLE;
    }

    @NotNull
    public final ErrorType createErrorType(@NotNull ErrorTypeKind errorTypeKind, @NotNull TypeConstructor typeConstructor, @NotNull String... strArr) {
        errorTypeKind.getClass();
        typeConstructor.getClass();
        strArr.getClass();
        return createErrorTypeWithArguments(errorTypeKind, km5.a, typeConstructor, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @NotNull
    public final ErrorTypeConstructor createErrorTypeConstructor(@NotNull ErrorTypeKind errorTypeKind, @NotNull String... strArr) {
        errorTypeKind.getClass();
        strArr.getClass();
        return new ErrorTypeConstructor(errorTypeKind, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @NotNull
    public final ErrorType createErrorTypeWithArguments(@NotNull ErrorTypeKind errorTypeKind, @NotNull List<? extends TypeProjection> list, @NotNull TypeConstructor typeConstructor, @NotNull String... strArr) {
        errorTypeKind.getClass();
        list.getClass();
        typeConstructor.getClass();
        strArr.getClass();
        return new ErrorType(typeConstructor, createErrorScope(ErrorScopeKind.ERROR_TYPE_SCOPE, typeConstructor.toString()), errorTypeKind, list, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @NotNull
    public final ErrorClassDescriptor getErrorClass() {
        return errorClass;
    }

    @NotNull
    public final ModuleDescriptor getErrorModule() {
        return errorModule;
    }

    @NotNull
    public final Set<PropertyDescriptor> getErrorPropertyGroup() {
        return errorPropertyGroup;
    }

    @NotNull
    public final KotlinType getErrorPropertyType() {
        return errorPropertyType;
    }

    @NotNull
    public final KotlinType getErrorTypeForLoopInSupertypes() {
        return errorTypeForLoopInSupertypes;
    }

    @NotNull
    public final String unresolvedTypeAsItIs(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        TypeUtilsKt.isUnresolvedType(kotlinType);
        TypeConstructor constructor = kotlinType.getConstructor();
        constructor.getClass();
        return ((ErrorTypeConstructor) constructor).getParam(0);
    }

    @NotNull
    public static final ErrorType createErrorType(@NotNull ErrorTypeKind errorTypeKind, @NotNull String... strArr) {
        errorTypeKind.getClass();
        strArr.getClass();
        return INSTANCE.createErrorTypeWithArguments(errorTypeKind, km5.a, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @NotNull
    public static final ErrorScope createErrorScope(@NotNull ErrorScopeKind errorScopeKind, @NotNull String... strArr) {
        errorScopeKind.getClass();
        strArr.getClass();
        return createErrorScope(errorScopeKind, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @NotNull
    public final ErrorType createErrorTypeWithArguments(@NotNull ErrorTypeKind errorTypeKind, @NotNull List<? extends TypeProjection> list, @NotNull String... strArr) {
        errorTypeKind.getClass();
        list.getClass();
        strArr.getClass();
        return createErrorTypeWithArguments(errorTypeKind, list, createErrorTypeConstructor(errorTypeKind, (String[]) Arrays.copyOf(strArr, strArr.length)), (String[]) Arrays.copyOf(strArr, strArr.length));
    }
}
