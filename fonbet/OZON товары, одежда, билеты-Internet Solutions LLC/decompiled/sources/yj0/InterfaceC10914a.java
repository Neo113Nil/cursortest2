package yj0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wj0.C10566a;

/* renamed from: yj0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC10914a {

    /* renamed from: yj0.a$a, reason: collision with other inner class name */
    public static final class C2311a {
        public static /* synthetic */ InterfaceC10914a a(InterfaceC10914a interfaceC10914a, Cj0.a aVar, Cj0.a aVar2, Cj0.a aVar3, int i11) {
            if ((i11 & 1) != 0) {
                aVar = interfaceC10914a.c();
            }
            if ((i11 & 2) != 0) {
                aVar2 = interfaceC10914a.d();
            }
            if ((i11 & 4) != 0) {
                aVar3 = interfaceC10914a.b();
            }
            return interfaceC10914a.e(aVar, aVar2, aVar3, interfaceC10914a.a());
        }
    }

    /* renamed from: yj0.a$b */
    public static class b implements InterfaceC10914a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Cj0.a f106767a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final Cj0.a f106768b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final Cj0.a f106769c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final List<C10566a> f106770d;

        public b(@NotNull Cj0.a metricTypeVO, @NotNull Cj0.a metricValueVO, @NotNull Cj0.a metricCountVO, @NotNull List<C10566a> menuItems) {
            Intrinsics.checkNotNullParameter(metricTypeVO, "metricTypeVO");
            Intrinsics.checkNotNullParameter(metricValueVO, "metricValueVO");
            Intrinsics.checkNotNullParameter(metricCountVO, "metricCountVO");
            Intrinsics.checkNotNullParameter(menuItems, "menuItems");
            this.f106767a = metricTypeVO;
            this.f106768b = metricValueVO;
            this.f106769c = metricCountVO;
            this.f106770d = menuItems;
        }

        @Override // yj0.InterfaceC10914a
        @NotNull
        public final List<C10566a> a() {
            return this.f106770d;
        }

        @Override // yj0.InterfaceC10914a
        @NotNull
        public final Cj0.a b() {
            return this.f106769c;
        }

        @Override // yj0.InterfaceC10914a
        @NotNull
        public final Cj0.a c() {
            return this.f106767a;
        }

        @Override // yj0.InterfaceC10914a
        @NotNull
        public final Cj0.a d() {
            return this.f106768b;
        }

        @Override // yj0.InterfaceC10914a
        @NotNull
        public final b e(@NotNull Cj0.a metricTypeVO, @NotNull Cj0.a metricValueVO, @NotNull Cj0.a metricCountVO, @NotNull List menuItems) {
            Intrinsics.checkNotNullParameter(metricTypeVO, "metricTypeVO");
            Intrinsics.checkNotNullParameter(metricValueVO, "metricValueVO");
            Intrinsics.checkNotNullParameter(metricCountVO, "metricCountVO");
            Intrinsics.checkNotNullParameter(menuItems, "menuItems");
            return new b(metricTypeVO, metricValueVO, metricCountVO, menuItems);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.d(this.f106767a, bVar.f106767a) && Intrinsics.d(this.f106768b, bVar.f106768b) && Intrinsics.d(this.f106769c, bVar.f106769c) && Intrinsics.d(this.f106770d, bVar.f106770d);
        }

        public final int hashCode() {
            return this.f106770d.hashCode() + ((this.f106769c.hashCode() + ((this.f106768b.hashCode() + (this.f106767a.hashCode() * 31)) * 31)) * 31);
        }

        @NotNull
        public final String toString() {
            return "Idle(metricTypeVO=" + this.f106767a + ", metricValueVO=" + this.f106768b + ", metricCountVO=" + this.f106769c + ", menuItems=" + this.f106770d + ")";
        }
    }

    @NotNull
    List<C10566a> a();

    @NotNull
    Cj0.a b();

    @NotNull
    Cj0.a c();

    @NotNull
    Cj0.a d();

    @NotNull
    b e(@NotNull Cj0.a aVar, @NotNull Cj0.a aVar2, @NotNull Cj0.a aVar3, @NotNull List list);
}
