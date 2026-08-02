package ru.ozon.android.messenger.framework.presentation.ai;

import com.google.android.gms.wallet.WalletConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.framework.presentation.common.screen.m;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.ai.AiAssistantViewModel$handleSocketConnectionError$2$1", f = "AiAssistantViewModel.kt", l = {WalletConstants.ERROR_CODE_BUYER_ACCOUNT_ERROR, WalletConstants.ERROR_CODE_UNSUPPORTED_API_VERSION}, m = "invokeSuspend")
/* renamed from: ru.ozon.android.messenger.framework.presentation.ai.s0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9445s0 extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f89678d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9414c0 f89679e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ List<ru.ozon.android.messenger.framework.presentation.models.q> f89680f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9445s0(C9414c0 c9414c0, List<ru.ozon.android.messenger.framework.presentation.models.q> list, kotlin.coroutines.d<? super C9445s0> dVar) {
        super(2, dVar);
        this.f89679e = c9414c0;
        this.f89680f = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C9445s0(this.f89679e, this.f89680f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C9445s0) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        if (r5.k(r4.f89680f, null, r4) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
    
        if (xe.Y.b(100, r4) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ru.ozon.android.messenger.framework.domain.repository.d dVar;
        ru.ozon.android.messenger.framework.domain.repository.d dVar2;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f89678d;
        if (i11 == 0) {
            Sc.s.b(obj);
            this.f89678d = 1;
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
        C9414c0 c9414c0 = this.f89679e;
        c9414c0.f89506i.w(false, new m.a(null));
        dVar = c9414c0.f89501d;
        dVar.d(new ArrayList());
        dVar2 = c9414c0.f89501d;
        this.f89678d = 2;
    }
}
