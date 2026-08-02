package ru.ozon.app.android.marketing.common.timer;

import Lm0.a;
import Nc.C3667a;
import androidx.lifecycle.J;
import cz.C5979a;
import io.reactivex.p;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.utils.rx.RxExtKt;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001BI\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\n0\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00028\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\n0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0019R\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n \u001b*\u0004\u0018\u00018\u00008\u00000\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/marketing/common/timer/TimerWidgetTicker;", "", "T", "R", "", "intervalMs", "Landroidx/lifecycle/J;", "lifecycleOwner", "Lkotlin/Function1;", "transform", "", "timerResultListener", "", "isStatic", "<init>", "(JLandroidx/lifecycle/J;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Z)V", "createTimer", "()V", DynamicElementDTO.TIMER, "bind", "(Ljava/lang/Object;)V", "unbind", "J", "Landroidx/lifecycle/J;", "Lkotlin/jvm/functions/Function1;", "Z", "LNc/a;", "kotlin.jvm.PlatformType", "timerHolder", "LNc/a;", "Lnc/b;", "disposable", "Lnc/b;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TimerWidgetTicker<T, R> {
    private InterfaceC8487b disposable;
    private final long intervalMs;
    private final boolean isStatic;

    @NotNull
    private final J lifecycleOwner;

    @NotNull
    private final C3667a<T> timerHolder;

    @NotNull
    private final Function1<R, Unit> timerResultListener;

    @NotNull
    private final Function1<T, R> transform;

    /* JADX WARN: Multi-variable type inference failed */
    public TimerWidgetTicker(long j11, @NotNull J lifecycleOwner, @NotNull Function1<? super T, ? extends R> transform, @NotNull Function1<? super R, Unit> timerResultListener, boolean z11) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Intrinsics.checkNotNullParameter(timerResultListener, "timerResultListener");
        this.intervalMs = j11;
        this.lifecycleOwner = lifecycleOwner;
        this.transform = transform;
        this.timerResultListener = timerResultListener;
        this.isStatic = z11;
        C3667a<T> d11 = C3667a.d();
        Intrinsics.checkNotNullExpressionValue(d11, "create(...)");
        this.timerHolder = d11;
        createTimer();
    }

    private final void createTimer() {
        if (this.isStatic) {
            return;
        }
        p<R> observeOn = p.interval(this.intervalMs, TimeUnit.MILLISECONDS).withLatestFrom(this.timerHolder, new C5979a(new TimerWidgetTicker$createTimer$1(this))).distinctUntilChanged().observeOn(C8125a.a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "observeOn(...)");
        this.disposable = RxExtKt.observe$default(observeOn, this.lifecycleOwner, new TimerWidgetTicker$createTimer$2(this.timerResultListener), new TimerWidgetTicker$createTimer$3(a.f17149a), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object createTimer$lambda$0(Function2 function2, Object p02, Object p12) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        return function2.invoke(p02, p12);
    }

    public final void bind(@NotNull T timer) {
        Intrinsics.checkNotNullParameter(timer, "timer");
        this.timerResultListener.invoke(this.transform.invoke(timer));
        this.timerHolder.onNext(timer);
    }

    public final void unbind() {
        InterfaceC8487b interfaceC8487b = this.disposable;
        if (interfaceC8487b != null) {
            interfaceC8487b.dispose();
        }
    }

    public /* synthetic */ TimerWidgetTicker(long j11, J j12, Function1 function1, Function1 function12, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 1000L : j11, j12, function1, function12, z11);
    }
}
