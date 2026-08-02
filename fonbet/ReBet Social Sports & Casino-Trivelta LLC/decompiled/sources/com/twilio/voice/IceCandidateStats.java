package com.twilio.voice;

import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public class IceCandidateStats {

    @NonNull
    public final String candidateType;
    public final boolean deleted;

    @NonNull
    public final String ip;
    public final boolean isRemote;
    public final int port;
    public final int priority;

    @NonNull
    public final String protocol;

    @NonNull
    public final String transportId;
    public final String url;

    public IceCandidateStats(@NonNull String str, boolean z10, @NonNull String str2, int i10, @NonNull String str3, @NonNull String str4, int i11, String str5, boolean z11) {
        this.transportId = str;
        this.isRemote = z10;
        this.ip = str2;
        this.port = i10;
        this.protocol = str3;
        this.candidateType = str4;
        this.priority = i11;
        this.url = str5;
        this.deleted = z11;
    }
}
