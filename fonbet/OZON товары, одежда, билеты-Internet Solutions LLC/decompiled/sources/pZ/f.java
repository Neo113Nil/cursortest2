package pZ;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class f {

    @NotNull
    public static final b Companion = new b();

    @NotNull
    private static final f NONE = new a();

    public static final class a extends f {

        /* renamed from: a, reason: collision with root package name */
        private final kotlin.reflect.d<? extends EZ.a<?>> f80370a = N.b(EZ.a.class);

        a() {
        }

        @Override // pZ.f
        public final kotlin.reflect.d<? extends EZ.a<?>> getNavigator() {
            return this.f80370a;
        }

        public final String toString() {
            return "Destination.NONE";
        }
    }

    public static final class b {
        @NotNull
        public static f a() {
            return f.NONE;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.d(getNavigator(), ((f) obj).getNavigator());
    }

    @NotNull
    public abstract kotlin.reflect.d<? extends EZ.a<?>> getNavigator();

    public int hashCode() {
        return getNavigator().hashCode();
    }
}
