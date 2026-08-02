package qj0;

import C.o0;
import Kk.C3532b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: qj0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9074d implements InterfaceC9075e<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f82219a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f82220b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f82221c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f82222d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f82223e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final String f82224f;

    public C9074d(@NotNull String key, @NotNull String label, @NotNull String testLocator, @NotNull String resetTestLocator, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(testLocator, "testLocator");
        Intrinsics.checkNotNullParameter(resetTestLocator, "resetTestLocator");
        this.f82219a = key;
        this.f82220b = label;
        this.f82221c = z11;
        this.f82222d = z12;
        this.f82223e = testLocator;
        this.f82224f = resetTestLocator;
    }

    public static C9074d b(C9074d c9074d, boolean z11) {
        String key = c9074d.f82219a;
        String label = c9074d.f82220b;
        boolean z12 = c9074d.f82222d;
        String testLocator = c9074d.f82223e;
        String resetTestLocator = c9074d.f82224f;
        c9074d.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(testLocator, "testLocator");
        Intrinsics.checkNotNullParameter(resetTestLocator, "resetTestLocator");
        return new C9074d(key, label, testLocator, resetTestLocator, z11, z12);
    }

    @Override // qj0.InterfaceC9075e
    public final boolean a() {
        return this.f82222d;
    }

    @NotNull
    public final Boolean c() {
        return Boolean.valueOf(this.f82221c);
    }

    @NotNull
    public final String d() {
        return this.f82220b;
    }

    @NotNull
    public final String e() {
        return this.f82224f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9074d)) {
            return false;
        }
        C9074d c9074d = (C9074d) obj;
        return Intrinsics.d(this.f82219a, c9074d.f82219a) && Intrinsics.d(this.f82220b, c9074d.f82220b) && this.f82221c == c9074d.f82221c && this.f82222d == c9074d.f82222d && Intrinsics.d(this.f82223e, c9074d.f82223e) && Intrinsics.d(this.f82224f, c9074d.f82224f);
    }

    @NotNull
    public final String f() {
        return this.f82223e;
    }

    @Override // qj0.InterfaceC9075e
    @NotNull
    public final String getKey() {
        return this.f82219a;
    }

    public final int hashCode() {
        return this.f82224f.hashCode() + G.g.a(C3532b.a(C3532b.a(G.g.a(this.f82219a.hashCode() * 31, 31, this.f82220b), 31, this.f82221c), 31, this.f82222d), 31, this.f82223e);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SwitchableConfiguration(key=");
        sb2.append(this.f82219a);
        sb2.append(", label=");
        sb2.append(this.f82220b);
        sb2.append(", currentValue=");
        sb2.append(this.f82221c);
        sb2.append(", isDefault=");
        sb2.append(this.f82222d);
        sb2.append(", testLocator=");
        sb2.append(this.f82223e);
        sb2.append(", resetTestLocator=");
        return o0.c(sb2, this.f82224f, ")");
    }
}
