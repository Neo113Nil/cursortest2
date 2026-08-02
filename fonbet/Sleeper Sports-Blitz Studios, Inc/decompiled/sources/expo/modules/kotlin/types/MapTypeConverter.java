package expo.modules.kotlin.types;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableMap;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.CollectionElementCastException;
import expo.modules.kotlin.exception.DynamicCastException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.types.descriptors.RawTypeDescriptor;
import expo.modules.kotlin.types.descriptors.TypeDescriptor;
import expo.modules.kotlin.types.descriptors.TypeDescriptor$params$1$1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* compiled from: MapTypeConverter.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\u000b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00022\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J*\u0010\u0012\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00022\u0006\u0010\f\u001a\u00020\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J*\u0010\u0014\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00022\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0011H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lexpo/modules/kotlin/types/MapTypeConverter;", "Lexpo/modules/kotlin/types/DynamicAwareTypeConverters;", "", "converterProvider", "Lexpo/modules/kotlin/types/TypeConverterProvider;", "mapType", "Lexpo/modules/kotlin/types/descriptors/TypeDescriptor;", "<init>", "(Lexpo/modules/kotlin/types/TypeConverterProvider;Lexpo/modules/kotlin/types/descriptors/TypeDescriptor;)V", "valueConverter", "Lexpo/modules/kotlin/types/TypeConverter;", "convertFromDynamic", "value", "Lcom/facebook/react/bridge/Dynamic;", "context", "Lexpo/modules/kotlin/AppContext;", "forceConversion", "", "convertFromAny", "", "convertFromReadableMap", "jsMap", "Lcom/facebook/react/bridge/ReadableMap;", "getCppRequiredTypes", "Lexpo/modules/kotlin/jni/ExpectedType;", "isTrivial", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MapTypeConverter extends DynamicAwareTypeConverters<Map<?, ?>> {
    private final TypeDescriptor mapType;
    private final TypeConverter<?> valueConverter;

    public MapTypeConverter(TypeConverterProvider converterProvider, TypeDescriptor mapType) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList emptyList;
        Intrinsics.checkNotNullParameter(converterProvider, "converterProvider");
        Intrinsics.checkNotNullParameter(mapType, "mapType");
        this.mapType = mapType;
        RawTypeDescriptor typeInfo = mapType.getTypeInfo();
        int i = 0;
        if (typeInfo instanceof RawTypeDescriptor.Simple) {
            arrayList = CollectionsKt.emptyList();
        } else {
            if (!(typeInfo instanceof RawTypeDescriptor.Parameterized)) {
                throw new NoWhenBranchMatchedException();
            }
            List<RawTypeDescriptor> params = ((RawTypeDescriptor.Parameterized) mapType.getTypeInfo()).getParams();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(params, 10));
            int i2 = 0;
            for (Object obj : params) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                arrayList3.add(new TypeDescriptor((RawTypeDescriptor) obj, new TypeDescriptor$params$1$1(mapType, i2)));
                i2 = i3;
            }
            arrayList = arrayList3;
        }
        if (!Intrinsics.areEqual(((TypeDescriptor) CollectionsKt.first(arrayList)).getTypeInfo().getKClass(), Reflection.getOrCreateKotlinClass(String.class))) {
            TypeDescriptor typeDescriptor = this.mapType;
            RawTypeDescriptor typeInfo2 = typeDescriptor.getTypeInfo();
            if (typeInfo2 instanceof RawTypeDescriptor.Simple) {
                emptyList = CollectionsKt.emptyList();
            } else {
                if (!(typeInfo2 instanceof RawTypeDescriptor.Parameterized)) {
                    throw new NoWhenBranchMatchedException();
                }
                List<RawTypeDescriptor> params2 = ((RawTypeDescriptor.Parameterized) typeDescriptor.getTypeInfo()).getParams();
                ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(params2, 10));
                for (Object obj2 : params2) {
                    int i4 = i + 1;
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    arrayList4.add(new TypeDescriptor((RawTypeDescriptor) obj2, new TypeDescriptor$params$1$1(typeDescriptor, i)));
                    i = i4;
                }
                emptyList = arrayList4;
            }
            throw new IllegalArgumentException(("The map key type should be String, but received " + CollectionsKt.first((List<? extends Object>) emptyList) + ".").toString());
        }
        TypeDescriptor typeDescriptor2 = this.mapType;
        RawTypeDescriptor typeInfo3 = typeDescriptor2.getTypeInfo();
        if (typeInfo3 instanceof RawTypeDescriptor.Simple) {
            arrayList2 = CollectionsKt.emptyList();
        } else {
            if (!(typeInfo3 instanceof RawTypeDescriptor.Parameterized)) {
                throw new NoWhenBranchMatchedException();
            }
            List<RawTypeDescriptor> params3 = ((RawTypeDescriptor.Parameterized) typeDescriptor2.getTypeInfo()).getParams();
            ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(params3, 10));
            for (Object obj3 : params3) {
                int i5 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                arrayList5.add(new TypeDescriptor((RawTypeDescriptor) obj3, new TypeDescriptor$params$1$1(typeDescriptor2, i)));
                i = i5;
            }
            arrayList2 = arrayList5;
        }
        Object orNull = CollectionsKt.getOrNull(arrayList2, 1);
        if (orNull != null) {
            this.valueConverter = converterProvider.obtainTypeConverter((TypeDescriptor) orNull);
            return;
        }
        throw new IllegalArgumentException("The map type should contain the key type.".toString());
    }

    @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
    public Map<?, ?> convertFromDynamic(Dynamic value, AppContext context, boolean forceConversion) {
        Intrinsics.checkNotNullParameter(value, "value");
        ReadableMap asMap = value.asMap();
        if (asMap == null) {
            throw new DynamicCastException(Reflection.getOrCreateKotlinClass(ReadableMap.class));
        }
        return convertFromReadableMap(asMap, context, forceConversion);
    }

    @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
    public Map<?, ?> convertFromAny(Object value, AppContext context, boolean forceConversion) {
        UnexpectedException unexpectedException;
        ArrayList emptyList;
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.valueConverter.isTrivial() && !forceConversion) {
            return (Map) value;
        }
        Map map = (Map) value;
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value2 = entry.getValue();
            try {
                linkedHashMap.put(key, this.valueConverter.convert(value2, context, forceConversion));
            } catch (Throwable th) {
                if (th instanceof CodedException) {
                    unexpectedException = (CodedException) th;
                } else if (th instanceof expo.modules.core.errors.CodedException) {
                    expo.modules.core.errors.CodedException codedException = (expo.modules.core.errors.CodedException) th;
                    unexpectedException = new CodedException(codedException.getCode(), codedException.getMessage(), codedException.getCause());
                } else {
                    unexpectedException = new UnexpectedException(th);
                }
                TypeDescriptor typeDescriptor = this.mapType;
                TypeDescriptor typeDescriptor2 = this.mapType;
                RawTypeDescriptor typeInfo = typeDescriptor2.getTypeInfo();
                if (typeInfo instanceof RawTypeDescriptor.Simple) {
                    emptyList = CollectionsKt.emptyList();
                } else {
                    if (!(typeInfo instanceof RawTypeDescriptor.Parameterized)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    List<RawTypeDescriptor> params = ((RawTypeDescriptor.Parameterized) typeDescriptor2.getTypeInfo()).getParams();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(params, 10));
                    int i = 0;
                    for (Object obj : params) {
                        int i2 = i + 1;
                        if (i < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        arrayList.add(new TypeDescriptor((RawTypeDescriptor) obj, new TypeDescriptor$params$1$1(typeDescriptor2, i)));
                        i = i2;
                    }
                    emptyList = arrayList;
                }
                TypeDescriptor typeDescriptor3 = (TypeDescriptor) emptyList.get(1);
                Intrinsics.checkNotNull(value2);
                throw new CollectionElementCastException(typeDescriptor, typeDescriptor3, (KClass<?>) Reflection.getOrCreateKotlinClass(value2.getClass()), unexpectedException);
            }
        }
        return linkedHashMap;
    }

    private final Map<?, ?> convertFromReadableMap(ReadableMap jsMap, AppContext context, boolean forceConversion) {
        UnexpectedException codedException;
        ArrayList emptyList;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, Object>> entryIterator = jsMap.getEntryIterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Object> next = entryIterator.next();
            String key = next.getKey();
            DynamicFromObject dynamicFromObject = new DynamicFromObject(next.getValue());
            try {
                try {
                    linkedHashMap.put(key, this.valueConverter.convert(dynamicFromObject, context, forceConversion));
                    Unit unit = Unit.INSTANCE;
                    Unit unit2 = Unit.INSTANCE;
                } catch (Throwable th) {
                    if (th instanceof CodedException) {
                        codedException = (CodedException) th;
                    } else {
                        codedException = th instanceof expo.modules.core.errors.CodedException ? new CodedException(((expo.modules.core.errors.CodedException) th).getCode(), ((expo.modules.core.errors.CodedException) th).getMessage(), ((expo.modules.core.errors.CodedException) th).getCause()) : new UnexpectedException(th);
                    }
                    TypeDescriptor typeDescriptor = this.mapType;
                    TypeDescriptor typeDescriptor2 = this.mapType;
                    RawTypeDescriptor typeInfo = typeDescriptor2.getTypeInfo();
                    if (typeInfo instanceof RawTypeDescriptor.Simple) {
                        emptyList = CollectionsKt.emptyList();
                    } else {
                        if (!(typeInfo instanceof RawTypeDescriptor.Parameterized)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        List<RawTypeDescriptor> params = ((RawTypeDescriptor.Parameterized) typeDescriptor2.getTypeInfo()).getParams();
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(params, 10));
                        int i = 0;
                        for (Object obj : params) {
                            int i2 = i + 1;
                            if (i < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            arrayList.add(new TypeDescriptor((RawTypeDescriptor) obj, new TypeDescriptor$params$1$1(typeDescriptor2, i)));
                            i = i2;
                        }
                        emptyList = arrayList;
                    }
                    throw new CollectionElementCastException(typeDescriptor, (TypeDescriptor) emptyList.get(1), dynamicFromObject.getType(), codedException);
                }
            } finally {
                dynamicFromObject.recycle();
            }
        }
        return linkedHashMap;
    }

    @Override // expo.modules.kotlin.types.NonNullableTypeConverter, expo.modules.kotlin.types.TypeConverter
    /* renamed from: getCppRequiredTypes */
    public ExpectedType get$cppRequireType() {
        return ExpectedType.INSTANCE.forMap(this.valueConverter.get$cppRequireType());
    }

    @Override // expo.modules.kotlin.types.NonNullableTypeConverter, expo.modules.kotlin.types.TypeConverter
    public boolean isTrivial() {
        return this.valueConverter.isTrivial();
    }
}
