package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class j {
    public final String a;
    public final Integer b;
    public final String c;
    public final String d;
    public final m e;

    public j(String str, Integer num, String str2, String str3, m mVar) {
        this.a = str;
        this.b = num;
        this.c = str2;
        this.d = str3;
        this.e = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.c(this.a, jVar.a) && Intrinsics.c(this.b, jVar.b) && Intrinsics.c(this.c, jVar.c) && Intrinsics.c(this.d, jVar.d) && this.e.equals(jVar.e);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return this.e.hashCode() + ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Creative(id=" + this.a + ", sequence=" + this.b + ", adId=" + this.c + ", apiFramework=" + this.d + ", child=" + this.e + ')';
    }
}
