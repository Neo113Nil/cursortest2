package ru.ozon.android.messenger.framework.presentation.ai;

import fd.InterfaceC6512o;
import kotlin.Unit;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.ai.AiAssistantViewModel$aiScreenState$1", f = "AiAssistantViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: ru.ozon.android.messenger.framework.presentation.ai.d0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9416d0 extends kotlin.coroutines.jvm.internal.j implements InterfaceC6512o<ru.ozon.android.messenger.framework.presentation.models.l, ru.ozon.android.messenger.framework.presentation.ai.delegates.a, W, kotlin.coroutines.d<? super W>, Object> {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ ru.ozon.android.messenger.framework.presentation.models.l f89541d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ ru.ozon.android.messenger.framework.presentation.ai.delegates.a f89542e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ W f89543f;

    @Override // fd.InterfaceC6512o
    public final Object invoke(ru.ozon.android.messenger.framework.presentation.models.l lVar, ru.ozon.android.messenger.framework.presentation.ai.delegates.a aVar, W w11, kotlin.coroutines.d<? super W> dVar) {
        C9416d0 c9416d0 = new C9416d0(4, dVar);
        c9416d0.f89541d = lVar;
        c9416d0.f89542e = aVar;
        c9416d0.f89543f = w11;
        return c9416d0.invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        ru.ozon.android.messenger.framework.presentation.models.l lVar = this.f89541d;
        return new W(lVar.a().a(), lVar.b(), this.f89542e, this.f89543f.d());
    }
}
