package com.blaze.blazesdk.style.widgets;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.blaze.blazesdk.utils.BlazeParcelable;
import defpackage.wt3;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemImageAnimatedThumbnailStyle;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", "isEnabled", "", "horizontalAnimationTriggerPercentage", "", "<init>", "(ZF)V", "()Z", "setEnabled", "(Z)V", "getHorizontalAnimationTriggerPercentage", "()F", "setHorizontalAnimationTriggerPercentage", "(F)V", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlazeWidgetItemImageAnimatedThumbnailStyle implements BlazeParcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazeWidgetItemImageAnimatedThumbnailStyle> CREATOR = new a();
    private float horizontalAnimationTriggerPercentage;
    private boolean isEnabled;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new BlazeWidgetItemImageAnimatedThumbnailStyle(parcel.readInt() != 0, parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazeWidgetItemImageAnimatedThumbnailStyle[i];
        }
    }

    public BlazeWidgetItemImageAnimatedThumbnailStyle(boolean z, float f) {
        this.isEnabled = z;
        this.horizontalAnimationTriggerPercentage = f;
    }

    public static /* synthetic */ BlazeWidgetItemImageAnimatedThumbnailStyle copy$default(BlazeWidgetItemImageAnimatedThumbnailStyle blazeWidgetItemImageAnimatedThumbnailStyle, boolean z, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            z = blazeWidgetItemImageAnimatedThumbnailStyle.isEnabled;
        }
        if ((i & 2) != 0) {
            f = blazeWidgetItemImageAnimatedThumbnailStyle.horizontalAnimationTriggerPercentage;
        }
        return blazeWidgetItemImageAnimatedThumbnailStyle.copy(z, f);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final float getHorizontalAnimationTriggerPercentage() {
        return this.horizontalAnimationTriggerPercentage;
    }

    @NotNull
    public final BlazeWidgetItemImageAnimatedThumbnailStyle copy(boolean isEnabled, float horizontalAnimationTriggerPercentage) {
        return new BlazeWidgetItemImageAnimatedThumbnailStyle(isEnabled, horizontalAnimationTriggerPercentage);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeWidgetItemImageAnimatedThumbnailStyle)) {
            return false;
        }
        BlazeWidgetItemImageAnimatedThumbnailStyle blazeWidgetItemImageAnimatedThumbnailStyle = (BlazeWidgetItemImageAnimatedThumbnailStyle) other;
        return this.isEnabled == blazeWidgetItemImageAnimatedThumbnailStyle.isEnabled && Float.compare(this.horizontalAnimationTriggerPercentage, blazeWidgetItemImageAnimatedThumbnailStyle.horizontalAnimationTriggerPercentage) == 0;
    }

    public final float getHorizontalAnimationTriggerPercentage() {
        return this.horizontalAnimationTriggerPercentage;
    }

    public int hashCode() {
        return Float.hashCode(this.horizontalAnimationTriggerPercentage) + (Boolean.hashCode(this.isEnabled) * 31);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final void setEnabled(boolean z) {
        this.isEnabled = z;
    }

    public final void setHorizontalAnimationTriggerPercentage(float f) {
        this.horizontalAnimationTriggerPercentage = f;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("BlazeWidgetItemImageAnimatedThumbnailStyle(isEnabled=");
        sb.append(this.isEnabled);
        sb.append(", horizontalAnimationTriggerPercentage=");
        return wt3.n(sb, this.horizontalAnimationTriggerPercentage, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeInt(this.isEnabled ? 1 : 0);
        dest.writeFloat(this.horizontalAnimationTriggerPercentage);
    }
}
