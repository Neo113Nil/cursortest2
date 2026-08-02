package ru.ozon.android.messenger.framework.presentation.common.popupmenu.compose;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f90869a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f90870b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f90871c;

    public o(@NotNull String itemId, @NotNull String text, boolean z11) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f90869a = itemId;
        this.f90870b = text;
        this.f90871c = z11;
    }

    @NotNull
    public final String a() {
        return this.f90869a;
    }

    @NotNull
    public final String b() {
        return this.f90870b;
    }

    public final boolean c() {
        return this.f90871c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.d(this.f90869a, oVar.f90869a) && Intrinsics.d(this.f90870b, oVar.f90870b) && this.f90871c == oVar.f90871c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f90871c) + G.g.a(this.f90869a.hashCode() * 31, 31, this.f90870b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectedMessage(itemId=");
        sb2.append(this.f90869a);
        sb2.append(", text=");
        sb2.append(this.f90870b);
        sb2.append(", isMine=");
        return Pk0.a.a(")", sb2, this.f90871c);
    }
}
