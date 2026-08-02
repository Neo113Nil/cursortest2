package com.blaze.blazesdk.style.widgets;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.blaze.blazesdk.utils.BlazeParcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0001(B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001bHÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006)"}, d2 = {"Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemStyleOverrides;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", "statusIndicator", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemStatusIndicatorStyle;", "imageBorder", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemImageContainerBorderStyle;", "badge", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemBadgeStyle;", "<init>", "(Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemStatusIndicatorStyle;Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemImageContainerBorderStyle;Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemBadgeStyle;)V", "getStatusIndicator", "()Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemStatusIndicatorStyle;", "setStatusIndicator", "(Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemStatusIndicatorStyle;)V", "getImageBorder", "()Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemImageContainerBorderStyle;", "setImageBorder", "(Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemImageContainerBorderStyle;)V", "getBadge", "()Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemBadgeStyle;", "setBadge", "(Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemBadgeStyle;)V", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlazeWidgetItemStyleOverrides implements BlazeParcelable {

    @Nullable
    private BlazeWidgetItemBadgeStyle badge;

    @Nullable
    private BlazeWidgetItemImageContainerBorderStyle imageBorder;

    @Nullable
    private BlazeWidgetItemStatusIndicatorStyle statusIndicator;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazeWidgetItemStyleOverrides> CREATOR = new a();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new BlazeWidgetItemStyleOverrides(parcel.readInt() == 0 ? null : BlazeWidgetItemStatusIndicatorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : BlazeWidgetItemImageContainerBorderStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? BlazeWidgetItemBadgeStyle.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazeWidgetItemStyleOverrides[i];
        }
    }

    public /* synthetic */ BlazeWidgetItemStyleOverrides(BlazeWidgetItemStatusIndicatorStyle blazeWidgetItemStatusIndicatorStyle, BlazeWidgetItemImageContainerBorderStyle blazeWidgetItemImageContainerBorderStyle, BlazeWidgetItemBadgeStyle blazeWidgetItemBadgeStyle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : blazeWidgetItemStatusIndicatorStyle, (i & 2) != 0 ? null : blazeWidgetItemImageContainerBorderStyle, (i & 4) != 0 ? null : blazeWidgetItemBadgeStyle);
    }

    public static /* synthetic */ BlazeWidgetItemStyleOverrides copy$default(BlazeWidgetItemStyleOverrides blazeWidgetItemStyleOverrides, BlazeWidgetItemStatusIndicatorStyle blazeWidgetItemStatusIndicatorStyle, BlazeWidgetItemImageContainerBorderStyle blazeWidgetItemImageContainerBorderStyle, BlazeWidgetItemBadgeStyle blazeWidgetItemBadgeStyle, int i, Object obj) {
        if ((i & 1) != 0) {
            blazeWidgetItemStatusIndicatorStyle = blazeWidgetItemStyleOverrides.statusIndicator;
        }
        if ((i & 2) != 0) {
            blazeWidgetItemImageContainerBorderStyle = blazeWidgetItemStyleOverrides.imageBorder;
        }
        if ((i & 4) != 0) {
            blazeWidgetItemBadgeStyle = blazeWidgetItemStyleOverrides.badge;
        }
        return blazeWidgetItemStyleOverrides.copy(blazeWidgetItemStatusIndicatorStyle, blazeWidgetItemImageContainerBorderStyle, blazeWidgetItemBadgeStyle);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final BlazeWidgetItemStatusIndicatorStyle getStatusIndicator() {
        return this.statusIndicator;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final BlazeWidgetItemImageContainerBorderStyle getImageBorder() {
        return this.imageBorder;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final BlazeWidgetItemBadgeStyle getBadge() {
        return this.badge;
    }

    @NotNull
    public final BlazeWidgetItemStyleOverrides copy(@Nullable BlazeWidgetItemStatusIndicatorStyle statusIndicator, @Nullable BlazeWidgetItemImageContainerBorderStyle imageBorder, @Nullable BlazeWidgetItemBadgeStyle badge) {
        return new BlazeWidgetItemStyleOverrides(statusIndicator, imageBorder, badge);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeWidgetItemStyleOverrides)) {
            return false;
        }
        BlazeWidgetItemStyleOverrides blazeWidgetItemStyleOverrides = (BlazeWidgetItemStyleOverrides) other;
        return Intrinsics.c(this.statusIndicator, blazeWidgetItemStyleOverrides.statusIndicator) && Intrinsics.c(this.imageBorder, blazeWidgetItemStyleOverrides.imageBorder) && Intrinsics.c(this.badge, blazeWidgetItemStyleOverrides.badge);
    }

    @Nullable
    public final BlazeWidgetItemBadgeStyle getBadge() {
        return this.badge;
    }

    @Nullable
    public final BlazeWidgetItemImageContainerBorderStyle getImageBorder() {
        return this.imageBorder;
    }

    @Nullable
    public final BlazeWidgetItemStatusIndicatorStyle getStatusIndicator() {
        return this.statusIndicator;
    }

    public int hashCode() {
        BlazeWidgetItemStatusIndicatorStyle blazeWidgetItemStatusIndicatorStyle = this.statusIndicator;
        int hashCode = (blazeWidgetItemStatusIndicatorStyle == null ? 0 : blazeWidgetItemStatusIndicatorStyle.hashCode()) * 31;
        BlazeWidgetItemImageContainerBorderStyle blazeWidgetItemImageContainerBorderStyle = this.imageBorder;
        int hashCode2 = (hashCode + (blazeWidgetItemImageContainerBorderStyle == null ? 0 : blazeWidgetItemImageContainerBorderStyle.hashCode())) * 31;
        BlazeWidgetItemBadgeStyle blazeWidgetItemBadgeStyle = this.badge;
        return hashCode2 + (blazeWidgetItemBadgeStyle != null ? blazeWidgetItemBadgeStyle.hashCode() : 0);
    }

    public final void setBadge(@Nullable BlazeWidgetItemBadgeStyle blazeWidgetItemBadgeStyle) {
        this.badge = blazeWidgetItemBadgeStyle;
    }

    public final void setImageBorder(@Nullable BlazeWidgetItemImageContainerBorderStyle blazeWidgetItemImageContainerBorderStyle) {
        this.imageBorder = blazeWidgetItemImageContainerBorderStyle;
    }

    public final void setStatusIndicator(@Nullable BlazeWidgetItemStatusIndicatorStyle blazeWidgetItemStatusIndicatorStyle) {
        this.statusIndicator = blazeWidgetItemStatusIndicatorStyle;
    }

    @NotNull
    public String toString() {
        return "BlazeWidgetItemStyleOverrides(statusIndicator=" + this.statusIndicator + ", imageBorder=" + this.imageBorder + ", badge=" + this.badge + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        BlazeWidgetItemStatusIndicatorStyle blazeWidgetItemStatusIndicatorStyle = this.statusIndicator;
        if (blazeWidgetItemStatusIndicatorStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            blazeWidgetItemStatusIndicatorStyle.writeToParcel(dest, flags);
        }
        BlazeWidgetItemImageContainerBorderStyle blazeWidgetItemImageContainerBorderStyle = this.imageBorder;
        if (blazeWidgetItemImageContainerBorderStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            blazeWidgetItemImageContainerBorderStyle.writeToParcel(dest, flags);
        }
        BlazeWidgetItemBadgeStyle blazeWidgetItemBadgeStyle = this.badge;
        if (blazeWidgetItemBadgeStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            blazeWidgetItemBadgeStyle.writeToParcel(dest, flags);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemStyleOverrides$Companion;", "", "<init>", "()V", "noOverrides", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemStyleOverrides;", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BlazeWidgetItemStyleOverrides noOverrides() {
            return new BlazeWidgetItemStyleOverrides(null, null, null);
        }

        private Companion() {
        }
    }

    public BlazeWidgetItemStyleOverrides(@Nullable BlazeWidgetItemStatusIndicatorStyle blazeWidgetItemStatusIndicatorStyle, @Nullable BlazeWidgetItemImageContainerBorderStyle blazeWidgetItemImageContainerBorderStyle, @Nullable BlazeWidgetItemBadgeStyle blazeWidgetItemBadgeStyle) {
        this.statusIndicator = blazeWidgetItemStatusIndicatorStyle;
        this.imageBorder = blazeWidgetItemImageContainerBorderStyle;
        this.badge = blazeWidgetItemBadgeStyle;
    }

    public BlazeWidgetItemStyleOverrides() {
        this(null, null, null, 7, null);
    }
}
