package f3;

import androidx.lifecycle.w0;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: f3.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6411c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f62498a = new LinkedHashMap();

    public final <T extends w0> void a(@NotNull kotlin.reflect.d<T> clazz, @NotNull Function1<? super AbstractC6409a, ? extends T> initializer) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        LinkedHashMap linkedHashMap = this.f62498a;
        if (!linkedHashMap.containsKey(clazz)) {
            linkedHashMap.put(clazz, new C6413e(clazz, initializer));
            return;
        }
        StringBuilder sb2 = new StringBuilder("A `initializer` with the same `clazz` has already been added: ");
        Intrinsics.checkNotNullParameter(clazz, "<this>");
        sb2.append(clazz.u());
        sb2.append('.');
        throw new IllegalArgumentException(sb2.toString().toString());
    }

    @NotNull
    public final C6410b b() {
        Collection initializers = this.f62498a.values();
        Intrinsics.checkNotNullParameter(initializers, "initializers");
        C6413e[] c6413eArr = (C6413e[]) initializers.toArray(new C6413e[0]);
        return new C6410b((C6413e[]) Arrays.copyOf(c6413eArr, c6413eArr.length));
    }
}
