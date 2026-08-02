package ru.ozon.app.android.fresh.unsorted.widgets.swapButton.presentation;

import De.C2859b;
import F3.G;
import Lh.a;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002BA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u0012\u000e\u0010\u000b\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u001f\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"R\u001f\u0010\u000b\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b#\u0010\"¨\u0006$"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/swapButton/presentation/SwapButtonVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "firstButton", "secondButton", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "firstButtonClickEvent", "secondButtonClickEvent", "<init>", "(JLru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;LWZ/t;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getFirstButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getSecondButton", "LWZ/t;", "getFirstButtonClickEvent", "()LWZ/t;", "getSecondButtonClickEvent", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SwapButtonVO implements c {

    @NotNull
    private final ButtonV3DTO firstButton;
    private final t firstButtonClickEvent;
    private final long id;
    private final ButtonV3DTO secondButton;
    private final t secondButtonClickEvent;

    public SwapButtonVO(long j11, @NotNull ButtonV3DTO firstButton, ButtonV3DTO buttonV3DTO, t tVar, t tVar2) {
        Intrinsics.checkNotNullParameter(firstButton, "firstButton");
        this.id = j11;
        this.firstButton = firstButton;
        this.secondButton = buttonV3DTO;
        this.firstButtonClickEvent = tVar;
        this.secondButtonClickEvent = tVar2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SwapButtonVO)) {
            return false;
        }
        SwapButtonVO swapButtonVO = (SwapButtonVO) other;
        return this.id == swapButtonVO.id && Intrinsics.d(this.firstButton, swapButtonVO.firstButton) && Intrinsics.d(this.secondButton, swapButtonVO.secondButton) && Intrinsics.d(this.firstButtonClickEvent, swapButtonVO.firstButtonClickEvent) && Intrinsics.d(this.secondButtonClickEvent, swapButtonVO.secondButtonClickEvent);
    }

    @NotNull
    public final ButtonV3DTO getFirstButton() {
        return this.firstButton;
    }

    public final t getFirstButtonClickEvent() {
        return this.firstButtonClickEvent;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final ButtonV3DTO getSecondButton() {
        return this.secondButton;
    }

    public final t getSecondButtonClickEvent() {
        return this.secondButtonClickEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int c11 = C2859b.c(this.firstButton, Long.hashCode(this.id) * 31, 31);
        ButtonV3DTO buttonV3DTO = this.secondButton;
        int hashCode = (c11 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
        t tVar = this.firstButtonClickEvent;
        int hashCode2 = (hashCode + (tVar == null ? 0 : tVar.hashCode())) * 31;
        t tVar2 = this.secondButtonClickEvent;
        return hashCode2 + (tVar2 != null ? tVar2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        ButtonV3DTO buttonV3DTO = this.firstButton;
        ButtonV3DTO buttonV3DTO2 = this.secondButton;
        t tVar = this.firstButtonClickEvent;
        t tVar2 = this.secondButtonClickEvent;
        StringBuilder c11 = G.c("SwapButtonVO(id=", j11, ", firstButton=", buttonV3DTO);
        c11.append(", secondButton=");
        c11.append(buttonV3DTO2);
        c11.append(", firstButtonClickEvent=");
        c11.append(tVar);
        return a.b(c11, ", secondButtonClickEvent=", tVar2, ")");
    }
}
