package wm0;

import B3.D;
import B90.C2618u;
import G.g;
import Le.InterfaceC3583a;
import Me.f;
import Oe.C3685d;
import Oe.N;
import Oe.Z;
import Oe.r;
import Sc.InterfaceC3999a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import om0.C8754a;
import org.jetbrains.annotations.NotNull;
import wm0.b;

/* loaded from: classes4.dex */
public final class a {

    @NotNull
    public static final b Companion = new b(0);

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f104598a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private String f104599b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private String f104600c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private String f104601d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private String f104602e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private String f104603f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private String f104604g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private String f104605h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final String f104606i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final String f104607j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private ArrayList f104608k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final String f104609l;

    @InterfaceC3999a
    /* renamed from: wm0.a$a, reason: collision with other inner class name */
    public static final class C2266a implements r<a> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C2266a f104610a;
        private static final /* synthetic */ N descriptor;

        static {
            C2266a c2266a = new C2266a();
            f104610a = c2266a;
            N n11 = new N("ru.sber.platform.clickstream.clickstreamlite.internal.models.Event", c2266a, 12);
            n11.j("eventAction", false);
            n11.j("eventType", true);
            n11.j("geoLatitude", true);
            n11.j("geoLongitude", true);
            n11.j("cellularProvider", true);
            n11.j("batteryLevel", true);
            n11.j("connectionType", true);
            n11.j("internalIP", true);
            n11.j("eventCategory", true);
            n11.j(AppMeasurementSdk.ConditionalUserProperty.VALUE, true);
            n11.j("properties", true);
            n11.j("timeStamp", true);
            descriptor = n11;
        }

        @Override // Oe.r
        @NotNull
        public final InterfaceC3583a<?>[] a() {
            C3685d c3685d = new C3685d(b.a.f104613a);
            Z z11 = Z.f20279a;
            return new InterfaceC3583a[]{z11, z11, z11, z11, z11, z11, z11, z11, z11, z11, c3685d, z11};
        }

        @Override // Le.f
        @NotNull
        public final f b() {
            return descriptor;
        }

