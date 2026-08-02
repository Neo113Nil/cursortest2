package io.seon.androidsdk.service;

/* loaded from: classes3.dex */
enum GeolocationProbe$LocationStatus {
    UNKNOWN(-1),
    SUCCESS(0),
    FAIL(1),
    TIMEOUT(2),
    NO_PERMISSION(3),
    NO_PROVIDER(4),
    DISABLED(5),
    NO_SUPPORT(6);

    private final int statusCode;

    GeolocationProbe$LocationStatus(int i10) {
        this.statusCode = i10;
    }

    public int getStatusCode() {
        return this.statusCode;
    }
}
