package com.inmobi.media;

import defpackage.dmi;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.m6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3592m6 {
    public final ArrayList a;
    public final String b;

    public C3592m6(String str, ArrayList arrayList) {
        arrayList.getClass();
        str.getClass();
        this.a = arrayList;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3592m6)) {
            return false;
        }
        C3592m6 c3592m6 = (C3592m6) obj;
        return Intrinsics.c(this.a, c3592m6.a) && Intrinsics.c(this.b, c3592m6.b);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + dmi.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "EventPayload(eventIDs=" + this.a + ", payload=" + this.b + ", shouldFlushOnFailure=false)";
    }
}
