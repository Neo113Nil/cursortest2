package com.vk.dto.music;

import com.vk.core.serialize.Serializer;
import com.vk.dto.music.Thumb;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.epx;
import xsna.ms9;
import xsna.s3q0;
import xsna.w9y;

/* compiled from: AudioFollowingsUpdateInfo.kt */
/* loaded from: classes18.dex */
public final class AudioFollowingsUpdateInfo extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<AudioFollowingsUpdateInfo> CREATOR = new b();
    public static final a e = new a();
    public final String b;
    public final String c;
    public final List<Thumb> d;

    /* compiled from: AudioFollowingsUpdateInfo.kt */
    public static final class a extends aay<AudioFollowingsUpdateInfo> {
        @Override // xsna.aay
        public final AudioFollowingsUpdateInfo a(JSONObject jSONObject) {
            ArrayList arrayList;
            String optString = jSONObject.optString("title");
            String optString2 = jSONObject.optString("id");
            if (jSONObject.has("covers")) {
                Serializer.c<Thumb> cVar = Thumb.CREATOR;
                arrayList = Thumb.a.a(jSONObject.optJSONArray("covers"));
            } else {
                arrayList = null;
            }
            return new AudioFollowingsUpdateInfo(optString, optString2, arrayList);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<AudioFollowingsUpdateInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AudioFollowingsUpdateInfo a(Serializer serializer) {
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            String H2 = serializer.H();
            return new AudioFollowingsUpdateInfo(H, H2 != null ? H2 : "", serializer.B(Thumb.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AudioFollowingsUpdateInfo[i];
        }
    }

    public AudioFollowingsUpdateInfo(String str, String str2, List<Thumb> list) {
        this.b = str;
        this.c = str2;
        this.d = list;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.f0(this.d);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        w9y w9yVar = new w9y();
        w9yVar.e(this.b, "title");
        w9yVar.e(this.c, "id");
        w9yVar.e(this.d, "covers");
        s3q0 s3q0Var = s3q0.a;
        return w9yVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AudioFollowingsUpdateInfo.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AudioFollowingsUpdateInfo audioFollowingsUpdateInfo = (AudioFollowingsUpdateInfo) obj;
        return epx.f(this.b, audioFollowingsUpdateInfo.b) && epx.f(this.c, audioFollowingsUpdateInfo.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioFollowingsUpdateInfo(title=");
        sb.append(this.b);
        sb.append(", id=");
        sb.append(this.c);
        sb.append(", covers=");
        return ms9.a(')', sb, this.d);
    }
}
