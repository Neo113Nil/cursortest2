package ru.ozon.app.android.storefront.stories.story.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u001f\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/storefront/stories/story/data/StoryWithImage;", "Lru/ozon/app/android/storefront/stories/story/data/StoryItemAsset;", "Landroid/os/Parcelable;", "imageUrl", "", "align", "Lru/ozon/app/android/storefront/stories/story/data/Alignment;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/storefront/stories/story/data/Alignment;)V", "getImageUrl", "()Ljava/lang/String;", "getAlign", "()Lru/ozon/app/android/storefront/stories/story/data/Alignment;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class StoryWithImage extends StoryItemAsset implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<StoryWithImage> CREATOR = new Creator();
    private final Alignment align;

    @NotNull
    private final String imageUrl;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StoryWithImage> {
        @Override // android.os.Parcelable.Creator
        public final StoryWithImage createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StoryWithImage(parcel.readString(), parcel.readInt() == 0 ? null : Alignment.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final StoryWithImage[] newArray(int i11) {
            return new StoryWithImage[i11];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryWithImage(@i(name = "image") @NotNull String imageUrl, Alignment alignment) {
        super(null);
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        this.imageUrl = imageUrl;
        this.align = alignment;
    }

    public static /* synthetic */ StoryWithImage copy$default(StoryWithImage storyWithImage, String str, Alignment alignment, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = storyWithImage.imageUrl;
        }
        if ((i11 & 2) != 0) {
            alignment = storyWithImage.align;
        }
        return storyWithImage.copy(str, alignment);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final Alignment getAlign() {
        return this.align;
    }

    @NotNull
    public final StoryWithImage copy(@i(name = "image") @NotNull String imageUrl, Alignment align) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        return new StoryWithImage(imageUrl, align);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StoryWithImage)) {
            return false;
        }
        StoryWithImage storyWithImage = (StoryWithImage) other;
        return Intrinsics.d(this.imageUrl, storyWithImage.imageUrl) && this.align == storyWithImage.align;
    }

    public final Alignment getAlign() {
        return this.align;
    }

    @NotNull
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public int hashCode() {
        int hashCode = this.imageUrl.hashCode() * 31;
        Alignment alignment = this.align;
        return hashCode + (alignment == null ? 0 : alignment.hashCode());
    }

    @NotNull
    public String toString() {
        return "StoryWithImage(imageUrl=" + this.imageUrl + ", align=" + this.align + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.imageUrl);
        Alignment alignment = this.align;
        if (alignment == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(alignment.name());
        }
    }
}
