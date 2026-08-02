package ru.ozon.app.android.marketing.widgets.blackfridaycounter.data;

import G.g;
import I0.C3173b;
import Kk.C3532b;
import N3.C3660k;
import Nh.a;
import T7.P;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002()BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0017\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003JW\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006*"}, d2 = {"Lru/ozon/app/android/marketing/widgets/blackfridaycounter/data/BlackFridayCounterDTO;", "", "backgroundImage", "", "titleImage", DynamicElementDTO.TIMER, "Lru/ozon/app/android/marketing/widgets/blackfridaycounter/data/BlackFridayCounterDTO$TimerDTO;", CommentV3DTO.FOOTER_FIELD_NAME, "Lru/ozon/app/android/marketing/widgets/blackfridaycounter/data/BlackFridayCounterDTO$FooterDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/marketing/widgets/blackfridaycounter/data/BlackFridayCounterDTO$TimerDTO;Lru/ozon/app/android/marketing/widgets/blackfridaycounter/data/BlackFridayCounterDTO$FooterDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getBackgroundImage", "()Ljava/lang/String;", "getTitleImage", "getTimer", "()Lru/ozon/app/android/marketing/widgets/blackfridaycounter/data/BlackFridayCounterDTO$TimerDTO;", "getFooter", "()Lru/ozon/app/android/marketing/widgets/blackfridaycounter/data/BlackFridayCounterDTO$FooterDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "TimerDTO", "FooterDTO", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class BlackFridayCounterDTO {
    public static final int $stable = 8;
    private final AtomActionDTO action;

    @NotNull
    private final String backgroundImage;
    private final FooterDTO footer;

    @NotNull
    private final TimerDTO timer;

    @NotNull
    private final String titleImage;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0014J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003J\u0017\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003Jj\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0016R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\b\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006)"}, d2 = {"Lru/ozon/app/android/marketing/widgets/blackfridaycounter/data/BlackFridayCounterDTO$FooterDTO;", "", "tintColor", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "showDisclosure", "", "isHidden", "isPremium", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/Boolean;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getTintColor", "()Ljava/lang/String;", "getTitle", "getShowDisclosure", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "()Z", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/Boolean;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)Lru/ozon/app/android/marketing/widgets/blackfridaycounter/data/BlackFridayCounterDTO$FooterDTO;", "equals", "other", "hashCode", "", "toString", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FooterDTO {
        public static final int $stable = 8;
        private final AtomActionDTO action;
        private final boolean isHidden;
        private final Boolean isPremium;
        private final Boolean showDisclosure;
        private final String tintColor;

        @NotNull
        private final String title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public FooterDTO(String str, @NotNull String title, Boolean bool, boolean z11, Boolean bool2, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.tintColor = str;
            this.title = title;
            this.showDisclosure = bool;
            this.isHidden = z11;
            this.isPremium = bool2;
            this.action = atomActionDTO;
            this.trackingInfo = map;
        }

        public static /* synthetic */ FooterDTO copy$default(FooterDTO footerDTO, String str, String str2, Boolean bool, boolean z11, Boolean bool2, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = footerDTO.tintColor;
            }
            if ((i11 & 2) != 0) {
                str2 = footerDTO.title;
            }
            if ((i11 & 4) != 0) {
                bool = footerDTO.showDisclosure;
            }
            if ((i11 & 8) != 0) {
                z11 = footerDTO.isHidden;
            }
            if ((i11 & 16) != 0) {
                bool2 = footerDTO.isPremium;
            }
            if ((i11 & 32) != 0) {
                atomActionDTO = footerDTO.action;
            }
            if ((i11 & 64) != 0) {
                map = footerDTO.trackingInfo;
            }
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            Map map2 = map;
            Boolean bool3 = bool2;
            Boolean bool4 = bool;
            return footerDTO.copy(str, str2, bool4, z11, bool3, atomActionDTO2, map2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTintColor() {
            return this.tintColor;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final Boolean getShowDisclosure() {
            return this.showDisclosure;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsHidden() {
            return this.isHidden;
        }

        /* renamed from: component5, reason: from getter */
        public final Boolean getIsPremium() {
            return this.isPremium;
        }

        /* renamed from: component6, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component7() {
            return this.trackingInfo;
        }

        @NotNull
        public final FooterDTO copy(String tintColor, @NotNull String title, Boolean showDisclosure, boolean isHidden, Boolean isPremium, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new FooterDTO(tintColor, title, showDisclosure, isHidden, isPremium, action, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FooterDTO)) {
                return false;
            }
            FooterDTO footerDTO = (FooterDTO) other;
            return Intrinsics.d(this.tintColor, footerDTO.tintColor) && Intrinsics.d(this.title, footerDTO.title) && Intrinsics.d(this.showDisclosure, footerDTO.showDisclosure) && this.isHidden == footerDTO.isHidden && Intrinsics.d(this.isPremium, footerDTO.isPremium) && Intrinsics.d(this.action, footerDTO.action) && Intrinsics.d(this.trackingInfo, footerDTO.trackingInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Boolean getShowDisclosure() {
            return this.showDisclosure;
        }

        public final String getTintColor() {
            return this.tintColor;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            String str = this.tintColor;
            int a11 = g.a((str == null ? 0 : str.hashCode()) * 31, 31, this.title);
            Boolean bool = this.showDisclosure;
            int a12 = C3532b.a((a11 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.isHidden);
            Boolean bool2 = this.isPremium;
            int hashCode = (a12 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode2 + (map != null ? map.hashCode() : 0);
        }

        public final boolean isHidden() {
            return this.isHidden;
        }

        public final Boolean isPremium() {
            return this.isPremium;
        }

        @NotNull
        public String toString() {
            String str = this.tintColor;
            String str2 = this.title;
            Boolean bool = this.showDisclosure;
            boolean z11 = this.isHidden;
            Boolean bool2 = this.isPremium;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder d11 = C3660k.d("FooterDTO(tintColor=", str, ", title=", str2, ", showDisclosure=");
            d11.append(bool);
            d11.append(", isHidden=");
            d11.append(z11);
            d11.append(", isPremium=");
            d11.append(bool2);
            d11.append(", action=");
            d11.append(atomActionDTO);
            d11.append(", trackingInfo=");
            return P.f(d11, map, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003JG\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/marketing/widgets/blackfridaycounter/data/BlackFridayCounterDTO$TimerDTO;", "", "tintColor", "", "serverTimestamp", "deadlineTimestamp", SelectionItemFormDTO.TITLE_FIELD_NAME, "titleOnExpire", "backgroundColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTintColor", "()Ljava/lang/String;", "getServerTimestamp", "getDeadlineTimestamp", "getTitle", "getTitleOnExpire", "getBackgroundColor", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TimerDTO {
        public static final int $stable = 0;

        @NotNull
        private final String backgroundColor;

        @NotNull
        private final String deadlineTimestamp;

        @NotNull
        private final String serverTimestamp;
        private final String tintColor;

        @NotNull
        private final String title;

        @NotNull
        private final String titleOnExpire;

        public TimerDTO(String str, @NotNull String serverTimestamp, @NotNull String deadlineTimestamp, @NotNull String title, @NotNull String titleOnExpire, @NotNull String backgroundColor) {
            Intrinsics.checkNotNullParameter(serverTimestamp, "serverTimestamp");
            Intrinsics.checkNotNullParameter(deadlineTimestamp, "deadlineTimestamp");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(titleOnExpire, "titleOnExpire");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            this.tintColor = str;
            this.serverTimestamp = serverTimestamp;
            this.deadlineTimestamp = deadlineTimestamp;
            this.title = title;
            this.titleOnExpire = titleOnExpire;
            this.backgroundColor = backgroundColor;
        }

        public static /* synthetic */ TimerDTO copy$default(TimerDTO timerDTO, String str, String str2, String str3, String str4, String str5, String str6, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = timerDTO.tintColor;
            }
            if ((i11 & 2) != 0) {
                str2 = timerDTO.serverTimestamp;
            }
            if ((i11 & 4) != 0) {
                str3 = timerDTO.deadlineTimestamp;
            }
            if ((i11 & 8) != 0) {
                str4 = timerDTO.title;
            }
            if ((i11 & 16) != 0) {
                str5 = timerDTO.titleOnExpire;
            }
            if ((i11 & 32) != 0) {
                str6 = timerDTO.backgroundColor;
            }
            String str7 = str5;
            String str8 = str6;
            return timerDTO.copy(str, str2, str3, str4, str7, str8);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTintColor() {
            return this.tintColor;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getServerTimestamp() {
            return this.serverTimestamp;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getDeadlineTimestamp() {
            return this.deadlineTimestamp;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final String getTitleOnExpire() {
            return this.titleOnExpire;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final TimerDTO copy(String tintColor, @NotNull String serverTimestamp, @NotNull String deadlineTimestamp, @NotNull String title, @NotNull String titleOnExpire, @NotNull String backgroundColor) {
            Intrinsics.checkNotNullParameter(serverTimestamp, "serverTimestamp");
            Intrinsics.checkNotNullParameter(deadlineTimestamp, "deadlineTimestamp");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(titleOnExpire, "titleOnExpire");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            return new TimerDTO(tintColor, serverTimestamp, deadlineTimestamp, title, titleOnExpire, backgroundColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TimerDTO)) {
                return false;
            }
            TimerDTO timerDTO = (TimerDTO) other;
            return Intrinsics.d(this.tintColor, timerDTO.tintColor) && Intrinsics.d(this.serverTimestamp, timerDTO.serverTimestamp) && Intrinsics.d(this.deadlineTimestamp, timerDTO.deadlineTimestamp) && Intrinsics.d(this.title, timerDTO.title) && Intrinsics.d(this.titleOnExpire, timerDTO.titleOnExpire) && Intrinsics.d(this.backgroundColor, timerDTO.backgroundColor);
        }

        @NotNull
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final String getDeadlineTimestamp() {
            return this.deadlineTimestamp;
        }

        @NotNull
        public final String getServerTimestamp() {
            return this.serverTimestamp;
        }

        public final String getTintColor() {
            return this.tintColor;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final String getTitleOnExpire() {
            return this.titleOnExpire;
        }

        public int hashCode() {
            String str = this.tintColor;
            return this.backgroundColor.hashCode() + g.a(g.a(g.a(g.a((str == null ? 0 : str.hashCode()) * 31, 31, this.serverTimestamp), 31, this.deadlineTimestamp), 31, this.title), 31, this.titleOnExpire);
        }

        @NotNull
        public String toString() {
            String str = this.tintColor;
            String str2 = this.serverTimestamp;
            String str3 = this.deadlineTimestamp;
            String str4 = this.title;
            String str5 = this.titleOnExpire;
            String str6 = this.backgroundColor;
            StringBuilder d11 = C3660k.d("TimerDTO(tintColor=", str, ", serverTimestamp=", str2, ", deadlineTimestamp=");
            a.h(d11, str3, ", title=", str4, ", titleOnExpire=");
            return C3173b.c(d11, str5, ", backgroundColor=", str6, ")");
        }
    }

    public BlackFridayCounterDTO(@NotNull String backgroundImage, @NotNull String titleImage, @NotNull TimerDTO timer, FooterDTO footerDTO, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(backgroundImage, "backgroundImage");
        Intrinsics.checkNotNullParameter(titleImage, "titleImage");
        Intrinsics.checkNotNullParameter(timer, "timer");
        this.backgroundImage = backgroundImage;
        this.titleImage = titleImage;
        this.timer = timer;
        this.footer = footerDTO;
        this.action = atomActionDTO;
        this.trackingInfo = map;
    }

    public static /* synthetic */ BlackFridayCounterDTO copy$default(BlackFridayCounterDTO blackFridayCounterDTO, String str, String str2, TimerDTO timerDTO, FooterDTO footerDTO, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = blackFridayCounterDTO.backgroundImage;
        }
        if ((i11 & 2) != 0) {
            str2 = blackFridayCounterDTO.titleImage;
        }
        if ((i11 & 4) != 0) {
            timerDTO = blackFridayCounterDTO.timer;
        }
        if ((i11 & 8) != 0) {
            footerDTO = blackFridayCounterDTO.footer;
        }
        if ((i11 & 16) != 0) {
            atomActionDTO = blackFridayCounterDTO.action;
        }
        if ((i11 & 32) != 0) {
            map = blackFridayCounterDTO.trackingInfo;
        }
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        Map map2 = map;
        return blackFridayCounterDTO.copy(str, str2, timerDTO, footerDTO, atomActionDTO2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTitleImage() {
        return this.titleImage;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final TimerDTO getTimer() {
        return this.timer;
    }

    /* renamed from: component4, reason: from getter */
    public final FooterDTO getFooter() {
        return this.footer;
    }

    /* renamed from: component5, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    @NotNull
    public final BlackFridayCounterDTO copy(@NotNull String backgroundImage, @NotNull String titleImage, @NotNull TimerDTO timer, FooterDTO footer, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(backgroundImage, "backgroundImage");
        Intrinsics.checkNotNullParameter(titleImage, "titleImage");
        Intrinsics.checkNotNullParameter(timer, "timer");
        return new BlackFridayCounterDTO(backgroundImage, titleImage, timer, footer, action, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlackFridayCounterDTO)) {
            return false;
        }
        BlackFridayCounterDTO blackFridayCounterDTO = (BlackFridayCounterDTO) other;
        return Intrinsics.d(this.backgroundImage, blackFridayCounterDTO.backgroundImage) && Intrinsics.d(this.titleImage, blackFridayCounterDTO.titleImage) && Intrinsics.d(this.timer, blackFridayCounterDTO.timer) && Intrinsics.d(this.footer, blackFridayCounterDTO.footer) && Intrinsics.d(this.action, blackFridayCounterDTO.action) && Intrinsics.d(this.trackingInfo, blackFridayCounterDTO.trackingInfo);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    public final FooterDTO getFooter() {
        return this.footer;
    }

    @NotNull
    public final TimerDTO getTimer() {
        return this.timer;
    }

    @NotNull
    public final String getTitleImage() {
        return this.titleImage;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = (this.timer.hashCode() + g.a(this.backgroundImage.hashCode() * 31, 31, this.titleImage)) * 31;
        FooterDTO footerDTO = this.footer;
        int hashCode2 = (hashCode + (footerDTO == null ? 0 : footerDTO.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.backgroundImage;
        String str2 = this.titleImage;
        TimerDTO timerDTO = this.timer;
        FooterDTO footerDTO = this.footer;
        AtomActionDTO atomActionDTO = this.action;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder d11 = C3660k.d("BlackFridayCounterDTO(backgroundImage=", str, ", titleImage=", str2, ", timer=");
        d11.append(timerDTO);
        d11.append(", footer=");
        d11.append(footerDTO);
        d11.append(", action=");
        return D40.a.d(d11, atomActionDTO, ", trackingInfo=", map, ")");
    }
}
