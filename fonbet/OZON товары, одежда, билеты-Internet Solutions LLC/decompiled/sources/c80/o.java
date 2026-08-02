package c80;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.sharing.presentation.pdf.SharingPreviewViewModel", f = "SharingPreviewViewModel.kt", l = {417}, m = "startDownloading")
/* loaded from: classes3.dex */
final class o extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    i f56793d;

    /* renamed from: e, reason: collision with root package name */
    String f56794e;

    /* renamed from: f, reason: collision with root package name */
    String f56795f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f56796g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ i f56797h;

    /* renamed from: i, reason: collision with root package name */
    int f56798i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(i iVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f56797h = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f56796g = obj;
        this.f56798i |= LinearLayoutManager.INVALID_OFFSET;
        return i.y0(this.f56797h, null, null, this);
    }
}
