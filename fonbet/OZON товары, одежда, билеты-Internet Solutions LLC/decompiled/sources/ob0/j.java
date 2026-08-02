package ob0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.antibot.AntibotActionHandler", f = "AntibotActionHandler.kt", l = {154}, m = "runJSChallenge")
/* loaded from: classes3.dex */
final class j extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    l f77949d;

    /* renamed from: e, reason: collision with root package name */
    long f77950e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f77951f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ l f77952g;

    /* renamed from: h, reason: collision with root package name */
    int f77953h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(l lVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f77952g = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object n11;
        this.f77951f = obj;
        this.f77953h |= LinearLayoutManager.INVALID_OFFSET;
        n11 = this.f77952g.n(null, this);
        return n11;
    }
}
