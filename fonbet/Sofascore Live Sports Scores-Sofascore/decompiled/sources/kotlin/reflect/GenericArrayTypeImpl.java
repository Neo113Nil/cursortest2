package kotlin.reflect;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\bF\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\n\u0010\b\u001a\u00020\tH\u0096\u0080\u0004J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0082\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u0096\u0080\u0004J\n\u0010\u0010\u001a\u00020\tH\u0096\u0080\u0004R\u000f\u0010\u0003\u001a\u00020\u0004X\u0082\u0084\b¢\u0006\u0002\n\u0000Ê\u0001\u0002\b\u0012¨\u0006\u0011"}, d2 = {"Lkotlin/reflect/GenericArrayTypeImpl;", "Ljava/lang/reflect/GenericArrayType;", "Lkotlin/reflect/TypeImpl;", "elementType", "Ljava/lang/reflect/Type;", "<init>", "(Ljava/lang/reflect/Type;)V", "getGenericComponentType", "getTypeName", "", "equals", "", "other", "", "hashCode", "", "toString", "kotlin-stdlib", "Lkotlin/ExperimentalStdlibApi;"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes7.dex */
final class GenericArrayTypeImpl implements GenericArrayType, TypeImpl {

    @NotNull
    private final Type elementType;

    public GenericArrayTypeImpl(@NotNull Type type) {
        type.getClass();
        this.elementType = type;
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof GenericArrayType) && Intrinsics.c(getGenericComponentType(), ((GenericArrayType) other).getGenericComponentType());
    }

    @Override // java.lang.reflect.GenericArrayType
    @NotNull
    public Type getGenericComponentType() {
        return this.elementType;
    }

    @Override // java.lang.reflect.Type, kotlin.reflect.TypeImpl
    @NotNull
    public String getTypeName() {
        String typeToString;
        StringBuilder sb = new StringBuilder();
        typeToString = TypesJVMKt.typeToString(this.elementType);
        sb.append(typeToString);
        sb.append("[]");
        return sb.toString();
    }

    public int hashCode() {
        return getGenericComponentType().hashCode();
    }

    @NotNull
    public String toString() {
        return getTypeName();
    }
}
