package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.framework.domain.model.g;
import ru.ozon.android.messenger.framework.domain.service.InterfaceC9383a;
import ru.ozon.android.messenger.framework.domain.usecases.P;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.ChatViewModelImpl$handleAction$2", f = "ChatViewModel.kt", l = {624, 625, 627}, m = "invokeSuspend")
/* renamed from: ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.l, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9474l extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    C9467e f90283d;

    /* renamed from: e, reason: collision with root package name */
    String f90284e;

    /* renamed from: f, reason: collision with root package name */
    int f90285f;

    /* renamed from: g, reason: collision with root package name */
    private /* synthetic */ Object f90286g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C9467e f90287h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.navigation.action.a f90288i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9474l(kotlin.coroutines.d dVar, ru.ozon.android.messenger.framework.navigation.action.a aVar, C9467e c9467e) {
        super(2, dVar);
        this.f90287h = c9467e;
        this.f90288i = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        C9474l c9474l = new C9474l(dVar, this.f90288i, this.f90287h);
        c9474l.f90286g = obj;
        return c9474l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C9474l) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x009a, code lost:
    
        if (r9.i(r3, r8) == r0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC9383a interfaceC9383a;
        ru.ozon.android.messenger.framework.presentation.chatdetail.a aVar;
        ru.ozon.android.messenger.blocks.input.viewmodel.e eVar;
        xe.M m11;
        C9467e c9467e;
        String str;
        ru.ozon.android.messenger.blocks.input.viewmodel.f fVar;
        C9467e c9467e2;
        xe.M m12;
        ru.ozon.android.messenger.framework.domain.usecases.P p11;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f90285f;
        if (i11 == 0) {
            Sc.s.b(obj);
            xe.M m13 = (xe.M) this.f90286g;
            C9467e c9467e3 = this.f90287h;
            String value = c9467e3.e().getValue();
            if (value != null) {
                eVar = c9467e3.f90236y;
                this.f90286g = m13;
                this.f90283d = c9467e3;
                this.f90284e = value;
                this.f90285f = 1;
                Object a11 = eVar.a(value, this);
                if (a11 != aVar2) {
                    m11 = m13;
                    obj = a11;
                    c9467e = c9467e3;
                    str = value;
                    if (!((ru.ozon.android.messenger.blocks.input.b) obj).e()) {
                    }
                    p11 = c9467e.f90224s;
                    g.c cVar = new g.c(str);
                    this.f90286g = m11;
                    this.f90283d = null;
                    this.f90284e = null;
                    this.f90285f = 3;
                }
                return aVar2;
            }
            interfaceC9383a = c9467e3.f90213i;
            if (interfaceC9383a != null) {
                String id2 = this.f90288i.getId();
                aVar = c9467e3.f90232w;
                interfaceC9383a.a(new P.a("Action " + id2 + " failed, " + aVar.getDeeplink()));
            }
        } else if (i11 == 1) {
            str = this.f90284e;
            c9467e = this.f90283d;
            m11 = (xe.M) this.f90286g;
            Sc.s.b(obj);
            if (!((ru.ozon.android.messenger.blocks.input.b) obj).e()) {
                fVar = c9467e.f90234x;
                this.f90286g = m11;
                this.f90283d = c9467e;
                this.f90284e = str;
                this.f90285f = 2;
                if (fVar.f(str, this) != aVar2) {
                    c9467e2 = c9467e;
                    m12 = m11;
                    m11 = m12;
                    c9467e = c9467e2;
                }
                return aVar2;
            }
            p11 = c9467e.f90224s;
            g.c cVar2 = new g.c(str);
            this.f90286g = m11;
            this.f90283d = null;
            this.f90284e = null;
            this.f90285f = 3;
        } else if (i11 == 2) {
            str = this.f90284e;
            c9467e2 = this.f90283d;
            m12 = (xe.M) this.f90286g;
            Sc.s.b(obj);
            m11 = m12;
            c9467e = c9467e2;
            p11 = c9467e.f90224s;
            g.c cVar22 = new g.c(str);
            this.f90286g = m11;
            this.f90283d = null;
            this.f90284e = null;
            this.f90285f = 3;
        } else {
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        return Unit.f71690a;
    }
}
