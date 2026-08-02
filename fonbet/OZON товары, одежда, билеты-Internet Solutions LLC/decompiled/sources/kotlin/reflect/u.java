package kotlin.reflect;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.C7712t;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
final class u implements ParameterizedType, Type {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Class<?> f71857a;

    /* renamed from: b, reason: collision with root package name */
    private final Type f71858b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Type[] f71859c;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class a extends C7735q implements Function1<Type, String> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f71860a = new a();

        a() {
            super(1, w.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(Type type) {
            Type p02 = type;
            Intrinsics.checkNotNullParameter(p02, "p0");
            return w.b(p02);
        }
    }

    public u(@NotNull Class rawType, Type type, @NotNull ArrayList typeArguments) {
        Intrinsics.checkNotNullParameter(rawType, "rawType");
        Intrinsics.checkNotNullParameter(typeArguments, "typeArguments");
        this.f71857a = rawType;
        this.f71858b = type;
        this.f71859c = (Type[]) typeArguments.toArray(new Type[0]);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ParameterizedType)) {
            return false;
        }
        ParameterizedType parameterizedType = (ParameterizedType) obj;
        if (Intrinsics.d(this.f71857a, parameterizedType.getRawType()) && Intrinsics.d(this.f71858b, parameterizedType.getOwnerType())) {
            return Arrays.equals(this.f71859c, parameterizedType.getActualTypeArguments());
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    @NotNull
    public final Type[] getActualTypeArguments() {
        return this.f71859c;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f71858b;
    }

    @Override // java.lang.reflect.ParameterizedType
    @NotNull
    public final Type getRawType() {
        return this.f71857a;
    }

    @Override // java.lang.reflect.Type
    @NotNull
    public final String getTypeName() {
        StringBuilder sb2 = new StringBuilder();
        Class<?> cls = this.f71857a;
        Type type = this.f71858b;
        if (type != null) {
            sb2.append(w.b(type));
            sb2.append("$");
            sb2.append(cls.getSimpleName());
        } else {
            sb2.append(w.b(cls));
        }
        Type[] typeArr = this.f71859c;
        if (typeArr.length != 0) {
            C7712t.b(typeArr, sb2, ", ", "<", ">", a.f71860a);
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    public final int hashCode() {
        int hashCode = this.f71857a.hashCode();
        Type type = this.f71858b;
        return (hashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(this.f71859c);
    }

    @NotNull
    public final String toString() {
        return getTypeName();
    }
}
