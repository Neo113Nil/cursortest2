package ru.ozon.app.android.storefront.stories.playstoriesv3.data.vo;

import J0.C3349u1;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.cell.IconTitleSubtitleCellDTO;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0013J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3;", "Landroid/os/Parcelable;", "", "storyId", "Lru/ozon/uni/atoms/data/cell/IconTitleSubtitleCellDTO;", "authorBlock", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "closeButton", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3Type;", "data", "<init>", "(ILru/ozon/uni/atoms/data/cell/IconTitleSubtitleCellDTO;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3Type;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getStoryId", "Lru/ozon/uni/atoms/data/cell/IconTitleSubtitleCellDTO;", "getAuthorBlock", "()Lru/ozon/uni/atoms/data/cell/IconTitleSubtitleCellDTO;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getCloseButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3Type;", "getData", "()Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3Type;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class StoryV3 implements Parcelable {
    public static final int $stable = ButtonV3Atom.SmallIconButton.$stable | IconTitleSubtitleCellDTO.$stable;

    @NotNull
    public static final Parcelable.Creator<StoryV3> CREATOR = new Creator();
    private final IconTitleSubtitleCellDTO authorBlock;

    @NotNull
    private final ButtonV3Atom.SmallIconButton closeButton;

    @NotNull
    private final StoryV3Type data;
    private final int storyId;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StoryV3> {
        @Override // android.os.Parcelable.Creator
        public final StoryV3 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StoryV3(parcel.readInt(), (IconTitleSubtitleCellDTO) parcel.readParcelable(StoryV3.class.getClassLoader()), (ButtonV3Atom.SmallIconButton) parcel.readParcelable(StoryV3.class.getClassLoader()), (StoryV3Type) parcel.readValue(StoryV3.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final StoryV3[] newArray(int i11) {
            return new StoryV3[i11];
        }
    }

    public StoryV3(int i11, IconTitleSubtitleCellDTO iconTitleSubtitleCellDTO, @NotNull ButtonV3Atom.SmallIconButton closeButton, @NotNull StoryV3Type data) {
        Intrinsics.checkNotNullParameter(closeButton, "closeButton");
        Intrinsics.checkNotNullParameter(data, "data");
        this.storyId = i11;
        this.authorBlock = iconTitleSubtitleCellDTO;
        this.closeButton = closeButton;
        this.data = data;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StoryV3)) {
            return false;
        }
        StoryV3 storyV3 = (StoryV3) other;
        return this.storyId == storyV3.storyId && Intrinsics.d(this.authorBlock, storyV3.authorBlock) && Intrinsics.d(this.closeButton, storyV3.closeButton) && Intrinsics.d(this.data, storyV3.data);
    }

    public final IconTitleSubtitleCellDTO getAuthorBlock() {
        return this.authorBlock;
    }

    @NotNull
    public final ButtonV3Atom.SmallIconButton getCloseButton() {
        return this.closeButton;
    }

    @NotNull
    public final StoryV3Type getData() {
        return this.data;
    }

    public final int getStoryId() {
        return this.storyId;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.storyId) * 31;
        IconTitleSubtitleCellDTO iconTitleSubtitleCellDTO = this.authorBlock;
        return this.data.hashCode() + C3349u1.d(this.closeButton, (hashCode + (iconTitleSubtitleCellDTO == null ? 0 : iconTitleSubtitleCellDTO.hashCode())) * 31, 31);
    }

    @NotNull
    public String toString() {
        return "StoryV3(storyId=" + this.storyId + ", authorBlock=" + this.authorBlock + ", closeButton=" + this.closeButton + ", data=" + this.data + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.storyId);
        dest.writeParcelable(this.authorBlock, flags);
        dest.writeParcelable(this.closeButton, flags);
        dest.writeValue(this.data);
    }
}
