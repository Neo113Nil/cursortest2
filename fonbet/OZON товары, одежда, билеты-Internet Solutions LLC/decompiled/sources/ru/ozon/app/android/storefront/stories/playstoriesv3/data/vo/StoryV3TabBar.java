package ru.ozon.app.android.storefront.stories.playstoriesv3.data.vo;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000eJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3TabBar;", "Landroid/os/Parcelable;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "shareButton", "<init>", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getShareButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class StoryV3TabBar implements Parcelable {
    public static final int $stable = ButtonV3Atom.SmallIconButton.$stable;

    @NotNull
    public static final Parcelable.Creator<StoryV3TabBar> CREATOR = new Creator();

    @NotNull
    private final ButtonV3Atom.SmallIconButton shareButton;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StoryV3TabBar> {
        @Override // android.os.Parcelable.Creator
        public final StoryV3TabBar createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StoryV3TabBar((ButtonV3Atom.SmallIconButton) parcel.readParcelable(StoryV3TabBar.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final StoryV3TabBar[] newArray(int i11) {
            return new StoryV3TabBar[i11];
        }
    }

    public StoryV3TabBar(@NotNull ButtonV3Atom.SmallIconButton shareButton) {
        Intrinsics.checkNotNullParameter(shareButton, "shareButton");
        this.shareButton = shareButton;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof StoryV3TabBar) && Intrinsics.d(this.shareButton, ((StoryV3TabBar) other).shareButton);
    }

    @NotNull
    public final ButtonV3Atom.SmallIconButton getShareButton() {
        return this.shareButton;
    }

    public int hashCode() {
        return this.shareButton.hashCode();
    }

    @NotNull
    public String toString() {
        return "StoryV3TabBar(shareButton=" + this.shareButton + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.shareButton, flags);
    }
}
