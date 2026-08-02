package com.blaze.blazesdk.style.players.tabs;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.blaze.blazesdk.style.shared.models.BlazeDp;
import com.blaze.blazesdk.style.shared.models.BlazeInsets;
import com.blaze.blazesdk.utils.BlazeParcelable;
import com.unity3d.services.UnityAdsConstants;
import defpackage.b6a;
import defpackage.gz8;
import defpackage.jp5;
import defpackage.llf;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002*+B3\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J=\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001dHÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001J\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014¨\u0006,"}, d2 = {"Lcom/blaze/blazesdk/style/players/tabs/BlazePlayerTabsStyle;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", "padding", "Lcom/blaze/blazesdk/style/shared/models/BlazeInsets;", "gradient", "Lcom/blaze/blazesdk/style/players/tabs/BlazePlayerTabsGradientStyle;", "icon", "Lcom/blaze/blazesdk/style/players/tabs/BlazePlayerTabsStyle$BlazePlayerTabItemIconStyle;", "selectedTabState", "Lcom/blaze/blazesdk/style/players/tabs/BlazePlayerTabItemStyle;", "unselectedTabState", "<init>", "(Lcom/blaze/blazesdk/style/shared/models/BlazeInsets;Lcom/blaze/blazesdk/style/players/tabs/BlazePlayerTabsGradientStyle;Lcom/blaze/blazesdk/style/players/tabs/BlazePlayerTabsStyle$BlazePlayerTabItemIconStyle;Lcom/blaze/blazesdk/style/players/tabs/BlazePlayerTabItemStyle;Lcom/blaze/blazesdk/style/players/tabs/BlazePlayerTabItemStyle;)V", "getPadding", "()Lcom/blaze/blazesdk/style/shared/models/BlazeInsets;", "getGradient", "()Lcom/blaze/blazesdk/style/players/tabs/BlazePlayerTabsGradientStyle;", "getIcon", "()Lcom/blaze/blazesdk/style/players/tabs/BlazePlayerTabsStyle$BlazePlayerTabItemIconStyle;", "getSelectedTabState", "()Lcom/blaze/blazesdk/style/players/tabs/BlazePlayerTabItemStyle;", "getUnselectedTabState", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "BlazePlayerTabItemIconStyle", "Companion", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlazePlayerTabsStyle implements BlazeParcelable {

    @NotNull
    private final BlazePlayerTabsGradientStyle gradient;

    @Nullable
    private final BlazePlayerTabItemIconStyle icon;

    @NotNull
    private final BlazeInsets padding;

    @NotNull
    private final BlazePlayerTabItemStyle selectedTabState;

    @NotNull
    private final BlazePlayerTabItemStyle unselectedTabState;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazePlayerTabsStyle> CREATOR = new a();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001)B%\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J0\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0006\u0010\u001c\u001a\u00020\u0005J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u0005HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0005R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006*"}, d2 = {"Lcom/blaze/blazesdk/style/players/tabs/BlazePlayerTabsStyle$BlazePlayerTabItemIconStyle;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", "iconPositioning", "Lcom/blaze/blazesdk/style/players/tabs/BlazePlayerTabsStyle$BlazePlayerTabItemIconStyle$BlazeIconPositioning;", "iconTint", "", "padding", "Lcom/blaze/blazesdk/style/shared/models/BlazeDp;", "<init>", "(Lcom/blaze/blazesdk/style/players/tabs/BlazePlayerTabsStyle$BlazePlayerTabItemIconStyle$BlazeIconPositioning;Ljava/lang/Integer;Lcom/blaze/blazesdk/style/shared/models/BlazeDp;)V", "getIconPositioning", "()Lcom/blaze/blazesdk/style/players/tabs/BlazePlayerTabsStyle$BlazePlayerTabItemIconStyle$BlazeIconPositioning;", "setIconPositioning", "(Lcom/blaze/blazesdk/style/players/tabs/BlazePlayerTabsStyle$BlazePlayerTabItemIconStyle$BlazeIconPositioning;)V", "getIconTint", "()Ljava/lang/Integer;", "setIconTint", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getPadding", "()Lcom/blaze/blazesdk/style/shared/models/BlazeDp;", "setPadding", "(Lcom/blaze/blazesdk/style/shared/models/BlazeDp;)V", "component1", "component2", "component3", "copy", "(Lcom/blaze/blazesdk/style/players/tabs/BlazePlayerTabsStyle$BlazePlayerTabItemIconStyle$BlazeIconPositioning;Ljava/lang/Integer;Lcom/blaze/blazesdk/style/shared/models/BlazeDp;)Lcom/blaze/blazesdk/style/players/tabs/BlazePlayerTabsStyle$BlazePlayerTabItemIconStyle;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "BlazeIconPositioning", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BlazePlayerTabItemIconStyle implements BlazeParcelable {
        public static final int $stable = 8;

        @NotNull
        public static final Parcelable.Creator<BlazePlayerTabItemIconStyle> CREATOR = new a();

        @NotNull
        private BlazeIconPositioning iconPositioning;

        @Nullable
        private Integer iconTint;

        @Nullable
        private BlazeDp padding;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Keep
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/blaze/blazesdk/style/players/tabs/BlazePlayerTabsStyle$BlazePlayerTabItemIconStyle$BlazeIconPositioning;", "", "<init>", "(Ljava/lang/String;I)V", "START", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class BlazeIconPositioning {
            private static final /* synthetic */ jp5 $ENTRIES;
            private static final /* synthetic */ BlazeIconPositioning[] $VALUES;
            public static final BlazeIconPositioning START = new BlazeIconPositioning("START", 0);

            private static final /* synthetic */ BlazeIconPositioning[] $values() {
                return new BlazeIconPositioning[]{START};
            }

            static {
                BlazeIconPositioning[] $values = $values();
                $VALUES = $values;
                $ENTRIES = gz8.G($values);
            }

            private BlazeIconPositioning(String str, int i) {
            }

            @NotNull
            public static jp5 getEntries() {
                return $ENTRIES;
            }

            public static BlazeIconPositioning valueOf(String str) {
                return (BlazeIconPositioning) Enum.valueOf(BlazeIconPositioning.class, str);
            }

            public static BlazeIconPositioning[] values() {
                return (BlazeIconPositioning[]) $VALUES.clone();
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new BlazePlayerTabItemIconStyle(BlazeIconPositioning.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? BlazeDp.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BlazePlayerTabItemIconStyle[i];
            }
        }

        public BlazePlayerTabItemIconStyle(@NotNull BlazeIconPositioning blazeIconPositioning, @Nullable Integer num, @Nullable BlazeDp blazeDp) {
            blazeIconPositioning.getClass();
            this.iconPositioning = blazeIconPositioning;
            this.iconTint = num;
            this.padding = blazeDp;
        }

        public static /* synthetic */ BlazePlayerTabItemIconStyle copy$default(BlazePlayerTabItemIconStyle blazePlayerTabItemIconStyle, BlazeIconPositioning blazeIconPositioning, Integer num, BlazeDp blazeDp, int i, Object obj) {
            if ((i & 1) != 0) {
                blazeIconPositioning = blazePlayerTabItemIconStyle.iconPositioning;
            }
            if ((i & 2) != 0) {
                num = blazePlayerTabItemIconStyle.iconTint;
            }
            if ((i & 4) != 0) {
                blazeDp = blazePlayerTabItemIconStyle.padding;
            }
            return blazePlayerTabItemIconStyle.copy(blazeIconPositioning, num, blazeDp);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final BlazeIconPositioning getIconPositioning() {
            return this.iconPositioning;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final Integer getIconTint() {
            return this.iconTint;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final BlazeDp getPadding() {
            return this.padding;
        }

        @NotNull
        public final BlazePlayerTabItemIconStyle copy(@NotNull BlazeIconPositioning iconPositioning, @Nullable Integer iconTint, @Nullable BlazeDp padding) {
            iconPositioning.getClass();
            return new BlazePlayerTabItemIconStyle(iconPositioning, iconTint, padding);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BlazePlayerTabItemIconStyle)) {
                return false;
            }
            BlazePlayerTabItemIconStyle blazePlayerTabItemIconStyle = (BlazePlayerTabItemIconStyle) other;
            return this.iconPositioning == blazePlayerTabItemIconStyle.iconPositioning && Intrinsics.c(this.iconTint, blazePlayerTabItemIconStyle.iconTint) && Intrinsics.c(this.padding, blazePlayerTabItemIconStyle.padding);
        }

        @NotNull
        public final BlazeIconPositioning getIconPositioning() {
            return this.iconPositioning;
        }

        @Nullable
        public final Integer getIconTint() {
            return this.iconTint;
        }

        @Nullable
        public final BlazeDp getPadding() {
            return this.padding;
        }

        public int hashCode() {
            int hashCode = this.iconPositioning.hashCode() * 31;
            Integer num = this.iconTint;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            BlazeDp blazeDp = this.padding;
            return hashCode2 + (blazeDp != null ? blazeDp.hashCode() : 0);
        }

        public final void setIconPositioning(@NotNull BlazeIconPositioning blazeIconPositioning) {
            blazeIconPositioning.getClass();
            this.iconPositioning = blazeIconPositioning;
        }

        public final void setIconTint(@Nullable Integer num) {
            this.iconTint = num;
        }

        public final void setPadding(@Nullable BlazeDp blazeDp) {
            this.padding = blazeDp;
        }

        @NotNull
        public String toString() {
            return "BlazePlayerTabItemIconStyle(iconPositioning=" + this.iconPositioning + ", iconTint=" + this.iconTint + ", padding=" + this.padding + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            dest.getClass();
            dest.writeString(this.iconPositioning.name());
            Integer num = this.iconTint;
            if (num == null) {
                dest.writeInt(0);
            } else {
                b6a.h(dest, num);
            }
            BlazeDp blazeDp = this.padding;
            if (blazeDp == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                blazeDp.writeToParcel(dest, flags);
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            BlazeInsets createFromParcel = BlazeInsets.CREATOR.createFromParcel(parcel);
            BlazePlayerTabsGradientStyle createFromParcel2 = BlazePlayerTabsGradientStyle.CREATOR.createFromParcel(parcel);
            BlazePlayerTabItemIconStyle createFromParcel3 = parcel.readInt() == 0 ? null : BlazePlayerTabItemIconStyle.CREATOR.createFromParcel(parcel);
            Parcelable.Creator<BlazePlayerTabItemStyle> creator = BlazePlayerTabItemStyle.CREATOR;
            return new BlazePlayerTabsStyle(createFromParcel, createFromParcel2, createFromParcel3, creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazePlayerTabsStyle[i];
        }
    }

    public BlazePlayerTabsStyle(@NotNull BlazeInsets blazeInsets, @NotNull BlazePlayerTabsGradientStyle blazePlayerTabsGradientStyle, @Nullable BlazePlayerTabItemIconStyle blazePlayerTabItemIconStyle, @NotNull BlazePlayerTabItemStyle blazePlayerTabItemStyle, @NotNull BlazePlayerTabItemStyle blazePlayerTabItemStyle2) {
        blazeInsets.getClass();
        blazePlayerTabsGradientStyle.getClass();
        blazePlayerTabItemStyle.getClass();
        blazePlayerTabItemStyle2.getClass();
        this.padding = blazeInsets;
        this.gradient = blazePlayerTabsGradientStyle;
        this.icon = blazePlayerTabItemIconStyle;
        this.selectedTabState = blazePlayerTabItemStyle;
        this.unselectedTabState = blazePlayerTabItemStyle2;
    }

    public static /* synthetic */ BlazePlayerTabsStyle copy$default(BlazePlayerTabsStyle blazePlayerTabsStyle, BlazeInsets blazeInsets, BlazePlayerTabsGradientStyle blazePlayerTabsGradientStyle, BlazePlayerTabItemIconStyle blazePlayerTabItemIconStyle, BlazePlayerTabItemStyle blazePlayerTabItemStyle, BlazePlayerTabItemStyle blazePlayerTabItemStyle2, int i, Object obj) {
        if ((i & 1) != 0) {
            blazeInsets = blazePlayerTabsStyle.padding;
        }
        if ((i & 2) != 0) {
            blazePlayerTabsGradientStyle = blazePlayerTabsStyle.gradient;
        }
        if ((i & 4) != 0) {
            blazePlayerTabItemIconStyle = blazePlayerTabsStyle.icon;
        }
        if ((i & 8) != 0) {
            blazePlayerTabItemStyle = blazePlayerTabsStyle.selectedTabState;
        }
        if ((i & 16) != 0) {
            blazePlayerTabItemStyle2 = blazePlayerTabsStyle.unselectedTabState;
        }
        BlazePlayerTabItemStyle blazePlayerTabItemStyle3 = blazePlayerTabItemStyle2;
        BlazePlayerTabItemIconStyle blazePlayerTabItemIconStyle2 = blazePlayerTabItemIconStyle;
        return blazePlayerTabsStyle.copy(blazeInsets, blazePlayerTabsGradientStyle, blazePlayerTabItemIconStyle2, blazePlayerTabItemStyle, blazePlayerTabItemStyle3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final BlazeInsets getPadding() {
        return this.padding;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final BlazePlayerTabsGradientStyle getGradient() {
        return this.gradient;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final BlazePlayerTabItemIconStyle getIcon() {
        return this.icon;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final BlazePlayerTabItemStyle getSelectedTabState() {
        return this.selectedTabState;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final BlazePlayerTabItemStyle getUnselectedTabState() {
        return this.unselectedTabState;
    }

    @NotNull
    public final BlazePlayerTabsStyle copy(@NotNull BlazeInsets padding, @NotNull BlazePlayerTabsGradientStyle gradient, @Nullable BlazePlayerTabItemIconStyle icon, @NotNull BlazePlayerTabItemStyle selectedTabState, @NotNull BlazePlayerTabItemStyle unselectedTabState) {
        padding.getClass();
        gradient.getClass();
        selectedTabState.getClass();
        unselectedTabState.getClass();
        return new BlazePlayerTabsStyle(padding, gradient, icon, selectedTabState, unselectedTabState);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazePlayerTabsStyle)) {
            return false;
        }
        BlazePlayerTabsStyle blazePlayerTabsStyle = (BlazePlayerTabsStyle) other;
        return Intrinsics.c(this.padding, blazePlayerTabsStyle.padding) && Intrinsics.c(this.gradient, blazePlayerTabsStyle.gradient) && Intrinsics.c(this.icon, blazePlayerTabsStyle.icon) && Intrinsics.c(this.selectedTabState, blazePlayerTabsStyle.selectedTabState) && Intrinsics.c(this.unselectedTabState, blazePlayerTabsStyle.unselectedTabState);
    }

    @NotNull
    public final BlazePlayerTabsGradientStyle getGradient() {
        return this.gradient;
    }

    @Nullable
    public final BlazePlayerTabItemIconStyle getIcon() {
        return this.icon;
    }

    @NotNull
    public final BlazeInsets getPadding() {
        return this.padding;
    }

    @NotNull
    public final BlazePlayerTabItemStyle getSelectedTabState() {
        return this.selectedTabState;
    }

    @NotNull
    public final BlazePlayerTabItemStyle getUnselectedTabState() {
        return this.unselectedTabState;
    }

    public int hashCode() {
        int hashCode = (this.gradient.hashCode() + (this.padding.hashCode() * 31)) * 31;
        BlazePlayerTabItemIconStyle blazePlayerTabItemIconStyle = this.icon;
        return this.unselectedTabState.hashCode() + ((this.selectedTabState.hashCode() + ((hashCode + (blazePlayerTabItemIconStyle == null ? 0 : blazePlayerTabItemIconStyle.hashCode())) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "BlazePlayerTabsStyle(padding=" + this.padding + ", gradient=" + this.gradient + ", icon=" + this.icon + ", selectedTabState=" + this.selectedTabState + ", unselectedTabState=" + this.unselectedTabState + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        this.padding.writeToParcel(dest, flags);
        this.gradient.writeToParcel(dest, flags);
        BlazePlayerTabItemIconStyle blazePlayerTabItemIconStyle = this.icon;
        if (blazePlayerTabItemIconStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            blazePlayerTabItemIconStyle.writeToParcel(dest, flags);
        }
        this.selectedTabState.writeToParcel(dest, flags);
        this.unselectedTabState.writeToParcel(dest, flags);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/blaze/blazesdk/style/players/tabs/BlazePlayerTabsStyle$Companion;", "", "<init>", "()V", "base", "Lcom/blaze/blazesdk/style/players/tabs/BlazePlayerTabsStyle;", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BlazePlayerTabsStyle base() {
            BlazePlayerTabItemStyle blazePlayerTabItemStyle = new BlazePlayerTabItemStyle(null, null, Color.parseColor("#F0F0F0"), 16.0f, null);
            BlazePlayerTabItemStyle blazePlayerTabItemStyle2 = new BlazePlayerTabItemStyle(null, null, Color.parseColor("#BABABA"), 16.0f, null);
            return new BlazePlayerTabsStyle(new BlazeInsets(new BlazeDp(16), new BlazeDp(16), new BlazeDp(16), new BlazeDp(0)), new BlazePlayerTabsGradientStyle(true, -16777216, ((int) (llf.b(0.5f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f) * 255.0f)) << 24, 0), new BlazePlayerTabItemIconStyle(BlazePlayerTabItemIconStyle.BlazeIconPositioning.START, null, new BlazeDp(8)), blazePlayerTabItemStyle, blazePlayerTabItemStyle2);
        }

        private Companion() {
        }
    }
}
