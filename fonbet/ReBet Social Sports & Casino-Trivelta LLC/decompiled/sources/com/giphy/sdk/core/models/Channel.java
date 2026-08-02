package com.giphy.sdk.core.models;

import Gb.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.devsupport.StackTraceHelper;
import com.giphy.sdk.core.models.enums.MediaType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0012¢\u0006\u0002\u0010\u0015J\t\u0010:\u001a\u00020\u0003HÖ\u0001J\u0019\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020\u0003HÖ\u0001R\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R \u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R \u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001dR \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001b\"\u0004\b%\u0010\u001dR \u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R \u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001b\"\u0004\b/\u0010\u001dR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001b\"\u0004\b1\u0010\u001dR\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0017\"\u0004\b3\u0010\u0019R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001b\"\u0004\b5\u0010\u001dR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109¨\u0006@"}, d2 = {"Lcom/giphy/sdk/core/models/Channel;", "Landroid/os/Parcelable;", StackTraceHelper.ID_KEY, "", "slug", "", "displayName", "shortDisplayName", "type", "contentType", "Lcom/giphy/sdk/core/models/enums/MediaType;", "descriptionText", "bannerImage", "featuredGif", "Lcom/giphy/sdk/core/models/Media;", "user", "Lcom/giphy/sdk/core/models/User;", "tags", "", "Lcom/giphy/sdk/core/models/ChannelTag;", "ancestors", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/giphy/sdk/core/models/enums/MediaType;Ljava/lang/String;Ljava/lang/String;Lcom/giphy/sdk/core/models/Media;Lcom/giphy/sdk/core/models/User;Ljava/util/List;Ljava/util/List;)V", "getAncestors", "()Ljava/util/List;", "setAncestors", "(Ljava/util/List;)V", "getBannerImage", "()Ljava/lang/String;", "setBannerImage", "(Ljava/lang/String;)V", "getContentType", "()Lcom/giphy/sdk/core/models/enums/MediaType;", "setContentType", "(Lcom/giphy/sdk/core/models/enums/MediaType;)V", "getDescriptionText", "setDescriptionText", "getDisplayName", "setDisplayName", "getFeaturedGif", "()Lcom/giphy/sdk/core/models/Media;", "setFeaturedGif", "(Lcom/giphy/sdk/core/models/Media;)V", "getId", "()I", "setId", "(I)V", "getShortDisplayName", "setShortDisplayName", "getSlug", "setSlug", "getTags", "setTags", "getType", "setType", "getUser", "()Lcom/giphy/sdk/core/models/User;", "setUser", "(Lcom/giphy/sdk/core/models/User;)V", "describeContents", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "giphy-ui-2.3.17_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Channel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Channel> CREATOR = new Creator();

    @Nullable
    private List<Channel> ancestors;

    @c("banner_image")
    @Nullable
    private String bannerImage;

    @c("content_type")
    @Nullable
    private MediaType contentType;

    @c("description")
    @Nullable
    private String descriptionText;

    @c("display_name")
    @Nullable
    private String displayName;

    @c("featured_gif")
    @Nullable
    private Media featuredGif;
    private int id;

    @c("short_display_name")
    @Nullable
    private String shortDisplayName;

    @Nullable
    private String slug;

    @Nullable
    private List<ChannelTag> tags;

    @Nullable
    private String type;

    @Nullable
    private User user;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Channel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Channel createFromParcel(@NotNull Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            MediaType createFromParcel = parcel.readInt() == 0 ? null : MediaType.CREATOR.createFromParcel(parcel);
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            Media createFromParcel2 = parcel.readInt() == 0 ? null : Media.CREATOR.createFromParcel(parcel);
            User createFromParcel3 = parcel.readInt() == 0 ? null : User.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                for (int i10 = 0; i10 != readInt2; i10++) {
                    arrayList.add(ChannelTag.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList2 = new ArrayList(readInt3);
                for (int i11 = 0; i11 != readInt3; i11++) {
                    arrayList2.add(Channel.CREATOR.createFromParcel(parcel));
                }
            }
            return new Channel(readInt, readString, readString2, readString3, readString4, createFromParcel, readString5, readString6, createFromParcel2, createFromParcel3, arrayList, arrayList2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Channel[] newArray(int i10) {
            return new Channel[i10];
        }
    }

    public Channel(int i10, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable MediaType mediaType, @Nullable String str5, @Nullable String str6, @Nullable Media media, @Nullable User user, @Nullable List<ChannelTag> list, @Nullable List<Channel> list2) {
        this.id = i10;
        this.slug = str;
        this.displayName = str2;
        this.shortDisplayName = str3;
        this.type = str4;
        this.contentType = mediaType;
        this.descriptionText = str5;
        this.bannerImage = str6;
        this.featuredGif = media;
        this.user = user;
        this.tags = list;
        this.ancestors = list2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final List<Channel> getAncestors() {
        return this.ancestors;
    }

    @Nullable
    public final String getBannerImage() {
        return this.bannerImage;
    }

    @Nullable
    public final MediaType getContentType() {
        return this.contentType;
    }

    @Nullable
    public final String getDescriptionText() {
        return this.descriptionText;
    }

    @Nullable
    public final String getDisplayName() {
        return this.displayName;
    }

    @Nullable
    public final Media getFeaturedGif() {
        return this.featuredGif;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final String getShortDisplayName() {
        return this.shortDisplayName;
    }

    @Nullable
    public final String getSlug() {
        return this.slug;
    }

    @Nullable
    public final List<ChannelTag> getTags() {
        return this.tags;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final User getUser() {
        return this.user;
    }

    public final void setAncestors(@Nullable List<Channel> list) {
        this.ancestors = list;
    }

    public final void setBannerImage(@Nullable String str) {
        this.bannerImage = str;
    }

    public final void setContentType(@Nullable MediaType mediaType) {
        this.contentType = mediaType;
    }

    public final void setDescriptionText(@Nullable String str) {
        this.descriptionText = str;
    }

    public final void setDisplayName(@Nullable String str) {
        this.displayName = str;
    }

    public final void setFeaturedGif(@Nullable Media media) {
        this.featuredGif = media;
    }

    public final void setId(int i10) {
        this.id = i10;
    }

    public final void setShortDisplayName(@Nullable String str) {
        this.shortDisplayName = str;
    }

    public final void setSlug(@Nullable String str) {
        this.slug = str;
    }

    public final void setTags(@Nullable List<ChannelTag> list) {
        this.tags = list;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }

    public final void setUser(@Nullable User user) {
        this.user = user;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.id);
        parcel.writeString(this.slug);
        parcel.writeString(this.displayName);
        parcel.writeString(this.shortDisplayName);
        parcel.writeString(this.type);
        MediaType mediaType = this.contentType;
        if (mediaType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mediaType.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.descriptionText);
        parcel.writeString(this.bannerImage);
        Media media = this.featuredGif;
        if (media == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            media.writeToParcel(parcel, flags);
        }
        User user = this.user;
        if (user == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            user.writeToParcel(parcel, flags);
        }
        List<ChannelTag> list = this.tags;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<ChannelTag> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, flags);
            }
        }
        List<Channel> list2 = this.ancestors;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list2.size());
        Iterator<Channel> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ Channel(int i10, String str, String str2, String str3, String str4, MediaType mediaType, String str5, String str6, Media media, User user, List list, List list2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, str, str2, str3, str4, (i11 & 32) != 0 ? null : mediaType, str5, str6, media, user, list, list2);
    }
}
