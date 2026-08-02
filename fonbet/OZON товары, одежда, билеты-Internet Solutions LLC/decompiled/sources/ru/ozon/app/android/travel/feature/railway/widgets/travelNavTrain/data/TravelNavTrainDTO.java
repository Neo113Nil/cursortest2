package ru.ozon.app.android.travel.feature.railway.widgets.travelNavTrain.data;

import Co.a;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelNavTrain/data/TravelNavTrainDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subTitle", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubTitle", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelNavTrainDTO {
    public static final int $stable = TextAtom.$stable;
    private final TextAtom subTitle;

    @NotNull
    private final TextAtom title;

    public TravelNavTrainDTO(@NotNull TextAtom title, TextAtom textAtom) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.subTitle = textAtom;
    }

    public static /* synthetic */ TravelNavTrainDTO copy$default(TravelNavTrainDTO travelNavTrainDTO, TextAtom textAtom, TextAtom textAtom2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = travelNavTrainDTO.title;
        }
        if ((i11 & 2) != 0) {
            textAtom2 = travelNavTrainDTO.subTitle;
        }
        return travelNavTrainDTO.copy(textAtom, textAtom2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final TextAtom getSubTitle() {
        return this.subTitle;
    }

    @NotNull
    public final TravelNavTrainDTO copy(@NotNull TextAtom title, TextAtom subTitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new TravelNavTrainDTO(title, subTitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelNavTrainDTO)) {
            return false;
        }
        TravelNavTrainDTO travelNavTrainDTO = (TravelNavTrainDTO) other;
        return Intrinsics.d(this.title, travelNavTrainDTO.title) && Intrinsics.d(this.subTitle, travelNavTrainDTO.subTitle);
    }

    public final TextAtom getSubTitle() {
        return this.subTitle;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        TextAtom textAtom = this.subTitle;
        return hashCode + (textAtom == null ? 0 : textAtom.hashCode());
    }

    @NotNull
    public String toString() {
        return a.a("TravelNavTrainDTO(title=", this.title, ", subTitle=", this.subTitle, ")");
    }
}
