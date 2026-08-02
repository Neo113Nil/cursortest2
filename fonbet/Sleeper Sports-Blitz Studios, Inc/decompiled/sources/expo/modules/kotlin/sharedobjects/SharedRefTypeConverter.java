package expo.modules.kotlin.sharedobjects;

import androidx.exifinterface.media.ExifInterface;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.KClassExtensionsKt;
import expo.modules.kotlin.exception.IncorrectRefTypeException;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.sharedobjects.SharedRef;
import expo.modules.kotlin.types.NonNullableTypeConverter;
import expo.modules.kotlin.types.descriptors.TypeDescriptor;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;

/* compiled from: SharedObjectTypeConverter.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016¢\u0006\u0002\u0010\u0019J\u0018\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u00022\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0018H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\f\u001a\u0004\u0018\u00010\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001f"}, d2 = {"Lexpo/modules/kotlin/sharedobjects/SharedRefTypeConverter;", ExifInterface.GPS_DIRECTION_TRUE, "Lexpo/modules/kotlin/sharedobjects/SharedRef;", "Lexpo/modules/kotlin/types/NonNullableTypeConverter;", "typeDescriptor", "Lexpo/modules/kotlin/types/descriptors/TypeDescriptor;", "<init>", "(Lexpo/modules/kotlin/types/descriptors/TypeDescriptor;)V", "getTypeDescriptor", "()Lexpo/modules/kotlin/types/descriptors/TypeDescriptor;", "sharedObjectTypeConverter", "Lexpo/modules/kotlin/sharedobjects/SharedObjectTypeConverter;", "sharedRefType", "Lkotlin/reflect/KType;", "getSharedRefType", "()Lkotlin/reflect/KType;", "sharedRefType$delegate", "Lkotlin/Lazy;", "convertNonNullable", "value", "", "context", "Lexpo/modules/kotlin/AppContext;", "forceConversion", "", "(Ljava/lang/Object;Lexpo/modules/kotlin/AppContext;Z)Lexpo/modules/kotlin/sharedobjects/SharedRef;", "checkInnerRef", "sharedRef", "getCppRequiredTypes", "Lexpo/modules/kotlin/jni/ExpectedType;", "isTrivial", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SharedRefTypeConverter<T extends SharedRef<?>> extends NonNullableTypeConverter<T> {
    private final SharedObjectTypeConverter<T> sharedObjectTypeConverter;

    /* renamed from: sharedRefType$delegate, reason: from kotlin metadata */
    private final Lazy sharedRefType;
    private final TypeDescriptor typeDescriptor;

    public final TypeDescriptor getTypeDescriptor() {
        return this.typeDescriptor;
    }

    public SharedRefTypeConverter(TypeDescriptor typeDescriptor) {
        Intrinsics.checkNotNullParameter(typeDescriptor, "typeDescriptor");
        this.typeDescriptor = typeDescriptor;
        this.sharedObjectTypeConverter = new SharedObjectTypeConverter<>(typeDescriptor);
        this.sharedRefType = LazyKt.lazy(new Function0() { // from class: expo.modules.kotlin.sharedobjects.SharedRefTypeConverter$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KType sharedRefType_delegate$lambda$1;
                sharedRefType_delegate$lambda$1 = SharedRefTypeConverter.sharedRefType_delegate$lambda$1(SharedRefTypeConverter.this);
                return sharedRefType_delegate$lambda$1;
            }
        });
    }

    public final KType getSharedRefType() {
        return (KType) this.sharedRefType.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KType sharedRefType_delegate$lambda$1(SharedRefTypeConverter sharedRefTypeConverter) {
        List<KTypeProjection> arguments;
        KClass<?> kClass = sharedRefTypeConverter.typeDescriptor.getTypeInfo().getKClass();
        KType kType = sharedRefTypeConverter.typeDescriptor.getKType();
        while (true) {
            if (kClass == null) {
                return null;
            }
            if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(SharedRef.class))) {
                KTypeProjection kTypeProjection = (kType == null || (arguments = kType.getArguments()) == null) ? null : (KTypeProjection) CollectionsKt.first((List) arguments);
                if (Intrinsics.areEqual(kTypeProjection, KTypeProjection.INSTANCE.getSTAR())) {
                    return null;
                }
                KType type = kTypeProjection != null ? kTypeProjection.getType() : null;
                if (type != null) {
                    return type;
                }
                throw new IllegalArgumentException(("The " + sharedRefTypeConverter.getSharedRefType() + " type should contain the type of the inner ref").toString());
            }
            kType = (KType) CollectionsKt.firstOrNull((List) kClass.getSupertypes());
            KClassifier classifier = kType != null ? kType.getClassifier() : null;
            kClass = classifier instanceof KClass ? (KClass) classifier : null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // expo.modules.kotlin.types.NonNullableTypeConverter
    public T convertNonNullable(Object value, AppContext context, boolean forceConversion) {
        Intrinsics.checkNotNullParameter(value, "value");
        T t = (T) checkInnerRef((SharedRef) this.sharedObjectTypeConverter.convert(value, context, forceConversion));
        Intrinsics.checkNotNull(t, "null cannot be cast to non-null type T of expo.modules.kotlin.sharedobjects.SharedRefTypeConverter");
        return t;
    }

    private final SharedRef<?> checkInnerRef(SharedRef<?> sharedRef) {
        Object ref = sharedRef.getRef();
        if (ref != null) {
            KType sharedRefType = getSharedRefType();
            KClassifier classifier = sharedRefType != null ? sharedRefType.getClassifier() : null;
            KClass kClass = classifier instanceof KClass ? (KClass) classifier : null;
            if (kClass != null && !KClassExtensionsKt.fastIsSupperClassOf(kClass, ref.getClass())) {
                throw new IncorrectRefTypeException(this.typeDescriptor, sharedRef.getClass());
            }
        }
        return sharedRef;
    }

    @Override // expo.modules.kotlin.types.NonNullableTypeConverter, expo.modules.kotlin.types.TypeConverter
    /* renamed from: getCppRequiredTypes */
    public ExpectedType get$cppRequireType() {
        return this.sharedObjectTypeConverter.get$cppRequireType();
    }

    @Override // expo.modules.kotlin.types.NonNullableTypeConverter, expo.modules.kotlin.types.TypeConverter
    public boolean isTrivial() {
        return this.sharedObjectTypeConverter.isTrivial();
    }
}
