package com.sofascore.model.network.post;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public class RegistrationPost implements Serializable {
    private String devMod;
    private String deviceType;
    private Set<Integer> events;
    private String language;
    private Set<Integer> leagues;
    private int mcc;
    private long muteUntil;
    private Set<Integer> mutedEvents;
    private HashMap<String, List<String>> notifications;
    private Set<Integer> pinnedLeagues;
    private Set<Integer> players;
    private ProviderPost provider;
    private String registrationId;
    private int sdk;
    private Set<Integer> stages;
    private boolean sync;
    private Set<Integer> teams;
    private int timezone;
    private String uuid;
    private int version;

    public void setDevMod(String str) {
        this.devMod = str;
    }

    public void setDeviceType(String str) {
        this.deviceType = str;
    }

    public void setEvents(Set<Integer> set) {
        this.events = set;
    }

    public void setLanguage(String str) {
        this.language = str;
    }

    public void setLeagues(Set<Integer> set) {
        this.leagues = set;
    }

    public void setMcc(int i) {
        this.mcc = i;
    }

    public void setMuteUntil(long j) {
        this.muteUntil = j;
    }

    public void setMutedEvents(Set<Integer> set) {
        this.mutedEvents = set;
    }

    public void setNotifications(HashMap<String, List<String>> hashMap) {
        this.notifications = hashMap;
    }

    public void setPinnedLeagues(Set<Integer> set) {
        this.pinnedLeagues = set;
    }

    public void setPlayers(Set<Integer> set) {
        this.players = set;
    }

    public void setProvider(ProviderPost providerPost) {
        this.provider = providerPost;
    }

    public void setRegistrationId(String str) {
        this.registrationId = str;
    }

    public void setSdk(int i) {
        this.sdk = i;
    }

    public void setStages(Set<Integer> set) {
        this.stages = set;
    }

    public void setSync(boolean z) {
        this.sync = z;
    }

    public void setTeams(Set<Integer> set) {
        this.teams = set;
    }

    public void setTimezone(int i) {
        this.timezone = i;
    }

    public void setUuid(String str) {
        this.uuid = str;
    }

    public void setVersion(int i) {
        this.version = i;
    }
}
