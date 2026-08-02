package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.framework.domain.model.g;
import ru.ozon.android.messenger.utils.i;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.ChatViewModelImpl$handleSendUpdateChatMessage$3", f = "ChatViewModel.kt", l = {716}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class M extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f90009d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9467e f90010e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f90011f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f90012g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ String f90013h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.presentation.models.q f90014i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ String f90015j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.navigation.action.a f90016k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    M(C9467e c9467e, String str, String str2, String str3, ru.ozon.android.messenger.framework.presentation.models.q qVar, String str4, ru.ozon.android.messenger.framework.navigation.action.a aVar, kotlin.coroutines.d<? super M> dVar) {
        super(2, dVar);
        this.f90010e = c9467e;
        this.f90011f = str;
        this.f90012g = str2;
        this.f90013h = str3;
        this.f90014i = qVar;
        this.f90015j = str4;
        this.f90016k = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new M(this.f90010e, this.f90011f, this.f90012g, this.f90013h, this.f90014i, this.f90015j, this.f90016k, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((M) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ru.ozon.android.messenger.framework.domain.usecases.P p11;
        Ae.C0 c02;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f90009d;
        C9467e c9467e = this.f90010e;
        if (i11 == 0) {
            Sc.s.b(obj);
            p11 = c9467e.f90224s;
            ru.ozon.android.messenger.framework.presentation.models.q qVar = this.f90014i;
            String str = this.f90015j;
            String str2 = this.f90011f;
            String str3 = this.f90012g;
            g.e eVar = new g.e(str2, str3, this.f90013h, str3, qVar, str);
            this.f90009d = 1;
            obj = p11.i(eVar, this);
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
                C9467e.i1(c9467e, this.f90016k);
            }
        }
        return Unit.f71690a;
    }
}
