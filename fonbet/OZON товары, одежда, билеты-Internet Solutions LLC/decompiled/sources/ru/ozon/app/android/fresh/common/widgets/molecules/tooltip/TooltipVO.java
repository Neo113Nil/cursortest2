package ru.ozon.app.android.fresh.common.widgets.molecules.tooltip;

import B0.C2454a;
import Bl.C2639a;
import D3.g;
import Ek.a;
import Kk.C3532b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b'\b\u0086\b\u0018\u00002\u00020\u0001B\u007f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\u009c\u0001\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b%\u0010$R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b0\u0010\u001eR\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u000e\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010&\u001a\u0004\b\u000e\u0010(R\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010/\u001a\u0004\b4\u0010\u001eR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010/\u001a\u0004\b5\u0010\u001eR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00106\u001a\u0004\b7\u00108R%\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0016\u00109\u001a\u0004\b:\u0010;¨\u0006<"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/tooltip/TooltipVO;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "", "hasCloseIcon", "Lru/ozon/app/android/fresh/common/widgets/molecules/tooltip/TooltipStyle;", "style", "Lru/ozon/app/android/fresh/common/widgets/molecules/tooltip/TooltipBeakPosition;", "beakPosition", "", "minWidth", "maxWidth", "isExpanded", "leftMargin", "rightMargin", "Lru/ozon/uni/atoms/data/TestInfo;", "testInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;ZLru/ozon/app/android/fresh/common/widgets/molecules/tooltip/TooltipStyle;Lru/ozon/app/android/fresh/common/widgets/molecules/tooltip/TooltipBeakPosition;ILjava/lang/Integer;ZIILru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "copy", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;ZLru/ozon/app/android/fresh/common/widgets/molecules/tooltip/TooltipStyle;Lru/ozon/app/android/fresh/common/widgets/molecules/tooltip/TooltipBeakPosition;ILjava/lang/Integer;ZIILru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)Lru/ozon/app/android/fresh/common/widgets/molecules/tooltip/TooltipVO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Z", "getHasCloseIcon", "()Z", "Lru/ozon/app/android/fresh/common/widgets/molecules/tooltip/TooltipStyle;", "getStyle", "()Lru/ozon/app/android/fresh/common/widgets/molecules/tooltip/TooltipStyle;", "Lru/ozon/app/android/fresh/common/widgets/molecules/tooltip/TooltipBeakPosition;", "getBeakPosition", "()Lru/ozon/app/android/fresh/common/widgets/molecules/tooltip/TooltipBeakPosition;", "I", "getMinWidth", "Ljava/lang/Integer;", "getMaxWidth", "()Ljava/lang/Integer;", "getLeftMargin", "getRightMargin", "Lru/ozon/uni/atoms/data/TestInfo;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class TooltipVO {

    @NotNull
    private final TooltipBeakPosition beakPosition;
    private final boolean hasCloseIcon;
    private final boolean isExpanded;
    private final int leftMargin;
    private final Integer maxWidth;
    private final int minWidth;
    private final int rightMargin;

    @NotNull
    private final TooltipStyle style;
    private final TextDTO subtitle;
    private final TestInfo testInfo;

    @NotNull
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public TooltipVO(@NotNull TextDTO title, TextDTO textDTO, boolean z11, @NotNull TooltipStyle style, @NotNull TooltipBeakPosition beakPosition, int i11, Integer num, boolean z12, int i12, int i13, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(beakPosition, "beakPosition");
        this.title = title;
        this.subtitle = textDTO;
        this.hasCloseIcon = z11;
        this.style = style;
        this.beakPosition = beakPosition;
        this.minWidth = i11;
        this.maxWidth = num;
        this.isExpanded = z12;
        this.leftMargin = i12;
        this.rightMargin = i13;
        this.testInfo = testInfo;
        this.trackingInfo = map;
    }

    public static /* synthetic */ TooltipVO copy$default(TooltipVO tooltipVO, TextDTO textDTO, TextDTO textDTO2, boolean z11, TooltipStyle tooltipStyle, TooltipBeakPosition tooltipBeakPosition, int i11, Integer num, boolean z12, int i12, int i13, TestInfo testInfo, Map map, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            textDTO = tooltipVO.title;
        }
        if ((i14 & 2) != 0) {
            textDTO2 = tooltipVO.subtitle;
        }
        if ((i14 & 4) != 0) {
            z11 = tooltipVO.hasCloseIcon;
        }
        if ((i14 & 8) != 0) {
            tooltipStyle = tooltipVO.style;
        }
        if ((i14 & 16) != 0) {
            tooltipBeakPosition = tooltipVO.beakPosition;
        }
        if ((i14 & 32) != 0) {
            i11 = tooltipVO.minWidth;
        }
        if ((i14 & 64) != 0) {
            num = tooltipVO.maxWidth;
        }
        if ((i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            z12 = tooltipVO.isExpanded;
        }
        if ((i14 & 256) != 0) {
            i12 = tooltipVO.leftMargin;
        }
        if ((i14 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            i13 = tooltipVO.rightMargin;
        }
        if ((i14 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            testInfo = tooltipVO.testInfo;
        }
        if ((i14 & 2048) != 0) {
            map = tooltipVO.trackingInfo;
        }
        TestInfo testInfo2 = testInfo;
        Map map2 = map;
        int i15 = i12;
        int i16 = i13;
        Integer num2 = num;
        boolean z13 = z12;
        TooltipBeakPosition tooltipBeakPosition2 = tooltipBeakPosition;
        int i17 = i11;
        return tooltipVO.copy(textDTO, textDTO2, z11, tooltipStyle, tooltipBeakPosition2, i17, num2, z13, i15, i16, testInfo2, map2);
    }

    @NotNull
    public final TooltipVO copy(@NotNull TextDTO title, TextDTO subtitle, boolean hasCloseIcon, @NotNull TooltipStyle style, @NotNull TooltipBeakPosition beakPosition, int minWidth, Integer maxWidth, boolean isExpanded, int leftMargin, int rightMargin, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(beakPosition, "beakPosition");
        return new TooltipVO(title, subtitle, hasCloseIcon, style, beakPosition, minWidth, maxWidth, isExpanded, leftMargin, rightMargin, testInfo, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TooltipVO)) {
            return false;
        }
        TooltipVO tooltipVO = (TooltipVO) other;
        return Intrinsics.d(this.title, tooltipVO.title) && Intrinsics.d(this.subtitle, tooltipVO.subtitle) && this.hasCloseIcon == tooltipVO.hasCloseIcon && Intrinsics.d(this.style, tooltipVO.style) && Intrinsics.d(this.beakPosition, tooltipVO.beakPosition) && this.minWidth == tooltipVO.minWidth && Intrinsics.d(this.maxWidth, tooltipVO.maxWidth) && this.isExpanded == tooltipVO.isExpanded && this.leftMargin == tooltipVO.leftMargin && this.rightMargin == tooltipVO.rightMargin && Intrinsics.d(this.testInfo, tooltipVO.testInfo) && Intrinsics.d(this.trackingInfo, tooltipVO.trackingInfo);
    }

    @NotNull
    public final TooltipBeakPosition getBeakPosition() {
        return this.beakPosition;
    }

    public final boolean getHasCloseIcon() {
        return this.hasCloseIcon;
    }

    public final Integer getMaxWidth() {
        return this.maxWidth;
    }

    public final int getMinWidth() {
        return this.minWidth;
    }

    @NotNull
    public final TooltipStyle getStyle() {
        return this.style;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        TextDTO textDTO = this.subtitle;
        int a11 = C2454a.a(this.minWidth, (this.beakPosition.hashCode() + ((this.style.hashCode() + C3532b.a((hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31, this.hasCloseIcon)) * 31)) * 31, 31);
        Integer num = this.maxWidth;
        int a12 = C2454a.a(this.rightMargin, C2454a.a(this.leftMargin, C3532b.a((a11 + (num == null ? 0 : num.hashCode())) * 31, 31, this.isExpanded), 31), 31);
        TestInfo testInfo = this.testInfo;
        int hashCode2 = (a12 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    /* renamed from: isExpanded, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        boolean z11 = this.hasCloseIcon;
        TooltipStyle tooltipStyle = this.style;
        TooltipBeakPosition tooltipBeakPosition = this.beakPosition;
        int i11 = this.minWidth;
        Integer num = this.maxWidth;
        boolean z12 = this.isExpanded;
        int i12 = this.leftMargin;
        int i13 = this.rightMargin;
        TestInfo testInfo = this.testInfo;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder g10 = g.g("TooltipVO(title=", textDTO, ", subtitle=", textDTO2, ", hasCloseIcon=");
        g10.append(z11);
        g10.append(", style=");
        g10.append(tooltipStyle);
        g10.append(", beakPosition=");
        g10.append(tooltipBeakPosition);
        g10.append(", minWidth=");
        g10.append(i11);
        g10.append(", maxWidth=");
        g10.append(num);
        g10.append(", isExpanded=");
        g10.append(z12);
        g10.append(", leftMargin=");
        a.f(i12, i13, ", rightMargin=", ", testInfo=", g10);
        return C2639a.a(", trackingInfo=", ")", g10, map, testInfo);
    }
}
