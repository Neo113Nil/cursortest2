package com.vk.sdk.api.wall.dto;

import xsna.epx;
import xsna.h5s;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: WallAppPostDto.kt */
/* loaded from: classes5.dex */
public final class WallAppPostDto {

    @pmi0("id")
    private final Integer id;

    @pmi0("name")
    private final String name;

    @pmi0("photo_130")
    private final String photo130;

    @pmi0("photo_604")
    private final String photo604;

    public WallAppPostDto() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallAppPostDto)) {
            return false;
        }
        WallAppPostDto wallAppPostDto = (WallAppPostDto) obj;
        return epx.f(this.id, wallAppPostDto.id) && epx.f(this.name, wallAppPostDto.name) && epx.f(this.photo130, wallAppPostDto.photo130) && epx.f(this.photo604, wallAppPostDto.photo604);
    }

    public final int hashCode() {
        Integer num = this.id;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.photo130;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.photo604;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.id;
        String str = this.name;
        String str2 = this.photo130;
        String str3 = this.photo604;
        StringBuilder sb = new StringBuilder("WallAppPostDto(id=");
        sb.append(num);
        sb.append(", name=");
        sb.append(str);
        sb.append(", photo130=");
        return h5s.d(sb, str2, ", photo604=", str3, ")");
    }

    public WallAppPostDto(Integer num, String str, String str2, String str3) {
        this.id = num;
        this.name = str;
        this.photo130 = str2;
        this.photo604 = str3;
    }

    public /* synthetic */ WallAppPostDto(Integer num, String str, String str2, String str3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}
