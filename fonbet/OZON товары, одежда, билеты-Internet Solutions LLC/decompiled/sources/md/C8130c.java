package md;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.h;
import kotlin.reflect.m;
import kotlin.reflect.q;
import kotlin.reflect.w;
import nd.AbstractC8504A;
import nd.J0;
import nd.R0;
import nd.g1;
import org.jetbrains.annotations.NotNull;

/* renamed from: md.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8130c {
    public static final Field a(@NotNull m<?> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        J0<?> c11 = g1.c(mVar);
        if (c11 != null) {
            return c11.J();
        }
        return null;
    }

    public static final Method b(@NotNull h<?> hVar) {
        od.h<?> o11;
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        AbstractC8504A a11 = g1.a(hVar);
        Object b11 = (a11 == null || (o11 = a11.o()) == null) ? null : o11.b();
        if (b11 instanceof Method) {
            return (Method) b11;
        }
        return null;
    }

    @NotNull
    public static final Type c(@NotNull q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        Type f7 = ((R0) qVar).f();
        return f7 == null ? w.e(qVar) : f7;
    }
}
