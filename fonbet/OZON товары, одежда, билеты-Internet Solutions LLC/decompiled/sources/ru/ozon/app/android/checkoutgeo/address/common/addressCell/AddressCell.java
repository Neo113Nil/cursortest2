package ru.ozon.app.android.checkoutgeo.address.common.addressCell;

import B4.V;
import C.o0;
import G.g;
import Kk.C3532b;
import N3.C3660k;
import Xc.a;
import Xc.b;
import c8.C5766e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import spay.sdk.domain.model.FraudMonInfo;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00152\u00020\u0001:\u0003\u0015\u0016\u0017B\u001d\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell;", "", "cell", "updateSettings", "Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell$UpdateSettings;", "<init>", "(Ljava/lang/Object;Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell$UpdateSettings;)V", "getCell", "()Ljava/lang/Object;", "getUpdateSettings", "()Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell$UpdateSettings;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "RightLeftTitlesCell24Icon", "UpdateSettings", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class AddressCell {

    @NotNull
    public static final String CELL_REGULAR_24_ICON_PICKER = "cellRegular24IconPicker";

    @NotNull
    public static final String RIGHT_LEFT_TITLES_CELL_24_ICON = "rightLeftTitlesCell24Icon";
    private final Object cell;
    private final UpdateSettings updateSettings;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0005HÆ\u0003J$\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell$UpdateSettings;", "", "isNeedToForceUpdate", "", "miniApp", "Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell$UpdateSettings$MiniApp;", "<init>", "(Ljava/lang/Boolean;Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell$UpdateSettings$MiniApp;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMiniApp", "()Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell$UpdateSettings$MiniApp;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell$UpdateSettings$MiniApp;)Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell$UpdateSettings;", "equals", "other", "hashCode", "", "toString", "", "MiniApp", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class UpdateSettings {
        private final Boolean isNeedToForceUpdate;

        @NotNull
        private final MiniApp miniApp;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell$UpdateSettings$MiniApp;", "", "<init>", "(Ljava/lang/String;I)V", FraudMonInfo.UNKNOWN, "MAIN", "SUPERMARKET", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class MiniApp {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ MiniApp[] $VALUES;
            public static final MiniApp UNKNOWN = new MiniApp(FraudMonInfo.UNKNOWN, 0);
            public static final MiniApp MAIN = new MiniApp("MAIN", 1);
            public static final MiniApp SUPERMARKET = new MiniApp("SUPERMARKET", 2);

            private static final /* synthetic */ MiniApp[] $values() {
                return new MiniApp[]{UNKNOWN, MAIN, SUPERMARKET};
            }

            static {
                MiniApp[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private MiniApp(String str, int i11) {
            }

            public static MiniApp valueOf(String str) {
                return (MiniApp) Enum.valueOf(MiniApp.class, str);
            }

            public static MiniApp[] values() {
                return (MiniApp[]) $VALUES.clone();
            }
        }

        public UpdateSettings(Boolean bool, @NotNull MiniApp miniApp) {
            Intrinsics.checkNotNullParameter(miniApp, "miniApp");
            this.isNeedToForceUpdate = bool;
            this.miniApp = miniApp;
        }

        public static /* synthetic */ UpdateSettings copy$default(UpdateSettings updateSettings, Boolean bool, MiniApp miniApp, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                bool = updateSettings.isNeedToForceUpdate;
            }
            if ((i11 & 2) != 0) {
                miniApp = updateSettings.miniApp;
            }
            return updateSettings.copy(bool, miniApp);
        }

        /* renamed from: component1, reason: from getter */
        public final Boolean getIsNeedToForceUpdate() {
            return this.isNeedToForceUpdate;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final MiniApp getMiniApp() {
            return this.miniApp;
        }

        @NotNull
        public final UpdateSettings copy(Boolean isNeedToForceUpdate, @NotNull MiniApp miniApp) {
            Intrinsics.checkNotNullParameter(miniApp, "miniApp");
            return new UpdateSettings(isNeedToForceUpdate, miniApp);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpdateSettings)) {
                return false;
            }
            UpdateSettings updateSettings = (UpdateSettings) other;
            return Intrinsics.d(this.isNeedToForceUpdate, updateSettings.isNeedToForceUpdate) && this.miniApp == updateSettings.miniApp;
        }

        @NotNull
        public final MiniApp getMiniApp() {
            return this.miniApp;
        }

        public int hashCode() {
            Boolean bool = this.isNeedToForceUpdate;
            return this.miniApp.hashCode() + ((bool == null ? 0 : bool.hashCode()) * 31);
        }

        public final Boolean isNeedToForceUpdate() {
            return this.isNeedToForceUpdate;
        }

        @NotNull
        public String toString() {
            return "UpdateSettings(isNeedToForceUpdate=" + this.isNeedToForceUpdate + ", miniApp=" + this.miniApp + ")";
        }
    }

    public AddressCell(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "rightLeftTitlesCell24Icon", type = RightLeftTitlesCell24Icon.class), @ProtoOneOfSignature(name = "cellRegular24IconPicker", type = CellAtom.CellRegular24IconPicker.class)}) @ProtoOneOf(label = "type") Object obj, UpdateSettings updateSettings) {
        this.cell = obj;
        this.updateSettings = updateSettings;
    }

    public static /* synthetic */ AddressCell copy$default(AddressCell addressCell, Object obj, UpdateSettings updateSettings, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            obj = addressCell.cell;
        }
        if ((i11 & 2) != 0) {
            updateSettings = addressCell.updateSettings;
        }
        return addressCell.copy(obj, updateSettings);
    }

    /* renamed from: component1, reason: from getter */
    public final Object getCell() {
        return this.cell;
    }

    /* renamed from: component2, reason: from getter */
    public final UpdateSettings getUpdateSettings() {
        return this.updateSettings;
    }

    @NotNull
    public final AddressCell copy(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "rightLeftTitlesCell24Icon", type = RightLeftTitlesCell24Icon.class), @ProtoOneOfSignature(name = "cellRegular24IconPicker", type = CellAtom.CellRegular24IconPicker.class)}) @ProtoOneOf(label = "type") Object cell, UpdateSettings updateSettings) {
        return new AddressCell(cell, updateSettings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressCell)) {
            return false;
        }
        AddressCell addressCell = (AddressCell) other;
        return Intrinsics.d(this.cell, addressCell.cell) && Intrinsics.d(this.updateSettings, addressCell.updateSettings);
    }

    public final Object getCell() {
        return this.cell;
    }

    public final UpdateSettings getUpdateSettings() {
        return this.updateSettings;
    }

    public int hashCode() {
        Object obj = this.cell;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        UpdateSettings updateSettings = this.updateSettings;
        return hashCode + (updateSettings != null ? updateSettings.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AddressCell(cell=" + this.cell + ", updateSettings=" + this.updateSettings + ")";
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002:;B\u0095\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u000bHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0017\u00102\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J\u0017\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0011HÆ\u0003J\u00ad\u0001\u00104\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0011HÆ\u0001J\u0013\u00105\u001a\u00020\u000b2\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u000208HÖ\u0001J\t\u00109\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001f\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u001f\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&¨\u0006<"}, d2 = {"Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell$RightLeftTitlesCell24Icon;", "", "leftTitle", "", "rightTitle", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "icon", "iconTintColor", "titlesColor", "hideSeparator", "", "rightIcon", "rightIconTintColor", "styleType", "Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell$RightLeftTitlesCell24Icon$StyleType;", "styleInfo", "", "Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell$RightLeftTitlesCell24Icon$StyleColors;", "trackingInfo", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell$RightLeftTitlesCell24Icon$StyleType;Ljava/util/Map;Ljava/util/Map;)V", "getLeftTitle", "()Ljava/lang/String;", "getRightTitle", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getIcon", "getIconTintColor", "getTitlesColor", "getHideSeparator", "()Z", "getRightIcon", "getRightIconTintColor", "getStyleType", "()Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell$RightLeftTitlesCell24Icon$StyleType;", "getStyleInfo", "()Ljava/util/Map;", "getTrackingInfo", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "hashCode", "", "toString", "StyleType", "StyleColors", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class RightLeftTitlesCell24Icon {
        private final AtomActionDTO action;
        private final boolean hideSeparator;
        private final String icon;
        private final String iconTintColor;
        private final String leftTitle;
        private final String rightIcon;
        private final String rightIconTintColor;

        @NotNull
        private final String rightTitle;
        private final Map<String, StyleColors> styleInfo;
        private final StyleType styleType;
        private final String titlesColor;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell$RightLeftTitlesCell24Icon$StyleColors;", "", "common", "Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell$RightLeftTitlesCell24Icon$StyleColors$Colors;", "saleActive", "<init>", "(Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell$RightLeftTitlesCell24Icon$StyleColors$Colors;Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell$RightLeftTitlesCell24Icon$StyleColors$Colors;)V", "getCommon", "()Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell$RightLeftTitlesCell24Icon$StyleColors$Colors;", "getSaleActive", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Colors", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class StyleColors {

            @NotNull
            private final Colors common;

            @NotNull
            private final Colors saleActive;

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell$RightLeftTitlesCell24Icon$StyleColors$Colors;", "", "titlesColor", "", "leftIconTintColor", "rightIconTintColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitlesColor", "()Ljava/lang/String;", "getLeftIconTintColor", "getRightIconTintColor", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Colors {
                private final String leftIconTintColor;
                private final String rightIconTintColor;
                private final String titlesColor;

                public Colors(String str, String str2, String str3) {
                    this.titlesColor = str;
                    this.leftIconTintColor = str2;
                    this.rightIconTintColor = str3;
                }

                public static /* synthetic */ Colors copy$default(Colors colors, String str, String str2, String str3, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        str = colors.titlesColor;
                    }
                    if ((i11 & 2) != 0) {
                        str2 = colors.leftIconTintColor;
                    }
                    if ((i11 & 4) != 0) {
                        str3 = colors.rightIconTintColor;
                    }
                    return colors.copy(str, str2, str3);
                }

                /* renamed from: component1, reason: from getter */
                public final String getTitlesColor() {
                    return this.titlesColor;
                }

                /* renamed from: component2, reason: from getter */
                public final String getLeftIconTintColor() {
                    return this.leftIconTintColor;
                }

                /* renamed from: component3, reason: from getter */
                public final String getRightIconTintColor() {
                    return this.rightIconTintColor;
                }

                @NotNull
                public final Colors copy(String titlesColor, String leftIconTintColor, String rightIconTintColor) {
                    return new Colors(titlesColor, leftIconTintColor, rightIconTintColor);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Colors)) {
                        return false;
                    }
                    Colors colors = (Colors) other;
                    return Intrinsics.d(this.titlesColor, colors.titlesColor) && Intrinsics.d(this.leftIconTintColor, colors.leftIconTintColor) && Intrinsics.d(this.rightIconTintColor, colors.rightIconTintColor);
                }

                public final String getLeftIconTintColor() {
                    return this.leftIconTintColor;
                }

                public final String getRightIconTintColor() {
                    return this.rightIconTintColor;
                }

                public final String getTitlesColor() {
                    return this.titlesColor;
                }

                public int hashCode() {
                    String str = this.titlesColor;
                    int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.leftIconTintColor;
                    int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                    String str3 = this.rightIconTintColor;
                    return hashCode2 + (str3 != null ? str3.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    String str = this.titlesColor;
                    String str2 = this.leftIconTintColor;
                    return o0.c(C3660k.d("Colors(titlesColor=", str, ", leftIconTintColor=", str2, ", rightIconTintColor="), this.rightIconTintColor, ")");
                }
            }

            public StyleColors(@NotNull Colors common, @NotNull Colors saleActive) {
                Intrinsics.checkNotNullParameter(common, "common");
                Intrinsics.checkNotNullParameter(saleActive, "saleActive");
                this.common = common;
                this.saleActive = saleActive;
            }

            public static /* synthetic */ StyleColors copy$default(StyleColors styleColors, Colors colors, Colors colors2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    colors = styleColors.common;
                }
                if ((i11 & 2) != 0) {
                    colors2 = styleColors.saleActive;
                }
                return styleColors.copy(colors, colors2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final Colors getCommon() {
                return this.common;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final Colors getSaleActive() {
                return this.saleActive;
            }

            @NotNull
            public final StyleColors copy(@NotNull Colors common, @NotNull Colors saleActive) {
                Intrinsics.checkNotNullParameter(common, "common");
                Intrinsics.checkNotNullParameter(saleActive, "saleActive");
                return new StyleColors(common, saleActive);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof StyleColors)) {
                    return false;
                }
                StyleColors styleColors = (StyleColors) other;
                return Intrinsics.d(this.common, styleColors.common) && Intrinsics.d(this.saleActive, styleColors.saleActive);
            }

            @NotNull
            public final Colors getCommon() {
                return this.common;
            }

            @NotNull
            public final Colors getSaleActive() {
                return this.saleActive;
            }

            public int hashCode() {
                return this.saleActive.hashCode() + (this.common.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "StyleColors(common=" + this.common + ", saleActive=" + this.saleActive + ")";
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell$RightLeftTitlesCell24Icon$StyleType;", "", "<init>", "(Ljava/lang/String;I)V", "INVALID", "STYLE_TYPE_HOME", "STYLE_TYPE_CART", "STYLE_TYPE_FRESH", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class StyleType {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ StyleType[] $VALUES;
            public static final StyleType INVALID = new StyleType("INVALID", 0);
            public static final StyleType STYLE_TYPE_HOME = new StyleType("STYLE_TYPE_HOME", 1);
            public static final StyleType STYLE_TYPE_CART = new StyleType("STYLE_TYPE_CART", 2);
            public static final StyleType STYLE_TYPE_FRESH = new StyleType("STYLE_TYPE_FRESH", 3);

            private static final /* synthetic */ StyleType[] $values() {
                return new StyleType[]{INVALID, STYLE_TYPE_HOME, STYLE_TYPE_CART, STYLE_TYPE_FRESH};
            }

            static {
                StyleType[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private StyleType(String str, int i11) {
            }

            public static StyleType valueOf(String str) {
                return (StyleType) Enum.valueOf(StyleType.class, str);
            }

            public static StyleType[] values() {
                return (StyleType[]) $VALUES.clone();
            }
        }

        public RightLeftTitlesCell24Icon(String str, @NotNull String rightTitle, AtomActionDTO atomActionDTO, String str2, String str3, String str4, boolean z11, String str5, String str6, StyleType styleType, Map<String, StyleColors> map, Map<String, TokenizedTrackingInfo> map2) {
            Intrinsics.checkNotNullParameter(rightTitle, "rightTitle");
            this.leftTitle = str;
            this.rightTitle = rightTitle;
            this.action = atomActionDTO;
            this.icon = str2;
            this.iconTintColor = str3;
            this.titlesColor = str4;
            this.hideSeparator = z11;
            this.rightIcon = str5;
            this.rightIconTintColor = str6;
            this.styleType = styleType;
            this.styleInfo = map;
            this.trackingInfo = map2;
        }

        public static /* synthetic */ RightLeftTitlesCell24Icon copy$default(RightLeftTitlesCell24Icon rightLeftTitlesCell24Icon, String str, String str2, AtomActionDTO atomActionDTO, String str3, String str4, String str5, boolean z11, String str6, String str7, StyleType styleType, Map map, Map map2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = rightLeftTitlesCell24Icon.leftTitle;
            }
            if ((i11 & 2) != 0) {
                str2 = rightLeftTitlesCell24Icon.rightTitle;
            }
            if ((i11 & 4) != 0) {
                atomActionDTO = rightLeftTitlesCell24Icon.action;
            }
            if ((i11 & 8) != 0) {
                str3 = rightLeftTitlesCell24Icon.icon;
            }
            if ((i11 & 16) != 0) {
                str4 = rightLeftTitlesCell24Icon.iconTintColor;
            }
            if ((i11 & 32) != 0) {
                str5 = rightLeftTitlesCell24Icon.titlesColor;
            }
            if ((i11 & 64) != 0) {
                z11 = rightLeftTitlesCell24Icon.hideSeparator;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                str6 = rightLeftTitlesCell24Icon.rightIcon;
            }
            if ((i11 & 256) != 0) {
                str7 = rightLeftTitlesCell24Icon.rightIconTintColor;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                styleType = rightLeftTitlesCell24Icon.styleType;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                map = rightLeftTitlesCell24Icon.styleInfo;
            }
            if ((i11 & 2048) != 0) {
                map2 = rightLeftTitlesCell24Icon.trackingInfo;
            }
            Map map3 = map;
            Map map4 = map2;
            String str8 = str7;
            StyleType styleType2 = styleType;
            boolean z12 = z11;
            String str9 = str6;
            String str10 = str4;
            String str11 = str5;
            return rightLeftTitlesCell24Icon.copy(str, str2, atomActionDTO, str3, str10, str11, z12, str9, str8, styleType2, map3, map4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getLeftTitle() {
            return this.leftTitle;
        }

        /* renamed from: component10, reason: from getter */
        public final StyleType getStyleType() {
            return this.styleType;
        }

        public final Map<String, StyleColors> component11() {
            return this.styleInfo;
        }

        public final Map<String, TokenizedTrackingInfo> component12() {
            return this.trackingInfo;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getRightTitle() {
            return this.rightTitle;
        }

        /* renamed from: component3, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        /* renamed from: component4, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        /* renamed from: component5, reason: from getter */
        public final String getIconTintColor() {
            return this.iconTintColor;
        }

        /* renamed from: component6, reason: from getter */
        public final String getTitlesColor() {
            return this.titlesColor;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getHideSeparator() {
            return this.hideSeparator;
        }

        /* renamed from: component8, reason: from getter */
        public final String getRightIcon() {
            return this.rightIcon;
        }

        /* renamed from: component9, reason: from getter */
        public final String getRightIconTintColor() {
            return this.rightIconTintColor;
        }

        @NotNull
        public final RightLeftTitlesCell24Icon copy(String leftTitle, @NotNull String rightTitle, AtomActionDTO action, String icon, String iconTintColor, String titlesColor, boolean hideSeparator, String rightIcon, String rightIconTintColor, StyleType styleType, Map<String, StyleColors> styleInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(rightTitle, "rightTitle");
            return new RightLeftTitlesCell24Icon(leftTitle, rightTitle, action, icon, iconTintColor, titlesColor, hideSeparator, rightIcon, rightIconTintColor, styleType, styleInfo, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RightLeftTitlesCell24Icon)) {
                return false;
            }
            RightLeftTitlesCell24Icon rightLeftTitlesCell24Icon = (RightLeftTitlesCell24Icon) other;
            return Intrinsics.d(this.leftTitle, rightLeftTitlesCell24Icon.leftTitle) && Intrinsics.d(this.rightTitle, rightLeftTitlesCell24Icon.rightTitle) && Intrinsics.d(this.action, rightLeftTitlesCell24Icon.action) && Intrinsics.d(this.icon, rightLeftTitlesCell24Icon.icon) && Intrinsics.d(this.iconTintColor, rightLeftTitlesCell24Icon.iconTintColor) && Intrinsics.d(this.titlesColor, rightLeftTitlesCell24Icon.titlesColor) && this.hideSeparator == rightLeftTitlesCell24Icon.hideSeparator && Intrinsics.d(this.rightIcon, rightLeftTitlesCell24Icon.rightIcon) && Intrinsics.d(this.rightIconTintColor, rightLeftTitlesCell24Icon.rightIconTintColor) && this.styleType == rightLeftTitlesCell24Icon.styleType && Intrinsics.d(this.styleInfo, rightLeftTitlesCell24Icon.styleInfo) && Intrinsics.d(this.trackingInfo, rightLeftTitlesCell24Icon.trackingInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final boolean getHideSeparator() {
            return this.hideSeparator;
        }

        public final String getIcon() {
            return this.icon;
        }

        public final String getIconTintColor() {
            return this.iconTintColor;
        }

        public final String getLeftTitle() {
            return this.leftTitle;
        }

        public final String getRightIcon() {
            return this.rightIcon;
        }

        public final String getRightIconTintColor() {
            return this.rightIconTintColor;
        }

        @NotNull
        public final String getRightTitle() {
            return this.rightTitle;
        }

        public final Map<String, StyleColors> getStyleInfo() {
            return this.styleInfo;
        }

        public final StyleType getStyleType() {
            return this.styleType;
        }

        public final String getTitlesColor() {
            return this.titlesColor;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            String str = this.leftTitle;
            int a11 = g.a((str == null ? 0 : str.hashCode()) * 31, 31, this.rightTitle);
            AtomActionDTO atomActionDTO = this.action;
            int hashCode = (a11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            String str2 = this.icon;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.iconTintColor;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.titlesColor;
            int a12 = C3532b.a((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.hideSeparator);
            String str5 = this.rightIcon;
            int hashCode4 = (a12 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.rightIconTintColor;
            int hashCode5 = (hashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31;
            StyleType styleType = this.styleType;
            int hashCode6 = (hashCode5 + (styleType == null ? 0 : styleType.hashCode())) * 31;
            Map<String, StyleColors> map = this.styleInfo;
            int hashCode7 = (hashCode6 + (map == null ? 0 : map.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map2 = this.trackingInfo;
            return hashCode7 + (map2 != null ? map2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.leftTitle;
            String str2 = this.rightTitle;
            AtomActionDTO atomActionDTO = this.action;
            String str3 = this.icon;
            String str4 = this.iconTintColor;
            String str5 = this.titlesColor;
            boolean z11 = this.hideSeparator;
            String str6 = this.rightIcon;
            String str7 = this.rightIconTintColor;
            StyleType styleType = this.styleType;
            Map<String, StyleColors> map = this.styleInfo;
            Map<String, TokenizedTrackingInfo> map2 = this.trackingInfo;
            StringBuilder d11 = C3660k.d("RightLeftTitlesCell24Icon(leftTitle=", str, ", rightTitle=", str2, ", action=");
            HY.b.d(", icon=", str3, ", iconTintColor=", d11, atomActionDTO);
            Nh.a.h(d11, str4, ", titlesColor=", str5, ", hideSeparator=");
            C5766e.a(", rightIcon=", str6, ", rightIconTintColor=", d11, z11);
            d11.append(str7);
            d11.append(", styleType=");
            d11.append(styleType);
            d11.append(", styleInfo=");
            return V.c(d11, map, ", trackingInfo=", map2, ")");
        }

        public /* synthetic */ RightLeftTitlesCell24Icon(String str, String str2, AtomActionDTO atomActionDTO, String str3, String str4, String str5, boolean z11, String str6, String str7, StyleType styleType, Map map, Map map2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, atomActionDTO, str3, str4, str5, (i11 & 64) != 0 ? false : z11, str6, str7, styleType, map, map2);
        }
    }
}
