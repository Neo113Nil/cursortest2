package ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.presentation;

import Kk.C3532b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final y f86901a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f86902b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f86903c;

    public i() {
        this(0);
    }

    public static i a(i iVar, y yVar, boolean z11, boolean z12, int i11) {
        if ((i11 & 1) != 0) {
            yVar = iVar.f86901a;
        }
        if ((i11 & 2) != 0) {
            z11 = iVar.f86902b;
        }
        if ((i11 & 4) != 0) {
            z12 = iVar.f86903c;
        }
        iVar.getClass();
        return new i(yVar, z11, z12);
    }

    public final y b() {
        return this.f86901a;
    }

    public final boolean c() {
        return this.f86903c;
    }

    public final boolean d() {
        return this.f86902b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.f86901a, iVar.f86901a) && this.f86902b == iVar.f86902b && this.f86903c == iVar.f86903c;
    }

    public final int hashCode() {
        y yVar = this.f86901a;
        return Boolean.hashCode(this.f86903c) + C3532b.a((yVar == null ? 0 : yVar.hashCode()) * 31, 31, this.f86902b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FastAnswerInputState(inputData=");
        sb2.append(this.f86901a);
        sb2.append(", isInputValueLocalError=");
        sb2.append(this.f86902b);
        sb2.append(", isInProgress=");
        return Pk0.a.a(")", sb2, this.f86903c);
    }

    public /* synthetic */ i(int i11) {
        this(null, false, false);
    }

    public i(y yVar, boolean z11, boolean z12) {
        this.f86901a = yVar;
        this.f86902b = z11;
        this.f86903c = z12;
    }
}
