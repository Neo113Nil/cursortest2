package com.vk.dto.podcast;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.epx;
import xsna.s3q0;
import xsna.shy;
import xsna.vu5;
import xsna.w9y;

/* compiled from: OfflinePodcast.kt */
/* loaded from: classes18.dex */
public final class OfflinePodcast implements Serializer.StreamParcelable, bxx {
    public static final Serializer.c<OfflinePodcast> CREATOR = new c(new a());
    public static final b e = new b();
    public final Podcast b;
    public final int c;
    public final long d;

    /* compiled from: OfflinePodcast.kt */
    public static final class a {
    }

    /* compiled from: JsonParser.kt */
    public static final class b extends aay<OfflinePodcast> {
        @Override // xsna.aay
        public final OfflinePodcast a(JSONObject jSONObject) {
            return new OfflinePodcast(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class c extends Serializer.c<OfflinePodcast> {
        public final /* synthetic */ a a;

        public c(a aVar) {
            this.a = aVar;
        }

        @Override // com.vk.core.serialize.Serializer.c
        public final OfflinePodcast a(Serializer serializer) {
            this.a.getClass();
            Podcast podcast = (Podcast) serializer.G(Podcast.class.getClassLoader());
            if (podcast == null) {
                return null;
            }
            return new OfflinePodcast(podcast, serializer.u(), serializer.w());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OfflinePodcast[i];
        }
    }

    public OfflinePodcast(Podcast podcast, int i, long j) {
        this.b = podcast;
        this.c = i;
        this.d = j;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.S(this.c);
        serializer.Y(this.d);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        w9y w9yVar = new w9y();
        w9yVar.g("podcast", this.b);
        w9yVar.c(Integer.valueOf(this.c), "downloaded_episodes_count");
        w9yVar.d(Long.valueOf(this.d), "downloaded_episodes_duration");
        s3q0 s3q0Var = s3q0.a;
        return w9yVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfflinePodcast)) {
            return false;
        }
        OfflinePodcast offlinePodcast = (OfflinePodcast) obj;
        return epx.f(this.b, offlinePodcast.b) && this.c == offlinePodcast.c && this.d == offlinePodcast.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + shy.a(this.c, this.b.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OfflinePodcast(podcast=");
        sb.append(this.b);
        sb.append(", downloadedEpisodesCount=");
        sb.append(this.c);
        sb.append(", downloadedEpisodesDuration=");
        return vu5.a(')', this.d, sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public OfflinePodcast(JSONObject jSONObject) {
        this(jSONObject.has("podcast") ? new Podcast(jSONObject.getJSONObject("podcast")) : Podcast.p, jSONObject.optInt("downloaded_episodes_count"), jSONObject.optLong("downloaded_episodes_duration"));
    }
}
