package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.vo;

import Bl.C2639a;
import D3.g;
import De.C2859b;
import Kk.C3532b;
import Lc.a;
import Ns.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.molecules.view.starsBadge.v1.StarsBadgeVI;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b&\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003FGHBy\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0098\u0001\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\u00162\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b1\u00102R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00109\u001a\u0004\b:\u0010;R%\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0014\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0015\u0010?\u001a\u0004\b@\u0010\u001fR\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010A\u001a\u0004\b\u0017\u0010BR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010C\u001a\u0004\bD\u0010E¨\u0006I"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3VO$Price;", "price", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3VO$Bonuses;", "bonuses", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "nextButton", "Lru/ozon/uni/atoms/af/AtomAction;", "nextButtonAction", "Lru/ozon/uni/atoms/data/text/TextDTO;", "agreement", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notification", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "asyncData", "", "isLoading", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3VO$StarsBonuses;", "starsBonuses", "<init>", "(JLru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3VO$Price;Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3VO$Bonuses;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/notification/NotificationDTO;Ljava/util/Map;Ljava/lang/String;ZLru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3VO$StarsBonuses;)V", "copy", "(JLru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3VO$Price;Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3VO$Bonuses;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/notification/NotificationDTO;Ljava/util/Map;Ljava/lang/String;ZLru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3VO$StarsBonuses;)Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3VO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3VO$Price;", "getPrice", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3VO$Price;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3VO$Bonuses;", "getBonuses", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3VO$Bonuses;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getNextButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getNextButtonAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getAgreement", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "Ljava/lang/String;", "getAsyncData", "Z", "()Z", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3VO$StarsBonuses;", "getStarsBonuses", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3VO$StarsBonuses;", "Price", "Bonuses", "StarsBonuses", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class HotelsBookTotalV3VO implements c {
    private final TextDTO agreement;
    private final String asyncData;
    private final Bonuses bonuses;
    private final long id;
    private final boolean isLoading;

    @NotNull
    private final ButtonV3DTO nextButton;
    private final AtomAction nextButtonAction;
    private final NotificationDTO notification;

    @NotNull
    private final Price price;
    private final StarsBonuses starsBonuses;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3VO$Bonuses;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", AppMeasurementSdk.ConditionalUserProperty.NAME, "amount", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getName", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getAmount", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Bonuses {

        @NotNull
        private final TextDTO amount;
        private final IconDTO icon;

        @NotNull
        private final TextDTO name;

        public Bonuses(@NotNull TextDTO name, @NotNull TextDTO amount, IconDTO iconDTO) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(amount, "amount");
            this.name = name;
            this.amount = amount;
            this.icon = iconDTO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Bonuses)) {
                return false;
            }
            Bonuses bonuses = (Bonuses) other;
            return Intrinsics.d(this.name, bonuses.name) && Intrinsics.d(this.amount, bonuses.amount) && Intrinsics.d(this.icon, bonuses.icon);
        }

        @NotNull
        public final TextDTO getAmount() {
            return this.amount;
        }

        public final IconDTO getIcon() {
            return this.icon;
        }

        @NotNull
        public final TextDTO getName() {
            return this.name;
        }

        public int hashCode() {
            int a11 = b.a(this.amount, this.name.hashCode() * 31, 31);
            IconDTO iconDTO = this.icon;
            return a11 + (iconDTO == null ? 0 : iconDTO.hashCode());
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.name;
            TextDTO textDTO2 = this.amount;
            IconDTO iconDTO = this.icon;
            StringBuilder g10 = g.g("Bonuses(name=", textDTO, ", amount=", textDTO2, ", icon=");
            g10.append(iconDTO);
            g10.append(")");
            return g10.toString();
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u001d\u001eB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3VO$Price;", "", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3VO$Price$Final;", "final", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3VO$Price$Base;", "base", "Lru/ozon/uni/atoms/af/AtomAction;", "onClickAction", "<init>", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3VO$Price$Final;Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3VO$Price$Base;Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3VO$Price$Final;", "getFinal", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3VO$Price$Final;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3VO$Price$Base;", "getBase", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3VO$Price$Base;", "Lru/ozon/uni/atoms/af/AtomAction;", "getOnClickAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Final", "Base", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Price {
        private final Base base;

        @NotNull
        private final Final final;
        private final AtomAction onClickAction;

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3VO$Price$Base;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", AppMeasurementSdk.ConditionalUserProperty.NAME, "price", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getName", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getPrice", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Base {

            @NotNull
            private final TextDTO name;

            @NotNull
            private final TextDTO price;

            public Base(@NotNull TextDTO name, @NotNull TextDTO price) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(price, "price");
                this.name = name;
                this.price = price;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Base)) {
                    return false;
                }
                Base base = (Base) other;
                return Intrinsics.d(this.name, base.name) && Intrinsics.d(this.price, base.price);
            }

            @NotNull
            public final TextDTO getName() {
                return this.name;
            }

            @NotNull
            public final TextDTO getPrice() {
                return this.price;
            }

            public int hashCode() {
                return this.price.hashCode() + (this.name.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return a.b("Base(name=", this.name, ", price=", this.price, ")");
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3VO$Price$Final;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lru/ozon/uni/atoms/data/icon/IconDTO;", "infoIcon", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "price", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getName", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getInfoIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Final {
            private final IconDTO infoIcon;

            @NotNull
            private final TextDTO name;

            @NotNull
            private final PriceDTO price;

            public Final(@NotNull TextDTO name, IconDTO iconDTO, @NotNull PriceDTO price) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(price, "price");
                this.name = name;
                this.infoIcon = iconDTO;
                this.price = price;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Final)) {
                    return false;
                }
                Final r52 = (Final) other;
                return Intrinsics.d(this.name, r52.name) && Intrinsics.d(this.infoIcon, r52.infoIcon) && Intrinsics.d(this.price, r52.price);
            }

            public final IconDTO getInfoIcon() {
                return this.infoIcon;
            }

            @NotNull
            public final TextDTO getName() {
                return this.name;
            }

            @NotNull
            public final PriceDTO getPrice() {
                return this.price;
            }

            public int hashCode() {
                int hashCode = this.name.hashCode() * 31;
                IconDTO iconDTO = this.infoIcon;
                return this.price.hashCode() + ((hashCode + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31);
            }

            @NotNull
            public String toString() {
                TextDTO textDTO = this.name;
                IconDTO iconDTO = this.infoIcon;
                PriceDTO priceDTO = this.price;
                StringBuilder d11 = C2639a.d("Final(name=", ", infoIcon=", ", price=", iconDTO, textDTO);
                d11.append(priceDTO);
                d11.append(")");
                return d11.toString();
            }
        }

        public Price(@NotNull Final r22, Base base, AtomAction atomAction) {
            Intrinsics.checkNotNullParameter(r22, "final");
            this.final = r22;
            this.base = base;
            this.onClickAction = atomAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Price)) {
                return false;
            }
            Price price = (Price) other;
            return Intrinsics.d(this.final, price.final) && Intrinsics.d(this.base, price.base) && Intrinsics.d(this.onClickAction, price.onClickAction);
        }

        public final Base getBase() {
            return this.base;
        }

        @NotNull
        public final Final getFinal() {
            return this.final;
        }

        public final AtomAction getOnClickAction() {
            return this.onClickAction;
        }

        public int hashCode() {
            int hashCode = this.final.hashCode() * 31;
            Base base = this.base;
            int hashCode2 = (hashCode + (base == null ? 0 : base.hashCode())) * 31;
            AtomAction atomAction = this.onClickAction;
            return hashCode2 + (atomAction != null ? atomAction.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Final r02 = this.final;
            Base base = this.base;
            AtomAction atomAction = this.onClickAction;
            StringBuilder sb2 = new StringBuilder("Price(final=");
            sb2.append(r02);
            sb2.append(", base=");
            sb2.append(base);
            sb2.append(", onClickAction=");
            return B6.b.b(sb2, atomAction, ")");
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3VO$StarsBonuses;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lru/ozon/app/android/travel/molecules/view/starsBadge/v1/StarsBadgeVI;", "starsBadge", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/travel/molecules/view/starsBadge/v1/StarsBadgeVI;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getName", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/app/android/travel/molecules/view/starsBadge/v1/StarsBadgeVI;", "getStarsBadge", "()Lru/ozon/app/android/travel/molecules/view/starsBadge/v1/StarsBadgeVI;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StarsBonuses {

        @NotNull
        private final TextDTO name;

        @NotNull
        private final StarsBadgeVI starsBadge;

        public StarsBonuses(@NotNull TextDTO name, @NotNull StarsBadgeVI starsBadge) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(starsBadge, "starsBadge");
            this.name = name;
            this.starsBadge = starsBadge;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StarsBonuses)) {
                return false;
            }
            StarsBonuses starsBonuses = (StarsBonuses) other;
            return Intrinsics.d(this.name, starsBonuses.name) && Intrinsics.d(this.starsBadge, starsBonuses.starsBadge);
        }

        @NotNull
        public final TextDTO getName() {
            return this.name;
        }

        @NotNull
        public final StarsBadgeVI getStarsBadge() {
            return this.starsBadge;
        }

        public int hashCode() {
            return this.starsBadge.hashCode() + (this.name.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "StarsBonuses(name=" + this.name + ", starsBadge=" + this.starsBadge + ")";
        }
    }

    public HotelsBookTotalV3VO(long j11, @NotNull Price price, Bonuses bonuses, @NotNull ButtonV3DTO nextButton, AtomAction atomAction, TextDTO textDTO, NotificationDTO notificationDTO, Map<String, TokenizedTrackingInfo> map, String str, boolean z11, StarsBonuses starsBonuses) {
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(nextButton, "nextButton");
        this.id = j11;
        this.price = price;
        this.bonuses = bonuses;
        this.nextButton = nextButton;
        this.nextButtonAction = atomAction;
        this.agreement = textDTO;
        this.notification = notificationDTO;
        this.trackingInfo = map;
        this.asyncData = str;
        this.isLoading = z11;
        this.starsBonuses = starsBonuses;
    }

    public static /* synthetic */ HotelsBookTotalV3VO copy$default(HotelsBookTotalV3VO hotelsBookTotalV3VO, long j11, Price price, Bonuses bonuses, ButtonV3DTO buttonV3DTO, AtomAction atomAction, TextDTO textDTO, NotificationDTO notificationDTO, Map map, String str, boolean z11, StarsBonuses starsBonuses, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = hotelsBookTotalV3VO.id;
        }
        return hotelsBookTotalV3VO.copy(j11, (i11 & 2) != 0 ? hotelsBookTotalV3VO.price : price, (i11 & 4) != 0 ? hotelsBookTotalV3VO.bonuses : bonuses, (i11 & 8) != 0 ? hotelsBookTotalV3VO.nextButton : buttonV3DTO, (i11 & 16) != 0 ? hotelsBookTotalV3VO.nextButtonAction : atomAction, (i11 & 32) != 0 ? hotelsBookTotalV3VO.agreement : textDTO, (i11 & 64) != 0 ? hotelsBookTotalV3VO.notification : notificationDTO, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? hotelsBookTotalV3VO.trackingInfo : map, (i11 & 256) != 0 ? hotelsBookTotalV3VO.asyncData : str, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? hotelsBookTotalV3VO.isLoading : z11, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? hotelsBookTotalV3VO.starsBonuses : starsBonuses);
    }

    @NotNull
    public final HotelsBookTotalV3VO copy(long id2, @NotNull Price price, Bonuses bonuses, @NotNull ButtonV3DTO nextButton, AtomAction nextButtonAction, TextDTO agreement, NotificationDTO notification, Map<String, TokenizedTrackingInfo> trackingInfo, String asyncData, boolean isLoading, StarsBonuses starsBonuses) {
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(nextButton, "nextButton");
        return new HotelsBookTotalV3VO(id2, price, bonuses, nextButton, nextButtonAction, agreement, notification, trackingInfo, asyncData, isLoading, starsBonuses);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotelsBookTotalV3VO)) {
            return false;
        }
        HotelsBookTotalV3VO hotelsBookTotalV3VO = (HotelsBookTotalV3VO) other;
        return this.id == hotelsBookTotalV3VO.id && Intrinsics.d(this.price, hotelsBookTotalV3VO.price) && Intrinsics.d(this.bonuses, hotelsBookTotalV3VO.bonuses) && Intrinsics.d(this.nextButton, hotelsBookTotalV3VO.nextButton) && Intrinsics.d(this.nextButtonAction, hotelsBookTotalV3VO.nextButtonAction) && Intrinsics.d(this.agreement, hotelsBookTotalV3VO.agreement) && Intrinsics.d(this.notification, hotelsBookTotalV3VO.notification) && Intrinsics.d(this.trackingInfo, hotelsBookTotalV3VO.trackingInfo) && Intrinsics.d(this.asyncData, hotelsBookTotalV3VO.asyncData) && this.isLoading == hotelsBookTotalV3VO.isLoading && Intrinsics.d(this.starsBonuses, hotelsBookTotalV3VO.starsBonuses);
    }

    public final TextDTO getAgreement() {
        return this.agreement;
    }

    public final String getAsyncData() {
        return this.asyncData;
    }

    public final Bonuses getBonuses() {
        return this.bonuses;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final ButtonV3DTO getNextButton() {
        return this.nextButton;
    }

    public final AtomAction getNextButtonAction() {
        return this.nextButtonAction;
    }

    public final NotificationDTO getNotification() {
        return this.notification;
    }

    @NotNull
    public final Price getPrice() {
        return this.price;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final StarsBonuses getStarsBonuses() {
        return this.starsBonuses;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.price.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        Bonuses bonuses = this.bonuses;
        int c11 = C2859b.c(this.nextButton, (hashCode + (bonuses == null ? 0 : bonuses.hashCode())) * 31, 31);
        AtomAction atomAction = this.nextButtonAction;
        int hashCode2 = (c11 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        TextDTO textDTO = this.agreement;
        int hashCode3 = (hashCode2 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        NotificationDTO notificationDTO = this.notification;
        int hashCode4 = (hashCode3 + (notificationDTO == null ? 0 : notificationDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode5 = (hashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.asyncData;
        int a11 = C3532b.a((hashCode5 + (str == null ? 0 : str.hashCode())) * 31, 31, this.isLoading);
        StarsBonuses starsBonuses = this.starsBonuses;
        return a11 + (starsBonuses != null ? starsBonuses.hashCode() : 0);
    }

    /* renamed from: isLoading, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        Price price = this.price;
        Bonuses bonuses = this.bonuses;
        ButtonV3DTO buttonV3DTO = this.nextButton;
        AtomAction atomAction = this.nextButtonAction;
        TextDTO textDTO = this.agreement;
        NotificationDTO notificationDTO = this.notification;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        String str = this.asyncData;
        boolean z11 = this.isLoading;
        StarsBonuses starsBonuses = this.starsBonuses;
        StringBuilder sb2 = new StringBuilder("HotelsBookTotalV3VO(id=");
        sb2.append(j11);
        sb2.append(", price=");
        sb2.append(price);
        sb2.append(", bonuses=");
        sb2.append(bonuses);
        sb2.append(", nextButton=");
        sb2.append(buttonV3DTO);
        sb2.append(", nextButtonAction=");
        sb2.append(atomAction);
        sb2.append(", agreement=");
        sb2.append(textDTO);
        sb2.append(", notification=");
        sb2.append(notificationDTO);
        sb2.append(", trackingInfo=");
        sb2.append(map);
        D40.a.g(", asyncData=", str, ", isLoading=", sb2, z11);
        sb2.append(", starsBonuses=");
        sb2.append(starsBonuses);
        sb2.append(")");
        return sb2.toString();
    }
}
