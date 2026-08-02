package com.vk.superapp.base.js.bridge;

import com.mbridge.msdk.foundation.entity.DomainCampaignEx;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: Responses.kt */
/* loaded from: classes6.dex */
public final class Responses$CardBinding {

    @pmi0("added")
    private final String added;

    @pmi0(DomainCampaignEx.KEY_BIND_ID)
    private final String bindId;

    @pmi0("card_type")
    private final String cardType;

    @pmi0("description")
    private final String description;

    @pmi0("exp_date")
    private final String expDate;

    @pmi0("pc_id")
    private final String pcId;

    public Responses$CardBinding() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Responses$CardBinding)) {
            return false;
        }
        Responses$CardBinding responses$CardBinding = (Responses$CardBinding) obj;
        return epx.f(this.bindId, responses$CardBinding.bindId) && epx.f(this.pcId, responses$CardBinding.pcId) && epx.f(this.added, responses$CardBinding.added) && epx.f(this.description, responses$CardBinding.description) && epx.f(this.expDate, responses$CardBinding.expDate) && epx.f(this.cardType, responses$CardBinding.cardType);
    }

    public final int hashCode() {
        String str = this.bindId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.pcId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.added;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.description;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.expDate;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.cardType;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CardBinding(bindId=");
        sb.append(this.bindId);
        sb.append(", pcId=");
        sb.append(this.pcId);
        sb.append(", added=");
        sb.append(this.added);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", expDate=");
        sb.append(this.expDate);
        sb.append(", cardType=");
        return ho8.a(sb, this.cardType, ')');
    }

    public Responses$CardBinding(String str, String str2, String str3, String str4, String str5, String str6) {
        this.bindId = str;
        this.pcId = str2;
        this.added = str3;
        this.description = str4;
        this.expDate = str5;
        this.cardType = str6;
    }

    public /* synthetic */ Responses$CardBinding(String str, String str2, String str3, String str4, String str5, String str6, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
    }
}
