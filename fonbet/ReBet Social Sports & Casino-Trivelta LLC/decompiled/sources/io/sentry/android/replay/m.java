package io.sentry.android.replay;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public volatile n f51643a = n.INITIAL;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[n.values().length];
            try {
                iArr[n.INITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n.RESUMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[n.PAUSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[n.STOPPED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[n.CLOSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final n a() {
        return this.f51643a;
    }

    public final boolean b(n newState) {
        Intrinsics.checkNotNullParameter(newState, "newState");
        switch (a.$EnumSwitchMapping$0[this.f51643a.ordinal()]) {
            case 1:
                return newState == n.STARTED || newState == n.CLOSED;
            case 2:
                return newState == n.PAUSED || newState == n.STOPPED || newState == n.CLOSED;
            case 3:
                return newState == n.PAUSED || newState == n.STOPPED || newState == n.CLOSED;
            case 4:
                return newState == n.RESUMED || newState == n.STOPPED || newState == n.CLOSED;
            case 5:
                return newState == n.STARTED || newState == n.CLOSED;
            case 6:
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean c() {
        return this.f51643a == n.STARTED || this.f51643a == n.RESUMED;
    }

    public final void d(n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<set-?>");
        this.f51643a = nVar;
    }
}
