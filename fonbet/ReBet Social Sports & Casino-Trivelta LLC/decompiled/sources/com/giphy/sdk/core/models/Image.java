package com.giphy.sdk.core.models;

import Gb.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.giphy.sdk.core.models.enums.RenditionType;
import com.twilio.voice.EventKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B}\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\t\u0010)\u001a\u00020\u0005HÖ\u0001J\u0019\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0012\"\u0004\b\u001b\u0010\u0014R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012R \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0017\"\u0004\b \u0010\u0019R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0016\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0012R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0012\"\u0004\b(\u0010\u0014¨\u0006/"}, d2 = {"Lcom/giphy/sdk/core/models/Image;", "Landroid/os/Parcelable;", "gifUrl", "", "width", "", "height", "gifSize", "frames", "mp4Url", "mp4Size", "webPUrl", "webPSize", "mediaId", "renditionType", "Lcom/giphy/sdk/core/models/enums/RenditionType;", "(Ljava/lang/String;IIIILjava/lang/String;ILjava/lang/String;ILjava/lang/String;Lcom/giphy/sdk/core/models/enums/RenditionType;)V", "getFrames", "()I", "setFrames", "(I)V", "getGifSize", "getGifUrl", "()Ljava/lang/String;", "setGifUrl", "(Ljava/lang/String;)V", "getHeight", "setHeight", "getMediaId", "setMediaId", "getMp4Size", "getMp4Url", "setMp4Url", "getRenditionType", "()Lcom/giphy/sdk/core/models/enums/RenditionType;", "setRenditionType", "(Lcom/giphy/sdk/core/models/enums/RenditionType;)V", "getWebPSize", "getWebPUrl", "getWidth", "setWidth", "describeContents", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "giphy-ui-2.3.17_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Image implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Image> CREATOR = new Creator();
    private int frames;

    @c("size")
    private final int gifSize;

    @c(EventKeys.URL)
    @Nullable
    private String gifUrl;
    private int height;

    @Nullable
    private String mediaId;

    @c("mp4_size")
    private final int mp4Size;

    @c("mp4")
    @Nullable
    private String mp4Url;

    @Nullable
    private RenditionType renditionType;

    @c("webp_size")
    private final int webPSize;

    @c("webp")
    @Nullable
    private final String webPUrl;
    private int width;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Image> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Image createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Image(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : RenditionType.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Image[] newArray(int i10) {
            return new Image[i10];
        }
    }

    public Image() {
        this(null, 0, 0, 0, 0, null, 0, null, 0, null, null, 2047, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int getFrames() {
        return this.frames;
    }

    public final int getGifSize() {
        return this.gifSize;
    }

    @Nullable
    public final String getGifUrl() {
        return this.gifUrl;
    }

    public final int getHeight() {
        return this.height;
    }

    @Nullable
    public final String getMediaId() {
        return this.mediaId;
    }

    public final int getMp4Size() {
        return this.mp4Size;
    }

    @Nullable
    public final String getMp4Url() {
        return this.mp4Url;
    }

    @Nullable
    public final RenditionType getRenditionType() {
        return this.renditionType;
    }

    public final int getWebPSize() {
        return this.webPSize;
    }

    @Nullable
    public final String getWebPUrl() {
        return this.webPUrl;
    }

    public final int getWidth() {
        return this.width;
    }

    public final void setFrames(int i10) {
        this.frames = i10;
    }

    public final void setGifUrl(@Nullable String str) {
        this.gifUrl = str;
    }

    public final void setHeight(int i10) {
        this.height = i10;
    }

    public final void setMediaId(@Nullable String str) {
        this.mediaId = str;
    }

    public final void setMp4Url(@Nullable String str) {
        this.mp4Url = str;
    }

    public final void setRenditionType(@Nullable RenditionType renditionType) {
        this.renditionType = renditionType;
    }

    public final void setWidth(int i10) {
        this.width = i10;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.gifUrl);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeInt(this.gifSize);
        parcel.writeInt(this.frames);
        parcel.writeString(this.mp4Url);
        parcel.writeInt(this.mp4Size);
        parcel.writeString(this.webPUrl);
        parcel.writeInt(this.webPSize);
        parcel.writeString(this.mediaId);
        RenditionType renditionType = this.renditionType;
        if (renditionType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(renditionType.name());
        }
    }

    public Image(@Nullable String str, int i10, int i11, int i12, int i13, @Nullable String str2, int i14, @Nullable String str3, int i15, @Nullable String str4, @Nullable RenditionType renditionType) {
        this.gifUrl = str;
        this.width = i10;
        this.height = i11;
        this.gifSize = i12;
        this.frames = i13;
        this.mp4Url = str2;
        this.mp4Size = i14;
        this.webPUrl = str3;
        this.webPSize = i15;
        this.mediaId = str4;
        this.renditionType = renditionType;
    }

    public /* synthetic */ Image(String str, int i10, int i11, int i12, int i13, String str2, int i14, String str3, int i15, String str4, RenditionType renditionType, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this((i16 & 1) != 0 ? null : str, (i16 & 2) != 0 ? 0 : i10, (i16 & 4) != 0 ? 0 : i11, (i16 & 8) != 0 ? 0 : i12, (i16 & 16) != 0 ? 0 : i13, (i16 & 32) != 0 ? null : str2, (i16 & 64) != 0 ? 0 : i14, (i16 & 128) != 0 ? null : str3, (i16 & 256) != 0 ? 0 : i15, (i16 & 512) != 0 ? null : str4, (i16 & 1024) != 0 ? null : renditionType);
    }
}
