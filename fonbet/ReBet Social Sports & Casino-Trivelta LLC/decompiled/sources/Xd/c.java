package Xd;

import com.zoho.livechat.android.utils.Q;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import me.C5582a;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Td.a f13723a;

    public static final class a extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f13724n;

        /* renamed from: p, reason: collision with root package name */
        public int f13726p;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f13724n = obj;
            this.f13726p |= Integer.MIN_VALUE;
            return c.this.a(null, null, null, this);
        }
    }

    public c(Td.a baseCallsRepository) {
        Intrinsics.checkNotNullParameter(baseCallsRepository, "baseCallsRepository");
        this.f13723a = baseCallsRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, Bg.a aVar, Continuation continuation) {
        a aVar2;
        int i10;
        C5582a c5582a;
        if (continuation instanceof a) {
            aVar2 = (a) continuation;
            int i11 = aVar2.f13726p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar2.f13726p = i11 - Integer.MIN_VALUE;
                Object obj = aVar2.f13724n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = aVar2.f13726p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Td.a aVar3 = this.f13723a;
                    aVar2.f13726p = 1;
                    obj = aVar3.c(str, str2, aVar, aVar2);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                c5582a = (C5582a) obj;
                if (c5582a.d()) {
                    if (Q.f44447F.f44469d) {
                        Td.e.R0(Vd.a.AudioOutgoingUIShown, null, null, 6, null);
                        Q.f44447F.f44469d = false;
                    }
                    if (Q.f44447F.f44470e) {
                        Td.e.R0(Vd.a.AudioOutgoingUICleared, null, null, 6, null);
                        Q.f44447F.f44470e = false;
                    }
                }
                if (!c5582a.d()) {
                    Intrinsics.checkNotNull(c5582a.c(), "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.result.SalesIQResult.Error");
                    Q q10 = Q.f44447F;
                    q10.f44468c = false;
                    q10.f44469d = false;
                    q10.f44470e = false;
                }
                return c5582a;
            }
        }
        aVar2 = new a(continuation);
        Object obj2 = aVar2.f13724n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = aVar2.f13726p;
        if (i10 != 0) {
        }
        c5582a = (C5582a) obj2;
        if (c5582a.d()) {
        }
        if (!c5582a.d()) {
        }
        return c5582a;
    }
}
