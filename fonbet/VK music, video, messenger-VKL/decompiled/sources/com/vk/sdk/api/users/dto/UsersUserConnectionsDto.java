package com.vk.sdk.api.users.dto;

import xsna.epx;
import xsna.h5s;
import xsna.n6j;
import xsna.pmi0;
import xsna.urd0;
import xsna.xe9;
import xsna.zcl;

/* compiled from: UsersUserConnectionsDto.kt */
/* loaded from: classes5.dex */
public final class UsersUserConnectionsDto {

    @pmi0("facebook")
    private final String facebook;

    @pmi0("facebook_name")
    private final String facebookName;

    @pmi0("instagram")
    private final String instagram;

    @pmi0("livejournal")
    private final String livejournal;

    @pmi0("skype")
    private final String skype;

    @pmi0("twitter")
    private final String twitter;

    public UsersUserConnectionsDto(String str, String str2, String str3, String str4, String str5, String str6) {
        this.skype = str;
        this.facebook = str2;
        this.twitter = str3;
        this.instagram = str4;
        this.facebookName = str5;
        this.livejournal = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsersUserConnectionsDto)) {
            return false;
        }
        UsersUserConnectionsDto usersUserConnectionsDto = (UsersUserConnectionsDto) obj;
        return epx.f(this.skype, usersUserConnectionsDto.skype) && epx.f(this.facebook, usersUserConnectionsDto.facebook) && epx.f(this.twitter, usersUserConnectionsDto.twitter) && epx.f(this.instagram, usersUserConnectionsDto.instagram) && epx.f(this.facebookName, usersUserConnectionsDto.facebookName) && epx.f(this.livejournal, usersUserConnectionsDto.livejournal);
    }

    public final int hashCode() {
        int a = urd0.a(urd0.a(urd0.a(this.skype.hashCode() * 31, 31, this.facebook), 31, this.twitter), 31, this.instagram);
        String str = this.facebookName;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.livejournal;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.skype;
        String str2 = this.facebook;
        String str3 = this.twitter;
        String str4 = this.instagram;
        String str5 = this.facebookName;
        String str6 = this.livejournal;
        StringBuilder a = xe9.a("UsersUserConnectionsDto(skype=", str, ", facebook=", str2, ", twitter=");
        n6j.b(a, str3, ", instagram=", str4, ", facebookName=");
        return h5s.d(a, str5, ", livejournal=", str6, ")");
    }

    public /* synthetic */ UsersUserConnectionsDto(String str, String str2, String str3, String str4, String str5, String str6, int i, zcl zclVar) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
    }
}
