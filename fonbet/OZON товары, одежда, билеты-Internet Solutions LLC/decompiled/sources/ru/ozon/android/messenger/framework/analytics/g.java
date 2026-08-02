package ru.ozon.android.messenger.framework.analytics;

import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final String f86587a;

    /* renamed from: b, reason: collision with root package name */
    private final String f86588b;

    /* renamed from: c, reason: collision with root package name */
    private final String f86589c;

    public g(String str, String str2, String str3) {
        this.f86587a = str;
        this.f86588b = str2;
        this.f86589c = str3;
    }

    public final String a() {
        return this.f86587a;
    }

    public final String b() {
        return this.f86589c;
    }

    public final String c() {
        return this.f86588b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f86587a, gVar.f86587a) && Intrinsics.d(this.f86588b, gVar.f86588b) && Intrinsics.d(this.f86589c, gVar.f86589c);
    }

    public final int hashCode() {
        String str = this.f86587a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f86588b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f86589c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MessengerTokensPerPage(pageToken=");
        sb2.append(this.f86587a);
        sb2.append(", widgetToken=");
        sb2.append(this.f86588b);
        sb2.append(", userToken=");
        return o0.c(sb2, this.f86589c, ")");
    }
}
