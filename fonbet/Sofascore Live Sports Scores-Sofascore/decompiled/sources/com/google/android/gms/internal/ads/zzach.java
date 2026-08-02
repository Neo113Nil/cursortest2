package com.google.android.gms.internal.ads;

import defpackage.wt3;
import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzach extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzach(Throwable th) {
        super(wt3.m("Unexpected ", r0, new StringBuilder(r1.length() + r0.length() + 11), r1), th);
        String simpleName = th.getClass().getSimpleName();
        String concat = th.getMessage() != null ? ": ".concat(String.valueOf(th.getMessage())) : "";
    }
}
