package yd;

import java.util.Set;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Set<Class<?>> f106570a;

    static {
        Class[] elements = {Integer.class, Character.class, Byte.class, Long.class, Short.class, Boolean.class, Double.class, Float.class, int[].class, char[].class, byte[].class, long[].class, short[].class, boolean[].class, double[].class, float[].class, Class.class, String.class};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f106570a = C7705l.j0(elements);
    }
}
