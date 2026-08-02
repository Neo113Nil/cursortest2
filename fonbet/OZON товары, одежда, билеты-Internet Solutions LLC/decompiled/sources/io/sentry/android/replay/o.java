package io.sentry.android.replay;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private volatile p f67599a = p.INITIAL;

    /* loaded from: classes10.dex */
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f67600a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.INITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.RESUMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[p.PAUSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[p.STOPPED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[p.CLOSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f67600a = iArr;
        }
    }

    @NotNull
    public final p a() {
        return this.f67599a;
    }

    public final boolean b(@NotNull p newState) {
        Intrinsics.checkNotNullParameter(newState, "newState");
        switch (a.f67600a[this.f67599a.ordinal()]) {
            case 1:
                return newState == p.STARTED || newState == p.CLOSED;
            case 2:
                return newState == p.PAUSED || newState == p.STOPPED || newState == p.CLOSED;
            case 3:
                return newState == p.PAUSED || newState == p.STOPPED || newState == p.CLOSED;
            case 4:
                return newState == p.RESUMED || newState == p.STOPPED || newState == p.CLOSED;
            case 5:
                return newState == p.STARTED || newState == p.CLOSED;
            case 6:
                return false;
            default:
                throw new Sc.o();
        }
    }

    public final boolean c() {
        return this.f67599a == p.STARTED || this.f67599a == p.RESUMED;
    }

    public final void d(@NotNull p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<set-?>");
        this.f67599a = pVar;
    }
}
