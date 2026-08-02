package ru.ozon.app.android.travel.feature.general.order.widgets.buyersContacts.data;

import G.g;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.dto.infoBadge.InfoBadgeDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003JB\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/buyersContacts/data/BuyersContactsDTO;", "", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "textAtoms", "", "textAtomSpacing", "", "infoBadge", "Lru/ozon/app/android/travel/molecules/dto/infoBadge/InfoBadgeDTO;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Ljava/lang/Integer;Lru/ozon/app/android/travel/molecules/dto/infoBadge/InfoBadgeDTO;)V", "getHeader", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTextAtoms", "()Ljava/util/List;", "getTextAtomSpacing", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getInfoBadge", "()Lru/ozon/app/android/travel/molecules/dto/infoBadge/InfoBadgeDTO;", "component1", "component2", "component3", "component4", "copy", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Ljava/lang/Integer;Lru/ozon/app/android/travel/molecules/dto/infoBadge/InfoBadgeDTO;)Lru/ozon/app/android/travel/feature/general/order/widgets/buyersContacts/data/BuyersContactsDTO;", "equals", "", "other", "hashCode", "toString", "", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BuyersContactsDTO {
    public static final int $stable = 8;
    private final TextAtom header;
    private final InfoBadgeDTO infoBadge;
    private final Integer textAtomSpacing;

    @NotNull
    private final List<TextAtom> textAtoms;

    public BuyersContactsDTO(TextAtom textAtom, @NotNull List<TextAtom> textAtoms, Integer num, InfoBadgeDTO infoBadgeDTO) {
        Intrinsics.checkNotNullParameter(textAtoms, "textAtoms");
        this.header = textAtom;
        this.textAtoms = textAtoms;
        this.textAtomSpacing = num;
        this.infoBadge = infoBadgeDTO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BuyersContactsDTO copy$default(BuyersContactsDTO buyersContactsDTO, TextAtom textAtom, List list, Integer num, InfoBadgeDTO infoBadgeDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = buyersContactsDTO.header;
        }
        if ((i11 & 2) != 0) {
            list = buyersContactsDTO.textAtoms;
        }
        if ((i11 & 4) != 0) {
            num = buyersContactsDTO.textAtomSpacing;
        }
        if ((i11 & 8) != 0) {
            infoBadgeDTO = buyersContactsDTO.infoBadge;
        }
        return buyersContactsDTO.copy(textAtom, list, num, infoBadgeDTO);
    }

    /* renamed from: component1, reason: from getter */
    public final TextAtom getHeader() {
        return this.header;
    }

    @NotNull
    public final List<TextAtom> component2() {
        return this.textAtoms;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getTextAtomSpacing() {
        return this.textAtomSpacing;
    }

    /* renamed from: component4, reason: from getter */
    public final InfoBadgeDTO getInfoBadge() {
        return this.infoBadge;
    }

    @NotNull
    public final BuyersContactsDTO copy(TextAtom header, @NotNull List<TextAtom> textAtoms, Integer textAtomSpacing, InfoBadgeDTO infoBadge) {
        Intrinsics.checkNotNullParameter(textAtoms, "textAtoms");
        return new BuyersContactsDTO(header, textAtoms, textAtomSpacing, infoBadge);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BuyersContactsDTO)) {
            return false;
        }
        BuyersContactsDTO buyersContactsDTO = (BuyersContactsDTO) other;
        return Intrinsics.d(this.header, buyersContactsDTO.header) && Intrinsics.d(this.textAtoms, buyersContactsDTO.textAtoms) && Intrinsics.d(this.textAtomSpacing, buyersContactsDTO.textAtomSpacing) && Intrinsics.d(this.infoBadge, buyersContactsDTO.infoBadge);
    }

    public final TextAtom getHeader() {
        return this.header;
    }

    public final InfoBadgeDTO getInfoBadge() {
        return this.infoBadge;
    }

    public final Integer getTextAtomSpacing() {
        return this.textAtomSpacing;
    }

    @NotNull
    public final List<TextAtom> getTextAtoms() {
        return this.textAtoms;
    }

    public int hashCode() {
        TextAtom textAtom = this.header;
        int b11 = g.b((textAtom == null ? 0 : textAtom.hashCode()) * 31, 31, this.textAtoms);
        Integer num = this.textAtomSpacing;
        int hashCode = (b11 + (num == null ? 0 : num.hashCode())) * 31;
        InfoBadgeDTO infoBadgeDTO = this.infoBadge;
        return hashCode + (infoBadgeDTO != null ? infoBadgeDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BuyersContactsDTO(header=" + this.header + ", textAtoms=" + this.textAtoms + ", textAtomSpacing=" + this.textAtomSpacing + ", infoBadge=" + this.infoBadge + ")";
    }
}
