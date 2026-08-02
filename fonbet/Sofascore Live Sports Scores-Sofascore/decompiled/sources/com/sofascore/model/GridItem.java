package com.sofascore.model;

import androidx.annotation.Nullable;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public class GridItem {
    private String countryCode;
    private final String description;
    private String first;
    private String flag;
    private boolean grayedSecondText;
    private boolean isEnabled;
    private String second;
    private Team team;
    private UniqueTournament tournament;
    private final Type type;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public enum Type {
        BIG_IMAGE,
        IMAGE,
        SPLIT,
        TENNIS_SURFACE,
        MARKET,
        GOLD_LETTER,
        DEFAULT,
        DISABLED_ALL_CAPS
    }

    public GridItem(Type type, String str) {
        this.type = type;
        this.description = str;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public String getDescription() {
        return this.description;
    }

    public String getFirst() {
        return this.first;
    }

    public String getFlag() {
        return this.flag;
    }

    public String getSecond() {
        return this.second;
    }

    @Nullable
    public Team getTeam() {
        return this.team;
    }

    public UniqueTournament getTournament() {
        return this.tournament;
    }

    public Type getType() {
        return this.type;
    }

    public boolean isEnabled() {
        return this.isEnabled;
    }

    public boolean isGrayedSecondText() {
        return this.grayedSecondText;
    }

    public void setCountryCode(String str) {
        this.countryCode = str;
    }

    public void setFirst(String str) {
        this.first = str;
    }

    public void setGrayedSecondText(boolean z) {
        this.grayedSecondText = z;
    }

    public void setIsEnabled(boolean z) {
        this.isEnabled = z;
    }

    public void setSecond(String str) {
        this.second = str;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public void setTournament(UniqueTournament uniqueTournament) {
        this.tournament = uniqueTournament;
    }
}
