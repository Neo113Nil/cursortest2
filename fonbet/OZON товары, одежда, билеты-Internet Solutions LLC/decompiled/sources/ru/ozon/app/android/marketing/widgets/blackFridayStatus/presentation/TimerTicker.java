package ru.ozon.app.android.marketing.widgets.blackFridayStatus.presentation;

import B90.N;
import Gy.a;
import Gy.b;
import Nc.C3667a;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import io.reactivex.p;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.C8488c;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import sc.C9653a;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0004BI\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u000b0\t\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0019R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u000b0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0019R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001aR\"\u0010\u001d\u001a\u0010\u0012\f\u0012\n \u001c*\u0004\u0018\u00018\u00008\u00000\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR8\u0010 \u001a&\u0012\f\u0012\n \u001c*\u0004\u0018\u00018\u00018\u0001 \u001c*\u0012\u0012\f\u0012\n \u001c*\u0004\u0018\u00018\u00018\u0001\u0018\u00010\u001f0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/marketing/widgets/blackFridayStatus/presentation/TimerTicker;", "", "T", "R", "Landroidx/lifecycle/DefaultLifecycleObserver;", "", "intervalMillis", "Landroidx/lifecycle/J;", "lifecycleOwner", "Lkotlin/Function1;", "transform", "", "timerResultListener", "", "isStatic", "<init>", "(JLandroidx/lifecycle/J;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Z)V", "owner", "onDestroy", "(Landroidx/lifecycle/J;)V", DynamicElementDTO.TIMER, "bind", "(Ljava/lang/Object;)V", "unbind", "()V", "Lkotlin/jvm/functions/Function1;", "Z", "LNc/a;", "kotlin.jvm.PlatformType", "timerHolder", "LNc/a;", "Lio/reactivex/p;", "ticker", "Lio/reactivex/p;", "Lnc/b;", "disposable", "Lnc/b;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TimerTicker<T, R> implements DefaultLifecycleObserver {

    @NotNull
    private InterfaceC8487b disposable;
    private final boolean isStatic;
    private final p<R> ticker;

    @NotNull
    private final C3667a<T> timerHolder;

    @NotNull
    private final Function1<R, Unit> timerResultListener;

    @NotNull
    private final Function1<T, R> transform;

    /* JADX WARN: Multi-variable type inference failed */
    public TimerTicker(long j11, @NotNull J lifecycleOwner, @NotNull Function1<? super T, ? extends R> transform, @NotNull Function1<? super R, Unit> timerResultListener, boolean z11) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Intrinsics.checkNotNullParameter(timerResultListener, "timerResultListener");
        this.transform = transform;
        this.timerResultListener = timerResultListener;
        this.isStatic = z11;
        C3667a<T> d11 = C3667a.d();
        Intrinsics.checkNotNullExpressionValue(d11, "create(...)");
        this.timerHolder = d11;
        this.ticker = p.interval(j11, TimeUnit.MILLISECONDS).withLatestFrom(d11, new N(new TimerTicker$ticker$1(this))).distinctUntilChanged().observeOn(C8125a.a());
        InterfaceC8487b a11 = C8488c.a(C9653a.f98522b);
        Intrinsics.checkNotNullExpressionValue(a11, "empty(...)");
        this.disposable = a11;
        lifecycleOwner.getLifecycle().a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object ticker$lambda$0(Function2 function2, Object p02, Object p12) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        return function2.invoke(p02, p12);
    }

    public final void bind(@NotNull T timer) {
        Intrinsics.checkNotNullParameter(timer, "timer");
        this.disposable.dispose();
        if (!this.isStatic) {
            this.disposable = this.ticker.subscribe(new a(this.timerResultListener, 10), new b(new TimerTicker$bind$1(Lm0.a.f17149a), 8));
        }
        this.timerResultListener.invoke(this.transform.invoke(timer));
        this.timerHolder.onNext(timer);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.disposable.dispose();
    }

    public final void unbind() {
        this.disposable.dispose();
    }

    public /* synthetic */ TimerTicker(long j11, J j12, Function1 function1, Function1 function12, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 1000L : j11, j12, function1, function12, z11);
    }
}
