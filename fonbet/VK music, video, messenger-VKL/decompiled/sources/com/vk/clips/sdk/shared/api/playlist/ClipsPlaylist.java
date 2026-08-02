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
import xsna.bh10;
import xsna.bxx;
import xsna.d370;
import xsna.drm0;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.iz0;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: ClipsPlaylist.kt */
/* loaded from: classes17.dex */
public final class ClipsPlaylist implements Serializer.StreamParcelable, bxx {
    public static final Serializer.c<ClipsPlaylist> CREATOR = new b();
    public final int b;
    public final String c;
    public final List<String> d;
    public final int e;
    public final UserId f;
    public final boolean g;
    public final String h;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<ClipsPlaylist> {
        @Override // xsna.aay
        public final ClipsPlaylist a(JSONObject jSONObject) {
            return new ClipsPlaylist(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<ClipsPlaylist> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ClipsPlaylist a(Serializer serializer) {
            int u = serializer.u();
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            return new ClipsPlaylist(u, H, com.vk.core.serialize.a.a(serializer), serializer.u(), new UserId(serializer.w()), serializer.m(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ClipsPlaylist[i];
        }
    }

    static {
        new a();
    }

    public ClipsPlaylist(int i, String str, List<String> list, int i2, UserId userId, boolean z, String str2) {
        this.b = i;
        this.c = str;
        this.d = list;
        this.e = i2;
        this.f = userId;
        this.g = z;
        this.h = str2;
    }

    public static ClipsPlaylist a(ClipsPlaylist clipsPlaylist, int i) {
        int i2 = clipsPlaylist.b;
        String str = clipsPlaylist.c;
        List<String> list = clipsPlaylist.d;
        UserId userId = clipsPlaylist.f;
        boolean z = clipsPlaylist.g;
        String str2 = clipsPlaylist.h;
        clipsPlaylist.getClass();
        return new ClipsPlaylist(i2, str, list, i, userId, z, str2);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.j0(this.c);
        serializer.l0(this.d);
        serializer.S(this.e);
        serializer.Y(this.f.b);
        serializer.L(this.g ? (byte) 1 : (byte) 0);
        serializer.j0(this.h);
    }

    public final String d() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        return d370.C(new iz0(this, 13));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipsPlaylist)) {
            return false;
        }
        ClipsPlaylist clipsPlaylist = (ClipsPlaylist) obj;
        return this.b == clipsPlaylist.b && epx.f(this.c, clipsPlaylist.c) && epx.f(this.d, clipsPlaylist.d) && this.e == clipsPlaylist.e && epx.f(this.f, clipsPlaylist.f) && this.g == clipsPlaylist.g && epx.f(this.h, clipsPlaylist.h);
    }

    public final int hashCode() {
        int b2 = qoy.b(bh10.a(shy.a(this.e, fw3.a(urd0.a(Integer.hashCode(this.b) * 31, 31, this.c), 31, this.d), 31), 31, this.f.b), 31, this.g);
        String str = this.h;
        return b2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsPlaylist(id=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", cover=");
        sb.append(this.d);
        sb.append(", size=");
        sb.append(this.e);
        sb.append(", owner=");
        sb.append(this.f);
        sb.append(", canEditPlaylist=");
        sb.append(this.g);
        sb.append(", thumbHash=");
        return ho8.a(sb, this.h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public /* synthetic */ ClipsPlaylist(int i, String str, List list, int i2, UserId userId, boolean z, String str2, int i3, zcl zclVar) {
        this(i, str, list, i2, userId, (i3 & 32) != 0 ? false : z, (i3 & 64) != 0 ? null : str2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ClipsPlaylist(JSONObject jSONObject) {
        this(r2, r3, r4, r5, r6, r7, !drm0.N(r10) ? r10 : null);
        ?? r5;
        int i = jSONObject.getInt("id");
        String string = jSONObject.getString("name");
        JSONArray optJSONArray = jSONObject.optJSONArray("cover");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            r5 = new ArrayList(length);
            for (int i2 = 0; i2 < length; i2++) {
                String optString = optJSONArray.optString(i2);
                if (optString != null) {
                    r5.add(optString);
                }
            }
        } else {
            r5 = 0;
        }
        List list = r5 == 0 ? EmptyList.b : r5;
        int i3 = jSONObject.getInt("size");
        UserId userId = new UserId(jSONObject.getLong("oid"));
        boolean z = jSONObject.getBoolean("is_owner");
        String optString2 = jSONObject.optString("thumb_hash");
    }
}
