package com.blaze.blazesdk.style.players.stories;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.style.players.BlazeFirstTimeSlideCTAStyle;
import com.blaze.blazesdk.style.players.BlazeFirstTimeSlideInstructionStyle;
import com.blaze.blazesdk.style.players.BlazeFirstTimeSlideTextStyle;
import com.blaze.blazesdk.style.players.BlazeTextCase;
import com.blaze.blazesdk.style.players.stories.BlazeStoryPlayerButtonStyle;
import com.blaze.blazesdk.style.players.stories.BlazeStoryPlayerButtonsStyle;
import com.blaze.blazesdk.style.shared.models.BlazeDp;
import com.blaze.blazesdk.style.shared.models.BlazeInsets;
import com.blaze.blazesdk.utils.BlazeParcelable;
import com.ironsource.U3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.h0m;
import defpackage.km5;
import defpackage.l1m;
import defpackage.l4a;
import defpackage.llf;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 Q2\u00020\u0001:\u0001QBS\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0005HÆ\u0003J\t\u0010<\u001a\u00020\u0007HÆ\u0003J\t\u0010=\u001a\u00020\tHÆ\u0003J\t\u0010>\u001a\u00020\u000bHÆ\u0003J\t\u0010?\u001a\u00020\rHÆ\u0003J\t\u0010@\u001a\u00020\u000fHÆ\u0003J\t\u0010A\u001a\u00020\u0011HÆ\u0003J\t\u0010B\u001a\u00020\u0013HÆ\u0003Jc\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0003\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013HÆ\u0001J\u0006\u0010D\u001a\u00020\u000bJ\u0013\u0010E\u001a\u00020F2\b\u0010G\u001a\u0004\u0018\u00010HHÖ\u0003J\t\u0010I\u001a\u00020\u000bHÖ\u0001J\t\u0010J\u001a\u00020KHÖ\u0001J\u0016\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109¨\u0006R"}, d2 = {"Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerStyle;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", "title", "Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerTitleTextStyle;", "lastUpdate", "Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerLastUpdateTextStyle;", "buttons", "Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerButtonsStyle;", "chips", "Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerChipsStyle;", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "", U3.i.G0, "Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerCtaStyle;", "headerGradient", "Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerHeaderGradientStyle;", "firstTimeSlide", "Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerFirstTimeSlideStyle;", "progressBar", "Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerProgressBarStyle;", "<init>", "(Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerTitleTextStyle;Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerLastUpdateTextStyle;Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerButtonsStyle;Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerChipsStyle;ILcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerCtaStyle;Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerHeaderGradientStyle;Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerFirstTimeSlideStyle;Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerProgressBarStyle;)V", "getTitle", "()Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerTitleTextStyle;", "setTitle", "(Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerTitleTextStyle;)V", "getLastUpdate", "()Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerLastUpdateTextStyle;", "setLastUpdate", "(Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerLastUpdateTextStyle;)V", "getButtons", "()Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerButtonsStyle;", "setButtons", "(Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerButtonsStyle;)V", "getChips", "()Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerChipsStyle;", "setChips", "(Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerChipsStyle;)V", "getBackgroundColor", "()I", "setBackgroundColor", "(I)V", "getCta", "()Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerCtaStyle;", "setCta", "(Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerCtaStyle;)V", "getHeaderGradient", "()Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerHeaderGradientStyle;", "setHeaderGradient", "(Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerHeaderGradientStyle;)V", "getFirstTimeSlide", "()Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerFirstTimeSlideStyle;", "setFirstTimeSlide", "(Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerFirstTimeSlideStyle;)V", "getProgressBar", "()Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerProgressBarStyle;", "setProgressBar", "(Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerProgressBarStyle;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BlazeStoryPlayerStyle implements BlazeParcelable {
    private int backgroundColor;

    @NotNull
    private BlazeStoryPlayerButtonsStyle buttons;

    @NotNull
    private BlazeStoryPlayerChipsStyle chips;

    @NotNull
    private BlazeStoryPlayerCtaStyle cta;

    @NotNull
    private BlazeStoryPlayerFirstTimeSlideStyle firstTimeSlide;

    @NotNull
    private BlazeStoryPlayerHeaderGradientStyle headerGradient;

    @NotNull
    private BlazeStoryPlayerLastUpdateTextStyle lastUpdate;

    @NotNull
    private BlazeStoryPlayerProgressBarStyle progressBar;

    @NotNull
    private BlazeStoryPlayerTitleTextStyle title;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazeStoryPlayerStyle> CREATOR = new a();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new BlazeStoryPlayerStyle(BlazeStoryPlayerTitleTextStyle.CREATOR.createFromParcel(parcel), BlazeStoryPlayerLastUpdateTextStyle.CREATOR.createFromParcel(parcel), BlazeStoryPlayerButtonsStyle.CREATOR.createFromParcel(parcel), BlazeStoryPlayerChipsStyle.CREATOR.createFromParcel(parcel), parcel.readInt(), BlazeStoryPlayerCtaStyle.CREATOR.createFromParcel(parcel), BlazeStoryPlayerHeaderGradientStyle.CREATOR.createFromParcel(parcel), BlazeStoryPlayerFirstTimeSlideStyle.CREATOR.createFromParcel(parcel), BlazeStoryPlayerProgressBarStyle.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazeStoryPlayerStyle[i];
        }
    }

    public BlazeStoryPlayerStyle(@NotNull BlazeStoryPlayerTitleTextStyle blazeStoryPlayerTitleTextStyle, @NotNull BlazeStoryPlayerLastUpdateTextStyle blazeStoryPlayerLastUpdateTextStyle, @NotNull BlazeStoryPlayerButtonsStyle blazeStoryPlayerButtonsStyle, @NotNull BlazeStoryPlayerChipsStyle blazeStoryPlayerChipsStyle, int i, @NotNull BlazeStoryPlayerCtaStyle blazeStoryPlayerCtaStyle, @NotNull BlazeStoryPlayerHeaderGradientStyle blazeStoryPlayerHeaderGradientStyle, @NotNull BlazeStoryPlayerFirstTimeSlideStyle blazeStoryPlayerFirstTimeSlideStyle, @NotNull BlazeStoryPlayerProgressBarStyle blazeStoryPlayerProgressBarStyle) {
        blazeStoryPlayerTitleTextStyle.getClass();
        blazeStoryPlayerLastUpdateTextStyle.getClass();
        blazeStoryPlayerButtonsStyle.getClass();
        blazeStoryPlayerChipsStyle.getClass();
        blazeStoryPlayerCtaStyle.getClass();
        blazeStoryPlayerHeaderGradientStyle.getClass();
        blazeStoryPlayerFirstTimeSlideStyle.getClass();
        blazeStoryPlayerProgressBarStyle.getClass();
        this.title = blazeStoryPlayerTitleTextStyle;
        this.lastUpdate = blazeStoryPlayerLastUpdateTextStyle;
        this.buttons = blazeStoryPlayerButtonsStyle;
        this.chips = blazeStoryPlayerChipsStyle;
        this.backgroundColor = i;
        this.cta = blazeStoryPlayerCtaStyle;
        this.headerGradient = blazeStoryPlayerHeaderGradientStyle;
        this.firstTimeSlide = blazeStoryPlayerFirstTimeSlideStyle;
        this.progressBar = blazeStoryPlayerProgressBarStyle;
    }

    public static /* synthetic */ BlazeStoryPlayerStyle copy$default(BlazeStoryPlayerStyle blazeStoryPlayerStyle, BlazeStoryPlayerTitleTextStyle blazeStoryPlayerTitleTextStyle, BlazeStoryPlayerLastUpdateTextStyle blazeStoryPlayerLastUpdateTextStyle, BlazeStoryPlayerButtonsStyle blazeStoryPlayerButtonsStyle, BlazeStoryPlayerChipsStyle blazeStoryPlayerChipsStyle, int i, BlazeStoryPlayerCtaStyle blazeStoryPlayerCtaStyle, BlazeStoryPlayerHeaderGradientStyle blazeStoryPlayerHeaderGradientStyle, BlazeStoryPlayerFirstTimeSlideStyle blazeStoryPlayerFirstTimeSlideStyle, BlazeStoryPlayerProgressBarStyle blazeStoryPlayerProgressBarStyle, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            blazeStoryPlayerTitleTextStyle = blazeStoryPlayerStyle.title;
        }
        if ((i2 & 2) != 0) {
            blazeStoryPlayerLastUpdateTextStyle = blazeStoryPlayerStyle.lastUpdate;
        }
        if ((i2 & 4) != 0) {
            blazeStoryPlayerButtonsStyle = blazeStoryPlayerStyle.buttons;
        }
        if ((i2 & 8) != 0) {
            blazeStoryPlayerChipsStyle = blazeStoryPlayerStyle.chips;
        }
        if ((i2 & 16) != 0) {
            i = blazeStoryPlayerStyle.backgroundColor;
        }
        if ((i2 & 32) != 0) {
            blazeStoryPlayerCtaStyle = blazeStoryPlayerStyle.cta;
        }
        if ((i2 & 64) != 0) {
            blazeStoryPlayerHeaderGradientStyle = blazeStoryPlayerStyle.headerGradient;
        }
        if ((i2 & 128) != 0) {
            blazeStoryPlayerFirstTimeSlideStyle = blazeStoryPlayerStyle.firstTimeSlide;
        }
        if ((i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            blazeStoryPlayerProgressBarStyle = blazeStoryPlayerStyle.progressBar;
        }
        BlazeStoryPlayerFirstTimeSlideStyle blazeStoryPlayerFirstTimeSlideStyle2 = blazeStoryPlayerFirstTimeSlideStyle;
        BlazeStoryPlayerProgressBarStyle blazeStoryPlayerProgressBarStyle2 = blazeStoryPlayerProgressBarStyle;
        BlazeStoryPlayerCtaStyle blazeStoryPlayerCtaStyle2 = blazeStoryPlayerCtaStyle;
        BlazeStoryPlayerHeaderGradientStyle blazeStoryPlayerHeaderGradientStyle2 = blazeStoryPlayerHeaderGradientStyle;
        int i3 = i;
        BlazeStoryPlayerButtonsStyle blazeStoryPlayerButtonsStyle2 = blazeStoryPlayerButtonsStyle;
        return blazeStoryPlayerStyle.copy(blazeStoryPlayerTitleTextStyle, blazeStoryPlayerLastUpdateTextStyle, blazeStoryPlayerButtonsStyle2, blazeStoryPlayerChipsStyle, i3, blazeStoryPlayerCtaStyle2, blazeStoryPlayerHeaderGradientStyle2, blazeStoryPlayerFirstTimeSlideStyle2, blazeStoryPlayerProgressBarStyle2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final BlazeStoryPlayerTitleTextStyle getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final BlazeStoryPlayerLastUpdateTextStyle getLastUpdate() {
        return this.lastUpdate;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final BlazeStoryPlayerButtonsStyle getButtons() {
        return this.buttons;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final BlazeStoryPlayerChipsStyle getChips() {
        return this.chips;
    }

    /* renamed from: component5, reason: from getter */
    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final BlazeStoryPlayerCtaStyle getCta() {
        return this.cta;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final BlazeStoryPlayerHeaderGradientStyle getHeaderGradient() {
        return this.headerGradient;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final BlazeStoryPlayerFirstTimeSlideStyle getFirstTimeSlide() {
        return this.firstTimeSlide;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final BlazeStoryPlayerProgressBarStyle getProgressBar() {
        return this.progressBar;
    }

    @NotNull
    public final BlazeStoryPlayerStyle copy(@NotNull BlazeStoryPlayerTitleTextStyle title, @NotNull BlazeStoryPlayerLastUpdateTextStyle lastUpdate, @NotNull BlazeStoryPlayerButtonsStyle buttons, @NotNull BlazeStoryPlayerChipsStyle chips, int backgroundColor, @NotNull BlazeStoryPlayerCtaStyle cta, @NotNull BlazeStoryPlayerHeaderGradientStyle headerGradient, @NotNull BlazeStoryPlayerFirstTimeSlideStyle firstTimeSlide, @NotNull BlazeStoryPlayerProgressBarStyle progressBar) {
        title.getClass();
        lastUpdate.getClass();
        buttons.getClass();
        chips.getClass();
        cta.getClass();
        headerGradient.getClass();
        firstTimeSlide.getClass();
        progressBar.getClass();
        return new BlazeStoryPlayerStyle(title, lastUpdate, buttons, chips, backgroundColor, cta, headerGradient, firstTimeSlide, progressBar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeStoryPlayerStyle)) {
            return false;
        }
        BlazeStoryPlayerStyle blazeStoryPlayerStyle = (BlazeStoryPlayerStyle) other;
        return Intrinsics.c(this.title, blazeStoryPlayerStyle.title) && Intrinsics.c(this.lastUpdate, blazeStoryPlayerStyle.lastUpdate) && Intrinsics.c(this.buttons, blazeStoryPlayerStyle.buttons) && Intrinsics.c(this.chips, blazeStoryPlayerStyle.chips) && this.backgroundColor == blazeStoryPlayerStyle.backgroundColor && Intrinsics.c(this.cta, blazeStoryPlayerStyle.cta) && Intrinsics.c(this.headerGradient, blazeStoryPlayerStyle.headerGradient) && Intrinsics.c(this.firstTimeSlide, blazeStoryPlayerStyle.firstTimeSlide) && Intrinsics.c(this.progressBar, blazeStoryPlayerStyle.progressBar);
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final BlazeStoryPlayerButtonsStyle getButtons() {
        return this.buttons;
    }

    @NotNull
    public final BlazeStoryPlayerChipsStyle getChips() {
        return this.chips;
    }

    @NotNull
    public final BlazeStoryPlayerCtaStyle getCta() {
        return this.cta;
    }

    @NotNull
    public final BlazeStoryPlayerFirstTimeSlideStyle getFirstTimeSlide() {
        return this.firstTimeSlide;
    }

    @NotNull
    public final BlazeStoryPlayerHeaderGradientStyle getHeaderGradient() {
        return this.headerGradient;
    }

    @NotNull
    public final BlazeStoryPlayerLastUpdateTextStyle getLastUpdate() {
        return this.lastUpdate;
    }

    @NotNull
    public final BlazeStoryPlayerProgressBarStyle getProgressBar() {
        return this.progressBar;
    }

    @NotNull
    public final BlazeStoryPlayerTitleTextStyle getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.progressBar.hashCode() + ((this.firstTimeSlide.hashCode() + ((this.headerGradient.hashCode() + ((this.cta.hashCode() + l4a.e(this.backgroundColor, (this.chips.hashCode() + ((this.buttons.hashCode() + ((this.lastUpdate.hashCode() + (this.title.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final void setBackgroundColor(int i) {
        this.backgroundColor = i;
    }

    public final void setButtons(@NotNull BlazeStoryPlayerButtonsStyle blazeStoryPlayerButtonsStyle) {
        blazeStoryPlayerButtonsStyle.getClass();
        this.buttons = blazeStoryPlayerButtonsStyle;
    }

    public final void setChips(@NotNull BlazeStoryPlayerChipsStyle blazeStoryPlayerChipsStyle) {
        blazeStoryPlayerChipsStyle.getClass();
        this.chips = blazeStoryPlayerChipsStyle;
    }

    public final void setCta(@NotNull BlazeStoryPlayerCtaStyle blazeStoryPlayerCtaStyle) {
        blazeStoryPlayerCtaStyle.getClass();
        this.cta = blazeStoryPlayerCtaStyle;
    }

    public final void setFirstTimeSlide(@NotNull BlazeStoryPlayerFirstTimeSlideStyle blazeStoryPlayerFirstTimeSlideStyle) {
        blazeStoryPlayerFirstTimeSlideStyle.getClass();
        this.firstTimeSlide = blazeStoryPlayerFirstTimeSlideStyle;
    }

    public final void setHeaderGradient(@NotNull BlazeStoryPlayerHeaderGradientStyle blazeStoryPlayerHeaderGradientStyle) {
        blazeStoryPlayerHeaderGradientStyle.getClass();
        this.headerGradient = blazeStoryPlayerHeaderGradientStyle;
    }

    public final void setLastUpdate(@NotNull BlazeStoryPlayerLastUpdateTextStyle blazeStoryPlayerLastUpdateTextStyle) {
        blazeStoryPlayerLastUpdateTextStyle.getClass();
        this.lastUpdate = blazeStoryPlayerLastUpdateTextStyle;
    }

    public final void setProgressBar(@NotNull BlazeStoryPlayerProgressBarStyle blazeStoryPlayerProgressBarStyle) {
        blazeStoryPlayerProgressBarStyle.getClass();
        this.progressBar = blazeStoryPlayerProgressBarStyle;
    }

    public final void setTitle(@NotNull BlazeStoryPlayerTitleTextStyle blazeStoryPlayerTitleTextStyle) {
        blazeStoryPlayerTitleTextStyle.getClass();
        this.title = blazeStoryPlayerTitleTextStyle;
    }

    @NotNull
    public String toString() {
        return "BlazeStoryPlayerStyle(title=" + this.title + ", lastUpdate=" + this.lastUpdate + ", buttons=" + this.buttons + ", chips=" + this.chips + ", backgroundColor=" + this.backgroundColor + ", cta=" + this.cta + ", headerGradient=" + this.headerGradient + ", firstTimeSlide=" + this.firstTimeSlide + ", progressBar=" + this.progressBar + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        this.title.writeToParcel(dest, flags);
        this.lastUpdate.writeToParcel(dest, flags);
        this.buttons.writeToParcel(dest, flags);
        this.chips.writeToParcel(dest, flags);
        dest.writeInt(this.backgroundColor);
        this.cta.writeToParcel(dest, flags);
        this.headerGradient.writeToParcel(dest, flags);
        this.firstTimeSlide.writeToParcel(dest, flags);
        this.progressBar.writeToParcel(dest, flags);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerStyle$Companion;", "", "<init>", "()V", "base", "Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerStyle;", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BlazeStoryPlayerStyle base() {
            BlazeStoryPlayerTitleTextStyle blazeStoryPlayerTitleTextStyle = new BlazeStoryPlayerTitleTextStyle(null, 12.0f, -1, true);
            BlazeStoryPlayerButtonStyle.INSTANCE.getClass();
            BlazeStoryPlayerButtonStyle a = BlazeStoryPlayerButtonStyle.Companion.a();
            BlazeStoryPlayerButtonStyle a2 = BlazeStoryPlayerButtonStyle.Companion.a();
            a2.setVisibleForAds(false);
            BlazeStoryPlayerButtonStyle a3 = BlazeStoryPlayerButtonStyle.Companion.a();
            BlazeStoryPlayerButtonStyle a4 = BlazeStoryPlayerButtonStyle.Companion.a();
            a4.setVisibleForAds(false);
            a4.setVisible(false);
            BlazeStoryPlayerButtonsStyle.TopStackButtons.Companion.getClass();
            BlazeStoryPlayerButtonsStyle blazeStoryPlayerButtonsStyle = new BlazeStoryPlayerButtonsStyle(a, a2, a3, a4, com.blaze.blazesdk.style.players.stories.a.b, null, null, 96, null);
            BlazeStoryPlayerChipStyle.INSTANCE.getClass();
            BlazeInsets blazeInsets = new BlazeInsets(new BlazeDp(12), new BlazeDp(2), new BlazeDp(12), new BlazeDp(2));
            int i = l1m.h;
            BlazeStoryPlayerChipsStyle blazeStoryPlayerChipsStyle = new BlazeStoryPlayerChipsStyle(new BlazeStoryPlayerChipStyle(blazeInsets, "AD", i, l1m.c, true), new BlazeStoryPlayerChipStyle(new BlazeInsets(new BlazeDp(12), new BlazeDp(2), new BlazeDp(12), new BlazeDp(2)), "LIVE", i, l1m.b, true));
            BlazeStoryPlayerCtaStyle blazeStoryPlayerCtaStyle = new BlazeStoryPlayerCtaStyle(new BlazeDp(8), 16.0f, null, null, true);
            BlazeStoryPlayerHeaderGradientStyle blazeStoryPlayerHeaderGradientStyle = new BlazeStoryPlayerHeaderGradientStyle(true, ((int) (llf.b(0.8f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f) * 255.0f)) << 24, 0);
            BlazeStoryPlayerLastUpdateTextStyle blazeStoryPlayerLastUpdateTextStyle = new BlazeStoryPlayerLastUpdateTextStyle(null, 12.0f, -7829368, BlazeTextCase.LOWERCASE, true);
            BlazeStoryPlayerProgressBarStyle blazeStoryPlayerProgressBarStyle = new BlazeStoryPlayerProgressBarStyle(-7829368, -1);
            BlazeFirstTimeSlideInstructionStyle.INSTANCE.getClass();
            BlazeFirstTimeSlideTextStyle b = BlazeFirstTimeSlideInstructionStyle.Companion.b();
            b.setText("Go forward");
            BlazeFirstTimeSlideTextStyle a5 = BlazeFirstTimeSlideInstructionStyle.Companion.a();
            a5.setText("Tap the screen");
            BlazeFirstTimeSlideInstructionStyle blazeFirstTimeSlideInstructionStyle = new BlazeFirstTimeSlideInstructionStyle(b, a5, h0m.FORWARD.a, true);
            BlazeFirstTimeSlideTextStyle b2 = BlazeFirstTimeSlideInstructionStyle.Companion.b();
            b2.setText("Go back");
            BlazeFirstTimeSlideTextStyle a6 = BlazeFirstTimeSlideInstructionStyle.Companion.a();
            a6.setText("Tap the left edge");
            BlazeFirstTimeSlideInstructionStyle blazeFirstTimeSlideInstructionStyle2 = new BlazeFirstTimeSlideInstructionStyle(b2, a6, h0m.BACKWARD.a, true);
            BlazeFirstTimeSlideTextStyle b3 = BlazeFirstTimeSlideInstructionStyle.Companion.b();
            b3.setText("Pause");
            BlazeFirstTimeSlideTextStyle a7 = BlazeFirstTimeSlideInstructionStyle.Companion.a();
            a7.setText("Press and hold the screen");
            BlazeFirstTimeSlideInstructionStyle blazeFirstTimeSlideInstructionStyle3 = new BlazeFirstTimeSlideInstructionStyle(b3, a7, h0m.PAUSE.a, true);
            BlazeFirstTimeSlideTextStyle b4 = BlazeFirstTimeSlideInstructionStyle.Companion.b();
            b4.setText("Move between stories");
            BlazeFirstTimeSlideTextStyle a8 = BlazeFirstTimeSlideInstructionStyle.Companion.a();
            a8.setText("Swipe left or right");
            BlazeStoryPlayerFirstTimeSlideInstructionsStyle blazeStoryPlayerFirstTimeSlideInstructionsStyle = new BlazeStoryPlayerFirstTimeSlideInstructionsStyle(blazeFirstTimeSlideInstructionStyle, blazeFirstTimeSlideInstructionStyle2, blazeFirstTimeSlideInstructionStyle3, new BlazeFirstTimeSlideInstructionStyle(b4, a8, h0m.TRANSITION.a, true), km5.a);
            BlazeFirstTimeSlideCTAStyle.INSTANCE.getClass();
            BlazeFirstTimeSlideCTAStyle blazeFirstTimeSlideCTAStyle = new BlazeFirstTimeSlideCTAStyle("Tap to start", R.color.blaze_first_time_slide_cta_button_color, R.color.blaze_first_time_slide_cta_button_text_color, 16.0f, null, new BlazeDp(8), new BlazeDp(48), null);
            BlazeFirstTimeSlideTextStyle.INSTANCE.getClass();
            int i2 = 2;
            DefaultConstructorMarker defaultConstructorMarker = null;
            Integer num = null;
            return new BlazeStoryPlayerStyle(blazeStoryPlayerTitleTextStyle, blazeStoryPlayerLastUpdateTextStyle, blazeStoryPlayerButtonsStyle, blazeStoryPlayerChipsStyle, -16777216, blazeStoryPlayerCtaStyle, blazeStoryPlayerHeaderGradientStyle, new BlazeStoryPlayerFirstTimeSlideStyle(true, blazeFirstTimeSlideCTAStyle, R.color.blaze_first_time_slide_background_color, new BlazeFirstTimeSlideTextStyle("Navigating Stories", num, R.color.blaze_first_time_slide_main_title_color, 28.0f, i2, defaultConstructorMarker), new BlazeFirstTimeSlideTextStyle("Browse story content using these gestures", num, R.color.blaze_first_time_slide_sub_title_color, 16.0f, i2, defaultConstructorMarker), blazeStoryPlayerFirstTimeSlideInstructionsStyle), blazeStoryPlayerProgressBarStyle);
        }

        private Companion() {
        }
    }
}
