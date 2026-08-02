package com.blaze.blazesdk.style.widgets;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.style.shared.models.BlazeDp;
import com.blaze.blazesdk.utils.BlazeParcelable;
import com.ironsource.C4018c8;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import defpackage.b6a;
import defpackage.l1m;
import defpackage.l4a;
import defpackage.lnb;
import defpackage.s6a;
import defpackage.u0a;
import defpackage.wt3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0002\b+\b\u0087\b\u0018\u0000 ^2\u00020\u0001:\u0001_Bs\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b%\u0010\u001dJ\u0012\u0010&\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001fJ\u0012\u0010)\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b+\u0010\u001dJ\u0010\u0010,\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b,\u0010\u001fJ\u0010\u0010-\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u00100\u001a\u0004\u0018\u00010\u0007HÀ\u0003¢\u0006\u0004\b/\u0010$J\u0090\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b3\u0010$J\u0010\u00104\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b4\u0010\u001dJ\u001a\u00107\u001a\u00020\u00112\b\u00106\u001a\u0004\u0018\u000105HÖ\u0003¢\u0006\u0004\b7\u00108R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010\u001f\"\u0004\b;\u0010<R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u00109\u001a\u0004\b=\u0010\u001f\"\u0004\b>\u0010<R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010?\u001a\u0004\b@\u0010\"\"\u0004\bA\u0010BR$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010C\u001a\u0004\bD\u0010$\"\u0004\bE\u0010FR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010G\u001a\u0004\bH\u0010\u001d\"\u0004\bI\u0010JR$\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010K\u001a\u0004\bL\u0010'\"\u0004\bM\u0010NR\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u00109\u001a\u0004\bO\u0010\u001f\"\u0004\bP\u0010<R$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010Q\u001a\u0004\bR\u0010*\"\u0004\bS\u0010TR\"\u0010\u000f\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010G\u001a\u0004\bU\u0010\u001d\"\u0004\bV\u0010JR\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u00109\u001a\u0004\bW\u0010\u001f\"\u0004\bX\u0010<R\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010Y\u001a\u0004\b\u0012\u0010.\"\u0004\bZ\u0010[R$\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010C\u001a\u0004\b\\\u0010$\"\u0004\b]\u0010F¨\u0006`"}, d2 = {"Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemBadgeStateStyle;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", "Lcom/blaze/blazesdk/style/shared/models/BlazeDp;", "width", "height", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemTextStyle;", "textStyle", "", "text", "", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "backgroundImageResId", "cornerRadius", "", "cornerRadiusRatio", "borderColor", "borderWidth", "", C4018c8.k, "backgroundImageUrl", "<init>", "(Lcom/blaze/blazesdk/style/shared/models/BlazeDp;Lcom/blaze/blazesdk/style/shared/models/BlazeDp;Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemTextStyle;Ljava/lang/String;ILjava/lang/Integer;Lcom/blaze/blazesdk/style/shared/models/BlazeDp;Ljava/lang/Float;ILcom/blaze/blazesdk/style/shared/models/BlazeDp;ZLjava/lang/String;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/blaze/blazesdk/style/shared/models/BlazeDp;", "component2", "component3", "()Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemTextStyle;", "component4", "()Ljava/lang/String;", "component5", "component6", "()Ljava/lang/Integer;", "component7", "component8", "()Ljava/lang/Float;", "component9", "component10", "component11", "()Z", "component12$blazesdk_release", "component12", "copy", "(Lcom/blaze/blazesdk/style/shared/models/BlazeDp;Lcom/blaze/blazesdk/style/shared/models/BlazeDp;Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemTextStyle;Ljava/lang/String;ILjava/lang/Integer;Lcom/blaze/blazesdk/style/shared/models/BlazeDp;Ljava/lang/Float;ILcom/blaze/blazesdk/style/shared/models/BlazeDp;ZLjava/lang/String;)Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemBadgeStateStyle;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/blaze/blazesdk/style/shared/models/BlazeDp;", "getWidth", "setWidth", "(Lcom/blaze/blazesdk/style/shared/models/BlazeDp;)V", "getHeight", "setHeight", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemTextStyle;", "getTextStyle", "setTextStyle", "(Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemTextStyle;)V", "Ljava/lang/String;", "getText", "setText", "(Ljava/lang/String;)V", "I", "getBackgroundColor", "setBackgroundColor", "(I)V", "Ljava/lang/Integer;", "getBackgroundImageResId", "setBackgroundImageResId", "(Ljava/lang/Integer;)V", "getCornerRadius", "setCornerRadius", "Ljava/lang/Float;", "getCornerRadiusRatio", "setCornerRadiusRatio", "(Ljava/lang/Float;)V", "getBorderColor", "setBorderColor", "getBorderWidth", "setBorderWidth", "Z", "setVisible", "(Z)V", "getBackgroundImageUrl$blazesdk_release", "setBackgroundImageUrl$blazesdk_release", "Companion", "a", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlazeWidgetItemBadgeStateStyle implements BlazeParcelable {
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

    @NotNull
    private BlazeDp height;
    private boolean isVisible;

    @Nullable
    private String text;

    @NotNull
    private BlazeWidgetItemTextStyle textStyle;

    @NotNull
    private BlazeDp width;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazeWidgetItemBadgeStateStyle> CREATOR = new b();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.blaze.blazesdk.style.widgets.BlazeWidgetItemBadgeStateStyle$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static BlazeWidgetItemBadgeStateStyle a() {
            BlazeDp blazeDp = new BlazeDp(0);
            int i = l1m.h;
            BlazeDp blazeDp2 = new BlazeDp(0);
            return new BlazeWidgetItemBadgeStateStyle(new BlazeDp(24), new BlazeDp(24), new BlazeWidgetItemTextStyle(null, null, i, 11.0f, null, 1, 17), null, 0, null, blazeDp, Float.valueOf(0.5f), i, blazeDp2, true, null);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            Parcelable.Creator<BlazeDp> creator = BlazeDp.CREATOR;
            return new BlazeWidgetItemBadgeStateStyle(creator.createFromParcel(parcel), creator.createFromParcel(parcel), BlazeWidgetItemTextStyle.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), creator.createFromParcel(parcel), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null, parcel.readInt(), creator.createFromParcel(parcel), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazeWidgetItemBadgeStateStyle[i];
        }
    }

    public BlazeWidgetItemBadgeStateStyle(@NotNull BlazeDp blazeDp, @NotNull BlazeDp blazeDp2, @NotNull BlazeWidgetItemTextStyle blazeWidgetItemTextStyle, @Nullable String str, int i, @Nullable Integer num, @NotNull BlazeDp blazeDp3, @Nullable Float f, int i2, @NotNull BlazeDp blazeDp4, boolean z, @Nullable String str2) {
        blazeDp.getClass();
        blazeDp2.getClass();
        blazeWidgetItemTextStyle.getClass();
        blazeDp3.getClass();
        blazeDp4.getClass();
        this.width = blazeDp;
        this.height = blazeDp2;
        this.textStyle = blazeWidgetItemTextStyle;
        this.text = str;
        this.backgroundColor = i;
        this.backgroundImageResId = num;
        this.cornerRadius = blazeDp3;
        this.cornerRadiusRatio = f;
        this.borderColor = i2;
        this.borderWidth = blazeDp4;
        this.isVisible = z;
        this.backgroundImageUrl = str2;
    }

    public static /* synthetic */ BlazeWidgetItemBadgeStateStyle copy$default(BlazeWidgetItemBadgeStateStyle blazeWidgetItemBadgeStateStyle, BlazeDp blazeDp, BlazeDp blazeDp2, BlazeWidgetItemTextStyle blazeWidgetItemTextStyle, String str, int i, Integer num, BlazeDp blazeDp3, Float f, int i2, BlazeDp blazeDp4, boolean z, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            blazeDp = blazeWidgetItemBadgeStateStyle.width;
        }
        if ((i3 & 2) != 0) {
            blazeDp2 = blazeWidgetItemBadgeStateStyle.height;
        }
        if ((i3 & 4) != 0) {
            blazeWidgetItemTextStyle = blazeWidgetItemBadgeStateStyle.textStyle;
        }
        if ((i3 & 8) != 0) {
            str = blazeWidgetItemBadgeStateStyle.text;
        }
        if ((i3 & 16) != 0) {
            i = blazeWidgetItemBadgeStateStyle.backgroundColor;
        }
        if ((i3 & 32) != 0) {
            num = blazeWidgetItemBadgeStateStyle.backgroundImageResId;
        }
        if ((i3 & 64) != 0) {
            blazeDp3 = blazeWidgetItemBadgeStateStyle.cornerRadius;
        }
        if ((i3 & 128) != 0) {
            f = blazeWidgetItemBadgeStateStyle.cornerRadiusRatio;
        }
        if ((i3 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            i2 = blazeWidgetItemBadgeStateStyle.borderColor;
        }
        if ((i3 & 512) != 0) {
            blazeDp4 = blazeWidgetItemBadgeStateStyle.borderWidth;
        }
        if ((i3 & 1024) != 0) {
            z = blazeWidgetItemBadgeStateStyle.isVisible;
        }
        if ((i3 & com.ironsource.mediationsdk.metadata.a.o) != 0) {
            str2 = blazeWidgetItemBadgeStateStyle.backgroundImageUrl;
        }
        boolean z2 = z;
        String str3 = str2;
        int i4 = i2;
        BlazeDp blazeDp5 = blazeDp4;
        BlazeDp blazeDp6 = blazeDp3;
        Float f2 = f;
        int i5 = i;
        Integer num2 = num;
        return blazeWidgetItemBadgeStateStyle.copy(blazeDp, blazeDp2, blazeWidgetItemTextStyle, str, i5, num2, blazeDp6, f2, i4, blazeDp5, z2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final BlazeDp getWidth() {
        return this.width;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final BlazeDp getBorderWidth() {
        return this.borderWidth;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    @Nullable
    /* renamed from: component12$blazesdk_release, reason: from getter */
    public final String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final BlazeDp getHeight() {
        return this.height;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final BlazeWidgetItemTextStyle getTextStyle() {
        return this.textStyle;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component5, reason: from getter */
    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getBackgroundImageResId() {
        return this.backgroundImageResId;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final BlazeDp getCornerRadius() {
        return this.cornerRadius;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Float getCornerRadiusRatio() {
        return this.cornerRadiusRatio;
    }

    /* renamed from: component9, reason: from getter */
    public final int getBorderColor() {
        return this.borderColor;
    }

    @NotNull
    public final BlazeWidgetItemBadgeStateStyle copy(@NotNull BlazeDp width, @NotNull BlazeDp height, @NotNull BlazeWidgetItemTextStyle textStyle, @Nullable String text, int backgroundColor, @Nullable Integer backgroundImageResId, @NotNull BlazeDp cornerRadius, @Nullable Float cornerRadiusRatio, int borderColor, @NotNull BlazeDp borderWidth, boolean isVisible, @Nullable String backgroundImageUrl) {
        width.getClass();
        height.getClass();
        textStyle.getClass();
        cornerRadius.getClass();
        borderWidth.getClass();
        return new BlazeWidgetItemBadgeStateStyle(width, height, textStyle, text, backgroundColor, backgroundImageResId, cornerRadius, cornerRadiusRatio, borderColor, borderWidth, isVisible, backgroundImageUrl);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeWidgetItemBadgeStateStyle)) {
            return false;
        }
        BlazeWidgetItemBadgeStateStyle blazeWidgetItemBadgeStateStyle = (BlazeWidgetItemBadgeStateStyle) other;
        return Intrinsics.c(this.width, blazeWidgetItemBadgeStateStyle.width) && Intrinsics.c(this.height, blazeWidgetItemBadgeStateStyle.height) && Intrinsics.c(this.textStyle, blazeWidgetItemBadgeStateStyle.textStyle) && Intrinsics.c(this.text, blazeWidgetItemBadgeStateStyle.text) && this.backgroundColor == blazeWidgetItemBadgeStateStyle.backgroundColor && Intrinsics.c(this.backgroundImageResId, blazeWidgetItemBadgeStateStyle.backgroundImageResId) && Intrinsics.c(this.cornerRadius, blazeWidgetItemBadgeStateStyle.cornerRadius) && Intrinsics.c(this.cornerRadiusRatio, blazeWidgetItemBadgeStateStyle.cornerRadiusRatio) && this.borderColor == blazeWidgetItemBadgeStateStyle.borderColor && Intrinsics.c(this.borderWidth, blazeWidgetItemBadgeStateStyle.borderWidth) && this.isVisible == blazeWidgetItemBadgeStateStyle.isVisible && Intrinsics.c(this.backgroundImageUrl, blazeWidgetItemBadgeStateStyle.backgroundImageUrl);
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    @Nullable
    public final Integer getBackgroundImageResId() {
        return this.backgroundImageResId;
    }

    @Nullable
    public final String getBackgroundImageUrl$blazesdk_release() {
        return this.backgroundImageUrl;
    }

    public final int getBorderColor() {
        return this.borderColor;
    }

    @NotNull
    public final BlazeDp getBorderWidth() {
        return this.borderWidth;
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
    public final BlazeDp getHeight() {
        return this.height;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final BlazeWidgetItemTextStyle getTextStyle() {
        return this.textStyle;
    }

    @NotNull
    public final BlazeDp getWidth() {
        return this.width;
    }

    public int hashCode() {
        int hashCode = (this.textStyle.hashCode() + s6a.n(this.height, this.width.hashCode() * 31)) * 31;
        String str = this.text;
        int e = l4a.e(this.backgroundColor, (hashCode + (str == null ? 0 : str.hashCode())) * 31);
        Integer num = this.backgroundImageResId;
        int n = s6a.n(this.cornerRadius, (e + (num == null ? 0 : num.hashCode())) * 31);
        Float f = this.cornerRadiusRatio;
        int t = u0a.t(s6a.n(this.borderWidth, l4a.e(this.borderColor, (n + (f == null ? 0 : f.hashCode())) * 31)), this.isVisible);
        String str2 = this.backgroundImageUrl;
        return t + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public final void setBackgroundColor(int i) {
        this.backgroundColor = i;
    }

    public final void setBackgroundImageResId(@Nullable Integer num) {
        this.backgroundImageResId = num;
    }

    public final void setBackgroundImageUrl$blazesdk_release(@Nullable String str) {
        this.backgroundImageUrl = str;
    }

    public final void setBorderColor(int i) {
        this.borderColor = i;
    }

    public final void setBorderWidth(@NotNull BlazeDp blazeDp) {
        blazeDp.getClass();
        this.borderWidth = blazeDp;
    }

    public final void setCornerRadius(@NotNull BlazeDp blazeDp) {
        blazeDp.getClass();
        this.cornerRadius = blazeDp;
    }

    public final void setCornerRadiusRatio(@Nullable Float f) {
        this.cornerRadiusRatio = f;
    }

    public final void setHeight(@NotNull BlazeDp blazeDp) {
        blazeDp.getClass();
        this.height = blazeDp;
    }

    public final void setText(@Nullable String str) {
        this.text = str;
    }

    public final void setTextStyle(@NotNull BlazeWidgetItemTextStyle blazeWidgetItemTextStyle) {
        blazeWidgetItemTextStyle.getClass();
        this.textStyle = blazeWidgetItemTextStyle;
    }

    public final void setVisible(boolean z) {
        this.isVisible = z;
    }

    public final void setWidth(@NotNull BlazeDp blazeDp) {
        blazeDp.getClass();
        this.width = blazeDp;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("BlazeWidgetItemBadgeStateStyle(width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", textStyle=");
        sb.append(this.textStyle);
        sb.append(", text=");
        sb.append(this.text);
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
        sb.append(", isVisible=");
        sb.append(this.isVisible);
        sb.append(", backgroundImageUrl=");
        return lnb.q(sb, this.backgroundImageUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        this.width.writeToParcel(dest, flags);
        this.height.writeToParcel(dest, flags);
        this.textStyle.writeToParcel(dest, flags);
        dest.writeString(this.text);
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
        dest.writeInt(this.isVisible ? 1 : 0);
        dest.writeString(this.backgroundImageUrl);
    }
}
