package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC3294l {
    UNSET('0'),
    REMOTE_DEFAULT('1'),
    REMOTE_DELEGATION('2'),
    MANIFEST('3'),
    INITIALIZATION('4'),
    API('5'),
    CHILD_ACCOUNT('6'),
    TCF('7'),
    REMOTE_ENFORCED_DEFAULT('8'),
    FAILSAFE('9');


    /* renamed from: a, reason: collision with root package name */
    public final char f34101a;

    EnumC3294l(char c10) {
        this.f34101a = c10;
    }

    public static EnumC3294l a(char c10) {
        for (EnumC3294l enumC3294l : values()) {
            if (enumC3294l.f34101a == c10) {
                return enumC3294l;
            }
        }
        return UNSET;
    }

    public final /* synthetic */ char b() {
        return this.f34101a;
    }
}
