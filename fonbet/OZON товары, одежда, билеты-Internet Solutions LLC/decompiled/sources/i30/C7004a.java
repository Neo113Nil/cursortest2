package i30;

import G.g;
import Kk.C3532b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: i30.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7004a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f65778a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f65779b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f65780c;

    /* renamed from: d, reason: collision with root package name */
    private final int f65781d;

    static {
        new C7004a(28, "", "", false);
    }

    public C7004a(int i11, String serviceName, String appVersion, boolean z11) {
        z11 = (i11 & 4) != 0 ? false : z11;
        Intrinsics.checkNotNullParameter(serviceName, "serviceName");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter("fintech", "team");
        this.f65778a = serviceName;
        this.f65779b = appVersion;
        this.f65780c = z11;
        this.f65781d = 10;
    }

    @NotNull
    public final String a() {
        return this.f65779b;
    }

    public final int b() {
        return this.f65781d;
    }

    @NotNull
    public final String c() {
        return this.f65778a;
    }

    public final boolean d() {
        return this.f65780c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7004a)) {
            return false;
        }
        C7004a c7004a = (C7004a) obj;
        return this.f65778a.equals(c7004a.f65778a) && Intrinsics.d(this.f65779b, c7004a.f65779b) && this.f65780c == c7004a.f65780c && this.f65781d == c7004a.f65781d;
    }

    public final int hashCode() {
        return ((Integer.hashCode(this.f65781d) + C3532b.a(g.a(this.f65778a.hashCode() * 31, 31, this.f65779b), 31, this.f65780c)) * 31) - 852700895;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GraylogConfig(serviceName=");
        sb2.append(this.f65778a);
        sb2.append(", appVersion=");
        sb2.append(this.f65779b);
        sb2.append(", isStage=");
        sb2.append(this.f65780c);
        sb2.append(", countLogsForSend=");
        return K00.b.e(this.f65781d, ", team=fintech)", sb2);
    }
}
