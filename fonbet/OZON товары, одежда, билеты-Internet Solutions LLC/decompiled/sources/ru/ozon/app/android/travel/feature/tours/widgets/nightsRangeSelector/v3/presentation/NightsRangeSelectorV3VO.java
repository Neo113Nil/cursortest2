package ru.ozon.app.android.travel.feature.tours.widgets.nightsRangeSelector.v3.presentation;

import De.C2859b;
import Ns.b;
import TY.a;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.sliderWithLabels.v2.SliderWithLabelsV2VO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002BI\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u000e\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f¢\u0006\u0004\b\u0011\u0010\u0012J`\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000fHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b&\u0010%R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b.\u0010/R\u001f\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00100\u001a\u0004\b1\u00102¨\u00063"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/nightsRangeSelector/v3/presentation/NightsRangeSelectorV3VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "subtitle", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "tagButton", "Lru/ozon/app/android/travel/molecules/view/sliderWithLabels/v2/SliderWithLabelsV2VO;", "sliderWithLabels", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "applyButton", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewEvent", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;Lru/ozon/app/android/travel/molecules/view/sliderWithLabels/v2/SliderWithLabelsV2VO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;LWZ/t;)V", "copy", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;Lru/ozon/app/android/travel/molecules/view/sliderWithLabels/v2/SliderWithLabelsV2VO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;LWZ/t;)Lru/ozon/app/android/travel/feature/tours/widgets/nightsRangeSelector/v3/presentation/NightsRangeSelectorV3VO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "getTagButton", "()Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "Lru/ozon/app/android/travel/molecules/view/sliderWithLabels/v2/SliderWithLabelsV2VO;", "getSliderWithLabels", "()Lru/ozon/app/android/travel/molecules/view/sliderWithLabels/v2/SliderWithLabelsV2VO;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getApplyButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "LWZ/t;", "getViewEvent", "()LWZ/t;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class NightsRangeSelectorV3VO implements c {

    @NotNull
    private final ButtonV3DTO applyButton;
    private final long id;

    @NotNull
    private final SliderWithLabelsV2VO sliderWithLabels;
    private final TextDTO subtitle;

    @NotNull
    private final TagButtonDTO tagButton;

    @NotNull
    private final TextDTO text;
    private final t viewEvent;

    public NightsRangeSelectorV3VO(long j11, @NotNull TextDTO text, TextDTO textDTO, @NotNull TagButtonDTO tagButton, @NotNull SliderWithLabelsV2VO sliderWithLabels, @NotNull ButtonV3DTO applyButton, t tVar) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(tagButton, "tagButton");
        Intrinsics.checkNotNullParameter(sliderWithLabels, "sliderWithLabels");
        Intrinsics.checkNotNullParameter(applyButton, "applyButton");
        this.id = j11;
        this.text = text;
        this.subtitle = textDTO;
        this.tagButton = tagButton;
        this.sliderWithLabels = sliderWithLabels;
        this.applyButton = applyButton;
        this.viewEvent = tVar;
    }

    public static /* synthetic */ NightsRangeSelectorV3VO copy$default(NightsRangeSelectorV3VO nightsRangeSelectorV3VO, long j11, TextDTO textDTO, TextDTO textDTO2, TagButtonDTO tagButtonDTO, SliderWithLabelsV2VO sliderWithLabelsV2VO, ButtonV3DTO buttonV3DTO, t tVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = nightsRangeSelectorV3VO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            textDTO = nightsRangeSelectorV3VO.text;
        }
        TextDTO textDTO3 = textDTO;
        if ((i11 & 4) != 0) {
            textDTO2 = nightsRangeSelectorV3VO.subtitle;
        }
        TextDTO textDTO4 = textDTO2;
        if ((i11 & 8) != 0) {
            tagButtonDTO = nightsRangeSelectorV3VO.tagButton;
        }
        TagButtonDTO tagButtonDTO2 = tagButtonDTO;
        if ((i11 & 16) != 0) {
            sliderWithLabelsV2VO = nightsRangeSelectorV3VO.sliderWithLabels;
        }
        return nightsRangeSelectorV3VO.copy(j12, textDTO3, textDTO4, tagButtonDTO2, sliderWithLabelsV2VO, (i11 & 32) != 0 ? nightsRangeSelectorV3VO.applyButton : buttonV3DTO, (i11 & 64) != 0 ? nightsRangeSelectorV3VO.viewEvent : tVar);
    }

    @NotNull
    public final NightsRangeSelectorV3VO copy(long id2, @NotNull TextDTO text, TextDTO subtitle, @NotNull TagButtonDTO tagButton, @NotNull SliderWithLabelsV2VO sliderWithLabels, @NotNull ButtonV3DTO applyButton, t viewEvent) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(tagButton, "tagButton");
        Intrinsics.checkNotNullParameter(sliderWithLabels, "sliderWithLabels");
        Intrinsics.checkNotNullParameter(applyButton, "applyButton");
        return new NightsRangeSelectorV3VO(id2, text, subtitle, tagButton, sliderWithLabels, applyButton, viewEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NightsRangeSelectorV3VO)) {
            return false;
        }
        NightsRangeSelectorV3VO nightsRangeSelectorV3VO = (NightsRangeSelectorV3VO) other;
        return this.id == nightsRangeSelectorV3VO.id && Intrinsics.d(this.text, nightsRangeSelectorV3VO.text) && Intrinsics.d(this.subtitle, nightsRangeSelectorV3VO.subtitle) && Intrinsics.d(this.tagButton, nightsRangeSelectorV3VO.tagButton) && Intrinsics.d(this.sliderWithLabels, nightsRangeSelectorV3VO.sliderWithLabels) && Intrinsics.d(this.applyButton, nightsRangeSelectorV3VO.applyButton) && Intrinsics.d(this.viewEvent, nightsRangeSelectorV3VO.viewEvent);
    }

    @NotNull
    public final ButtonV3DTO getApplyButton() {
        return this.applyButton;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final SliderWithLabelsV2VO getSliderWithLabels() {
        return this.sliderWithLabels;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TagButtonDTO getTagButton() {
        return this.tagButton;
    }

    @NotNull
    public final TextDTO getText() {
        return this.text;
    }

    public final t getViewEvent() {
        return this.viewEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = b.a(this.text, Long.hashCode(this.id) * 31, 31);
        TextDTO textDTO = this.subtitle;
        int c11 = C2859b.c(this.applyButton, (this.sliderWithLabels.hashCode() + ((this.tagButton.hashCode() + ((a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31)) * 31)) * 31, 31);
        t tVar = this.viewEvent;
        return c11 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.text;
        TextDTO textDTO2 = this.subtitle;
        TagButtonDTO tagButtonDTO = this.tagButton;
        SliderWithLabelsV2VO sliderWithLabelsV2VO = this.sliderWithLabels;
        ButtonV3DTO buttonV3DTO = this.applyButton;
        t tVar = this.viewEvent;
        StringBuilder b11 = a.b("NightsRangeSelectorV3VO(id=", j11, ", text=", textDTO);
        b11.append(", subtitle=");
        b11.append(textDTO2);
        b11.append(", tagButton=");
        b11.append(tagButtonDTO);
        b11.append(", sliderWithLabels=");
        b11.append(sliderWithLabelsV2VO);
        b11.append(", applyButton=");
        b11.append(buttonV3DTO);
        return Lh.a.b(b11, ", viewEvent=", tVar, ")");
    }
}
