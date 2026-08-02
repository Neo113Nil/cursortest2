package androidx.car.app.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import java.util.Objects;
import xsna.ktx;
import xsna.z280;

/* loaded from: classes11.dex */
public final class GridItem implements ktx {
    public static final int IMAGE_TYPE_ICON = 1;
    public static final int IMAGE_TYPE_LARGE = 2;

    @Nullable
    private final Badge mBadge;

    @Nullable
    private final CarIcon mImage;
    private final int mImageType;
    private final boolean mIsLoading;

    @Nullable
    private final z280 mOnClickDelegate;

    @Nullable
    private final CarText mText;

    @Nullable
    private final CarText mTitle;

    public static final class a {
    }

    public GridItem(a aVar) {
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GridItem)) {
            return false;
        }
        GridItem gridItem = (GridItem) obj;
        if (this.mIsLoading == gridItem.mIsLoading && Objects.equals(this.mTitle, gridItem.mTitle) && Objects.equals(this.mText, gridItem.mText) && Objects.equals(this.mImage, gridItem.mImage)) {
            if (Boolean.valueOf(this.mOnClickDelegate == null).equals(Boolean.valueOf(gridItem.mOnClickDelegate == null)) && Objects.equals(this.mBadge, gridItem.mBadge) && this.mImageType == gridItem.mImageType) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public Badge getBadge() {
        return this.mBadge;
    }

    @Nullable
    public CarIcon getImage() {
        return this.mImage;
    }

    public int getImageType() {
        return this.mImageType;
    }

    @Nullable
    public z280 getOnClickDelegate() {
        return this.mOnClickDelegate;
    }

    @Nullable
    public CarText getText() {
        return this.mText;
    }

    @Nullable
    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mIsLoading), this.mTitle, this.mImage, Integer.valueOf(this.mImageType), Boolean.valueOf(this.mOnClickDelegate == null), this.mBadge);
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    @NonNull
    public String toString() {
        return "[title: " + CarText.toShortString(this.mTitle) + ", text: " + CarText.toShortString(this.mText) + ", image: " + this.mImage + ", isLoading: " + this.mIsLoading + ", badge: " + this.mBadge + X3.j.e;
    }

    private GridItem() {
        this.mIsLoading = false;
        this.mTitle = null;
        this.mText = null;
        this.mImage = null;
        this.mImageType = 2;
        this.mOnClickDelegate = null;
        this.mBadge = null;
    }
}
