package com.inmobi.media;

import defpackage.bf3;
import defpackage.dmi;
import defpackage.wt3;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.z8, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3931z8 {
    public final ArrayList a;
    public final Map b;
    public final String c;
    public final String d;
    public final boolean e;

    public C3931z8(ArrayList arrayList, Map map, String str, String str2, boolean z) {
        arrayList.getClass();
        map.getClass();
        str.getClass();
        this.a = arrayList;
        this.b = map;
        this.c = str;
        this.d = str2;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3931z8)) {
            return false;
        }
        C3931z8 c3931z8 = (C3931z8) obj;
        return Intrinsics.c(this.a, c3931z8.a) && Intrinsics.c(this.b, c3931z8.b) && Intrinsics.c(this.c, c3931z8.c) && Intrinsics.c(this.d, c3931z8.d) && this.e == c3931z8.e;
    }

    public final int hashCode() {
        int c = dmi.c(dmi.g(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        String str = this.d;
        return Boolean.hashCode(this.e) + ((c + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        ArrayList arrayList = this.a;
        Map map = this.b;
        String str = this.c;
        String str2 = this.d;
        boolean z = this.e;
        StringBuilder sb = new StringBuilder("HybridOmidInfo(omidTrackers=");
        sb.append(arrayList);
        sb.append(", macros=");
        sb.append(map);
        sb.append(", customReferenceData=");
        bf3.v(sb, str, ", contentUrl=", str2, ", isolateVerificationScripts=");
        return wt3.p(sb, z, ")");
    }
}
