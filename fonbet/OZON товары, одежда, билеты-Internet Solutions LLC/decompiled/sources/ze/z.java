package ze;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.channels.TickerChannelsKt", f = "TickerChannels.kt", l = {80, 84, 90, 92}, m = "fixedPeriodTicker")
/* loaded from: classes10.dex */
final class z extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    long f108967d;

    /* renamed from: e, reason: collision with root package name */
    long f108968e;

    /* renamed from: f, reason: collision with root package name */
    x f108969f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f108970g;

    /* renamed from: h, reason: collision with root package name */
    int f108971h;

    z() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f108970g = obj;
        this.f108971h |= LinearLayoutManager.INVALID_OFFSET;
        return C11112B.b(0L, 0L, null, this);
    }
}
