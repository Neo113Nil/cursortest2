package j10;

import androidx.recyclerview.widget.LinearLayoutManager;
import j10.d;
import java.util.Iterator;
import l20.C7854a;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.composer.store.ComposerStoreImpl$EffectPublisherWrapper", f = "ComposerStore.kt", l = {154}, m = "publish")
/* renamed from: j10.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C7240c extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    d.a f68753d;

    /* renamed from: e, reason: collision with root package name */
    Iterator f68754e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f68755f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ d.a<C7854a> f68756g;

    /* renamed from: h, reason: collision with root package name */
    int f68757h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7240c(d.a aVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f68756g = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f68755f = obj;
        this.f68757h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f68756g.a(null, null, this);
    }
}
