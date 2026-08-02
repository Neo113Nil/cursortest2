package ru.ozon.app.android.marketing.widgets.wannaDiscountDecision.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.badge.TimerBadge;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/marketing/widgets/wannaDiscountDecision/data/TimerBlock;", "", "text", "Lru/ozon/uni/atoms/data/texts/TextAtom;", DynamicElementDTO.TIMER, "Lru/ozon/app/android/atoms/data/badge/TimerBadge;", "discountExpired", "Lru/ozon/app/android/marketing/widgets/wannaDiscountDecision/data/DiscountExpired;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/atoms/data/badge/TimerBadge;Lru/ozon/app/android/marketing/widgets/wannaDiscountDecision/data/DiscountExpired;)V", "getText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTimer", "()Lru/ozon/app/android/atoms/data/badge/TimerBadge;", "getDiscountExpired", "()Lru/ozon/app/android/marketing/widgets/wannaDiscountDecision/data/DiscountExpired;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class TimerBlock {
    public static final int $stable = 8;

    @NotNull
    private final DiscountExpired discountExpired;

    @NotNull
    private final TextAtom text;

    @NotNull
    private final TimerBadge timer;

    public TimerBlock(@NotNull TextAtom text, @NotNull TimerBadge timer, @NotNull DiscountExpired discountExpired) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(timer, "timer");
        Intrinsics.checkNotNullParameter(discountExpired, "discountExpired");
        this.text = text;
        this.timer = timer;
        this.discountExpired = discountExpired;
    }

    public static /* synthetic */ TimerBlock copy$default(TimerBlock timerBlock, TextAtom textAtom, TimerBadge timerBadge, DiscountExpired discountExpired, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = timerBlock.text;
        }
        if ((i11 & 2) != 0) {
            timerBadge = timerBlock.timer;
        }
        if ((i11 & 4) != 0) {
            discountExpired = timerBlock.discountExpired;
        }
        return timerBlock.copy(textAtom, timerBadge, discountExpired);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getText() {
        return this.text;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TimerBadge getTimer() {
        return this.timer;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final DiscountExpired getDiscountExpired() {
        return this.discountExpired;
    }

    @NotNull
    public final TimerBlock copy(@NotNull TextAtom text, @NotNull TimerBadge timer, @NotNull DiscountExpired discountExpired) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(timer, "timer");
        Intrinsics.checkNotNullParameter(discountExpired, "discountExpired");
        return new TimerBlock(text, timer, discountExpired);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimerBlock)) {
            return false;
        }
        TimerBlock timerBlock = (TimerBlock) other;
        return Intrinsics.d(this.text, timerBlock.text) && Intrinsics.d(this.timer, timerBlock.timer) && Intrinsics.d(this.discountExpired, timerBlock.discountExpired);
    }

    @NotNull
    public final DiscountExpired getDiscountExpired() {
        return this.discountExpired;
    }

    @NotNull
    public final TextAtom getText() {
        return this.text;
    }

    @NotNull
    public final TimerBadge getTimer() {
        return this.timer;
    }

    public int hashCode() {
        return this.discountExpired.hashCode() + ((this.timer.hashCode() + (this.text.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "TimerBlock(text=" + this.text + ", timer=" + this.timer + ", discountExpired=" + this.discountExpired + ")";
    }
}
