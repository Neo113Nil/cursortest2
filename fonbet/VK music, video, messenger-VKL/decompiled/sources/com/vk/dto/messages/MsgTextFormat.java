package com.vk.dto.messages;

import com.vk.core.serialize.Serializer;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.epx;
import xsna.kvf;
import xsna.ms9;
import xsna.zcl;

/* compiled from: MsgTextFormat.kt */
/* loaded from: classes18.dex */
public final class MsgTextFormat extends Serializer.StreamParcelableAdapter {
    public final int b;
    public final List<MsgTextFormatItem> c;
    public static final MsgTextFormat d = new MsgTextFormat(0, EmptyList.b, 1, null);
    public static final Serializer.c<MsgTextFormat> CREATOR = new b();

    /* compiled from: MsgTextFormat.kt */
    public static final class a {
        public static MsgTextFormat a(String str) {
            if (str != null) {
                MsgTextFormat msgTextFormat = MsgTextFormat.d;
                MsgTextFormat b = b(new JSONObject(str));
                if (b != null) {
                    return b;
                }
            }
            return MsgTextFormat.d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v4 */
        /* JADX WARN: Type inference failed for: r1v5 */
        /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList] */
        public static MsgTextFormat b(JSONObject jSONObject) {
            EmptyList emptyList;
            ?? r1;
            try {
                int i = jSONObject.getInt("version");
                if (i == 1) {
                    JSONArray jSONArray = jSONObject.getJSONArray("items");
                    if (jSONArray != null) {
                        r1 = new ArrayList(jSONArray.length());
                        int length = jSONArray.length();
                        for (int i2 = 0; i2 < length; i2++) {
                            JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                            if (optJSONObject != null) {
                                r1.add(new MsgTextFormatItem(optJSONObject.getInt(SignalingProtocol.KEY_OFFSET), optJSONObject.getInt("length"), optJSONObject.getString("type"), optJSONObject.optString("url")));
                            }
                        }
                    } else {
                        r1 = 0;
                    }
                    emptyList = r1 != 0 ? r1 : EmptyList.b;
                } else {
                    emptyList = EmptyList.b;
                }
                return new MsgTextFormat(i, emptyList);
            } catch (Exception unused) {
                return MsgTextFormat.d;
            }
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<MsgTextFormat> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MsgTextFormat a(Serializer serializer) {
            return new MsgTextFormat(serializer, (zcl) null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MsgTextFormat[i];
        }
    }

    public MsgTextFormat(int i, List<MsgTextFormatItem> list) {
        this.b = i;
        this.c = list;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.W(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MsgTextFormat)) {
            return false;
        }
        MsgTextFormat msgTextFormat = (MsgTextFormat) obj;
        return this.b == msgTextFormat.b && epx.f(this.c, msgTextFormat.c);
    }

    public final List<MsgTextFormatItem> getItems() {
        return this.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (Integer.hashCode(this.b) * 31);
    }

    public final boolean isEmpty() {
        return this.c.isEmpty();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgTextFormat(version=");
        sb.append(this.b);
        sb.append(", items=");
        return ms9.a(')', sb, this.c);
    }

    public final String zb() {
        List<MsgTextFormatItem> list = this.c;
        if (list.isEmpty()) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", this.b);
        jSONObject.put("items", kvf.a(list));
        return jSONObject.toString();
    }

    public /* synthetic */ MsgTextFormat(int i, List list, int i2, zcl zclVar) {
        this((i2 & 1) != 0 ? 1 : i, (List<MsgTextFormatItem>) list);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MsgTextFormat(Serializer serializer, zcl zclVar) {
        this(r3, (List<MsgTextFormatItem>) (r2 == null ? EmptyList.b : r2));
        int u = serializer.u();
        List k = serializer.k(MsgTextFormatItem.class);
    }
}
