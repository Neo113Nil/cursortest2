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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u0002*\b\b\u0002\u0010\u0004*\u00020\u0002*\b\b\u0003\u0010\u0005*\u00020\u00022 \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00050\u00070\u0006B\u0017\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u001c\u001a\u00020\u001dH\u0016J:\u0010\u001e\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00072\u0006\u0010\u001f\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020\u001dH\u0016J\b\u0010#\u001a\u00020\u0018H\u0016R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lexpo/modules/kotlin/types/EitherOfFourTypeConverter;", "FirstType", "", "SecondType", "ThirdType", "FourthType", "Lexpo/modules/kotlin/types/NonNullableTypeConverter;", "Lexpo/modules/kotlin/types/EitherOfFour;", "converterProvider", "Lexpo/modules/kotlin/types/TypeConverterProvider;", "eitherTypeDescriptor", "Lexpo/modules/kotlin/types/descriptors/TypeDescriptor;", "<init>", "(Lexpo/modules/kotlin/types/TypeConverterProvider;Lexpo/modules/kotlin/types/descriptors/TypeDescriptor;)V", "firstJavaType", "secondJavaType", "thirdJavaType", "fourthJavaType", "firstTypeConverter", "Lexpo/modules/kotlin/types/TypeConverter;", "secondTypeConverter", "thirdTypeConverter", "fourthTypeConverter", "firstType", "Lexpo/modules/kotlin/jni/ExpectedType;", "secondType", "thirdType", "fourthType", "isTrivial", "", "convertNonNullable", "value", "context", "Lexpo/modules/kotlin/AppContext;", "forceConversion", "getCppRequiredTypes", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class EitherOfFourTypeConverter<FirstType, SecondType, ThirdType, FourthType> extends NonNullableTypeConverter<EitherOfFour<FirstType, SecondType, ThirdType, FourthType>> {
    private final TypeDescriptor firstJavaType;
    private final ExpectedType firstType;
    private final TypeConverter<?> firstTypeConverter;
    private final TypeDescriptor fourthJavaType;
    private final ExpectedType fourthType;
    private final TypeConverter<?> fourthTypeConverter;
    private final TypeDescriptor secondJavaType;
    private final ExpectedType secondType;
    private final TypeConverter<?> secondTypeConverter;
    private final TypeDescriptor thirdJavaType;
    private final ExpectedType thirdType;
    private final TypeConverter<?> thirdTypeConverter;

    @Override // expo.modules.kotlin.types.NonNullableTypeConverter, expo.modules.kotlin.types.TypeConverter
    public boolean isTrivial() {
        return false;
    }

    public EitherOfFourTypeConverter(TypeConverterProvider converterProvider, TypeDescriptor eitherTypeDescriptor) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
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
            ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(params, 10));
            int i2 = 0;
            for (Object obj : params) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                arrayList5.add(new TypeDescriptor((RawTypeDescriptor) obj, new TypeDescriptor$params$1$1(eitherTypeDescriptor, i2)));
                i2 = i3;
            }
            arrayList = arrayList5;
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
            ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(params2, 10));
            int i4 = 0;
            for (Object obj2 : params2) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                arrayList6.add(new TypeDescriptor((RawTypeDescriptor) obj2, new TypeDescriptor$params$1$1(eitherTypeDescriptor, i4)));
                i4 = i5;
            }
            arrayList2 = arrayList6;
        }
        Object orNull2 = CollectionsKt.getOrNull(arrayList2, 1);
        if (orNull2 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        this.secondJavaType = (TypeDescriptor) orNull2;
        RawTypeDescriptor typeInfo3 = eitherTypeDescriptor.getTypeInfo();
        if (typeInfo3 instanceof RawTypeDescriptor.Simple) {
            arrayList3 = CollectionsKt.emptyList();
        } else {
            if (!(typeInfo3 instanceof RawTypeDescriptor.Parameterized)) {
                throw new NoWhenBranchMatchedException();
            }
            List<RawTypeDescriptor> params3 = ((RawTypeDescriptor.Parameterized) eitherTypeDescriptor.getTypeInfo()).getParams();
            ArrayList arrayList7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(params3, 10));
            int i6 = 0;
            for (Object obj3 : params3) {
                int i7 = i6 + 1;
                if (i6 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                arrayList7.add(new TypeDescriptor((RawTypeDescriptor) obj3, new TypeDescriptor$params$1$1(eitherTypeDescriptor, i6)));
                i6 = i7;
            }
            arrayList3 = arrayList7;
        }
        Object orNull3 = CollectionsKt.getOrNull(arrayList3, 2);
        if (orNull3 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        this.thirdJavaType = (TypeDescriptor) orNull3;
        RawTypeDescriptor typeInfo4 = eitherTypeDescriptor.getTypeInfo();
        if (typeInfo4 instanceof RawTypeDescriptor.Simple) {
            arrayList4 = CollectionsKt.emptyList();
        } else {
            if (!(typeInfo4 instanceof RawTypeDescriptor.Parameterized)) {
                throw new NoWhenBranchMatchedException();
            }
            List<RawTypeDescriptor> params4 = ((RawTypeDescriptor.Parameterized) eitherTypeDescriptor.getTypeInfo()).getParams();
            ArrayList arrayList8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(params4, 10));
            for (Object obj4 : params4) {
                int i8 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                arrayList8.add(new TypeDescriptor((RawTypeDescriptor) obj4, new TypeDescriptor$params$1$1(eitherTypeDescriptor, i)));
                i = i8;
            }
            arrayList4 = arrayList8;
        }
        Object orNull4 = CollectionsKt.getOrNull(arrayList4, 3);
        if (orNull4 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        TypeDescriptor typeDescriptor = (TypeDescriptor) orNull4;
        this.fourthJavaType = typeDescriptor;
        TypeConverter<?> obtainTypeConverter = converterProvider.obtainTypeConverter(this.firstJavaType);
        this.firstTypeConverter = obtainTypeConverter;
        TypeConverter<?> obtainTypeConverter2 = converterProvider.obtainTypeConverter(this.secondJavaType);
        this.secondTypeConverter = obtainTypeConverter2;
        TypeConverter<?> obtainTypeConverter3 = converterProvider.obtainTypeConverter(this.thirdJavaType);
        this.thirdTypeConverter = obtainTypeConverter3;
        TypeConverter<?> obtainTypeConverter4 = converterProvider.obtainTypeConverter(typeDescriptor);
        this.fourthTypeConverter = obtainTypeConverter4;
        this.firstType = obtainTypeConverter.get$cppRequireType();
        this.secondType = obtainTypeConverter2.get$cppRequireType();
        this.thirdType = obtainTypeConverter3.get$cppRequireType();
        this.fourthType = obtainTypeConverter4.get$cppRequireType();
    }

    @Override // expo.modules.kotlin.types.NonNullableTypeConverter
    public EitherOfFour<FirstType, SecondType, ThirdType, FourthType> convertNonNullable(Object value, AppContext context, boolean forceConversion) {
        List createDeferredValues;
        Intrinsics.checkNotNullParameter(value, "value");
        List listOf = CollectionsKt.listOf((Object[]) new TypeDescriptor[]{this.firstJavaType, this.secondJavaType, this.thirdJavaType, this.fourthJavaType});
        createDeferredValues = EitherTypeConverterKt.createDeferredValues(value, context, CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(this.firstType, this.firstTypeConverter), TuplesKt.to(this.secondType, this.secondTypeConverter), TuplesKt.to(this.thirdType, this.thirdTypeConverter), TuplesKt.to(this.fourthType, this.fourthTypeConverter)}), CollectionsKt.listOf((Object[]) new TypeDescriptor[]{this.firstJavaType, this.secondJavaType, this.thirdJavaType, this.fourthJavaType}));
        return new EitherOfFour<>(value, CollectionsKt.toMutableList((Collection) createDeferredValues), listOf);
    }

    @Override // expo.modules.kotlin.types.NonNullableTypeConverter, expo.modules.kotlin.types.TypeConverter
    /* renamed from: getCppRequiredTypes */
    public ExpectedType get$cppRequireType() {
        return ExpectedType.INSTANCE.merge(this.firstType, this.secondType, this.thirdType, this.fourthType);
    }
}
