package wm0;

import B3.D;
import G.g;
import Le.InterfaceC3583a;
import Me.f;
import Oe.N;
import Oe.Z;
import Oe.r;
import Sc.InterfaceC3999a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class e {

    @NotNull
    public static final b Companion = new b(0);

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f104632a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f104633b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f104634c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f104635d;

    @InterfaceC3999a
    public static final class a implements r<e> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f104636a;
        private static final /* synthetic */ N descriptor;

        static {
            a aVar = new a();
            f104636a = aVar;
            N n11 = new N("ru.sber.platform.clickstream.clickstreamlite.internal.models.ProfileData", aVar, 14);
            n11.j("deviceId", false);
            n11.j("applicationLanguage", false);
            n11.j("clientBlock", true);
            n11.j("sessionId", true);
            n11.j("partnerId", true);
            n11.j("appId", true);
            n11.j("sapId", true);
            n11.j("subId", true);
            n11.j("adId", true);
            n11.j("hashEfsId", true);
            n11.j("appVersion", true);
            n11.j("appVersionNumber", true);
            n11.j("hashEpkId", true);
            n11.j("hashUserLoginId", true);
            descriptor = n11;
        }

        @Override // Oe.r
        @NotNull
        public final InterfaceC3583a<?>[] a() {
            Z z11 = Z.f20279a;
            return new InterfaceC3583a[]{z11, z11, z11, z11, z11, z11, z11, z11, z11, z11, z11, z11, z11, z11};
        }

        @Override // Le.f
        @NotNull
        public final f b() {
            return descriptor;
        }

        @Override // Le.f
        public final void c(Ne.a encoder, Object obj) {
            e value = (e) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            N n11 = descriptor;
            Ne.b e11 = encoder.e(n11);
            e.a(value, e11, n11);
            e11.B(n11);
        }
    }

    public static final class b {
        public /* synthetic */ b(int i11) {
            this();
        }

        @NotNull
        public final InterfaceC3583a<e> serializer() {
            return a.f104636a;
        }

        private b() {
        }
    }

    public e(String deviceId, String applicationLanguage, String sessionId, String hashUserLoginId) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(applicationLanguage, "applicationLanguage");
        Intrinsics.checkNotNullParameter("", "clientBlock");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter("", "partnerId");
        Intrinsics.checkNotNullParameter("", "appId");
        Intrinsics.checkNotNullParameter("", "sapId");
        Intrinsics.checkNotNullParameter("", "subId");
        Intrinsics.checkNotNullParameter("", "adId");
        Intrinsics.checkNotNullParameter("", "hashEfsId");
        Intrinsics.checkNotNullParameter("", "appVersion");
        Intrinsics.checkNotNullParameter("", "appVersionNumber");
        Intrinsics.checkNotNullParameter("", "hashEpkId");
        Intrinsics.checkNotNullParameter(hashUserLoginId, "hashUserLoginId");
        this.f104632a = deviceId;
        this.f104633b = applicationLanguage;
        this.f104634c = sessionId;
        this.f104635d = hashUserLoginId;
    }

    public static final void a(@NotNull e self, @NotNull Ne.b output, @NotNull N serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.k(serialDesc, 0, self.f104632a);
        output.k(serialDesc, 1, self.f104633b);
        if (output.j(serialDesc)) {
            output.k(serialDesc, 2, "");
        }
        boolean j11 = output.j(serialDesc);
        String str = self.f104634c;
        if (j11 || !Intrinsics.d(str, "")) {
            output.k(serialDesc, 3, str);
        }
        if (output.j(serialDesc)) {
            output.k(serialDesc, 4, "");
        }
        if (output.j(serialDesc)) {
            output.k(serialDesc, 5, "");
        }
        if (output.j(serialDesc)) {
            output.k(serialDesc, 6, "");
        }
        if (output.j(serialDesc)) {
            output.k(serialDesc, 7, "");
        }
        if (output.j(serialDesc)) {
            output.k(serialDesc, 8, "");
        }
        if (output.j(serialDesc)) {
            output.k(serialDesc, 9, "");
        }
        if (output.j(serialDesc)) {
            output.k(serialDesc, 10, "");
        }
        if (output.j(serialDesc)) {
            output.k(serialDesc, 11, "");
        }
        if (output.j(serialDesc)) {
            output.k(serialDesc, 12, "");
        }
        boolean j12 = output.j(serialDesc);
        String str2 = self.f104635d;
        if (!j12 && Intrinsics.d(str2, "")) {
            return;
        }
        output.k(serialDesc, 13, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f104632a, eVar.f104632a) && Intrinsics.d(this.f104633b, eVar.f104633b) && Intrinsics.d(this.f104634c, eVar.f104634c) && Intrinsics.d(this.f104635d, eVar.f104635d);
    }

    public final int hashCode() {
        return this.f104635d.hashCode() + g.a(g.a(this.f104632a.hashCode() * 31, 961, this.f104633b), -1796951359, this.f104634c);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProfileData(deviceId=");
        sb2.append(this.f104632a);
        sb2.append(", applicationLanguage=");
        sb2.append(this.f104633b);
        sb2.append(", clientBlock=, sessionId=");
        sb2.append(this.f104634c);
        sb2.append(", partnerId=, appId=, sapId=, subId=, adId=, hashEfsId=, appVersion=, appVersionNumber=, hashEpkId=, hashUserLoginId=");
        return D.c(sb2, this.f104635d, ')');
    }
}
