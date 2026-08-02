package wm0;

import B3.D;
import G.g;
import Le.InterfaceC3583a;
import Me.f;
import Oe.N;
import Oe.Z;
import Oe.r;
import Sc.InterfaceC3999a;
import android.os.Build;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class d {

    @NotNull
    public static final b Companion = new b(0);

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f104618a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f104619b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f104620c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f104621d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f104622e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final String f104623f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final String f104624g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final String f104625h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final String f104626i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final String f104627j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final String f104628k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final String f104629l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final String f104630m;

    @InterfaceC3999a
    public static final class a implements r<d> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f104631a;
        private static final /* synthetic */ N descriptor;

        static {
            a aVar = new a();
            f104631a = aVar;
            N n11 = new N("ru.sber.platform.clickstream.clickstreamlite.internal.models.MetaData", aVar, 13);
            n11.j("apiKey", true);
            n11.j("platform", true);
            n11.j("browser", true);
            n11.j("operationSystem", true);
            n11.j("operationSystemVersion", true);
            n11.j("systemLanguage", true);
            n11.j("deviceVendor", true);
            n11.j("deviceModel", true);
            n11.j("screenSize", true);
            n11.j("deviceMemorySize", true);
            n11.j("deviceAbi", true);
            n11.j("applicationName", true);
            n11.j("timeStamp", true);
            descriptor = n11;
        }

        @Override // Oe.r
        @NotNull
        public final InterfaceC3583a<?>[] a() {
            Z z11 = Z.f20279a;
            return new InterfaceC3583a[]{z11, z11, z11, z11, z11, z11, z11, z11, z11, z11, z11, z11, z11};
        }

        @Override // Le.f
        @NotNull
        public final f b() {
            return descriptor;
        }

        @Override // Le.f
        public final void c(Ne.a encoder, Object obj) {
            d value = (d) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            N n11 = descriptor;
            Ne.b e11 = encoder.e(n11);
            d.a(value, e11, n11);
            e11.B(n11);
        }
    }

    public static final class b {
        public /* synthetic */ b(int i11) {
            this();
        }

        @NotNull
        public final InterfaceC3583a<d> serializer() {
            return a.f104631a;
        }

        private b() {
        }
    }

    public d() {
        this(null, null, null, null, null, null, null, 8191);
    }

    public static final void a(@NotNull d self, @NotNull Ne.b output, @NotNull N serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.j(serialDesc) || !Intrinsics.d(self.f104618a, "")) {
            output.k(serialDesc, 0, self.f104618a);
        }
        if (output.j(serialDesc) || !Intrinsics.d(self.f104619b, "")) {
            output.k(serialDesc, 1, self.f104619b);
        }
        if (output.j(serialDesc) || !Intrinsics.d(self.f104620c, "")) {
            output.k(serialDesc, 2, self.f104620c);
        }
        if (output.j(serialDesc) || !Intrinsics.d(self.f104621d, "")) {
            output.k(serialDesc, 3, self.f104621d);
        }
        if (output.j(serialDesc) || !Intrinsics.d(self.f104622e, "")) {
            output.k(serialDesc, 4, self.f104622e);
        }
        if (output.j(serialDesc) || !Intrinsics.d(self.f104623f, "")) {
            output.k(serialDesc, 5, self.f104623f);
        }
        if (output.j(serialDesc) || !Intrinsics.d(self.f104624g, "")) {
            output.k(serialDesc, 6, self.f104624g);
        }
        if (output.j(serialDesc) || !Intrinsics.d(self.f104625h, "")) {
            output.k(serialDesc, 7, self.f104625h);
        }
        if (output.j(serialDesc) || !Intrinsics.d(self.f104626i, "")) {
            output.k(serialDesc, 8, self.f104626i);
        }
        if (output.j(serialDesc) || !Intrinsics.d(self.f104627j, "")) {
            output.k(serialDesc, 9, self.f104627j);
        }
        if (output.j(serialDesc) || !Intrinsics.d(self.f104628k, "")) {
            output.k(serialDesc, 10, self.f104628k);
        }
        if (output.j(serialDesc) || !Intrinsics.d(self.f104629l, "")) {
            output.k(serialDesc, 11, self.f104629l);
        }
        if (!output.j(serialDesc) && Intrinsics.d(self.f104630m, ym0.b.a())) {
            return;
        }
        output.k(serialDesc, 12, self.f104630m);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f104618a, dVar.f104618a) && Intrinsics.d(this.f104619b, dVar.f104619b) && Intrinsics.d(this.f104620c, dVar.f104620c) && Intrinsics.d(this.f104621d, dVar.f104621d) && Intrinsics.d(this.f104622e, dVar.f104622e) && Intrinsics.d(this.f104623f, dVar.f104623f) && Intrinsics.d(this.f104624g, dVar.f104624g) && Intrinsics.d(this.f104625h, dVar.f104625h) && Intrinsics.d(this.f104626i, dVar.f104626i) && Intrinsics.d(this.f104627j, dVar.f104627j) && Intrinsics.d(this.f104628k, dVar.f104628k) && Intrinsics.d(this.f104629l, dVar.f104629l) && Intrinsics.d(this.f104630m, dVar.f104630m);
    }

    public final int hashCode() {
        return this.f104630m.hashCode() + g.a(g.a(g.a(g.a(g.a(g.a(g.a(g.a(g.a(g.a(g.a(this.f104618a.hashCode() * 31, 31, this.f104619b), 31, this.f104620c), 31, this.f104621d), 31, this.f104622e), 31, this.f104623f), 31, this.f104624g), 31, this.f104625h), 31, this.f104626i), 31, this.f104627j), 31, this.f104628k), 31, this.f104629l);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MetaData(apiKey=");
        sb2.append(this.f104618a);
        sb2.append(", platform=");
        sb2.append(this.f104619b);
        sb2.append(", browser=");
        sb2.append(this.f104620c);
        sb2.append(", operationSystem=");
        sb2.append(this.f104621d);
        sb2.append(", operationSystemVersion=");
        sb2.append(this.f104622e);
        sb2.append(", systemLanguage=");
        sb2.append(this.f104623f);
        sb2.append(", deviceVendor=");
        sb2.append(this.f104624g);
        sb2.append(", deviceModel=");
        sb2.append(this.f104625h);
        sb2.append(", screenSize=");
        sb2.append(this.f104626i);
        sb2.append(", deviceMemorySize=");
        sb2.append(this.f104627j);
        sb2.append(", deviceAbi=");
        sb2.append(this.f104628k);
        sb2.append(", applicationName=");
        sb2.append(this.f104629l);
        sb2.append(", timeStamp=");
        return D.c(sb2, this.f104630m, ')');
    }

    public d(String apiKey, String operationSystemVersion, String systemLanguage, String screenSize, String deviceMemorySize, String deviceAbi, String applicationName, int i11) {
        String deviceVendor = Build.MANUFACTURER;
        String deviceModel = Build.MODEL;
        apiKey = (i11 & 1) != 0 ? "" : apiKey;
        String platform = (i11 & 2) != 0 ? "" : "MOBILE";
        String browser = (i11 & 4) != 0 ? "" : "Android";
        String operationSystem = (i11 & 8) != 0 ? "" : "Android";
        operationSystemVersion = (i11 & 16) != 0 ? "" : operationSystemVersion;
        systemLanguage = (i11 & 32) != 0 ? "" : systemLanguage;
        deviceVendor = (i11 & 64) != 0 ? "" : deviceVendor;
        deviceModel = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? "" : deviceModel;
        screenSize = (i11 & 256) != 0 ? "" : screenSize;
        deviceMemorySize = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? "" : deviceMemorySize;
        deviceAbi = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? "" : deviceAbi;
        applicationName = (i11 & 2048) != 0 ? "" : applicationName;
        String timeStamp = ym0.b.a();
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(browser, "browser");
        Intrinsics.checkNotNullParameter(operationSystem, "operationSystem");
        Intrinsics.checkNotNullParameter(operationSystemVersion, "operationSystemVersion");
        Intrinsics.checkNotNullParameter(systemLanguage, "systemLanguage");
        Intrinsics.checkNotNullParameter(deviceVendor, "deviceVendor");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(screenSize, "screenSize");
        Intrinsics.checkNotNullParameter(deviceMemorySize, "deviceMemorySize");
        Intrinsics.checkNotNullParameter(deviceAbi, "deviceAbi");
        Intrinsics.checkNotNullParameter(applicationName, "applicationName");
        Intrinsics.checkNotNullParameter(timeStamp, "timeStamp");
        this.f104618a = apiKey;
        this.f104619b = platform;
        this.f104620c = browser;
        this.f104621d = operationSystem;
        this.f104622e = operationSystemVersion;
        this.f104623f = systemLanguage;
        this.f104624g = deviceVendor;
        this.f104625h = deviceModel;
        this.f104626i = screenSize;
        this.f104627j = deviceMemorySize;
        this.f104628k = deviceAbi;
        this.f104629l = applicationName;
        this.f104630m = timeStamp;
    }
}
