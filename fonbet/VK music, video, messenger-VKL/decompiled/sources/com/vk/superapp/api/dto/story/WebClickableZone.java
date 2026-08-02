package com.vk.superapp.api.dto.story;

import com.vk.core.serialize.Serializer;
import com.vk.superapp.api.dto.story.actions.StickerAction;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.bxx;
import xsna.c5g;
import xsna.epx;
import xsna.ms9;

/* compiled from: WebClickableZone.kt */
/* loaded from: classes6.dex */
public final class WebClickableZone extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<WebClickableZone> CREATOR = new a();
    public final String b;
    public final StickerAction c;
    public final List<WebClickablePoint> d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<WebClickableZone> {
        @Override // com.vk.core.serialize.Serializer.c
        public final WebClickableZone a(Serializer serializer) {
            return new WebClickableZone(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WebClickableZone[i];
        }
    }

    public WebClickableZone(String str, StickerAction stickerAction, List<WebClickablePoint> list) {
        this.b = str;
        this.c = stickerAction;
        this.d = list;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.i0(this.c);
        serializer.W(this.d);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        ArrayList arrayList;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("action_type", this.b);
        List<WebClickablePoint> list = this.d;
        if (list != null) {
            List<WebClickablePoint> list2 = list;
            arrayList = new ArrayList(c5g.u(list2, 10));
            for (WebClickablePoint webClickablePoint : list2) {
                webClickablePoint.getClass();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("x", webClickablePoint.b);
                jSONObject2.put("y", webClickablePoint.c);
                arrayList.add(jSONObject2);
            }
        } else {
            arrayList = null;
        }
        jSONObject.put("clickable_area", new JSONArray((Collection) arrayList));
        jSONObject.put("action", this.c.Ab());
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebClickableZone)) {
            return false;
        }
        WebClickableZone webClickableZone = (WebClickableZone) obj;
        return epx.f(this.b, webClickableZone.b) && epx.f(this.c, webClickableZone.c) && epx.f(this.d, webClickableZone.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + (this.b.hashCode() * 31)) * 31;
        List<WebClickablePoint> list = this.d;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebClickableZone(actionType=");
        sb.append(this.b);
        sb.append(", action=");
        sb.append(this.c);
        sb.append(", clickableArea=");
        return ms9.a(')', sb, this.d);
    }

    public WebClickableZone(Serializer serializer) {
        this(serializer.H(), (StickerAction) serializer.G(StickerAction.class.getClassLoader()), serializer.k(WebClickablePoint.class));
    }
}
