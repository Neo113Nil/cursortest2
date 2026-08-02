package com.vk.sdk.api.wall.dto;

import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.h5s;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: WallPostedPhotoDto.kt */
/* loaded from: classes5.dex */
public final class WallPostedPhotoDto {

    @pmi0("id")
    private final Integer id;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("photo_130")
    private final String photo130;

    @pmi0("photo_604")
    private final String photo604;

    public WallPostedPhotoDto() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallPostedPhotoDto)) {
            return false;
        }
        WallPostedPhotoDto wallPostedPhotoDto = (WallPostedPhotoDto) obj;
        return epx.f(this.id, wallPostedPhotoDto.id) && epx.f(this.ownerId, wallPostedPhotoDto.ownerId) && epx.f(this.photo130, wallPostedPhotoDto.photo130) && epx.f(this.photo604, wallPostedPhotoDto.photo604);
    }

    public final int hashCode() {
        Integer num = this.id;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        UserId userId = this.ownerId;
        int hashCode2 = (hashCode + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        String str = this.photo130;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.photo604;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.id;
        UserId userId = this.ownerId;
        String str = this.photo130;
        String str2 = this.photo604;
        StringBuilder sb = new StringBuilder("WallPostedPhotoDto(id=");
        sb.append(num);
        sb.append(", ownerId=");
        sb.append(userId);
        sb.append(", photo130=");
        return h5s.d(sb, str, ", photo604=", str2, ")");
    }

    public WallPostedPhotoDto(Integer num, UserId userId, String str, String str2) {
        this.id = num;
        this.ownerId = userId;
        this.photo130 = str;
        this.photo604 = str2;
    }

    public /* synthetic */ WallPostedPhotoDto(Integer num, UserId userId, String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : userId, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
    }
}
