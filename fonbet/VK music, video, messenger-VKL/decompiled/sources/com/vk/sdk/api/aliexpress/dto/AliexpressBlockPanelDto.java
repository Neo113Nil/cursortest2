package com.vk.sdk.api.aliexpress.dto;

import xsna.epx;
import xsna.i5s;
import xsna.n6j;
import xsna.pmi0;
import xsna.xe9;
import xsna.zcl;

/* compiled from: AliexpressBlockPanelDto.kt */
/* loaded from: classes5.dex */
public final class AliexpressBlockPanelDto {

    @pmi0("photo_124")
    private final String photo124;

    @pmi0("photo_186")
    private final String photo186;

    @pmi0("photo_62")
    private final String photo62;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("title")
    private final String title;

    public AliexpressBlockPanelDto(String str, String str2, String str3, String str4, String str5) {
        this.title = str;
        this.subtitle = str2;
        this.photo62 = str3;
        this.photo124 = str4;
        this.photo186 = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AliexpressBlockPanelDto)) {
            return false;
        }
        AliexpressBlockPanelDto aliexpressBlockPanelDto = (AliexpressBlockPanelDto) obj;
        return epx.f(this.title, aliexpressBlockPanelDto.title) && epx.f(this.subtitle, aliexpressBlockPanelDto.subtitle) && epx.f(this.photo62, aliexpressBlockPanelDto.photo62) && epx.f(this.photo124, aliexpressBlockPanelDto.photo124) && epx.f(this.photo186, aliexpressBlockPanelDto.photo186);
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.photo62;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.photo124;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.photo186;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.photo62;
        String str4 = this.photo124;
        String str5 = this.photo186;
        StringBuilder a = xe9.a("AliexpressBlockPanelDto(title=", str, ", subtitle=", str2, ", photo62=");
        n6j.b(a, str3, ", photo124=", str4, ", photo186=");
        return i5s.a(a, str5, ")");
    }

    public /* synthetic */ AliexpressBlockPanelDto(String str, String str2, String str3, String str4, String str5, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }
}
