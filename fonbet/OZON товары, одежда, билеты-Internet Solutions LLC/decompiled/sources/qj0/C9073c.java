package qj0;

import C.o0;
import Kk.C3532b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: qj0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9073c implements InterfaceC9075e<String> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f82213a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f82214b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f82215c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f82216d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f82217e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final String f82218f;

    public C9073c(@NotNull String key, @NotNull String label, @NotNull String currentValue, boolean z11, @NotNull String testLocator, @NotNull String resetTestLocator) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(currentValue, "currentValue");
        Intrinsics.checkNotNullParameter(testLocator, "testLocator");
        Intrinsics.checkNotNullParameter(resetTestLocator, "resetTestLocator");
        this.f82213a = key;
        this.f82214b = label;
        this.f82215c = currentValue;
        this.f82216d = z11;
        this.f82217e = testLocator;
        this.f82218f = resetTestLocator;
    }

    public static C9073c b(C9073c c9073c, String currentValue) {
        String key = c9073c.f82213a;
        String label = c9073c.f82214b;
        boolean z11 = c9073c.f82216d;
        String testLocator = c9073c.f82217e;
        String resetTestLocator = c9073c.f82218f;
        c9073c.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(currentValue, "currentValue");
        Intrinsics.checkNotNullParameter(testLocator, "testLocator");
        Intrinsics.checkNotNullParameter(resetTestLocator, "resetTestLocator");
        return new C9073c(key, label, currentValue, z11, testLocator, resetTestLocator);
    }

    @Override // qj0.InterfaceC9075e
    public final boolean a() {
        return this.f82216d;
    }

    @NotNull
    public final String c() {
        return this.f82215c;
    }

    @NotNull
    public final String d() {
        return this.f82214b;
    }

    @NotNull
    public final String e() {
        return this.f82217e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9073c)) {
            return false;
        }
        C9073c c9073c = (C9073c) obj;
        return Intrinsics.d(this.f82213a, c9073c.f82213a) && Intrinsics.d(this.f82214b, c9073c.f82214b) && Intrinsics.d(this.f82215c, c9073c.f82215c) && this.f82216d == c9073c.f82216d && Intrinsics.d(this.f82217e, c9073c.f82217e) && Intrinsics.d(this.f82218f, c9073c.f82218f);
    }

    @Override // qj0.InterfaceC9075e
    @NotNull
    public final String getKey() {
        return this.f82213a;
    }

    public final int hashCode() {
        return this.f82218f.hashCode() + G.g.a(C3532b.a(G.g.a(G.g.a(this.f82213a.hashCode() * 31, 31, this.f82214b), 31, this.f82215c), 31, this.f82216d), 31, this.f82217e);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntroducedConfiguration(key=");
        sb2.append(this.f82213a);
        sb2.append(", label=");
        sb2.append(this.f82214b);
        sb2.append(", currentValue=");
        sb2.append(this.f82215c);
        sb2.append(", isDefault=");
        sb2.append(this.f82216d);
        sb2.append(", testLocator=");
        sb2.append(this.f82217e);
        sb2.append(", resetTestLocator=");
        return o0.c(sb2, this.f82218f, ")");
    }
}
