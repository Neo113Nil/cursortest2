package com.vk.dto.music;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.s3q0;
import xsna.w9y;
import xsna.zcl;

/* compiled from: AudioFromMusicCatalogInfo.kt */
/* loaded from: classes18.dex */
public final class AudioFromMusicCatalogInfo implements Serializer.StreamParcelable, bxx {
    public static final Serializer.c<AudioFromMusicCatalogInfo> CREATOR = new b();
    public static final a g = new a();
    public final Integer b;
    public final Integer c;
    public final Long d;
    public final boolean e;
    public final String f;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<AudioFromMusicCatalogInfo> {
        @Override // xsna.aay
        public final AudioFromMusicCatalogInfo a(JSONObject jSONObject) {
            return new AudioFromMusicCatalogInfo(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<AudioFromMusicCatalogInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AudioFromMusicCatalogInfo a(Serializer serializer) {
            return new AudioFromMusicCatalogInfo(serializer.v(), serializer.v(), serializer.x(), serializer.m(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AudioFromMusicCatalogInfo[i];
        }
    }

    public AudioFromMusicCatalogInfo() {
        this(null, null, null, false, null, 31, null);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.V(this.b);
        serializer.V(this.c);
        serializer.b0(this.d);
        serializer.L(this.e ? (byte) 1 : (byte) 0);
        serializer.j0(this.f);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        w9y w9yVar = new w9y();
        w9yVar.c(this.b, "banner_id");
        w9yVar.c(this.c, "playlist_id");
        w9yVar.d(this.d, "playlist_owner_id");
        w9yVar.b(Boolean.valueOf(this.e), "from_local_video");
        w9yVar.e(this.f, "hashtag");
        s3q0 s3q0Var = s3q0.a;
        return w9yVar.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public AudioFromMusicCatalogInfo(Integer num, Integer num2, Long l, boolean z, String str) {
        this.b = num;
        this.c = num2;
        this.d = l;
        this.e = z;
        this.f = str;
    }

    public /* synthetic */ AudioFromMusicCatalogInfo(Integer num, Integer num2, Long l, boolean z, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : l, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : str);
    }

    public AudioFromMusicCatalogInfo(JSONObject jSONObject) {
        this(Integer.valueOf(jSONObject.optInt("banner_id")), Integer.valueOf(jSONObject.optInt("playlist_id")), Long.valueOf(jSONObject.optLong("playlist_owner_id")), jSONObject.optBoolean("from_local_video"), jSONObject.optString("hashtag"));
    }
}
