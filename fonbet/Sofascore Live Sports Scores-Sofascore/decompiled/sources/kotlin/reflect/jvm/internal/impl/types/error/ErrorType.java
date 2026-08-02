package kotlin.reflect.jvm.internal.impl.types.error;

import defpackage.km5;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ErrorType extends SimpleType {

    @NotNull
    private final List<TypeProjection> arguments;

    @NotNull
    private final TypeConstructor constructor;

    @NotNull
    private final String debugMessage;

    @NotNull
    private final String[] formatParams;
    private final boolean isMarkedNullable;

    @NotNull
    private final ErrorTypeKind kind;

    @NotNull
    private final MemberScope memberScope;

    /* JADX WARN: Multi-variable type inference failed */
    public ErrorType(@NotNull TypeConstructor typeConstructor, @NotNull MemberScope memberScope, @NotNull ErrorTypeKind errorTypeKind, @NotNull List<? extends TypeProjection> list, boolean z, @NotNull String... strArr) {
        typeConstructor.getClass();
        memberScope.getClass();
        errorTypeKind.getClass();
        list.getClass();
        strArr.getClass();
        this.constructor = typeConstructor;
        this.memberScope = memberScope;
        this.kind = errorTypeKind;
        this.arguments = list;
        this.isMarkedNullable = z;
        this.formatParams = strArr;
        String debugMessage = errorTypeKind.getDebugMessage();
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
        this.debugMessage = String.format(debugMessage, Arrays.copyOf(copyOf, copyOf.length));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public List<TypeProjection> getArguments() {
        return this.arguments;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public TypeAttributes getAttributes() {
        return TypeAttributes.Companion.getEmpty();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public TypeConstructor getConstructor() {
        return this.constructor;
    }

    @NotNull
    public final String getDebugMessage() {
        return this.debugMessage;
    }

    @NotNull
    public final ErrorTypeKind getKind() {
        return this.kind;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public MemberScope getMemberScope() {
        return this.memberScope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean isMarkedNullable() {
        return this.isMarkedNullable;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    public SimpleType makeNullableAsSpecified(boolean z) {
        TypeConstructor constructor = getConstructor();
        MemberScope memberScope = getMemberScope();
        ErrorTypeKind errorTypeKind = this.kind;
        List<TypeProjection> arguments = getArguments();
        String[] strArr = this.formatParams;
        return new ErrorType(constructor, memberScope, errorTypeKind, arguments, z, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @NotNull
    public final ErrorType replaceArguments(@NotNull List<? extends TypeProjection> list) {
        list.getClass();
        TypeConstructor constructor = getConstructor();
        MemberScope memberScope = getMemberScope();
        ErrorTypeKind errorTypeKind = this.kind;
        boolean isMarkedNullable = isMarkedNullable();
        String[] strArr = this.formatParams;
        return new ErrorType(constructor, memberScope, errorTypeKind, list, isMarkedNullable, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public ErrorType refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    public SimpleType replaceAttributes(@NotNull TypeAttributes typeAttributes) {
        typeAttributes.getClass();
        return this;
    }

    public ErrorType(TypeConstructor typeConstructor, MemberScope memberScope, ErrorTypeKind errorTypeKind, List list, boolean z, String[] strArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeConstructor, memberScope, errorTypeKind, (i & 8) != 0 ? km5.a : list, (i & 16) != 0 ? false : z, strArr);
    }
}
