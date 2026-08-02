package com.inmobi.media;

import defpackage.dmi;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.t0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3767t0 {
    public final C3742s1 a;
    public final String b;
    public final Boolean c;
    public final String d;
    public final byte e;
    public final String f;

    public C3767t0(C3742s1 c3742s1, String str, Boolean bool, String str2, byte b, String str3) {
        c3742s1.getClass();
        this.a = c3742s1;
        this.b = str;
        this.c = bool;
        this.d = str2;
        this.e = b;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3767t0)) {
            return false;
        }
        C3767t0 c3767t0 = (C3767t0) obj;
        return Intrinsics.c(this.a, c3767t0.a) && Intrinsics.c(this.b, c3767t0.b) && Intrinsics.c(this.c, c3767t0.c) && Intrinsics.c(this.d, c3767t0.d) && this.e == c3767t0.e && Intrinsics.c(this.f, c3767t0.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.c;
        int hashCode3 = (Byte.hashCode(this.e) + dmi.c((hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.d)) * 31;
        String str2 = this.f;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        C3742s1 c3742s1 = this.a;
        String str = this.b;
        Boolean bool = this.c;
        String str2 = this.d;
        byte b = this.e;
        return "AdNotReadyMetadata(adUnitTelemetry=" + c3742s1 + ", creativeType=" + str + ", isRewarded=" + bool + ", markupType=" + str2 + ", adState=" + ((int) b) + ", impressionId=" + this.f + ")";
    }
}
