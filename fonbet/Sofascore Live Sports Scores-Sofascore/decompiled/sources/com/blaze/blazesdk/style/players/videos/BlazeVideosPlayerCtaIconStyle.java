package com.blaze.blazesdk.style.players.videos;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.blaze.blazesdk.utils.BlazeParcelable;
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
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001(B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J.\u0010\u0019\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0006\u0010\u001b\u001a\u00020\u0003J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0003R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006)"}, d2 = {"Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerCtaIconStyle;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", "iconResId", "", "iconPositioning", "Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerCtaIconStyle$BlazeIconPositioning;", "iconTint", "<init>", "(ILcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerCtaIconStyle$BlazeIconPositioning;Ljava/lang/Integer;)V", "getIconResId", "()I", "setIconResId", "(I)V", "getIconPositioning", "()Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerCtaIconStyle$BlazeIconPositioning;", "setIconPositioning", "(Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerCtaIconStyle$BlazeIconPositioning;)V", "getIconTint", "()Ljava/lang/Integer;", "setIconTint", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(ILcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerCtaIconStyle$BlazeIconPositioning;Ljava/lang/Integer;)Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerCtaIconStyle;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "BlazeIconPositioning", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlazeVideosPlayerCtaIconStyle implements BlazeParcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazeVideosPlayerCtaIconStyle> CREATOR = new a();

    @NotNull
    private BlazeIconPositioning iconPositioning;
    private int iconResId;

    @Nullable
    private Integer iconTint;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerCtaIconStyle$BlazeIconPositioning;", "", "<init>", "(Ljava/lang/String;I)V", "START", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
            return new BlazeVideosPlayerCtaIconStyle(parcel.readInt(), BlazeIconPositioning.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazeVideosPlayerCtaIconStyle[i];
        }
    }

    public BlazeVideosPlayerCtaIconStyle(int i, @NotNull BlazeIconPositioning blazeIconPositioning, @Nullable Integer num) {
        blazeIconPositioning.getClass();
        this.iconResId = i;
        this.iconPositioning = blazeIconPositioning;
        this.iconTint = num;
    }

    public static /* synthetic */ BlazeVideosPlayerCtaIconStyle copy$default(BlazeVideosPlayerCtaIconStyle blazeVideosPlayerCtaIconStyle, int i, BlazeIconPositioning blazeIconPositioning, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = blazeVideosPlayerCtaIconStyle.iconResId;
        }
        if ((i2 & 2) != 0) {
            blazeIconPositioning = blazeVideosPlayerCtaIconStyle.iconPositioning;
        }
        if ((i2 & 4) != 0) {
            num = blazeVideosPlayerCtaIconStyle.iconTint;
        }
        return blazeVideosPlayerCtaIconStyle.copy(i, blazeIconPositioning, num);
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
    public final BlazeVideosPlayerCtaIconStyle copy(int iconResId, @NotNull BlazeIconPositioning iconPositioning, @Nullable Integer iconTint) {
        iconPositioning.getClass();
        return new BlazeVideosPlayerCtaIconStyle(iconResId, iconPositioning, iconTint);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeVideosPlayerCtaIconStyle)) {
            return false;
        }
        BlazeVideosPlayerCtaIconStyle blazeVideosPlayerCtaIconStyle = (BlazeVideosPlayerCtaIconStyle) other;
        return this.iconResId == blazeVideosPlayerCtaIconStyle.iconResId && this.iconPositioning == blazeVideosPlayerCtaIconStyle.iconPositioning && Intrinsics.c(this.iconTint, blazeVideosPlayerCtaIconStyle.iconTint);
    }

    @NotNull
    public final BlazeIconPositioning getIconPositioning() {
        return this.iconPositioning;
    }

    public final int getIconResId() {
        return this.iconResId;
    }

    @Nullable
    public final Integer getIconTint() {
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

    public final void setIconResId(int i) {
        this.iconResId = i;
    }

    public final void setIconTint(@Nullable Integer num) {
        this.iconTint = num;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("BlazeVideosPlayerCtaIconStyle(iconResId=");
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
