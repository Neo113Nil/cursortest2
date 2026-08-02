package ru.ozon.app.android.marketing.widgets.bigPromoPDP.presentation;

import Am.C2438a;
import B0.C2454a;
import Bi.a;
import D3.g;
import K00.b;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.bigPromoPDP.data.BigPromoPDPDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b,\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002PQB\u009d\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u000e\u0010\u001c\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001b\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020\u001d2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u00102R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b6\u00105R\u0019\u0010\f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b7\u00105R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010A\u001a\u0004\bB\u0010CR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010D\u001a\u0004\bE\u0010FR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0017\u0010D\u001a\u0004\bG\u0010FR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010H\u001a\u0004\bI\u0010\"R\u001f\u0010\u001c\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010J\u001a\u0004\bK\u0010LR\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010M\u001a\u0004\bN\u0010O¨\u0006R"}, d2 = {"Lru/ozon/app/android/marketing/widgets/bigPromoPDP/presentation/BigPromoPDPVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "logo", "Lru/ozon/app/android/marketing/widgets/bigPromoPDP/data/BigPromoPDPDTO$AnimatedCounterDTO;", "counter", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "stockText", "stockNumber", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "chevronIcon", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "rightButton", "Lru/ozon/app/android/marketing/widgets/bigPromoPDP/presentation/BigPromoPDPVO$TimerBadgeVO;", "timerBadge", "Lru/ozon/app/android/marketing/widgets/bigPromoPDP/presentation/BigPromoPDPVO$PaddingsVO;", "paddings", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "buttonAction", "", "widgetBackgroundColor", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "", "shouldAnimateProgress", "<init>", "(JLru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/app/android/marketing/widgets/bigPromoPDP/data/BigPromoPDPDTO$AnimatedCounterDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/app/android/marketing/widgets/bigPromoPDP/presentation/BigPromoPDPVO$TimerBadgeVO;Lru/ozon/app/android/marketing/widgets/bigPromoPDP/presentation/BigPromoPDPVO$PaddingsVO;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/af/AtomAction;Ljava/lang/String;LWZ/t;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getLogo", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Lru/ozon/app/android/marketing/widgets/bigPromoPDP/data/BigPromoPDPDTO$AnimatedCounterDTO;", "getCounter", "()Lru/ozon/app/android/marketing/widgets/bigPromoPDP/data/BigPromoPDPDTO$AnimatedCounterDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getStockText", "getStockNumber", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getChevronIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getRightButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Lru/ozon/app/android/marketing/widgets/bigPromoPDP/presentation/BigPromoPDPVO$TimerBadgeVO;", "getTimerBadge", "()Lru/ozon/app/android/marketing/widgets/bigPromoPDP/presentation/BigPromoPDPVO$TimerBadgeVO;", "Lru/ozon/app/android/marketing/widgets/bigPromoPDP/presentation/BigPromoPDPVO$PaddingsVO;", "getPaddings", "()Lru/ozon/app/android/marketing/widgets/bigPromoPDP/presentation/BigPromoPDPVO$PaddingsVO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "getButtonAction", "Ljava/lang/String;", "getWidgetBackgroundColor", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Z", "getShouldAnimateProgress", "()Z", "TimerBadgeVO", "PaddingsVO", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class BigPromoPDPVO implements c {
    private final AtomAction action;
    private final AtomAction buttonAction;
    private final IconDTO chevronIcon;
    private final BigPromoPDPDTO.AnimatedCounterDTO counter;
    private final long id;
    private final ImageDTO logo;

    @NotNull
    private final PaddingsVO paddings;
    private final ButtonV3DTO rightButton;
    private final boolean shouldAnimateProgress;
    private final TextDTO stockNumber;
    private final TextDTO stockText;
    private final TimerBadgeVO timerBadge;

    @NotNull
    private final TextDTO title;
    private final t tokenizedEvent;
    private final String widgetBackgroundColor;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0014\u0010\f¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/marketing/widgets/bigPromoPDP/presentation/BigPromoPDPVO$PaddingsVO;", "", "", "top", "bottom", "textStart", "<init>", "(III)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getTop", "getBottom", "getTextStart", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PaddingsVO {
        private final int bottom;
        private final int textStart;
        private final int top;

        public PaddingsVO(int i11, int i12, int i13) {
            this.top = i11;
            this.bottom = i12;
            this.textStart = i13;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaddingsVO)) {
                return false;
            }
            PaddingsVO paddingsVO = (PaddingsVO) other;
            return this.top == paddingsVO.top && this.bottom == paddingsVO.bottom && this.textStart == paddingsVO.textStart;
        }

        public final int getBottom() {
            return this.bottom;
        }

        public final int getTextStart() {
            return this.textStart;
        }

        public final int getTop() {
            return this.top;
        }

        public int hashCode() {
            return Integer.hashCode(this.textStart) + C2454a.a(this.bottom, Integer.hashCode(this.top) * 31, 31);
        }

        @NotNull
        public String toString() {
            return b.e(this.textStart, ")", C2438a.a("PaddingsVO(top=", this.top, ", bottom=", ", textStart=", this.bottom));
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u001f\u0010\u0018R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/marketing/widgets/bigPromoPDP/presentation/BigPromoPDPVO$TimerBadgeVO;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "timerText", "", "secondsLeft", "timerStyle", "", "backgroundColor", "onExpiredText", "timestampEnd", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/Long;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;J)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTimerText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/lang/Long;", "getSecondsLeft", "()Ljava/lang/Long;", "getTimerStyle", "Ljava/lang/String;", "getBackgroundColor", "getOnExpiredText", "J", "getTimestampEnd", "()J", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TimerBadgeVO {
        private final String backgroundColor;
        private final TextDTO onExpiredText;
        private final Long secondsLeft;
        private final TextDTO timerStyle;
        private final TextDTO timerText;
        private final long timestampEnd;

        public TimerBadgeVO(TextDTO textDTO, Long l11, TextDTO textDTO2, String str, TextDTO textDTO3, long j11) {
            this.timerText = textDTO;
            this.secondsLeft = l11;
            this.timerStyle = textDTO2;
            this.backgroundColor = str;
            this.onExpiredText = textDTO3;
            this.timestampEnd = j11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TimerBadgeVO)) {
                return false;
            }
            TimerBadgeVO timerBadgeVO = (TimerBadgeVO) other;
            return Intrinsics.d(this.timerText, timerBadgeVO.timerText) && Intrinsics.d(this.secondsLeft, timerBadgeVO.secondsLeft) && Intrinsics.d(this.timerStyle, timerBadgeVO.timerStyle) && Intrinsics.d(this.backgroundColor, timerBadgeVO.backgroundColor) && Intrinsics.d(this.onExpiredText, timerBadgeVO.onExpiredText) && this.timestampEnd == timerBadgeVO.timestampEnd;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final TextDTO getOnExpiredText() {
            return this.onExpiredText;
        }

        public final Long getSecondsLeft() {
            return this.secondsLeft;
        }

        public final TextDTO getTimerStyle() {
            return this.timerStyle;
        }

        public final TextDTO getTimerText() {
            return this.timerText;
        }

        public final long getTimestampEnd() {
            return this.timestampEnd;
        }

        public int hashCode() {
            TextDTO textDTO = this.timerText;
            int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
            Long l11 = this.secondsLeft;
            int hashCode2 = (hashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
            TextDTO textDTO2 = this.timerStyle;
            int hashCode3 = (hashCode2 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
            String str = this.backgroundColor;
            int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            TextDTO textDTO3 = this.onExpiredText;
            return Long.hashCode(this.timestampEnd) + ((hashCode4 + (textDTO3 != null ? textDTO3.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            return "TimerBadgeVO(timerText=" + this.timerText + ", secondsLeft=" + this.secondsLeft + ", timerStyle=" + this.timerStyle + ", backgroundColor=" + this.backgroundColor + ", onExpiredText=" + this.onExpiredText + ", timestampEnd=" + this.timestampEnd + ")";
        }
    }

    public BigPromoPDPVO(long j11, ImageDTO imageDTO, BigPromoPDPDTO.AnimatedCounterDTO animatedCounterDTO, @NotNull TextDTO title, TextDTO textDTO, TextDTO textDTO2, IconDTO iconDTO, ButtonV3DTO buttonV3DTO, TimerBadgeVO timerBadgeVO, @NotNull PaddingsVO paddings, AtomAction atomAction, AtomAction atomAction2, String str, t tVar, boolean z11) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        this.id = j11;
        this.logo = imageDTO;
        this.counter = animatedCounterDTO;
        this.title = title;
        this.stockText = textDTO;
        this.stockNumber = textDTO2;
        this.chevronIcon = iconDTO;
        this.rightButton = buttonV3DTO;
        this.timerBadge = timerBadgeVO;
        this.paddings = paddings;
        this.action = atomAction;
        this.buttonAction = atomAction2;
        this.widgetBackgroundColor = str;
        this.tokenizedEvent = tVar;
        this.shouldAnimateProgress = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BigPromoPDPVO)) {
            return false;
        }
        BigPromoPDPVO bigPromoPDPVO = (BigPromoPDPVO) other;
        return this.id == bigPromoPDPVO.id && Intrinsics.d(this.logo, bigPromoPDPVO.logo) && Intrinsics.d(this.counter, bigPromoPDPVO.counter) && Intrinsics.d(this.title, bigPromoPDPVO.title) && Intrinsics.d(this.stockText, bigPromoPDPVO.stockText) && Intrinsics.d(this.stockNumber, bigPromoPDPVO.stockNumber) && Intrinsics.d(this.chevronIcon, bigPromoPDPVO.chevronIcon) && Intrinsics.d(this.rightButton, bigPromoPDPVO.rightButton) && Intrinsics.d(this.timerBadge, bigPromoPDPVO.timerBadge) && Intrinsics.d(this.paddings, bigPromoPDPVO.paddings) && Intrinsics.d(this.action, bigPromoPDPVO.action) && Intrinsics.d(this.buttonAction, bigPromoPDPVO.buttonAction) && Intrinsics.d(this.widgetBackgroundColor, bigPromoPDPVO.widgetBackgroundColor) && Intrinsics.d(this.tokenizedEvent, bigPromoPDPVO.tokenizedEvent) && this.shouldAnimateProgress == bigPromoPDPVO.shouldAnimateProgress;
    }

    public final AtomAction getAction() {
        return this.action;
    }

    public final IconDTO getChevronIcon() {
        return this.chevronIcon;
    }

    public final BigPromoPDPDTO.AnimatedCounterDTO getCounter() {
        return this.counter;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final ImageDTO getLogo() {
        return this.logo;
    }

    @NotNull
    public final PaddingsVO getPaddings() {
        return this.paddings;
    }

    public final ButtonV3DTO getRightButton() {
        return this.rightButton;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final boolean getShouldAnimateProgress() {
        return this.shouldAnimateProgress;
    }

    public final TextDTO getStockNumber() {
        return this.stockNumber;
    }

    public final TextDTO getStockText() {
        return this.stockText;
    }

    public final TimerBadgeVO getTimerBadge() {
        return this.timerBadge;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public final String getWidgetBackgroundColor() {
        return this.widgetBackgroundColor;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        ImageDTO imageDTO = this.logo;
        int hashCode2 = (hashCode + (imageDTO == null ? 0 : imageDTO.hashCode())) * 31;
        BigPromoPDPDTO.AnimatedCounterDTO animatedCounterDTO = this.counter;
        int a11 = Ns.b.a(this.title, (hashCode2 + (animatedCounterDTO == null ? 0 : animatedCounterDTO.hashCode())) * 31, 31);
        TextDTO textDTO = this.stockText;
        int hashCode3 = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        TextDTO textDTO2 = this.stockNumber;
        int hashCode4 = (hashCode3 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
        IconDTO iconDTO = this.chevronIcon;
        int hashCode5 = (hashCode4 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
        ButtonV3DTO buttonV3DTO = this.rightButton;
        int hashCode6 = (hashCode5 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
        TimerBadgeVO timerBadgeVO = this.timerBadge;
        int hashCode7 = (this.paddings.hashCode() + ((hashCode6 + (timerBadgeVO == null ? 0 : timerBadgeVO.hashCode())) * 31)) * 31;
        AtomAction atomAction = this.action;
        int hashCode8 = (hashCode7 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        AtomAction atomAction2 = this.buttonAction;
        int hashCode9 = (hashCode8 + (atomAction2 == null ? 0 : atomAction2.hashCode())) * 31;
        String str = this.widgetBackgroundColor;
        int hashCode10 = (hashCode9 + (str == null ? 0 : str.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return Boolean.hashCode(this.shouldAnimateProgress) + ((hashCode10 + (tVar != null ? tVar.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        ImageDTO imageDTO = this.logo;
        BigPromoPDPDTO.AnimatedCounterDTO animatedCounterDTO = this.counter;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.stockText;
        TextDTO textDTO3 = this.stockNumber;
        IconDTO iconDTO = this.chevronIcon;
        ButtonV3DTO buttonV3DTO = this.rightButton;
        TimerBadgeVO timerBadgeVO = this.timerBadge;
        PaddingsVO paddingsVO = this.paddings;
        AtomAction atomAction = this.action;
        AtomAction atomAction2 = this.buttonAction;
        String str = this.widgetBackgroundColor;
        t tVar = this.tokenizedEvent;
        boolean z11 = this.shouldAnimateProgress;
        StringBuilder c11 = Nh.b.c("BigPromoPDPVO(id=", j11, ", logo=", imageDTO);
        c11.append(", counter=");
        c11.append(animatedCounterDTO);
        c11.append(", title=");
        c11.append(textDTO);
        g.i(", stockText=", ", stockNumber=", c11, textDTO2, textDTO3);
        c11.append(", chevronIcon=");
        c11.append(iconDTO);
        c11.append(", rightButton=");
        c11.append(buttonV3DTO);
        c11.append(", timerBadge=");
        c11.append(timerBadgeVO);
        c11.append(", paddings=");
        c11.append(paddingsVO);
        c11.append(", action=");
        c11.append(atomAction);
        c11.append(", buttonAction=");
        c11.append(atomAction2);
        a.f(c11, ", widgetBackgroundColor=", str, ", tokenizedEvent=", tVar);
        return Bi.b.f(c11, ", shouldAnimateProgress=", z11, ")");
    }

    public /* synthetic */ BigPromoPDPVO(long j11, ImageDTO imageDTO, BigPromoPDPDTO.AnimatedCounterDTO animatedCounterDTO, TextDTO textDTO, TextDTO textDTO2, TextDTO textDTO3, IconDTO iconDTO, ButtonV3DTO buttonV3DTO, TimerBadgeVO timerBadgeVO, PaddingsVO paddingsVO, AtomAction atomAction, AtomAction atomAction2, String str, t tVar, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, imageDTO, animatedCounterDTO, textDTO, textDTO2, textDTO3, iconDTO, buttonV3DTO, timerBadgeVO, paddingsVO, atomAction, atomAction2, str, tVar, (i11 & 16384) != 0 ? true : z11);
    }
}
