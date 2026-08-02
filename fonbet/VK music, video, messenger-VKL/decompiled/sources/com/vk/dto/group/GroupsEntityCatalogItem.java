package com.vk.dto.group;

import com.vk.core.serialize.Serializer;
import com.vk.dto.group.GroupCatalogItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.aay;
import xsna.epx;
import xsna.ms9;

/* compiled from: GroupsEntityCatalogItem.kt */
/* loaded from: classes18.dex */
public final class GroupsEntityCatalogItem extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<GroupsEntityCatalogItem> CREATOR = new b();
    public static final a d = new a();
    public final String b;
    public final List<GroupCatalogItem> c;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<GroupsEntityCatalogItem> {
        @Override // xsna.aay
        public final GroupsEntityCatalogItem a(JSONObject jSONObject) {
            return new GroupsEntityCatalogItem(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<GroupsEntityCatalogItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final GroupsEntityCatalogItem a(Serializer serializer) {
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            return new GroupsEntityCatalogItem(H, serializer.B(GroupCatalogItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GroupsEntityCatalogItem[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GroupsEntityCatalogItem(String str, List<? extends GroupCatalogItem> list) {
        this.b = str;
        this.c = list;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.f0(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsEntityCatalogItem)) {
            return false;
        }
        GroupsEntityCatalogItem groupsEntityCatalogItem = (GroupsEntityCatalogItem) obj;
        return epx.f(this.b, groupsEntityCatalogItem.b) && epx.f(this.c, groupsEntityCatalogItem.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsEntityCatalogItem(id=");
        sb.append(this.b);
        sb.append(", groupItems=");
        return ms9.a(')', sb, this.c);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v4, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GroupsEntityCatalogItem(JSONObject jSONObject) {
        this(r0, r1 == 0 ? EmptyList.b : r1);
        ?? r1;
        String optString = jSONObject.optString("id");
        JSONArray optJSONArray = jSONObject.optJSONArray("group_items");
        if (optJSONArray != null) {
            r1 = new ArrayList(optJSONArray.length());
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                Serializer.c<GroupCatalogItem> cVar = GroupCatalogItem.CREATOR;
                r1.add(GroupCatalogItem.a.a(jSONObject2));
            }
        } else {
            r1 = 0;
        }
    }
}
