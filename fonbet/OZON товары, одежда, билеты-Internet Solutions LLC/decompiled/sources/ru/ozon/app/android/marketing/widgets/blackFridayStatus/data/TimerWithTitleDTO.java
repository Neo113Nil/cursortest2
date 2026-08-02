package ru.ozon.app.android.marketing.widgets.blackFridayStatus.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/marketing/widgets/blackFridayStatus/data/TimerWithTitleDTO;", "", DynamicElementDTO.TIMER, "Lru/ozon/app/android/marketing/widgets/blackFridayStatus/data/TimerDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "titleOnExpire", "hideTimerOnExpire", "", "<init>", "(Lru/ozon/app/android/marketing/widgets/blackFridayStatus/data/TimerDTO;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Z)V", "getTimer", "()Lru/ozon/app/android/marketing/widgets/blackFridayStatus/data/TimerDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitleOnExpire", "getHideTimerOnExpire", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class TimerWithTitleDTO {
    public static final int $stable = TextAtom.$stable;
    private final boolean hideTimerOnExpire;
    private final TimerDTO timer;
    private final TextAtom title;
    private final TextAtom titleOnExpire;

    public TimerWithTitleDTO() {
        this(null, null, null, false, 15, null);
    }

    public static /* synthetic */ TimerWithTitleDTO copy$default(TimerWithTitleDTO timerWithTitleDTO, TimerDTO timerDTO, TextAtom textAtom, TextAtom textAtom2, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            timerDTO = timerWithTitleDTO.timer;
        }
        if ((i11 & 2) != 0) {
            textAtom = timerWithTitleDTO.title;
        }
        if ((i11 & 4) != 0) {
            textAtom2 = timerWithTitleDTO.titleOnExpire;
        }
        if ((i11 & 8) != 0) {
            z11 = timerWithTitleDTO.hideTimerOnExpire;
        }
        return timerWithTitleDTO.copy(timerDTO, textAtom, textAtom2, z11);
    }

    /* renamed from: component1, reason: from getter */
    public final TimerDTO getTimer() {
        return this.timer;
    }

    /* renamed from: component2, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final TextAtom getTitleOnExpire() {
        return this.titleOnExpire;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getHideTimerOnExpire() {
        return this.hideTimerOnExpire;
    }

    @NotNull
    public final TimerWithTitleDTO copy(TimerDTO timer, TextAtom title, TextAtom titleOnExpire, boolean hideTimerOnExpire) {
        return new TimerWithTitleDTO(timer, title, titleOnExpire, hideTimerOnExpire);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimerWithTitleDTO)) {
            return false;
        }
        TimerWithTitleDTO timerWithTitleDTO = (TimerWithTitleDTO) other;
        return Intrinsics.d(this.timer, timerWithTitleDTO.timer) && Intrinsics.d(this.title, timerWithTitleDTO.title) && Intrinsics.d(this.titleOnExpire, timerWithTitleDTO.titleOnExpire) && this.hideTimerOnExpire == timerWithTitleDTO.hideTimerOnExpire;
    }

    public final boolean getHideTimerOnExpire() {
        return this.hideTimerOnExpire;
    }

    public final TimerDTO getTimer() {
        return this.timer;
    }

    public final TextAtom getTitle() {
        return this.title;
    }

    public final TextAtom getTitleOnExpire() {
        return this.titleOnExpire;
    }

    public int hashCode() {
        TimerDTO timerDTO = this.timer;
        int hashCode = (timerDTO == null ? 0 : timerDTO.hashCode()) * 31;
        TextAtom textAtom = this.title;
        int hashCode2 = (hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        TextAtom textAtom2 = this.titleOnExpire;
        return Boolean.hashCode(this.hideTimerOnExpire) + ((hashCode2 + (textAtom2 != null ? textAtom2.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "TimerWithTitleDTO(timer=" + this.timer + ", title=" + this.title + ", titleOnExpire=" + this.titleOnExpire + ", hideTimerOnExpire=" + this.hideTimerOnExpire + ")";
    }

    public TimerWithTitleDTO(TimerDTO timerDTO, TextAtom textAtom, TextAtom textAtom2, boolean z11) {
        this.timer = timerDTO;
        this.title = textAtom;
        this.titleOnExpire = textAtom2;
        this.hideTimerOnExpire = z11;
    }

    public /* synthetic */ TimerWithTitleDTO(TimerDTO timerDTO, TextAtom textAtom, TextAtom textAtom2, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : timerDTO, (i11 & 2) != 0 ? null : textAtom, (i11 & 4) != 0 ? null : textAtom2, (i11 & 8) != 0 ? false : z11);
    }
}
