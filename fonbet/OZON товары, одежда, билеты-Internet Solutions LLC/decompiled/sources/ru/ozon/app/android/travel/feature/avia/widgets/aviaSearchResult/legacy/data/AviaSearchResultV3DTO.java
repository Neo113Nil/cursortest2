package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.data;

import B90.C2618u;
import B90.C2619v;
import Ih.a;
import K1.G;
import Kk.C3532b;
import Tl.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.data.v3.FlightV3DTO;
import ru.ozon.app.android.travel.molecules.dto.banner.BannerDTO;
import ru.ozon.app.android.travel.molecules.dto.dropDownBanner.DropDownBannerDTO;
import ru.ozon.app.android.travel.molecules.dto.errorState.ErrorStateDTO;
import ru.ozon.app.android.travel.molecules.dto.imageBanner.ImageBannerDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.collection.JsonCollectionDecoding;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\"\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u00015Bc\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\b\u0003\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010)\u001a\u00020\nHÆ\u0003J\t\u0010*\u001a\u00020\nHÆ\u0003J\t\u0010+\u001a\u00020\rHÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00010\u0010HÆ\u0003Jx\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u000e\b\u0003\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0010HÆ\u0001¢\u0006\u0002\u0010/J\u0013\u00100\u001a\u00020\r2\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u000203HÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001eR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u000e\u0010\u001fR\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u00066"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/AviaSearchResultV3DTO;", "", "timeoutDate", "", "timeoutMs", "", "timeoutMessage", "Lru/ozon/app/android/travel/molecules/dto/errorState/ErrorStateDTO;", "errorMessage", "pollingAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "lazyLoadAction", "isAllDone", "", "isBonusPay", "resultItems", "", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Lru/ozon/app/android/travel/molecules/dto/errorState/ErrorStateDTO;Lru/ozon/app/android/travel/molecules/dto/errorState/ErrorStateDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;ZLjava/lang/Boolean;Ljava/util/List;)V", "getTimeoutDate", "()Ljava/lang/String;", "getTimeoutMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTimeoutMessage", "()Lru/ozon/app/android/travel/molecules/dto/errorState/ErrorStateDTO;", "getErrorMessage", "getPollingAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getLazyLoadAction", "()Z", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getResultItems$annotations", "()V", "getResultItems", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Long;Lru/ozon/app/android/travel/molecules/dto/errorState/ErrorStateDTO;Lru/ozon/app/android/travel/molecules/dto/errorState/ErrorStateDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;ZLjava/lang/Boolean;Ljava/util/List;)Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/AviaSearchResultV3DTO;", "equals", "other", "hashCode", "", "toString", "BonusToggle", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AviaSearchResultV3DTO {
    public static final int $stable = 8;
    private final ErrorStateDTO errorMessage;
    private final boolean isAllDone;
    private final Boolean isBonusPay;

    @NotNull
    private final AtomActionDTO lazyLoadAction;

    @NotNull
    private final AtomActionDTO pollingAction;

    @NotNull
    private final List<Object> resultItems;
    private final String timeoutDate;
    private final ErrorStateDTO timeoutMessage;
    private final Long timeoutMs;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u0017\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0003J\u0017\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0003J\u0017\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000eHÆ\u0003J{\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006*"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/AviaSearchResultV3DTO$BonusToggle;", "", "icon", "Lru/ozon/uni/atoms/data/button/Icon;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subtitle", "viewTrackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "setTrackingInfo", "unsetTrackingInfo", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "getViewTrackingInfo", "()Ljava/util/Map;", "getSetTrackingInfo", "getUnsetTrackingInfo", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BonusToggle {
        public static final int $stable = 8;
        private final AtomActionDTO action;

        @NotNull
        private final Icon icon;
        private final Map<String, TokenizedTrackingInfo> setTrackingInfo;

        @NotNull
        private final TextAtom subtitle;

        @NotNull
        private final TextAtom title;
        private final Map<String, TokenizedTrackingInfo> unsetTrackingInfo;
        private final Map<String, TokenizedTrackingInfo> viewTrackingInfo;

        public BonusToggle(@NotNull Icon icon, @NotNull TextAtom title, @NotNull TextAtom subtitle, Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2, Map<String, TokenizedTrackingInfo> map3, AtomActionDTO atomActionDTO) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            this.icon = icon;
            this.title = title;
            this.subtitle = subtitle;
            this.viewTrackingInfo = map;
            this.setTrackingInfo = map2;
            this.unsetTrackingInfo = map3;
            this.action = atomActionDTO;
        }

        public static /* synthetic */ BonusToggle copy$default(BonusToggle bonusToggle, Icon icon, TextAtom textAtom, TextAtom textAtom2, Map map, Map map2, Map map3, AtomActionDTO atomActionDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                icon = bonusToggle.icon;
            }
            if ((i11 & 2) != 0) {
                textAtom = bonusToggle.title;
            }
            if ((i11 & 4) != 0) {
                textAtom2 = bonusToggle.subtitle;
            }
            if ((i11 & 8) != 0) {
                map = bonusToggle.viewTrackingInfo;
            }
            if ((i11 & 16) != 0) {
                map2 = bonusToggle.setTrackingInfo;
            }
            if ((i11 & 32) != 0) {
                map3 = bonusToggle.unsetTrackingInfo;
            }
            if ((i11 & 64) != 0) {
                atomActionDTO = bonusToggle.action;
            }
            Map map4 = map3;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            Map map5 = map2;
            TextAtom textAtom3 = textAtom2;
            return bonusToggle.copy(icon, textAtom, textAtom3, map, map5, map4, atomActionDTO2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Icon getIcon() {
            return this.icon;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextAtom getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final TextAtom getSubtitle() {
            return this.subtitle;
        }

        public final Map<String, TokenizedTrackingInfo> component4() {
            return this.viewTrackingInfo;
        }

        public final Map<String, TokenizedTrackingInfo> component5() {
            return this.setTrackingInfo;
        }

        public final Map<String, TokenizedTrackingInfo> component6() {
            return this.unsetTrackingInfo;
        }

        /* renamed from: component7, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final BonusToggle copy(@NotNull Icon icon, @NotNull TextAtom title, @NotNull TextAtom subtitle, Map<String, TokenizedTrackingInfo> viewTrackingInfo, Map<String, TokenizedTrackingInfo> setTrackingInfo, Map<String, TokenizedTrackingInfo> unsetTrackingInfo, AtomActionDTO action) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            return new BonusToggle(icon, title, subtitle, viewTrackingInfo, setTrackingInfo, unsetTrackingInfo, action);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BonusToggle)) {
                return false;
            }
            BonusToggle bonusToggle = (BonusToggle) other;
            return Intrinsics.d(this.icon, bonusToggle.icon) && Intrinsics.d(this.title, bonusToggle.title) && Intrinsics.d(this.subtitle, bonusToggle.subtitle) && Intrinsics.d(this.viewTrackingInfo, bonusToggle.viewTrackingInfo) && Intrinsics.d(this.setTrackingInfo, bonusToggle.setTrackingInfo) && Intrinsics.d(this.unsetTrackingInfo, bonusToggle.unsetTrackingInfo) && Intrinsics.d(this.action, bonusToggle.action);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final Icon getIcon() {
            return this.icon;
        }

        public final Map<String, TokenizedTrackingInfo> getSetTrackingInfo() {
            return this.setTrackingInfo;
        }

        @NotNull
        public final TextAtom getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getUnsetTrackingInfo() {
            return this.unsetTrackingInfo;
        }

        public final Map<String, TokenizedTrackingInfo> getViewTrackingInfo() {
            return this.viewTrackingInfo;
        }

        public int hashCode() {
            int b11 = C2619v.b(C2619v.b(this.icon.hashCode() * 31, 31, this.title), 31, this.subtitle);
            Map<String, TokenizedTrackingInfo> map = this.viewTrackingInfo;
            int hashCode = (b11 + (map == null ? 0 : map.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map2 = this.setTrackingInfo;
            int hashCode2 = (hashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map3 = this.unsetTrackingInfo;
            int hashCode3 = (hashCode2 + (map3 == null ? 0 : map3.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.action;
            return hashCode3 + (atomActionDTO != null ? atomActionDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Icon icon = this.icon;
            TextAtom textAtom = this.title;
            TextAtom textAtom2 = this.subtitle;
            Map<String, TokenizedTrackingInfo> map = this.viewTrackingInfo;
            Map<String, TokenizedTrackingInfo> map2 = this.setTrackingInfo;
            Map<String, TokenizedTrackingInfo> map3 = this.unsetTrackingInfo;
            AtomActionDTO atomActionDTO = this.action;
            StringBuilder sb2 = new StringBuilder("BonusToggle(icon=");
            sb2.append(icon);
            sb2.append(", title=");
            sb2.append(textAtom);
            sb2.append(", subtitle=");
            sb2.append(textAtom2);
            sb2.append(", viewTrackingInfo=");
            sb2.append(map);
            sb2.append(", setTrackingInfo=");
            b.g(sb2, map2, ", unsetTrackingInfo=", map3, ", action=");
            return G.c(sb2, atomActionDTO, ")");
        }
    }

    public AviaSearchResultV3DTO(String str, Long l11, ErrorStateDTO errorStateDTO, ErrorStateDTO errorStateDTO2, @NotNull AtomActionDTO pollingAction, @NotNull AtomActionDTO lazyLoadAction, boolean z11, Boolean bool, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "imageBanner", type = ImageBannerDTO.class), @ProtoOneOfSignature(name = "dropDownBanner", type = DropDownBannerDTO.class), @ProtoOneOfSignature(name = "flight", type = FlightV3DTO.class), @ProtoOneOfSignature(name = "bonusPaymentToggle", type = BonusToggle.class), @ProtoOneOfSignature(name = "banner", type = BannerDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> resultItems) {
        Intrinsics.checkNotNullParameter(pollingAction, "pollingAction");
        Intrinsics.checkNotNullParameter(lazyLoadAction, "lazyLoadAction");
        Intrinsics.checkNotNullParameter(resultItems, "resultItems");
        this.timeoutDate = str;
        this.timeoutMs = l11;
        this.timeoutMessage = errorStateDTO;
        this.errorMessage = errorStateDTO2;
        this.pollingAction = pollingAction;
        this.lazyLoadAction = lazyLoadAction;
        this.isAllDone = z11;
        this.isBonusPay = bool;
        this.resultItems = resultItems;
    }

    public static /* synthetic */ AviaSearchResultV3DTO copy$default(AviaSearchResultV3DTO aviaSearchResultV3DTO, String str, Long l11, ErrorStateDTO errorStateDTO, ErrorStateDTO errorStateDTO2, AtomActionDTO atomActionDTO, AtomActionDTO atomActionDTO2, boolean z11, Boolean bool, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = aviaSearchResultV3DTO.timeoutDate;
        }
        if ((i11 & 2) != 0) {
            l11 = aviaSearchResultV3DTO.timeoutMs;
        }
        if ((i11 & 4) != 0) {
            errorStateDTO = aviaSearchResultV3DTO.timeoutMessage;
        }
        if ((i11 & 8) != 0) {
            errorStateDTO2 = aviaSearchResultV3DTO.errorMessage;
        }
        if ((i11 & 16) != 0) {
            atomActionDTO = aviaSearchResultV3DTO.pollingAction;
        }
        if ((i11 & 32) != 0) {
            atomActionDTO2 = aviaSearchResultV3DTO.lazyLoadAction;
        }
        if ((i11 & 64) != 0) {
            z11 = aviaSearchResultV3DTO.isAllDone;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            bool = aviaSearchResultV3DTO.isBonusPay;
        }
        if ((i11 & 256) != 0) {
            list = aviaSearchResultV3DTO.resultItems;
        }
        Boolean bool2 = bool;
        List list2 = list;
        AtomActionDTO atomActionDTO3 = atomActionDTO2;
        boolean z12 = z11;
        AtomActionDTO atomActionDTO4 = atomActionDTO;
        ErrorStateDTO errorStateDTO3 = errorStateDTO;
        return aviaSearchResultV3DTO.copy(str, l11, errorStateDTO3, errorStateDTO2, atomActionDTO4, atomActionDTO3, z12, bool2, list2);
    }

    @JsonCollectionDecoding
    public static /* synthetic */ void getResultItems$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getTimeoutDate() {
        return this.timeoutDate;
    }

    /* renamed from: component2, reason: from getter */
    public final Long getTimeoutMs() {
        return this.timeoutMs;
    }

    /* renamed from: component3, reason: from getter */
    public final ErrorStateDTO getTimeoutMessage() {
        return this.timeoutMessage;
    }

    /* renamed from: component4, reason: from getter */
    public final ErrorStateDTO getErrorMessage() {
        return this.errorMessage;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final AtomActionDTO getPollingAction() {
        return this.pollingAction;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final AtomActionDTO getLazyLoadAction() {
        return this.lazyLoadAction;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsAllDone() {
        return this.isAllDone;
    }

    /* renamed from: component8, reason: from getter */
    public final Boolean getIsBonusPay() {
        return this.isBonusPay;
    }

    @NotNull
    public final List<Object> component9() {
        return this.resultItems;
    }

    @NotNull
    public final AviaSearchResultV3DTO copy(String timeoutDate, Long timeoutMs, ErrorStateDTO timeoutMessage, ErrorStateDTO errorMessage, @NotNull AtomActionDTO pollingAction, @NotNull AtomActionDTO lazyLoadAction, boolean isAllDone, Boolean isBonusPay, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "imageBanner", type = ImageBannerDTO.class), @ProtoOneOfSignature(name = "dropDownBanner", type = DropDownBannerDTO.class), @ProtoOneOfSignature(name = "flight", type = FlightV3DTO.class), @ProtoOneOfSignature(name = "bonusPaymentToggle", type = BonusToggle.class), @ProtoOneOfSignature(name = "banner", type = BannerDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> resultItems) {
        Intrinsics.checkNotNullParameter(pollingAction, "pollingAction");
        Intrinsics.checkNotNullParameter(lazyLoadAction, "lazyLoadAction");
        Intrinsics.checkNotNullParameter(resultItems, "resultItems");
        return new AviaSearchResultV3DTO(timeoutDate, timeoutMs, timeoutMessage, errorMessage, pollingAction, lazyLoadAction, isAllDone, isBonusPay, resultItems);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AviaSearchResultV3DTO)) {
            return false;
        }
        AviaSearchResultV3DTO aviaSearchResultV3DTO = (AviaSearchResultV3DTO) other;
        return Intrinsics.d(this.timeoutDate, aviaSearchResultV3DTO.timeoutDate) && Intrinsics.d(this.timeoutMs, aviaSearchResultV3DTO.timeoutMs) && Intrinsics.d(this.timeoutMessage, aviaSearchResultV3DTO.timeoutMessage) && Intrinsics.d(this.errorMessage, aviaSearchResultV3DTO.errorMessage) && Intrinsics.d(this.pollingAction, aviaSearchResultV3DTO.pollingAction) && Intrinsics.d(this.lazyLoadAction, aviaSearchResultV3DTO.lazyLoadAction) && this.isAllDone == aviaSearchResultV3DTO.isAllDone && Intrinsics.d(this.isBonusPay, aviaSearchResultV3DTO.isBonusPay) && Intrinsics.d(this.resultItems, aviaSearchResultV3DTO.resultItems);
    }

    public final ErrorStateDTO getErrorMessage() {
        return this.errorMessage;
    }

    @NotNull
    public final AtomActionDTO getLazyLoadAction() {
        return this.lazyLoadAction;
    }

    @NotNull
    public final AtomActionDTO getPollingAction() {
        return this.pollingAction;
    }

    @NotNull
    public final List<Object> getResultItems() {
        return this.resultItems;
    }

    public final String getTimeoutDate() {
        return this.timeoutDate;
    }

    public final ErrorStateDTO getTimeoutMessage() {
        return this.timeoutMessage;
    }

    public final Long getTimeoutMs() {
        return this.timeoutMs;
    }

    public int hashCode() {
        String str = this.timeoutDate;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l11 = this.timeoutMs;
        int hashCode2 = (hashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        ErrorStateDTO errorStateDTO = this.timeoutMessage;
        int hashCode3 = (hashCode2 + (errorStateDTO == null ? 0 : errorStateDTO.hashCode())) * 31;
        ErrorStateDTO errorStateDTO2 = this.errorMessage;
        int a11 = C3532b.a(a.b(this.lazyLoadAction, a.b(this.pollingAction, (hashCode3 + (errorStateDTO2 == null ? 0 : errorStateDTO2.hashCode())) * 31, 31), 31), 31, this.isAllDone);
        Boolean bool = this.isBonusPay;
        return this.resultItems.hashCode() + ((a11 + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    public final boolean isAllDone() {
        return this.isAllDone;
    }

    public final Boolean isBonusPay() {
        return this.isBonusPay;
    }

    @NotNull
    public String toString() {
        String str = this.timeoutDate;
        Long l11 = this.timeoutMs;
        ErrorStateDTO errorStateDTO = this.timeoutMessage;
        ErrorStateDTO errorStateDTO2 = this.errorMessage;
        AtomActionDTO atomActionDTO = this.pollingAction;
        AtomActionDTO atomActionDTO2 = this.lazyLoadAction;
        boolean z11 = this.isAllDone;
        Boolean bool = this.isBonusPay;
        List<Object> list = this.resultItems;
        StringBuilder sb2 = new StringBuilder("AviaSearchResultV3DTO(timeoutDate=");
        sb2.append(str);
        sb2.append(", timeoutMs=");
        sb2.append(l11);
        sb2.append(", timeoutMessage=");
        sb2.append(errorStateDTO);
        sb2.append(", errorMessage=");
        sb2.append(errorStateDTO2);
        sb2.append(", pollingAction=");
        sb2.append(atomActionDTO);
        sb2.append(", lazyLoadAction=");
        sb2.append(atomActionDTO2);
        sb2.append(", isAllDone=");
        sb2.append(z11);
        sb2.append(", isBonusPay=");
        sb2.append(bool);
        sb2.append(", resultItems=");
        return C2618u.h(sb2, list, ")");
    }

    public AviaSearchResultV3DTO(String str, Long l11, ErrorStateDTO errorStateDTO, ErrorStateDTO errorStateDTO2, AtomActionDTO atomActionDTO, AtomActionDTO atomActionDTO2, boolean z11, Boolean bool, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, l11, errorStateDTO, errorStateDTO2, atomActionDTO, atomActionDTO2, (i11 & 64) != 0 ? false : z11, bool, (i11 & 256) != 0 ? K.f71697a : list);
    }
}
