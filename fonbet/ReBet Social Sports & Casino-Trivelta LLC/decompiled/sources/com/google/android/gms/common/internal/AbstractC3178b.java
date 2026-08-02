package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.internal.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3178b {
    public static com.google.android.gms.common.api.b a(Status status) {
        return status.k() ? new com.google.android.gms.common.api.j(status) : new com.google.android.gms.common.api.b(status);
    }
}
