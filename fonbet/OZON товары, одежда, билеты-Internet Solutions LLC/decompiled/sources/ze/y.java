package ze;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.channels.TickerChannelsKt", f = "TickerChannels.kt", l = {102, 104, 105}, m = "fixedDelayTicker")
/* loaded from: classes10.dex */
final class y extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    long f108963d;

    /* renamed from: e, reason: collision with root package name */
    x f108964e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f108965f;

    /* renamed from: g, reason: collision with root package name */
    int f108966g;

    y() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f108965f = obj;
        this.f108966g |= LinearLayoutManager.INVALID_OFFSET;
        return C11112B.a(0L, 0L, null, this);
    }
}
