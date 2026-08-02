package com.vk.dto.menu;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.bxx;
import xsna.epx;
import xsna.ho8;
import xsna.zcl;

/* compiled from: TabBarItem.kt */
/* loaded from: classes.dex */
public final class TabBarItem extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<TabBarItem> CREATOR = new a();
    public final String b;
    public final String c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<TabBarItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final TabBarItem a(Serializer serializer) {
            return new TabBarItem(serializer.H(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TabBarItem[i];
        }
    }

    public /* synthetic */ TabBarItem(String str, String str2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", this.b);
        jSONObject.put(TtmlNode.TAG_STYLE, this.c);
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabBarItem)) {
            return false;
        }
        TabBarItem tabBarItem = (TabBarItem) obj;
        return epx.f(this.b, tabBarItem.b) && epx.f(this.c, tabBarItem.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TabBarItem(id=");
        sb.append(this.b);
        sb.append(", style=");
        return ho8.a(sb, this.c, ')');
    }

    public TabBarItem(String str, String str2) {
        this.b = str;
        this.c = str2;
    }
}
