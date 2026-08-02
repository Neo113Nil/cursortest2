package com.vk.clips.sdk.shared.api.playlist;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.epx;
import xsna.f370;
import xsna.fw3;
import xsna.gp;
import xsna.s3q0;
import xsna.urd0;
import xsna.w9y;

/* compiled from: SdkClipsDraftablePlaylist.kt */
/* loaded from: classes17.dex */
public final class SdkClipsDraftablePlaylist implements Serializer.StreamParcelable, bxx {
    public static final Serializer.c<SdkClipsDraftablePlaylist> CREATOR = new b();
    public final int b;
    public final String c;
    public final List<String> d;
    public final UserId e;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<SdkClipsDraftablePlaylist> {
        @Override // xsna.aay
        public final SdkClipsDraftablePlaylist a(JSONObject jSONObject) {
            return new SdkClipsDraftablePlaylist(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<SdkClipsDraftablePlaylist> {
        @Override // com.vk.core.serialize.Serializer.c
        public final SdkClipsDraftablePlaylist a(Serializer serializer) {
            int u = serializer.u();
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            return new SdkClipsDraftablePlaylist(u, H, com.vk.core.serialize.a.a(serializer), new UserId(serializer.w()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SdkClipsDraftablePlaylist[i];
        }
    }

    static {
        new a();
    }

    public SdkClipsDraftablePlaylist(int i, String str, List<String> list, UserId userId) {
        this.b = i;
        this.c = str;
        this.d = list;
        this.e = userId;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.j0(this.c);
        serializer.l0(this.d);
        serializer.Y(this.e.b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        w9y w9yVar = new w9y();
        w9yVar.c(Integer.valueOf(this.b), "id");
        w9yVar.e(this.c, "title");
        w9yVar.e(this.d, "cover");
        w9yVar.d(Long.valueOf(this.e.b), "owner_id");
        s3q0 s3q0Var = s3q0.a;
        return w9yVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SdkClipsDraftablePlaylist)) {
            return false;
        }
        SdkClipsDraftablePlaylist sdkClipsDraftablePlaylist = (SdkClipsDraftablePlaylist) obj;
        return this.b == sdkClipsDraftablePlaylist.b && epx.f(this.c, sdkClipsDraftablePlaylist.c) && epx.f(this.d, sdkClipsDraftablePlaylist.d) && epx.f(this.e, sdkClipsDraftablePlaylist.e);
    }

    public final int hashCode() {
        return Long.hashCode(this.e.b) + fw3.a(urd0.a(Integer.hashCode(this.b) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SdkClipsDraftablePlaylist(id=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", cover=");
        sb.append(this.d);
        sb.append(", ownerId=");
        return gp.b(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SdkClipsDraftablePlaylist(JSONObject jSONObject) {
        this(r0, r1, r4 == 0 ? EmptyList.b : r4, new UserId(jSONObject.getLong("owner_id")));
        ?? r4;
        int i = jSONObject.getInt("id");
        String D = f370.D(jSONObject, "title");
        D = D == null ? "" : D;
        JSONArray optJSONArray = jSONObject.optJSONArray("cover");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            r4 = new ArrayList(length);
            for (int i2 = 0; i2 < length; i2++) {
                String optString = optJSONArray.optString(i2);
                if (optString != null) {
                    r4.add(optString);
                }
            }
        } else {
            r4 = 0;
        }
    }
}
