package ru.ozon.android.messenger.framework.presentation.ai;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.blocks.alert.a;
import ru.ozon.android.messenger.blocks.buttons.d;
import ru.ozon.android.messenger.framework.data.repository.C9351a;
import ru.ozon.android.messenger.framework.domain.model.f;
import ru.ozon.android.messenger.utils.i;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.ai.AiAssistantViewModel$handleOnChatButtonsClickAction$1$1$1", f = "AiAssistantViewModel.kt", l = {584, 586, 589}, m = "invokeSuspend")
/* renamed from: ru.ozon.android.messenger.framework.presentation.ai.p0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9440p0 extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    Object f89659d;

    /* renamed from: e, reason: collision with root package name */
    Object f89660e;

    /* renamed from: f, reason: collision with root package name */
    a.C1470a f89661f;

    /* renamed from: g, reason: collision with root package name */
    int f89662g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C9414c0 f89663h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.navigation.action.a f89664i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ a.C1470a f89665j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9440p0(C9414c0 c9414c0, ru.ozon.android.messenger.framework.navigation.action.a aVar, a.C1470a c1470a, kotlin.coroutines.d<? super C9440p0> dVar) {
        super(2, dVar);
        this.f89663h = c9414c0;
        this.f89664i = aVar;
        this.f89665j = c1470a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C9440p0(this.f89663h, this.f89664i, this.f89665j, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C9440p0) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0057, code lost:
    
        if (r9 == r0) goto L26;
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
        ru.ozon.android.messenger.blocks.alert.a aVar2;
        String[] strArr;
        C9414c0 c9414c0;
        Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f89662g;
        C9414c0 c9414c02 = this.f89663h;
        if (i11 == 0) {
            Sc.s.b(obj);
            c9414c02.getController().v(new d.a(false));
            aVar = c9414c02.f89502e;
            this.f89662g = 1;
            obj = ((C9351a) aVar).z(this.f89664i, this);
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c9414c0 = (C9414c0) this.f89659d;
                    Sc.s.b(obj);
                    c9414c0.N0().d();
                    return Unit.f71690a;
                }
                c1470a2 = this.f89661f;
                c9414c02 = (C9414c0) this.f89660e;
                iVar2 = (ru.ozon.android.messenger.utils.i) this.f89659d;
                Sc.s.b(obj);
                c1470a = c1470a2;
                iVar = iVar2;
                if (iVar instanceof i.a) {
                    dVar = c9414c02.f89501d;
                    aVar2 = c9414c02.f89512o;
                    a.C1470a c1470a3 = ru.ozon.android.messenger.blocks.alert.a.f84375c;
                    ru.ozon.android.messenger.framework.presentation.models.q b11 = aVar2.b(null);
                    c1470a.getClass();
                    strArr = ru.ozon.android.messenger.blocks.alert.a.f84376d;
                    String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
                    this.f89659d = c9414c02;
                    this.f89660e = iVar;
                    this.f89661f = null;
                    this.f89662g = 3;
                    if (dVar.o(b11, strArr2, this) != aVar3) {
                        c9414c0 = c9414c02;
                        c9414c0.N0().d();
                    }
                    return aVar3;
                }
                return Unit.f71690a;
            }
            Sc.s.b(obj);
        }
        iVar = (ru.ozon.android.messenger.utils.i) obj;
        boolean z11 = iVar instanceof i.b;
        c1470a = this.f89665j;
        if (z11) {
            ((i.b) iVar).getClass();
            f7 = c9414c02.f89510m;
            f.b bVar = new f.b("button_alert");
            this.f89659d = iVar;
            this.f89660e = c9414c02;
            this.f89661f = c1470a;
            this.f89662g = 2;
            if (f7.g(bVar, this) != aVar3) {
                iVar2 = iVar;
                c1470a2 = c1470a;
                c1470a = c1470a2;
                iVar = iVar2;
            }
            return aVar3;
        }
        if (iVar instanceof i.a) {
        }
        return Unit.f71690a;
    }
}
