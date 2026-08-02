package ru.ozon.android.messenger.framework.presentation.ai;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.models.A;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.ai.AiAssistantViewModel", f = "AiAssistantViewModel.kt", l = {613, 619, 628}, m = "handleAddItem")
/* renamed from: ru.ozon.android.messenger.framework.presentation.ai.o0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9438o0 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C9414c0 f89649d;

    /* renamed from: e, reason: collision with root package name */
    A.a f89650e;

    /* renamed from: f, reason: collision with root package name */
    boolean f89651f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f89652g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C9414c0 f89653h;

    /* renamed from: i, reason: collision with root package name */
    int f89654i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9438o0(kotlin.coroutines.d dVar, C9414c0 c9414c0) {
        super(dVar);
        this.f89653h = c9414c0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f89652g = obj;
        this.f89654i |= LinearLayoutManager.INVALID_OFFSET;
        return C9414c0.w0(this.f89653h, null, null, this);
    }
}
