package i70;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.offline.presentation.pay.OfflinePayViewModel", f = "OfflinePayViewModel.kt", l = {386}, m = "provideMainData")
/* loaded from: classes3.dex */
final class m extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f66016d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ l f66017e;

    /* renamed from: f, reason: collision with root package name */
    int f66018f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(l lVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f66017e = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object B02;
        this.f66016d = obj;
        this.f66018f |= LinearLayoutManager.INVALID_OFFSET;
        B02 = this.f66017e.B0(this);
        return B02;
    }
}
