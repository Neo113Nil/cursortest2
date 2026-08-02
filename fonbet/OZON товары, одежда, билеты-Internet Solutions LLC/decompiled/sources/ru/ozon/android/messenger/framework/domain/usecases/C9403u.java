package ru.ozon.android.messenger.framework.domain.usecases;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.domain.usecases.HandleChatEventsUseCase", f = "HandleChatEventsUseCase.kt", l = {DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER, 40, 42}, m = "handleAddItem")
/* renamed from: ru.ozon.android.messenger.framework.domain.usecases.u, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9403u extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f89139d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9402t f89140e;

    /* renamed from: f, reason: collision with root package name */
    int f89141f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9403u(C9402t c9402t, kotlin.coroutines.d<? super C9403u> dVar) {
        super(dVar);
        this.f89140e = c9402t;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f89139d = obj;
        this.f89141f |= LinearLayoutManager.INVALID_OFFSET;
        return C9402t.e(this.f89140e, null, this);
    }
}
