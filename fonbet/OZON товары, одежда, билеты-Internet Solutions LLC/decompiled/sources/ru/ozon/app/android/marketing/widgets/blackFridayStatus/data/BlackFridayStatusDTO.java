package ru.ozon.app.android.marketing.widgets.blackFridayStatus.data;

import B90.C2619v;
import T7.P;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.stock.StockBar;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "textTitleLayout", type = TextTitleLayout.class), @ProtoOneOfSignature(name = "imageTitleLayout", type = ImageTitleLayout.class)})
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/marketing/widgets/blackFridayStatus/data/BlackFridayStatusDTO;", "", "<init>", "()V", "TextTitleLayout", "ImageTitleLayout", "Lru/ozon/app/android/marketing/widgets/blackFridayStatus/data/BlackFridayStatusDTO$ImageTitleLayout;", "Lru/ozon/app/android/marketing/widgets/blackFridayStatus/data/BlackFridayStatusDTO$TextTitleLayout;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ProtoOneOf(label = "type")
/* loaded from: classes12.dex */
public abstract class BlackFridayStatusDTO {
    public static final int $stable = 0;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003J\u0017\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fHÆ\u0003JW\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fHÆ\u0001J\u0013\u0010#\u001a\u00020\u00032\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006)"}, d2 = {"Lru/ozon/app/android/marketing/widgets/blackFridayStatus/data/BlackFridayStatusDTO$ImageTitleLayout;", "Lru/ozon/app/android/marketing/widgets/blackFridayStatus/data/BlackFridayStatusDTO;", "leftImageDynamicSize", "", "leftImage", "Lru/ozon/app/android/marketing/widgets/blackFridayStatus/data/ImageDTO;", "titleImage", DynamicElementDTO.TIMER, "Lru/ozon/app/android/marketing/widgets/blackFridayStatus/data/TimerWithTitleDTO;", "stockBar", "Lru/ozon/app/android/atoms/data/stock/StockBar;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(ZLru/ozon/app/android/marketing/widgets/blackFridayStatus/data/ImageDTO;Lru/ozon/app/android/marketing/widgets/blackFridayStatus/data/ImageDTO;Lru/ozon/app/android/marketing/widgets/blackFridayStatus/data/TimerWithTitleDTO;Lru/ozon/app/android/atoms/data/stock/StockBar;Ljava/util/Map;)V", "getLeftImageDynamicSize", "()Z", "getLeftImage", "()Lru/ozon/app/android/marketing/widgets/blackFridayStatus/data/ImageDTO;", "getTitleImage", "getTimer", "()Lru/ozon/app/android/marketing/widgets/blackFridayStatus/data/TimerWithTitleDTO;", "getStockBar", "()Lru/ozon/app/android/atoms/data/stock/StockBar;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ImageTitleLayout extends BlackFridayStatusDTO {
        public static final int $stable = 8;

        @NotNull
        private final ImageDTO leftImage;
        private final boolean leftImageDynamicSize;
        private final StockBar stockBar;
        private final TimerWithTitleDTO timer;

