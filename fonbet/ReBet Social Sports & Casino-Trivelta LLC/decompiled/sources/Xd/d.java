package Xd;

import android.app.Application;
import com.zoho.livechat.android.modules.core.domain.entities.Channel;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import me.C5582a;
import od.t;
import xe.C6822a;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Td.a f13727a;

    public static final class a extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f13728n;

        /* renamed from: o, reason: collision with root package name */
        public Object f13729o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f13730p;

        /* renamed from: r, reason: collision with root package name */
        public int f13732r;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f13730p = obj;
            this.f13732r |= Integer.MIN_VALUE;
            return d.this.a(null, null, null, this);
        }
    }

    public d(Td.a repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f13727a = repository;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0090, code lost:
    
        if (r10 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0052, code lost:
    
        if (r10 == r1) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Dg.a aVar, String str, String str2, Continuation continuation) {
        a aVar2;
        int i10;
        C5582a c5582a;
        String str3;
        Dg.a aVar3;
        C5582a c5582a2;
        Channel.CallConfigurations callConfigurations;
        Channel.CallConfigurations.Messages messages;
        if (continuation instanceof a) {
            aVar2 = (a) continuation;
            int i11 = aVar2.f13732r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar2.f13732r = i11 - Integer.MIN_VALUE;
                Object obj = aVar2.f13730p;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = aVar2.f13732r;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Td.a aVar4 = this.f13727a;
                    aVar2.f13728n = aVar;
                    aVar2.f13732r = 1;
                    obj = aVar4.a(str, str2, aVar, aVar2);
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c5582a2 = (C5582a) aVar2.f13729o;
                        aVar3 = (Dg.a) aVar2.f13728n;
                        ResultKt.throwOnFailure(obj);
                        Dg.a aVar5 = aVar3;
                        c5582a = c5582a2;
                        aVar = aVar5;
                        if (!c5582a.d()) {
                            Intrinsics.checkNotNull(c5582a.c(), "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.result.SalesIQResult.Error");
                            if (aVar == Dg.a.f2748b) {
                                Td.e.f11456a.L0("Call invitation failed", "Call invitation failed");
                            }
                        }
                        return c5582a;
                    }
                    aVar = (Dg.a) aVar2.f13728n;
                    ResultKt.throwOnFailure(obj);
                }
                c5582a = (C5582a) obj;
                if (c5582a.d()) {
                    if (aVar == Dg.a.f2748b) {
                        Td.e eVar = Td.e.f11456a;
                        eVar.t0(Dg.b.f2763h);
                        Channel m10 = C6822a.m();
                        if (m10 != null && (callConfigurations = m10.getCallConfigurations()) != null && (messages = callConfigurations.getMessages()) != null && (str3 = messages.getWaiting()) != null) {
                            if (str3.length() <= 0) {
                                str3 = null;
                            }
                        }
                        Application e10 = MobilistenInitProvider.INSTANCE.e();
                        String string = e10 != null ? e10.getString(t.f60969X3) : null;
                        str3 = string == null ? "" : string;
                        aVar2.f13728n = aVar;
                        aVar2.f13729o = c5582a;
                        aVar2.f13732r = 2;
                        if (eVar.S0(str3, aVar2) != coroutine_suspended) {
                            aVar3 = aVar;
                            c5582a2 = c5582a;
                            Dg.a aVar52 = aVar3;
                            c5582a = c5582a2;
                            aVar = aVar52;
                        }
                        return coroutine_suspended;
                    }
                }
                if (!c5582a.d()) {
                }
                return c5582a;
            }
        }
        aVar2 = new a(continuation);
        Object obj2 = aVar2.f13730p;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = aVar2.f13732r;
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
