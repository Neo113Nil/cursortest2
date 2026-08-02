package com.vk.video.ui.discovery.catalog;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.shy;
import xsna.zcl;
import xsna.zrp;

/* compiled from: VideoDiscoveryCatalogSourceArgs.kt */
/* loaded from: classes7.dex */
public interface VideoDiscoveryCatalogSourceArgs extends Parcelable {

    /* compiled from: VideoDiscoveryCatalogSourceArgs.kt */
    public static final class Catalog implements VideoDiscoveryCatalogSourceArgs {
        public static final Parcelable.Creator<Catalog> CREATOR = new a();
        public final int b;
        public final UserId c;
        public final String d;
        public final String e;
        public final CatalogType f;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: VideoDiscoveryCatalogSourceArgs.kt */
        public static final class CatalogType {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ CatalogType[] $VALUES;
            public static final CatalogType MUSIC;
            public static final CatalogType VIDEO;

            static {
                CatalogType catalogType = new CatalogType(SignalingProtocol.MEDIA_OPTION_VIDEO, 0);
                VIDEO = catalogType;
                CatalogType catalogType2 = new CatalogType("MUSIC", 1);
                MUSIC = catalogType2;
                CatalogType[] catalogTypeArr = {catalogType, catalogType2};
                $VALUES = catalogTypeArr;
                $ENTRIES = new asp(catalogTypeArr);
            }

            public CatalogType() {
                throw null;
            }

            public static CatalogType valueOf(String str) {
                return (CatalogType) Enum.valueOf(CatalogType.class, str);
            }

            public static CatalogType[] values() {
                return (CatalogType[]) $VALUES.clone();
            }
        }

        /* compiled from: VideoDiscoveryCatalogSourceArgs.kt */
        public static final class a implements Parcelable.Creator<Catalog> {
            @Override // android.os.Parcelable.Creator
            public final Catalog createFromParcel(Parcel parcel) {
                return new Catalog(parcel.readInt(), (UserId) parcel.readParcelable(Catalog.class.getClassLoader()), parcel.readString(), parcel.readString(), CatalogType.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Catalog[] newArray(int i) {
                return new Catalog[i];
            }
        }

        public Catalog(int i, UserId userId, String str, String str2, CatalogType catalogType) {
            this.b = i;
            this.c = userId;
            this.d = str;
            this.e = str2;
            this.f = catalogType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Catalog)) {
                return false;
            }
            Catalog catalog = (Catalog) obj;
            return this.b == catalog.b && epx.f(this.c, catalog.c) && epx.f(this.d, catalog.d) && epx.f(this.e, catalog.e) && this.f == catalog.f;
        }

        public final int hashCode() {
            int a2 = bh10.a(Integer.hashCode(this.b) * 31, 31, this.c.b);
            String str = this.d;
            int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.e;
            return this.f.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "Catalog(videoId=" + this.b + ", videoOwnerId=" + this.c + ", trackCode=" + this.d + ", referrer=" + this.e + ", type=" + this.f + ')';
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

    /* compiled from: VideoDiscoveryCatalogSourceArgs.kt */
    public static final class OfflineVideos implements VideoDiscoveryCatalogSourceArgs {
        public static final Parcelable.Creator<OfflineVideos> CREATOR = new a();
        public final String b;

        /* compiled from: VideoDiscoveryCatalogSourceArgs.kt */
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

    /* compiled from: VideoDiscoveryCatalogSourceArgs.kt */
    public static final class MusicMix implements VideoDiscoveryCatalogSourceArgs {
        public static final Parcelable.Creator<MusicMix> CREATOR = new a();
        public final UserId b;
        public final int c;
        public final String d;
        public final String e;
        public final String f;

        /* compiled from: VideoDiscoveryCatalogSourceArgs.kt */
        public static final class a implements Parcelable.Creator<MusicMix> {
            @Override // android.os.Parcelable.Creator
            public final MusicMix createFromParcel(Parcel parcel) {
                return new MusicMix((UserId) parcel.readParcelable(MusicMix.class.getClassLoader()), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final MusicMix[] newArray(int i) {
                return new MusicMix[i];
            }
        }

        public MusicMix(UserId userId, int i, String str, String str2, String str3) {
            this.b = userId;
            this.c = i;
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
            return epx.f(this.b, musicMix.b) && this.c == musicMix.c && epx.f(this.d, musicMix.d) && epx.f(this.e, musicMix.e) && epx.f(this.f, musicMix.f);
        }

        public final int hashCode() {
            int a2 = shy.a(this.c, Long.hashCode(this.b.b) * 31, 31);
            String str = this.d;
            int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.e;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MusicMix(videoOwnerId=");
            sb.append(this.b);
            sb.append(", videoId=");
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
            parcel.writeParcelable(this.b, i);
            parcel.writeInt(this.c);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeString(this.f);
        }

        public /* synthetic */ MusicMix(UserId userId, int i, String str, String str2, String str3, int i2, zcl zclVar) {
            this(userId, i, str, str2, (i2 & 16) != 0 ? null : str3);
        }
    }
}
