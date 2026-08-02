package ec0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.accountMerge.presentation.OzonIdAccountMergeViewModel", f = "OzonIdAccountMergeViewModel.kt", l = {164}, m = "callAction")
/* loaded from: classes3.dex */
final class i extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    j f62136d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f62137e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ j f62138f;

    /* renamed from: g, reason: collision with root package name */
    int f62139g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(j jVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f62138f = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f62137e = obj;
        this.f62139g |= LinearLayoutManager.INVALID_OFFSET;
        return j.P0(this.f62138f, null, null, this);
    }
}
