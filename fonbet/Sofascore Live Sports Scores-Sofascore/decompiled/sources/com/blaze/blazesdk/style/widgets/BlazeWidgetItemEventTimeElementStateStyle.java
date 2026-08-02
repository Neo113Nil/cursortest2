package com.blaze.blazesdk.style.widgets;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.features.shared.models.ui_shared.BlazeLiveStreamStatus;
import com.blaze.blazesdk.style.shared.models.BlazeDp;
import com.blaze.blazesdk.utils.BlazeParcelable;
import com.blaze.blazesdk.widgets.contracts.BlazeWidgetTimeElementStateStyle;
import com.ironsource.C4018c8;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import defpackage.b6a;
import defpackage.l4a;
import defpackage.llf;
import defpackage.lnb;
import defpackage.s6a;
import defpackage.u0a;
import defpackage.wt3;
import defpackage.zzl;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b%\b\u0087\b\u0018\u0000 T2\u00020\u00012\u00020\u0002:\u0001UBY\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010\u001dJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b)\u0010\u001dJ\u0010\u0010*\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b*\u0010&J\u0012\u0010,\u001a\u0004\u0018\u00010\u0010HÀ\u0003¢\u0006\u0004\b+\u0010\u0015Jp\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b/\u0010\u0015J\u0010\u00100\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b0\u0010\u001dJ\u001a\u00103\u001a\u00020\u00052\b\u00102\u001a\u0004\u0018\u000101HÖ\u0003¢\u0006\u0004\b3\u00104R\"\u0010\u0004\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u00105\u001a\u0004\b6\u0010\u001f\"\u0004\b7\u00108R\"\u0010\u0006\u001a\u00020\u00058\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0006\u00109\u001a\u0004\b\u0006\u0010!\"\u0004\b:\u0010;R\"\u0010\b\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\b\u0010<\u001a\u0004\b=\u0010\u001d\"\u0004\b>\u0010?R$\u0010\t\u001a\u0004\u0018\u00010\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\t\u0010@\u001a\u0004\bA\u0010$\"\u0004\bB\u0010CR\"\u0010\u000b\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010D\u001a\u0004\bE\u0010&\"\u0004\bF\u0010GR$\u0010\r\u001a\u0004\u0018\u00010\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010H\u001a\u0004\bI\u0010(\"\u0004\bJ\u0010KR\"\u0010\u000e\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010<\u001a\u0004\bL\u0010\u001d\"\u0004\bM\u0010?R\"\u0010\u000f\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010D\u001a\u0004\bN\u0010&\"\u0004\bO\u0010GR$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010P\u001a\u0004\bQ\u0010\u0015\"\u0004\bR\u0010S¨\u0006V"}, d2 = {"Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemEventTimeElementStateStyle;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", "Lcom/blaze/blazesdk/widgets/contracts/BlazeWidgetTimeElementStateStyle;", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemTextStyle;", "textStyle", "", C4018c8.k, "", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "backgroundImageResId", "Lcom/blaze/blazesdk/style/shared/models/BlazeDp;", "cornerRadius", "", "cornerRadiusRatio", "borderColor", "borderWidth", "", "backgroundImageUrl", "<init>", "(Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemTextStyle;ZILjava/lang/Integer;Lcom/blaze/blazesdk/style/shared/models/BlazeDp;Ljava/lang/Float;ILcom/blaze/blazesdk/style/shared/models/BlazeDp;Ljava/lang/String;)V", "getBackgroundImageUrl", "()Ljava/lang/String;", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemTextStyle;", "component2", "()Z", "component3", "component4", "()Ljava/lang/Integer;", "component5", "()Lcom/blaze/blazesdk/style/shared/models/BlazeDp;", "component6", "()Ljava/lang/Float;", "component7", "component8", "component9$blazesdk_release", "component9", "copy", "(Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemTextStyle;ZILjava/lang/Integer;Lcom/blaze/blazesdk/style/shared/models/BlazeDp;Ljava/lang/Float;ILcom/blaze/blazesdk/style/shared/models/BlazeDp;Ljava/lang/String;)Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemEventTimeElementStateStyle;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemTextStyle;", "getTextStyle", "setTextStyle", "(Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemTextStyle;)V", "Z", "setVisible", "(Z)V", "I", "getBackgroundColor", "setBackgroundColor", "(I)V", "Ljava/lang/Integer;", "getBackgroundImageResId", "setBackgroundImageResId", "(Ljava/lang/Integer;)V", "Lcom/blaze/blazesdk/style/shared/models/BlazeDp;", "getCornerRadius", "setCornerRadius", "(Lcom/blaze/blazesdk/style/shared/models/BlazeDp;)V", "Ljava/lang/Float;", "getCornerRadiusRatio", "setCornerRadiusRatio", "(Ljava/lang/Float;)V", "getBorderColor", "setBorderColor", "getBorderWidth", "setBorderWidth", "Ljava/lang/String;", "getBackgroundImageUrl$blazesdk_release", "setBackgroundImageUrl$blazesdk_release", "(Ljava/lang/String;)V", "Companion", "a", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlazeWidgetItemEventTimeElementStateStyle implements BlazeParcelable, BlazeWidgetTimeElementStateStyle {
    private static final int LIVE_STREAM_CORNER_RADIUS_DP = 4;
    private int backgroundColor;

    @Nullable
    private Integer backgroundImageResId;

    @Nullable
    private String backgroundImageUrl;
    private int borderColor;

    @NotNull
    private BlazeDp borderWidth;

    @NotNull
    private BlazeDp cornerRadius;

    @Nullable
    private Float cornerRadiusRatio;
    private boolean isVisible;

    @NotNull
    private BlazeWidgetItemTextStyle textStyle;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazeWidgetItemEventTimeElementStateStyle> CREATOR = new b();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.blaze.blazesdk.style.widgets.BlazeWidgetItemEventTimeElementStateStyle$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static BlazeWidgetItemEventTimeElementStateStyle a(BlazeLiveStreamStatus blazeLiveStreamStatus) {
            boolean z = false;
            BlazeWidgetItemEventTimeElementStateStyle blazeWidgetItemEventTimeElementStateStyle = new BlazeWidgetItemEventTimeElementStateStyle(new BlazeWidgetItemTextStyle(null, null, -1, 11.0f, null, 1, 17), true, ((int) (llf.b(0.6f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f) * 255.0f)) << 24, null, new BlazeDp(8), null, -16777216, new BlazeDp(0), null);
            BlazeWidgetItemEventTimeElementStateStyle.INSTANCE.getClass();
            int i = a.a[blazeLiveStreamStatus.ordinal()];
            if (i == 1) {
                z = true;
            } else if (i != 2 && i != 3) {
                zzl.b();
                return null;
            }
            blazeWidgetItemEventTimeElementStateStyle.setVisible(z);
            blazeWidgetItemEventTimeElementStateStyle.setCornerRadius(new BlazeDp(4));
            blazeWidgetItemEventTimeElementStateStyle.setCornerRadiusRatio(null);
            return blazeWidgetItemEventTimeElementStateStyle;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            BlazeWidgetItemTextStyle createFromParcel = BlazeWidgetItemTextStyle.CREATOR.createFromParcel(parcel);
            boolean z = parcel.readInt() != 0;
            int readInt = parcel.readInt();
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Parcelable.Creator<BlazeDp> creator = BlazeDp.CREATOR;
            return new BlazeWidgetItemEventTimeElementStateStyle(createFromParcel, z, readInt, valueOf, creator.createFromParcel(parcel), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null, parcel.readInt(), creator.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazeWidgetItemEventTimeElementStateStyle[i];
        }
    }

    public BlazeWidgetItemEventTimeElementStateStyle(@NotNull BlazeWidgetItemTextStyle blazeWidgetItemTextStyle, boolean z, int i, @Nullable Integer num, @NotNull BlazeDp blazeDp, @Nullable Float f, int i2, @NotNull BlazeDp blazeDp2, @Nullable String str) {
        blazeWidgetItemTextStyle.getClass();
        blazeDp.getClass();
        blazeDp2.getClass();
        this.textStyle = blazeWidgetItemTextStyle;
        this.isVisible = z;
        this.backgroundColor = i;
        this.backgroundImageResId = num;
        this.cornerRadius = blazeDp;
        this.cornerRadiusRatio = f;
        this.borderColor = i2;
        this.borderWidth = blazeDp2;
        this.backgroundImageUrl = str;
    }

    public static /* synthetic */ BlazeWidgetItemEventTimeElementStateStyle copy$default(BlazeWidgetItemEventTimeElementStateStyle blazeWidgetItemEventTimeElementStateStyle, BlazeWidgetItemTextStyle blazeWidgetItemTextStyle, boolean z, int i, Integer num, BlazeDp blazeDp, Float f, int i2, BlazeDp blazeDp2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            blazeWidgetItemTextStyle = blazeWidgetItemEventTimeElementStateStyle.textStyle;
        }
        if ((i3 & 2) != 0) {
            z = blazeWidgetItemEventTimeElementStateStyle.isVisible;
        }
        if ((i3 & 4) != 0) {
            i = blazeWidgetItemEventTimeElementStateStyle.backgroundColor;
        }
        if ((i3 & 8) != 0) {
            num = blazeWidgetItemEventTimeElementStateStyle.backgroundImageResId;
        }
        if ((i3 & 16) != 0) {
            blazeDp = blazeWidgetItemEventTimeElementStateStyle.cornerRadius;
        }
        if ((i3 & 32) != 0) {
            f = blazeWidgetItemEventTimeElementStateStyle.cornerRadiusRatio;
        }
        if ((i3 & 64) != 0) {
            i2 = blazeWidgetItemEventTimeElementStateStyle.borderColor;
        }
        if ((i3 & 128) != 0) {
            blazeDp2 = blazeWidgetItemEventTimeElementStateStyle.borderWidth;
        }
        if ((i3 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            str = blazeWidgetItemEventTimeElementStateStyle.backgroundImageUrl;
        }
        BlazeDp blazeDp3 = blazeDp2;
        String str2 = str;
        Float f2 = f;
        int i4 = i2;
        BlazeDp blazeDp4 = blazeDp;
        int i5 = i;
        return blazeWidgetItemEventTimeElementStateStyle.copy(blazeWidgetItemTextStyle, z, i5, num, blazeDp4, f2, i4, blazeDp3, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final BlazeWidgetItemTextStyle getTextStyle() {
        return this.textStyle;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    /* renamed from: component3, reason: from getter */
    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getBackgroundImageResId() {
        return this.backgroundImageResId;
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

    /* renamed from: component7, reason: from getter */
    public final int getBorderColor() {
        return this.borderColor;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final BlazeDp getBorderWidth() {
        return this.borderWidth;
    }

    @Nullable
    /* renamed from: component9$blazesdk_release, reason: from getter */
    public final String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    @NotNull
    public final BlazeWidgetItemEventTimeElementStateStyle copy(@NotNull BlazeWidgetItemTextStyle textStyle, boolean isVisible, int backgroundColor, @Nullable Integer backgroundImageResId, @NotNull BlazeDp cornerRadius, @Nullable Float cornerRadiusRatio, int borderColor, @NotNull BlazeDp borderWidth, @Nullable String backgroundImageUrl) {
        textStyle.getClass();
        cornerRadius.getClass();
        borderWidth.getClass();
        return new BlazeWidgetItemEventTimeElementStateStyle(textStyle, isVisible, backgroundColor, backgroundImageResId, cornerRadius, cornerRadiusRatio, borderColor, borderWidth, backgroundImageUrl);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeWidgetItemEventTimeElementStateStyle)) {
            return false;
        }
        BlazeWidgetItemEventTimeElementStateStyle blazeWidgetItemEventTimeElementStateStyle = (BlazeWidgetItemEventTimeElementStateStyle) other;
        return Intrinsics.c(this.textStyle, blazeWidgetItemEventTimeElementStateStyle.textStyle) && this.isVisible == blazeWidgetItemEventTimeElementStateStyle.isVisible && this.backgroundColor == blazeWidgetItemEventTimeElementStateStyle.backgroundColor && Intrinsics.c(this.backgroundImageResId, blazeWidgetItemEventTimeElementStateStyle.backgroundImageResId) && Intrinsics.c(this.cornerRadius, blazeWidgetItemEventTimeElementStateStyle.cornerRadius) && Intrinsics.c(this.cornerRadiusRatio, blazeWidgetItemEventTimeElementStateStyle.cornerRadiusRatio) && this.borderColor == blazeWidgetItemEventTimeElementStateStyle.borderColor && Intrinsics.c(this.borderWidth, blazeWidgetItemEventTimeElementStateStyle.borderWidth) && Intrinsics.c(this.backgroundImageUrl, blazeWidgetItemEventTimeElementStateStyle.backgroundImageUrl);
    }

    @Override // com.blaze.blazesdk.widgets.contracts.BlazeWidgetTimeElementStateStyle
    public int getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // com.blaze.blazesdk.widgets.contracts.BlazeWidgetTimeElementStateStyle
    @Nullable
    public Integer getBackgroundImageResId() {
        return this.backgroundImageResId;
    }

    @Override // com.blaze.blazesdk.widgets.contracts.BlazeWidgetTimeElementStateStyle
    @Nullable
    public String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    @Nullable
    public final String getBackgroundImageUrl$blazesdk_release() {
        return this.backgroundImageUrl;
    }

    @Override // com.blaze.blazesdk.widgets.contracts.BlazeWidgetTimeElementStateStyle
    public int getBorderColor() {
        return this.borderColor;
    }

    @Override // com.blaze.blazesdk.widgets.contracts.BlazeWidgetTimeElementStateStyle
    @NotNull
    public BlazeDp getBorderWidth() {
        return this.borderWidth;
    }

    @Override // com.blaze.blazesdk.widgets.contracts.BlazeWidgetTimeElementStateStyle
    @NotNull
    public BlazeDp getCornerRadius() {
        return this.cornerRadius;
    }

    @Override // com.blaze.blazesdk.widgets.contracts.BlazeWidgetTimeElementStateStyle
    @Nullable
    public Float getCornerRadiusRatio() {
        return this.cornerRadiusRatio;
    }

    @Override // com.blaze.blazesdk.widgets.contracts.BlazeWidgetTimeElementStateStyle
    @NotNull
    public BlazeWidgetItemTextStyle getTextStyle() {
        return this.textStyle;
    }

    public int hashCode() {
        int e = l4a.e(this.backgroundColor, u0a.t(this.textStyle.hashCode() * 31, this.isVisible));
        Integer num = this.backgroundImageResId;
        int n = s6a.n(this.cornerRadius, (e + (num == null ? 0 : num.hashCode())) * 31);
        Float f = this.cornerRadiusRatio;
        int n2 = s6a.n(this.borderWidth, l4a.e(this.borderColor, (n + (f == null ? 0 : f.hashCode())) * 31));
        String str = this.backgroundImageUrl;
        return n2 + (str != null ? str.hashCode() : 0);
    }

    @Override // com.blaze.blazesdk.widgets.contracts.BlazeWidgetTimeElementStateStyle
    public boolean isVisible() {
        return this.isVisible;
    }

    @Override // com.blaze.blazesdk.widgets.contracts.BlazeWidgetTimeElementStateStyle
    public void setBackgroundColor(int i) {
        this.backgroundColor = i;
    }

    @Override // com.blaze.blazesdk.widgets.contracts.BlazeWidgetTimeElementStateStyle
    public void setBackgroundImageResId(@Nullable Integer num) {
        this.backgroundImageResId = num;
    }

    public final void setBackgroundImageUrl$blazesdk_release(@Nullable String str) {
        this.backgroundImageUrl = str;
    }

    @Override // com.blaze.blazesdk.widgets.contracts.BlazeWidgetTimeElementStateStyle
    public void setBorderColor(int i) {
        this.borderColor = i;
    }

    @Override // com.blaze.blazesdk.widgets.contracts.BlazeWidgetTimeElementStateStyle
    public void setBorderWidth(@NotNull BlazeDp blazeDp) {
        blazeDp.getClass();
        this.borderWidth = blazeDp;
    }

    @Override // com.blaze.blazesdk.widgets.contracts.BlazeWidgetTimeElementStateStyle
    public void setCornerRadius(@NotNull BlazeDp blazeDp) {
        blazeDp.getClass();
        this.cornerRadius = blazeDp;
    }

    @Override // com.blaze.blazesdk.widgets.contracts.BlazeWidgetTimeElementStateStyle
    public void setCornerRadiusRatio(@Nullable Float f) {
        this.cornerRadiusRatio = f;
    }

    @Override // com.blaze.blazesdk.widgets.contracts.BlazeWidgetTimeElementStateStyle
    public void setTextStyle(@NotNull BlazeWidgetItemTextStyle blazeWidgetItemTextStyle) {
        blazeWidgetItemTextStyle.getClass();
        this.textStyle = blazeWidgetItemTextStyle;
    }

    @Override // com.blaze.blazesdk.widgets.contracts.BlazeWidgetTimeElementStateStyle
    public void setVisible(boolean z) {
        this.isVisible = z;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("BlazeWidgetItemEventTimeElementStateStyle(textStyle=");
        sb.append(this.textStyle);
        sb.append(", isVisible=");
        sb.append(this.isVisible);
        sb.append(", backgroundColor=");
        sb.append(this.backgroundColor);
        sb.append(", backgroundImageResId=");
        sb.append(this.backgroundImageResId);
        sb.append(", cornerRadius=");
        sb.append(this.cornerRadius);
        sb.append(", cornerRadiusRatio=");
        sb.append(this.cornerRadiusRatio);
        sb.append(", borderColor=");
        sb.append(this.borderColor);
        sb.append(", borderWidth=");
        sb.append(this.borderWidth);
        sb.append(", backgroundImageUrl=");
        return lnb.q(sb, this.backgroundImageUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        this.textStyle.writeToParcel(dest, flags);
        dest.writeInt(this.isVisible ? 1 : 0);
        dest.writeInt(this.backgroundColor);
        Integer num = this.backgroundImageResId;
        if (num == null) {
            dest.writeInt(0);
        } else {
            b6a.h(dest, num);
        }
        this.cornerRadius.writeToParcel(dest, flags);
        Float f = this.cornerRadiusRatio;
        if (f == null) {
            dest.writeInt(0);
        } else {
            wt3.w(dest, 1, f);
        }
        dest.writeInt(this.borderColor);
        this.borderWidth.writeToParcel(dest, flags);
        dest.writeString(this.backgroundImageUrl);
    }
}
