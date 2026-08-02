package org.chromium.net.impl;

import android.net.http.CallbackException;
import android.net.http.DnsOptions;

/* renamed from: org.chromium.net.impl.k, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* synthetic */ class C8772k {
    public static /* synthetic */ DnsOptions.Builder a() {
        return new DnsOptions.Builder();
    }

    public static /* bridge */ /* synthetic */ boolean b(Exception exc) {
        return exc instanceof CallbackException;
    }
}
