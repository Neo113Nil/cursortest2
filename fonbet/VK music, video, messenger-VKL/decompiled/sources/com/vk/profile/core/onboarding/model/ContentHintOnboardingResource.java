package com.vk.profile.core.onboarding.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ho8;
import xsna.ms9;
import xsna.urd0;
import xsna.zcl;

/* compiled from: ContentHintOnboardingResource.kt */
/* loaded from: classes5.dex */
public final class ContentHintOnboardingResource implements Parcelable {
    public static final Parcelable.Creator<ContentHintOnboardingResource> CREATOR = new a();
    public final Contents b;
    public final Contents c;

    /* compiled from: ContentHintOnboardingResource.kt */
    public interface ContentUrl extends Parcelable {

        /* compiled from: ContentHintOnboardingResource.kt */
        public static final class Image implements ContentUrl {
            public static final Parcelable.Creator<Image> CREATOR = new a();
            public final String b;

            /* compiled from: ContentHintOnboardingResource.kt */
            public static final class a implements Parcelable.Creator<Image> {
                @Override // android.os.Parcelable.Creator
                public final Image createFromParcel(Parcel parcel) {
                    return new Image(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Image[] newArray(int i) {
                    return new Image[i];
                }
            }

            public Image(String str) {
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
                return (obj instanceof Image) && epx.f(this.b, ((Image) obj).b);
            }

            @Override // com.vk.profile.core.onboarding.model.ContentHintOnboardingResource.ContentUrl
            public final String getUrl() {
                return this.b;
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("Image(url="), this.b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(this.b);
            }
        }

        /* compiled from: ContentHintOnboardingResource.kt */
        public static final class Video implements ContentUrl {
            public static final Parcelable.Creator<Video> CREATOR = new a();
            public final String b;

            /* compiled from: ContentHintOnboardingResource.kt */
            public static final class a implements Parcelable.Creator<Video> {
                @Override // android.os.Parcelable.Creator
                public final Video createFromParcel(Parcel parcel) {
                    return new Video(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Video[] newArray(int i) {
                    return new Video[i];
                }
            }

            public Video(String str) {
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
                return (obj instanceof Video) && epx.f(this.b, ((Video) obj).b);
            }

            @Override // com.vk.profile.core.onboarding.model.ContentHintOnboardingResource.ContentUrl
            public final String getUrl() {
                return this.b;
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("Video(url="), this.b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(this.b);
            }
        }

        String getUrl();
    }

    /* compiled from: ContentHintOnboardingResource.kt */
    public static abstract class Contents implements Parcelable {

        /* compiled from: ContentHintOnboardingResource.kt */
        public static final class MainVideos extends Contents {
            public static final Parcelable.Creator<MainVideos> CREATOR = new a();
            public final String b;
            public final String c;
            public final String d;
            public final String e;
            public final String f;
            public final String g;

            /* compiled from: ContentHintOnboardingResource.kt */
            public static final class a implements Parcelable.Creator<MainVideos> {
                @Override // android.os.Parcelable.Creator
                public final MainVideos createFromParcel(Parcel parcel) {
                    return new MainVideos(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final MainVideos[] newArray(int i) {
                    return new MainVideos[i];
                }
            }

            public MainVideos(String str, String str2, String str3, String str4, String str5, String str6) {
                super(null);
                this.b = str;
                this.c = str2;
                this.d = str3;
                this.e = str4;
                this.f = str5;
                this.g = str6;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof MainVideos)) {
                    return false;
                }
                MainVideos mainVideos = (MainVideos) obj;
                return epx.f(this.b, mainVideos.b) && epx.f(this.c, mainVideos.c) && epx.f(this.d, mainVideos.d) && epx.f(this.e, mainVideos.e) && epx.f(this.f, mainVideos.f) && epx.f(this.g, mainVideos.g);
            }

