package ru.ozon.app.android.cml.delivery.widgets.secureDealCurtain.data;

import De.C2859b;
import K1.G;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cml.delivery.molecules.cellList.data.CmlCellListDTO;
import ru.ozon.app.android.cml.delivery.molecules.input.data.InputMoleculeDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u0011\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010.\u001a\u00020\fHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010$J\u0017\u00101\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011HÆ\u0003J\u009a\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011HÆ\u0001¢\u0006\u0002\u00103J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u000208HÖ\u0001J\t\u00109\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u001f\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u0006:"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/data/SecureDealCurtainDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "", "topBlockItem", "cardsTitle", "cardsSubtitle", "cards", "Lru/ozon/app/android/cml/delivery/molecules/cellList/data/CmlCellListDTO;", "mainButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "secondaryButton", "inputDelay", "", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Ljava/lang/Object;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/app/android/cml/delivery/molecules/cellList/data/CmlCellListDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/lang/Long;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "()Ljava/util/List;", "getTopBlockItem", "()Ljava/lang/Object;", "getCardsTitle", "getCardsSubtitle", "getCards", "()Lru/ozon/app/android/cml/delivery/molecules/cellList/data/CmlCellListDTO;", "getMainButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getSecondaryButton", "getInputDelay", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Ljava/lang/Object;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/app/android/cml/delivery/molecules/cellList/data/CmlCellListDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/lang/Long;Ljava/util/Map;)Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/data/SecureDealCurtainDTO;", "equals", "", "other", "hashCode", "", "toString", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SecureDealCurtainDTO {
    private final CmlCellListDTO cards;
    private final List<TextDTO> cardsSubtitle;
    private final TextDTO cardsTitle;
    private final Long inputDelay;

    @NotNull
    private final ButtonV3DTO mainButton;
    private final ButtonV3DTO secondaryButton;
    private final List<TextDTO> subtitle;

    @NotNull
    private final TextDTO title;
    private final Object topBlockItem;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public SecureDealCurtainDTO(@NotNull TextDTO title, List<TextDTO> list, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "input", type = InputMoleculeDTO.class), @ProtoOneOfSignature(name = "disclaimer", type = DisclaimerDTO.class)}) @ProtoOneOf(label = "type") Object obj, TextDTO textDTO, List<TextDTO> list2, CmlCellListDTO cmlCellListDTO, @NotNull ButtonV3DTO mainButton, ButtonV3DTO buttonV3DTO, Long l11, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(mainButton, "mainButton");
        this.title = title;
        this.subtitle = list;
        this.topBlockItem = obj;
        this.cardsTitle = textDTO;
        this.cardsSubtitle = list2;
        this.cards = cmlCellListDTO;
        this.mainButton = mainButton;
        this.secondaryButton = buttonV3DTO;
        this.inputDelay = l11;
        this.trackingInfo = map;
    }

    public static /* synthetic */ SecureDealCurtainDTO copy$default(SecureDealCurtainDTO secureDealCurtainDTO, TextDTO textDTO, List list, Object obj, TextDTO textDTO2, List list2, CmlCellListDTO cmlCellListDTO, ButtonV3DTO buttonV3DTO, ButtonV3DTO buttonV3DTO2, Long l11, Map map, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            textDTO = secureDealCurtainDTO.title;
        }
        if ((i11 & 2) != 0) {
            list = secureDealCurtainDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            obj = secureDealCurtainDTO.topBlockItem;
        }
        if ((i11 & 8) != 0) {
            textDTO2 = secureDealCurtainDTO.cardsTitle;
        }
        if ((i11 & 16) != 0) {
            list2 = secureDealCurtainDTO.cardsSubtitle;
        }
        if ((i11 & 32) != 0) {
            cmlCellListDTO = secureDealCurtainDTO.cards;
        }
        if ((i11 & 64) != 0) {
            buttonV3DTO = secureDealCurtainDTO.mainButton;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            buttonV3DTO2 = secureDealCurtainDTO.secondaryButton;
        }
        if ((i11 & 256) != 0) {
            l11 = secureDealCurtainDTO.inputDelay;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            map = secureDealCurtainDTO.trackingInfo;
        }
        Long l12 = l11;
        Map map2 = map;
        ButtonV3DTO buttonV3DTO3 = buttonV3DTO;
        ButtonV3DTO buttonV3DTO4 = buttonV3DTO2;
        List list3 = list2;
        CmlCellListDTO cmlCellListDTO2 = cmlCellListDTO;
        return secureDealCurtainDTO.copy(textDTO, list, obj, textDTO2, list3, cmlCellListDTO2, buttonV3DTO3, buttonV3DTO4, l12, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> component10() {
        return this.trackingInfo;
    }

    public final List<TextDTO> component2() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final Object getTopBlockItem() {
        return this.topBlockItem;
    }

    /* renamed from: component4, reason: from getter */
    public final TextDTO getCardsTitle() {
        return this.cardsTitle;
    }

    public final List<TextDTO> component5() {
        return this.cardsSubtitle;
    }

    /* renamed from: component6, reason: from getter */
    public final CmlCellListDTO getCards() {
        return this.cards;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final ButtonV3DTO getMainButton() {
        return this.mainButton;
    }

    /* renamed from: component8, reason: from getter */
    public final ButtonV3DTO getSecondaryButton() {
        return this.secondaryButton;
    }

    /* renamed from: component9, reason: from getter */
    public final Long getInputDelay() {
        return this.inputDelay;
    }

    @NotNull
    public final SecureDealCurtainDTO copy(@NotNull TextDTO title, List<TextDTO> subtitle, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "input", type = InputMoleculeDTO.class), @ProtoOneOfSignature(name = "disclaimer", type = DisclaimerDTO.class)}) @ProtoOneOf(label = "type") Object topBlockItem, TextDTO cardsTitle, List<TextDTO> cardsSubtitle, CmlCellListDTO cards, @NotNull ButtonV3DTO mainButton, ButtonV3DTO secondaryButton, Long inputDelay, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(mainButton, "mainButton");
        return new SecureDealCurtainDTO(title, subtitle, topBlockItem, cardsTitle, cardsSubtitle, cards, mainButton, secondaryButton, inputDelay, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SecureDealCurtainDTO)) {
            return false;
        }
        SecureDealCurtainDTO secureDealCurtainDTO = (SecureDealCurtainDTO) other;
        return Intrinsics.d(this.title, secureDealCurtainDTO.title) && Intrinsics.d(this.subtitle, secureDealCurtainDTO.subtitle) && Intrinsics.d(this.topBlockItem, secureDealCurtainDTO.topBlockItem) && Intrinsics.d(this.cardsTitle, secureDealCurtainDTO.cardsTitle) && Intrinsics.d(this.cardsSubtitle, secureDealCurtainDTO.cardsSubtitle) && Intrinsics.d(this.cards, secureDealCurtainDTO.cards) && Intrinsics.d(this.mainButton, secureDealCurtainDTO.mainButton) && Intrinsics.d(this.secondaryButton, secureDealCurtainDTO.secondaryButton) && Intrinsics.d(this.inputDelay, secureDealCurtainDTO.inputDelay) && Intrinsics.d(this.trackingInfo, secureDealCurtainDTO.trackingInfo);
    }

    public final CmlCellListDTO getCards() {
        return this.cards;
    }

    public final List<TextDTO> getCardsSubtitle() {
        return this.cardsSubtitle;
    }

    public final TextDTO getCardsTitle() {
        return this.cardsTitle;
    }

    public final Long getInputDelay() {
        return this.inputDelay;
    }

    @NotNull
    public final ButtonV3DTO getMainButton() {
        return this.mainButton;
    }

    public final ButtonV3DTO getSecondaryButton() {
        return this.secondaryButton;
    }

    public final List<TextDTO> getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final Object getTopBlockItem() {
        return this.topBlockItem;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        List<TextDTO> list = this.subtitle;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Object obj = this.topBlockItem;
        int hashCode3 = (hashCode2 + (obj == null ? 0 : obj.hashCode())) * 31;
        TextDTO textDTO = this.cardsTitle;
        int hashCode4 = (hashCode3 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        List<TextDTO> list2 = this.cardsSubtitle;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        CmlCellListDTO cmlCellListDTO = this.cards;
        int c11 = C2859b.c(this.mainButton, (hashCode5 + (cmlCellListDTO == null ? 0 : cmlCellListDTO.hashCode())) * 31, 31);
        ButtonV3DTO buttonV3DTO = this.secondaryButton;
        int hashCode6 = (c11 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
        Long l11 = this.inputDelay;
        int hashCode7 = (hashCode6 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode7 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        List<TextDTO> list = this.subtitle;
        Object obj = this.topBlockItem;
        TextDTO textDTO2 = this.cardsTitle;
        List<TextDTO> list2 = this.cardsSubtitle;
        CmlCellListDTO cmlCellListDTO = this.cards;
        ButtonV3DTO buttonV3DTO = this.mainButton;
        ButtonV3DTO buttonV3DTO2 = this.secondaryButton;
        Long l11 = this.inputDelay;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder e11 = G.e("SecureDealCurtainDTO(title=", textDTO, ", subtitle=", list, ", topBlockItem=");
        e11.append(obj);
        e11.append(", cardsTitle=");
        e11.append(textDTO2);
        e11.append(", cardsSubtitle=");
        e11.append(list2);
        e11.append(", cards=");
        e11.append(cmlCellListDTO);
        e11.append(", mainButton=");
        e11.append(buttonV3DTO);
        e11.append(", secondaryButton=");
        e11.append(buttonV3DTO2);
        e11.append(", inputDelay=");
        e11.append(l11);
        e11.append(", trackingInfo=");
        e11.append(map);
        e11.append(")");
        return e11.toString();
    }
}
