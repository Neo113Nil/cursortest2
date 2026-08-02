package ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.data;

import B0.C2454a;
import B3.p;
import D3.g;
import De.C2859b;
import El.C2971a;
import F3.G;
import Lc.a;
import Ns.b;
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
import ru.ozon.app.android.fresh.common.widgets.molecules.imageSkuClick.data.ImageSkuClickDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001:\u0007!\"#$%&'B?\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\u0017\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001J\t\u0010 \u001a\u00020\u000bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006("}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/data/NotificationCarouselV2DTO;", "", "items", "", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/data/NotificationCarouselV2DTO$NotificationCarouselItemDTO;", "updatePeriodSeconds", "", "paddings", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/data/NotificationCarouselV2DTO$PaddingsDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;ILru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/data/NotificationCarouselV2DTO$PaddingsDTO;Ljava/util/Map;)V", "getItems", "()Ljava/util/List;", "getUpdatePeriodSeconds", "()I", "getPaddings", "()Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/data/NotificationCarouselV2DTO$PaddingsDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "NotificationCarouselItemDTO", "OrderTrackingNotificationDTO", "InformationNotificationDTO", "ClickDeliveryNotificationDTO", "ActionButtonNotificationDTO", "OrderProgressDTO", "PaddingsDTO", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class NotificationCarouselV2DTO {

    @NotNull
    private final List<NotificationCarouselItemDTO> items;

    @NotNull
    private final PaddingsDTO paddings;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    private final int updatePeriodSeconds;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0017\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003Ja\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006."}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/data/NotificationCarouselV2DTO$ActionButtonNotificationDTO;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/data/NotificationCarouselV2DTO$NotificationCarouselItemDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "titleIcon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "backgroundColor", "", "clickAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getTitleIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getBackgroundColor", "()Ljava/lang/String;", "getClickAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "", "toString", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ActionButtonNotificationDTO implements NotificationCarouselItemDTO {
        private final String backgroundColor;

        @NotNull
        private final ButtonV3DTO button;
        private final AtomActionDTO clickAction;

        @NotNull
        private final TextDTO subtitle;

        @NotNull
        private final TextDTO title;

        @NotNull
        private final IconDTO titleIcon;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public ActionButtonNotificationDTO(@NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull ButtonV3DTO button, @NotNull IconDTO titleIcon, String str, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(button, "button");
            Intrinsics.checkNotNullParameter(titleIcon, "titleIcon");
            this.title = title;
            this.subtitle = subtitle;
            this.button = button;
            this.titleIcon = titleIcon;
            this.backgroundColor = str;
            this.clickAction = atomActionDTO;
            this.trackingInfo = map;
        }

        public static /* synthetic */ ActionButtonNotificationDTO copy$default(ActionButtonNotificationDTO actionButtonNotificationDTO, TextDTO textDTO, TextDTO textDTO2, ButtonV3DTO buttonV3DTO, IconDTO iconDTO, String str, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = actionButtonNotificationDTO.title;
            }
            if ((i11 & 2) != 0) {
                textDTO2 = actionButtonNotificationDTO.subtitle;
            }
            if ((i11 & 4) != 0) {
                buttonV3DTO = actionButtonNotificationDTO.button;
            }
            if ((i11 & 8) != 0) {
                iconDTO = actionButtonNotificationDTO.titleIcon;
            }
            if ((i11 & 16) != 0) {
                str = actionButtonNotificationDTO.backgroundColor;
            }
            if ((i11 & 32) != 0) {
                atomActionDTO = actionButtonNotificationDTO.clickAction;
            }
            if ((i11 & 64) != 0) {
                map = actionButtonNotificationDTO.trackingInfo;
            }
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            Map map2 = map;
            String str2 = str;
            ButtonV3DTO buttonV3DTO2 = buttonV3DTO;
            return actionButtonNotificationDTO.copy(textDTO, textDTO2, buttonV3DTO2, iconDTO, str2, atomActionDTO2, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final ButtonV3DTO getButton() {
            return this.button;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final IconDTO getTitleIcon() {
            return this.titleIcon;
        }

        /* renamed from: component5, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component6, reason: from getter */
        public final AtomActionDTO getClickAction() {
            return this.clickAction;
        }

        public final Map<String, TokenizedTrackingInfo> component7() {
            return this.trackingInfo;
        }

        @NotNull
        public final ActionButtonNotificationDTO copy(@NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull ButtonV3DTO button, @NotNull IconDTO titleIcon, String backgroundColor, AtomActionDTO clickAction, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(button, "button");
            Intrinsics.checkNotNullParameter(titleIcon, "titleIcon");
            return new ActionButtonNotificationDTO(title, subtitle, button, titleIcon, backgroundColor, clickAction, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ActionButtonNotificationDTO)) {
                return false;
            }
            ActionButtonNotificationDTO actionButtonNotificationDTO = (ActionButtonNotificationDTO) other;
            return Intrinsics.d(this.title, actionButtonNotificationDTO.title) && Intrinsics.d(this.subtitle, actionButtonNotificationDTO.subtitle) && Intrinsics.d(this.button, actionButtonNotificationDTO.button) && Intrinsics.d(this.titleIcon, actionButtonNotificationDTO.titleIcon) && Intrinsics.d(this.backgroundColor, actionButtonNotificationDTO.backgroundColor) && Intrinsics.d(this.clickAction, actionButtonNotificationDTO.clickAction) && Intrinsics.d(this.trackingInfo, actionButtonNotificationDTO.trackingInfo);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final ButtonV3DTO getButton() {
            return this.button;
        }

        public final AtomActionDTO getClickAction() {
            return this.clickAction;
        }

        @NotNull
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        public final IconDTO getTitleIcon() {
            return this.titleIcon;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int a11 = C2971a.a(this.titleIcon, C2859b.c(this.button, b.a(this.subtitle, this.title.hashCode() * 31, 31), 31), 31);
            String str = this.backgroundColor;
            int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.clickAction;
            int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode2 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            ButtonV3DTO buttonV3DTO = this.button;
            IconDTO iconDTO = this.titleIcon;
            String str = this.backgroundColor;
            AtomActionDTO atomActionDTO = this.clickAction;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder g10 = g.g("ActionButtonNotificationDTO(title=", textDTO, ", subtitle=", textDTO2, ", button=");
            g10.append(buttonV3DTO);
            g10.append(", titleIcon=");
            g10.append(iconDTO);
            g10.append(", backgroundColor=");
            p.c(str, ", clickAction=", ", trackingInfo=", g10, atomActionDTO);
            return P.f(g10, map, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0017\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003JM\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/data/NotificationCarouselV2DTO$ClickDeliveryNotificationDTO;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/data/NotificationCarouselV2DTO$NotificationCarouselItemDTO;", "skuImage", "Lru/ozon/app/android/fresh/common/widgets/molecules/imageSkuClick/data/ImageSkuClickDTO;", "cell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "backgroundColor", "", "clickAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/fresh/common/widgets/molecules/imageSkuClick/data/ImageSkuClickDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getSkuImage", "()Lru/ozon/app/android/fresh/common/widgets/molecules/imageSkuClick/data/ImageSkuClickDTO;", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getBackgroundColor", "()Ljava/lang/String;", "getClickAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ClickDeliveryNotificationDTO implements NotificationCarouselItemDTO {
        private final String backgroundColor;

        @NotNull
        private final CellDTO cell;
        private final AtomActionDTO clickAction;

        @NotNull
        private final ImageSkuClickDTO skuImage;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public ClickDeliveryNotificationDTO(@NotNull ImageSkuClickDTO skuImage, @NotNull CellDTO cell, String str, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(skuImage, "skuImage");
            Intrinsics.checkNotNullParameter(cell, "cell");
            this.skuImage = skuImage;
            this.cell = cell;
            this.backgroundColor = str;
            this.clickAction = atomActionDTO;
            this.trackingInfo = map;
        }

        public static /* synthetic */ ClickDeliveryNotificationDTO copy$default(ClickDeliveryNotificationDTO clickDeliveryNotificationDTO, ImageSkuClickDTO imageSkuClickDTO, CellDTO cellDTO, String str, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                imageSkuClickDTO = clickDeliveryNotificationDTO.skuImage;
            }
            if ((i11 & 2) != 0) {
                cellDTO = clickDeliveryNotificationDTO.cell;
            }
            if ((i11 & 4) != 0) {
                str = clickDeliveryNotificationDTO.backgroundColor;
            }
            if ((i11 & 8) != 0) {
                atomActionDTO = clickDeliveryNotificationDTO.clickAction;
            }
            if ((i11 & 16) != 0) {
                map = clickDeliveryNotificationDTO.trackingInfo;
            }
            Map map2 = map;
            String str2 = str;
            return clickDeliveryNotificationDTO.copy(imageSkuClickDTO, cellDTO, str2, atomActionDTO, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ImageSkuClickDTO getSkuImage() {
            return this.skuImage;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final CellDTO getCell() {
            return this.cell;
        }

        /* renamed from: component3, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component4, reason: from getter */
        public final AtomActionDTO getClickAction() {
            return this.clickAction;
        }

        public final Map<String, TokenizedTrackingInfo> component5() {
            return this.trackingInfo;
        }

        @NotNull
        public final ClickDeliveryNotificationDTO copy(@NotNull ImageSkuClickDTO skuImage, @NotNull CellDTO cell, String backgroundColor, AtomActionDTO clickAction, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(skuImage, "skuImage");
            Intrinsics.checkNotNullParameter(cell, "cell");
            return new ClickDeliveryNotificationDTO(skuImage, cell, backgroundColor, clickAction, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ClickDeliveryNotificationDTO)) {
                return false;
            }
            ClickDeliveryNotificationDTO clickDeliveryNotificationDTO = (ClickDeliveryNotificationDTO) other;
            return Intrinsics.d(this.skuImage, clickDeliveryNotificationDTO.skuImage) && Intrinsics.d(this.cell, clickDeliveryNotificationDTO.cell) && Intrinsics.d(this.backgroundColor, clickDeliveryNotificationDTO.backgroundColor) && Intrinsics.d(this.clickAction, clickDeliveryNotificationDTO.clickAction) && Intrinsics.d(this.trackingInfo, clickDeliveryNotificationDTO.trackingInfo);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final CellDTO getCell() {
            return this.cell;
        }

        public final AtomActionDTO getClickAction() {
            return this.clickAction;
        }

        @NotNull
        public final ImageSkuClickDTO getSkuImage() {
            return this.skuImage;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int c11 = Bi.b.c(this.cell, this.skuImage.hashCode() * 31, 31);
            String str = this.backgroundColor;
            int hashCode = (c11 + (str == null ? 0 : str.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.clickAction;
            int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode2 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            ImageSkuClickDTO imageSkuClickDTO = this.skuImage;
            CellDTO cellDTO = this.cell;
            String str = this.backgroundColor;
            AtomActionDTO atomActionDTO = this.clickAction;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("ClickDeliveryNotificationDTO(skuImage=");
            sb2.append(imageSkuClickDTO);
            sb2.append(", cell=");
            sb2.append(cellDTO);
            sb2.append(", backgroundColor=");
            p.c(str, ", clickAction=", ", trackingInfo=", sb2, atomActionDTO);
            return P.f(sb2, map, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0017\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003Jc\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006,"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/data/NotificationCarouselV2DTO$InformationNotificationDTO;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/data/NotificationCarouselV2DTO$NotificationCarouselItemDTO;", "leftIcon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "rightIcon", "backgroundColor", "", "clickAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getLeftIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getRightIcon", "getBackgroundColor", "()Ljava/lang/String;", "getClickAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "", "toString", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InformationNotificationDTO implements NotificationCarouselItemDTO {
        private final String backgroundColor;
        private final AtomActionDTO clickAction;

        @NotNull
        private final IconDTO leftIcon;
        private final IconDTO rightIcon;

        @NotNull
        private final TextDTO subtitle;

        @NotNull
        private final TextDTO title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public InformationNotificationDTO(@NotNull IconDTO leftIcon, @NotNull TextDTO title, @NotNull TextDTO subtitle, IconDTO iconDTO, String str, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(leftIcon, "leftIcon");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            this.leftIcon = leftIcon;
            this.title = title;
            this.subtitle = subtitle;
            this.rightIcon = iconDTO;
            this.backgroundColor = str;
            this.clickAction = atomActionDTO;
            this.trackingInfo = map;
        }

        public static /* synthetic */ InformationNotificationDTO copy$default(InformationNotificationDTO informationNotificationDTO, IconDTO iconDTO, TextDTO textDTO, TextDTO textDTO2, IconDTO iconDTO2, String str, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                iconDTO = informationNotificationDTO.leftIcon;
            }
            if ((i11 & 2) != 0) {
                textDTO = informationNotificationDTO.title;
            }
            if ((i11 & 4) != 0) {
                textDTO2 = informationNotificationDTO.subtitle;
            }
            if ((i11 & 8) != 0) {
                iconDTO2 = informationNotificationDTO.rightIcon;
            }
            if ((i11 & 16) != 0) {
                str = informationNotificationDTO.backgroundColor;
            }
            if ((i11 & 32) != 0) {
                atomActionDTO = informationNotificationDTO.clickAction;
            }
            if ((i11 & 64) != 0) {
                map = informationNotificationDTO.trackingInfo;
            }
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            Map map2 = map;
            String str2 = str;
            TextDTO textDTO3 = textDTO2;
            return informationNotificationDTO.copy(iconDTO, textDTO, textDTO3, iconDTO2, str2, atomActionDTO2, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final IconDTO getLeftIcon() {
            return this.leftIcon;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component4, reason: from getter */
        public final IconDTO getRightIcon() {
            return this.rightIcon;
        }

        /* renamed from: component5, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component6, reason: from getter */
        public final AtomActionDTO getClickAction() {
            return this.clickAction;
        }

        public final Map<String, TokenizedTrackingInfo> component7() {
            return this.trackingInfo;
        }

        @NotNull
        public final InformationNotificationDTO copy(@NotNull IconDTO leftIcon, @NotNull TextDTO title, @NotNull TextDTO subtitle, IconDTO rightIcon, String backgroundColor, AtomActionDTO clickAction, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(leftIcon, "leftIcon");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            return new InformationNotificationDTO(leftIcon, title, subtitle, rightIcon, backgroundColor, clickAction, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InformationNotificationDTO)) {
                return false;
            }
            InformationNotificationDTO informationNotificationDTO = (InformationNotificationDTO) other;
            return Intrinsics.d(this.leftIcon, informationNotificationDTO.leftIcon) && Intrinsics.d(this.title, informationNotificationDTO.title) && Intrinsics.d(this.subtitle, informationNotificationDTO.subtitle) && Intrinsics.d(this.rightIcon, informationNotificationDTO.rightIcon) && Intrinsics.d(this.backgroundColor, informationNotificationDTO.backgroundColor) && Intrinsics.d(this.clickAction, informationNotificationDTO.clickAction) && Intrinsics.d(this.trackingInfo, informationNotificationDTO.trackingInfo);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final AtomActionDTO getClickAction() {
            return this.clickAction;
        }

        @NotNull
        public final IconDTO getLeftIcon() {
            return this.leftIcon;
        }

        public final IconDTO getRightIcon() {
            return this.rightIcon;
        }

        @NotNull
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int a11 = b.a(this.subtitle, b.a(this.title, this.leftIcon.hashCode() * 31, 31), 31);
            IconDTO iconDTO = this.rightIcon;
            int hashCode = (a11 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
            String str = this.backgroundColor;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.clickAction;
            int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode3 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            IconDTO iconDTO = this.leftIcon;
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            IconDTO iconDTO2 = this.rightIcon;
            String str = this.backgroundColor;
            AtomActionDTO atomActionDTO = this.clickAction;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder i11 = Bi.b.i("InformationNotificationDTO(leftIcon=", ", title=", ", subtitle=", iconDTO, textDTO);
            G.f(i11, textDTO2, ", rightIcon=", iconDTO2, ", backgroundColor=");
            p.c(str, ", clickAction=", ", trackingInfo=", i11, atomActionDTO);
            return P.f(i11, map, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/data/NotificationCarouselV2DTO$NotificationCarouselItemDTO;", "", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/data/NotificationCarouselV2DTO$ActionButtonNotificationDTO;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/data/NotificationCarouselV2DTO$ClickDeliveryNotificationDTO;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/data/NotificationCarouselV2DTO$InformationNotificationDTO;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/data/NotificationCarouselV2DTO$OrderTrackingNotificationDTO;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface NotificationCarouselItemDTO {
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001aB!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/data/NotificationCarouselV2DTO$OrderProgressDTO;", "", "progress", "", "ringProgressColor", "", "type", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/data/NotificationCarouselV2DTO$OrderProgressDTO$OrderProgressType;", "<init>", "(FLjava/lang/String;Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/data/NotificationCarouselV2DTO$OrderProgressDTO$OrderProgressType;)V", "getProgress", "()F", "getRingProgressColor", "()Ljava/lang/String;", "getType", "()Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/data/NotificationCarouselV2DTO$OrderProgressDTO$OrderProgressType;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "OrderProgressType", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class OrderProgressDTO {
        private final float progress;

        @NotNull
        private final String ringProgressColor;

        @NotNull
        private final OrderProgressType type;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/data/NotificationCarouselV2DTO$OrderProgressDTO$OrderProgressType;", "", "<init>", "()V", "Icon", "Text", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/data/NotificationCarouselV2DTO$OrderProgressDTO$OrderProgressType$Icon;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/data/NotificationCarouselV2DTO$OrderProgressDTO$OrderProgressType$Text;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static abstract class OrderProgressType {

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/data/NotificationCarouselV2DTO$OrderProgressDTO$OrderProgressType$Icon;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/data/NotificationCarouselV2DTO$OrderProgressDTO$OrderProgressType;", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;)V", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Icon extends OrderProgressType {

                @NotNull
                private final IconDTO icon;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Icon(@NotNull IconDTO icon) {
                    super(null);
                    Intrinsics.checkNotNullParameter(icon, "icon");
                    this.icon = icon;
                }

                public static /* synthetic */ Icon copy$default(Icon icon, IconDTO iconDTO, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        iconDTO = icon.icon;
                    }
                    return icon.copy(iconDTO);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final IconDTO getIcon() {
                    return this.icon;
                }

                @NotNull
                public final Icon copy(@NotNull IconDTO icon) {
                    Intrinsics.checkNotNullParameter(icon, "icon");
                    return new Icon(icon);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Icon) && Intrinsics.d(this.icon, ((Icon) other).icon);
                }

                @NotNull
                public final IconDTO getIcon() {
                    return this.icon;
                }

                public int hashCode() {
                    return this.icon.hashCode();
                }

                @NotNull
                public String toString() {
                    return "Icon(icon=" + this.icon + ")";
                }
            }

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/data/NotificationCarouselV2DTO$OrderProgressDTO$OrderProgressType$Text;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/data/NotificationCarouselV2DTO$OrderProgressDTO$OrderProgressType;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Text extends OrderProgressType {

                @NotNull
                private final TextDTO subtitle;

                @NotNull
                private final TextDTO title;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Text(@NotNull TextDTO title, @NotNull TextDTO subtitle) {
                    super(null);
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                    this.title = title;
                    this.subtitle = subtitle;
                }

                public static /* synthetic */ Text copy$default(Text text, TextDTO textDTO, TextDTO textDTO2, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        textDTO = text.title;
                    }
                    if ((i11 & 2) != 0) {
                        textDTO2 = text.subtitle;
                    }
                    return text.copy(textDTO, textDTO2);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final TextDTO getTitle() {
                    return this.title;
                }

                @NotNull
                /* renamed from: component2, reason: from getter */
                public final TextDTO getSubtitle() {
                    return this.subtitle;
                }

                @NotNull
                public final Text copy(@NotNull TextDTO title, @NotNull TextDTO subtitle) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                    return new Text(title, subtitle);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Text)) {
                        return false;
                    }
                    Text text = (Text) other;
                    return Intrinsics.d(this.title, text.title) && Intrinsics.d(this.subtitle, text.subtitle);
                }

                @NotNull
                public final TextDTO getSubtitle() {
                    return this.subtitle;
                }

                @NotNull
                public final TextDTO getTitle() {
                    return this.title;
                }

                public int hashCode() {
                    return this.subtitle.hashCode() + (this.title.hashCode() * 31);
                }

                @NotNull
                public String toString() {
                    return a.b("Text(title=", this.title, ", subtitle=", this.subtitle, ")");
                }
            }

            public /* synthetic */ OrderProgressType(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private OrderProgressType() {
            }
        }

        public OrderProgressDTO(float f7, @NotNull String ringProgressColor, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "progressText", type = OrderProgressType.Text.class), @ProtoOneOfSignature(name = "progressIcon", type = OrderProgressType.Icon.class)}) @NotNull @ProtoOneOf(label = "type") OrderProgressType type) {
            Intrinsics.checkNotNullParameter(ringProgressColor, "ringProgressColor");
            Intrinsics.checkNotNullParameter(type, "type");
            this.progress = f7;
            this.ringProgressColor = ringProgressColor;
            this.type = type;
        }

        public static /* synthetic */ OrderProgressDTO copy$default(OrderProgressDTO orderProgressDTO, float f7, String str, OrderProgressType orderProgressType, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                f7 = orderProgressDTO.progress;
            }
            if ((i11 & 2) != 0) {
                str = orderProgressDTO.ringProgressColor;
            }
            if ((i11 & 4) != 0) {
                orderProgressType = orderProgressDTO.type;
            }
            return orderProgressDTO.copy(f7, str, orderProgressType);
        }

        /* renamed from: component1, reason: from getter */
        public final float getProgress() {
            return this.progress;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getRingProgressColor() {
            return this.ringProgressColor;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final OrderProgressType getType() {
            return this.type;
        }

        @NotNull
        public final OrderProgressDTO copy(float progress, @NotNull String ringProgressColor, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "progressText", type = OrderProgressType.Text.class), @ProtoOneOfSignature(name = "progressIcon", type = OrderProgressType.Icon.class)}) @NotNull @ProtoOneOf(label = "type") OrderProgressType type) {
            Intrinsics.checkNotNullParameter(ringProgressColor, "ringProgressColor");
            Intrinsics.checkNotNullParameter(type, "type");
            return new OrderProgressDTO(progress, ringProgressColor, type);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OrderProgressDTO)) {
                return false;
            }
            OrderProgressDTO orderProgressDTO = (OrderProgressDTO) other;
            return Float.compare(this.progress, orderProgressDTO.progress) == 0 && Intrinsics.d(this.ringProgressColor, orderProgressDTO.ringProgressColor) && Intrinsics.d(this.type, orderProgressDTO.type);
        }

        public final float getProgress() {
            return this.progress;
        }

        @NotNull
        public final String getRingProgressColor() {
            return this.ringProgressColor;
        }

        @NotNull
        public final OrderProgressType getType() {
            return this.type;
        }

        public int hashCode() {
            return this.type.hashCode() + G.g.a(Float.hashCode(this.progress) * 31, 31, this.ringProgressColor);
        }

        @NotNull
        public String toString() {
            return "OrderProgressDTO(progress=" + this.progress + ", ringProgressColor=" + this.ringProgressColor + ", type=" + this.type + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0017\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003Jm\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001f\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00061"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/data/NotificationCarouselV2DTO$OrderTrackingNotificationDTO;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/data/NotificationCarouselV2DTO$NotificationCarouselItemDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "titleIcon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "progress", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/data/NotificationCarouselV2DTO$OrderProgressDTO;", "starIcon", "backgroundColor", "", "clickAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/data/NotificationCarouselV2DTO$OrderProgressDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getTitleIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getProgress", "()Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/data/NotificationCarouselV2DTO$OrderProgressDTO;", "getStarIcon", "getBackgroundColor", "()Ljava/lang/String;", "getClickAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "hashCode", "", "toString", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OrderTrackingNotificationDTO implements NotificationCarouselItemDTO {
        private final String backgroundColor;
        private final AtomActionDTO clickAction;

        @NotNull
        private final OrderProgressDTO progress;
        private final IconDTO starIcon;

        @NotNull
        private final TextDTO subtitle;

        @NotNull
        private final TextDTO title;

        @NotNull
        private final IconDTO titleIcon;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public OrderTrackingNotificationDTO(@NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull IconDTO titleIcon, @NotNull OrderProgressDTO progress, IconDTO iconDTO, String str, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(titleIcon, "titleIcon");
            Intrinsics.checkNotNullParameter(progress, "progress");
            this.title = title;
            this.subtitle = subtitle;
            this.titleIcon = titleIcon;
            this.progress = progress;
            this.starIcon = iconDTO;
            this.backgroundColor = str;
            this.clickAction = atomActionDTO;
            this.trackingInfo = map;
        }

        public static /* synthetic */ OrderTrackingNotificationDTO copy$default(OrderTrackingNotificationDTO orderTrackingNotificationDTO, TextDTO textDTO, TextDTO textDTO2, IconDTO iconDTO, OrderProgressDTO orderProgressDTO, IconDTO iconDTO2, String str, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = orderTrackingNotificationDTO.title;
            }
            if ((i11 & 2) != 0) {
                textDTO2 = orderTrackingNotificationDTO.subtitle;
            }
            if ((i11 & 4) != 0) {
                iconDTO = orderTrackingNotificationDTO.titleIcon;
            }
            if ((i11 & 8) != 0) {
                orderProgressDTO = orderTrackingNotificationDTO.progress;
            }
            if ((i11 & 16) != 0) {
                iconDTO2 = orderTrackingNotificationDTO.starIcon;
            }
            if ((i11 & 32) != 0) {
                str = orderTrackingNotificationDTO.backgroundColor;
            }
            if ((i11 & 64) != 0) {
                atomActionDTO = orderTrackingNotificationDTO.clickAction;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                map = orderTrackingNotificationDTO.trackingInfo;
            }
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            Map map2 = map;
            IconDTO iconDTO3 = iconDTO2;
            String str2 = str;
            return orderTrackingNotificationDTO.copy(textDTO, textDTO2, iconDTO, orderProgressDTO, iconDTO3, str2, atomActionDTO2, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final IconDTO getTitleIcon() {
            return this.titleIcon;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final OrderProgressDTO getProgress() {
            return this.progress;
        }

        /* renamed from: component5, reason: from getter */
        public final IconDTO getStarIcon() {
            return this.starIcon;
        }

        /* renamed from: component6, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component7, reason: from getter */
        public final AtomActionDTO getClickAction() {
            return this.clickAction;
        }

        public final Map<String, TokenizedTrackingInfo> component8() {
            return this.trackingInfo;
        }

        @NotNull
        public final OrderTrackingNotificationDTO copy(@NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull IconDTO titleIcon, @NotNull OrderProgressDTO progress, IconDTO starIcon, String backgroundColor, AtomActionDTO clickAction, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(titleIcon, "titleIcon");
            Intrinsics.checkNotNullParameter(progress, "progress");
            return new OrderTrackingNotificationDTO(title, subtitle, titleIcon, progress, starIcon, backgroundColor, clickAction, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OrderTrackingNotificationDTO)) {
                return false;
            }
            OrderTrackingNotificationDTO orderTrackingNotificationDTO = (OrderTrackingNotificationDTO) other;
            return Intrinsics.d(this.title, orderTrackingNotificationDTO.title) && Intrinsics.d(this.subtitle, orderTrackingNotificationDTO.subtitle) && Intrinsics.d(this.titleIcon, orderTrackingNotificationDTO.titleIcon) && Intrinsics.d(this.progress, orderTrackingNotificationDTO.progress) && Intrinsics.d(this.starIcon, orderTrackingNotificationDTO.starIcon) && Intrinsics.d(this.backgroundColor, orderTrackingNotificationDTO.backgroundColor) && Intrinsics.d(this.clickAction, orderTrackingNotificationDTO.clickAction) && Intrinsics.d(this.trackingInfo, orderTrackingNotificationDTO.trackingInfo);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final AtomActionDTO getClickAction() {
            return this.clickAction;
        }

        @NotNull
        public final OrderProgressDTO getProgress() {
            return this.progress;
        }

        public final IconDTO getStarIcon() {
            return this.starIcon;
        }

        @NotNull
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        public final IconDTO getTitleIcon() {
            return this.titleIcon;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = (this.progress.hashCode() + C2971a.a(this.titleIcon, b.a(this.subtitle, this.title.hashCode() * 31, 31), 31)) * 31;
            IconDTO iconDTO = this.starIcon;
            int hashCode2 = (hashCode + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
            String str = this.backgroundColor;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.clickAction;
            int hashCode4 = (hashCode3 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode4 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            IconDTO iconDTO = this.titleIcon;
            OrderProgressDTO orderProgressDTO = this.progress;
            IconDTO iconDTO2 = this.starIcon;
            String str = this.backgroundColor;
            AtomActionDTO atomActionDTO = this.clickAction;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder g10 = g.g("OrderTrackingNotificationDTO(title=", textDTO, ", subtitle=", textDTO2, ", titleIcon=");
            g10.append(iconDTO);
            g10.append(", progress=");
            g10.append(orderProgressDTO);
            g10.append(", starIcon=");
            g10.append(iconDTO2);
            g10.append(", backgroundColor=");
            g10.append(str);
            g10.append(", clickAction=");
            return D40.a.d(g10, atomActionDTO, ", trackingInfo=", map, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/data/NotificationCarouselV2DTO$PaddingsDTO;", "", "topPadding", "Lru/ozon/uni/atoms/data/common/Paddings;", "bottomPadding", "horizontalPadding", "betweenPadding", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getTopPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getBottomPadding", "getHorizontalPadding", "getBetweenPadding", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PaddingsDTO {

        @NotNull
        private final Paddings betweenPadding;

        @NotNull
        private final Paddings bottomPadding;

        @NotNull
        private final Paddings horizontalPadding;

        @NotNull
        private final Paddings topPadding;

        public PaddingsDTO() {
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ PaddingsDTO copy$default(PaddingsDTO paddingsDTO, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                paddings = paddingsDTO.topPadding;
            }
            if ((i11 & 2) != 0) {
                paddings2 = paddingsDTO.bottomPadding;
            }
            if ((i11 & 4) != 0) {
                paddings3 = paddingsDTO.horizontalPadding;
            }
            if ((i11 & 8) != 0) {
                paddings4 = paddingsDTO.betweenPadding;
            }
            return paddingsDTO.copy(paddings, paddings2, paddings3, paddings4);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Paddings getTopPadding() {
            return this.topPadding;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Paddings getBottomPadding() {
            return this.bottomPadding;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final Paddings getHorizontalPadding() {
            return this.horizontalPadding;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final Paddings getBetweenPadding() {
            return this.betweenPadding;
        }

        @NotNull
        public final PaddingsDTO copy(@NotNull Paddings topPadding, @NotNull Paddings bottomPadding, @NotNull Paddings horizontalPadding, @NotNull Paddings betweenPadding) {
            Intrinsics.checkNotNullParameter(topPadding, "topPadding");
            Intrinsics.checkNotNullParameter(bottomPadding, "bottomPadding");
            Intrinsics.checkNotNullParameter(horizontalPadding, "horizontalPadding");
            Intrinsics.checkNotNullParameter(betweenPadding, "betweenPadding");
            return new PaddingsDTO(topPadding, bottomPadding, horizontalPadding, betweenPadding);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaddingsDTO)) {
                return false;
            }
            PaddingsDTO paddingsDTO = (PaddingsDTO) other;
            return this.topPadding == paddingsDTO.topPadding && this.bottomPadding == paddingsDTO.bottomPadding && this.horizontalPadding == paddingsDTO.horizontalPadding && this.betweenPadding == paddingsDTO.betweenPadding;
        }

        @NotNull
        public final Paddings getBetweenPadding() {
            return this.betweenPadding;
        }

        @NotNull
        public final Paddings getBottomPadding() {
            return this.bottomPadding;
        }

        @NotNull
        public final Paddings getHorizontalPadding() {
            return this.horizontalPadding;
        }

        @NotNull
        public final Paddings getTopPadding() {
            return this.topPadding;
        }

        public int hashCode() {
            return this.betweenPadding.hashCode() + GR.b.b(this.horizontalPadding, GR.b.b(this.bottomPadding, this.topPadding.hashCode() * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            Paddings paddings = this.topPadding;
            Paddings paddings2 = this.bottomPadding;
            return GR.b.e(p.b("PaddingsDTO(topPadding=", paddings, ", bottomPadding=", paddings2, ", horizontalPadding="), this.horizontalPadding, ", betweenPadding=", this.betweenPadding, ")");
        }

        public PaddingsDTO(@NotNull Paddings topPadding, @NotNull Paddings bottomPadding, @NotNull Paddings horizontalPadding, @NotNull Paddings betweenPadding) {
            Intrinsics.checkNotNullParameter(topPadding, "topPadding");
            Intrinsics.checkNotNullParameter(bottomPadding, "bottomPadding");
            Intrinsics.checkNotNullParameter(horizontalPadding, "horizontalPadding");
            Intrinsics.checkNotNullParameter(betweenPadding, "betweenPadding");
            this.topPadding = topPadding;
            this.bottomPadding = bottomPadding;
            this.horizontalPadding = horizontalPadding;
            this.betweenPadding = betweenPadding;
        }

        public /* synthetic */ PaddingsDTO(Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? Paddings.PADDING_100 : paddings, (i11 & 2) != 0 ? Paddings.PADDING_400 : paddings2, (i11 & 4) != 0 ? Paddings.PADDING_500 : paddings3, (i11 & 8) != 0 ? Paddings.PADDING_250 : paddings4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NotificationCarouselV2DTO(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "orderTracking", type = OrderTrackingNotificationDTO.class), @ProtoOneOfSignature(name = "information", type = InformationNotificationDTO.class), @ProtoOneOfSignature(name = "clickDelivery", type = ClickDeliveryNotificationDTO.class), @ProtoOneOfSignature(name = "actionButton", type = ActionButtonNotificationDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends NotificationCarouselItemDTO> items, int i11, @NotNull PaddingsDTO paddings, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        this.items = items;
        this.updatePeriodSeconds = i11;
        this.paddings = paddings;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NotificationCarouselV2DTO copy$default(NotificationCarouselV2DTO notificationCarouselV2DTO, List list, int i11, PaddingsDTO paddingsDTO, Map map, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = notificationCarouselV2DTO.items;
        }
        if ((i12 & 2) != 0) {
            i11 = notificationCarouselV2DTO.updatePeriodSeconds;
        }
        if ((i12 & 4) != 0) {
            paddingsDTO = notificationCarouselV2DTO.paddings;
        }
        if ((i12 & 8) != 0) {
            map = notificationCarouselV2DTO.trackingInfo;
        }
        return notificationCarouselV2DTO.copy(list, i11, paddingsDTO, map);
    }

    @NotNull
    public final List<NotificationCarouselItemDTO> component1() {
        return this.items;
    }

    /* renamed from: component2, reason: from getter */
    public final int getUpdatePeriodSeconds() {
        return this.updatePeriodSeconds;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final PaddingsDTO getPaddings() {
        return this.paddings;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    @NotNull
    public final NotificationCarouselV2DTO copy(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "orderTracking", type = OrderTrackingNotificationDTO.class), @ProtoOneOfSignature(name = "information", type = InformationNotificationDTO.class), @ProtoOneOfSignature(name = "clickDelivery", type = ClickDeliveryNotificationDTO.class), @ProtoOneOfSignature(name = "actionButton", type = ActionButtonNotificationDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends NotificationCarouselItemDTO> items, int updatePeriodSeconds, @NotNull PaddingsDTO paddings, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        return new NotificationCarouselV2DTO(items, updatePeriodSeconds, paddings, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationCarouselV2DTO)) {
            return false;
        }
        NotificationCarouselV2DTO notificationCarouselV2DTO = (NotificationCarouselV2DTO) other;
        return Intrinsics.d(this.items, notificationCarouselV2DTO.items) && this.updatePeriodSeconds == notificationCarouselV2DTO.updatePeriodSeconds && Intrinsics.d(this.paddings, notificationCarouselV2DTO.paddings) && Intrinsics.d(this.trackingInfo, notificationCarouselV2DTO.trackingInfo);
    }

    @NotNull
    public final List<NotificationCarouselItemDTO> getItems() {
        return this.items;
    }

    @NotNull
    public final PaddingsDTO getPaddings() {
        return this.paddings;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public final int getUpdatePeriodSeconds() {
        return this.updatePeriodSeconds;
    }

    public int hashCode() {
        int hashCode = (this.paddings.hashCode() + C2454a.a(this.updatePeriodSeconds, this.items.hashCode() * 31, 31)) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        return "NotificationCarouselV2DTO(items=" + this.items + ", updatePeriodSeconds=" + this.updatePeriodSeconds + ", paddings=" + this.paddings + ", trackingInfo=" + this.trackingInfo + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ NotificationCarouselV2DTO(List list, int i11, PaddingsDTO paddingsDTO, Map map, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, i11, paddingsDTO, map);
        if ((i12 & 4) != 0) {
            paddingsDTO = new PaddingsDTO(null, null, null, null, 15, null);
        }
    }
}
