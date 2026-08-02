package kotlin.reflect.jvm.internal;

import defpackage.joa;
import defpackage.ph0;
import defpackage.sw9;
import defpackage.xka;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<no name provided>", "Ljava/lang/reflect/Type;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class KTypeImpl$arguments$2$1$type$1 extends xka implements Function0<Type> {
    final /* synthetic */ int $i;
    final /* synthetic */ joa $parameterizedTypeArguments$delegate;
    final /* synthetic */ KTypeImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KTypeImpl$arguments$2$1$type$1(KTypeImpl kTypeImpl, int i, joa joaVar) {
        super(0);
        this.this$0 = kTypeImpl;
        this.$i = i;
        this.$parameterizedTypeArguments$delegate = joaVar;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Type invoke() {
        List invoke$lambda$0;
        Type javaType = this.this$0.getJavaType();
        if (javaType instanceof Class) {
            Class cls = (Class) javaType;
            Class componentType = cls.isArray() ? cls.getComponentType() : Object.class;
            componentType.getClass();
            return componentType;
        }
        if (javaType instanceof GenericArrayType) {
            if (this.$i != 0) {
                sw9.s(this.this$0, "Array type has been queried for a non-0th argument: ");
                return null;
            }
            Type genericComponentType = ((GenericArrayType) javaType).getGenericComponentType();
            genericComponentType.getClass();
            return genericComponentType;
        }
        if (!(javaType instanceof ParameterizedType)) {
            sw9.s(this.this$0, "Non-generic type has been queried for arguments: ");
            return null;
        }
        invoke$lambda$0 = KTypeImpl$arguments$2.invoke$lambda$0(this.$parameterizedTypeArguments$delegate);
        Type type = (Type) invoke$lambda$0.get(this.$i);
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            lowerBounds.getClass();
            Type type2 = (Type) ph0.A(lowerBounds);
            if (type2 == null) {
                Type[] upperBounds = wildcardType.getUpperBounds();
                upperBounds.getClass();
                type = (Type) ph0.z(upperBounds);
            } else {
                type = type2;
            }
        }
        type.getClass();
        return type;
    }
}
