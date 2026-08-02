package ke0;

import androidx.recyclerview.widget.LinearLayoutManager;
import ke0.b;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@e(c = "ru.ozon.mapsdk.common.geoproxy.usecase.GetProvidersUseCase$Companion", f = "GetProvidersUseCase.kt", l = {19}, m = "invoke")
/* renamed from: ke0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C7672a extends c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f71516d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ b.a f71517e;

    /* renamed from: f, reason: collision with root package name */
    int f71518f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7672a(b.a aVar, c cVar) {
        super(cVar);
        this.f71517e = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f71516d = obj;
        this.f71518f |= LinearLayoutManager.INVALID_OFFSET;
        return this.f71517e.a(null, null, null, null, this);
    }
}