        @Override // Le.f
        public final void c(Ne.a encoder, Object obj) {
            a value = (a) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            N n11 = descriptor;
            Ne.b e11 = encoder.e(n11);
            a.h(value, e11, n11);
            e11.B(n11);
        }
    }

    public static final class b {
        public /* synthetic */ b(int i11) {
            this();
        }

        @NotNull
        public final InterfaceC3583a<a> serializer() {
            return C2266a.f104610a;
        }

        private b() {
        }
    }

    public a() {
        throw null;
    }

    public a(String eventAction, String eventType, String eventCategory, String value, ArrayList properties) {
        String timeStamp = ym0.b.a();
        Intrinsics.checkNotNullParameter(eventAction, "eventAction");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter("", "geoLatitude");
        Intrinsics.checkNotNullParameter("", "geoLongitude");
        Intrinsics.checkNotNullParameter("", "cellularProvider");
        Intrinsics.checkNotNullParameter("", "batteryLevel");
        Intrinsics.checkNotNullParameter("", "connectionType");
        Intrinsics.checkNotNullParameter("", "internalIP");
        Intrinsics.checkNotNullParameter(eventCategory, "eventCategory");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(timeStamp, "timeStamp");
        this.f104598a = eventAction;
        this.f104599b = eventType;
        this.f104600c = "";
        this.f104601d = "";
        this.f104602e = "";
        this.f104603f = "";
        this.f104604g = "";
        this.f104605h = "";
        this.f104606i = eventCategory;
        this.f104607j = value;
        this.f104608k = properties;
        this.f104609l = timeStamp;
    }

    public static final void h(@NotNull a self, @NotNull Ne.b output, @NotNull N serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.k(serialDesc, 0, self.f104598a);
        boolean j11 = output.j(serialDesc);
        String str = self.f104599b;
        if (j11 || !Intrinsics.d(str, "")) {
            output.k(serialDesc, 1, str);
        }
        if (output.j(serialDesc) || !Intrinsics.d(self.f104600c, "")) {
            output.k(serialDesc, 2, self.f104600c);
        }
        if (output.j(serialDesc) || !Intrinsics.d(self.f104601d, "")) {
            output.k(serialDesc, 3, self.f104601d);
        }
        if (output.j(serialDesc) || !Intrinsics.d(self.f104602e, "")) {
            output.k(serialDesc, 4, self.f104602e);
        }
        if (output.j(serialDesc) || !Intrinsics.d(self.f104603f, "")) {
            output.k(serialDesc, 5, self.f104603f);
        }
        if (output.j(serialDesc) || !Intrinsics.d(self.f104604g, "")) {
            output.k(serialDesc, 6, self.f104604g);
        }
        if (output.j(serialDesc) || !Intrinsics.d(self.f104605h, "")) {
            output.k(serialDesc, 7, self.f104605h);
        }
        boolean j12 = output.j(serialDesc);
        String str2 = self.f104606i;
        if (j12 || !Intrinsics.d(str2, "")) {
            output.k(serialDesc, 8, str2);
        }
        boolean j13 = output.j(serialDesc);
        String str3 = self.f104607j;
        if (j13 || !Intrinsics.d(str3, "")) {
            output.k(serialDesc, 9, str3);
        }
        boolean j14 = output.j(serialDesc);
        ArrayList arrayList = self.f104608k;
        if (j14 || !Intrinsics.d(arrayList, K.f71697a)) {
            output.u(serialDesc, 10, new C3685d(b.a.f104613a), arrayList);
        }
        boolean j15 = output.j(serialDesc);
        String str4 = self.f104609l;
        if (!j15 && Intrinsics.d(str4, ym0.b.a())) {
            return;
        }
        output.k(serialDesc, 11, str4);
    }

    public final boolean a() {
        return Intrinsics.d(this.f104599b, C8754a.EnumC1333a.SENSITIVE.a());
    }

    public final void b(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f104603f = str;
    }

    public final void c(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f104602e = str;
    }

    public final void d(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f104604g = str;
    }

    public final void e(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f104600c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f104598a, aVar.f104598a) && Intrinsics.d(this.f104599b, aVar.f104599b) && Intrinsics.d(this.f104600c, aVar.f104600c) && Intrinsics.d(this.f104601d, aVar.f104601d) && Intrinsics.d(this.f104602e, aVar.f104602e) && Intrinsics.d(this.f104603f, aVar.f104603f) && Intrinsics.d(this.f104604g, aVar.f104604g) && Intrinsics.d(this.f104605h, aVar.f104605h) && Intrinsics.d(this.f104606i, aVar.f104606i) && Intrinsics.d(this.f104607j, aVar.f104607j) && Intrinsics.d(this.f104608k, aVar.f104608k) && Intrinsics.d(this.f104609l, aVar.f104609l);
    }

    public final void f(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f104601d = str;
    }

    public final void g(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f104605h = str;
    }

    public final int hashCode() {
        return this.f104609l.hashCode() + C2618u.b(this.f104608k, g.a(g.a(g.a(g.a(g.a(g.a(g.a(g.a(g.a(this.f104598a.hashCode() * 31, 31, this.f104599b), 31, this.f104600c), 31, this.f104601d), 31, this.f104602e), 31, this.f104603f), 31, this.f104604g), 31, this.f104605h), 31, this.f104606i), 31, this.f104607j), 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Event(eventAction=");
        sb2.append(this.f104598a);
        sb2.append(", eventType=");
        sb2.append(this.f104599b);
        sb2.append(", geoLatitude=");
        sb2.append(this.f104600c);
        sb2.append(", geoLongitude=");
        sb2.append(this.f104601d);
        sb2.append(", cellularProvider=");
        sb2.append(this.f104602e);
        sb2.append(", batteryLevel=");
        sb2.append(this.f104603f);
        sb2.append(", connectionType=");
        sb2.append(this.f104604g);
        sb2.append(", internalIP=");
        sb2.append(this.f104605h);
        sb2.append(", eventCategory=");
        sb2.append(this.f104606i);
        sb2.append(", value=");
        sb2.append(this.f104607j);
        sb2.append(", properties=");
        sb2.append(this.f104608k);
        sb2.append(", timeStamp=");
        return D.c(sb2, this.f104609l, ')');
    }
}
