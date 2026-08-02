package ru.ozon.app.android.travel.feature.avia.widgets.aviaAddBonusCardForm.presentation;

import De.C2859b;
import Ns.b;
import TY.a;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.input.v2.CommonInputV2VO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0081\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b#\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b+\u0010,R\u001f\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010-\u001a\u0004\b.\u0010/¨\u00060"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaAddBonusCardForm/presentation/AviaAddBonusCardFormVI;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$SelectorV2;", "airline", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;", "bonusCardNumber", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "actionButton", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewEvent", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$SelectorV2;Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$SelectorV2;", "getAirline", "()Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$SelectorV2;", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;", "getBonusCardNumber", "()Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getActionButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "LWZ/t;", "getViewEvent", "()LWZ/t;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AviaAddBonusCardFormVI implements c {

    @NotNull
    private final ButtonV3DTO actionButton;
    private final CommonInputV2VO.SelectorV2 airline;
    private final CommonInputV2VO.TextInputV2 bonusCardNumber;
    private final long id;
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;
    private final t viewEvent;

    public AviaAddBonusCardFormVI(long j11, @NotNull TextDTO title, TextDTO textDTO, CommonInputV2VO.SelectorV2 selectorV2, CommonInputV2VO.TextInputV2 textInputV2, @NotNull ButtonV3DTO actionButton, t tVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(actionButton, "actionButton");
        this.id = j11;
        this.title = title;
        this.subtitle = textDTO;
        this.airline = selectorV2;
        this.bonusCardNumber = textInputV2;
        this.actionButton = actionButton;
        this.viewEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AviaAddBonusCardFormVI)) {
            return false;
        }
        AviaAddBonusCardFormVI aviaAddBonusCardFormVI = (AviaAddBonusCardFormVI) other;
        return this.id == aviaAddBonusCardFormVI.id && Intrinsics.d(this.title, aviaAddBonusCardFormVI.title) && Intrinsics.d(this.subtitle, aviaAddBonusCardFormVI.subtitle) && Intrinsics.d(this.airline, aviaAddBonusCardFormVI.airline) && Intrinsics.d(this.bonusCardNumber, aviaAddBonusCardFormVI.bonusCardNumber) && Intrinsics.d(this.actionButton, aviaAddBonusCardFormVI.actionButton) && Intrinsics.d(this.viewEvent, aviaAddBonusCardFormVI.viewEvent);
    }

    @NotNull
    public final ButtonV3DTO getActionButton() {
        return this.actionButton;
    }

    public final CommonInputV2VO.SelectorV2 getAirline() {
        return this.airline;
    }

    public final CommonInputV2VO.TextInputV2 getBonusCardNumber() {
        return this.bonusCardNumber;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
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
        int a11 = b.a(this.title, Long.hashCode(this.id) * 31, 31);
        TextDTO textDTO = this.subtitle;
        int hashCode = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        CommonInputV2VO.SelectorV2 selectorV2 = this.airline;
        int hashCode2 = (hashCode + (selectorV2 == null ? 0 : selectorV2.hashCode())) * 31;
        CommonInputV2VO.TextInputV2 textInputV2 = this.bonusCardNumber;
        int c11 = C2859b.c(this.actionButton, (hashCode2 + (textInputV2 == null ? 0 : textInputV2.hashCode())) * 31, 31);
        t tVar = this.viewEvent;
        return c11 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        CommonInputV2VO.SelectorV2 selectorV2 = this.airline;
        CommonInputV2VO.TextInputV2 textInputV2 = this.bonusCardNumber;
        ButtonV3DTO buttonV3DTO = this.actionButton;
        t tVar = this.viewEvent;
        StringBuilder b11 = a.b("AviaAddBonusCardFormVI(id=", j11, ", title=", textDTO);
        b11.append(", subtitle=");
        b11.append(textDTO2);
        b11.append(", airline=");
        b11.append(selectorV2);
        b11.append(", bonusCardNumber=");
        b11.append(textInputV2);
        b11.append(", actionButton=");
        b11.append(buttonV3DTO);
        return Lh.a.b(b11, ", viewEvent=", tVar, ")");
    }
}
