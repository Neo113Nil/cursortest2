package v30;

import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: v30.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10219a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f101996a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f101997b;

    static {
        new C10219a("", "");
    }

    public C10219a(String appName, String appVersion) {
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter("", "bankId");
        this.f101996a = appName;
        this.f101997b = appVersion;
    }

    @NotNull
    public final String a() {
        return this.f101996a;
    }

    @NotNull
    public final String b() {
        return this.f101997b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10219a)) {
            return false;
        }
        C10219a c10219a = (C10219a) obj;
        return this.f101996a.equals(c10219a.f101996a) && Intrinsics.d(this.f101997b, c10219a.f101997b);
    }

    public final int hashCode() {
        return G.g.a(this.f101996a.hashCode() * 31, 961, this.f101997b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AntiFraudConfig(appName=");
        sb2.append(this.f101996a);
        sb2.append(", appVersion=");
        return o0.c(sb2, this.f101997b, ", bankId=, webViewCreatedCallback=null)");
    }
}
