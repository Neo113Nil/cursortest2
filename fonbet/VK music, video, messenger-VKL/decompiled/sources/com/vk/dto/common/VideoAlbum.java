package com.vk.dto.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.id.UserId;
import com.vk.dto.video.VideoAlbumType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.aay;
import xsna.h330;
import xsna.z230;

@Deprecated
/* loaded from: classes18.dex */
public class VideoAlbum implements Parcelable {
    public static final Parcelable.Creator<VideoAlbum> CREATOR = new a();
    public static final b k = new b();
    public int b;
    public String c;
    public final String d;
    public int e;
    public UserId f;
    public final Image g;
    public int h;
    public List<PrivacySetting.PrivacyRule> i;
    public final boolean j;

    public class a implements Parcelable.Creator<VideoAlbum> {
        @Override // android.os.Parcelable.Creator
        public final VideoAlbum createFromParcel(Parcel parcel) {
            return new VideoAlbum(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoAlbum[] newArray(int i) {
            return new VideoAlbum[i];
        }
    }

    public class b extends aay<VideoAlbum> {
        @Override // xsna.aay
        public final VideoAlbum a(@NonNull JSONObject jSONObject) throws JSONException {
            return new VideoAlbum(jSONObject);
        }
    }

    public VideoAlbum(boolean z) {
        this.f = UserId.d;
        this.i = new ArrayList();
        this.g = new Image((List<ImageSize>) Collections.EMPTY_LIST);
        this.j = z;
    }

    public final com.vk.dto.video.VideoAlbum d() {
        return new com.vk.dto.video.VideoAlbum(this.b, this.f, this.c, this.d, this.e, this.h, this.g, false, this.i, this.j, false, 0, "", null, true, new ArrayList(), VideoAlbumType.SimplePlaylist, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            VideoAlbum videoAlbum = (VideoAlbum) obj;
            if (this.b == videoAlbum.b && Objects.equals(this.f, videoAlbum.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f.b) + (this.b * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.e);
        parcel.writeParcelable(this.f, 0);
        parcel.writeInt(this.h);
        parcel.writeParcelable(this.g, 0);
        h330.c(parcel, this.i);
        parcel.writeInt(this.j ? 1 : 0);
    }

    public VideoAlbum(JSONObject jSONObject) throws JSONException {
        this.f = UserId.d;
        this.i = new ArrayList();
        this.b = jSONObject.getInt("id");
        this.c = jSONObject.getString("title");
        this.d = jSONObject.optString("share_url", "");
        this.e = jSONObject.optInt("count");
        this.f = new UserId(jSONObject.getLong("owner_id"));
        this.g = new Image(jSONObject.optJSONArray("image"));
        this.h = jSONObject.optInt("updated_time");
        if (jSONObject.has("privacy")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("privacy");
            Serializer.c<PrivacySetting> cVar = PrivacySetting.CREATOR;
            this.i = z230.b.a(jSONObject2);
        }
        this.j = jSONObject.optInt("is_system") == 1;
    }

    public VideoAlbum(Parcel parcel) {
        this.f = UserId.d;
        this.i = new ArrayList();
        this.b = parcel.readInt();
        this.c = parcel.readString();
        this.e = parcel.readInt();
        this.f = (UserId) parcel.readParcelable(UserId.class.getClassLoader());
        this.h = parcel.readInt();
        this.g = (Image) parcel.readParcelable(Image.class.getClassLoader());
        h330.a(parcel, this.i, PrivacySetting.PrivacyRule.class);
        this.j = parcel.readInt() == 1;
    }
}
