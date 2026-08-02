package com.vk.dto.clips.external;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.epx;
import xsna.ho8;
import xsna.s3q0;
import xsna.shy;
import xsna.w9y;

/* compiled from: ClipsDuetInfo.kt */
/* loaded from: classes18.dex */
public final class ClipsDuetInfo implements Serializer.StreamParcelable, bxx {
    public static final Serializer.c<ClipsDuetInfo> CREATOR = new b();
    public static final a e = new a();
    public final UserId b;
    public final int c;
    public final String d;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<ClipsDuetInfo> {
        @Override // xsna.aay
        public final ClipsDuetInfo a(JSONObject jSONObject) {
            return new ClipsDuetInfo(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<ClipsDuetInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ClipsDuetInfo a(Serializer serializer) {
            UserId userId = (UserId) serializer.A(UserId.class.getClassLoader());
            int u = serializer.u();
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            return new ClipsDuetInfo(userId, u, H);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ClipsDuetInfo[i];
        }
    }

    public ClipsDuetInfo(UserId userId, int i, String str) {
        this.b = userId;
        this.c = i;
        this.d = str;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.e0(this.b);
        serializer.S(this.c);
        serializer.j0(this.d);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        w9y w9yVar = new w9y();
        w9yVar.d(Long.valueOf(this.b.b), "user_id");
        w9yVar.c(Integer.valueOf(this.c), "video_id");
        w9yVar.e(this.d, "author_name");
        s3q0 s3q0Var = s3q0.a;
        return w9yVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipsDuetInfo)) {
            return false;
        }
        ClipsDuetInfo clipsDuetInfo = (ClipsDuetInfo) obj;
        return epx.f(this.b, clipsDuetInfo.b) && this.c == clipsDuetInfo.c && epx.f(this.d, clipsDuetInfo.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + shy.a(this.c, Long.hashCode(this.b.b) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsDuetInfo(userId=");
        sb.append(this.b);
        sb.append(", videoId=");
        sb.append(this.c);
        sb.append(", authorName=");
        return ho8.a(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public ClipsDuetInfo(JSONObject jSONObject) {
        this(new UserId(jSONObject.getLong("user_id")), jSONObject.getInt("video_id"), jSONObject.getString("author_name"));
    }
}
