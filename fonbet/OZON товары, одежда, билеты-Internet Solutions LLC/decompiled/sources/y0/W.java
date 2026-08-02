package y0;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.functions.Function2;
import n0.EnumC8372M;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.pager.PagerState", f = "PagerState.kt", l = {629, 634}, m = "scroll$suspendImpl")
/* loaded from: classes8.dex */
final class W extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    b0 f105721d;

    /* renamed from: e, reason: collision with root package name */
    EnumC8372M f105722e;

    /* renamed from: f, reason: collision with root package name */
    Function2 f105723f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f105724g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ b0 f105725h;

    /* renamed from: i, reason: collision with root package name */
    int f105726i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    W(b0 b0Var, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f105725h = b0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f105724g = obj;
        this.f105726i |= LinearLayoutManager.INVALID_OFFSET;
        return b0.R(this.f105725h, null, null, this);
    }
}
