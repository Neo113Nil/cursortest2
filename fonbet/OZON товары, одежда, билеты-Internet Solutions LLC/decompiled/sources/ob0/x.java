package ob0;

import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.antibot.AntibotRouter", f = "AntibotRouter.kt", l = {113, 120}, m = "openFragment")
/* loaded from: classes3.dex */
final class x extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C8685A f78012d;

    /* renamed from: e, reason: collision with root package name */
    ComponentCallbacksC5392m f78013e;

    /* renamed from: f, reason: collision with root package name */
    boolean f78014f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f78015g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C8685A f78016h;

    /* renamed from: i, reason: collision with root package name */
    int f78017i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    x(C8685A c8685a, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f78016h = c8685a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object i11;
        this.f78015g = obj;
        this.f78017i |= LinearLayoutManager.INVALID_OFFSET;
        i11 = this.f78016h.i(null, false, this);
        return i11;
    }
}
