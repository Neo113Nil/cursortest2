package com.vk.dto.music;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import defpackage.q0;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.d370;
import xsna.epx;
import xsna.fv90;
import xsna.r11;
import xsna.zcl;

/* compiled from: RecommendedPlaylist.kt */
/* loaded from: classes18.dex */
public final class RecommendedPlaylist extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<RecommendedPlaylist> CREATOR = new b();
    public static final a l = new a();
    public final int b;
    public final UserId c;
    public final Float d;
    public final String e;
    public final boolean f;
    public final List<String> g;
    public final String h;
    public final String i;
    public final boolean j;
    public final Thumb k;

    /* compiled from: RecommendedPlaylist.kt */
    public static final class a extends aay<RecommendedPlaylist> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r9v0 */
        /* JADX WARN: Type inference failed for: r9v1 */
        /* JADX WARN: Type inference failed for: r9v2 */
        /* JADX WARN: Type inference failed for: r9v4, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r9v5, types: [java.util.ArrayList] */
        @Override // xsna.aay
        public final RecommendedPlaylist a(JSONObject jSONObject) {
            List list;
            int optInt = jSONObject.optInt("id");
            UserId userId = new UserId(jSONObject.optLong("owner_id"));
            Float valueOf = jSONObject.has("percentage") ? Float.valueOf((float) jSONObject.getDouble("percentage")) : null;
            String optString = jSONObject.optString("percentage_title");
            boolean optBoolean = jSONObject.optBoolean("is_curator");
            JSONArray optJSONArray = jSONObject.optJSONArray("audios");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                list = new ArrayList(length);
                for (int i = 0; i < length; i++) {
                    String optString2 = optJSONArray.optString(i);
                    if (optString2 != null) {
                        list.add(optString2);
                    }
                }
            } else {
                list = 0;
            }
            if (list == 0) {
                list = EmptyList.b;
            }
            return new RecommendedPlaylist(optInt, userId, valueOf, optString, optBoolean, list, jSONObject.has("color") ? jSONObject.getString("color") : null, jSONObject.has("cover") ? jSONObject.getString("cover") : null, jSONObject.optBoolean("withOwner", true), jSONObject.has("photo") ? (Thumb) Thumb.f.a(jSONObject.optJSONObject("photo")) : null);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<RecommendedPlaylist> {
        @Override // com.vk.core.serialize.Serializer.c
        public final RecommendedPlaylist a(Serializer serializer) {
            int u = serializer.u();
            UserId userId = (UserId) serializer.A(UserId.class.getClassLoader());
            if (userId == null) {
                userId = UserId.d;
            }
            Float t = serializer.t();
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            return new RecommendedPlaylist(u, userId, t, H, serializer.m(), com.vk.core.serialize.a.a(serializer), serializer.H(), serializer.H(), serializer.m(), (Thumb) serializer.A(Thumb.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RecommendedPlaylist[i];
        }
    }

    public RecommendedPlaylist() {
        this(0, null, null, null, false, null, null, null, false, null, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, null);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.e0(this.c);
        serializer.R(this.d);
        serializer.j0(this.e);
        serializer.L(this.f ? (byte) 1 : (byte) 0);
        serializer.l0(this.g);
        serializer.j0(this.h);
        serializer.j0(this.i);
        serializer.L(this.j ? (byte) 1 : (byte) 0);
        serializer.e0(this.k);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        return d370.C(new fv90(this, 18));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !RecommendedPlaylist.class.equals(obj.getClass())) {
            return false;
        }
        return epx.f(zb(), ((Playlist) obj).Ib());
    }

    public final int hashCode() {
        return Objects.hash(zb());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecommendedPlaylist(id=");
        sb.append(this.b);
        sb.append(", ownerId=");
        sb.append(this.c);
        sb.append(", percentage=");
        sb.append(this.d);
        sb.append(", isCurator=");
        return q0.a(sb, this.f, ')');
    }

    public final String zb() {
        return r11.b(new StringBuilder(), this.c.b, '_', this.b);
    }

    public RecommendedPlaylist(int i, UserId userId, Float f, String str, boolean z, List list, String str2, String str3, boolean z2, Thumb thumb, int i2, zcl zclVar) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? UserId.d : userId, (i2 & 4) != 0 ? null : f, (i2 & 8) != 0 ? "" : str, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? EmptyList.b : list, (i2 & 64) != 0 ? null : str2, (i2 & 128) != 0 ? null : str3, (i2 & 256) != 0 ? true : z2, (i2 & 512) != 0 ? null : thumb);
    }

    public RecommendedPlaylist(int i, UserId userId, Float f, String str, boolean z, List<String> list, String str2, String str3, boolean z2, Thumb thumb) {
        this.b = i;
        this.c = userId;
        this.d = f;
        this.e = str;
        this.f = z;
        this.g = list;
        this.h = str2;
        this.i = str3;
        this.j = z2;
        this.k = thumb;
    }
}
