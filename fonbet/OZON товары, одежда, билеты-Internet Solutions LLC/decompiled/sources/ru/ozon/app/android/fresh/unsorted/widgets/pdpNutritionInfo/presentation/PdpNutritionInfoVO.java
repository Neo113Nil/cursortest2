package ru.ozon.app.android.fresh.unsorted.widgets.pdpNutritionInfo.presentation;

import Am.C2438a;
import B0.C2454a;
import De.C2859b;
import Ek.a;
import F3.G;
import K00.b;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.unsorted.widgets.pdpNutritionInfo.data.PdpNutritionInfoDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\"\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0005=>?@ABW\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016Jr\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b-\u0010\u001aR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010:\u001a\u0004\b;\u0010<¨\u0006B"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO$Info;", "info", "", "backgroundColor", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO$RoundedCorners;", "corners", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO$ContainerPaddings;", "paddings", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO$SauceInfo;", "sauceInfo", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO$PdpNutritionInfoState;", "infoState", "LWZ/t;", "trackingInfo", "<init>", "(JLru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO$Info;Ljava/lang/String;Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO$RoundedCorners;Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO$ContainerPaddings;Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO$SauceInfo;Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO$PdpNutritionInfoState;LWZ/t;)V", "copy", "(JLru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO$Info;Ljava/lang/String;Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO$RoundedCorners;Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO$ContainerPaddings;Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO$SauceInfo;Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO$PdpNutritionInfoState;LWZ/t;)Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO$Info;", "getInfo", "()Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO$Info;", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO$RoundedCorners;", "getCorners", "()Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO$RoundedCorners;", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO$ContainerPaddings;", "getPaddings", "()Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO$ContainerPaddings;", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO$SauceInfo;", "getSauceInfo", "()Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO$SauceInfo;", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO$PdpNutritionInfoState;", "getInfoState", "()Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO$PdpNutritionInfoState;", "LWZ/t;", "getTrackingInfo", "()LWZ/t;", "Info", "SauceInfo", "RoundedCorners", "ContainerPaddings", "PdpNutritionInfoState", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PdpNutritionInfoVO implements c {
    private final String backgroundColor;

    @NotNull
    private final ButtonV3DTO button;

    @NotNull
    private final RoundedCorners corners;
    private final long id;
    private final Info info;

    @NotNull
    private final PdpNutritionInfoState infoState;

    @NotNull
    private final ContainerPaddings paddings;
    private final SauceInfo sauceInfo;
    private final t trackingInfo;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0018\u0010\u000e¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO$ContainerPaddings;", "", "", "top", "bottom", "between", "inner", "outer", "<init>", "(IIIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getTop", "getBottom", "getBetween", "getInner", "getOuter", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ContainerPaddings {
        private final int between;
        private final int bottom;
        private final int inner;
        private final int outer;
        private final int top;

        public ContainerPaddings(int i11, int i12, int i13, int i14, int i15) {
            this.top = i11;
            this.bottom = i12;
            this.between = i13;
            this.inner = i14;
            this.outer = i15;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ContainerPaddings)) {
                return false;
            }
            ContainerPaddings containerPaddings = (ContainerPaddings) other;
            return this.top == containerPaddings.top && this.bottom == containerPaddings.bottom && this.between == containerPaddings.between && this.inner == containerPaddings.inner && this.outer == containerPaddings.outer;
        }

        public final int getBetween() {
            return this.between;
        }

        public final int getBottom() {
            return this.bottom;
        }

        public final int getInner() {
            return this.inner;
        }

        public final int getOuter() {
            return this.outer;
        }

        public final int getTop() {
            return this.top;
        }

        public int hashCode() {
            return Integer.hashCode(this.outer) + C2454a.a(this.inner, C2454a.a(this.between, C2454a.a(this.bottom, Integer.hashCode(this.top) * 31, 31), 31), 31);
        }

        @NotNull
        public String toString() {
            int i11 = this.top;
            int i12 = this.bottom;
            int i13 = this.between;
            int i14 = this.inner;
            int i15 = this.outer;
            StringBuilder a11 = C2438a.a("ContainerPaddings(top=", i11, ", bottom=", ", between=", i12);
            a.f(i13, i14, ", inner=", ", outer=", a11);
            return b.e(i15, ")", a11);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001fB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO$Info;", "", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$Info$Switch;", "switch", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$Components;", "partialComponents", "wholeComponents", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO$Info$Spacers;", "spacers", "<init>", "(Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$Info$Switch;Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$Components;Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$Components;Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO$Info$Spacers;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$Info$Switch;", "getSwitch", "()Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$Info$Switch;", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$Components;", "getPartialComponents", "()Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$Components;", "getWholeComponents", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO$Info$Spacers;", "getSpacers", "()Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO$Info$Spacers;", "Spacers", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Info {
        public static final int $stable;

        @NotNull
        private final PdpNutritionInfoDTO.Components partialComponents;

        @NotNull
        private final Spacers spacers;

        @NotNull
        private final PdpNutritionInfoDTO.Info.Switch switch;
        private final PdpNutritionInfoDTO.Components wholeComponents;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0014\u0010\f¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO$Info$Spacers;", "", "", "horizontal", "vertical", "between", "<init>", "(III)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getHorizontal", "getVertical", "getBetween", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Spacers {
            private final int between;
            private final int horizontal;
            private final int vertical;

            public Spacers(int i11, int i12, int i13) {
                this.horizontal = i11;
                this.vertical = i12;
                this.between = i13;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Spacers)) {
                    return false;
                }
                Spacers spacers = (Spacers) other;
                return this.horizontal == spacers.horizontal && this.vertical == spacers.vertical && this.between == spacers.between;
            }

            public final int getBetween() {
                return this.between;
            }

            public final int getHorizontal() {
                return this.horizontal;
            }

            public final int getVertical() {
                return this.vertical;
            }

            public int hashCode() {
                return Integer.hashCode(this.between) + C2454a.a(this.vertical, Integer.hashCode(this.horizontal) * 31, 31);
            }

            @NotNull
            public String toString() {
                return b.e(this.between, ")", C2438a.a("Spacers(horizontal=", this.horizontal, ", vertical=", ", between=", this.vertical));
            }
        }

        static {
            int i11 = CellDTO.$stable;
            int i12 = TagButtonDTO.$stable;
            $stable = i11 | i12 | i12;
        }

        public Info(@NotNull PdpNutritionInfoDTO.Info.Switch r22, @NotNull PdpNutritionInfoDTO.Components partialComponents, PdpNutritionInfoDTO.Components components, @NotNull Spacers spacers) {
            Intrinsics.checkNotNullParameter(r22, "switch");
            Intrinsics.checkNotNullParameter(partialComponents, "partialComponents");
            Intrinsics.checkNotNullParameter(spacers, "spacers");
            this.switch = r22;
            this.partialComponents = partialComponents;
            this.wholeComponents = components;
            this.spacers = spacers;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Info)) {
                return false;
            }
            Info info = (Info) other;
            return Intrinsics.d(this.switch, info.switch) && Intrinsics.d(this.partialComponents, info.partialComponents) && Intrinsics.d(this.wholeComponents, info.wholeComponents) && Intrinsics.d(this.spacers, info.spacers);
        }

        @NotNull
        public final PdpNutritionInfoDTO.Components getPartialComponents() {
            return this.partialComponents;
        }

        @NotNull
        public final Spacers getSpacers() {
            return this.spacers;
        }

        @NotNull
        public final PdpNutritionInfoDTO.Info.Switch getSwitch() {
            return this.switch;
        }

        public final PdpNutritionInfoDTO.Components getWholeComponents() {
            return this.wholeComponents;
        }

        public int hashCode() {
            int hashCode = (this.partialComponents.hashCode() + (this.switch.hashCode() * 31)) * 31;
            PdpNutritionInfoDTO.Components components = this.wholeComponents;
            return this.spacers.hashCode() + ((hashCode + (components == null ? 0 : components.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            return "Info(switch=" + this.switch + ", partialComponents=" + this.partialComponents + ", wholeComponents=" + this.wholeComponents + ", spacers=" + this.spacers + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\t\u001a\u00020\nj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO$PdpNutritionInfoState;", "", "<init>", "(Ljava/lang/String;I)V", "PARTIAL_WITH_SAUCE", "WHOLE_WITH_SAUCE", "PARTIAL", "WHOLE", "NONE", "hasSauce", "", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PdpNutritionInfoState {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ PdpNutritionInfoState[] $VALUES;
        public static final PdpNutritionInfoState PARTIAL_WITH_SAUCE = new PdpNutritionInfoState("PARTIAL_WITH_SAUCE", 0);
        public static final PdpNutritionInfoState WHOLE_WITH_SAUCE = new PdpNutritionInfoState("WHOLE_WITH_SAUCE", 1);
        public static final PdpNutritionInfoState PARTIAL = new PdpNutritionInfoState("PARTIAL", 2);
        public static final PdpNutritionInfoState WHOLE = new PdpNutritionInfoState("WHOLE", 3);
        public static final PdpNutritionInfoState NONE = new PdpNutritionInfoState("NONE", 4);

        private static final /* synthetic */ PdpNutritionInfoState[] $values() {
            return new PdpNutritionInfoState[]{PARTIAL_WITH_SAUCE, WHOLE_WITH_SAUCE, PARTIAL, WHOLE, NONE};
        }

        static {
            PdpNutritionInfoState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Xc.b.a($values);
        }

        private PdpNutritionInfoState(String str, int i11) {
        }

        public static PdpNutritionInfoState valueOf(String str) {
            return (PdpNutritionInfoState) Enum.valueOf(PdpNutritionInfoState.class, str);
        }

        public static PdpNutritionInfoState[] values() {
            return (PdpNutritionInfoState[]) $VALUES.clone();
        }

        public final boolean hasSauce() {
            return this == PARTIAL_WITH_SAUCE || this == WHOLE_WITH_SAUCE;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO$RoundedCorners;", "", "", "buttonRadius", "widgetRadius", "<init>", "(FF)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getButtonRadius", "()F", "getWidgetRadius", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RoundedCorners {
        private final float buttonRadius;
        private final float widgetRadius;

        public RoundedCorners(float f7, float f11) {
            this.buttonRadius = f7;
            this.widgetRadius = f11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RoundedCorners)) {
                return false;
            }
            RoundedCorners roundedCorners = (RoundedCorners) other;
            return Float.compare(this.buttonRadius, roundedCorners.buttonRadius) == 0 && Float.compare(this.widgetRadius, roundedCorners.widgetRadius) == 0;
        }

        public final float getButtonRadius() {
            return this.buttonRadius;
        }

        public final float getWidgetRadius() {
            return this.widgetRadius;
        }

        public int hashCode() {
            return Float.hashCode(this.widgetRadius) + (Float.hashCode(this.buttonRadius) * 31);
        }

        @NotNull
        public String toString() {
            return "RoundedCorners(buttonRadius=" + this.buttonRadius + ", widgetRadius=" + this.widgetRadius + ")";
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ@\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO$SauceInfo;", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "checkBoxCell", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$Components;", "partialComponents", "wholeComponents", "LWZ/t;", "trackingInfo", "<init>", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$Components;Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$Components;LWZ/t;)V", "copy", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$Components;Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$Components;LWZ/t;)Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO$SauceInfo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getCheckBoxCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$Components;", "getPartialComponents", "()Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$Components;", "getWholeComponents", "LWZ/t;", "getTrackingInfo", "()LWZ/t;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SauceInfo {
        private final CellDTO checkBoxCell;
        private final PdpNutritionInfoDTO.Components partialComponents;
        private final t trackingInfo;
        private final PdpNutritionInfoDTO.Components wholeComponents;

        public SauceInfo(CellDTO cellDTO, PdpNutritionInfoDTO.Components components, PdpNutritionInfoDTO.Components components2, t tVar) {
            this.checkBoxCell = cellDTO;
            this.partialComponents = components;
            this.wholeComponents = components2;
            this.trackingInfo = tVar;
        }

        public static /* synthetic */ SauceInfo copy$default(SauceInfo sauceInfo, CellDTO cellDTO, PdpNutritionInfoDTO.Components components, PdpNutritionInfoDTO.Components components2, t tVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                cellDTO = sauceInfo.checkBoxCell;
            }
            if ((i11 & 2) != 0) {
                components = sauceInfo.partialComponents;
            }
            if ((i11 & 4) != 0) {
                components2 = sauceInfo.wholeComponents;
            }
            if ((i11 & 8) != 0) {
                tVar = sauceInfo.trackingInfo;
            }
            return sauceInfo.copy(cellDTO, components, components2, tVar);
        }

        @NotNull
        public final SauceInfo copy(CellDTO checkBoxCell, PdpNutritionInfoDTO.Components partialComponents, PdpNutritionInfoDTO.Components wholeComponents, t trackingInfo) {
            return new SauceInfo(checkBoxCell, partialComponents, wholeComponents, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SauceInfo)) {
                return false;
            }
            SauceInfo sauceInfo = (SauceInfo) other;
            return Intrinsics.d(this.checkBoxCell, sauceInfo.checkBoxCell) && Intrinsics.d(this.partialComponents, sauceInfo.partialComponents) && Intrinsics.d(this.wholeComponents, sauceInfo.wholeComponents) && Intrinsics.d(this.trackingInfo, sauceInfo.trackingInfo);
        }

        public final CellDTO getCheckBoxCell() {
            return this.checkBoxCell;
        }

        public final PdpNutritionInfoDTO.Components getPartialComponents() {
            return this.partialComponents;
        }

        public final t getTrackingInfo() {
            return this.trackingInfo;
        }

        public final PdpNutritionInfoDTO.Components getWholeComponents() {
            return this.wholeComponents;
        }

        public int hashCode() {
            CellDTO cellDTO = this.checkBoxCell;
            int hashCode = (cellDTO == null ? 0 : cellDTO.hashCode()) * 31;
            PdpNutritionInfoDTO.Components components = this.partialComponents;
            int hashCode2 = (hashCode + (components == null ? 0 : components.hashCode())) * 31;
            PdpNutritionInfoDTO.Components components2 = this.wholeComponents;
            int hashCode3 = (hashCode2 + (components2 == null ? 0 : components2.hashCode())) * 31;
            t tVar = this.trackingInfo;
            return hashCode3 + (tVar != null ? tVar.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "SauceInfo(checkBoxCell=" + this.checkBoxCell + ", partialComponents=" + this.partialComponents + ", wholeComponents=" + this.wholeComponents + ", trackingInfo=" + this.trackingInfo + ")";
        }
    }

    public PdpNutritionInfoVO(long j11, @NotNull ButtonV3DTO button, Info info, String str, @NotNull RoundedCorners corners, @NotNull ContainerPaddings paddings, SauceInfo sauceInfo, @NotNull PdpNutritionInfoState infoState, t tVar) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(corners, "corners");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        Intrinsics.checkNotNullParameter(infoState, "infoState");
        this.id = j11;
        this.button = button;
        this.info = info;
        this.backgroundColor = str;
        this.corners = corners;
        this.paddings = paddings;
        this.sauceInfo = sauceInfo;
        this.infoState = infoState;
        this.trackingInfo = tVar;
    }

    public static /* synthetic */ PdpNutritionInfoVO copy$default(PdpNutritionInfoVO pdpNutritionInfoVO, long j11, ButtonV3DTO buttonV3DTO, Info info, String str, RoundedCorners roundedCorners, ContainerPaddings containerPaddings, SauceInfo sauceInfo, PdpNutritionInfoState pdpNutritionInfoState, t tVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = pdpNutritionInfoVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            buttonV3DTO = pdpNutritionInfoVO.button;
        }
        ButtonV3DTO buttonV3DTO2 = buttonV3DTO;
        if ((i11 & 4) != 0) {
            info = pdpNutritionInfoVO.info;
        }
        return pdpNutritionInfoVO.copy(j12, buttonV3DTO2, info, (i11 & 8) != 0 ? pdpNutritionInfoVO.backgroundColor : str, (i11 & 16) != 0 ? pdpNutritionInfoVO.corners : roundedCorners, (i11 & 32) != 0 ? pdpNutritionInfoVO.paddings : containerPaddings, (i11 & 64) != 0 ? pdpNutritionInfoVO.sauceInfo : sauceInfo, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? pdpNutritionInfoVO.infoState : pdpNutritionInfoState, (i11 & 256) != 0 ? pdpNutritionInfoVO.trackingInfo : tVar);
    }

    @NotNull
    public final PdpNutritionInfoVO copy(long id2, @NotNull ButtonV3DTO button, Info info, String backgroundColor, @NotNull RoundedCorners corners, @NotNull ContainerPaddings paddings, SauceInfo sauceInfo, @NotNull PdpNutritionInfoState infoState, t trackingInfo) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(corners, "corners");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        Intrinsics.checkNotNullParameter(infoState, "infoState");
        return new PdpNutritionInfoVO(id2, button, info, backgroundColor, corners, paddings, sauceInfo, infoState, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PdpNutritionInfoVO)) {
            return false;
        }
        PdpNutritionInfoVO pdpNutritionInfoVO = (PdpNutritionInfoVO) other;
        return this.id == pdpNutritionInfoVO.id && Intrinsics.d(this.button, pdpNutritionInfoVO.button) && Intrinsics.d(this.info, pdpNutritionInfoVO.info) && Intrinsics.d(this.backgroundColor, pdpNutritionInfoVO.backgroundColor) && Intrinsics.d(this.corners, pdpNutritionInfoVO.corners) && Intrinsics.d(this.paddings, pdpNutritionInfoVO.paddings) && Intrinsics.d(this.sauceInfo, pdpNutritionInfoVO.sauceInfo) && this.infoState == pdpNutritionInfoVO.infoState && Intrinsics.d(this.trackingInfo, pdpNutritionInfoVO.trackingInfo);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    @NotNull
    public final RoundedCorners getCorners() {
        return this.corners;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final Info getInfo() {
        return this.info;
    }

    @NotNull
    public final PdpNutritionInfoState getInfoState() {
        return this.infoState;
    }

    @NotNull
    public final ContainerPaddings getPaddings() {
        return this.paddings;
    }

    public final SauceInfo getSauceInfo() {
        return this.sauceInfo;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getTrackingInfo() {
        return this.trackingInfo;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int c11 = C2859b.c(this.button, Long.hashCode(this.id) * 31, 31);
        Info info = this.info;
        int hashCode = (c11 + (info == null ? 0 : info.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode2 = (this.paddings.hashCode() + ((this.corners.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
        SauceInfo sauceInfo = this.sauceInfo;
        int hashCode3 = (this.infoState.hashCode() + ((hashCode2 + (sauceInfo == null ? 0 : sauceInfo.hashCode())) * 31)) * 31;
        t tVar = this.trackingInfo;
        return hashCode3 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        ButtonV3DTO buttonV3DTO = this.button;
        Info info = this.info;
        String str = this.backgroundColor;
        RoundedCorners roundedCorners = this.corners;
        ContainerPaddings containerPaddings = this.paddings;
        SauceInfo sauceInfo = this.sauceInfo;
        PdpNutritionInfoState pdpNutritionInfoState = this.infoState;
        t tVar = this.trackingInfo;
        StringBuilder c11 = G.c("PdpNutritionInfoVO(id=", j11, ", button=", buttonV3DTO);
        c11.append(", info=");
        c11.append(info);
        c11.append(", backgroundColor=");
        c11.append(str);
        c11.append(", corners=");
        c11.append(roundedCorners);
        c11.append(", paddings=");
        c11.append(containerPaddings);
        c11.append(", sauceInfo=");
        c11.append(sauceInfo);
        c11.append(", infoState=");
        c11.append(pdpNutritionInfoState);
        return Lh.a.b(c11, ", trackingInfo=", tVar, ")");
    }
}
