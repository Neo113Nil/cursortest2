package ru.ozon.app.android.bank.widgets.bankAccountStatus.data;

import Nh.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.proto.OneOfSignature;
import ru.ozon.app.android.atoms.proto.ProtoOneOf;
import ru.ozon.app.android.storefront.core.socialAtoms.text.SocialTextAtomDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0016\b\u0003\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0017\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u007f\u0010.\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\u0003\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u000203HÖ\u0001J\t\u00104\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u00065"}, d2 = {"Lru/ozon/app/android/bank/widgets/bankAccountStatus/data/BankAccountStatusDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/storefront/core/socialAtoms/text/SocialTextAtomDTO;", "subTitle", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "button", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "description", "backgroundColor", "widgetBackground", "atom", "Lru/ozon/uni/atoms/data/AtomDTO;", "<init>", "(Lru/ozon/app/android/storefront/core/socialAtoms/text/SocialTextAtomDTO;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomDTO;)V", "getTitle", "()Lru/ozon/app/android/storefront/core/socialAtoms/text/SocialTextAtomDTO;", "getSubTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getDescription", "getBackgroundColor", "()Ljava/lang/String;", "getWidgetBackground", "getAtom", "()Lru/ozon/uni/atoms/data/AtomDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BankAccountStatusDTO {
    private final AtomActionDTO action;
    private final AtomDTO atom;
    private final String backgroundColor;
    private final ButtonV3Atom.SmallButton button;
    private final TextAtom description;
    private final TextAtom subTitle;

    @NotNull
    private final SocialTextAtomDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    private final String widgetBackground;

    public BankAccountStatusDTO(@i(name = "titleTextAtom") @NotNull SocialTextAtomDTO title, @i(name = "subTitleTextAtom") TextAtom textAtom, @i(name = "smallButton") ButtonV3Atom.SmallButton smallButton, @i(name = "action") AtomActionDTO atomActionDTO, @i(name = "trackingInfo") Map<String, TokenizedTrackingInfo> map, @i(name = "descriptionTextAtom") TextAtom textAtom2, @i(name = "backgroundColor") String str, @i(name = "widgetBackground") String str2, @ProtoOneOf(label = "type", signatures = {@OneOfSignature(name = "textAtom", type = TextAtom.class), @OneOfSignature(name = "badge", type = Badge.class)}) AtomDTO atomDTO) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.subTitle = textAtom;
        this.button = smallButton;
        this.action = atomActionDTO;
        this.trackingInfo = map;
        this.description = textAtom2;
        this.backgroundColor = str;
        this.widgetBackground = str2;
        this.atom = atomDTO;
    }

    public static /* synthetic */ BankAccountStatusDTO copy$default(BankAccountStatusDTO bankAccountStatusDTO, SocialTextAtomDTO socialTextAtomDTO, TextAtom textAtom, ButtonV3Atom.SmallButton smallButton, AtomActionDTO atomActionDTO, Map map, TextAtom textAtom2, String str, String str2, AtomDTO atomDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            socialTextAtomDTO = bankAccountStatusDTO.title;
        }
        if ((i11 & 2) != 0) {
            textAtom = bankAccountStatusDTO.subTitle;
        }
        if ((i11 & 4) != 0) {
            smallButton = bankAccountStatusDTO.button;
        }
        if ((i11 & 8) != 0) {
            atomActionDTO = bankAccountStatusDTO.action;
        }
        if ((i11 & 16) != 0) {
            map = bankAccountStatusDTO.trackingInfo;
        }
        if ((i11 & 32) != 0) {
            textAtom2 = bankAccountStatusDTO.description;
        }
        if ((i11 & 64) != 0) {
            str = bankAccountStatusDTO.backgroundColor;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            str2 = bankAccountStatusDTO.widgetBackground;
        }
        if ((i11 & 256) != 0) {
            atomDTO = bankAccountStatusDTO.atom;
        }
        String str3 = str2;
        AtomDTO atomDTO2 = atomDTO;
        TextAtom textAtom3 = textAtom2;
        String str4 = str;
        Map map2 = map;
        ButtonV3Atom.SmallButton smallButton2 = smallButton;
        return bankAccountStatusDTO.copy(socialTextAtomDTO, textAtom, smallButton2, atomActionDTO, map2, textAtom3, str4, str3, atomDTO2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final SocialTextAtomDTO getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final TextAtom getSubTitle() {
        return this.subTitle;
    }

    /* renamed from: component3, reason: from getter */
    public final ButtonV3Atom.SmallButton getButton() {
        return this.button;
    }

    /* renamed from: component4, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    /* renamed from: component6, reason: from getter */
    public final TextAtom getDescription() {
        return this.description;
    }

    /* renamed from: component7, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component8, reason: from getter */
    public final String getWidgetBackground() {
        return this.widgetBackground;
    }

    /* renamed from: component9, reason: from getter */
    public final AtomDTO getAtom() {
        return this.atom;
    }

    @NotNull
    public final BankAccountStatusDTO copy(@i(name = "titleTextAtom") @NotNull SocialTextAtomDTO title, @i(name = "subTitleTextAtom") TextAtom subTitle, @i(name = "smallButton") ButtonV3Atom.SmallButton button, @i(name = "action") AtomActionDTO action, @i(name = "trackingInfo") Map<String, TokenizedTrackingInfo> trackingInfo, @i(name = "descriptionTextAtom") TextAtom description, @i(name = "backgroundColor") String backgroundColor, @i(name = "widgetBackground") String widgetBackground, @ProtoOneOf(label = "type", signatures = {@OneOfSignature(name = "textAtom", type = TextAtom.class), @OneOfSignature(name = "badge", type = Badge.class)}) AtomDTO atom) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new BankAccountStatusDTO(title, subTitle, button, action, trackingInfo, description, backgroundColor, widgetBackground, atom);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BankAccountStatusDTO)) {
            return false;
        }
        BankAccountStatusDTO bankAccountStatusDTO = (BankAccountStatusDTO) other;
        return Intrinsics.d(this.title, bankAccountStatusDTO.title) && Intrinsics.d(this.subTitle, bankAccountStatusDTO.subTitle) && Intrinsics.d(this.button, bankAccountStatusDTO.button) && Intrinsics.d(this.action, bankAccountStatusDTO.action) && Intrinsics.d(this.trackingInfo, bankAccountStatusDTO.trackingInfo) && Intrinsics.d(this.description, bankAccountStatusDTO.description) && Intrinsics.d(this.backgroundColor, bankAccountStatusDTO.backgroundColor) && Intrinsics.d(this.widgetBackground, bankAccountStatusDTO.widgetBackground) && Intrinsics.d(this.atom, bankAccountStatusDTO.atom);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final AtomDTO getAtom() {
        return this.atom;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final ButtonV3Atom.SmallButton getButton() {
        return this.button;
    }

    public final TextAtom getDescription() {
        return this.description;
    }

    public final TextAtom getSubTitle() {
        return this.subTitle;
    }

    @NotNull
    public final SocialTextAtomDTO getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public final String getWidgetBackground() {
        return this.widgetBackground;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        TextAtom textAtom = this.subTitle;
        int hashCode2 = (hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        ButtonV3Atom.SmallButton smallButton = this.button;
        int hashCode3 = (hashCode2 + (smallButton == null ? 0 : smallButton.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode4 = (hashCode3 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode5 = (hashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        TextAtom textAtom2 = this.description;
        int hashCode6 = (hashCode5 + (textAtom2 == null ? 0 : textAtom2.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.widgetBackground;
        int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AtomDTO atomDTO = this.atom;
        return hashCode8 + (atomDTO != null ? atomDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        SocialTextAtomDTO socialTextAtomDTO = this.title;
        TextAtom textAtom = this.subTitle;
        ButtonV3Atom.SmallButton smallButton = this.button;
        AtomActionDTO atomActionDTO = this.action;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        TextAtom textAtom2 = this.description;
        String str = this.backgroundColor;
        String str2 = this.widgetBackground;
        AtomDTO atomDTO = this.atom;
        StringBuilder sb2 = new StringBuilder("BankAccountStatusDTO(title=");
        sb2.append(socialTextAtomDTO);
        sb2.append(", subTitle=");
        sb2.append(textAtom);
        sb2.append(", button=");
        sb2.append(smallButton);
        sb2.append(", action=");
        sb2.append(atomActionDTO);
        sb2.append(", trackingInfo=");
        sb2.append(map);
        sb2.append(", description=");
        sb2.append(textAtom2);
        sb2.append(", backgroundColor=");
        a.h(sb2, str, ", widgetBackground=", str2, ", atom=");
        sb2.append(atomDTO);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ BankAccountStatusDTO(SocialTextAtomDTO socialTextAtomDTO, TextAtom textAtom, ButtonV3Atom.SmallButton smallButton, AtomActionDTO atomActionDTO, Map map, TextAtom textAtom2, String str, String str2, AtomDTO atomDTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(socialTextAtomDTO, (i11 & 2) != 0 ? null : textAtom, (i11 & 4) != 0 ? null : smallButton, (i11 & 8) != 0 ? null : atomActionDTO, (i11 & 16) != 0 ? null : map, (i11 & 32) != 0 ? null : textAtom2, (i11 & 64) != 0 ? null : str, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str2, (i11 & 256) != 0 ? null : atomDTO);
    }
}
