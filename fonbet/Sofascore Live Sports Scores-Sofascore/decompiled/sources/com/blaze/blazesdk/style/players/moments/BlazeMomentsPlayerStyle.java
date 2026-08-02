package com.blaze.blazesdk.style.players.moments;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.blaze.blazesdk.follow.models.BlazeFollowEntityType;
import com.blaze.blazesdk.style.players.BlazeFirstTimeSlideCTAStyle;
import com.blaze.blazesdk.style.players.BlazeFirstTimeSlideInstructionStyle;
import com.blaze.blazesdk.style.players.BlazeFirstTimeSlideTextStyle;
import com.blaze.blazesdk.style.players.BlazePlayerDisplayMode;
import com.blaze.blazesdk.style.players.BlazeSeekBarStyle;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerBodyTextStyle;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerButtonStyle;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerButtonsStyle;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerCtaStyle;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerFollowEntityChipStyle;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerFooterGradientStyle;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerHeadingTextStyle;
import com.blaze.blazesdk.style.shared.models.BlazeDp;
import com.blaze.blazesdk.style.shared.models.BlazeInsets;
import com.blaze.blazesdk.utils.BlazeParcelable;
import com.ironsource.U3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.gz8;
import defpackage.hsl;
import defpackage.jp5;
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
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bK\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 u2\u00020\u0001:\u0002tuB{\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010X\u001a\u00020\u0003HÆ\u0003J\t\u0010Y\u001a\u00020\u0005HÆ\u0003J\t\u0010Z\u001a\u00020\u0007HÆ\u0003J\t\u0010[\u001a\u00020\tHÆ\u0003J\t\u0010\\\u001a\u00020\u000bHÆ\u0003J\t\u0010]\u001a\u00020\rHÆ\u0003J\t\u0010^\u001a\u00020\u000fHÆ\u0003J\t\u0010_\u001a\u00020\u0011HÆ\u0003J\t\u0010`\u001a\u00020\u0013HÆ\u0003J\t\u0010a\u001a\u00020\u0015HÆ\u0003J\t\u0010b\u001a\u00020\u0017HÆ\u0003J\t\u0010c\u001a\u00020\u0019HÆ\u0003J\t\u0010d\u001a\u00020\u001bHÆ\u0003J\t\u0010e\u001a\u00020\u001dHÆ\u0003J\u0095\u0001\u0010f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0003\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001dHÆ\u0001J\u0006\u0010g\u001a\u00020\u000bJ\u0013\u0010h\u001a\u00020i2\b\u0010j\u001a\u0004\u0018\u00010kHÖ\u0003J\t\u0010l\u001a\u00020\u000bHÖ\u0001J\t\u0010m\u001a\u00020nHÖ\u0001J\u0016\u0010o\u001a\u00020p2\u0006\u0010q\u001a\u00020r2\u0006\u0010s\u001a\u00020\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010U\"\u0004\bV\u0010W¨\u0006v"}, d2 = {"Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerStyle;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", "headingText", "Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerHeadingTextStyle;", "bodyText", "Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerBodyTextStyle;", "buttons", "Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerButtonsStyle;", "chips", "Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerChipsStyle;", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "", U3.i.G0, "Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerCtaStyle;", "headerGradient", "Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerHeaderGradientStyle;", "footerGradient", "Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerFooterGradientStyle;", "firstTimeSlide", "Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerFirstTimeSlideStyle;", "seekBar", "Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerSeekBarStyle;", "bottomComponentsAlignment", "Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerStyle$BlazeBottomComponentsAlignment;", "playerDisplayMode", "Lcom/blaze/blazesdk/style/players/BlazePlayerDisplayMode;", "tabsConfigurations", "Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsTabsConfigurations;", "followEntity", "Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerFollowEntityStyle;", "<init>", "(Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerHeadingTextStyle;Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerBodyTextStyle;Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerButtonsStyle;Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerChipsStyle;ILcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerCtaStyle;Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerHeaderGradientStyle;Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerFooterGradientStyle;Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerFirstTimeSlideStyle;Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerSeekBarStyle;Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerStyle$BlazeBottomComponentsAlignment;Lcom/blaze/blazesdk/style/players/BlazePlayerDisplayMode;Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsTabsConfigurations;Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerFollowEntityStyle;)V", "getHeadingText", "()Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerHeadingTextStyle;", "setHeadingText", "(Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerHeadingTextStyle;)V", "getBodyText", "()Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerBodyTextStyle;", "setBodyText", "(Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerBodyTextStyle;)V", "getButtons", "()Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerButtonsStyle;", "setButtons", "(Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerButtonsStyle;)V", "getChips", "()Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerChipsStyle;", "setChips", "(Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerChipsStyle;)V", "getBackgroundColor", "()I", "setBackgroundColor", "(I)V", "getCta", "()Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerCtaStyle;", "setCta", "(Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerCtaStyle;)V", "getHeaderGradient", "()Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerHeaderGradientStyle;", "setHeaderGradient", "(Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerHeaderGradientStyle;)V", "getFooterGradient", "()Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerFooterGradientStyle;", "setFooterGradient", "(Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerFooterGradientStyle;)V", "getFirstTimeSlide", "()Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerFirstTimeSlideStyle;", "setFirstTimeSlide", "(Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerFirstTimeSlideStyle;)V", "getSeekBar", "()Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerSeekBarStyle;", "setSeekBar", "(Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerSeekBarStyle;)V", "getBottomComponentsAlignment", "()Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerStyle$BlazeBottomComponentsAlignment;", "setBottomComponentsAlignment", "(Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerStyle$BlazeBottomComponentsAlignment;)V", "getPlayerDisplayMode", "()Lcom/blaze/blazesdk/style/players/BlazePlayerDisplayMode;", "setPlayerDisplayMode", "(Lcom/blaze/blazesdk/style/players/BlazePlayerDisplayMode;)V", "getTabsConfigurations", "()Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsTabsConfigurations;", "setTabsConfigurations", "(Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsTabsConfigurations;)V", "getFollowEntity", "()Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerFollowEntityStyle;", "setFollowEntity", "(Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerFollowEntityStyle;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "BlazeBottomComponentsAlignment", "Companion", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BlazeMomentsPlayerStyle implements BlazeParcelable {
    private int backgroundColor;

    @NotNull
    private BlazeMomentsPlayerBodyTextStyle bodyText;

    @NotNull
    private BlazeBottomComponentsAlignment bottomComponentsAlignment;

    @NotNull
    private BlazeMomentsPlayerButtonsStyle buttons;

    @NotNull
    private BlazeMomentsPlayerChipsStyle chips;

    @NotNull
    private BlazeMomentsPlayerCtaStyle cta;

    @NotNull
    private BlazeMomentsPlayerFirstTimeSlideStyle firstTimeSlide;

    @NotNull
    private BlazeMomentsPlayerFollowEntityStyle followEntity;

    @NotNull
    private BlazeMomentsPlayerFooterGradientStyle footerGradient;

    @NotNull
    private BlazeMomentsPlayerHeaderGradientStyle headerGradient;

    @NotNull
    private BlazeMomentsPlayerHeadingTextStyle headingText;

    @NotNull
    private BlazePlayerDisplayMode playerDisplayMode;

    @NotNull
    private BlazeMomentsPlayerSeekBarStyle seekBar;

    @NotNull
    private BlazeMomentsTabsConfigurations tabsConfigurations;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazeMomentsPlayerStyle> CREATOR = new a();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerStyle$BlazeBottomComponentsAlignment;", "", "<init>", "(Ljava/lang/String;I)V", "RELATIVE_TO_CONTAINER", "RELATIVE_TO_PLAYER", "FIT_CTA_BELOW_PLAYER", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BlazeBottomComponentsAlignment {
        private static final /* synthetic */ jp5 $ENTRIES;
        private static final /* synthetic */ BlazeBottomComponentsAlignment[] $VALUES;
        public static final BlazeBottomComponentsAlignment RELATIVE_TO_CONTAINER = new BlazeBottomComponentsAlignment("RELATIVE_TO_CONTAINER", 0);
        public static final BlazeBottomComponentsAlignment RELATIVE_TO_PLAYER = new BlazeBottomComponentsAlignment("RELATIVE_TO_PLAYER", 1);
        public static final BlazeBottomComponentsAlignment FIT_CTA_BELOW_PLAYER = new BlazeBottomComponentsAlignment("FIT_CTA_BELOW_PLAYER", 2);

        private static final /* synthetic */ BlazeBottomComponentsAlignment[] $values() {
            return new BlazeBottomComponentsAlignment[]{RELATIVE_TO_CONTAINER, RELATIVE_TO_PLAYER, FIT_CTA_BELOW_PLAYER};
        }

        static {
            BlazeBottomComponentsAlignment[] $values = $values();
            $VALUES = $values;
            $ENTRIES = gz8.G($values);
        }

        private BlazeBottomComponentsAlignment(String str, int i) {
        }

        @NotNull
        public static jp5 getEntries() {
            return $ENTRIES;
        }

        public static BlazeBottomComponentsAlignment valueOf(String str) {
            return (BlazeBottomComponentsAlignment) Enum.valueOf(BlazeBottomComponentsAlignment.class, str);
        }

        public static BlazeBottomComponentsAlignment[] values() {
            return (BlazeBottomComponentsAlignment[]) $VALUES.clone();
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new BlazeMomentsPlayerStyle(BlazeMomentsPlayerHeadingTextStyle.CREATOR.createFromParcel(parcel), BlazeMomentsPlayerBodyTextStyle.CREATOR.createFromParcel(parcel), BlazeMomentsPlayerButtonsStyle.CREATOR.createFromParcel(parcel), BlazeMomentsPlayerChipsStyle.CREATOR.createFromParcel(parcel), parcel.readInt(), BlazeMomentsPlayerCtaStyle.CREATOR.createFromParcel(parcel), BlazeMomentsPlayerHeaderGradientStyle.CREATOR.createFromParcel(parcel), BlazeMomentsPlayerFooterGradientStyle.CREATOR.createFromParcel(parcel), BlazeMomentsPlayerFirstTimeSlideStyle.CREATOR.createFromParcel(parcel), BlazeMomentsPlayerSeekBarStyle.CREATOR.createFromParcel(parcel), BlazeBottomComponentsAlignment.valueOf(parcel.readString()), BlazePlayerDisplayMode.valueOf(parcel.readString()), BlazeMomentsTabsConfigurations.CREATOR.createFromParcel(parcel), BlazeMomentsPlayerFollowEntityStyle.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazeMomentsPlayerStyle[i];
        }
    }

    public BlazeMomentsPlayerStyle(@NotNull BlazeMomentsPlayerHeadingTextStyle blazeMomentsPlayerHeadingTextStyle, @NotNull BlazeMomentsPlayerBodyTextStyle blazeMomentsPlayerBodyTextStyle, @NotNull BlazeMomentsPlayerButtonsStyle blazeMomentsPlayerButtonsStyle, @NotNull BlazeMomentsPlayerChipsStyle blazeMomentsPlayerChipsStyle, int i, @NotNull BlazeMomentsPlayerCtaStyle blazeMomentsPlayerCtaStyle, @NotNull BlazeMomentsPlayerHeaderGradientStyle blazeMomentsPlayerHeaderGradientStyle, @NotNull BlazeMomentsPlayerFooterGradientStyle blazeMomentsPlayerFooterGradientStyle, @NotNull BlazeMomentsPlayerFirstTimeSlideStyle blazeMomentsPlayerFirstTimeSlideStyle, @NotNull BlazeMomentsPlayerSeekBarStyle blazeMomentsPlayerSeekBarStyle, @NotNull BlazeBottomComponentsAlignment blazeBottomComponentsAlignment, @NotNull BlazePlayerDisplayMode blazePlayerDisplayMode, @NotNull BlazeMomentsTabsConfigurations blazeMomentsTabsConfigurations, @NotNull BlazeMomentsPlayerFollowEntityStyle blazeMomentsPlayerFollowEntityStyle) {
        blazeMomentsPlayerHeadingTextStyle.getClass();
        blazeMomentsPlayerBodyTextStyle.getClass();
        blazeMomentsPlayerButtonsStyle.getClass();
        blazeMomentsPlayerChipsStyle.getClass();
        blazeMomentsPlayerCtaStyle.getClass();
        blazeMomentsPlayerHeaderGradientStyle.getClass();
        blazeMomentsPlayerFooterGradientStyle.getClass();
        blazeMomentsPlayerFirstTimeSlideStyle.getClass();
        blazeMomentsPlayerSeekBarStyle.getClass();
        blazeBottomComponentsAlignment.getClass();
        blazePlayerDisplayMode.getClass();
        blazeMomentsTabsConfigurations.getClass();
        blazeMomentsPlayerFollowEntityStyle.getClass();
        this.headingText = blazeMomentsPlayerHeadingTextStyle;
        this.bodyText = blazeMomentsPlayerBodyTextStyle;
        this.buttons = blazeMomentsPlayerButtonsStyle;
        this.chips = blazeMomentsPlayerChipsStyle;
        this.backgroundColor = i;
        this.cta = blazeMomentsPlayerCtaStyle;
        this.headerGradient = blazeMomentsPlayerHeaderGradientStyle;
        this.footerGradient = blazeMomentsPlayerFooterGradientStyle;
        this.firstTimeSlide = blazeMomentsPlayerFirstTimeSlideStyle;
        this.seekBar = blazeMomentsPlayerSeekBarStyle;
        this.bottomComponentsAlignment = blazeBottomComponentsAlignment;
        this.playerDisplayMode = blazePlayerDisplayMode;
        this.tabsConfigurations = blazeMomentsTabsConfigurations;
        this.followEntity = blazeMomentsPlayerFollowEntityStyle;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final BlazeMomentsPlayerHeadingTextStyle getHeadingText() {
        return this.headingText;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final BlazeMomentsPlayerSeekBarStyle getSeekBar() {
        return this.seekBar;
    }

    @NotNull
    /* renamed from: component11, reason: from getter */
    public final BlazeBottomComponentsAlignment getBottomComponentsAlignment() {
        return this.bottomComponentsAlignment;
    }

    @NotNull
    /* renamed from: component12, reason: from getter */
    public final BlazePlayerDisplayMode getPlayerDisplayMode() {
        return this.playerDisplayMode;
    }

    @NotNull
    /* renamed from: component13, reason: from getter */
    public final BlazeMomentsTabsConfigurations getTabsConfigurations() {
        return this.tabsConfigurations;
    }

    @NotNull
    /* renamed from: component14, reason: from getter */
    public final BlazeMomentsPlayerFollowEntityStyle getFollowEntity() {
        return this.followEntity;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final BlazeMomentsPlayerBodyTextStyle getBodyText() {
        return this.bodyText;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final BlazeMomentsPlayerButtonsStyle getButtons() {
        return this.buttons;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final BlazeMomentsPlayerChipsStyle getChips() {
        return this.chips;
    }

    /* renamed from: component5, reason: from getter */
    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final BlazeMomentsPlayerCtaStyle getCta() {
        return this.cta;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final BlazeMomentsPlayerHeaderGradientStyle getHeaderGradient() {
        return this.headerGradient;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final BlazeMomentsPlayerFooterGradientStyle getFooterGradient() {
        return this.footerGradient;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final BlazeMomentsPlayerFirstTimeSlideStyle getFirstTimeSlide() {
        return this.firstTimeSlide;
    }

    @NotNull
    public final BlazeMomentsPlayerStyle copy(@NotNull BlazeMomentsPlayerHeadingTextStyle headingText, @NotNull BlazeMomentsPlayerBodyTextStyle bodyText, @NotNull BlazeMomentsPlayerButtonsStyle buttons, @NotNull BlazeMomentsPlayerChipsStyle chips, int backgroundColor, @NotNull BlazeMomentsPlayerCtaStyle cta, @NotNull BlazeMomentsPlayerHeaderGradientStyle headerGradient, @NotNull BlazeMomentsPlayerFooterGradientStyle footerGradient, @NotNull BlazeMomentsPlayerFirstTimeSlideStyle firstTimeSlide, @NotNull BlazeMomentsPlayerSeekBarStyle seekBar, @NotNull BlazeBottomComponentsAlignment bottomComponentsAlignment, @NotNull BlazePlayerDisplayMode playerDisplayMode, @NotNull BlazeMomentsTabsConfigurations tabsConfigurations, @NotNull BlazeMomentsPlayerFollowEntityStyle followEntity) {
        headingText.getClass();
        bodyText.getClass();
        buttons.getClass();
        chips.getClass();
        cta.getClass();
        headerGradient.getClass();
        footerGradient.getClass();
        firstTimeSlide.getClass();
        seekBar.getClass();
        bottomComponentsAlignment.getClass();
        playerDisplayMode.getClass();
        tabsConfigurations.getClass();
        followEntity.getClass();
        return new BlazeMomentsPlayerStyle(headingText, bodyText, buttons, chips, backgroundColor, cta, headerGradient, footerGradient, firstTimeSlide, seekBar, bottomComponentsAlignment, playerDisplayMode, tabsConfigurations, followEntity);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeMomentsPlayerStyle)) {
            return false;
        }
        BlazeMomentsPlayerStyle blazeMomentsPlayerStyle = (BlazeMomentsPlayerStyle) other;
        return Intrinsics.c(this.headingText, blazeMomentsPlayerStyle.headingText) && Intrinsics.c(this.bodyText, blazeMomentsPlayerStyle.bodyText) && Intrinsics.c(this.buttons, blazeMomentsPlayerStyle.buttons) && Intrinsics.c(this.chips, blazeMomentsPlayerStyle.chips) && this.backgroundColor == blazeMomentsPlayerStyle.backgroundColor && Intrinsics.c(this.cta, blazeMomentsPlayerStyle.cta) && Intrinsics.c(this.headerGradient, blazeMomentsPlayerStyle.headerGradient) && Intrinsics.c(this.footerGradient, blazeMomentsPlayerStyle.footerGradient) && Intrinsics.c(this.firstTimeSlide, blazeMomentsPlayerStyle.firstTimeSlide) && Intrinsics.c(this.seekBar, blazeMomentsPlayerStyle.seekBar) && this.bottomComponentsAlignment == blazeMomentsPlayerStyle.bottomComponentsAlignment && this.playerDisplayMode == blazeMomentsPlayerStyle.playerDisplayMode && Intrinsics.c(this.tabsConfigurations, blazeMomentsPlayerStyle.tabsConfigurations) && Intrinsics.c(this.followEntity, blazeMomentsPlayerStyle.followEntity);
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final BlazeMomentsPlayerBodyTextStyle getBodyText() {
        return this.bodyText;
    }

    @NotNull
    public final BlazeBottomComponentsAlignment getBottomComponentsAlignment() {
        return this.bottomComponentsAlignment;
    }

    @NotNull
    public final BlazeMomentsPlayerButtonsStyle getButtons() {
        return this.buttons;
    }

    @NotNull
    public final BlazeMomentsPlayerChipsStyle getChips() {
        return this.chips;
    }

    @NotNull
    public final BlazeMomentsPlayerCtaStyle getCta() {
        return this.cta;
    }

    @NotNull
    public final BlazeMomentsPlayerFirstTimeSlideStyle getFirstTimeSlide() {
        return this.firstTimeSlide;
    }

    @NotNull
    public final BlazeMomentsPlayerFollowEntityStyle getFollowEntity() {
        return this.followEntity;
    }

    @NotNull
    public final BlazeMomentsPlayerFooterGradientStyle getFooterGradient() {
        return this.footerGradient;
    }

    @NotNull
    public final BlazeMomentsPlayerHeaderGradientStyle getHeaderGradient() {
        return this.headerGradient;
    }

    @NotNull
    public final BlazeMomentsPlayerHeadingTextStyle getHeadingText() {
        return this.headingText;
    }

    @NotNull
    public final BlazePlayerDisplayMode getPlayerDisplayMode() {
        return this.playerDisplayMode;
    }

    @NotNull
    public final BlazeMomentsPlayerSeekBarStyle getSeekBar() {
        return this.seekBar;
    }

    @NotNull
    public final BlazeMomentsTabsConfigurations getTabsConfigurations() {
        return this.tabsConfigurations;
    }

    public int hashCode() {
        return this.followEntity.hashCode() + ((this.tabsConfigurations.hashCode() + ((this.playerDisplayMode.hashCode() + ((this.bottomComponentsAlignment.hashCode() + ((this.seekBar.hashCode() + ((this.firstTimeSlide.hashCode() + ((this.footerGradient.hashCode() + ((this.headerGradient.hashCode() + ((this.cta.hashCode() + l4a.e(this.backgroundColor, (this.chips.hashCode() + ((this.buttons.hashCode() + ((this.bodyText.hashCode() + (this.headingText.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final void setBackgroundColor(int i) {
        this.backgroundColor = i;
    }

    public final void setBodyText(@NotNull BlazeMomentsPlayerBodyTextStyle blazeMomentsPlayerBodyTextStyle) {
        blazeMomentsPlayerBodyTextStyle.getClass();
        this.bodyText = blazeMomentsPlayerBodyTextStyle;
    }

    public final void setBottomComponentsAlignment(@NotNull BlazeBottomComponentsAlignment blazeBottomComponentsAlignment) {
        blazeBottomComponentsAlignment.getClass();
        this.bottomComponentsAlignment = blazeBottomComponentsAlignment;
    }

    public final void setButtons(@NotNull BlazeMomentsPlayerButtonsStyle blazeMomentsPlayerButtonsStyle) {
        blazeMomentsPlayerButtonsStyle.getClass();
        this.buttons = blazeMomentsPlayerButtonsStyle;
    }

    public final void setChips(@NotNull BlazeMomentsPlayerChipsStyle blazeMomentsPlayerChipsStyle) {
        blazeMomentsPlayerChipsStyle.getClass();
        this.chips = blazeMomentsPlayerChipsStyle;
    }

    public final void setCta(@NotNull BlazeMomentsPlayerCtaStyle blazeMomentsPlayerCtaStyle) {
        blazeMomentsPlayerCtaStyle.getClass();
        this.cta = blazeMomentsPlayerCtaStyle;
    }

    public final void setFirstTimeSlide(@NotNull BlazeMomentsPlayerFirstTimeSlideStyle blazeMomentsPlayerFirstTimeSlideStyle) {
        blazeMomentsPlayerFirstTimeSlideStyle.getClass();
        this.firstTimeSlide = blazeMomentsPlayerFirstTimeSlideStyle;
    }

    public final void setFollowEntity(@NotNull BlazeMomentsPlayerFollowEntityStyle blazeMomentsPlayerFollowEntityStyle) {
        blazeMomentsPlayerFollowEntityStyle.getClass();
        this.followEntity = blazeMomentsPlayerFollowEntityStyle;
    }

    public final void setFooterGradient(@NotNull BlazeMomentsPlayerFooterGradientStyle blazeMomentsPlayerFooterGradientStyle) {
        blazeMomentsPlayerFooterGradientStyle.getClass();
        this.footerGradient = blazeMomentsPlayerFooterGradientStyle;
    }

    public final void setHeaderGradient(@NotNull BlazeMomentsPlayerHeaderGradientStyle blazeMomentsPlayerHeaderGradientStyle) {
        blazeMomentsPlayerHeaderGradientStyle.getClass();
        this.headerGradient = blazeMomentsPlayerHeaderGradientStyle;
    }

    public final void setHeadingText(@NotNull BlazeMomentsPlayerHeadingTextStyle blazeMomentsPlayerHeadingTextStyle) {
        blazeMomentsPlayerHeadingTextStyle.getClass();
        this.headingText = blazeMomentsPlayerHeadingTextStyle;
    }

    public final void setPlayerDisplayMode(@NotNull BlazePlayerDisplayMode blazePlayerDisplayMode) {
        blazePlayerDisplayMode.getClass();
        this.playerDisplayMode = blazePlayerDisplayMode;
    }

    public final void setSeekBar(@NotNull BlazeMomentsPlayerSeekBarStyle blazeMomentsPlayerSeekBarStyle) {
        blazeMomentsPlayerSeekBarStyle.getClass();
        this.seekBar = blazeMomentsPlayerSeekBarStyle;
    }

    public final void setTabsConfigurations(@NotNull BlazeMomentsTabsConfigurations blazeMomentsTabsConfigurations) {
        blazeMomentsTabsConfigurations.getClass();
        this.tabsConfigurations = blazeMomentsTabsConfigurations;
    }

    @NotNull
    public String toString() {
        return "BlazeMomentsPlayerStyle(headingText=" + this.headingText + ", bodyText=" + this.bodyText + ", buttons=" + this.buttons + ", chips=" + this.chips + ", backgroundColor=" + this.backgroundColor + ", cta=" + this.cta + ", headerGradient=" + this.headerGradient + ", footerGradient=" + this.footerGradient + ", firstTimeSlide=" + this.firstTimeSlide + ", seekBar=" + this.seekBar + ", bottomComponentsAlignment=" + this.bottomComponentsAlignment + ", playerDisplayMode=" + this.playerDisplayMode + ", tabsConfigurations=" + this.tabsConfigurations + ", followEntity=" + this.followEntity + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        this.headingText.writeToParcel(dest, flags);
        this.bodyText.writeToParcel(dest, flags);
        this.buttons.writeToParcel(dest, flags);
        this.chips.writeToParcel(dest, flags);
        dest.writeInt(this.backgroundColor);
        this.cta.writeToParcel(dest, flags);
        this.headerGradient.writeToParcel(dest, flags);
        this.footerGradient.writeToParcel(dest, flags);
        this.firstTimeSlide.writeToParcel(dest, flags);
        this.seekBar.writeToParcel(dest, flags);
        dest.writeString(this.bottomComponentsAlignment.name());
        dest.writeString(this.playerDisplayMode.name());
        this.tabsConfigurations.writeToParcel(dest, flags);
        this.followEntity.writeToParcel(dest, flags);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerStyle$Companion;", "", "<init>", "()V", "base", "Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerStyle;", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BlazeMomentsPlayerStyle base() {
            BlazeDp blazeDp;
            int i;
            int i2;
            int i3;
            BlazeDp blazeDp2;
            int i4;
            int i5;
            int i6;
            BlazeMomentsPlayerHeadingTextStyle blazeMomentsPlayerHeadingTextStyle = new BlazeMomentsPlayerHeadingTextStyle(null, 16.0f, -1, BlazeMomentsPlayerHeadingTextStyle.BlazeContentSource.TITLE, false);
            BlazeMomentsPlayerBodyTextStyle blazeMomentsPlayerBodyTextStyle = new BlazeMomentsPlayerBodyTextStyle(null, 16.0f, -1, BlazeMomentsPlayerBodyTextStyle.BlazeContentSource.TITLE, true);
            BlazeMomentsPlayerButtonStyle.INSTANCE.getClass();
            BlazeMomentsPlayerButtonStyle a = BlazeMomentsPlayerButtonStyle.Companion.a();
            BlazeMomentsPlayerButtonStyle a2 = BlazeMomentsPlayerButtonStyle.Companion.a();
            a2.setVisibleForAds(false);
            BlazeMomentsPlayerButtonStyle a3 = BlazeMomentsPlayerButtonStyle.Companion.a();
            BlazeMomentsPlayerButtonStyle a4 = BlazeMomentsPlayerButtonStyle.Companion.a();
            a4.setVisibleForAds(false);
            BlazeMomentsPlayerButtonStyle a5 = BlazeMomentsPlayerButtonStyle.Companion.a();
            BlazeMomentsPlayerButtonStyle a6 = BlazeMomentsPlayerButtonStyle.Companion.a();
            a6.setVisibleForAds(false);
            a6.setVisible(false);
            BlazeMomentsPlayerButtonStyle a7 = BlazeMomentsPlayerButtonStyle.Companion.a();
            a7.setVisibleForAds(false);
            BlazeMomentsPlayerButtonStyle a8 = BlazeMomentsPlayerButtonStyle.Companion.a();
            a8.setVisibleForAds(false);
            BlazeMomentsPlayerButtonStyle a9 = BlazeMomentsPlayerButtonStyle.Companion.a();
            a9.setVisibleForAds(false);
            BlazeMomentsPlayerButtonsStyle.BottomStackButtons.Companion.getClass();
            BlazeMomentsPlayerButtonsStyle blazeMomentsPlayerButtonsStyle = new BlazeMomentsPlayerButtonsStyle(a, a2, a3, a4, a5, a6, a7, a8, a9, com.blaze.blazesdk.style.players.moments.a.b, null, null, 3072, null);
            BlazeMomentsPlayerChipStyle.INSTANCE.getClass();
            BlazeMomentsPlayerChipsStyle blazeMomentsPlayerChipsStyle = new BlazeMomentsPlayerChipsStyle(new BlazeMomentsPlayerChipStyle(new BlazeInsets(new BlazeDp(12), new BlazeDp(2), new BlazeDp(12), new BlazeDp(2)), "AD", l1m.h, l1m.c, true));
            BlazeMomentsPlayerCtaStyle blazeMomentsPlayerCtaStyle = new BlazeMomentsPlayerCtaStyle(new BlazeDp(8), 16.0f, null, null, new BlazeDp(48), null, BlazeMomentsPlayerCtaStyle.BlazeCTAPositioning.CTA_BELLOW_BOTTOM_BUTTONS_BOX, BlazeMomentsPlayerCtaStyle.BlazeCTAHorizontalAlignment.FULL_AVAILABLE_WIDTH, true);
            BlazeMomentsPlayerHeaderGradientStyle blazeMomentsPlayerHeaderGradientStyle = new BlazeMomentsPlayerHeaderGradientStyle(true, ((int) (llf.b(0.8f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f) * 255.0f)) << 24, 0);
            BlazeMomentsPlayerFooterGradientStyle blazeMomentsPlayerFooterGradientStyle = new BlazeMomentsPlayerFooterGradientStyle(true, 0, ((int) (llf.b(0.8f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f) * 255.0f)) << 24, BlazeMomentsPlayerFooterGradientStyle.BlazeEndPositioning.BOTTOM_TO_CONTAINER);
            BlazeDp blazeDp3 = new BlazeDp(10);
            BlazeDp blazeDp4 = new BlazeDp(16);
            BlazeSeekBarStyle.INSTANCE.getClass();
            int i7 = l1m.i;
            int i8 = l1m.j;
            BlazeSeekBarStyle blazeSeekBarStyle = new BlazeSeekBarStyle(true, i7, i8, new BlazeDp(2), i8, null, false, new BlazeDp(4), new BlazeDp(10));
            BlazeSeekBarStyle blazeSeekBarStyle2 = new BlazeSeekBarStyle(true, i7, i8, new BlazeDp(2), i8, null, false, new BlazeDp(4), new BlazeDp(10));
            blazeSeekBarStyle2.setCornerRadius(new BlazeDp(4));
            blazeSeekBarStyle2.setThumbVisible(true);
            blazeSeekBarStyle2.setHeight(new BlazeDp(8));
            blazeSeekBarStyle2.setThumbSize(new BlazeDp(14));
            BlazeMomentsPlayerSeekBarStyle blazeMomentsPlayerSeekBarStyle = new BlazeMomentsPlayerSeekBarStyle(true, blazeDp3, blazeDp4, blazeSeekBarStyle, blazeSeekBarStyle2);
            BlazeFirstTimeSlideInstructionStyle.INSTANCE.getClass();
            BlazeFirstTimeSlideTextStyle b = BlazeFirstTimeSlideInstructionStyle.Companion.b();
            b.setText("Go to the next video");
            BlazeFirstTimeSlideTextStyle a10 = BlazeFirstTimeSlideInstructionStyle.Companion.a();
            a10.setText("Swipe up");
            BlazeFirstTimeSlideInstructionStyle blazeFirstTimeSlideInstructionStyle = new BlazeFirstTimeSlideInstructionStyle(b, a10, hsl.NEXT.a, true);
            BlazeFirstTimeSlideTextStyle b2 = BlazeFirstTimeSlideInstructionStyle.Companion.b();
            b2.setText("Go to the previous video");
            BlazeFirstTimeSlideTextStyle a11 = BlazeFirstTimeSlideInstructionStyle.Companion.a();
            a11.setText("Swipe down");
            BlazeFirstTimeSlideInstructionStyle blazeFirstTimeSlideInstructionStyle2 = new BlazeFirstTimeSlideInstructionStyle(b2, a11, hsl.PREV.a, true);
            BlazeFirstTimeSlideTextStyle b3 = BlazeFirstTimeSlideInstructionStyle.Companion.b();
            b3.setText("Pause");
            BlazeFirstTimeSlideTextStyle a12 = BlazeFirstTimeSlideInstructionStyle.Companion.a();
            a12.setText("Tap on screen");
            hsl hslVar = hsl.PAUSE;
            BlazeFirstTimeSlideInstructionStyle blazeFirstTimeSlideInstructionStyle3 = new BlazeFirstTimeSlideInstructionStyle(b3, a12, hslVar.a, true);
            BlazeFirstTimeSlideTextStyle b4 = BlazeFirstTimeSlideInstructionStyle.Companion.b();
            b4.setText("Play");
            BlazeFirstTimeSlideTextStyle a13 = BlazeFirstTimeSlideInstructionStyle.Companion.a();
            a13.setText("Tap on screen");
            BlazeMomentsPlayerFirstTimeSlideInstructionsStyle blazeMomentsPlayerFirstTimeSlideInstructionsStyle = new BlazeMomentsPlayerFirstTimeSlideInstructionsStyle(blazeFirstTimeSlideInstructionStyle, blazeFirstTimeSlideInstructionStyle2, blazeFirstTimeSlideInstructionStyle3, new BlazeFirstTimeSlideInstructionStyle(b4, a13, hslVar.a, true), km5.a);
            BlazeFirstTimeSlideCTAStyle.INSTANCE.getClass();
            BlazeFirstTimeSlideCTAStyle blazeFirstTimeSlideCTAStyle = new BlazeFirstTimeSlideCTAStyle("Tap to start", R.color.blaze_first_time_slide_cta_button_color, R.color.blaze_first_time_slide_cta_button_text_color, 16.0f, null, new BlazeDp(8), new BlazeDp(48), null);
            BlazeFirstTimeSlideTextStyle.INSTANCE.getClass();
            String str = "Browse moments content using these gestures";
            Integer num = null;
            int i9 = R.color.blaze_first_time_slide_sub_title_color;
            float f = 16.0f;
            BlazeMomentsPlayerFirstTimeSlideStyle blazeMomentsPlayerFirstTimeSlideStyle = new BlazeMomentsPlayerFirstTimeSlideStyle(true, blazeFirstTimeSlideCTAStyle, R.color.blaze_first_time_slide_background_color, new BlazeFirstTimeSlideTextStyle("Navigating Moments", null, R.color.blaze_first_time_slide_main_title_color, 28.0f, 2, null), new BlazeFirstTimeSlideTextStyle(str, num, i9, f, 2, null), blazeMomentsPlayerFirstTimeSlideInstructionsStyle);
            BlazeMomentsTabsConfigurations blazeMomentsTabsConfigurations = new BlazeMomentsTabsConfigurations(new BlazeDp(0), false);
            BlazeMomentsPlayerFollowEntityStateStyle.INSTANCE.getClass();
            BlazeMomentsPlayerFollowEntityAvatarStyle.INSTANCE.getClass();
            blazeDp = BlazeMomentsPlayerFollowEntityAvatarStyle.DEFAULT_AVATAR_BORDER_WIDTH;
            i = BlazeMomentsPlayerFollowEntityAvatarStyle.DEFAULT_AVATAR_BORDER_COLOR;
            BlazeMomentsPlayerFollowEntityAvatarStyle blazeMomentsPlayerFollowEntityAvatarStyle = new BlazeMomentsPlayerFollowEntityAvatarStyle(blazeDp, i);
            BlazeMomentsPlayerFollowEntityChipStyle.INSTANCE.getClass();
            i2 = BlazeMomentsPlayerFollowEntityChipStyle.DEFAULT_CHIP_BACKGROUND_COLOR;
            i3 = BlazeMomentsPlayerFollowEntityChipStyle.DEFAULT_CHIP_ICON_COLOR;
            BlazeMomentsPlayerFollowEntityChipStyle.BlazeMomentsPlayerFollowEntityChipContentSource blazeMomentsPlayerFollowEntityChipContentSource = BlazeMomentsPlayerFollowEntityChipStyle.BlazeMomentsPlayerFollowEntityChipContentSource.ICON;
            BlazeMomentsPlayerFollowEntityStateStyle blazeMomentsPlayerFollowEntityStateStyle = new BlazeMomentsPlayerFollowEntityStateStyle(blazeMomentsPlayerFollowEntityAvatarStyle, new BlazeMomentsPlayerFollowEntityChipStyle(i2, i3, blazeMomentsPlayerFollowEntityChipContentSource, R.drawable.blaze_drawable_ic_following_icon));
            blazeDp2 = BlazeMomentsPlayerFollowEntityAvatarStyle.DEFAULT_AVATAR_BORDER_WIDTH;
            i4 = BlazeMomentsPlayerFollowEntityAvatarStyle.DEFAULT_AVATAR_BORDER_COLOR;
            BlazeMomentsPlayerFollowEntityAvatarStyle blazeMomentsPlayerFollowEntityAvatarStyle2 = new BlazeMomentsPlayerFollowEntityAvatarStyle(blazeDp2, i4);
            i5 = BlazeMomentsPlayerFollowEntityChipStyle.DEFAULT_CHIP_BACKGROUND_COLOR;
            i6 = BlazeMomentsPlayerFollowEntityChipStyle.DEFAULT_CHIP_ICON_COLOR;
            return new BlazeMomentsPlayerStyle(blazeMomentsPlayerHeadingTextStyle, blazeMomentsPlayerBodyTextStyle, blazeMomentsPlayerButtonsStyle, blazeMomentsPlayerChipsStyle, -16777216, blazeMomentsPlayerCtaStyle, blazeMomentsPlayerHeaderGradientStyle, blazeMomentsPlayerFooterGradientStyle, blazeMomentsPlayerFirstTimeSlideStyle, blazeMomentsPlayerSeekBarStyle, BlazeBottomComponentsAlignment.RELATIVE_TO_CONTAINER, BlazePlayerDisplayMode.FIXED_RATIO_9_16, blazeMomentsTabsConfigurations, new BlazeMomentsPlayerFollowEntityStyle(false, blazeMomentsPlayerFollowEntityStateStyle, new BlazeMomentsPlayerFollowEntityStateStyle(blazeMomentsPlayerFollowEntityAvatarStyle2, new BlazeMomentsPlayerFollowEntityChipStyle(i5, i6, blazeMomentsPlayerFollowEntityChipContentSource, R.drawable.blaze_drawable_ic_unfollowed_icon)), BlazeFollowEntityType.FirstAvailable.INSTANCE));
        }

        private Companion() {
        }
    }
}
