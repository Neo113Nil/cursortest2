package com.vk.sdk.api.gifts.dto;

import ru.ok.android.api.core.ApiInvocationException;
import xsna.epx;
import xsna.i5s;
import xsna.kr;
import xsna.l4;
import xsna.n6j;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GiftsLayoutDto.kt */
/* loaded from: classes5.dex */
public final class GiftsLayoutDto {

    @pmi0("build_id")
    private final String buildId;

    @pmi0("id")
    private final Integer id;

    @pmi0("is_stickers_style")
    private final Boolean isStickersStyle;

    @pmi0("keywords")
    private final String keywords;

    @pmi0("stickers_product_id")
    private final Integer stickersProductId;

    @pmi0("thumb_256")
    private final String thumb256;

    @pmi0("thumb_48")
    private final String thumb48;

    @pmi0("thumb_512")
    private final String thumb512;

    @pmi0("thumb_96")
    private final String thumb96;

    public GiftsLayoutDto() {
        this(null, null, null, null, null, null, null, null, null, ApiInvocationException.ErrorCodes.IDS_BLOCKED, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftsLayoutDto)) {
            return false;
        }
        GiftsLayoutDto giftsLayoutDto = (GiftsLayoutDto) obj;
        return epx.f(this.id, giftsLayoutDto.id) && epx.f(this.thumb512, giftsLayoutDto.thumb512) && epx.f(this.thumb256, giftsLayoutDto.thumb256) && epx.f(this.thumb48, giftsLayoutDto.thumb48) && epx.f(this.thumb96, giftsLayoutDto.thumb96) && epx.f(this.stickersProductId, giftsLayoutDto.stickersProductId) && epx.f(this.isStickersStyle, giftsLayoutDto.isStickersStyle) && epx.f(this.buildId, giftsLayoutDto.buildId) && epx.f(this.keywords, giftsLayoutDto.keywords);
    }

    public final int hashCode() {
        Integer num = this.id;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.thumb512;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.thumb256;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.thumb48;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.thumb96;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.stickersProductId;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.isStickersStyle;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.buildId;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.keywords;
        return hashCode8 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.id;
        String str = this.thumb512;
        String str2 = this.thumb256;
        String str3 = this.thumb48;
        String str4 = this.thumb96;
        Integer num2 = this.stickersProductId;
        Boolean bool = this.isStickersStyle;
        String str5 = this.buildId;
        String str6 = this.keywords;
        StringBuilder sb = new StringBuilder("GiftsLayoutDto(id=");
        sb.append(num);
        sb.append(", thumb512=");
        sb.append(str);
        sb.append(", thumb256=");
        n6j.b(sb, str2, ", thumb48=", str3, ", thumb96=");
        kr.b(num2, str4, ", stickersProductId=", ", isStickersStyle=", sb);
        l4.i(bool, ", buildId=", str5, ", keywords=", sb);
        return i5s.a(sb, str6, ")");
    }

    public GiftsLayoutDto(Integer num, String str, String str2, String str3, String str4, Integer num2, Boolean bool, String str5, String str6) {
        this.id = num;
        this.thumb512 = str;
        this.thumb256 = str2;
        this.thumb48 = str3;
        this.thumb96 = str4;
        this.stickersProductId = num2;
        this.isStickersStyle = bool;
        this.buildId = str5;
        this.keywords = str6;
    }

    public /* synthetic */ GiftsLayoutDto(Integer num, String str, String str2, String str3, String str4, Integer num2, Boolean bool, String str5, String str6, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6);
    }
}
