package ru.ozon.android.messenger.framework.domain.usecases;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$FileOptions;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.domain.usecases.RestoreFailedMessagesUseCase", f = "RestoreFailedMessagesUseCase.kt", l = {DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER, 42, 52, 58}, m = "invoke")
/* loaded from: classes10.dex */
final class M extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    Object f88988d;

    /* renamed from: e, reason: collision with root package name */
    ru.ozon.android.messenger.framework.domain.service.x f88989e;

    /* renamed from: f, reason: collision with root package name */
    ru.ozon.android.messenger.framework.presentation.models.q f88990f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f88991g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ O f88992h;

    /* renamed from: i, reason: collision with root package name */
    int f88993i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    M(O o11, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f88992h = o11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f88991g = obj;
        this.f88993i |= LinearLayoutManager.INVALID_OFFSET;
        return this.f88992h.a(this);
    }
}
