package expo.modules.kotlin.types;

import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.types.descriptors.RawTypeDescriptor;
import expo.modules.kotlin.types.descriptors.TypeDescriptor;
import expo.modules.kotlin.types.descriptors.TypeDescriptor$params$1$1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EitherTypeConverter.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00050\u0004B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ.\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010\u0015\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0012H\u0016J\b\u0010\u001b\u001a\u00020\u0019H\u0016R\u000e\u0010\f\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lexpo/modules/kotlin/types/EitherTypeConverter;", "FirstType", "", "SecondType", "Lexpo/modules/kotlin/types/NonNullableTypeConverter;", "Lexpo/modules/kotlin/types/Either;", "converterProvider", "Lexpo/modules/kotlin/types/TypeConverterProvider;", "eitherTypeDescriptor", "Lexpo/modules/kotlin/types/descriptors/TypeDescriptor;", "<init>", "(Lexpo/modules/kotlin/types/TypeConverterProvider;Lexpo/modules/kotlin/types/descriptors/TypeDescriptor;)V", "firstJavaType", "secondJavaType", "firstTypeConverter", "Lexpo/modules/kotlin/types/TypeConverter;", "secondTypeConverter", "firstType", "Lexpo/modules/kotlin/jni/ExpectedType;", "secondType", "convertNonNullable", "value", "context", "Lexpo/modules/kotlin/AppContext;", "forceConversion", "", "getCppRequiredTypes", "isTrivial", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class EitherTypeConverter<FirstType, SecondType> extends NonNullableTypeConverter<Either<FirstType, SecondType>> {
    private final TypeDescriptor firstJavaType;
    private final ExpectedType firstType;
    private final TypeConverter<?> firstTypeConverter;
    private final TypeDescriptor secondJavaType;
    private final ExpectedType secondType;
    private final TypeConverter<?> secondTypeConverter;

    @Override // expo.modules.kotlin.types.NonNullableTypeConverter, expo.modules.kotlin.types.TypeConverter
    public boolean isTrivial() {
        return false;
    }

    public EitherTypeConverter(TypeConverterProvider converterProvider, TypeDescriptor eitherTypeDescriptor) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Intrinsics.checkNotNullParameter(converterProvider, "converterProvider");
        Intrinsics.checkNotNullParameter(eitherTypeDescriptor, "eitherTypeDescriptor");
        RawTypeDescriptor typeInfo = eitherTypeDescriptor.getTypeInfo();
        int i = 0;
        if (typeInfo instanceof RawTypeDescriptor.Simple) {
            arrayList = CollectionsKt.emptyList();
        } else {
            if (!(typeInfo instanceof RawTypeDescriptor.Parameterized)) {
                throw new NoWhenBranchMatchedException();
            }
            List<RawTypeDescriptor> params = ((RawTypeDescriptor.Parameterized) eitherTypeDescriptor.getTypeInfo()).getParams();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(params, 10));
            int i2 = 0;
            for (Object obj : params) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                arrayList3.add(new TypeDescriptor((RawTypeDescriptor) obj, new TypeDescriptor$params$1$1(eitherTypeDescriptor, i2)));
                i2 = i3;
            }
            arrayList = arrayList3;
        }
        Object orNull = CollectionsKt.getOrNull(arrayList, 0);
        if (orNull == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        this.firstJavaType = (TypeDescriptor) orNull;
        RawTypeDescriptor typeInfo2 = eitherTypeDescriptor.getTypeInfo();
        if (typeInfo2 instanceof RawTypeDescriptor.Simple) {
            arrayList2 = CollectionsKt.emptyList();
        } else {
            if (!(typeInfo2 instanceof RawTypeDescriptor.Parameterized)) {
                throw new NoWhenBranchMatchedException();
            }
            List<RawTypeDescriptor> params2 = ((RawTypeDescriptor.Parameterized) eitherTypeDescriptor.getTypeInfo()).getParams();
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(params2, 10));
            for (Object obj2 : params2) {
                int i4 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                arrayList4.add(new TypeDescriptor((RawTypeDescriptor) obj2, new TypeDescriptor$params$1$1(eitherTypeDescriptor, i)));
                i = i4;
            }
            arrayList2 = arrayList4;
        }
        Object orNull2 = CollectionsKt.getOrNull(arrayList2, 1);
        if (orNull2 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        TypeDescriptor typeDescriptor = (TypeDescriptor) orNull2;
        this.secondJavaType = typeDescriptor;
        TypeConverter<?> obtainTypeConverter = converterProvider.obtainTypeConverter(this.firstJavaType);
        this.firstTypeConverter = obtainTypeConverter;
        TypeConverter<?> obtainTypeConverter2 = converterProvider.obtainTypeConverter(typeDescriptor);
        this.secondTypeConverter = obtainTypeConverter2;
        this.firstType = obtainTypeConverter.get$cppRequireType();
        this.secondType = obtainTypeConverter2.get$cppRequireType();
    }

    @Override // expo.modules.kotlin.types.NonNullableTypeConverter
    public Either<FirstType, SecondType> convertNonNullable(Object value, AppContext context, boolean forceConversion) {
        List createDeferredValues;
        Intrinsics.checkNotNullParameter(value, "value");
        List listOf = CollectionsKt.listOf((Object[]) new TypeDescriptor[]{this.firstJavaType, this.secondJavaType});
        createDeferredValues = EitherTypeConverterKt.createDeferredValues(value, context, CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(this.firstType, this.firstTypeConverter), TuplesKt.to(this.secondType, this.secondTypeConverter)}), listOf);
        return new Either<>(value, CollectionsKt.toMutableList((Collection) createDeferredValues), listOf);
    }

    @Override // expo.modules.kotlin.types.NonNullableTypeConverter, expo.modules.kotlin.types.TypeConverter
    /* renamed from: getCppRequiredTypes */
    public ExpectedType get$cppRequireType() {
        return ExpectedType.INSTANCE.merge(this.firstType, this.secondType);
    }
}
