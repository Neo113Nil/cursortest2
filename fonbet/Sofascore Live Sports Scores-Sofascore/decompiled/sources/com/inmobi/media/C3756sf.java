package com.inmobi.media;

import defpackage.bf3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.sf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3756sf {
    public final String a;
    public final String b;

    public C3756sf(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3756sf)) {
            return false;
        }
        C3756sf c3756sf = (C3756sf) obj;
        return Intrinsics.c(this.a, c3756sf.a) && Intrinsics.c(this.b, c3756sf.b);
    }

    public final int hashCode() {
        return ((this.b.hashCode() + (((this.a.hashCode() * 31) + 102684) * 31)) * 31) - 1183962098;
    }

    public final String toString() {
        return bf3.k("NovatiqData(hyperId=", this.a, ", sspId=i6i, spHost=", this.b, ", pubId=inmobi)");
    }
}
