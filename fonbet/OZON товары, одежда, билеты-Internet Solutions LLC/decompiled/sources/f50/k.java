package f50;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottompdf.presentation.CbottomPdfPreviewViewModel", f = "CbottomPdfPreviewViewModel.kt", l = {447, 457}, m = "startDownloading")
/* loaded from: classes3.dex */
final class k extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    f f62915d;

    /* renamed from: e, reason: collision with root package name */
    String f62916e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f62917f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ f f62918g;

    /* renamed from: h, reason: collision with root package name */
    int f62919h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(f fVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f62918g = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f62917f = obj;
        this.f62919h |= LinearLayoutManager.INVALID_OFFSET;
        return f.B0(this.f62918g, null, this);
    }
}
