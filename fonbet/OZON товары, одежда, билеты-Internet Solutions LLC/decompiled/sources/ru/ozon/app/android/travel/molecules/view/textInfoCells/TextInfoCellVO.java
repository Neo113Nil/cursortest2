package ru.ozon.app.android.travel.molecules.view.textInfoCells;

import B0.C2454a;
import B90.C2619v;
import Bl.C2639a;
import Kk.C3532b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.dto.textInfoCells.TextInfoCellDTO;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u0017R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b\t\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010.\u001a\u0004\b/\u00100¨\u00061"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/textInfoCells/TextInfoCellVO;", "", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "text", "", "topPadding", "", "isCenteredText", "Lru/ozon/uni/atoms/data/button/Icon;", "marker", "Lru/ozon/app/android/travel/molecules/dto/textInfoCells/TextInfoCellDTO$MarkerAlignment;", "markerAlignment", "offsetBetween", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "serviceBadge", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;IZLru/ozon/uni/atoms/data/button/Icon;Lru/ozon/app/android/travel/molecules/dto/textInfoCells/TextInfoCellDTO$MarkerAlignment;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "I", "getTopPadding", "Z", "()Z", "Lru/ozon/uni/atoms/data/button/Icon;", "getMarker", "()Lru/ozon/uni/atoms/data/button/Icon;", "Lru/ozon/app/android/travel/molecules/dto/textInfoCells/TextInfoCellDTO$MarkerAlignment;", "getMarkerAlignment", "()Lru/ozon/app/android/travel/molecules/dto/textInfoCells/TextInfoCellDTO$MarkerAlignment;", "Ljava/lang/Integer;", "getOffsetBetween", "()Ljava/lang/Integer;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getServiceBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TextInfoCellVO {
    public static final int $stable = Icon.$stable | TextAtom.$stable;
    private final long id;
    private final boolean isCenteredText;
    private final Icon marker;
    private final TextInfoCellDTO.MarkerAlignment markerAlignment;
    private final Integer offsetBetween;
    private final BadgeDTO serviceBadge;

    @NotNull
    private final TextAtom text;
    private final int topPadding;

    public TextInfoCellVO(long j11, @NotNull TextAtom text, int i11, boolean z11, Icon icon, TextInfoCellDTO.MarkerAlignment markerAlignment, Integer num, BadgeDTO badgeDTO) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.id = j11;
        this.text = text;
        this.topPadding = i11;
        this.isCenteredText = z11;
        this.marker = icon;
        this.markerAlignment = markerAlignment;
        this.offsetBetween = num;
        this.serviceBadge = badgeDTO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextInfoCellVO)) {
            return false;
        }
        TextInfoCellVO textInfoCellVO = (TextInfoCellVO) other;
        return this.id == textInfoCellVO.id && Intrinsics.d(this.text, textInfoCellVO.text) && this.topPadding == textInfoCellVO.topPadding && this.isCenteredText == textInfoCellVO.isCenteredText && Intrinsics.d(this.marker, textInfoCellVO.marker) && this.markerAlignment == textInfoCellVO.markerAlignment && Intrinsics.d(this.offsetBetween, textInfoCellVO.offsetBetween) && Intrinsics.d(this.serviceBadge, textInfoCellVO.serviceBadge);
    }

    public final long getId() {
        return this.id;
    }

    public final Icon getMarker() {
        return this.marker;
    }

    public final TextInfoCellDTO.MarkerAlignment getMarkerAlignment() {
        return this.markerAlignment;
    }

    public final Integer getOffsetBetween() {
        return this.offsetBetween;
    }

    public final BadgeDTO getServiceBadge() {
        return this.serviceBadge;
    }

    @NotNull
    public final TextAtom getText() {
        return this.text;
    }

    public final int getTopPadding() {
        return this.topPadding;
    }

    public int hashCode() {
        int a11 = C3532b.a(C2454a.a(this.topPadding, C2619v.b(Long.hashCode(this.id) * 31, 31, this.text), 31), 31, this.isCenteredText);
        Icon icon = this.marker;
        int hashCode = (a11 + (icon == null ? 0 : icon.hashCode())) * 31;
        TextInfoCellDTO.MarkerAlignment markerAlignment = this.markerAlignment;
        int hashCode2 = (hashCode + (markerAlignment == null ? 0 : markerAlignment.hashCode())) * 31;
        Integer num = this.offsetBetween;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        BadgeDTO badgeDTO = this.serviceBadge;
        return hashCode3 + (badgeDTO != null ? badgeDTO.hashCode() : 0);
    }

    /* renamed from: isCenteredText, reason: from getter */
    public final boolean getIsCenteredText() {
        return this.isCenteredText;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextAtom textAtom = this.text;
        int i11 = this.topPadding;
        boolean z11 = this.isCenteredText;
        Icon icon = this.marker;
        TextInfoCellDTO.MarkerAlignment markerAlignment = this.markerAlignment;
        Integer num = this.offsetBetween;
        BadgeDTO badgeDTO = this.serviceBadge;
        StringBuilder c11 = C2639a.c("TextInfoCellVO(id=", j11, ", text=", textAtom);
        c11.append(", topPadding=");
        c11.append(i11);
        c11.append(", isCenteredText=");
        c11.append(z11);
        c11.append(", marker=");
        c11.append(icon);
        c11.append(", markerAlignment=");
        c11.append(markerAlignment);
        c11.append(", offsetBetween=");
        c11.append(num);
        c11.append(", serviceBadge=");
        c11.append(badgeDTO);
        c11.append(")");
        return c11.toString();
    }
}
