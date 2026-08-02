package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel;

import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.framework.data.repository.C9351a;
import ru.ozon.android.messenger.framework.navigation.action.d;
import ru.ozon.android.messenger.utils.i;
import ru.ozon.uni.atoms.af.AtomAction;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.ChatViewModelImpl$handleEditChatMessage$1$1", f = "ChatViewModel.kt", l = {753, 765, 767}, m = "invokeSuspend")
/* renamed from: ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.s, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9480s extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    ru.ozon.android.messenger.utils.i f90339d;

    /* renamed from: e, reason: collision with root package name */
    C9467e f90340e;

    /* renamed from: f, reason: collision with root package name */
    Object f90341f;

    /* renamed from: g, reason: collision with root package name */
    Object f90342g;

    /* renamed from: h, reason: collision with root package name */
    i.b f90343h;

    /* renamed from: i, reason: collision with root package name */
    ru.ozon.android.messenger.framework.presentation.models.q f90344i;

    /* renamed from: j, reason: collision with root package name */
    String f90345j;

    /* renamed from: k, reason: collision with root package name */
    String f90346k;

    /* renamed from: l, reason: collision with root package name */
    int f90347l;

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ C9467e f90348m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.navigation.action.a f90349n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9480s(kotlin.coroutines.d dVar, ru.ozon.android.messenger.framework.navigation.action.a aVar, C9467e c9467e) {
        super(2, dVar);
        this.f90348m = c9467e;
        this.f90349n = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C9480s(dVar, this.f90349n, this.f90348m);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C9480s) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0060, code lost:
    
        if (r13 == r0) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x014d  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ru.ozon.android.messenger.framework.domain.repository.a aVar;
        ru.ozon.android.messenger.utils.i iVar;
        ru.ozon.android.messenger.framework.presentation.models.q qVar;
        Map<String, Object> d11;
        Object obj2;
        String k11;
        C9467e c9467e;
        String str;
        ru.ozon.android.messenger.framework.navigation.action.a aVar2;
        String str2;
        ru.ozon.android.messenger.utils.i iVar2;
        C9467e c9467e2;
        ru.ozon.android.messenger.blocks.input.viewmodel.f fVar;
        ru.ozon.android.messenger.utils.i iVar3;
        ru.ozon.android.messenger.framework.presentation.models.q qVar2;
        String str3;
        ru.ozon.android.messenger.utils.i iVar4;
        C9467e c9467e3;
        ru.ozon.android.messenger.framework.presentation.chatdetail.inputmode.k kVar;
        ru.ozon.android.messenger.framework.navigation.action.a aVar3;
        Wc.a aVar4 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f90347l;
        ru.ozon.android.messenger.framework.navigation.action.a aVar5 = this.f90349n;
        C9467e c9467e4 = this.f90348m;
        if (i11 == 0) {
            Sc.s.b(obj);
            aVar = c9467e4.f90208d;
            this.f90347l = 1;
            obj = ((C9351a) aVar).s(aVar5, this);
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar3 = (ru.ozon.android.messenger.framework.navigation.action.a) this.f90341f;
                    C9467e c9467e5 = this.f90340e;
                    iVar2 = this.f90339d;
                    Sc.s.b(obj);
                    c9467e4 = c9467e5;
                    iVar = iVar2;
                    aVar5 = aVar3;
                    if (iVar instanceof i.a) {
                        C9467e.i1(c9467e4, aVar5);
                    }
                    return Unit.f71690a;
                }
                str3 = this.f90346k;
                String str4 = this.f90345j;
                ru.ozon.android.messenger.framework.presentation.models.q qVar3 = this.f90344i;
                i.b bVar = this.f90343h;
                ru.ozon.android.messenger.framework.navigation.action.a aVar6 = (ru.ozon.android.messenger.framework.navigation.action.a) this.f90342g;
                C9467e c9467e6 = (C9467e) this.f90341f;
                C9467e c9467e7 = this.f90340e;
                iVar3 = this.f90339d;
                Sc.s.b(obj);
                c9467e3 = c9467e6;
                k11 = str4;
                aVar5 = aVar6;
                iVar4 = bVar;
                qVar2 = qVar3;
                c9467e4 = c9467e7;
                ru.ozon.android.messenger.utils.i iVar5 = iVar4;
                c9467e2 = c9467e3;
                iVar = iVar5;
                str = k11;
                str2 = str3;
                qVar = qVar2;
                c9467e = c9467e4;
                aVar2 = aVar5;
                iVar2 = iVar3;
                kVar = c9467e.f90238z;
                this.f90339d = iVar2;
                this.f90340e = c9467e2;
                this.f90341f = aVar2;
                this.f90342g = iVar;
                this.f90343h = null;
                this.f90344i = null;
                this.f90345j = null;
                this.f90346k = null;
                this.f90347l = 3;
                if (kVar.i(qVar, str2, str, this) != aVar4) {
                    aVar3 = aVar2;
                    c9467e4 = c9467e2;
                    iVar = iVar2;
                    aVar5 = aVar3;
                    if (iVar instanceof i.a) {
                    }
                    return Unit.f71690a;
                }
                return aVar4;
            }
            Sc.s.b(obj);
        }
        iVar = (ru.ozon.android.messenger.utils.i) obj;
        if (iVar instanceof i.b) {
            qVar = (ru.ozon.android.messenger.framework.presentation.models.q) ((i.b) iVar).b();
            if (qVar == null) {
                Lm0.a.f17149a.w("Empty editChatMessage response", new Object[0]);
            } else {
                AtomAction c11 = aVar5.c();
                AtomAction.Click click = c11 instanceof AtomAction.Click ? (AtomAction.Click) c11 : null;
                if (click == null || (d11 = click.getParams()) == null) {
                    d11 = aVar5.d();
                }
                Object obj3 = d11.get(d.c.MESSAGE_ID.a());
                String str5 = obj3 instanceof String ? (String) obj3 : null;
                if (str5 != null) {
                    int i12 = C9467e.f90182B0;
                    c9467e4.getClass();
                    Iterator<T> it = qVar.b().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (((ru.ozon.android.messenger.framework.presentation.models.u) obj2).c() instanceof ru.ozon.android.messenger.blocks.input.d) {
                            break;
                        }
                    }
                    ru.ozon.android.messenger.framework.presentation.models.u uVar = (ru.ozon.android.messenger.framework.presentation.models.u) obj2;
                    ru.ozon.android.messenger.framework.presentation.models.g c12 = uVar != null ? uVar.c() : null;
                    ru.ozon.android.messenger.blocks.input.d dVar = c12 instanceof ru.ozon.android.messenger.blocks.input.d ? (ru.ozon.android.messenger.blocks.input.d) c12 : null;
                    k11 = dVar != null ? dVar.k() : null;
                    String value = c9467e4.e().getValue();
                    if (value == null) {
                        c9467e = c9467e4;
                        str = k11;
                        aVar2 = aVar5;
                        str2 = str5;
                        iVar2 = iVar;
                        c9467e2 = c9467e;
                        kVar = c9467e.f90238z;
                        this.f90339d = iVar2;
                        this.f90340e = c9467e2;
                        this.f90341f = aVar2;
                        this.f90342g = iVar;
                        this.f90343h = null;
                        this.f90344i = null;
                        this.f90345j = null;
                        this.f90346k = null;
                        this.f90347l = 3;
                        if (kVar.i(qVar, str2, str, this) != aVar4) {
                        }
                        return aVar4;
                    }
                    fVar = c9467e4.f90234x;
                    this.f90339d = iVar;
                    this.f90340e = c9467e4;
                    this.f90341f = c9467e4;
                    this.f90342g = aVar5;
                    this.f90343h = (i.b) iVar;
                    this.f90344i = qVar;
                    this.f90345j = k11;
                    this.f90346k = str5;
                    this.f90347l = 2;
                    if (fVar.f(value, this) != aVar4) {
                        iVar3 = iVar;
                        qVar2 = qVar;
                        str3 = str5;
                        iVar4 = iVar3;
                        c9467e3 = c9467e4;
                        ru.ozon.android.messenger.utils.i iVar52 = iVar4;
                        c9467e2 = c9467e3;
                        iVar = iVar52;
                        str = k11;
                        str2 = str3;
                        qVar = qVar2;
                        c9467e = c9467e4;
                        aVar2 = aVar5;
                        iVar2 = iVar3;
                        kVar = c9467e.f90238z;
                        this.f90339d = iVar2;
                        this.f90340e = c9467e2;
                        this.f90341f = aVar2;
                        this.f90342g = iVar;
                        this.f90343h = null;
                        this.f90344i = null;
                        this.f90345j = null;
                        this.f90346k = null;
                        this.f90347l = 3;
                        if (kVar.i(qVar, str2, str, this) != aVar4) {
                        }
                    }
                    return aVar4;
                }
            }
        }
        if (iVar instanceof i.a) {
        }
        return Unit.f71690a;
    }
}
