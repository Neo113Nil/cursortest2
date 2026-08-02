package ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation;

import Ak.C2436a;
import Ak.b;
import G.g;
import I1.w;
import N3.C3660k;
import Nh.a;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0080\b\u0018\u0000 /2\u00060\u0001j\u0002`\u0002:\u0002/0BK\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\u000e\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b+\u0010*R\u001f\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010,\u001a\u0004\b-\u0010.¨\u00061"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/ParticipantPhoneVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "backgroundColor", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/ParticipantPhoneVO$PhoneInputVO;", "phoneInput", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "phoneCell", "contactCell", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLjava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/ParticipantPhoneVO$PhoneInputVO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/ParticipantPhoneVO$PhoneInputVO;", "getPhoneInput", "()Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/ParticipantPhoneVO$PhoneInputVO;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getPhoneCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getContactCell", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Companion", "PhoneInputVO", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ParticipantPhoneVO implements c {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final CellDTO defaultContactCell;

    @NotNull
    private final String backgroundColor;

    @NotNull
    private final CellDTO contactCell;
    private final long id;
    private final CellDTO phoneCell;

    @NotNull
    private final PhoneInputVO phoneInput;

    @NotNull
    private final TextDTO title;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/ParticipantPhoneVO$Companion;", "", "<init>", "()V", "CONTACT_DEFAULT_TITLE_TEXT", "", "CONTACT_DEFAULT_TITLE_TEXT_COLOR", "CONTACT_DEFAULT_TITLE_TYPOGRAPHY_TOKEN", "CONTACT_DEFAULT_SUBTITLE_TEXT", "CONTACT_DEFAULT_SUBTITLE_TEXT_COLOR", "CONTACT_DEFAULT_SUBTITLE_TYPOGRAPHY_TOKEN", "CONTACT_DEFAULT_ICON_TEXT", "CONTACT_DEFAULT_ICON_BG_COLOR", "CONTACT_DEFAULT_ICON_TEXT_COLOR", "CONTACT_DEFAULT_ICON_TEXT_STYLE", "defaultContactCell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getDefaultContactCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CellDTO getDefaultContactCell() {
            return ParticipantPhoneVO.defaultContactCell;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001a\u0010\u000fR\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u001e\u0010\u000fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u001f\u0010\u000fR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/ParticipantPhoneVO$PhoneInputVO;", "", "", "label", "countryFlagUrl", "countryCode", "", "additionalCountryCodes", "phoneMask", "errorMessage", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "common", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLabel", "getCountryFlagUrl", "getCountryCode", "Ljava/util/List;", "getAdditionalCountryCodes", "()Ljava/util/List;", "getPhoneMask", "getErrorMessage", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PhoneInputVO {
        private final List<String> additionalCountryCodes;

        @NotNull
        private final CommonControlSettings common;

        @NotNull
        private final String countryCode;

        @NotNull
        private final String countryFlagUrl;
        private final String errorMessage;

        @NotNull
        private final String label;

        @NotNull
        private final String phoneMask;

        public PhoneInputVO(@NotNull String label, @NotNull String countryFlagUrl, @NotNull String countryCode, List<String> list, @NotNull String phoneMask, String str, @NotNull CommonControlSettings common) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(countryFlagUrl, "countryFlagUrl");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            Intrinsics.checkNotNullParameter(phoneMask, "phoneMask");
            Intrinsics.checkNotNullParameter(common, "common");
            this.label = label;
            this.countryFlagUrl = countryFlagUrl;
            this.countryCode = countryCode;
            this.additionalCountryCodes = list;
            this.phoneMask = phoneMask;
            this.errorMessage = str;
            this.common = common;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PhoneInputVO)) {
                return false;
            }
            PhoneInputVO phoneInputVO = (PhoneInputVO) other;
            return Intrinsics.d(this.label, phoneInputVO.label) && Intrinsics.d(this.countryFlagUrl, phoneInputVO.countryFlagUrl) && Intrinsics.d(this.countryCode, phoneInputVO.countryCode) && Intrinsics.d(this.additionalCountryCodes, phoneInputVO.additionalCountryCodes) && Intrinsics.d(this.phoneMask, phoneInputVO.phoneMask) && Intrinsics.d(this.errorMessage, phoneInputVO.errorMessage) && Intrinsics.d(this.common, phoneInputVO.common);
        }

        public final List<String> getAdditionalCountryCodes() {
            return this.additionalCountryCodes;
        }

        @NotNull
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        public final String getCountryCode() {
            return this.countryCode;
        }

        @NotNull
        public final String getCountryFlagUrl() {
            return this.countryFlagUrl;
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }

        @NotNull
        public final String getLabel() {
            return this.label;
        }

        @NotNull
        public final String getPhoneMask() {
            return this.phoneMask;
        }

        public int hashCode() {
            int a11 = g.a(g.a(this.label.hashCode() * 31, 31, this.countryFlagUrl), 31, this.countryCode);
            List<String> list = this.additionalCountryCodes;
            int a12 = g.a((a11 + (list == null ? 0 : list.hashCode())) * 31, 31, this.phoneMask);
            String str = this.errorMessage;
            return this.common.hashCode() + ((a12 + (str != null ? str.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            String str = this.label;
            String str2 = this.countryFlagUrl;
            String str3 = this.countryCode;
            List<String> list = this.additionalCountryCodes;
            String str4 = this.phoneMask;
            String str5 = this.errorMessage;
            CommonControlSettings commonControlSettings = this.common;
            StringBuilder d11 = C3660k.d("PhoneInputVO(label=", str, ", countryFlagUrl=", str2, ", countryCode=");
            w.d(str3, ", additionalCountryCodes=", ", phoneMask=", d11, list);
            a.h(d11, str4, ", errorMessage=", str5, ", common=");
            return b.g(d11, commonControlSettings, ")");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        CommonCellSettings.LayoutPadding layoutPadding = null;
        BadgeDTO badgeDTO = null;
        CommonAtomIconDTO commonAtomIconDTO = null;
        List list = null;
        CellDTO.CenterBlock centerBlock = new CellDTO.CenterBlock(new CellDTO.CellText(OzonSpannableStringKt.toOzonSpannableString("Имя Контакта"), "textPrimary", "tsCompact500Medium", false, null, null, 56, null), new CellDTO.CellText(OzonSpannableStringKt.toOzonSpannableString("+7 (000) 000-00-00"), "textSecondary", "tsBody400Small", false, 0 == true ? 1 : 0, null, 56, null), layoutPadding, badgeDTO, commonAtomIconDTO, list, 60, 0 == true ? 1 : 0);
        Object[] objArr = 0 == true ? 1 : 0;
        CommonCellSettings.LayoutPadding layoutPadding2 = null;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        CellDTO.LeftBlock leftBlock = new CellDTO.LeftBlock(null, CellDTO.BlockAlignment.ALIGNMENT_CENTER, objArr3, CommonCellSettings.LayoutPadding.PADDING_350, layoutPadding2, new IconDTO(IconDTO.IconSize.SIZE_400, objArr, IconDTO.IconShape.SQUIRCLE, "XX", null, null, "bgSecondary", "textTertiary", "tsBodyControll400Small", null, null, null, null, null, null, null, 65074, null), objArr2, null, 213, 0 == true ? 1 : 0);
        CommonCellSettings.LayoutPadding layoutPadding3 = CommonCellSettings.LayoutPadding.PADDING_300;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        Object[] objArr7 = 0 == true ? 1 : 0;
        defaultContactCell = new CellDTO(centerBlock, new CellDTO.Settings(layoutPadding3, layoutPadding3, null, layoutPadding2, Boolean.TRUE, objArr4, objArr7, null, objArr5, objArr6, null, 2028, null), leftBlock, null, 0 == true ? 1 : 0, 24, null);
    }

    public ParticipantPhoneVO(long j11, @NotNull String backgroundColor, @NotNull TextDTO title, @NotNull PhoneInputVO phoneInput, CellDTO cellDTO, @NotNull CellDTO contactCell, t tVar) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(phoneInput, "phoneInput");
        Intrinsics.checkNotNullParameter(contactCell, "contactCell");
        this.id = j11;
        this.backgroundColor = backgroundColor;
        this.title = title;
        this.phoneInput = phoneInput;
        this.phoneCell = cellDTO;
        this.contactCell = contactCell;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParticipantPhoneVO)) {
            return false;
        }
        ParticipantPhoneVO participantPhoneVO = (ParticipantPhoneVO) other;
        return this.id == participantPhoneVO.id && Intrinsics.d(this.backgroundColor, participantPhoneVO.backgroundColor) && Intrinsics.d(this.title, participantPhoneVO.title) && Intrinsics.d(this.phoneInput, participantPhoneVO.phoneInput) && Intrinsics.d(this.phoneCell, participantPhoneVO.phoneCell) && Intrinsics.d(this.contactCell, participantPhoneVO.contactCell) && Intrinsics.d(this.tokenizedEvent, participantPhoneVO.tokenizedEvent);
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final CellDTO getContactCell() {
        return this.contactCell;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final CellDTO getPhoneCell() {
        return this.phoneCell;
    }

    @NotNull
    public final PhoneInputVO getPhoneInput() {
        return this.phoneInput;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.phoneInput.hashCode() + Ns.b.a(this.title, g.a(Long.hashCode(this.id) * 31, 31, this.backgroundColor), 31)) * 31;
        CellDTO cellDTO = this.phoneCell;
        int c11 = Bi.b.c(this.contactCell, (hashCode + (cellDTO == null ? 0 : cellDTO.hashCode())) * 31, 31);
        t tVar = this.tokenizedEvent;
        return c11 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.backgroundColor;
        TextDTO textDTO = this.title;
        PhoneInputVO phoneInputVO = this.phoneInput;
        CellDTO cellDTO = this.phoneCell;
        CellDTO cellDTO2 = this.contactCell;
        t tVar = this.tokenizedEvent;
        StringBuilder c11 = C2436a.c(j11, "ParticipantPhoneVO(id=", ", backgroundColor=", str);
        c11.append(", title=");
        c11.append(textDTO);
        c11.append(", phoneInput=");
        c11.append(phoneInputVO);
        c11.append(", phoneCell=");
        c11.append(cellDTO);
        c11.append(", contactCell=");
        c11.append(cellDTO2);
        return Lh.a.b(c11, ", tokenizedEvent=", tVar, ")");
    }
}
