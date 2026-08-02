package com.blaze.blazesdk.style.shared.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.blaze.blazesdk.utils.BlazeParcelable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0014R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006!"}, d2 = {"Lcom/blaze/blazesdk/style/shared/models/BlazeObjectPositioning;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", "xPosition", "Lcom/blaze/blazesdk/style/shared/models/BlazeObjectXPosition;", "yPosition", "Lcom/blaze/blazesdk/style/shared/models/BlazeObjectYPosition;", "<init>", "(Lcom/blaze/blazesdk/style/shared/models/BlazeObjectXPosition;Lcom/blaze/blazesdk/style/shared/models/BlazeObjectYPosition;)V", "getXPosition", "()Lcom/blaze/blazesdk/style/shared/models/BlazeObjectXPosition;", "setXPosition", "(Lcom/blaze/blazesdk/style/shared/models/BlazeObjectXPosition;)V", "getYPosition", "()Lcom/blaze/blazesdk/style/shared/models/BlazeObjectYPosition;", "setYPosition", "(Lcom/blaze/blazesdk/style/shared/models/BlazeObjectYPosition;)V", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlazeObjectPositioning implements BlazeParcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazeObjectPositioning> CREATOR = new a();

    @NotNull
    private BlazeObjectXPosition xPosition;

    @NotNull
    private BlazeObjectYPosition yPosition;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new BlazeObjectPositioning(BlazeObjectXPosition.valueOf(parcel.readString()), BlazeObjectYPosition.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazeObjectPositioning[i];
        }
    }

    public BlazeObjectPositioning(@NotNull BlazeObjectXPosition blazeObjectXPosition, @NotNull BlazeObjectYPosition blazeObjectYPosition) {
        blazeObjectXPosition.getClass();
        blazeObjectYPosition.getClass();
        this.xPosition = blazeObjectXPosition;
        this.yPosition = blazeObjectYPosition;
    }

    public static /* synthetic */ BlazeObjectPositioning copy$default(BlazeObjectPositioning blazeObjectPositioning, BlazeObjectXPosition blazeObjectXPosition, BlazeObjectYPosition blazeObjectYPosition, int i, Object obj) {
        if ((i & 1) != 0) {
            blazeObjectXPosition = blazeObjectPositioning.xPosition;
        }
        if ((i & 2) != 0) {
            blazeObjectYPosition = blazeObjectPositioning.yPosition;
        }
        return blazeObjectPositioning.copy(blazeObjectXPosition, blazeObjectYPosition);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final BlazeObjectXPosition getXPosition() {
        return this.xPosition;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final BlazeObjectYPosition getYPosition() {
        return this.yPosition;
    }

    @NotNull
    public final BlazeObjectPositioning copy(@NotNull BlazeObjectXPosition xPosition, @NotNull BlazeObjectYPosition yPosition) {
        xPosition.getClass();
        yPosition.getClass();
        return new BlazeObjectPositioning(xPosition, yPosition);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeObjectPositioning)) {
            return false;
        }
        BlazeObjectPositioning blazeObjectPositioning = (BlazeObjectPositioning) other;
        return this.xPosition == blazeObjectPositioning.xPosition && this.yPosition == blazeObjectPositioning.yPosition;
    }

    @NotNull
    public final BlazeObjectXPosition getXPosition() {
        return this.xPosition;
    }

    @NotNull
    public final BlazeObjectYPosition getYPosition() {
        return this.yPosition;
    }

    public int hashCode() {
        return this.yPosition.hashCode() + (this.xPosition.hashCode() * 31);
    }

    public final void setXPosition(@NotNull BlazeObjectXPosition blazeObjectXPosition) {
        blazeObjectXPosition.getClass();
        this.xPosition = blazeObjectXPosition;
    }

    public final void setYPosition(@NotNull BlazeObjectYPosition blazeObjectYPosition) {
        blazeObjectYPosition.getClass();
        this.yPosition = blazeObjectYPosition;
    }

    @NotNull
    public String toString() {
        return "BlazeObjectPositioning(xPosition=" + this.xPosition + ", yPosition=" + this.yPosition + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.xPosition.name());
        dest.writeString(this.yPosition.name());
    }
}
