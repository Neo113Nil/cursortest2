package com.vk.sdk.api.friends.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.vp;
import xsna.xe9;
import xsna.zcl;

/* compiled from: FriendsEntrypointsDto.kt */
/* loaded from: classes5.dex */
public final class FriendsEntrypointsDto {

    @pmi0("items")
    private final List<FriendsEntrypointDto> items;

    @pmi0("title")
    private final String title;

    @pmi0("track_code")
    private final String trackCode;

    public FriendsEntrypointsDto(String str, String str2, List<FriendsEntrypointDto> list) {
        this.title = str;
        this.trackCode = str2;
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsEntrypointsDto)) {
            return false;
        }
        FriendsEntrypointsDto friendsEntrypointsDto = (FriendsEntrypointsDto) obj;
        return epx.f(this.title, friendsEntrypointsDto.title) && epx.f(this.trackCode, friendsEntrypointsDto.trackCode) && epx.f(this.items, friendsEntrypointsDto.items);
    }

    public final int hashCode() {
        int a = urd0.a(this.title.hashCode() * 31, 31, this.trackCode);
        List<FriendsEntrypointDto> list = this.items;
        return a + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        String str = this.title;
        String str2 = this.trackCode;
        return vp.b(")", xe9.a("FriendsEntrypointsDto(title=", str, ", trackCode=", str2, ", items="), this.items);
    }

    public /* synthetic */ FriendsEntrypointsDto(String str, String str2, List list, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : list);
    }
}
