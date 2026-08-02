package ru.ozon.android.messenger.blocks.ratemessenger;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f86088a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f86089b;

    public a(String str, Integer num) {
        this.f86088a = str;
        this.f86089b = num;
    }

    public final Integer a() {
        return this.f86089b;
    }

    public final String b() {
        return this.f86088a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f86088a, aVar.f86088a) && Intrinsics.d(this.f86089b, aVar.f86089b);
    }

    public final int hashCode() {
        String str = this.f86088a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f86089b;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "MessageVO(placeholder=" + this.f86088a + ", maxCharacters=" + this.f86089b + ")";
    }
}