            public final int hashCode() {
                int a2 = urd0.a(urd0.a(urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
                String str = this.g;
                return a2 + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("MainVideos(mainVideoUrl=");
                sb.append(this.b);
                sb.append(", step1VideoUrl=");
                sb.append(this.c);
                sb.append(", step2VideoUrl=");
                sb.append(this.d);
                sb.append(", step3VideoUrl=");
                sb.append(this.e);
                sb.append(", step4VideoUrl=");
                sb.append(this.f);
                sb.append(", step5VideoUrl=");
                return ho8.a(sb, this.g, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(this.b);
                parcel.writeString(this.c);
                parcel.writeString(this.d);
                parcel.writeString(this.e);
                parcel.writeString(this.f);
                parcel.writeString(this.g);
            }
        }

        /* compiled from: ContentHintOnboardingResource.kt */
        public static final class ServicesContents extends Contents {
            public static final Parcelable.Creator<ServicesContents> CREATOR = new a();
            public final List<RemoteContentResource> b;

            /* compiled from: ContentHintOnboardingResource.kt */
            public static final class a implements Parcelable.Creator<ServicesContents> {
                @Override // android.os.Parcelable.Creator
                public final ServicesContents createFromParcel(Parcel parcel) {
                    int readInt = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt);
                    int i = 0;
                    while (i != readInt) {
                        i = en.a(RemoteContentResource.CREATOR, parcel, arrayList, i, 1);
                    }
                    return new ServicesContents(arrayList);
                }

                @Override // android.os.Parcelable.Creator
                public final ServicesContents[] newArray(int i) {
                    return new ServicesContents[i];
                }
            }

            public ServicesContents(List<RemoteContentResource> list) {
                super(null);
                this.b = list;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ServicesContents) && epx.f(this.b, ((ServicesContents) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ms9.a(')', new StringBuilder("ServicesContents(resources="), this.b);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                Iterator a2 = ao.a(parcel, this.b);
                while (a2.hasNext()) {
                    ((RemoteContentResource) a2.next()).writeToParcel(parcel, i);
                }
            }
        }

        public /* synthetic */ Contents(zcl zclVar) {
            this();
        }

        public Contents() {
        }
    }

    /* compiled from: ContentHintOnboardingResource.kt */
    public static final class RemoteContentResource implements Parcelable {
        public static final Parcelable.Creator<RemoteContentResource> CREATOR = new a();
        public final String b;
        public final String c;
        public final ContentUrl d;
        public final String e;

        /* compiled from: ContentHintOnboardingResource.kt */
        public static final class a implements Parcelable.Creator<RemoteContentResource> {
            @Override // android.os.Parcelable.Creator
            public final RemoteContentResource createFromParcel(Parcel parcel) {
                return new RemoteContentResource(parcel.readString(), parcel.readString(), (ContentUrl) parcel.readParcelable(RemoteContentResource.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final RemoteContentResource[] newArray(int i) {
                return new RemoteContentResource[i];
            }
        }

        public RemoteContentResource(String str, String str2, ContentUrl contentUrl, String str3) {
            this.b = str;
            this.c = str2;
            this.d = contentUrl;
            this.e = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RemoteContentResource)) {
                return false;
            }
            RemoteContentResource remoteContentResource = (RemoteContentResource) obj;
            return epx.f(this.b, remoteContentResource.b) && epx.f(this.c, remoteContentResource.c) && epx.f(this.d, remoteContentResource.d) && epx.f(this.e, remoteContentResource.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + ((this.d.hashCode() + urd0.a(this.b.hashCode() * 31, 31, this.c)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RemoteContentResource(title=");
            sb.append(this.b);
            sb.append(", subtitle=");
            sb.append(this.c);
            sb.append(", contentUrl=");
            sb.append(this.d);
            sb.append(", buttonText=");
            return ho8.a(sb, this.e, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeParcelable(this.d, i);
            parcel.writeString(this.e);
        }
    }

    /* compiled from: ContentHintOnboardingResource.kt */
    public static final class a implements Parcelable.Creator<ContentHintOnboardingResource> {
        @Override // android.os.Parcelable.Creator
        public final ContentHintOnboardingResource createFromParcel(Parcel parcel) {
            return new ContentHintOnboardingResource((Contents) parcel.readParcelable(ContentHintOnboardingResource.class.getClassLoader()), (Contents) parcel.readParcelable(ContentHintOnboardingResource.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ContentHintOnboardingResource[] newArray(int i) {
            return new ContentHintOnboardingResource[i];
        }
    }

    public ContentHintOnboardingResource(Contents contents, Contents contents2) {
        this.b = contents;
        this.c = contents2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentHintOnboardingResource)) {
            return false;
        }
        ContentHintOnboardingResource contentHintOnboardingResource = (ContentHintOnboardingResource) obj;
        return epx.f(this.b, contentHintOnboardingResource.b) && epx.f(this.c, contentHintOnboardingResource.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "ContentHintOnboardingResource(darkContent=" + this.b + ", lightContent=" + this.c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
    }
}
