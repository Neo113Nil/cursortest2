package com.vk.stat.scheme;

import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: CommonEcommStat.kt */
/* loaded from: classes5.dex */
public final class CommonEcommStat$TypeSmbSubscriptionsSetFeatureSettingClickItem {

    @pmi0("click_element")
    private final String clickElement;

    @pmi0("click_option")
    private final String clickOption;

    /* JADX WARN: Multi-variable type inference failed */
    public CommonEcommStat$TypeSmbSubscriptionsSetFeatureSettingClickItem() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonEcommStat$TypeSmbSubscriptionsSetFeatureSettingClickItem)) {
            return false;
        }
        CommonEcommStat$TypeSmbSubscriptionsSetFeatureSettingClickItem commonEcommStat$TypeSmbSubscriptionsSetFeatureSettingClickItem = (CommonEcommStat$TypeSmbSubscriptionsSetFeatureSettingClickItem) obj;
        return epx.f(this.clickOption, commonEcommStat$TypeSmbSubscriptionsSetFeatureSettingClickItem.clickOption) && epx.f(this.clickElement, commonEcommStat$TypeSmbSubscriptionsSetFeatureSettingClickItem.clickElement);
    }

    public final int hashCode() {
        String str = this.clickOption;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.clickElement;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeSmbSubscriptionsSetFeatureSettingClickItem(clickOption=");
        sb.append(this.clickOption);
        sb.append(", clickElement=");
        return ho8.a(sb, this.clickElement, ')');
    }

    public CommonEcommStat$TypeSmbSubscriptionsSetFeatureSettingClickItem(String str, String str2) {
        this.clickOption = str;
        this.clickElement = str2;
    }

    public /* synthetic */ CommonEcommStat$TypeSmbSubscriptionsSetFeatureSettingClickItem(String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
