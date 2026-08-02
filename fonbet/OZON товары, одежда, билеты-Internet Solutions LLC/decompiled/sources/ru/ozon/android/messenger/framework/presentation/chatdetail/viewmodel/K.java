package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.framework.domain.model.g;
import ru.ozon.android.messenger.utils.i;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.ChatViewModelImpl$handleSendUpdateChatMessage$1", f = "ChatViewModel.kt", l = {691}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class K extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f90003d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9467e f90004e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f90005f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.navigation.action.a f90006g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    K(C9467e c9467e, String str, ru.ozon.android.messenger.framework.navigation.action.a aVar, kotlin.coroutines.d<? super K> dVar) {
        super(2, dVar);
        this.f90004e = c9467e;
        this.f90005f = str;
        this.f90006g = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new K(this.f90004e, this.f90005f, this.f90006g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((K) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ru.ozon.android.messenger.framework.domain.usecases.P p11;
        Ae.C0 c02;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f90003d;
        C9467e c9467e = this.f90004e;
        if (i11 == 0) {
            Sc.s.b(obj);
            p11 = c9467e.f90224s;
            g.d dVar = new g.d(this.f90005f);
            this.f90003d = 1;
            obj = p11.i(dVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        ru.ozon.android.messenger.utils.i iVar = (ru.ozon.android.messenger.utils.i) obj;
        if (iVar instanceof i.a) {
            NotificationDTO k12 = C9467e.k1(c9467e, (i.a) iVar);
            if (k12 != null) {
                c02 = c9467e.f90192J;
                c02.tryEmit(k12);
            } else {
                C9467e.i1(c9467e, this.f90006g);
            }
        }
        return Unit.f71690a;
    }
}
