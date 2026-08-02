package com.vk.api.groups;

import com.vk.api.groups.GroupsGetSuggestions;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.LinkButton;
import com.vk.dto.group.GroupSuggestion;
import com.vk.dto.user.UserProfile;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.kru;
import xsna.rsg0;

/* compiled from: GroupsGetRecommendedGroups.kt */
/* loaded from: classes15.dex */
public final class a extends rsg0<kru> {
    public a(String str, int i) {
        super("groups.getRecommendedGroups");
        if (str != null && str.length() != 0) {
            K("start_from", str);
        }
        C(i, "count");
        K("fields", "photo_base,activity,city,country,verified,trending,member_status,is_closed,admin_level,photo_avg_color,cover,members_count");
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject.getJSONObject("response");
        String optString = jSONObject2.optString("next_from");
        String optString2 = jSONObject2.optString("title");
        JSONObject optJSONObject = jSONObject2.optJSONObject("button");
        HashMap hashMap = null;
        GroupsGetSuggestions.Result result = new GroupsGetSuggestions.Result(optString, optString2, null, optJSONObject != null ? new LinkButton(optJSONObject) : null);
        JSONArray optJSONArray = jSONObject2.optJSONArray("profiles");
        if (optJSONArray != null) {
            hashMap = new HashMap();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                if (optJSONObject2 != null) {
                    UserProfile userProfile = (UserProfile) UserProfile.g0.a(optJSONObject2);
                    hashMap.put(userProfile.c, userProfile);
                }
            }
        }
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("items");
        if (optJSONArray2 != null) {
            int length2 = optJSONArray2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                Serializer.c<GroupSuggestion> cVar = GroupSuggestion.CREATOR;
                result.add(GroupSuggestion.b.a("recommended_groups", hashMap, optJSONArray2.getJSONObject(i2)));
            }
        }
        return result;
    }
}
