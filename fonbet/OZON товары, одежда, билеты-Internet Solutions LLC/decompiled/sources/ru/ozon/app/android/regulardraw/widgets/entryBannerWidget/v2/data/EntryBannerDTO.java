package ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v2.data;

import B3.p;
import C.o0;
import D40.a;
import G.g;
import GR.b;
import Tz.C4055a;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001:\u0004&'()BS\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J_\u0010\u001f\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006*"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/data/EntryBannerDTO;", "", "blocks", "", "animationName", "", "backgroundColor", "clickAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "widgetViewTrackingAction", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getBlocks", "()Ljava/util/List;", "getAnimationName", "()Ljava/lang/String;", "getBackgroundColor", "getClickAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getWidgetViewTrackingAction", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "TitleTimerWithBadge", "TextWithBadge", "TimerText", "TitleBadge", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class EntryBannerDTO {
    public static final int $stable = 8;

    @NotNull
    private final String animationName;
    private final String backgroundColor;

    @NotNull
    private final List<Object> blocks;
    private final AtomActionDTO clickAction;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    private final AtomActionDTO widgetViewTrackingAction;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/data/EntryBannerDTO$TextWithBadge;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "titleBadge", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/data/EntryBannerDTO$TitleBadge;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/data/EntryBannerDTO$TitleBadge;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitleBadge", "()Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/data/EntryBannerDTO$TitleBadge;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TextWithBadge {
        public static final int $stable = 0;

        @NotNull
        private final TextDTO title;

        @NotNull
        private final TitleBadge titleBadge;

        public TextWithBadge(@NotNull TextDTO title, @NotNull TitleBadge titleBadge) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(titleBadge, "titleBadge");
            this.title = title;
            this.titleBadge = titleBadge;
        }

        public static /* synthetic */ TextWithBadge copy$default(TextWithBadge textWithBadge, TextDTO textDTO, TitleBadge titleBadge, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = textWithBadge.title;
            }
            if ((i11 & 2) != 0) {
                titleBadge = textWithBadge.titleBadge;
            }
            return textWithBadge.copy(textDTO, titleBadge);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TitleBadge getTitleBadge() {
            return this.titleBadge;
        }

        @NotNull
        public final TextWithBadge copy(@NotNull TextDTO title, @NotNull TitleBadge titleBadge) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(titleBadge, "titleBadge");
            return new TextWithBadge(title, titleBadge);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextWithBadge)) {
                return false;
            }
            TextWithBadge textWithBadge = (TextWithBadge) other;
            return Intrinsics.d(this.title, textWithBadge.title) && Intrinsics.d(this.titleBadge, textWithBadge.titleBadge);
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        public final TitleBadge getTitleBadge() {
            return this.titleBadge;
        }

        public int hashCode() {
            return this.titleBadge.hashCode() + (this.title.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "TextWithBadge(title=" + this.title + ", titleBadge=" + this.titleBadge + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J5\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/data/EntryBannerDTO$TimerText;", "", "leadingText", "Lru/ozon/uni/atoms/data/text/TextDTO;", "expireDate", "Lorg/joda/time/DateTime;", "trailingText", "", "deadlineAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lorg/joda/time/DateTime;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getLeadingText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getExpireDate", "()Lorg/joda/time/DateTime;", "getTrailingText", "()Ljava/lang/String;", "getDeadlineAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TimerText {
        public static final int $stable = 8;
        private final AtomActionDTO deadlineAction;

        @NotNull
        private final DateTime expireDate;

        @NotNull
        private final TextDTO leadingText;
        private final String trailingText;

        public TimerText(@NotNull TextDTO leadingText, @NotNull DateTime expireDate, String str, AtomActionDTO atomActionDTO) {
            Intrinsics.checkNotNullParameter(leadingText, "leadingText");
            Intrinsics.checkNotNullParameter(expireDate, "expireDate");
            this.leadingText = leadingText;
            this.expireDate = expireDate;
            this.trailingText = str;
            this.deadlineAction = atomActionDTO;
        }

        public static /* synthetic */ TimerText copy$default(TimerText timerText, TextDTO textDTO, DateTime dateTime, String str, AtomActionDTO atomActionDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = timerText.leadingText;
            }
            if ((i11 & 2) != 0) {
                dateTime = timerText.expireDate;
            }
            if ((i11 & 4) != 0) {
                str = timerText.trailingText;
            }
            if ((i11 & 8) != 0) {
                atomActionDTO = timerText.deadlineAction;
            }
            return timerText.copy(textDTO, dateTime, str, atomActionDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getLeadingText() {
            return this.leadingText;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final DateTime getExpireDate() {
            return this.expireDate;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTrailingText() {
            return this.trailingText;
        }

        /* renamed from: component4, reason: from getter */
        public final AtomActionDTO getDeadlineAction() {
            return this.deadlineAction;
        }

        @NotNull
        public final TimerText copy(@NotNull TextDTO leadingText, @NotNull DateTime expireDate, String trailingText, AtomActionDTO deadlineAction) {
            Intrinsics.checkNotNullParameter(leadingText, "leadingText");
            Intrinsics.checkNotNullParameter(expireDate, "expireDate");
            return new TimerText(leadingText, expireDate, trailingText, deadlineAction);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TimerText)) {
                return false;
            }
            TimerText timerText = (TimerText) other;
            return Intrinsics.d(this.leadingText, timerText.leadingText) && Intrinsics.d(this.expireDate, timerText.expireDate) && Intrinsics.d(this.trailingText, timerText.trailingText) && Intrinsics.d(this.deadlineAction, timerText.deadlineAction);
        }

        public final AtomActionDTO getDeadlineAction() {
            return this.deadlineAction;
        }

        @NotNull
        public final DateTime getExpireDate() {
            return this.expireDate;
        }

        @NotNull
        public final TextDTO getLeadingText() {
            return this.leadingText;
        }

        public final String getTrailingText() {
            return this.trailingText;
        }

        public int hashCode() {
            int a11 = b.a(this.expireDate, this.leadingText.hashCode() * 31, 31);
            String str = this.trailingText;
            int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.deadlineAction;
            return hashCode + (atomActionDTO != null ? atomActionDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "TimerText(leadingText=" + this.leadingText + ", expireDate=" + this.expireDate + ", trailingText=" + this.trailingText + ", deadlineAction=" + this.deadlineAction + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/data/EntryBannerDTO$TitleBadge;", "", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "icon", "", "backgroundColor", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getIcon", "()Ljava/lang/String;", "getBackgroundColor", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TitleBadge {
        public static final int $stable = 0;

        @NotNull
        private final String backgroundColor;

        @NotNull
        private final String icon;

        @NotNull
        private final TextDTO text;

        public TitleBadge(@NotNull TextDTO text, @NotNull String icon, @NotNull String backgroundColor) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            this.text = text;
            this.icon = icon;
            this.backgroundColor = backgroundColor;
        }

        public static /* synthetic */ TitleBadge copy$default(TitleBadge titleBadge, TextDTO textDTO, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = titleBadge.text;
            }
            if ((i11 & 2) != 0) {
                str = titleBadge.icon;
            }
            if ((i11 & 4) != 0) {
                str2 = titleBadge.backgroundColor;
            }
            return titleBadge.copy(textDTO, str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getText() {
            return this.text;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final TitleBadge copy(@NotNull TextDTO text, @NotNull String icon, @NotNull String backgroundColor) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            return new TitleBadge(text, icon, backgroundColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TitleBadge)) {
                return false;
            }
            TitleBadge titleBadge = (TitleBadge) other;
            return Intrinsics.d(this.text, titleBadge.text) && Intrinsics.d(this.icon, titleBadge.icon) && Intrinsics.d(this.backgroundColor, titleBadge.backgroundColor);
        }

        @NotNull
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final String getIcon() {
            return this.icon;
        }

        @NotNull
        public final TextDTO getText() {
            return this.text;
        }

        public int hashCode() {
            return this.backgroundColor.hashCode() + g.a(this.text.hashCode() * 31, 31, this.icon);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.text;
            String str = this.icon;
            return o0.c(D3.g.f("TitleBadge(text=", textDTO, ", icon=", str, ", backgroundColor="), this.backgroundColor, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/data/EntryBannerDTO$TitleTimerWithBadge;", "", "timerText", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/data/EntryBannerDTO$TimerText;", "titleBadge", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/data/EntryBannerDTO$TitleBadge;", "<init>", "(Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/data/EntryBannerDTO$TimerText;Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/data/EntryBannerDTO$TitleBadge;)V", "getTimerText", "()Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/data/EntryBannerDTO$TimerText;", "getTitleBadge", "()Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/data/EntryBannerDTO$TitleBadge;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TitleTimerWithBadge {
        public static final int $stable = 8;

        @NotNull
        private final TimerText timerText;

        @NotNull
        private final TitleBadge titleBadge;

        public TitleTimerWithBadge(@NotNull TimerText timerText, @NotNull TitleBadge titleBadge) {
            Intrinsics.checkNotNullParameter(timerText, "timerText");
            Intrinsics.checkNotNullParameter(titleBadge, "titleBadge");
            this.timerText = timerText;
            this.titleBadge = titleBadge;
        }

        public static /* synthetic */ TitleTimerWithBadge copy$default(TitleTimerWithBadge titleTimerWithBadge, TimerText timerText, TitleBadge titleBadge, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                timerText = titleTimerWithBadge.timerText;
            }
            if ((i11 & 2) != 0) {
                titleBadge = titleTimerWithBadge.titleBadge;
            }
            return titleTimerWithBadge.copy(timerText, titleBadge);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TimerText getTimerText() {
            return this.timerText;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TitleBadge getTitleBadge() {
            return this.titleBadge;
        }

        @NotNull
        public final TitleTimerWithBadge copy(@NotNull TimerText timerText, @NotNull TitleBadge titleBadge) {
            Intrinsics.checkNotNullParameter(timerText, "timerText");
            Intrinsics.checkNotNullParameter(titleBadge, "titleBadge");
            return new TitleTimerWithBadge(timerText, titleBadge);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TitleTimerWithBadge)) {
                return false;
            }
            TitleTimerWithBadge titleTimerWithBadge = (TitleTimerWithBadge) other;
            return Intrinsics.d(this.timerText, titleTimerWithBadge.timerText) && Intrinsics.d(this.titleBadge, titleTimerWithBadge.titleBadge);
        }

        @NotNull
        public final TimerText getTimerText() {
            return this.timerText;
        }

        @NotNull
        public final TitleBadge getTitleBadge() {
            return this.titleBadge;
        }

        public int hashCode() {
            return this.titleBadge.hashCode() + (this.timerText.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "TitleTimerWithBadge(timerText=" + this.timerText + ", titleBadge=" + this.titleBadge + ")";
        }
    }

    public EntryBannerDTO(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "textWithBadge", type = TextWithBadge.class), @ProtoOneOfSignature(name = "titleTimerWithBadge", type = TitleTimerWithBadge.class), @ProtoOneOfSignature(name = "text", type = TextDTO.class), @ProtoOneOfSignature(name = "timerText", type = TimerText.class), @ProtoOneOfSignature(name = "badge", type = BadgeDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> blocks, @NotNull String animationName, String str, AtomActionDTO atomActionDTO, AtomActionDTO atomActionDTO2, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        Intrinsics.checkNotNullParameter(animationName, "animationName");
        this.blocks = blocks;
        this.animationName = animationName;
        this.backgroundColor = str;
        this.clickAction = atomActionDTO;
        this.widgetViewTrackingAction = atomActionDTO2;
        this.trackingInfo = map;
    }

    public static /* synthetic */ EntryBannerDTO copy$default(EntryBannerDTO entryBannerDTO, List list, String str, String str2, AtomActionDTO atomActionDTO, AtomActionDTO atomActionDTO2, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = entryBannerDTO.blocks;
        }
        if ((i11 & 2) != 0) {
            str = entryBannerDTO.animationName;
        }
        if ((i11 & 4) != 0) {
            str2 = entryBannerDTO.backgroundColor;
        }
        if ((i11 & 8) != 0) {
            atomActionDTO = entryBannerDTO.clickAction;
        }
        if ((i11 & 16) != 0) {
            atomActionDTO2 = entryBannerDTO.widgetViewTrackingAction;
        }
        if ((i11 & 32) != 0) {
            map = entryBannerDTO.trackingInfo;
        }
        AtomActionDTO atomActionDTO3 = atomActionDTO2;
        Map map2 = map;
        return entryBannerDTO.copy(list, str, str2, atomActionDTO, atomActionDTO3, map2);
    }

    @NotNull
    public final List<Object> component1() {
        return this.blocks;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getAnimationName() {
        return this.animationName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component4, reason: from getter */
    public final AtomActionDTO getClickAction() {
        return this.clickAction;
    }

    /* renamed from: component5, reason: from getter */
    public final AtomActionDTO getWidgetViewTrackingAction() {
        return this.widgetViewTrackingAction;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    @NotNull
    public final EntryBannerDTO copy(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "textWithBadge", type = TextWithBadge.class), @ProtoOneOfSignature(name = "titleTimerWithBadge", type = TitleTimerWithBadge.class), @ProtoOneOfSignature(name = "text", type = TextDTO.class), @ProtoOneOfSignature(name = "timerText", type = TimerText.class), @ProtoOneOfSignature(name = "badge", type = BadgeDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> blocks, @NotNull String animationName, String backgroundColor, AtomActionDTO clickAction, AtomActionDTO widgetViewTrackingAction, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        Intrinsics.checkNotNullParameter(animationName, "animationName");
        return new EntryBannerDTO(blocks, animationName, backgroundColor, clickAction, widgetViewTrackingAction, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EntryBannerDTO)) {
            return false;
        }
        EntryBannerDTO entryBannerDTO = (EntryBannerDTO) other;
        return Intrinsics.d(this.blocks, entryBannerDTO.blocks) && Intrinsics.d(this.animationName, entryBannerDTO.animationName) && Intrinsics.d(this.backgroundColor, entryBannerDTO.backgroundColor) && Intrinsics.d(this.clickAction, entryBannerDTO.clickAction) && Intrinsics.d(this.widgetViewTrackingAction, entryBannerDTO.widgetViewTrackingAction) && Intrinsics.d(this.trackingInfo, entryBannerDTO.trackingInfo);
    }

    @NotNull
    public final String getAnimationName() {
        return this.animationName;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final List<Object> getBlocks() {
        return this.blocks;
    }

    public final AtomActionDTO getClickAction() {
        return this.clickAction;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public final AtomActionDTO getWidgetViewTrackingAction() {
        return this.widgetViewTrackingAction;
    }

    public int hashCode() {
        int a11 = g.a(this.blocks.hashCode() * 31, 31, this.animationName);
        String str = this.backgroundColor;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.clickAction;
        int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        AtomActionDTO atomActionDTO2 = this.widgetViewTrackingAction;
        int hashCode3 = (hashCode2 + (atomActionDTO2 == null ? 0 : atomActionDTO2.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<Object> list = this.blocks;
        String str = this.animationName;
        String str2 = this.backgroundColor;
        AtomActionDTO atomActionDTO = this.clickAction;
        AtomActionDTO atomActionDTO2 = this.widgetViewTrackingAction;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder a11 = C4055a.a("EntryBannerDTO(blocks=", ", animationName=", str, ", backgroundColor=", list);
        p.c(str2, ", clickAction=", ", widgetViewTrackingAction=", a11, atomActionDTO);
        return a.d(a11, atomActionDTO2, ", trackingInfo=", map, ")");
    }
}
