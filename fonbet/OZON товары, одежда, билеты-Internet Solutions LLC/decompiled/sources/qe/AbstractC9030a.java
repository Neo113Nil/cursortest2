package qe;

import gd.InterfaceC6712a;
import java.util.Iterator;
import je.AbstractC7393m0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: qe.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9030a<K, V> implements Iterable<V>, InterfaceC6712a {

    /* renamed from: qe.a$a, reason: collision with other inner class name */
    /* loaded from: classes10.dex */
    public static abstract class AbstractC1384a<K, V, T extends V> {

        /* renamed from: a, reason: collision with root package name */
        private final int f81945a;

        public AbstractC1384a(int i11) {
            this.f81945a = i11;
        }

        protected final T a(@NotNull AbstractC9030a<K, V> thisRef) {
            Intrinsics.checkNotNullParameter(thisRef, "thisRef");
            return thisRef.b().get(this.f81945a);
        }
    }

    @NotNull
    protected abstract AbstractC9032c<V> b();

    protected abstract void c(@NotNull String str, @NotNull AbstractC7393m0 abstractC7393m0);

    protected final void e(@NotNull kotlin.reflect.d tClass, @NotNull AbstractC7393m0 value) {
        Intrinsics.checkNotNullParameter(tClass, "tClass");
        Intrinsics.checkNotNullParameter(value, "value");
        String u11 = tClass.u();
        Intrinsics.f(u11);
        c(u11, value);
    }

    public final boolean isEmpty() {
        return b().getSize() == 0;
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<V> iterator() {
        return b().iterator();
    }
}
