package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.blocks.alert.a;
import ru.ozon.android.messenger.blocks.buttons.d;
import ru.ozon.android.messenger.framework.data.repository.C9351a;
import ru.ozon.android.messenger.framework.domain.model.f;
import ru.ozon.android.messenger.utils.i;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.ChatViewModelImpl$handleOnChatButtonsClickAction$1$1$1", f = "ChatViewModel.kt", l = {1082, 1084, 1087}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class D extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    Object f89972d;

    /* renamed from: e, reason: collision with root package name */
    Object f89973e;

    /* renamed from: f, reason: collision with root package name */
    a.C1470a f89974f;

    /* renamed from: g, reason: collision with root package name */
    int f89975g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C9467e f89976h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ AtomActionDTO f89977i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ a.C1470a f89978j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    D(C9467e c9467e, AtomActionDTO atomActionDTO, a.C1470a c1470a, kotlin.coroutines.d<? super D> dVar) {
        super(2, dVar);
        this.f89976h = c9467e;
        this.f89977i = atomActionDTO;
        this.f89978j = c1470a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new D(this.f89976h, this.f89977i, this.f89978j, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((D) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0057, code lost:
    
        if (r10 == r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008a  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ru.ozon.android.messenger.framework.domain.repository.a aVar;
        ru.ozon.android.messenger.utils.i iVar;
        a.C1470a c1470a;
        ru.ozon.android.messenger.framework.domain.usecases.F f7;
        ru.ozon.android.messenger.utils.i iVar2;
        a.C1470a c1470a2;
        ru.ozon.android.messenger.framework.domain.repository.d dVar;
        String[] strArr;
        C9467e c9467e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f89975g;
        C9467e c9467e2 = this.f89976h;
        if (i11 == 0) {
            Sc.s.b(obj);
            c9467e2.getController().v(new d.a(false));
            aVar = c9467e2.f90208d;
            this.f89975g = 1;
            obj = ((C9351a) aVar).A(this.f89977i, this);
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c9467e = (C9467e) this.f89972d;
                    Sc.s.b(obj);
                    c9467e.getController().v(new d.a(true));
                    return Unit.f71690a;
                }
                c1470a2 = this.f89974f;
                c9467e2 = (C9467e) this.f89973e;
                iVar2 = (ru.ozon.android.messenger.utils.i) this.f89972d;
                Sc.s.b(obj);
                c1470a = c1470a2;
                iVar = iVar2;
                if (iVar instanceof i.a) {
                    dVar = c9467e2.f90207c;
                    ru.ozon.android.messenger.blocks.alert.a aVar3 = c9467e2.f90210f;
                    a.C1470a c1470a3 = ru.ozon.android.messenger.blocks.alert.a.f84375c;
                    ru.ozon.android.messenger.framework.presentation.models.q b11 = aVar3.b(null);
                    c1470a.getClass();
                    strArr = ru.ozon.android.messenger.blocks.alert.a.f84376d;
                    String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
                    this.f89972d = c9467e2;
                    this.f89973e = iVar;
                    this.f89974f = null;
                    this.f89975g = 3;
                    if (dVar.o(b11, strArr2, this) != aVar2) {
                        c9467e = c9467e2;
                        c9467e.getController().v(new d.a(true));
                    }
                    return aVar2;
                }
                return Unit.f71690a;
            }
            Sc.s.b(obj);
        }
        iVar = (ru.ozon.android.messenger.utils.i) obj;
        boolean z11 = iVar instanceof i.b;
        c1470a = this.f89978j;
        if (z11) {
            ((i.b) iVar).getClass();
            f7 = c9467e2.f90226t;
            f.b bVar = new f.b("button_alert");
            this.f89972d = iVar;
            this.f89973e = c9467e2;
            this.f89974f = c1470a;
            this.f89975g = 2;
            if (f7.g(bVar, this) != aVar2) {
                iVar2 = iVar;
                c1470a2 = c1470a;
                c1470a = c1470a2;
                iVar = iVar2;
            }
            return aVar2;
        }
        if (iVar instanceof i.a) {
        }
        return Unit.f71690a;
    }
}
