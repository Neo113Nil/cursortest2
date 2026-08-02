package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.th, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3784th extends AbstractC3836vh {
    public final int a;
    public final String b;

    public C3784th(String str, int i) {
        str.getClass();
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3784th)) {
            return false;
        }
        C3784th c3784th = (C3784th) obj;
        return this.a == c3784th.a && Intrinsics.c(this.b, c3784th.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return com.appsflyer.internal.i.g(this.a, "Failure(statusCode=", ", message=", this.b, ")");
    }
}
