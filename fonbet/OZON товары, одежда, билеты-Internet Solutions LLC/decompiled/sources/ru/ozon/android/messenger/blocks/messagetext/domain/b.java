package ru.ozon.android.messenger.blocks.messagetext.domain;

import B0.C2454a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.messagetext.MessageTextDTO;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final MessageTextDTO.MessageTextType f85857a;

    /* renamed from: b, reason: collision with root package name */
    private final int f85858b;

    /* renamed from: c, reason: collision with root package name */
    private int f85859c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f85860d;

    public b(MessageTextDTO.MessageTextType item, int i11) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f85857a = item;
        this.f85858b = i11;
        this.f85859c = -1;
        this.f85860d = false;
    }

    public final boolean a() {
        return this.f85860d;
    }

    @NotNull
    public final MessageTextDTO.MessageTextType b() {
        return this.f85857a;
    }

    public final int c() {
        return this.f85858b;
    }

    public final int d() {
        return this.f85859c;
    }

    public final void e() {
        this.f85860d = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f85857a.equals(bVar.f85857a) && this.f85858b == bVar.f85858b && this.f85859c == bVar.f85859c && this.f85860d == bVar.f85860d;
    }

    public final void f(int i11) {
        this.f85859c = i11;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f85860d) + C2454a.a(this.f85859c, C2454a.a(this.f85858b, this.f85857a.hashCode() * 31, 31), 31);
    }

    @NotNull
    public final String toString() {
        int i11 = this.f85859c;
        boolean z11 = this.f85860d;
        StringBuilder sb2 = new StringBuilder("TextNode(item=");
        sb2.append(this.f85857a);
        sb2.append(", level=");
        Ek.a.f(this.f85858b, i11, ", number=", ", hasBullet=", sb2);
        return Pk0.a.a(")", sb2, z11);
    }
}
