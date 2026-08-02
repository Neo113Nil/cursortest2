package com.vk.sdk.api.ads.dto;

import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.n6j;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AdsStoriesOwnerDto.kt */
/* loaded from: classes5.dex */
public final class AdsStoriesOwnerDto {

    @pmi0("can_follow")
    private final Boolean canFollow;

    @pmi0("firstName")
    private final String firstName;

    @pmi0("first_name_gen")
    private final String firstNameGen;

    @pmi0("first_name_ins")
    private final String firstNameIns;

    @pmi0("gender")
    private final String gender;

    @pmi0("hash")
    private final String hash;

    @pmi0("href")
    private final String href;

    @pmi0("id")
    private final UserId id;

    @pmi0("name")
    private final String name;

    @pmi0("name_get")
    private final String nameGet;

    @pmi0("photo")
    private final String photo;

    @pmi0("verify")
    private final String verify;

    public AdsStoriesOwnerDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsStoriesOwnerDto)) {
            return false;
        }
        AdsStoriesOwnerDto adsStoriesOwnerDto = (AdsStoriesOwnerDto) obj;
        return epx.f(this.id, adsStoriesOwnerDto.id) && epx.f(this.href, adsStoriesOwnerDto.href) && epx.f(this.name, adsStoriesOwnerDto.name) && epx.f(this.photo, adsStoriesOwnerDto.photo) && epx.f(this.verify, adsStoriesOwnerDto.verify) && epx.f(this.gender, adsStoriesOwnerDto.gender) && epx.f(this.nameGet, adsStoriesOwnerDto.nameGet) && epx.f(this.firstName, adsStoriesOwnerDto.firstName) && epx.f(this.firstNameGen, adsStoriesOwnerDto.firstNameGen) && epx.f(this.firstNameIns, adsStoriesOwnerDto.firstNameIns) && epx.f(this.canFollow, adsStoriesOwnerDto.canFollow) && epx.f(this.hash, adsStoriesOwnerDto.hash);
    }

    public final int hashCode() {
        UserId userId = this.id;
        int hashCode = (userId == null ? 0 : Long.hashCode(userId.b)) * 31;
        String str = this.href;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.photo;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.verify;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.gender;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.nameGet;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.firstName;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.firstNameGen;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.firstNameIns;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Boolean bool = this.canFollow;
        int hashCode11 = (hashCode10 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str10 = this.hash;
        return hashCode11 + (str10 != null ? str10.hashCode() : 0);
    }

    public final String toString() {
        UserId userId = this.id;
        String str = this.href;
        String str2 = this.name;
        String str3 = this.photo;
        String str4 = this.verify;
        String str5 = this.gender;
        String str6 = this.nameGet;
        String str7 = this.firstName;
        String str8 = this.firstNameGen;
        String str9 = this.firstNameIns;
        Boolean bool = this.canFollow;
        String str10 = this.hash;
        StringBuilder sb = new StringBuilder("AdsStoriesOwnerDto(id=");
        sb.append(userId);
        sb.append(", href=");
        sb.append(str);
        sb.append(", name=");
        n6j.b(sb, str2, ", photo=", str3, ", verify=");
        n6j.b(sb, str4, ", gender=", str5, ", nameGet=");
        n6j.b(sb, str6, ", firstName=", str7, ", firstNameGen=");
        n6j.b(sb, str8, ", firstNameIns=", str9, ", canFollow=");
        sb.append(bool);
        sb.append(", hash=");
        sb.append(str10);
        sb.append(")");
        return sb.toString();
    }

    public AdsStoriesOwnerDto(UserId userId, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Boolean bool, String str10) {
        this.id = userId;
        this.href = str;
        this.name = str2;
        this.photo = str3;
        this.verify = str4;
        this.gender = str5;
        this.nameGet = str6;
        this.firstName = str7;
        this.firstNameGen = str8;
        this.firstNameIns = str9;
        this.canFollow = bool;
        this.hash = str10;
    }

    public /* synthetic */ AdsStoriesOwnerDto(UserId userId, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Boolean bool, String str10, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : userId, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : bool, (i & 2048) != 0 ? null : str10);
    }
}
