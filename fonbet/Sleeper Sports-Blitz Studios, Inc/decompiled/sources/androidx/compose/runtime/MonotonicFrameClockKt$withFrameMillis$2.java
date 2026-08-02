package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.objectweb.asm.Opcodes;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: MonotonicFrameClock.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = Opcodes.ARETURN)
/* loaded from: classes4.dex */
public final class MonotonicFrameClockKt$withFrameMillis$2<R> implements Function1<Long, R> {
    final /* synthetic */ Function1<Long, R> $onFrame;

    /* JADX WARN: Multi-variable type inference failed */
    public MonotonicFrameClockKt$withFrameMillis$2(Function1<? super Long, ? extends R> function1) {
        this.$onFrame = function1;
    }

    public final R invoke(long j) {
        return this.$onFrame.invoke(Long.valueOf(j / 1000000));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Long l) {
        return invoke(l.longValue());
    }
}
