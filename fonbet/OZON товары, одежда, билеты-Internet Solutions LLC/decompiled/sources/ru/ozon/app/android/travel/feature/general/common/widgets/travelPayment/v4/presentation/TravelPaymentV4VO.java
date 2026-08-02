package ru.ozon.app.android.travel.feature.general.common.widgets.travelPayment.v4.presentation;

import Ak.C2436a;
import G.g;
import Lh.a;
import Lh.b;
import WZ.t;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0004!\"#$B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v4/presentation/TravelPaymentV4VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v4/presentation/TravelPaymentV4VO$PaymentMethod;", "paymentMethods", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "trackingInfo", "<init>", "(JLjava/util/List;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getPaymentMethods", "()Ljava/util/List;", "LWZ/t;", "getTrackingInfo", "()LWZ/t;", "PaymentMethod", "BankCardMethodVO", "CustomMethodVO", "BankImageMethodVO", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelPaymentV4VO implements c {
    private final long id;

    @NotNull
    private final List<PaymentMethod> paymentMethods;
    private final t trackingInfo;

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b)\u0010\u0015R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010!\u001a\u0004\b0\u0010\u0015R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00101\u001a\u0004\b2\u00103¨\u00064"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v4/presentation/TravelPaymentV4VO$BankCardMethodVO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v4/presentation/TravelPaymentV4VO$PaymentMethod;", "", "id", "", "borderColor", "Lru/ozon/uni/atoms/data/TestInfo;", "testInfo", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "bankImage", "Lru/ozon/uni/atoms/data/text/TextDTO;", "number", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "paymentSystem", "backgroundColor", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "<init>", "(JLjava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Lru/ozon/uni/atoms/af/AtomAction;Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/image/ImageDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getBorderColor", "Lru/ozon/uni/atoms/data/TestInfo;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "getBankImage", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getNumber", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getPaymentSystem", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getBackgroundColor", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BankCardMethodVO implements PaymentMethod {
        public static final int $stable = AtomAction.$stable | TestInfo.$stable;
        private final AtomAction action;
        private final String backgroundColor;
        private final BadgeDTO badge;
        private final String bankImage;

        @NotNull
        private final String borderColor;
        private final long id;
        private final TextDTO number;
        private final ImageDTO paymentSystem;
        private final TestInfo testInfo;

        public BankCardMethodVO(long j11, @NotNull String borderColor, TestInfo testInfo, AtomAction atomAction, String str, TextDTO textDTO, ImageDTO imageDTO, String str2, BadgeDTO badgeDTO) {
            Intrinsics.checkNotNullParameter(borderColor, "borderColor");
            this.id = j11;
            this.borderColor = borderColor;
            this.testInfo = testInfo;
            this.action = atomAction;
            this.bankImage = str;
            this.number = textDTO;
            this.paymentSystem = imageDTO;
            this.backgroundColor = str2;
            this.badge = badgeDTO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BankCardMethodVO)) {
                return false;
            }
            BankCardMethodVO bankCardMethodVO = (BankCardMethodVO) other;
            return this.id == bankCardMethodVO.id && Intrinsics.d(this.borderColor, bankCardMethodVO.borderColor) && Intrinsics.d(this.testInfo, bankCardMethodVO.testInfo) && Intrinsics.d(this.action, bankCardMethodVO.action) && Intrinsics.d(this.bankImage, bankCardMethodVO.bankImage) && Intrinsics.d(this.number, bankCardMethodVO.number) && Intrinsics.d(this.paymentSystem, bankCardMethodVO.paymentSystem) && Intrinsics.d(this.backgroundColor, bankCardMethodVO.backgroundColor) && Intrinsics.d(this.badge, bankCardMethodVO.badge);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final BadgeDTO getBadge() {
            return this.badge;
        }

        public final String getBankImage() {
            return this.bankImage;
        }

        @Override // ru.ozon.app.android.travel.feature.general.common.widgets.travelPayment.v4.presentation.TravelPaymentV4VO.PaymentMethod
        @NotNull
        public String getBorderColor() {
            return this.borderColor;
        }

        @Override // ru.ozon.app.android.travel.feature.general.common.widgets.travelPayment.v4.presentation.TravelPaymentV4VO.PaymentMethod
        public long getId() {
            return this.id;
        }

        public final TextDTO getNumber() {
            return this.number;
        }

        public final ImageDTO getPaymentSystem() {
            return this.paymentSystem;
        }

        public TestInfo getTestInfo() {
            return this.testInfo;
        }

        public int hashCode() {
            int a11 = g.a(Long.hashCode(this.id) * 31, 31, this.borderColor);
            TestInfo testInfo = this.testInfo;
            int hashCode = (a11 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
            AtomAction atomAction = this.action;
            int hashCode2 = (hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
            String str = this.bankImage;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            TextDTO textDTO = this.number;
            int hashCode4 = (hashCode3 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            ImageDTO imageDTO = this.paymentSystem;
            int hashCode5 = (hashCode4 + (imageDTO == null ? 0 : imageDTO.hashCode())) * 31;
            String str2 = this.backgroundColor;
            int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
            BadgeDTO badgeDTO = this.badge;
            return hashCode6 + (badgeDTO != null ? badgeDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            String str = this.borderColor;
            TestInfo testInfo = this.testInfo;
            AtomAction atomAction = this.action;
            String str2 = this.bankImage;
            TextDTO textDTO = this.number;
            ImageDTO imageDTO = this.paymentSystem;
            String str3 = this.backgroundColor;
            BadgeDTO badgeDTO = this.badge;
            StringBuilder c11 = C2436a.c(j11, "BankCardMethodVO(id=", ", borderColor=", str);
            c11.append(", testInfo=");
            c11.append(testInfo);
            c11.append(", action=");
            c11.append(atomAction);
            c11.append(", bankImage=");
            c11.append(str2);
            c11.append(", number=");
            c11.append(textDTO);
            c11.append(", paymentSystem=");
            c11.append(imageDTO);
            c11.append(", backgroundColor=");
            c11.append(str3);
            c11.append(", badge=");
            c11.append(badgeDTO);
            c11.append(")");
            return c11.toString();
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b$\u0010\u0010R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v4/presentation/TravelPaymentV4VO$BankImageMethodVO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v4/presentation/TravelPaymentV4VO$PaymentMethod;", "", "id", "", "borderColor", "Lru/ozon/uni/atoms/data/TestInfo;", "testInfo", "Lru/ozon/uni/atoms/af/AtomAction;", "action", ImagesContract.URL, "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "<init>", "(JLjava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Lru/ozon/uni/atoms/af/AtomAction;Ljava/lang/String;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getBorderColor", "Lru/ozon/uni/atoms/data/TestInfo;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "getUrl", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BankImageMethodVO implements PaymentMethod {
        public static final int $stable = AtomAction.$stable | TestInfo.$stable;
        private final AtomAction action;
        private final BadgeDTO badge;

        @NotNull
        private final String borderColor;
        private final long id;
        private final TestInfo testInfo;

        @NotNull
        private final String url;

        public BankImageMethodVO(long j11, @NotNull String borderColor, TestInfo testInfo, AtomAction atomAction, @NotNull String url, BadgeDTO badgeDTO) {
            Intrinsics.checkNotNullParameter(borderColor, "borderColor");
            Intrinsics.checkNotNullParameter(url, "url");
            this.id = j11;
            this.borderColor = borderColor;
            this.testInfo = testInfo;
            this.action = atomAction;
            this.url = url;
            this.badge = badgeDTO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BankImageMethodVO)) {
                return false;
            }
            BankImageMethodVO bankImageMethodVO = (BankImageMethodVO) other;
            return this.id == bankImageMethodVO.id && Intrinsics.d(this.borderColor, bankImageMethodVO.borderColor) && Intrinsics.d(this.testInfo, bankImageMethodVO.testInfo) && Intrinsics.d(this.action, bankImageMethodVO.action) && Intrinsics.d(this.url, bankImageMethodVO.url) && Intrinsics.d(this.badge, bankImageMethodVO.badge);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        public final BadgeDTO getBadge() {
            return this.badge;
        }

        @Override // ru.ozon.app.android.travel.feature.general.common.widgets.travelPayment.v4.presentation.TravelPaymentV4VO.PaymentMethod
        @NotNull
        public String getBorderColor() {
            return this.borderColor;
        }

        @Override // ru.ozon.app.android.travel.feature.general.common.widgets.travelPayment.v4.presentation.TravelPaymentV4VO.PaymentMethod
        public long getId() {
            return this.id;
        }

        public TestInfo getTestInfo() {
            return this.testInfo;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            int a11 = g.a(Long.hashCode(this.id) * 31, 31, this.borderColor);
            TestInfo testInfo = this.testInfo;
            int hashCode = (a11 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
            AtomAction atomAction = this.action;
            int a12 = g.a((hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31, 31, this.url);
            BadgeDTO badgeDTO = this.badge;
            return a12 + (badgeDTO != null ? badgeDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            String str = this.borderColor;
            TestInfo testInfo = this.testInfo;
            AtomAction atomAction = this.action;
            String str2 = this.url;
            BadgeDTO badgeDTO = this.badge;
            StringBuilder c11 = C2436a.c(j11, "BankImageMethodVO(id=", ", borderColor=", str);
            c11.append(", testInfo=");
            c11.append(testInfo);
            c11.append(", action=");
            c11.append(atomAction);
            c11.append(", url=");
            c11.append(str2);
            c11.append(", badge=");
            c11.append(badgeDTO);
            c11.append(")");
            return c11.toString();
        }
    }

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010 \u001a\u0004\b.\u0010\u0014R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010/\u001a\u0004\b0\u00101¨\u00062"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v4/presentation/TravelPaymentV4VO$CustomMethodVO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v4/presentation/TravelPaymentV4VO$PaymentMethod;", "", "id", "", "borderColor", "Lru/ozon/uni/atoms/data/TestInfo;", "testInfo", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "backgroundColor", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "<init>", "(JLjava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getBorderColor", "Lru/ozon/uni/atoms/data/TestInfo;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getBackgroundColor", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CustomMethodVO implements PaymentMethod {
        public static final int $stable = (IconDTO.$stable | AtomAction.$stable) | TestInfo.$stable;
        private final AtomAction action;
        private final String backgroundColor;
        private final BadgeDTO badge;

        @NotNull
        private final String borderColor;
        private final IconDTO icon;
        private final long id;
        private final TestInfo testInfo;
        private final TextDTO title;

        public CustomMethodVO(long j11, @NotNull String borderColor, TestInfo testInfo, AtomAction atomAction, TextDTO textDTO, IconDTO iconDTO, String str, BadgeDTO badgeDTO) {
            Intrinsics.checkNotNullParameter(borderColor, "borderColor");
            this.id = j11;
            this.borderColor = borderColor;
            this.testInfo = testInfo;
            this.action = atomAction;
            this.title = textDTO;
            this.icon = iconDTO;
            this.backgroundColor = str;
            this.badge = badgeDTO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CustomMethodVO)) {
                return false;
            }
            CustomMethodVO customMethodVO = (CustomMethodVO) other;
            return this.id == customMethodVO.id && Intrinsics.d(this.borderColor, customMethodVO.borderColor) && Intrinsics.d(this.testInfo, customMethodVO.testInfo) && Intrinsics.d(this.action, customMethodVO.action) && Intrinsics.d(this.title, customMethodVO.title) && Intrinsics.d(this.icon, customMethodVO.icon) && Intrinsics.d(this.backgroundColor, customMethodVO.backgroundColor) && Intrinsics.d(this.badge, customMethodVO.badge);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final BadgeDTO getBadge() {
            return this.badge;
        }

        @Override // ru.ozon.app.android.travel.feature.general.common.widgets.travelPayment.v4.presentation.TravelPaymentV4VO.PaymentMethod
        @NotNull
        public String getBorderColor() {
            return this.borderColor;
        }

        public final IconDTO getIcon() {
            return this.icon;
        }

        @Override // ru.ozon.app.android.travel.feature.general.common.widgets.travelPayment.v4.presentation.TravelPaymentV4VO.PaymentMethod
        public long getId() {
            return this.id;
        }

        public TestInfo getTestInfo() {
            return this.testInfo;
        }

        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            int a11 = g.a(Long.hashCode(this.id) * 31, 31, this.borderColor);
            TestInfo testInfo = this.testInfo;
            int hashCode = (a11 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
            AtomAction atomAction = this.action;
            int hashCode2 = (hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
            TextDTO textDTO = this.title;
            int hashCode3 = (hashCode2 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            IconDTO iconDTO = this.icon;
            int hashCode4 = (hashCode3 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
            String str = this.backgroundColor;
            int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
            BadgeDTO badgeDTO = this.badge;
            return hashCode5 + (badgeDTO != null ? badgeDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            String str = this.borderColor;
            TestInfo testInfo = this.testInfo;
            AtomAction atomAction = this.action;
            TextDTO textDTO = this.title;
            IconDTO iconDTO = this.icon;
            String str2 = this.backgroundColor;
            BadgeDTO badgeDTO = this.badge;
            StringBuilder c11 = C2436a.c(j11, "CustomMethodVO(id=", ", borderColor=", str);
            c11.append(", testInfo=");
            c11.append(testInfo);
            c11.append(", action=");
            c11.append(atomAction);
            c11.append(", title=");
            c11.append(textDTO);
            c11.append(", icon=");
            c11.append(iconDTO);
            c11.append(", backgroundColor=");
            c11.append(str2);
            c11.append(", badge=");
            c11.append(badgeDTO);
            c11.append(")");
            return c11.toString();
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v4/presentation/TravelPaymentV4VO$PaymentMethod;", "", "", "getId", "()J", "id", "", "getBorderColor", "()Ljava/lang/String;", "borderColor", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v4/presentation/TravelPaymentV4VO$BankCardMethodVO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v4/presentation/TravelPaymentV4VO$BankImageMethodVO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v4/presentation/TravelPaymentV4VO$CustomMethodVO;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface PaymentMethod {
        @NotNull
        String getBorderColor();

        long getId();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TravelPaymentV4VO(long j11, @NotNull List<? extends PaymentMethod> paymentMethods, t tVar) {
        Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
        this.id = j11;
        this.paymentMethods = paymentMethods;
        this.trackingInfo = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelPaymentV4VO)) {
            return false;
        }
        TravelPaymentV4VO travelPaymentV4VO = (TravelPaymentV4VO) other;
        return this.id == travelPaymentV4VO.id && Intrinsics.d(this.paymentMethods, travelPaymentV4VO.paymentMethods) && Intrinsics.d(this.trackingInfo, travelPaymentV4VO.trackingInfo);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<PaymentMethod> getPaymentMethods() {
        return this.paymentMethods;
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
        int b11 = g.b(Long.hashCode(this.id) * 31, 31, this.paymentMethods);
        t tVar = this.trackingInfo;
        return b11 + (tVar == null ? 0 : tVar.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<PaymentMethod> list = this.paymentMethods;
        return a.b(b.b(j11, "TravelPaymentV4VO(id=", ", paymentMethods=", list), ", trackingInfo=", this.trackingInfo, ")");
    }
}
