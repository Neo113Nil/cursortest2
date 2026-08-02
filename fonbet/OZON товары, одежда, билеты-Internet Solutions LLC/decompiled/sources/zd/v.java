package zd;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.WildcardType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class v extends AbstractC11106h implements Jd.h {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Class<?> f108848b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Sd.f fVar, @NotNull Class<?> klass) {
        super(fVar);
        Intrinsics.checkNotNullParameter(klass, "klass");
        this.f108848b = klass;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Jd.h
    @NotNull
    public final H c() {
        Class<?> type = this.f108848b;
        Intrinsics.checkNotNullParameter(type, "type");
        return type.isPrimitive() ? new C11098F(type) : ((type instanceof GenericArrayType) || type.isArray()) ? new l(type) : type instanceof WildcardType ? new K((WildcardType) type) : new w(type);
    }
}
