package ru.ozon.app.android.checkoutcomposer.total.sticky.v2.presentation;

import B90.C2618u;
import D40.a;
import Fm.C3051a;
import Kk.C3532b;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.total.sticky.v2.data.DisabledButtonStyleDTO;
import ru.ozon.app.android.partnerBanks.presentation.PartnerBanksVO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b'\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0089\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ®\u0001\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0014\u001a\u00020\u00112\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\rHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u00112\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b3\u00104R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00108\u001a\u0004\b9\u0010!R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010=\u001a\u0004\b>\u0010?R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0013\u00108\u001a\u0004\b@\u0010!R\u0017\u0010\u0014\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0014\u0010=\u001a\u0004\bA\u0010?R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010B\u001a\u0004\bC\u0010DR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010E\u001a\u0004\bF\u0010GR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010,\u001a\u0004\bH\u0010.R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010I\u001a\u0004\bJ\u0010K¨\u0006L"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/presentation/TotalStickyV2VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/price/Price;", "price", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "infoText", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "button", "Lru/ozon/uni/atoms/data/badge/Badge;", "badgeInfo", "", "asyncData", "LWZ/t;", "tokenizedEvent", "", "disableSeparator", "backgroundColor", "showIsland", "Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/data/DisabledButtonStyleDTO;", "disabledButtonStyle", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "newButton", "secondPrice", "Lru/ozon/app/android/partnerBanks/presentation/PartnerBanksVO;", "partnerBanksMolecule", "<init>", "(JLru/ozon/uni/atoms/data/price/Price;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;Lru/ozon/uni/atoms/data/badge/Badge;Ljava/lang/String;LWZ/t;ZLjava/lang/String;ZLru/ozon/app/android/checkoutcomposer/total/sticky/v2/data/DisabledButtonStyleDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/price/Price;Lru/ozon/app/android/partnerBanks/presentation/PartnerBanksVO;)V", "copy", "(JLru/ozon/uni/atoms/data/price/Price;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;Lru/ozon/uni/atoms/data/badge/Badge;Ljava/lang/String;LWZ/t;ZLjava/lang/String;ZLru/ozon/app/android/checkoutcomposer/total/sticky/v2/data/DisabledButtonStyleDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/price/Price;Lru/ozon/app/android/partnerBanks/presentation/PartnerBanksVO;)Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/presentation/TotalStickyV2VO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/price/Price;", "getPrice", "()Lru/ozon/uni/atoms/data/price/Price;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getInfoText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "Lru/ozon/uni/atoms/data/badge/Badge;", "getBadgeInfo", "()Lru/ozon/uni/atoms/data/badge/Badge;", "Ljava/lang/String;", "getAsyncData", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Z", "getDisableSeparator", "()Z", "getBackgroundColor", "getShowIsland", "Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/data/DisabledButtonStyleDTO;", "getDisabledButtonStyle", "()Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/data/DisabledButtonStyleDTO;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getNewButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getSecondPrice", "Lru/ozon/app/android/partnerBanks/presentation/PartnerBanksVO;", "getPartnerBanksMolecule", "()Lru/ozon/app/android/partnerBanks/presentation/PartnerBanksVO;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TotalStickyV2VO implements c {
    private final String asyncData;
    private final String backgroundColor;
    private final Badge badgeInfo;

    @NotNull
    private final ButtonV3Atom.SmallButton button;
    private final boolean disableSeparator;
    private final DisabledButtonStyleDTO disabledButtonStyle;
    private final long id;
    private final TextAtom infoText;
    private final ButtonV3DTO newButton;
    private final PartnerBanksVO partnerBanksMolecule;

    @NotNull
    private final Price price;
    private final Price secondPrice;
    private final boolean showIsland;
    private final t tokenizedEvent;

    public TotalStickyV2VO(long j11, @NotNull Price price, TextAtom textAtom, @NotNull ButtonV3Atom.SmallButton button, Badge badge, String str, t tVar, boolean z11, String str2, boolean z12, DisabledButtonStyleDTO disabledButtonStyleDTO, ButtonV3DTO buttonV3DTO, Price price2, PartnerBanksVO partnerBanksVO) {
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(button, "button");
        this.id = j11;
        this.price = price;
        this.infoText = textAtom;
        this.button = button;
        this.badgeInfo = badge;
        this.asyncData = str;
        this.tokenizedEvent = tVar;
        this.disableSeparator = z11;
        this.backgroundColor = str2;
        this.showIsland = z12;
        this.disabledButtonStyle = disabledButtonStyleDTO;
        this.newButton = buttonV3DTO;
        this.secondPrice = price2;
        this.partnerBanksMolecule = partnerBanksVO;
    }

    @NotNull
    public final TotalStickyV2VO copy(long id2, @NotNull Price price, TextAtom infoText, @NotNull ButtonV3Atom.SmallButton button, Badge badgeInfo, String asyncData, t tokenizedEvent, boolean disableSeparator, String backgroundColor, boolean showIsland, DisabledButtonStyleDTO disabledButtonStyle, ButtonV3DTO newButton, Price secondPrice, PartnerBanksVO partnerBanksMolecule) {
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(button, "button");
        return new TotalStickyV2VO(id2, price, infoText, button, badgeInfo, asyncData, tokenizedEvent, disableSeparator, backgroundColor, showIsland, disabledButtonStyle, newButton, secondPrice, partnerBanksMolecule);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TotalStickyV2VO)) {
            return false;
        }
        TotalStickyV2VO totalStickyV2VO = (TotalStickyV2VO) other;
        return this.id == totalStickyV2VO.id && Intrinsics.d(this.price, totalStickyV2VO.price) && Intrinsics.d(this.infoText, totalStickyV2VO.infoText) && Intrinsics.d(this.button, totalStickyV2VO.button) && Intrinsics.d(this.badgeInfo, totalStickyV2VO.badgeInfo) && Intrinsics.d(this.asyncData, totalStickyV2VO.asyncData) && Intrinsics.d(this.tokenizedEvent, totalStickyV2VO.tokenizedEvent) && this.disableSeparator == totalStickyV2VO.disableSeparator && Intrinsics.d(this.backgroundColor, totalStickyV2VO.backgroundColor) && this.showIsland == totalStickyV2VO.showIsland && Intrinsics.d(this.disabledButtonStyle, totalStickyV2VO.disabledButtonStyle) && Intrinsics.d(this.newButton, totalStickyV2VO.newButton) && Intrinsics.d(this.secondPrice, totalStickyV2VO.secondPrice) && Intrinsics.d(this.partnerBanksMolecule, totalStickyV2VO.partnerBanksMolecule);
    }

    public final String getAsyncData() {
        return this.asyncData;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Badge getBadgeInfo() {
        return this.badgeInfo;
    }

    @NotNull
    public final ButtonV3Atom.SmallButton getButton() {
        return this.button;
    }

    public final boolean getDisableSeparator() {
        return this.disableSeparator;
    }

    public final DisabledButtonStyleDTO getDisabledButtonStyle() {
        return this.disabledButtonStyle;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final TextAtom getInfoText() {
        return this.infoText;
    }

    public final ButtonV3DTO getNewButton() {
        return this.newButton;
    }

    public final PartnerBanksVO getPartnerBanksMolecule() {
        return this.partnerBanksMolecule;
    }

    @NotNull
    public final Price getPrice() {
        return this.price;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final Price getSecondPrice() {
        return this.secondPrice;
    }

    public final boolean getShowIsland() {
        return this.showIsland;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = C3051a.a(this.price, Long.hashCode(this.id) * 31, 31);
        TextAtom textAtom = this.infoText;
        int c11 = C2618u.c(this.button, (a11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31, 31);
        Badge badge = this.badgeInfo;
        int hashCode = (c11 + (badge == null ? 0 : badge.hashCode())) * 31;
        String str = this.asyncData;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        int a12 = C3532b.a((hashCode2 + (tVar == null ? 0 : tVar.hashCode())) * 31, 31, this.disableSeparator);
        String str2 = this.backgroundColor;
        int a13 = C3532b.a((a12 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.showIsland);
        DisabledButtonStyleDTO disabledButtonStyleDTO = this.disabledButtonStyle;
        int hashCode3 = (a13 + (disabledButtonStyleDTO == null ? 0 : disabledButtonStyleDTO.hashCode())) * 31;
        ButtonV3DTO buttonV3DTO = this.newButton;
        int hashCode4 = (hashCode3 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
        Price price = this.secondPrice;
        int hashCode5 = (hashCode4 + (price == null ? 0 : price.hashCode())) * 31;
        PartnerBanksVO partnerBanksVO = this.partnerBanksMolecule;
        return hashCode5 + (partnerBanksVO != null ? partnerBanksVO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        Price price = this.price;
        TextAtom textAtom = this.infoText;
        ButtonV3Atom.SmallButton smallButton = this.button;
        Badge badge = this.badgeInfo;
        String str = this.asyncData;
        t tVar = this.tokenizedEvent;
        boolean z11 = this.disableSeparator;
        String str2 = this.backgroundColor;
        boolean z12 = this.showIsland;
        DisabledButtonStyleDTO disabledButtonStyleDTO = this.disabledButtonStyle;
        ButtonV3DTO buttonV3DTO = this.newButton;
        Price price2 = this.secondPrice;
        PartnerBanksVO partnerBanksVO = this.partnerBanksMolecule;
        StringBuilder sb2 = new StringBuilder("TotalStickyV2VO(id=");
        sb2.append(j11);
        sb2.append(", price=");
        sb2.append(price);
        sb2.append(", infoText=");
        sb2.append(textAtom);
        sb2.append(", button=");
        sb2.append(smallButton);
        sb2.append(", badgeInfo=");
        sb2.append(badge);
        sb2.append(", asyncData=");
        sb2.append(str);
        sb2.append(", tokenizedEvent=");
        sb2.append(tVar);
        sb2.append(", disableSeparator=");
        sb2.append(z11);
        a.g(", backgroundColor=", str2, ", showIsland=", sb2, z12);
        sb2.append(", disabledButtonStyle=");
        sb2.append(disabledButtonStyleDTO);
        sb2.append(", newButton=");
        sb2.append(buttonV3DTO);
        sb2.append(", secondPrice=");
        sb2.append(price2);
        sb2.append(", partnerBanksMolecule=");
        sb2.append(partnerBanksVO);
        sb2.append(")");
        return sb2.toString();
    }
}
