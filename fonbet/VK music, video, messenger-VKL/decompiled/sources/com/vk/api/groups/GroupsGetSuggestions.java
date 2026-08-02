package com.vk.api.groups;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.data.VKFromList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.GroupSuggestion;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.kru;
import xsna.rsg0;

/* compiled from: GroupsGetSuggestions.kt */
/* loaded from: classes15.dex */
public final class GroupsGetSuggestions extends rsg0<kru> {
    public GroupsGetSuggestions(int i, UserId userId, String str) {
        super("groups.getSuggestions");
        F(userId, "group_id");
        if (str != null && str.length() != 0) {
            K("start_from", str);
        }
        C(i, "count");
        K("fields", "photo_base,activity,city,country,verified,trending,member_status,is_closed,admin_level,photo_avg_color,cover,members_count,friends");
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject.getJSONObject("response");
        Result result = new Result(jSONObject2.optString("next_from"), jSONObject2.optString("title"), jSONObject2.optString("track_code"), null);
        JSONArray optJSONArray = jSONObject2.optJSONArray("items");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                Serializer.c<GroupSuggestion> cVar = GroupSuggestion.CREATOR;
                result.add(GroupSuggestion.b.a("recommended_groups", null, optJSONArray.getJSONObject(i)));
            }
        }
        return result;
    }

    /* compiled from: GroupsGetSuggestions.kt */
    public static final class Result extends VKFromList<GroupSuggestion> implements kru {
        private final LinkButton button;
        private final String title;
        private final String trackCode;

        public Result(String str, String str2, String str3, LinkButton linkButton) {
            super(str);
            this.title = str2;
            this.trackCode = str3;
            this.button = linkButton;
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof GroupSuggestion) {
                return super.contains((GroupSuggestion) obj);
            }
            return false;
        }

        @Override // xsna.kru
        public final String getTitle() {
            return this.title;
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj == null ? true : obj instanceof GroupSuggestion) {
                return super.indexOf((GroupSuggestion) obj);
            }
            return -1;
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj == null ? true : obj instanceof GroupSuggestion) {
                return super.lastIndexOf((GroupSuggestion) obj);
            }
            return -1;
        }

        @Override // xsna.kru
        public final LinkButton o() {
            return this.button;
        }

        @Override // xsna.kru
        public final String r() {
            return this.trackCode;
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean remove(Object obj) {
            if (obj == null ? true : obj instanceof GroupSuggestion) {
                return super.remove((GroupSuggestion) obj);
            }
            return false;
        }

        @Override // xsna.kru
        public final List<GroupSuggestion> getItems() {
            return this;
        }
    }
}
