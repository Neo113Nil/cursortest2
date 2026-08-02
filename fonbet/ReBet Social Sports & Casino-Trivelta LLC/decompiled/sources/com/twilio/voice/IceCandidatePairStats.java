package com.twilio.voice;

import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public class IceCandidatePairStats {
    public final boolean activeCandidatePair;
    public final double availableIncomingBitrate;
    public final double availableOutgoingBitrate;
    public final long bytesReceived;
    public final long bytesSent;
    public final long consentRequestsReceived;
    public final long consentRequestsSent;
    public final long consentResponsesReceived;
    public final long consentResponsesSent;
    public final double currentRoundTripTime;

    @NonNull
    public final String localCandidateId;

    @NonNull
    public final String localCandidateIp;
    public final boolean nominated;
    public final long priority;
    public final boolean readable;

    @NonNull
    public final String relayProtocol;

    @NonNull
    public final String remoteCandidateId;

    @NonNull
    public final String remoteCandidateIp;
    public final long requestsReceived;
    public final long requestsSent;
    public final long responsesReceived;
    public final long responsesSent;
    public final long retransmissionsReceived;
    public final long retransmissionsSent;

    @NonNull
    public final IceCandidatePairState state;
    public final double totalRoundTripTime;

    @NonNull
    public final String transportId;
    public final boolean writeable;

    public IceCandidatePairStats(String str, String str2, String str3, IceCandidatePairState iceCandidatePairState, String str4, String str5, long j10, boolean z10, boolean z11, boolean z12, long j11, long j12, double d10, double d11, double d12, double d13, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, boolean z13, String str6) {
        this.transportId = str;
        this.localCandidateId = str2;
        this.remoteCandidateId = str3;
        this.state = iceCandidatePairState;
        this.localCandidateIp = str4;
        this.remoteCandidateIp = str5;
        this.priority = j10;
        this.nominated = z10;
        this.writeable = z11;
        this.readable = z12;
        this.bytesSent = j11;
        this.bytesReceived = j12;
        this.totalRoundTripTime = d10;
        this.currentRoundTripTime = d11;
        Logger.getLogger(IceCandidatePairStats.class).d("stats.current_round_trip_time " + d11);
        this.availableOutgoingBitrate = d12;
        this.availableIncomingBitrate = d13;
        this.requestsReceived = j13;
        this.requestsSent = j14;
        this.responsesReceived = j15;
        this.responsesSent = j16;
        this.retransmissionsReceived = j17;
        this.retransmissionsSent = j18;
        this.consentRequestsReceived = j19;
        this.consentRequestsSent = j20;
        this.consentResponsesReceived = j21;
        this.consentResponsesSent = j22;
        this.activeCandidatePair = z13;
        this.relayProtocol = str6;
    }
}
