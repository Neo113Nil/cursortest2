package com.ironsource;

import com.ironsource.C4278r0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class J {

    @NotNull
    private C4278r0.a a;

    public J(@NotNull C4278r0.a aVar) {
        aVar.getClass();
        this.a = aVar;
    }

    public static /* synthetic */ J a(J j, C4278r0.a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = j.a;
        }
        return j.a(aVar);
    }

    public final void b(@NotNull C4278r0.a aVar) {
        aVar.getClass();
        this.a = aVar;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof J) && this.a == ((J) obj).a;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public String toString() {
        return "AdInstancePerformance(performance=" + this.a + ")";
    }

    @NotNull
    public final C4278r0.a b() {
        return this.a;
    }

    @NotNull
    public final J a(@NotNull C4278r0.a aVar) {
        aVar.getClass();
        return new J(aVar);
    }

    @NotNull
    public final C4278r0.a a() {
        return this.a;
    }
}
