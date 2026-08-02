package com.blaze.blazesdk.style.players.videos;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.blaze.blazesdk.style.players.BlazeSeekBarStyle;
import com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerButtonStyle;
import com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerHeadingTextStyle;
import com.blaze.blazesdk.style.shared.models.BlazeDp;
import com.blaze.blazesdk.utils.BlazeParcelable;
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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0001.B+\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J1\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0006\u0010!\u001a\u00020\u0007J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\u0007HÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u0007R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006/"}, d2 = {"Lcom/blaze/blazesdk/style/players/videos/BlazeVideosInlineInteractivePlayerStyle;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", "headingText", "Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerHeadingTextStyle;", "buttons", "Lcom/blaze/blazesdk/style/players/videos/BlazeVideosInlineInteractivePlayerButtonsStyle;", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "", "seekBar", "Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerSeekBarStyle;", "<init>", "(Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerHeadingTextStyle;Lcom/blaze/blazesdk/style/players/videos/BlazeVideosInlineInteractivePlayerButtonsStyle;ILcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerSeekBarStyle;)V", "getHeadingText", "()Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerHeadingTextStyle;", "setHeadingText", "(Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerHeadingTextStyle;)V", "getButtons", "()Lcom/blaze/blazesdk/style/players/videos/BlazeVideosInlineInteractivePlayerButtonsStyle;", "setButtons", "(Lcom/blaze/blazesdk/style/players/videos/BlazeVideosInlineInteractivePlayerButtonsStyle;)V", "getBackgroundColor", "()I", "setBackgroundColor", "(I)V", "getSeekBar", "()Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerSeekBarStyle;", "setSeekBar", "(Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerSeekBarStyle;)V", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlazeVideosInlineInteractivePlayerStyle implements BlazeParcelable {
    private int backgroundColor;

    @NotNull
    private BlazeVideosInlineInteractivePlayerButtonsStyle buttons;

    @NotNull
    private BlazeVideosPlayerHeadingTextStyle headingText;

    @NotNull
    private BlazeVideosPlayerSeekBarStyle seekBar;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazeVideosInlineInteractivePlayerStyle> CREATOR = new a();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new BlazeVideosInlineInteractivePlayerStyle(BlazeVideosPlayerHeadingTextStyle.CREATOR.createFromParcel(parcel), BlazeVideosInlineInteractivePlayerButtonsStyle.CREATOR.createFromParcel(parcel), parcel.readInt(), BlazeVideosPlayerSeekBarStyle.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazeVideosInlineInteractivePlayerStyle[i];
        }
    }

    public BlazeVideosInlineInteractivePlayerStyle(@NotNull BlazeVideosPlayerHeadingTextStyle blazeVideosPlayerHeadingTextStyle, @NotNull BlazeVideosInlineInteractivePlayerButtonsStyle blazeVideosInlineInteractivePlayerButtonsStyle, int i, @NotNull BlazeVideosPlayerSeekBarStyle blazeVideosPlayerSeekBarStyle) {
        blazeVideosPlayerHeadingTextStyle.getClass();
        blazeVideosInlineInteractivePlayerButtonsStyle.getClass();
        blazeVideosPlayerSeekBarStyle.getClass();
        this.headingText = blazeVideosPlayerHeadingTextStyle;
        this.buttons = blazeVideosInlineInteractivePlayerButtonsStyle;
        this.backgroundColor = i;
        this.seekBar = blazeVideosPlayerSeekBarStyle;
    }

    public static /* synthetic */ BlazeVideosInlineInteractivePlayerStyle copy$default(BlazeVideosInlineInteractivePlayerStyle blazeVideosInlineInteractivePlayerStyle, BlazeVideosPlayerHeadingTextStyle blazeVideosPlayerHeadingTextStyle, BlazeVideosInlineInteractivePlayerButtonsStyle blazeVideosInlineInteractivePlayerButtonsStyle, int i, BlazeVideosPlayerSeekBarStyle blazeVideosPlayerSeekBarStyle, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            blazeVideosPlayerHeadingTextStyle = blazeVideosInlineInteractivePlayerStyle.headingText;
        }
        if ((i2 & 2) != 0) {
            blazeVideosInlineInteractivePlayerButtonsStyle = blazeVideosInlineInteractivePlayerStyle.buttons;
        }
        if ((i2 & 4) != 0) {
            i = blazeVideosInlineInteractivePlayerStyle.backgroundColor;
        }
        if ((i2 & 8) != 0) {
            blazeVideosPlayerSeekBarStyle = blazeVideosInlineInteractivePlayerStyle.seekBar;
        }
        return blazeVideosInlineInteractivePlayerStyle.copy(blazeVideosPlayerHeadingTextStyle, blazeVideosInlineInteractivePlayerButtonsStyle, i, blazeVideosPlayerSeekBarStyle);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final BlazeVideosPlayerHeadingTextStyle getHeadingText() {
        return this.headingText;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final BlazeVideosInlineInteractivePlayerButtonsStyle getButtons() {
        return this.buttons;
    }

    /* renamed from: component3, reason: from getter */
    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final BlazeVideosPlayerSeekBarStyle getSeekBar() {
        return this.seekBar;
    }

    @NotNull
    public final BlazeVideosInlineInteractivePlayerStyle copy(@NotNull BlazeVideosPlayerHeadingTextStyle headingText, @NotNull BlazeVideosInlineInteractivePlayerButtonsStyle buttons, int backgroundColor, @NotNull BlazeVideosPlayerSeekBarStyle seekBar) {
        headingText.getClass();
        buttons.getClass();
        seekBar.getClass();
        return new BlazeVideosInlineInteractivePlayerStyle(headingText, buttons, backgroundColor, seekBar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeVideosInlineInteractivePlayerStyle)) {
            return false;
        }
        BlazeVideosInlineInteractivePlayerStyle blazeVideosInlineInteractivePlayerStyle = (BlazeVideosInlineInteractivePlayerStyle) other;
        return Intrinsics.c(this.headingText, blazeVideosInlineInteractivePlayerStyle.headingText) && Intrinsics.c(this.buttons, blazeVideosInlineInteractivePlayerStyle.buttons) && this.backgroundColor == blazeVideosInlineInteractivePlayerStyle.backgroundColor && Intrinsics.c(this.seekBar, blazeVideosInlineInteractivePlayerStyle.seekBar);
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final BlazeVideosInlineInteractivePlayerButtonsStyle getButtons() {
        return this.buttons;
    }

    @NotNull
    public final BlazeVideosPlayerHeadingTextStyle getHeadingText() {
        return this.headingText;
    }

    @NotNull
    public final BlazeVideosPlayerSeekBarStyle getSeekBar() {
        return this.seekBar;
    }

    public int hashCode() {
        return this.seekBar.hashCode() + l4a.e(this.backgroundColor, (this.buttons.hashCode() + (this.headingText.hashCode() * 31)) * 31);
    }

    public final void setBackgroundColor(int i) {
        this.backgroundColor = i;
    }

    public final void setButtons(@NotNull BlazeVideosInlineInteractivePlayerButtonsStyle blazeVideosInlineInteractivePlayerButtonsStyle) {
        blazeVideosInlineInteractivePlayerButtonsStyle.getClass();
        this.buttons = blazeVideosInlineInteractivePlayerButtonsStyle;
    }

    public final void setHeadingText(@NotNull BlazeVideosPlayerHeadingTextStyle blazeVideosPlayerHeadingTextStyle) {
        blazeVideosPlayerHeadingTextStyle.getClass();
        this.headingText = blazeVideosPlayerHeadingTextStyle;
    }

    public final void setSeekBar(@NotNull BlazeVideosPlayerSeekBarStyle blazeVideosPlayerSeekBarStyle) {
        blazeVideosPlayerSeekBarStyle.getClass();
        this.seekBar = blazeVideosPlayerSeekBarStyle;
    }

    @NotNull
    public String toString() {
        return "BlazeVideosInlineInteractivePlayerStyle(headingText=" + this.headingText + ", buttons=" + this.buttons + ", backgroundColor=" + this.backgroundColor + ", seekBar=" + this.seekBar + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        this.headingText.writeToParcel(dest, flags);
        this.buttons.writeToParcel(dest, flags);
        dest.writeInt(this.backgroundColor);
        this.seekBar.writeToParcel(dest, flags);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/blaze/blazesdk/style/players/videos/BlazeVideosInlineInteractivePlayerStyle$Companion;", "", "<init>", "()V", "base", "Lcom/blaze/blazesdk/style/players/videos/BlazeVideosInlineInteractivePlayerStyle;", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BlazeVideosInlineInteractivePlayerStyle base() {
            BlazeVideosPlayerHeadingTextStyle blazeVideosPlayerHeadingTextStyle = new BlazeVideosPlayerHeadingTextStyle(true, null, -1, 16.0f, BlazeVideosPlayerHeadingTextStyle.BlazeContentSource.TITLE, 2);
            blazeVideosPlayerHeadingTextStyle.setTextSize(14.0f);
            blazeVideosPlayerHeadingTextStyle.setMaxLines(2);
            BlazeVideosInlineInteractivePlayerButtonsStyle.INSTANCE.getClass();
            BlazeVideosPlayerButtonStyle.INSTANCE.getClass();
            BlazeVideosPlayerButtonStyle a = BlazeVideosPlayerButtonStyle.Companion.a();
            BlazeVideosPlayerButtonStyle a2 = BlazeVideosPlayerButtonStyle.Companion.a();
            BlazeVideosPlayerButtonStyle a3 = BlazeVideosPlayerButtonStyle.Companion.a();
            a3.setVisibleForAds(false);
            BlazeVideosPlayerButtonStyle a4 = BlazeVideosPlayerButtonStyle.Companion.a();
            BlazeVideosPlayerButtonStyle a5 = BlazeVideosPlayerButtonStyle.Companion.a();
            BlazeVideosPlayerButtonStyle a6 = BlazeVideosPlayerButtonStyle.Companion.a();
            BlazeVideosPlayerButtonStyle a7 = BlazeVideosPlayerButtonStyle.Companion.a();
            BlazeVideosPlayerButtonStyle a8 = BlazeVideosPlayerButtonStyle.Companion.a();
            a8.setVisible(false);
            BlazeVideosPlayerButtonStyle a9 = BlazeVideosPlayerButtonStyle.Companion.a();
            a9.setVisible(false);
            BlazeVideosInlineInteractivePlayerButtonsStyle blazeVideosInlineInteractivePlayerButtonsStyle = new BlazeVideosInlineInteractivePlayerButtonsStyle(a, a2, a3, a4, a5, a6, a7, BlazeVideosPlayerButtonStyle.Companion.a(), a9, a8);
            BlazeVideosPlayerSeekBarStyle a10 = rtl.a();
            BlazeSeekBarStyle playingState = a10.getPlayingState();
            playingState.setCornerRadius(new BlazeDp(2));
            playingState.setHeight(new BlazeDp(4));
            playingState.setThumbSize(new BlazeDp(6));
            BlazeSeekBarStyle pausedState = a10.getPausedState();
            pausedState.setCornerRadius(new BlazeDp(3));
            pausedState.setHeight(new BlazeDp(6));
            pausedState.setThumbSize(new BlazeDp(10));
            return new BlazeVideosInlineInteractivePlayerStyle(blazeVideosPlayerHeadingTextStyle, blazeVideosInlineInteractivePlayerButtonsStyle, -16777216, a10);
        }

        private Companion() {
        }
    }
}
