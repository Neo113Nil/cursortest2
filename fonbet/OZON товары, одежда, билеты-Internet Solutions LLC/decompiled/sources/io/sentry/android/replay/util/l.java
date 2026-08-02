package io.sentry.android.replay.util;

import B4.V;
import Sc.C;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final C7807Z f67687a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f67688b;

    public l(C7807Z c7807z, boolean z11) {
        this.f67687a = c7807z;
        this.f67688b = z11;
    }

    public final C7807Z a() {
        return this.f67687a;
    }

    public final boolean b() {
        return this.f67688b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.d(this.f67687a, lVar.f67687a) && this.f67688b == lVar.f67688b;
    }

    public final int hashCode() {
        int hashCode;
        C7807Z c7807z = this.f67687a;
        if (c7807z == null) {
            hashCode = 0;
        } else {
            long w11 = c7807z.w();
            C.Companion companion = C.INSTANCE;
            hashCode = Long.hashCode(w11);
        }
        return Boolean.hashCode(this.f67688b) + (hashCode * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextAttributes(color=");
        sb2.append(this.f67687a);
        sb2.append(", hasFillModifier=");
        return V.d(sb2, this.f67688b, ')');
    }
}
