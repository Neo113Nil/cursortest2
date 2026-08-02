package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
public enum S3 {
    UNINITIALIZED("uninitialized"),
    POLICY("eu_consent_policy"),
    DENIED("denied"),
    GRANTED("granted");


    /* renamed from: a, reason: collision with root package name */
    public final String f33619a;

    S3(String str) {
        this.f33619a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f33619a;
    }
}
