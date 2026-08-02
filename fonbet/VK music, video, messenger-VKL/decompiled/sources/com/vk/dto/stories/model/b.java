package com.vk.dto.stories.model;

import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.stories.entities.PromoInfo;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.dto.user.UserProfile;
import defpackage.q0;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.epx;
import xsna.fkq0;
import xsna.j5g;
import xsna.qoy;
import xsna.vul0;

/* compiled from: StoriesContainerJsonParser.kt */
/* loaded from: classes18.dex */
public final class b {

    /* compiled from: StoriesContainerJsonParser.kt */
    public static final class a {
        public final StoryOwner a;
        public final Object b;
        public final String c;
        public final boolean d;
        public final boolean e;

        public a(StoryOwner storyOwner, List<? extends StoryEntry> list, String str, boolean z, boolean z2) {
            this.a = storyOwner;
            this.b = list;
            this.c = str;
            this.d = z;
            this.e = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b) && epx.f(this.c, aVar.c) && this.d == aVar.d && this.e == aVar.e;
        }

        public final int hashCode() {
            int a = vul0.a(this.a.hashCode() * 31, 31, this.b);
            String str = this.c;
            return Boolean.hashCode(this.e) + qoy.b((a + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(storyOwner=");
            sb.append(this.a);
            sb.append(", storyEntries=");
            sb.append(this.b);
            sb.append(", serverUniqueId=");
            sb.append(this.c);
            sb.append(", hasUnseen=");
            sb.append(this.d);
            sb.append(", noAuthorLink=");
            return q0.a(sb, this.e, ')');
        }
    }

    public static a a(JSONObject jSONObject, Map map, Map map2, Map map3) {
        UserId userId;
        JSONArray optJSONArray = jSONObject.optJSONArray("stories");
        List Vb = optJSONArray != null ? StoryEntry.Vb(optJSONArray, map, map2, map3) : null;
        if (Vb == null) {
            Vb = EmptyList.b;
        }
        List list = Vb;
        StoryEntry storyEntry = (StoryEntry) j5g.a0(list);
        if (storyEntry == null || (userId = storyEntry.d) == null) {
            userId = UserId.d;
        }
        PromoInfo promoInfo = storyEntry != null ? storyEntry.t : null;
        return new a(fkq0.b(userId) ? new StoryOwner.Community((Group) map2.get(fkq0.e(userId)), promoInfo) : new StoryOwner.User((UserProfile) map.get(userId), promoInfo), list, jSONObject.optString("id"), jSONObject.optBoolean("has_unseen", false), jSONObject.optBoolean("no_author_link", false));
    }
}
