package com.vk.clips.attachments.api.main.video;

import android.os.Parcel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import org.json.JSONObject;
import xsna.aay;
import xsna.bh10;
import xsna.bxx;
import xsna.d370;
import xsna.epx;
import xsna.f370;
import xsna.qoy;
import xsna.uqi;
import xsna.urd0;
import xsna.vs;

/* compiled from: ClipsVideoAttachmentData.kt */
/* loaded from: classes16.dex */
public final class ClipsVideoAttachmentData implements Serializer.StreamParcelable, bxx {
    public static final Serializer.c<ClipsVideoAttachmentData> CREATOR = new b();
    public static final a i;
    public final String b;
    public final boolean c;
    public final UserId d;
    public final String e;
    public final String f;
    public final String g;
    public final Integer h;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<ClipsVideoAttachmentData> {
        @Override // xsna.aay
        public final ClipsVideoAttachmentData a(JSONObject jSONObject) {
            return new ClipsVideoAttachmentData(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<ClipsVideoAttachmentData> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ClipsVideoAttachmentData a(Serializer serializer) {
            String str;
            String H = serializer.H();
            if (H == null) {
                H = "";
                str = H;
            } else {
                str = "";
            }
            boolean m = serializer.m();
            String str2 = str;
            UserId userId = new UserId(serializer.w());
            String H2 = serializer.H();
            if (H2 != null) {
                str2 = H2;
            }
            return new ClipsVideoAttachmentData(H, m, userId, str2, serializer.I(), serializer.I(), serializer.v());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ClipsVideoAttachmentData[i];
        }
    }

    static {
        new ClipsVideoAttachmentData("", true, UserId.d, new String(), null, null, -1);
        i = new a();
    }

    public ClipsVideoAttachmentData(String str, boolean z, UserId userId, String str2, String str3, String str4, Integer num) {
        this.b = str;
        this.c = z;
        this.d = userId;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = num;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.L(this.c ? (byte) 1 : (byte) 0);
        serializer.Y(this.d.b);
        serializer.j0(this.e);
        serializer.m0(this.f);
        serializer.m0(this.g);
        serializer.V(this.h);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        return d370.C(new vs(this, 24));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipsVideoAttachmentData)) {
            return false;
        }
        ClipsVideoAttachmentData clipsVideoAttachmentData = (ClipsVideoAttachmentData) obj;
        return epx.f(this.b, clipsVideoAttachmentData.b) && this.c == clipsVideoAttachmentData.c && epx.f(this.d, clipsVideoAttachmentData.d) && epx.f(this.e, clipsVideoAttachmentData.e) && epx.f(this.f, clipsVideoAttachmentData.f) && epx.f(this.g, clipsVideoAttachmentData.g) && epx.f(this.h, clipsVideoAttachmentData.h);
    }

    public final int hashCode() {
        int a2 = urd0.a(bh10.a(qoy.b(this.b.hashCode() * 31, 31, this.c), 31, this.d.b), 31, this.e);
        String str = this.f;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.h;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsVideoAttachmentData(clipVideoId=");
        sb.append(this.b);
        sb.append(", publishing=");
        sb.append(this.c);
        sb.append(", ownerId=");
        sb.append(this.d);
        sb.append(", videoId=");
        sb.append(this.e);
        sb.append(", imageUri=");
        sb.append(this.f);
        sb.append(", title=");
        sb.append(this.g);
        sb.append(", albumId=");
        return uqi.b(sb, this.h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ClipsVideoAttachmentData(JSONObject jSONObject) {
        this(r3, r4, r5, r0 == null ? "" : r0, f370.D(jSONObject, CampaignEx.JSON_KEY_IMAGE_URL), f370.D(jSONObject, "title"), f370.x(jSONObject, "album_id"));
        String string = jSONObject.getString("clip_video_id");
        String str = string == null ? "" : string;
        boolean z = jSONObject.getBoolean("publishing");
        UserId userId = new UserId(jSONObject.getLong("owner_id"));
        String string2 = jSONObject.getString("video_id");
    }
}
