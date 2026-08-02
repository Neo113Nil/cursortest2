package com.vk.sdk.api.account.dto;

import ru.ok.android.api.core.ApiInvocationException;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AccountUserSettingsInterestsDto.kt */
/* loaded from: classes5.dex */
public final class AccountUserSettingsInterestsDto {

    @pmi0("about")
    private final AccountUserSettingsInterestDto about;

    @pmi0("activities")
    private final AccountUserSettingsInterestDto activities;

    @pmi0("books")
    private final AccountUserSettingsInterestDto books;

    @pmi0("games")
    private final AccountUserSettingsInterestDto games;

    @pmi0("interests")
    private final AccountUserSettingsInterestDto interests;

    @pmi0("movies")
    private final AccountUserSettingsInterestDto movies;

    @pmi0("music")
    private final AccountUserSettingsInterestDto music;

    @pmi0("quotes")
    private final AccountUserSettingsInterestDto quotes;

    @pmi0("tv")
    private final AccountUserSettingsInterestDto tv;

    public AccountUserSettingsInterestsDto() {
        this(null, null, null, null, null, null, null, null, null, ApiInvocationException.ErrorCodes.IDS_BLOCKED, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountUserSettingsInterestsDto)) {
            return false;
        }
        AccountUserSettingsInterestsDto accountUserSettingsInterestsDto = (AccountUserSettingsInterestsDto) obj;
        return epx.f(this.activities, accountUserSettingsInterestsDto.activities) && epx.f(this.interests, accountUserSettingsInterestsDto.interests) && epx.f(this.music, accountUserSettingsInterestsDto.music) && epx.f(this.tv, accountUserSettingsInterestsDto.tv) && epx.f(this.movies, accountUserSettingsInterestsDto.movies) && epx.f(this.books, accountUserSettingsInterestsDto.books) && epx.f(this.games, accountUserSettingsInterestsDto.games) && epx.f(this.quotes, accountUserSettingsInterestsDto.quotes) && epx.f(this.about, accountUserSettingsInterestsDto.about);
    }

    public final int hashCode() {
        AccountUserSettingsInterestDto accountUserSettingsInterestDto = this.activities;
        int hashCode = (accountUserSettingsInterestDto == null ? 0 : accountUserSettingsInterestDto.hashCode()) * 31;
        AccountUserSettingsInterestDto accountUserSettingsInterestDto2 = this.interests;
        int hashCode2 = (hashCode + (accountUserSettingsInterestDto2 == null ? 0 : accountUserSettingsInterestDto2.hashCode())) * 31;
        AccountUserSettingsInterestDto accountUserSettingsInterestDto3 = this.music;
        int hashCode3 = (hashCode2 + (accountUserSettingsInterestDto3 == null ? 0 : accountUserSettingsInterestDto3.hashCode())) * 31;
        AccountUserSettingsInterestDto accountUserSettingsInterestDto4 = this.tv;
        int hashCode4 = (hashCode3 + (accountUserSettingsInterestDto4 == null ? 0 : accountUserSettingsInterestDto4.hashCode())) * 31;
        AccountUserSettingsInterestDto accountUserSettingsInterestDto5 = this.movies;
        int hashCode5 = (hashCode4 + (accountUserSettingsInterestDto5 == null ? 0 : accountUserSettingsInterestDto5.hashCode())) * 31;
        AccountUserSettingsInterestDto accountUserSettingsInterestDto6 = this.books;
        int hashCode6 = (hashCode5 + (accountUserSettingsInterestDto6 == null ? 0 : accountUserSettingsInterestDto6.hashCode())) * 31;
        AccountUserSettingsInterestDto accountUserSettingsInterestDto7 = this.games;
        int hashCode7 = (hashCode6 + (accountUserSettingsInterestDto7 == null ? 0 : accountUserSettingsInterestDto7.hashCode())) * 31;
        AccountUserSettingsInterestDto accountUserSettingsInterestDto8 = this.quotes;
        int hashCode8 = (hashCode7 + (accountUserSettingsInterestDto8 == null ? 0 : accountUserSettingsInterestDto8.hashCode())) * 31;
        AccountUserSettingsInterestDto accountUserSettingsInterestDto9 = this.about;
        return hashCode8 + (accountUserSettingsInterestDto9 != null ? accountUserSettingsInterestDto9.hashCode() : 0);
    }

    public final String toString() {
        return "AccountUserSettingsInterestsDto(activities=" + this.activities + ", interests=" + this.interests + ", music=" + this.music + ", tv=" + this.tv + ", movies=" + this.movies + ", books=" + this.books + ", games=" + this.games + ", quotes=" + this.quotes + ", about=" + this.about + ")";
    }

    public AccountUserSettingsInterestsDto(AccountUserSettingsInterestDto accountUserSettingsInterestDto, AccountUserSettingsInterestDto accountUserSettingsInterestDto2, AccountUserSettingsInterestDto accountUserSettingsInterestDto3, AccountUserSettingsInterestDto accountUserSettingsInterestDto4, AccountUserSettingsInterestDto accountUserSettingsInterestDto5, AccountUserSettingsInterestDto accountUserSettingsInterestDto6, AccountUserSettingsInterestDto accountUserSettingsInterestDto7, AccountUserSettingsInterestDto accountUserSettingsInterestDto8, AccountUserSettingsInterestDto accountUserSettingsInterestDto9) {
        this.activities = accountUserSettingsInterestDto;
        this.interests = accountUserSettingsInterestDto2;
        this.music = accountUserSettingsInterestDto3;
        this.tv = accountUserSettingsInterestDto4;
        this.movies = accountUserSettingsInterestDto5;
        this.books = accountUserSettingsInterestDto6;
        this.games = accountUserSettingsInterestDto7;
        this.quotes = accountUserSettingsInterestDto8;
        this.about = accountUserSettingsInterestDto9;
    }

    public /* synthetic */ AccountUserSettingsInterestsDto(AccountUserSettingsInterestDto accountUserSettingsInterestDto, AccountUserSettingsInterestDto accountUserSettingsInterestDto2, AccountUserSettingsInterestDto accountUserSettingsInterestDto3, AccountUserSettingsInterestDto accountUserSettingsInterestDto4, AccountUserSettingsInterestDto accountUserSettingsInterestDto5, AccountUserSettingsInterestDto accountUserSettingsInterestDto6, AccountUserSettingsInterestDto accountUserSettingsInterestDto7, AccountUserSettingsInterestDto accountUserSettingsInterestDto8, AccountUserSettingsInterestDto accountUserSettingsInterestDto9, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : accountUserSettingsInterestDto, (i & 2) != 0 ? null : accountUserSettingsInterestDto2, (i & 4) != 0 ? null : accountUserSettingsInterestDto3, (i & 8) != 0 ? null : accountUserSettingsInterestDto4, (i & 16) != 0 ? null : accountUserSettingsInterestDto5, (i & 32) != 0 ? null : accountUserSettingsInterestDto6, (i & 64) != 0 ? null : accountUserSettingsInterestDto7, (i & 128) != 0 ? null : accountUserSettingsInterestDto8, (i & 256) != 0 ? null : accountUserSettingsInterestDto9);
    }
}
