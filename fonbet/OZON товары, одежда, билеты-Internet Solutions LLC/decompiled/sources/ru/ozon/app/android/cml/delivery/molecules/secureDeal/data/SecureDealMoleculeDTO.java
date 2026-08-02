package ru.ozon.app.android.cml.delivery.molecules.secureDeal.data;

import Bi.a;
import GR.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.selectionControls.toggle.ToggleDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\t\u0010*\u001a\u00020\fHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0081\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u000206HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010!¨\u00067"}, d2 = {"Lru/ozon/app/android/cml/delivery/molecules/secureDeal/data/SecureDealMoleculeDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "toggle", "Lru/ozon/uni/atoms/data/selectionControls/toggle/ToggleDTO;", "titleIconButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "subtitle", "", "bottomBlock", "commonControlSettings", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "topMargin", "Lru/ozon/uni/atoms/data/common/Paddings;", "bottomMargin", "leftMargin", "rightMargin", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/selectionControls/toggle/ToggleDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Ljava/util/List;Ljava/lang/Object;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getToggle", "()Lru/ozon/uni/atoms/data/selectionControls/toggle/ToggleDTO;", "getTitleIconButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getSubtitle", "()Ljava/util/List;", "getBottomBlock", "()Ljava/lang/Object;", "getCommonControlSettings", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getTopMargin", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getBottomMargin", "getLeftMargin", "getRightMargin", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "", "toString", "", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SecureDealMoleculeDTO {
    private final Object bottomBlock;

    @EnumNullFallback
    private final Paddings bottomMargin;

    @NotNull
    private final CommonControlSettings commonControlSettings;

    @EnumNullFallback
    private final Paddings leftMargin;

    @EnumNullFallback
    private final Paddings rightMargin;
    private final List<TextDTO> subtitle;

    @NotNull
    private final TextDTO title;
    private final IconButtonV3DTO titleIconButton;

    @NotNull
    private final ToggleDTO toggle;

    @EnumNullFallback
    private final Paddings topMargin;

    public SecureDealMoleculeDTO(@NotNull TextDTO title, @NotNull ToggleDTO toggle, IconButtonV3DTO iconButtonV3DTO, List<TextDTO> list, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "cell", type = CellDTO.class), @ProtoOneOfSignature(name = "disclaimer", type = DisclaimerDTO.class)}) @ProtoOneOf(label = "type") Object obj, @NotNull CommonControlSettings commonControlSettings, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(toggle, "toggle");
        Intrinsics.checkNotNullParameter(commonControlSettings, "commonControlSettings");
        this.title = title;
        this.toggle = toggle;
        this.titleIconButton = iconButtonV3DTO;
        this.subtitle = list;
        this.bottomBlock = obj;
        this.commonControlSettings = commonControlSettings;
        this.topMargin = paddings;
        this.bottomMargin = paddings2;
        this.leftMargin = paddings3;
        this.rightMargin = paddings4;
    }

    public static /* synthetic */ SecureDealMoleculeDTO copy$default(SecureDealMoleculeDTO secureDealMoleculeDTO, TextDTO textDTO, ToggleDTO toggleDTO, IconButtonV3DTO iconButtonV3DTO, List list, Object obj, CommonControlSettings commonControlSettings, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            textDTO = secureDealMoleculeDTO.title;
        }
        if ((i11 & 2) != 0) {
            toggleDTO = secureDealMoleculeDTO.toggle;
        }
        if ((i11 & 4) != 0) {
            iconButtonV3DTO = secureDealMoleculeDTO.titleIconButton;
        }
        if ((i11 & 8) != 0) {
            list = secureDealMoleculeDTO.subtitle;
        }
        if ((i11 & 16) != 0) {
            obj = secureDealMoleculeDTO.bottomBlock;
        }
        if ((i11 & 32) != 0) {
            commonControlSettings = secureDealMoleculeDTO.commonControlSettings;
        }
        if ((i11 & 64) != 0) {
            paddings = secureDealMoleculeDTO.topMargin;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            paddings2 = secureDealMoleculeDTO.bottomMargin;
        }
        if ((i11 & 256) != 0) {
            paddings3 = secureDealMoleculeDTO.leftMargin;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            paddings4 = secureDealMoleculeDTO.rightMargin;
        }
        Paddings paddings5 = paddings3;
        Paddings paddings6 = paddings4;
        Paddings paddings7 = paddings;
        Paddings paddings8 = paddings2;
        Object obj3 = obj;
        CommonControlSettings commonControlSettings2 = commonControlSettings;
        return secureDealMoleculeDTO.copy(textDTO, toggleDTO, iconButtonV3DTO, list, obj3, commonControlSettings2, paddings7, paddings8, paddings5, paddings6);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component10, reason: from getter */
    public final Paddings getRightMargin() {
        return this.rightMargin;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ToggleDTO getToggle() {
        return this.toggle;
    }

    /* renamed from: component3, reason: from getter */
    public final IconButtonV3DTO getTitleIconButton() {
        return this.titleIconButton;
    }

    public final List<TextDTO> component4() {
        return this.subtitle;
    }

    /* renamed from: component5, reason: from getter */
    public final Object getBottomBlock() {
        return this.bottomBlock;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final CommonControlSettings getCommonControlSettings() {
        return this.commonControlSettings;
    }

    /* renamed from: component7, reason: from getter */
    public final Paddings getTopMargin() {
        return this.topMargin;
    }

    /* renamed from: component8, reason: from getter */
    public final Paddings getBottomMargin() {
        return this.bottomMargin;
    }

    /* renamed from: component9, reason: from getter */
    public final Paddings getLeftMargin() {
        return this.leftMargin;
    }

    @NotNull
    public final SecureDealMoleculeDTO copy(@NotNull TextDTO title, @NotNull ToggleDTO toggle, IconButtonV3DTO titleIconButton, List<TextDTO> subtitle, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "cell", type = CellDTO.class), @ProtoOneOfSignature(name = "disclaimer", type = DisclaimerDTO.class)}) @ProtoOneOf(label = "type") Object bottomBlock, @NotNull CommonControlSettings commonControlSettings, Paddings topMargin, Paddings bottomMargin, Paddings leftMargin, Paddings rightMargin) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(toggle, "toggle");
        Intrinsics.checkNotNullParameter(commonControlSettings, "commonControlSettings");
        return new SecureDealMoleculeDTO(title, toggle, titleIconButton, subtitle, bottomBlock, commonControlSettings, topMargin, bottomMargin, leftMargin, rightMargin);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SecureDealMoleculeDTO)) {
            return false;
        }
        SecureDealMoleculeDTO secureDealMoleculeDTO = (SecureDealMoleculeDTO) other;
        return Intrinsics.d(this.title, secureDealMoleculeDTO.title) && Intrinsics.d(this.toggle, secureDealMoleculeDTO.toggle) && Intrinsics.d(this.titleIconButton, secureDealMoleculeDTO.titleIconButton) && Intrinsics.d(this.subtitle, secureDealMoleculeDTO.subtitle) && Intrinsics.d(this.bottomBlock, secureDealMoleculeDTO.bottomBlock) && Intrinsics.d(this.commonControlSettings, secureDealMoleculeDTO.commonControlSettings) && this.topMargin == secureDealMoleculeDTO.topMargin && this.bottomMargin == secureDealMoleculeDTO.bottomMargin && this.leftMargin == secureDealMoleculeDTO.leftMargin && this.rightMargin == secureDealMoleculeDTO.rightMargin;
    }

    public final Object getBottomBlock() {
        return this.bottomBlock;
    }

    public final Paddings getBottomMargin() {
        return this.bottomMargin;
    }

    @NotNull
    public final CommonControlSettings getCommonControlSettings() {
        return this.commonControlSettings;
    }

    public final Paddings getLeftMargin() {
        return this.leftMargin;
    }

    public final Paddings getRightMargin() {
        return this.rightMargin;
    }

    public final List<TextDTO> getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final IconButtonV3DTO getTitleIconButton() {
        return this.titleIconButton;
    }

    @NotNull
    public final ToggleDTO getToggle() {
        return this.toggle;
    }

    public final Paddings getTopMargin() {
        return this.topMargin;
    }

    public int hashCode() {
        int hashCode = (this.toggle.hashCode() + (this.title.hashCode() * 31)) * 31;
        IconButtonV3DTO iconButtonV3DTO = this.titleIconButton;
        int hashCode2 = (hashCode + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
        List<TextDTO> list = this.subtitle;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Object obj = this.bottomBlock;
        int a11 = a.a(this.commonControlSettings, (hashCode3 + (obj == null ? 0 : obj.hashCode())) * 31, 31);
        Paddings paddings = this.topMargin;
        int hashCode4 = (a11 + (paddings == null ? 0 : paddings.hashCode())) * 31;
        Paddings paddings2 = this.bottomMargin;
        int hashCode5 = (hashCode4 + (paddings2 == null ? 0 : paddings2.hashCode())) * 31;
        Paddings paddings3 = this.leftMargin;
        int hashCode6 = (hashCode5 + (paddings3 == null ? 0 : paddings3.hashCode())) * 31;
        Paddings paddings4 = this.rightMargin;
        return hashCode6 + (paddings4 != null ? paddings4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        ToggleDTO toggleDTO = this.toggle;
        IconButtonV3DTO iconButtonV3DTO = this.titleIconButton;
        List<TextDTO> list = this.subtitle;
        Object obj = this.bottomBlock;
        CommonControlSettings commonControlSettings = this.commonControlSettings;
        Paddings paddings = this.topMargin;
        Paddings paddings2 = this.bottomMargin;
        Paddings paddings3 = this.leftMargin;
        Paddings paddings4 = this.rightMargin;
        StringBuilder sb2 = new StringBuilder("SecureDealMoleculeDTO(title=");
        sb2.append(textDTO);
        sb2.append(", toggle=");
        sb2.append(toggleDTO);
        sb2.append(", titleIconButton=");
        sb2.append(iconButtonV3DTO);
        sb2.append(", subtitle=");
        sb2.append(list);
        sb2.append(", bottomBlock=");
        sb2.append(obj);
        sb2.append(", commonControlSettings=");
        sb2.append(commonControlSettings);
        sb2.append(", topMargin=");
        Lh.a.e(sb2, paddings, ", bottomMargin=", paddings2, ", leftMargin=");
        return b.e(sb2, paddings3, ", rightMargin=", paddings4, ")");
    }
}
