package com.blaze.blazesdk.delegates.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import defpackage.lnb;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001%B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J?\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006&"}, d2 = {"Lcom/blaze/blazesdk/delegates/models/BlazeShareParams;", "Landroid/os/Parcelable;", "id", "", "contentType", "Lcom/blaze/blazesdk/delegates/models/BlazeShareParams$BlazeShareContentType;", "title", "description", "sdkGeneratedLink", "<init>", "(Ljava/lang/String;Lcom/blaze/blazesdk/delegates/models/BlazeShareParams$BlazeShareContentType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getContentType", "()Lcom/blaze/blazesdk/delegates/models/BlazeShareParams$BlazeShareContentType;", "getTitle", "getDescription", "getSdkGeneratedLink", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "BlazeShareContentType", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BlazeShareParams implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazeShareParams> CREATOR = new a();

    @NotNull
    private final BlazeShareContentType contentType;

    @Nullable
    private final String description;

    @NotNull
    private final String id;

    @NotNull
    private final String sdkGeneratedLink;

    @Nullable
    private final String title;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/blaze/blazesdk/delegates/models/BlazeShareParams$BlazeShareContentType;", "Landroid/os/Parcelable;", "Story", "Moment", "Video", "Lcom/blaze/blazesdk/delegates/models/BlazeShareParams$BlazeShareContentType$Moment;", "Lcom/blaze/blazesdk/delegates/models/BlazeShareParams$BlazeShareContentType$Story;", "Lcom/blaze/blazesdk/delegates/models/BlazeShareParams$BlazeShareContentType$Video;", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface BlazeShareContentType extends Parcelable {

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Keep
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lcom/blaze/blazesdk/delegates/models/BlazeShareParams$BlazeShareContentType$Moment;", "Lcom/blaze/blazesdk/delegates/models/BlazeShareParams$BlazeShareContentType;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Moment implements BlazeShareContentType {
            public static final int $stable = 0;

            @NotNull
            public static final Moment INSTANCE = new Moment();

            @NotNull
            public static final Parcelable.Creator<Moment> CREATOR = new a();

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    parcel.readInt();
                    return Moment.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Moment[i];
                }
            }

            private Moment() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof Moment);
            }

            public int hashCode() {
                return -1460687460;
            }

            @NotNull
            public String toString() {
                return "Moment";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                dest.getClass();
                dest.writeInt(1);
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Keep
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/blaze/blazesdk/delegates/models/BlazeShareParams$BlazeShareContentType$Story;", "Lcom/blaze/blazesdk/delegates/models/BlazeShareParams$BlazeShareContentType;", "pageId", "", "<init>", "(Ljava/lang/String;)V", "getPageId", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Story implements BlazeShareContentType {
            public static final int $stable = 0;

            @NotNull
            public static final Parcelable.Creator<Story> CREATOR = new a();

            @NotNull
            private final String pageId;

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new Story(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Story[i];
                }
            }

            public Story(@NotNull String str) {
                str.getClass();
                this.pageId = str;
            }

            public static /* synthetic */ Story copy$default(Story story, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = story.pageId;
                }
                return story.copy(str);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getPageId() {
                return this.pageId;
            }

            @NotNull
            public final Story copy(@NotNull String pageId) {
                pageId.getClass();
                return new Story(pageId);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Story) && Intrinsics.c(this.pageId, ((Story) other).pageId);
            }

            @NotNull
            public final String getPageId() {
                return this.pageId;
            }

            public int hashCode() {
                return this.pageId.hashCode();
            }

            @NotNull
            public String toString() {
                return lnb.q(new StringBuilder("Story(pageId="), this.pageId, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                dest.getClass();
                dest.writeString(this.pageId);
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Keep
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lcom/blaze/blazesdk/delegates/models/BlazeShareParams$BlazeShareContentType$Video;", "Lcom/blaze/blazesdk/delegates/models/BlazeShareParams$BlazeShareContentType;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Video implements BlazeShareContentType {
            public static final int $stable = 0;

            @NotNull
            public static final Video INSTANCE = new Video();

            @NotNull
            public static final Parcelable.Creator<Video> CREATOR = new a();

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    parcel.readInt();
                    return Video.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Video[i];
                }
            }

            private Video() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof Video);
            }

            public int hashCode() {
                return -2117204641;
            }

            @NotNull
            public String toString() {
                return "Video";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                dest.getClass();
                dest.writeInt(1);
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new BlazeShareParams(parcel.readString(), (BlazeShareContentType) parcel.readParcelable(BlazeShareParams.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazeShareParams[i];
        }
    }

    public BlazeShareParams(@NotNull String str, @NotNull BlazeShareContentType blazeShareContentType, @Nullable String str2, @Nullable String str3, @NotNull String str4) {
        str.getClass();
        blazeShareContentType.getClass();
        str4.getClass();
        this.id = str;
        this.contentType = blazeShareContentType;
        this.title = str2;
        this.description = str3;
        this.sdkGeneratedLink = str4;
    }

    public static /* synthetic */ BlazeShareParams copy$default(BlazeShareParams blazeShareParams, String str, BlazeShareContentType blazeShareContentType, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = blazeShareParams.id;
        }
        if ((i & 2) != 0) {
            blazeShareContentType = blazeShareParams.contentType;
        }
        if ((i & 4) != 0) {
            str2 = blazeShareParams.title;
        }
        if ((i & 8) != 0) {
            str3 = blazeShareParams.description;
        }
        if ((i & 16) != 0) {
            str4 = blazeShareParams.sdkGeneratedLink;
        }
        String str5 = str4;
        String str6 = str2;
        return blazeShareParams.copy(str, blazeShareContentType, str6, str3, str5);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final BlazeShareContentType getContentType() {
        return this.contentType;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getSdkGeneratedLink() {
        return this.sdkGeneratedLink;
    }

    @NotNull
    public final BlazeShareParams copy(@NotNull String id, @NotNull BlazeShareContentType contentType, @Nullable String title, @Nullable String description, @NotNull String sdkGeneratedLink) {
        id.getClass();
        contentType.getClass();
        sdkGeneratedLink.getClass();
        return new BlazeShareParams(id, contentType, title, description, sdkGeneratedLink);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeShareParams)) {
            return false;
        }
        BlazeShareParams blazeShareParams = (BlazeShareParams) other;
        return Intrinsics.c(this.id, blazeShareParams.id) && Intrinsics.c(this.contentType, blazeShareParams.contentType) && Intrinsics.c(this.title, blazeShareParams.title) && Intrinsics.c(this.description, blazeShareParams.description) && Intrinsics.c(this.sdkGeneratedLink, blazeShareParams.sdkGeneratedLink);
    }

    @NotNull
    public final BlazeShareContentType getContentType() {
        return this.contentType;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getSdkGeneratedLink() {
        return this.sdkGeneratedLink;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = (this.contentType.hashCode() + (this.id.hashCode() * 31)) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        return this.sdkGeneratedLink.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("BlazeShareParams(id=");
        sb.append(this.id);
        sb.append(", contentType=");
        sb.append(this.contentType);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", sdkGeneratedLink=");
        return lnb.q(sb, this.sdkGeneratedLink, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.id);
        dest.writeParcelable(this.contentType, flags);
        dest.writeString(this.title);
        dest.writeString(this.description);
        dest.writeString(this.sdkGeneratedLink);
    }
}
