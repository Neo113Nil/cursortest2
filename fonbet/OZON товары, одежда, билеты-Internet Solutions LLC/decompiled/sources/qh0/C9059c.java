package qh0;

import fh0.AbstractC6566a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: qh0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9059c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f82116a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f82117b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final AbstractC6566a f82118c;

    /* renamed from: d, reason: collision with root package name */
    private final int f82119d;

    public C9059c(@NotNull String firstMessageId, boolean z11) {
        Intrinsics.checkNotNullParameter(firstMessageId, "firstMessageId");
        this.f82116a = firstMessageId;
        this.f82117b = z11;
        this.f82118c = z11 ? AbstractC6566a.C1022a.f63436b : AbstractC6566a.c.f63438b;
        this.f82119d = firstMessageId.hashCode();
    }

    @NotNull
    public final AbstractC6566a a() {
        return this.f82118c;
    }

    public final int b() {
        return this.f82119d;
    }

    public final boolean c() {
        return this.f82117b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9059c)) {
            return false;
        }
        C9059c c9059c = (C9059c) obj;
        return Intrinsics.d(this.f82116a, c9059c.f82116a) && this.f82117b == c9059c.f82117b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f82117b) + (this.f82116a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DuplicationInfo(firstMessageId=");
        sb2.append(this.f82116a);
        sb2.append(", isDuplicate=");
        return Pk0.a.a(")", sb2, this.f82117b);
    }
}
