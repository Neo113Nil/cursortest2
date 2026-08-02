package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.blocks.originalText.g;
import ru.ozon.android.messenger.framework.data.repository.C9351a;
import ru.ozon.android.messenger.framework.navigation.action.d;
import ru.ozon.android.messenger.utils.i;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.ChatViewModelImpl$handleShowOriginalText$1$1", f = "ChatViewModel.kt", l = {909}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class N extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f90017d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9467e f90018e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.navigation.action.a f90019f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    N(kotlin.coroutines.d dVar, ru.ozon.android.messenger.framework.navigation.action.a aVar, C9467e c9467e) {
        super(2, dVar);
        this.f90018e = c9467e;
        this.f90019f = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new N(dVar, this.f90019f, this.f90018e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((N) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ru.ozon.android.messenger.framework.domain.repository.a aVar;
        ru.ozon.android.messenger.blocks.originalText.e eVar;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f90017d;
        ru.ozon.android.messenger.framework.navigation.action.a aVar3 = this.f90019f;
        C9467e c9467e = this.f90018e;
        if (i11 == 0) {
            Sc.s.b(obj);
            aVar = c9467e.f90208d;
            this.f90017d = 1;
            obj = ((C9351a) aVar).w(aVar3, this);
            if (obj == aVar2) {
                return aVar2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        ru.ozon.android.messenger.utils.i iVar = (ru.ozon.android.messenger.utils.i) obj;
        if ((iVar instanceof i.b) && (eVar = (ru.ozon.android.messenger.blocks.originalText.e) ((i.b) iVar).b()) != null) {
            if (eVar.b() == null) {
                ru.ozon.android.messenger.framework.navigation.controller.a controller = c9467e.getController();
                Object obj2 = aVar3.d().get("itemId");
                controller.v(new g.a(obj2 instanceof String ? (String) obj2 : null, eVar.a()));
            } else {
                ru.ozon.android.messenger.framework.navigation.controller.a controller2 = c9467e.getController();
                Object obj3 = aVar3.d().get("itemId");
                controller2.v(new g.b(obj3 instanceof String ? (String) obj3 : null, eVar.b()));
            }
        }
        if (iVar instanceof i.a) {
            i.a aVar4 = (i.a) iVar;
            ru.ozon.android.messenger.framework.presentation.models.m mVar = (ru.ozon.android.messenger.framework.presentation.models.m) ru.ozon.android.messenger.framework.navigation.action.b.b(d.c.ACTION_ERROR_FLASHBAR.a(), aVar3.d());
            if (mVar != null) {
                c9467e.getController().l(C9467e.j1(c9467e, mVar));
            }
            ru.ozon.android.messenger.framework.navigation.controller.a controller3 = c9467e.getController();
            Object obj4 = aVar3.d().get("itemId");
            controller3.v(new g.a(obj4 instanceof String ? (String) obj4 : null, aVar4.c()));
        }
        return Unit.f71690a;
    }
}
