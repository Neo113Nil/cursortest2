package ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.tariff;

import Ns.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.aspect.AspectDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ:\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001f\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/tariff/AdditionalServicesTariffAspectVO;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/tariff/AdditionalServicesTariffItemVO;", "", "id", "Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "aspect", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "<init>", "(ILru/ozon/uni/atoms/data/aspect/AspectDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "copy", "(ILru/ozon/uni/atoms/data/aspect/AspectDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/tariff/AdditionalServicesTariffAspectVO;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "getAspect", "()Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AdditionalServicesTariffAspectVO implements AdditionalServicesTariffItemVO {

    @NotNull
    private final AspectDTO aspect;
    private final int id;
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;

    public AdditionalServicesTariffAspectVO(int i11, @NotNull AspectDTO aspect, @NotNull TextDTO title, TextDTO textDTO) {
        Intrinsics.checkNotNullParameter(aspect, "aspect");
        Intrinsics.checkNotNullParameter(title, "title");
        this.id = i11;
        this.aspect = aspect;
        this.title = title;
        this.subtitle = textDTO;
    }

    public static /* synthetic */ AdditionalServicesTariffAspectVO copy$default(AdditionalServicesTariffAspectVO additionalServicesTariffAspectVO, int i11, AspectDTO aspectDTO, TextDTO textDTO, TextDTO textDTO2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = additionalServicesTariffAspectVO.id;
        }
        if ((i12 & 2) != 0) {
            aspectDTO = additionalServicesTariffAspectVO.aspect;
        }
        if ((i12 & 4) != 0) {
            textDTO = additionalServicesTariffAspectVO.title;
        }
        if ((i12 & 8) != 0) {
            textDTO2 = additionalServicesTariffAspectVO.subtitle;
        }
        return additionalServicesTariffAspectVO.copy(i11, aspectDTO, textDTO, textDTO2);
    }

    @NotNull
    public final AdditionalServicesTariffAspectVO copy(int id2, @NotNull AspectDTO aspect, @NotNull TextDTO title, TextDTO subtitle) {
        Intrinsics.checkNotNullParameter(aspect, "aspect");
        Intrinsics.checkNotNullParameter(title, "title");
        return new AdditionalServicesTariffAspectVO(id2, aspect, title, subtitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdditionalServicesTariffAspectVO)) {
            return false;
        }
        AdditionalServicesTariffAspectVO additionalServicesTariffAspectVO = (AdditionalServicesTariffAspectVO) other;
        return this.id == additionalServicesTariffAspectVO.id && Intrinsics.d(this.aspect, additionalServicesTariffAspectVO.aspect) && Intrinsics.d(this.title, additionalServicesTariffAspectVO.title) && Intrinsics.d(this.subtitle, additionalServicesTariffAspectVO.subtitle);
    }

    @NotNull
    public final AspectDTO getAspect() {
        return this.aspect;
    }

    @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.tariff.AdditionalServicesTariffItemVO
    public int getId() {
        return this.id;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        int a11 = b.a(this.title, (this.aspect.hashCode() + (Integer.hashCode(this.id) * 31)) * 31, 31);
        TextDTO textDTO = this.subtitle;
        return a11 + (textDTO == null ? 0 : textDTO.hashCode());
    }

    @NotNull
    public String toString() {
        return "AdditionalServicesTariffAspectVO(id=" + this.id + ", aspect=" + this.aspect + ", title=" + this.title + ", subtitle=" + this.subtitle + ")";
    }
}
