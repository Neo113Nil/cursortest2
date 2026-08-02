package com.vk.sdk.api.prettyCards.dto;

import com.vk.sdk.api.base.dto.BaseImageDto;
import java.util.List;
import xsna.epx;
import xsna.i5s;
import xsna.n6j;
import xsna.pmi0;
import xsna.urd0;
import xsna.vr;
import xsna.xe9;
import xsna.zcl;

/* compiled from: PrettyCardsPrettyCardDto.kt */
/* loaded from: classes5.dex */
public final class PrettyCardsPrettyCardDto {

    @pmi0("button")
    private final String button;

    @pmi0("button_text")
    private final String buttonText;

    @pmi0("card_id")
    private final String cardId;

    @pmi0("images")
    private final List<BaseImageDto> images;

    @pmi0("link_url")
    private final String linkUrl;

    @pmi0("photo")
    private final String photo;

    @pmi0("price")
    private final String price;

    @pmi0("price_old")
    private final String priceOld;

    @pmi0("title")
    private final String title;

    public PrettyCardsPrettyCardDto(String str, String str2, String str3, String str4, String str5, String str6, List<BaseImageDto> list, String str7, String str8) {
        this.cardId = str;
        this.linkUrl = str2;
        this.photo = str3;
        this.title = str4;
        this.button = str5;
        this.buttonText = str6;
        this.images = list;
        this.price = str7;
        this.priceOld = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrettyCardsPrettyCardDto)) {
            return false;
        }
        PrettyCardsPrettyCardDto prettyCardsPrettyCardDto = (PrettyCardsPrettyCardDto) obj;
        return epx.f(this.cardId, prettyCardsPrettyCardDto.cardId) && epx.f(this.linkUrl, prettyCardsPrettyCardDto.linkUrl) && epx.f(this.photo, prettyCardsPrettyCardDto.photo) && epx.f(this.title, prettyCardsPrettyCardDto.title) && epx.f(this.button, prettyCardsPrettyCardDto.button) && epx.f(this.buttonText, prettyCardsPrettyCardDto.buttonText) && epx.f(this.images, prettyCardsPrettyCardDto.images) && epx.f(this.price, prettyCardsPrettyCardDto.price) && epx.f(this.priceOld, prettyCardsPrettyCardDto.priceOld);
    }

    public final int hashCode() {
        int a = urd0.a(urd0.a(urd0.a(this.cardId.hashCode() * 31, 31, this.linkUrl), 31, this.photo), 31, this.title);
        String str = this.button;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.buttonText;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<BaseImageDto> list = this.images;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.price;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.priceOld;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        String str = this.cardId;
        String str2 = this.linkUrl;
        String str3 = this.photo;
        String str4 = this.title;
        String str5 = this.button;
        String str6 = this.buttonText;
        List<BaseImageDto> list = this.images;
        String str7 = this.price;
        String str8 = this.priceOld;
        StringBuilder a = xe9.a("PrettyCardsPrettyCardDto(cardId=", str, ", linkUrl=", str2, ", photo=");
        n6j.b(a, str3, ", title=", str4, ", button=");
        n6j.b(a, str5, ", buttonText=", str6, ", images=");
        vr.c(", price=", str7, ", priceOld=", a, list);
        return i5s.a(a, str8, ")");
    }

    public /* synthetic */ PrettyCardsPrettyCardDto(String str, String str2, String str3, String str4, String str5, String str6, List list, String str7, String str8, int i, zcl zclVar) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : list, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8);
    }
}
