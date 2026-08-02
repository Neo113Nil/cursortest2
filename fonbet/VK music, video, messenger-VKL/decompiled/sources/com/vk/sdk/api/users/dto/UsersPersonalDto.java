package com.vk.sdk.api.users.dto;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.sdk.api.database.dto.DatabaseLanguageFullDto;
import java.util.List;
import xsna.epx;
import xsna.mq;
import xsna.pmi0;
import xsna.sq;
import xsna.vq;
import xsna.zcl;

/* compiled from: UsersPersonalDto.kt */
/* loaded from: classes5.dex */
public final class UsersPersonalDto {

    @pmi0("alcohol")
    private final Integer alcohol;

    @pmi0("inspired_by")
    private final String inspiredBy;

    @pmi0("langs")
    private final List<String> langs;

    @pmi0("langs_full")
    private final List<DatabaseLanguageFullDto> langsFull;

    @pmi0("life_main")
    private final Integer lifeMain;

    @pmi0("people_main")
    private final Integer peopleMain;

    @pmi0("political")
    private final Integer political;

    @pmi0("religion")
    private final String religion;

    @pmi0("religion_id")
    private final Integer religionId;

    @pmi0("smoking")
    private final Integer smoking;

    public UsersPersonalDto() {
        this(null, null, null, null, null, null, null, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsersPersonalDto)) {
            return false;
        }
        UsersPersonalDto usersPersonalDto = (UsersPersonalDto) obj;
        return epx.f(this.alcohol, usersPersonalDto.alcohol) && epx.f(this.inspiredBy, usersPersonalDto.inspiredBy) && epx.f(this.langs, usersPersonalDto.langs) && epx.f(this.langsFull, usersPersonalDto.langsFull) && epx.f(this.lifeMain, usersPersonalDto.lifeMain) && epx.f(this.peopleMain, usersPersonalDto.peopleMain) && epx.f(this.political, usersPersonalDto.political) && epx.f(this.religion, usersPersonalDto.religion) && epx.f(this.religionId, usersPersonalDto.religionId) && epx.f(this.smoking, usersPersonalDto.smoking);
    }

    public final int hashCode() {
        Integer num = this.alcohol;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.inspiredBy;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.langs;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<DatabaseLanguageFullDto> list2 = this.langsFull;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num2 = this.lifeMain;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.peopleMain;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.political;
        int hashCode7 = (hashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str2 = this.religion;
        int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num5 = this.religionId;
        int hashCode9 = (hashCode8 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.smoking;
        return hashCode9 + (num6 != null ? num6.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.alcohol;
        String str = this.inspiredBy;
        List<String> list = this.langs;
        List<DatabaseLanguageFullDto> list2 = this.langsFull;
        Integer num2 = this.lifeMain;
        Integer num3 = this.peopleMain;
        Integer num4 = this.political;
        String str2 = this.religion;
        Integer num5 = this.religionId;
        Integer num6 = this.smoking;
        StringBuilder sb = new StringBuilder("UsersPersonalDto(alcohol=");
        sb.append(num);
        sb.append(", inspiredBy=");
        sb.append(str);
        sb.append(", langs=");
        vq.d(sb, list, ", langsFull=", list2, ", lifeMain=");
        sq.b(sb, num2, ", peopleMain=", num3, ", political=");
        mq.b(num4, ", religion=", str2, ", religionId=", sb);
        sb.append(num5);
        sb.append(", smoking=");
        sb.append(num6);
        sb.append(")");
        return sb.toString();
    }

    public UsersPersonalDto(Integer num, String str, List<String> list, List<DatabaseLanguageFullDto> list2, Integer num2, Integer num3, Integer num4, String str2, Integer num5, Integer num6) {
        this.alcohol = num;
        this.inspiredBy = str;
        this.langs = list;
        this.langsFull = list2;
        this.lifeMain = num2;
        this.peopleMain = num3;
        this.political = num4;
        this.religion = str2;
        this.religionId = num5;
        this.smoking = num6;
    }

    public /* synthetic */ UsersPersonalDto(Integer num, String str, List list, List list2, Integer num2, Integer num3, Integer num4, String str2, Integer num5, Integer num6, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : num3, (i & 64) != 0 ? null : num4, (i & 128) != 0 ? null : str2, (i & 256) != 0 ? null : num5, (i & 512) != 0 ? null : num6);
    }
}
