package w1;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", f = "NestedScrollModifier.kt", l = {203}, m = "dispatchPreFling-QWom1Mo")
/* loaded from: classes.dex */
final class d extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f103335d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C10407b f103336e;

    /* renamed from: f, reason: collision with root package name */
    int f103337f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(C10407b c10407b, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f103336e = c10407b;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f103335d = obj;
        this.f103337f |= LinearLayoutManager.INVALID_OFFSET;
        return this.f103336e.c(0L, this);
    }
}
