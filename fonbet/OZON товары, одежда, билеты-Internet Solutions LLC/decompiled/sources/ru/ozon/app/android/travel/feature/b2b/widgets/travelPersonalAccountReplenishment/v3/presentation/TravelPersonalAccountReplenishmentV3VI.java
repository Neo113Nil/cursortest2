package ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v3.presentation;

import De.C2859b;
import G.g;
import TY.a;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.input.v2.CommonInputV2VO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0081\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u000e\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b&\u0010%R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010)R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00100\u001a\u0004\b1\u00102R\u001f\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00103\u001a\u0004\b4\u00105¨\u00066"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v3/presentation/TravelPersonalAccountReplenishmentV3VI;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;", "input", "", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "inputVariants", "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", SelectionItemFormDTO.DISCLAIMER_FIELD_NAME, "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "submitButton", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewEvent", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;Ljava/util/List;Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;", "getInput", "()Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;", "Ljava/util/List;", "getInputVariants", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "getDisclaimer", "()Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getSubmitButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "LWZ/t;", "getViewEvent", "()LWZ/t;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TravelPersonalAccountReplenishmentV3VI implements c {
    private final DisclaimerDTO disclaimer;
    private final long id;
    private final CommonInputV2VO.TextInputV2 input;

    @NotNull
    private final List<TagButtonDTO> inputVariants;

    @NotNull
    private final ButtonV3DTO submitButton;
    private final TextDTO subtitle;
    private final TextDTO title;
    private final t viewEvent;

    public TravelPersonalAccountReplenishmentV3VI(long j11, TextDTO textDTO, TextDTO textDTO2, CommonInputV2VO.TextInputV2 textInputV2, @NotNull List<TagButtonDTO> inputVariants, DisclaimerDTO disclaimerDTO, @NotNull ButtonV3DTO submitButton, t tVar) {
        Intrinsics.checkNotNullParameter(inputVariants, "inputVariants");
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        this.id = j11;
        this.title = textDTO;
        this.subtitle = textDTO2;
        this.input = textInputV2;
        this.inputVariants = inputVariants;
        this.disclaimer = disclaimerDTO;
        this.submitButton = submitButton;
        this.viewEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelPersonalAccountReplenishmentV3VI)) {
            return false;
        }
        TravelPersonalAccountReplenishmentV3VI travelPersonalAccountReplenishmentV3VI = (TravelPersonalAccountReplenishmentV3VI) other;
        return this.id == travelPersonalAccountReplenishmentV3VI.id && Intrinsics.d(this.title, travelPersonalAccountReplenishmentV3VI.title) && Intrinsics.d(this.subtitle, travelPersonalAccountReplenishmentV3VI.subtitle) && Intrinsics.d(this.input, travelPersonalAccountReplenishmentV3VI.input) && Intrinsics.d(this.inputVariants, travelPersonalAccountReplenishmentV3VI.inputVariants) && Intrinsics.d(this.disclaimer, travelPersonalAccountReplenishmentV3VI.disclaimer) && Intrinsics.d(this.submitButton, travelPersonalAccountReplenishmentV3VI.submitButton) && Intrinsics.d(this.viewEvent, travelPersonalAccountReplenishmentV3VI.viewEvent);
    }

    public final DisclaimerDTO getDisclaimer() {
        return this.disclaimer;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final CommonInputV2VO.TextInputV2 getInput() {
        return this.input;
    }

    @NotNull
    public final List<TagButtonDTO> getInputVariants() {
        return this.inputVariants;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final ButtonV3DTO getSubmitButton() {
        return this.submitButton;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    public final TextDTO getTitle() {
        return this.title;
    }

    public final t getViewEvent() {
        return this.viewEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        TextDTO textDTO = this.title;
        int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        TextDTO textDTO2 = this.subtitle;
        int hashCode3 = (hashCode2 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
        CommonInputV2VO.TextInputV2 textInputV2 = this.input;
        int b11 = g.b((hashCode3 + (textInputV2 == null ? 0 : textInputV2.hashCode())) * 31, 31, this.inputVariants);
        DisclaimerDTO disclaimerDTO = this.disclaimer;
        int c11 = C2859b.c(this.submitButton, (b11 + (disclaimerDTO == null ? 0 : disclaimerDTO.hashCode())) * 31, 31);
        t tVar = this.viewEvent;
        return c11 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        CommonInputV2VO.TextInputV2 textInputV2 = this.input;
        List<TagButtonDTO> list = this.inputVariants;
        DisclaimerDTO disclaimerDTO = this.disclaimer;
        ButtonV3DTO buttonV3DTO = this.submitButton;
        t tVar = this.viewEvent;
        StringBuilder b11 = a.b("TravelPersonalAccountReplenishmentV3VI(id=", j11, ", title=", textDTO);
        b11.append(", subtitle=");
        b11.append(textDTO2);
        b11.append(", input=");
        b11.append(textInputV2);
        b11.append(", inputVariants=");
        b11.append(list);
        b11.append(", disclaimer=");
        b11.append(disclaimerDTO);
        b11.append(", submitButton=");
        b11.append(buttonV3DTO);
        b11.append(", viewEvent=");
        b11.append(tVar);
        b11.append(")");
        return b11.toString();
    }
}
