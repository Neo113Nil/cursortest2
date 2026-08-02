package ru.ozon.android.messenger.framework.data.repository;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.maplibre.android.log.Logger;
import ru.ozon.android.messenger.framework.data.requests.ContextMenuItemActionResponseDTO;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.repository.ActionRepositoryImpl$executeChatWithSuccessAction$2", f = "ActionRepositoryImpl.kt", l = {Logger.NONE}, m = "invokeSuspend")
/* renamed from: ru.ozon.android.messenger.framework.data.repository.g, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9357g extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends ContextMenuItemActionResponseDTO>>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f88523d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9351a f88524e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.navigation.action.a f88525f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9357g(C9351a c9351a, ru.ozon.android.messenger.framework.navigation.action.a aVar, kotlin.coroutines.d<? super C9357g> dVar) {
        super(2, dVar);
        this.f88524e = c9351a;
        this.f88525f = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C9357g(this.f88524e, this.f88525f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends ContextMenuItemActionResponseDTO>> dVar) {
        return ((C9357g) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f88523d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
            return obj;
        }
        Sc.s.b(obj);
        ru.ozon.android.messenger.framework.data.remote.action.y yVar = this.f88524e.f88448b;
        this.f88523d = 1;
        Object d11 = yVar.d(this.f88525f, this);
        return d11 == aVar ? aVar : d11;
    }
}
