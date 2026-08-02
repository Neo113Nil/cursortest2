package ru.ozon.android.messenger.framework.presentation.common.popupmenu.compose;

import Kk.C3532b;
import N3.C3660k;
import S0.InterfaceC3967k;
import Z1.q;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final long f90865a;

    /* renamed from: b, reason: collision with root package name */
    private final long f90866b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f90867c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C4912a f90868d;

    private n() {
        throw null;
    }

    public n(long j11, long j12, boolean z11, C4912a bubbleContent) {
        Intrinsics.checkNotNullParameter(bubbleContent, "bubbleContent");
        this.f90865a = j11;
        this.f90866b = j12;
        this.f90867c = z11;
        this.f90868d = bubbleContent;
    }

    @NotNull
    public final Function2<InterfaceC3967k, Integer, Unit> a() {
        return this.f90868d;
    }

    public final long b() {
        return this.f90865a;
    }

    public final long c() {
        return this.f90866b;
    }

    public final boolean d() {
        return this.f90867c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Z1.m.c(this.f90865a, nVar.f90865a) && q.c(this.f90866b, nVar.f90866b) && this.f90867c == nVar.f90867c && Intrinsics.d(this.f90868d, nVar.f90868d);
    }

    public final int hashCode() {
        return this.f90868d.hashCode() + C3532b.a(Pk0.c.a(Long.hashCode(this.f90865a) * 31, 31, this.f90866b), 31, this.f90867c);
    }

    @NotNull
    public final String toString() {
        StringBuilder d11 = C3660k.d("MessageContextMenuState(bubbleOffsetInWindow=", Z1.m.f(this.f90865a), ", bubbleSize=", q.d(this.f90866b), ", isMine=");
        d11.append(this.f90867c);
        d11.append(", bubbleContent=");
        d11.append(this.f90868d);
        d11.append(")");
        return d11.toString();
    }
}
