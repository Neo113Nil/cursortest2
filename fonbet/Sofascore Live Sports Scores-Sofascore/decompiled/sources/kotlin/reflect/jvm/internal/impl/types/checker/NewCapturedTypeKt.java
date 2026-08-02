package kotlin.reflect.jvm.internal.impl.types.checker;

import defpackage.k13;
import defpackage.me4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class NewCapturedTypeKt {
    private static final List<TypeProjection> captureArguments(UnwrappedType unwrappedType, CaptureStatus captureStatus) {
        List<TypeProjection> arguments;
        if (unwrappedType.getArguments().size() == unwrappedType.getConstructor().getParameters().size() && ((arguments = unwrappedType.getArguments()) == null || !arguments.isEmpty())) {
            Iterator<T> it = arguments.iterator();
            while (it.hasNext()) {
                if (((TypeProjection) it.next()).getProjectionKind() != Variance.INVARIANT) {
                    List<TypeParameterDescriptor> parameters = unwrappedType.getConstructor().getParameters();
                    parameters.getClass();
                    ArrayList Y0 = CollectionsKt.Y0(arguments, parameters);
                    ArrayList arrayList = new ArrayList(k13.r(Y0, 10));
                    Iterator it2 = Y0.iterator();
                    while (it2.hasNext()) {
                        Pair pair = (Pair) it2.next();
                        TypeProjection typeProjection = (TypeProjection) pair.a;
                        TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) pair.b;
                        if (typeProjection.getProjectionKind() != Variance.INVARIANT) {
                            UnwrappedType unwrap = (typeProjection.isStarProjection() || typeProjection.getProjectionKind() != Variance.IN_VARIANCE) ? null : typeProjection.getType().unwrap();
                            typeParameterDescriptor.getClass();
                            typeProjection = TypeUtilsKt.asTypeProjection(new NewCapturedType(captureStatus, unwrap, typeProjection, typeParameterDescriptor));
                        }
                        arrayList.add(typeProjection);
                    }
                    TypeSubstitutor buildSubstitutor = TypeConstructorSubstitution.Companion.create(unwrappedType.getConstructor(), arrayList).buildSubstitutor();
                    int size = arguments.size();
                    for (int i = 0; i < size; i++) {
                        TypeProjection typeProjection2 = arguments.get(i);
                        TypeProjection typeProjection3 = (TypeProjection) arrayList.get(i);
                        if (typeProjection2.getProjectionKind() != Variance.INVARIANT) {
                            List<KotlinType> upperBounds = unwrappedType.getConstructor().getParameters().get(i).getUpperBounds();
                            ArrayList k = me4.k(upperBounds);
                            Iterator<T> it3 = upperBounds.iterator();
                            while (it3.hasNext()) {
                                k.add(KotlinTypePreparator.Default.INSTANCE.prepareType((KotlinTypeMarker) buildSubstitutor.safeSubstitute((KotlinType) it3.next(), Variance.INVARIANT).unwrap()));
                            }
                            if (!typeProjection2.isStarProjection() && typeProjection2.getProjectionKind() == Variance.OUT_VARIANCE) {
                                k.add(KotlinTypePreparator.Default.INSTANCE.prepareType((KotlinTypeMarker) typeProjection2.getType().unwrap()));
                            }
                            KotlinType type = typeProjection3.getType();
                            type.getClass();
                            ((NewCapturedType) type).getConstructor().initializeSupertypes(k);
                        }
                    }
                    return arrayList;
                }
            }
        }
        return null;
    }

    @Nullable
    public static final SimpleType captureFromArguments(@NotNull SimpleType simpleType, @NotNull CaptureStatus captureStatus) {
        simpleType.getClass();
        captureStatus.getClass();
        List<TypeProjection> captureArguments = captureArguments(simpleType, captureStatus);
        if (captureArguments != null) {
            return replaceArguments(simpleType, captureArguments);
        }
        return null;
    }

    private static final SimpleType replaceArguments(UnwrappedType unwrappedType, List<? extends TypeProjection> list) {
        return KotlinTypeFactory.simpleType$default(unwrappedType.getAttributes(), unwrappedType.getConstructor(), list, unwrappedType.isMarkedNullable(), (KotlinTypeRefiner) null, 16, (Object) null);
    }
}
