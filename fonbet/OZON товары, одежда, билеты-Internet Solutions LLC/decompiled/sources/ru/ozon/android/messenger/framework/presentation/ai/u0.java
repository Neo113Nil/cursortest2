package ru.ozon.android.messenger.framework.presentation.ai;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.navigation.controller.d;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.ai.AiAssistantViewModel", f = "AiAssistantViewModel.kt", l = {572, 573}, m = "handleUpdateMessengerEvent")
/* loaded from: classes10.dex */
final class u0 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C9414c0 f89683d;

    /* renamed from: e, reason: collision with root package name */
    d.w f89684e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f89685f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C9414c0 f89686g;

    /* renamed from: h, reason: collision with root package name */
    int f89687h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u0(kotlin.coroutines.d dVar, C9414c0 c9414c0) {
        super(dVar);
        this.f89686g = c9414c0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f89685f = obj;
        this.f89687h |= LinearLayoutManager.INVALID_OFFSET;
        return C9414c0.C0(this.f89686g, null, this);
    }
}
