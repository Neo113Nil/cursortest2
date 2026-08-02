package v0;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.functions.Function2;
import n0.EnumC8372M;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.lazy.LazyListState", f = "LazyListState.kt", l = {388, 389}, m = "scroll")
/* loaded from: classes.dex */
final class J extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    I f101504d;

    /* renamed from: e, reason: collision with root package name */
    EnumC8372M f101505e;

    /* renamed from: f, reason: collision with root package name */
    Function2 f101506f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f101507g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ I f101508h;

    /* renamed from: i, reason: collision with root package name */
    int f101509i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    J(I i11, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f101508h = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f101507g = obj;
        this.f101509i |= LinearLayoutManager.INVALID_OFFSET;
        return this.f101508h.d(null, null, this);
    }
}
