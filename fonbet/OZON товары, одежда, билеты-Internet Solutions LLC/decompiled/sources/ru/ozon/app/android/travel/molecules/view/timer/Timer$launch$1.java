package ru.ozon.app.android.travel.molecules.view.timer;

import Sc.r;
import Sc.s;
import Wc.a;
import android.content.Context;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.molecules.view.timer.Timer;
import xe.M;
import xe.N;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.molecules.view.timer.Timer$launch$1", f = "Timer.kt", l = {60}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class Timer$launch$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Timer.Listener $listener;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ Timer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Timer$launch$1(Timer timer, Timer.Listener listener, Context context, d<? super Timer$launch$1> dVar) {
        super(2, dVar);
        this.this$0 = timer;
        this.$listener = listener;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        Timer$launch$1 timer$launch$1 = new Timer$launch$1(this.this$0, this.$listener, this.$context, dVar);
        timer$launch$1.L$0 = obj;
        return timer$launch$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0050 A[Catch: all -> 0x0028, CancellationException -> 0x002b, TryCatch #2 {CancellationException -> 0x002b, all -> 0x0028, blocks: (B:6:0x0022, B:8:0x0091, B:10:0x0050, B:13:0x0058, B:15:0x005c, B:16:0x007a, B:22:0x0066, B:24:0x006a, B:25:0x0072, B:26:0x0093, B:28:0x0099, B:29:0x009c, B:39:0x0043), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0099 A[Catch: all -> 0x0028, CancellationException -> 0x002b, TryCatch #2 {CancellationException -> 0x002b, all -> 0x0028, blocks: (B:6:0x0022, B:8:0x0091, B:10:0x0050, B:13:0x0058, B:15:0x005c, B:16:0x007a, B:22:0x0066, B:24:0x006a, B:25:0x0072, B:26:0x0093, B:28:0x0099, B:29:0x009c, B:39:0x0043), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x008e -> B:7:0x0025). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a11;
        Throwable b11;
        Context context;
        M m11;
        Timer timer;
        int i11;
        int remainingSeconds;
        Timer.Listener listener;
        String formattedSeconds;
        String formattedMinutes;
        String formattedHours;
        a aVar = a.COROUTINE_SUSPENDED;
        int i12 = this.label;
        try {
        } catch (CancellationException e11) {
            throw e11;
        } catch (Throwable th2) {
            r.Companion companion = r.INSTANCE;
            a11 = s.a(th2);
        }
        if (i12 == 0) {
            s.b(obj);
            M m12 = (M) this.L$0;
            Timer timer2 = this.this$0;
            Timer.Listener listener2 = this.$listener;
            context = this.$context;
            r.Companion companion2 = r.INSTANCE;
            m11 = m12;
            timer = timer2;
            i11 = -1;
            remainingSeconds = timer2.getRemainingSeconds();
            listener = listener2;
            if (remainingSeconds > -1) {
            }
            if (N.f(m11)) {
            }
            a11 = Unit.f71690a;
            r.Companion companion3 = r.INSTANCE;
            b11 = r.b(a11);
            if (b11 != null) {
            }
            return Unit.f71690a;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        remainingSeconds = this.I$1;
        int i13 = this.I$0;
        context = (Context) this.L$3;
        listener = (Timer.Listener) this.L$2;
        timer = (Timer) this.L$1;
        m11 = (M) this.L$0;
        s.b(obj);
        i11 = i13;
        remainingSeconds--;
        if (remainingSeconds > -1 || !N.f(m11)) {
            if (N.f(m11)) {
                timer.callAction();
            }
            a11 = Unit.f71690a;
            r.Companion companion32 = r.INSTANCE;
            b11 = r.b(a11);
            if (b11 != null) {
                Lm0.a.f17149a.e(b11);
            }
            return Unit.f71690a;
        }
        if (remainingSeconds < 3600) {
            if (remainingSeconds < 60) {
                formattedSeconds = timer.getFormattedSeconds(context, remainingSeconds);
                listener.onNextTimeFrame(formattedSeconds);
            } else {
                i13 = remainingSeconds / 60;
                if (i13 != i11) {
                    formattedMinutes = timer.getFormattedMinutes(context, i13);
                    listener.onNextTimeFrame(formattedMinutes);
                    this.L$0 = m11;
                    this.L$1 = timer;
                    this.L$2 = listener;
                    this.L$3 = context;
                    this.I$0 = i13;
                    this.I$1 = remainingSeconds;
                    this.label = 1;
                    if (Y.b(1000L, this) == aVar) {
                        return aVar;
                    }
                    i11 = i13;
                    remainingSeconds--;
                }
            }
            i13 = i11;
            this.L$0 = m11;
            this.L$1 = timer;
            this.L$2 = listener;
            this.L$3 = context;
            this.I$0 = i13;
            this.I$1 = remainingSeconds;
            this.label = 1;
            if (Y.b(1000L, this) == aVar) {
            }
            i11 = i13;
            remainingSeconds--;
        } else {
            i13 = remainingSeconds / 3600;
            if (i13 != i11) {
                formattedHours = timer.getFormattedHours(context, i13);
                listener.onNextTimeFrame(formattedHours);
                this.L$0 = m11;
                this.L$1 = timer;
                this.L$2 = listener;
                this.L$3 = context;
                this.I$0 = i13;
                this.I$1 = remainingSeconds;
                this.label = 1;
                if (Y.b(1000L, this) == aVar) {
                }
                i11 = i13;
                remainingSeconds--;
            }
            i13 = i11;
            this.L$0 = m11;
            this.L$1 = timer;
            this.L$2 = listener;
            this.L$3 = context;
            this.I$0 = i13;
            this.I$1 = remainingSeconds;
            this.label = 1;
            if (Y.b(1000L, this) == aVar) {
            }
            i11 = i13;
            remainingSeconds--;
        }
        if (remainingSeconds > -1) {
        }
        if (N.f(m11)) {
        }
        a11 = Unit.f71690a;
        r.Companion companion322 = r.INSTANCE;
        b11 = r.b(a11);
        if (b11 != null) {
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((Timer$launch$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
