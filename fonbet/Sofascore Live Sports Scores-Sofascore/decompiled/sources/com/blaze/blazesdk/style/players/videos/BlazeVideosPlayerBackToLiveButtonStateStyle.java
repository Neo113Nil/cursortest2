package com.blaze.blazesdk.style.players.videos;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.blaze.blazesdk.features.shared.models.ui_shared.BlazeLiveStreamEdgeState;
import com.blaze.blazesdk.style.shared.models.BlazeDp;
import com.blaze.blazesdk.utils.BlazeParcelable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.b6a;
import defpackage.bf3;
import defpackage.l4a;
import defpackage.llf;
import defpackage.o6a;
import defpackage.s6a;
import defpackage.wt3;
import defpackage.zzl;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0087\b\u0018\u0000 D2\u00020\u0001:\u0002EFB=\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b!\u0010\"JP\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b%\u0010\u001bJ\u0010\u0010&\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b&\u0010\u0017J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u0019\"\u0004\b.\u0010/R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u001b\"\u0004\b2\u00103R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u00104\u001a\u0004\b5\u0010\u0017\"\u0004\b6\u00107R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u00108\u001a\u0004\b9\u0010\u001e\"\u0004\b:\u0010;R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010<\u001a\u0004\b=\u0010 \"\u0004\b>\u0010?R$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010@\u001a\u0004\bA\u0010\"\"\u0004\bB\u0010C¨\u0006G"}, d2 = {"Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerBackToLiveButtonStateStyle;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", "Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerTextStyle;", "textStyle", "", "text", "", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "Lcom/blaze/blazesdk/style/shared/models/BlazeDp;", "cornerRadius", "", "cornerRadiusRatio", "Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerBackToLiveButtonStateStyle$c;", "icon", "<init>", "(Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerTextStyle;Ljava/lang/String;ILcom/blaze/blazesdk/style/shared/models/BlazeDp;Ljava/lang/Float;Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerBackToLiveButtonStateStyle$c;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerTextStyle;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/blaze/blazesdk/style/shared/models/BlazeDp;", "component5", "()Ljava/lang/Float;", "component6", "()Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerBackToLiveButtonStateStyle$c;", "copy", "(Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerTextStyle;Ljava/lang/String;ILcom/blaze/blazesdk/style/shared/models/BlazeDp;Ljava/lang/Float;Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerBackToLiveButtonStateStyle$c;)Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerBackToLiveButtonStateStyle;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerTextStyle;", "getTextStyle", "setTextStyle", "(Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerTextStyle;)V", "Ljava/lang/String;", "getText", "setText", "(Ljava/lang/String;)V", "I", "getBackgroundColor", "setBackgroundColor", "(I)V", "Lcom/blaze/blazesdk/style/shared/models/BlazeDp;", "getCornerRadius", "setCornerRadius", "(Lcom/blaze/blazesdk/style/shared/models/BlazeDp;)V", "Ljava/lang/Float;", "getCornerRadiusRatio", "setCornerRadiusRatio", "(Ljava/lang/Float;)V", "Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerBackToLiveButtonStateStyle$c;", "getIcon", "setIcon", "(Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerBackToLiveButtonStateStyle$c;)V", "Companion", com.mbridge.msdk.foundation.controller.a.q, "a", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlazeVideosPlayerBackToLiveButtonStateStyle implements BlazeParcelable {
    private static final float TEXT_SIZE_SP = 14.0f;
    private int backgroundColor;

    @NotNull
    private BlazeDp cornerRadius;

    @Nullable
    private Float cornerRadiusRatio;

    @Nullable
    private c icon;

    @NotNull
    private String text;

    @NotNull
    private BlazeVideosPlayerTextStyle textStyle;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazeVideosPlayerBackToLiveButtonStateStyle> CREATOR = new b();
    private static final int backToLiveButtonTextColor = Color.parseColor("#F0F0F0");
    private static final int behindLiveIconTintColor = Color.parseColor("#8E8E8E");
    private static final int atLiveEdgeIconTintColor = Color.parseColor("#FF3131");

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerBackToLiveButtonStateStyle$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static BlazeVideosPlayerBackToLiveButtonStateStyle a(BlazeLiveStreamEdgeState blazeLiveStreamEdgeState) {
            String str;
            int i;
            int b = ((int) (llf.b(0.6f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f) * 255.0f)) << 24;
            BlazeVideosPlayerBackToLiveButtonStateStyle blazeVideosPlayerBackToLiveButtonStateStyle = new BlazeVideosPlayerBackToLiveButtonStateStyle(new BlazeVideosPlayerTextStyle(BlazeVideosPlayerBackToLiveButtonStateStyle.TEXT_SIZE_SP, BlazeVideosPlayerBackToLiveButtonStateStyle.backToLiveButtonTextColor, null), "", b, new BlazeDp(0), Float.valueOf(0.5f), new c(R.drawable.blaze_drawable_ic_live_stream_dot, Integer.valueOf(BlazeVideosPlayerBackToLiveButtonStateStyle.backToLiveButtonTextColor)));
            BlazeVideosPlayerBackToLiveButtonStateStyle.INSTANCE.getClass();
            int[] iArr = a.a;
            int i2 = iArr[blazeLiveStreamEdgeState.ordinal()];
            if (i2 == 1) {
                str = "Live";
            } else {
                if (i2 != 2) {
                    zzl.b();
                    return null;
                }
                str = "Back to Live";
            }
            blazeVideosPlayerBackToLiveButtonStateStyle.setText(str);
            c icon = blazeVideosPlayerBackToLiveButtonStateStyle.getIcon();
            if (icon != null) {
                int i3 = iArr[blazeLiveStreamEdgeState.ordinal()];
                if (i3 == 1) {
                    i = BlazeVideosPlayerBackToLiveButtonStateStyle.atLiveEdgeIconTintColor;
                } else {
                    if (i3 != 2) {
                        zzl.b();
                        return null;
                    }
                    i = BlazeVideosPlayerBackToLiveButtonStateStyle.behindLiveIconTintColor;
                }
                icon.b = Integer.valueOf(i);
            }
            return blazeVideosPlayerBackToLiveButtonStateStyle;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new BlazeVideosPlayerBackToLiveButtonStateStyle(BlazeVideosPlayerTextStyle.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt(), BlazeDp.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? c.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazeVideosPlayerBackToLiveButtonStateStyle[i];
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class c implements BlazeParcelable {

        @NotNull
        public static final Parcelable.Creator<c> CREATOR = new a();
        public final int a;
        public Integer b;

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new c(parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new c[i];
            }
        }

        public c(int i, @Nullable Integer num) {
            this.a = i;
            this.b = num;
        }

        public static c copy$default(c cVar, int i, Integer num, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = cVar.a;
            }
            if ((i2 & 2) != 0) {
                num = cVar.b;
            }
            cVar.getClass();
            return new c(i, num);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && Intrinsics.c(this.b, cVar.b);
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.a) * 31;
            Integer num = this.b;
            return hashCode + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("IconStyle(iconResId=");
            sb.append(this.a);
            sb.append(", iconTint=");
            return bf3.n(sb, this.b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.a);
            Integer num = this.b;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                b6a.h(parcel, num);
            }
        }
    }

    public BlazeVideosPlayerBackToLiveButtonStateStyle(@NotNull BlazeVideosPlayerTextStyle blazeVideosPlayerTextStyle, @NotNull String str, int i, @NotNull BlazeDp blazeDp, @Nullable Float f, @Nullable c cVar) {
        blazeVideosPlayerTextStyle.getClass();
        str.getClass();
        blazeDp.getClass();
        this.textStyle = blazeVideosPlayerTextStyle;
        this.text = str;
        this.backgroundColor = i;
        this.cornerRadius = blazeDp;
        this.cornerRadiusRatio = f;
        this.icon = cVar;
    }

    public static /* synthetic */ BlazeVideosPlayerBackToLiveButtonStateStyle copy$default(BlazeVideosPlayerBackToLiveButtonStateStyle blazeVideosPlayerBackToLiveButtonStateStyle, BlazeVideosPlayerTextStyle blazeVideosPlayerTextStyle, String str, int i, BlazeDp blazeDp, Float f, c cVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            blazeVideosPlayerTextStyle = blazeVideosPlayerBackToLiveButtonStateStyle.textStyle;
        }
        if ((i2 & 2) != 0) {
            str = blazeVideosPlayerBackToLiveButtonStateStyle.text;
        }
        if ((i2 & 4) != 0) {
            i = blazeVideosPlayerBackToLiveButtonStateStyle.backgroundColor;
        }
        if ((i2 & 8) != 0) {
            blazeDp = blazeVideosPlayerBackToLiveButtonStateStyle.cornerRadius;
        }
        if ((i2 & 16) != 0) {
            f = blazeVideosPlayerBackToLiveButtonStateStyle.cornerRadiusRatio;
        }
        if ((i2 & 32) != 0) {
            cVar = blazeVideosPlayerBackToLiveButtonStateStyle.icon;
        }
        Float f2 = f;
        c cVar2 = cVar;
        return blazeVideosPlayerBackToLiveButtonStateStyle.copy(blazeVideosPlayerTextStyle, str, i, blazeDp, f2, cVar2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final BlazeVideosPlayerTextStyle getTextStyle() {
        return this.textStyle;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component3, reason: from getter */
    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final BlazeDp getCornerRadius() {
        return this.cornerRadius;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Float getCornerRadiusRatio() {
        return this.cornerRadiusRatio;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final c getIcon() {
        return this.icon;
    }

    @NotNull
    public final BlazeVideosPlayerBackToLiveButtonStateStyle copy(@NotNull BlazeVideosPlayerTextStyle textStyle, @NotNull String text, int backgroundColor, @NotNull BlazeDp cornerRadius, @Nullable Float cornerRadiusRatio, @Nullable c icon) {
        textStyle.getClass();
        text.getClass();
        cornerRadius.getClass();
        return new BlazeVideosPlayerBackToLiveButtonStateStyle(textStyle, text, backgroundColor, cornerRadius, cornerRadiusRatio, icon);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeVideosPlayerBackToLiveButtonStateStyle)) {
            return false;
        }
        BlazeVideosPlayerBackToLiveButtonStateStyle blazeVideosPlayerBackToLiveButtonStateStyle = (BlazeVideosPlayerBackToLiveButtonStateStyle) other;
        return Intrinsics.c(this.textStyle, blazeVideosPlayerBackToLiveButtonStateStyle.textStyle) && Intrinsics.c(this.text, blazeVideosPlayerBackToLiveButtonStateStyle.text) && this.backgroundColor == blazeVideosPlayerBackToLiveButtonStateStyle.backgroundColor && Intrinsics.c(this.cornerRadius, blazeVideosPlayerBackToLiveButtonStateStyle.cornerRadius) && Intrinsics.c(this.cornerRadiusRatio, blazeVideosPlayerBackToLiveButtonStateStyle.cornerRadiusRatio) && Intrinsics.c(this.icon, blazeVideosPlayerBackToLiveButtonStateStyle.icon);
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
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
    public final c getIcon() {
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
        int n = s6a.n(this.cornerRadius, l4a.e(this.backgroundColor, o6a.k(this.text, this.textStyle.hashCode() * 31)));
        Float f = this.cornerRadiusRatio;
        int hashCode = (n + (f == null ? 0 : f.hashCode())) * 31;
        c cVar = this.icon;
        return hashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    public final void setBackgroundColor(int i) {
        this.backgroundColor = i;
    }

    public final void setCornerRadius(@NotNull BlazeDp blazeDp) {
        blazeDp.getClass();
        this.cornerRadius = blazeDp;
    }

    public final void setCornerRadiusRatio(@Nullable Float f) {
        this.cornerRadiusRatio = f;
    }

    public final void setIcon(@Nullable c cVar) {
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

    @NotNull
    public String toString() {
        return "BlazeVideosPlayerBackToLiveButtonStateStyle(textStyle=" + this.textStyle + ", text=" + this.text + ", backgroundColor=" + this.backgroundColor + ", cornerRadius=" + this.cornerRadius + ", cornerRadiusRatio=" + this.cornerRadiusRatio + ", icon=" + this.icon + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        this.textStyle.writeToParcel(dest, flags);
        dest.writeString(this.text);
        dest.writeInt(this.backgroundColor);
        this.cornerRadius.writeToParcel(dest, flags);
        Float f = this.cornerRadiusRatio;
        if (f == null) {
            dest.writeInt(0);
        } else {
            wt3.w(dest, 1, f);
        }
        c cVar = this.icon;
        if (cVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cVar.writeToParcel(dest, flags);
        }
    }
}
