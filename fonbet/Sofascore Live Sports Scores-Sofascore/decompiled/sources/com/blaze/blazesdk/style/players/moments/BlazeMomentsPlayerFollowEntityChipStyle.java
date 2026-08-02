package com.blaze.blazesdk.style.players.moments;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.blaze.blazesdk.utils.BlazeParcelable;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.sofascore.results.R;
import defpackage.gz8;
import defpackage.jp5;
import defpackage.l4a;
import defpackage.wv8;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000245B/\b\u0000\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b\u001b\u0010\u0016J8\u0010\u001d\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0016J\u001a\u0010%\u001a\u00020\n2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0016\"\u0004\b)\u0010*R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010'\u001a\u0004\b+\u0010\u0016\"\u0004\b,\u0010*R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010\u001a\"\u0004\b/\u00100R\"\u0010\u0007\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010'\u001a\u0004\b1\u0010\u0016\"\u0004\b2\u0010*¨\u00066"}, d2 = {"Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerFollowEntityChipStyle;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", "", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "iconColor", "Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerFollowEntityChipStyle$BlazeMomentsPlayerFollowEntityChipContentSource;", "contentSource", "contentSourceResourceId", "<init>", "(IILcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerFollowEntityChipStyle$BlazeMomentsPlayerFollowEntityChipContentSource;I)V", "", "isFollowedState", "", "updateContentSourceResourceId$blazesdk_release", "(Z)V", "updateContentSourceResourceId", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "component2", "component3", "()Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerFollowEntityChipStyle$BlazeMomentsPlayerFollowEntityChipContentSource;", "component4$blazesdk_release", "component4", "copy", "(IILcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerFollowEntityChipStyle$BlazeMomentsPlayerFollowEntityChipContentSource;I)Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerFollowEntityChipStyle;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getBackgroundColor", "setBackgroundColor", "(I)V", "getIconColor", "setIconColor", "Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerFollowEntityChipStyle$BlazeMomentsPlayerFollowEntityChipContentSource;", "getContentSource", "setContentSource", "(Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerFollowEntityChipStyle$BlazeMomentsPlayerFollowEntityChipContentSource;)V", "getContentSourceResourceId$blazesdk_release", "setContentSourceResourceId$blazesdk_release", "Companion", "BlazeMomentsPlayerFollowEntityChipContentSource", "a", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlazeMomentsPlayerFollowEntityChipStyle implements BlazeParcelable {
    private int backgroundColor;

    @NotNull
    private BlazeMomentsPlayerFollowEntityChipContentSource contentSource;
    private int contentSourceResourceId;
    private int iconColor;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazeMomentsPlayerFollowEntityChipStyle> CREATOR = new b();
    private static final int DEFAULT_CHIP_BACKGROUND_COLOR = Color.parseColor("#F0F0F0");
    private static final int DEFAULT_CHIP_ICON_COLOR = Color.parseColor("#FF333333");

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bj\u0002\b\u0005j\u0002\b\u0006¨\u0006\u000e"}, d2 = {"Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerFollowEntityChipStyle$BlazeMomentsPlayerFollowEntityChipContentSource;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", "", "<init>", "(Ljava/lang/String;I)V", NativeAdContent.ViewTag.AD_ICON, "TEXT", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BlazeMomentsPlayerFollowEntityChipContentSource implements BlazeParcelable {
        private static final /* synthetic */ jp5 $ENTRIES;
        private static final /* synthetic */ BlazeMomentsPlayerFollowEntityChipContentSource[] $VALUES;

        @NotNull
        public static final Parcelable.Creator<BlazeMomentsPlayerFollowEntityChipContentSource> CREATOR;
        public static final BlazeMomentsPlayerFollowEntityChipContentSource ICON = new BlazeMomentsPlayerFollowEntityChipContentSource(NativeAdContent.ViewTag.AD_ICON, 0);
        public static final BlazeMomentsPlayerFollowEntityChipContentSource TEXT = new BlazeMomentsPlayerFollowEntityChipContentSource("TEXT", 1);

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                return BlazeMomentsPlayerFollowEntityChipContentSource.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BlazeMomentsPlayerFollowEntityChipContentSource[i];
            }
        }

        private static final /* synthetic */ BlazeMomentsPlayerFollowEntityChipContentSource[] $values() {
            return new BlazeMomentsPlayerFollowEntityChipContentSource[]{ICON, TEXT};
        }

        static {
            BlazeMomentsPlayerFollowEntityChipContentSource[] $values = $values();
            $VALUES = $values;
            $ENTRIES = gz8.G($values);
            CREATOR = new a();
        }

        private BlazeMomentsPlayerFollowEntityChipContentSource(String str, int i) {
        }

        @NotNull
        public static jp5 getEntries() {
            return $ENTRIES;
        }

        public static BlazeMomentsPlayerFollowEntityChipContentSource valueOf(String str) {
            return (BlazeMomentsPlayerFollowEntityChipContentSource) Enum.valueOf(BlazeMomentsPlayerFollowEntityChipContentSource.class, str);
        }

        public static BlazeMomentsPlayerFollowEntityChipContentSource[] values() {
            return (BlazeMomentsPlayerFollowEntityChipContentSource[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            dest.getClass();
            dest.writeString(name());
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerFollowEntityChipStyle$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new BlazeMomentsPlayerFollowEntityChipStyle(parcel.readInt(), parcel.readInt(), BlazeMomentsPlayerFollowEntityChipContentSource.CREATOR.createFromParcel(parcel), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazeMomentsPlayerFollowEntityChipStyle[i];
        }
    }

    public BlazeMomentsPlayerFollowEntityChipStyle(int i, int i2, @NotNull BlazeMomentsPlayerFollowEntityChipContentSource blazeMomentsPlayerFollowEntityChipContentSource, int i3) {
        blazeMomentsPlayerFollowEntityChipContentSource.getClass();
        this.backgroundColor = i;
        this.iconColor = i2;
        this.contentSource = blazeMomentsPlayerFollowEntityChipContentSource;
        this.contentSourceResourceId = i3;
    }

    public static /* synthetic */ BlazeMomentsPlayerFollowEntityChipStyle copy$default(BlazeMomentsPlayerFollowEntityChipStyle blazeMomentsPlayerFollowEntityChipStyle, int i, int i2, BlazeMomentsPlayerFollowEntityChipContentSource blazeMomentsPlayerFollowEntityChipContentSource, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = blazeMomentsPlayerFollowEntityChipStyle.backgroundColor;
        }
        if ((i4 & 2) != 0) {
            i2 = blazeMomentsPlayerFollowEntityChipStyle.iconColor;
        }
        if ((i4 & 4) != 0) {
            blazeMomentsPlayerFollowEntityChipContentSource = blazeMomentsPlayerFollowEntityChipStyle.contentSource;
        }
        if ((i4 & 8) != 0) {
            i3 = blazeMomentsPlayerFollowEntityChipStyle.contentSourceResourceId;
        }
        return blazeMomentsPlayerFollowEntityChipStyle.copy(i, i2, blazeMomentsPlayerFollowEntityChipContentSource, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component2, reason: from getter */
    public final int getIconColor() {
        return this.iconColor;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final BlazeMomentsPlayerFollowEntityChipContentSource getContentSource() {
        return this.contentSource;
    }

    /* renamed from: component4$blazesdk_release, reason: from getter */
    public final int getContentSourceResourceId() {
        return this.contentSourceResourceId;
    }

    @NotNull
    public final BlazeMomentsPlayerFollowEntityChipStyle copy(int backgroundColor, int iconColor, @NotNull BlazeMomentsPlayerFollowEntityChipContentSource contentSource, int contentSourceResourceId) {
        contentSource.getClass();
        return new BlazeMomentsPlayerFollowEntityChipStyle(backgroundColor, iconColor, contentSource, contentSourceResourceId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeMomentsPlayerFollowEntityChipStyle)) {
            return false;
        }
        BlazeMomentsPlayerFollowEntityChipStyle blazeMomentsPlayerFollowEntityChipStyle = (BlazeMomentsPlayerFollowEntityChipStyle) other;
        return this.backgroundColor == blazeMomentsPlayerFollowEntityChipStyle.backgroundColor && this.iconColor == blazeMomentsPlayerFollowEntityChipStyle.iconColor && this.contentSource == blazeMomentsPlayerFollowEntityChipStyle.contentSource && this.contentSourceResourceId == blazeMomentsPlayerFollowEntityChipStyle.contentSourceResourceId;
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final BlazeMomentsPlayerFollowEntityChipContentSource getContentSource() {
        return this.contentSource;
    }

    public final int getContentSourceResourceId$blazesdk_release() {
        return this.contentSourceResourceId;
    }

    public final int getIconColor() {
        return this.iconColor;
    }

    public int hashCode() {
        return Integer.hashCode(this.contentSourceResourceId) + ((this.contentSource.hashCode() + l4a.e(this.iconColor, Integer.hashCode(this.backgroundColor) * 31)) * 31);
    }

    public final void setBackgroundColor(int i) {
        this.backgroundColor = i;
    }

    public final void setContentSource(@NotNull BlazeMomentsPlayerFollowEntityChipContentSource blazeMomentsPlayerFollowEntityChipContentSource) {
        blazeMomentsPlayerFollowEntityChipContentSource.getClass();
        this.contentSource = blazeMomentsPlayerFollowEntityChipContentSource;
    }

    public final void setContentSourceResourceId$blazesdk_release(int i) {
        this.contentSourceResourceId = i;
    }

    public final void setIconColor(int i) {
        this.iconColor = i;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("BlazeMomentsPlayerFollowEntityChipStyle(backgroundColor=");
        sb.append(this.backgroundColor);
        sb.append(", iconColor=");
        sb.append(this.iconColor);
        sb.append(", contentSource=");
        sb.append(this.contentSource);
        sb.append(", contentSourceResourceId=");
        return wv8.j(sb, this.contentSourceResourceId, ')');
    }

    public final void updateContentSourceResourceId$blazesdk_release(boolean isFollowedState) {
        int i;
        if (isFollowedState) {
            i = R.drawable.blaze_drawable_ic_following_icon;
        } else {
            BlazeMomentsPlayerFollowEntityChipContentSource blazeMomentsPlayerFollowEntityChipContentSource = this.contentSource;
            i = (blazeMomentsPlayerFollowEntityChipContentSource != BlazeMomentsPlayerFollowEntityChipContentSource.ICON && blazeMomentsPlayerFollowEntityChipContentSource == BlazeMomentsPlayerFollowEntityChipContentSource.TEXT) ? R.drawable.blaze_drawable_ic_unfollowed_text : R.drawable.blaze_drawable_ic_unfollowed_icon;
        }
        this.contentSourceResourceId = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeInt(this.backgroundColor);
        dest.writeInt(this.iconColor);
        this.contentSource.writeToParcel(dest, flags);
        dest.writeInt(this.contentSourceResourceId);
    }
}
