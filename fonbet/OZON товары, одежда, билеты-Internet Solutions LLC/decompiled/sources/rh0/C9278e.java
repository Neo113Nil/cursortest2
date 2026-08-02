package rh0;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.push.sdk.internal.liveactivity.domain.LiveActivityInteractorImpl", f = "LiveActivityInteractorImpl.kt", l = {152, 154}, m = "retry")
/* renamed from: rh0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C9278e<T> extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    Function1 f83522d;

    /* renamed from: e, reason: collision with root package name */
    Exception f83523e;

    /* renamed from: f, reason: collision with root package name */
    int f83524f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f83525g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C9277d f83526h;

    /* renamed from: i, reason: collision with root package name */
    int f83527i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9278e(C9277d c9277d, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f83526h = c9277d;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f83525g = obj;
        this.f83527i |= LinearLayoutManager.INVALID_OFFSET;
        return C9277d.f(this.f83526h, null, this);
    }
}
