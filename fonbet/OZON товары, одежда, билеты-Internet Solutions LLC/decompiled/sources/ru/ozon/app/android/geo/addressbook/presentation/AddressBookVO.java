package ru.ozon.app.android.geo.addressbook.presentation;

import Ak.C2436a;
import B3.p;
import Fm.C3051a;
import G.g;
import Kk.C3532b;
import N3.C3660k;
import Pk0.a;
import T7.P;
import WZ.t;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cart.ui.tooltip.CartTooltipVO;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.button.ButtonIcon;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/geo/addressbook/presentation/AddressBookVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "<init>", "()V", "Address", "Analytics", "Lru/ozon/app/android/geo/addressbook/presentation/AddressBookVO$Address;", "Lru/ozon/app/android/geo/addressbook/presentation/AddressBookVO$Analytics;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class AddressBookVO implements c {

    @Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b&\b\u0086\b\u0018\u00002\u00020\u0001:\u0003FGHB\u009b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u000f\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\u00062\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b\u0007\u0010-R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b.\u0010-R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00105\u001a\u0004\b6\u00107R\u001f\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u00108\u001a\u0004\b9\u0010:R\u001f\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0012\u00108\u001a\u0004\b;\u0010:R%\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010?\u001a\u0004\b@\u0010AR\u001f\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0019\u00108\u001a\u0004\bB\u0010:R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010C\u001a\u0004\bD\u0010E¨\u0006I"}, d2 = {"Lru/ozon/app/android/geo/addressbook/presentation/AddressBookVO$Address;", "Lru/ozon/app/android/geo/addressbook/presentation/AddressBookVO;", "", "id", "", "addressBookId", "", "isEnabled", "bottomSeparator", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "Lru/ozon/app/android/geo/addressbook/presentation/AddressBookVO$Address$RadioItem;", FormPageDTO.Field.FIELD_TYPE_ADDRESS, "Lru/ozon/app/android/geo/addressbook/presentation/AddressBookVO$Address$Controls;", "controls", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "details", "bottomDetails", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onboarding", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badges", "Lru/ozon/app/android/geo/addressbook/presentation/AddressBookVO$Address$NumberPVZ;", "numberPVZ", "<init>", "(JLjava/lang/String;ZZLru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/app/android/geo/addressbook/presentation/AddressBookVO$Address$RadioItem;Lru/ozon/app/android/geo/addressbook/presentation/AddressBookVO$Address$Controls;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Ljava/util/List;Lru/ozon/app/android/geo/addressbook/presentation/AddressBookVO$Address$NumberPVZ;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getAddressBookId", "Z", "()Z", "getBottomSeparator", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "Lru/ozon/app/android/geo/addressbook/presentation/AddressBookVO$Address$RadioItem;", "getAddress", "()Lru/ozon/app/android/geo/addressbook/presentation/AddressBookVO$Address$RadioItem;", "Lru/ozon/app/android/geo/addressbook/presentation/AddressBookVO$Address$Controls;", "getControls", "()Lru/ozon/app/android/geo/addressbook/presentation/AddressBookVO$Address$Controls;", "Ljava/util/List;", "getDetails", "()Ljava/util/List;", "getBottomDetails", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getOnboarding", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getBadges", "Lru/ozon/app/android/geo/addressbook/presentation/AddressBookVO$Address$NumberPVZ;", "getNumberPVZ", "()Lru/ozon/app/android/geo/addressbook/presentation/AddressBookVO$Address$NumberPVZ;", "Controls", "RadioItem", "NumberPVZ", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Address extends AddressBookVO {

        @NotNull
        private final AtomActionDTO action;

        @NotNull
        private final RadioItem address;

        @NotNull
        private final String addressBookId;
        private final List<BadgeDTO> badges;
        private final List<AtomDTO> bottomDetails;
        private final boolean bottomSeparator;
        private final Controls controls;
        private final List<AtomDTO> details;
        private final long id;
        private final boolean isEnabled;
        private final NumberPVZ numberPVZ;
        private final OnBoardingDTO onboarding;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0019B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/geo/addressbook/presentation/AddressBookVO$Address$Controls;", "", "", "Lru/ozon/app/android/geo/addressbook/presentation/AddressBookVO$Address$Controls$Control;", "items", "Lru/ozon/uni/atoms/data/button/ButtonIcon;", "iconButton", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonIcon;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/button/ButtonIcon;", "getIconButton", "()Lru/ozon/uni/atoms/data/button/ButtonIcon;", "Control", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Controls {

            @NotNull
            private final ButtonIcon iconButton;

            @NotNull
            private final List<Control> items;

            @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\u000eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/geo/addressbook/presentation/AddressBookVO$Address$Controls$Control;", "", "", "text", "icon", "iconRes", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "getIcon", "getIconRes", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Control {
                private final AtomActionDTO action;
                private final String icon;
                private final String iconRes;

                @NotNull
                private final String text;
                private final Map<String, TokenizedTrackingInfo> trackingInfo;

                public Control(@NotNull String text, String str, String str2, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
                    Intrinsics.checkNotNullParameter(text, "text");
                    this.text = text;
                    this.icon = str;
                    this.iconRes = str2;
                    this.action = atomActionDTO;
                    this.trackingInfo = map;
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
                    int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                    AtomActionDTO atomActionDTO = this.action;
                    int hashCode4 = (hashCode3 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
                    Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                    return hashCode4 + (map != null ? map.hashCode() : 0);
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

            public Controls(@NotNull List<Control> items, @NotNull ButtonIcon iconButton) {
                Intrinsics.checkNotNullParameter(items, "items");
                Intrinsics.checkNotNullParameter(iconButton, "iconButton");
                this.items = items;
                this.iconButton = iconButton;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Controls)) {
                    return false;
                }
                Controls controls = (Controls) other;
                return Intrinsics.d(this.items, controls.items) && Intrinsics.d(this.iconButton, controls.iconButton);
            }

            @NotNull
            public final ButtonIcon getIconButton() {
                return this.iconButton;
            }

            @NotNull
            public final List<Control> getItems() {
                return this.items;
            }

            public int hashCode() {
                return this.iconButton.hashCode() + (this.items.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "Controls(items=" + this.items + ", iconButton=" + this.iconButton + ")";
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001dB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/geo/addressbook/presentation/AddressBookVO$Address$NumberPVZ;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "number", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/app/android/geo/addressbook/presentation/AddressBookVO$Address$NumberPVZ$Tooltip;", "tooltip", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/geo/addressbook/presentation/AddressBookVO$Address$NumberPVZ$Tooltip;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getNumber", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/geo/addressbook/presentation/AddressBookVO$Address$NumberPVZ$Tooltip;", "getTooltip", "()Lru/ozon/app/android/geo/addressbook/presentation/AddressBookVO$Address$NumberPVZ$Tooltip;", "Tooltip", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class NumberPVZ {
            private final AtomAction action;

            @NotNull
            private final TextDTO number;
            private final Tooltip tooltip;

            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/geo/addressbook/presentation/AddressBookVO$Address$NumberPVZ$Tooltip;", "", "Lru/ozon/app/android/cart/ui/tooltip/CartTooltipVO;", "tooltip", "", "delayTime", "displayTime", "<init>", "(Lru/ozon/app/android/cart/ui/tooltip/CartTooltipVO;Ljava/lang/Long;Ljava/lang/Long;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/cart/ui/tooltip/CartTooltipVO;", "getTooltip", "()Lru/ozon/app/android/cart/ui/tooltip/CartTooltipVO;", "Ljava/lang/Long;", "getDelayTime", "()Ljava/lang/Long;", "getDisplayTime", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Tooltip {
                private final Long delayTime;
                private final Long displayTime;

                @NotNull
                private final CartTooltipVO tooltip;

                public Tooltip(@NotNull CartTooltipVO tooltip, Long l11, Long l12) {
                    Intrinsics.checkNotNullParameter(tooltip, "tooltip");
                    this.tooltip = tooltip;
                    this.delayTime = l11;
                    this.displayTime = l12;
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
                public final CartTooltipVO getTooltip() {
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
                    CartTooltipVO cartTooltipVO = this.tooltip;
                    Long l11 = this.delayTime;
                    Long l12 = this.displayTime;
                    StringBuilder sb2 = new StringBuilder("Tooltip(tooltip=");
                    sb2.append(cartTooltipVO);
                    sb2.append(", delayTime=");
                    sb2.append(l11);
                    sb2.append(", displayTime=");
                    return C3051a.d(sb2, l12, ")");
                }
            }

            public NumberPVZ(@NotNull TextDTO number, AtomAction atomAction, Tooltip tooltip) {
                Intrinsics.checkNotNullParameter(number, "number");
                this.number = number;
                this.action = atomAction;
                this.tooltip = tooltip;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NumberPVZ)) {
                    return false;
                }
                NumberPVZ numberPVZ = (NumberPVZ) other;
                return Intrinsics.d(this.number, numberPVZ.number) && Intrinsics.d(this.action, numberPVZ.action) && Intrinsics.d(this.tooltip, numberPVZ.tooltip);
            }

            public final AtomAction getAction() {
                return this.action;
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
                AtomAction atomAction = this.action;
                int hashCode2 = (hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
                Tooltip tooltip = this.tooltip;
                return hashCode2 + (tooltip != null ? tooltip.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "NumberPVZ(number=" + this.number + ", action=" + this.action + ", tooltip=" + this.tooltip + ")";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0005\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0006\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/geo/addressbook/presentation/AddressBookVO$Address$RadioItem;", "", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "text", "", "isChecked", "isEnabled", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getText", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "Z", "()Z", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class RadioItem {
            private final boolean isChecked;
            private final boolean isEnabled;
            private final OzonSpannableString text;

            public RadioItem(OzonSpannableString ozonSpannableString, boolean z11, boolean z12) {
                this.text = ozonSpannableString;
                this.isChecked = z11;
                this.isEnabled = z12;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof RadioItem)) {
                    return false;
                }
                RadioItem radioItem = (RadioItem) other;
                return Intrinsics.d(this.text, radioItem.text) && this.isChecked == radioItem.isChecked && this.isEnabled == radioItem.isEnabled;
            }

            public final OzonSpannableString getText() {
                return this.text;
            }

            public int hashCode() {
                OzonSpannableString ozonSpannableString = this.text;
                return Boolean.hashCode(this.isEnabled) + C3532b.a((ozonSpannableString == null ? 0 : ozonSpannableString.hashCode()) * 31, 31, this.isChecked);
            }

            /* renamed from: isChecked, reason: from getter */
            public final boolean getIsChecked() {
                return this.isChecked;
            }

            /* renamed from: isEnabled, reason: from getter */
            public final boolean getIsEnabled() {
                return this.isEnabled;
            }

            @NotNull
            public String toString() {
                OzonSpannableString ozonSpannableString = this.text;
                boolean z11 = this.isChecked;
                boolean z12 = this.isEnabled;
                StringBuilder sb2 = new StringBuilder("RadioItem(text=");
                sb2.append((Object) ozonSpannableString);
                sb2.append(", isChecked=");
                sb2.append(z11);
                sb2.append(", isEnabled=");
                return a.a(")", sb2, z12);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Address(long j11, @NotNull String addressBookId, boolean z11, boolean z12, @NotNull AtomActionDTO action, @NotNull RadioItem address, Controls controls, List<? extends AtomDTO> list, List<? extends AtomDTO> list2, Map<String, TokenizedTrackingInfo> map, OnBoardingDTO onBoardingDTO, List<BadgeDTO> list3, NumberPVZ numberPVZ) {
            super(null);
            Intrinsics.checkNotNullParameter(addressBookId, "addressBookId");
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(address, "address");
            this.id = j11;
            this.addressBookId = addressBookId;
            this.isEnabled = z11;
            this.bottomSeparator = z12;
            this.action = action;
            this.address = address;
            this.controls = controls;
            this.details = list;
            this.bottomDetails = list2;
            this.trackingInfo = map;
            this.onboarding = onBoardingDTO;
            this.badges = list3;
            this.numberPVZ = numberPVZ;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Address)) {
                return false;
            }
            Address address = (Address) other;
            return this.id == address.id && Intrinsics.d(this.addressBookId, address.addressBookId) && this.isEnabled == address.isEnabled && this.bottomSeparator == address.bottomSeparator && Intrinsics.d(this.action, address.action) && Intrinsics.d(this.address, address.address) && Intrinsics.d(this.controls, address.controls) && Intrinsics.d(this.details, address.details) && Intrinsics.d(this.bottomDetails, address.bottomDetails) && Intrinsics.d(this.trackingInfo, address.trackingInfo) && Intrinsics.d(this.onboarding, address.onboarding) && Intrinsics.d(this.badges, address.badges) && Intrinsics.d(this.numberPVZ, address.numberPVZ);
        }

        @NotNull
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final RadioItem getAddress() {
            return this.address;
        }

        public final List<BadgeDTO> getBadges() {
            return this.badges;
        }

        public final List<AtomDTO> getBottomDetails() {
            return this.bottomDetails;
        }

        public final boolean getBottomSeparator() {
            return this.bottomSeparator;
        }

        public final Controls getControls() {
            return this.controls;
        }

        public final List<AtomDTO> getDetails() {
            return this.details;
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        public final NumberPVZ getNumberPVZ() {
            return this.numberPVZ;
        }

        public final OnBoardingDTO getOnboarding() {
            return this.onboarding;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = (this.address.hashCode() + Ih.a.b(this.action, C3532b.a(C3532b.a(g.a(Long.hashCode(this.id) * 31, 31, this.addressBookId), 31, this.isEnabled), 31, this.bottomSeparator), 31)) * 31;
            Controls controls = this.controls;
            int hashCode2 = (hashCode + (controls == null ? 0 : controls.hashCode())) * 31;
            List<AtomDTO> list = this.details;
            int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            List<AtomDTO> list2 = this.bottomDetails;
            int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode5 = (hashCode4 + (map == null ? 0 : map.hashCode())) * 31;
            OnBoardingDTO onBoardingDTO = this.onboarding;
            int hashCode6 = (hashCode5 + (onBoardingDTO == null ? 0 : onBoardingDTO.hashCode())) * 31;
            List<BadgeDTO> list3 = this.badges;
            int hashCode7 = (hashCode6 + (list3 == null ? 0 : list3.hashCode())) * 31;
            NumberPVZ numberPVZ = this.numberPVZ;
            return hashCode7 + (numberPVZ != null ? numberPVZ.hashCode() : 0);
        }

        /* renamed from: isEnabled, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            String str = this.addressBookId;
            boolean z11 = this.isEnabled;
            boolean z12 = this.bottomSeparator;
            AtomActionDTO atomActionDTO = this.action;
            RadioItem radioItem = this.address;
            Controls controls = this.controls;
            List<AtomDTO> list = this.details;
            List<AtomDTO> list2 = this.bottomDetails;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            OnBoardingDTO onBoardingDTO = this.onboarding;
            List<BadgeDTO> list3 = this.badges;
            NumberPVZ numberPVZ = this.numberPVZ;
            StringBuilder c11 = C2436a.c(j11, "Address(id=", ", addressBookId=", str);
            C2436a.e(", isEnabled=", ", bottomSeparator=", c11, z11, z12);
            c11.append(", action=");
            c11.append(atomActionDTO);
            c11.append(", address=");
            c11.append(radioItem);
            c11.append(", controls=");
            c11.append(controls);
            c11.append(", details=");
            c11.append(list);
            c11.append(", bottomDetails=");
            c11.append(list2);
            c11.append(", trackingInfo=");
            c11.append(map);
            c11.append(", onboarding=");
            c11.append(onBoardingDTO);
            c11.append(", badges=");
            c11.append(list3);
            c11.append(", numberPVZ=");
            c11.append(numberPVZ);
            c11.append(")");
            return c11.toString();
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/geo/addressbook/presentation/AddressBookVO$Analytics;", "Lru/ozon/app/android/geo/addressbook/presentation/AddressBookVO;", "", "id", "LWZ/t;", "tokenizedEvent", "<init>", "(JLWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Analytics extends AddressBookVO {
        private final long id;
        private final t tokenizedEvent;

        public Analytics(long j11, t tVar) {
            super(null);
            this.id = j11;
            this.tokenizedEvent = tVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Analytics)) {
                return false;
            }
            Analytics analytics = (Analytics) other;
            return this.id == analytics.id && Intrinsics.d(this.tokenizedEvent, analytics.tokenizedEvent);
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public int hashCode() {
            int hashCode = Long.hashCode(this.id) * 31;
            t tVar = this.tokenizedEvent;
            return hashCode + (tVar == null ? 0 : tVar.hashCode());
        }

        @NotNull
        public String toString() {
            return "Analytics(id=" + this.id + ", tokenizedEvent=" + this.tokenizedEvent + ")";
        }
    }

    public /* synthetic */ AddressBookVO(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    private AddressBookVO() {
    }
}
