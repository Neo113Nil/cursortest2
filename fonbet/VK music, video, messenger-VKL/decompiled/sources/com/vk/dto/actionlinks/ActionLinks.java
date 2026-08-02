package com.vk.dto.actionlinks;

import com.vk.core.serialize.Serializer;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.aay;

/* compiled from: ActionLinks.kt */
/* loaded from: classes18.dex */
public final class ActionLinks extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<ActionLinks> CREATOR = new b();
    public final int b;
    public final int c;
    public final ArrayList d;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<ActionLinks> {
        @Override // xsna.aay
        public final ActionLinks a(JSONObject jSONObject) {
            return new ActionLinks(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<ActionLinks> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ActionLinks a(Serializer serializer) {
            return new ActionLinks(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ActionLinks[i];
        }
    }

    static {
        new a();
    }

    public ActionLinks() {
        this.b = 10;
        this.c = 10;
        this.d = new ArrayList();
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.S(this.c);
        serializer.o0(this.d);
    }

    public ActionLinks(JSONObject jSONObject) {
        ArrayList arrayList;
        this.b = jSONObject.optInt(SignalingProtocol.KEY_LIMIT);
        this.c = jSONObject.optInt("count");
        if (jSONObject.has("items")) {
            arrayList = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray("items");
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                arrayList.add(new ActionLink(jSONArray.getJSONObject(i)));
            }
        } else {
            arrayList = null;
        }
        this.d = arrayList;
    }

    public ActionLinks(Serializer serializer) {
        this.b = serializer.u();
        this.c = serializer.u();
        ArrayList l = serializer.l(ActionLink.class.getClassLoader());
        this.d = l == null ? new ArrayList() : l;
    }
}
