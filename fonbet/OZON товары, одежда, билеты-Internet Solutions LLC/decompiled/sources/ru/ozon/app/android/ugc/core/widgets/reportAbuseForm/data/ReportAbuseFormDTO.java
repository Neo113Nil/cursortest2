package ru.ozon.app.android.ugc.core.widgets.reportAbuseForm.data;

import Cm.e;
import G.g;
import Ns.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.cell.RadioTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.button.ButtonDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010$\u001a\u00020\tHÆ\u0003J\t\u0010%\u001a\u00020\u000bHÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u0010'\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0010HÆ\u0003Jj\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020\r2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\f\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00060"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reportAbuseForm/data/ReportAbuseFormDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "abuseReasons", "", "Lru/ozon/uni/atoms/data/cell/RadioTitleSubtitleCellDTO;", "inputTextPlaceholder", "", "complainButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;", "isHideInput", "", "backgroundColor", "cornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;Ljava/lang/Boolean;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getAbuseReasons", "()Ljava/util/List;", "getInputTextPlaceholder", "()Ljava/lang/String;", "getComplainButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBackgroundColor", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;Ljava/lang/Boolean;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;)Lru/ozon/app/android/ugc/core/widgets/reportAbuseForm/data/ReportAbuseFormDTO;", "equals", "other", "hashCode", "", "toString", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ReportAbuseFormDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<RadioTitleSubtitleCellDTO> abuseReasons;
    private final String backgroundColor;

    @NotNull
    private final ButtonDTO complainButton;
    private final CornerRadius cornerRadius;

    @NotNull
    private final String inputTextPlaceholder;
    private final Boolean isHideInput;

    @NotNull
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;

    public ReportAbuseFormDTO(@NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull List<RadioTitleSubtitleCellDTO> abuseReasons, @NotNull String inputTextPlaceholder, @NotNull ButtonDTO complainButton, Boolean bool, String str, CornerRadius cornerRadius) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(abuseReasons, "abuseReasons");
        Intrinsics.checkNotNullParameter(inputTextPlaceholder, "inputTextPlaceholder");
        Intrinsics.checkNotNullParameter(complainButton, "complainButton");
        this.title = title;
        this.subtitle = subtitle;
        this.abuseReasons = abuseReasons;
        this.inputTextPlaceholder = inputTextPlaceholder;
        this.complainButton = complainButton;
        this.isHideInput = bool;
        this.backgroundColor = str;
        this.cornerRadius = cornerRadius;
    }

    public static /* synthetic */ ReportAbuseFormDTO copy$default(ReportAbuseFormDTO reportAbuseFormDTO, TextDTO textDTO, TextDTO textDTO2, List list, String str, ButtonDTO buttonDTO, Boolean bool, String str2, CornerRadius cornerRadius, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = reportAbuseFormDTO.title;
        }
        if ((i11 & 2) != 0) {
            textDTO2 = reportAbuseFormDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            list = reportAbuseFormDTO.abuseReasons;
        }
        if ((i11 & 8) != 0) {
            str = reportAbuseFormDTO.inputTextPlaceholder;
        }
        if ((i11 & 16) != 0) {
            buttonDTO = reportAbuseFormDTO.complainButton;
        }
        if ((i11 & 32) != 0) {
            bool = reportAbuseFormDTO.isHideInput;
        }
        if ((i11 & 64) != 0) {
            str2 = reportAbuseFormDTO.backgroundColor;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            cornerRadius = reportAbuseFormDTO.cornerRadius;
        }
        String str3 = str2;
        CornerRadius cornerRadius2 = cornerRadius;
        ButtonDTO buttonDTO2 = buttonDTO;
        Boolean bool2 = bool;
        return reportAbuseFormDTO.copy(textDTO, textDTO2, list, str, buttonDTO2, bool2, str3, cornerRadius2);
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
    public final List<RadioTitleSubtitleCellDTO> component3() {
        return this.abuseReasons;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getInputTextPlaceholder() {
        return this.inputTextPlaceholder;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final ButtonDTO getComplainButton() {
        return this.complainButton;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getIsHideInput() {
        return this.isHideInput;
    }

    /* renamed from: component7, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component8, reason: from getter */
    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    @NotNull
    public final ReportAbuseFormDTO copy(@NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull List<RadioTitleSubtitleCellDTO> abuseReasons, @NotNull String inputTextPlaceholder, @NotNull ButtonDTO complainButton, Boolean isHideInput, String backgroundColor, CornerRadius cornerRadius) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(abuseReasons, "abuseReasons");
        Intrinsics.checkNotNullParameter(inputTextPlaceholder, "inputTextPlaceholder");
        Intrinsics.checkNotNullParameter(complainButton, "complainButton");
        return new ReportAbuseFormDTO(title, subtitle, abuseReasons, inputTextPlaceholder, complainButton, isHideInput, backgroundColor, cornerRadius);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReportAbuseFormDTO)) {
            return false;
        }
        ReportAbuseFormDTO reportAbuseFormDTO = (ReportAbuseFormDTO) other;
        return Intrinsics.d(this.title, reportAbuseFormDTO.title) && Intrinsics.d(this.subtitle, reportAbuseFormDTO.subtitle) && Intrinsics.d(this.abuseReasons, reportAbuseFormDTO.abuseReasons) && Intrinsics.d(this.inputTextPlaceholder, reportAbuseFormDTO.inputTextPlaceholder) && Intrinsics.d(this.complainButton, reportAbuseFormDTO.complainButton) && Intrinsics.d(this.isHideInput, reportAbuseFormDTO.isHideInput) && Intrinsics.d(this.backgroundColor, reportAbuseFormDTO.backgroundColor) && this.cornerRadius == reportAbuseFormDTO.cornerRadius;
    }

    @NotNull
    public final List<RadioTitleSubtitleCellDTO> getAbuseReasons() {
        return this.abuseReasons;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final ButtonDTO getComplainButton() {
        return this.complainButton;
    }

    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    @NotNull
    public final String getInputTextPlaceholder() {
        return this.inputTextPlaceholder;
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
        int hashCode = (this.complainButton.hashCode() + g.a(g.b(b.a(this.subtitle, this.title.hashCode() * 31, 31), 31, this.abuseReasons), 31, this.inputTextPlaceholder)) * 31;
        Boolean bool = this.isHideInput;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        CornerRadius cornerRadius = this.cornerRadius;
        return hashCode3 + (cornerRadius != null ? cornerRadius.hashCode() : 0);
    }

    public final Boolean isHideInput() {
        return this.isHideInput;
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        List<RadioTitleSubtitleCellDTO> list = this.abuseReasons;
        String str = this.inputTextPlaceholder;
        ButtonDTO buttonDTO = this.complainButton;
        Boolean bool = this.isHideInput;
        String str2 = this.backgroundColor;
        CornerRadius cornerRadius = this.cornerRadius;
        StringBuilder g10 = D3.g.g("ReportAbuseFormDTO(title=", textDTO, ", subtitle=", textDTO2, ", abuseReasons=");
        e.i(", inputTextPlaceholder=", str, ", complainButton=", g10, list);
        g10.append(buttonDTO);
        g10.append(", isHideInput=");
        g10.append(bool);
        g10.append(", backgroundColor=");
        g10.append(str2);
        g10.append(", cornerRadius=");
        g10.append(cornerRadius);
        g10.append(")");
        return g10.toString();
    }
}
