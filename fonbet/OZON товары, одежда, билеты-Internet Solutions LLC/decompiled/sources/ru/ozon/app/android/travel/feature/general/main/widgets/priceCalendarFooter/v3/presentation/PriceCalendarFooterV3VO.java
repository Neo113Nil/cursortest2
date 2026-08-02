package ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarFooter.v3.presentation;

import Ak.C2436a;
import Tl.b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.molecules.view.buttonsRow.ButtonsRowVO;
import ru.ozon.uni.atoms.data.common.CornerRadius;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u001fB!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ0\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v3/presentation/PriceCalendarFooterV3VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "asyncData", "Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v3/presentation/PriceCalendarFooterV3VO$Content;", "content", "<init>", "(JLjava/lang/String;Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v3/presentation/PriceCalendarFooterV3VO$Content;)V", "copy", "(JLjava/lang/String;Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v3/presentation/PriceCalendarFooterV3VO$Content;)Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v3/presentation/PriceCalendarFooterV3VO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getAsyncData", "Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v3/presentation/PriceCalendarFooterV3VO$Content;", "getContent", "()Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v3/presentation/PriceCalendarFooterV3VO$Content;", "Content", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PriceCalendarFooterV3VO implements c {
    private final String asyncData;

    @NotNull
    private final Content content;
    private final long id;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v3/presentation/PriceCalendarFooterV3VO$Content;", "", "Lru/ozon/app/android/travel/molecules/view/buttonsRow/ButtonsRowVO;", "buttonsRow", "", "backgroundColor", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "topRadius", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "<init>", "(Lru/ozon/app/android/travel/molecules/view/buttonsRow/ButtonsRowVO;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/molecules/view/buttonsRow/ButtonsRowVO;", "getButtonsRow", "()Lru/ozon/app/android/travel/molecules/view/buttonsRow/ButtonsRowVO;", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "getTopRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Content {
        private final String backgroundColor;
        private final ButtonsRowVO buttonsRow;

        @NotNull
        private final CornerRadius topRadius;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public Content(ButtonsRowVO buttonsRowVO, String str, @NotNull CornerRadius topRadius, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(topRadius, "topRadius");
            this.buttonsRow = buttonsRowVO;
            this.backgroundColor = str;
            this.topRadius = topRadius;
            this.trackingInfo = map;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Content)) {
                return false;
            }
            Content content = (Content) other;
            return Intrinsics.d(this.buttonsRow, content.buttonsRow) && Intrinsics.d(this.backgroundColor, content.backgroundColor) && this.topRadius == content.topRadius && Intrinsics.d(this.trackingInfo, content.trackingInfo);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final ButtonsRowVO getButtonsRow() {
            return this.buttonsRow;
        }

        @NotNull
        public final CornerRadius getTopRadius() {
            return this.topRadius;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            ButtonsRowVO buttonsRowVO = this.buttonsRow;
            int hashCode = (buttonsRowVO == null ? 0 : buttonsRowVO.hashCode()) * 31;
            String str = this.backgroundColor;
            int b11 = b.b(this.topRadius, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return b11 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Content(buttonsRow=" + this.buttonsRow + ", backgroundColor=" + this.backgroundColor + ", topRadius=" + this.topRadius + ", trackingInfo=" + this.trackingInfo + ")";
        }
    }

    public PriceCalendarFooterV3VO(long j11, String str, @NotNull Content content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.id = j11;
        this.asyncData = str;
        this.content = content;
    }

    public static /* synthetic */ PriceCalendarFooterV3VO copy$default(PriceCalendarFooterV3VO priceCalendarFooterV3VO, long j11, String str, Content content, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = priceCalendarFooterV3VO.id;
        }
        if ((i11 & 2) != 0) {
            str = priceCalendarFooterV3VO.asyncData;
        }
        if ((i11 & 4) != 0) {
            content = priceCalendarFooterV3VO.content;
        }
        return priceCalendarFooterV3VO.copy(j11, str, content);
    }

    @NotNull
    public final PriceCalendarFooterV3VO copy(long id2, String asyncData, @NotNull Content content) {
        Intrinsics.checkNotNullParameter(content, "content");
        return new PriceCalendarFooterV3VO(id2, asyncData, content);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PriceCalendarFooterV3VO)) {
            return false;
        }
        PriceCalendarFooterV3VO priceCalendarFooterV3VO = (PriceCalendarFooterV3VO) other;
        return this.id == priceCalendarFooterV3VO.id && Intrinsics.d(this.asyncData, priceCalendarFooterV3VO.asyncData) && Intrinsics.d(this.content, priceCalendarFooterV3VO.content);
    }

    public final String getAsyncData() {
        return this.asyncData;
    }

    @NotNull
    public final Content getContent() {
        return this.content;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        String str = this.asyncData;
        return this.content.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.asyncData;
        Content content = this.content;
        StringBuilder c11 = C2436a.c(j11, "PriceCalendarFooterV3VO(id=", ", asyncData=", str);
        c11.append(", content=");
        c11.append(content);
        c11.append(")");
        return c11.toString();
    }
}
