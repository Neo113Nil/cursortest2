package ru.ozon.app.android.marketing.widgets.timerWidget.presentation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.marketing.widgets.timerWidget.data.TimerWidgetDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u001fB!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/marketing/widgets/timerWidget/presentation/TimerWidgetVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/marketing/widgets/timerWidget/presentation/TimerWidgetVO$TimerVO;", DynamicElementDTO.TIMER, "Lru/ozon/app/android/marketing/widgets/timerWidget/data/TimerWidgetDTO$PaddingOption;", "options", "<init>", "(JLru/ozon/app/android/marketing/widgets/timerWidget/presentation/TimerWidgetVO$TimerVO;Lru/ozon/app/android/marketing/widgets/timerWidget/data/TimerWidgetDTO$PaddingOption;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/marketing/widgets/timerWidget/presentation/TimerWidgetVO$TimerVO;", "getTimer", "()Lru/ozon/app/android/marketing/widgets/timerWidget/presentation/TimerWidgetVO$TimerVO;", "Lru/ozon/app/android/marketing/widgets/timerWidget/data/TimerWidgetDTO$PaddingOption;", "getOptions", "()Lru/ozon/app/android/marketing/widgets/timerWidget/data/TimerWidgetDTO$PaddingOption;", "TimerVO", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class TimerWidgetVO implements c {
    public static final int $stable = AtomAction.$stable;
    private final long id;
    private final TimerWidgetDTO.PaddingOption options;

    @NotNull
    private final TimerVO timer;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/marketing/widgets/timerWidget/presentation/TimerWidgetVO$TimerVO;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "", "timeLeft", "Lru/ozon/uni/atoms/af/AtomAction;", "actionOnExpire", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;JLru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "J", "getTimeLeft", "()J", "Lru/ozon/uni/atoms/af/AtomAction;", "getActionOnExpire", "()Lru/ozon/uni/atoms/af/AtomAction;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TimerVO {
        public static final int $stable = AtomAction.$stable;
        private final AtomAction actionOnExpire;

        @NotNull
        private final TextDTO text;
        private final long timeLeft;

        public TimerVO(@NotNull TextDTO text, long j11, AtomAction atomAction) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.timeLeft = j11;
            this.actionOnExpire = atomAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TimerVO)) {
                return false;
            }
            TimerVO timerVO = (TimerVO) other;
            return Intrinsics.d(this.text, timerVO.text) && this.timeLeft == timerVO.timeLeft && Intrinsics.d(this.actionOnExpire, timerVO.actionOnExpire);
        }

        public final AtomAction getActionOnExpire() {
            return this.actionOnExpire;
        }

        @NotNull
        public final TextDTO getText() {
            return this.text;
        }

        public final long getTimeLeft() {
            return this.timeLeft;
        }

        public int hashCode() {
            int a11 = Pk0.c.a(this.text.hashCode() * 31, 31, this.timeLeft);
            AtomAction atomAction = this.actionOnExpire;
            return a11 + (atomAction == null ? 0 : atomAction.hashCode());
        }

        @NotNull
        public String toString() {
            return "TimerVO(text=" + this.text + ", timeLeft=" + this.timeLeft + ", actionOnExpire=" + this.actionOnExpire + ")";
        }
    }

    public TimerWidgetVO(long j11, @NotNull TimerVO timer, TimerWidgetDTO.PaddingOption paddingOption) {
        Intrinsics.checkNotNullParameter(timer, "timer");
        this.id = j11;
        this.timer = timer;
        this.options = paddingOption;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimerWidgetVO)) {
            return false;
        }
        TimerWidgetVO timerWidgetVO = (TimerWidgetVO) other;
        return this.id == timerWidgetVO.id && Intrinsics.d(this.timer, timerWidgetVO.timer) && Intrinsics.d(this.options, timerWidgetVO.options);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final TimerWidgetDTO.PaddingOption getOptions() {
        return this.options;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final TimerVO getTimer() {
        return this.timer;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.timer.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        TimerWidgetDTO.PaddingOption paddingOption = this.options;
        return hashCode + (paddingOption == null ? 0 : paddingOption.hashCode());
    }

    @NotNull
    public String toString() {
        return "TimerWidgetVO(id=" + this.id + ", timer=" + this.timer + ", options=" + this.options + ")";
    }
}
