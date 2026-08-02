package ru.ozon.android.messenger.framework.presentation.ai;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.blocks.ai.aiMessageActions.AiMessageActionsDTO;
import ru.ozon.android.messenger.framework.navigation.action.d;
import ru.ozon.android.messenger.framework.presentation.ai.Y;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.ai.AiAssistantViewModel$handleAction$5", f = "AiAssistantViewModel.kt", l = {532}, m = "invokeSuspend")
/* renamed from: ru.ozon.android.messenger.framework.presentation.ai.l0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9432l0 extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f89633d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9414c0 f89634e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.navigation.action.a f89635f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9432l0(C9414c0 c9414c0, ru.ozon.android.messenger.framework.navigation.action.a aVar, kotlin.coroutines.d<? super C9432l0> dVar) {
        super(2, dVar);
        this.f89634e = c9414c0;
        this.f89635f = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C9432l0(this.f89634e, this.f89635f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C9432l0) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Ae.C0 c02;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f89633d;
        if (i11 == 0) {
            Sc.s.b(obj);
            c02 = this.f89634e.f89523z;
            Object obj2 = this.f89635f.d().get(d.c.AI_MESSAGE_ACTION_MENU_INFO.a());
            Intrinsics.g(obj2, "null cannot be cast to non-null type ru.ozon.android.messenger.blocks.ai.aiMessageActions.AiMessageActionsDTO.SourcesBadge.MenuInfo");
            Y.b bVar = new Y.b((AiMessageActionsDTO.SourcesBadge.MenuInfo) obj2);
            this.f89633d = 1;
            if (c02.emit(bVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        return Unit.f71690a;
    }
}
