package ru.ozon.app.android.travel.feature.general.main.widgets.travelInput.presentation;

import De.C2859b;
import Lh.a;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.input.v2.CommonInputV2VO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u0012\u000e\u0010\u000b\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u001f\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010$R\u001f\u0010\u000b\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b%\u0010$¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/travelInput/presentation/TravelInputVI;", "Ll20/c;", "", "id", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;", "input", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "buttonClickEvent", "viewEvent", "<init>", "(JLru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;LWZ/t;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;", "getInput", "()Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "LWZ/t;", "getButtonClickEvent", "()LWZ/t;", "getViewEvent", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelInputVI implements c {

    @NotNull
    private final ButtonV3DTO button;
    private final t buttonClickEvent;
    private final long id;
    private final CommonInputV2VO.TextInputV2 input;
    private final t viewEvent;

    public TravelInputVI(long j11, CommonInputV2VO.TextInputV2 textInputV2, @NotNull ButtonV3DTO button, t tVar, t tVar2) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.id = j11;
        this.input = textInputV2;
        this.button = button;
        this.buttonClickEvent = tVar;
        this.viewEvent = tVar2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelInputVI)) {
            return false;
        }
        TravelInputVI travelInputVI = (TravelInputVI) other;
        return this.id == travelInputVI.id && Intrinsics.d(this.input, travelInputVI.input) && Intrinsics.d(this.button, travelInputVI.button) && Intrinsics.d(this.buttonClickEvent, travelInputVI.buttonClickEvent) && Intrinsics.d(this.viewEvent, travelInputVI.viewEvent);
    }

    @NotNull
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    public final t getButtonClickEvent() {
        return this.buttonClickEvent;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final CommonInputV2VO.TextInputV2 getInput() {
        return this.input;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
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
        CommonInputV2VO.TextInputV2 textInputV2 = this.input;
        int c11 = C2859b.c(this.button, (hashCode + (textInputV2 == null ? 0 : textInputV2.hashCode())) * 31, 31);
        t tVar = this.buttonClickEvent;
        int hashCode2 = (c11 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        t tVar2 = this.viewEvent;
        return hashCode2 + (tVar2 != null ? tVar2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        CommonInputV2VO.TextInputV2 textInputV2 = this.input;
        ButtonV3DTO buttonV3DTO = this.button;
        t tVar = this.buttonClickEvent;
        t tVar2 = this.viewEvent;
        StringBuilder sb2 = new StringBuilder("TravelInputVI(id=");
        sb2.append(j11);
        sb2.append(", input=");
        sb2.append(textInputV2);
        sb2.append(", button=");
        sb2.append(buttonV3DTO);
        sb2.append(", buttonClickEvent=");
        sb2.append(tVar);
        return a.b(sb2, ", viewEvent=", tVar2, ")");
    }
}
