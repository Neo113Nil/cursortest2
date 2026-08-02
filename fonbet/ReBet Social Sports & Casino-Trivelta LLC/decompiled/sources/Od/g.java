package Od;

import Uf.j;
import android.os.Handler;
import com.zoho.livechat.android.ZohoLiveChat;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.Q;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import me.C5582a;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Nd.a f8623a;

    public static final class a extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f8624n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f8625o;

        /* renamed from: q, reason: collision with root package name */
        public int f8627q;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f8625o = obj;
            this.f8627q |= Integer.MIN_VALUE;
            return g.this.b(null, this);
        }
    }

    public g(Nd.a brandRepository) {
        Intrinsics.checkNotNullParameter(brandRepository, "brandRepository");
        this.f8623a = brandRepository;
    }

    public static final void c(boolean z10) {
        if (Q.x() == null || !Intrinsics.areEqual(Boolean.valueOf(z10), Q.x())) {
            if (z10) {
                LiveChatUtil.triggerSalesIQListener("OPERATOR_ONLINE", null, null);
            } else {
                LiveChatUtil.triggerSalesIQListener("OPERATOR_OFFLINE", null, null);
            }
            Q.F(Boolean.valueOf(z10));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Md.a[] aVarArr, Continuation continuation) {
        a aVar;
        int i10;
        C5582a c5582a;
        Object m147constructorimpl;
        Handler p10;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f8627q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f8627q = i11 - Integer.MIN_VALUE;
                Object obj = aVar.f8625o;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = aVar.f8627q;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Nd.a aVar2 = this.f8623a;
                    List list = ArraysKt.toList(aVarArr);
                    aVar.f8624n = this;
                    aVar.f8627q = 1;
                    obj = aVar2.b(list, aVar);
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
                    Pair pair = (Pair) c5582a.b();
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        if (((Boolean) pair.getFirst()).booleanValue()) {
                            final boolean booleanValue = ((Boolean) pair.getSecond()).booleanValue();
                            j applicationManager = ZohoLiveChat.getApplicationManager();
                            if (applicationManager != null && (p10 = applicationManager.p()) != null) {
                                Boxing.boxBoolean(p10.post(new Runnable() { // from class: Od.f
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        g.c(booleanValue);
                                    }
                                }));
                            }
                        }
                        m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th2) {
                        Result.Companion companion2 = Result.INSTANCE;
                        m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
                    }
                    Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                    if (m150exceptionOrNullimpl != null) {
                        LiveChatUtil.log(m150exceptionOrNullimpl);
                    }
                }
                return c5582a;
            }
        }
        aVar = new a(continuation);
        Object obj2 = aVar.f8625o;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = aVar.f8627q;
        if (i10 != 0) {
        }
        c5582a = (C5582a) obj2;
        if (c5582a.d()) {
        }
        return c5582a;
    }
}
