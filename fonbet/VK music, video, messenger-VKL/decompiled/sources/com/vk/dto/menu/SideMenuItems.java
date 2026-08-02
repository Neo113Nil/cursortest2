package com.vk.dto.menu;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.actions.Action;
import com.vk.dto.menu.SideMenuItem;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.bxx;
import xsna.f370;
import xsna.kvf;

/* compiled from: SideMenuItems.kt */
/* loaded from: classes18.dex */
public final class SideMenuItems extends ArrayList<SideMenuItem> implements bxx {
    public static final /* synthetic */ int b = 0;

    /* compiled from: SideMenuItems.kt */
    public static final class a {
        public static SideMenuItems a(JSONArray jSONArray) {
            Action action;
            SideMenuItems sideMenuItems = new SideMenuItems();
            Serializer.c<SideMenuItem> cVar = SideMenuItem.CREATOR;
            ArrayList arrayList = new ArrayList(jSONArray.length());
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("id");
                    String optString2 = optJSONObject.optString("icon");
                    String optString3 = optJSONObject.optString("title");
                    String D = f370.D(optJSONObject, "subtitle");
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("action");
                    if (optJSONObject2 != null) {
                        Action.b bVar = Action.b;
                        action = Action.a.a(optJSONObject2);
                    } else {
                        action = null;
                    }
                    JSONObject optJSONObject3 = optJSONObject.optJSONObject("additional_info");
                    arrayList.add(new SideMenuItem(optString, optString2, optString3, D, action, optJSONObject3 != null ? new SideMenuItem.AdditionalInfo(f370.D(optJSONObject3, "text")) : null));
                }
            }
            sideMenuItems.addAll(arrayList);
            return sideMenuItems;
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof SideMenuItem) {
            return super.contains((SideMenuItem) obj);
        }
        return false;
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONArray a2 = kvf.a(this);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("side_menu_custom_items", a2);
        return jSONObject;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof SideMenuItem) {
            return super.indexOf((SideMenuItem) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof SideMenuItem) {
            return super.lastIndexOf((SideMenuItem) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof SideMenuItem) {
            return super.remove((SideMenuItem) obj);
        }
        return false;
    }
}
