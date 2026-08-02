package com.moloco.sdk.xenoss.sdkdevkit.android.core.services;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class d {
    public final c a;
    public final g b;
    public final h c;

    public d(c cVar, g gVar, h hVar) {
        gVar.getClass();
        hVar.getClass();
        this.a = cVar;
        this.b = gVar;
        this.c = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.a == dVar.a && Intrinsics.c(this.b, dVar.b) && Intrinsics.c(this.c, dVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Button(buttonType=" + this.a + ", position=" + this.b + ", size=" + this.c + ')';
    }
}
