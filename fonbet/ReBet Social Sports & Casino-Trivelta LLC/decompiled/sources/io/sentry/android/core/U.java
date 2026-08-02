package io.sentry.android.core;

import io.sentry.F3;
import io.sentry.P;

/* loaded from: classes3.dex */
public final class U implements io.sentry.transport.q {

    /* renamed from: a, reason: collision with root package name */
    public final F3 f50849a;

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$io$sentry$IConnectionStatusProvider$ConnectionStatus;

        static {
            int[] iArr = new int[P.a.values().length];
            $SwitchMap$io$sentry$IConnectionStatusProvider$ConnectionStatus = iArr;
            try {
                iArr[P.a.CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$sentry$IConnectionStatusProvider$ConnectionStatus[P.a.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$sentry$IConnectionStatusProvider$ConnectionStatus[P.a.NO_PERMISSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public U(F3 f32) {
        this.f50849a = f32;
    }

    public boolean a(P.a aVar) {
        int i10 = a.$SwitchMap$io$sentry$IConnectionStatusProvider$ConnectionStatus[aVar.ordinal()];
        return i10 == 1 || i10 == 2 || i10 == 3;
    }

    @Override // io.sentry.transport.q
    public boolean isConnected() {
        return a(this.f50849a.getConnectionStatusProvider().s0());
    }
}
