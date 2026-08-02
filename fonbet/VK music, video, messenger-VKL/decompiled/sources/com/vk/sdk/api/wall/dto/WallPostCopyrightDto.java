package com.vk.sdk.api.wall.dto;

import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.xe9;
import xsna.zcl;

/* compiled from: WallPostCopyrightDto.kt */
/* loaded from: classes5.dex */
public final class WallPostCopyrightDto {

    @pmi0("id")
    private final UserId id;

    @pmi0("link")
    private final String link;

    @pmi0("name")
    private final String name;

    @pmi0("type")
    private final String type;

    public WallPostCopyrightDto(String str, String str2, String str3, UserId userId) {
        this.link = str;
        this.name = str2;
        this.type = str3;
        this.id = userId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallPostCopyrightDto)) {
            return false;
        }
        WallPostCopyrightDto wallPostCopyrightDto = (WallPostCopyrightDto) obj;
        return epx.f(this.link, wallPostCopyrightDto.link) && epx.f(this.name, wallPostCopyrightDto.name) && epx.f(this.type, wallPostCopyrightDto.type) && epx.f(this.id, wallPostCopyrightDto.id);
    }

    public final int hashCode() {
        int a = urd0.a(urd0.a(this.link.hashCode() * 31, 31, this.name), 31, this.type);
        UserId userId = this.id;
        return a + (userId == null ? 0 : Long.hashCode(userId.b));
    }

    public final String toString() {
        String str = this.link;
        String str2 = this.name;
        String str3 = this.type;
        UserId userId = this.id;
        StringBuilder a = xe9.a("WallPostCopyrightDto(link=", str, ", name=", str2, ", type=");
        a.append(str3);
        a.append(", id=");
        a.append(userId);
        a.append(")");
        return a.toString();
    }

    public /* synthetic */ WallPostCopyrightDto(String str, String str2, String str3, UserId userId, int i, zcl zclVar) {
        this(str, str2, str3, (i & 8) != 0 ? null : userId);
    }
}
