package expo.modules.kotlin.records;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableMap;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.allocators.ObjectConstructor;
import expo.modules.kotlin.allocators.ObjectConstructorFactory;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.DynamicCastException;
import expo.modules.kotlin.exception.FieldCastException;
import expo.modules.kotlin.exception.FieldRequiredException;
import expo.modules.kotlin.exception.RecordCastException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.CppType;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.records.Record;
import expo.modules.kotlin.types.DynamicAwareTypeConverters;
import expo.modules.kotlin.types.TypeConverter;
import expo.modules.kotlin.types.TypeConverterProvider;
import expo.modules.kotlin.types.descriptors.TypeDescriptor;
import expo.modules.kotlin.types.descriptors.TypeDescriptorKt;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KProperty1;
import kotlin.reflect.full.KClasses;
import kotlin.reflect.jvm.ReflectJvmMapping;
import kotlin.text.StringsKt;

/* compiled from: RecordTypeConverter.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u00011B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016¢\u0006\u0002\u0010\u001eJ'\u0010\u001f\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u00112\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016¢\u0006\u0002\u0010 J\b\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\u001dH\u0016J'\u0010$\u001a\u00028\u00002\u0006\u0010%\u001a\u00020&2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002¢\u0006\u0002\u0010'J;\u0010(\u001a\u00028\u00002\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000f2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001dH\u0000¢\u0006\u0004\b+\u0010,J&\u0010-\u001a\b\u0012\u0004\u0012\u0002H\u00010.\"\b\b\u0001\u0010\u0001*\u00020\u00112\f\u0010/\u001a\b\u0012\u0004\u0012\u0002H\u000100H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R3\u0010\u000e\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\u0011\u0012\u0002\b\u00030\u0010\u0012\u0004\u0012\u00020\u00120\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014¨\u00062"}, d2 = {"Lexpo/modules/kotlin/records/RecordTypeConverter;", ExifInterface.GPS_DIRECTION_TRUE, "Lexpo/modules/kotlin/records/Record;", "Lexpo/modules/kotlin/types/DynamicAwareTypeConverters;", "converterProvider", "Lexpo/modules/kotlin/types/TypeConverterProvider;", "typeDescriptor", "Lexpo/modules/kotlin/types/descriptors/TypeDescriptor;", "<init>", "(Lexpo/modules/kotlin/types/TypeConverterProvider;Lexpo/modules/kotlin/types/descriptors/TypeDescriptor;)V", "getTypeDescriptor", "()Lexpo/modules/kotlin/types/descriptors/TypeDescriptor;", "objectConstructorFactory", "Lexpo/modules/kotlin/allocators/ObjectConstructorFactory;", "propertyDescriptors", "", "Lkotlin/reflect/KProperty1;", "", "Lexpo/modules/kotlin/records/RecordTypeConverter$PropertyDescriptor;", "getPropertyDescriptors", "()Ljava/util/Map;", "propertyDescriptors$delegate", "Lkotlin/Lazy;", "convertFromDynamic", "value", "Lcom/facebook/react/bridge/Dynamic;", "context", "Lexpo/modules/kotlin/AppContext;", "forceConversion", "", "(Lcom/facebook/react/bridge/Dynamic;Lexpo/modules/kotlin/AppContext;Z)Lexpo/modules/kotlin/records/Record;", "convertFromAny", "(Ljava/lang/Object;Lexpo/modules/kotlin/AppContext;Z)Lexpo/modules/kotlin/records/Record;", "getCppRequiredTypes", "Lexpo/modules/kotlin/jni/ExpectedType;", "isTrivial", "convertFromReadableMap", "jsMap", "Lcom/facebook/react/bridge/ReadableMap;", "(Lcom/facebook/react/bridge/ReadableMap;Lexpo/modules/kotlin/AppContext;Z)Lexpo/modules/kotlin/records/Record;", "convertFromMap", "map", "", "convertFromMap$expo_modules_core_release", "(Ljava/util/Map;Lexpo/modules/kotlin/AppContext;Z)Lexpo/modules/kotlin/records/Record;", "getObjectConstructor", "Lexpo/modules/kotlin/allocators/ObjectConstructor;", "clazz", "Lkotlin/reflect/KClass;", "PropertyDescriptor", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RecordTypeConverter<T extends Record> extends DynamicAwareTypeConverters<T> {
    private final TypeConverterProvider converterProvider;
    private final ObjectConstructorFactory objectConstructorFactory;

    /* renamed from: propertyDescriptors$delegate, reason: from kotlin metadata */
    private final Lazy propertyDescriptors;
    private final TypeDescriptor typeDescriptor;

    @Override // expo.modules.kotlin.types.NonNullableTypeConverter, expo.modules.kotlin.types.TypeConverter
    public boolean isTrivial() {
        return false;
    }

    public final TypeDescriptor getTypeDescriptor() {
        return this.typeDescriptor;
    }

    public RecordTypeConverter(TypeConverterProvider converterProvider, TypeDescriptor typeDescriptor) {
        Intrinsics.checkNotNullParameter(converterProvider, "converterProvider");
        Intrinsics.checkNotNullParameter(typeDescriptor, "typeDescriptor");
        this.converterProvider = converterProvider;
        this.typeDescriptor = typeDescriptor;
        this.objectConstructorFactory = new ObjectConstructorFactory();
        this.propertyDescriptors = LazyKt.lazy(new Function0() { // from class: expo.modules.kotlin.records.RecordTypeConverter$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Map propertyDescriptors_delegate$lambda$1;
                propertyDescriptors_delegate$lambda$1 = RecordTypeConverter.propertyDescriptors_delegate$lambda$1(RecordTypeConverter.this);
                return propertyDescriptors_delegate$lambda$1;
            }
        });
    }

    private final Map<KProperty1<? extends Object, ?>, PropertyDescriptor> getPropertyDescriptors() {
        return (Map) this.propertyDescriptors.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map propertyDescriptors_delegate$lambda$1(RecordTypeConverter recordTypeConverter) {
        Object obj;
        Object obj2;
        Collection<KProperty1> memberProperties = KClasses.getMemberProperties(recordTypeConverter.typeDescriptor.getTypeInfo().getKClass());
        ArrayList arrayList = new ArrayList();
        for (KProperty1 kProperty1 : memberProperties) {
            KProperty1 kProperty12 = kProperty1;
            Iterator<T> it = kProperty12.getAnnotations().iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (((Annotation) obj2) instanceof Field) {
                    break;
                }
            }
            Field field = (Field) obj2;
            if (field != null) {
                TypeConverter<?> obtainTypeConverter = recordTypeConverter.converterProvider.obtainTypeConverter(TypeDescriptorKt.toTypeDescriptor(kProperty1.getReturnType()));
                Iterator<T> it2 = kProperty12.getAnnotations().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (((Annotation) next) instanceof Required) {
                        obj = next;
                        break;
                    }
                }
                obj = TuplesKt.to(kProperty1, new PropertyDescriptor(obtainTypeConverter, field, ((Required) obj) != null));
            }
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return MapsKt.toMap(arrayList);
    }

    @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
    public T convertFromDynamic(Dynamic value, AppContext context, boolean forceConversion) {
        UnexpectedException unexpectedException;
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            ReadableMap asMap = value.asMap();
            if (asMap != null) {
                return (T) convertFromReadableMap(asMap, context, forceConversion);
            }
            throw new DynamicCastException(Reflection.getOrCreateKotlinClass(ReadableMap.class));
        } catch (Throwable th) {
            if (th instanceof CodedException) {
                unexpectedException = (CodedException) th;
            } else if (th instanceof expo.modules.core.errors.CodedException) {
                expo.modules.core.errors.CodedException codedException = (expo.modules.core.errors.CodedException) th;
                unexpectedException = new CodedException(codedException.getCode(), codedException.getMessage(), codedException.getCause());
            } else {
                unexpectedException = new UnexpectedException(th);
            }
            throw new RecordCastException(getTypeDescriptor(), unexpectedException);
        }
    }

    @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
    public T convertFromAny(Object value, AppContext context, boolean forceConversion) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof ReadableMap) {
            return convertFromReadableMap((ReadableMap) value, context, forceConversion);
        }
        if (value instanceof Map) {
            return convertFromMap$expo_modules_core_release((Map) value, context, forceConversion);
        }
        return (T) value;
    }

    @Override // expo.modules.kotlin.types.NonNullableTypeConverter, expo.modules.kotlin.types.TypeConverter
    /* renamed from: getCppRequiredTypes */
    public ExpectedType get$cppRequireType() {
        return new ExpectedType(CppType.READABLE_MAP);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T convertFromReadableMap(ReadableMap jsMap, AppContext context, boolean forceConversion) {
        FieldCastException fieldCastException;
        T construct = getObjectConstructor(this.typeDescriptor.getTypeInfo().getKClass()).construct();
        for (Map.Entry<KProperty1<? extends Object, ?>, PropertyDescriptor> entry : getPropertyDescriptors().entrySet()) {
            KProperty1<? extends Object, ?> key = entry.getKey();
            PropertyDescriptor value = entry.getValue();
            String key2 = value.getFieldAnnotation().key();
            if (StringsKt.isBlank(key2)) {
                key2 = null;
            }
            if (key2 == null) {
                key2 = key.getName();
            }
            if (!jsMap.hasKey(key2)) {
                if (value.isRequired()) {
                    throw new FieldRequiredException(key);
                }
            } else {
                Dynamic dynamic = jsMap.getDynamic(key2);
                try {
                    java.lang.reflect.Field javaField = ReflectJvmMapping.getJavaField(key);
                    Intrinsics.checkNotNull(javaField);
                    try {
                        Object convert = value.getTypeConverter().convert(dynamic, context, forceConversion);
                        javaField.setAccessible(true);
                        javaField.set(construct, convert);
                        Unit unit = Unit.INSTANCE;
                    } finally {
                    }
                } finally {
                    dynamic.recycle();
                }
            }
        }
        Intrinsics.checkNotNull(construct, "null cannot be cast to non-null type T of expo.modules.kotlin.records.RecordTypeConverter");
        return construct;
    }

    public static /* synthetic */ Record convertFromMap$expo_modules_core_release$default(RecordTypeConverter recordTypeConverter, Map map, AppContext appContext, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            appContext = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return recordTypeConverter.convertFromMap$expo_modules_core_release(map, appContext, z);
    }

    public final T convertFromMap$expo_modules_core_release(Map<String, ? extends Object> map, AppContext context, boolean forceConversion) {
        UnexpectedException unexpectedException;
        Intrinsics.checkNotNullParameter(map, "map");
        T construct = getObjectConstructor(this.typeDescriptor.getTypeInfo().getKClass()).construct();
        for (Map.Entry<KProperty1<? extends Object, ?>, PropertyDescriptor> entry : getPropertyDescriptors().entrySet()) {
            KProperty1<? extends Object, ?> key = entry.getKey();
            PropertyDescriptor value = entry.getValue();
            String key2 = value.getFieldAnnotation().key();
            if (StringsKt.isBlank(key2)) {
                key2 = null;
            }
            if (key2 == null) {
                key2 = key.getName();
            }
            if (!map.containsKey(key2)) {
                if (value.isRequired()) {
                    throw new FieldRequiredException(key);
                }
            } else {
                Double d = map.get(key2);
                if (d instanceof Number) {
                    KClassifier classifier = key.getReturnType().getClassifier();
                    if (Intrinsics.areEqual(classifier, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                        d = Integer.valueOf(((Number) d).intValue());
                    } else if (Intrinsics.areEqual(classifier, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                        d = Long.valueOf(((Number) d).longValue());
                    } else if (Intrinsics.areEqual(classifier, Reflection.getOrCreateKotlinClass(Float.TYPE))) {
                        d = Float.valueOf(((Number) d).floatValue());
                    } else {
                        d = Intrinsics.areEqual(classifier, Reflection.getOrCreateKotlinClass(Double.TYPE)) ? Double.valueOf(((Number) d).doubleValue()) : (Number) d;
                    }
                }
                java.lang.reflect.Field javaField = ReflectJvmMapping.getJavaField(key);
                Intrinsics.checkNotNull(javaField);
                try {
                    Object convert = value.getTypeConverter().convert(d, context, forceConversion);
                    javaField.setAccessible(true);
                    javaField.set(construct, convert);
                } catch (Throwable th) {
                    if (th instanceof CodedException) {
                        unexpectedException = (CodedException) th;
                    } else if (th instanceof expo.modules.core.errors.CodedException) {
                        expo.modules.core.errors.CodedException codedException = (expo.modules.core.errors.CodedException) th;
                        unexpectedException = new CodedException(codedException.getCode(), codedException.getMessage(), codedException.getCause());
                    } else {
                        unexpectedException = new UnexpectedException(th);
                    }
                    throw new FieldCastException(key.getName(), key.getReturnType(), getTypeDescriptor(), unexpectedException);
                }
            }
        }
        Intrinsics.checkNotNull(construct, "null cannot be cast to non-null type T of expo.modules.kotlin.records.RecordTypeConverter");
        return construct;
    }

    private final <T> ObjectConstructor<T> getObjectConstructor(KClass<T> clazz) {
        return this.objectConstructorFactory.get(clazz);
    }

    /* compiled from: RecordTypeConverter.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B#\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0019"}, d2 = {"Lexpo/modules/kotlin/records/RecordTypeConverter$PropertyDescriptor;", "", "typeConverter", "Lexpo/modules/kotlin/types/TypeConverter;", "fieldAnnotation", "Lexpo/modules/kotlin/records/Field;", "isRequired", "", "<init>", "(Lexpo/modules/kotlin/types/TypeConverter;Lexpo/modules/kotlin/records/Field;Z)V", "getTypeConverter", "()Lexpo/modules/kotlin/types/TypeConverter;", "getFieldAnnotation", "()Lexpo/modules/kotlin/records/Field;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final /* data */ class PropertyDescriptor {
        private final Field fieldAnnotation;
        private final boolean isRequired;
        private final TypeConverter<?> typeConverter;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PropertyDescriptor copy$default(PropertyDescriptor propertyDescriptor, TypeConverter typeConverter, Field field, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                typeConverter = propertyDescriptor.typeConverter;
            }
            if ((i & 2) != 0) {
                field = propertyDescriptor.fieldAnnotation;
            }
            if ((i & 4) != 0) {
                z = propertyDescriptor.isRequired;
            }
            return propertyDescriptor.copy(typeConverter, field, z);
        }

        public final TypeConverter<?> component1() {
            return this.typeConverter;
        }

        /* renamed from: component2, reason: from getter */
        public final Field getFieldAnnotation() {
            return this.fieldAnnotation;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsRequired() {
            return this.isRequired;
        }

        public final PropertyDescriptor copy(TypeConverter<?> typeConverter, Field fieldAnnotation, boolean isRequired) {
            Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
            Intrinsics.checkNotNullParameter(fieldAnnotation, "fieldAnnotation");
            return new PropertyDescriptor(typeConverter, fieldAnnotation, isRequired);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PropertyDescriptor)) {
                return false;
            }
            PropertyDescriptor propertyDescriptor = (PropertyDescriptor) other;
            return Intrinsics.areEqual(this.typeConverter, propertyDescriptor.typeConverter) && Intrinsics.areEqual(this.fieldAnnotation, propertyDescriptor.fieldAnnotation) && this.isRequired == propertyDescriptor.isRequired;
        }

        public int hashCode() {
            return (((this.typeConverter.hashCode() * 31) + this.fieldAnnotation.hashCode()) * 31) + Boolean.hashCode(this.isRequired);
        }

        public String toString() {
            return "PropertyDescriptor(typeConverter=" + this.typeConverter + ", fieldAnnotation=" + this.fieldAnnotation + ", isRequired=" + this.isRequired + ")";
        }

        public PropertyDescriptor(TypeConverter<?> typeConverter, Field fieldAnnotation, boolean z) {
            Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
            Intrinsics.checkNotNullParameter(fieldAnnotation, "fieldAnnotation");
            this.typeConverter = typeConverter;
            this.fieldAnnotation = fieldAnnotation;
            this.isRequired = z;
        }

        public final TypeConverter<?> getTypeConverter() {
            return this.typeConverter;
        }

        public final Field getFieldAnnotation() {
            return this.fieldAnnotation;
        }

        public final boolean isRequired() {
            return this.isRequired;
        }
    }
}
