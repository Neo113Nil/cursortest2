package dZ;

import androidx.recyclerview.widget.LinearLayoutManager;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@e(c = "ru.ozon.cdn.chooser.internal.data.popreachability.PoPReachabilityRepositoryImpl", f = "PoPReachabilityRepositoryImpl.kt", l = {TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER}, m = "getPopOrNull")
/* loaded from: classes7.dex */
final class b extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f61437d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C6132a f61438e;

    /* renamed from: f, reason: collision with root package name */
    int f61439f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(C6132a c6132a, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f61438e = c6132a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f61437d = obj;
        this.f61439f |= LinearLayoutManager.INVALID_OFFSET;
        return this.f61438e.a(null, null, this);
    }
}
