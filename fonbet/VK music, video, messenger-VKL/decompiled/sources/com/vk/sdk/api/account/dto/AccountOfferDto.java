package com.vk.sdk.api.account.dto;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.epx;
import xsna.jq;
import xsna.kr;
import xsna.n6j;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AccountOfferDto.kt */
/* loaded from: classes5.dex */
public final class AccountOfferDto {

    @pmi0("currency_amount")
    private final Float currencyAmount;

    @pmi0("description")
    private final String description;

    @pmi0("id")
    private final Integer id;

    @pmi0("img")
    private final String img;

    @pmi0("instruction")
    private final String instruction;

    @pmi0("instruction_html")
    private final String instructionHtml;

    @pmi0("link_id")
    private final Integer linkId;

    @pmi0(CampaignEx.JSON_KEY_LINK_TYPE)
    private final LinkTypeDto linkType;

    @pmi0("price")
    private final Integer price;

    @pmi0("short_description")
    private final String shortDescription;

    @pmi0("tag")
    private final String tag;

    @pmi0("title")
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AccountOfferDto.kt */
    public static final class LinkTypeDto {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ LinkTypeDto[] $VALUES;

        @pmi0(MBridgeConstans.DYNAMIC_VIEW_WX_APP)
        public static final LinkTypeDto APP;

        @pmi0("group")
        public static final LinkTypeDto GROUP;

        @pmi0(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE)
        public static final LinkTypeDto PROFILE;
        private final String value;

        static {
            LinkTypeDto linkTypeDto = new LinkTypeDto("PROFILE", 0, CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE);
            PROFILE = linkTypeDto;
            LinkTypeDto linkTypeDto2 = new LinkTypeDto("GROUP", 1, "group");
            GROUP = linkTypeDto2;
            LinkTypeDto linkTypeDto3 = new LinkTypeDto("APP", 2, MBridgeConstans.DYNAMIC_VIEW_WX_APP);
            APP = linkTypeDto3;
            LinkTypeDto[] linkTypeDtoArr = {linkTypeDto, linkTypeDto2, linkTypeDto3};
            $VALUES = linkTypeDtoArr;
            $ENTRIES = new asp(linkTypeDtoArr);
        }

        private LinkTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static LinkTypeDto valueOf(String str) {
            return (LinkTypeDto) Enum.valueOf(LinkTypeDto.class, str);
        }

        public static LinkTypeDto[] values() {
            return (LinkTypeDto[]) $VALUES.clone();
        }
    }

    public AccountOfferDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountOfferDto)) {
            return false;
        }
        AccountOfferDto accountOfferDto = (AccountOfferDto) obj;
        return epx.f(this.description, accountOfferDto.description) && epx.f(this.id, accountOfferDto.id) && epx.f(this.img, accountOfferDto.img) && epx.f(this.instruction, accountOfferDto.instruction) && epx.f(this.instructionHtml, accountOfferDto.instructionHtml) && epx.f(this.price, accountOfferDto.price) && epx.f(this.shortDescription, accountOfferDto.shortDescription) && epx.f(this.tag, accountOfferDto.tag) && epx.f(this.title, accountOfferDto.title) && epx.f(this.currencyAmount, accountOfferDto.currencyAmount) && epx.f(this.linkId, accountOfferDto.linkId) && this.linkType == accountOfferDto.linkType;
    }

    public final int hashCode() {
        String str = this.description;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.id;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.img;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.instruction;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.instructionHtml;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.price;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str5 = this.shortDescription;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.tag;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.title;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Float f = this.currencyAmount;
        int hashCode10 = (hashCode9 + (f == null ? 0 : f.hashCode())) * 31;
        Integer num3 = this.linkId;
        int hashCode11 = (hashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        LinkTypeDto linkTypeDto = this.linkType;
        return hashCode11 + (linkTypeDto != null ? linkTypeDto.hashCode() : 0);
    }

    public final String toString() {
        String str = this.description;
        Integer num = this.id;
        String str2 = this.img;
        String str3 = this.instruction;
        String str4 = this.instructionHtml;
        Integer num2 = this.price;
        String str5 = this.shortDescription;
        String str6 = this.tag;
        String str7 = this.title;
        Float f = this.currencyAmount;
        Integer num3 = this.linkId;
        LinkTypeDto linkTypeDto = this.linkType;
        StringBuilder d = jq.d(num, "AccountOfferDto(description=", str, ", id=", ", img=");
        n6j.b(d, str2, ", instruction=", str3, ", instructionHtml=");
        kr.b(num2, str4, ", price=", ", shortDescription=", d);
        n6j.b(d, str5, ", tag=", str6, ", title=");
        d.append(str7);
        d.append(", currencyAmount=");
        d.append(f);
        d.append(", linkId=");
        d.append(num3);
        d.append(", linkType=");
        d.append(linkTypeDto);
        d.append(")");
        return d.toString();
    }

    public AccountOfferDto(String str, Integer num, String str2, String str3, String str4, Integer num2, String str5, String str6, String str7, Float f, Integer num3, LinkTypeDto linkTypeDto) {
        this.description = str;
        this.id = num;
        this.img = str2;
        this.instruction = str3;
        this.instructionHtml = str4;
        this.price = num2;
        this.shortDescription = str5;
        this.tag = str6;
        this.title = str7;
        this.currencyAmount = f;
        this.linkId = num3;
        this.linkType = linkTypeDto;
    }

    public /* synthetic */ AccountOfferDto(String str, Integer num, String str2, String str3, String str4, Integer num2, String str5, String str6, String str7, Float f, Integer num3, LinkTypeDto linkTypeDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : f, (i & 1024) != 0 ? null : num3, (i & 2048) != 0 ? null : linkTypeDto);
    }
}
