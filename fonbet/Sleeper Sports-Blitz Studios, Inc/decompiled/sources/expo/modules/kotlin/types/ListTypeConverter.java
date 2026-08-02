package expo.modules.kotlin.types;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
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
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* compiled from: ListTypeConverter.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J&\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\f\u001a\u00020\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J&\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0011H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lexpo/modules/kotlin/types/ListTypeConverter;", "Lexpo/modules/kotlin/types/DynamicAwareTypeConverters;", "", "converterProvider", "Lexpo/modules/kotlin/types/TypeConverterProvider;", "listType", "Lexpo/modules/kotlin/types/descriptors/TypeDescriptor;", "<init>", "(Lexpo/modules/kotlin/types/TypeConverterProvider;Lexpo/modules/kotlin/types/descriptors/TypeDescriptor;)V", "elementConverter", "Lexpo/modules/kotlin/types/TypeConverter;", "convertFromDynamic", "value", "Lcom/facebook/react/bridge/Dynamic;", "context", "Lexpo/modules/kotlin/AppContext;", "forceConversion", "", "convertFromAny", "", "convertFromReadableArray", "jsArray", "Lcom/facebook/react/bridge/ReadableArray;", "getCppRequiredTypes", "Lexpo/modules/kotlin/jni/ExpectedType;", "isTrivial", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ListTypeConverter extends DynamicAwareTypeConverters<List<?>> {
    private final TypeConverter<?> elementConverter;
    private final TypeDescriptor listType;

    public ListTypeConverter(TypeConverterProvider converterProvider, TypeDescriptor listType) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(converterProvider, "converterProvider");
        Intrinsics.checkNotNullParameter(listType, "listType");
        this.listType = listType;
        RawTypeDescriptor typeInfo = listType.getTypeInfo();
        if (typeInfo instanceof RawTypeDescriptor.Simple) {
            arrayList = CollectionsKt.emptyList();
        } else {
            if (!(typeInfo instanceof RawTypeDescriptor.Parameterized)) {
                throw new NoWhenBranchMatchedException();
            }
            List<RawTypeDescriptor> params = ((RawTypeDescriptor.Parameterized) listType.getTypeInfo()).getParams();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(params, 10));
            int i = 0;
            for (Object obj : params) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                arrayList2.add(new TypeDescriptor((RawTypeDescriptor) obj, new TypeDescriptor$params$1$1(listType, i)));
                i = i2;
            }
            arrayList = arrayList2;
        }
        Object first = CollectionsKt.first((List<? extends Object>) arrayList);
        if (first != null) {
            this.elementConverter = converterProvider.obtainTypeConverter((TypeDescriptor) first);
            return;
        }
        throw new IllegalArgumentException("The list type should contain the type of elements.".toString());
    }

    @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
    public List<?> convertFromDynamic(Dynamic value, AppContext context, boolean forceConversion) {
        UnexpectedException unexpectedException;
        ArrayList emptyList;
        Intrinsics.checkNotNullParameter(value, "value");
        if (value.getType() != ReadableType.Array) {
            try {
                return CollectionsKt.listOf(this.elementConverter.convert(value, context, forceConversion));
            } catch (Throwable th) {
                if (th instanceof CodedException) {
                    unexpectedException = (CodedException) th;
                } else if (th instanceof expo.modules.core.errors.CodedException) {
                    expo.modules.core.errors.CodedException codedException = (expo.modules.core.errors.CodedException) th;
                    unexpectedException = new CodedException(codedException.getCode(), codedException.getMessage(), codedException.getCause());
                } else {
                    unexpectedException = new UnexpectedException(th);
                }
                TypeDescriptor typeDescriptor = this.listType;
                TypeDescriptor typeDescriptor2 = this.listType;
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
                throw new CollectionElementCastException(typeDescriptor, (TypeDescriptor) CollectionsKt.first(emptyList), (KClass<?>) Reflection.getOrCreateKotlinClass(value.getClass()), unexpectedException);
            }
        }
        ReadableArray asArray = value.asArray();
        if (asArray == null) {
            throw new DynamicCastException(Reflection.getOrCreateKotlinClass(ReadableArray.class));
        }
        return convertFromReadableArray(asArray, context, forceConversion);
    }

    @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
    public List<?> convertFromAny(Object value, AppContext context, boolean forceConversion) {
        UnexpectedException unexpectedException;
        ArrayList emptyList;
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.elementConverter.isTrivial() && !forceConversion) {
            return (List) value;
        }
        List list = (List) value;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (Object obj : list) {
            try {
                arrayList.add(this.elementConverter.convert(obj, context, forceConversion));
            } catch (Throwable th) {
                if (th instanceof CodedException) {
                    unexpectedException = (CodedException) th;
                } else if (th instanceof expo.modules.core.errors.CodedException) {
                    expo.modules.core.errors.CodedException codedException = (expo.modules.core.errors.CodedException) th;
                    unexpectedException = new CodedException(codedException.getCode(), codedException.getMessage(), codedException.getCause());
                } else {
                    unexpectedException = new UnexpectedException(th);
                }
                TypeDescriptor typeDescriptor = this.listType;
                TypeDescriptor typeDescriptor2 = this.listType;
                RawTypeDescriptor typeInfo = typeDescriptor2.getTypeInfo();
                if (typeInfo instanceof RawTypeDescriptor.Simple) {
                    emptyList = CollectionsKt.emptyList();
                } else {
                    if (!(typeInfo instanceof RawTypeDescriptor.Parameterized)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    List<RawTypeDescriptor> params = ((RawTypeDescriptor.Parameterized) typeDescriptor2.getTypeInfo()).getParams();
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(params, 10));
                    int i = 0;
                    for (Object obj2 : params) {
                        int i2 = i + 1;
                        if (i < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        arrayList2.add(new TypeDescriptor((RawTypeDescriptor) obj2, new TypeDescriptor$params$1$1(typeDescriptor2, i)));
                        i = i2;
                    }
                    emptyList = arrayList2;
                }
                TypeDescriptor typeDescriptor3 = (TypeDescriptor) CollectionsKt.first(emptyList);
                Intrinsics.checkNotNull(obj);
                throw new CollectionElementCastException(typeDescriptor, typeDescriptor3, (KClass<?>) Reflection.getOrCreateKotlinClass(obj.getClass()), unexpectedException);
            }
        }
        return arrayList;
    }

    private final List<?> convertFromReadableArray(ReadableArray jsArray, AppContext context, boolean forceConversion) {
        UnexpectedException codedException;
        ArrayList emptyList;
        int size = jsArray.size();
        ArrayList arrayList = new ArrayList(size);
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Dynamic dynamic = jsArray.getDynamic(i2);
            try {
                Object convert = this.elementConverter.convert(dynamic, context, forceConversion);
                dynamic.recycle();
                arrayList.add(convert);
            } catch (Throwable th) {
                try {
                    if (th instanceof CodedException) {
                        codedException = (CodedException) th;
                    } else {
                        codedException = th instanceof expo.modules.core.errors.CodedException ? new CodedException(((expo.modules.core.errors.CodedException) th).getCode(), ((expo.modules.core.errors.CodedException) th).getMessage(), ((expo.modules.core.errors.CodedException) th).getCause()) : new UnexpectedException(th);
                    }
                    TypeDescriptor typeDescriptor = this.listType;
                    TypeDescriptor typeDescriptor2 = this.listType;
                    RawTypeDescriptor typeInfo = typeDescriptor2.getTypeInfo();
                    if (typeInfo instanceof RawTypeDescriptor.Simple) {
                        emptyList = CollectionsKt.emptyList();
                    } else {
                        if (!(typeInfo instanceof RawTypeDescriptor.Parameterized)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        List<RawTypeDescriptor> params = ((RawTypeDescriptor.Parameterized) typeDescriptor2.getTypeInfo()).getParams();
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(params, 10));
                        for (Object obj : params) {
                            int i3 = i + 1;
                            if (i < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            arrayList2.add(new TypeDescriptor((RawTypeDescriptor) obj, new TypeDescriptor$params$1$1(typeDescriptor2, i)));
                            i = i3;
                        }
                        emptyList = arrayList2;
                    }
                    throw new CollectionElementCastException(typeDescriptor, (TypeDescriptor) CollectionsKt.first(emptyList), dynamic.getType(), codedException);
                } catch (Throwable th2) {
                    dynamic.recycle();
                    throw th2;
                }
            }
        }
        return arrayList;
    }

    @Override // expo.modules.kotlin.types.NonNullableTypeConverter, expo.modules.kotlin.types.TypeConverter
    /* renamed from: getCppRequiredTypes */
    public ExpectedType get$cppRequireType() {
        return ExpectedType.INSTANCE.forList(this.elementConverter.get$cppRequireType());
    }

    @Override // expo.modules.kotlin.types.NonNullableTypeConverter, expo.modules.kotlin.types.TypeConverter
    public boolean isTrivial() {
        return this.elementConverter.isTrivial();
    }
}
