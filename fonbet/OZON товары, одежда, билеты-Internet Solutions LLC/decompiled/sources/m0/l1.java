package m0;

import java.util.Map;
import k1.C7460f;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class l1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Object f73820a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f73821b = 0;

    static {
        Float valueOf = Float.valueOf(0.5f);
        new C7460f(0.5f, 0.5f, 0.5f, 0.5f);
        U0 c11 = W0.c();
        Float valueOf2 = Float.valueOf(1.0f);
        f73820a = kotlin.collections.U.j(new Pair(c11, valueOf2), new Pair(W0.j(), valueOf2), new Pair(W0.i(), valueOf2), new Pair(W0.b(), Float.valueOf(0.01f)), new Pair(W0.d(), valueOf), new Pair(W0.g(), valueOf), new Pair(W0.h(), valueOf), new Pair(W0.e(), Float.valueOf(0.1f)), new Pair(W0.f(), Float.valueOf(0.1f)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map<m0.U0<?, ?>, java.lang.Float>] */
    @NotNull
    public static final Map<U0<?, ?>, Float> a() {
        return f73820a;
    }
}
