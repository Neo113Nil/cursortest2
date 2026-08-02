package com.giphy.sdk.core.models;

import Gb.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.devsupport.StackTraceHelper;
import com.giphy.sdk.core.models.enums.MediaType;
import com.twilio.voice.EventKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b1\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0093\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u000b\u0012\u0006\u0010\u001c\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u001eJ\t\u0010;\u001a\u00020\u000bHÖ\u0001J\u0006\u0010<\u001a\u00020=J\u0019\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\u000bHÖ\u0001R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u0016\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\"R\u0016\u0010\u0017\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\"R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010 R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010 R\u0016\u0010\u0016\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\"R\u0016\u0010\u0013\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\"R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010 R\u0016\u0010\u0012\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\"R\u0016\u0010\u001b\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\"R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010 R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010 R\u0016\u0010\u001a\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\"R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b0\u0010 R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\"R\u0016\u0010\r\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\"R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010 R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010 R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010 R\u0016\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\"R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b9\u0010 R\u0011\u0010\u001c\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b:\u0010 ¨\u0006C"}, d2 = {"Lcom/giphy/sdk/core/models/RandomGif;", "Landroid/os/Parcelable;", "type", "Lcom/giphy/sdk/core/models/enums/MediaType;", StackTraceHelper.ID_KEY, "", EventKeys.URL, "imageOriginalUrl", "imageUrl", "imageMp4Url", "imageFrames", "", "imageWidth", "imageHeight", "fixedHeightDownsampledUrl", "fixedHeightDownsampledWidth", "fixedHeightDownsampledHeight", "fixedWidthDownsampledUrl", "fixedWidthDownsampledWidth", "fixedWidthDownsampledHeight", "fixedHeightSmallUrl", "fixedHeightSmallStillUrl", "fixedHeightSmallWidth", "fixedHeightSmallHeight", "fixedWidthSmallUrl", "fixedWidthSmallStillUrl", "fixedWidthSmallWidth", "fixedWidthSmallHeight", "username", "caption", "(Lcom/giphy/sdk/core/models/enums/MediaType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;IILjava/lang/String;IILjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V", "getCaption", "()Ljava/lang/String;", "getFixedHeightDownsampledHeight", "()I", "getFixedHeightDownsampledUrl", "getFixedHeightDownsampledWidth", "getFixedHeightSmallHeight", "getFixedHeightSmallStillUrl", "getFixedHeightSmallUrl", "getFixedHeightSmallWidth", "getFixedWidthDownsampledHeight", "getFixedWidthDownsampledUrl", "getFixedWidthDownsampledWidth", "getFixedWidthSmallHeight", "getFixedWidthSmallStillUrl", "getFixedWidthSmallUrl", "getFixedWidthSmallWidth", "getId", "getImageFrames", "getImageHeight", "getImageMp4Url", "getImageOriginalUrl", "getImageUrl", "getImageWidth", "getType", "()Lcom/giphy/sdk/core/models/enums/MediaType;", "getUrl", "getUsername", "describeContents", "toGif", "Lcom/giphy/sdk/core/models/Media;", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "giphy-ui-2.3.17_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RandomGif implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RandomGif> CREATOR = new Creator();

    @Nullable
    private final String caption;

    @c("fixed_height_downsampled_height")
    private final int fixedHeightDownsampledHeight;

    @c("fixed_height_downsampled_url")
    @Nullable
    private final String fixedHeightDownsampledUrl;

    @c("fixed_height_downsampled_width")
    private final int fixedHeightDownsampledWidth;

    @c("fixed_height_small_height")
    private final int fixedHeightSmallHeight;

    @c("fixed_height_small_still_url")
    @Nullable
    private final String fixedHeightSmallStillUrl;

    @c("fixed_height_small_url")
    @Nullable
    private final String fixedHeightSmallUrl;

    @c("fixed_height_small_width")
    private final int fixedHeightSmallWidth;

    @c("fixed_width_downsampled_height")
    private final int fixedWidthDownsampledHeight;

    @c("fixed_width_downsampled_url")
    @Nullable
    private final String fixedWidthDownsampledUrl;

    @c("fixed_width_downsampled_width")
    private final int fixedWidthDownsampledWidth;

    @c("fixed_width_small_height")
    private final int fixedWidthSmallHeight;

    @c("fixed_width_small_still_url")
    @Nullable
    private final String fixedWidthSmallStillUrl;

    @c("fixed_width_small_url")
    @Nullable
    private final String fixedWidthSmallUrl;

    @c("fixed_width_small_width")
    private final int fixedWidthSmallWidth;

    @NotNull
    private final String id;

    @c("image_frames")
    private final int imageFrames;

    @c("image_height")
    private final int imageHeight;

    @c("image_mp4_url")
    @Nullable
    private final String imageMp4Url;

    @c("image_original_url")
    @Nullable
    private final String imageOriginalUrl;

    @c("image_url")
    @Nullable
    private final String imageUrl;

    @c("image_width")
    private final int imageWidth;

    @Nullable
    private final MediaType type;

    @Nullable
    private final String url;

    @NotNull
    private final String username;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RandomGif> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final RandomGif createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RandomGif(parcel.readInt() == 0 ? null : MediaType.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final RandomGif[] newArray(int i10) {
            return new RandomGif[i10];
        }
    }

    public RandomGif(@Nullable MediaType mediaType, @NotNull String id2, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i10, int i11, int i12, @Nullable String str5, int i13, int i14, @Nullable String str6, int i15, int i16, @Nullable String str7, @Nullable String str8, int i17, int i18, @Nullable String str9, @Nullable String str10, int i19, int i20, @NotNull String username, @Nullable String str11) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(username, "username");
        this.type = mediaType;
        this.id = id2;
        this.url = str;
        this.imageOriginalUrl = str2;
        this.imageUrl = str3;
        this.imageMp4Url = str4;
        this.imageFrames = i10;
        this.imageWidth = i11;
        this.imageHeight = i12;
        this.fixedHeightDownsampledUrl = str5;
        this.fixedHeightDownsampledWidth = i13;
        this.fixedHeightDownsampledHeight = i14;
        this.fixedWidthDownsampledUrl = str6;
        this.fixedWidthDownsampledWidth = i15;
        this.fixedWidthDownsampledHeight = i16;
        this.fixedHeightSmallUrl = str7;
        this.fixedHeightSmallStillUrl = str8;
        this.fixedHeightSmallWidth = i17;
        this.fixedHeightSmallHeight = i18;
        this.fixedWidthSmallUrl = str9;
        this.fixedWidthSmallStillUrl = str10;
        this.fixedWidthSmallWidth = i19;
        this.fixedWidthSmallHeight = i20;
        this.username = username;
        this.caption = str11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String getCaption() {
        return this.caption;
    }

    public final int getFixedHeightDownsampledHeight() {
        return this.fixedHeightDownsampledHeight;
    }

    @Nullable
    public final String getFixedHeightDownsampledUrl() {
        return this.fixedHeightDownsampledUrl;
    }

    public final int getFixedHeightDownsampledWidth() {
        return this.fixedHeightDownsampledWidth;
    }

    public final int getFixedHeightSmallHeight() {
        return this.fixedHeightSmallHeight;
    }

    @Nullable
    public final String getFixedHeightSmallStillUrl() {
        return this.fixedHeightSmallStillUrl;
    }

    @Nullable
    public final String getFixedHeightSmallUrl() {
        return this.fixedHeightSmallUrl;
    }

    public final int getFixedHeightSmallWidth() {
        return this.fixedHeightSmallWidth;
    }

    public final int getFixedWidthDownsampledHeight() {
        return this.fixedWidthDownsampledHeight;
    }

    @Nullable
    public final String getFixedWidthDownsampledUrl() {
        return this.fixedWidthDownsampledUrl;
    }

    public final int getFixedWidthDownsampledWidth() {
        return this.fixedWidthDownsampledWidth;
    }

    public final int getFixedWidthSmallHeight() {
        return this.fixedWidthSmallHeight;
    }

    @Nullable
    public final String getFixedWidthSmallStillUrl() {
        return this.fixedWidthSmallStillUrl;
    }

    @Nullable
    public final String getFixedWidthSmallUrl() {
        return this.fixedWidthSmallUrl;
    }

    public final int getFixedWidthSmallWidth() {
        return this.fixedWidthSmallWidth;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final int getImageFrames() {
        return this.imageFrames;
    }

    public final int getImageHeight() {
        return this.imageHeight;
    }

    @Nullable
    public final String getImageMp4Url() {
        return this.imageMp4Url;
    }

    @Nullable
    public final String getImageOriginalUrl() {
        return this.imageOriginalUrl;
    }

    @Nullable
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final int getImageWidth() {
        return this.imageWidth;
    }

    @Nullable
    public final MediaType getType() {
        return this.type;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final String getUsername() {
        return this.username;
    }

    @NotNull
    public final Media toGif() {
        Media media = new Media(this.id, null, null, null, null, null, null, null, null, null, null, null, null, null, new Images(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048575, null), null, null, null, null, null, null, null, null, false, false, false, false, false, false, false, false, false, null, null, null, false, null, null, null, null, null, -16386, 511, null);
        media.setType(this.type);
        media.setUrl(this.url);
        media.setUser(new User(null, null, null, null, null, null, this.username, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, false, false, null, 134217663, null));
        media.getImages().setOriginal(new Image(null, 0, 0, 0, 0, null, 0, null, 0, null, null, 2047, null));
        Image original = media.getImages().getOriginal();
        Intrinsics.checkNotNull(original);
        original.setGifUrl(this.imageOriginalUrl);
        Image original2 = media.getImages().getOriginal();
        Intrinsics.checkNotNull(original2);
        original2.setMp4Url(this.imageMp4Url);
        Image original3 = media.getImages().getOriginal();
        Intrinsics.checkNotNull(original3);
        original3.setFrames(this.imageFrames);
        Image original4 = media.getImages().getOriginal();
        Intrinsics.checkNotNull(original4);
        original4.setWidth(this.imageWidth);
        Image original5 = media.getImages().getOriginal();
        Intrinsics.checkNotNull(original5);
        original5.setHeight(this.imageHeight);
        media.getImages().setFixedHeightDownsampled(new Image(null, 0, 0, 0, 0, null, 0, null, 0, null, null, 2047, null));
        Image fixedHeightDownsampled = media.getImages().getFixedHeightDownsampled();
        Intrinsics.checkNotNull(fixedHeightDownsampled);
        fixedHeightDownsampled.setGifUrl(this.fixedHeightDownsampledUrl);
        Image fixedHeightDownsampled2 = media.getImages().getFixedHeightDownsampled();
        Intrinsics.checkNotNull(fixedHeightDownsampled2);
        fixedHeightDownsampled2.setWidth(this.fixedHeightDownsampledWidth);
        Image fixedHeightDownsampled3 = media.getImages().getFixedHeightDownsampled();
        Intrinsics.checkNotNull(fixedHeightDownsampled3);
        fixedHeightDownsampled3.setHeight(this.fixedHeightDownsampledHeight);
        media.getImages().setFixedWidthDownsampled(new Image(null, 0, 0, 0, 0, null, 0, null, 0, null, null, 2047, null));
        Image fixedWidthDownsampled = media.getImages().getFixedWidthDownsampled();
        Intrinsics.checkNotNull(fixedWidthDownsampled);
        fixedWidthDownsampled.setGifUrl(this.fixedWidthDownsampledUrl);
        Image fixedWidthDownsampled2 = media.getImages().getFixedWidthDownsampled();
        Intrinsics.checkNotNull(fixedWidthDownsampled2);
        fixedWidthDownsampled2.setWidth(this.fixedWidthDownsampledWidth);
        Image fixedWidthDownsampled3 = media.getImages().getFixedWidthDownsampled();
        Intrinsics.checkNotNull(fixedWidthDownsampled3);
        fixedWidthDownsampled3.setHeight(this.fixedWidthDownsampledHeight);
        media.getImages().setFixedHeightSmall(new Image(null, 0, 0, 0, 0, null, 0, null, 0, null, null, 2047, null));
        Image fixedHeightSmall = media.getImages().getFixedHeightSmall();
        Intrinsics.checkNotNull(fixedHeightSmall);
        fixedHeightSmall.setGifUrl(this.fixedHeightSmallUrl);
        Image fixedHeightSmall2 = media.getImages().getFixedHeightSmall();
        Intrinsics.checkNotNull(fixedHeightSmall2);
        fixedHeightSmall2.setWidth(this.fixedHeightSmallWidth);
        Image fixedHeightSmall3 = media.getImages().getFixedHeightSmall();
        Intrinsics.checkNotNull(fixedHeightSmall3);
        fixedHeightSmall3.setHeight(this.fixedHeightSmallHeight);
        media.getImages().setFixedWidthSmall(new Image(null, 0, 0, 0, 0, null, 0, null, 0, null, null, 2047, null));
        Image fixedWidthSmall = media.getImages().getFixedWidthSmall();
        Intrinsics.checkNotNull(fixedWidthSmall);
        fixedWidthSmall.setGifUrl(this.fixedWidthSmallUrl);
        Image fixedWidthSmall2 = media.getImages().getFixedWidthSmall();
        Intrinsics.checkNotNull(fixedWidthSmall2);
        fixedWidthSmall2.setWidth(this.fixedWidthSmallWidth);
        Image fixedWidthSmall3 = media.getImages().getFixedWidthSmall();
        Intrinsics.checkNotNull(fixedWidthSmall3);
        fixedWidthSmall3.setHeight(this.fixedWidthSmallHeight);
        media.getImages().setFixedHeightSmallStill(new Image(null, 0, 0, 0, 0, null, 0, null, 0, null, null, 2047, null));
        Image fixedHeightSmallStill = media.getImages().getFixedHeightSmallStill();
        Intrinsics.checkNotNull(fixedHeightSmallStill);
        fixedHeightSmallStill.setGifUrl(this.fixedHeightSmallStillUrl);
        media.getImages().setFixedWidthSmallStill(new Image(null, 0, 0, 0, 0, null, 0, null, 0, null, null, 2047, null));
        Image fixedWidthSmallStill = media.getImages().getFixedWidthSmallStill();
        Intrinsics.checkNotNull(fixedWidthSmallStill);
        fixedWidthSmallStill.setGifUrl(this.fixedWidthSmallStillUrl);
        return media;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        MediaType mediaType = this.type;
        if (mediaType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mediaType.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.id);
        parcel.writeString(this.url);
        parcel.writeString(this.imageOriginalUrl);
        parcel.writeString(this.imageUrl);
        parcel.writeString(this.imageMp4Url);
        parcel.writeInt(this.imageFrames);
        parcel.writeInt(this.imageWidth);
        parcel.writeInt(this.imageHeight);
        parcel.writeString(this.fixedHeightDownsampledUrl);
        parcel.writeInt(this.fixedHeightDownsampledWidth);
        parcel.writeInt(this.fixedHeightDownsampledHeight);
        parcel.writeString(this.fixedWidthDownsampledUrl);
        parcel.writeInt(this.fixedWidthDownsampledWidth);
        parcel.writeInt(this.fixedWidthDownsampledHeight);
        parcel.writeString(this.fixedHeightSmallUrl);
        parcel.writeString(this.fixedHeightSmallStillUrl);
        parcel.writeInt(this.fixedHeightSmallWidth);
        parcel.writeInt(this.fixedHeightSmallHeight);
        parcel.writeString(this.fixedWidthSmallUrl);
        parcel.writeString(this.fixedWidthSmallStillUrl);
        parcel.writeInt(this.fixedWidthSmallWidth);
        parcel.writeInt(this.fixedWidthSmallHeight);
        parcel.writeString(this.username);
        parcel.writeString(this.caption);
    }

    public /* synthetic */ RandomGif(MediaType mediaType, String str, String str2, String str3, String str4, String str5, int i10, int i11, int i12, String str6, int i13, int i14, String str7, int i15, int i16, String str8, String str9, int i17, int i18, String str10, String str11, int i19, int i20, String str12, String str13, int i21, DefaultConstructorMarker defaultConstructorMarker) {
        this((i21 & 1) != 0 ? null : mediaType, str, (i21 & 4) != 0 ? null : str2, (i21 & 8) != 0 ? null : str3, (i21 & 16) != 0 ? null : str4, (i21 & 32) != 0 ? null : str5, (i21 & 64) != 0 ? 0 : i10, (i21 & 128) != 0 ? 0 : i11, (i21 & 256) != 0 ? 0 : i12, (i21 & 512) != 0 ? null : str6, (i21 & 1024) != 0 ? 0 : i13, (i21 & 2048) != 0 ? 0 : i14, (i21 & 4096) != 0 ? null : str7, (i21 & 8192) != 0 ? 0 : i15, (i21 & 16384) != 0 ? 0 : i16, (32768 & i21) != 0 ? null : str8, (65536 & i21) != 0 ? null : str9, (131072 & i21) != 0 ? 0 : i17, (262144 & i21) != 0 ? 0 : i18, (524288 & i21) != 0 ? null : str10, (1048576 & i21) != 0 ? null : str11, (2097152 & i21) != 0 ? 0 : i19, (4194304 & i21) != 0 ? 0 : i20, str12, (i21 & 16777216) != 0 ? null : str13);
    }
}
