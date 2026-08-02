package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.framework.data.repository.C9351a;
import ru.ozon.android.messenger.framework.presentation.common.notification.a;
import ru.ozon.android.messenger.utils.i;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.ChatViewModelImpl$showHiddenContent$1", f = "ChatViewModel.kt", l = {1128}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class l0 extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f90289d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9467e f90290e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.navigation.action.a f90291f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Map<String, String> f90292g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l0(C9467e c9467e, ru.ozon.android.messenger.framework.navigation.action.a aVar, Map<String, String> map, kotlin.coroutines.d<? super l0> dVar) {
        super(2, dVar);
        this.f90290e = c9467e;
        this.f90291f = aVar;
        this.f90292g = map;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new l0(this.f90290e, this.f90291f, this.f90292g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((l0) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ru.ozon.android.messenger.framework.domain.repository.a aVar;
        NotificationDTO a11;
        Ae.C0 c02;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f90289d;
        C9467e c9467e = this.f90290e;
        if (i11 == 0) {
            Sc.s.b(obj);
            aVar = c9467e.f90208d;
            this.f90289d = 1;
            obj = ((C9351a) aVar).C(this.f90291f, this);
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
        if (iVar instanceof i.b) {
            ((i.b) iVar).getClass();
        }
        if ((iVar instanceof i.a) && (a11 = a.C1689a.a(ru.ozon.android.messenger.framework.presentation.common.notification.a.f90777a, this.f90292g, 6)) != null) {
            c02 = c9467e.f90192J;
            c02.tryEmit(a11);
        }
        return Unit.f71690a;
    }
}
