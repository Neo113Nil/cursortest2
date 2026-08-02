package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.framework.data.repository.C9351a;
import ru.ozon.android.messenger.framework.presentation.common.notification.a;
import ru.ozon.android.messenger.utils.i;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.ChatViewModelImpl$handleGetSuspiciousLinkModalAction$1", f = "ChatViewModel.kt", l = {1290, 1311}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class A extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f89960d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9467e f89961e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.navigation.action.a f89962f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    A(kotlin.coroutines.d dVar, ru.ozon.android.messenger.framework.navigation.action.a aVar, C9467e c9467e) {
        super(2, dVar);
        this.f89961e = c9467e;
        this.f89962f = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new A(dVar, this.f89962f, this.f89961e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((A) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0094, code lost:
    
        if (xe.Y.b(1000, r8) == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0096, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0030, code lost:
    
        if (r9 == r0) goto L33;
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
        int i11 = this.f89960d;
        ru.ozon.android.messenger.framework.navigation.action.a aVar3 = this.f89962f;
        C9467e c9467e = this.f89961e;
        if (i11 == 0) {
            Sc.s.b(obj);
            aVar = c9467e.f90208d;
            this.f89960d = 1;
            obj = ((C9351a) aVar).u(aVar3, this);
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
        if (iVar instanceof i.b) {
            ru.ozon.android.messenger.framework.presentation.models.responses.d dVar = (ru.ozon.android.messenger.framework.presentation.models.responses.d) ((i.b) iVar).b();
            if (dVar != null) {
                c03 = c9467e.f90193K;
                c03.tryEmit(new ru.ozon.android.messenger.blocks.messagetext.m(dVar));
            } else {
                Lm0.a.f17149a.w("called onSuccess for executeGetSuspiciousLinkModalAction but response is null", new Object[0]);
            }
        }
        if (iVar instanceof i.a) {
            AtomActionDTO b11 = aVar3.b();
            if ((b11 != null ? b11.getParams() : null) == null) {
                Lm0.a.f17149a.e("Error notification params not found for GetSuspiciousLinkModal", new Object[0]);
            } else {
                NotificationDTO a11 = a.C1689a.a(ru.ozon.android.messenger.framework.presentation.common.notification.a.f90777a, aVar3.d(), 6);
                if (a11 != null) {
                    c02 = c9467e.f90192J;
                    c02.tryEmit(a11);
                }
            }
        }
        this.f89960d = 2;
    }
}
