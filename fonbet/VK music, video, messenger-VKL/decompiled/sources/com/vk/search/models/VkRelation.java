package com.vk.search.models;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.vkontakte.android.R;

/* loaded from: classes5.dex */
public enum VkRelation {
    none(0, "", false, false, R.string.vk_relation_none, R.string.vk_relation_none, R.string.vk_relation_none, R.string.vk_relation_none),
    single(1, "not_married", false, false, R.string.vk_relation_single_m, R.string.vk_relation_single_f, R.string.vk_relation_single_m, R.string.vk_relation_single_f),
    relationship(2, "meets", true, true, R.string.vk_relation_relationship_m, R.string.vk_relation_relationship_f, R.string.vk_relation_relationship_m_p, R.string.vk_relation_relationship_f_p),
    engaged(3, "engaged", true, false, R.string.vk_relation_engaged_m, R.string.vk_relation_engaged_f, R.string.vk_relation_engaged_m_p, R.string.vk_relation_engaged_f_p),
    married(4, "married", true, false, R.string.vk_relation_married_m, R.string.vk_relation_married_f, R.string.vk_relation_married_m_p, R.string.vk_relation_married_f_p),
    civilUnion(8, "civil_marriage", true, false, R.string.vk_relation_civilUnion, R.string.vk_relation_civilUnion, R.string.vk_relation_civilUnion_p, R.string.vk_relation_civilUnion_p),
    complicated(5, "complicated", true, true, R.string.vk_relation_complicated, R.string.vk_relation_complicated, R.string.vk_relation_complicated_p, R.string.vk_relation_complicated_p),
    activelySearching(6, "actively_looking", false, false, R.string.vk_relation_activelySearching, R.string.vk_relation_activelySearching, R.string.vk_relation_activelySearching, R.string.vk_relation_activelySearching),
    inLove(7, "in_love", true, true, R.string.vk_relation_inLove_m, R.string.vk_relation_inLove_f, R.string.vk_relation_inLove_m_p, R.string.vk_relation_inLove_f_p);

    public final String apiValue;
    public final int id;
    final int nameFemalePartnerRes;
    final int nameFemaleRes;
    final int nameMalePartnerRes;
    final int nameMaleRes;
    public final boolean partner;
    public final boolean sameGender;

    VkRelation() {
        throw null;
    }

    VkRelation(int i, String str, boolean z, boolean z2, int i2, int i3, int i4, int i5) {
        this.id = i;
        this.apiValue = str;
        this.partner = z;
        this.sameGender = z2;
        this.nameMaleRes = i2;
        this.nameFemaleRes = i3;
        this.nameMalePartnerRes = i4;
        this.nameFemalePartnerRes = i5;
    }

    public final String a(Context context, boolean z) {
        return context.getString(z ? this.nameMaleRes : this.nameFemaleRes);
    }

    public final String b(FragmentActivity fragmentActivity, boolean z, String str) {
        return fragmentActivity.getString(z ? this.nameMalePartnerRes : this.nameFemalePartnerRes, str);
    }
}
