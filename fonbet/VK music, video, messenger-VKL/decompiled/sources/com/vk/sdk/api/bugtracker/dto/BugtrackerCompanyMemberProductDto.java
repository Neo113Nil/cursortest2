package com.vk.sdk.api.bugtracker.dto;

import xsna.epx;
import xsna.h5s;
import xsna.jax0;
import xsna.odj;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;

/* compiled from: BugtrackerCompanyMemberProductDto.kt */
/* loaded from: classes5.dex */
public final class BugtrackerCompanyMemberProductDto {

    @pmi0("access")
    private final int access;

    @pmi0("id")
    private final int id;

    @pmi0("licence_status_text")
    private final String licenceStatusText;

    @pmi0("photo_url")
    private final String photoUrl;

    @pmi0("status")
    private final int status;

    @pmi0("title")
    private final String title;

    public BugtrackerCompanyMemberProductDto(int i, int i2, int i3, String str, String str2, String str3) {
        this.id = i;
        this.access = i2;
        this.status = i3;
        this.title = str;
        this.photoUrl = str2;
        this.licenceStatusText = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BugtrackerCompanyMemberProductDto)) {
            return false;
        }
        BugtrackerCompanyMemberProductDto bugtrackerCompanyMemberProductDto = (BugtrackerCompanyMemberProductDto) obj;
        return this.id == bugtrackerCompanyMemberProductDto.id && this.access == bugtrackerCompanyMemberProductDto.access && this.status == bugtrackerCompanyMemberProductDto.status && epx.f(this.title, bugtrackerCompanyMemberProductDto.title) && epx.f(this.photoUrl, bugtrackerCompanyMemberProductDto.photoUrl) && epx.f(this.licenceStatusText, bugtrackerCompanyMemberProductDto.licenceStatusText);
    }

    public final int hashCode() {
        int a = shy.a(this.status, shy.a(this.access, Integer.hashCode(this.id) * 31, 31), 31);
        String str = this.title;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.photoUrl;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.licenceStatusText;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        int i = this.id;
        int i2 = this.access;
        int i3 = this.status;
        String str = this.title;
        String str2 = this.photoUrl;
        String str3 = this.licenceStatusText;
        StringBuilder a = odj.a(i, i2, "BugtrackerCompanyMemberProductDto(id=", ", access=", ", status=");
        jax0.a(i3, ", title=", str, ", photoUrl=", a);
        return h5s.d(a, str2, ", licenceStatusText=", str3, ")");
    }

    public /* synthetic */ BugtrackerCompanyMemberProductDto(int i, int i2, int i3, String str, String str2, String str3, int i4, zcl zclVar) {
        this(i, i2, i3, (i4 & 8) != 0 ? null : str, (i4 & 16) != 0 ? null : str2, (i4 & 32) != 0 ? null : str3);
    }
}
