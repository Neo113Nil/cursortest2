package ru.ozon.app.android.travel.molecules.view.timer;

import G.g;
import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.ui.molecules.R$plurals;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import xe.B0;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u00018BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u0016J)\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u00062\b\b\u0001\u0010\u001c\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010!\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u000e¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\u000e¢\u0006\u0004\b(\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u00102R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00103R\"\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00104R\u0018\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107¨\u00069"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/timer/Timer;", "", "Lxe/M;", "timerScope", "", "prefix", "", "remainingSeconds", "", "startTime", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Lxe/M;Ljava/lang/String;IJLru/ozon/uni/atoms/data/AtomActionDTO;Lkotlin/jvm/functions/Function1;)V", "Landroid/content/Context;", "context", "hours", "getFormattedHours", "(Landroid/content/Context;I)Ljava/lang/String;", "minutes", "getFormattedMinutes", "seconds", "getFormattedSeconds", "timeAmount", "resId", "getFormattedTime", "(Landroid/content/Context;II)Ljava/lang/String;", "Lru/ozon/app/android/travel/molecules/view/timer/Timer$Listener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "launch", "(Landroid/content/Context;Lru/ozon/app/android/travel/molecules/view/timer/Timer$Listener;)V", "callAction", "()V", "", "isRunning", "()Ljava/lang/Boolean;", "stop", "Lxe/M;", "Ljava/lang/String;", "I", "getRemainingSeconds", "()I", "setRemainingSeconds", "(I)V", "J", "getStartTime", "()J", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "Lkotlin/jvm/functions/Function1;", "Lxe/B0;", "job", "Lxe/B0;", "Listener", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Timer {
    private final AtomActionDTO action;
    private final Function1<AtomAction, Unit> actionHandler;
    private B0 job;

    @NotNull
    private final String prefix;
    private int remainingSeconds;
    private final long startTime;

    @NotNull
    private final M timerScope;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/timer/Timer$Listener;", "", "onNextTimeFrame", "", "formattedTime", "", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Listener {
        void onNextTimeFrame(@NotNull String formattedTime);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Timer(@NotNull M timerScope, @NotNull String prefix, int i11, long j11, AtomActionDTO atomActionDTO, Function1<? super AtomAction, Unit> function1) {
        Intrinsics.checkNotNullParameter(timerScope, "timerScope");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        this.timerScope = timerScope;
        this.prefix = prefix;
        this.remainingSeconds = i11;
        this.startTime = j11;
        this.action = atomActionDTO;
        this.actionHandler = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getFormattedHours(Context context, int hours) {
        return getFormattedTime(context, hours, R$plurals.timer_hours);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getFormattedMinutes(Context context, int minutes) {
        return getFormattedTime(context, minutes, R$plurals.timer_minutes_android);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getFormattedSeconds(Context context, int seconds) {
        return getFormattedTime(context, seconds, R$plurals.timer_seconds_android);
    }

    private final String getFormattedTime(Context context, int timeAmount, int resId) {
        String quantityString = context.getResources().getQuantityString(resId, (timeAmount % 10 != 1 || timeAmount % 11 == 0) ? 2 : 1, Integer.valueOf(timeAmount));
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        return g.c(this.prefix, " ", quantityString);
    }

    public final void callAction() {
        AtomAction atomAction;
        Function1<AtomAction, Unit> function1;
        AtomActionDTO atomActionDTO = this.action;
        if (atomActionDTO == null || (atomAction = AtomActionMapperKt.toAtomAction(atomActionDTO, null)) == null || (function1 = this.actionHandler) == null) {
            return;
        }
        function1.invoke(atomAction);
    }

    public final int getRemainingSeconds() {
        return this.remainingSeconds;
    }

    public final Boolean isRunning() {
        B0 b02 = this.job;
        if (b02 != null) {
            return Boolean.valueOf(b02.isActive());
        }
        return null;
    }

    public final void launch(@NotNull Context context, @NotNull Listener listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (this.remainingSeconds < 0) {
            listener.onNextTimeFrame(this.prefix);
        } else {
            this.job = C10727i.c(this.timerScope, null, null, new Timer$launch$1(this, listener, context, null), 3);
        }
    }

    public final void stop() {
        B0 b02 = this.job;
        if (b02 != null) {
            b02.j(null);
        }
        this.job = null;
    }
}
