package f3;

import f3.AbstractC6409a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: f3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6412d extends AbstractC6409a {
    public /* synthetic */ C6412d(int i11) {
        this(AbstractC6409a.C0988a.f62496b);
    }

    @Override // f3.AbstractC6409a
    public final <T> T a(@NotNull AbstractC6409a.b<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (T) b().get(key);
    }

    public final <T> void c(@NotNull AbstractC6409a.b<T> key, T t2) {
        Intrinsics.checkNotNullParameter(key, "key");
        b().put(key, t2);
    }

    public C6412d(@NotNull AbstractC6409a initialExtras) {
        Intrinsics.checkNotNullParameter(initialExtras, "initialExtras");
        b().putAll(initialExtras.b());
    }
}
