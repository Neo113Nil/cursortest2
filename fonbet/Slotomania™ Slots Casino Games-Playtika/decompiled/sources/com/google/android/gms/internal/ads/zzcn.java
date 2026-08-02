package com.google.android.gms.internal.ads;

import io.ktor.sse.ServerSentEventKt;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
public final class zzcn extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzcn(String str, zzcl zzclVar) {
        super(r2.toString());
        String valueOf = String.valueOf(zzclVar);
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(valueOf).length());
        sb.append(str);
        sb.append(ServerSentEventKt.SPACE);
        sb.append(valueOf);
    }
}
