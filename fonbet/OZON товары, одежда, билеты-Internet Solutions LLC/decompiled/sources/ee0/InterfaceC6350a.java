package ee0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import we0.s;
import we0.u;

/* renamed from: ee0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC6350a {

    /* renamed from: ee0.a$a, reason: collision with other inner class name */
    public static final class C0978a implements InterfaceC6350a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final s f62178a;

        public C0978a(@NotNull s mapCluster) {
            Intrinsics.checkNotNullParameter(mapCluster, "mapCluster");
            this.f62178a = mapCluster;
        }

        @NotNull
        public final s a() {
            return this.f62178a;
        }
    }

    /* renamed from: ee0.a$b */
    public static final class b implements InterfaceC6350a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final u f62179a;

        public b(@NotNull u mapPlacemark) {
            Intrinsics.checkNotNullParameter(mapPlacemark, "mapPlacemark");
            this.f62179a = mapPlacemark;
        }

        @NotNull
        public final u a() {
            return this.f62179a;
        }
    }
}
