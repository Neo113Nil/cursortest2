package ru.ozon.android.messenger.blocks.ratemessenger;

import Ve.Om;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final int f86138a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f86139b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f86140c;

    public j(int i11, @NotNull String text, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f86138a = i11;
        this.f86139b = text;
        this.f86140c = arrayList;
    }

    public final int a() {
        return this.f86138a;
    }

    public final List<k> b() {
        return this.f86140c;
    }

    @NotNull
    public final String c() {
        return this.f86139b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f86138a == jVar.f86138a && Intrinsics.d(this.f86139b, jVar.f86139b) && Intrinsics.d(this.f86140c, jVar.f86140c);
    }

    public final int hashCode() {
        int a11 = G.g.a(Integer.hashCode(this.f86138a) * 31, 31, this.f86139b);
        ArrayList arrayList = this.f86140c;
        return a11 + (arrayList == null ? 0 : arrayList.hashCode());
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RateVO(rate=");
        sb2.append(this.f86138a);
        sb2.append(", text=");
        sb2.append(this.f86139b);
        sb2.append(", reasons=");
        return Om.a(")", sb2, this.f86140c);
    }
}
