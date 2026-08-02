package com.vk.sdk.api.wall.dto;

import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.mq;
import xsna.n6j;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: WallGraffitiDto.kt */
/* loaded from: classes5.dex */
public final class WallGraffitiDto {

    @pmi0("access_key")
    private final String accessKey;

    @pmi0("height")
    private final Integer height;

    @pmi0("id")
    private final Integer id;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("photo_200")
    private final String photo200;

    @pmi0("photo_586")
    private final String photo586;

    @pmi0("url")
    private final String url;

    @pmi0("width")
    private final Integer width;

    public WallGraffitiDto() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallGraffitiDto)) {
            return false;
        }
        WallGraffitiDto wallGraffitiDto = (WallGraffitiDto) obj;
        return epx.f(this.id, wallGraffitiDto.id) && epx.f(this.ownerId, wallGraffitiDto.ownerId) && epx.f(this.photo200, wallGraffitiDto.photo200) && epx.f(this.photo586, wallGraffitiDto.photo586) && epx.f(this.height, wallGraffitiDto.height) && epx.f(this.url, wallGraffitiDto.url) && epx.f(this.width, wallGraffitiDto.width) && epx.f(this.accessKey, wallGraffitiDto.accessKey);
    }

    public final int hashCode() {
        Integer num = this.id;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        UserId userId = this.ownerId;
        int hashCode2 = (hashCode + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        String str = this.photo200;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.photo586;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.height;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.url;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num3 = this.width;
        int hashCode7 = (hashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str4 = this.accessKey;
        return hashCode7 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.id;
        UserId userId = this.ownerId;
        String str = this.photo200;
        String str2 = this.photo586;
        Integer num2 = this.height;
        String str3 = this.url;
        Integer num3 = this.width;
        String str4 = this.accessKey;
        StringBuilder sb = new StringBuilder("WallGraffitiDto(id=");
        sb.append(num);
        sb.append(", ownerId=");
        sb.append(userId);
        sb.append(", photo200=");
        n6j.b(sb, str, ", photo586=", str2, ", height=");
        mq.b(num2, ", url=", str3, ", width=", sb);
        sb.append(num3);
        sb.append(", accessKey=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }

    public WallGraffitiDto(Integer num, UserId userId, String str, String str2, Integer num2, String str3, Integer num3, String str4) {
        this.id = num;
        this.ownerId = userId;
        this.photo200 = str;
        this.photo586 = str2;
        this.height = num2;
        this.url = str3;
        this.width = num3;
        this.accessKey = str4;
    }

    public /* synthetic */ WallGraffitiDto(Integer num, UserId userId, String str, String str2, Integer num2, String str3, Integer num3, String str4, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : userId, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : num3, (i & 128) != 0 ? null : str4);
    }
}
