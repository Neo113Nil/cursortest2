package j10;

import androidx.recyclerview.widget.LinearLayoutManager;
import i10.C6997c;
import j10.d;
import l20.C7854a;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.composer.store.ComposerStoreImpl$ReducerWrapper", f = "ComposerStore.kt", l = {172, 173, 175, 179}, m = "process")
/* loaded from: classes7.dex */
final class g extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    d.c f68795d;

    /* renamed from: e, reason: collision with root package name */
    A00.a f68796e;

    /* renamed from: f, reason: collision with root package name */
    C6997c f68797f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f68798g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ d.c<C7854a> f68799h;

    /* renamed from: i, reason: collision with root package name */
    int f68800i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(d.c cVar, kotlin.coroutines.jvm.internal.c cVar2) {
        super(cVar2);
        this.f68799h = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f68798g = obj;
        this.f68800i |= LinearLayoutManager.INVALID_OFFSET;
        return this.f68799h.a(null, null, this);
    }
}
