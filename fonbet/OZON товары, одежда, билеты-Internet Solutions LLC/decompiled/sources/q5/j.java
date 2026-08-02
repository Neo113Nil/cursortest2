package q5;

import androidx.recyclerview.widget.LinearLayoutManager;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "coil.intercept.RealInterceptorChain", f = "RealInterceptorChain.kt", l = {TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER}, m = "proceed")
/* loaded from: classes8.dex */
final class j extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    k f81698d;

    /* renamed from: e, reason: collision with root package name */
    i f81699e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f81700f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ k f81701g;

    /* renamed from: h, reason: collision with root package name */
    int f81702h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(k kVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f81701g = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f81700f = obj;
        this.f81702h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f81701g.e(null, this);
    }
}
