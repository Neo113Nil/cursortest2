package com.giphy.sdk.core.models;

import Gb.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.giphy.sdk.core.models.enums.RenditionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\"\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001Bõ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0002\u0010\u0018J\t\u00109\u001a\u00020:HÖ\u0001J\u0006\u0010;\u001a\u00020<J\u0019\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020:HÖ\u0001R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001a\"\u0004\b!\u0010\"R \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001a\"\u0004\b$\u0010\"R \u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001a\"\u0004\b&\u0010\"R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001aR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001aR \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001a\"\u0004\b*\u0010\"R \u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001a\"\u0004\b,\u0010\"R \u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001a\"\u0004\b.\u0010\"R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001aR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001aR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u001a\"\u0004\b6\u0010\"R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\u001aR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\u001a¨\u0006A"}, d2 = {"Lcom/giphy/sdk/core/models/Images;", "Landroid/os/Parcelable;", "fixedHeight", "Lcom/giphy/sdk/core/models/Image;", "fixedHeightStill", "fixedHeightDownsampled", "fixedWidth", "fixedWidthStill", "fixedWidthDownsampled", "fixedHeightSmall", "fixedHeightSmallStill", "fixedWidthSmall", "fixedWidthSmallStill", "downsized", "downsizedStill", "downsizedLarge", "downsizedMedium", "original", "originalStill", "looping", "preview", "downsizedSmall", "mediaId", "", "(Lcom/giphy/sdk/core/models/Image;Lcom/giphy/sdk/core/models/Image;Lcom/giphy/sdk/core/models/Image;Lcom/giphy/sdk/core/models/Image;Lcom/giphy/sdk/core/models/Image;Lcom/giphy/sdk/core/models/Image;Lcom/giphy/sdk/core/models/Image;Lcom/giphy/sdk/core/models/Image;Lcom/giphy/sdk/core/models/Image;Lcom/giphy/sdk/core/models/Image;Lcom/giphy/sdk/core/models/Image;Lcom/giphy/sdk/core/models/Image;Lcom/giphy/sdk/core/models/Image;Lcom/giphy/sdk/core/models/Image;Lcom/giphy/sdk/core/models/Image;Lcom/giphy/sdk/core/models/Image;Lcom/giphy/sdk/core/models/Image;Lcom/giphy/sdk/core/models/Image;Lcom/giphy/sdk/core/models/Image;Ljava/lang/String;)V", "getDownsized", "()Lcom/giphy/sdk/core/models/Image;", "getDownsizedLarge", "getDownsizedMedium", "getDownsizedSmall", "getDownsizedStill", "getFixedHeight", "getFixedHeightDownsampled", "setFixedHeightDownsampled", "(Lcom/giphy/sdk/core/models/Image;)V", "getFixedHeightSmall", "setFixedHeightSmall", "getFixedHeightSmallStill", "setFixedHeightSmallStill", "getFixedHeightStill", "getFixedWidth", "getFixedWidthDownsampled", "setFixedWidthDownsampled", "getFixedWidthSmall", "setFixedWidthSmall", "getFixedWidthSmallStill", "setFixedWidthSmallStill", "getFixedWidthStill", "getLooping", "getMediaId", "()Ljava/lang/String;", "setMediaId", "(Ljava/lang/String;)V", "getOriginal", "setOriginal", "getOriginalStill", "getPreview", "describeContents", "", "postProcess", "", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "giphy-ui-2.3.17_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Images implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Images> CREATOR = new Creator();

    @Nullable
    private final Image downsized;

    @c("downsized_large")
    @Nullable
    private final Image downsizedLarge;

    @c("downsized_medium")
    @Nullable
    private final Image downsizedMedium;

    @c("downsized_small")
    @Nullable
    private final Image downsizedSmall;

    @c("downsized_still")
    @Nullable
    private final Image downsizedStill;

    @c("fixed_height")
    @Nullable
    private final Image fixedHeight;

    @c("fixed_height_downsampled")
    @Nullable
    private Image fixedHeightDownsampled;

    @c("fixed_height_small")
    @Nullable
    private Image fixedHeightSmall;

    @c("fixed_height_small_still")
    @Nullable
    private Image fixedHeightSmallStill;

    @c("fixed_height_still")
    @Nullable
    private final Image fixedHeightStill;

    @c("fixed_width")
    @Nullable
    private final Image fixedWidth;

    @c("fixed_width_downsampled")
    @Nullable
    private Image fixedWidthDownsampled;

    @c("fixed_width_small")
    @Nullable
    private Image fixedWidthSmall;

    @c("fixed_width_small_still")
    @Nullable
    private Image fixedWidthSmallStill;

    @c("fixed_width_still")
    @Nullable
    private final Image fixedWidthStill;

    @Nullable
    private final Image looping;

    @Nullable
    private String mediaId;

    @Nullable
    private Image original;

    @c("original_still")
    @Nullable
    private final Image originalStill;

    @Nullable
    private final Image preview;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Images> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Images createFromParcel(@NotNull Parcel parcel) {
            Image image;
            Image createFromParcel;
            Image image2;
            Image createFromParcel2;
            Image image3;
            Image createFromParcel3;
            Image image4;
            Image createFromParcel4;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Image createFromParcel5 = parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel);
            Image createFromParcel6 = parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel);
            Image createFromParcel7 = parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel);
            Image createFromParcel8 = parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel);
            Image createFromParcel9 = parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel);
            Image createFromParcel10 = parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel);
            Image createFromParcel11 = parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel);
            Image createFromParcel12 = parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel);
            Image createFromParcel13 = parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel);
            Image createFromParcel14 = parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel);
            Image createFromParcel15 = parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel);
            Image createFromParcel16 = parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel);
            Image createFromParcel17 = parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel);
            Image createFromParcel18 = parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                image = createFromParcel5;
                createFromParcel = null;
            } else {
                image = createFromParcel5;
                createFromParcel = Image.CREATOR.createFromParcel(parcel);
            }
            Image image5 = createFromParcel;
            if (parcel.readInt() == 0) {
                image2 = image5;
                createFromParcel2 = null;
            } else {
                image2 = image5;
                createFromParcel2 = Image.CREATOR.createFromParcel(parcel);
            }
            Image image6 = createFromParcel2;
            if (parcel.readInt() == 0) {
                image3 = image6;
                createFromParcel3 = null;
            } else {
                image3 = image6;
                createFromParcel3 = Image.CREATOR.createFromParcel(parcel);
            }
            Image image7 = createFromParcel3;
            if (parcel.readInt() == 0) {
                image4 = image7;
                createFromParcel4 = null;
            } else {
                image4 = image7;
                createFromParcel4 = Image.CREATOR.createFromParcel(parcel);
            }
            return new Images(image, createFromParcel6, createFromParcel7, createFromParcel8, createFromParcel9, createFromParcel10, createFromParcel11, createFromParcel12, createFromParcel13, createFromParcel14, createFromParcel15, createFromParcel16, createFromParcel17, createFromParcel18, image2, image3, image4, createFromParcel4, parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Images[] newArray(int i10) {
            return new Images[i10];
        }
    }

    public Images() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048575, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final Image getDownsized() {
        return this.downsized;
    }

    @Nullable
    public final Image getDownsizedLarge() {
        return this.downsizedLarge;
    }

    @Nullable
    public final Image getDownsizedMedium() {
        return this.downsizedMedium;
    }

    @Nullable
    public final Image getDownsizedSmall() {
        return this.downsizedSmall;
    }

    @Nullable
    public final Image getDownsizedStill() {
        return this.downsizedStill;
    }

    @Nullable
    public final Image getFixedHeight() {
        return this.fixedHeight;
    }

    @Nullable
    public final Image getFixedHeightDownsampled() {
        return this.fixedHeightDownsampled;
    }

    @Nullable
    public final Image getFixedHeightSmall() {
        return this.fixedHeightSmall;
    }

    @Nullable
    public final Image getFixedHeightSmallStill() {
        return this.fixedHeightSmallStill;
    }

    @Nullable
    public final Image getFixedHeightStill() {
        return this.fixedHeightStill;
    }

    @Nullable
    public final Image getFixedWidth() {
        return this.fixedWidth;
    }

    @Nullable
    public final Image getFixedWidthDownsampled() {
        return this.fixedWidthDownsampled;
    }

    @Nullable
    public final Image getFixedWidthSmall() {
        return this.fixedWidthSmall;
    }

    @Nullable
    public final Image getFixedWidthSmallStill() {
        return this.fixedWidthSmallStill;
    }

    @Nullable
    public final Image getFixedWidthStill() {
        return this.fixedWidthStill;
    }

    @Nullable
    public final Image getLooping() {
        return this.looping;
    }

    @Nullable
    public final String getMediaId() {
        return this.mediaId;
    }

    @Nullable
    public final Image getOriginal() {
        return this.original;
    }

    @Nullable
    public final Image getOriginalStill() {
        return this.originalStill;
    }

    @Nullable
    public final Image getPreview() {
        return this.preview;
    }

    public final void postProcess() {
        Image image = this.original;
        if (image != null) {
            Intrinsics.checkNotNull(image);
            image.setMediaId(this.mediaId);
            Image image2 = this.original;
            Intrinsics.checkNotNull(image2);
            image2.setRenditionType(RenditionType.original);
        }
        Image image3 = this.originalStill;
        if (image3 != null) {
            image3.setMediaId(this.mediaId);
            this.originalStill.setRenditionType(RenditionType.originalStill);
        }
        Image image4 = this.fixedHeight;
        if (image4 != null) {
            image4.setMediaId(this.mediaId);
            this.fixedHeight.setRenditionType(RenditionType.fixedHeight);
        }
        Image image5 = this.fixedHeightStill;
        if (image5 != null) {
            image5.setMediaId(this.mediaId);
            this.fixedHeightStill.setRenditionType(RenditionType.fixedHeightStill);
        }
        Image image6 = this.fixedHeightDownsampled;
        if (image6 != null) {
            Intrinsics.checkNotNull(image6);
            image6.setMediaId(this.mediaId);
            Image image7 = this.fixedHeightDownsampled;
            Intrinsics.checkNotNull(image7);
            image7.setRenditionType(RenditionType.fixedHeightDownsampled);
        }
        Image image8 = this.fixedWidth;
        if (image8 != null) {
            image8.setMediaId(this.mediaId);
            this.fixedWidth.setRenditionType(RenditionType.fixedWidth);
        }
        Image image9 = this.fixedWidthStill;
        if (image9 != null) {
            image9.setMediaId(this.mediaId);
            this.fixedWidthStill.setRenditionType(RenditionType.fixedWidthStill);
        }
        Image image10 = this.fixedWidthDownsampled;
        if (image10 != null) {
            Intrinsics.checkNotNull(image10);
            image10.setMediaId(this.mediaId);
            Image image11 = this.fixedWidthDownsampled;
            Intrinsics.checkNotNull(image11);
            image11.setRenditionType(RenditionType.fixedWidthDownsampled);
        }
        Image image12 = this.fixedHeightSmall;
        if (image12 != null) {
            Intrinsics.checkNotNull(image12);
            image12.setMediaId(this.mediaId);
            Image image13 = this.fixedHeightSmall;
            Intrinsics.checkNotNull(image13);
            image13.setRenditionType(RenditionType.fixedHeightSmall);
        }
        Image image14 = this.fixedHeightSmallStill;
        if (image14 != null) {
            Intrinsics.checkNotNull(image14);
            image14.setMediaId(this.mediaId);
            Image image15 = this.fixedHeightSmallStill;
            Intrinsics.checkNotNull(image15);
            image15.setRenditionType(RenditionType.fixedHeightSmallStill);
        }
        Image image16 = this.fixedWidthSmall;
        if (image16 != null) {
            Intrinsics.checkNotNull(image16);
            image16.setMediaId(this.mediaId);
            Image image17 = this.fixedWidthSmall;
            Intrinsics.checkNotNull(image17);
            image17.setRenditionType(RenditionType.fixedWidthSmall);
        }
        Image image18 = this.fixedWidthSmallStill;
        if (image18 != null) {
            Intrinsics.checkNotNull(image18);
            image18.setMediaId(this.mediaId);
            Image image19 = this.fixedWidthSmallStill;
            Intrinsics.checkNotNull(image19);
            image19.setRenditionType(RenditionType.fixedWidthSmallStill);
        }
        Image image20 = this.downsized;
        if (image20 != null) {
            image20.setMediaId(this.mediaId);
            this.downsized.setRenditionType(RenditionType.downsized);
        }
        Image image21 = this.downsizedStill;
        if (image21 != null) {
            image21.setMediaId(this.mediaId);
            this.downsizedStill.setRenditionType(RenditionType.downsizedStill);
        }
        Image image22 = this.downsizedLarge;
        if (image22 != null) {
            image22.setMediaId(this.mediaId);
            this.downsizedLarge.setRenditionType(RenditionType.downsizedLarge);
        }
        Image image23 = this.downsizedMedium;
        if (image23 != null) {
            image23.setMediaId(this.mediaId);
            this.downsizedMedium.setRenditionType(RenditionType.downsizedMedium);
        }
        Image image24 = this.looping;
        if (image24 != null) {
            image24.setMediaId(this.mediaId);
            this.looping.setRenditionType(RenditionType.looping);
        }
        Image image25 = this.preview;
        if (image25 != null) {
            image25.setMediaId(this.mediaId);
            this.preview.setRenditionType(RenditionType.preview);
        }
        Image image26 = this.downsizedSmall;
        if (image26 != null) {
            image26.setMediaId(this.mediaId);
            this.downsizedSmall.setRenditionType(RenditionType.downsizedSmall);
        }
    }

    public final void setFixedHeightDownsampled(@Nullable Image image) {
        this.fixedHeightDownsampled = image;
    }

    public final void setFixedHeightSmall(@Nullable Image image) {
        this.fixedHeightSmall = image;
    }

    public final void setFixedHeightSmallStill(@Nullable Image image) {
        this.fixedHeightSmallStill = image;
    }

    public final void setFixedWidthDownsampled(@Nullable Image image) {
        this.fixedWidthDownsampled = image;
    }

    public final void setFixedWidthSmall(@Nullable Image image) {
        this.fixedWidthSmall = image;
    }

    public final void setFixedWidthSmallStill(@Nullable Image image) {
        this.fixedWidthSmallStill = image;
    }

    public final void setMediaId(@Nullable String str) {
        this.mediaId = str;
    }

    public final void setOriginal(@Nullable Image image) {
        this.original = image;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        Image image = this.fixedHeight;
        if (image == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            image.writeToParcel(parcel, flags);
        }
        Image image2 = this.fixedHeightStill;
        if (image2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            image2.writeToParcel(parcel, flags);
        }
        Image image3 = this.fixedHeightDownsampled;
        if (image3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            image3.writeToParcel(parcel, flags);
        }
        Image image4 = this.fixedWidth;
        if (image4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            image4.writeToParcel(parcel, flags);
        }
        Image image5 = this.fixedWidthStill;
        if (image5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            image5.writeToParcel(parcel, flags);
        }
        Image image6 = this.fixedWidthDownsampled;
        if (image6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            image6.writeToParcel(parcel, flags);
        }
        Image image7 = this.fixedHeightSmall;
        if (image7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            image7.writeToParcel(parcel, flags);
        }
        Image image8 = this.fixedHeightSmallStill;
        if (image8 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            image8.writeToParcel(parcel, flags);
        }
        Image image9 = this.fixedWidthSmall;
        if (image9 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            image9.writeToParcel(parcel, flags);
        }
        Image image10 = this.fixedWidthSmallStill;
        if (image10 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            image10.writeToParcel(parcel, flags);
        }
        Image image11 = this.downsized;
        if (image11 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            image11.writeToParcel(parcel, flags);
        }
        Image image12 = this.downsizedStill;
        if (image12 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            image12.writeToParcel(parcel, flags);
        }
        Image image13 = this.downsizedLarge;
        if (image13 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            image13.writeToParcel(parcel, flags);
        }
        Image image14 = this.downsizedMedium;
        if (image14 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            image14.writeToParcel(parcel, flags);
        }
        Image image15 = this.original;
        if (image15 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            image15.writeToParcel(parcel, flags);
        }
        Image image16 = this.originalStill;
        if (image16 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            image16.writeToParcel(parcel, flags);
        }
        Image image17 = this.looping;
        if (image17 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            image17.writeToParcel(parcel, flags);
        }
        Image image18 = this.preview;
        if (image18 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            image18.writeToParcel(parcel, flags);
        }
        Image image19 = this.downsizedSmall;
        if (image19 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            image19.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.mediaId);
    }

    public Images(@Nullable Image image, @Nullable Image image2, @Nullable Image image3, @Nullable Image image4, @Nullable Image image5, @Nullable Image image6, @Nullable Image image7, @Nullable Image image8, @Nullable Image image9, @Nullable Image image10, @Nullable Image image11, @Nullable Image image12, @Nullable Image image13, @Nullable Image image14, @Nullable Image image15, @Nullable Image image16, @Nullable Image image17, @Nullable Image image18, @Nullable Image image19, @Nullable String str) {
        this.fixedHeight = image;
        this.fixedHeightStill = image2;
        this.fixedHeightDownsampled = image3;
        this.fixedWidth = image4;
        this.fixedWidthStill = image5;
        this.fixedWidthDownsampled = image6;
        this.fixedHeightSmall = image7;
        this.fixedHeightSmallStill = image8;
        this.fixedWidthSmall = image9;
        this.fixedWidthSmallStill = image10;
        this.downsized = image11;
        this.downsizedStill = image12;
        this.downsizedLarge = image13;
        this.downsizedMedium = image14;
        this.original = image15;
        this.originalStill = image16;
        this.looping = image17;
        this.preview = image18;
        this.downsizedSmall = image19;
        this.mediaId = str;
    }

    public /* synthetic */ Images(Image image, Image image2, Image image3, Image image4, Image image5, Image image6, Image image7, Image image8, Image image9, Image image10, Image image11, Image image12, Image image13, Image image14, Image image15, Image image16, Image image17, Image image18, Image image19, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : image, (i10 & 2) != 0 ? null : image2, (i10 & 4) != 0 ? null : image3, (i10 & 8) != 0 ? null : image4, (i10 & 16) != 0 ? null : image5, (i10 & 32) != 0 ? null : image6, (i10 & 64) != 0 ? null : image7, (i10 & 128) != 0 ? null : image8, (i10 & 256) != 0 ? null : image9, (i10 & 512) != 0 ? null : image10, (i10 & 1024) != 0 ? null : image11, (i10 & 2048) != 0 ? null : image12, (i10 & 4096) != 0 ? null : image13, (i10 & 8192) != 0 ? null : image14, (i10 & 16384) != 0 ? null : image15, (i10 & 32768) != 0 ? null : image16, (i10 & PKIFailureInfo.notAuthorized) != 0 ? null : image17, (i10 & PKIFailureInfo.unsupportedVersion) != 0 ? null : image18, (i10 & PKIFailureInfo.transactionIdInUse) != 0 ? null : image19, (i10 & PKIFailureInfo.signerNotTrusted) != 0 ? null : str);
    }
}
