package com.blaze.blazesdk.style.widgets;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.style.shared.models.BlazeDp;
import com.blaze.blazesdk.style.shared.models.BlazeInsets;
import com.blaze.blazesdk.utils.BlazeParcelable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import defpackage.l4a;
import defpackage.s6a;
import defpackage.wt3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b:\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B]\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0005HÆ\u0003J\t\u0010C\u001a\u00020\u0007HÆ\u0003J\t\u0010D\u001a\u00020\tHÆ\u0003J\t\u0010E\u001a\u00020\u000bHÆ\u0003J\u0010\u0010F\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010-J\t\u0010G\u001a\u00020\u000fHÆ\u0003J\t\u0010H\u001a\u00020\u0011HÆ\u0003J\t\u0010I\u001a\u00020\u0013HÆ\u0003J\u000e\u0010J\u001a\u00020\u0015HÀ\u0003¢\u0006\u0002\bKJt\u0010L\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015HÆ\u0001¢\u0006\u0002\u0010MJ\u0006\u0010N\u001a\u00020\u0007J\u0013\u0010O\u001a\u00020P2\b\u0010Q\u001a\u0004\u0018\u00010RHÖ\u0003J\t\u0010S\u001a\u00020\u0007HÖ\u0001J\t\u0010T\u001a\u00020UHÖ\u0001J\u0016\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020\u0007R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001e\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u0010\n\u0002\u00100\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001a\u0010\u0014\u001a\u00020\u0015X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@¨\u0006["}, d2 = {"Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemStyle;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", "title", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemTitleStyle;", "statusIndicator", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemStatusIndicatorStyle;", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "", "padding", "Lcom/blaze/blazesdk/style/shared/models/BlazeInsets;", "cornerRadius", "Lcom/blaze/blazesdk/style/shared/models/BlazeDp;", "cornerRadiusRatio", "", "image", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemImageStyle;", "badge", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemBadgeStyle;", "durationElement", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemDurationElementStyle;", "eventTime", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemEventTimeElementStyle;", "<init>", "(Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemTitleStyle;Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemStatusIndicatorStyle;ILcom/blaze/blazesdk/style/shared/models/BlazeInsets;Lcom/blaze/blazesdk/style/shared/models/BlazeDp;Ljava/lang/Float;Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemImageStyle;Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemBadgeStyle;Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemDurationElementStyle;Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemEventTimeElementStyle;)V", "getTitle", "()Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemTitleStyle;", "setTitle", "(Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemTitleStyle;)V", "getStatusIndicator", "()Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemStatusIndicatorStyle;", "setStatusIndicator", "(Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemStatusIndicatorStyle;)V", "getBackgroundColor", "()I", "setBackgroundColor", "(I)V", "getPadding", "()Lcom/blaze/blazesdk/style/shared/models/BlazeInsets;", "setPadding", "(Lcom/blaze/blazesdk/style/shared/models/BlazeInsets;)V", "getCornerRadius", "()Lcom/blaze/blazesdk/style/shared/models/BlazeDp;", "setCornerRadius", "(Lcom/blaze/blazesdk/style/shared/models/BlazeDp;)V", "getCornerRadiusRatio", "()Ljava/lang/Float;", "setCornerRadiusRatio", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "getImage", "()Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemImageStyle;", "setImage", "(Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemImageStyle;)V", "getBadge", "()Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemBadgeStyle;", "setBadge", "(Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemBadgeStyle;)V", "getDurationElement", "()Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemDurationElementStyle;", "setDurationElement", "(Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemDurationElementStyle;)V", "getEventTime$blazesdk_release", "()Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemEventTimeElementStyle;", "setEventTime$blazesdk_release", "(Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemEventTimeElementStyle;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component10$blazesdk_release", "copy", "(Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemTitleStyle;Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemStatusIndicatorStyle;ILcom/blaze/blazesdk/style/shared/models/BlazeInsets;Lcom/blaze/blazesdk/style/shared/models/BlazeDp;Ljava/lang/Float;Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemImageStyle;Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemBadgeStyle;Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemDurationElementStyle;Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemEventTimeElementStyle;)Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemStyle;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlazeWidgetItemStyle implements BlazeParcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazeWidgetItemStyle> CREATOR = new a();
    private int backgroundColor;

    @NotNull
    private BlazeWidgetItemBadgeStyle badge;

    @NotNull
    private BlazeDp cornerRadius;

    @Nullable
    private Float cornerRadiusRatio;

    @NotNull
    private BlazeWidgetItemDurationElementStyle durationElement;

    @NotNull
    private BlazeWidgetItemEventTimeElementStyle eventTime;

    @NotNull
    private BlazeWidgetItemImageStyle image;

    @NotNull
    private BlazeInsets padding;

    @NotNull
    private BlazeWidgetItemStatusIndicatorStyle statusIndicator;

    @NotNull
    private BlazeWidgetItemTitleStyle title;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new BlazeWidgetItemStyle(BlazeWidgetItemTitleStyle.CREATOR.createFromParcel(parcel), BlazeWidgetItemStatusIndicatorStyle.CREATOR.createFromParcel(parcel), parcel.readInt(), BlazeInsets.CREATOR.createFromParcel(parcel), BlazeDp.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), BlazeWidgetItemImageStyle.CREATOR.createFromParcel(parcel), BlazeWidgetItemBadgeStyle.CREATOR.createFromParcel(parcel), BlazeWidgetItemDurationElementStyle.CREATOR.createFromParcel(parcel), BlazeWidgetItemEventTimeElementStyle.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazeWidgetItemStyle[i];
        }
    }

    public BlazeWidgetItemStyle(@NotNull BlazeWidgetItemTitleStyle blazeWidgetItemTitleStyle, @NotNull BlazeWidgetItemStatusIndicatorStyle blazeWidgetItemStatusIndicatorStyle, int i, @NotNull BlazeInsets blazeInsets, @NotNull BlazeDp blazeDp, @Nullable Float f, @NotNull BlazeWidgetItemImageStyle blazeWidgetItemImageStyle, @NotNull BlazeWidgetItemBadgeStyle blazeWidgetItemBadgeStyle, @NotNull BlazeWidgetItemDurationElementStyle blazeWidgetItemDurationElementStyle, @NotNull BlazeWidgetItemEventTimeElementStyle blazeWidgetItemEventTimeElementStyle) {
        blazeWidgetItemTitleStyle.getClass();
        blazeWidgetItemStatusIndicatorStyle.getClass();
        blazeInsets.getClass();
        blazeDp.getClass();
        blazeWidgetItemImageStyle.getClass();
        blazeWidgetItemBadgeStyle.getClass();
        blazeWidgetItemDurationElementStyle.getClass();
        blazeWidgetItemEventTimeElementStyle.getClass();
        this.title = blazeWidgetItemTitleStyle;
        this.statusIndicator = blazeWidgetItemStatusIndicatorStyle;
        this.backgroundColor = i;
        this.padding = blazeInsets;
        this.cornerRadius = blazeDp;
        this.cornerRadiusRatio = f;
        this.image = blazeWidgetItemImageStyle;
        this.badge = blazeWidgetItemBadgeStyle;
        this.durationElement = blazeWidgetItemDurationElementStyle;
        this.eventTime = blazeWidgetItemEventTimeElementStyle;
    }

    public static /* synthetic */ BlazeWidgetItemStyle copy$default(BlazeWidgetItemStyle blazeWidgetItemStyle, BlazeWidgetItemTitleStyle blazeWidgetItemTitleStyle, BlazeWidgetItemStatusIndicatorStyle blazeWidgetItemStatusIndicatorStyle, int i, BlazeInsets blazeInsets, BlazeDp blazeDp, Float f, BlazeWidgetItemImageStyle blazeWidgetItemImageStyle, BlazeWidgetItemBadgeStyle blazeWidgetItemBadgeStyle, BlazeWidgetItemDurationElementStyle blazeWidgetItemDurationElementStyle, BlazeWidgetItemEventTimeElementStyle blazeWidgetItemEventTimeElementStyle, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            blazeWidgetItemTitleStyle = blazeWidgetItemStyle.title;
        }
        if ((i2 & 2) != 0) {
            blazeWidgetItemStatusIndicatorStyle = blazeWidgetItemStyle.statusIndicator;
        }
        if ((i2 & 4) != 0) {
            i = blazeWidgetItemStyle.backgroundColor;
        }
        if ((i2 & 8) != 0) {
            blazeInsets = blazeWidgetItemStyle.padding;
        }
        if ((i2 & 16) != 0) {
            blazeDp = blazeWidgetItemStyle.cornerRadius;
        }
        if ((i2 & 32) != 0) {
            f = blazeWidgetItemStyle.cornerRadiusRatio;
        }
        if ((i2 & 64) != 0) {
            blazeWidgetItemImageStyle = blazeWidgetItemStyle.image;
        }
        if ((i2 & 128) != 0) {
            blazeWidgetItemBadgeStyle = blazeWidgetItemStyle.badge;
        }
        if ((i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            blazeWidgetItemDurationElementStyle = blazeWidgetItemStyle.durationElement;
        }
        if ((i2 & 512) != 0) {
            blazeWidgetItemEventTimeElementStyle = blazeWidgetItemStyle.eventTime;
        }
        BlazeWidgetItemDurationElementStyle blazeWidgetItemDurationElementStyle2 = blazeWidgetItemDurationElementStyle;
        BlazeWidgetItemEventTimeElementStyle blazeWidgetItemEventTimeElementStyle2 = blazeWidgetItemEventTimeElementStyle;
        BlazeWidgetItemImageStyle blazeWidgetItemImageStyle2 = blazeWidgetItemImageStyle;
        BlazeWidgetItemBadgeStyle blazeWidgetItemBadgeStyle2 = blazeWidgetItemBadgeStyle;
        BlazeDp blazeDp2 = blazeDp;
        Float f2 = f;
        return blazeWidgetItemStyle.copy(blazeWidgetItemTitleStyle, blazeWidgetItemStatusIndicatorStyle, i, blazeInsets, blazeDp2, f2, blazeWidgetItemImageStyle2, blazeWidgetItemBadgeStyle2, blazeWidgetItemDurationElementStyle2, blazeWidgetItemEventTimeElementStyle2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final BlazeWidgetItemTitleStyle getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component10$blazesdk_release, reason: from getter */
    public final BlazeWidgetItemEventTimeElementStyle getEventTime() {
        return this.eventTime;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final BlazeWidgetItemStatusIndicatorStyle getStatusIndicator() {
        return this.statusIndicator;
    }

    /* renamed from: component3, reason: from getter */
    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final BlazeInsets getPadding() {
        return this.padding;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final BlazeDp getCornerRadius() {
        return this.cornerRadius;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Float getCornerRadiusRatio() {
        return this.cornerRadiusRatio;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final BlazeWidgetItemImageStyle getImage() {
        return this.image;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final BlazeWidgetItemBadgeStyle getBadge() {
        return this.badge;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final BlazeWidgetItemDurationElementStyle getDurationElement() {
        return this.durationElement;
    }

    @NotNull
    public final BlazeWidgetItemStyle copy(@NotNull BlazeWidgetItemTitleStyle title, @NotNull BlazeWidgetItemStatusIndicatorStyle statusIndicator, int backgroundColor, @NotNull BlazeInsets padding, @NotNull BlazeDp cornerRadius, @Nullable Float cornerRadiusRatio, @NotNull BlazeWidgetItemImageStyle image, @NotNull BlazeWidgetItemBadgeStyle badge, @NotNull BlazeWidgetItemDurationElementStyle durationElement, @NotNull BlazeWidgetItemEventTimeElementStyle eventTime) {
        title.getClass();
        statusIndicator.getClass();
        padding.getClass();
        cornerRadius.getClass();
        image.getClass();
        badge.getClass();
        durationElement.getClass();
        eventTime.getClass();
        return new BlazeWidgetItemStyle(title, statusIndicator, backgroundColor, padding, cornerRadius, cornerRadiusRatio, image, badge, durationElement, eventTime);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeWidgetItemStyle)) {
            return false;
        }
        BlazeWidgetItemStyle blazeWidgetItemStyle = (BlazeWidgetItemStyle) other;
        return Intrinsics.c(this.title, blazeWidgetItemStyle.title) && Intrinsics.c(this.statusIndicator, blazeWidgetItemStyle.statusIndicator) && this.backgroundColor == blazeWidgetItemStyle.backgroundColor && Intrinsics.c(this.padding, blazeWidgetItemStyle.padding) && Intrinsics.c(this.cornerRadius, blazeWidgetItemStyle.cornerRadius) && Intrinsics.c(this.cornerRadiusRatio, blazeWidgetItemStyle.cornerRadiusRatio) && Intrinsics.c(this.image, blazeWidgetItemStyle.image) && Intrinsics.c(this.badge, blazeWidgetItemStyle.badge) && Intrinsics.c(this.durationElement, blazeWidgetItemStyle.durationElement) && Intrinsics.c(this.eventTime, blazeWidgetItemStyle.eventTime);
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final BlazeWidgetItemBadgeStyle getBadge() {
        return this.badge;
    }

    @NotNull
    public final BlazeDp getCornerRadius() {
        return this.cornerRadius;
    }

    @Nullable
    public final Float getCornerRadiusRatio() {
        return this.cornerRadiusRatio;
    }

    @NotNull
    public final BlazeWidgetItemDurationElementStyle getDurationElement() {
        return this.durationElement;
    }

    @NotNull
    public final BlazeWidgetItemEventTimeElementStyle getEventTime$blazesdk_release() {
        return this.eventTime;
    }

    @NotNull
    public final BlazeWidgetItemImageStyle getImage() {
        return this.image;
    }

    @NotNull
    public final BlazeInsets getPadding() {
        return this.padding;
    }

    @NotNull
    public final BlazeWidgetItemStatusIndicatorStyle getStatusIndicator() {
        return this.statusIndicator;
    }

    @NotNull
    public final BlazeWidgetItemTitleStyle getTitle() {
        return this.title;
    }

    public int hashCode() {
        int n = s6a.n(this.cornerRadius, (this.padding.hashCode() + l4a.e(this.backgroundColor, (this.statusIndicator.hashCode() + (this.title.hashCode() * 31)) * 31)) * 31);
        Float f = this.cornerRadiusRatio;
        return this.eventTime.hashCode() + ((this.durationElement.hashCode() + ((this.badge.hashCode() + ((this.image.hashCode() + ((n + (f == null ? 0 : f.hashCode())) * 31)) * 31)) * 31)) * 31);
    }

    public final void setBackgroundColor(int i) {
        this.backgroundColor = i;
    }

    public final void setBadge(@NotNull BlazeWidgetItemBadgeStyle blazeWidgetItemBadgeStyle) {
        blazeWidgetItemBadgeStyle.getClass();
        this.badge = blazeWidgetItemBadgeStyle;
    }

    public final void setCornerRadius(@NotNull BlazeDp blazeDp) {
        blazeDp.getClass();
        this.cornerRadius = blazeDp;
    }

    public final void setCornerRadiusRatio(@Nullable Float f) {
        this.cornerRadiusRatio = f;
    }

    public final void setDurationElement(@NotNull BlazeWidgetItemDurationElementStyle blazeWidgetItemDurationElementStyle) {
        blazeWidgetItemDurationElementStyle.getClass();
        this.durationElement = blazeWidgetItemDurationElementStyle;
    }

    public final void setEventTime$blazesdk_release(@NotNull BlazeWidgetItemEventTimeElementStyle blazeWidgetItemEventTimeElementStyle) {
        blazeWidgetItemEventTimeElementStyle.getClass();
        this.eventTime = blazeWidgetItemEventTimeElementStyle;
    }

    public final void setImage(@NotNull BlazeWidgetItemImageStyle blazeWidgetItemImageStyle) {
        blazeWidgetItemImageStyle.getClass();
        this.image = blazeWidgetItemImageStyle;
    }

    public final void setPadding(@NotNull BlazeInsets blazeInsets) {
        blazeInsets.getClass();
        this.padding = blazeInsets;
    }

    public final void setStatusIndicator(@NotNull BlazeWidgetItemStatusIndicatorStyle blazeWidgetItemStatusIndicatorStyle) {
        blazeWidgetItemStatusIndicatorStyle.getClass();
        this.statusIndicator = blazeWidgetItemStatusIndicatorStyle;
    }

    public final void setTitle(@NotNull BlazeWidgetItemTitleStyle blazeWidgetItemTitleStyle) {
        blazeWidgetItemTitleStyle.getClass();
        this.title = blazeWidgetItemTitleStyle;
    }

    @NotNull
    public String toString() {
        return "BlazeWidgetItemStyle(title=" + this.title + ", statusIndicator=" + this.statusIndicator + ", backgroundColor=" + this.backgroundColor + ", padding=" + this.padding + ", cornerRadius=" + this.cornerRadius + ", cornerRadiusRatio=" + this.cornerRadiusRatio + ", image=" + this.image + ", badge=" + this.badge + ", durationElement=" + this.durationElement + ", eventTime=" + this.eventTime + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        this.title.writeToParcel(dest, flags);
        this.statusIndicator.writeToParcel(dest, flags);
        dest.writeInt(this.backgroundColor);
        this.padding.writeToParcel(dest, flags);
        this.cornerRadius.writeToParcel(dest, flags);
        Float f = this.cornerRadiusRatio;
        if (f == null) {
            dest.writeInt(0);
        } else {
            wt3.w(dest, 1, f);
        }
        this.image.writeToParcel(dest, flags);
        this.badge.writeToParcel(dest, flags);
        this.durationElement.writeToParcel(dest, flags);
        this.eventTime.writeToParcel(dest, flags);
    }
}
