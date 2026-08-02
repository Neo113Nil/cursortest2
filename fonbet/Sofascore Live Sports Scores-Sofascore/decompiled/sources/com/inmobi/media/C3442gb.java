package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.gb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3442gb {
    public final int a;
    public final Integer b;

    public C3442gb(int i) {
        this.a = i;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3442gb)) {
            return false;
        }
        C3442gb c3442gb = (C3442gb) obj;
        return this.a == c3442gb.a && Intrinsics.c(this.b, c3442gb.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "OpenRequestResultData(result=" + this.a + ", errorCode=" + this.b + ")";
    }

    public C3442gb(int i, Integer num) {
        this.a = i;
        this.b = num;
    }
}
