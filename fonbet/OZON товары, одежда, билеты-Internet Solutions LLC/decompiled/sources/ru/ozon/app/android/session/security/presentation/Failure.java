package ru.ozon.app.android.session.security.presentation;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/session/security/presentation/Failure;", "Lru/ozon/app/android/session/security/presentation/UserAuthBiometryEvent;", "biometryEnabled", "", "<init>", "(Z)V", "getBiometryEnabled", "()Z", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Failure implements UserAuthBiometryEvent {
    private final boolean biometryEnabled;

    public Failure(boolean z11) {
        this.biometryEnabled = z11;
    }

    public boolean getBiometryEnabled() {
        return this.biometryEnabled;
    }
}
