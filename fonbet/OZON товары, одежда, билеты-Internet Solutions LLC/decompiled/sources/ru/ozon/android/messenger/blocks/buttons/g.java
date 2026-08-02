package ru.ozon.android.messenger.blocks.buttons;

import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f84424a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f84425b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f84426c;

    public g(@NotNull String text, @NotNull String color, @NotNull String style) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f84424a = text;
        this.f84425b = color;
        this.f84426c = style;
    }

    @NotNull
    public final String a() {
        return this.f84425b;
    }

    @NotNull
    public final String b() {
        return this.f84426c;
    }

    @NotNull
    public final String c() {
        return this.f84424a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f84424a, gVar.f84424a) && Intrinsics.d(this.f84425b, gVar.f84425b) && Intrinsics.d(this.f84426c, gVar.f84426c);
    }

    public final int hashCode() {
        return this.f84426c.hashCode() + G.g.a(this.f84424a.hashCode() * 31, 31, this.f84425b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextVO(text=");
        sb2.append(this.f84424a);
        sb2.append(", color=");
        sb2.append(this.f84425b);
        sb2.append(", style=");
        return o0.c(sb2, this.f84426c, ")");
    }
}
