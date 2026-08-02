package zd;

import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: zd.A, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C11093A extends AbstractC11095C implements Jd.n {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Field f108799a;

    public C11093A(@NotNull Field member) {
        Intrinsics.checkNotNullParameter(member, "member");
        this.f108799a = member;
    }

    @Override // Jd.n
    public final boolean E() {
        return this.f108799a.isEnumConstant();
    }

    @Override // zd.AbstractC11095C
    public final Member I() {
        return this.f108799a;
    }

    @NotNull
    public final Field K() {
        return this.f108799a;
    }

    @Override // Jd.n
    public final Jd.w getType() {
        Type type = this.f108799a.getGenericType();
        Intrinsics.checkNotNullExpressionValue(type, "getGenericType(...)");
        Intrinsics.checkNotNullParameter(type, "type");
        boolean z11 = type instanceof Class;
        if (z11) {
            Class cls = (Class) type;
            if (cls.isPrimitive()) {
                return new C11098F(cls);
            }
        }
        return ((type instanceof GenericArrayType) || (z11 && ((Class) type).isArray())) ? new l(type) : type instanceof WildcardType ? new K((WildcardType) type) : new w(type);
    }
}
