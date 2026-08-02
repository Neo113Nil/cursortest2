package zd;

import Jd.InterfaceC3391a;
import ae.EnumC5003e;
import java.lang.reflect.Type;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: zd.F, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C11098F extends H implements Jd.u {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Class<?> f108803a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final kotlin.collections.K f108804b;

    public C11098F(@NotNull Class<?> reflectType) {
        Intrinsics.checkNotNullParameter(reflectType, "reflectType");
        this.f108803a = reflectType;
        this.f108804b = kotlin.collections.K.f71697a;
    }

    @Override // zd.H
    public final Type I() {
        return this.f108803a;
    }

    @Override // Jd.d
    @NotNull
    public final Collection<InterfaceC3391a> getAnnotations() {
        return this.f108804b;
    }

    @Override // Jd.u
    public final qd.p getType() {
        Class cls = Void.TYPE;
        Class<?> cls2 = this.f108803a;
        if (Intrinsics.d(cls2, cls)) {
            return null;
        }
        return EnumC5003e.b(cls2.getName()).g();
    }
}
