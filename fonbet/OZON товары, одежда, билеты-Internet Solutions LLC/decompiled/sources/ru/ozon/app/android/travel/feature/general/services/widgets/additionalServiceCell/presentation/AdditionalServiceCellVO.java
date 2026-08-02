package ru.ozon.app.android.travel.feature.general.services.widgets.additionalServiceCell.presentation;

import Ak.C2436a;
import F3.G;
import Kk.C3532b;
import Ns.b;
import Pk0.f;
import ed.InterfaceC6346b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.selectionControls.toggle.ToggleDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0004\u001f !\"B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ0\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServiceCell/presentation/AdditionalServiceCellVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "asyncData", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServiceCell/presentation/AdditionalServiceCellVO$Content;", "content", "<init>", "(JLjava/lang/String;Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServiceCell/presentation/AdditionalServiceCellVO$Content;)V", "copy", "(JLjava/lang/String;Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServiceCell/presentation/AdditionalServiceCellVO$Content;)Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServiceCell/presentation/AdditionalServiceCellVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getAsyncData", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServiceCell/presentation/AdditionalServiceCellVO$Content;", "getContent", "()Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServiceCell/presentation/AdditionalServiceCellVO$Content;", "Content", "CellControlVO", "CellToggleVO", "CellButtonVO", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AdditionalServiceCellVO implements c {
    private final String asyncData;

    @NotNull
    private final Content content;
    private final long id;

    @InterfaceC6346b
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0013\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServiceCell/presentation/AdditionalServiceCellVO$CellButtonVO;", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServiceCell/presentation/AdditionalServiceCellVO$CellControlVO;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "constructor-impl", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "", "toString-impl", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)I", "hashCode", "", "other", "", "equals-impl", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/lang/Object;)Z", "equals", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CellButtonVO implements CellControlVO {

        @NotNull
        private final ButtonV3DTO button;

        private /* synthetic */ CellButtonVO(ButtonV3DTO buttonV3DTO) {
            this.button = buttonV3DTO;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ CellButtonVO m1312boximpl(ButtonV3DTO buttonV3DTO) {
            return new CellButtonVO(buttonV3DTO);
        }

        @NotNull
        /* renamed from: constructor-impl, reason: not valid java name */
        public static ButtonV3DTO m1313constructorimpl(@NotNull ButtonV3DTO button) {
            Intrinsics.checkNotNullParameter(button, "button");
            return button;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m1314equalsimpl(ButtonV3DTO buttonV3DTO, Object obj) {
            return (obj instanceof CellButtonVO) && Intrinsics.d(buttonV3DTO, ((CellButtonVO) obj).getButton());
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m1315hashCodeimpl(ButtonV3DTO buttonV3DTO) {
            return buttonV3DTO.hashCode();
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m1316toStringimpl(ButtonV3DTO buttonV3DTO) {
            return G.b(buttonV3DTO, "CellButtonVO(button=", ")");
        }

        public boolean equals(Object obj) {
            return m1314equalsimpl(this.button, obj);
        }

        public int hashCode() {
            return m1315hashCodeimpl(this.button);
        }

        public String toString() {
            return m1316toStringimpl(this.button);
        }

        /* renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ ButtonV3DTO getButton() {
            return this.button;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServiceCell/presentation/AdditionalServiceCellVO$CellControlVO;", "", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServiceCell/presentation/AdditionalServiceCellVO$CellButtonVO;", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServiceCell/presentation/AdditionalServiceCellVO$CellToggleVO;", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface CellControlVO {
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServiceCell/presentation/AdditionalServiceCellVO$CellToggleVO;", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServiceCell/presentation/AdditionalServiceCellVO$CellControlVO;", "Lru/ozon/uni/atoms/data/selectionControls/toggle/ToggleDTO;", "toggle", "Lru/ozon/uni/atoms/af/AtomAction;", "switchAction", "<init>", "(Lru/ozon/uni/atoms/data/selectionControls/toggle/ToggleDTO;Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/selectionControls/toggle/ToggleDTO;", "getToggle", "()Lru/ozon/uni/atoms/data/selectionControls/toggle/ToggleDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getSwitchAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CellToggleVO implements CellControlVO {
        public static final int $stable = AtomAction.$stable | ToggleDTO.$stable;
        private final AtomAction switchAction;

        @NotNull
        private final ToggleDTO toggle;

        public CellToggleVO(@NotNull ToggleDTO toggle, AtomAction atomAction) {
            Intrinsics.checkNotNullParameter(toggle, "toggle");
            this.toggle = toggle;
            this.switchAction = atomAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CellToggleVO)) {
                return false;
            }
            CellToggleVO cellToggleVO = (CellToggleVO) other;
            return Intrinsics.d(this.toggle, cellToggleVO.toggle) && Intrinsics.d(this.switchAction, cellToggleVO.switchAction);
        }

        public final AtomAction getSwitchAction() {
            return this.switchAction;
        }

        @NotNull
        public final ToggleDTO getToggle() {
            return this.toggle;
        }

        public int hashCode() {
            int hashCode = this.toggle.hashCode() * 31;
            AtomAction atomAction = this.switchAction;
            return hashCode + (atomAction == null ? 0 : atomAction.hashCode());
        }

        @NotNull
        public String toString() {
            return "CellToggleVO(toggle=" + this.toggle + ", switchAction=" + this.switchAction + ")";
        }
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0011\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\r2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b(\u0010'R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00102\u001a\u0004\b\u000e\u00103R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000f\u00102\u001a\u0004\b4\u00103R\u0017\u0010\u0010\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0010\u00102\u001a\u0004\b5\u00103R%\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u00106\u001a\u0004\b7\u00108R%\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0015\u00106\u001a\u0004\b9\u00108R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010:\u001a\u0004\b;\u0010<¨\u0006="}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServiceCell/presentation/AdditionalServiceCellVO$Content;", "", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "discountBadge", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "subtitlePrice", "Lru/ozon/uni/atoms/af/AtomAction;", "cardClickAction", "", "isSeparatorVisible", "fetchState", "showSkeleton", "", "", "asyncParams", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "viewTrackingInfo", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServiceCell/presentation/AdditionalServiceCellVO$CellControlVO;", "cellControl", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/af/AtomAction;ZZZLjava/util/Map;Ljava/util/Map;Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServiceCell/presentation/AdditionalServiceCellVO$CellControlVO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getDiscountBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getSubtitlePrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getCardClickAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Z", "()Z", "getFetchState", "getShowSkeleton", "Ljava/util/Map;", "getAsyncParams", "()Ljava/util/Map;", "getViewTrackingInfo", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServiceCell/presentation/AdditionalServiceCellVO$CellControlVO;", "getCellControl", "()Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServiceCell/presentation/AdditionalServiceCellVO$CellControlVO;", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Content {
        private final Map<String, String> asyncParams;
        private final AtomAction cardClickAction;
        private final CellControlVO cellControl;
        private final BadgeDTO discountBadge;
        private final boolean fetchState;

        @NotNull
        private final IconDTO icon;
        private final boolean isSeparatorVisible;
        private final boolean showSkeleton;
        private final TextDTO subtitle;
        private final PriceDTO subtitlePrice;

        @NotNull
        private final TextDTO title;
        private final Map<String, TokenizedTrackingInfo> viewTrackingInfo;

        public Content(@NotNull IconDTO icon, @NotNull TextDTO title, TextDTO textDTO, BadgeDTO badgeDTO, PriceDTO priceDTO, AtomAction atomAction, boolean z11, boolean z12, boolean z13, Map<String, String> map, Map<String, TokenizedTrackingInfo> map2, CellControlVO cellControlVO) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(title, "title");
            this.icon = icon;
            this.title = title;
            this.subtitle = textDTO;
            this.discountBadge = badgeDTO;
            this.subtitlePrice = priceDTO;
            this.cardClickAction = atomAction;
            this.isSeparatorVisible = z11;
            this.fetchState = z12;
            this.showSkeleton = z13;
            this.asyncParams = map;
            this.viewTrackingInfo = map2;
            this.cellControl = cellControlVO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Content)) {
                return false;
            }
            Content content = (Content) other;
            return Intrinsics.d(this.icon, content.icon) && Intrinsics.d(this.title, content.title) && Intrinsics.d(this.subtitle, content.subtitle) && Intrinsics.d(this.discountBadge, content.discountBadge) && Intrinsics.d(this.subtitlePrice, content.subtitlePrice) && Intrinsics.d(this.cardClickAction, content.cardClickAction) && this.isSeparatorVisible == content.isSeparatorVisible && this.fetchState == content.fetchState && this.showSkeleton == content.showSkeleton && Intrinsics.d(this.asyncParams, content.asyncParams) && Intrinsics.d(this.viewTrackingInfo, content.viewTrackingInfo) && Intrinsics.d(this.cellControl, content.cellControl);
        }

        public final Map<String, String> getAsyncParams() {
            return this.asyncParams;
        }

        public final AtomAction getCardClickAction() {
            return this.cardClickAction;
        }

        public final CellControlVO getCellControl() {
            return this.cellControl;
        }

        public final BadgeDTO getDiscountBadge() {
            return this.discountBadge;
        }

        public final boolean getFetchState() {
            return this.fetchState;
        }

        @NotNull
        public final IconDTO getIcon() {
            return this.icon;
        }

        public final boolean getShowSkeleton() {
            return this.showSkeleton;
        }

        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        public final PriceDTO getSubtitlePrice() {
            return this.subtitlePrice;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getViewTrackingInfo() {
            return this.viewTrackingInfo;
        }

        public int hashCode() {
            int a11 = b.a(this.title, this.icon.hashCode() * 31, 31);
            TextDTO textDTO = this.subtitle;
            int hashCode = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            BadgeDTO badgeDTO = this.discountBadge;
            int hashCode2 = (hashCode + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
            PriceDTO priceDTO = this.subtitlePrice;
            int hashCode3 = (hashCode2 + (priceDTO == null ? 0 : priceDTO.hashCode())) * 31;
            AtomAction atomAction = this.cardClickAction;
            int a12 = C3532b.a(C3532b.a(C3532b.a((hashCode3 + (atomAction == null ? 0 : atomAction.hashCode())) * 31, 31, this.isSeparatorVisible), 31, this.fetchState), 31, this.showSkeleton);
            Map<String, String> map = this.asyncParams;
            int hashCode4 = (a12 + (map == null ? 0 : map.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map2 = this.viewTrackingInfo;
            int hashCode5 = (hashCode4 + (map2 == null ? 0 : map2.hashCode())) * 31;
            CellControlVO cellControlVO = this.cellControl;
            return hashCode5 + (cellControlVO != null ? cellControlVO.hashCode() : 0);
        }

        /* renamed from: isSeparatorVisible, reason: from getter */
        public final boolean getIsSeparatorVisible() {
            return this.isSeparatorVisible;
        }

        @NotNull
        public String toString() {
            IconDTO iconDTO = this.icon;
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            BadgeDTO badgeDTO = this.discountBadge;
            PriceDTO priceDTO = this.subtitlePrice;
            AtomAction atomAction = this.cardClickAction;
            boolean z11 = this.isSeparatorVisible;
            boolean z12 = this.fetchState;
            boolean z13 = this.showSkeleton;
            Map<String, String> map = this.asyncParams;
            Map<String, TokenizedTrackingInfo> map2 = this.viewTrackingInfo;
            CellControlVO cellControlVO = this.cellControl;
            StringBuilder i11 = Bi.b.i("Content(icon=", ", title=", ", subtitle=", iconDTO, textDTO);
            i11.append(textDTO2);
            i11.append(", discountBadge=");
            i11.append(badgeDTO);
            i11.append(", subtitlePrice=");
            i11.append(priceDTO);
            i11.append(", cardClickAction=");
            i11.append(atomAction);
            i11.append(", isSeparatorVisible=");
            f.c(", fetchState=", ", showSkeleton=", i11, z11, z12);
            i11.append(z13);
            i11.append(", asyncParams=");
            i11.append(map);
            i11.append(", viewTrackingInfo=");
            i11.append(map2);
            i11.append(", cellControl=");
            i11.append(cellControlVO);
            i11.append(")");
            return i11.toString();
        }
    }

    public AdditionalServiceCellVO(long j11, String str, @NotNull Content content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.id = j11;
        this.asyncData = str;
        this.content = content;
    }

    public static /* synthetic */ AdditionalServiceCellVO copy$default(AdditionalServiceCellVO additionalServiceCellVO, long j11, String str, Content content, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = additionalServiceCellVO.id;
        }
        if ((i11 & 2) != 0) {
            str = additionalServiceCellVO.asyncData;
        }
        if ((i11 & 4) != 0) {
            content = additionalServiceCellVO.content;
        }
        return additionalServiceCellVO.copy(j11, str, content);
    }

    @NotNull
    public final AdditionalServiceCellVO copy(long id2, String asyncData, @NotNull Content content) {
        Intrinsics.checkNotNullParameter(content, "content");
        return new AdditionalServiceCellVO(id2, asyncData, content);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdditionalServiceCellVO)) {
            return false;
        }
        AdditionalServiceCellVO additionalServiceCellVO = (AdditionalServiceCellVO) other;
        return this.id == additionalServiceCellVO.id && Intrinsics.d(this.asyncData, additionalServiceCellVO.asyncData) && Intrinsics.d(this.content, additionalServiceCellVO.content);
    }

    public final String getAsyncData() {
        return this.asyncData;
    }

    @NotNull
    public final Content getContent() {
        return this.content;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        String str = this.asyncData;
        return this.content.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.asyncData;
        Content content = this.content;
        StringBuilder c11 = C2436a.c(j11, "AdditionalServiceCellVO(id=", ", asyncData=", str);
        c11.append(", content=");
        c11.append(content);
        c11.append(")");
        return c11.toString();
    }
}
