package w1;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", f = "NestedScrollModifier.kt", l = {218}, m = "dispatchPostFling-RZ2iAVY")
/* renamed from: w1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C10408c extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f103332d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C10407b f103333e;

    /* renamed from: f, reason: collision with root package name */
    int f103334f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10408c(C10407b c10407b, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f103333e = c10407b;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f103332d = obj;
        this.f103334f |= LinearLayoutManager.INVALID_OFFSET;
        return this.f103333e.a(0L, 0L, this);
    }
}
