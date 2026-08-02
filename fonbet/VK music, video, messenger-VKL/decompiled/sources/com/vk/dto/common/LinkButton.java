package com.vk.dto.common;

import android.os.Parcel;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.actions.Action;
import java.util.HashMap;
import org.json.JSONObject;
import xsna.bxx;
import xsna.epx;
import xsna.ho8;

/* compiled from: LinkButton.kt */
/* loaded from: classes18.dex */
public final class LinkButton implements Serializer.StreamParcelable, bxx {
    public static final Serializer.c<LinkButton> CREATOR = new a();
    public final String b;
    public final Action c;
    public final String d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<LinkButton> {
        @Override // com.vk.core.serialize.Serializer.c
        public final LinkButton a(Serializer serializer) {
            return new LinkButton(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LinkButton[i];
        }
    }

    public LinkButton(String str, Action action, String str2) {
        this.b = str;
        this.c = action;
        this.d = str2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.i0(this.c);
        serializer.j0(this.d);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("title", this.b);
        jSONObject.put("action", this.c.e5());
        jSONObject.put(TtmlNode.TAG_STYLE, this.d);
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkButton)) {
            return false;
        }
        LinkButton linkButton = (LinkButton) obj;
        return epx.f(this.b, linkButton.b) && epx.f(this.c, linkButton.c) && epx.f(this.d, linkButton.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + (this.b.hashCode() * 31)) * 31;
        String str = this.d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LinkButton(title=");
        sb.append(this.b);
        sb.append(", action=");
        sb.append(this.c);
        sb.append(", style=");
        return ho8.a(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
        Serializer.b.h(this, parcel);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LinkButton(JSONObject jSONObject) {
        this(r0, Action.a.a(r1), jSONObject.optString(TtmlNode.TAG_STYLE, null));
        String optString = jSONObject.optString("title");
        JSONObject jSONObject2 = jSONObject.getJSONObject("action");
        Action.b bVar = Action.b;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LinkButton(Serializer serializer) {
        this(r0 == null ? "" : r0, (Action) serializer.G(Action.class.getClassLoader()), serializer.H());
        String H = serializer.H();
    }
}
