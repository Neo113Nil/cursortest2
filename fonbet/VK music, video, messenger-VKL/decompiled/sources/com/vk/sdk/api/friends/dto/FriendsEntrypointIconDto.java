package com.vk.sdk.api.friends.dto;

import com.vk.sdk.api.base.dto.BaseImageDto;
import java.util.List;
import xsna.epx;
import xsna.i5s;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: FriendsEntrypointIconDto.kt */
/* loaded from: classes5.dex */
public final class FriendsEntrypointIconDto {

    @pmi0("name")
    private final String name;

    @pmi0("photo_url")
    private final String photoUrl;

    @pmi0("sizes")
    private final List<BaseImageDto> sizes;

    public FriendsEntrypointIconDto(String str, List<BaseImageDto> list, String str2) {
        this.name = str;
        this.sizes = list;
        this.photoUrl = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsEntrypointIconDto)) {
            return false;
        }
        FriendsEntrypointIconDto friendsEntrypointIconDto = (FriendsEntrypointIconDto) obj;
        return epx.f(this.name, friendsEntrypointIconDto.name) && epx.f(this.sizes, friendsEntrypointIconDto.sizes) && epx.f(this.photoUrl, friendsEntrypointIconDto.photoUrl);
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        List<BaseImageDto> list = this.sizes;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.photoUrl;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        String str = this.name;
        List<BaseImageDto> list = this.sizes;
        String str2 = this.photoUrl;
        StringBuilder sb = new StringBuilder("FriendsEntrypointIconDto(name=");
        sb.append(str);
        sb.append(", sizes=");
        sb.append(list);
        sb.append(", photoUrl=");
        return i5s.a(sb, str2, ")");
    }

    public /* synthetic */ FriendsEntrypointIconDto(String str, List list, String str2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : str2);
    }
}
