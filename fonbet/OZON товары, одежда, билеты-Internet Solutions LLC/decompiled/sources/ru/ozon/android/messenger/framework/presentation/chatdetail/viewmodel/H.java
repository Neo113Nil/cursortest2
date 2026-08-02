package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel;

import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.data.remote.models.blocks.BlockDTO;
import ru.ozon.android.messenger.framework.data.repository.C9351a;
import ru.ozon.android.messenger.framework.navigation.action.d;
import ru.ozon.android.messenger.utils.i;
import ru.ozon.uni.atoms.af.AtomAction;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.ChatViewModelImpl$handleReplyChatMessage$1$1", f = "ChatViewModel.kt", l = {781, 793, 795}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class H extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    ru.ozon.android.messenger.utils.i f89987d;

    /* renamed from: e, reason: collision with root package name */
    C9467e f89988e;

    /* renamed from: f, reason: collision with root package name */
    Object f89989f;

    /* renamed from: g, reason: collision with root package name */
    Object f89990g;

    /* renamed from: h, reason: collision with root package name */
    i.b f89991h;

    /* renamed from: i, reason: collision with root package name */
    ru.ozon.android.messenger.framework.presentation.models.q f89992i;

    /* renamed from: j, reason: collision with root package name */
    BlockDTO f89993j;

    /* renamed from: k, reason: collision with root package name */
    String f89994k;

    /* renamed from: l, reason: collision with root package name */
    int f89995l;

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ C9467e f89996m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.navigation.action.a f89997n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    H(kotlin.coroutines.d dVar, ru.ozon.android.messenger.framework.navigation.action.a aVar, C9467e c9467e) {
        super(2, dVar);
        this.f89996m = c9467e;
        this.f89997n = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new H(dVar, this.f89997n, this.f89996m);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((H) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0060, code lost:
    
        if (r13 == r0) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x013b  */
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
        BlockDTO localMessageBlock;
        C9467e c9467e;
        BlockDTO blockDTO;
        ru.ozon.android.messenger.framework.navigation.action.a aVar2;
        String str;
        ru.ozon.android.messenger.utils.i iVar2;
        C9467e c9467e2;
        ru.ozon.android.messenger.blocks.input.viewmodel.f fVar;
        ru.ozon.android.messenger.utils.i iVar3;
        ru.ozon.android.messenger.framework.presentation.models.q qVar2;
        String str2;
        ru.ozon.android.messenger.utils.i iVar4;
        C9467e c9467e3;
        ru.ozon.android.messenger.framework.presentation.chatdetail.inputmode.k kVar;
        ru.ozon.android.messenger.framework.navigation.action.a aVar3;
        Wc.a aVar4 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f89995l;
        ru.ozon.android.messenger.framework.navigation.action.a aVar5 = this.f89997n;
        C9467e c9467e4 = this.f89996m;
        if (i11 == 0) {
            Sc.s.b(obj);
            aVar = c9467e4.f90208d;
            this.f89995l = 1;
            obj = ((C9351a) aVar).v(aVar5, this);
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar3 = (ru.ozon.android.messenger.framework.navigation.action.a) this.f89989f;
                    C9467e c9467e5 = this.f89988e;
                    iVar2 = this.f89987d;
                    Sc.s.b(obj);
                    c9467e4 = c9467e5;
                    iVar = iVar2;
                    aVar5 = aVar3;
                    if (iVar instanceof i.a) {
                        C9467e.i1(c9467e4, aVar5);
                    }
                    return Unit.f71690a;
                }
                str2 = this.f89994k;
                BlockDTO blockDTO2 = this.f89993j;
                ru.ozon.android.messenger.framework.presentation.models.q qVar3 = this.f89992i;
                i.b bVar = this.f89991h;
                ru.ozon.android.messenger.framework.navigation.action.a aVar6 = (ru.ozon.android.messenger.framework.navigation.action.a) this.f89990g;
                C9467e c9467e6 = (C9467e) this.f89989f;
                C9467e c9467e7 = this.f89988e;
                iVar3 = this.f89987d;
                Sc.s.b(obj);
                c9467e3 = c9467e6;
                localMessageBlock = blockDTO2;
                aVar5 = aVar6;
                iVar4 = bVar;
                qVar2 = qVar3;
                c9467e4 = c9467e7;
                ru.ozon.android.messenger.utils.i iVar5 = iVar4;
                c9467e2 = c9467e3;
                iVar = iVar5;
                blockDTO = localMessageBlock;
                str = str2;
                qVar = qVar2;
                c9467e = c9467e4;
                aVar2 = aVar5;
                iVar2 = iVar3;
                kVar = c9467e.f90238z;
                this.f89987d = iVar2;
                this.f89988e = c9467e2;
                this.f89989f = aVar2;
                this.f89990g = iVar;
                this.f89991h = null;
                this.f89992i = null;
                this.f89993j = null;
                this.f89994k = null;
                this.f89995l = 3;
                if (kVar.j(qVar, str, blockDTO, this) != aVar4) {
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
        if ((iVar instanceof i.b) && (qVar = (ru.ozon.android.messenger.framework.presentation.models.q) ((i.b) iVar).b()) != null) {
            AtomAction c11 = aVar5.c();
            AtomAction.Click click = c11 instanceof AtomAction.Click ? (AtomAction.Click) c11 : null;
            if (click == null || (d11 = click.getParams()) == null) {
                d11 = aVar5.d();
            }
            Object obj3 = d11.get(d.c.MESSAGE_ID.a());
            String str3 = obj3 instanceof String ? (String) obj3 : null;
            if (str3 != null) {
                Iterator<T> it = qVar.b().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (((ru.ozon.android.messenger.framework.presentation.models.u) obj2).c() instanceof ru.ozon.android.messenger.blocks.replyInputBlock.e) {
                        break;
                    }
                }
                ru.ozon.android.messenger.framework.presentation.models.u uVar = (ru.ozon.android.messenger.framework.presentation.models.u) obj2;
                if (uVar != null) {
                    ru.ozon.android.messenger.framework.presentation.models.g c12 = uVar.c();
                    Intrinsics.g(c12, "null cannot be cast to non-null type ru.ozon.android.messenger.blocks.replyInputBlock.ReplyInputBlockVO");
                    localMessageBlock = ((ru.ozon.android.messenger.blocks.replyInputBlock.e) c12).a().getLocalMessageBlock();
                    if (localMessageBlock != null) {
                        String value = c9467e4.e().getValue();
                        if (value == null) {
                            c9467e = c9467e4;
                            blockDTO = localMessageBlock;
                            aVar2 = aVar5;
                            str = str3;
                            iVar2 = iVar;
                            c9467e2 = c9467e;
                            kVar = c9467e.f90238z;
                            this.f89987d = iVar2;
                            this.f89988e = c9467e2;
                            this.f89989f = aVar2;
                            this.f89990g = iVar;
                            this.f89991h = null;
                            this.f89992i = null;
                            this.f89993j = null;
                            this.f89994k = null;
                            this.f89995l = 3;
                            if (kVar.j(qVar, str, blockDTO, this) != aVar4) {
                            }
                            return aVar4;
                        }
                        fVar = c9467e4.f90234x;
                        this.f89987d = iVar;
                        this.f89988e = c9467e4;
                        this.f89989f = c9467e4;
                        this.f89990g = aVar5;
                        this.f89991h = (i.b) iVar;
                        this.f89992i = qVar;
                        this.f89993j = localMessageBlock;
                        this.f89994k = str3;
                        this.f89995l = 2;
                        if (fVar.f(value, this) != aVar4) {
                            iVar3 = iVar;
                            qVar2 = qVar;
                            str2 = str3;
                            iVar4 = iVar3;
                            c9467e3 = c9467e4;
                            ru.ozon.android.messenger.utils.i iVar52 = iVar4;
                            c9467e2 = c9467e3;
                            iVar = iVar52;
                            blockDTO = localMessageBlock;
                            str = str2;
                            qVar = qVar2;
                            c9467e = c9467e4;
                            aVar2 = aVar5;
                            iVar2 = iVar3;
                            kVar = c9467e.f90238z;
                            this.f89987d = iVar2;
                            this.f89988e = c9467e2;
                            this.f89989f = aVar2;
                            this.f89990g = iVar;
                            this.f89991h = null;
                            this.f89992i = null;
                            this.f89993j = null;
                            this.f89994k = null;
                            this.f89995l = 3;
                            if (kVar.j(qVar, str, blockDTO, this) != aVar4) {
                            }
                        }
                        return aVar4;
                    }
                }
            }
        }
        if (iVar instanceof i.a) {
        }
        return Unit.f71690a;
    }
}
