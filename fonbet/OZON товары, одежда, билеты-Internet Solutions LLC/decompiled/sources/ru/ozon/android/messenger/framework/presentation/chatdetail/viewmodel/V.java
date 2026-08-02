package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.navigation.controller.d;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.ChatViewModelImpl", f = "ChatViewModel.kt", l = {607, 608}, m = "handleUpdateMessengerEvent")
/* loaded from: classes10.dex */
final class V extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C9467e f90033d;

    /* renamed from: e, reason: collision with root package name */
    d.w f90034e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f90035f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C9467e f90036g;

    /* renamed from: h, reason: collision with root package name */
    int f90037h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    V(kotlin.coroutines.d dVar, C9467e c9467e) {
        super(dVar);
        this.f90036g = c9467e;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f90035f = obj;
        this.f90037h |= LinearLayoutManager.INVALID_OFFSET;
        return C9467e.X0(this.f90036g, null, this);
    }
}
