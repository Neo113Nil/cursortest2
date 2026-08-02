package i70;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.offline.data.model.main.MainData;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.offline.presentation.pay.OfflinePayViewModel", f = "OfflinePayViewModel.kt", l = {265, 266}, m = "provideOfflinePayStaticDataState")
/* loaded from: classes3.dex */
final class n extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    l f66019d;

    /* renamed from: e, reason: collision with root package name */
    MainData f66020e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f66021f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ l f66022g;

    /* renamed from: h, reason: collision with root package name */
    int f66023h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(l lVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f66022g = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f66021f = obj;
        this.f66023h |= LinearLayoutManager.INVALID_OFFSET;
        return l.p0(this.f66022g, this);
    }
}
