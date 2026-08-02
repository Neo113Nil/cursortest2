package com.vk.dto.music;

import com.vk.core.serialize.Serializer;
import com.vk.dto.music.Artist;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.epx;
import xsna.ho8;
import xsna.s3q0;
import xsna.shy;
import xsna.w9y;

/* compiled from: AudioRecommendationOnBoardingInfo.kt */
/* loaded from: classes18.dex */
public final class AudioRecommendationOnBoardingInfo extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<AudioRecommendationOnBoardingInfo> CREATOR = new b();
    public final List<Artist> b;
    public final int c;
    public final String d;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<AudioRecommendationOnBoardingInfo> {
        @Override // xsna.aay
        public final AudioRecommendationOnBoardingInfo a(JSONObject jSONObject) {
            return new AudioRecommendationOnBoardingInfo(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<AudioRecommendationOnBoardingInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AudioRecommendationOnBoardingInfo a(Serializer serializer) {
            return new AudioRecommendationOnBoardingInfo(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AudioRecommendationOnBoardingInfo[i];
        }
    }

    static {
        new a();
    }

    public AudioRecommendationOnBoardingInfo(List<Artist> list, int i, String str) {
        this.b = list;
        this.c = i;
        this.d = str;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.f0(this.b);
        serializer.S(this.c);
        serializer.j0(this.d);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        w9y w9yVar = new w9y();
        w9yVar.e(this.b, "artists");
        w9yVar.c(Integer.valueOf(this.c), "related_count");
        w9yVar.e(this.d, "next_from");
        s3q0 s3q0Var = s3q0.a;
        return w9yVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioRecommendationOnBoardingInfo)) {
            return false;
        }
        AudioRecommendationOnBoardingInfo audioRecommendationOnBoardingInfo = (AudioRecommendationOnBoardingInfo) obj;
        return epx.f(this.b, audioRecommendationOnBoardingInfo.b) && this.c == audioRecommendationOnBoardingInfo.c && epx.f(this.d, audioRecommendationOnBoardingInfo.d);
    }

    public final int hashCode() {
        int a2 = shy.a(this.c, this.b.hashCode() * 31, 31);
        String str = this.d;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioRecommendationOnBoardingInfo(artists=");
        sb.append(this.b);
        sb.append(", relatedCount=");
        sb.append(this.c);
        sb.append(", nextFrom=");
        return ho8.a(sb, this.d, ')');
    }

    public AudioRecommendationOnBoardingInfo(Serializer serializer) {
        this(serializer.B(Artist.class.getClassLoader()), serializer.u(), serializer.H());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AudioRecommendationOnBoardingInfo(JSONObject jSONObject) {
        this(r3 == null ? new ArrayList() : r3, jSONObject.optInt("related_count"), jSONObject.optString("next_from"));
        ArrayList arrayList;
        Artist.a aVar = Artist.o;
        JSONArray optJSONArray = jSONObject.optJSONArray("items");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    try {
                        aVar.getClass();
                        arrayList.add(new Artist(optJSONObject));
                    } catch (Exception e) {
                        L.i(e);
                        s3q0 s3q0Var = s3q0.a;
                    }
                }
            }
        } else {
            arrayList = null;
        }
    }
}
