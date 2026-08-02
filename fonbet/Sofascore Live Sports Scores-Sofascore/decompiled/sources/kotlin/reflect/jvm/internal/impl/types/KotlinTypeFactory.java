package kotlin.reflect.jvm.internal.impl.types;

import defpackage.km5;
import defpackage.zzl;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptorKt;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.TypeAliasExpansionReportStrategy;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class KotlinTypeFactory {

    @NotNull
    public static final KotlinTypeFactory INSTANCE = new KotlinTypeFactory();

    @NotNull
    private static final Function1<KotlinTypeRefiner, SimpleType> EMPTY_REFINED_TYPE_FACTORY = KotlinTypeFactory$EMPTY_REFINED_TYPE_FACTORY$1.INSTANCE;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class ExpandedTypeOrRefinedConstructor {

        @Nullable
        private final SimpleType expandedType;

        @Nullable
        private final TypeConstructor refinedConstructor;

        public ExpandedTypeOrRefinedConstructor(@Nullable SimpleType simpleType, @Nullable TypeConstructor typeConstructor) {
            this.expandedType = simpleType;
            this.refinedConstructor = typeConstructor;
        }

        @Nullable
        public final SimpleType getExpandedType() {
            return this.expandedType;
        }

        @Nullable
        public final TypeConstructor getRefinedConstructor() {
            return this.refinedConstructor;
        }
    }

    private KotlinTypeFactory() {
    }

    @NotNull
    public static final SimpleType computeExpandedType(@NotNull TypeAliasDescriptor typeAliasDescriptor, @NotNull List<? extends TypeProjection> list) {
        typeAliasDescriptor.getClass();
        list.getClass();
        return new TypeAliasExpander(TypeAliasExpansionReportStrategy.DO_NOTHING.INSTANCE, false).expand(TypeAliasExpansion.Companion.create(null, typeAliasDescriptor, list), TypeAttributes.Companion.getEmpty());
    }

    private final MemberScope computeMemberScope(TypeConstructor typeConstructor, List<? extends TypeProjection> list, KotlinTypeRefiner kotlinTypeRefiner) {
        ClassifierDescriptor mo893getDeclarationDescriptor = typeConstructor.mo893getDeclarationDescriptor();
        if (mo893getDeclarationDescriptor instanceof TypeParameterDescriptor) {
            return ((TypeParameterDescriptor) mo893getDeclarationDescriptor).getDefaultType().getMemberScope();
        }
        if (mo893getDeclarationDescriptor instanceof ClassDescriptor) {
            if (kotlinTypeRefiner == null) {
                kotlinTypeRefiner = DescriptorUtilsKt.getKotlinTypeRefiner(DescriptorUtilsKt.getModule(mo893getDeclarationDescriptor));
            }
            return list.isEmpty() ? ModuleAwareClassDescriptorKt.getRefinedUnsubstitutedMemberScopeIfPossible((ClassDescriptor) mo893getDeclarationDescriptor, kotlinTypeRefiner) : ModuleAwareClassDescriptorKt.getRefinedMemberScopeIfPossible((ClassDescriptor) mo893getDeclarationDescriptor, TypeConstructorSubstitution.Companion.create(typeConstructor, list), kotlinTypeRefiner);
        }
        if (mo893getDeclarationDescriptor instanceof TypeAliasDescriptor) {
            ErrorScopeKind errorScopeKind = ErrorScopeKind.SCOPE_FOR_ABBREVIATION_TYPE;
            String name = ((TypeAliasDescriptor) mo893getDeclarationDescriptor).getName().toString();
            name.getClass();
            return ErrorUtils.createErrorScope(errorScopeKind, true, name);
        }
        if (typeConstructor instanceof IntersectionTypeConstructor) {
            return ((IntersectionTypeConstructor) typeConstructor).createScopeForKotlinType();
        }
        zzl.l("Unsupported classifier: ", mo893getDeclarationDescriptor, " for constructor: ", typeConstructor);
        return null;
    }

    @NotNull
    public static final UnwrappedType flexibleType(@NotNull SimpleType simpleType, @NotNull SimpleType simpleType2) {
        simpleType.getClass();
        simpleType2.getClass();
        return Intrinsics.c(simpleType, simpleType2) ? simpleType : new FlexibleTypeImpl(simpleType, simpleType2);
    }

    @NotNull
    public static final SimpleType integerLiteralType(@NotNull TypeAttributes typeAttributes, @NotNull IntegerLiteralTypeConstructor integerLiteralTypeConstructor, boolean z) {
        typeAttributes.getClass();
        integerLiteralTypeConstructor.getClass();
        return simpleTypeWithNonTrivialMemberScope(typeAttributes, integerLiteralTypeConstructor, km5.a, z, ErrorUtils.createErrorScope(ErrorScopeKind.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ExpandedTypeOrRefinedConstructor refineConstructor(TypeConstructor typeConstructor, KotlinTypeRefiner kotlinTypeRefiner, List<? extends TypeProjection> list) {
        ClassifierDescriptor refineDescriptor;
        ClassifierDescriptor mo893getDeclarationDescriptor = typeConstructor.mo893getDeclarationDescriptor();
        if (mo893getDeclarationDescriptor == null || (refineDescriptor = kotlinTypeRefiner.refineDescriptor(mo893getDeclarationDescriptor)) == null) {
            return null;
        }
        if (refineDescriptor instanceof TypeAliasDescriptor) {
            return new ExpandedTypeOrRefinedConstructor(computeExpandedType((TypeAliasDescriptor) refineDescriptor, list), null);
        }
        TypeConstructor refine = refineDescriptor.getTypeConstructor().refine(kotlinTypeRefiner);
        refine.getClass();
        return new ExpandedTypeOrRefinedConstructor(null, refine);
    }

    @NotNull
    public static final SimpleType simpleNotNullType(@NotNull TypeAttributes typeAttributes, @NotNull ClassDescriptor classDescriptor, @NotNull List<? extends TypeProjection> list) {
        typeAttributes.getClass();
        classDescriptor.getClass();
        list.getClass();
        TypeConstructor typeConstructor = classDescriptor.getTypeConstructor();
        typeConstructor.getClass();
        return simpleType$default(typeAttributes, typeConstructor, (List) list, false, (KotlinTypeRefiner) null, 16, (Object) null);
    }

    @NotNull
    public static final SimpleType simpleType(@NotNull TypeAttributes typeAttributes, @NotNull TypeConstructor typeConstructor, @NotNull List<? extends TypeProjection> list, boolean z, @Nullable KotlinTypeRefiner kotlinTypeRefiner) {
        typeAttributes.getClass();
        typeConstructor.getClass();
        list.getClass();
        if (!typeAttributes.isEmpty() || !list.isEmpty() || z || typeConstructor.mo893getDeclarationDescriptor() == null) {
            return simpleTypeWithNonTrivialMemberScope(typeAttributes, typeConstructor, list, z, INSTANCE.computeMemberScope(typeConstructor, list, kotlinTypeRefiner), new KotlinTypeFactory$simpleType$1(typeConstructor, list, typeAttributes, z));
        }
        ClassifierDescriptor mo893getDeclarationDescriptor = typeConstructor.mo893getDeclarationDescriptor();
        mo893getDeclarationDescriptor.getClass();
        SimpleType defaultType = mo893getDeclarationDescriptor.getDefaultType();
        defaultType.getClass();
        return defaultType;
    }

    public static /* synthetic */ SimpleType simpleType$default(SimpleType simpleType, TypeAttributes typeAttributes, TypeConstructor typeConstructor, List list, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            typeAttributes = simpleType.getAttributes();
        }
        if ((i & 4) != 0) {
            typeConstructor = simpleType.getConstructor();
        }
        if ((i & 8) != 0) {
            list = simpleType.getArguments();
        }
        if ((i & 16) != 0) {
            z = simpleType.isMarkedNullable();
        }
        return simpleType(simpleType, typeAttributes, typeConstructor, (List<? extends TypeProjection>) list, z);
    }

    @NotNull
    public static final SimpleType simpleTypeWithNonTrivialMemberScope(@NotNull TypeAttributes typeAttributes, @NotNull TypeConstructor typeConstructor, @NotNull List<? extends TypeProjection> list, boolean z, @NotNull MemberScope memberScope) {
        typeAttributes.getClass();
        typeConstructor.getClass();
        list.getClass();
        memberScope.getClass();
        SimpleTypeImpl simpleTypeImpl = new SimpleTypeImpl(typeConstructor, list, z, memberScope, new KotlinTypeFactory$simpleTypeWithNonTrivialMemberScope$1(typeConstructor, list, typeAttributes, z, memberScope));
        return typeAttributes.isEmpty() ? simpleTypeImpl : new SimpleTypeWithAttributes(simpleTypeImpl, typeAttributes);
    }

    public static /* synthetic */ SimpleType simpleType$default(TypeAttributes typeAttributes, TypeConstructor typeConstructor, List list, boolean z, KotlinTypeRefiner kotlinTypeRefiner, int i, Object obj) {
        if ((i & 16) != 0) {
            kotlinTypeRefiner = null;
        }
        return simpleType(typeAttributes, typeConstructor, (List<? extends TypeProjection>) list, z, kotlinTypeRefiner);
    }

    @NotNull
    public static final SimpleType simpleTypeWithNonTrivialMemberScope(@NotNull TypeAttributes typeAttributes, @NotNull TypeConstructor typeConstructor, @NotNull List<? extends TypeProjection> list, boolean z, @NotNull MemberScope memberScope, @NotNull Function1<? super KotlinTypeRefiner, ? extends SimpleType> function1) {
        typeAttributes.getClass();
        typeConstructor.getClass();
        list.getClass();
        memberScope.getClass();
        function1.getClass();
        SimpleTypeImpl simpleTypeImpl = new SimpleTypeImpl(typeConstructor, list, z, memberScope, function1);
        return typeAttributes.isEmpty() ? simpleTypeImpl : new SimpleTypeWithAttributes(simpleTypeImpl, typeAttributes);
    }

    @NotNull
    public static final SimpleType simpleType(@NotNull TypeAttributes typeAttributes, @NotNull TypeConstructor typeConstructor, @NotNull List<? extends TypeProjection> list, boolean z) {
        typeAttributes.getClass();
        typeConstructor.getClass();
        list.getClass();
        return simpleType$default(typeAttributes, typeConstructor, list, z, (KotlinTypeRefiner) null, 16, (Object) null);
    }

    @NotNull
    public static final SimpleType simpleType(@NotNull SimpleType simpleType, @NotNull TypeAttributes typeAttributes, @NotNull TypeConstructor typeConstructor, @NotNull List<? extends TypeProjection> list, boolean z) {
        simpleType.getClass();
        typeAttributes.getClass();
        typeConstructor.getClass();
        list.getClass();
        return simpleType$default(typeAttributes, typeConstructor, list, z, (KotlinTypeRefiner) null, 16, (Object) null);
    }
}
