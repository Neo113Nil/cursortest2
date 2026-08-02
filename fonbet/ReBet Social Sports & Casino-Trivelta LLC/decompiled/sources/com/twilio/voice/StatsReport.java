package com.twilio.voice;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class StatsReport {
    private final String peerConnectionId;
    private List<LocalAudioTrackStats> localAudioTrackStats = new ArrayList();
    private List<RemoteAudioTrackStats> remoteAudioTrackStats = new ArrayList();
    private List<IceCandidatePairStats> iceCandidatePairStats = new ArrayList();
    private List<IceCandidateStats> iceCandidateStats = new ArrayList();

    public StatsReport(String str) {
        this.peerConnectionId = str;
    }

    public void addAudioTrackStats(RemoteAudioTrackStats remoteAudioTrackStats) {
        this.remoteAudioTrackStats.add(remoteAudioTrackStats);
    }

    public void addIceCandidatePairStats(IceCandidatePairStats iceCandidatePairStats) {
        this.iceCandidatePairStats.add(iceCandidatePairStats);
    }

    public void addIceCandidateStats(IceCandidateStats iceCandidateStats) {
        this.iceCandidateStats.add(iceCandidateStats);
    }

    public void addLocalAudioTrackStats(LocalAudioTrackStats localAudioTrackStats) {
        this.localAudioTrackStats.add(localAudioTrackStats);
    }

    public List<IceCandidatePairStats> getIceCandidatePairStats() {
        return this.iceCandidatePairStats;
    }

    public List<IceCandidateStats> getIceCandidateStats() {
        return this.iceCandidateStats;
    }

    public List<LocalAudioTrackStats> getLocalAudioTrackStats() {
        return this.localAudioTrackStats;
    }

    public String getPeerConnectionId() {
        return this.peerConnectionId;
    }

    public List<RemoteAudioTrackStats> getRemoteAudioTrackStats() {
        return this.remoteAudioTrackStats;
    }
}
