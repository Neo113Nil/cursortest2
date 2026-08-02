package com.vk.catalog2.common.dto.api.music;

import com.vk.core.serialize.Serializer;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.aay;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;

/* compiled from: MusicSignalInfo.kt */
/* loaded from: classes16.dex */
public final class MusicSignalInfo extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<MusicSignalInfo> CREATOR = new b();
    public static final a h = new a();
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final List<String> g;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<MusicSignalInfo> {
        @Override // xsna.aay
        public final MusicSignalInfo a(JSONObject jSONObject) {
            return new MusicSignalInfo(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<MusicSignalInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MusicSignalInfo a(Serializer serializer) {
            return new MusicSignalInfo(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MusicSignalInfo[i];
        }
    }

    public MusicSignalInfo(String str, String str2, String str3, String str4, String str5, List<String> list) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = list;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
        serializer.l0(this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicSignalInfo)) {
            return false;
        }
        MusicSignalInfo musicSignalInfo = (MusicSignalInfo) obj;
        return epx.f(this.b, musicSignalInfo.b) && epx.f(this.c, musicSignalInfo.c) && epx.f(this.d, musicSignalInfo.d) && epx.f(this.e, musicSignalInfo.e) && epx.f(this.f, musicSignalInfo.f) && epx.f(this.g, musicSignalInfo.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + urd0.a(urd0.a(urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MusicSignalInfo(id=");
        sb.append(this.b);
        sb.append(", title=");
        return ho8.a(sb, this.d, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MusicSignalInfo(JSONObject jSONObject) {
        this(r2, r3, r4, r5, r6, r1 == 0 ? EmptyList.b : r1);
        List list;
        String string = jSONObject.getString("id");
        String optString = jSONObject.optString("cover");
        String optString2 = jSONObject.optString("title");
        String optString3 = jSONObject.optString("subtitle");
        String optString4 = jSONObject.optString("current_month");
        JSONArray optJSONArray = jSONObject.optJSONArray("audios");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            list = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                String optString5 = optJSONArray.optString(i);
                if (optString5 != null) {
                    list.add(optString5);
                }
            }
        } else {
            list = 0;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MusicSignalInfo(Serializer serializer) {
        this(r1, r0, r3, r4, r5 == null ? "" : r5, com.vk.core.serialize.a.a(serializer));
        String H = serializer.H();
        String H2 = serializer.H();
        H2 = H2 == null ? "" : H2;
        String H3 = serializer.H();
        H3 = H3 == null ? "" : H3;
        String H4 = serializer.H();
        H4 = H4 == null ? "" : H4;
        String H5 = serializer.H();
    }
}