        @NotNull
        private final ImageDTO titleImage;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ ImageTitleLayout(boolean r2, ru.ozon.app.android.marketing.widgets.blackFridayStatus.data.ImageDTO r3, ru.ozon.app.android.marketing.widgets.blackFridayStatus.data.ImageDTO r4, ru.ozon.app.android.marketing.widgets.blackFridayStatus.data.TimerWithTitleDTO r5, ru.ozon.app.android.atoms.data.stock.StockBar r6, java.util.Map r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
            /*
                r1 = this;
                r9 = r8 & 1
                if (r9 == 0) goto L5
                r2 = 0
            L5:
                r9 = r8 & 8
                r0 = 0
                if (r9 == 0) goto Lb
                r5 = r0
            Lb:
                r9 = r8 & 16
                if (r9 == 0) goto L10
                r6 = r0
            L10:
                r8 = r8 & 32
                if (r8 == 0) goto L1c
                r9 = r0
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
                goto L23
            L1c:
                r9 = r7
                r8 = r6
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
            L23:
                r3.<init>(r4, r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.marketing.widgets.blackFridayStatus.data.BlackFridayStatusDTO.ImageTitleLayout.<init>(boolean, ru.ozon.app.android.marketing.widgets.blackFridayStatus.data.ImageDTO, ru.ozon.app.android.marketing.widgets.blackFridayStatus.data.ImageDTO, ru.ozon.app.android.marketing.widgets.blackFridayStatus.data.TimerWithTitleDTO, ru.ozon.app.android.atoms.data.stock.StockBar, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public static /* synthetic */ ImageTitleLayout copy$default(ImageTitleLayout imageTitleLayout, boolean z11, ImageDTO imageDTO, ImageDTO imageDTO2, TimerWithTitleDTO timerWithTitleDTO, StockBar stockBar, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = imageTitleLayout.leftImageDynamicSize;
            }
            if ((i11 & 2) != 0) {
                imageDTO = imageTitleLayout.leftImage;
            }
            if ((i11 & 4) != 0) {
                imageDTO2 = imageTitleLayout.titleImage;
            }
            if ((i11 & 8) != 0) {
                timerWithTitleDTO = imageTitleLayout.timer;
            }
            if ((i11 & 16) != 0) {
                stockBar = imageTitleLayout.stockBar;
            }
            if ((i11 & 32) != 0) {
                map = imageTitleLayout.trackingInfo;
            }
            StockBar stockBar2 = stockBar;
            Map map2 = map;
            return imageTitleLayout.copy(z11, imageDTO, imageDTO2, timerWithTitleDTO, stockBar2, map2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getLeftImageDynamicSize() {
            return this.leftImageDynamicSize;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final ImageDTO getLeftImage() {
            return this.leftImage;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final ImageDTO getTitleImage() {
            return this.titleImage;
        }

        /* renamed from: component4, reason: from getter */
        public final TimerWithTitleDTO getTimer() {
            return this.timer;
        }

        /* renamed from: component5, reason: from getter */
        public final StockBar getStockBar() {
            return this.stockBar;
        }

        public final Map<String, TokenizedTrackingInfo> component6() {
            return this.trackingInfo;
        }

        @NotNull
        public final ImageTitleLayout copy(boolean leftImageDynamicSize, @NotNull ImageDTO leftImage, @NotNull ImageDTO titleImage, TimerWithTitleDTO timer, StockBar stockBar, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(leftImage, "leftImage");
            Intrinsics.checkNotNullParameter(titleImage, "titleImage");
            return new ImageTitleLayout(leftImageDynamicSize, leftImage, titleImage, timer, stockBar, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ImageTitleLayout)) {
                return false;
            }
            ImageTitleLayout imageTitleLayout = (ImageTitleLayout) other;
            return this.leftImageDynamicSize == imageTitleLayout.leftImageDynamicSize && Intrinsics.d(this.leftImage, imageTitleLayout.leftImage) && Intrinsics.d(this.titleImage, imageTitleLayout.titleImage) && Intrinsics.d(this.timer, imageTitleLayout.timer) && Intrinsics.d(this.stockBar, imageTitleLayout.stockBar) && Intrinsics.d(this.trackingInfo, imageTitleLayout.trackingInfo);
        }

        @NotNull
        public final ImageDTO getLeftImage() {
            return this.leftImage;
        }

        public final boolean getLeftImageDynamicSize() {
            return this.leftImageDynamicSize;
        }

        public final StockBar getStockBar() {
            return this.stockBar;
        }

        public final TimerWithTitleDTO getTimer() {
            return this.timer;
        }

        @NotNull
        public final ImageDTO getTitleImage() {
            return this.titleImage;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = (this.titleImage.hashCode() + ((this.leftImage.hashCode() + (Boolean.hashCode(this.leftImageDynamicSize) * 31)) * 31)) * 31;
            TimerWithTitleDTO timerWithTitleDTO = this.timer;
            int hashCode2 = (hashCode + (timerWithTitleDTO == null ? 0 : timerWithTitleDTO.hashCode())) * 31;
            StockBar stockBar = this.stockBar;
            int hashCode3 = (hashCode2 + (stockBar == null ? 0 : stockBar.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode3 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ImageTitleLayout(leftImageDynamicSize=" + this.leftImageDynamicSize + ", leftImage=" + this.leftImage + ", titleImage=" + this.titleImage + ", timer=" + this.timer + ", stockBar=" + this.stockBar + ", trackingInfo=" + this.trackingInfo + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ImageTitleLayout(boolean z11, @NotNull ImageDTO leftImage, @NotNull ImageDTO titleImage, TimerWithTitleDTO timerWithTitleDTO, StockBar stockBar, Map<String, TokenizedTrackingInfo> map) {
            super(null);
            Intrinsics.checkNotNullParameter(leftImage, "leftImage");
            Intrinsics.checkNotNullParameter(titleImage, "titleImage");
            this.leftImageDynamicSize = z11;
            this.leftImage = leftImage;
            this.titleImage = titleImage;
            this.timer = timerWithTitleDTO;
            this.stockBar = stockBar;
            this.trackingInfo = map;
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0017\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000eHÆ\u0003Je\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000eHÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006/"}, d2 = {"Lru/ozon/app/android/marketing/widgets/blackFridayStatus/data/BlackFridayStatusDTO$TextTitleLayout;", "Lru/ozon/app/android/marketing/widgets/blackFridayStatus/data/BlackFridayStatusDTO;", "leftImage", "Lru/ozon/app/android/marketing/widgets/blackFridayStatus/data/ImageDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subtitle", "stockBar", "Lru/ozon/app/android/atoms/data/stock/StockBar;", DynamicElementDTO.TIMER, "Lru/ozon/app/android/marketing/widgets/blackFridayStatus/data/TimerWithTitleDTO;", "button", "Lru/ozon/app/android/marketing/widgets/blackFridayStatus/data/ButtonWithTitle;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/marketing/widgets/blackFridayStatus/data/ImageDTO;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/atoms/data/stock/StockBar;Lru/ozon/app/android/marketing/widgets/blackFridayStatus/data/TimerWithTitleDTO;Lru/ozon/app/android/marketing/widgets/blackFridayStatus/data/ButtonWithTitle;Ljava/util/Map;)V", "getLeftImage", "()Lru/ozon/app/android/marketing/widgets/blackFridayStatus/data/ImageDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "getStockBar", "()Lru/ozon/app/android/atoms/data/stock/StockBar;", "getTimer", "()Lru/ozon/app/android/marketing/widgets/blackFridayStatus/data/TimerWithTitleDTO;", "getButton", "()Lru/ozon/app/android/marketing/widgets/blackFridayStatus/data/ButtonWithTitle;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "", "toString", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TextTitleLayout extends BlackFridayStatusDTO {
        public static final int $stable = 8;
        private final ButtonWithTitle button;

        @NotNull
        private final ImageDTO leftImage;
        private final StockBar stockBar;
        private final TextAtom subtitle;
        private final TimerWithTitleDTO timer;

        @NotNull
        private final TextAtom title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public /* synthetic */ TextTitleLayout(ImageDTO imageDTO, TextAtom textAtom, TextAtom textAtom2, StockBar stockBar, TimerWithTitleDTO timerWithTitleDTO, ButtonWithTitle buttonWithTitle, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(imageDTO, textAtom, (i11 & 4) != 0 ? null : textAtom2, (i11 & 8) != 0 ? null : stockBar, (i11 & 16) != 0 ? null : timerWithTitleDTO, (i11 & 32) != 0 ? null : buttonWithTitle, (i11 & 64) != 0 ? null : map);
        }

        public static /* synthetic */ TextTitleLayout copy$default(TextTitleLayout textTitleLayout, ImageDTO imageDTO, TextAtom textAtom, TextAtom textAtom2, StockBar stockBar, TimerWithTitleDTO timerWithTitleDTO, ButtonWithTitle buttonWithTitle, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                imageDTO = textTitleLayout.leftImage;
            }
            if ((i11 & 2) != 0) {
                textAtom = textTitleLayout.title;
            }
            if ((i11 & 4) != 0) {
                textAtom2 = textTitleLayout.subtitle;
            }
            if ((i11 & 8) != 0) {
                stockBar = textTitleLayout.stockBar;
            }
            if ((i11 & 16) != 0) {
                timerWithTitleDTO = textTitleLayout.timer;
            }
            if ((i11 & 32) != 0) {
                buttonWithTitle = textTitleLayout.button;
            }
            if ((i11 & 64) != 0) {
                map = textTitleLayout.trackingInfo;
            }
            ButtonWithTitle buttonWithTitle2 = buttonWithTitle;
            Map map2 = map;
            TimerWithTitleDTO timerWithTitleDTO2 = timerWithTitleDTO;
            TextAtom textAtom3 = textAtom2;
            return textTitleLayout.copy(imageDTO, textAtom, textAtom3, stockBar, timerWithTitleDTO2, buttonWithTitle2, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ImageDTO getLeftImage() {
            return this.leftImage;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextAtom getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final TextAtom getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component4, reason: from getter */
        public final StockBar getStockBar() {
            return this.stockBar;
        }

        /* renamed from: component5, reason: from getter */
        public final TimerWithTitleDTO getTimer() {
            return this.timer;
        }

        /* renamed from: component6, reason: from getter */
        public final ButtonWithTitle getButton() {
            return this.button;
        }

        public final Map<String, TokenizedTrackingInfo> component7() {
            return this.trackingInfo;
        }

        @NotNull
        public final TextTitleLayout copy(@NotNull ImageDTO leftImage, @NotNull TextAtom title, TextAtom subtitle, StockBar stockBar, TimerWithTitleDTO timer, ButtonWithTitle button, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(leftImage, "leftImage");
            Intrinsics.checkNotNullParameter(title, "title");
            return new TextTitleLayout(leftImage, title, subtitle, stockBar, timer, button, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextTitleLayout)) {
                return false;
            }
            TextTitleLayout textTitleLayout = (TextTitleLayout) other;
            return Intrinsics.d(this.leftImage, textTitleLayout.leftImage) && Intrinsics.d(this.title, textTitleLayout.title) && Intrinsics.d(this.subtitle, textTitleLayout.subtitle) && Intrinsics.d(this.stockBar, textTitleLayout.stockBar) && Intrinsics.d(this.timer, textTitleLayout.timer) && Intrinsics.d(this.button, textTitleLayout.button) && Intrinsics.d(this.trackingInfo, textTitleLayout.trackingInfo);
        }

        public final ButtonWithTitle getButton() {
            return this.button;
        }

        @NotNull
        public final ImageDTO getLeftImage() {
            return this.leftImage;
        }

        public final StockBar getStockBar() {
            return this.stockBar;
        }

        public final TextAtom getSubtitle() {
            return this.subtitle;
        }

        public final TimerWithTitleDTO getTimer() {
            return this.timer;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int b11 = C2619v.b(this.leftImage.hashCode() * 31, 31, this.title);
            TextAtom textAtom = this.subtitle;
            int hashCode = (b11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
            StockBar stockBar = this.stockBar;
            int hashCode2 = (hashCode + (stockBar == null ? 0 : stockBar.hashCode())) * 31;
            TimerWithTitleDTO timerWithTitleDTO = this.timer;
            int hashCode3 = (hashCode2 + (timerWithTitleDTO == null ? 0 : timerWithTitleDTO.hashCode())) * 31;
            ButtonWithTitle buttonWithTitle = this.button;
            int hashCode4 = (hashCode3 + (buttonWithTitle == null ? 0 : buttonWithTitle.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode4 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            ImageDTO imageDTO = this.leftImage;
            TextAtom textAtom = this.title;
            TextAtom textAtom2 = this.subtitle;
            StockBar stockBar = this.stockBar;
            TimerWithTitleDTO timerWithTitleDTO = this.timer;
            ButtonWithTitle buttonWithTitle = this.button;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("TextTitleLayout(leftImage=");
            sb2.append(imageDTO);
            sb2.append(", title=");
            sb2.append(textAtom);
            sb2.append(", subtitle=");
            sb2.append(textAtom2);
            sb2.append(", stockBar=");
            sb2.append(stockBar);
            sb2.append(", timer=");
            sb2.append(timerWithTitleDTO);
            sb2.append(", button=");
            sb2.append(buttonWithTitle);
            sb2.append(", trackingInfo=");
            return P.f(sb2, map, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TextTitleLayout(@NotNull ImageDTO leftImage, @NotNull TextAtom title, TextAtom textAtom, StockBar stockBar, TimerWithTitleDTO timerWithTitleDTO, ButtonWithTitle buttonWithTitle, Map<String, TokenizedTrackingInfo> map) {
            super(null);
            Intrinsics.checkNotNullParameter(leftImage, "leftImage");
            Intrinsics.checkNotNullParameter(title, "title");
            this.leftImage = leftImage;
            this.title = title;
            this.subtitle = textAtom;
            this.stockBar = stockBar;
            this.timer = timerWithTitleDTO;
            this.button = buttonWithTitle;
            this.trackingInfo = map;
        }
    }

    public /* synthetic */ BlackFridayStatusDTO(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private BlackFridayStatusDTO() {
    }
}
