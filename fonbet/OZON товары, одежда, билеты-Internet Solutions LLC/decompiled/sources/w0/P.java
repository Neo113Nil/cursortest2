package w0;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.functions.Function2;
import n0.EnumC8372M;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.lazy.grid.LazyGridState", f = "LazyGridState.kt", l = {370, 371}, m = "scroll")
/* loaded from: classes8.dex */
final class P extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    O f103236d;

    /* renamed from: e, reason: collision with root package name */
    EnumC8372M f103237e;

    /* renamed from: f, reason: collision with root package name */
    Function2 f103238f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f103239g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ O f103240h;

    /* renamed from: i, reason: collision with root package name */
    int f103241i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    P(O o11, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f103240h = o11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f103239g = obj;
        this.f103241i |= LinearLayoutManager.INVALID_OFFSET;
        return this.f103240h.d(null, null, this);
    }
}
