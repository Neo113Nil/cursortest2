package com.vk.dto.common;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.serialize.Serializer;
import com.vk.dto.group.GroupSuggestion;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.user.UserProfile;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.epx;
import xsna.ho8;
import xsna.iux0;
import xsna.kru;
import xsna.on00;
import xsna.urd0;

/* compiled from: GroupsSuggestions.kt */
/* loaded from: classes18.dex */
public final class GroupsSuggestions extends NewsEntry implements iux0, kru {
    public static final Serializer.c<GroupsSuggestions> CREATOR = new b();
    public final String i;
    public final String j;
    public String k;
    public final ArrayList<GroupSuggestion> l;
    public final LinkButton m;
    public final String n;

    /* compiled from: GroupsSuggestions.kt */
    public static final class a {
        public static GroupsSuggestions a(JSONObject jSONObject, Map map) {
            LinkedHashMap linkedHashMap;
            ArrayList arrayList;
            String optString = jSONObject.optString("type");
            String optString2 = jSONObject.optString("title");
            String optString3 = jSONObject.optString("next_from");
            if (map != null) {
                linkedHashMap = new LinkedHashMap(on00.e(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    linkedHashMap.put(entry.getKey(), new UserProfile((Owner) entry.getValue()));
                }
            } else {
                linkedHashMap = null;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("items");
            if (optJSONArray != null) {
                arrayList = new ArrayList(optJSONArray.length());
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        Serializer.c<GroupSuggestion> cVar = GroupSuggestion.CREATOR;
                        arrayList.add(GroupSuggestion.b.a(optString, linkedHashMap, optJSONObject));
                    }
                }
            } else {
                arrayList = null;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            String optString4 = jSONObject.optString("track_code");
            JSONObject optJSONObject2 = jSONObject.optJSONObject("button");
            return new GroupsSuggestions(optString, optString2, optString3, arrayList, optJSONObject2 != null ? new LinkButton(optJSONObject2) : null, optString4);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<GroupsSuggestions> {
        @Override // com.vk.core.serialize.Serializer.c
        public final GroupsSuggestions a(Serializer serializer) {
            return new GroupsSuggestions(serializer.H(), serializer.H(), serializer.H(), serializer.j(GroupSuggestion.CREATOR), (LinkButton) serializer.G(LinkButton.class.getClassLoader()), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GroupsSuggestions[i];
        }
    }

    public GroupsSuggestions(String str, String str2, String str3, ArrayList<GroupSuggestion> arrayList, LinkButton linkButton, String str4) {
        super(new NewsEntry.TrackData(str4, 0, 0L, false, false, null, null, 0, 254, null));
        this.i = str;
        this.j = str2;
        this.k = str3;
        this.l = arrayList;
        this.m = linkButton;
        this.n = str4;
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final String Ab() {
        return "recommended_groups_" + this.i;
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final String Bb() {
        return Ab();
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final String Db() {
        return this.i;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.i);
        serializer.j0(this.j);
        serializer.j0(this.k);
        serializer.o0(this.l);
        serializer.i0(this.m);
        serializer.j0(this.n);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GroupsSuggestions) {
            GroupsSuggestions groupsSuggestions = (GroupsSuggestions) obj;
            if (epx.f(this.i, groupsSuggestions.i) && epx.f(this.j, groupsSuggestions.j)) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.kru
    public final List getItems() {
        return this.l;
    }

    @Override // xsna.iux0, xsna.kru
    public final String getTitle() {
        return this.j;
    }

    public final int hashCode() {
        int a2 = urd0.a(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.i);
        String str = this.j;
        return a2 + (str != null ? str.hashCode() : 0);
    }

    @Override // xsna.kru
    public final LinkButton o() {
        return this.m;
    }

    @Override // xsna.kru
    public final String r() {
        return this.n;
    }

    @Override // xsna.kru
    public final String s1() {
        return this.k;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsSuggestions(type=");
        sb.append(this.i);
        sb.append(", title=");
        sb.append(this.j);
        sb.append(", nextFrom=");
        sb.append(this.k);
        sb.append(", items=");
        sb.append(this.l);
        sb.append(", button=");
        sb.append(this.m);
        sb.append(", trackCode=");
        return ho8.a(sb, this.n, ')');
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final int zb() {
        return 32;
    }
}
