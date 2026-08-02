package ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.data;

import Bl.C2639a;
import C.o0;
import N3.C3660k;
import Ql.c;
import T7.P;
import Xc.a;
import Xc.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0003 !\"B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J5\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006#"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/data/ProductActionBarDTO;", "", "size", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/data/ProductActionBarDTO$Size;", "state", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/data/ProductActionBarDTO$State;", "adultActionIcon", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/data/ProductActionBarDTO$State$ActionIcon;", "customStyle", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/data/ProductActionBarDTO$CustomStyle;", "<init>", "(Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/data/ProductActionBarDTO$Size;Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/data/ProductActionBarDTO$State;Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/data/ProductActionBarDTO$State$ActionIcon;Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/data/ProductActionBarDTO$CustomStyle;)V", "getSize", "()Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/data/ProductActionBarDTO$Size;", "getState", "()Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/data/ProductActionBarDTO$State;", "getAdultActionIcon", "()Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/data/ProductActionBarDTO$State$ActionIcon;", "getCustomStyle", "()Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/data/ProductActionBarDTO$CustomStyle;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Size", "State", "CustomStyle", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ProductActionBarDTO {
    private final State.ActionIcon adultActionIcon;
    private final CustomStyle customStyle;

    @NotNull
    private final Size size;

    @NotNull
    private final State state;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/data/ProductActionBarDTO$CustomStyle;", "", "backgroundColor", "", "clickedButtonBackgroundColor", "iconColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBackgroundColor", "()Ljava/lang/String;", "getClickedButtonBackgroundColor", "getIconColor", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CustomStyle {
        private final String backgroundColor;
        private final String clickedButtonBackgroundColor;
        private final String iconColor;

        public CustomStyle() {
            this(null, null, null, 7, null);
        }

        public static /* synthetic */ CustomStyle copy$default(CustomStyle customStyle, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = customStyle.backgroundColor;
            }
            if ((i11 & 2) != 0) {
                str2 = customStyle.clickedButtonBackgroundColor;
            }
            if ((i11 & 4) != 0) {
                str3 = customStyle.iconColor;
            }
            return customStyle.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component2, reason: from getter */
        public final String getClickedButtonBackgroundColor() {
            return this.clickedButtonBackgroundColor;
        }

        /* renamed from: component3, reason: from getter */
        public final String getIconColor() {
            return this.iconColor;
        }

        @NotNull
        public final CustomStyle copy(String backgroundColor, String clickedButtonBackgroundColor, String iconColor) {
            return new CustomStyle(backgroundColor, clickedButtonBackgroundColor, iconColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CustomStyle)) {
                return false;
            }
            CustomStyle customStyle = (CustomStyle) other;
            return Intrinsics.d(this.backgroundColor, customStyle.backgroundColor) && Intrinsics.d(this.clickedButtonBackgroundColor, customStyle.clickedButtonBackgroundColor) && Intrinsics.d(this.iconColor, customStyle.iconColor);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final String getClickedButtonBackgroundColor() {
            return this.clickedButtonBackgroundColor;
        }

        public final String getIconColor() {
            return this.iconColor;
        }

        public int hashCode() {
            String str = this.backgroundColor;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.clickedButtonBackgroundColor;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.iconColor;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.backgroundColor;
            String str2 = this.clickedButtonBackgroundColor;
            return o0.c(C3660k.d("CustomStyle(backgroundColor=", str, ", clickedButtonBackgroundColor=", str2, ", iconColor="), this.iconColor, ")");
        }

        public CustomStyle(String str, String str2, String str3) {
            this.backgroundColor = str;
            this.clickedButtonBackgroundColor = str2;
            this.iconColor = str3;
        }

        public /* synthetic */ CustomStyle(String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/data/ProductActionBarDTO$Size;", "", "<init>", "(Ljava/lang/String;I)V", "BIG", "MINI", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Size {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Size[] $VALUES;
        public static final Size BIG = new Size("BIG", 0);
        public static final Size MINI = new Size("MINI", 1);

        private static final /* synthetic */ Size[] $values() {
            return new Size[]{BIG, MINI};
        }

        static {
            Size[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Size(String str, int i11) {
        }

        public static Size valueOf(String str) {
            return (Size) Enum.valueOf(Size.class, str);
        }

        public static Size[] values() {
            return (Size[]) $VALUES.clone();
        }
    }

    public ProductActionBarDTO(@NotNull Size size, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "actionIcon", type = State.ActionIcon.class), @ProtoOneOfSignature(name = "quantityControl", type = State.QuantityControl.class)}) @NotNull @ProtoOneOf State state, State.ActionIcon actionIcon, CustomStyle customStyle) {
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(state, "state");
        this.size = size;
        this.state = state;
        this.adultActionIcon = actionIcon;
        this.customStyle = customStyle;
    }

    public static /* synthetic */ ProductActionBarDTO copy$default(ProductActionBarDTO productActionBarDTO, Size size, State state, State.ActionIcon actionIcon, CustomStyle customStyle, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            size = productActionBarDTO.size;
        }
        if ((i11 & 2) != 0) {
            state = productActionBarDTO.state;
        }
        if ((i11 & 4) != 0) {
            actionIcon = productActionBarDTO.adultActionIcon;
        }
        if ((i11 & 8) != 0) {
            customStyle = productActionBarDTO.customStyle;
        }
        return productActionBarDTO.copy(size, state, actionIcon, customStyle);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Size getSize() {
        return this.size;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final State getState() {
        return this.state;
    }

    /* renamed from: component3, reason: from getter */
    public final State.ActionIcon getAdultActionIcon() {
        return this.adultActionIcon;
    }

    /* renamed from: component4, reason: from getter */
    public final CustomStyle getCustomStyle() {
        return this.customStyle;
    }

    @NotNull
    public final ProductActionBarDTO copy(@NotNull Size size, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "actionIcon", type = State.ActionIcon.class), @ProtoOneOfSignature(name = "quantityControl", type = State.QuantityControl.class)}) @NotNull @ProtoOneOf State state, State.ActionIcon adultActionIcon, CustomStyle customStyle) {
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(state, "state");
        return new ProductActionBarDTO(size, state, adultActionIcon, customStyle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductActionBarDTO)) {
            return false;
        }
        ProductActionBarDTO productActionBarDTO = (ProductActionBarDTO) other;
        return this.size == productActionBarDTO.size && Intrinsics.d(this.state, productActionBarDTO.state) && Intrinsics.d(this.adultActionIcon, productActionBarDTO.adultActionIcon) && Intrinsics.d(this.customStyle, productActionBarDTO.customStyle);
    }

    public final State.ActionIcon getAdultActionIcon() {
        return this.adultActionIcon;
    }

    public final CustomStyle getCustomStyle() {
        return this.customStyle;
    }

    @NotNull
    public final Size getSize() {
        return this.size;
    }

    @NotNull
    public final State getState() {
        return this.state;
    }

    public int hashCode() {
        int hashCode = (this.state.hashCode() + (this.size.hashCode() * 31)) * 31;
        State.ActionIcon actionIcon = this.adultActionIcon;
        int hashCode2 = (hashCode + (actionIcon == null ? 0 : actionIcon.hashCode())) * 31;
        CustomStyle customStyle = this.customStyle;
        return hashCode2 + (customStyle != null ? customStyle.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ProductActionBarDTO(size=" + this.size + ", state=" + this.state + ", adultActionIcon=" + this.adultActionIcon + ", customStyle=" + this.customStyle + ")";
    }

    public /* synthetic */ ProductActionBarDTO(Size size, State state, State.ActionIcon actionIcon, CustomStyle customStyle, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? Size.BIG : size, state, (i11 & 4) != 0 ? null : actionIcon, (i11 & 8) != 0 ? null : customStyle);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/data/ProductActionBarDTO$State;", "", "ActionIcon", "QuantityControl", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/data/ProductActionBarDTO$State$ActionIcon;", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/data/ProductActionBarDTO$State$QuantityControl;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface State {

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u0017\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/data/ProductActionBarDTO$State$ActionIcon;", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/data/ProductActionBarDTO$State;", "icon", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getIcon", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ActionIcon implements State {

            @NotNull
            private final AtomActionDTO action;

            @NotNull
            private final String icon;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            public ActionIcon(@NotNull String icon, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> map) {
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(action, "action");
                this.icon = icon;
                this.action = action;
                this.trackingInfo = map;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ ActionIcon copy$default(ActionIcon actionIcon, String str, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = actionIcon.icon;
                }
                if ((i11 & 2) != 0) {
                    atomActionDTO = actionIcon.action;
                }
                if ((i11 & 4) != 0) {
                    map = actionIcon.trackingInfo;
                }
                return actionIcon.copy(str, atomActionDTO, map);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getIcon() {
                return this.icon;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final AtomActionDTO getAction() {
                return this.action;
            }

            public final Map<String, TokenizedTrackingInfo> component3() {
                return this.trackingInfo;
            }

            @NotNull
            public final ActionIcon copy(@NotNull String icon, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(action, "action");
                return new ActionIcon(icon, action, trackingInfo);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ActionIcon)) {
                    return false;
                }
                ActionIcon actionIcon = (ActionIcon) other;
                return Intrinsics.d(this.icon, actionIcon.icon) && Intrinsics.d(this.action, actionIcon.action) && Intrinsics.d(this.trackingInfo, actionIcon.trackingInfo);
            }

            @NotNull
            public final AtomActionDTO getAction() {
                return this.action;
            }

            @NotNull
            public final String getIcon() {
                return this.icon;
            }

            public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public int hashCode() {
                int b11 = Ih.a.b(this.action, this.icon.hashCode() * 31, 31);
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                return b11 + (map == null ? 0 : map.hashCode());
            }

            @NotNull
            public String toString() {
                String str = this.icon;
                AtomActionDTO atomActionDTO = this.action;
                return P.f(c.c("ActionIcon(icon=", str, ", action=", atomActionDTO, ", trackingInfo="), this.trackingInfo, ")");
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\t\u00100\u001a\u00020\u0003HÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u00102\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001fJ\t\u00103\u001a\u00020\bHÆ\u0003J\t\u00104\u001a\u00020\nHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u00107\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u00108\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u00109\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u0010:\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0017\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0003J°\u0001\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0001¢\u0006\u0002\u0010>J\u0013\u0010?\u001a\u00020@2\b\u0010A\u001a\u0004\u0018\u00010BHÖ\u0003J\t\u0010C\u001a\u00020\u0006HÖ\u0001J\t\u0010D\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010 \u001a\u0004\b'\u0010\u001fR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010 \u001a\u0004\b(\u0010\u001fR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010 \u001a\u0004\b)\u0010\u001fR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010 \u001a\u0004\b*\u0010\u001fR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b-\u0010,R\u001f\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/¨\u0006E"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/data/ProductActionBarDTO$State$QuantityControl;", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/data/ProductActionBarDTO$State;", "id", "", "selectedDeliverySchema", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "valueTextStyle", "Lru/ozon/uni/atoms/data/text/TextDTO;", "cartActionIcon", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/data/ProductActionBarDTO$State$ActionIcon;", "additionalAction", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "minValue", "maxValue", "multiplicity", "quantSize", "incrementIcon", "", "decrementIcon", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(JLjava/lang/Long;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/data/ProductActionBarDTO$State$ActionIcon;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getId", "()J", "getSelectedDeliverySchema", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getValue", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getValueTextStyle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getCartActionIcon", "()Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/data/ProductActionBarDTO$State$ActionIcon;", "getAdditionalAction", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getMinValue", "getMaxValue", "getMultiplicity", "getQuantSize", "getIncrementIcon", "()Ljava/lang/String;", "getDecrementIcon", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(JLjava/lang/Long;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/data/ProductActionBarDTO$State$ActionIcon;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/data/ProductActionBarDTO$State$QuantityControl;", "equals", "", "other", "", "hashCode", "toString", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class QuantityControl implements State {
            private final CommonControlSettings additionalAction;

            @NotNull
            private final ActionIcon cartActionIcon;
            private final String decrementIcon;
            private final long id;
            private final String incrementIcon;
            private final Integer maxValue;
            private final Integer minValue;
            private final Integer multiplicity;
            private final Integer quantSize;
            private final Long selectedDeliverySchema;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;
            private final Integer value;

            @NotNull
            private final TextDTO valueTextStyle;

            public QuantityControl(long j11, Long l11, Integer num, @NotNull TextDTO valueTextStyle, @NotNull ActionIcon cartActionIcon, CommonControlSettings commonControlSettings, Integer num2, Integer num3, Integer num4, Integer num5, String str, String str2, Map<String, TokenizedTrackingInfo> map) {
                Intrinsics.checkNotNullParameter(valueTextStyle, "valueTextStyle");
                Intrinsics.checkNotNullParameter(cartActionIcon, "cartActionIcon");
                this.id = j11;
                this.selectedDeliverySchema = l11;
                this.value = num;
                this.valueTextStyle = valueTextStyle;
                this.cartActionIcon = cartActionIcon;
                this.additionalAction = commonControlSettings;
                this.minValue = num2;
                this.maxValue = num3;
                this.multiplicity = num4;
                this.quantSize = num5;
                this.incrementIcon = str;
                this.decrementIcon = str2;
                this.trackingInfo = map;
            }

            /* renamed from: component1, reason: from getter */
            public final long getId() {
                return this.id;
            }

            /* renamed from: component10, reason: from getter */
            public final Integer getQuantSize() {
                return this.quantSize;
            }

            /* renamed from: component11, reason: from getter */
            public final String getIncrementIcon() {
                return this.incrementIcon;
            }

            /* renamed from: component12, reason: from getter */
            public final String getDecrementIcon() {
                return this.decrementIcon;
            }

            public final Map<String, TokenizedTrackingInfo> component13() {
                return this.trackingInfo;
            }

            /* renamed from: component2, reason: from getter */
            public final Long getSelectedDeliverySchema() {
                return this.selectedDeliverySchema;
            }

            /* renamed from: component3, reason: from getter */
            public final Integer getValue() {
                return this.value;
            }

            @NotNull
            /* renamed from: component4, reason: from getter */
            public final TextDTO getValueTextStyle() {
                return this.valueTextStyle;
            }

            @NotNull
            /* renamed from: component5, reason: from getter */
            public final ActionIcon getCartActionIcon() {
                return this.cartActionIcon;
            }

            /* renamed from: component6, reason: from getter */
            public final CommonControlSettings getAdditionalAction() {
                return this.additionalAction;
            }

            /* renamed from: component7, reason: from getter */
            public final Integer getMinValue() {
                return this.minValue;
            }

            /* renamed from: component8, reason: from getter */
            public final Integer getMaxValue() {
                return this.maxValue;
            }

            /* renamed from: component9, reason: from getter */
            public final Integer getMultiplicity() {
                return this.multiplicity;
            }

            @NotNull
            public final QuantityControl copy(long id2, Long selectedDeliverySchema, Integer value, @NotNull TextDTO valueTextStyle, @NotNull ActionIcon cartActionIcon, CommonControlSettings additionalAction, Integer minValue, Integer maxValue, Integer multiplicity, Integer quantSize, String incrementIcon, String decrementIcon, Map<String, TokenizedTrackingInfo> trackingInfo) {
                Intrinsics.checkNotNullParameter(valueTextStyle, "valueTextStyle");
                Intrinsics.checkNotNullParameter(cartActionIcon, "cartActionIcon");
                return new QuantityControl(id2, selectedDeliverySchema, value, valueTextStyle, cartActionIcon, additionalAction, minValue, maxValue, multiplicity, quantSize, incrementIcon, decrementIcon, trackingInfo);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof QuantityControl)) {
                    return false;
                }
                QuantityControl quantityControl = (QuantityControl) other;
                return this.id == quantityControl.id && Intrinsics.d(this.selectedDeliverySchema, quantityControl.selectedDeliverySchema) && Intrinsics.d(this.value, quantityControl.value) && Intrinsics.d(this.valueTextStyle, quantityControl.valueTextStyle) && Intrinsics.d(this.cartActionIcon, quantityControl.cartActionIcon) && Intrinsics.d(this.additionalAction, quantityControl.additionalAction) && Intrinsics.d(this.minValue, quantityControl.minValue) && Intrinsics.d(this.maxValue, quantityControl.maxValue) && Intrinsics.d(this.multiplicity, quantityControl.multiplicity) && Intrinsics.d(this.quantSize, quantityControl.quantSize) && Intrinsics.d(this.incrementIcon, quantityControl.incrementIcon) && Intrinsics.d(this.decrementIcon, quantityControl.decrementIcon) && Intrinsics.d(this.trackingInfo, quantityControl.trackingInfo);
            }

            public final CommonControlSettings getAdditionalAction() {
                return this.additionalAction;
            }

            @NotNull
            public final ActionIcon getCartActionIcon() {
                return this.cartActionIcon;
            }

            public final String getDecrementIcon() {
                return this.decrementIcon;
            }

            public final long getId() {
                return this.id;
            }

            public final String getIncrementIcon() {
                return this.incrementIcon;
            }

            public final Integer getMaxValue() {
                return this.maxValue;
            }

            public final Integer getMinValue() {
                return this.minValue;
            }

            public final Integer getMultiplicity() {
                return this.multiplicity;
            }

            public final Integer getQuantSize() {
                return this.quantSize;
            }

            public final Long getSelectedDeliverySchema() {
                return this.selectedDeliverySchema;
            }

            public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public final Integer getValue() {
                return this.value;
            }

            @NotNull
            public final TextDTO getValueTextStyle() {
                return this.valueTextStyle;
            }

            public int hashCode() {
                int hashCode = Long.hashCode(this.id) * 31;
                Long l11 = this.selectedDeliverySchema;
                int hashCode2 = (hashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
                Integer num = this.value;
                int hashCode3 = (this.cartActionIcon.hashCode() + Ns.b.a(this.valueTextStyle, (hashCode2 + (num == null ? 0 : num.hashCode())) * 31, 31)) * 31;
                CommonControlSettings commonControlSettings = this.additionalAction;
                int hashCode4 = (hashCode3 + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31;
                Integer num2 = this.minValue;
                int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
                Integer num3 = this.maxValue;
                int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
                Integer num4 = this.multiplicity;
                int hashCode7 = (hashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
                Integer num5 = this.quantSize;
                int hashCode8 = (hashCode7 + (num5 == null ? 0 : num5.hashCode())) * 31;
                String str = this.incrementIcon;
                int hashCode9 = (hashCode8 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.decrementIcon;
                int hashCode10 = (hashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                return hashCode10 + (map != null ? map.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                long j11 = this.id;
                Long l11 = this.selectedDeliverySchema;
                Integer num = this.value;
                TextDTO textDTO = this.valueTextStyle;
                ActionIcon actionIcon = this.cartActionIcon;
                CommonControlSettings commonControlSettings = this.additionalAction;
                Integer num2 = this.minValue;
                Integer num3 = this.maxValue;
                Integer num4 = this.multiplicity;
                Integer num5 = this.quantSize;
                String str = this.incrementIcon;
                String str2 = this.decrementIcon;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                StringBuilder sb2 = new StringBuilder("QuantityControl(id=");
                sb2.append(j11);
                sb2.append(", selectedDeliverySchema=");
                sb2.append(l11);
                sb2.append(", value=");
                sb2.append(num);
                sb2.append(", valueTextStyle=");
                sb2.append(textDTO);
                sb2.append(", cartActionIcon=");
                sb2.append(actionIcon);
                sb2.append(", additionalAction=");
                sb2.append(commonControlSettings);
                sb2.append(", minValue=");
                sb2.append(num2);
                sb2.append(", maxValue=");
                sb2.append(num3);
                sb2.append(", multiplicity=");
                sb2.append(num4);
                sb2.append(", quantSize=");
                sb2.append(num5);
                Nh.a.h(sb2, ", incrementIcon=", str, ", decrementIcon=", str2);
                return C2639a.b(sb2, ", trackingInfo=", map, ")");
            }

            public /* synthetic */ QuantityControl(long j11, Long l11, Integer num, TextDTO textDTO, ActionIcon actionIcon, CommonControlSettings commonControlSettings, Integer num2, Integer num3, Integer num4, Integer num5, String str, String str2, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(j11, l11, num, textDTO, actionIcon, (i11 & 32) != 0 ? null : commonControlSettings, (i11 & 64) != 0 ? null : num2, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : num3, (i11 & 256) != 0 ? null : num4, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : num5, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : str, (i11 & 2048) != 0 ? null : str2, (i11 & 4096) != 0 ? null : map);
            }
        }
    }
}
