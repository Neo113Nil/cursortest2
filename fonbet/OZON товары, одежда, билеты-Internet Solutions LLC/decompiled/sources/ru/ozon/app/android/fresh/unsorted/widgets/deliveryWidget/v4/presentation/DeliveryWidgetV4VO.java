package ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v4.presentation;

import B3.p;
import D40.b;
import E0.C2942q;
import G.g;
import Nh.a;
import Ve.C4598rp;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b)\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0004HIJKB\u0081\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u000e\u0010\u0019\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\u001a2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010)R\u001b\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010,R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00106\u001a\u0004\b7\u0010\u001fR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u00106\u001a\u0004\b8\u0010\u001fR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u0014\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010'\u001a\u0004\b<\u0010)R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010=\u001a\u0004\b>\u0010?R\u001f\u0010\u0019\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010@\u001a\u0004\bA\u0010BR\"\u0010\u001b\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010G¨\u0006L"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4VO$ContentBlockVO;", "deliveryConditionsBlocks", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4VO$ProgressVO;", "progress", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4VO$ChevronVO;", "chevron", "", "borderColor", "backgroundColor", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4VO$SpacersVO;", "spacers", "widgetUpdatePeriod", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "", "resetState", "<init>", "(JLl20/d;Ljava/util/List;Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4VO$ProgressVO;Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4VO$ChevronVO;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4VO$SpacersVO;JLru/ozon/uni/atoms/af/AtomAction;LWZ/t;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ll20/d;", "getWidgetInfo", "()Ll20/d;", "Ljava/util/List;", "getDeliveryConditionsBlocks", "()Ljava/util/List;", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4VO$ProgressVO;", "getProgress", "()Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4VO$ProgressVO;", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4VO$ChevronVO;", "getChevron", "()Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4VO$ChevronVO;", "Ljava/lang/String;", "getBorderColor", "getBackgroundColor", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4VO$SpacersVO;", "getSpacers", "()Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4VO$SpacersVO;", "getWidgetUpdatePeriod", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Z", "getResetState", "()Z", "setResetState", "(Z)V", "ContentBlockVO", "ChevronVO", "ProgressVO", "SpacersVO", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DeliveryWidgetV4VO implements c {

    @NotNull
    private final AtomAction action;
    private final String backgroundColor;
    private final String borderColor;

    @NotNull
    private final ChevronVO chevron;

    @NotNull
    private final List<ContentBlockVO> deliveryConditionsBlocks;
    private final long id;
    private final ProgressVO progress;
    private boolean resetState;

    @NotNull
    private final SpacersVO spacers;
    private final t tokenizedEvent;

    @NotNull
    private final d widgetInfo;
    private final long widgetUpdatePeriod;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4VO$ChevronVO;", "", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "chevronIcon", "Lru/ozon/uni/atoms/data/common/Paddings;", "rightPadding", "<init>", "(Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;Lru/ozon/uni/atoms/data/common/Paddings;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "getChevronIcon", "()Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "Lru/ozon/uni/atoms/data/common/Paddings;", "getRightPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ChevronVO {
        public static final int $stable = CommonAtomIconDTO.$stable;

        @NotNull
        private final CommonAtomIconDTO chevronIcon;

        @NotNull
        private final Paddings rightPadding;

        public ChevronVO(@NotNull CommonAtomIconDTO chevronIcon, @NotNull Paddings rightPadding) {
            Intrinsics.checkNotNullParameter(chevronIcon, "chevronIcon");
            Intrinsics.checkNotNullParameter(rightPadding, "rightPadding");
            this.chevronIcon = chevronIcon;
            this.rightPadding = rightPadding;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChevronVO)) {
                return false;
            }
            ChevronVO chevronVO = (ChevronVO) other;
            return Intrinsics.d(this.chevronIcon, chevronVO.chevronIcon) && this.rightPadding == chevronVO.rightPadding;
        }

        @NotNull
        public final CommonAtomIconDTO getChevronIcon() {
            return this.chevronIcon;
        }

        @NotNull
        public final Paddings getRightPadding() {
            return this.rightPadding;
        }

        public int hashCode() {
            return this.rightPadding.hashCode() + (this.chevronIcon.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "ChevronVO(chevronIcon=" + this.chevronIcon + ", rightPadding=" + this.rightPadding + ")";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4VO$ContentBlockVO;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "icon", "Lru/ozon/uni/atoms/data/common/Paddings;", "rightPadding", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;Lru/ozon/uni/atoms/data/common/Paddings;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "Lru/ozon/uni/atoms/data/common/Paddings;", "getRightPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ContentBlockVO {
        public static final int $stable = CommonAtomIconDTO.$stable;
        private final CommonAtomIconDTO icon;
        private final Paddings rightPadding;
        private final TextDTO text;

        public ContentBlockVO(TextDTO textDTO, CommonAtomIconDTO commonAtomIconDTO, Paddings paddings) {
            this.text = textDTO;
            this.icon = commonAtomIconDTO;
            this.rightPadding = paddings;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ContentBlockVO)) {
                return false;
            }
            ContentBlockVO contentBlockVO = (ContentBlockVO) other;
            return Intrinsics.d(this.text, contentBlockVO.text) && Intrinsics.d(this.icon, contentBlockVO.icon) && this.rightPadding == contentBlockVO.rightPadding;
        }

        public final CommonAtomIconDTO getIcon() {
            return this.icon;
        }

        public final Paddings getRightPadding() {
            return this.rightPadding;
        }

        public final TextDTO getText() {
            return this.text;
        }

        public int hashCode() {
            TextDTO textDTO = this.text;
            int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
            CommonAtomIconDTO commonAtomIconDTO = this.icon;
            int hashCode2 = (hashCode + (commonAtomIconDTO == null ? 0 : commonAtomIconDTO.hashCode())) * 31;
            Paddings paddings = this.rightPadding;
            return hashCode2 + (paddings != null ? paddings.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.text;
            CommonAtomIconDTO commonAtomIconDTO = this.icon;
            Paddings paddings = this.rightPadding;
            StringBuilder sb2 = new StringBuilder("ContentBlockVO(text=");
            sb2.append(textDTO);
            sb2.append(", icon=");
            sb2.append(commonAtomIconDTO);
            sb2.append(", rightPadding=");
            return b.b(sb2, paddings, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\t¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4VO$ProgressVO;", "", "", "percentage", "", "color", "<init>", "(ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getPercentage", "Ljava/lang/String;", "getColor", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProgressVO {

        @NotNull
        private final String color;
        private final int percentage;

        public ProgressVO(int i11, @NotNull String color) {
            Intrinsics.checkNotNullParameter(color, "color");
            this.percentage = i11;
            this.color = color;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProgressVO)) {
                return false;
            }
            ProgressVO progressVO = (ProgressVO) other;
            return this.percentage == progressVO.percentage && Intrinsics.d(this.color, progressVO.color);
        }

        @NotNull
        public final String getColor() {
            return this.color;
        }

        public final int getPercentage() {
            return this.percentage;
        }

        public int hashCode() {
            return this.color.hashCode() + (Integer.hashCode(this.percentage) * 31);
        }

        @NotNull
        public String toString() {
            return a.c(this.percentage, "ProgressVO(percentage=", ", color=", this.color, ")");
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4VO$SpacersVO;", "", "Lru/ozon/uni/atoms/data/common/Paddings;", "top", "bottom", "horizontal", "between", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/common/Paddings;", "getTop", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getBottom", "getHorizontal", "getBetween", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SpacersVO {
        private final Paddings between;

        @NotNull
        private final Paddings bottom;

        @NotNull
        private final Paddings horizontal;

        @NotNull
        private final Paddings top;

        public SpacersVO(@NotNull Paddings top, @NotNull Paddings bottom, @NotNull Paddings horizontal, Paddings paddings) {
            Intrinsics.checkNotNullParameter(top, "top");
            Intrinsics.checkNotNullParameter(bottom, "bottom");
            Intrinsics.checkNotNullParameter(horizontal, "horizontal");
            this.top = top;
            this.bottom = bottom;
            this.horizontal = horizontal;
            this.between = paddings;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SpacersVO)) {
                return false;
            }
            SpacersVO spacersVO = (SpacersVO) other;
            return this.top == spacersVO.top && this.bottom == spacersVO.bottom && this.horizontal == spacersVO.horizontal && this.between == spacersVO.between;
        }

        public final Paddings getBetween() {
            return this.between;
        }

        @NotNull
        public final Paddings getBottom() {
            return this.bottom;
        }

        @NotNull
        public final Paddings getHorizontal() {
            return this.horizontal;
        }

        @NotNull
        public final Paddings getTop() {
            return this.top;
        }

        public int hashCode() {
            int b11 = GR.b.b(this.horizontal, GR.b.b(this.bottom, this.top.hashCode() * 31, 31), 31);
            Paddings paddings = this.between;
            return b11 + (paddings == null ? 0 : paddings.hashCode());
        }

        @NotNull
        public String toString() {
            Paddings paddings = this.top;
            Paddings paddings2 = this.bottom;
            return GR.b.e(p.b("SpacersVO(top=", paddings, ", bottom=", paddings2, ", horizontal="), this.horizontal, ", between=", this.between, ")");
        }
    }

    public DeliveryWidgetV4VO(long j11, @NotNull d widgetInfo, @NotNull List<ContentBlockVO> deliveryConditionsBlocks, ProgressVO progressVO, @NotNull ChevronVO chevron, String str, String str2, @NotNull SpacersVO spacers, long j12, @NotNull AtomAction action, t tVar, boolean z11) {
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        Intrinsics.checkNotNullParameter(deliveryConditionsBlocks, "deliveryConditionsBlocks");
        Intrinsics.checkNotNullParameter(chevron, "chevron");
        Intrinsics.checkNotNullParameter(spacers, "spacers");
        Intrinsics.checkNotNullParameter(action, "action");
        this.id = j11;
        this.widgetInfo = widgetInfo;
        this.deliveryConditionsBlocks = deliveryConditionsBlocks;
        this.progress = progressVO;
        this.chevron = chevron;
        this.borderColor = str;
        this.backgroundColor = str2;
        this.spacers = spacers;
        this.widgetUpdatePeriod = j12;
        this.action = action;
        this.tokenizedEvent = tVar;
        this.resetState = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryWidgetV4VO)) {
            return false;
        }
        DeliveryWidgetV4VO deliveryWidgetV4VO = (DeliveryWidgetV4VO) other;
        return this.id == deliveryWidgetV4VO.id && Intrinsics.d(this.widgetInfo, deliveryWidgetV4VO.widgetInfo) && Intrinsics.d(this.deliveryConditionsBlocks, deliveryWidgetV4VO.deliveryConditionsBlocks) && Intrinsics.d(this.progress, deliveryWidgetV4VO.progress) && Intrinsics.d(this.chevron, deliveryWidgetV4VO.chevron) && Intrinsics.d(this.borderColor, deliveryWidgetV4VO.borderColor) && Intrinsics.d(this.backgroundColor, deliveryWidgetV4VO.backgroundColor) && Intrinsics.d(this.spacers, deliveryWidgetV4VO.spacers) && this.widgetUpdatePeriod == deliveryWidgetV4VO.widgetUpdatePeriod && Intrinsics.d(this.action, deliveryWidgetV4VO.action) && Intrinsics.d(this.tokenizedEvent, deliveryWidgetV4VO.tokenizedEvent) && this.resetState == deliveryWidgetV4VO.resetState;
    }

    @NotNull
    public final AtomAction getAction() {
        return this.action;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getBorderColor() {
        return this.borderColor;
    }

    @NotNull
    public final ChevronVO getChevron() {
        return this.chevron;
    }

    @NotNull
    public final List<ContentBlockVO> getDeliveryConditionsBlocks() {
        return this.deliveryConditionsBlocks;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final ProgressVO getProgress() {
        return this.progress;
    }

    public final boolean getResetState() {
        return this.resetState;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final SpacersVO getSpacers() {
        return this.spacers;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    @NotNull
    public final d getWidgetInfo() {
        return this.widgetInfo;
    }

    public final long getWidgetUpdatePeriod() {
        return this.widgetUpdatePeriod;
    }

    public int hashCode() {
        int b11 = g.b((this.widgetInfo.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31, this.deliveryConditionsBlocks);
        ProgressVO progressVO = this.progress;
        int hashCode = (this.chevron.hashCode() + ((b11 + (progressVO == null ? 0 : progressVO.hashCode())) * 31)) * 31;
        String str = this.borderColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.backgroundColor;
        int a11 = C4598rp.a(this.action, Pk0.c.a((this.spacers.hashCode() + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31, this.widgetUpdatePeriod), 31);
        t tVar = this.tokenizedEvent;
        return Boolean.hashCode(this.resetState) + ((a11 + (tVar != null ? tVar.hashCode() : 0)) * 31);
    }

    public final void setResetState(boolean z11) {
        this.resetState = z11;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        d dVar = this.widgetInfo;
        List<ContentBlockVO> list = this.deliveryConditionsBlocks;
        ProgressVO progressVO = this.progress;
        ChevronVO chevronVO = this.chevron;
        String str = this.borderColor;
        String str2 = this.backgroundColor;
        SpacersVO spacersVO = this.spacers;
        long j12 = this.widgetUpdatePeriod;
        AtomAction atomAction = this.action;
        t tVar = this.tokenizedEvent;
        boolean z11 = this.resetState;
        StringBuilder sb2 = new StringBuilder("DeliveryWidgetV4VO(id=");
        sb2.append(j11);
        sb2.append(", widgetInfo=");
        sb2.append(dVar);
        sb2.append(", deliveryConditionsBlocks=");
        sb2.append(list);
        sb2.append(", progress=");
        sb2.append(progressVO);
        sb2.append(", chevron=");
        sb2.append(chevronVO);
        sb2.append(", borderColor=");
        sb2.append(str);
        sb2.append(", backgroundColor=");
        sb2.append(str2);
        sb2.append(", spacers=");
        sb2.append(spacersVO);
        C2942q.f(sb2, ", widgetUpdatePeriod=", j12, ", action=");
        sb2.append(atomAction);
        sb2.append(", tokenizedEvent=");
        sb2.append(tVar);
        sb2.append(", resetState=");
        return Pk0.a.a(")", sb2, z11);
    }

    public /* synthetic */ DeliveryWidgetV4VO(long j11, d dVar, List list, ProgressVO progressVO, ChevronVO chevronVO, String str, String str2, SpacersVO spacersVO, long j12, AtomAction atomAction, t tVar, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, dVar, list, progressVO, chevronVO, str, str2, spacersVO, j12, atomAction, tVar, (i11 & 2048) != 0 ? true : z11);
    }
}
