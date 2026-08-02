package kotlin.reflect.jvm.internal.impl.types.checker;

import defpackage.a70;
import defpackage.duf;
import defpackage.mz1;
import defpackage.ogj;
import defpackage.wt3;
import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.ModalityUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedType;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import kotlin.reflect.jvm.internal.impl.types.DynamicType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.NotNullTypeParameter;
import kotlin.reflect.jvm.internal.impl.types.RawType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SimpleTypeWithEnhancement;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.DefinitelyNotNullTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.DynamicTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextKt;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemInferenceExtensionContext;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariableTypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public interface ClassicTypeSystemContext extends TypeSystemCommonBackendContext, TypeSystemInferenceExtensionContext {
    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @Nullable
    CapturedTypeMarker asCapturedType(@NotNull SimpleTypeMarker simpleTypeMarker);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @Nullable
    SimpleTypeMarker asSimpleType(@NotNull KotlinTypeMarker kotlinTypeMarker);

    @NotNull
    KotlinTypeMarker createFlexibleType(@NotNull SimpleTypeMarker simpleTypeMarker, @NotNull SimpleTypeMarker simpleTypeMarker2);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    boolean isSingleClassifierType(@NotNull SimpleTypeMarker simpleTypeMarker);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    SimpleTypeMarker lowerBound(@NotNull FlexibleTypeMarker flexibleTypeMarker);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    TypeConstructorMarker typeConstructor(@NotNull SimpleTypeMarker simpleTypeMarker);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    SimpleTypeMarker upperBound(@NotNull FlexibleTypeMarker flexibleTypeMarker);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    SimpleTypeMarker withNullability(@NotNull SimpleTypeMarker simpleTypeMarker, boolean z);

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class DefaultImpls {
        public static boolean areEqualTypeConstructors(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker, @NotNull TypeConstructorMarker typeConstructorMarker2) {
            typeConstructorMarker.getClass();
            typeConstructorMarker2.getClass();
            if (!(typeConstructorMarker instanceof TypeConstructor)) {
                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(typeConstructorMarker);
                sb.append(", ");
                ogj.h(mz1.k(duf.a, typeConstructorMarker.getClass(), sb));
                return false;
            }
            if (typeConstructorMarker2 instanceof TypeConstructor) {
                return typeConstructorMarker.equals(typeConstructorMarker2);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(typeConstructorMarker2);
            sb2.append(", ");
            ogj.h(mz1.k(duf.a, typeConstructorMarker2.getClass(), sb2));
            return false;
        }

        public static int argumentsCount(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker kotlinTypeMarker) {
            kotlinTypeMarker.getClass();
            if (kotlinTypeMarker instanceof KotlinType) {
                return ((KotlinType) kotlinTypeMarker).getArguments().size();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            sb.append(", ");
            ogj.h(mz1.k(duf.a, kotlinTypeMarker.getClass(), sb));
            return 0;
        }

        @NotNull
        public static TypeArgumentListMarker asArgumentList(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull SimpleTypeMarker simpleTypeMarker) {
            simpleTypeMarker.getClass();
            if (simpleTypeMarker instanceof SimpleType) {
                return (TypeArgumentListMarker) simpleTypeMarker;
            }
            StringBuilder r = wt3.r("ClassicTypeSystemContext couldn't handle: ", simpleTypeMarker, ", ");
            ogj.h(mz1.k(duf.a, simpleTypeMarker.getClass(), r));
            return null;
        }

        @Nullable
        public static CapturedTypeMarker asCapturedType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull SimpleTypeMarker simpleTypeMarker) {
            simpleTypeMarker.getClass();
            if (!(simpleTypeMarker instanceof SimpleType)) {
                StringBuilder r = wt3.r("ClassicTypeSystemContext couldn't handle: ", simpleTypeMarker, ", ");
                ogj.h(mz1.k(duf.a, simpleTypeMarker.getClass(), r));
                return null;
            }
            if (simpleTypeMarker instanceof SimpleTypeWithEnhancement) {
                return classicTypeSystemContext.asCapturedType(((SimpleTypeWithEnhancement) simpleTypeMarker).getOrigin());
            }
            if (simpleTypeMarker instanceof NewCapturedType) {
                return (NewCapturedType) simpleTypeMarker;
            }
            return null;
        }

        @Nullable
        public static DefinitelyNotNullTypeMarker asDefinitelyNotNullType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull SimpleTypeMarker simpleTypeMarker) {
            simpleTypeMarker.getClass();
            if (simpleTypeMarker instanceof SimpleType) {
                if (simpleTypeMarker instanceof DefinitelyNotNullType) {
                    return (DefinitelyNotNullType) simpleTypeMarker;
                }
                return null;
            }
            StringBuilder r = wt3.r("ClassicTypeSystemContext couldn't handle: ", simpleTypeMarker, ", ");
            ogj.h(mz1.k(duf.a, simpleTypeMarker.getClass(), r));
            return null;
        }

        @Nullable
        public static DynamicTypeMarker asDynamicType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull FlexibleTypeMarker flexibleTypeMarker) {
            flexibleTypeMarker.getClass();
            if (flexibleTypeMarker instanceof FlexibleType) {
                if (flexibleTypeMarker instanceof DynamicType) {
                    return (DynamicType) flexibleTypeMarker;
                }
                return null;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(flexibleTypeMarker);
            sb.append(", ");
            ogj.h(mz1.k(duf.a, flexibleTypeMarker.getClass(), sb));
            return null;
        }

        @Nullable
        public static FlexibleTypeMarker asFlexibleType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker kotlinTypeMarker) {
            kotlinTypeMarker.getClass();
            if (kotlinTypeMarker instanceof KotlinType) {
                UnwrappedType unwrap = ((KotlinType) kotlinTypeMarker).unwrap();
                if (unwrap instanceof FlexibleType) {
                    return (FlexibleType) unwrap;
                }
                return null;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            sb.append(", ");
            ogj.h(mz1.k(duf.a, kotlinTypeMarker.getClass(), sb));
            return null;
        }

        @Nullable
        public static SimpleTypeMarker asSimpleType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker kotlinTypeMarker) {
            kotlinTypeMarker.getClass();
            if (kotlinTypeMarker instanceof KotlinType) {
                UnwrappedType unwrap = ((KotlinType) kotlinTypeMarker).unwrap();
                if (unwrap instanceof SimpleType) {
                    return (SimpleType) unwrap;
                }
                return null;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            sb.append(", ");
            ogj.h(mz1.k(duf.a, kotlinTypeMarker.getClass(), sb));
            return null;
        }

        @NotNull
        public static TypeArgumentMarker asTypeArgument(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker kotlinTypeMarker) {
            kotlinTypeMarker.getClass();
            if (kotlinTypeMarker instanceof KotlinType) {
                return TypeUtilsKt.asTypeProjection((KotlinType) kotlinTypeMarker);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            sb.append(", ");
            ogj.h(mz1.k(duf.a, kotlinTypeMarker.getClass(), sb));
            return null;
        }

        @Nullable
        public static SimpleTypeMarker captureFromArguments(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull SimpleTypeMarker simpleTypeMarker, @NotNull CaptureStatus captureStatus) {
            simpleTypeMarker.getClass();
            captureStatus.getClass();
            if (simpleTypeMarker instanceof SimpleType) {
                return NewCapturedTypeKt.captureFromArguments((SimpleType) simpleTypeMarker, captureStatus);
            }
            StringBuilder r = wt3.r("ClassicTypeSystemContext couldn't handle: ", simpleTypeMarker, ", ");
            ogj.h(mz1.k(duf.a, simpleTypeMarker.getClass(), r));
            return null;
        }

        @NotNull
        public static CaptureStatus captureStatus(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull CapturedTypeMarker capturedTypeMarker) {
            capturedTypeMarker.getClass();
            if (capturedTypeMarker instanceof NewCapturedType) {
                return ((NewCapturedType) capturedTypeMarker).getCaptureStatus();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(capturedTypeMarker);
            sb.append(", ");
            ogj.h(mz1.k(duf.a, capturedTypeMarker.getClass(), sb));
            return null;
        }

        @NotNull
        public static KotlinTypeMarker createFlexibleType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull SimpleTypeMarker simpleTypeMarker, @NotNull SimpleTypeMarker simpleTypeMarker2) {
            simpleTypeMarker.getClass();
            simpleTypeMarker2.getClass();
            if (!(simpleTypeMarker instanceof SimpleType)) {
                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(classicTypeSystemContext);
                sb.append(", ");
                ogj.h(mz1.k(duf.a, classicTypeSystemContext.getClass(), sb));
                return null;
            }
            if (simpleTypeMarker2 instanceof SimpleType) {
                return KotlinTypeFactory.flexibleType((SimpleType) simpleTypeMarker, (SimpleType) simpleTypeMarker2);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(classicTypeSystemContext);
            sb2.append(", ");
            ogj.h(mz1.k(duf.a, classicTypeSystemContext.getClass(), sb2));
            return null;
        }

        @NotNull
        public static TypeArgumentMarker getArgument(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker kotlinTypeMarker, int i) {
            kotlinTypeMarker.getClass();
            if (kotlinTypeMarker instanceof KotlinType) {
                return ((KotlinType) kotlinTypeMarker).getArguments().get(i);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            sb.append(", ");
            ogj.h(mz1.k(duf.a, kotlinTypeMarker.getClass(), sb));
            return null;
        }

        @NotNull
        public static List<TypeArgumentMarker> getArguments(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker kotlinTypeMarker) {
            kotlinTypeMarker.getClass();
            if (kotlinTypeMarker instanceof KotlinType) {
                return ((KotlinType) kotlinTypeMarker).getArguments();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            sb.append(", ");
            ogj.h(mz1.k(duf.a, kotlinTypeMarker.getClass(), sb));
            return null;
        }

        @NotNull
        public static FqNameUnsafe getClassFqNameUnsafe(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                ClassifierDescriptor mo893getDeclarationDescriptor = ((TypeConstructor) typeConstructorMarker).mo893getDeclarationDescriptor();
                mo893getDeclarationDescriptor.getClass();
                return DescriptorUtilsKt.getFqNameUnsafe((ClassDescriptor) mo893getDeclarationDescriptor);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            sb.append(", ");
            ogj.h(mz1.k(duf.a, typeConstructorMarker.getClass(), sb));
            return null;
        }

        @NotNull
        public static TypeParameterMarker getParameter(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker, int i) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                TypeParameterDescriptor typeParameterDescriptor = ((TypeConstructor) typeConstructorMarker).getParameters().get(i);
                typeParameterDescriptor.getClass();
                return typeParameterDescriptor;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            sb.append(", ");
            ogj.h(mz1.k(duf.a, typeConstructorMarker.getClass(), sb));
            return null;
        }

        @NotNull
        public static List<TypeParameterMarker> getParameters(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                List<TypeParameterDescriptor> parameters = ((TypeConstructor) typeConstructorMarker).getParameters();
                parameters.getClass();
                return parameters;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            sb.append(", ");
            ogj.h(mz1.k(duf.a, typeConstructorMarker.getClass(), sb));
            return null;
        }

        @Nullable
        public static PrimitiveType getPrimitiveArrayType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                ClassifierDescriptor mo893getDeclarationDescriptor = ((TypeConstructor) typeConstructorMarker).mo893getDeclarationDescriptor();
                mo893getDeclarationDescriptor.getClass();
                return KotlinBuiltIns.getPrimitiveArrayType((ClassDescriptor) mo893getDeclarationDescriptor);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            sb.append(", ");
            ogj.h(mz1.k(duf.a, typeConstructorMarker.getClass(), sb));
            return null;
        }

        @Nullable
        public static PrimitiveType getPrimitiveType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                ClassifierDescriptor mo893getDeclarationDescriptor = ((TypeConstructor) typeConstructorMarker).mo893getDeclarationDescriptor();
                mo893getDeclarationDescriptor.getClass();
                return KotlinBuiltIns.getPrimitiveType((ClassDescriptor) mo893getDeclarationDescriptor);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            sb.append(", ");
            ogj.h(mz1.k(duf.a, typeConstructorMarker.getClass(), sb));
            return null;
        }

        @NotNull
        public static KotlinTypeMarker getRepresentativeUpperBound(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeParameterMarker typeParameterMarker) {
            typeParameterMarker.getClass();
            if (typeParameterMarker instanceof TypeParameterDescriptor) {
                return TypeUtilsKt.getRepresentativeUpperBound((TypeParameterDescriptor) typeParameterMarker);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeParameterMarker);
            sb.append(", ");
            ogj.h(mz1.k(duf.a, typeParameterMarker.getClass(), sb));
            return null;
        }

        @NotNull
        public static KotlinTypeMarker getType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeArgumentMarker typeArgumentMarker) {
            typeArgumentMarker.getClass();
            if (typeArgumentMarker instanceof TypeProjection) {
                return ((TypeProjection) typeArgumentMarker).getType().unwrap();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeArgumentMarker);
            sb.append(", ");
            ogj.h(mz1.k(duf.a, typeArgumentMarker.getClass(), sb));
            return null;
        }

        @Nullable
        public static TypeParameterMarker getTypeParameter(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeVariableTypeConstructorMarker typeVariableTypeConstructorMarker) {
            typeVariableTypeConstructorMarker.getClass();
            if (typeVariableTypeConstructorMarker instanceof NewTypeVariableConstructor) {
                return ((NewTypeVariableConstructor) typeVariableTypeConstructorMarker).getOriginalTypeParameter();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeVariableTypeConstructorMarker);
            sb.append(", ");
            ogj.h(mz1.k(duf.a, typeVariableTypeConstructorMarker.getClass(), sb));
            return null;
        }

        @Nullable
        public static TypeParameterMarker getTypeParameterClassifier(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                ClassifierDescriptor mo893getDeclarationDescriptor = ((TypeConstructor) typeConstructorMarker).mo893getDeclarationDescriptor();
                if (mo893getDeclarationDescriptor instanceof TypeParameterDescriptor) {
                    return (TypeParameterDescriptor) mo893getDeclarationDescriptor;
                }
                return null;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            sb.append(", ");
            ogj.h(mz1.k(duf.a, typeConstructorMarker.getClass(), sb));
            return null;
        }

        @Nullable
        public static KotlinTypeMarker getUnsubstitutedUnderlyingType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker kotlinTypeMarker) {
            kotlinTypeMarker.getClass();
            if (kotlinTypeMarker instanceof KotlinType) {
                return InlineClassesUtilsKt.unsubstitutedUnderlyingType((KotlinType) kotlinTypeMarker);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            sb.append(", ");
            ogj.h(mz1.k(duf.a, kotlinTypeMarker.getClass(), sb));
            return null;
        }

        @NotNull
        public static List<KotlinTypeMarker> getUpperBounds(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeParameterMarker typeParameterMarker) {
            typeParameterMarker.getClass();
            if (typeParameterMarker instanceof TypeParameterDescriptor) {
                List<KotlinType> upperBounds = ((TypeParameterDescriptor) typeParameterMarker).getUpperBounds();
                upperBounds.getClass();
                return upperBounds;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeParameterMarker);
            sb.append(", ");
            ogj.h(mz1.k(duf.a, typeParameterMarker.getClass(), sb));
            return null;
        }

        @NotNull
        public static TypeVariance getVariance(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeArgumentMarker typeArgumentMarker) {
            typeArgumentMarker.getClass();
            if (typeArgumentMarker instanceof TypeProjection) {
                Variance projectionKind = ((TypeProjection) typeArgumentMarker).getProjectionKind();
                projectionKind.getClass();
                return TypeSystemContextKt.convertVariance(projectionKind);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeArgumentMarker);
            sb.append(", ");
            ogj.h(mz1.k(duf.a, typeArgumentMarker.getClass(), sb));
            return null;
        }

        public static boolean hasAnnotation(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker kotlinTypeMarker, @NotNull FqName fqName) {
            kotlinTypeMarker.getClass();
            fqName.getClass();
            if (kotlinTypeMarker instanceof KotlinType) {
                return ((KotlinType) kotlinTypeMarker).getAnnotations().hasAnnotation(fqName);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            sb.append(", ");
            ogj.h(mz1.k(duf.a, kotlinTypeMarker.getClass(), sb));
            return false;
        }

        public static boolean hasRecursiveBounds(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeParameterMarker typeParameterMarker, @Nullable TypeConstructorMarker typeConstructorMarker) {
            typeParameterMarker.getClass();
            if (!(typeParameterMarker instanceof TypeParameterDescriptor)) {
                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(typeParameterMarker);
                sb.append(", ");
                ogj.h(mz1.k(duf.a, typeParameterMarker.getClass(), sb));
                return false;
            }
            if (typeConstructorMarker == null ? true : typeConstructorMarker instanceof TypeConstructor) {
                return TypeUtilsKt.hasTypeParameterRecursiveBounds$default((TypeParameterDescriptor) typeParameterMarker, (TypeConstructor) typeConstructorMarker, null, 4, null);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(typeParameterMarker);
            sb2.append(", ");
            ogj.h(mz1.k(duf.a, typeParameterMarker.getClass(), sb2));
            return false;
        }

        public static boolean identicalArguments(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull SimpleTypeMarker simpleTypeMarker, @NotNull SimpleTypeMarker simpleTypeMarker2) {
            simpleTypeMarker.getClass();
            simpleTypeMarker2.getClass();
            if (!(simpleTypeMarker instanceof SimpleType)) {
                ogj.h(mz1.k(duf.a, simpleTypeMarker.getClass(), wt3.r("ClassicTypeSystemContext couldn't handle: ", simpleTypeMarker, ", ")));
                return false;
            }
            if (simpleTypeMarker2 instanceof SimpleType) {
                return ((SimpleType) simpleTypeMarker).getArguments() == ((SimpleType) simpleTypeMarker2).getArguments();
            }
            ogj.h(mz1.k(duf.a, simpleTypeMarker2.getClass(), wt3.r("ClassicTypeSystemContext couldn't handle: ", simpleTypeMarker2, ", ")));
            return false;
        }

        @NotNull
        public static KotlinTypeMarker intersectTypes(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull List<? extends KotlinTypeMarker> list) {
            list.getClass();
            return IntersectionTypeKt.intersectTypes(list);
        }

        public static boolean isAnyConstructor(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                return KotlinBuiltIns.isTypeConstructorForGivenClass((TypeConstructor) typeConstructorMarker, StandardNames.FqNames.any);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            sb.append(", ");
            ogj.h(mz1.k(duf.a, typeConstructorMarker.getClass(), sb));
            return false;
        }

        public static boolean isClassTypeConstructor(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                return ((TypeConstructor) typeConstructorMarker).mo893getDeclarationDescriptor() instanceof ClassDescriptor;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            sb.append(", ");
            ogj.h(mz1.k(duf.a, typeConstructorMarker.getClass(), sb));
            return false;
        }

        public static boolean isCommonFinalClassConstructor(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                ClassifierDescriptor mo893getDeclarationDescriptor = ((TypeConstructor) typeConstructorMarker).mo893getDeclarationDescriptor();
                ClassDescriptor classDescriptor = mo893getDeclarationDescriptor instanceof ClassDescriptor ? (ClassDescriptor) mo893getDeclarationDescriptor : null;
                return (classDescriptor == null || !ModalityUtilsKt.isFinalClass(classDescriptor) || classDescriptor.getKind() == ClassKind.ENUM_ENTRY || classDescriptor.getKind() == ClassKind.ANNOTATION_CLASS) ? false : true;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            sb.append(", ");
            ogj.h(mz1.k(duf.a, typeConstructorMarker.getClass(), sb));
            return false;
        }

        public static boolean isDenotable(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                return ((TypeConstructor) typeConstructorMarker).isDenotable();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            sb.append(", ");
            ogj.h(mz1.k(duf.a, typeConstructorMarker.getClass(), sb));
            return false;
        }

        public static boolean isError(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker kotlinTypeMarker) {
            kotlinTypeMarker.getClass();
            if (kotlinTypeMarker instanceof KotlinType) {
                return KotlinTypeKt.isError((KotlinType) kotlinTypeMarker);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            sb.append(", ");
            ogj.h(mz1.k(duf.a, kotlinTypeMarker.getClass(), sb));
            return false;
        }

        public static boolean isInlineClass(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                ClassifierDescriptor mo893getDeclarationDescriptor = ((TypeConstructor) typeConstructorMarker).mo893getDeclarationDescriptor();
                ClassDescriptor classDescriptor = mo893getDeclarationDescriptor instanceof ClassDescriptor ? (ClassDescriptor) mo893getDeclarationDescriptor : null;
                return (classDescriptor != null ? classDescriptor.getValueClassRepresentation() : null) instanceof InlineClassRepresentation;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            sb.append(", ");
            ogj.h(mz1.k(duf.a, typeConstructorMarker.getClass(), sb));
            return false;
        }

        public static boolean isIntegerLiteralTypeConstructor(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                return typeConstructorMarker instanceof IntegerLiteralTypeConstructor;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            sb.append(", ");
            ogj.h(mz1.k(duf.a, typeConstructorMarker.getClass(), sb));
            return false;
        }

        public static boolean isIntersection(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                return typeConstructorMarker instanceof IntersectionTypeConstructor;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            sb.append(", ");
            ogj.h(mz1.k(duf.a, typeConstructorMarker.getClass(), sb));
            return false;
        }

        public static boolean isMarkedNullable(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull SimpleTypeMarker simpleTypeMarker) {
            simpleTypeMarker.getClass();
            if (simpleTypeMarker instanceof SimpleType) {
                return ((SimpleType) simpleTypeMarker).isMarkedNullable();
            }
            StringBuilder r = wt3.r("ClassicTypeSystemContext couldn't handle: ", simpleTypeMarker, ", ");
            ogj.h(mz1.k(duf.a, simpleTypeMarker.getClass(), r));
            return false;
        }

        public static boolean isNotNullTypeParameter(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker kotlinTypeMarker) {
            kotlinTypeMarker.getClass();
            return kotlinTypeMarker instanceof NotNullTypeParameter;
        }

        public static boolean isNothingConstructor(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                return KotlinBuiltIns.isTypeConstructorForGivenClass((TypeConstructor) typeConstructorMarker, StandardNames.FqNames.nothing);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            sb.append(", ");
            ogj.h(mz1.k(duf.a, typeConstructorMarker.getClass(), sb));
            return false;
        }

        public static boolean isNullableType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker kotlinTypeMarker) {
            kotlinTypeMarker.getClass();
            if (kotlinTypeMarker instanceof KotlinType) {
                return TypeUtils.isNullableType((KotlinType) kotlinTypeMarker);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            sb.append(", ");
            ogj.h(mz1.k(duf.a, kotlinTypeMarker.getClass(), sb));
            return false;
        }

        public static boolean isOldCapturedType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull CapturedTypeMarker capturedTypeMarker) {
            capturedTypeMarker.getClass();
            return capturedTypeMarker instanceof CapturedType;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean isPrimitiveType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull SimpleTypeMarker simpleTypeMarker) {
            simpleTypeMarker.getClass();
            if (simpleTypeMarker instanceof KotlinType) {
                return KotlinBuiltIns.isPrimitiveType((KotlinType) simpleTypeMarker);
            }
            StringBuilder r = wt3.r("ClassicTypeSystemContext couldn't handle: ", simpleTypeMarker, ", ");
            ogj.h(mz1.k(duf.a, simpleTypeMarker.getClass(), r));
            return false;
        }

        public static boolean isProjectionNotNull(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull CapturedTypeMarker capturedTypeMarker) {
            capturedTypeMarker.getClass();
            if (capturedTypeMarker instanceof NewCapturedType) {
                return ((NewCapturedType) capturedTypeMarker).isProjectionNotNull();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(capturedTypeMarker);
            sb.append(", ");
            ogj.h(mz1.k(duf.a, capturedTypeMarker.getClass(), sb));
            return false;
        }

        public static boolean isRawType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker kotlinTypeMarker) {
            kotlinTypeMarker.getClass();
            if (kotlinTypeMarker instanceof KotlinType) {
                return kotlinTypeMarker instanceof RawType;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            sb.append(", ");
            ogj.h(mz1.k(duf.a, kotlinTypeMarker.getClass(), sb));
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean isSingleClassifierType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull SimpleTypeMarker simpleTypeMarker) {
            simpleTypeMarker.getClass();
            if (!(simpleTypeMarker instanceof SimpleType)) {
                StringBuilder r = wt3.r("ClassicTypeSystemContext couldn't handle: ", simpleTypeMarker, ", ");
                ogj.h(mz1.k(duf.a, simpleTypeMarker.getClass(), r));
                return false;
            }
            if (!KotlinTypeKt.isError((KotlinType) simpleTypeMarker)) {
                SimpleType simpleType = (SimpleType) simpleTypeMarker;
                if (!(simpleType.getConstructor().mo893getDeclarationDescriptor() instanceof TypeAliasDescriptor) && (simpleType.getConstructor().mo893getDeclarationDescriptor() != null || (simpleTypeMarker instanceof CapturedType) || (simpleTypeMarker instanceof NewCapturedType) || (simpleTypeMarker instanceof DefinitelyNotNullType) || (simpleType.getConstructor() instanceof IntegerLiteralTypeConstructor) || isSingleClassifierTypeWithEnhancement(classicTypeSystemContext, simpleTypeMarker))) {
                    return true;
                }
            }
            return false;
        }

        private static boolean isSingleClassifierTypeWithEnhancement(ClassicTypeSystemContext classicTypeSystemContext, SimpleTypeMarker simpleTypeMarker) {
            return (simpleTypeMarker instanceof SimpleTypeWithEnhancement) && classicTypeSystemContext.isSingleClassifierType(((SimpleTypeWithEnhancement) simpleTypeMarker).getOrigin());
        }

        public static boolean isStarProjection(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeArgumentMarker typeArgumentMarker) {
            typeArgumentMarker.getClass();
            if (typeArgumentMarker instanceof TypeProjection) {
                return ((TypeProjection) typeArgumentMarker).isStarProjection();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeArgumentMarker);
            sb.append(", ");
            ogj.h(mz1.k(duf.a, typeArgumentMarker.getClass(), sb));
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean isStubType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull SimpleTypeMarker simpleTypeMarker) {
            simpleTypeMarker.getClass();
            if (simpleTypeMarker instanceof SimpleType) {
                return TypeUtilsKt.isStubType((KotlinType) simpleTypeMarker);
            }
            StringBuilder r = wt3.r("ClassicTypeSystemContext couldn't handle: ", simpleTypeMarker, ", ");
            ogj.h(mz1.k(duf.a, simpleTypeMarker.getClass(), r));
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean isStubTypeForBuilderInference(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull SimpleTypeMarker simpleTypeMarker) {
            simpleTypeMarker.getClass();
            if (simpleTypeMarker instanceof SimpleType) {
                return TypeUtilsKt.isStubTypeForBuilderInference((KotlinType) simpleTypeMarker);
            }
            StringBuilder r = wt3.r("ClassicTypeSystemContext couldn't handle: ", simpleTypeMarker, ", ");
            ogj.h(mz1.k(duf.a, simpleTypeMarker.getClass(), r));
            return false;
        }

        public static boolean isTypeVariableType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker kotlinTypeMarker) {
            kotlinTypeMarker.getClass();
            return (kotlinTypeMarker instanceof UnwrappedType) && (((UnwrappedType) kotlinTypeMarker).getConstructor() instanceof NewTypeVariableConstructor);
        }

        public static boolean isUnderKotlinPackage(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                ClassifierDescriptor mo893getDeclarationDescriptor = ((TypeConstructor) typeConstructorMarker).mo893getDeclarationDescriptor();
                return mo893getDeclarationDescriptor != null && KotlinBuiltIns.isUnderKotlinPackage(mo893getDeclarationDescriptor);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            sb.append(", ");
            ogj.h(mz1.k(duf.a, typeConstructorMarker.getClass(), sb));
            return false;
        }

        @NotNull
        public static SimpleTypeMarker lowerBound(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull FlexibleTypeMarker flexibleTypeMarker) {
            flexibleTypeMarker.getClass();
            if (flexibleTypeMarker instanceof FlexibleType) {
                return ((FlexibleType) flexibleTypeMarker).getLowerBound();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(flexibleTypeMarker);
            sb.append(", ");
            ogj.h(mz1.k(duf.a, flexibleTypeMarker.getClass(), sb));
            return null;
        }

        @Nullable
        public static KotlinTypeMarker lowerType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull CapturedTypeMarker capturedTypeMarker) {
            capturedTypeMarker.getClass();
            if (capturedTypeMarker instanceof NewCapturedType) {
                return ((NewCapturedType) capturedTypeMarker).getLowerType();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(capturedTypeMarker);
            sb.append(", ");
            ogj.h(mz1.k(duf.a, capturedTypeMarker.getClass(), sb));
            return null;
        }

        @NotNull
        public static KotlinTypeMarker makeDefinitelyNotNullOrNotNull(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker kotlinTypeMarker) {
            UnwrappedType makeDefinitelyNotNullOrNotNullInternal;
            kotlinTypeMarker.getClass();
            if (kotlinTypeMarker instanceof UnwrappedType) {
                makeDefinitelyNotNullOrNotNullInternal = ClassicTypeSystemContextKt.makeDefinitelyNotNullOrNotNullInternal((UnwrappedType) kotlinTypeMarker);
                return makeDefinitelyNotNullOrNotNullInternal;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            sb.append(", ");
            ogj.h(mz1.k(duf.a, kotlinTypeMarker.getClass(), sb));
            return null;
        }

        @NotNull
        public static TypeCheckerState newTypeCheckerState(@NotNull ClassicTypeSystemContext classicTypeSystemContext, boolean z, boolean z2) {
            return ClassicTypeCheckerStateKt.createClassicTypeCheckerState$default(z, z2, classicTypeSystemContext, null, null, 24, null);
        }

        @NotNull
        public static SimpleTypeMarker original(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull DefinitelyNotNullTypeMarker definitelyNotNullTypeMarker) {
            definitelyNotNullTypeMarker.getClass();
            if (definitelyNotNullTypeMarker instanceof DefinitelyNotNullType) {
                return ((DefinitelyNotNullType) definitelyNotNullTypeMarker).getOriginal();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(definitelyNotNullTypeMarker);
            sb.append(", ");
            ogj.h(mz1.k(duf.a, definitelyNotNullTypeMarker.getClass(), sb));
            return null;
        }

        public static int parametersCount(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                return ((TypeConstructor) typeConstructorMarker).getParameters().size();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            sb.append(", ");
            ogj.h(mz1.k(duf.a, typeConstructorMarker.getClass(), sb));
            return 0;
        }

        @NotNull
        public static Collection<KotlinTypeMarker> possibleIntegerTypes(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull SimpleTypeMarker simpleTypeMarker) {
            simpleTypeMarker.getClass();
            TypeConstructorMarker typeConstructor = classicTypeSystemContext.typeConstructor(simpleTypeMarker);
            if (typeConstructor instanceof IntegerLiteralTypeConstructor) {
                return ((IntegerLiteralTypeConstructor) typeConstructor).getPossibleTypes();
            }
            StringBuilder r = wt3.r("ClassicTypeSystemContext couldn't handle: ", simpleTypeMarker, ", ");
            ogj.h(mz1.k(duf.a, simpleTypeMarker.getClass(), r));
            return null;
        }

        @NotNull
        public static TypeArgumentMarker projection(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull CapturedTypeConstructorMarker capturedTypeConstructorMarker) {
            capturedTypeConstructorMarker.getClass();
            if (capturedTypeConstructorMarker instanceof NewCapturedTypeConstructor) {
                return ((NewCapturedTypeConstructor) capturedTypeConstructorMarker).getProjection();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(capturedTypeConstructorMarker);
            sb.append(", ");
            ogj.h(mz1.k(duf.a, capturedTypeConstructorMarker.getClass(), sb));
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public static TypeCheckerState.SupertypesPolicy substitutionSupertypePolicy(@NotNull final ClassicTypeSystemContext classicTypeSystemContext, @NotNull SimpleTypeMarker simpleTypeMarker) {
            simpleTypeMarker.getClass();
            if (simpleTypeMarker instanceof SimpleType) {
                final TypeSubstitutor buildSubstitutor = TypeConstructorSubstitution.Companion.create((KotlinType) simpleTypeMarker).buildSubstitutor();
                return new TypeCheckerState.SupertypesPolicy.DoCustomTransform() { // from class: kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext$substitutionSupertypePolicy$2
                    @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy
                    @NotNull
                    /* renamed from: transformType */
                    public SimpleTypeMarker mo897transformType(@NotNull TypeCheckerState typeCheckerState, @NotNull KotlinTypeMarker kotlinTypeMarker) {
                        typeCheckerState.getClass();
                        kotlinTypeMarker.getClass();
                        ClassicTypeSystemContext classicTypeSystemContext2 = ClassicTypeSystemContext.this;
                        TypeSubstitutor typeSubstitutor = buildSubstitutor;
                        Object lowerBoundIfFlexible = classicTypeSystemContext2.lowerBoundIfFlexible(kotlinTypeMarker);
                        lowerBoundIfFlexible.getClass();
                        KotlinType safeSubstitute = typeSubstitutor.safeSubstitute((KotlinType) lowerBoundIfFlexible, Variance.INVARIANT);
                        safeSubstitute.getClass();
                        SimpleTypeMarker asSimpleType = classicTypeSystemContext2.asSimpleType(safeSubstitute);
                        asSimpleType.getClass();
                        return asSimpleType;
                    }
                };
            }
            StringBuilder r = wt3.r("ClassicTypeSystemContext couldn't handle: ", simpleTypeMarker, ", ");
            ogj.h(mz1.k(duf.a, simpleTypeMarker.getClass(), r));
            return null;
        }

        @NotNull
        public static Collection<KotlinTypeMarker> supertypes(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                Collection<KotlinType> mo894getSupertypes = ((TypeConstructor) typeConstructorMarker).mo894getSupertypes();
                mo894getSupertypes.getClass();
                return mo894getSupertypes;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            sb.append(", ");
            ogj.h(mz1.k(duf.a, typeConstructorMarker.getClass(), sb));
            return null;
        }

        @NotNull
        public static CapturedTypeConstructorMarker typeConstructor(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull CapturedTypeMarker capturedTypeMarker) {
            capturedTypeMarker.getClass();
            if (capturedTypeMarker instanceof NewCapturedType) {
                return ((NewCapturedType) capturedTypeMarker).getConstructor();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(capturedTypeMarker);
            sb.append(", ");
            ogj.h(mz1.k(duf.a, capturedTypeMarker.getClass(), sb));
            return null;
        }

        @NotNull
        public static SimpleTypeMarker upperBound(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull FlexibleTypeMarker flexibleTypeMarker) {
            flexibleTypeMarker.getClass();
            if (flexibleTypeMarker instanceof FlexibleType) {
                return ((FlexibleType) flexibleTypeMarker).getUpperBound();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(flexibleTypeMarker);
            sb.append(", ");
            ogj.h(mz1.k(duf.a, flexibleTypeMarker.getClass(), sb));
            return null;
        }

        @NotNull
        public static KotlinTypeMarker withNullability(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker kotlinTypeMarker, boolean z) {
            kotlinTypeMarker.getClass();
            if (kotlinTypeMarker instanceof SimpleTypeMarker) {
                return classicTypeSystemContext.withNullability((SimpleTypeMarker) kotlinTypeMarker, z);
            }
            if (kotlinTypeMarker instanceof FlexibleTypeMarker) {
                FlexibleTypeMarker flexibleTypeMarker = (FlexibleTypeMarker) kotlinTypeMarker;
                return classicTypeSystemContext.createFlexibleType(classicTypeSystemContext.withNullability(classicTypeSystemContext.lowerBound(flexibleTypeMarker), z), classicTypeSystemContext.withNullability(classicTypeSystemContext.upperBound(flexibleTypeMarker), z));
            }
            a70.r("sealed");
            return null;
        }

        @NotNull
        public static TypeConstructorMarker typeConstructor(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull SimpleTypeMarker simpleTypeMarker) {
            simpleTypeMarker.getClass();
            if (simpleTypeMarker instanceof SimpleType) {
                return ((SimpleType) simpleTypeMarker).getConstructor();
            }
            StringBuilder r = wt3.r("ClassicTypeSystemContext couldn't handle: ", simpleTypeMarker, ", ");
            ogj.h(mz1.k(duf.a, simpleTypeMarker.getClass(), r));
            return null;
        }

        @NotNull
        public static SimpleTypeMarker withNullability(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull SimpleTypeMarker simpleTypeMarker, boolean z) {
            simpleTypeMarker.getClass();
            if (simpleTypeMarker instanceof SimpleType) {
                return ((SimpleType) simpleTypeMarker).makeNullableAsSpecified(z);
            }
            StringBuilder r = wt3.r("ClassicTypeSystemContext couldn't handle: ", simpleTypeMarker, ", ");
            ogj.h(mz1.k(duf.a, simpleTypeMarker.getClass(), r));
            return null;
        }

        @NotNull
        public static TypeVariance getVariance(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeParameterMarker typeParameterMarker) {
            typeParameterMarker.getClass();
            if (typeParameterMarker instanceof TypeParameterDescriptor) {
                Variance variance = ((TypeParameterDescriptor) typeParameterMarker).getVariance();
                variance.getClass();
                return TypeSystemContextKt.convertVariance(variance);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeParameterMarker);
            sb.append(", ");
            ogj.h(mz1.k(duf.a, typeParameterMarker.getClass(), sb));
            return null;
        }
    }
}
