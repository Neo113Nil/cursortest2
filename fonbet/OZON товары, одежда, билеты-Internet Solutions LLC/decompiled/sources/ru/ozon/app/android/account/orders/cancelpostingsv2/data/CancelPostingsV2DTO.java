package ru.ozon.app.android.account.orders.cancelpostingsv2.data;

import AZ.c;
import B3.p;
import Bl.C2639a;
import El.C2971a;
import G.g;
import Ih.a;
import K1.G;
import Tl.b;
import V.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001:\u0004$%&'B=\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003JG\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\tHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006("}, d2 = {"Lru/ozon/app/android/account/orders/cancelpostingsv2/data/CancelPostingsV2DTO;", "", "annotation", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "items", "", "button", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "selectedIds", "", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "<init>", "(Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Ljava/lang/String;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "getAnnotation", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "getItems", "()Ljava/util/List;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getSelectedIds", "()Ljava/lang/String;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "SelectAllDTO", "ShipmentDTO", "MonopostingDTO", "PostingDTO", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CancelPostingsV2DTO {
    public static final int $stable = 8;
    private final DisclaimerAtom annotation;
    private final BadgeDTO badge;

    @NotNull
    private final ButtonV3Atom.LargeButton button;

    @NotNull
    private final List<Object> items;
    private final String selectedIds;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00010B[\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000eHÆ\u0003Jt\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020\u00032\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0002\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001e¨\u00061"}, d2 = {"Lru/ozon/app/android/account/orders/cancelpostingsv2/data/CancelPostingsV2DTO$MonopostingDTO;", "", "isSelected", "", "image", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "info", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "priceIncreaseInfo", "Lru/ozon/app/android/account/orders/cancelpostingsv2/data/CancelPostingsV2DTO$MonopostingDTO$PriceIncreaseInfoDTO;", "titleBadge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "imageBadge", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/app/android/account/orders/cancelpostingsv2/data/CancelPostingsV2DTO$MonopostingDTO$PriceIncreaseInfoDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getImage", "()Ljava/lang/String;", "getTitle", "getSubtitle", "getInfo", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getPriceIncreaseInfo", "()Lru/ozon/app/android/account/orders/cancelpostingsv2/data/CancelPostingsV2DTO$MonopostingDTO$PriceIncreaseInfoDTO;", "getTitleBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getImageBadge", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/app/android/account/orders/cancelpostingsv2/data/CancelPostingsV2DTO$MonopostingDTO$PriceIncreaseInfoDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)Lru/ozon/app/android/account/orders/cancelpostingsv2/data/CancelPostingsV2DTO$MonopostingDTO;", "equals", "other", "hashCode", "", "toString", "PriceIncreaseInfoDTO", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class MonopostingDTO {
        public static final int $stable = 8;
        private final AtomActionDTO action;

        @NotNull
        private final String image;
        private final BadgeDTO imageBadge;
        private final String info;
        private final Boolean isSelected;
        private final PriceIncreaseInfoDTO priceIncreaseInfo;

        @NotNull
        private final String subtitle;

        @NotNull
        private final String title;
        private final BadgeDTO titleBadge;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0003J?\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lru/ozon/app/android/account/orders/cancelpostingsv2/data/CancelPostingsV2DTO$MonopostingDTO$PriceIncreaseInfoDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PriceIncreaseInfoDTO {
            public static final int $stable = 8;

            @NotNull
            private final AtomActionDTO action;

            @NotNull
            private final IconDTO icon;

            @NotNull
            private final TextDTO title;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            public PriceIncreaseInfoDTO(@NotNull TextDTO title, @NotNull IconDTO icon, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> map) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(action, "action");
                this.title = title;
                this.icon = icon;
                this.action = action;
                this.trackingInfo = map;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ PriceIncreaseInfoDTO copy$default(PriceIncreaseInfoDTO priceIncreaseInfoDTO, TextDTO textDTO, IconDTO iconDTO, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    textDTO = priceIncreaseInfoDTO.title;
                }
                if ((i11 & 2) != 0) {
                    iconDTO = priceIncreaseInfoDTO.icon;
                }
                if ((i11 & 4) != 0) {
                    atomActionDTO = priceIncreaseInfoDTO.action;
                }
                if ((i11 & 8) != 0) {
                    map = priceIncreaseInfoDTO.trackingInfo;
                }
                return priceIncreaseInfoDTO.copy(textDTO, iconDTO, atomActionDTO, map);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final TextDTO getTitle() {
                return this.title;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final IconDTO getIcon() {
                return this.icon;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final AtomActionDTO getAction() {
                return this.action;
            }

            public final Map<String, TokenizedTrackingInfo> component4() {
                return this.trackingInfo;
            }

            @NotNull
            public final PriceIncreaseInfoDTO copy(@NotNull TextDTO title, @NotNull IconDTO icon, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(action, "action");
                return new PriceIncreaseInfoDTO(title, icon, action, trackingInfo);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PriceIncreaseInfoDTO)) {
                    return false;
                }
                PriceIncreaseInfoDTO priceIncreaseInfoDTO = (PriceIncreaseInfoDTO) other;
                return Intrinsics.d(this.title, priceIncreaseInfoDTO.title) && Intrinsics.d(this.icon, priceIncreaseInfoDTO.icon) && Intrinsics.d(this.action, priceIncreaseInfoDTO.action) && Intrinsics.d(this.trackingInfo, priceIncreaseInfoDTO.trackingInfo);
            }

            @NotNull
            public final AtomActionDTO getAction() {
                return this.action;
            }

            @NotNull
            public final IconDTO getIcon() {
                return this.icon;
            }

            @NotNull
            public final TextDTO getTitle() {
                return this.title;
            }

            public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public int hashCode() {
                int b11 = a.b(this.action, C2971a.a(this.icon, this.title.hashCode() * 31, 31), 31);
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                return b11 + (map == null ? 0 : map.hashCode());
            }

            @NotNull
            public String toString() {
                TextDTO textDTO = this.title;
                IconDTO iconDTO = this.icon;
                return D40.a.d(C2639a.d("PriceIncreaseInfoDTO(title=", ", icon=", ", action=", iconDTO, textDTO), this.action, ", trackingInfo=", this.trackingInfo, ")");
            }
        }

        public MonopostingDTO(Boolean bool, @NotNull String image, @NotNull String title, @NotNull String subtitle, String str, AtomActionDTO atomActionDTO, PriceIncreaseInfoDTO priceIncreaseInfoDTO, BadgeDTO badgeDTO, BadgeDTO badgeDTO2) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            this.isSelected = bool;
            this.image = image;
            this.title = title;
            this.subtitle = subtitle;
            this.info = str;
            this.action = atomActionDTO;
            this.priceIncreaseInfo = priceIncreaseInfoDTO;
            this.titleBadge = badgeDTO;
            this.imageBadge = badgeDTO2;
        }

        public static /* synthetic */ MonopostingDTO copy$default(MonopostingDTO monopostingDTO, Boolean bool, String str, String str2, String str3, String str4, AtomActionDTO atomActionDTO, PriceIncreaseInfoDTO priceIncreaseInfoDTO, BadgeDTO badgeDTO, BadgeDTO badgeDTO2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                bool = monopostingDTO.isSelected;
            }
            if ((i11 & 2) != 0) {
                str = monopostingDTO.image;
            }
            if ((i11 & 4) != 0) {
                str2 = monopostingDTO.title;
            }
            if ((i11 & 8) != 0) {
                str3 = monopostingDTO.subtitle;
            }
            if ((i11 & 16) != 0) {
                str4 = monopostingDTO.info;
            }
            if ((i11 & 32) != 0) {
                atomActionDTO = monopostingDTO.action;
            }
            if ((i11 & 64) != 0) {
                priceIncreaseInfoDTO = monopostingDTO.priceIncreaseInfo;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                badgeDTO = monopostingDTO.titleBadge;
            }
            if ((i11 & 256) != 0) {
                badgeDTO2 = monopostingDTO.imageBadge;
            }
            BadgeDTO badgeDTO3 = badgeDTO;
            BadgeDTO badgeDTO4 = badgeDTO2;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            PriceIncreaseInfoDTO priceIncreaseInfoDTO2 = priceIncreaseInfoDTO;
            String str5 = str4;
            String str6 = str2;
            return monopostingDTO.copy(bool, str, str6, str3, str5, atomActionDTO2, priceIncreaseInfoDTO2, badgeDTO3, badgeDTO4);
        }

        /* renamed from: component1, reason: from getter */
        public final Boolean getIsSelected() {
            return this.isSelected;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component5, reason: from getter */
        public final String getInfo() {
            return this.info;
        }

        /* renamed from: component6, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        /* renamed from: component7, reason: from getter */
        public final PriceIncreaseInfoDTO getPriceIncreaseInfo() {
            return this.priceIncreaseInfo;
        }

        /* renamed from: component8, reason: from getter */
        public final BadgeDTO getTitleBadge() {
            return this.titleBadge;
        }

        /* renamed from: component9, reason: from getter */
        public final BadgeDTO getImageBadge() {
            return this.imageBadge;
        }

        @NotNull
        public final MonopostingDTO copy(Boolean isSelected, @NotNull String image, @NotNull String title, @NotNull String subtitle, String info, AtomActionDTO action, PriceIncreaseInfoDTO priceIncreaseInfo, BadgeDTO titleBadge, BadgeDTO imageBadge) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            return new MonopostingDTO(isSelected, image, title, subtitle, info, action, priceIncreaseInfo, titleBadge, imageBadge);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MonopostingDTO)) {
                return false;
            }
            MonopostingDTO monopostingDTO = (MonopostingDTO) other;
            return Intrinsics.d(this.isSelected, monopostingDTO.isSelected) && Intrinsics.d(this.image, monopostingDTO.image) && Intrinsics.d(this.title, monopostingDTO.title) && Intrinsics.d(this.subtitle, monopostingDTO.subtitle) && Intrinsics.d(this.info, monopostingDTO.info) && Intrinsics.d(this.action, monopostingDTO.action) && Intrinsics.d(this.priceIncreaseInfo, monopostingDTO.priceIncreaseInfo) && Intrinsics.d(this.titleBadge, monopostingDTO.titleBadge) && Intrinsics.d(this.imageBadge, monopostingDTO.imageBadge);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        public final BadgeDTO getImageBadge() {
            return this.imageBadge;
        }

        public final String getInfo() {
            return this.info;
        }

        public final PriceIncreaseInfoDTO getPriceIncreaseInfo() {
            return this.priceIncreaseInfo;
        }

        @NotNull
        public final String getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public final BadgeDTO getTitleBadge() {
            return this.titleBadge;
        }

        public int hashCode() {
            Boolean bool = this.isSelected;
            int a11 = g.a(g.a(g.a((bool == null ? 0 : bool.hashCode()) * 31, 31, this.image), 31, this.title), 31, this.subtitle);
            String str = this.info;
            int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            PriceIncreaseInfoDTO priceIncreaseInfoDTO = this.priceIncreaseInfo;
            int hashCode3 = (hashCode2 + (priceIncreaseInfoDTO == null ? 0 : priceIncreaseInfoDTO.hashCode())) * 31;
            BadgeDTO badgeDTO = this.titleBadge;
            int hashCode4 = (hashCode3 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
            BadgeDTO badgeDTO2 = this.imageBadge;
            return hashCode4 + (badgeDTO2 != null ? badgeDTO2.hashCode() : 0);
        }

        public final Boolean isSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            Boolean bool = this.isSelected;
            String str = this.image;
            String str2 = this.title;
            String str3 = this.subtitle;
            String str4 = this.info;
            AtomActionDTO atomActionDTO = this.action;
            PriceIncreaseInfoDTO priceIncreaseInfoDTO = this.priceIncreaseInfo;
            BadgeDTO badgeDTO = this.titleBadge;
            BadgeDTO badgeDTO2 = this.imageBadge;
            StringBuilder e11 = D3.g.e("MonopostingDTO(isSelected=", bool, ", image=", str, ", title=");
            Nh.a.h(e11, str2, ", subtitle=", str3, ", info=");
            p.c(str4, ", action=", ", priceIncreaseInfo=", e11, atomActionDTO);
            e11.append(priceIncreaseInfoDTO);
            e11.append(", titleBadge=");
            e11.append(badgeDTO);
            e11.append(", imageBadge=");
            return c.b(e11, badgeDTO2, ")");
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001%B;\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\fHÆ\u0003JL\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\u00032\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0002\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, d2 = {"Lru/ozon/app/android/account/orders/cancelpostingsv2/data/CancelPostingsV2DTO$PostingDTO;", "", "isSelected", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "items", "", "Lru/ozon/app/android/account/orders/cancelpostingsv2/data/CancelPostingsV2DTO$PostingDTO$ItemDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "titleBadge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTitle", "()Ljava/lang/String;", "getItems", "()Ljava/util/List;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTitleBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)Lru/ozon/app/android/account/orders/cancelpostingsv2/data/CancelPostingsV2DTO$PostingDTO;", "equals", "other", "hashCode", "", "toString", "ItemDTO", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class PostingDTO {
        public static final int $stable = 8;
        private final AtomActionDTO action;
        private final Boolean isSelected;

        @NotNull
        private final List<ItemDTO> items;

        @NotNull
        private final String title;
        private final BadgeDTO titleBadge;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/account/orders/cancelpostingsv2/data/CancelPostingsV2DTO$PostingDTO$ItemDTO;", "", "image", "", "subtitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getImage", "()Ljava/lang/String;", "getSubtitle", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ItemDTO {
            public static final int $stable = 0;

            @NotNull
            private final String image;
            private final String subtitle;

            public ItemDTO(@NotNull String image, String str) {
                Intrinsics.checkNotNullParameter(image, "image");
                this.image = image;
                this.subtitle = str;
            }

            public static /* synthetic */ ItemDTO copy$default(ItemDTO itemDTO, String str, String str2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = itemDTO.image;
                }
                if ((i11 & 2) != 0) {
                    str2 = itemDTO.subtitle;
                }
                return itemDTO.copy(str, str2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getImage() {
                return this.image;
            }

            /* renamed from: component2, reason: from getter */
            public final String getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            public final ItemDTO copy(@NotNull String image, String subtitle) {
                Intrinsics.checkNotNullParameter(image, "image");
                return new ItemDTO(image, subtitle);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ItemDTO)) {
                    return false;
                }
                ItemDTO itemDTO = (ItemDTO) other;
                return Intrinsics.d(this.image, itemDTO.image) && Intrinsics.d(this.subtitle, itemDTO.subtitle);
            }

            @NotNull
            public final String getImage() {
                return this.image;
            }

            public final String getSubtitle() {
                return this.subtitle;
            }

            public int hashCode() {
                int hashCode = this.image.hashCode() * 31;
                String str = this.subtitle;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            @NotNull
            public String toString() {
                return e.a("ItemDTO(image=", this.image, ", subtitle=", this.subtitle, ")");
            }
        }

        public PostingDTO(Boolean bool, @NotNull String title, @NotNull List<ItemDTO> items, AtomActionDTO atomActionDTO, BadgeDTO badgeDTO) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(items, "items");
            this.isSelected = bool;
            this.title = title;
            this.items = items;
            this.action = atomActionDTO;
            this.titleBadge = badgeDTO;
        }

        public static /* synthetic */ PostingDTO copy$default(PostingDTO postingDTO, Boolean bool, String str, List list, AtomActionDTO atomActionDTO, BadgeDTO badgeDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                bool = postingDTO.isSelected;
            }
            if ((i11 & 2) != 0) {
                str = postingDTO.title;
            }
            if ((i11 & 4) != 0) {
                list = postingDTO.items;
            }
            if ((i11 & 8) != 0) {
                atomActionDTO = postingDTO.action;
            }
            if ((i11 & 16) != 0) {
                badgeDTO = postingDTO.titleBadge;
            }
            BadgeDTO badgeDTO2 = badgeDTO;
            List list2 = list;
            return postingDTO.copy(bool, str, list2, atomActionDTO, badgeDTO2);
        }

        /* renamed from: component1, reason: from getter */
        public final Boolean getIsSelected() {
            return this.isSelected;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final List<ItemDTO> component3() {
            return this.items;
        }

        /* renamed from: component4, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        /* renamed from: component5, reason: from getter */
        public final BadgeDTO getTitleBadge() {
            return this.titleBadge;
        }

        @NotNull
        public final PostingDTO copy(Boolean isSelected, @NotNull String title, @NotNull List<ItemDTO> items, AtomActionDTO action, BadgeDTO titleBadge) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(items, "items");
            return new PostingDTO(isSelected, title, items, action, titleBadge);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PostingDTO)) {
                return false;
            }
            PostingDTO postingDTO = (PostingDTO) other;
            return Intrinsics.d(this.isSelected, postingDTO.isSelected) && Intrinsics.d(this.title, postingDTO.title) && Intrinsics.d(this.items, postingDTO.items) && Intrinsics.d(this.action, postingDTO.action) && Intrinsics.d(this.titleBadge, postingDTO.titleBadge);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final List<ItemDTO> getItems() {
            return this.items;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public final BadgeDTO getTitleBadge() {
            return this.titleBadge;
        }

        public int hashCode() {
            Boolean bool = this.isSelected;
            int b11 = g.b(g.a((bool == null ? 0 : bool.hashCode()) * 31, 31, this.title), 31, this.items);
            AtomActionDTO atomActionDTO = this.action;
            int hashCode = (b11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            BadgeDTO badgeDTO = this.titleBadge;
            return hashCode + (badgeDTO != null ? badgeDTO.hashCode() : 0);
        }

        public final Boolean isSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            Boolean bool = this.isSelected;
            String str = this.title;
            List<ItemDTO> list = this.items;
            AtomActionDTO atomActionDTO = this.action;
            BadgeDTO badgeDTO = this.titleBadge;
            StringBuilder e11 = D3.g.e("PostingDTO(isSelected=", bool, ", title=", str, ", items=");
            e11.append(list);
            e11.append(", action=");
            e11.append(atomActionDTO);
            e11.append(", titleBadge=");
            return c.b(e11, badgeDTO, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J0\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0002\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/account/orders/cancelpostingsv2/data/CancelPostingsV2DTO$SelectAllDTO;", "", "isSelected", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTitle", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;)Lru/ozon/app/android/account/orders/cancelpostingsv2/data/CancelPostingsV2DTO$SelectAllDTO;", "equals", "other", "hashCode", "", "toString", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SelectAllDTO {
        public static final int $stable = 0;
        private final AtomActionDTO action;
        private final Boolean isSelected;

        @NotNull
        private final String title;

        public SelectAllDTO(Boolean bool, @NotNull String title, AtomActionDTO atomActionDTO) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.isSelected = bool;
            this.title = title;
            this.action = atomActionDTO;
        }

        public static /* synthetic */ SelectAllDTO copy$default(SelectAllDTO selectAllDTO, Boolean bool, String str, AtomActionDTO atomActionDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                bool = selectAllDTO.isSelected;
            }
            if ((i11 & 2) != 0) {
                str = selectAllDTO.title;
            }
            if ((i11 & 4) != 0) {
                atomActionDTO = selectAllDTO.action;
            }
            return selectAllDTO.copy(bool, str, atomActionDTO);
        }

        /* renamed from: component1, reason: from getter */
        public final Boolean getIsSelected() {
            return this.isSelected;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final SelectAllDTO copy(Boolean isSelected, @NotNull String title, AtomActionDTO action) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new SelectAllDTO(isSelected, title, action);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SelectAllDTO)) {
                return false;
            }
            SelectAllDTO selectAllDTO = (SelectAllDTO) other;
            return Intrinsics.d(this.isSelected, selectAllDTO.isSelected) && Intrinsics.d(this.title, selectAllDTO.title) && Intrinsics.d(this.action, selectAllDTO.action);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            Boolean bool = this.isSelected;
            int a11 = g.a((bool == null ? 0 : bool.hashCode()) * 31, 31, this.title);
            AtomActionDTO atomActionDTO = this.action;
            return a11 + (atomActionDTO != null ? atomActionDTO.hashCode() : 0);
        }

        public final Boolean isSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            Boolean bool = this.isSelected;
            String str = this.title;
            return G.c(D3.g.e("SelectAllDTO(isSelected=", bool, ", title=", str, ", action="), this.action, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J:\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0002\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/account/orders/cancelpostingsv2/data/CancelPostingsV2DTO$ShipmentDTO;", "", "isSelected", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "subtitle", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;)Lru/ozon/app/android/account/orders/cancelpostingsv2/data/CancelPostingsV2DTO$ShipmentDTO;", "equals", "other", "hashCode", "", "toString", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ShipmentDTO {
        public static final int $stable = 0;
        private final AtomActionDTO action;
        private final Boolean isSelected;

        @NotNull
        private final String subtitle;

        @NotNull
        private final String title;

        public ShipmentDTO(Boolean bool, @NotNull String title, @NotNull String subtitle, AtomActionDTO atomActionDTO) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            this.isSelected = bool;
            this.title = title;
            this.subtitle = subtitle;
            this.action = atomActionDTO;
        }

        public static /* synthetic */ ShipmentDTO copy$default(ShipmentDTO shipmentDTO, Boolean bool, String str, String str2, AtomActionDTO atomActionDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                bool = shipmentDTO.isSelected;
            }
            if ((i11 & 2) != 0) {
                str = shipmentDTO.title;
            }
            if ((i11 & 4) != 0) {
                str2 = shipmentDTO.subtitle;
            }
            if ((i11 & 8) != 0) {
                atomActionDTO = shipmentDTO.action;
            }
            return shipmentDTO.copy(bool, str, str2, atomActionDTO);
        }

        /* renamed from: component1, reason: from getter */
        public final Boolean getIsSelected() {
            return this.isSelected;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component4, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final ShipmentDTO copy(Boolean isSelected, @NotNull String title, @NotNull String subtitle, AtomActionDTO action) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            return new ShipmentDTO(isSelected, title, subtitle, action);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShipmentDTO)) {
                return false;
            }
            ShipmentDTO shipmentDTO = (ShipmentDTO) other;
            return Intrinsics.d(this.isSelected, shipmentDTO.isSelected) && Intrinsics.d(this.title, shipmentDTO.title) && Intrinsics.d(this.subtitle, shipmentDTO.subtitle) && Intrinsics.d(this.action, shipmentDTO.action);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final String getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            Boolean bool = this.isSelected;
            int a11 = g.a(g.a((bool == null ? 0 : bool.hashCode()) * 31, 31, this.title), 31, this.subtitle);
            AtomActionDTO atomActionDTO = this.action;
            return a11 + (atomActionDTO != null ? atomActionDTO.hashCode() : 0);
        }

        public final Boolean isSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            Boolean bool = this.isSelected;
            String str = this.title;
            String str2 = this.subtitle;
            AtomActionDTO atomActionDTO = this.action;
            StringBuilder e11 = D3.g.e("ShipmentDTO(isSelected=", bool, ", title=", str, ", subtitle=");
            e11.append(str2);
            e11.append(", action=");
            e11.append(atomActionDTO);
            e11.append(")");
            return e11.toString();
        }
    }

    public CancelPostingsV2DTO(DisclaimerAtom disclaimerAtom, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "selectAll", type = SelectAllDTO.class), @ProtoOneOfSignature(name = "shipment", type = ShipmentDTO.class), @ProtoOneOfSignature(name = "monoposting", type = MonopostingDTO.class), @ProtoOneOfSignature(name = "posting", type = PostingDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> items, @NotNull ButtonV3Atom.LargeButton button, String str, BadgeDTO badgeDTO) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(button, "button");
        this.annotation = disclaimerAtom;
        this.items = items;
        this.button = button;
        this.selectedIds = str;
        this.badge = badgeDTO;
    }

    public static /* synthetic */ CancelPostingsV2DTO copy$default(CancelPostingsV2DTO cancelPostingsV2DTO, DisclaimerAtom disclaimerAtom, List list, ButtonV3Atom.LargeButton largeButton, String str, BadgeDTO badgeDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            disclaimerAtom = cancelPostingsV2DTO.annotation;
        }
        if ((i11 & 2) != 0) {
            list = cancelPostingsV2DTO.items;
        }
        if ((i11 & 4) != 0) {
            largeButton = cancelPostingsV2DTO.button;
        }
        if ((i11 & 8) != 0) {
            str = cancelPostingsV2DTO.selectedIds;
        }
        if ((i11 & 16) != 0) {
            badgeDTO = cancelPostingsV2DTO.badge;
        }
        BadgeDTO badgeDTO2 = badgeDTO;
        ButtonV3Atom.LargeButton largeButton2 = largeButton;
        return cancelPostingsV2DTO.copy(disclaimerAtom, list, largeButton2, str, badgeDTO2);
    }

    /* renamed from: component1, reason: from getter */
    public final DisclaimerAtom getAnnotation() {
        return this.annotation;
    }

    @NotNull
    public final List<Object> component2() {
        return this.items;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ButtonV3Atom.LargeButton getButton() {
        return this.button;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSelectedIds() {
        return this.selectedIds;
    }

    /* renamed from: component5, reason: from getter */
    public final BadgeDTO getBadge() {
        return this.badge;
    }

    @NotNull
    public final CancelPostingsV2DTO copy(DisclaimerAtom annotation, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "selectAll", type = SelectAllDTO.class), @ProtoOneOfSignature(name = "shipment", type = ShipmentDTO.class), @ProtoOneOfSignature(name = "monoposting", type = MonopostingDTO.class), @ProtoOneOfSignature(name = "posting", type = PostingDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> items, @NotNull ButtonV3Atom.LargeButton button, String selectedIds, BadgeDTO badge) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(button, "button");
        return new CancelPostingsV2DTO(annotation, items, button, selectedIds, badge);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CancelPostingsV2DTO)) {
            return false;
        }
        CancelPostingsV2DTO cancelPostingsV2DTO = (CancelPostingsV2DTO) other;
        return Intrinsics.d(this.annotation, cancelPostingsV2DTO.annotation) && Intrinsics.d(this.items, cancelPostingsV2DTO.items) && Intrinsics.d(this.button, cancelPostingsV2DTO.button) && Intrinsics.d(this.selectedIds, cancelPostingsV2DTO.selectedIds) && Intrinsics.d(this.badge, cancelPostingsV2DTO.badge);
    }

    public final DisclaimerAtom getAnnotation() {
        return this.annotation;
    }

    public final BadgeDTO getBadge() {
        return this.badge;
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getButton() {
        return this.button;
    }

    @NotNull
    public final List<Object> getItems() {
        return this.items;
    }

    public final String getSelectedIds() {
        return this.selectedIds;
    }

    public int hashCode() {
        DisclaimerAtom disclaimerAtom = this.annotation;
        int a11 = b.a(this.button, g.b((disclaimerAtom == null ? 0 : disclaimerAtom.hashCode()) * 31, 31, this.items), 31);
        String str = this.selectedIds;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        BadgeDTO badgeDTO = this.badge;
        return hashCode + (badgeDTO != null ? badgeDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        DisclaimerAtom disclaimerAtom = this.annotation;
        List<Object> list = this.items;
        ButtonV3Atom.LargeButton largeButton = this.button;
        String str = this.selectedIds;
        BadgeDTO badgeDTO = this.badge;
        StringBuilder sb2 = new StringBuilder("CancelPostingsV2DTO(annotation=");
        sb2.append(disclaimerAtom);
        sb2.append(", items=");
        sb2.append(list);
        sb2.append(", button=");
        sb2.append(largeButton);
        sb2.append(", selectedIds=");
        sb2.append(str);
        sb2.append(", badge=");
        return c.b(sb2, badgeDTO, ")");
    }
}
