package com.blaze.blazesdk.style.players.videos;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.blaze.blazesdk.features.shared.models.ui_shared.BlazeLiveStreamEdgeState;
import com.blaze.blazesdk.features.shared.models.ui_shared.BlazeLiveStreamStatus;
import com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerBackToLiveButtonStateStyle;
import com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerButtonStyle;
import com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerHeadingTextStyle;
import com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerStatusIndicatorStateStyle;
import com.blaze.blazesdk.style.shared.models.BlazeDp;
import com.blaze.blazesdk.style.shared.models.BlazeInsets;
import com.blaze.blazesdk.utils.BlazeParcelable;
import com.ironsource.U3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import defpackage.l4a;
import defpackage.rtl;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 L2\u00020\u0001:\u0001LBK\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u00104\u001a\u00020\u0003HÆ\u0003J\u000e\u00105\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b6J\t\u00107\u001a\u00020\u0007HÆ\u0003J\t\u00108\u001a\u00020\tHÆ\u0003J\t\u00109\u001a\u00020\u000bHÆ\u0003J\t\u0010:\u001a\u00020\rHÆ\u0003J\t\u0010;\u001a\u00020\u000fHÆ\u0003J\u000e\u0010<\u001a\u00020\u0011HÀ\u0003¢\u0006\u0002\b=JY\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011HÆ\u0001J\u0006\u0010?\u001a\u00020\tJ\u0013\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010CHÖ\u0003J\t\u0010D\u001a\u00020\tHÖ\u0001J\t\u0010E\u001a\u00020FHÖ\u0001J\u0016\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u0010\u0010\u001a\u00020\u0011X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u0006M"}, d2 = {"Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerStyle;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", "headingText", "Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerHeadingTextStyle;", "statusIndicator", "Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerStatusIndicatorStyle;", "buttons", "Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonsStyle;", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "", U3.i.G0, "Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerCtaStyle;", "seekBar", "Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerSeekBarStyle;", "cast", "Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerCastButtonStyle;", "backToLiveButton", "Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerBackToLiveButtonStyle;", "<init>", "(Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerHeadingTextStyle;Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerStatusIndicatorStyle;Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonsStyle;ILcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerCtaStyle;Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerSeekBarStyle;Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerCastButtonStyle;Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerBackToLiveButtonStyle;)V", "getHeadingText", "()Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerHeadingTextStyle;", "setHeadingText", "(Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerHeadingTextStyle;)V", "getStatusIndicator$blazesdk_release", "()Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerStatusIndicatorStyle;", "setStatusIndicator$blazesdk_release", "(Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerStatusIndicatorStyle;)V", "getButtons", "()Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonsStyle;", "setButtons", "(Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonsStyle;)V", "getBackgroundColor", "()I", "setBackgroundColor", "(I)V", "getCta", "()Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerCtaStyle;", "setCta", "(Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerCtaStyle;)V", "getSeekBar", "()Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerSeekBarStyle;", "setSeekBar", "(Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerSeekBarStyle;)V", "getCast", "()Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerCastButtonStyle;", "setCast", "(Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerCastButtonStyle;)V", "getBackToLiveButton$blazesdk_release", "()Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerBackToLiveButtonStyle;", "setBackToLiveButton$blazesdk_release", "(Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerBackToLiveButtonStyle;)V", "component1", "component2", "component2$blazesdk_release", "component3", "component4", "component5", "component6", "component7", "component8", "component8$blazesdk_release", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlazeVideosPlayerStyle implements BlazeParcelable {

    @NotNull
    private BlazeVideosPlayerBackToLiveButtonStyle backToLiveButton;
    private int backgroundColor;

    @NotNull
    private BlazeVideosPlayerButtonsStyle buttons;

    @NotNull
    private BlazeVideosPlayerCastButtonStyle cast;

    @NotNull
    private BlazeVideosPlayerCtaStyle cta;

    @NotNull
    private BlazeVideosPlayerHeadingTextStyle headingText;

    @NotNull
    private BlazeVideosPlayerSeekBarStyle seekBar;

    @NotNull
    private BlazeVideosPlayerStatusIndicatorStyle statusIndicator;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazeVideosPlayerStyle> CREATOR = new a();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new BlazeVideosPlayerStyle(BlazeVideosPlayerHeadingTextStyle.CREATOR.createFromParcel(parcel), BlazeVideosPlayerStatusIndicatorStyle.CREATOR.createFromParcel(parcel), BlazeVideosPlayerButtonsStyle.CREATOR.createFromParcel(parcel), parcel.readInt(), BlazeVideosPlayerCtaStyle.CREATOR.createFromParcel(parcel), BlazeVideosPlayerSeekBarStyle.CREATOR.createFromParcel(parcel), BlazeVideosPlayerCastButtonStyle.CREATOR.createFromParcel(parcel), BlazeVideosPlayerBackToLiveButtonStyle.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazeVideosPlayerStyle[i];
        }
    }

    public BlazeVideosPlayerStyle(@NotNull BlazeVideosPlayerHeadingTextStyle blazeVideosPlayerHeadingTextStyle, @NotNull BlazeVideosPlayerStatusIndicatorStyle blazeVideosPlayerStatusIndicatorStyle, @NotNull BlazeVideosPlayerButtonsStyle blazeVideosPlayerButtonsStyle, int i, @NotNull BlazeVideosPlayerCtaStyle blazeVideosPlayerCtaStyle, @NotNull BlazeVideosPlayerSeekBarStyle blazeVideosPlayerSeekBarStyle, @NotNull BlazeVideosPlayerCastButtonStyle blazeVideosPlayerCastButtonStyle, @NotNull BlazeVideosPlayerBackToLiveButtonStyle blazeVideosPlayerBackToLiveButtonStyle) {
        blazeVideosPlayerHeadingTextStyle.getClass();
        blazeVideosPlayerStatusIndicatorStyle.getClass();
        blazeVideosPlayerButtonsStyle.getClass();
        blazeVideosPlayerCtaStyle.getClass();
        blazeVideosPlayerSeekBarStyle.getClass();
        blazeVideosPlayerCastButtonStyle.getClass();
        blazeVideosPlayerBackToLiveButtonStyle.getClass();
        this.headingText = blazeVideosPlayerHeadingTextStyle;
        this.statusIndicator = blazeVideosPlayerStatusIndicatorStyle;
        this.buttons = blazeVideosPlayerButtonsStyle;
        this.backgroundColor = i;
        this.cta = blazeVideosPlayerCtaStyle;
        this.seekBar = blazeVideosPlayerSeekBarStyle;
        this.cast = blazeVideosPlayerCastButtonStyle;
        this.backToLiveButton = blazeVideosPlayerBackToLiveButtonStyle;
    }

    public static /* synthetic */ BlazeVideosPlayerStyle copy$default(BlazeVideosPlayerStyle blazeVideosPlayerStyle, BlazeVideosPlayerHeadingTextStyle blazeVideosPlayerHeadingTextStyle, BlazeVideosPlayerStatusIndicatorStyle blazeVideosPlayerStatusIndicatorStyle, BlazeVideosPlayerButtonsStyle blazeVideosPlayerButtonsStyle, int i, BlazeVideosPlayerCtaStyle blazeVideosPlayerCtaStyle, BlazeVideosPlayerSeekBarStyle blazeVideosPlayerSeekBarStyle, BlazeVideosPlayerCastButtonStyle blazeVideosPlayerCastButtonStyle, BlazeVideosPlayerBackToLiveButtonStyle blazeVideosPlayerBackToLiveButtonStyle, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            blazeVideosPlayerHeadingTextStyle = blazeVideosPlayerStyle.headingText;
        }
        if ((i2 & 2) != 0) {
            blazeVideosPlayerStatusIndicatorStyle = blazeVideosPlayerStyle.statusIndicator;
        }
        if ((i2 & 4) != 0) {
            blazeVideosPlayerButtonsStyle = blazeVideosPlayerStyle.buttons;
        }
        if ((i2 & 8) != 0) {
            i = blazeVideosPlayerStyle.backgroundColor;
        }
        if ((i2 & 16) != 0) {
            blazeVideosPlayerCtaStyle = blazeVideosPlayerStyle.cta;
        }
        if ((i2 & 32) != 0) {
            blazeVideosPlayerSeekBarStyle = blazeVideosPlayerStyle.seekBar;
        }
        if ((i2 & 64) != 0) {
            blazeVideosPlayerCastButtonStyle = blazeVideosPlayerStyle.cast;
        }
        if ((i2 & 128) != 0) {
            blazeVideosPlayerBackToLiveButtonStyle = blazeVideosPlayerStyle.backToLiveButton;
        }
        BlazeVideosPlayerCastButtonStyle blazeVideosPlayerCastButtonStyle2 = blazeVideosPlayerCastButtonStyle;
        BlazeVideosPlayerBackToLiveButtonStyle blazeVideosPlayerBackToLiveButtonStyle2 = blazeVideosPlayerBackToLiveButtonStyle;
        BlazeVideosPlayerCtaStyle blazeVideosPlayerCtaStyle2 = blazeVideosPlayerCtaStyle;
        BlazeVideosPlayerSeekBarStyle blazeVideosPlayerSeekBarStyle2 = blazeVideosPlayerSeekBarStyle;
        return blazeVideosPlayerStyle.copy(blazeVideosPlayerHeadingTextStyle, blazeVideosPlayerStatusIndicatorStyle, blazeVideosPlayerButtonsStyle, i, blazeVideosPlayerCtaStyle2, blazeVideosPlayerSeekBarStyle2, blazeVideosPlayerCastButtonStyle2, blazeVideosPlayerBackToLiveButtonStyle2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final BlazeVideosPlayerHeadingTextStyle getHeadingText() {
        return this.headingText;
    }

    @NotNull
    /* renamed from: component2$blazesdk_release, reason: from getter */
    public final BlazeVideosPlayerStatusIndicatorStyle getStatusIndicator() {
        return this.statusIndicator;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final BlazeVideosPlayerButtonsStyle getButtons() {
        return this.buttons;
    }

    /* renamed from: component4, reason: from getter */
    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final BlazeVideosPlayerCtaStyle getCta() {
        return this.cta;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final BlazeVideosPlayerSeekBarStyle getSeekBar() {
        return this.seekBar;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final BlazeVideosPlayerCastButtonStyle getCast() {
        return this.cast;
    }

    @NotNull
    /* renamed from: component8$blazesdk_release, reason: from getter */
    public final BlazeVideosPlayerBackToLiveButtonStyle getBackToLiveButton() {
        return this.backToLiveButton;
    }

    @NotNull
    public final BlazeVideosPlayerStyle copy(@NotNull BlazeVideosPlayerHeadingTextStyle headingText, @NotNull BlazeVideosPlayerStatusIndicatorStyle statusIndicator, @NotNull BlazeVideosPlayerButtonsStyle buttons, int backgroundColor, @NotNull BlazeVideosPlayerCtaStyle cta, @NotNull BlazeVideosPlayerSeekBarStyle seekBar, @NotNull BlazeVideosPlayerCastButtonStyle cast, @NotNull BlazeVideosPlayerBackToLiveButtonStyle backToLiveButton) {
        headingText.getClass();
        statusIndicator.getClass();
        buttons.getClass();
        cta.getClass();
        seekBar.getClass();
        cast.getClass();
        backToLiveButton.getClass();
        return new BlazeVideosPlayerStyle(headingText, statusIndicator, buttons, backgroundColor, cta, seekBar, cast, backToLiveButton);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeVideosPlayerStyle)) {
            return false;
        }
        BlazeVideosPlayerStyle blazeVideosPlayerStyle = (BlazeVideosPlayerStyle) other;
        return Intrinsics.c(this.headingText, blazeVideosPlayerStyle.headingText) && Intrinsics.c(this.statusIndicator, blazeVideosPlayerStyle.statusIndicator) && Intrinsics.c(this.buttons, blazeVideosPlayerStyle.buttons) && this.backgroundColor == blazeVideosPlayerStyle.backgroundColor && Intrinsics.c(this.cta, blazeVideosPlayerStyle.cta) && Intrinsics.c(this.seekBar, blazeVideosPlayerStyle.seekBar) && Intrinsics.c(this.cast, blazeVideosPlayerStyle.cast) && Intrinsics.c(this.backToLiveButton, blazeVideosPlayerStyle.backToLiveButton);
    }

    @NotNull
    public final BlazeVideosPlayerBackToLiveButtonStyle getBackToLiveButton$blazesdk_release() {
        return this.backToLiveButton;
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final BlazeVideosPlayerButtonsStyle getButtons() {
        return this.buttons;
    }

    @NotNull
    public final BlazeVideosPlayerCastButtonStyle getCast() {
        return this.cast;
    }

    @NotNull
    public final BlazeVideosPlayerCtaStyle getCta() {
        return this.cta;
    }

    @NotNull
    public final BlazeVideosPlayerHeadingTextStyle getHeadingText() {
        return this.headingText;
    }

    @NotNull
    public final BlazeVideosPlayerSeekBarStyle getSeekBar() {
        return this.seekBar;
    }

    @NotNull
    public final BlazeVideosPlayerStatusIndicatorStyle getStatusIndicator$blazesdk_release() {
        return this.statusIndicator;
    }

    public int hashCode() {
        return this.backToLiveButton.hashCode() + ((this.cast.hashCode() + ((this.seekBar.hashCode() + ((this.cta.hashCode() + l4a.e(this.backgroundColor, (this.buttons.hashCode() + ((this.statusIndicator.hashCode() + (this.headingText.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final void setBackToLiveButton$blazesdk_release(@NotNull BlazeVideosPlayerBackToLiveButtonStyle blazeVideosPlayerBackToLiveButtonStyle) {
        blazeVideosPlayerBackToLiveButtonStyle.getClass();
        this.backToLiveButton = blazeVideosPlayerBackToLiveButtonStyle;
    }

    public final void setBackgroundColor(int i) {
        this.backgroundColor = i;
    }

    public final void setButtons(@NotNull BlazeVideosPlayerButtonsStyle blazeVideosPlayerButtonsStyle) {
        blazeVideosPlayerButtonsStyle.getClass();
        this.buttons = blazeVideosPlayerButtonsStyle;
    }

    public final void setCast(@NotNull BlazeVideosPlayerCastButtonStyle blazeVideosPlayerCastButtonStyle) {
        blazeVideosPlayerCastButtonStyle.getClass();
        this.cast = blazeVideosPlayerCastButtonStyle;
    }

    public final void setCta(@NotNull BlazeVideosPlayerCtaStyle blazeVideosPlayerCtaStyle) {
        blazeVideosPlayerCtaStyle.getClass();
        this.cta = blazeVideosPlayerCtaStyle;
    }

    public final void setHeadingText(@NotNull BlazeVideosPlayerHeadingTextStyle blazeVideosPlayerHeadingTextStyle) {
        blazeVideosPlayerHeadingTextStyle.getClass();
        this.headingText = blazeVideosPlayerHeadingTextStyle;
    }

    public final void setSeekBar(@NotNull BlazeVideosPlayerSeekBarStyle blazeVideosPlayerSeekBarStyle) {
        blazeVideosPlayerSeekBarStyle.getClass();
        this.seekBar = blazeVideosPlayerSeekBarStyle;
    }

    public final void setStatusIndicator$blazesdk_release(@NotNull BlazeVideosPlayerStatusIndicatorStyle blazeVideosPlayerStatusIndicatorStyle) {
        blazeVideosPlayerStatusIndicatorStyle.getClass();
        this.statusIndicator = blazeVideosPlayerStatusIndicatorStyle;
    }

    @NotNull
    public String toString() {
        return "BlazeVideosPlayerStyle(headingText=" + this.headingText + ", statusIndicator=" + this.statusIndicator + ", buttons=" + this.buttons + ", backgroundColor=" + this.backgroundColor + ", cta=" + this.cta + ", seekBar=" + this.seekBar + ", cast=" + this.cast + ", backToLiveButton=" + this.backToLiveButton + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        this.headingText.writeToParcel(dest, flags);
        this.statusIndicator.writeToParcel(dest, flags);
        this.buttons.writeToParcel(dest, flags);
        dest.writeInt(this.backgroundColor);
        this.cta.writeToParcel(dest, flags);
        this.seekBar.writeToParcel(dest, flags);
        this.cast.writeToParcel(dest, flags);
        this.backToLiveButton.writeToParcel(dest, flags);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerStyle$Companion;", "", "<init>", "()V", "base", "Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerStyle;", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BlazeVideosPlayerStyle base() {
            BlazeVideosPlayerHeadingTextStyle blazeVideosPlayerHeadingTextStyle = new BlazeVideosPlayerHeadingTextStyle(true, null, -1, 16.0f, BlazeVideosPlayerHeadingTextStyle.BlazeContentSource.TITLE, 2);
            BlazeVideosPlayerButtonsStyle.INSTANCE.getClass();
            BlazeVideosPlayerButtonStyle.INSTANCE.getClass();
            BlazeVideosPlayerButtonStyle a = BlazeVideosPlayerButtonStyle.Companion.a();
            BlazeVideosPlayerButtonStyle a2 = BlazeVideosPlayerButtonStyle.Companion.a();
            a2.setVisibleForAds(false);
            BlazeVideosPlayerButtonStyle a3 = BlazeVideosPlayerButtonStyle.Companion.a();
            BlazeVideosPlayerButtonStyle a4 = BlazeVideosPlayerButtonStyle.Companion.a();
            a4.setVisibleForAds(false);
            BlazeVideosPlayerButtonStyle a5 = BlazeVideosPlayerButtonStyle.Companion.a();
            BlazeVideosPlayerButtonStyle a6 = BlazeVideosPlayerButtonStyle.Companion.a();
            BlazeVideosPlayerButtonStyle a7 = BlazeVideosPlayerButtonStyle.Companion.a();
            BlazeVideosPlayerButtonStyle a8 = BlazeVideosPlayerButtonStyle.Companion.a();
            a8.setVisible(false);
            BlazeVideosPlayerButtonStyle a9 = BlazeVideosPlayerButtonStyle.Companion.a();
            a9.setVisible(false);
            BlazeVideosPlayerButtonStyle a10 = BlazeVideosPlayerButtonStyle.Companion.a();
            a10.setVisible(false);
            BlazeVideosPlayerButtonStyle a11 = BlazeVideosPlayerButtonStyle.Companion.a();
            BlazeVideosPlayerButtonStyle a12 = BlazeVideosPlayerButtonStyle.Companion.a();
            BlazeVideosPlayerButtonStyle a13 = BlazeVideosPlayerButtonStyle.Companion.a();
            BlazeVideosPlayerButtonStyle a14 = BlazeVideosPlayerButtonStyle.Companion.a();
            BlazeVideosPlayerButtonStyle a15 = BlazeVideosPlayerButtonStyle.Companion.a();
            a15.setVisibleForAds(false);
            BlazeVideosPlayerButtonsStyle blazeVideosPlayerButtonsStyle = new BlazeVideosPlayerButtonsStyle(a, a2, a3, a4, a5, a6, a7, a8, a11, a10, a9, a12, a13, a14, a15);
            BlazeVideosPlayerCtaStyle blazeVideosPlayerCtaStyle = new BlazeVideosPlayerCtaStyle(true, new BlazeDp(24), 14.0f, null, null, new BlazeDp(32), null);
            BlazeVideosPlayerSeekBarStyle a16 = rtl.a();
            BlazeInsets blazeInsets = new BlazeInsets(new BlazeDp(8), new BlazeDp(2), new BlazeDp(8), new BlazeDp(2));
            BlazeVideosPlayerStatusIndicatorStateStyle.INSTANCE.getClass();
            BlazeVideosPlayerStatusIndicatorStyle blazeVideosPlayerStatusIndicatorStyle = new BlazeVideosPlayerStatusIndicatorStyle(true, blazeInsets, new BlazeVideosPlayerStatusIndicatorStreamStatesStyle(BlazeVideosPlayerStatusIndicatorStateStyle.Companion.a(BlazeLiveStreamStatus.UPCOMING), BlazeVideosPlayerStatusIndicatorStateStyle.Companion.a(BlazeLiveStreamStatus.LIVE), BlazeVideosPlayerStatusIndicatorStateStyle.Companion.a(BlazeLiveStreamStatus.ENDED)));
            BlazeInsets blazeInsets2 = new BlazeInsets(new BlazeDp(16), new BlazeDp(8), new BlazeDp(0), new BlazeDp(0));
            BlazeInsets blazeInsets3 = new BlazeInsets(new BlazeDp(12), new BlazeDp(3), new BlazeDp(12), new BlazeDp(3));
            BlazeVideosPlayerBackToLiveButtonStateStyle.INSTANCE.getClass();
            return new BlazeVideosPlayerStyle(blazeVideosPlayerHeadingTextStyle, blazeVideosPlayerStatusIndicatorStyle, blazeVideosPlayerButtonsStyle, -16777216, blazeVideosPlayerCtaStyle, a16, new BlazeVideosPlayerCastButtonStyle(true, new BlazeDp(48), new BlazeDp(48)), new BlazeVideosPlayerBackToLiveButtonStyle(blazeInsets2, blazeInsets3, new BlazeVideosPlayerBackToLiveButtonPlaybackStatesStyle(BlazeVideosPlayerBackToLiveButtonStateStyle.Companion.a(BlazeLiveStreamEdgeState.AT_LIVE_EDGE), BlazeVideosPlayerBackToLiveButtonStateStyle.Companion.a(BlazeLiveStreamEdgeState.BEHIND_LIVE))));
        }

        private Companion() {
        }
    }
}
