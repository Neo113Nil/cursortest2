package com.vk.dto.podcast;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.music.MusicTrack;
import org.json.JSONObject;
import xsna.aay;
import xsna.asp;
import xsna.bxx;
import xsna.epx;
import xsna.rq;
import xsna.s3q0;
import xsna.w9y;
import xsna.zrp;

/* compiled from: PodcastSliderItem.kt */
/* loaded from: classes18.dex */
public final class PodcastSliderItem implements Serializer.StreamParcelable, bxx {
    public static final Serializer.c<PodcastSliderItem> CREATOR = new b();
    public static final a e = new a();
    public final String b;
    public final Type c;
    public final MusicTrack d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PodcastSliderItem.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final a Companion;
        public static final Type EPISODE;
        public static final Type RANDOM_BUTTON;
        private final String key;

        /* compiled from: PodcastSliderItem.kt */
        public static final class a {
        }

        static {
            Type type = new Type("EPISODE", 0, "episode");
            EPISODE = type;
            Type type2 = new Type("RANDOM_BUTTON", 1, "random_button");
            RANDOM_BUTTON = type2;
            Type[] typeArr = {type, type2};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
            Companion = new a();
        }

        public Type(String str, int i, String str2) {
            this.key = str2;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        public final String h() {
            return this.key;
        }
    }

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<PodcastSliderItem> {
        @Override // xsna.aay
        public final PodcastSliderItem a(JSONObject jSONObject) {
            return new PodcastSliderItem(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<PodcastSliderItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PodcastSliderItem a(Serializer serializer) {
            return new PodcastSliderItem(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PodcastSliderItem[i];
        }
    }

    public PodcastSliderItem(String str, Type type, MusicTrack musicTrack) {
        this.b = str;
        this.c = type;
        this.d = musicTrack;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c.h());
        serializer.e0(this.d);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        w9y w9yVar = new w9y();
        w9yVar.e(this.b, "item_id");
        w9yVar.e(this.c.h(), "slider_type");
        w9yVar.g("episode", this.d);
        s3q0 s3q0Var = s3q0.a;
        return w9yVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PodcastSliderItem)) {
            return false;
        }
        PodcastSliderItem podcastSliderItem = (PodcastSliderItem) obj;
        return epx.f(this.b, podcastSliderItem.b) && this.c == podcastSliderItem.c && epx.f(this.d, podcastSliderItem.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + (this.b.hashCode() * 31)) * 31;
        MusicTrack musicTrack = this.d;
        return hashCode + (musicTrack == null ? 0 : musicTrack.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PodcastSliderItem(id=");
        sb.append(this.b);
        sb.append(", type=");
        sb.append(this.c);
        sb.append(", item=");
        return rq.c(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PodcastSliderItem(JSONObject jSONObject) {
        this(r0, r1, r5 != null ? new MusicTrack(r5) : null);
        String optString = jSONObject.optString("item_id");
        Type.a aVar = Type.Companion;
        String optString2 = jSONObject.optString("slider_type");
        aVar.getClass();
        Type type = Type.RANDOM_BUTTON;
        type = optString2.equals(type.h()) ? type : Type.EPISODE;
        JSONObject optJSONObject = jSONObject.optJSONObject("episode");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PodcastSliderItem(Serializer serializer) {
        this(r0, r1.equals(r2.h()) ? r2 : Type.EPISODE, (MusicTrack) serializer.A(MusicTrack.class.getClassLoader()));
        String H = serializer.H();
        H = H == null ? "" : H;
        Type.a aVar = Type.Companion;
        String H2 = serializer.H();
        String str = H2 != null ? H2 : "";
        aVar.getClass();
        Type type = Type.RANDOM_BUTTON;
    }
}
