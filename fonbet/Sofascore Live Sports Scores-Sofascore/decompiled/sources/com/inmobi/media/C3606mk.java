package com.inmobi.media;

import defpackage.bf3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.mk, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3606mk {
    public final String a;
    public final String b;

    public C3606mk(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3606mk)) {
            return false;
        }
        C3606mk c3606mk = (C3606mk) obj;
        return Intrinsics.c(this.a, c3606mk.a) && Intrinsics.c(this.b, c3606mk.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return bf3.k("TableInfo(tableName=", this.a, ", tableSchema=", this.b, ")");
    }
}
