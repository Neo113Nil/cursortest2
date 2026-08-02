package com.vk.dto.menu;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.core.serialize.Serializer;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.bxx;
import xsna.cqm0;
import xsna.kvf;

/* compiled from: TabBarItems.kt */
/* loaded from: classes.dex */
public final class TabBarItems extends ArrayList<TabBarItem> implements bxx {
    public static final /* synthetic */ int b = 0;
    private final boolean isTitlesVisible;

    /* compiled from: TabBarItems.kt */
    public static final class a {
        public static TabBarItems a(JSONObject jSONObject) {
            ArrayList arrayList;
            JSONArray jSONArray = jSONObject.getJSONArray("items");
            TabBarItems tabBarItems = new TabBarItems(!jSONObject.optBoolean("hide_titles", false));
            Serializer.c<TabBarItem> cVar = TabBarItem.CREATOR;
            if (jSONArray != null) {
                arrayList = new ArrayList(jSONArray.length());
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        arrayList.add(new TabBarItem(optJSONObject.optString("id"), cqm0.a(optJSONObject.optString(TtmlNode.TAG_STYLE))));
                    }
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                tabBarItems.addAll(arrayList);
            }
            return tabBarItems;
        }
    }

    public TabBarItems() {
        this(true);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof TabBarItem) {
            return super.contains((TabBarItem) obj);
        }
        return false;
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONArray a2 = kvf.a(this);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("items", a2);
        if (!this.isTitlesVisible) {
            jSONObject.put("hide_titles", true);
        }
        return jSONObject;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof TabBarItem) {
            return super.indexOf((TabBarItem) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof TabBarItem) {
            return super.lastIndexOf((TabBarItem) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof TabBarItem) {
            return super.remove((TabBarItem) obj);
        }
        return false;
    }

    public TabBarItems(boolean z) {
        this.isTitlesVisible = z;
    }
}
