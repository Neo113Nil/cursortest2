package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.f5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC3252f5 {
    GOOGLE_ANALYTICS(0),
    GOOGLE_SIGNAL(1),
    SGTM(2),
    SGTM_CLIENT(3),
    GOOGLE_SIGNAL_PENDING(4),
    UNKNOWN(99);


    /* renamed from: a, reason: collision with root package name */
    public final int f34018a;

    EnumC3252f5(int i10) {
        this.f34018a = i10;
    }

    public static EnumC3252f5 a(int i10) {
        for (EnumC3252f5 enumC3252f5 : values()) {
            if (enumC3252f5.f34018a == i10) {
                return enumC3252f5;
            }
        }
        return UNKNOWN;
    }

    public final int zza() {
        return this.f34018a;
    }
}
