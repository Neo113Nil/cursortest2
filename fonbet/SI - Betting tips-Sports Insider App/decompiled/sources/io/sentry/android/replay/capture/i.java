package io.sentry.android.replay.capture;

import io.sentry.b1;
import io.sentry.d6;
import io.sentry.h0;
import io.sentry.o3;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i extends k {

    /* renamed from: a, reason: collision with root package name */
    public final d6 f16007a;

    /* renamed from: b, reason: collision with root package name */
    public final o3 f16008b;

    public i(d6 replay, o3 recording) {
        Intrinsics.checkNotNullParameter(replay, "replay");
        Intrinsics.checkNotNullParameter(recording, "recording");
        this.f16007a = replay;
        this.f16008b = recording;
    }

    public static void a(i iVar, b1 b1Var) {
        h0 hint = new h0();
        iVar.getClass();
        Intrinsics.checkNotNullParameter(hint, "hint");
        if (b1Var != null) {
            d6 d6Var = iVar.f16007a;
            hint.f16451g = iVar.f16008b;
            Unit unit = Unit.f19194a;
            b1Var.x(d6Var, hint);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.areEqual(this.f16007a, iVar.f16007a) && Intrinsics.areEqual(this.f16008b, iVar.f16008b);
    }

    public final int hashCode() {
        return this.f16008b.hashCode() + (this.f16007a.hashCode() * 31);
    }

    public final String toString() {
        return "Created(replay=" + this.f16007a + ", recording=" + this.f16008b + ')';
    }
}
