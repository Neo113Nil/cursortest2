package com.vk.sdk.api.ads.dto;

import xsna.epx;
import xsna.i5s;
import xsna.kh10;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AdsMusicianDto.kt */
/* loaded from: classes5.dex */
public final class AdsMusicianDto {

    @pmi0("avatar")
    private final String avatar;

    @pmi0("id")
    private final int id;

    @pmi0("name")
    private final String name;

    public AdsMusicianDto(int i, String str, String str2) {
        this.id = i;
        this.name = str;
        this.avatar = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsMusicianDto)) {
            return false;
        }
        AdsMusicianDto adsMusicianDto = (AdsMusicianDto) obj;
        return this.id == adsMusicianDto.id && epx.f(this.name, adsMusicianDto.name) && epx.f(this.avatar, adsMusicianDto.avatar);
    }

    public final int hashCode() {
        int a = urd0.a(Integer.hashCode(this.id) * 31, 31, this.name);
        String str = this.avatar;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        int i = this.id;
        String str = this.name;
        return i5s.a(kh10.a(i, "AdsMusicianDto(id=", ", name=", str, ", avatar="), this.avatar, ")");
    }

    public /* synthetic */ AdsMusicianDto(int i, String str, String str2, int i2, zcl zclVar) {
        this(i, str, (i2 & 4) != 0 ? null : str2);
    }
}
