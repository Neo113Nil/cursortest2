package ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarFooter.v1.data;

import D40.a;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BU\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0017\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000eHÆ\u0003Jc\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000eHÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u000fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006,"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v1/data/PriceCalendarFooterDTO;", "", "informer", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "toggles", "", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleToggle;", "resetButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "confirmButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "updateWidgetState", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getInformer", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getToggles", "()Ljava/util/List;", "getResetButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getConfirmButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getUpdateWidgetState", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PriceCalendarFooterDTO {
    public static final int $stable = 8;
    private final ButtonV3Atom.LargeButton confirmButton;
    private final TextAtom informer;
    private final ButtonV3Atom.SmallIconButton resetButton;
    private final List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle> toggles;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    private final AtomActionDTO updateWidgetState;

    public PriceCalendarFooterDTO(TextAtom textAtom, List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle> list, ButtonV3Atom.SmallIconButton smallIconButton, ButtonV3Atom.LargeButton largeButton, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
        this.informer = textAtom;
        this.toggles = list;
        this.resetButton = smallIconButton;
        this.confirmButton = largeButton;
        this.updateWidgetState = atomActionDTO;
        this.trackingInfo = map;
    }

    public static /* synthetic */ PriceCalendarFooterDTO copy$default(PriceCalendarFooterDTO priceCalendarFooterDTO, TextAtom textAtom, List list, ButtonV3Atom.SmallIconButton smallIconButton, ButtonV3Atom.LargeButton largeButton, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = priceCalendarFooterDTO.informer;
        }
        if ((i11 & 2) != 0) {
            list = priceCalendarFooterDTO.toggles;
        }
        if ((i11 & 4) != 0) {
            smallIconButton = priceCalendarFooterDTO.resetButton;
        }
        if ((i11 & 8) != 0) {
            largeButton = priceCalendarFooterDTO.confirmButton;
        }
        if ((i11 & 16) != 0) {
            atomActionDTO = priceCalendarFooterDTO.updateWidgetState;
        }
        if ((i11 & 32) != 0) {
            map = priceCalendarFooterDTO.trackingInfo;
        }
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        Map map2 = map;
        return priceCalendarFooterDTO.copy(textAtom, list, smallIconButton, largeButton, atomActionDTO2, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final TextAtom getInformer() {
        return this.informer;
    }

    public final List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle> component2() {
        return this.toggles;
    }

    /* renamed from: component3, reason: from getter */
    public final ButtonV3Atom.SmallIconButton getResetButton() {
        return this.resetButton;
    }

    /* renamed from: component4, reason: from getter */
    public final ButtonV3Atom.LargeButton getConfirmButton() {
        return this.confirmButton;
    }

    /* renamed from: component5, reason: from getter */
    public final AtomActionDTO getUpdateWidgetState() {
        return this.updateWidgetState;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    @NotNull
    public final PriceCalendarFooterDTO copy(TextAtom informer, List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle> toggles, ButtonV3Atom.SmallIconButton resetButton, ButtonV3Atom.LargeButton confirmButton, AtomActionDTO updateWidgetState, Map<String, TokenizedTrackingInfo> trackingInfo) {
        return new PriceCalendarFooterDTO(informer, toggles, resetButton, confirmButton, updateWidgetState, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PriceCalendarFooterDTO)) {
            return false;
        }
        PriceCalendarFooterDTO priceCalendarFooterDTO = (PriceCalendarFooterDTO) other;
        return Intrinsics.d(this.informer, priceCalendarFooterDTO.informer) && Intrinsics.d(this.toggles, priceCalendarFooterDTO.toggles) && Intrinsics.d(this.resetButton, priceCalendarFooterDTO.resetButton) && Intrinsics.d(this.confirmButton, priceCalendarFooterDTO.confirmButton) && Intrinsics.d(this.updateWidgetState, priceCalendarFooterDTO.updateWidgetState) && Intrinsics.d(this.trackingInfo, priceCalendarFooterDTO.trackingInfo);
    }

    public final ButtonV3Atom.LargeButton getConfirmButton() {
        return this.confirmButton;
    }

    public final TextAtom getInformer() {
        return this.informer;
    }

    public final ButtonV3Atom.SmallIconButton getResetButton() {
        return this.resetButton;
    }

    public final List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle> getToggles() {
        return this.toggles;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public final AtomActionDTO getUpdateWidgetState() {
        return this.updateWidgetState;
    }

    public int hashCode() {
        TextAtom textAtom = this.informer;
        int hashCode = (textAtom == null ? 0 : textAtom.hashCode()) * 31;
        List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle> list = this.toggles;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        ButtonV3Atom.SmallIconButton smallIconButton = this.resetButton;
        int hashCode3 = (hashCode2 + (smallIconButton == null ? 0 : smallIconButton.hashCode())) * 31;
        ButtonV3Atom.LargeButton largeButton = this.confirmButton;
        int hashCode4 = (hashCode3 + (largeButton == null ? 0 : largeButton.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.updateWidgetState;
        int hashCode5 = (hashCode4 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode5 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.informer;
        List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle> list = this.toggles;
        ButtonV3Atom.SmallIconButton smallIconButton = this.resetButton;
        ButtonV3Atom.LargeButton largeButton = this.confirmButton;
        AtomActionDTO atomActionDTO = this.updateWidgetState;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("PriceCalendarFooterDTO(informer=");
        sb2.append(textAtom);
        sb2.append(", toggles=");
        sb2.append(list);
        sb2.append(", resetButton=");
        sb2.append(smallIconButton);
        sb2.append(", confirmButton=");
        sb2.append(largeButton);
        sb2.append(", updateWidgetState=");
        return a.d(sb2, atomActionDTO, ", trackingInfo=", map, ")");
    }
}
