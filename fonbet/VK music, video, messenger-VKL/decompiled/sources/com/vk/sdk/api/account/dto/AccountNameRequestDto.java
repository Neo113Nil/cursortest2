package com.vk.sdk.api.account.dto;

import xsna.epx;
import xsna.i5s;
import xsna.jq;
import xsna.n6j;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AccountNameRequestDto.kt */
/* loaded from: classes5.dex */
public final class AccountNameRequestDto {

    @pmi0("first_name")
    private final String firstName;

    @pmi0("id")
    private final Integer id;

    @pmi0("lang")
    private final String lang;

    @pmi0("last_name")
    private final String lastName;

    @pmi0("link_href")
    private final String linkHref;

    @pmi0("link_label")
    private final String linkLabel;

    @pmi0("status")
    private final AccountNameRequestStatusDto status;

    public AccountNameRequestDto() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountNameRequestDto)) {
            return false;
        }
        AccountNameRequestDto accountNameRequestDto = (AccountNameRequestDto) obj;
        return epx.f(this.firstName, accountNameRequestDto.firstName) && epx.f(this.id, accountNameRequestDto.id) && epx.f(this.lastName, accountNameRequestDto.lastName) && this.status == accountNameRequestDto.status && epx.f(this.lang, accountNameRequestDto.lang) && epx.f(this.linkHref, accountNameRequestDto.linkHref) && epx.f(this.linkLabel, accountNameRequestDto.linkLabel);
    }

    public final int hashCode() {
        String str = this.firstName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.id;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.lastName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AccountNameRequestStatusDto accountNameRequestStatusDto = this.status;
        int hashCode4 = (hashCode3 + (accountNameRequestStatusDto == null ? 0 : accountNameRequestStatusDto.hashCode())) * 31;
        String str3 = this.lang;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.linkHref;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.linkLabel;
        return hashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        String str = this.firstName;
        Integer num = this.id;
        String str2 = this.lastName;
        AccountNameRequestStatusDto accountNameRequestStatusDto = this.status;
        String str3 = this.lang;
        String str4 = this.linkHref;
        String str5 = this.linkLabel;
        StringBuilder d = jq.d(num, "AccountNameRequestDto(firstName=", str, ", id=", ", lastName=");
        d.append(str2);
        d.append(", status=");
        d.append(accountNameRequestStatusDto);
        d.append(", lang=");
        n6j.b(d, str3, ", linkHref=", str4, ", linkLabel=");
        return i5s.a(d, str5, ")");
    }

    public AccountNameRequestDto(String str, Integer num, String str2, AccountNameRequestStatusDto accountNameRequestStatusDto, String str3, String str4, String str5) {
        this.firstName = str;
        this.id = num;
        this.lastName = str2;
        this.status = accountNameRequestStatusDto;
        this.lang = str3;
        this.linkHref = str4;
        this.linkLabel = str5;
    }

    public /* synthetic */ AccountNameRequestDto(String str, Integer num, String str2, AccountNameRequestStatusDto accountNameRequestStatusDto, String str3, String str4, String str5, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : accountNameRequestStatusDto, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5);
    }
}
