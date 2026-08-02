package com.inmobi.media;

import defpackage.bf3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.ea, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3389ea {
    private final boolean GPID;

    public /* synthetic */ C3389ea(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }

    public final boolean a() {
        return this.GPID;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3389ea) && this.GPID == ((C3389ea) obj).GPID;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.GPID);
    }

    public final String toString() {
        return bf3.l("IncludeIdParams(GPID=", ")", this.GPID);
    }

    public C3389ea(boolean z) {
        this.GPID = z;
    }

    public C3389ea() {
        this(false, 1, null);
    }
}
