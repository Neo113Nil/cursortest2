package com.agontuk.RNFusedLocation;

/* loaded from: classes.dex */
public enum d {
    PERMISSION_DENIED(1),
    POSITION_UNAVAILABLE(2),
    TIMEOUT(3),
    PLAY_SERVICE_NOT_AVAILABLE(4),
    SETTINGS_NOT_SATISFIED(5),
    INTERNAL_ERROR(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f28316a;

    d(int i10) {
        this.f28316a = i10;
    }

    public int b() {
        return this.f28316a;
    }
}
