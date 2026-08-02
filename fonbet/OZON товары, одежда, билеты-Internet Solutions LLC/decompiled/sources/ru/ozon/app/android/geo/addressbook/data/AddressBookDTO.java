package ru.ozon.app.android.geo.addressbook.data;

import B3.p;
import B90.C2616s;
import Fm.C3051a;
import H3.c;
import HY.b;
import Ih.a;
import Kk.C3532b;
import N3.C3660k;
import Pk0.f;
import T7.P;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.common.TooltipDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/geo/addressbook/data/AddressBookDTO;", "", "<init>", "()V", "Analytics", "AddressList", "Lru/ozon/app/android/geo/addressbook/data/AddressBookDTO$AddressList;", "Lru/ozon/app/android/geo/addressbook/data/AddressBookDTO$Analytics;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class AddressBookDTO {

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0004HÖ\u0001R\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/geo/addressbook/data/AddressBookDTO$Analytics;", "Lru/ozon/app/android/geo/addressbook/data/AddressBookDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/Map;)V", "getTrackingInfo", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Analytics extends AddressBookDTO {
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public Analytics(Map<String, TokenizedTrackingInfo> map) {
            super(null);
            this.trackingInfo = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Analytics copy$default(Analytics analytics, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                map = analytics.trackingInfo;
            }
            return analytics.copy(map);
        }

        public final Map<String, TokenizedTrackingInfo> component1() {
            return this.trackingInfo;
        }

        @NotNull
        public final Analytics copy(Map<String, TokenizedTrackingInfo> trackingInfo) {
            return new Analytics(trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Analytics) && Intrinsics.d(this.trackingInfo, ((Analytics) other).trackingInfo);
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            if (map == null) {
                return 0;
            }
            return map.hashCode();
        }

        @NotNull
        public String toString() {
            return b.b("Analytics(trackingInfo=", ")", this.trackingInfo);
        }
    }

    public /* synthetic */ AddressBookDTO(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AddressBookDTO() {
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0013B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/geo/addressbook/data/AddressBookDTO$AddressList;", "Lru/ozon/app/android/geo/addressbook/data/AddressBookDTO;", "addresses", "", "Lru/ozon/app/android/geo/addressbook/data/AddressBookDTO$AddressList$Address;", "<init>", "(Ljava/util/List;)V", "getAddresses", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Address", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class AddressList extends AddressBookDTO {

        @NotNull
        private final List<Address> addresses;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddressList(@NotNull List<Address> addresses) {
            super(null);
            Intrinsics.checkNotNullParameter(addresses, "addresses");
            this.addresses = addresses;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AddressList copy$default(AddressList addressList, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = addressList.addresses;
            }
            return addressList.copy(list);
        }

        @NotNull
        public final List<Address> component1() {
            return this.addresses;
        }

        @NotNull
        public final AddressList copy(@NotNull List<Address> addresses) {
            Intrinsics.checkNotNullParameter(addresses, "addresses");
            return new AddressList(addresses);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AddressList) && Intrinsics.d(this.addresses, ((AddressList) other).addresses);
        }

        @NotNull
        public final List<Address> getAddresses() {
            return this.addresses;
        }

        public int hashCode() {
            return this.addresses.hashCode();
        }

        @NotNull
        public String toString() {
            return c.a("AddressList(addresses=", ")", this.addresses);
        }

        @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002@AB\u009f\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\n\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\n\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00100\u001a\u00020\u0007HÆ\u0003J\t\u00101\u001a\u00020\u0007HÆ\u0003J\u0011\u00102\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u0011\u00103\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\t\u00104\u001a\u00020\u000eHÆ\u0003J\u0011\u00105\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\nHÆ\u0003J\u0017\u00106\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u0011\u00108\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\nHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0019HÆ\u0003Jµ\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\n2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\n2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÆ\u0001J\u0013\u0010;\u001a\u00020\u00072\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020>HÖ\u0001J\t\u0010?\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010 R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010 R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\"R\u001f\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0019\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\"R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-¨\u0006B"}, d2 = {"Lru/ozon/app/android/geo/addressbook/data/AddressBookDTO$AddressList$Address;", "", "addressBookId", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "isSelected", "", "isEnabled", "elements", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "bottomElements", "clickAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "controls", "Lru/ozon/app/android/geo/addressbook/data/AddressBookDTO$AddressList$Address$Control;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "onboarding", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "badges", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "numberPVZ", "Lru/ozon/app/android/geo/addressbook/data/AddressBookDTO$AddressList$Address$NumberPVZ;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;ZZLjava/util/List;Ljava/util/List;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/List;Ljava/util/Map;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Ljava/util/List;Lru/ozon/app/android/geo/addressbook/data/AddressBookDTO$AddressList$Address$NumberPVZ;)V", "getAddressBookId", "()Ljava/lang/String;", "getTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "()Z", "getElements", "()Ljava/util/List;", "getBottomElements", "getClickAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getControls", "getTrackingInfo", "()Ljava/util/Map;", "getOnboarding", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getBadges", "getNumberPVZ", "()Lru/ozon/app/android/geo/addressbook/data/AddressBookDTO$AddressList$Address$NumberPVZ;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "hashCode", "", "toString", "Control", "NumberPVZ", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class Address {

            @NotNull
            private final String addressBookId;
            private final List<BadgeDTO> badges;
            private final List<AtomDTO> bottomElements;

            @NotNull
            private final AtomActionDTO clickAction;
            private final List<Control> controls;
            private final List<AtomDTO> elements;
            private final boolean isEnabled;
            private final boolean isSelected;
            private final NumberPVZ numberPVZ;
            private final OnBoardingDTO onboarding;
            private final OzonSpannableString title;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003JM\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lru/ozon/app/android/geo/addressbook/data/AddressBookDTO$AddressList$Address$Control;", "", "text", "", "icon", "iconRes", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getText", "()Ljava/lang/String;", "getIcon", "getIconRes", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Control {

                @NotNull
                private final AtomActionDTO action;
                private final String icon;
                private final String iconRes;

                @NotNull
                private final String text;
                private final Map<String, TokenizedTrackingInfo> trackingInfo;

                public Control(@NotNull String text, String str, String str2, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> map) {
                    Intrinsics.checkNotNullParameter(text, "text");
                    Intrinsics.checkNotNullParameter(action, "action");
                    this.text = text;
                    this.icon = str;
                    this.iconRes = str2;
                    this.action = action;
                    this.trackingInfo = map;
                }

                public static /* synthetic */ Control copy$default(Control control, String str, String str2, String str3, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        str = control.text;
                    }
                    if ((i11 & 2) != 0) {
                        str2 = control.icon;
                    }
                    if ((i11 & 4) != 0) {
                        str3 = control.iconRes;
                    }
                    if ((i11 & 8) != 0) {
                        atomActionDTO = control.action;
                    }
                    if ((i11 & 16) != 0) {
                        map = control.trackingInfo;
                    }
                    Map map2 = map;
                    String str4 = str3;
                    return control.copy(str, str2, str4, atomActionDTO, map2);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final String getText() {
                    return this.text;
                }

                /* renamed from: component2, reason: from getter */
                public final String getIcon() {
                    return this.icon;
                }

                /* renamed from: component3, reason: from getter */
                public final String getIconRes() {
                    return this.iconRes;
                }

                @NotNull
                /* renamed from: component4, reason: from getter */
                public final AtomActionDTO getAction() {
                    return this.action;
                }

                public final Map<String, TokenizedTrackingInfo> component5() {
                    return this.trackingInfo;
                }

                @NotNull
                public final Control copy(@NotNull String text, String icon, String iconRes, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
                    Intrinsics.checkNotNullParameter(text, "text");
                    Intrinsics.checkNotNullParameter(action, "action");
                    return new Control(text, icon, iconRes, action, trackingInfo);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Control)) {
                        return false;
                    }
                    Control control = (Control) other;
                    return Intrinsics.d(this.text, control.text) && Intrinsics.d(this.icon, control.icon) && Intrinsics.d(this.iconRes, control.iconRes) && Intrinsics.d(this.action, control.action) && Intrinsics.d(this.trackingInfo, control.trackingInfo);
                }

                @NotNull
                public final AtomActionDTO getAction() {
                    return this.action;
                }

                public final String getIcon() {
                    return this.icon;
                }

                public final String getIconRes() {
                    return this.iconRes;
                }

                @NotNull
                public final String getText() {
                    return this.text;
                }

                public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                    return this.trackingInfo;
                }

                public int hashCode() {
                    int hashCode = this.text.hashCode() * 31;
                    String str = this.icon;
                    int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                    String str2 = this.iconRes;
                    int b11 = a.b(this.action, (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
                    Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                    return b11 + (map != null ? map.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    String str = this.text;
                    String str2 = this.icon;
                    String str3 = this.iconRes;
                    AtomActionDTO atomActionDTO = this.action;
                    Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                    StringBuilder d11 = C3660k.d("Control(text=", str, ", icon=", str2, ", iconRes=");
                    p.c(str3, ", action=", ", trackingInfo=", d11, atomActionDTO);
                    return P.f(d11, map, ")");
                }
            }

            @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001bB#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/geo/addressbook/data/AddressBookDTO$AddressList$Address$NumberPVZ;", "", "number", "Lru/ozon/uni/atoms/data/text/TextDTO;", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "tooltip", "Lru/ozon/app/android/geo/addressbook/data/AddressBookDTO$AddressList$Address$NumberPVZ$Tooltip;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Lru/ozon/app/android/geo/addressbook/data/AddressBookDTO$AddressList$Address$NumberPVZ$Tooltip;)V", "getNumber", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getTooltip", "()Lru/ozon/app/android/geo/addressbook/data/AddressBookDTO$AddressList$Address$NumberPVZ$Tooltip;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Tooltip", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            @j(generateAdapter = true)
            public static final /* data */ class NumberPVZ {
                private final CommonControlSettings common;

                @NotNull
                private final TextDTO number;
                private final Tooltip tooltip;

                @j(generateAdapter = true)
                @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ0\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/geo/addressbook/data/AddressBookDTO$AddressList$Address$NumberPVZ$Tooltip;", "", "tooltip", "Lru/ozon/uni/atoms/data/common/TooltipDTO;", "delayTime", "", "displayTime", "<init>", "(Lru/ozon/uni/atoms/data/common/TooltipDTO;Ljava/lang/Long;Ljava/lang/Long;)V", "getTooltip", "()Lru/ozon/uni/atoms/data/common/TooltipDTO;", "getDelayTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getDisplayTime", "component1", "component2", "component3", "copy", "(Lru/ozon/uni/atoms/data/common/TooltipDTO;Ljava/lang/Long;Ljava/lang/Long;)Lru/ozon/app/android/geo/addressbook/data/AddressBookDTO$AddressList$Address$NumberPVZ$Tooltip;", "equals", "", "other", "hashCode", "", "toString", "", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final /* data */ class Tooltip {
                    private final Long delayTime;
                    private final Long displayTime;

                    @NotNull
                    private final TooltipDTO tooltip;

                    public Tooltip(@NotNull TooltipDTO tooltip, Long l11, Long l12) {
                        Intrinsics.checkNotNullParameter(tooltip, "tooltip");
                        this.tooltip = tooltip;
                        this.delayTime = l11;
                        this.displayTime = l12;
                    }

                    public static /* synthetic */ Tooltip copy$default(Tooltip tooltip, TooltipDTO tooltipDTO, Long l11, Long l12, int i11, Object obj) {
                        if ((i11 & 1) != 0) {
                            tooltipDTO = tooltip.tooltip;
                        }
                        if ((i11 & 2) != 0) {
                            l11 = tooltip.delayTime;
                        }
                        if ((i11 & 4) != 0) {
                            l12 = tooltip.displayTime;
                        }
                        return tooltip.copy(tooltipDTO, l11, l12);
                    }

                    @NotNull
                    /* renamed from: component1, reason: from getter */
                    public final TooltipDTO getTooltip() {
                        return this.tooltip;
                    }

                    /* renamed from: component2, reason: from getter */
                    public final Long getDelayTime() {
                        return this.delayTime;
                    }

                    /* renamed from: component3, reason: from getter */
                    public final Long getDisplayTime() {
                        return this.displayTime;
                    }

                    @NotNull
                    public final Tooltip copy(@NotNull TooltipDTO tooltip, Long delayTime, Long displayTime) {
                        Intrinsics.checkNotNullParameter(tooltip, "tooltip");
                        return new Tooltip(tooltip, delayTime, displayTime);
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof Tooltip)) {
                            return false;
                        }
                        Tooltip tooltip = (Tooltip) other;
                        return Intrinsics.d(this.tooltip, tooltip.tooltip) && Intrinsics.d(this.delayTime, tooltip.delayTime) && Intrinsics.d(this.displayTime, tooltip.displayTime);
                    }

                    public final Long getDelayTime() {
                        return this.delayTime;
                    }

                    public final Long getDisplayTime() {
                        return this.displayTime;
                    }

                    @NotNull
                    public final TooltipDTO getTooltip() {
                        return this.tooltip;
                    }

                    public int hashCode() {
                        int hashCode = this.tooltip.hashCode() * 31;
                        Long l11 = this.delayTime;
                        int hashCode2 = (hashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
                        Long l12 = this.displayTime;
                        return hashCode2 + (l12 != null ? l12.hashCode() : 0);
                    }

                    @NotNull
                    public String toString() {
                        TooltipDTO tooltipDTO = this.tooltip;
                        Long l11 = this.delayTime;
                        Long l12 = this.displayTime;
                        StringBuilder sb2 = new StringBuilder("Tooltip(tooltip=");
                        sb2.append(tooltipDTO);
                        sb2.append(", delayTime=");
                        sb2.append(l11);
                        sb2.append(", displayTime=");
                        return C3051a.d(sb2, l12, ")");
                    }
                }

                public NumberPVZ(@NotNull TextDTO number, CommonControlSettings commonControlSettings, Tooltip tooltip) {
                    Intrinsics.checkNotNullParameter(number, "number");
                    this.number = number;
                    this.common = commonControlSettings;
                    this.tooltip = tooltip;
                }

                public static /* synthetic */ NumberPVZ copy$default(NumberPVZ numberPVZ, TextDTO textDTO, CommonControlSettings commonControlSettings, Tooltip tooltip, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        textDTO = numberPVZ.number;
                    }
                    if ((i11 & 2) != 0) {
                        commonControlSettings = numberPVZ.common;
                    }
                    if ((i11 & 4) != 0) {
                        tooltip = numberPVZ.tooltip;
                    }
                    return numberPVZ.copy(textDTO, commonControlSettings, tooltip);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final TextDTO getNumber() {
                    return this.number;
                }

                /* renamed from: component2, reason: from getter */
                public final CommonControlSettings getCommon() {
                    return this.common;
                }

                /* renamed from: component3, reason: from getter */
                public final Tooltip getTooltip() {
                    return this.tooltip;
                }

                @NotNull
                public final NumberPVZ copy(@NotNull TextDTO number, CommonControlSettings common, Tooltip tooltip) {
                    Intrinsics.checkNotNullParameter(number, "number");
                    return new NumberPVZ(number, common, tooltip);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof NumberPVZ)) {
                        return false;
                    }
                    NumberPVZ numberPVZ = (NumberPVZ) other;
                    return Intrinsics.d(this.number, numberPVZ.number) && Intrinsics.d(this.common, numberPVZ.common) && Intrinsics.d(this.tooltip, numberPVZ.tooltip);
                }

                public final CommonControlSettings getCommon() {
                    return this.common;
                }

                @NotNull
                public final TextDTO getNumber() {
                    return this.number;
                }

                public final Tooltip getTooltip() {
                    return this.tooltip;
                }

                public int hashCode() {
                    int hashCode = this.number.hashCode() * 31;
                    CommonControlSettings commonControlSettings = this.common;
                    int hashCode2 = (hashCode + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31;
                    Tooltip tooltip = this.tooltip;
                    return hashCode2 + (tooltip != null ? tooltip.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    return "NumberPVZ(number=" + this.number + ", common=" + this.common + ", tooltip=" + this.tooltip + ")";
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Address(@NotNull String addressBookId, OzonSpannableString ozonSpannableString, boolean z11, boolean z12, List<? extends AtomDTO> list, List<? extends AtomDTO> list2, @NotNull AtomActionDTO clickAction, List<Control> list3, Map<String, TokenizedTrackingInfo> map, OnBoardingDTO onBoardingDTO, List<BadgeDTO> list4, NumberPVZ numberPVZ) {
                Intrinsics.checkNotNullParameter(addressBookId, "addressBookId");
                Intrinsics.checkNotNullParameter(clickAction, "clickAction");
                this.addressBookId = addressBookId;
                this.title = ozonSpannableString;
                this.isSelected = z11;
                this.isEnabled = z12;
                this.elements = list;
                this.bottomElements = list2;
                this.clickAction = clickAction;
                this.controls = list3;
                this.trackingInfo = map;
                this.onboarding = onBoardingDTO;
                this.badges = list4;
                this.numberPVZ = numberPVZ;
            }

            public static /* synthetic */ Address copy$default(Address address, String str, OzonSpannableString ozonSpannableString, boolean z11, boolean z12, List list, List list2, AtomActionDTO atomActionDTO, List list3, Map map, OnBoardingDTO onBoardingDTO, List list4, NumberPVZ numberPVZ, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = address.addressBookId;
                }
                if ((i11 & 2) != 0) {
                    ozonSpannableString = address.title;
                }
                if ((i11 & 4) != 0) {
                    z11 = address.isSelected;
                }
                if ((i11 & 8) != 0) {
                    z12 = address.isEnabled;
                }
                if ((i11 & 16) != 0) {
                    list = address.elements;
                }
                if ((i11 & 32) != 0) {
                    list2 = address.bottomElements;
                }
                if ((i11 & 64) != 0) {
                    atomActionDTO = address.clickAction;
                }
                if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                    list3 = address.controls;
                }
                if ((i11 & 256) != 0) {
                    map = address.trackingInfo;
                }
                if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                    onBoardingDTO = address.onboarding;
                }
                if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                    list4 = address.badges;
                }
                if ((i11 & 2048) != 0) {
                    numberPVZ = address.numberPVZ;
                }
                List list5 = list4;
                NumberPVZ numberPVZ2 = numberPVZ;
                Map map2 = map;
                OnBoardingDTO onBoardingDTO2 = onBoardingDTO;
                AtomActionDTO atomActionDTO2 = atomActionDTO;
                List list6 = list3;
                List list7 = list;
                List list8 = list2;
                return address.copy(str, ozonSpannableString, z11, z12, list7, list8, atomActionDTO2, list6, map2, onBoardingDTO2, list5, numberPVZ2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getAddressBookId() {
                return this.addressBookId;
            }

            /* renamed from: component10, reason: from getter */
            public final OnBoardingDTO getOnboarding() {
                return this.onboarding;
            }

            public final List<BadgeDTO> component11() {
                return this.badges;
            }

            /* renamed from: component12, reason: from getter */
            public final NumberPVZ getNumberPVZ() {
                return this.numberPVZ;
            }

            /* renamed from: component2, reason: from getter */
            public final OzonSpannableString getTitle() {
                return this.title;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getIsSelected() {
                return this.isSelected;
            }

            /* renamed from: component4, reason: from getter */
            public final boolean getIsEnabled() {
                return this.isEnabled;
            }

            public final List<AtomDTO> component5() {
                return this.elements;
            }

            public final List<AtomDTO> component6() {
                return this.bottomElements;
            }

            @NotNull
            /* renamed from: component7, reason: from getter */
            public final AtomActionDTO getClickAction() {
                return this.clickAction;
            }

            public final List<Control> component8() {
                return this.controls;
            }

            public final Map<String, TokenizedTrackingInfo> component9() {
                return this.trackingInfo;
            }

            @NotNull
            public final Address copy(@NotNull String addressBookId, OzonSpannableString title, boolean isSelected, boolean isEnabled, List<? extends AtomDTO> elements, List<? extends AtomDTO> bottomElements, @NotNull AtomActionDTO clickAction, List<Control> controls, Map<String, TokenizedTrackingInfo> trackingInfo, OnBoardingDTO onboarding, List<BadgeDTO> badges, NumberPVZ numberPVZ) {
                Intrinsics.checkNotNullParameter(addressBookId, "addressBookId");
                Intrinsics.checkNotNullParameter(clickAction, "clickAction");
                return new Address(addressBookId, title, isSelected, isEnabled, elements, bottomElements, clickAction, controls, trackingInfo, onboarding, badges, numberPVZ);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Address)) {
                    return false;
                }
                Address address = (Address) other;
                return Intrinsics.d(this.addressBookId, address.addressBookId) && Intrinsics.d(this.title, address.title) && this.isSelected == address.isSelected && this.isEnabled == address.isEnabled && Intrinsics.d(this.elements, address.elements) && Intrinsics.d(this.bottomElements, address.bottomElements) && Intrinsics.d(this.clickAction, address.clickAction) && Intrinsics.d(this.controls, address.controls) && Intrinsics.d(this.trackingInfo, address.trackingInfo) && Intrinsics.d(this.onboarding, address.onboarding) && Intrinsics.d(this.badges, address.badges) && Intrinsics.d(this.numberPVZ, address.numberPVZ);
            }

            @NotNull
            public final String getAddressBookId() {
                return this.addressBookId;
            }

            public final List<BadgeDTO> getBadges() {
                return this.badges;
            }

            public final List<AtomDTO> getBottomElements() {
                return this.bottomElements;
            }

            @NotNull
            public final AtomActionDTO getClickAction() {
                return this.clickAction;
            }

            public final List<Control> getControls() {
                return this.controls;
            }

            public final List<AtomDTO> getElements() {
                return this.elements;
            }

            public final NumberPVZ getNumberPVZ() {
                return this.numberPVZ;
            }

            public final OnBoardingDTO getOnboarding() {
                return this.onboarding;
            }

            public final OzonSpannableString getTitle() {
                return this.title;
            }

            public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public int hashCode() {
                int hashCode = this.addressBookId.hashCode() * 31;
                OzonSpannableString ozonSpannableString = this.title;
                int a11 = C3532b.a(C3532b.a((hashCode + (ozonSpannableString == null ? 0 : ozonSpannableString.hashCode())) * 31, 31, this.isSelected), 31, this.isEnabled);
                List<AtomDTO> list = this.elements;
                int hashCode2 = (a11 + (list == null ? 0 : list.hashCode())) * 31;
                List<AtomDTO> list2 = this.bottomElements;
                int b11 = a.b(this.clickAction, (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31, 31);
                List<Control> list3 = this.controls;
                int hashCode3 = (b11 + (list3 == null ? 0 : list3.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
                OnBoardingDTO onBoardingDTO = this.onboarding;
                int hashCode5 = (hashCode4 + (onBoardingDTO == null ? 0 : onBoardingDTO.hashCode())) * 31;
                List<BadgeDTO> list4 = this.badges;
                int hashCode6 = (hashCode5 + (list4 == null ? 0 : list4.hashCode())) * 31;
                NumberPVZ numberPVZ = this.numberPVZ;
                return hashCode6 + (numberPVZ != null ? numberPVZ.hashCode() : 0);
            }

            public final boolean isEnabled() {
                return this.isEnabled;
            }

            public final boolean isSelected() {
                return this.isSelected;
            }

            @NotNull
            public String toString() {
                String str = this.addressBookId;
                OzonSpannableString ozonSpannableString = this.title;
                boolean z11 = this.isSelected;
                boolean z12 = this.isEnabled;
                List<AtomDTO> list = this.elements;
                List<AtomDTO> list2 = this.bottomElements;
                AtomActionDTO atomActionDTO = this.clickAction;
                List<Control> list3 = this.controls;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                OnBoardingDTO onBoardingDTO = this.onboarding;
                List<BadgeDTO> list4 = this.badges;
                NumberPVZ numberPVZ = this.numberPVZ;
                StringBuilder sb2 = new StringBuilder("Address(addressBookId=");
                sb2.append(str);
                sb2.append(", title=");
                sb2.append((Object) ozonSpannableString);
                sb2.append(", isSelected=");
                f.c(", isEnabled=", ", elements=", sb2, z11, z12);
                C2616s.g(", bottomElements=", ", clickAction=", sb2, list, list2);
                sb2.append(atomActionDTO);
                sb2.append(", controls=");
                sb2.append(list3);
                sb2.append(", trackingInfo=");
                sb2.append(map);
                sb2.append(", onboarding=");
                sb2.append(onBoardingDTO);
                sb2.append(", badges=");
                sb2.append(list4);
                sb2.append(", numberPVZ=");
                sb2.append(numberPVZ);
                sb2.append(")");
                return sb2.toString();
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public /* synthetic */ Address(String str, OzonSpannableString ozonSpannableString, boolean z11, boolean z12, List list, List list2, AtomActionDTO atomActionDTO, List list3, Map map, OnBoardingDTO onBoardingDTO, List list4, NumberPVZ numberPVZ, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, ozonSpannableString, z11, r6, r7, r8, r9, r10, r11, r12, r13, r14);
                NumberPVZ numberPVZ2;
                List list5;
                OnBoardingDTO onBoardingDTO2;
                Map map2;
                List list6;
                AtomActionDTO atomActionDTO2;
                List list7;
                List list8;
                boolean z13;
                z11 = (i11 & 4) != 0 ? false : z11;
                if ((i11 & 8) != 0) {
                    numberPVZ2 = numberPVZ;
                    list5 = list4;
                    onBoardingDTO2 = onBoardingDTO;
                    map2 = map;
                    list6 = list3;
                    atomActionDTO2 = atomActionDTO;
                    list7 = list2;
                    list8 = list;
                    z13 = false;
                } else {
                    numberPVZ2 = numberPVZ;
                    list5 = list4;
                    onBoardingDTO2 = onBoardingDTO;
                    map2 = map;
                    list6 = list3;
                    atomActionDTO2 = atomActionDTO;
                    list7 = list2;
                    list8 = list;
                    z13 = z12;
                }
            }
        }
    }
}
