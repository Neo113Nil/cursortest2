package ob0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.antibot.AntibotActionHandler", f = "AntibotActionHandler.kt", l = {259, 261}, m = "finishAntibotFlow")
/* renamed from: ob0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C8686a extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    s f77914d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f77915e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ l f77916f;

    /* renamed from: g, reason: collision with root package name */
    int f77917g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C8686a(l lVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f77916f = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object j11;
        this.f77915e = obj;
        this.f77917g |= LinearLayoutManager.INVALID_OFFSET;
        j11 = this.f77916f.j(null, this);
        return j11;
    }
}
