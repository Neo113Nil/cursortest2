package ru.ozon.android.messenger.blocks.ai.aiThinkingIndicator.presentation.compose;

import S0.InterfaceC3978p0;
import Sc.s;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.uni.atoms.data.text.TextDTO;
import xe.M;
import xe.Y;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.blocks.ai.aiThinkingIndicator.presentation.compose.StatusMessagesAnimStateKt$rememberStatusMessagesAnimState$1$1", f = "StatusMessagesAnimState.kt", l = {41}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class f extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    InterfaceC3978p0 f84087d;

    /* renamed from: e, reason: collision with root package name */
    Iterator f84088e;

    /* renamed from: f, reason: collision with root package name */
    TextDTO f84089f;

    /* renamed from: g, reason: collision with root package name */
    int f84090g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ List<TextDTO> f84091h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<TextDTO> f84092i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(List<TextDTO> list, InterfaceC3978p0<TextDTO> interfaceC3978p0, kotlin.coroutines.d<? super f> dVar) {
        super(2, dVar);
        this.f84091h = list;
        this.f84092i = interfaceC3978p0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new f(this.f84091h, this.f84092i, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0039  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x004e -> B:5:0x0051). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        InterfaceC3978p0<TextDTO> interfaceC3978p0;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f84090g;
        if (i11 == 0) {
            s.b(obj);
            List<TextDTO> list = this.f84091h;
            it = C7714v.L0(list.size() - 1, list).iterator();
            interfaceC3978p0 = this.f84092i;
            if (it.hasNext()) {
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            TextDTO textDTO = this.f84089f;
            it = this.f84088e;
            interfaceC3978p0 = this.f84087d;
            s.b(obj);
            interfaceC3978p0.setValue(textDTO);
            if (it.hasNext()) {
                textDTO = (TextDTO) it.next();
                this.f84087d = interfaceC3978p0;
                this.f84088e = it;
                this.f84089f = textDTO;
                this.f84090g = 1;
                if (Y.b(2500L, this) == aVar) {
                    return aVar;
                }
                interfaceC3978p0.setValue(textDTO);
                if (it.hasNext()) {
                    return Unit.f71690a;
                }
            }
        }
    }
}
