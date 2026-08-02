package com.blaze.blazesdk.style.widgets;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.blaze.blazesdk.style.shared.models.BlazeInsets;
import com.blaze.blazesdk.style.shared.models.BlazeObjectPositioning;
import com.blaze.blazesdk.utils.BlazeParcelable;
import com.blaze.blazesdk.widgets.contracts.BlazeWidgetTimeElementStyle;
import com.blaze.blazesdk.widgets.contracts.TimeElementIconStyle;
import com.ironsource.C4018c8;
import defpackage.b6a;
import defpackage.bf3;
import defpackage.gz8;
import defpackage.jp5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u00019B;\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010%\u001a\u00020\u0004HÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010*\u001a\u00020\rHÆ\u0003JG\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0006\u0010,\u001a\u00020-J\u0013\u0010.\u001a\u00020\u00042\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\t\u00101\u001a\u00020-HÖ\u0001J\t\u00102\u001a\u000203HÖ\u0001J\u0016\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020-R\u001a\u0010\u0003\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\t\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006:"}, d2 = {"Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemEventTimeElementStyle;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", "Lcom/blaze/blazesdk/widgets/contracts/BlazeWidgetTimeElementStyle;", C4018c8.k, "", "position", "Lcom/blaze/blazesdk/style/shared/models/BlazeObjectPositioning;", "margins", "Lcom/blaze/blazesdk/style/shared/models/BlazeInsets;", "padding", "icon", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemEventTimeElementStyle$BlazeWidgetItemEventTimeElementIconStyle;", "streamStates", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemEventTimeElementStreamStatesStyle;", "<init>", "(ZLcom/blaze/blazesdk/style/shared/models/BlazeObjectPositioning;Lcom/blaze/blazesdk/style/shared/models/BlazeInsets;Lcom/blaze/blazesdk/style/shared/models/BlazeInsets;Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemEventTimeElementStyle$BlazeWidgetItemEventTimeElementIconStyle;Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemEventTimeElementStreamStatesStyle;)V", "()Z", "setVisible", "(Z)V", "getPosition", "()Lcom/blaze/blazesdk/style/shared/models/BlazeObjectPositioning;", "setPosition", "(Lcom/blaze/blazesdk/style/shared/models/BlazeObjectPositioning;)V", "getMargins", "()Lcom/blaze/blazesdk/style/shared/models/BlazeInsets;", "setMargins", "(Lcom/blaze/blazesdk/style/shared/models/BlazeInsets;)V", "getPadding", "setPadding", "getIcon", "()Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemEventTimeElementStyle$BlazeWidgetItemEventTimeElementIconStyle;", "setIcon", "(Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemEventTimeElementStyle$BlazeWidgetItemEventTimeElementIconStyle;)V", "getStreamStates", "()Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemEventTimeElementStreamStatesStyle;", "setStreamStates", "(Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemEventTimeElementStreamStatesStyle;)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "BlazeWidgetItemEventTimeElementIconStyle", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlazeWidgetItemEventTimeElementStyle implements BlazeParcelable, BlazeWidgetTimeElementStyle {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazeWidgetItemEventTimeElementStyle> CREATOR = new a();

    @Nullable
    private BlazeWidgetItemEventTimeElementIconStyle icon;
    private boolean isVisible;

    @NotNull
    private BlazeInsets margins;

    @NotNull
    private BlazeInsets padding;

    @NotNull
    private BlazeObjectPositioning position;

    @NotNull
    private BlazeWidgetItemEventTimeElementStreamStatesStyle streamStates;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001)B#\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0017\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\u0013J.\u0010\u001a\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0006\u0010\u001c\u001a\u00020\u0004J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u0004HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006*"}, d2 = {"Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemEventTimeElementStyle$BlazeWidgetItemEventTimeElementIconStyle;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", "Lcom/blaze/blazesdk/widgets/contracts/TimeElementIconStyle;", "iconResId", "", "iconPositioning", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemEventTimeElementStyle$BlazeWidgetItemEventTimeElementIconStyle$BlazeIconPositioning;", "iconTint", "<init>", "(ILcom/blaze/blazesdk/style/widgets/BlazeWidgetItemEventTimeElementStyle$BlazeWidgetItemEventTimeElementIconStyle$BlazeIconPositioning;Ljava/lang/Integer;)V", "getIconResId", "()I", "setIconResId", "(I)V", "getIconPositioning", "()Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemEventTimeElementStyle$BlazeWidgetItemEventTimeElementIconStyle$BlazeIconPositioning;", "setIconPositioning", "(Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemEventTimeElementStyle$BlazeWidgetItemEventTimeElementIconStyle$BlazeIconPositioning;)V", "getIconTint", "()Ljava/lang/Integer;", "setIconTint", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(ILcom/blaze/blazesdk/style/widgets/BlazeWidgetItemEventTimeElementStyle$BlazeWidgetItemEventTimeElementIconStyle$BlazeIconPositioning;Ljava/lang/Integer;)Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemEventTimeElementStyle$BlazeWidgetItemEventTimeElementIconStyle;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "BlazeIconPositioning", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BlazeWidgetItemEventTimeElementIconStyle implements BlazeParcelable, TimeElementIconStyle {
        public static final int $stable = 8;

        @NotNull
        public static final Parcelable.Creator<BlazeWidgetItemEventTimeElementIconStyle> CREATOR = new a();

        @NotNull
        private BlazeIconPositioning iconPositioning;
        private int iconResId;

        @Nullable
        private Integer iconTint;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Keep
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemEventTimeElementStyle$BlazeWidgetItemEventTimeElementIconStyle$BlazeIconPositioning;", "", "<init>", "(Ljava/lang/String;I)V", "START", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
                return new BlazeWidgetItemEventTimeElementIconStyle(parcel.readInt(), BlazeIconPositioning.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BlazeWidgetItemEventTimeElementIconStyle[i];
            }
        }

        public BlazeWidgetItemEventTimeElementIconStyle(int i, @NotNull BlazeIconPositioning blazeIconPositioning, @Nullable Integer num) {
            blazeIconPositioning.getClass();
            this.iconResId = i;
            this.iconPositioning = blazeIconPositioning;
            this.iconTint = num;
        }

        public static /* synthetic */ BlazeWidgetItemEventTimeElementIconStyle copy$default(BlazeWidgetItemEventTimeElementIconStyle blazeWidgetItemEventTimeElementIconStyle, int i, BlazeIconPositioning blazeIconPositioning, Integer num, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = blazeWidgetItemEventTimeElementIconStyle.iconResId;
            }
            if ((i2 & 2) != 0) {
                blazeIconPositioning = blazeWidgetItemEventTimeElementIconStyle.iconPositioning;
            }
            if ((i2 & 4) != 0) {
                num = blazeWidgetItemEventTimeElementIconStyle.iconTint;
            }
            return blazeWidgetItemEventTimeElementIconStyle.copy(i, blazeIconPositioning, num);
        }

        /* renamed from: component1, reason: from getter */
        public final int getIconResId() {
            return this.iconResId;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final BlazeIconPositioning getIconPositioning() {
            return this.iconPositioning;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final Integer getIconTint() {
            return this.iconTint;
        }

        @NotNull
        public final BlazeWidgetItemEventTimeElementIconStyle copy(int iconResId, @NotNull BlazeIconPositioning iconPositioning, @Nullable Integer iconTint) {
            iconPositioning.getClass();
            return new BlazeWidgetItemEventTimeElementIconStyle(iconResId, iconPositioning, iconTint);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BlazeWidgetItemEventTimeElementIconStyle)) {
                return false;
            }
            BlazeWidgetItemEventTimeElementIconStyle blazeWidgetItemEventTimeElementIconStyle = (BlazeWidgetItemEventTimeElementIconStyle) other;
            return this.iconResId == blazeWidgetItemEventTimeElementIconStyle.iconResId && this.iconPositioning == blazeWidgetItemEventTimeElementIconStyle.iconPositioning && Intrinsics.c(this.iconTint, blazeWidgetItemEventTimeElementIconStyle.iconTint);
        }

        @NotNull
        public final BlazeIconPositioning getIconPositioning() {
            return this.iconPositioning;
        }

        @Override // com.blaze.blazesdk.widgets.contracts.TimeElementIconStyle
        public int getIconResId() {
            return this.iconResId;
        }

        @Override // com.blaze.blazesdk.widgets.contracts.TimeElementIconStyle
        @Nullable
        public Integer getIconTint() {
            return this.iconTint;
        }

        public int hashCode() {
            int hashCode = (this.iconPositioning.hashCode() + (Integer.hashCode(this.iconResId) * 31)) * 31;
            Integer num = this.iconTint;
            return hashCode + (num == null ? 0 : num.hashCode());
        }

        public final void setIconPositioning(@NotNull BlazeIconPositioning blazeIconPositioning) {
            blazeIconPositioning.getClass();
            this.iconPositioning = blazeIconPositioning;
        }

        @Override // com.blaze.blazesdk.widgets.contracts.TimeElementIconStyle
        public void setIconResId(int i) {
            this.iconResId = i;
        }

        @Override // com.blaze.blazesdk.widgets.contracts.TimeElementIconStyle
        public void setIconTint(@Nullable Integer num) {
            this.iconTint = num;
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("BlazeWidgetItemEventTimeElementIconStyle(iconResId=");
            sb.append(this.iconResId);
            sb.append(", iconPositioning=");
            sb.append(this.iconPositioning);
            sb.append(", iconTint=");
            return bf3.n(sb, this.iconTint, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            dest.getClass();
            dest.writeInt(this.iconResId);
            dest.writeString(this.iconPositioning.name());
            Integer num = this.iconTint;
            if (num == null) {
                dest.writeInt(0);
            } else {
                b6a.h(dest, num);
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            boolean z = parcel.readInt() != 0;
            BlazeObjectPositioning createFromParcel = BlazeObjectPositioning.CREATOR.createFromParcel(parcel);
            Parcelable.Creator<BlazeInsets> creator = BlazeInsets.CREATOR;
            return new BlazeWidgetItemEventTimeElementStyle(z, createFromParcel, creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : BlazeWidgetItemEventTimeElementIconStyle.CREATOR.createFromParcel(parcel), BlazeWidgetItemEventTimeElementStreamStatesStyle.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazeWidgetItemEventTimeElementStyle[i];
        }
    }

    public BlazeWidgetItemEventTimeElementStyle(boolean z, @NotNull BlazeObjectPositioning blazeObjectPositioning, @NotNull BlazeInsets blazeInsets, @NotNull BlazeInsets blazeInsets2, @Nullable BlazeWidgetItemEventTimeElementIconStyle blazeWidgetItemEventTimeElementIconStyle, @NotNull BlazeWidgetItemEventTimeElementStreamStatesStyle blazeWidgetItemEventTimeElementStreamStatesStyle) {
        blazeObjectPositioning.getClass();
        blazeInsets.getClass();
        blazeInsets2.getClass();
        blazeWidgetItemEventTimeElementStreamStatesStyle.getClass();
        this.isVisible = z;
        this.position = blazeObjectPositioning;
        this.margins = blazeInsets;
        this.padding = blazeInsets2;
        this.icon = blazeWidgetItemEventTimeElementIconStyle;
        this.streamStates = blazeWidgetItemEventTimeElementStreamStatesStyle;
    }

    public static /* synthetic */ BlazeWidgetItemEventTimeElementStyle copy$default(BlazeWidgetItemEventTimeElementStyle blazeWidgetItemEventTimeElementStyle, boolean z, BlazeObjectPositioning blazeObjectPositioning, BlazeInsets blazeInsets, BlazeInsets blazeInsets2, BlazeWidgetItemEventTimeElementIconStyle blazeWidgetItemEventTimeElementIconStyle, BlazeWidgetItemEventTimeElementStreamStatesStyle blazeWidgetItemEventTimeElementStreamStatesStyle, int i, Object obj) {
        if ((i & 1) != 0) {
            z = blazeWidgetItemEventTimeElementStyle.isVisible;
        }
        if ((i & 2) != 0) {
            blazeObjectPositioning = blazeWidgetItemEventTimeElementStyle.position;
        }
        if ((i & 4) != 0) {
            blazeInsets = blazeWidgetItemEventTimeElementStyle.margins;
        }
        if ((i & 8) != 0) {
            blazeInsets2 = blazeWidgetItemEventTimeElementStyle.padding;
        }
        if ((i & 16) != 0) {
            blazeWidgetItemEventTimeElementIconStyle = blazeWidgetItemEventTimeElementStyle.icon;
        }
        if ((i & 32) != 0) {
            blazeWidgetItemEventTimeElementStreamStatesStyle = blazeWidgetItemEventTimeElementStyle.streamStates;
        }
        BlazeWidgetItemEventTimeElementIconStyle blazeWidgetItemEventTimeElementIconStyle2 = blazeWidgetItemEventTimeElementIconStyle;
        BlazeWidgetItemEventTimeElementStreamStatesStyle blazeWidgetItemEventTimeElementStreamStatesStyle2 = blazeWidgetItemEventTimeElementStreamStatesStyle;
        return blazeWidgetItemEventTimeElementStyle.copy(z, blazeObjectPositioning, blazeInsets, blazeInsets2, blazeWidgetItemEventTimeElementIconStyle2, blazeWidgetItemEventTimeElementStreamStatesStyle2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final BlazeObjectPositioning getPosition() {
        return this.position;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final BlazeInsets getMargins() {
        return this.margins;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final BlazeInsets getPadding() {
        return this.padding;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final BlazeWidgetItemEventTimeElementIconStyle getIcon() {
        return this.icon;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final BlazeWidgetItemEventTimeElementStreamStatesStyle getStreamStates() {
        return this.streamStates;
    }

    @NotNull
    public final BlazeWidgetItemEventTimeElementStyle copy(boolean isVisible, @NotNull BlazeObjectPositioning position, @NotNull BlazeInsets margins, @NotNull BlazeInsets padding, @Nullable BlazeWidgetItemEventTimeElementIconStyle icon, @NotNull BlazeWidgetItemEventTimeElementStreamStatesStyle streamStates) {
        position.getClass();
        margins.getClass();
        padding.getClass();
        streamStates.getClass();
        return new BlazeWidgetItemEventTimeElementStyle(isVisible, position, margins, padding, icon, streamStates);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeWidgetItemEventTimeElementStyle)) {
            return false;
        }
        BlazeWidgetItemEventTimeElementStyle blazeWidgetItemEventTimeElementStyle = (BlazeWidgetItemEventTimeElementStyle) other;
        return this.isVisible == blazeWidgetItemEventTimeElementStyle.isVisible && Intrinsics.c(this.position, blazeWidgetItemEventTimeElementStyle.position) && Intrinsics.c(this.margins, blazeWidgetItemEventTimeElementStyle.margins) && Intrinsics.c(this.padding, blazeWidgetItemEventTimeElementStyle.padding) && Intrinsics.c(this.icon, blazeWidgetItemEventTimeElementStyle.icon) && Intrinsics.c(this.streamStates, blazeWidgetItemEventTimeElementStyle.streamStates);
    }

    @Override // com.blaze.blazesdk.widgets.contracts.BlazeWidgetTimeElementStyle
    @NotNull
    public BlazeInsets getMargins() {
        return this.margins;
    }

    @Override // com.blaze.blazesdk.widgets.contracts.BlazeWidgetTimeElementStyle
    @NotNull
    public BlazeInsets getPadding() {
        return this.padding;
    }

    @Override // com.blaze.blazesdk.widgets.contracts.BlazeWidgetTimeElementStyle
    @NotNull
    public BlazeObjectPositioning getPosition() {
        return this.position;
    }

    @NotNull
    public final BlazeWidgetItemEventTimeElementStreamStatesStyle getStreamStates() {
        return this.streamStates;
    }

    public int hashCode() {
        int hashCode = (this.padding.hashCode() + ((this.margins.hashCode() + ((this.position.hashCode() + (Boolean.hashCode(this.isVisible) * 31)) * 31)) * 31)) * 31;
        BlazeWidgetItemEventTimeElementIconStyle blazeWidgetItemEventTimeElementIconStyle = this.icon;
        return this.streamStates.hashCode() + ((hashCode + (blazeWidgetItemEventTimeElementIconStyle == null ? 0 : blazeWidgetItemEventTimeElementIconStyle.hashCode())) * 31);
    }

    @Override // com.blaze.blazesdk.widgets.contracts.BlazeWidgetTimeElementStyle
    public boolean isVisible() {
        return this.isVisible;
    }

    public void setIcon(@Nullable BlazeWidgetItemEventTimeElementIconStyle blazeWidgetItemEventTimeElementIconStyle) {
        this.icon = blazeWidgetItemEventTimeElementIconStyle;
    }

    @Override // com.blaze.blazesdk.widgets.contracts.BlazeWidgetTimeElementStyle
    public void setMargins(@NotNull BlazeInsets blazeInsets) {
        blazeInsets.getClass();
        this.margins = blazeInsets;
    }

    @Override // com.blaze.blazesdk.widgets.contracts.BlazeWidgetTimeElementStyle
    public void setPadding(@NotNull BlazeInsets blazeInsets) {
        blazeInsets.getClass();
        this.padding = blazeInsets;
    }

    @Override // com.blaze.blazesdk.widgets.contracts.BlazeWidgetTimeElementStyle
    public void setPosition(@NotNull BlazeObjectPositioning blazeObjectPositioning) {
        blazeObjectPositioning.getClass();
        this.position = blazeObjectPositioning;
    }

    public final void setStreamStates(@NotNull BlazeWidgetItemEventTimeElementStreamStatesStyle blazeWidgetItemEventTimeElementStreamStatesStyle) {
        blazeWidgetItemEventTimeElementStreamStatesStyle.getClass();
        this.streamStates = blazeWidgetItemEventTimeElementStreamStatesStyle;
    }

    @Override // com.blaze.blazesdk.widgets.contracts.BlazeWidgetTimeElementStyle
    public void setVisible(boolean z) {
        this.isVisible = z;
    }

    @NotNull
    public String toString() {
        return "BlazeWidgetItemEventTimeElementStyle(isVisible=" + this.isVisible + ", position=" + this.position + ", margins=" + this.margins + ", padding=" + this.padding + ", icon=" + this.icon + ", streamStates=" + this.streamStates + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeInt(this.isVisible ? 1 : 0);
        this.position.writeToParcel(dest, flags);
        this.margins.writeToParcel(dest, flags);
        this.padding.writeToParcel(dest, flags);
        BlazeWidgetItemEventTimeElementIconStyle blazeWidgetItemEventTimeElementIconStyle = this.icon;
        if (blazeWidgetItemEventTimeElementIconStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            blazeWidgetItemEventTimeElementIconStyle.writeToParcel(dest, flags);
        }
        this.streamStates.writeToParcel(dest, flags);
    }

    @Override // com.blaze.blazesdk.widgets.contracts.BlazeWidgetTimeElementStyle
    @Nullable
    public BlazeWidgetItemEventTimeElementIconStyle getIcon() {
        return this.icon;
    }
}
