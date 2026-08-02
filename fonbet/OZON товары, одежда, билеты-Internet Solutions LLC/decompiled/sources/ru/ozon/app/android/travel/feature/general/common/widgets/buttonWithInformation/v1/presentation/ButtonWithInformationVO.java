package ru.ozon.app.android.travel.feature.general.common.widgets.buttonWithInformation.v1.presentation;

import Bl.C2639a;
import WZ.t;
import Xc.a;
import Xc.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001>Ba\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u000e\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00108\u001a\u0004\b9\u0010:R\u001f\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010;\u001a\u0004\b<\u0010=¨\u0006?"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWithInformation/v1/presentation/ButtonWithInformationVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/price/Price;", "price", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "infoButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom;", "button", "Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWithInformation/v1/presentation/ButtonWithInformationVO$ButtonWidthVO;", "buttonWidth", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "topBadge", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "notificationCell", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/price/Price;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom;Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWithInformation/v1/presentation/ButtonWithInformationVO$ButtonWidthVO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Lru/ozon/uni/atoms/data/price/Price;", "getPrice", "()Lru/ozon/uni/atoms/data/price/Price;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getInfoButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom;", "Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWithInformation/v1/presentation/ButtonWithInformationVO$ButtonWidthVO;", "getButtonWidth", "()Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWithInformation/v1/presentation/ButtonWithInformationVO$ButtonWidthVO;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getTopBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getNotificationCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "ButtonWidthVO", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ButtonWithInformationVO implements c {

    @NotNull
    private final ButtonV3Atom button;

    @NotNull
    private final ButtonWidthVO buttonWidth;
    private final long id;
    private final ButtonV3Atom.SmallIconButton infoButton;
    private final CellDTO notificationCell;
    private final Price price;
    private final TextAtom title;
    private final t tokenizedEvent;
    private final BadgeDTO topBadge;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWithInformation/v1/presentation/ButtonWithInformationVO$ButtonWidthVO;", "", "<init>", "(Ljava/lang/String;I)V", "WRAP_CONTENT", "MATCH_CENTER", "MATCH_PARENT", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ButtonWidthVO {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ButtonWidthVO[] $VALUES;
        public static final ButtonWidthVO WRAP_CONTENT = new ButtonWidthVO("WRAP_CONTENT", 0);
        public static final ButtonWidthVO MATCH_CENTER = new ButtonWidthVO("MATCH_CENTER", 1);
        public static final ButtonWidthVO MATCH_PARENT = new ButtonWidthVO("MATCH_PARENT", 2);

        private static final /* synthetic */ ButtonWidthVO[] $values() {
            return new ButtonWidthVO[]{WRAP_CONTENT, MATCH_CENTER, MATCH_PARENT};
        }

        static {
            ButtonWidthVO[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ButtonWidthVO(String str, int i11) {
        }

        public static ButtonWidthVO valueOf(String str) {
            return (ButtonWidthVO) Enum.valueOf(ButtonWidthVO.class, str);
        }

        public static ButtonWidthVO[] values() {
            return (ButtonWidthVO[]) $VALUES.clone();
        }
    }

    public ButtonWithInformationVO(long j11, TextAtom textAtom, Price price, ButtonV3Atom.SmallIconButton smallIconButton, @NotNull ButtonV3Atom button, @NotNull ButtonWidthVO buttonWidth, BadgeDTO badgeDTO, CellDTO cellDTO, t tVar) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(buttonWidth, "buttonWidth");
        this.id = j11;
        this.title = textAtom;
        this.price = price;
        this.infoButton = smallIconButton;
        this.button = button;
        this.buttonWidth = buttonWidth;
        this.topBadge = badgeDTO;
        this.notificationCell = cellDTO;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonWithInformationVO)) {
            return false;
        }
        ButtonWithInformationVO buttonWithInformationVO = (ButtonWithInformationVO) other;
        return this.id == buttonWithInformationVO.id && Intrinsics.d(this.title, buttonWithInformationVO.title) && Intrinsics.d(this.price, buttonWithInformationVO.price) && Intrinsics.d(this.infoButton, buttonWithInformationVO.infoButton) && Intrinsics.d(this.button, buttonWithInformationVO.button) && this.buttonWidth == buttonWithInformationVO.buttonWidth && Intrinsics.d(this.topBadge, buttonWithInformationVO.topBadge) && Intrinsics.d(this.notificationCell, buttonWithInformationVO.notificationCell) && Intrinsics.d(this.tokenizedEvent, buttonWithInformationVO.tokenizedEvent);
    }

    @NotNull
    public final ButtonV3Atom getButton() {
        return this.button;
    }

    @NotNull
    public final ButtonWidthVO getButtonWidth() {
        return this.buttonWidth;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final ButtonV3Atom.SmallIconButton getInfoButton() {
        return this.infoButton;
    }

    public final CellDTO getNotificationCell() {
        return this.notificationCell;
    }

    public final Price getPrice() {
        return this.price;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final TextAtom getTitle() {
        return this.title;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    public final BadgeDTO getTopBadge() {
        return this.topBadge;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        TextAtom textAtom = this.title;
        int hashCode2 = (hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        Price price = this.price;
        int hashCode3 = (hashCode2 + (price == null ? 0 : price.hashCode())) * 31;
        ButtonV3Atom.SmallIconButton smallIconButton = this.infoButton;
        int hashCode4 = (this.buttonWidth.hashCode() + ((this.button.hashCode() + ((hashCode3 + (smallIconButton == null ? 0 : smallIconButton.hashCode())) * 31)) * 31)) * 31;
        BadgeDTO badgeDTO = this.topBadge;
        int hashCode5 = (hashCode4 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        CellDTO cellDTO = this.notificationCell;
        int hashCode6 = (hashCode5 + (cellDTO == null ? 0 : cellDTO.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode6 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextAtom textAtom = this.title;
        Price price = this.price;
        ButtonV3Atom.SmallIconButton smallIconButton = this.infoButton;
        ButtonV3Atom buttonV3Atom = this.button;
        ButtonWidthVO buttonWidthVO = this.buttonWidth;
        BadgeDTO badgeDTO = this.topBadge;
        CellDTO cellDTO = this.notificationCell;
        t tVar = this.tokenizedEvent;
        StringBuilder c11 = C2639a.c("ButtonWithInformationVO(id=", j11, ", title=", textAtom);
        c11.append(", price=");
        c11.append(price);
        c11.append(", infoButton=");
        c11.append(smallIconButton);
        c11.append(", button=");
        c11.append(buttonV3Atom);
        c11.append(", buttonWidth=");
        c11.append(buttonWidthVO);
        c11.append(", topBadge=");
        c11.append(badgeDTO);
        c11.append(", notificationCell=");
        c11.append(cellDTO);
        return Lh.a.b(c11, ", tokenizedEvent=", tVar, ")");
    }
}
