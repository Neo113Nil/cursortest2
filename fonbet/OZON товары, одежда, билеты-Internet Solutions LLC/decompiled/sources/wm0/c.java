package wm0;

import Le.InterfaceC3583a;
import Me.f;
import Oe.C3685d;
import Oe.N;
import Oe.r;
import Sc.InterfaceC3999a;
import com.google.android.gms.common.Scopes;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wm0.a;
import wm0.d;
import wm0.e;

/* loaded from: classes4.dex */
public final class c {

    @NotNull
    public static final b Companion = new b(0);

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final d f104614a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final e f104615b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<wm0.a> f104616c;

    @InterfaceC3999a
    public static final class a implements r<c> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f104617a;
        private static final /* synthetic */ N descriptor;

        static {
            a aVar = new a();
            f104617a = aVar;
            N n11 = new N("ru.sber.platform.clickstream.clickstreamlite.internal.models.EventsPackage", aVar, 3);
            n11.j("meta", false);
            n11.j(Scopes.PROFILE, false);
            n11.j("data", false);
            descriptor = n11;
        }

        @Override // Oe.r
        @NotNull
        public final InterfaceC3583a<?>[] a() {
            return new InterfaceC3583a[]{d.a.f104631a, e.a.f104636a, new C3685d(a.C2266a.f104610a)};
        }

        @Override // Le.f
        @NotNull
        public final f b() {
            return descriptor;
        }

        @Override // Le.f
        public final void c(Ne.a encoder, Object obj) {
            c value = (c) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            N n11 = descriptor;
            Ne.b e11 = encoder.e(n11);
            c.a(value, e11, n11);
            e11.B(n11);
        }
    }

    public static final class b {
        public /* synthetic */ b(int i11) {
            this();
        }

        @NotNull
        public final InterfaceC3583a<c> serializer() {
            return a.f104617a;
        }

        private b() {
        }
    }

    public c(@NotNull d meta, @NotNull e profile, @NotNull List<wm0.a> data) {
        Intrinsics.checkNotNullParameter(meta, "meta");
        Intrinsics.checkNotNullParameter(profile, "profile");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f104614a = meta;
        this.f104615b = profile;
        this.f104616c = data;
    }

    public static final void a(@NotNull c self, @NotNull Ne.b output, @NotNull N serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.u(serialDesc, 0, d.a.f104631a, self.f104614a);
        output.u(serialDesc, 1, e.a.f104636a, self.f104615b);
        output.u(serialDesc, 2, new C3685d(a.C2266a.f104610a), self.f104616c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f104614a, cVar.f104614a) && Intrinsics.d(this.f104615b, cVar.f104615b) && Intrinsics.d(this.f104616c, cVar.f104616c);
    }

    public final int hashCode() {
        return this.f104616c.hashCode() + ((this.f104615b.hashCode() + (this.f104614a.hashCode() * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "EventsPackage(meta=" + this.f104614a + ", profile=" + this.f104615b + ", data=" + this.f104616c + ')';
    }
}
