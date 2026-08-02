package io.sentry.android.replay;

import eg.f0;
import eg.g0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class p implements q4.c {

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f16068a;

    public boolean a(q newState) {
        Intrinsics.checkNotNullParameter(newState, "newState");
        switch (o.$EnumSwitchMapping$0[((q) this.f16068a).ordinal()]) {
            case 1:
                return newState == q.STARTED || newState == q.CLOSED;
            case 2:
                return newState == q.PAUSED || newState == q.STOPPED || newState == q.CLOSED;
            case 3:
                return newState == q.PAUSED || newState == q.STOPPED || newState == q.CLOSED;
            case 4:
                return newState == q.RESUMED || newState == q.STOPPED || newState == q.CLOSED;
            case 5:
                return newState == q.STARTED || newState == q.CLOSED;
            case 6:
                return false;
            default:
                throw new gf.m();
        }
    }

    @Override // q4.c
    public f0 o() {
        return (g0) this.f16068a;
    }
}
