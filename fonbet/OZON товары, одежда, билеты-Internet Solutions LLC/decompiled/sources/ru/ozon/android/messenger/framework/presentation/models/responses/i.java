package ru.ozon.android.messenger.framework.presentation.models.responses;

import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final String f91509a;

    /* renamed from: b, reason: collision with root package name */
    private final String f91510b;

    /* renamed from: c, reason: collision with root package name */
    private final String f91511c;

    public i(String str, String str2, String str3) {
        this.f91509a = str;
        this.f91510b = str2;
        this.f91511c = str3;
    }

    public final String a() {
        return this.f91509a;
    }

    public final String b() {
        return this.f91511c;
    }

    public final String c() {
        return this.f91510b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.f91509a, iVar.f91509a) && Intrinsics.d(this.f91510b, iVar.f91510b) && Intrinsics.d(this.f91511c, iVar.f91511c);
    }

    public final int hashCode() {
        String str = this.f91509a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f91510b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f91511c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InitializeChatResponseVO(pageToken=");
        sb2.append(this.f91509a);
        sb2.append(", widgetToken=");
        sb2.append(this.f91510b);
        sb2.append(", userToken=");
        return o0.c(sb2, this.f91511c, ")");
    }
}
