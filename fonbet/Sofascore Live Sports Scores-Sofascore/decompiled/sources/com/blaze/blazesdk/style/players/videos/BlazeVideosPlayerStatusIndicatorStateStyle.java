package com.blaze.blazesdk.style.players.videos;

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
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b)\b\u0087\b\u0018\u0000 Z2\u00020\u0001:\u0001[Ba\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b*\u0010\u001cJ\u0010\u0010+\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b+\u0010'J\u0012\u0010.\u001a\u0004\u0018\u00010\u0011HÀ\u0003¢\u0006\u0004\b,\u0010-Jz\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b1\u0010%J\u0010\u00102\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b2\u0010\u001cJ\u001a\u00105\u001a\u00020\u00042\b\u00104\u001a\u0004\u0018\u000103HÖ\u0003¢\u0006\u0004\b5\u00106R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u00107\u001a\u0004\b8\u0010\u001e\"\u0004\b9\u0010:R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010;\u001a\u0004\b\u0005\u0010 \"\u0004\b<\u0010=R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010>\u001a\u0004\b?\u0010\u001c\"\u0004\b@\u0010AR$\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010B\u001a\u0004\bC\u0010#\"\u0004\bD\u0010ER\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010F\u001a\u0004\bG\u0010%\"\u0004\bH\u0010IR\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010J\u001a\u0004\bK\u0010'\"\u0004\bL\u0010MR$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010N\u001a\u0004\bO\u0010)\"\u0004\bP\u0010QR\"\u0010\u000f\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010>\u001a\u0004\bR\u0010\u001c\"\u0004\bS\u0010AR\"\u0010\u0010\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010J\u001a\u0004\bT\u0010'\"\u0004\bU\u0010MR$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010V\u001a\u0004\bW\u0010-\"\u0004\bX\u0010Y¨\u0006\\"}, d2 = {"Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerStatusIndicatorStateStyle;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", "Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerTextStyle;", "textStyle", "", C4018c8.k, "", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "backgroundImageResId", "", "text", "Lcom/blaze/blazesdk/style/shared/models/BlazeDp;", "cornerRadius", "", "cornerRadiusRatio", "borderColor", "borderWidth", "Lcom/blaze/blazesdk/style/players/videos/c;", "icon", "<init>", "(Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerTextStyle;ZILjava/lang/Integer;Ljava/lang/String;Lcom/blaze/blazesdk/style/shared/models/BlazeDp;Ljava/lang/Float;ILcom/blaze/blazesdk/style/shared/models/BlazeDp;Lcom/blaze/blazesdk/style/players/videos/c;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerTextStyle;", "component2", "()Z", "component3", "component4", "()Ljava/lang/Integer;", "component5", "()Ljava/lang/String;", "component6", "()Lcom/blaze/blazesdk/style/shared/models/BlazeDp;", "component7", "()Ljava/lang/Float;", "component8", "component9", "component10$blazesdk_release", "()Lcom/blaze/blazesdk/style/players/videos/c;", "component10", "copy", "(Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerTextStyle;ZILjava/lang/Integer;Ljava/lang/String;Lcom/blaze/blazesdk/style/shared/models/BlazeDp;Ljava/lang/Float;ILcom/blaze/blazesdk/style/shared/models/BlazeDp;Lcom/blaze/blazesdk/style/players/videos/c;)Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerStatusIndicatorStateStyle;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerTextStyle;", "getTextStyle", "setTextStyle", "(Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerTextStyle;)V", "Z", "setVisible", "(Z)V", "I", "getBackgroundColor", "setBackgroundColor", "(I)V", "Ljava/lang/Integer;", "getBackgroundImageResId", "setBackgroundImageResId", "(Ljava/lang/Integer;)V", "Ljava/lang/String;", "getText", "setText", "(Ljava/lang/String;)V", "Lcom/blaze/blazesdk/style/shared/models/BlazeDp;", "getCornerRadius", "setCornerRadius", "(Lcom/blaze/blazesdk/style/shared/models/BlazeDp;)V", "Ljava/lang/Float;", "getCornerRadiusRatio", "setCornerRadiusRatio", "(Ljava/lang/Float;)V", "getBorderColor", "setBorderColor", "getBorderWidth", "setBorderWidth", "Lcom/blaze/blazesdk/style/players/videos/c;", "getIcon$blazesdk_release", "setIcon$blazesdk_release", "(Lcom/blaze/blazesdk/style/players/videos/c;)V", "Companion", "a", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlazeVideosPlayerStatusIndicatorStateStyle implements BlazeParcelable {
    private static final int LIVE_STREAM_CORNER_RADIUS_DP = 4;
    private static final float LIVE_STREAM_TEXT_SIZE_SP = 12.0f;
    private int backgroundColor;

    @Nullable
    private Integer backgroundImageResId;
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
    private BlazeVideosPlayerTextStyle textStyle;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazeVideosPlayerStatusIndicatorStateStyle> CREATOR = new b();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerStatusIndicatorStateStyle$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static BlazeVideosPlayerStatusIndicatorStateStyle a(BlazeLiveStreamStatus blazeLiveStreamStatus) {
            int i;
            String str;
            int i2;
            c cVar = null;
            BlazeVideosPlayerStatusIndicatorStateStyle blazeVideosPlayerStatusIndicatorStateStyle = new BlazeVideosPlayerStatusIndicatorStateStyle(new BlazeVideosPlayerTextStyle(BlazeVideosPlayerStatusIndicatorStateStyle.LIVE_STREAM_TEXT_SIZE_SP, -1, null), true, 0, null, "", new BlazeDp(0), Float.valueOf(0.5f), l1m.h, new BlazeDp(0), null);
            BlazeVideosPlayerStatusIndicatorStateStyle.INSTANCE.getClass();
            int[] iArr = com.blaze.blazesdk.style.players.videos.b.a;
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
            blazeVideosPlayerStatusIndicatorStateStyle.setBackgroundColor(i);
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
            blazeVideosPlayerStatusIndicatorStateStyle.setText(str);
            BlazeVideosPlayerTextStyle textStyle = blazeVideosPlayerStatusIndicatorStateStyle.getTextStyle();
            int i5 = iArr[blazeLiveStreamStatus.ordinal()];
            if (i5 == 1) {
                i2 = l1m.q;
            } else if (i5 == 2) {
                i2 = l1m.p;
            } else {
                if (i5 != 3) {
                    zzl.b();
                    return null;
                }
                i2 = l1m.r;
            }
            textStyle.setTextColor(i2);
            blazeVideosPlayerStatusIndicatorStateStyle.setCornerRadius(new BlazeDp(4));
            blazeVideosPlayerStatusIndicatorStateStyle.setCornerRadiusRatio(null);
            int i6 = iArr[blazeLiveStreamStatus.ordinal()];
            if (i6 == 1) {
                cVar = new c(R.drawable.blaze_drawable_ic_live_stream_dot, Integer.valueOf(l1m.q));
            } else if (i6 != 2 && i6 != 3) {
                zzl.b();
                return null;
            }
            blazeVideosPlayerStatusIndicatorStateStyle.setIcon$blazesdk_release(cVar);
            return blazeVideosPlayerStatusIndicatorStateStyle;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            BlazeVideosPlayerTextStyle createFromParcel = BlazeVideosPlayerTextStyle.CREATOR.createFromParcel(parcel);
            boolean z = parcel.readInt() != 0;
            int readInt = parcel.readInt();
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString = parcel.readString();
            Parcelable.Creator<BlazeDp> creator = BlazeDp.CREATOR;
            return new BlazeVideosPlayerStatusIndicatorStateStyle(createFromParcel, z, readInt, valueOf, readString, creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt(), creator.createFromParcel(parcel), parcel.readInt() != 0 ? c.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazeVideosPlayerStatusIndicatorStateStyle[i];
        }
    }

    public BlazeVideosPlayerStatusIndicatorStateStyle(@NotNull BlazeVideosPlayerTextStyle blazeVideosPlayerTextStyle, boolean z, int i, @Nullable Integer num, @NotNull String str, @NotNull BlazeDp blazeDp, @Nullable Float f, int i2, @NotNull BlazeDp blazeDp2, @Nullable c cVar) {
        blazeVideosPlayerTextStyle.getClass();
        str.getClass();
        blazeDp.getClass();
        blazeDp2.getClass();
        this.textStyle = blazeVideosPlayerTextStyle;
        this.isVisible = z;
        this.backgroundColor = i;
        this.backgroundImageResId = num;
        this.text = str;
        this.cornerRadius = blazeDp;
        this.cornerRadiusRatio = f;
        this.borderColor = i2;
        this.borderWidth = blazeDp2;
        this.icon = cVar;
    }

    public static /* synthetic */ BlazeVideosPlayerStatusIndicatorStateStyle copy$default(BlazeVideosPlayerStatusIndicatorStateStyle blazeVideosPlayerStatusIndicatorStateStyle, BlazeVideosPlayerTextStyle blazeVideosPlayerTextStyle, boolean z, int i, Integer num, String str, BlazeDp blazeDp, Float f, int i2, BlazeDp blazeDp2, c cVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            blazeVideosPlayerTextStyle = blazeVideosPlayerStatusIndicatorStateStyle.textStyle;
        }
        if ((i3 & 2) != 0) {
            z = blazeVideosPlayerStatusIndicatorStateStyle.isVisible;
        }
        if ((i3 & 4) != 0) {
            i = blazeVideosPlayerStatusIndicatorStateStyle.backgroundColor;
        }
        if ((i3 & 8) != 0) {
            num = blazeVideosPlayerStatusIndicatorStateStyle.backgroundImageResId;
        }
        if ((i3 & 16) != 0) {
            str = blazeVideosPlayerStatusIndicatorStateStyle.text;
        }
        if ((i3 & 32) != 0) {
            blazeDp = blazeVideosPlayerStatusIndicatorStateStyle.cornerRadius;
        }
        if ((i3 & 64) != 0) {
            f = blazeVideosPlayerStatusIndicatorStateStyle.cornerRadiusRatio;
        }
        if ((i3 & 128) != 0) {
            i2 = blazeVideosPlayerStatusIndicatorStateStyle.borderColor;
        }
        if ((i3 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            blazeDp2 = blazeVideosPlayerStatusIndicatorStateStyle.borderWidth;
        }
        if ((i3 & 512) != 0) {
            cVar = blazeVideosPlayerStatusIndicatorStateStyle.icon;
        }
        BlazeDp blazeDp3 = blazeDp2;
        c cVar2 = cVar;
        Float f2 = f;
        int i4 = i2;
        String str2 = str;
        BlazeDp blazeDp4 = blazeDp;
        return blazeVideosPlayerStatusIndicatorStateStyle.copy(blazeVideosPlayerTextStyle, z, i, num, str2, blazeDp4, f2, i4, blazeDp3, cVar2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final BlazeVideosPlayerTextStyle getTextStyle() {
        return this.textStyle;
    }

    @Nullable
    /* renamed from: component10$blazesdk_release, reason: from getter */
    public final c getIcon() {
        return this.icon;
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
    public final BlazeVideosPlayerStatusIndicatorStateStyle copy(@NotNull BlazeVideosPlayerTextStyle textStyle, boolean isVisible, int backgroundColor, @Nullable Integer backgroundImageResId, @NotNull String text, @NotNull BlazeDp cornerRadius, @Nullable Float cornerRadiusRatio, int borderColor, @NotNull BlazeDp borderWidth, @Nullable c icon) {
        textStyle.getClass();
        text.getClass();
        cornerRadius.getClass();
        borderWidth.getClass();
        return new BlazeVideosPlayerStatusIndicatorStateStyle(textStyle, isVisible, backgroundColor, backgroundImageResId, text, cornerRadius, cornerRadiusRatio, borderColor, borderWidth, icon);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeVideosPlayerStatusIndicatorStateStyle)) {
            return false;
        }
        BlazeVideosPlayerStatusIndicatorStateStyle blazeVideosPlayerStatusIndicatorStateStyle = (BlazeVideosPlayerStatusIndicatorStateStyle) other;
        return Intrinsics.c(this.textStyle, blazeVideosPlayerStatusIndicatorStateStyle.textStyle) && this.isVisible == blazeVideosPlayerStatusIndicatorStateStyle.isVisible && this.backgroundColor == blazeVideosPlayerStatusIndicatorStateStyle.backgroundColor && Intrinsics.c(this.backgroundImageResId, blazeVideosPlayerStatusIndicatorStateStyle.backgroundImageResId) && Intrinsics.c(this.text, blazeVideosPlayerStatusIndicatorStateStyle.text) && Intrinsics.c(this.cornerRadius, blazeVideosPlayerStatusIndicatorStateStyle.cornerRadius) && Intrinsics.c(this.cornerRadiusRatio, blazeVideosPlayerStatusIndicatorStateStyle.cornerRadiusRatio) && this.borderColor == blazeVideosPlayerStatusIndicatorStateStyle.borderColor && Intrinsics.c(this.borderWidth, blazeVideosPlayerStatusIndicatorStateStyle.borderWidth) && Intrinsics.c(this.icon, blazeVideosPlayerStatusIndicatorStateStyle.icon);
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    @Nullable
    public final Integer getBackgroundImageResId() {
        return this.backgroundImageResId;
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
    public final BlazeVideosPlayerTextStyle getTextStyle() {
        return this.textStyle;
    }

    public int hashCode() {
        int e = l4a.e(this.backgroundColor, u0a.t(this.textStyle.hashCode() * 31, this.isVisible));
        Integer num = this.backgroundImageResId;
        int n = s6a.n(this.cornerRadius, o6a.k(this.text, (e + (num == null ? 0 : num.hashCode())) * 31));
        Float f = this.cornerRadiusRatio;
        int n2 = s6a.n(this.borderWidth, l4a.e(this.borderColor, (n + (f == null ? 0 : f.hashCode())) * 31));
        c cVar = this.icon;
        return n2 + (cVar != null ? cVar.hashCode() : 0);
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

    public final void setTextStyle(@NotNull BlazeVideosPlayerTextStyle blazeVideosPlayerTextStyle) {
        blazeVideosPlayerTextStyle.getClass();
        this.textStyle = blazeVideosPlayerTextStyle;
    }

    public final void setVisible(boolean z) {
        this.isVisible = z;
    }

    @NotNull
    public String toString() {
        return "BlazeVideosPlayerStatusIndicatorStateStyle(textStyle=" + this.textStyle + ", isVisible=" + this.isVisible + ", backgroundColor=" + this.backgroundColor + ", backgroundImageResId=" + this.backgroundImageResId + ", text=" + this.text + ", cornerRadius=" + this.cornerRadius + ", cornerRadiusRatio=" + this.cornerRadiusRatio + ", borderColor=" + this.borderColor + ", borderWidth=" + this.borderWidth + ", icon=" + this.icon + ')';
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
    }
}
