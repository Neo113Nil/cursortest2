package ru.ozon.app.android.marketing.widgets.blackFridayStatus.presentation.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/marketing/widgets/blackFridayStatus/presentation/model/TimerWithTitleVO;", "", "Lru/ozon/app/android/marketing/widgets/blackFridayStatus/presentation/model/TimerVO;", DynamicElementDTO.TIMER, "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "titleOnExpire", "", "hideTimerOnExpire", "<init>", "(Lru/ozon/app/android/marketing/widgets/blackFridayStatus/presentation/model/TimerVO;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/marketing/widgets/blackFridayStatus/presentation/model/TimerVO;", "getTimer", "()Lru/ozon/app/android/marketing/widgets/blackFridayStatus/presentation/model/TimerVO;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitleOnExpire", "Z", "getHideTimerOnExpire", "()Z", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class TimerWithTitleVO {
    public static final int $stable = TextAtom.$stable;
    private final boolean hideTimerOnExpire;
    private final TimerVO timer;
    private final TextAtom title;
    private final TextAtom titleOnExpire;

    public TimerWithTitleVO(TimerVO timerVO, TextAtom textAtom, TextAtom textAtom2, boolean z11) {
        this.timer = timerVO;
        this.title = textAtom;
        this.titleOnExpire = textAtom2;
        this.hideTimerOnExpire = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimerWithTitleVO)) {
            return false;
        }
        TimerWithTitleVO timerWithTitleVO = (TimerWithTitleVO) other;
        return Intrinsics.d(this.timer, timerWithTitleVO.timer) && Intrinsics.d(this.title, timerWithTitleVO.title) && Intrinsics.d(this.titleOnExpire, timerWithTitleVO.titleOnExpire) && this.hideTimerOnExpire == timerWithTitleVO.hideTimerOnExpire;
    }

    public final boolean getHideTimerOnExpire() {
        return this.hideTimerOnExpire;
    }

    public final TimerVO getTimer() {
        return this.timer;
    }

    public final TextAtom getTitle() {
        return this.title;
    }

    public final TextAtom getTitleOnExpire() {
        return this.titleOnExpire;
    }

    public int hashCode() {
        TimerVO timerVO = this.timer;
        int hashCode = (timerVO == null ? 0 : timerVO.hashCode()) * 31;
        TextAtom textAtom = this.title;
        int hashCode2 = (hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        TextAtom textAtom2 = this.titleOnExpire;
        return Boolean.hashCode(this.hideTimerOnExpire) + ((hashCode2 + (textAtom2 != null ? textAtom2.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "TimerWithTitleVO(timer=" + this.timer + ", title=" + this.title + ", titleOnExpire=" + this.titleOnExpire + ", hideTimerOnExpire=" + this.hideTimerOnExpire + ")";
    }
}
