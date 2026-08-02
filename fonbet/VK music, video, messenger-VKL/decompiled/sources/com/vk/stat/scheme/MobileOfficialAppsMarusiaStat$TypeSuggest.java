package com.vk.stat.scheme;

import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsMarusiaStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsMarusiaStat$TypeSuggest {

    @pmi0("is_promo")
    private final Boolean isPromo;

    @pmi0("skill")
    private final String skill;

    @pmi0("text")
    private final String text;

    public MobileOfficialAppsMarusiaStat$TypeSuggest(String str, Boolean bool, String str2) {
        this.text = str;
        this.isPromo = bool;
        this.skill = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsMarusiaStat$TypeSuggest)) {
            return false;
        }
        MobileOfficialAppsMarusiaStat$TypeSuggest mobileOfficialAppsMarusiaStat$TypeSuggest = (MobileOfficialAppsMarusiaStat$TypeSuggest) obj;
        return epx.f(this.text, mobileOfficialAppsMarusiaStat$TypeSuggest.text) && epx.f(this.isPromo, mobileOfficialAppsMarusiaStat$TypeSuggest.isPromo) && epx.f(this.skill, mobileOfficialAppsMarusiaStat$TypeSuggest.skill);
    }

    public final int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        Boolean bool = this.isPromo;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.skill;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeSuggest(text=");
        sb.append(this.text);
        sb.append(", isPromo=");
        sb.append(this.isPromo);
        sb.append(", skill=");
        return ho8.a(sb, this.skill, ')');
    }

    public /* synthetic */ MobileOfficialAppsMarusiaStat$TypeSuggest(String str, Boolean bool, String str2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : str2);
    }
}
