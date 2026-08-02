package com.vk.sdk.api.account.dto;

import com.vk.sdk.api.base.dto.BaseBoolIntDto;
import xsna.epx;
import xsna.pmi0;
import xsna.to;
import xsna.zcl;

/* compiled from: AccountInfoDto.kt */
/* loaded from: classes5.dex */
public final class AccountInfoDto {

    /* renamed from: 2faRequired, reason: not valid java name */
    @pmi0("2fa_required")
    private final BaseBoolIntDto f332faRequired;

    @pmi0("country")
    private final String country;

    @pmi0("https_required")
    private final BaseBoolIntDto httpsRequired;

    @pmi0("intro")
    private final BaseBoolIntDto intro;

    @pmi0("lang")
    private final Integer lang;

    @pmi0("no_wall_replies")
    private final BaseBoolIntDto noWallReplies;

    @pmi0("own_posts_default")
    private final BaseBoolIntDto ownPostsDefault;

    public AccountInfoDto() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountInfoDto)) {
            return false;
        }
        AccountInfoDto accountInfoDto = (AccountInfoDto) obj;
        return this.f332faRequired == accountInfoDto.f332faRequired && epx.f(this.country, accountInfoDto.country) && this.httpsRequired == accountInfoDto.httpsRequired && this.intro == accountInfoDto.intro && epx.f(this.lang, accountInfoDto.lang) && this.noWallReplies == accountInfoDto.noWallReplies && this.ownPostsDefault == accountInfoDto.ownPostsDefault;
    }

    public final int hashCode() {
        BaseBoolIntDto baseBoolIntDto = this.f332faRequired;
        int hashCode = (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode()) * 31;
        String str = this.country;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto2 = this.httpsRequired;
        int hashCode3 = (hashCode2 + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto3 = this.intro;
        int hashCode4 = (hashCode3 + (baseBoolIntDto3 == null ? 0 : baseBoolIntDto3.hashCode())) * 31;
        Integer num = this.lang;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto4 = this.noWallReplies;
        int hashCode6 = (hashCode5 + (baseBoolIntDto4 == null ? 0 : baseBoolIntDto4.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto5 = this.ownPostsDefault;
        return hashCode6 + (baseBoolIntDto5 != null ? baseBoolIntDto5.hashCode() : 0);
    }

    public final String toString() {
        BaseBoolIntDto baseBoolIntDto = this.f332faRequired;
        String str = this.country;
        BaseBoolIntDto baseBoolIntDto2 = this.httpsRequired;
        BaseBoolIntDto baseBoolIntDto3 = this.intro;
        Integer num = this.lang;
        BaseBoolIntDto baseBoolIntDto4 = this.noWallReplies;
        BaseBoolIntDto baseBoolIntDto5 = this.ownPostsDefault;
        StringBuilder sb = new StringBuilder("AccountInfoDto(2faRequired=");
        sb.append(baseBoolIntDto);
        sb.append(", country=");
        sb.append(str);
        sb.append(", httpsRequired=");
        to.b(sb, baseBoolIntDto2, ", intro=", baseBoolIntDto3, ", lang=");
        sb.append(num);
        sb.append(", noWallReplies=");
        sb.append(baseBoolIntDto4);
        sb.append(", ownPostsDefault=");
        sb.append(baseBoolIntDto5);
        sb.append(")");
        return sb.toString();
    }

    public AccountInfoDto(BaseBoolIntDto baseBoolIntDto, String str, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, Integer num, BaseBoolIntDto baseBoolIntDto4, BaseBoolIntDto baseBoolIntDto5) {
        this.f332faRequired = baseBoolIntDto;
        this.country = str;
        this.httpsRequired = baseBoolIntDto2;
        this.intro = baseBoolIntDto3;
        this.lang = num;
        this.noWallReplies = baseBoolIntDto4;
        this.ownPostsDefault = baseBoolIntDto5;
    }

    public /* synthetic */ AccountInfoDto(BaseBoolIntDto baseBoolIntDto, String str, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, Integer num, BaseBoolIntDto baseBoolIntDto4, BaseBoolIntDto baseBoolIntDto5, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : baseBoolIntDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : baseBoolIntDto2, (i & 8) != 0 ? null : baseBoolIntDto3, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : baseBoolIntDto4, (i & 64) != 0 ? null : baseBoolIntDto5);
    }
}
