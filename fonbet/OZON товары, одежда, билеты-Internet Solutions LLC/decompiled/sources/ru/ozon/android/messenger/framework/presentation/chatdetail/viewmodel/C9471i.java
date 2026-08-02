package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.ChatViewModelImpl", f = "ChatViewModel.kt", l = {478, 479, 482}, m = "clearDraftAndUndeliveredIfNeeded")
/* renamed from: ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.i, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9471i extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C9467e f90266d;

    /* renamed from: e, reason: collision with root package name */
    String f90267e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f90268f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C9467e f90269g;

    /* renamed from: h, reason: collision with root package name */
    int f90270h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9471i(C9467e c9467e, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f90269g = c9467e;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f90268f = obj;
        this.f90270h |= LinearLayoutManager.INVALID_OFFSET;
        return C9467e.f0(this.f90269g, this);
    }
}
