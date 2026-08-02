package com.vk.sdk.api.ads.dto;

import java.util.List;
import xsna.epx;
import xsna.kh10;
import xsna.pmi0;
import xsna.urd0;
import xsna.vp;
import xsna.zcl;

/* compiled from: AdsCategoryDto.kt */
/* loaded from: classes5.dex */
public final class AdsCategoryDto {

    @pmi0("id")
    private final int id;

    @pmi0("name")
    private final String name;

    @pmi0("subcategories")
    private final List<AdsCategoryDto> subcategories;

    public AdsCategoryDto(int i, String str, List<AdsCategoryDto> list) {
        this.id = i;
        this.name = str;
        this.subcategories = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsCategoryDto)) {
            return false;
        }
        AdsCategoryDto adsCategoryDto = (AdsCategoryDto) obj;
        return this.id == adsCategoryDto.id && epx.f(this.name, adsCategoryDto.name) && epx.f(this.subcategories, adsCategoryDto.subcategories);
    }

    public final int hashCode() {
        int a = urd0.a(Integer.hashCode(this.id) * 31, 31, this.name);
        List<AdsCategoryDto> list = this.subcategories;
        return a + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        int i = this.id;
        String str = this.name;
        return vp.b(")", kh10.a(i, "AdsCategoryDto(id=", ", name=", str, ", subcategories="), this.subcategories);
    }

    public /* synthetic */ AdsCategoryDto(int i, String str, List list, int i2, zcl zclVar) {
        this(i, str, (i2 & 4) != 0 ? null : list);
    }
}
