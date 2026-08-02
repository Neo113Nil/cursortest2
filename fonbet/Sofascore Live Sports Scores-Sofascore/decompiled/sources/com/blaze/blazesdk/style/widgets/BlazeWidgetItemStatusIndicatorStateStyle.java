package com.blaze.blazesdk.style.widgets;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.features.shared.models.ui_shared.BlazeLiveStreamStatus;
import com.blaze.blazesdk.style.shared.models.BlazeDp;
import com.blaze.blazesdk.utils.BlazeParcelable;
import com.ironsource.C4018c8;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.sofascore.results.R;
import defpackage.b6a;
import defpackage.l1m;
import defpackage.l4a;
import defpackage.lnb;
import defpackage.o6a;
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
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0002\b+\b\u0087\b\u0018\u0000 _2\u00020\u0001:\u0001`Bk\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010\u001dJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b+\u0010\u001dJ\u0010\u0010,\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b,\u0010(J\u0012\u0010/\u001a\u0004\u0018\u00010\u0011HÀ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u00101\u001a\u0004\u0018\u00010\tHÀ\u0003¢\u0006\u0004\b0\u0010&J\u0086\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b4\u0010&J\u0010\u00105\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b5\u0010\u001dJ\u001a\u00108\u001a\u00020\u00042\b\u00107\u001a\u0004\u0018\u000106HÖ\u0003¢\u0006\u0004\b8\u00109R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010:\u001a\u0004\b;\u0010\u001f\"\u0004\b<\u0010=R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010>\u001a\u0004\b\u0005\u0010!\"\u0004\b?\u0010@R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010A\u001a\u0004\bB\u0010\u001d\"\u0004\bC\u0010DR$\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010E\u001a\u0004\bF\u0010$\"\u0004\bG\u0010HR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010I\u001a\u0004\bJ\u0010&\"\u0004\bK\u0010LR\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010M\u001a\u0004\bN\u0010(\"\u0004\bO\u0010PR$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010Q\u001a\u0004\bR\u0010*\"\u0004\bS\u0010TR\"\u0010\u000f\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010A\u001a\u0004\bU\u0010\u001d\"\u0004\bV\u0010DR\"\u0010\u0010\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010M\u001a\u0004\bW\u0010(\"\u0004\bX\u0010PR$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010Y\u001a\u0004\bZ\u0010.\"\u0004\b[\u0010\\R$\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010I\u001a\u0004\b]\u0010&\"\u0004\b^\u0010L¨\u0006a"}, d2 = {"Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemStatusIndicatorStateStyle;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemTextStyle;", "textStyle", "", C4018c8.k, "", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "backgroundImageResId", "", "text", "Lcom/blaze/blazesdk/style/shared/models/BlazeDp;", "cornerRadius", "", "cornerRadiusRatio", "borderColor", "borderWidth", "Lcom/blaze/blazesdk/style/widgets/c;", "icon", "backgroundImageUrl", "<init>", "(Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemTextStyle;ZILjava/lang/Integer;Ljava/lang/String;Lcom/blaze/blazesdk/style/shared/models/BlazeDp;Ljava/lang/Float;ILcom/blaze/blazesdk/style/shared/models/BlazeDp;Lcom/blaze/blazesdk/style/widgets/c;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemTextStyle;", "component2", "()Z", "component3", "component4", "()Ljava/lang/Integer;", "component5", "()Ljava/lang/String;", "component6", "()Lcom/blaze/blazesdk/style/shared/models/BlazeDp;", "component7", "()Ljava/lang/Float;", "component8", "component9", "component10$blazesdk_release", "()Lcom/blaze/blazesdk/style/widgets/c;", "component10", "component11$blazesdk_release", "component11", "copy", "(Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemTextStyle;ZILjava/lang/Integer;Ljava/lang/String;Lcom/blaze/blazesdk/style/shared/models/BlazeDp;Ljava/lang/Float;ILcom/blaze/blazesdk/style/shared/models/BlazeDp;Lcom/blaze/blazesdk/style/widgets/c;Ljava/lang/String;)Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemStatusIndicatorStateStyle;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemTextStyle;", "getTextStyle", "setTextStyle", "(Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemTextStyle;)V", "Z", "setVisible", "(Z)V", "I", "getBackgroundColor", "setBackgroundColor", "(I)V", "Ljava/lang/Integer;", "getBackgroundImageResId", "setBackgroundImageResId", "(Ljava/lang/Integer;)V", "Ljava/lang/String;", "getText", "setText", "(Ljava/lang/String;)V", "Lcom/blaze/blazesdk/style/shared/models/BlazeDp;", "getCornerRadius", "setCornerRadius", "(Lcom/blaze/blazesdk/style/shared/models/BlazeDp;)V", "Ljava/lang/Float;", "getCornerRadiusRatio", "setCornerRadiusRatio", "(Ljava/lang/Float;)V", "getBorderColor", "setBorderColor", "getBorderWidth", "setBorderWidth", "Lcom/blaze/blazesdk/style/widgets/c;", "getIcon$blazesdk_release", "setIcon$blazesdk_release", "(Lcom/blaze/blazesdk/style/widgets/c;)V", "getBackgroundImageUrl$blazesdk_release", "setBackgroundImageUrl$blazesdk_release", "Companion", "a", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlazeWidgetItemStatusIndicatorStateStyle implements BlazeParcelable {
    private static final int LIVE_STREAM_CORNER_RADIUS_DP = 4;
    private static final float LIVE_STREAM_TEXT_SIZE_SP = 12.0f;
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

    @Nullable
    private c icon;
    private boolean isVisible;

    @NotNull
    private String text;

    @NotNull
    private BlazeWidgetItemTextStyle textStyle;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazeWidgetItemStatusIndicatorStateStyle> CREATOR = new b();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.blaze.blazesdk.style.widgets.BlazeWidgetItemStatusIndicatorStateStyle$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static BlazeWidgetItemStatusIndicatorStateStyle a() {
            return new BlazeWidgetItemStatusIndicatorStateStyle(new BlazeWidgetItemTextStyle(null, null, -1, 11.0f, null, 1, 17), true, 0, null, "", new BlazeDp(0), Float.valueOf(0.5f), l1m.h, new BlazeDp(0), null, null);
        }

        public static BlazeWidgetItemStatusIndicatorStateStyle b(BlazeLiveStreamStatus blazeLiveStreamStatus) {
            int i;
            String str;
            c cVar;
            int i2;
            BlazeWidgetItemStatusIndicatorStateStyle a = a();
            BlazeWidgetItemStatusIndicatorStateStyle.INSTANCE.getClass();
            int[] iArr = com.blaze.blazesdk.style.widgets.b.a;
            int i3 = iArr[blazeLiveStreamStatus.ordinal()];
            if (i3 == 1) {
                i = l1m.n;
            } else if (i3 == 2) {
                i = l1m.m;
            } else {
                if (i3 != 3) {
                    zzl.b();
                    return null;
                }
                i = l1m.o;
            }
            a.setBackgroundColor(i);
            int i4 = iArr[blazeLiveStreamStatus.ordinal()];
            if (i4 == 1) {
                str = "LIVE";
            } else if (i4 == 2) {
                str = "UPCOMING";
            } else {
                if (i4 != 3) {
                    zzl.b();
                    return null;
                }
                str = "ENDED";
            }
            a.setText(str);
            a.setCornerRadius(new BlazeDp(4));
            a.setCornerRadiusRatio(null);
            int i5 = iArr[blazeLiveStreamStatus.ordinal()];
            if (i5 == 1) {
                cVar = new c(R.drawable.blaze_drawable_ic_live_stream_dot, Integer.valueOf(l1m.q));
            } else {
                if (i5 != 2 && i5 != 3) {
                    zzl.b();
                    return null;
                }
                cVar = null;
            }
            a.setIcon$blazesdk_release(cVar);
            BlazeWidgetItemTextStyle textStyle = a.getTextStyle();
            int i6 = iArr[blazeLiveStreamStatus.ordinal()];
            if (i6 == 1) {
                i2 = l1m.q;
            } else if (i6 == 2) {
                i2 = l1m.p;
            } else {
                if (i6 != 3) {
                    zzl.b();
                    return null;
                }
                i2 = l1m.r;
            }
            textStyle.setTextColor(i2);
            textStyle.setTextSize(BlazeWidgetItemStatusIndicatorStateStyle.LIVE_STREAM_TEXT_SIZE_SP);
            return a;
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
            String readString = parcel.readString();
            Parcelable.Creator<BlazeDp> creator = BlazeDp.CREATOR;
            return new BlazeWidgetItemStatusIndicatorStateStyle(createFromParcel, z, readInt, valueOf, readString, creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt(), creator.createFromParcel(parcel), parcel.readInt() != 0 ? c.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazeWidgetItemStatusIndicatorStateStyle[i];
        }
    }

    public BlazeWidgetItemStatusIndicatorStateStyle(@NotNull BlazeWidgetItemTextStyle blazeWidgetItemTextStyle, boolean z, int i, @Nullable Integer num, @NotNull String str, @NotNull BlazeDp blazeDp, @Nullable Float f, int i2, @NotNull BlazeDp blazeDp2, @Nullable c cVar, @Nullable String str2) {
        blazeWidgetItemTextStyle.getClass();
        str.getClass();
        blazeDp.getClass();
        blazeDp2.getClass();
        this.textStyle = blazeWidgetItemTextStyle;
        this.isVisible = z;
        this.backgroundColor = i;
        this.backgroundImageResId = num;
        this.text = str;
        this.cornerRadius = blazeDp;
        this.cornerRadiusRatio = f;
        this.borderColor = i2;
        this.borderWidth = blazeDp2;
        this.icon = cVar;
        this.backgroundImageUrl = str2;
    }

    public static /* synthetic */ BlazeWidgetItemStatusIndicatorStateStyle copy$default(BlazeWidgetItemStatusIndicatorStateStyle blazeWidgetItemStatusIndicatorStateStyle, BlazeWidgetItemTextStyle blazeWidgetItemTextStyle, boolean z, int i, Integer num, String str, BlazeDp blazeDp, Float f, int i2, BlazeDp blazeDp2, c cVar, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            blazeWidgetItemTextStyle = blazeWidgetItemStatusIndicatorStateStyle.textStyle;
        }
        if ((i3 & 2) != 0) {
            z = blazeWidgetItemStatusIndicatorStateStyle.isVisible;
        }
        if ((i3 & 4) != 0) {
            i = blazeWidgetItemStatusIndicatorStateStyle.backgroundColor;
        }
        if ((i3 & 8) != 0) {
            num = blazeWidgetItemStatusIndicatorStateStyle.backgroundImageResId;
        }
        if ((i3 & 16) != 0) {
            str = blazeWidgetItemStatusIndicatorStateStyle.text;
        }
        if ((i3 & 32) != 0) {
            blazeDp = blazeWidgetItemStatusIndicatorStateStyle.cornerRadius;
        }
        if ((i3 & 64) != 0) {
            f = blazeWidgetItemStatusIndicatorStateStyle.cornerRadiusRatio;
        }
        if ((i3 & 128) != 0) {
            i2 = blazeWidgetItemStatusIndicatorStateStyle.borderColor;
        }
        if ((i3 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            blazeDp2 = blazeWidgetItemStatusIndicatorStateStyle.borderWidth;
        }
        if ((i3 & 512) != 0) {
            cVar = blazeWidgetItemStatusIndicatorStateStyle.icon;
        }
        if ((i3 & 1024) != 0) {
            str2 = blazeWidgetItemStatusIndicatorStateStyle.backgroundImageUrl;
        }
        c cVar2 = cVar;
        String str3 = str2;
        int i4 = i2;
        BlazeDp blazeDp3 = blazeDp2;
        BlazeDp blazeDp4 = blazeDp;
        Float f2 = f;
        String str4 = str;
        int i5 = i;
        return blazeWidgetItemStatusIndicatorStateStyle.copy(blazeWidgetItemTextStyle, z, i5, num, str4, blazeDp4, f2, i4, blazeDp3, cVar2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final BlazeWidgetItemTextStyle getTextStyle() {
        return this.textStyle;
    }

    @Nullable
    /* renamed from: component10$blazesdk_release, reason: from getter */
    public final c getIcon() {
        return this.icon;
    }

    @Nullable
    /* renamed from: component11$blazesdk_release, reason: from getter */
    public final String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
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
    public final String getText() {
        return this.text;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final BlazeDp getCornerRadius() {
        return this.cornerRadius;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Float getCornerRadiusRatio() {
        return this.cornerRadiusRatio;
    }

    /* renamed from: component8, reason: from getter */
    public final int getBorderColor() {
        return this.borderColor;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final BlazeDp getBorderWidth() {
        return this.borderWidth;
    }

    @NotNull
    public final BlazeWidgetItemStatusIndicatorStateStyle copy(@NotNull BlazeWidgetItemTextStyle textStyle, boolean isVisible, int backgroundColor, @Nullable Integer backgroundImageResId, @NotNull String text, @NotNull BlazeDp cornerRadius, @Nullable Float cornerRadiusRatio, int borderColor, @NotNull BlazeDp borderWidth, @Nullable c icon, @Nullable String backgroundImageUrl) {
        textStyle.getClass();
        text.getClass();
        cornerRadius.getClass();
        borderWidth.getClass();
        return new BlazeWidgetItemStatusIndicatorStateStyle(textStyle, isVisible, backgroundColor, backgroundImageResId, text, cornerRadius, cornerRadiusRatio, borderColor, borderWidth, icon, backgroundImageUrl);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeWidgetItemStatusIndicatorStateStyle)) {
            return false;
        }
        BlazeWidgetItemStatusIndicatorStateStyle blazeWidgetItemStatusIndicatorStateStyle = (BlazeWidgetItemStatusIndicatorStateStyle) other;
        return Intrinsics.c(this.textStyle, blazeWidgetItemStatusIndicatorStateStyle.textStyle) && this.isVisible == blazeWidgetItemStatusIndicatorStateStyle.isVisible && this.backgroundColor == blazeWidgetItemStatusIndicatorStateStyle.backgroundColor && Intrinsics.c(this.backgroundImageResId, blazeWidgetItemStatusIndicatorStateStyle.backgroundImageResId) && Intrinsics.c(this.text, blazeWidgetItemStatusIndicatorStateStyle.text) && Intrinsics.c(this.cornerRadius, blazeWidgetItemStatusIndicatorStateStyle.cornerRadius) && Intrinsics.c(this.cornerRadiusRatio, blazeWidgetItemStatusIndicatorStateStyle.cornerRadiusRatio) && this.borderColor == blazeWidgetItemStatusIndicatorStateStyle.borderColor && Intrinsics.c(this.borderWidth, blazeWidgetItemStatusIndicatorStateStyle.borderWidth) && Intrinsics.c(this.icon, blazeWidgetItemStatusIndicatorStateStyle.icon) && Intrinsics.c(this.backgroundImageUrl, blazeWidgetItemStatusIndicatorStateStyle.backgroundImageUrl);
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

    @Nullable
    public final c getIcon$blazesdk_release() {
        return this.icon;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final BlazeWidgetItemTextStyle getTextStyle() {
        return this.textStyle;
    }

    public int hashCode() {
        int e = l4a.e(this.backgroundColor, u0a.t(this.textStyle.hashCode() * 31, this.isVisible));
        Integer num = this.backgroundImageResId;
        int n = s6a.n(this.cornerRadius, o6a.k(this.text, (e + (num == null ? 0 : num.hashCode())) * 31));
        Float f = this.cornerRadiusRatio;
        int n2 = s6a.n(this.borderWidth, l4a.e(this.borderColor, (n + (f == null ? 0 : f.hashCode())) * 31));
        c cVar = this.icon;
        int hashCode = (n2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        String str = this.backgroundImageUrl;
        return hashCode + (str != null ? str.hashCode() : 0);
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

    public final void setIcon$blazesdk_release(@Nullable c cVar) {
        this.icon = cVar;
    }

    public final void setText(@NotNull String str) {
        str.getClass();
        this.text = str;
    }

    public final void setTextStyle(@NotNull BlazeWidgetItemTextStyle blazeWidgetItemTextStyle) {
        blazeWidgetItemTextStyle.getClass();
        this.textStyle = blazeWidgetItemTextStyle;
    }

    public final void setVisible(boolean z) {
        this.isVisible = z;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("BlazeWidgetItemStatusIndicatorStateStyle(textStyle=");
        sb.append(this.textStyle);
        sb.append(", isVisible=");
        sb.append(this.isVisible);
        sb.append(", backgroundColor=");
        sb.append(this.backgroundColor);
        sb.append(", backgroundImageResId=");
        sb.append(this.backgroundImageResId);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", cornerRadius=");
        sb.append(this.cornerRadius);
        sb.append(", cornerRadiusRatio=");
        sb.append(this.cornerRadiusRatio);
        sb.append(", borderColor=");
        sb.append(this.borderColor);
        sb.append(", borderWidth=");
        sb.append(this.borderWidth);
        sb.append(", icon=");
        sb.append(this.icon);
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
        dest.writeString(this.text);
        this.cornerRadius.writeToParcel(dest, flags);
        Float f = this.cornerRadiusRatio;
        if (f == null) {
            dest.writeInt(0);
        } else {
            wt3.w(dest, 1, f);
        }
        dest.writeInt(this.borderColor);
        this.borderWidth.writeToParcel(dest, flags);
        c cVar = this.icon;
        if (cVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cVar.writeToParcel(dest, flags);
        }
        dest.writeString(this.backgroundImageUrl);
    }
}
