package wm0;

import B3.D;
import Le.InterfaceC3583a;
import Me.f;
import Oe.N;
import Oe.Z;
import Oe.r;
import Sc.InterfaceC3999a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class b {

    @NotNull
    public static final C2267b Companion = new C2267b(0);

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f104611a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f104612b;

    @InterfaceC3999a
    public static final class a implements r<b> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f104613a;
        private static final /* synthetic */ N descriptor;

        static {
            a aVar = new a();
            f104613a = aVar;
            N n11 = new N("ru.sber.platform.clickstream.clickstreamlite.internal.models.EventProperty", aVar, 2);
            n11.j("key", false);
            n11.j(AppMeasurementSdk.ConditionalUserProperty.VALUE, false);
            descriptor = n11;
        }

        @Override // Oe.r
        @NotNull
        public final InterfaceC3583a<?>[] a() {
            Z z11 = Z.f20279a;
            return new InterfaceC3583a[]{z11, z11};
        }

        @Override // Le.f
        @NotNull
        public final f b() {
            return descriptor;
        }

        @Override // Le.f
        public final void c(Ne.a encoder, Object obj) {
            b value = (b) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            N n11 = descriptor;
            Ne.b e11 = encoder.e(n11);
            b.a(value, e11, n11);
            e11.B(n11);
        }
    }

    /* renamed from: wm0.b$b, reason: collision with other inner class name */
    public static final class C2267b {
        public /* synthetic */ C2267b(int i11) {
            this();
        }

        @NotNull
        public final InterfaceC3583a<b> serializer() {
            return a.f104613a;
        }

        private C2267b() {
        }
    }

    public b(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f104611a = key;
        this.f104612b = value;
    }

    public static final void a(@NotNull b self, @NotNull Ne.b output, @NotNull N serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.k(serialDesc, 0, self.f104611a);
        output.k(serialDesc, 1, self.f104612b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f104611a, bVar.f104611a) && Intrinsics.d(this.f104612b, bVar.f104612b);
    }

    public final int hashCode() {
        return this.f104612b.hashCode() + (this.f104611a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventProperty(key=");
        sb2.append(this.f104611a);
        sb2.append(", value=");
        return D.c(sb2, this.f104612b, ')');
    }
}
