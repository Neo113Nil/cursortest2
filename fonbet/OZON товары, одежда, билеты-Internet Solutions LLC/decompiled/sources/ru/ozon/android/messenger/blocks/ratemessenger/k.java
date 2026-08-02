package ru.ozon.android.messenger.blocks.ratemessenger;

import Kk.C3532b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f86141a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f86142b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f86143c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f86144d;

    public k(String text, String imageUrl, boolean z11) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        this.f86141a = text;
        this.f86142b = imageUrl;
        this.f86143c = z11;
        this.f86144d = false;
    }

    @NotNull
    public final String a() {
        return this.f86142b;
    }

    @NotNull
    public final String b() {
        return this.f86141a;
    }

    public final boolean c() {
        return this.f86143c;
    }

    public final boolean d() {
        return this.f86144d;
    }

    public final void e(boolean z11) {
        this.f86144d = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.d(this.f86141a, kVar.f86141a) && Intrinsics.d(this.f86142b, kVar.f86142b) && this.f86143c == kVar.f86143c && this.f86144d == kVar.f86144d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f86144d) + C3532b.a(G.g.a(this.f86141a.hashCode() * 31, 31, this.f86142b), 31, this.f86143c);
    }

    @NotNull
    public final String toString() {
        return "ReasonVO(text=" + this.f86141a + ", imageUrl=" + this.f86142b + ", isMessageRequired=" + this.f86143c + ", isSelected=" + this.f86144d + ")";
    }
}
