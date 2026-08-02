package ru.ozon.app.android.regulardraw.utils;

import Ae.O0;
import Ae.x0;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001BI\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\n0\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00028\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\n0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/regulardraw/utils/TimerTicker;", "", "T", "R", "", "intervalMs", "Landroidx/lifecycle/J;", "lifecycleOwner", "Lkotlin/Function1;", "transform", "", "timerResultListener", "", "isStatic", "<init>", "(JLandroidx/lifecycle/J;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Z)V", "initTimer", "()V", DynamicElementDTO.TIMER, "bind", "(Ljava/lang/Object;)V", "unbind", "J", "Landroidx/lifecycle/J;", "Lkotlin/jvm/functions/Function1;", "Z", "LAe/x0;", "timerHolder", "LAe/x0;", "Lxe/B0;", "job", "Lxe/B0;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TimerTicker<T, R> {
    private final long intervalMs;
    private final boolean isStatic;
    private B0 job;

    @NotNull
    private final J lifecycleOwner;

    @NotNull
    private final x0<T> timerHolder;

    @NotNull
    private final Function1<R, Unit> timerResultListener;

    @NotNull
    private final Function1<T, R> transform;

    /* JADX WARN: Multi-variable type inference failed */
    public TimerTicker(long j11, @NotNull J lifecycleOwner, @NotNull Function1<? super T, ? extends R> transform, @NotNull Function1<? super R, Unit> timerResultListener, boolean z11) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Intrinsics.checkNotNullParameter(timerResultListener, "timerResultListener");
        this.intervalMs = j11;
        this.lifecycleOwner = lifecycleOwner;
        this.transform = transform;
        this.timerResultListener = timerResultListener;
        this.isStatic = z11;
        this.timerHolder = O0.a(null);
        initTimer();
    }

    private final void initTimer() {
        if (this.isStatic) {
            return;
        }
        C10727i.c(K.a(this.lifecycleOwner), null, null, new TimerTicker$initTimer$1(this, null), 3);
    }

    public final void bind(@NotNull T timer) {
        Intrinsics.checkNotNullParameter(timer, "timer");
        this.timerResultListener.invoke(this.transform.invoke(timer));
        this.timerHolder.setValue(timer);
    }

    public final void unbind() {
        B0 b02 = this.job;
        if (b02 != null) {
            b02.j(null);
        }
        this.job = null;
    }

    public /* synthetic */ TimerTicker(long j11, J j12, Function1 function1, Function1 function12, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 1000L : j11, j12, function1, function12, z11);
    }
}
