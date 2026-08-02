package y0;

import androidx.recyclerview.widget.LinearLayoutManager;
import m0.InterfaceC8002m;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.pager.PagerState", f = "PagerState.kt", l = {605, 613}, m = "animateScrollToPage")
/* loaded from: classes8.dex */
final class T extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    b0 f105713d;

    /* renamed from: e, reason: collision with root package name */
    InterfaceC8002m f105714e;

    /* renamed from: f, reason: collision with root package name */
    int f105715f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f105716g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ b0 f105717h;

    /* renamed from: i, reason: collision with root package name */
    int f105718i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    T(b0 b0Var, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f105717h = b0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f105716g = obj;
        this.f105718i |= LinearLayoutManager.INVALID_OFFSET;
        return this.f105717h.l(0, null, this);
    }
}
