package com.moloco.sdk.internal.ortb.model;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class h {
    public static final String a(C2791e c2791e) {
        Intrinsics.checkNotNullParameter(c2791e, "<this>");
        String mtid = c2791e.getExt().getMtid();
        return mtid == null ? "UNKNOWN_MTID" : mtid;
    }
}
