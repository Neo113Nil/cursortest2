package expo.modules.kotlin.types;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.CollectionElementCastException;
import expo.modules.kotlin.exception.DynamicCastException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.CppType;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.SingleType;
import expo.modules.kotlin.types.descriptors.RawTypeDescriptor;
import expo.modules.kotlin.types.descriptors.TypeDescriptor;
import expo.modules.kotlin.types.descriptors.TypeDescriptor$params$1$1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* compiled from: PairTypeConverter.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\r\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J*\u0010\u0014\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00022\u0006\u0010\u000e\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J*\u0010\u0015\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00022\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J,\u0010\u0018\u001a\u0004\u0018\u00010\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0013H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lexpo/modules/kotlin/types/PairTypeConverter;", "Lexpo/modules/kotlin/types/DynamicAwareTypeConverters;", "Lkotlin/Pair;", "converterProvider", "Lexpo/modules/kotlin/types/TypeConverterProvider;", "pairType", "Lexpo/modules/kotlin/types/descriptors/TypeDescriptor;", "<init>", "(Lexpo/modules/kotlin/types/TypeConverterProvider;Lexpo/modules/kotlin/types/descriptors/TypeDescriptor;)V", "converters", "", "Lexpo/modules/kotlin/types/TypeConverter;", "", "convertFromDynamic", "value", "Lcom/facebook/react/bridge/Dynamic;", "context", "Lexpo/modules/kotlin/AppContext;", "forceConversion", "", "convertFromAny", "convertFromReadableArray", "jsArray", "Lcom/facebook/react/bridge/ReadableArray;", "convertElement", "array", "index", "", "getCppRequiredTypes", "Lexpo/modules/kotlin/jni/ExpectedType;", "isTrivial", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class PairTypeConverter extends DynamicAwareTypeConverters<Pair<?, ?>> {
    private final List<TypeConverter<? extends Object>> converters;
    private final TypeDescriptor pairType;

    @Override // expo.modules.kotlin.types.NonNullableTypeConverter, expo.modules.kotlin.types.TypeConverter
    public boolean isTrivial() {
        return false;
    }

    public PairTypeConverter(TypeConverterProvider converterProvider, TypeDescriptor pairType) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Intrinsics.checkNotNullParameter(converterProvider, "converterProvider");
        Intrinsics.checkNotNullParameter(pairType, "pairType");
        this.pairType = pairType;
        TypeConverter[] typeConverterArr = new TypeConverter[2];
        RawTypeDescriptor typeInfo = pairType.getTypeInfo();
        int i = 0;
        if (typeInfo instanceof RawTypeDescriptor.Simple) {
            arrayList = CollectionsKt.emptyList();
        } else {
            if (!(typeInfo instanceof RawTypeDescriptor.Parameterized)) {
                throw new NoWhenBranchMatchedException();
            }
            List<RawTypeDescriptor> params = ((RawTypeDescriptor.Parameterized) pairType.getTypeInfo()).getParams();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(params, 10));
            int i2 = 0;
            for (Object obj : params) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                arrayList3.add(new TypeDescriptor((RawTypeDescriptor) obj, new TypeDescriptor$params$1$1(pairType, i2)));
                i2 = i3;
            }
            arrayList = arrayList3;
        }
        Object orNull = CollectionsKt.getOrNull(arrayList, 0);
        if (orNull != null) {
            typeConverterArr[0] = converterProvider.obtainTypeConverter((TypeDescriptor) orNull);
            TypeDescriptor typeDescriptor = this.pairType;
            RawTypeDescriptor typeInfo2 = typeDescriptor.getTypeInfo();
            if (typeInfo2 instanceof RawTypeDescriptor.Simple) {
                arrayList2 = CollectionsKt.emptyList();
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
                arrayList2 = arrayList4;
            }
            Object orNull2 = CollectionsKt.getOrNull(arrayList2, 1);
            if (orNull2 != null) {
                typeConverterArr[1] = converterProvider.obtainTypeConverter((TypeDescriptor) orNull2);
                this.converters = CollectionsKt.listOf((Object[]) typeConverterArr);
                return;
            }
            throw new IllegalArgumentException("The pair type should contain the type of the second parameter.".toString());
        }
        throw new IllegalArgumentException("The pair type should contain the type of the first parameter.".toString());
    }

    @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
    public Pair<?, ?> convertFromDynamic(Dynamic value, AppContext context, boolean forceConversion) {
        Intrinsics.checkNotNullParameter(value, "value");
        ReadableArray asArray = value.asArray();
        if (asArray == null) {
            throw new DynamicCastException(Reflection.getOrCreateKotlinClass(ReadableArray.class));
        }
        return convertFromReadableArray(asArray, context, forceConversion);
    }

    @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
    public Pair<?, ?> convertFromAny(Object value, AppContext context, boolean forceConversion) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof ReadableArray) {
            return convertFromReadableArray((ReadableArray) value, context, forceConversion);
        }
        return (Pair) value;
    }

    private final Pair<?, ?> convertFromReadableArray(ReadableArray jsArray, AppContext context, boolean forceConversion) {
        return new Pair<>(convertElement(context, jsArray, 0, forceConversion), convertElement(context, jsArray, 1, forceConversion));
    }

    private final Object convertElement(AppContext context, ReadableArray array, int index, boolean forceConversion) {
        UnexpectedException codedException;
        ArrayList emptyList;
        Dynamic dynamic = array.getDynamic(index);
        try {
            return ((TypeConverter) this.converters.get(index)).convert(dynamic, context, forceConversion);
        } catch (Throwable th) {
            try {
                if (th instanceof CodedException) {
                    codedException = (CodedException) th;
                } else {
                    codedException = th instanceof expo.modules.core.errors.CodedException ? new CodedException(((expo.modules.core.errors.CodedException) th).getCode(), ((expo.modules.core.errors.CodedException) th).getMessage(), ((expo.modules.core.errors.CodedException) th).getCause()) : new UnexpectedException(th);
                }
                TypeDescriptor typeDescriptor = this.pairType;
                TypeDescriptor typeDescriptor2 = this.pairType;
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
                throw new CollectionElementCastException(typeDescriptor, (TypeDescriptor) emptyList.get(index), dynamic.getType(), codedException);
            } finally {
                dynamic.recycle();
            }
        }
    }

    @Override // expo.modules.kotlin.types.NonNullableTypeConverter, expo.modules.kotlin.types.TypeConverter
    /* renamed from: getCppRequiredTypes */
    public ExpectedType get$cppRequireType() {
        return new ExpectedType(new SingleType(CppType.READABLE_ARRAY, null, 2, null));
    }
}
