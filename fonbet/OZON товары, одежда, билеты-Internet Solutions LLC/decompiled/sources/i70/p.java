package i70;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.offline.presentation.pay.OfflinePayViewModel", f = "OfflinePayViewModel.kt", l = {393}, m = "provideTransferData")
/* loaded from: classes3.dex */
final class p extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f66024d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ l f66025e;

    /* renamed from: f, reason: collision with root package name */
    int f66026f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(l lVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f66025e = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object C02;
        this.f66024d = obj;
        this.f66026f |= LinearLayoutManager.INVALID_OFFSET;
        C02 = this.f66025e.C0(this);
        return C02;
    }
}
