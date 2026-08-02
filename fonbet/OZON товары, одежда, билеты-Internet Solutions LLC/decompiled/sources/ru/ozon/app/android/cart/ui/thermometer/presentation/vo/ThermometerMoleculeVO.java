package ru.ozon.app.android.cart.ui.thermometer.presentation.vo;

import B0.C2454a;
import Bi.b;
import C.o0;
import G.g;
import J0.P;
import N3.C3660k;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001:\u0003*+,B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010\u0011R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lru/ozon/app/android/cart/ui/thermometer/presentation/vo/ThermometerMoleculeVO;", "", "Lru/ozon/uni/atoms/data/TestInfo;", "testInfo", "Lru/ozon/app/android/cart/ui/thermometer/presentation/vo/ThermometerMoleculeVO$ThermometerVO;", "thermometer", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cell", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "backgroundColor", "LWZ/t;", "tokenizedEvent", "<init>", "(Lru/ozon/uni/atoms/data/TestInfo;Lru/ozon/app/android/cart/ui/thermometer/presentation/vo/ThermometerMoleculeVO$ThermometerVO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/af/AtomAction;Ljava/lang/String;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/TestInfo;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "Lru/ozon/app/android/cart/ui/thermometer/presentation/vo/ThermometerMoleculeVO$ThermometerVO;", "getThermometer", "()Lru/ozon/app/android/cart/ui/thermometer/presentation/vo/ThermometerMoleculeVO$ThermometerVO;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Ljava/lang/String;", "getBackgroundColor", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "ThermometerVO", "StatusVO", "ProgressVO", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ThermometerMoleculeVO {
    private final AtomAction action;
    private final String backgroundColor;

    @NotNull
    private final CellDTO cell;
    private final TestInfo testInfo;

    @NotNull
    private final ThermometerVO thermometer;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0017\u0010\n¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/cart/ui/thermometer/presentation/vo/ThermometerMoleculeVO$ProgressVO;", "", "", "progress", "", "ringProgressColor", "ringBackgroundColor", "<init>", "(FLjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getProgress", "()F", "Ljava/lang/String;", "getRingProgressColor", "getRingBackgroundColor", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProgressVO {
        private final float progress;

        @NotNull
        private final String ringBackgroundColor;

        @NotNull
        private final String ringProgressColor;

        public ProgressVO(float f7, @NotNull String ringProgressColor, @NotNull String ringBackgroundColor) {
            Intrinsics.checkNotNullParameter(ringProgressColor, "ringProgressColor");
            Intrinsics.checkNotNullParameter(ringBackgroundColor, "ringBackgroundColor");
            this.progress = f7;
            this.ringProgressColor = ringProgressColor;
            this.ringBackgroundColor = ringBackgroundColor;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProgressVO)) {
                return false;
            }
            ProgressVO progressVO = (ProgressVO) other;
            return Float.compare(this.progress, progressVO.progress) == 0 && Intrinsics.d(this.ringProgressColor, progressVO.ringProgressColor) && Intrinsics.d(this.ringBackgroundColor, progressVO.ringBackgroundColor);
        }

        public final float getProgress() {
            return this.progress;
        }

        @NotNull
        public final String getRingBackgroundColor() {
            return this.ringBackgroundColor;
        }

        @NotNull
        public final String getRingProgressColor() {
            return this.ringProgressColor;
        }

        public int hashCode() {
            return this.ringBackgroundColor.hashCode() + g.a(Float.hashCode(this.progress) * 31, 31, this.ringProgressColor);
        }

        @NotNull
        public String toString() {
            float f7 = this.progress;
            String str = this.ringProgressColor;
            String str2 = this.ringBackgroundColor;
            StringBuilder sb2 = new StringBuilder("ProgressVO(progress=");
            sb2.append(f7);
            sb2.append(", ringProgressColor=");
            sb2.append(str);
            sb2.append(", ringBackgroundColor=");
            return o0.c(sb2, str2, ")");
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0014\u0010\t¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/cart/ui/thermometer/presentation/vo/ThermometerMoleculeVO$StatusVO;", "", "", "icon", "iconColor", "circleColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIcon", "getIconColor", "getCircleColor", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StatusVO {
        private final String circleColor;

        @NotNull
        private final String icon;
        private final String iconColor;

        public StatusVO(@NotNull String icon, String str, String str2) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.icon = icon;
            this.iconColor = str;
            this.circleColor = str2;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StatusVO)) {
                return false;
            }
            StatusVO statusVO = (StatusVO) other;
            return Intrinsics.d(this.icon, statusVO.icon) && Intrinsics.d(this.iconColor, statusVO.iconColor) && Intrinsics.d(this.circleColor, statusVO.circleColor);
        }

        public final String getCircleColor() {
            return this.circleColor;
        }

        @NotNull
        public final String getIcon() {
            return this.icon;
        }

        public final String getIconColor() {
            return this.iconColor;
        }

        public int hashCode() {
            int hashCode = this.icon.hashCode() * 31;
            String str = this.iconColor;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.circleColor;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.icon;
            String str2 = this.iconColor;
            return o0.c(C3660k.d("StatusVO(icon=", str, ", iconColor=", str2, ", circleColor="), this.circleColor, ")");
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001c\u0010\u000f¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/cart/ui/thermometer/presentation/vo/ThermometerMoleculeVO$ThermometerVO;", "", "Lru/ozon/app/android/cart/ui/thermometer/presentation/vo/ThermometerMoleculeVO$ProgressVO;", "progressVO", "Lru/ozon/app/android/cart/ui/thermometer/presentation/vo/ThermometerMoleculeVO$StatusVO;", "statusVO", "", "verticalPadding", "horizontalPadding", "<init>", "(Lru/ozon/app/android/cart/ui/thermometer/presentation/vo/ThermometerMoleculeVO$ProgressVO;Lru/ozon/app/android/cart/ui/thermometer/presentation/vo/ThermometerMoleculeVO$StatusVO;II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/cart/ui/thermometer/presentation/vo/ThermometerMoleculeVO$ProgressVO;", "getProgressVO", "()Lru/ozon/app/android/cart/ui/thermometer/presentation/vo/ThermometerMoleculeVO$ProgressVO;", "Lru/ozon/app/android/cart/ui/thermometer/presentation/vo/ThermometerMoleculeVO$StatusVO;", "getStatusVO", "()Lru/ozon/app/android/cart/ui/thermometer/presentation/vo/ThermometerMoleculeVO$StatusVO;", "I", "getVerticalPadding", "getHorizontalPadding", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ThermometerVO {
        private final int horizontalPadding;

        @NotNull
        private final ProgressVO progressVO;
        private final StatusVO statusVO;
        private final int verticalPadding;

        public ThermometerVO(@NotNull ProgressVO progressVO, StatusVO statusVO, int i11, int i12) {
            Intrinsics.checkNotNullParameter(progressVO, "progressVO");
            this.progressVO = progressVO;
            this.statusVO = statusVO;
            this.verticalPadding = i11;
            this.horizontalPadding = i12;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ThermometerVO)) {
                return false;
            }
            ThermometerVO thermometerVO = (ThermometerVO) other;
            return Intrinsics.d(this.progressVO, thermometerVO.progressVO) && Intrinsics.d(this.statusVO, thermometerVO.statusVO) && this.verticalPadding == thermometerVO.verticalPadding && this.horizontalPadding == thermometerVO.horizontalPadding;
        }

        public final int getHorizontalPadding() {
            return this.horizontalPadding;
        }

        @NotNull
        public final ProgressVO getProgressVO() {
            return this.progressVO;
        }

        public final StatusVO getStatusVO() {
            return this.statusVO;
        }

        public final int getVerticalPadding() {
            return this.verticalPadding;
        }

        public int hashCode() {
            int hashCode = this.progressVO.hashCode() * 31;
            StatusVO statusVO = this.statusVO;
            return Integer.hashCode(this.horizontalPadding) + C2454a.a(this.verticalPadding, (hashCode + (statusVO == null ? 0 : statusVO.hashCode())) * 31, 31);
        }

        @NotNull
        public String toString() {
            ProgressVO progressVO = this.progressVO;
            StatusVO statusVO = this.statusVO;
            int i11 = this.verticalPadding;
            int i12 = this.horizontalPadding;
            StringBuilder sb2 = new StringBuilder("ThermometerVO(progressVO=");
            sb2.append(progressVO);
            sb2.append(", statusVO=");
            sb2.append(statusVO);
            sb2.append(", verticalPadding=");
            return P.a(i11, i12, ", horizontalPadding=", ")", sb2);
        }
    }

    public ThermometerMoleculeVO(TestInfo testInfo, @NotNull ThermometerVO thermometer, @NotNull CellDTO cell, AtomAction atomAction, String str, t tVar) {
        Intrinsics.checkNotNullParameter(thermometer, "thermometer");
        Intrinsics.checkNotNullParameter(cell, "cell");
        this.testInfo = testInfo;
        this.thermometer = thermometer;
        this.cell = cell;
        this.action = atomAction;
        this.backgroundColor = str;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThermometerMoleculeVO)) {
            return false;
        }
        ThermometerMoleculeVO thermometerMoleculeVO = (ThermometerMoleculeVO) other;
        return Intrinsics.d(this.testInfo, thermometerMoleculeVO.testInfo) && Intrinsics.d(this.thermometer, thermometerMoleculeVO.thermometer) && Intrinsics.d(this.cell, thermometerMoleculeVO.cell) && Intrinsics.d(this.action, thermometerMoleculeVO.action) && Intrinsics.d(this.backgroundColor, thermometerMoleculeVO.backgroundColor) && Intrinsics.d(this.tokenizedEvent, thermometerMoleculeVO.tokenizedEvent);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final CellDTO getCell() {
        return this.cell;
    }

    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final ThermometerVO getThermometer() {
        return this.thermometer;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    public int hashCode() {
        TestInfo testInfo = this.testInfo;
        int c11 = b.c(this.cell, (this.thermometer.hashCode() + ((testInfo == null ? 0 : testInfo.hashCode()) * 31)) * 31, 31);
        AtomAction atomAction = this.action;
        int hashCode = (c11 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode2 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ThermometerMoleculeVO(testInfo=" + this.testInfo + ", thermometer=" + this.thermometer + ", cell=" + this.cell + ", action=" + this.action + ", backgroundColor=" + this.backgroundColor + ", tokenizedEvent=" + this.tokenizedEvent + ")";
    }
}
