package ru.ozon.android.messenger.framework.presentation.models.responses;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final String f91480a;

    /* renamed from: b, reason: collision with root package name */
    private final String f91481b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f91482c;

    public e(String str, String str2, boolean z11) {
        this.f91480a = str;
        this.f91481b = str2;
        this.f91482c = z11;
    }

    public final String a() {
        return this.f91481b;
    }

    public final String b() {
        return this.f91480a;
    }

    public final boolean c() {
        return this.f91482c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f91480a, eVar.f91480a) && Intrinsics.d(this.f91481b, eVar.f91481b) && this.f91482c == eVar.f91482c;
    }

    public final int hashCode() {
        String str = this.f91480a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f91481b;
        return Boolean.hashCode(this.f91482c) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FastAnswerActionResponseVO(title=");
        sb2.append(this.f91480a);
        sb2.append(", subtitle=");
        sb2.append(this.f91481b);
        sb2.append(", isError=");
        return Pk0.a.a(")", sb2, this.f91482c);
    }
}
