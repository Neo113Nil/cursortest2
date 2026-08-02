package com.google.android.gms.measurement.internal;

import java.util.EnumMap;

/* renamed from: com.google.android.gms.measurement.internal.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3302m {

    /* renamed from: a, reason: collision with root package name */
    public final EnumMap f34157a;

    public C3302m() {
        this.f34157a = new EnumMap(U3.class);
    }

    public static C3302m d(String str) {
        EnumMap enumMap = new EnumMap(U3.class);
        if (str.length() >= U3.values().length) {
            int i10 = 0;
            if (str.charAt(0) == '1') {
                U3[] values = U3.values();
                int length = values.length;
                int i11 = 1;
                while (i10 < length) {
                    enumMap.put((EnumMap) values[i10], (U3) EnumC3294l.a(str.charAt(i11)));
                    i10++;
                    i11++;
                }
                return new C3302m(enumMap);
            }
        }
        return new C3302m();
    }

    public final EnumC3294l a(U3 u32) {
        EnumC3294l enumC3294l = (EnumC3294l) this.f34157a.get(u32);
        return enumC3294l == null ? EnumC3294l.UNSET : enumC3294l;
    }

    public final void b(U3 u32, int i10) {
        EnumC3294l enumC3294l = EnumC3294l.UNSET;
        if (i10 != -30) {
            if (i10 != -20) {
                if (i10 == -10) {
                    enumC3294l = EnumC3294l.MANIFEST;
                } else if (i10 != 0) {
                    if (i10 == 30) {
                        enumC3294l = EnumC3294l.INITIALIZATION;
                    }
                }
            }
            enumC3294l = EnumC3294l.API;
        } else {
            enumC3294l = EnumC3294l.TCF;
        }
        this.f34157a.put((EnumMap) u32, (U3) enumC3294l);
    }

    public final void c(U3 u32, EnumC3294l enumC3294l) {
        this.f34157a.put((EnumMap) u32, (U3) enumC3294l);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("1");
        for (U3 u32 : U3.values()) {
            EnumC3294l enumC3294l = (EnumC3294l) this.f34157a.get(u32);
            if (enumC3294l == null) {
                enumC3294l = EnumC3294l.UNSET;
            }
            sb2.append(enumC3294l.b());
        }
        return sb2.toString();
    }

    public C3302m(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(U3.class);
        this.f34157a = enumMap2;
        enumMap2.putAll(enumMap);
    }
}
