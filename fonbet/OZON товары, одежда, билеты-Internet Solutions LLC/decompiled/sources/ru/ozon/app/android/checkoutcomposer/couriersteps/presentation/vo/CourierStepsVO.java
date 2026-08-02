package ru.ozon.app.android.checkoutcomposer.couriersteps.presentation.vo;

import Nh.a;
import WZ.t;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.couriersteps.data.CourierStepsDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0001\u0018\u00002\u00020\u0001:\u0002\"#B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b \u0010!¨\u0006$"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/couriersteps/presentation/vo/CourierStepsVO;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "titleIcon", "Lru/ozon/app/android/checkoutcomposer/couriersteps/presentation/vo/CourierStepsVO$StepsVO;", "steps", "Lru/ozon/app/android/checkoutcomposer/couriersteps/presentation/vo/CourierStepsVO$SettingsVO;", "settings", "LWZ/t;", "tokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/app/android/checkoutcomposer/couriersteps/presentation/vo/CourierStepsVO$StepsVO;Lru/ozon/app/android/checkoutcomposer/couriersteps/presentation/vo/CourierStepsVO$SettingsVO;LWZ/t;)V", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getTitleIcon", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Lru/ozon/app/android/checkoutcomposer/couriersteps/presentation/vo/CourierStepsVO$StepsVO;", "getSteps", "()Lru/ozon/app/android/checkoutcomposer/couriersteps/presentation/vo/CourierStepsVO$StepsVO;", "Lru/ozon/app/android/checkoutcomposer/couriersteps/presentation/vo/CourierStepsVO$SettingsVO;", "getSettings", "()Lru/ozon/app/android/checkoutcomposer/couriersteps/presentation/vo/CourierStepsVO$SettingsVO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "StepsVO", "SettingsVO", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CourierStepsVO implements c {
    private final long id;
    private final SettingsVO settings;
    private final StepsVO steps;

    @NotNull
    private final TextDTO title;
    private final IconButtonV3DTO titleIcon;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u001b\u0010\u000eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b \u0010\u000e¨\u0006!"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/couriersteps/presentation/vo/CourierStepsVO$SettingsVO;", "", "", "bgColor", "Lru/ozon/app/android/checkoutcomposer/couriersteps/data/CourierStepsDTO$Padding;", "padding", "outerBgColor", "outerPadding", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "topCornerRadius", "topBorderColor", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/checkoutcomposer/couriersteps/data/CourierStepsDTO$Padding;Ljava/lang/String;Lru/ozon/app/android/checkoutcomposer/couriersteps/data/CourierStepsDTO$Padding;Lru/ozon/uni/atoms/data/common/CornerRadius;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBgColor", "Lru/ozon/app/android/checkoutcomposer/couriersteps/data/CourierStepsDTO$Padding;", "getPadding", "()Lru/ozon/app/android/checkoutcomposer/couriersteps/data/CourierStepsDTO$Padding;", "getOuterBgColor", "getOuterPadding", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "getTopCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getTopBorderColor", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SettingsVO {
        private final String bgColor;
        private final String outerBgColor;
        private final CourierStepsDTO.Padding outerPadding;
        private final CourierStepsDTO.Padding padding;
        private final String topBorderColor;
        private final CornerRadius topCornerRadius;

        public SettingsVO(String str, CourierStepsDTO.Padding padding, String str2, CourierStepsDTO.Padding padding2, CornerRadius cornerRadius, String str3) {
            this.bgColor = str;
            this.padding = padding;
            this.outerBgColor = str2;
            this.outerPadding = padding2;
            this.topCornerRadius = cornerRadius;
            this.topBorderColor = str3;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SettingsVO)) {
                return false;
            }
            SettingsVO settingsVO = (SettingsVO) other;
            return Intrinsics.d(this.bgColor, settingsVO.bgColor) && Intrinsics.d(this.padding, settingsVO.padding) && Intrinsics.d(this.outerBgColor, settingsVO.outerBgColor) && Intrinsics.d(this.outerPadding, settingsVO.outerPadding) && this.topCornerRadius == settingsVO.topCornerRadius && Intrinsics.d(this.topBorderColor, settingsVO.topBorderColor);
        }

        public final String getBgColor() {
            return this.bgColor;
        }

        public final String getOuterBgColor() {
            return this.outerBgColor;
        }

        public final CourierStepsDTO.Padding getOuterPadding() {
            return this.outerPadding;
        }

        public final CourierStepsDTO.Padding getPadding() {
            return this.padding;
        }

        public final String getTopBorderColor() {
            return this.topBorderColor;
        }

        public final CornerRadius getTopCornerRadius() {
            return this.topCornerRadius;
        }

        public int hashCode() {
            String str = this.bgColor;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            CourierStepsDTO.Padding padding = this.padding;
            int hashCode2 = (hashCode + (padding == null ? 0 : padding.hashCode())) * 31;
            String str2 = this.outerBgColor;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            CourierStepsDTO.Padding padding2 = this.outerPadding;
            int hashCode4 = (hashCode3 + (padding2 == null ? 0 : padding2.hashCode())) * 31;
            CornerRadius cornerRadius = this.topCornerRadius;
            int hashCode5 = (hashCode4 + (cornerRadius == null ? 0 : cornerRadius.hashCode())) * 31;
            String str3 = this.topBorderColor;
            return hashCode5 + (str3 != null ? str3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "SettingsVO(bgColor=" + this.bgColor + ", padding=" + this.padding + ", outerBgColor=" + this.outerBgColor + ", outerPadding=" + this.outerPadding + ", topCornerRadius=" + this.topCornerRadius + ", topBorderColor=" + this.topBorderColor + ")";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/couriersteps/presentation/vo/CourierStepsVO$StepsVO;", "", "Lru/ozon/app/android/checkoutcomposer/couriersteps/presentation/vo/CourierStepsVO$StepsVO$StepsGroupVO;", "total", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "<init>", "(Lru/ozon/app/android/checkoutcomposer/couriersteps/presentation/vo/CourierStepsVO$StepsVO$StepsGroupVO;Lru/ozon/app/android/checkoutcomposer/couriersteps/presentation/vo/CourierStepsVO$StepsVO$StepsGroupVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/checkoutcomposer/couriersteps/presentation/vo/CourierStepsVO$StepsVO$StepsGroupVO;", "getTotal", "()Lru/ozon/app/android/checkoutcomposer/couriersteps/presentation/vo/CourierStepsVO$StepsVO$StepsGroupVO;", "getActive", "StepsGroupVO", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StepsVO {

        @NotNull
        private final StepsGroupVO active;

        @NotNull
        private final StepsGroupVO total;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\t¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/couriersteps/presentation/vo/CourierStepsVO$StepsVO$StepsGroupVO;", "", "", "count", "", "bgColor", "<init>", "(ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getCount", "Ljava/lang/String;", "getBgColor", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class StepsGroupVO {

            @NotNull
            private final String bgColor;
            private final int count;

            public StepsGroupVO(int i11, @NotNull String bgColor) {
                Intrinsics.checkNotNullParameter(bgColor, "bgColor");
                this.count = i11;
                this.bgColor = bgColor;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof StepsGroupVO)) {
                    return false;
                }
                StepsGroupVO stepsGroupVO = (StepsGroupVO) other;
                return this.count == stepsGroupVO.count && Intrinsics.d(this.bgColor, stepsGroupVO.bgColor);
            }

            @NotNull
            public final String getBgColor() {
                return this.bgColor;
            }

            public final int getCount() {
                return this.count;
            }

            public int hashCode() {
                return this.bgColor.hashCode() + (Integer.hashCode(this.count) * 31);
            }

            @NotNull
            public String toString() {
                return a.c(this.count, "StepsGroupVO(count=", ", bgColor=", this.bgColor, ")");
            }
        }

        public StepsVO(@NotNull StepsGroupVO total, @NotNull StepsGroupVO active) {
            Intrinsics.checkNotNullParameter(total, "total");
            Intrinsics.checkNotNullParameter(active, "active");
            this.total = total;
            this.active = active;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StepsVO)) {
                return false;
            }
            StepsVO stepsVO = (StepsVO) other;
            return Intrinsics.d(this.total, stepsVO.total) && Intrinsics.d(this.active, stepsVO.active);
        }

        @NotNull
        public final StepsGroupVO getActive() {
            return this.active;
        }

        @NotNull
        public final StepsGroupVO getTotal() {
            return this.total;
        }

        public int hashCode() {
            return this.active.hashCode() + (this.total.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "StepsVO(total=" + this.total + ", active=" + this.active + ")";
        }
    }

    public CourierStepsVO(long j11, @NotNull TextDTO title, IconButtonV3DTO iconButtonV3DTO, StepsVO stepsVO, SettingsVO settingsVO, t tVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.id = j11;
        this.title = title;
        this.titleIcon = iconButtonV3DTO;
        this.steps = stepsVO;
        this.settings = settingsVO;
        this.tokenizedEvent = tVar;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final SettingsVO getSettings() {
        return this.settings;
    }

    public final StepsVO getSteps() {
        return this.steps;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final IconButtonV3DTO getTitleIcon() {
        return this.titleIcon;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }
}
