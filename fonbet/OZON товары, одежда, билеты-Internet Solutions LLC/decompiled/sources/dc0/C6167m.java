package dc0;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.C7705l;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: dc0.m, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6167m {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Set<String> f61563a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Set<String> f61564b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final LinkedHashSet f61565c;

    static {
        String[] elements = {"__Secure-access-token", "__Secure-refresh-token", "__Secure-user-id", "__Secure-ab-group"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set<String> j02 = C7705l.j0(elements);
        f61563a = j02;
        String[] elements2 = {"__Secure-idp-user-id", "__Secure-idp-token", "__Secure-product-user-id", "__Secure-token", "__Secure-sid"};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        Set<String> j03 = C7705l.j0(elements2);
        f61564b = j03;
        f61565c = e0.f(j02, j03);
    }

    @NotNull
    public static final LinkedHashSet a() {
        return f61565c;
    }

    @NotNull
    public static final Set<String> b() {
        return f61563a;
    }

    @NotNull
    public static final Set<String> c() {
        return f61564b;
    }
}
