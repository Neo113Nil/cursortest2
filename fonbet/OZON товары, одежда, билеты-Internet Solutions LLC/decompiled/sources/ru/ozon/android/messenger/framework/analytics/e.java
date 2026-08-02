package ru.ozon.android.messenger.framework.analytics;

import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final String f86580a;

    /* renamed from: b, reason: collision with root package name */
    private final String f86581b;

    public e(String str, String str2) {
        this.f86580a = str;
        this.f86581b = str2;
    }

    public final String a() {
        return this.f86580a;
    }

    public final String b() {
        return this.f86581b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f86580a, eVar.f86580a) && Intrinsics.d(this.f86581b, eVar.f86581b);
    }

    public final int hashCode() {
        String str = this.f86580a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f86581b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MessengerPage(name=");
        sb2.append(this.f86580a);
        sb2.append(", url=");
        return o0.c(sb2, this.f86581b, ")");
    }
}
