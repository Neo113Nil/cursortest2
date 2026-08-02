package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.data.repository.C9351a;
import ru.ozon.android.messenger.framework.presentation.common.notification.a;
import ru.ozon.android.messenger.utils.i;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.ChatViewModelImpl$addFastAnswer$1", f = "ChatViewModel.kt", l = {1144, 1153}, m = "invokeSuspend")
/* renamed from: ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.h, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9470h extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f90256d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9467e f90257e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.navigation.action.a f90258f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Map<String, String> f90259g;

    /* renamed from: ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.h$a */
    /* synthetic */ class a extends C7719a implements Function1<NotificationDTO, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(NotificationDTO notificationDTO) {
            NotificationDTO p02 = notificationDTO;
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((Ae.w0) this.receiver).tryEmit(p02);
            return Unit.f71690a;
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.h$b */
    /* synthetic */ class b extends C7719a implements Function1<NotificationDTO, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(NotificationDTO notificationDTO) {
            NotificationDTO p02 = notificationDTO;
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((Ae.w0) this.receiver).tryEmit(p02);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9470h(C9467e c9467e, ru.ozon.android.messenger.framework.navigation.action.a aVar, Map<String, String> map, kotlin.coroutines.d<? super C9470h> dVar) {
        super(2, dVar);
        this.f90257e = c9467e;
        this.f90258f = aVar;
        this.f90259g = map;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C9470h(this.f90257e, this.f90258f, this.f90259g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C9470h) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0089, code lost:
    
        if (xe.Y.b(1000, r12) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0030, code lost:
    
        if (r13 == r0) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ru.ozon.android.messenger.framework.domain.repository.a aVar;
        Ae.C0 c02;
        Ae.C0 c03;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f90256d;
        C9467e c9467e = this.f90257e;
        if (i11 == 0) {
            Sc.s.b(obj);
            aVar = c9467e.f90208d;
            this.f90256d = 1;
            obj = ((C9351a) aVar).q(this.f90258f, this);
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                return Unit.f71690a;
            }
            Sc.s.b(obj);
        }
        ru.ozon.android.messenger.utils.i iVar = (ru.ozon.android.messenger.utils.i) obj;
        boolean z11 = iVar instanceof i.b;
        a.C1689a c1689a = ru.ozon.android.messenger.framework.presentation.common.notification.a.f90777a;
        if (z11) {
            ru.ozon.android.messenger.framework.presentation.models.responses.e eVar = (ru.ozon.android.messenger.framework.presentation.models.responses.e) ((i.b) iVar).b();
            c03 = c9467e.f90192J;
            a.C1689a.c(eVar, new a(1, c03, Ae.w0.class, "tryEmit", "tryEmit(Ljava/lang/Object;)Z", 8));
        }
        if (iVar instanceof i.a) {
            c02 = c9467e.f90192J;
            b emitNotificationEvent = new b(1, c02, Ae.w0.class, "tryEmit", "tryEmit(Ljava/lang/Object;)Z", 8);
            Intrinsics.checkNotNullParameter(emitNotificationEvent, "emitNotificationEvent");
            NotificationDTO a11 = a.C1689a.a(c1689a, this.f90259g, 4);
            if (a11 != null) {
                emitNotificationEvent.invoke(a11);
            }
        }
        this.f90256d = 2;
    }
}
