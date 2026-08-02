package ru.ozon.android.messenger.blocks.messagetext.compose;

import C.o0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final int f85837a;

    /* renamed from: b, reason: collision with root package name */
    private final String f85838b;

    public h(int i11, String prefix) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        this.f85837a = i11;
        this.f85838b = prefix;
    }

    public final int a() {
        return this.f85837a;
    }

    public final String b() {
        return this.f85838b;
    }

    public final int c() {
        return this.f85837a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f85837a == hVar.f85837a && Intrinsics.d(this.f85838b, hVar.f85838b);
    }

    public final int hashCode() {
        return this.f85838b.hashCode() + (Integer.hashCode(this.f85837a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Insertion(position=");
        sb2.append(this.f85837a);
        sb2.append(", prefix=");
        return o0.c(sb2, this.f85838b, ")");
    }
}
