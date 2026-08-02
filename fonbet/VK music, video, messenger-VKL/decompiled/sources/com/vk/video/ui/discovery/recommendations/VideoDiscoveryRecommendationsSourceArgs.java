package com.vk.video.ui.discovery.recommendations;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.zrp;

/* compiled from: VideoDiscoveryRecommendationsSourceArgs.kt */
/* loaded from: classes7.dex */
public interface VideoDiscoveryRecommendationsSourceArgs extends Parcelable {

    /* compiled from: VideoDiscoveryRecommendationsSourceArgs.kt */
    public static final class MusicMix implements VideoDiscoveryRecommendationsSourceArgs {
        public static final Parcelable.Creator<MusicMix> CREATOR = new a();
        public final int b;
        public final UserId c;
        public final String d;
        public final String e;
        public final String f;

        /* compiled from: VideoDiscoveryRecommendationsSourceArgs.kt */
        public static final class a implements Parcelable.Creator<MusicMix> {
            @Override // android.os.Parcelable.Creator
            public final MusicMix createFromParcel(Parcel parcel) {
                return new MusicMix(parcel.readInt(), (UserId) parcel.readParcelable(MusicMix.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final MusicMix[] newArray(int i) {
                return new MusicMix[i];
            }
        }

        public MusicMix(int i, UserId userId, String str, String str2, String str3) {
            this.b = i;
            this.c = userId;
            this.d = str;
            this.e = str2;
            this.f = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MusicMix)) {
                return false;
            }
            MusicMix musicMix = (MusicMix) obj;
            return this.b == musicMix.b && epx.f(this.c, musicMix.c) && epx.f(this.d, musicMix.d) && epx.f(this.e, musicMix.e) && epx.f(this.f, musicMix.f);
        }

        public final int hashCode() {
            int a2 = bh10.a(Integer.hashCode(this.b) * 31, 31, this.c.b);
            String str = this.d;
            int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.e;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MusicMix(videoId=");
            sb.append(this.b);
            sb.append(", videoOwnerId=");
            sb.append(this.c);
            sb.append(", payload=");
            sb.append(this.d);
            sb.append(", trackCode=");
            sb.append(this.e);
            sb.append(", referrer=");
            return ho8.a(sb, this.f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
            parcel.writeParcelable(this.c, i);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeString(this.f);
        }
    }

    /* compiled from: VideoDiscoveryRecommendationsSourceArgs.kt */
    public static final class OfflineVideos implements VideoDiscoveryRecommendationsSourceArgs {
        public static final Parcelable.Creator<OfflineVideos> CREATOR = new a();
        public final String b;

        /* compiled from: VideoDiscoveryRecommendationsSourceArgs.kt */
        public static final class a implements Parcelable.Creator<OfflineVideos> {
            @Override // android.os.Parcelable.Creator
            public final OfflineVideos createFromParcel(Parcel parcel) {
                return new OfflineVideos(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final OfflineVideos[] newArray(int i) {
                return new OfflineVideos[i];
            }
        }

        public OfflineVideos(String str) {
            this.b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OfflineVideos) && epx.f(this.b, ((OfflineVideos) obj).b);
        }

        public final int hashCode() {
            String str = this.b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("OfflineVideos(referrer="), this.b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
        }
    }

    /* compiled from: VideoDiscoveryRecommendationsSourceArgs.kt */
    public static final class Recommendations implements VideoDiscoveryRecommendationsSourceArgs {
        public static final Parcelable.Creator<Recommendations> CREATOR = new a();
        public final int b;
        public final UserId c;
        public final String d;
        public final String e;
        public final RecommendationType f;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: VideoDiscoveryRecommendationsSourceArgs.kt */
        public static final class RecommendationType {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ RecommendationType[] $VALUES;
            public static final RecommendationType MUSIC;
            public static final RecommendationType VIDEO;

            static {
                RecommendationType recommendationType = new RecommendationType(SignalingProtocol.MEDIA_OPTION_VIDEO, 0);
                VIDEO = recommendationType;
                RecommendationType recommendationType2 = new RecommendationType("MUSIC", 1);
                MUSIC = recommendationType2;
                RecommendationType[] recommendationTypeArr = {recommendationType, recommendationType2};
                $VALUES = recommendationTypeArr;
                $ENTRIES = new asp(recommendationTypeArr);
            }

            public RecommendationType() {
                throw null;
            }

            public static RecommendationType valueOf(String str) {
                return (RecommendationType) Enum.valueOf(RecommendationType.class, str);
            }

            public static RecommendationType[] values() {
                return (RecommendationType[]) $VALUES.clone();
            }
        }

        /* compiled from: VideoDiscoveryRecommendationsSourceArgs.kt */
        public static final class a implements Parcelable.Creator<Recommendations> {
            @Override // android.os.Parcelable.Creator
            public final Recommendations createFromParcel(Parcel parcel) {
                return new Recommendations(parcel.readInt(), (UserId) parcel.readParcelable(Recommendations.class.getClassLoader()), parcel.readString(), parcel.readString(), RecommendationType.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Recommendations[] newArray(int i) {
                return new Recommendations[i];
            }
        }

        public Recommendations(int i, UserId userId, String str, String str2, RecommendationType recommendationType) {
            this.b = i;
            this.c = userId;
            this.d = str;
            this.e = str2;
            this.f = recommendationType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Recommendations)) {
                return false;
            }
            Recommendations recommendations = (Recommendations) obj;
            return this.b == recommendations.b && epx.f(this.c, recommendations.c) && epx.f(this.d, recommendations.d) && epx.f(this.e, recommendations.e) && this.f == recommendations.f;
        }

        public final int hashCode() {
            int a2 = bh10.a(Integer.hashCode(this.b) * 31, 31, this.c.b);
            String str = this.d;
            int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.e;
            return this.f.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "Recommendations(videoId=" + this.b + ", videoOwnerId=" + this.c + ", trackCode=" + this.d + ", referrer=" + this.e + ", type=" + this.f + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
            parcel.writeParcelable(this.c, i);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeString(this.f.name());
        }
    }
}
